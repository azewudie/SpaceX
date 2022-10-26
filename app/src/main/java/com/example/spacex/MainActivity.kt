package com.example.spacex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.spacex.adapter.SpaceXAdapter
import com.example.spacex.models.data.SpaceXDataX
import com.example.spacex.databinding.ActivityMainBinding
import com.example.spacex.models.SpaceXPresentationData
import com.example.spacex.viewModel.SpacexViewModel
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val viewModel: SpacexViewModel by viewModels()


    private val adapter: SpaceXAdapter by lazy {
        SpaceXAdapter(SpaceXDataX(),this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
        initObservables()
    }

    private fun initObservables() {
        viewModel.spaceXDataAPIResult.observe(this) {
            processData(it)
        }
    }

    private fun processData(presentationData: SpaceXPresentationData) {
        when (presentationData) {
            is SpaceXPresentationData.Response -> {
                updateAdapter(presentationData.response)
            }
            is SpaceXPresentationData.Error -> {
                showError(presentationData.errorMessage)
            }
            is SpaceXPresentationData.Loading -> {
                showLoading(presentationData.isLoading)
            }
        }
    }

    private fun showLoading(loading: Boolean) {
        if (loading) {
            binding.rvSpacex.visibility = View.GONE
            binding.loading.visibility = View.VISIBLE
        } else {
            binding.rvSpacex.visibility = View.VISIBLE
            binding.loading.visibility = View.GONE

        }
    }

    private fun showError(errorMessage: String) {
        Snackbar.make(binding.root, errorMessage, Snackbar.LENGTH_INDEFINITE)
            .setAction("Dismiss") { }
            .show()
    }

    private fun updateAdapter(response: SpaceXDataX) {
        SpaceXDataX().apply {
            addAll(response)
            adapter.spasXList = this
        }
    }

    private fun initViews() {
        binding.rvSpacex.layoutManager = LinearLayoutManager(this)
        binding.rvSpacex.adapter = adapter
    }
}
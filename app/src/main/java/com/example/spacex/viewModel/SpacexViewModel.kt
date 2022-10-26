package com.example.spacex.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.spacex.models.IRepository
import com.example.spacex.models.SpaceXPresentationData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SpacexViewModel @Inject constructor(private val repository: IRepository): ViewModel() {
    /**
     * Spacex API
     * AN.- No need for open, by default Kotlin is public, OPEN is for having a customized encapsulation
     * only meaningful if this class will be subclassed and you want this VAR to be overriden by the childs.
     */
    /*open*/ private val _spaceXDataAPIResult = MutableLiveData<SpaceXPresentationData>()

    // Backing Field
    val spaceXDataAPIResult: LiveData<SpaceXPresentationData>
        get() = _spaceXDataAPIResult

    init {

        viewModelScope.launch {
            repository.getAllSpaceXData().collect{
                _spaceXDataAPIResult.value = it
            }
        }
    }


}
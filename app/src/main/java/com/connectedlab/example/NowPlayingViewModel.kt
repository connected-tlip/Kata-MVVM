package com.connectedlab.example

//import android.databinding.ObservableField

class NowPlayingViewModel(device: Device) {

    init {
        device.nowPlayingObservable.subscribe { nowPlaying ->
            updateNowPlaying(nowPlaying)
        }
    }

    private fun updateNowPlaying(nowPlaying: NowPlaying) {

    }
}

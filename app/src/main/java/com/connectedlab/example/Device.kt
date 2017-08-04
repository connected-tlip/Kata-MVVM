package com.connectedlab.example

import rx.Observable

interface Device {
    /**
     * Emits the latest now playing information.
     */
    val nowPlayingObservable: Observable<NowPlaying>

    /**
     * Plays a certain track.
     */
    fun play(trackName: String)

    /**
     * Stop playback.
     */
    fun stop()
}

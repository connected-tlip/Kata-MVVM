package com.connectedlab.example

class NowPlaying(
    val track: String?,
    val artist: String?,
    val imageUrl: String?,
    val stationName: String?,
    val playType: PlayType,
    val playStatus: PlayStatus,
    val time: PlayTime
)

class PlayTime(
    val elapsed: Int,
    val totalTime: Int
)

enum class PlayType {
    PLAYLIST, RADIO
}

enum class PlayStatus {
    PLAYING, PAUSED
}
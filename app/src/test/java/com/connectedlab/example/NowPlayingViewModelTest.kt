package com.connectedlab.example

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.mock
import rx.observers.TestSubscriber
import rx.subjects.BehaviorSubject
import rx.subjects.PublishSubject

/**
 * Tests [NowPlayingViewModelTest]
 */
class NowPlayingViewModelTest {
    lateinit var sut: NowPlayingViewModel

    @Mock
    val device = mock(Device::class.java)

    @Before
    fun setup() {
        sut = NowPlayingViewModel(device)
    }

    @Test
    fun nowPlayingUpdate_updatesTrackName() {

//        assertThat(sut.trackName.get(), equalTo("Hello"))
    }
}
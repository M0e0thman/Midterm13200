package com.example.test

import com.example.test.timers.LeftScreenViewModel
import com.example.test.timers.RightScreenViewModel
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test

class LeftScreenViewModelTest {

    @Test
    fun `test initial counter value`() {
        val viewModel = LeftScreenViewModel()
        assertEquals(0, viewModel.counter.value)
    }

    @Test
    fun `test increment`() {
        val viewModel = LeftScreenViewModel()
        viewModel.increment()
        assertEquals(1, viewModel.counter.value)
    }

    @Test
    fun `test multiple increments`() {
        val viewModel = LeftScreenViewModel()
        repeat(5) { viewModel.increment() }
        assertEquals(5, viewModel.counter.value)
    }

    @Test
    fun `test start and stop timer`() {
        val viewModel = LeftScreenViewModel()
        runBlocking {
            viewModel.startTimer()
            kotlinx.coroutines.delay(3000)
            viewModel.stopTimer()
        }
        assert(viewModel.counter.value > 0)
    }
}

class RightScreenViewModelTest {

    @Test
    fun `test initial counter value`() {
        val viewModel = RightScreenViewModel()
        assertEquals(0, viewModel.counter.value)
    }

    @Test
    fun `test increment`() {
        val viewModel = RightScreenViewModel()
        viewModel.increment()
        assertEquals(1, viewModel.counter.value)
    }

    @Test
    fun `test multiple increments`() {
        val viewModel = RightScreenViewModel()
        repeat(5) { viewModel.increment() }
        assertEquals(5, viewModel.counter.value)
    }

    @Test
    fun `test start and stop timer`() {
        val viewModel = RightScreenViewModel()
        runBlocking {
            viewModel.startTimer()
            kotlinx.coroutines.delay(3000)
            viewModel.stopTimer()
        }
        assert(viewModel.counter.value > 0)
    }
}

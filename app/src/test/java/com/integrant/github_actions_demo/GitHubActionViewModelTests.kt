package com.integrant.github_actions_demo

import com.integrant.github_actions_demo.core.GitHubActionViewModel
import org.junit.Assert.assertEquals
import org.junit.Test

class GitHubActionViewModelTests {

    private val gitHubActionViewModel = GitHubActionViewModel()

    @Test
    fun additionWorksCorrectly() {
        assertEquals(4, gitHubActionViewModel.sumTwoNumbers(2, 2))
    }

    @Test
    fun subtractionWorksCorrectly() {
        assertEquals(2, gitHubActionViewModel.subTwoNumbers(4, 2))
    }

    @Test
    fun multiplicationWorksCorrectly() {
        assertEquals(8, gitHubActionViewModel.multipleTwoNumbers(4, 2))
    }

    @Test
    fun divisionWorksCorrectly() {
        assertEquals(2, gitHubActionViewModel.divTwoNumbers(4, 2))
    }
}
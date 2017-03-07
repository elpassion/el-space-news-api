package pl.elpassion.news

import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration

@RunWith(SpringJUnit4ClassRunner::class)
@WebAppConfiguration
class NewsControllerTest {

    @Test
    fun shouldPass() {
        assertTrue(true)
    }
}
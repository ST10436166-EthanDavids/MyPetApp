class UnitTest {

    package za.ac.iie.mypetapp

    import android.widget.Button
    import android.widget.ImageView
    import org.junit.Assert.assertEquals
    import org.junit.Before
    import org.junit.Test
    import org.junit.runner.RunWith
    import org.robolectric.Robolectric
    import org.robolectric.RobolectricTestRunner
    import org.robolectric.annotation.Config

    @RunWith(RobolectricTestRunner::class)
    @Config(manifest=Config.NONE)
    class MainActivity2Test {

        private lateinit var activity: MainActivity2
        private lateinit var feedButton: Button
        private lateinit var cleanButton: Button
        private lateinit var playButton: Button
        private lateinit var petImageView: ImageView

        @Before
        fun setUp() {
            activity = Robolectric.buildActivity(MainActivity2::class.java).create().get()
            feedButton = activity.findViewById(R.id.feedBtn)
            cleanButton = activity.findViewById(R.id.cleanBtn)
            playButton = activity.findViewById(R.id.playBtn)
            petImageView = activity.findViewById(R.id.Image1)
        }

        @Test
        fun testFeedButtonClicked() {
            feedButton.performClick()
            assertEquals(R.drawable.feedimg, petImageView.drawable.constantState?.resourceId)
            // Add assertions for status values after feeding
        }

        @Test
        fun testCleanButtonClicked() {
            cleanButton.performClick()
            assertEquals(R.drawable.cleanimg, petImageView.drawable.constantState?.resourceId)
            // Add assertions for status values after cleaning
        }

        @Test
        fun testPlayButtonClicked() {
            playButton.performClick()
            assertEquals(R.drawable.playimg, petImageView.drawable.constantState?.resourceId)
            // Add assertions for status values after playing
        }

        // Add more tests as needed
    }

}
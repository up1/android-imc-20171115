package cc.somkiat.demo01;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void xxxxx() {
        onView(withId(R.id.edt_no_1))
                .perform(typeText("1"),
                        closeSoftKeyboard());
        onView(withId(R.id.btn_add))
                .perform(click());
        onView(withId(R.id.edt_no_2))
                .perform(typeText("2"),
                        closeSoftKeyboard());
        onView(withId(R.id.btn_ok))
                .perform(click());
        onView(withId(R.id.tv_result))
                .check(matches(withText("Result = 3")));
    }

}
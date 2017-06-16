package com.example.sorphorn.mathapp;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.sorphorn.mathapp", appContext.getPackageName());
    }
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule= new ActivityTestRule<MainActivity>(MainActivity.class);
    @Test
    public void checkCalculator() {
        String etv = "4";
        String etv2 = "2";
        String result = "The answer of " + "4.0" + " + " + "2.0" + " = " + "6.0";
        onView(withId(R.id.editText1)).perform(typeText(etv), closeSoftKeyboard());
        onView(withId(R.id.editText2)).perform(typeText(etv2), closeSoftKeyboard());

        onView(withId(R.id.buttonsum)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText(result)));
        onView(withId(R.id.editText1)).perform(clearText());
        onView(withId(R.id.editText2)).perform(clearText());

        String etv3 = "4";
        String etv4 = "2";
        String result2 = "The answer of " + "4.0" + " - " + "2.0" + " = " + "2.0" ;
        onView(withId(R.id.editText1)).perform(typeText(etv3), closeSoftKeyboard());
        onView(withId(R.id.editText2)).perform(typeText(etv4), closeSoftKeyboard());

        onView(withId(R.id.buttonsub)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText(result2)));
        onView(withId(R.id.editText1)).perform(clearText());
        onView(withId(R.id.editText2)).perform(clearText());

        String etv5 = "4";
        String etv6 = "2";
        String result5 = "The answer " + "4.0" + " / " + "2.0" + " = " + "2.0" ;
        onView(withId(R.id.editText1)).perform(typeText(etv5), closeSoftKeyboard());
        onView(withId(R.id.editText2)).perform(typeText(etv6), closeSoftKeyboard());

        onView(withId(R.id.buttondiv)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText(result5)));
        onView(withId(R.id.editText1)).perform(clearText());
        onView(withId(R.id.editText2)).perform(clearText());

        String etv7 = "4";
        String etv8 = "2";
        String result4 = "The answer of " + "4.0" + " * " + "2.0" + " = " + "8.0" ;
        onView(withId(R.id.editText1)).perform(typeText(etv7), closeSoftKeyboard());
        onView(withId(R.id.editText2)).perform(typeText(etv8), closeSoftKeyboard());

        onView(withId(R.id.buttonmul)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText(result4)));
        onView(withId(R.id.editText1)).perform(clearText());
        onView(withId(R.id.editText2)).perform(clearText());
    /*}
    @Test
    public void checkMinu() {
        String etv = "4";
        String etv2 = "2";
        String result = "The answer of " + "4.0" + " - " + "2.0" + " = " + "2.0" ;
        onView(withId(R.id.editText1)).perform(typeText(etv), closeSoftKeyboard());
        onView(withId(R.id.editText2)).perform(typeText(etv2), closeSoftKeyboard());
        onView(withId(R.id.buttonsub)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText(result)));
    }
    @Test
    public void checkDev() {
        String etv = "4";
        String etv2 = "4";
        String result = "The answer " + "4.0" + " / " + "4.0" + " = " + "1.0" ;
        onView(withId(R.id.editText1)).perform(typeText(etv), closeSoftKeyboard());
        onView(withId(R.id.editText2)).perform(typeText(etv2), closeSoftKeyboard());
        onView(withId(R.id.buttondiv)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText(result)));
    }

    @Test
    public void checkMul() {
        String etv = "3";
        String etv2 = "2";
        String result = "The answer of " + "3.0" + " * " + "2.0" + " = " + "6.0" ;
        onView(withId(R.id.editText1)).perform(typeText(etv), closeSoftKeyboard());
        onView(withId(R.id.editText2)).perform(typeText(etv2), closeSoftKeyboard());
        onView(withId(R.id.buttonmul)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText(result)));
    }*/
    }

}

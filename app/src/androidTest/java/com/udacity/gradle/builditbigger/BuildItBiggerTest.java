package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BuildItBiggerTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAsyncRequest() {
        mActivityTestRule.getActivity().getJoke(new EndpointAsyncCallback() {
            @Override
            public void onEnded(String string) {
                Assert.assertNotNull(string);
                Assert.assertNotEquals("",string);
            }
        });
    }
}

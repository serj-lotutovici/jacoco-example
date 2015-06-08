package com.github.example.jacoco.core;

import com.test.TestConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

/**
 * @author serj.lotutovici
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(
        sdk = TestConfig.EMULATE_SDK,
        constants = BuildConfig.class
)
public class CoreClassTest {

    @Test
    public void falseFlag() throws Exception {
        assertEquals(-1, new CoreClass().getCoreFlag(false));
    }

    @Test
    public void trueFlag() throws Exception {
        assertEquals(1, new CoreClass().getCoreFlag(true));
    }
}

package com.github.example.jacoco.core;

import com.test.TestConfig;
import com.test.shadows.InternalSystemPropertiesShadow;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

/**
 * @author serj.lotutovici
 */
@RunWith(RobolectricTestRunner.class)
@Config(
        emulateSdk = TestConfig.EMULATE_SDK,
        manifest = Config.NONE,
        shadows = InternalSystemPropertiesShadow.class
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

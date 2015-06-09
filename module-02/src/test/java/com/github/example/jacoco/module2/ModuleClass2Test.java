/*
 * Copyright (c) 2013 XING AG (http://xing.com/)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.example.jacoco.module2;

import com.test.TestConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;

/**
 * @author serj.lotutovici
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(
        sdk = TestConfig.EMULATE_SDK,
        constants = BuildConfig.class
)
public class ModuleClass2Test {

    ModuleClass2 testTarget = new ModuleClass2();

    @Test
    public void neg() throws Exception {
        int any = anyInt();
        assertEquals(-any, testTarget.neg(any));
    }

    @Test
    public void negDoubleStuff() throws Exception {
        int any = anyInt();
        assertEquals(-(2 * any), testTarget.negDoubleStuff(any));
    }
}

package org.linphone.tester;

import junit.framework.TestSuite;

import org.junit.runner.RunWith;

@RunWith(org.junit.runners.AllTests.class)
public class MultiCallTests {
    public static TestSuite suite() {
        TestSuite testSuites = new TestSuite();
        testSuites.setName("Multi call");

        LinphoneTestSuite testsList = new LinphoneTestSuite();
        testsList.run(new String[]{"tester", "--list-tests", "Multi call"});
        for (String testName: testsList.getList()) {
            LinphoneTest test = new LinphoneTest("Multi call", testName);
            testSuites.addTest(test);
        }

        return testSuites;
    }
}


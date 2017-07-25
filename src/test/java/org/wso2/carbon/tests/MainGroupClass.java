/*
*Copyright (c) 2015​, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*WSO2 Inc. licenses this file to you under the Apache License,
*Version 2.0 (the "License"); you may not use this file except
*in compliance with the License.
*You may obtain a copy of the License at
*
*http://www.apache.org/licenses/LICENSE-2.0
*
*Unless required by applicable law or agreed to in writing,
*software distributed under the License is distributed on an
*"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*KIND, either express or implied.  See the License for the
*specific language governing permissions and limitations
*under the License.
*/
package org.wso2.carbon.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class MainGroupClass {

    @BeforeTest(groups = {"g1"}, alwaysRun = false)
    public void setUpG1() {
        //configuration goes here
        sleep();
        System.out.println("BeforeMethod G1");
    }

    @AfterTest(groups = {"g1"}, alwaysRun = false)
    public void tearDownG1() {
        //revert configuration
        sleep();
        System.out.println("AfterMethod G1");
    }

    @BeforeTest(groups = {"g2"}, alwaysRun = false)
    public void setUpG2() {
        //configuration goes here
        sleep();
        System.out.println("BeforeMethod G2");
    }

    @AfterTest(groups = {"g2"}, alwaysRun = false)
    public void tearDownG2() {
        //revert Configuration
        sleep();
        System.out.println("BeforeMethod G2");
    }

    private void sleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

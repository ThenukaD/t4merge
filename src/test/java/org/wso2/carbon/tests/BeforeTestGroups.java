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

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class BeforeTestGroups {

    @Test(groups = {"g1", "g2"})
    public void test1(){
        sleep();
        System.out.println("test1()");
    }

    @Test(groups = {"g1", "g2"})
    public void test2(){
        sleep();
        System.out.println("test2()");
    }

    private void sleep(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException ignored) {

        }
    }
}


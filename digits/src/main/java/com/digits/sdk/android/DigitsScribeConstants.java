/*
 * Copyright (C) 2015 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.digits.sdk.android;

import com.twitter.sdk.android.core.internal.scribe.EventNamespace;

class DigitsScribeConstants {
    static final String SCRIBE_CLIENT = "tfw";
    static final String SCRIBE_PAGE = "android";
    static final String SCRIBE_SECTION = "digits";

    static final String EMPTY_SCRIBE_COMPONENT = "";
    static final String EMPTY_SCRIBE_ELEMENT = "";

    static final String IMPRESSION_ACTION = "impression";
    static final String FAILURE_ACTION = "failure";
    static final String SUCCESS_ACTION = "success";
    static final String CLICK_ACTION = "click";
    static final String ERROR_ACTION = "error";

    static final EventNamespace.Builder DIGITS_EVENT_BUILDER = new EventNamespace.Builder()
            .setClient(SCRIBE_CLIENT)
            .setPage(SCRIBE_PAGE)
            .setSection(SCRIBE_SECTION);

    enum Element {
        COUNTRY_CODE("contry_code"), SUBMIT("submit"), RETRY("retry"), CALL("call"), CANCEL
                ("cancel"), RESEND("resend"), DISMISS("dismiss");

        private final String element;

        Element(String element) {
            this.element = element;
        }

        public String getElement() {
            return element;
        }
    }
}

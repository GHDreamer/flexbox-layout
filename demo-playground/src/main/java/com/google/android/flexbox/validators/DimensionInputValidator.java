/*
 * Copyright 2016 Google Inc. All rights reserved.
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
 */

package com.google.android.flexbox.validators;

import android.text.TextUtils;

/**
 * Validator for dimension values including match_parent and wrap_content.
 */
public class DimensionInputValidator implements InputValidator {

    @Override
    public boolean isValidInput(CharSequence charSequence) {
        // -1 represents match_parent, -2 represents wrap_content
        return !TextUtils.isEmpty(charSequence) &&
                (TextUtils.isDigitsOnly(charSequence) ||
                        charSequence.toString().equals("-1") ||
                        charSequence.toString().equals("-2"));
    }
}

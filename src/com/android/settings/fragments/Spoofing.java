/*
 * SPDX-FileCopyrightText: DerpFest AOSP
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.settings.fragments;

import android.os.Bundle;

import com.android.internal.logging.nano.MetricsProto;
import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class Spoofing extends SettingsPreferenceFragment {

    private static final String TAG = "Spoofing";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.lineage_spoofing);
    }

    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.LINEAGE_SETTINGS;
    }
}

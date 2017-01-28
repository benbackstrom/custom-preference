package com.recursivecase.ben.custompreferenceapp;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

/**
 * Created by benba on 1/28/2017.
 */

public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
    }
}

package com.recursivecase.ben.custompreferenceapp;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by benba on 1/28/2017.
 */

public class CustomCheckboxPreference extends CheckBoxPreference {

    public CustomCheckboxPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomCheckboxPreference(
            Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public CustomCheckboxPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomCheckboxPreference(Context context) {
        super(context, null);
    }

    @Override
    protected View onCreateView(ViewGroup parent) {
        View view = super.onCreateView(parent);
        view.setBackgroundColor(parent.getContext()
                .getResources()
                .getColor(R.color.colorPrimary));
        return view;
    }
}

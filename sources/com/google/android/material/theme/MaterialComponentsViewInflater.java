package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatButton;
import com.bytedance.covode.number.Covode;
import com.google.android.material.b.a;

public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    static {
        Covode.recordClassIndex(32616);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }
}

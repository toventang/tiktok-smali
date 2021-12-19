package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.b;

public class DeprecatedCheckBox extends AppCompatCheckBox {
    static {
        Covode.recordClassIndex(4731);
    }

    public void setFontType(String str) {
        b.a().a(this, str);
    }

    public DeprecatedCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b.a().a(this, attributeSet);
    }
}

package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.b;

public class c extends f {
    static {
        Covode.recordClassIndex(20027);
    }

    public void setFontType(String str) {
        b.a().a(this, str);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b.a().a(this, attributeSet);
    }
}

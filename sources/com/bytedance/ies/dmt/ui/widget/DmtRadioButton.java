package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.zhiliaoapp.musically.R;

public class DmtRadioButton extends n {
    static {
        Covode.recordClassIndex(20018);
    }

    public void setFontType(String str) {
        b.a().a(this, str);
    }

    public DmtRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private DmtRadioButton(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, R.attr.a8o);
        b.a().a(this, attributeSet);
    }
}

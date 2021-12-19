package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.b;

public class DmtButton extends AppCompatButton {
    static {
        Covode.recordClassIndex(20015);
    }

    public DmtButton(Context context) {
        this(context, null);
    }

    private void a(AttributeSet attributeSet) {
        b.a().a(this, attributeSet);
    }

    public void setFontType(String str) {
        b.a().a(this, str);
    }

    public DmtButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public DmtButton(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        a(attributeSet);
    }
}

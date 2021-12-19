package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.b;

public class DmtEditText extends AppCompatEditText {
    static {
        Covode.recordClassIndex(20016);
    }

    public DmtEditText(Context context) {
        this(context, null);
    }

    private void a(AttributeSet attributeSet) {
        b.a().a(this, attributeSet);
    }

    public void setFontType(String str) {
        b.a().a(this, str);
    }

    public void dispatchWindowFocusChanged(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                super.dispatchWindowFocusChanged(z);
            } catch (NullPointerException | SecurityException e2) {
                e2.printStackTrace();
            }
        } else {
            super.dispatchWindowFocusChanged(z);
        }
    }

    public DmtEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public DmtEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }

    public void onFocusChanged(boolean z, int i2, Rect rect) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                super.onFocusChanged(z, i2, rect);
            } catch (SecurityException e2) {
                e2.printStackTrace();
            }
        } else {
            super.onFocusChanged(z, i2, rect);
        }
    }
}

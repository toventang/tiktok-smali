package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.style.g;

public class AVTextView extends AppCompatTextView {
    static {
        Covode.recordClassIndex(98853);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Exception unused) {
            getText();
            return false;
        }
    }

    public String toString() {
        return super.toString() + ", text: " + ((Object) getText());
    }

    public AVTextView(Context context) {
        this(context, null);
    }

    public AVTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.a((TextView) this, attributeSet, true);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i2) {
        try {
            super.onVisibilityChanged(view, i2);
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
    }

    public AVTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        g.a((TextView) this, attributeSet, true);
    }
}

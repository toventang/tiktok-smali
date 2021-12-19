package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.newmedia.e.a.d;
import com.ss.android.ugc.aweme.framework.a.a;

public class n extends d {
    static {
        Covode.recordClassIndex(48970);
    }

    public void onPause() {
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    public void onResume() {
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    public n(Context context) {
        super(context);
    }

    public void setOverScrollMode(int i2) {
        try {
            super.setOverScrollMode(i2);
        } catch (Throwable th) {
            a.a(th);
        }
    }

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public n(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}

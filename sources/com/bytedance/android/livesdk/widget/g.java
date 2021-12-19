package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public abstract class g extends Dialog {

    /* renamed from: i  reason: collision with root package name */
    protected boolean f22610i;

    static {
        Covode.recordClassIndex(13357);
    }

    public abstract int b();

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22610i = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22610i = false;
    }

    public g(Context context) {
        super(context, R.style.a2r);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(b(), (ViewGroup) null));
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(80);
        }
    }
}

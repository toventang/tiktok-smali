package com.ss.android.ugc.aweme.aabplugin.core.base.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class b extends ProgressDialog {

    /* renamed from: a  reason: collision with root package name */
    public boolean f62549a = true;

    /* renamed from: b  reason: collision with root package name */
    public Activity f62550b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f62551c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f62552d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f62553e;

    /* renamed from: f  reason: collision with root package name */
    private int f62554f;

    static {
        Covode.recordClassIndex(38483);
    }

    public b(Context context) {
        super(context, 3);
        this.f62550b = (Activity) context;
    }

    public final void setMessage(CharSequence charSequence) {
        TextView textView;
        super.setMessage(charSequence);
        if (this.f62551c && (textView = (TextView) findViewById(R.id.clf)) != null) {
            textView.setText(charSequence);
        }
        this.f62552d = charSequence;
    }

    public final void setIndeterminate(boolean z) {
        int i2;
        super.setIndeterminate(z);
        if (this.f62551c) {
            DFCircularProgressView dFCircularProgressView = (DFCircularProgressView) findViewById(R.id.byw);
            if (dFCircularProgressView != null) {
                dFCircularProgressView.setIndeterminate(z);
            }
            TextView textView = (TextView) findViewById(R.id.dby);
            if (z) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
        }
    }

    public final void setProgress(int i2) {
        super.setProgress(i2);
        if (this.f62551c) {
            TextView textView = (TextView) findViewById(R.id.dby);
            if (textView != null) {
                textView.setText(i2 + "%");
            }
            DFCircularProgressView dFCircularProgressView = (DFCircularProgressView) findViewById(R.id.byw);
            if (dFCircularProgressView != null) {
                dFCircularProgressView.setProgress((float) i2);
            }
        }
        this.f62554f = i2;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        View findViewById;
        super.onCreate(bundle);
        setContentView(R.layout.agz);
        this.f62551c = true;
        setMessage(this.f62552d);
        setIndeterminate(false);
        setProgress(this.f62554f);
        Drawable drawable = this.f62553e;
        if (drawable != null) {
            if (this.f62551c && (findViewById = findViewById(R.id.dqe)) != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, getContext().getResources().getDrawable(R.drawable.t3)}));
            }
            this.f62553e = drawable;
        }
    }
}

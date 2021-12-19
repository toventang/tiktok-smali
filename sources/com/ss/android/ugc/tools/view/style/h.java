package com.ss.android.ugc.tools.view.style;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.widget.CircularProgressView;
import com.zhiliaoapp.musically.R;

public final class h extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f150196a = true;

    /* renamed from: b  reason: collision with root package name */
    private boolean f150197b;

    /* renamed from: c  reason: collision with root package name */
    private CharSequence f150198c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f150199d;

    /* renamed from: e  reason: collision with root package name */
    private String f150200e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f150201f = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(98842);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.byw);
        if (circularProgressView != null) {
            circularProgressView.b();
        }
        super.dismiss();
    }

    public final void dismiss() {
        i iVar = new i(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            iVar.run();
        } else {
            this.f150201f.post(iVar);
        }
    }

    private h(Context context) {
        super(context, 3);
    }

    public final void setIndeterminate(boolean z) {
        int i2;
        super.setIndeterminate(z);
        if (this.f150197b) {
            CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.byw);
            if (circularProgressView != null) {
                circularProgressView.setIndeterminate(z);
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

    public final void setMessage(CharSequence charSequence) {
        TextView textView;
        int i2;
        super.setMessage(charSequence);
        if (this.f150197b && (textView = (TextView) findViewById(R.id.clf)) != null) {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
        }
        this.f150198c = charSequence;
    }

    public final void setProgress(int i2) {
        super.setProgress(i2);
        TextView textView = (TextView) findViewById(R.id.dby);
        if (textView != null) {
            textView.setText(i2 + "%");
        }
        CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.byw);
        if (circularProgressView != null) {
            circularProgressView.setProgress((float) i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        View findViewById;
        TextView textView;
        super.onCreate(bundle);
        setContentView(R.layout.b4o);
        this.f150197b = true;
        setMessage(this.f150198c);
        setIndeterminate(false);
        String str = this.f150200e;
        if (this.f150197b && (textView = (TextView) findViewById(R.id.eln)) != null && str != null && str.length() == 0) {
            textView.setText(str);
            textView.setVisibility(0);
        }
        this.f150200e = str;
        Drawable drawable = this.f150199d;
        if (drawable != null) {
            if (this.f150197b && (findViewById = findViewById(R.id.dqe)) != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, b.a(getContext(), (int) R.drawable.bml)}));
            }
            this.f150199d = drawable;
        }
        setOnKeyListener(this);
    }

    public static h a(Context context, String str) {
        h hVar = new h(context);
        hVar.setCancelable(false);
        hVar.setIndeterminate(false);
        hVar.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            hVar.show();
        }
        hVar.setMessage(str);
        View findViewById = hVar.findViewById(R.id.dby);
        if (findViewById != null) {
            if (hVar.f150196a) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
        return hVar;
    }
}

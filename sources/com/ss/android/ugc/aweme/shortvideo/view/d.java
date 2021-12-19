package com.ss.android.ugc.aweme.shortvideo.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f132647a = true;

    /* renamed from: b  reason: collision with root package name */
    private boolean f132648b;

    /* renamed from: c  reason: collision with root package name */
    private CharSequence f132649c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f132650d;

    /* renamed from: e  reason: collision with root package name */
    private String f132651e;

    /* renamed from: f  reason: collision with root package name */
    private long f132652f;

    static {
        Covode.recordClassIndex(86789);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        try {
            CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.byw);
            if (circularProgressView != null) {
                circularProgressView.b();
            }
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public final void dismiss() {
        e eVar = new e(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eVar.run();
        } else {
            a.b(eVar);
        }
    }

    private d(Context context) {
        super(context, 3);
    }

    public final void setIndeterminate(boolean z) {
        int i2;
        super.setIndeterminate(z);
        if (this.f132648b) {
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
        if (this.f132648b && (textView = (TextView) findViewById(R.id.clf)) != null) {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
        }
        this.f132649c = charSequence;
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
        setContentView(R.layout.aen);
        this.f132648b = true;
        setMessage(this.f132649c);
        setIndeterminate(false);
        String str = this.f132651e;
        if (this.f132648b && (textView = (TextView) findViewById(R.id.eln)) != null && !m.a(str)) {
            textView.setText(str);
            n.a(textView, 0);
        }
        this.f132651e = str;
        Drawable drawable = this.f132650d;
        if (drawable != null) {
            if (this.f132648b && (findViewById = findViewById(R.id.dqe)) != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, b.a(getContext(), (int) R.drawable.pp)}));
            }
            this.f132650d = drawable;
        }
        setOnKeyListener(this);
        this.f132652f = System.currentTimeMillis();
    }

    public static d a(Context context, String str) {
        d dVar = new d(context);
        dVar.setCancelable(false);
        dVar.setIndeterminate(false);
        dVar.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            dVar.show();
        }
        dVar.setMessage(str);
        View findViewById = dVar.findViewById(R.id.dby);
        if (findViewById != null) {
            if (dVar.f132647a) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
        return dVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        if (i2 != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", (currentTimeMillis - this.f132652f) / 1000);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        o.a("ug_save_video_click_back", jSONObject);
        return false;
    }
}

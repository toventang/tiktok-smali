package com.ss.android.ugc.tools.view.e;

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
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.tools.view.widget.CircularProgressView;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

public class b extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    private boolean f150109a;

    /* renamed from: b  reason: collision with root package name */
    private CharSequence f150110b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f150111c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f150112d = true;

    /* renamed from: e  reason: collision with root package name */
    private String f150113e;

    /* renamed from: f  reason: collision with root package name */
    private long f150114f;

    /* renamed from: g  reason: collision with root package name */
    private Handler f150115g = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(98808);
    }

    public final void a() {
        View findViewById = findViewById(R.id.dby);
        if (findViewById != null) {
            if (this.f150112d) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        try {
            CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.byw);
            if (circularProgressView != null) {
                circularProgressView.b();
            }
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public void dismiss() {
        c cVar = new c(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            cVar.run();
        } else {
            this.f150115g.post(cVar);
        }
    }

    public b(Context context) {
        super(context, 3);
    }

    public void setIndeterminate(boolean z) {
        int i2;
        super.setIndeterminate(z);
        if (this.f150109a) {
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

    public void setMessage(CharSequence charSequence) {
        TextView textView;
        int i2;
        super.setMessage(charSequence);
        if (this.f150109a && (textView = (TextView) findViewById(R.id.clf)) != null) {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
        }
        this.f150110b = charSequence;
    }

    public void setProgress(int i2) {
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
    public void onCreate(Bundle bundle) {
        View findViewById;
        TextView textView;
        super.onCreate(bundle);
        setContentView(R.layout.b4o);
        this.f150109a = true;
        setMessage(this.f150110b);
        setIndeterminate(false);
        String str = this.f150113e;
        if (this.f150109a && (textView = (TextView) findViewById(R.id.eln)) != null && !m.a(str)) {
            textView.setText(str);
            n.a(textView, 0);
        }
        this.f150113e = str;
        Drawable drawable = this.f150111c;
        if (drawable != null) {
            if (this.f150109a && (findViewById = findViewById(R.id.dqe)) != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, androidx.core.content.b.a(getContext(), (int) R.drawable.bml)}));
            }
            this.f150111c = drawable;
        }
        setOnKeyListener(this);
        this.f150114f = System.currentTimeMillis();
    }

    public static b b(Context context, String str) {
        b bVar = new b(context);
        bVar.setCancelable(false);
        bVar.setIndeterminate(false);
        bVar.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            bVar.show();
        }
        bVar.setMessage(str);
        bVar.a();
        return bVar;
    }

    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        if (i2 != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", (currentTimeMillis - this.f150114f) / 1000);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        g.a().I().a("ug_save_video_click_back", jSONObject);
        return false;
    }
}

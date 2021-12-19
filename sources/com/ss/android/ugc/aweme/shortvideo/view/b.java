package com.ss.android.ugc.aweme.shortvideo.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.ss.android.ugc.aweme.share.viewmodel.a;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends AlertDialog implements DialogInterface.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f132629a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f132630b;

    /* renamed from: c  reason: collision with root package name */
    public a f132631c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f132632d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f132633e;

    /* renamed from: f  reason: collision with root package name */
    public View f132634f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f132635g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f132636h;

    /* renamed from: i  reason: collision with root package name */
    private int f132637i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f132638j;

    /* renamed from: k  reason: collision with root package name */
    private String f132639k;

    /* renamed from: l  reason: collision with root package name */
    private long f132640l;

    /* renamed from: m  reason: collision with root package name */
    private int f132641m = 100;
    private CircularProgressView n;
    private TextView o;
    private TextView p;
    private com.ss.android.ugc.aweme.share.viewmodel.a q;

    public interface a {
        static {
            Covode.recordClassIndex(86787);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(86783);
    }

    private void b() {
        if (!this.f132630b) {
            return;
        }
        if (this.f132629a) {
            this.p.setVisibility(0);
        } else {
            this.p.setVisibility(4);
        }
    }

    public final void dismiss() {
        c cVar = new c(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            cVar.run();
        } else {
            com.ss.android.b.a.a.a.b(cVar);
        }
        this.q.a("download_dialog", false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        if (this.n == null) {
            this.n = (CircularProgressView) findViewById(R.id.byw);
        }
        this.n.b();
        super.dismiss();
    }

    private b(Context context) {
        super(context, R.style.fm);
    }

    private void b(int i2) {
        if (this.f132630b) {
            this.n.setMaxProgress((float) i2);
        }
        this.f132641m = i2;
    }

    private void a(String str) {
        if (this.f132630b && this.o != null && !m.a(str)) {
            this.o.setText(str);
            n.a(this.o, 0);
        }
        this.f132639k = str;
    }

    public final void setMessage(CharSequence charSequence) {
        int i2;
        if (this.f132630b) {
            this.f132632d.setText(charSequence);
            TextView textView = this.f132632d;
            if (TextUtils.isEmpty(charSequence)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
        }
        this.f132635g = charSequence;
    }

    private void a(boolean z) {
        int i2;
        if (this.f132630b) {
            this.n.setIndeterminate(z);
            TextView textView = this.p;
            if (z) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
        }
        this.f132636h = z;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mj);
        this.f132634f = findViewById(R.id.dqe);
        this.f132632d = (TextView) findViewById(R.id.clf);
        this.n = (CircularProgressView) findViewById(R.id.byw);
        this.o = (TextView) findViewById(R.id.eln);
        this.f132633e = (ImageView) findViewById(R.id.a1q);
        this.p = (TextView) findViewById(R.id.dby);
        this.f132630b = true;
        com.ss.android.ugc.aweme.share.viewmodel.a a2 = a.C3244a.a(getContext());
        this.q = a2;
        a2.a("download_dialog", true);
        setMessage(this.f132635g);
        a(this.f132636h);
        b(this.f132641m);
        a(this.f132637i);
        a(this.f132639k);
        b();
        Drawable drawable = this.f132638j;
        if (drawable != null) {
            if (this.f132630b) {
                this.f132634f.setBackground(new LayerDrawable(new Drawable[]{drawable, androidx.core.content.b.a(getContext(), (int) R.drawable.pp)}));
            }
            this.f132638j = drawable;
        }
        setOnKeyListener(this);
        this.f132640l = System.currentTimeMillis();
    }

    public final void a(int i2) {
        if (this.f132630b) {
            this.p.setText(i2 + "%");
            this.n.setProgress((float) i2);
        }
        this.f132637i = i2;
    }

    public static b a(Context context, String str) {
        b bVar = new b(context);
        bVar.setCancelable(false);
        bVar.a(false);
        bVar.b(100);
        bVar.setMessage(str);
        bVar.a((String) null);
        bVar.b();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (com.ss.android.ugc.aweme.activity.a.a(activity, true) && !activity.isFinishing()) {
                bVar.show();
            }
        }
        return bVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        if (i2 != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", (currentTimeMillis - this.f132640l) / 1000);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        o.a("ug_save_video_click_back", jSONObject);
        return false;
    }
}

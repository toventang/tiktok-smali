package com.bytedance.android.live.wallet.model;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.model.as;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public abstract class a {

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f13202b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f13203c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f13204d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f13205e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f13206f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f13207g;

    /* renamed from: h  reason: collision with root package name */
    public CheckBox f13208h;

    /* renamed from: i  reason: collision with root package name */
    public View f13209i;

    /* renamed from: j  reason: collision with root package name */
    public long f13210j;

    /* renamed from: k  reason: collision with root package name */
    int f13211k;

    /* renamed from: l  reason: collision with root package name */
    int f13212l;

    /* renamed from: m  reason: collision with root package name */
    String f13213m;
    public String n;
    public String o;
    public boolean p;
    public as q;
    public AbstractC0280a r;

    /* renamed from: com.bytedance.android.live.wallet.model.a$a  reason: collision with other inner class name */
    public interface AbstractC0280a {
        static {
            Covode.recordClassIndex(7333);
        }

        void a(a aVar, boolean z);
    }

    static {
        Covode.recordClassIndex(7332);
    }

    public abstract boolean a();

    public abstract void b();

    public final void a(boolean z) {
        int childCount = this.f13202b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.f13202b.getChildAt(i2).setEnabled(false);
        }
        if (z) {
            this.f13203c.setImageResource(this.f13211k);
        } else {
            this.f13203c.setImageResource(this.f13212l);
        }
    }

    public final void a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.baq, viewGroup, false);
        this.f13202b = viewGroup2;
        this.f13203c = (ImageView) viewGroup2.findViewById(R.id.bzn);
        this.f13204d = (TextView) this.f13202b.findViewById(R.id.f46);
        this.f13205e = (TextView) this.f13202b.findViewById(R.id.f44);
        this.f13206f = (TextView) this.f13202b.findViewById(R.id.f45);
        this.f13207g = (TextView) this.f13202b.findViewById(R.id.f5l);
        this.f13208h = (CheckBox) this.f13202b.findViewById(R.id.a5_);
        this.f13209i = this.f13202b.findViewById(R.id.an6);
        this.f13203c.setBackgroundResource(this.f13211k);
        this.f13204d.setText(this.f13213m);
        this.f13205e.setText(this.n);
        if (!TextUtils.isEmpty(this.o)) {
            this.f13206f.setVisibility(0);
            this.f13206f.setText(this.o);
        }
        if (this.p) {
            this.f13207g.setVisibility(0);
        }
        if (!a()) {
            a(false);
        }
        this.f13202b.setOnClickListener(new b(this));
        b();
        viewGroup.addView(this.f13202b);
    }

    public a(long j2, int i2, int i3, String str, as asVar) {
        this.f13210j = j2;
        this.f13211k = i2;
        this.f13212l = i3;
        this.f13213m = str;
        this.q = asVar;
    }
}

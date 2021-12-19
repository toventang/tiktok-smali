package com.ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import androidx.k.c;
import androidx.k.o;
import androidx.k.q;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f149720a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f149721b;

    /* renamed from: c  reason: collision with root package name */
    private int f149722c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f149723d = true;

    /* renamed from: e  reason: collision with root package name */
    private final int f149724e;

    /* renamed from: f  reason: collision with root package name */
    private final View f149725f;

    /* renamed from: g  reason: collision with root package name */
    private final View f149726g;

    /* renamed from: h  reason: collision with root package name */
    private final View f149727h;

    static {
        Covode.recordClassIndex(98578);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(98579);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        int i2;
        ViewGroup.LayoutParams layoutParams = this.f149727h.getLayoutParams();
        if (this.f149723d) {
            this.f149721b = this.f149727h.getMeasuredWidth();
            this.f149726g.measure(0, 0);
            this.f149722c = this.f149726g.getMeasuredWidth();
            this.f149723d = false;
        }
        if (z) {
            i2 = this.f149721b - (this.f149722c + this.f149724e);
        } else {
            i2 = -1;
        }
        layoutParams.width = i2;
        q qVar = new q();
        qVar.a(new c().b(this.f149727h).b(this.f149726g));
        qVar.a(new AccelerateInterpolator());
        qVar.a(300L);
        View view = this.f149725f;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        o.a((ViewGroup) view, qVar);
        this.f149727h.setLayoutParams(layoutParams);
    }

    public h(Context context, View view, View view2, View view3) {
        l.d(context, "");
        l.d(view, "");
        l.d(view2, "");
        l.d(view3, "");
        this.f149725f = view;
        this.f149726g = view2;
        this.f149727h = view3;
        this.f149724e = (int) r.a(context, 16.0f);
    }
}

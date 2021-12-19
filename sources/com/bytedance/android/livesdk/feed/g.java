package com.bytedance.android.livesdk.feed;

import android.content.Context;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    final a f17479a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f17480b;

    /* renamed from: c  reason: collision with root package name */
    float f17481c;

    /* renamed from: d  reason: collision with root package name */
    float f17482d;

    /* renamed from: e  reason: collision with root package name */
    float f17483e;

    /* renamed from: f  reason: collision with root package name */
    final int f17484f;

    /* renamed from: g  reason: collision with root package name */
    final int f17485g = a(8);

    /* renamed from: h  reason: collision with root package name */
    final int f17486h = a(80);

    /* renamed from: i  reason: collision with root package name */
    final int f17487i = a(150);

    /* renamed from: j  reason: collision with root package name */
    int f17488j;

    /* renamed from: k  reason: collision with root package name */
    boolean f17489k;

    /* renamed from: l  reason: collision with root package name */
    boolean f17490l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f17491m;
    VelocityTracker n;
    private final Context o;

    public interface a {
        static {
            Covode.recordClassIndex(9687);
        }

        void a();

        void a(float f2);

        boolean a(int i2);

        void b();

        boolean b(int i2);

        void c();
    }

    static {
        Covode.recordClassIndex(9686);
    }

    private int a(int i2) {
        return (int) ((((float) i2) * this.o.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(float f2) {
        if (f2 > 0.0f && this.f17479a.b(3)) {
            return true;
        }
        if (f2 >= 0.0f || !this.f17479a.b(5)) {
            return false;
        }
        return true;
    }

    public g(Context context, a aVar) {
        this.o = context;
        this.f17479a = aVar;
        this.f17484f = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f17480b = com.bytedance.android.live.uikit.c.a.a(context);
    }
}

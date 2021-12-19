package com.ss.android.ttvecamera;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.a;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f61842a;

    /* renamed from: b  reason: collision with root package name */
    public final int f61843b;

    /* renamed from: c  reason: collision with root package name */
    public final int f61844c;

    /* renamed from: d  reason: collision with root package name */
    public final int f61845d;

    /* renamed from: e  reason: collision with root package name */
    public final float f61846e;

    /* renamed from: f  reason: collision with root package name */
    long f61847f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f61848g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f61849h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f61850i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f61851j = true;

    /* renamed from: k  reason: collision with root package name */
    public a.AbstractC1336a f61852k;

    /* renamed from: l  reason: collision with root package name */
    public a.b f61853l;

    /* renamed from: m  reason: collision with root package name */
    public a f61854m = new b((byte) 0);

    public interface a {
        static {
            Covode.recordClassIndex(38016);
        }

        void a(int i2, int i3, String str);
    }

    static {
        Covode.recordClassIndex(38015);
    }

    static class b implements a {
        static {
            Covode.recordClassIndex(38017);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.ss.android.ttvecamera.n.a
        public final void a(int i2, int i3, String str) {
            if (i2 > 0) {
                o.b("TEFocusNullCallback", "Focus done, cost: " + i2 + "ms");
            } else {
                o.a("TEFocusNullCallback", "Focus failed, error code: " + i2 + ", msg: " + str);
            }
            o.b("Debug", o.a());
        }
    }

    public final int a() {
        return (int) (System.currentTimeMillis() - this.f61847f);
    }

    public final Rect b() {
        a.AbstractC1336a aVar = this.f61852k;
        if (aVar != null) {
            return aVar.a().get(0).rect;
        }
        return null;
    }

    public final Rect c() {
        a.b bVar = this.f61853l;
        if (bVar != null) {
            return bVar.a().get(0).rect;
        }
        return null;
    }

    public String toString() {
        return "TEFocusSettings{width =" + this.f61842a + ", height =" + this.f61843b + ", x =" + this.f61844c + ", y =" + this.f61845d + ", need focus =" + this.f61848g + ", need meter =" + this.f61849h + ", lock =" + this.f61850i + ", from user=" + this.f61851j + '}';
    }

    public n(int i2, int i3, int i4, int i5, float f2) {
        this.f61842a = i2;
        this.f61843b = i3;
        this.f61844c = i4;
        this.f61845d = i5;
        this.f61846e = f2;
    }
}

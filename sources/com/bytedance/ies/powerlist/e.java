package com.bytedance.ies.powerlist;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.config.b;
import h.a.i;
import h.f.b.l;

public abstract class e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f34286c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public PowerStub f34287a;

    /* renamed from: b  reason: collision with root package name */
    public Context f34288b;

    static {
        Covode.recordClassIndex(20485);
    }

    public b<?> a() {
        return null;
    }

    public void c() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20486);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final f<com.bytedance.ies.powerlist.b.a> b() {
        f<com.bytedance.ies.powerlist.b.a> fVar;
        PowerStub powerStub = this.f34287a;
        if (powerStub != null && (fVar = powerStub.f34241a) != null) {
            return fVar;
        }
        throw new RuntimeException("this chunk's stub is null, pls use this after onCreate");
    }

    public final void d_(View view) {
        PowerStub powerStub = this.f34287a;
        if (powerStub != null) {
            powerStub.a(0, view);
        }
    }

    public final void a(Class<? extends PowerCell<?>>... clsArr) {
        l.c(clsArr, "");
        PowerStub powerStub = this.f34287a;
        if (powerStub != null) {
            powerStub.a(i.j(clsArr));
        }
    }
}

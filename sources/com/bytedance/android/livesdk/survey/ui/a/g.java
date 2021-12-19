package com.bytedance.android.livesdk.survey.ui.a;

import com.bytedance.android.live.core.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.a.b;
import h.f.b.ab;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    final List<f> f21564a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f21565b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f21566c;

    /* renamed from: d  reason: collision with root package name */
    private final DataChannel f21567d;

    /* renamed from: e  reason: collision with root package name */
    private final b<Boolean, z> f21568e;

    static {
        Covode.recordClassIndex(12701);
    }

    public final boolean a() {
        if (this.f21565b == this.f21564a.size()) {
            return true;
        }
        return false;
    }

    private final void c() {
        int i2 = this.f21565b + 1;
        this.f21565b = i2;
        if (i2 == this.f21564a.size()) {
            this.f21568e.invoke(true);
        }
    }

    private final void d() {
        int i2 = this.f21565b - 1;
        this.f21565b = i2;
        if (i2 != this.f21564a.size()) {
            this.f21568e.invoke(false);
        }
    }

    public final void b() {
        Iterator<T> it = this.f21564a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void a(f fVar) {
        l.d(fVar, "");
        fVar.a(this);
        fVar.a(this.f21567d);
        this.f21564a.add(fVar);
        a(fVar.f21563f);
    }

    public final void a(boolean z) {
        if (!z) {
            c();
        } else {
            d();
        }
        if (this.f21566c) {
            for (T t : this.f21564a) {
                a.a(6, "SurveyEvasion", ab.a(t.getClass()).b() + ": " + t.f21563f);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public g(DataChannel dataChannel, b<? super Boolean, z> bVar) {
        l.d(dataChannel, "");
        l.d(bVar, "");
        this.f21567d = dataChannel;
        this.f21568e = bVar;
    }
}

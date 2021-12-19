package com.bytedance.android.live.publicscreen.impl.e;

import com.bytedance.android.live.publicscreen.a.b;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    long f12304a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f12305b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private long f12306c;

    /* renamed from: d  reason: collision with root package name */
    private long f12307d;

    static {
        Covode.recordClassIndex(6777);
    }

    public final void a() {
        Iterator<b> it = this.f12305b.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        this.f12305b.add(bVar);
    }

    public final void b(h hVar) {
        l.d(hVar, "");
        Iterator<b> it = this.f12305b.iterator();
        while (it.hasNext()) {
            it.next().b(hVar);
        }
    }

    public final void c(h hVar) {
        l.d(hVar, "");
        Iterator<b> it = this.f12305b.iterator();
        while (it.hasNext()) {
            it.next().c(hVar);
        }
    }

    public final void d(h hVar) {
        l.d(hVar, "");
        Iterator<b> it = this.f12305b.iterator();
        while (it.hasNext()) {
            it.next().d(hVar);
        }
    }

    public final void e(h hVar) {
        l.d(hVar, "");
        Iterator<b> it = this.f12305b.iterator();
        while (it.hasNext()) {
            it.next().e(hVar);
        }
    }

    public final void f(h hVar) {
        l.d(hVar, "");
        Iterator<b> it = this.f12305b.iterator();
        while (it.hasNext()) {
            it.next().f(hVar);
        }
    }

    public final void g(h hVar) {
        l.d(hVar, "");
        Iterator<b> it = this.f12305b.iterator();
        while (it.hasNext()) {
            it.next().g(hVar);
        }
    }

    public final void h(h hVar) {
        l.d(hVar, "");
        Iterator<b> it = this.f12305b.iterator();
        while (it.hasNext()) {
            it.next().h(hVar);
        }
    }

    public final void i(h hVar) {
        l.d(hVar, "");
        Iterator<b> it = this.f12305b.iterator();
        while (it.hasNext()) {
            it.next().i(hVar);
        }
    }

    public final void j(h hVar) {
        l.d(hVar, "");
        Iterator<b> it = this.f12305b.iterator();
        while (it.hasNext()) {
            it.next().c(hVar, this.f12307d);
        }
        this.f12307d++;
    }

    public final void a(h hVar) {
        l.d(hVar, "");
        Iterator<b> it = this.f12305b.iterator();
        while (it.hasNext()) {
            it.next().b(hVar, this.f12306c);
        }
        this.f12306c++;
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        Iterator<b> it = this.f12305b.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
    }

    public final void a(b<? extends IMessage> bVar, a aVar) {
        l.d(bVar, "");
        l.d(aVar, "");
        Iterator<b> it = this.f12305b.iterator();
        while (it.hasNext()) {
            it.next().a(bVar, aVar);
        }
    }
}

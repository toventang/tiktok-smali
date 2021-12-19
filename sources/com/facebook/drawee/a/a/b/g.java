package com.facebook.drawee.a.a.b;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.facebook.common.time.b;
import com.facebook.drawee.a.a.b.a.c;
import com.facebook.drawee.a.a.d;
import com.facebook.imagepipeline.k.a;
import java.util.Iterator;
import java.util.List;

public final class g extends a {

    /* renamed from: a  reason: collision with root package name */
    public final h f47237a = new h();

    /* renamed from: b  reason: collision with root package name */
    public List<f> f47238b;

    /* renamed from: c  reason: collision with root package name */
    private final d f47239c;

    /* renamed from: d  reason: collision with root package name */
    private final b f47240d;

    /* renamed from: e  reason: collision with root package name */
    private c f47241e;

    /* renamed from: f  reason: collision with root package name */
    private b f47242f;

    /* renamed from: g  reason: collision with root package name */
    private c f47243g;

    /* renamed from: h  reason: collision with root package name */
    private com.facebook.drawee.a.a.b.a.a f47244h;

    /* renamed from: i  reason: collision with root package name */
    private com.facebook.imagepipeline.k.b f47245i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f47246j;

    static {
        Covode.recordClassIndex(28731);
    }

    private void a() {
        if (this.f47244h == null) {
            this.f47244h = new com.facebook.drawee.a.a.b.a.a(this.f47240d, this.f47237a, this);
        }
        if (this.f47243g == null) {
            this.f47243g = new c(this.f47240d, this.f47237a);
        }
        if (this.f47242f == null) {
            this.f47242f = new com.facebook.drawee.a.a.b.a.b(this.f47237a, this);
        }
        c cVar = this.f47241e;
        if (cVar == null) {
            this.f47241e = new c(this.f47239c.f47307k, this.f47242f);
        } else {
            cVar.f47222a = this.f47239c.f47307k;
        }
        if (this.f47245i == null) {
            this.f47245i = new com.facebook.imagepipeline.k.b(this.f47243g, this.f47241e);
        }
    }

    public final void a(h hVar) {
        List<f> list;
        if (this.f47246j && (list = this.f47238b) != null && !list.isEmpty()) {
            hVar.a();
            Iterator<f> it = this.f47238b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void a(boolean z) {
        this.f47246j = z;
        if (z) {
            a();
            b bVar = this.f47242f;
            if (bVar != null) {
                this.f47239c.a(bVar);
            }
            com.facebook.drawee.a.a.b.a.a aVar = this.f47244h;
            if (aVar != null) {
                this.f47239c.a((com.facebook.drawee.c.d) aVar);
            }
            com.facebook.imagepipeline.k.b bVar2 = this.f47245i;
            if (bVar2 != null) {
                this.f47239c.a((com.facebook.imagepipeline.k.c) bVar2);
                return;
            }
            return;
        }
        b bVar3 = this.f47242f;
        if (bVar3 != null) {
            this.f47239c.b(bVar3);
        }
        com.facebook.drawee.a.a.b.a.a aVar2 = this.f47244h;
        if (aVar2 != null) {
            this.f47239c.b((com.facebook.drawee.c.d) aVar2);
        }
        com.facebook.imagepipeline.k.b bVar4 = this.f47245i;
        if (bVar4 != null) {
            this.f47239c.b((com.facebook.imagepipeline.k.c) bVar4);
        }
    }

    public g(b bVar, d dVar) {
        this.f47240d = bVar;
        this.f47239c = dVar;
    }

    public final void a(h hVar, int i2) {
        List<f> list;
        com.facebook.drawee.h.c cVar;
        hVar.q = i2;
        if (this.f47246j && (list = this.f47238b) != null && !list.isEmpty()) {
            if (!(i2 != 3 || (cVar = this.f47239c.f47305i) == null || cVar.a() == null)) {
                Rect bounds = cVar.a().getBounds();
                this.f47237a.o = bounds.width();
                this.f47237a.p = bounds.height();
            }
            hVar.a();
            Iterator<f> it = this.f47238b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}

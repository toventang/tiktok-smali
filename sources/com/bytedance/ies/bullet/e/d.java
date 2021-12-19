package com.bytedance.ies.bullet.e;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.c.e;
import com.bytedance.ies.bullet.e.b.b;
import com.bytedance.ies.bullet.e.c;
import com.bytedance.ies.bullet.e.c.a;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.al;
import com.bytedance.ies.bullet.service.base.b;
import com.bytedance.ies.bullet.service.base.b.a;
import com.bytedance.ies.bullet.service.base.f;
import com.bytedance.ies.bullet.service.base.r;
import com.bytedance.ies.bullet.service.base.s;
import com.bytedance.ies.bullet.service.base.x;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.m;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;

public final class d extends a implements s {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<d.b, c> f32145a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final r f32146b;

    static {
        Covode.recordClassIndex(18852);
    }

    private final d.b e() {
        e a2 = c.a(this.f32574d);
        if (a2 != null) {
            return a2.a();
        }
        return null;
    }

    private final c d() {
        d.b e2 = e();
        if (e2 == null) {
            return null;
        }
        return this.f32145a.get(e2);
    }

    private final void b() {
        d.b e2 = e();
        if (e2 != null && this.f32145a.get(e2) == null) {
            j.b.a(this, "create pool kit on bid: " + this.f32574d, null, null, 6);
            this.f32145a.put(e2, new c(this.f32146b, this.f32574d));
        }
    }

    public d(r rVar) {
        l.c(rVar, "");
        this.f32146b = rVar;
        b();
    }

    @Override // com.bytedance.ies.bullet.service.base.s
    public final al a(Uri uri, View view) {
        BulletContainerView bulletContainerView;
        al alVar;
        l.c(uri, "");
        l.c(view, "");
        j.b.a(this, "start to reUse on schema: ".concat(String.valueOf(uri)), null, null, 6);
        c d2 = d();
        if (!(view instanceof BulletContainerView) || view == null) {
            bulletContainerView = null;
        } else {
            bulletContainerView = (BulletContainerView) view;
        }
        if (d2 == null || bulletContainerView == null) {
            return al.FAIL_INVALID;
        }
        l.c(uri, "");
        l.c(bulletContainerView, "");
        b bVar = new b(uri, d2.a(uri), bulletContainerView, com.bytedance.ies.bullet.service.base.c.REUSE);
        l.c(bVar, "");
        com.bytedance.ies.bullet.e.b.c cVar = d2.f32131b;
        l.c(bVar, "");
        if (cVar.f32127a.a(bVar.f32569b)) {
            alVar = al.FAIL_EXISTS;
        } else {
            BulletContainerView a2 = com.bytedance.ies.bullet.e.c.a.a(bVar.f32570c);
            if (a2 == null || a2.f33037k.get() == m.SUCCESS.ordinal()) {
                cVar.f32127a.a(bVar.f32569b, bVar);
                alVar = al.SUCCESS;
            } else {
                alVar = al.FAIL_LOAD_ERROR;
            }
        }
        j.b.a(d2, "reUse result: " + alVar + " on originSchema: " + bVar.f32568a + ", uniqueSchema: " + bVar.f32569b + ')', null, null, 6);
        if (alVar == al.SUCCESS) {
            d2.f32132c.a(com.bytedance.ies.bullet.e.c.a.a(bVar));
        }
        return alVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.s
    public final b a(Uri uri, boolean z, boolean z2, View view) {
        b bVar;
        boolean z3;
        BulletContainerView a2;
        BulletContainerView a3;
        MutableContextWrapper mutableContextWrapper;
        boolean z4;
        l.c(uri, "");
        l.c(view, "");
        j.b.a(this, "start to fetch on schema: " + uri + ", openPreRender: " + z + ", openReUse: " + z2, null, null, 6);
        c d2 = d();
        if (!(d2 == null || uri == null)) {
            Uri a4 = d2.a(uri);
            if (z) {
                com.bytedance.ies.bullet.e.b.b bVar2 = d2.f32130a;
                l.c(a4, "");
                bVar = (b) bVar2.f32125a.a((Object) a4);
                StringBuilder sb = new StringBuilder("fetchPreRendered success: ");
                if (bVar != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                j.b.a(d2, sb.append(z4).append(" with uniqueSchema:").append(a4).toString(), null, null, 6);
                if (bVar != null) {
                    d2.f32132c.b(com.bytedance.ies.bullet.e.c.a.a(bVar));
                    View view2 = bVar.f32570c;
                    l.c(view, "");
                    a2 = com.bytedance.ies.bullet.e.c.a.a(view2);
                    a3 = com.bytedance.ies.bullet.e.c.a.a(view);
                    if (!(a2 == null || a3 == null)) {
                        a2.getProviderFactory().b(Context.class, view.getContext());
                        Context context = view.getContext();
                        l.a((Object) context, "");
                        l.c(a2, "");
                        l.c(context, "");
                        Context context2 = a2.getContext();
                        if (!(context2 == null || !(context2 instanceof MutableContextWrapper) || (mutableContextWrapper = (MutableContextWrapper) context2) == null)) {
                            mutableContextWrapper.setBaseContext(context);
                        }
                        a3.a();
                        l.c(a2, "");
                        com.bytedance.ies.bullet.e.c.a.a(a2, new a.C0679a(a2));
                        com.bytedance.ies.bullet.e.c.a.a(a3, new a.b(a3, a2));
                        j.b.a(this, "fetch pool cache item success on item: ".concat(String.valueOf(bVar)), null, null, 6);
                        return bVar;
                    }
                }
            }
            if (z2) {
                com.bytedance.ies.bullet.e.b.c cVar = d2.f32131b;
                l.c(a4, "");
                bVar = (b) cVar.f32127a.a((Object) a4);
                StringBuilder sb2 = new StringBuilder("fetchReUsed success: ");
                if (bVar != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                j.b.a(d2, sb2.append(z3).append(" uniqueSchema:").append(a4).toString(), null, null, 6);
                if (bVar != null) {
                    d2.f32132c.b(com.bytedance.ies.bullet.e.c.a.a(bVar));
                    View view22 = bVar.f32570c;
                    l.c(view, "");
                    a2 = com.bytedance.ies.bullet.e.c.a.a(view22);
                    a3 = com.bytedance.ies.bullet.e.c.a.a(view);
                    a2.getProviderFactory().b(Context.class, view.getContext());
                    Context context3 = view.getContext();
                    l.a((Object) context3, "");
                    l.c(a2, "");
                    l.c(context3, "");
                    Context context22 = a2.getContext();
                    mutableContextWrapper.setBaseContext(context3);
                    a3.a();
                    l.c(a2, "");
                    com.bytedance.ies.bullet.e.c.a.a(a2, new a.C0679a(a2));
                    com.bytedance.ies.bullet.e.c.a.a(a3, new a.b(a3, a2));
                    j.b.a(this, "fetch pool cache item success on item: ".concat(String.valueOf(bVar)), null, null, 6);
                    return bVar;
                }
            }
            d2.f32132c.b(new f(uri, a4, com.bytedance.ies.bullet.service.base.c.NONE));
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.s
    public final void a(Uri uri, Context context, long j2, x xVar) {
        l.c(uri, "");
        l.c(context, "");
        l.c(xVar, "");
        j.b.a(this, "start to preRender on schema: " + uri + ", duration: " + j2, null, null, 6);
        b();
        c d2 = d();
        d.b e2 = e();
        if (d2 != null && e2 != null) {
            a aVar = new a(context, e2);
            l.c(xVar, "");
            l.c(aVar, "");
            if (uri != null) {
                Uri a2 = d2.a(uri);
                com.bytedance.ies.bullet.e.b.b bVar = d2.f32130a;
                c.d dVar = new c.d(d2, uri, a2, xVar, j2);
                l.c(uri, "");
                l.c(a2, "");
                l.c(dVar, "");
                l.c(aVar, "");
                if (bVar.f32125a.a(a2)) {
                    dVar.a(al.FAIL_EXISTS, null);
                    return;
                }
                try {
                    aVar.invoke(uri, a2, new b.a(bVar, dVar, a2));
                } catch (Exception e3) {
                    dVar.a(al.FAIL_EXCEPTION, e3.getMessage());
                }
            } else {
                xVar.a(al.FAIL_INVALID, null);
            }
        }
    }
}

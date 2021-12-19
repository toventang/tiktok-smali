package com.ss.android.ugc.aweme.sticker.presenter;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.sticker.d.e;
import com.ss.android.ugc.aweme.sticker.panel.i;
import com.ss.android.ugc.aweme.sticker.panel.l;
import com.ss.android.ugc.aweme.sticker.presenter.a.c;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import com.ss.android.ugc.aweme.sticker.presenter.handler.n;
import com.ss.android.ugc.tools.utils.j;
import h.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class a implements i {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f135253a;

    /* renamed from: b  reason: collision with root package name */
    public m f135254b;

    /* renamed from: c  reason: collision with root package name */
    public final List<l> f135255c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.sticker.panel.c> f135256d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final CopyOnWriteArrayList<e> f135257e = new CopyOnWriteArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public i f135258f;

    /* renamed from: g  reason: collision with root package name */
    public final SafeHandler f135259g;

    /* renamed from: h  reason: collision with root package name */
    private final List<m> f135260h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final h f135261i = h.i.a((h.f.a.a) new d(this));

    /* renamed from: j  reason: collision with root package name */
    private final h f135262j = h.i.a((h.f.a.a) new b(this));

    /* renamed from: k  reason: collision with root package name */
    private final n f135263k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.lifecycle.m f135264l;

    /* renamed from: m  reason: collision with root package name */
    private final j f135265m;

    static {
        Covode.recordClassIndex(88389);
    }

    private final com.ss.android.ugc.aweme.sticker.presenter.handler.a.a d() {
        return (com.ss.android.ugc.aweme.sticker.presenter.handler.a.a) this.f135262j.getValue();
    }

    public abstract c a();

    public n b() {
        return this.f135263k;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.i
    public final i v() {
        return this.f135258f;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.i
    public final SafeHandler x() {
        return this.f135259g;
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.presenter.handler.a.a> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(88391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.presenter.handler.a.a invoke() {
            return new com.ss.android.ugc.aweme.sticker.presenter.handler.a.a(this.this$0.f135254b);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.presenter.handler.a.b> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(88393);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.presenter.handler.a.b invoke() {
            return new com.ss.android.ugc.aweme.sticker.presenter.handler.a.b(this.this$0.a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a$a  reason: collision with other inner class name */
    public static final class C3521a implements l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f135266a;

        static {
            Covode.recordClassIndex(88390);
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.l
        public final void cw_() {
            Iterator<T> it = this.f135266a.f135255c.iterator();
            while (it.hasNext()) {
                it.next().cw_();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3521a(a aVar) {
            this.f135266a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.l
        public final void a(View view) {
            h.f.b.l.d(view, "");
            Iterator<T> it = this.f135266a.f135255c.iterator();
            while (it.hasNext()) {
                it.next().a(view);
            }
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.l
        public final void b(l.a aVar) {
            h.f.b.l.d(aVar, "");
            Iterator<T> it = this.f135266a.f135255c.iterator();
            while (it.hasNext()) {
                it.next().b(aVar);
            }
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.l
        public final void a(l.a aVar) {
            h.f.b.l.d(aVar, "");
            Iterator<T> it = this.f135266a.f135255c.iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }
    }

    public final void c() {
        if (!this.f135253a) {
            this.f135253a = true;
            u().a(new c(this));
        }
    }

    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f135272a;

        static {
            Covode.recordClassIndex(88392);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f135272a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.d.e
        public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
            h.f.b.l.d(aVar, "");
            this.f135272a.a(aVar);
        }

        @Override // com.ss.android.ugc.aweme.sticker.d.e
        public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.d dVar) {
            h.f.b.l.d(dVar, "");
            this.f135272a.a(dVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.i
    public final void a(i iVar) {
        h.f.b.l.d(iVar, "");
        this.f135258f = iVar;
        iVar.a(new C3521a(this));
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.p
    public final void a(m mVar) {
        h.f.b.l.d(mVar, "");
        a(mVar, false);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.p
    public final void b(m mVar) {
        h.f.b.l.d(mVar, "");
        if (!this.f135260h.remove(mVar)) {
            d().b(mVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.p
    public final m a(h.f.a.b<? super m, Boolean> bVar) {
        T t;
        h.f.b.l.d(bVar, "");
        Iterator<T> it = this.f135260h.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (bVar.invoke(t).booleanValue()) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null) {
            return d().a(bVar);
        }
        return t2;
    }

    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.c cVar) {
        ArrayList arrayList = new ArrayList();
        n b2 = b();
        if (b2 != null) {
            arrayList.add(b2);
        }
        arrayList.add(d());
        arrayList.addAll(this.f135260h);
        arrayList.add(this.f135261i.getValue());
        new com.ss.android.ugc.aweme.sticker.presenter.handler.a.a.a(arrayList, 0, this.f135265m).a(cVar);
    }

    public a(androidx.lifecycle.m mVar, j jVar) {
        h.f.b.l.d(mVar, "");
        this.f135264l = mVar;
        this.f135265m = jVar;
        this.f135259g = new SafeHandler(mVar);
    }

    public final void a(m mVar, boolean z) {
        h.f.b.l.d(mVar, "");
        if (!z) {
            d().a(mVar);
        } else if (!this.f135260h.contains(mVar)) {
            this.f135260h.add(mVar);
        }
        if ((mVar instanceof l) && !this.f135255c.contains(mVar)) {
            this.f135255c.add(mVar);
        }
        if ((mVar instanceof com.ss.android.ugc.aweme.sticker.panel.c) && !this.f135256d.contains(mVar)) {
            this.f135256d.add(mVar);
        }
        if ((mVar instanceof e) && !this.f135257e.contains(mVar)) {
            this.f135257e.add(mVar);
        }
    }
}

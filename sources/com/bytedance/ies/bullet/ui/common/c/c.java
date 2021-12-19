package com.bytedance.ies.bullet.ui.common.c;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.d;
import com.bytedance.ies.bullet.c.c.r;
import com.bytedance.ies.bullet.c.f;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.o;
import com.bytedance.ies.bullet.ui.common.g;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public abstract class c<T extends View> extends r implements b<T> {
    public final List<d<T>> H = new ArrayList();
    public AtomicBoolean I = new AtomicBoolean(false);
    public AtomicBoolean J = new AtomicBoolean(false);
    public final o K = ((o) b_(o.class));

    static {
        Covode.recordClassIndex(19752);
    }

    public abstract void a(Activity activity);

    public abstract void a(h.f.a.b<? super List<d<T>>, z> bVar);

    public abstract void b(Activity activity);

    @Override // com.bytedance.ies.bullet.c.c.r
    public void q() {
    }

    @Override // com.bytedance.ies.bullet.ui.common.c.b
    public String u() {
        return "DebugView";
    }

    private final com.bytedance.ies.bullet.ui.common.b.b t() {
        return (com.bytedance.ies.bullet.ui.common.b.b) this.f32057i.c(com.bytedance.ies.bullet.ui.common.b.b.class);
    }

    @Override // com.bytedance.ies.bullet.c.c.r
    public void r() {
        g z = z();
        if (z != null) {
            z.a(new b(this));
        }
    }

    public final g z() {
        return (g) this.f32057i.c(g.class);
    }

    @Override // com.bytedance.ies.bullet.c.c.r, com.bytedance.ies.bullet.c.c.i
    public final void j() {
        com.bytedance.ies.bullet.ui.common.b.b t = t();
        if (t == null || !t.p()) {
            j.b.a(this, "onShow success", null, null, 6);
            a((Activity) null);
            return;
        }
        j.b.a(this, "onShow is intercepted", null, null, 6);
    }

    @Override // com.bytedance.ies.bullet.c.c.r, com.bytedance.ies.bullet.c.c.i
    public final void k() {
        com.bytedance.ies.bullet.ui.common.b.b t = t();
        if (t == null || !t.q()) {
            j.b.a(this, "onHide success", null, null, 6);
            b((Activity) null);
            return;
        }
        j.b.a(this, "onHide is intercepted", null, null, 6);
    }

    @Override // com.bytedance.ies.bullet.ui.common.c.a
    public final d<T> q_() {
        if (!this.H.isEmpty()) {
            return this.H.get(0);
        }
        return null;
    }

    public final void y() {
        this.J.getAndSet(true);
        if (this.I.compareAndSet(true, true)) {
            j();
        }
    }

    public static final class b extends com.bytedance.ies.bullet.ui.common.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f33077a;

        static {
            Covode.recordClassIndex(19754);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f33077a = cVar;
        }

        @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
        public final void b(Activity activity) {
            l.c(activity, "");
            this.f33077a.I.getAndSet(true);
            if (this.f33077a.J.compareAndSet(true, true)) {
                this.f33077a.j();
            }
        }

        @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
        public final void c(Activity activity) {
            l.c(activity, "");
            this.f33077a.I.getAndSet(false);
            if (this.f33077a.J.compareAndSet(true, true)) {
                this.f33077a.k();
            }
        }
    }

    public static final class a extends m implements h.f.a.b<List<? extends d<T>>, z> {
        final /* synthetic */ h.f.a.b $provider;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(19753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, h.f.a.b bVar) {
            super(1);
            this.this$0 = cVar;
            this.$provider = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            List list = (List) obj;
            l.c(list, "");
            List<d<T>> list2 = this.this$0.H;
            list2.clear();
            list2.addAll(list);
            this.$provider.invoke(list);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.r, com.bytedance.ies.bullet.c.c.i
    public final void a(Throwable th) {
        super.a(th);
        this.H.clear();
    }

    public void a(d<T> dVar, Uri uri) {
        l.c(dVar, "");
        l.c(uri, "");
        a(dVar.f33078a);
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final void a(String str, List<String> list, List<? extends JSONObject> list2) {
        l.c(str, "");
        l.c(list, "");
        l.c(list2, "");
        this.f32055g.clear();
        Iterator<T> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            this.f32055g.add(new com.bytedance.ies.bullet.c.b.b(str, list.get(i2), (JSONObject) list2.get(i2), getLoggerWrapper()));
            i2 = i3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d<?, ?, ?, ?> dVar, com.bytedance.ies.bullet.c.c.z zVar, List<String> list, f fVar, com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(dVar, zVar, list, fVar, bVar);
        l.c(dVar, "");
        l.c(zVar, "");
        l.c(list, "");
        l.c(fVar, "");
        l.c(bVar, "");
    }
}

package com.bytedance.ies.powerlist.optimize;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.trace.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.page.config.c;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a extends RecyclerView.n implements b.d {

    /* renamed from: a  reason: collision with root package name */
    final PowerList f34298a;

    /* renamed from: b  reason: collision with root package name */
    private final h f34299b = i.a((h.f.a.a) new C0762a(this));

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f34300c;

    /* renamed from: d  reason: collision with root package name */
    private b.d f34301d;

    /* renamed from: e  reason: collision with root package name */
    private final c f34302e;

    static {
        Covode.recordClassIndex(20495);
    }

    /* access modifiers changed from: package-private */
    public final b b() {
        return (b) this.f34299b.getValue();
    }

    /* renamed from: com.bytedance.ies.powerlist.optimize.a$a  reason: collision with other inner class name */
    static final class C0762a extends m implements h.f.a.a<b> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(20496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0762a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b(this.this$0.a(), true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        b.b(a());
        if (this.f34300c) {
            this.f34300c = false;
            b().b();
        }
    }

    public final String a() {
        String str = this.f34302e.f34364i;
        if (str == null || str.length() == 0) {
            return "";
        }
        return "powerlist_fps_" + this.f34302e.f34364i;
    }

    @Override // com.bytedance.apm.trace.b.b.d
    public final void a(double d2) {
        b.d dVar = this.f34301d;
        if (dVar != null) {
            dVar.a(d2);
        }
    }

    public a(c cVar, PowerList powerList) {
        l.c(cVar, "");
        l.c(powerList, "");
        this.f34302e = cVar;
        this.f34298a = powerList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2) {
        l.c(recyclerView, "");
        if (i2 != 0) {
            if (!this.f34300c) {
                if (!this.f34300c) {
                    b.a(a());
                    this.f34300c = true;
                    b().a();
                }
                l.c(recyclerView, "");
            }
        } else if (this.f34300c) {
            c();
        }
    }
}

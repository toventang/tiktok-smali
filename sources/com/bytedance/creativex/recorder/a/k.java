package com.bytedance.creativex.recorder.a;

import androidx.lifecycle.t;
import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.a.a.e;
import com.bytedance.creativex.recorder.gesture.api.c;
import com.bytedance.o.f;
import com.bytedance.scene.c.f;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.h.d;
import h.k.i;

public class k extends j<e> implements e, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f28147a = {new y(k.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final e f28148b = this;

    /* renamed from: c  reason: collision with root package name */
    public final t<Boolean> f28149c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.scene.group.b f28150d;

    /* renamed from: e  reason: collision with root package name */
    private final d f28151e = com.bytedance.o.b.a.b(getDiContainer(), com.bytedance.creativex.recorder.gesture.api.b.class);

    /* renamed from: f  reason: collision with root package name */
    private final h f28152f = h.i.a((h.f.a.a) new b(this));

    /* renamed from: g  reason: collision with root package name */
    private final f f28153g;

    static {
        Covode.recordClassIndex(16482);
    }

    private final m b() {
        return (m) this.f28152f.getValue();
    }

    public static final class a extends com.bytedance.scene.a.a.b {
        static {
            Covode.recordClassIndex(16483);
        }

        a() {
        }
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public /* bridge */ /* synthetic */ e getApiComponent() {
        return this.f28148b;
    }

    @Override // com.bytedance.o.a
    public f getDiContainer() {
        return this.f28153g;
    }

    static final class b extends m implements h.f.a.a<m> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(16484);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ m invoke() {
            k kVar = this.this$0;
            return kVar.a(kVar.getDiContainer());
        }
    }

    @Override // com.bytedance.creativex.recorder.a.a.e
    public final boolean a() {
        com.bytedance.scene.navigation.d a2 = com.bytedance.scene.ktx.b.a(this.f28150d);
        if (a2 == null) {
            l.b();
        }
        return com.ss.android.ugc.aweme.scene.a.a(a2, b());
    }

    /* access modifiers changed from: protected */
    public m a(f fVar) {
        l.d(fVar, "");
        return new m(fVar);
    }

    @Override // com.bytedance.creativex.recorder.a.a.e
    public final void a(boolean z) {
        com.bytedance.scene.navigation.d a2 = com.bytedance.scene.ktx.b.a(this.f28150d);
        if (a2 == null) {
            l.b();
        }
        if (z && !com.ss.android.ugc.aweme.scene.a.a(a2, b())) {
            this.f28149c.setValue(true);
            com.bytedance.creativex.recorder.gesture.api.b bVar = (com.bytedance.creativex.recorder.gesture.api.b) this.f28151e.a(this, f28147a[0]);
            if (bVar != null) {
                c.a(bVar, true);
            }
            a2.a(b(), new f.a().a().a(new a()).b());
        } else if (com.ss.android.ugc.aweme.scene.a.a(a2, b())) {
            this.f28149c.setValue(false);
            a2.E();
        }
    }

    public k(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        this.f28150d = bVar;
        this.f28153g = fVar;
    }
}

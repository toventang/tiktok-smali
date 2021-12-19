package com.bytedance.ies.xelement.defaultimpl.player.engine.api.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.a.z;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;

public final class j implements h {

    /* renamed from: a  reason: collision with root package name */
    public final f f36972a;

    /* renamed from: b  reason: collision with root package name */
    private final h f36973b = i.a((h.f.a.a) new a(this));

    /* renamed from: c  reason: collision with root package name */
    private int f36974c;

    static {
        Covode.recordClassIndex(22234);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h
    public final int c() {
        return this.f36974c;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h
    public final String a() {
        String id;
        f fVar = this.f36972a;
        if (fVar == null || (id = fVar.getId()) == null) {
            return "";
        }
        return id;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h
    public final List<f> b() {
        return (List) this.f36973b.getValue();
    }

    static final class a extends m implements h.f.a.a<List<? extends f>> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(22235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends f> invoke() {
            if (this.this$0.f36972a == null) {
                return z.INSTANCE;
            }
            return n.d(this.this$0.f36972a);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h
    public final void a(int i2) {
        this.f36974c = i2;
    }

    public j(f fVar) {
        this.f36972a = fVar;
    }
}

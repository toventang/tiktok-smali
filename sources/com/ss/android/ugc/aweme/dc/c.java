package com.ss.android.ugc.aweme.dc;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.be.d;
import h.f.b.l;
import h.f.b.m;

public class c extends a<d> {

    /* renamed from: a  reason: collision with root package name */
    private final d f79371a;

    static {
        Covode.recordClassIndex(49278);
    }

    public /* synthetic */ c() {
        this(null);
    }

    /* renamed from: a */
    public d b() {
        d dVar = this.f79371a;
        if (dVar != null) {
            return dVar;
        }
        throw new RuntimeException("pls pass item or extends the SwitchUnit");
    }

    public c(d dVar) {
        this.f79371a = dVar;
    }

    @Override // com.ss.android.ugc.aweme.dc.a
    public final void a(boolean z) {
        a(new b(this, z));
    }

    public static final class a extends m implements h.f.a.b<d, d> {
        final /* synthetic */ int $visibility = 8;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(49279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            l.d(dVar, "");
            return d.a((d) this.this$0.l(), null, null, null, null, false, null, null, null, false, null, false, null, false, false, null, true, this.$visibility, 32767);
        }
    }

    static final class b extends m implements h.f.a.b<d, d> {
        final /* synthetic */ boolean $isVisible;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(49280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, boolean z) {
            super(1);
            this.this$0 = cVar;
            this.$isVisible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            l.d(dVar, "");
            return d.a((d) this.this$0.l(), null, null, null, null, this.$isVisible, null, null, null, false, null, false, null, false, false, null, false, 0, 131055);
        }
    }
}

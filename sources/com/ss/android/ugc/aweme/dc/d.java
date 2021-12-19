package com.ss.android.ugc.aweme.dc;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.be.e;
import h.f.b.l;
import h.f.b.m;

public class d extends a<e> {

    /* renamed from: a  reason: collision with root package name */
    private final e f79372a;

    static {
        Covode.recordClassIndex(49281);
    }

    public /* synthetic */ d() {
        this(null);
    }

    /* renamed from: a */
    public e b() {
        e eVar = this.f79372a;
        if (eVar != null) {
            return eVar;
        }
        throw new RuntimeException("pls pass item or extends the DividerUnit");
    }

    public d(e eVar) {
        this.f79372a = eVar;
    }

    static final class a extends m implements h.f.a.b<e, e> {
        final /* synthetic */ String $str;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(49282);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, String str) {
            super(1);
            this.this$0 = dVar;
            this.$str = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ e invoke(e eVar) {
            l.d(eVar, "");
            return e.a((e) this.this$0.l(), this.$str, false, false, null, 14);
        }
    }

    static final class b extends m implements h.f.a.b<e, e> {
        final /* synthetic */ boolean $isVisible;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(49283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, boolean z) {
            super(1);
            this.this$0 = dVar;
            this.$isVisible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ e invoke(e eVar) {
            l.d(eVar, "");
            return e.a((e) this.this$0.l(), null, false, this.$isVisible, null, 11);
        }
    }

    public final void a(String str) {
        l.d(str, "");
        a(new a(this, str));
    }

    @Override // com.ss.android.ugc.aweme.dc.a
    public final void a(boolean z) {
        a(new b(this, z));
    }
}

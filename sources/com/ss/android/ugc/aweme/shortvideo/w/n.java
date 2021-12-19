package com.ss.android.ugc.aweme.shortvideo.w;

import com.bytedance.als.g;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.x;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.w.g;
import com.ss.android.ugc.aweme.utils.hx;
import com.ss.android.vesdk.ax;
import h.f.a.r;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class n extends g<m> implements m {
    private final k<Boolean> q;
    private final g<Boolean> r;

    static {
        Covode.recordClassIndex(86873);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.w.m
    public final g<Boolean> G() {
        return this.r;
    }

    /* Return type fixed from 'com.bytedance.creativex.recorder.b.a.m' to match base method */
    @Override // com.ss.android.ugc.aweme.shortvideo.w.g
    public final /* bridge */ /* synthetic */ m M() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.w.g, com.bytedance.als.j
    public final /* bridge */ /* synthetic */ com.bytedance.als.b getApiComponent() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.w.g, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        H().D().a(new b(this));
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ int $infoType;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(86874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar, int i2) {
            super(0);
            this.this$0 = nVar;
            this.$infoType = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2 = this.$infoType;
            if (i2 == 1022) {
                x xVar = new x("stop record when stopPreview");
                xVar.f28214a = 3;
                n nVar = this.this$0;
                l.b(xVar, "");
                nVar.b(xVar);
                this.this$0.a(xVar);
            } else if (i2 == 1080) {
                n nVar2 = this.this$0;
                nVar2.f132686j = nVar2.H().H().a();
                this.this$0.y();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.w.m
    public final void g(boolean z) {
        this.q.a(Boolean.valueOf(!z));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.w.g, com.bytedance.creativex.recorder.b.a.m
    public final void a(x xVar) {
        l.d(xVar, "");
        if (xVar.f28214a != 0) {
            super.a(xVar);
        } else {
            super.a(xVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(f fVar, h.f.a.b<? super g.b, z> bVar) {
        super(fVar, bVar);
        l.d(fVar, "");
        k<Boolean> kVar = new k<>();
        this.q = kVar;
        this.r = kVar;
    }

    static final class b extends m implements r<Integer, Integer, String, ax, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(86875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar) {
            super(4);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ z a(Integer num, Integer num2, String str, ax axVar) {
            int intValue = num.intValue();
            l.d(axVar, "");
            hx.a(0, new a(this.this$0, intValue));
            return z.f158842a;
        }
    }
}

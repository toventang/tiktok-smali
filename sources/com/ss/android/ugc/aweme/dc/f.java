package com.ss.android.ugc.aweme.dc;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;

public final class f extends a<com.ss.android.ugc.aweme.be.f> {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.be.f f79373a;

    static {
        Covode.recordClassIndex(49285);
    }

    private /* synthetic */ f() {
        this(null);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.f b() {
        com.ss.android.ugc.aweme.be.f fVar = this.f79373a;
        if (fVar != null) {
            return fVar;
        }
        throw new RuntimeException("pls pass labelItem or extends the LabelUnit");
    }

    public f(com.ss.android.ugc.aweme.be.f fVar) {
        this.f79373a = fVar;
    }

    public final void a(int i2) {
        a(new b(i2));
    }

    public final void a(CharSequence charSequence) {
        l.d(charSequence, "");
        a(new a(charSequence));
    }

    static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {
        final /* synthetic */ CharSequence $text;

        static {
            Covode.recordClassIndex(49286);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(CharSequence charSequence) {
            super(1);
            this.$text = charSequence;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            l.d(fVar2, "");
            return com.ss.android.ugc.aweme.be.f.a(fVar2, this.$text.toString(), false, null, null, null, null, false, false, null, false, false, null, null, 8190);
        }
    }

    static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {
        final /* synthetic */ int $visible;

        static {
            Covode.recordClassIndex(49287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(1);
            this.$visible = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            boolean z;
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            l.d(fVar2, "");
            if (this.$visible == 0) {
                z = true;
            } else {
                z = false;
            }
            return com.ss.android.ugc.aweme.be.f.a(fVar2, null, false, null, null, null, null, false, z, null, false, false, null, null, 8063);
        }
    }
}

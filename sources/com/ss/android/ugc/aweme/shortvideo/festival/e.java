package com.ss.android.ugc.aweme.shortvideo.festival;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.y.c;
import h.f.b.m;
import h.h;
import h.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    final h f128494a;

    /* renamed from: b  reason: collision with root package name */
    public final c f128495b;

    static {
        Covode.recordClassIndex(84250);
    }

    public /* synthetic */ e() {
        this(com.ss.android.ugc.aweme.aq.a.a.b());
    }

    static final class a extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (this.this$0.f128495b == null || !this.this$0.f128495b.f145304d) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    private e(c cVar) {
        this.f128495b = cVar;
        this.f128494a = i.a((h.f.a.a) new a(this));
    }
}

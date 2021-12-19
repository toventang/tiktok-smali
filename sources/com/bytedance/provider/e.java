package com.bytedance.provider;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public class e implements d {

    /* renamed from: b  reason: collision with root package name */
    private final h f41998b = i.a((h.f.a.a) new a(this));

    /* renamed from: c  reason: collision with root package name */
    private final String f41999c;

    static {
        Covode.recordClassIndex(25675);
    }

    @Override // com.bytedance.provider.d
    public g a() {
        return (g) this.f41998b.getValue();
    }

    static final class a extends m implements h.f.a.a<g> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(25676);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return new g(this.this$0);
        }
    }

    public e(String str) {
        l.c(str, "");
        this.f41999c = str;
    }
}

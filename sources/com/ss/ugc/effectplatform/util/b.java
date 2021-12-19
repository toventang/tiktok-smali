package com.ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.m.d;
import java.nio.charset.Charset;

public final class b {
    static {
        Covode.recordClassIndex(102664);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<Charset> {
        final /* synthetic */ d.a.d.a.b $contentEncoding;

        static {
            Covode.recordClassIndex(102665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d.a.d.a.b bVar) {
            super(0);
            this.$contentEncoding = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Charset invoke() {
            if (c.f153949a[this.$contentEncoding.ordinal()] != 1) {
                return d.f158808a;
            }
            return d.f158812e;
        }
    }

    public static final String a(byte[] bArr, d.a.d.a.b bVar) {
        l.c(bArr, "");
        l.c(bVar, "");
        return new String(bArr, (Charset) new a(bVar).invoke());
    }
}

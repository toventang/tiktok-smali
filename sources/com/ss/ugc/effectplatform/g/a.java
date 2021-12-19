package com.ss.ugc.effectplatform.g;

import com.bytedance.covode.number.Covode;
import d.a.d.a.b;
import h.f.b.l;
import h.f.b.m;
import h.m.d;
import java.nio.charset.Charset;

public final class a {
    static {
        Covode.recordClassIndex(102404);
    }

    /* renamed from: com.ss.ugc.effectplatform.g.a$a  reason: collision with other inner class name */
    static final class C4088a extends m implements h.f.a.a<Charset> {
        final /* synthetic */ b $contentEncoding;

        static {
            Covode.recordClassIndex(102405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4088a(b bVar) {
            super(0);
            this.$contentEncoding = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Charset invoke() {
            if (b.f153599a[this.$contentEncoding.ordinal()] != 1) {
                return d.f158808a;
            }
            return d.f158812e;
        }
    }

    public static final byte[] a(String str) {
        l.c(str, "");
        byte[] bytes = str.getBytes(d.f158808a);
        l.a((Object) bytes, "");
        return bytes;
    }

    public static final String a(byte[] bArr, int i2, int i3, b bVar) {
        l.c(bArr, "");
        l.c(bVar, "");
        return new String(bArr, i2, i3, (Charset) new C4088a(bVar).invoke());
    }
}

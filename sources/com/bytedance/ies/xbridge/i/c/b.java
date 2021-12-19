package com.bytedance.ies.xbridge.i.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class b extends com.bytedance.ies.xbridge.model.c.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f36101b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<C0845b> f36102a;

    static {
        Covode.recordClassIndex(21588);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21589);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.c.a
    public final List<String> a() {
        return n.a("tempFiles");
    }

    /* renamed from: com.bytedance.ies.xbridge.i.c.b$b  reason: collision with other inner class name */
    public static final class C0845b {

        /* renamed from: a  reason: collision with root package name */
        public String f36103a;

        /* renamed from: b  reason: collision with root package name */
        public final String f36104b;

        /* renamed from: c  reason: collision with root package name */
        public final long f36105c;

        /* renamed from: d  reason: collision with root package name */
        public final String f36106d;

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f36107e;

        static {
            Covode.recordClassIndex(21590);
        }

        public C0845b(String str, long j2, String str2, byte[] bArr) {
            l.c(str, "");
            l.c(str2, "");
            this.f36104b = str;
            this.f36105c = j2;
            this.f36106d = str2;
            this.f36107e = bArr;
        }
    }
}

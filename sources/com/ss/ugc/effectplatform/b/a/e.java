package com.ss.ugc.effectplatform.b.a;

import com.bytedance.covode.number.Covode;
import d.a.d.a.c;
import d.a.d.a.k;
import h.f.b.l;

public final class e implements k {

    /* renamed from: b  reason: collision with root package name */
    public static final byte f153515b = f153515b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f153516c = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private static final byte f153517h = f153517h;

    /* renamed from: a  reason: collision with root package name */
    public final d.a.d.a.b f153518a;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f153519d;

    /* renamed from: e  reason: collision with root package name */
    private int f153520e;

    /* renamed from: f  reason: collision with root package name */
    private int f153521f;

    /* renamed from: g  reason: collision with root package name */
    private final c f153522g;

    public static final class a {
        static {
            Covode.recordClassIndex(102362);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // d.a.d.a.k
    public final void a() {
        this.f153522g.a();
        this.f153519d = null;
    }

    public final boolean c() {
        if (this.f153521f == -1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(102361);
    }

    private final boolean d() {
        byte[] bArr = this.f153519d;
        if (bArr != null) {
            int a2 = this.f153522g.a(bArr, bArr.length);
            if (a2 <= 0) {
                return false;
            }
            this.f153520e = 0;
            this.f153521f = a2;
            return true;
        }
        throw new Exception("buf is null!");
    }

    public static final class b extends d.a.d.a.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f153523e;

        static {
            Covode.recordClassIndex(102363);
        }

        @Override // d.a.d.a.a
        public final String toString() {
            int i2;
            if (this.f156616b <= 0 || this.f156615a[this.f156616b - 1] != e.f153515b) {
                i2 = this.f156616b;
            } else {
                i2 = this.f156616b - 1;
            }
            try {
                return com.ss.ugc.effectplatform.g.a.a(this.f156615a, 0, i2, this.f153523e.f153518a);
            } catch (Exception e2) {
                throw new AssertionError(e2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i2, e eVar) {
            super(i2);
            this.f153523e = eVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r5[r2] == com.ss.ugc.effectplatform.b.a.e.f153515b) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b() {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.b.a.e.b():java.lang.String");
    }

    private e(c cVar, d.a.d.a.b bVar) {
        l.c(cVar, "");
        l.c(bVar, "");
        this.f153522g = cVar;
        this.f153518a = bVar;
        if (bVar == d.a.d.a.b.Ascii) {
            this.f153519d = new byte[8192];
            return;
        }
        throw new IllegalArgumentException("Unsupported encoding!");
    }

    public /* synthetic */ e(c cVar, d.a.d.a.b bVar, byte b2) {
        this(cVar, bVar);
    }
}

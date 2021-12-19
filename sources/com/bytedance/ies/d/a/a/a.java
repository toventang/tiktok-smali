package com.bytedance.ies.d.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.d.a.j;
import com.bytedance.ies.d.a.y;
import com.bytedance.ies.web.jsbridge2.e;
import h.f.b.l;
import java.util.List;

public final class a extends com.bytedance.ies.d.a.b implements b {

    /* renamed from: f  reason: collision with root package name */
    public static a f33162f;

    /* renamed from: g  reason: collision with root package name */
    public static final C0726a f33163g = new C0726a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public final String f33164e;

    static {
        Covode.recordClassIndex(19810);
    }

    /* renamed from: com.bytedance.ies.d.a.a.a$a  reason: collision with other inner class name */
    public static final class C0726a implements b {
        static {
            Covode.recordClassIndex(19811);
        }

        private C0726a() {
        }

        public static b a() {
            return new b("default_business");
        }

        public /* synthetic */ C0726a(byte b2) {
            this();
        }

        @Override // com.bytedance.ies.d.a.m
        public final void a(String str) {
            l.c(str, "");
            a aVar = a.f33162f;
            if (aVar != null) {
                aVar.a(str);
            }
        }

        @Override // com.bytedance.ies.d.a.m
        public final List<y> b(String str) {
            l.c(str, "");
            a aVar = a.f33162f;
            if (aVar != null) {
                return aVar.b(str);
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
            if (r0 == null) goto L_0x0012;
         */
        @Override // com.bytedance.ies.d.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.ies.d.a.y a(com.bytedance.ies.d.a.z r2, com.bytedance.ies.d.a.aa r3) {
            /*
                r1 = this;
                java.lang.String r0 = ""
                h.f.b.l.c(r2, r0)
                h.f.b.l.c(r3, r0)
                com.bytedance.ies.d.a.a.a r0 = com.bytedance.ies.d.a.a.a.f33162f
                if (r0 == 0) goto L_0x0016
                com.bytedance.ies.d.a.y r0 = r0.a(r2, r3)
                if (r0 != 0) goto L_0x0015
            L_0x0012:
                h.f.b.l.a()
            L_0x0015:
                return r0
            L_0x0016:
                r0 = 0
                goto L_0x0012
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.d.a.a.a.C0726a.a(com.bytedance.ies.d.a.z, com.bytedance.ies.d.a.aa):com.bytedance.ies.d.a.y");
        }
    }

    public static final class c implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33166a;

        static {
            Covode.recordClassIndex(19813);
        }

        public c(a aVar) {
            this.f33166a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.e.b
        public final /* synthetic */ e a() {
            return new c(this.f33166a);
        }
    }

    public static final class b extends com.bytedance.ies.d.a.a<a> {

        /* renamed from: l  reason: collision with root package name */
        private String f33165l = "__prefetch";

        static {
            Covode.recordClassIndex(19812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(str);
            l.c(str, "");
        }

        /* Return type fixed from 'com.bytedance.ies.d.a.b' to match base method */
        @Override // com.bytedance.ies.d.a.a
        public final /* synthetic */ a a(String str, j jVar, com.bytedance.ies.d.a.e eVar) {
            l.c(str, "");
            l.c(jVar, "");
            l.c(eVar, "");
            a aVar = new a(str, jVar, eVar, this.f33165l, (byte) 0);
            if (l.a((Object) aVar.f33219b, (Object) "default_business")) {
                a.f33162f = aVar;
            }
            return aVar;
        }
    }

    private a(String str, j jVar, com.bytedance.ies.d.a.e eVar, String str2) {
        super(str, jVar, eVar);
        this.f33164e = str2;
    }

    public /* synthetic */ a(String str, j jVar, com.bytedance.ies.d.a.e eVar, String str2, byte b2) {
        this(str, jVar, eVar, str2);
    }
}

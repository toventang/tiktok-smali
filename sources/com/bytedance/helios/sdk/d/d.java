package com.bytedance.helios.sdk.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.n;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.e;
import com.bytedance.helios.sdk.f;
import com.bytedance.helios.sdk.utils.c;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.j;
import h.m.p;
import java.util.Arrays;
import java.util.Map;

public final class d {

    /* renamed from: j  reason: collision with root package name */
    public static final h f30860j = i.a((h.f.a.a) b.f30871a);

    /* renamed from: k  reason: collision with root package name */
    public static final a f30861k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Object f30862a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f30863b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f30864c;

    /* renamed from: d  reason: collision with root package name */
    public final int f30865d;

    /* renamed from: e  reason: collision with root package name */
    public final long f30866e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f30867f;

    /* renamed from: g  reason: collision with root package name */
    public final String f30868g;

    /* renamed from: h  reason: collision with root package name */
    public final String f30869h;

    /* renamed from: i  reason: collision with root package name */
    public final String f30870i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f30862a, dVar.f30862a) && l.a(this.f30863b, dVar.f30863b) && l.a(this.f30864c, dVar.f30864c) && this.f30865d == dVar.f30865d && this.f30866e == dVar.f30866e && this.f30867f == dVar.f30867f && l.a(this.f30868g, dVar.f30868g) && l.a(this.f30869h, dVar.f30869h) && l.a(this.f30870i, dVar.f30870i);
    }

    public final int hashCode() {
        Object obj = this.f30862a;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f30863b;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f30864c;
        int hashCode3 = objArr != null ? Arrays.hashCode(objArr) : 0;
        long j2 = this.f30866e;
        int i3 = (((((hashCode2 + hashCode3) * 31) + this.f30865d) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.f30867f;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i3 + i4) * 31;
        String str = this.f30868g;
        int hashCode4 = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f30869h;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30870i;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode5 + i2;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(17921);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<h.m.l> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f30871a = new b();

        static {
            Covode.recordClassIndex(17922);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.m.l invoke() {
            return new h.m.l(".+(?=_java_lang_reflect_Method_invoke)");
        }
    }

    static {
        Covode.recordClassIndex(17920);
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("ActionParam{, id=").append(this.f30865d).append(", calledTime=").append(this.f30866e).append(", reflection=").append(this.f30867f).append(", returnType=");
        String str = this.f30868g;
        if (str == null) {
            str = "";
        }
        return append.append((Object) str).append(", proxyMethodKey=").append(this.f30869h).append("}").toString();
    }

    public final n a(Throwable th) {
        String str;
        Object[] objArr;
        Object obj;
        Object obj2;
        Object[] objArr2;
        String str2;
        n nVar = new n(null, 0, null, null, null, null, null, null, 0, 0, null, null, null, null, 0, null, null, null, null, null, -1);
        String userRegion = HeliosEnvImpl.INSTANCE.getUserRegion();
        f a2 = f.a();
        l.a((Object) a2, "");
        boolean z = !a2.d();
        nVar.f30673b = this.f30865d;
        nVar.f30679h = !z;
        f a3 = f.a();
        l.a((Object) a3, "");
        String e2 = a3.e();
        l.a((Object) e2, "");
        nVar.g(e2);
        f a4 = f.a();
        l.a((Object) a4, "");
        nVar.f30682k = a4.f();
        if (z) {
            str = "FORE_SENSITIVE_CALL";
        } else {
            str = "BACK_SENSITIVE_CALL";
        }
        nVar.f(str);
        f a5 = f.a();
        l.a((Object) a5, "");
        String b2 = a5.b();
        l.a((Object) b2, "");
        nVar.e(b2);
        nVar.f30683l = this.f30866e;
        nVar.r = this.f30867f;
        nVar.t = 2;
        if (userRegion == null || p.a((CharSequence) userRegion)) {
            userRegion = "null";
        }
        l.c(userRegion, "");
        nVar.v = userRegion;
        e b3 = e.b(this.f30865d);
        if (b3 != null) {
            String str3 = b3.f30876d;
            l.a((Object) str3, "");
            nVar.b(str3);
            String a6 = e.a();
            l.a((Object) a6, "");
            nVar.i(a6);
            String str4 = b3.f30877e;
            l.a((Object) str4, "");
            nVar.c(str4);
            String str5 = b3.f30873a;
            l.a((Object) str5, "");
            nVar.a(str5);
        }
        nVar.j(this.f30870i);
        nVar.a(th);
        Object obj3 = null;
        if (this.f30867f) {
            Map<String, Object> map = nVar.n;
            j find$default = h.m.l.find$default((h.m.l) f30860j.getValue(), this.f30869h, 0, 2, null);
            if (find$default == null || (str2 = find$default.b()) == null) {
                str2 = "unknown";
            }
            map.put("OriginCaller", str2);
        }
        int i2 = this.f30865d;
        if (i2 == 102600 && (objArr2 = this.f30864c) != null && objArr2.length != 0) {
            Object obj4 = objArr2[0];
            if (obj4 != null) {
                com.bytedance.helios.api.b.d dVar = new com.bytedance.helios.api.b.d(this.f30864c, null, null, null, 126);
                l.c(dVar, "");
                nVar.y = dVar;
                nVar.n.put("permissions", c.a(obj4));
            }
        } else if (i2 == 100012) {
            Object[] objArr3 = this.f30864c;
            if (objArr3 != null && objArr3.length >= 3) {
                Map<String, Object> map2 = nVar.n;
                Object[] objArr4 = this.f30864c;
                if (objArr4 != null) {
                    obj = objArr4[0];
                } else {
                    obj = null;
                }
                map2.put("origin", String.valueOf(obj));
                Map<String, Object> map3 = nVar.n;
                Object[] objArr5 = this.f30864c;
                if (objArr5 != null) {
                    obj2 = objArr5[1];
                } else {
                    obj2 = null;
                }
                map3.put("allow", String.valueOf(obj2));
                Map<String, Object> map4 = nVar.n;
                Object[] objArr6 = this.f30864c;
                if (objArr6 != null) {
                    obj3 = objArr6[2];
                }
                map4.put("retain", String.valueOf(obj3));
            }
        } else if (i2 == 100003 && (objArr = this.f30864c) != null && objArr.length >= 2) {
            Map<String, Object> map5 = nVar.n;
            Object[] objArr7 = this.f30864c;
            if (objArr7 != null) {
                obj3 = objArr7[0];
            }
            map5.put("origin", String.valueOf(obj3));
        }
        return nVar;
    }

    public d(Object obj, Object obj2, Object[] objArr, int i2, long j2, boolean z, String str, String str2, String str3) {
        l.c(str2, "");
        l.c(str3, "");
        this.f30862a = obj;
        this.f30863b = obj2;
        this.f30864c = objArr;
        this.f30865d = i2;
        this.f30866e = j2;
        this.f30867f = z;
        this.f30868g = str;
        this.f30869h = str2;
        this.f30870i = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ d(java.lang.Object r12, java.lang.Object[] r13, int r14, long r15, boolean r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21) {
        /*
            r11 = this;
            r9 = r19
            r1 = r21
            r0 = r1 & 128(0x80, float:1.794E-43)
            java.lang.String r10 = ""
            if (r0 == 0) goto L_0x000b
            r9 = r10
        L_0x000b:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x001d
        L_0x000f:
            r1 = 0
            r0 = r11
            r5 = r15
            r4 = r14
            r3 = r13
            r2 = r12
            r8 = r18
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return
        L_0x001d:
            r10 = r20
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.d.d.<init>(java.lang.Object, java.lang.Object[], int, long, boolean, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}

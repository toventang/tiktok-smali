package com.vk.api.sdk.a;

import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.h;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f156207h = n.b("access_token", "expires_in", "user_id", "secret", "https_required", "created", "vk_access_token", "email", "phone", "phone_access_key");

    /* renamed from: i  reason: collision with root package name */
    public static final C4121a f156208i = new C4121a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f156209a;

    /* renamed from: b  reason: collision with root package name */
    public final String f156210b;

    /* renamed from: c  reason: collision with root package name */
    public final String f156211c;

    /* renamed from: d  reason: collision with root package name */
    public final long f156212d;

    /* renamed from: e  reason: collision with root package name */
    public final String f156213e;

    /* renamed from: f  reason: collision with root package name */
    public final String f156214f;

    /* renamed from: g  reason: collision with root package name */
    public final String f156215g;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f156216j;

    /* renamed from: k  reason: collision with root package name */
    private final long f156217k;

    /* renamed from: com.vk.api.sdk.a.a$a  reason: collision with other inner class name */
    public static final class C4121a {
        static {
            Covode.recordClassIndex(103748);
        }

        private C4121a() {
        }

        public /* synthetic */ C4121a(byte b2) {
            this();
        }

        public static void a(h hVar) {
            l.c(hVar, "");
            Iterator<T> it = a.f156207h.iterator();
            while (it.hasNext()) {
                hVar.b(it.next());
            }
        }

        public static a b(h hVar) {
            l.c(hVar, "");
            HashMap hashMap = new HashMap(a.f156207h.size());
            for (String str : a.f156207h) {
                String a2 = hVar.a(str);
                if (a2 != null) {
                    hashMap.put(str, a2);
                }
            }
            if (!hashMap.containsKey("access_token") || !hashMap.containsKey("user_id")) {
                return null;
            }
            return new a(hashMap);
        }
    }

    public final boolean a() {
        long j2 = this.f156217k;
        if (j2 <= 0 || this.f156212d + (j2 * 1000) > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(103747);
    }

    private final Map<String, String> b() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("access_token", this.f156210b);
        hashMap.put("secret", this.f156211c);
        if (this.f156216j) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("https_required", str);
        hashMap.put("created", String.valueOf(this.f156212d));
        hashMap.put("expires_in", String.valueOf(this.f156217k));
        hashMap.put("user_id", String.valueOf(this.f156209a));
        hashMap.put("email", this.f156213e);
        hashMap.put("phone", this.f156214f);
        hashMap.put("phone_access_key", this.f156215g);
        return hashMap;
    }

    public final void a(h hVar) {
        l.c(hVar, "");
        for (Map.Entry<String, String> entry : b().entrySet()) {
            hVar.b(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r1 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.util.Map<java.lang.String, java.lang.String> r4) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.api.sdk.a.a.<init>(java.util.Map):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(int i2, String str, String str2) {
        this(ag.a(v.a("user_id", String.valueOf(i2)), v.a("access_token", str), v.a("secret", str2), v.a("https_required", "1")));
        l.c(str, "");
    }
}

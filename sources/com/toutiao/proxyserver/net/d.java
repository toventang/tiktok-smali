package com.toutiao.proxyserver.net;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f154932a;

    /* renamed from: b  reason: collision with root package name */
    public final String f154933b;

    /* renamed from: c  reason: collision with root package name */
    public final List<c> f154934c;

    /* renamed from: d  reason: collision with root package name */
    public final long f154935d;

    /* renamed from: e  reason: collision with root package name */
    public final long f154936e;

    /* renamed from: f  reason: collision with root package name */
    public final long f154937f;

    static {
        Covode.recordClassIndex(103174);
    }

    public final String toString() {
        return "HttpRequest{url='" + this.f154932a + '\'' + ", method='" + this.f154933b + '\'' + ", headers=" + this.f154934c + ", connectTimeout=" + this.f154935d + ", readTimeout=" + this.f154936e + ", writeTimeout=" + this.f154937f + '}';
    }

    public final String a(String str) {
        return b(str);
    }

    private d(a aVar) {
        this.f154932a = aVar.f154938a;
        this.f154933b = aVar.f154939b;
        this.f154934c = aVar.f154940c;
        this.f154935d = aVar.f154941d;
        this.f154936e = aVar.f154942e;
        this.f154937f = aVar.f154943f;
    }

    public final String b(String str) {
        for (c cVar : this.f154934c) {
            if (cVar.f154930a.equalsIgnoreCase(str)) {
                return cVar.f154931b;
            }
        }
        return null;
    }

    public /* synthetic */ d(a aVar, byte b2) {
        this(aVar);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f154938a;

        /* renamed from: b  reason: collision with root package name */
        public String f154939b;

        /* renamed from: c  reason: collision with root package name */
        public final List<c> f154940c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public long f154941d;

        /* renamed from: e  reason: collision with root package name */
        public long f154942e;

        /* renamed from: f  reason: collision with root package name */
        public long f154943f;

        static {
            Covode.recordClassIndex(103175);
        }

        public final a a(String str, String str2) {
            if (!(str == null || str2 == null)) {
                this.f154940c.add(new c(str, str2));
            }
            return this;
        }
    }
}

package com.vk.api.sdk.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f156290a;

    /* renamed from: b  reason: collision with root package name */
    public final String f156291b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f156292c;

    /* renamed from: d  reason: collision with root package name */
    public final e f156293d;

    static {
        Covode.recordClassIndex(103797);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f156294a = "";

        /* renamed from: b  reason: collision with root package name */
        public String f156295b = "";

        /* renamed from: c  reason: collision with root package name */
        public Map<String, String> f156296c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        public e f156297d;

        static {
            Covode.recordClassIndex(103798);
        }

        public final d a() {
            return new d(this);
        }

        public final String a(String str) {
            l.c(str, "");
            return this.f156296c.get(str);
        }

        public final a a(String str, String str2) {
            l.c(str, "");
            l.c(str2, "");
            this.f156296c.put(str, str2);
            return this;
        }
    }

    protected d(a aVar) {
        l.c(aVar, "");
        if (p.a((CharSequence) aVar.f156294a)) {
            throw new IllegalArgumentException("method is null or empty");
        } else if (!p.a((CharSequence) aVar.f156295b)) {
            this.f156290a = aVar.f156294a;
            this.f156291b = aVar.f156295b;
            this.f156292c = aVar.f156296c;
            this.f156293d = aVar.f156297d;
        } else {
            throw new IllegalArgumentException("version is null or empty");
        }
    }
}

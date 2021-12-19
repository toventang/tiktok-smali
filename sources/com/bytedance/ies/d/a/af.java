package com.bytedance.ies.d.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.ab;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.m.l;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;

public class af {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f33193a = {new y(ab.a(af.class), "hostRegMatcher", "getHostRegMatcher()Lkotlin/text/Regex;"), new y(ab.a(af.class), "hashRegMatcher", "getHashRegMatcher()Lkotlin/text/Regex;")};

    /* renamed from: b  reason: collision with root package name */
    public final String f33194b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33195c;

    /* renamed from: d  reason: collision with root package name */
    public final String f33196d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f33197e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f33198f;

    /* renamed from: g  reason: collision with root package name */
    private final h f33199g;

    /* renamed from: h  reason: collision with root package name */
    private final h f33200h;

    private final l a() {
        return (l) this.f33199g.getValue();
    }

    private final l b() {
        return (l) this.f33200h.getValue();
    }

    static final class a extends m implements h.f.a.a<l> {
        final /* synthetic */ af this$0;

        static {
            Covode.recordClassIndex(19828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(af afVar) {
            super(0);
            this.this$0 = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l invoke() {
            String str = this.this$0.f33196d;
            if (str == null) {
                str = ".*?";
            }
            return new l(str);
        }
    }

    static final class b extends m implements h.f.a.a<l> {
        final /* synthetic */ af this$0;

        static {
            Covode.recordClassIndex(19829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(af afVar) {
            super(0);
            this.this$0 = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l invoke() {
            String str = this.this$0.f33195c;
            if (str == null) {
                str = ".*?";
            }
            return new l(str);
        }
    }

    static {
        Covode.recordClassIndex(19827);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f33201a = new c();

        static {
            Covode.recordClassIndex(19830);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(String str) {
            String str2 = str;
            h.f.b.l.c(str2, "");
            Locale locale = Locale.ROOT;
            h.f.b.l.a((Object) locale, "");
            String lowerCase = str2.toLowerCase(locale);
            h.f.b.l.a((Object) lowerCase, "");
            return lowerCase;
        }
    }

    private final boolean a(String str) {
        if (TextUtils.isEmpty(this.f33195c)) {
            return true;
        }
        return a().matches(str);
    }

    private final boolean b(String str) {
        if (TextUtils.isEmpty(this.f33196d)) {
            return true;
        }
        return b().matches(str);
    }

    private final boolean a(SortedMap<String, String> sortedMap) {
        if (this.f33197e == null) {
            return true;
        }
        if (sortedMap.size() < this.f33197e.size()) {
            return false;
        }
        for (Map.Entry<String, String> entry : this.f33197e.entrySet()) {
            if (sortedMap.containsKey(entry.getKey())) {
                String value = entry.getValue();
                if (value.length() != 0) {
                    l lVar = new l(value);
                    String str = sortedMap.get(entry.getKey());
                    if (str == null) {
                        str = "";
                    }
                    if (!lVar.matches(str)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final List<String> a(aj ajVar) {
        h.f.b.l.c(ajVar, "");
        if (TextUtils.isEmpty(this.f33195c) && TextUtils.isEmpty(this.f33196d) && this.f33197e == null) {
            a(null, ajVar);
            return this.f33198f;
        } else if (!a(ajVar.b()) || !b(ajVar.d()) || !a(ajVar.c())) {
            return null;
        } else {
            a(null, ajVar);
            return this.f33198f;
        }
    }

    private final void a(String str, aj ajVar) {
        q.b("[scheme:" + ajVar.f33213b + "] matchRule:" + this.f33194b + " matchApis:" + n.a(this.f33198f, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, c.f33201a, 31));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public af(java.lang.String r7, org.json.JSONObject r8) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            r1 = r7
            h.f.b.l.c(r1, r0)
            h.f.b.l.c(r8, r0)
            java.lang.String r0 = "host"
            r4 = 0
            java.lang.String r2 = r8.optString(r0, r4)
            java.lang.String r0 = "hash"
            java.lang.String r3 = r8.optString(r0, r4)
            java.lang.String r0 = "query"
            org.json.JSONArray r0 = r8.optJSONArray(r0)
            if (r0 == 0) goto L_0x0022
            java.util.Map r4 = com.bytedance.ies.d.a.ak.b(r0)
        L_0x0022:
            java.lang.String r0 = "prefetch_apis"
            org.json.JSONArray r0 = r8.getJSONArray(r0)
            java.util.List r5 = com.bytedance.ies.d.a.ak.a(r0)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.d.a.af.<init>(java.lang.String, org.json.JSONObject):void");
    }

    private af(String str, String str2, String str3, Map<String, String> map, List<String> list) {
        this.f33194b = str;
        this.f33195c = str2;
        this.f33196d = str3;
        this.f33197e = map;
        this.f33198f = list;
        this.f33199g = h.i.a((h.f.a.a) new b(this));
        this.f33200h = h.i.a((h.f.a.a) new a(this));
    }
}

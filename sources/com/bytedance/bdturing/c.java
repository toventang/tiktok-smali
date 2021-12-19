package com.bytedance.bdturing;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

public final class c {
    public boolean A;
    public int B;
    public String C;
    public boolean D;
    public String E;
    public String F;
    public f G;
    private HashMap<Integer, Pair<String, String>> H;

    /* renamed from: a  reason: collision with root package name */
    public b f26406a;

    /* renamed from: b  reason: collision with root package name */
    public String f26407b;

    /* renamed from: c  reason: collision with root package name */
    public String f26408c;

    /* renamed from: d  reason: collision with root package name */
    public String f26409d;

    /* renamed from: e  reason: collision with root package name */
    public String f26410e;

    /* renamed from: f  reason: collision with root package name */
    public String f26411f;

    /* renamed from: g  reason: collision with root package name */
    public String f26412g;

    /* renamed from: h  reason: collision with root package name */
    public String f26413h;

    /* renamed from: i  reason: collision with root package name */
    public String f26414i;

    /* renamed from: j  reason: collision with root package name */
    public String f26415j;

    /* renamed from: k  reason: collision with root package name */
    public String f26416k;

    /* renamed from: l  reason: collision with root package name */
    public String f26417l;

    /* renamed from: m  reason: collision with root package name */
    public String f26418m;
    public String n;
    public Context o;
    public String p;
    public boolean q;
    JSONObject r;
    JSONObject s;
    JSONObject t;
    public d u;
    public com.bytedance.bdturing.d.a v;
    public com.bytedance.bdturing.twiceverify.b w;
    public boolean x;
    public String y;
    public String z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public b f26419a = b.REGION_CN;

        /* renamed from: b  reason: collision with root package name */
        public String f26420b;

        /* renamed from: c  reason: collision with root package name */
        public String f26421c;

        /* renamed from: d  reason: collision with root package name */
        public String f26422d;

        /* renamed from: e  reason: collision with root package name */
        public String f26423e;

        /* renamed from: f  reason: collision with root package name */
        public String f26424f = "";

        /* renamed from: g  reason: collision with root package name */
        public String f26425g;

        /* renamed from: h  reason: collision with root package name */
        public Context f26426h;

        /* renamed from: i  reason: collision with root package name */
        public String f26427i;

        /* renamed from: j  reason: collision with root package name */
        public String f26428j;

        /* renamed from: k  reason: collision with root package name */
        public String f26429k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f26430l = true;

        /* renamed from: m  reason: collision with root package name */
        public boolean f26431m = true;
        public d n;
        public com.bytedance.bdturing.d.a o;
        public com.bytedance.bdturing.twiceverify.b p;
        public String q;
        public String r;
        public f s;

        static {
            Covode.recordClassIndex(15539);
        }
    }

    static {
        Covode.recordClassIndex(15538);
    }

    public enum b {
        REGION_CN("cn"),
        REGION_SINGAPOER("sg"),
        REGION_USA_EAST("va"),
        REGION_INDIA("in"),
        REGION_BOE("boe");
        
        private String mName;

        public final String getName() {
            return this.mName;
        }

        static {
            Covode.recordClassIndex(15540);
        }

        private b(String str) {
            this.mName = str;
        }
    }

    public final Pair<String, String> a() {
        return this.H.get(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b() {
        /*
            r3 = this;
            java.lang.String r2 = ""
            java.lang.String r1 = r3.p
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0017, all -> 0x0015 }
            if (r0 == 0) goto L_0x0012
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0017, all -> 0x0015 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0017, all -> 0x0015 }
        L_0x0012:
            if (r1 != 0) goto L_0x001a
            goto L_0x0019
        L_0x0015:
            r0 = move-exception
            throw r0
        L_0x0017:
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            return r2
        L_0x001a:
            r2 = r1
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.c.b():java.lang.String");
    }

    public final c a(b bVar) {
        this.f26406a = bVar;
        return this;
    }

    private c(a aVar) {
        String str;
        String str2;
        String[] split;
        this.f26411f = "2.2.1.i18n";
        this.f26415j = "Android";
        this.f26416k = new StringBuilder().append(Build.VERSION.SDK_INT).toString();
        this.f26418m = Build.BRAND;
        this.n = Build.MODEL;
        this.H = new HashMap<>();
        this.r = null;
        this.s = null;
        this.t = null;
        this.y = null;
        this.z = null;
        this.A = true;
        this.C = null;
        this.D = false;
        this.G = null;
        this.f26406a = aVar.f26419a;
        this.f26407b = aVar.f26420b;
        this.f26408c = aVar.f26421c;
        this.f26409d = aVar.f26422d;
        this.f26410e = aVar.f26423e;
        this.f26412g = aVar.f26424f;
        this.f26414i = aVar.f26425g;
        Locale locale = Locale.getDefault();
        if (TextUtils.isEmpty(aVar.q)) {
            str = locale.toString();
        } else {
            str = aVar.q;
        }
        this.p = str;
        this.u = aVar.n;
        this.v = aVar.o;
        this.w = aVar.p;
        this.G = aVar.s;
        if (TextUtils.isEmpty(aVar.q) && (str2 = this.p) != null && (split = str2.split("_")) != null && split.length > 2) {
            this.p = split[0] + "_" + split[1];
        }
        try {
            this.f26418m = URLEncoder.encode(Build.BRAND, "utf-8");
            this.n = URLEncoder.encode(Build.MODEL, "utf-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        this.f26413h = aVar.f26427i;
        this.f26417l = aVar.f26428j;
        this.E = aVar.f26429k;
        this.F = aVar.r;
        this.o = aVar.f26426h;
        this.q = aVar.f26430l;
        this.x = aVar.f26431m;
    }

    public /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }
}

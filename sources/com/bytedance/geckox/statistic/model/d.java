package com.bytedance.geckox.statistic.model;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.HashMap;
import java.util.Map;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public int f30098a;

    /* renamed from: b  reason: collision with root package name */
    public int f30099b;

    /* renamed from: c  reason: collision with root package name */
    public int f30100c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f30101d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f30102e;

    /* renamed from: f  reason: collision with root package name */
    public long f30103f;

    /* renamed from: g  reason: collision with root package name */
    public long f30104g;

    /* renamed from: h  reason: collision with root package name */
    public long f30105h;

    /* renamed from: i  reason: collision with root package name */
    public long f30106i;

    /* renamed from: j  reason: collision with root package name */
    public long f30107j;

    /* renamed from: k  reason: collision with root package name */
    public long f30108k;

    /* renamed from: l  reason: collision with root package name */
    public long f30109l;

    /* renamed from: m  reason: collision with root package name */
    public long f30110m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public Map<String, a> u = new HashMap();

    static {
        Covode.recordClassIndex(17479);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f30111a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f30112b;

        /* renamed from: c  reason: collision with root package name */
        public int f30113c;

        /* renamed from: d  reason: collision with root package name */
        public String f30114d;

        /* renamed from: e  reason: collision with root package name */
        public String f30115e;

        /* renamed from: f  reason: collision with root package name */
        public int f30116f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f30117g;

        /* renamed from: h  reason: collision with root package name */
        public long f30118h = SystemClock.uptimeMillis();

        static {
            Covode.recordClassIndex(17480);
        }

        public a(String str) {
            this.f30111a = str;
        }
    }

    private a a(String str, boolean z) {
        a aVar = this.u.get(str);
        if (aVar == null) {
            aVar = new a(str);
            this.u.put(str, aVar);
            if (!z) {
                aVar.f30117g = true;
                com.bytedance.geckox.i.a.b();
            }
        }
        return aVar;
    }

    public final a a(UpdatePackage updatePackage, boolean z) {
        if (updatePackage.getZstdFallback()) {
            return a("fallback_", z);
        }
        if (updatePackage.getUpdateWithPatch()) {
            return a("patch_", z);
        }
        return a("full_", z);
    }
}

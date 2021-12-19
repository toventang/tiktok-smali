package com.ss.android.ml.process;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.a.a;
import com.ss.android.ml.process.a.b;
import com.ss.android.ml.process.a.c;
import com.ss.android.ml.process.a.d;
import com.ss.android.ml.process.a.e;
import com.ss.android.ml.process.a.g;
import com.ss.android.ml.process.a.h;
import com.ss.android.ml.process.a.i;
import com.ss.android.ml.process.a.j;
import com.ss.android.ml.process.a.k;
import com.ss.android.ml.process.a.l;
import com.ss.android.ml.process.a.m;
import com.ss.android.ml.process.a.n;
import java.util.HashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static f f59909a = new f();

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, e> f59910b;

    static {
        Covode.recordClassIndex(37032);
    }

    public f() {
        HashMap<String, e> hashMap = new HashMap<>();
        this.f59910b = hashMap;
        hashMap.put("log", new e());
        this.f59910b.put("log1p", new d());
        this.f59910b.put("sigmoid", new m());
        this.f59910b.put("div", new a());
        this.f59910b.put("max", new com.ss.android.ml.process.a.f());
        this.f59910b.put("min", new g());
        this.f59910b.put("normalize", new h());
        this.f59910b.put("standardize", new n());
        this.f59910b.put("predict_regression", new l());
        this.f59910b.put("predict_bin", new j());
        this.f59910b.put("onehotEncode", new i());
        this.f59910b.put("predict_multi", new k());
        this.f59910b.put("embedding", new b());
        this.f59910b.put("embedding_vector", new c());
    }

    public final e a(String str) {
        return this.f59910b.get(str);
    }
}

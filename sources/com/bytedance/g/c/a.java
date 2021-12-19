package com.bytedance.g.c;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public String f29664a;

    /* renamed from: b  reason: collision with root package name */
    public double f29665b;

    /* renamed from: c  reason: collision with root package name */
    public b<T>[] f29666c;

    /* renamed from: d  reason: collision with root package name */
    public String f29667d;

    /* renamed from: e  reason: collision with root package name */
    public String[] f29668e;

    /* renamed from: f  reason: collision with root package name */
    public List<Pair<String, Float>> f29669f = new ArrayList();

    static {
        Covode.recordClassIndex(17227);
    }

    public a(String str, String str2, String[] strArr, b<T>... bVarArr) {
        this.f29664a = str;
        this.f29665b = 0.0d;
        this.f29667d = str2;
        this.f29668e = strArr;
        this.f29666c = bVarArr;
        for (b<T> bVar : bVarArr) {
            this.f29669f.add(new Pair<>(bVar.f29670a, Double.valueOf(bVar.f29671b)));
        }
    }
}

package com.bytedance.common.wschannel.channel.a.a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.m;
import com.bytedance.common.wschannel.channel.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Response;

/* access modifiers changed from: package-private */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f27159a;

    /* renamed from: b  reason: collision with root package name */
    private b f27160b;

    /* renamed from: c  reason: collision with root package name */
    private int f27161c;

    /* renamed from: d  reason: collision with root package name */
    private String f27162d;

    static {
        Covode.recordClassIndex(16006);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        MethodCollector.i(8342);
        this.f27160b.c();
        this.f27162d = null;
        this.f27161c = 0;
        MethodCollector.o(8342);
    }

    private synchronized String c() {
        MethodCollector.i(8341);
        int i2 = this.f27161c + 1;
        this.f27161c = i2;
        if (this.f27159a.size() > i2) {
            String str = this.f27159a.get(i2);
            this.f27162d = str;
            MethodCollector.o(8341);
            return str;
        }
        MethodCollector.o(8341);
        return "";
    }

    public final synchronized String b() {
        String str;
        int i2;
        MethodCollector.i(8528);
        if (m.a(this.f27162d) && this.f27159a.size() > (i2 = this.f27161c)) {
            this.f27162d = this.f27159a.get(i2);
        }
        str = this.f27162d;
        MethodCollector.o(8528);
        return str;
    }

    /* access modifiers changed from: package-private */
    public final synchronized Pair<String, Long> a(Response response) {
        Pair<String, Long> pair;
        MethodCollector.i(8339);
        String b2 = b();
        long a2 = this.f27160b.a(response);
        if (a2 == -1) {
            this.f27160b.c();
            b2 = c();
            if (!TextUtils.isEmpty(b2)) {
                a2 = this.f27160b.b();
            }
        }
        pair = new Pair<>(b2, Long.valueOf(a2));
        MethodCollector.o(8339);
        return pair;
    }

    c(List<String> list, b bVar) {
        ArrayList arrayList = new ArrayList();
        this.f27159a = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f27160b = bVar;
        a();
    }
}

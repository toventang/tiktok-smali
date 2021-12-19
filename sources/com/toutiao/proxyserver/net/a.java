package com.toutiao.proxyserver.net;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.l;
import com.bytedance.retrofit2.u;
import com.toutiao.proxyserver.e.c;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b<?> f154918a;

    /* renamed from: b  reason: collision with root package name */
    public final d f154919b;

    /* renamed from: c  reason: collision with root package name */
    public e f154920c;

    /* renamed from: d  reason: collision with root package name */
    public long f154921d;

    /* renamed from: e  reason: collision with root package name */
    public long f154922e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f154923f;

    /* renamed from: g  reason: collision with root package name */
    private final Call f154924g;

    static {
        Covode.recordClassIndex(103167);
    }

    public final void b() {
        b<?> bVar = this.f154918a;
        if (bVar != null) {
            bVar.cancel();
            return;
        }
        Call call = this.f154924g;
        if (call != null) {
            call.cancel();
        }
    }

    public final e a() {
        if (this.f154918a != null) {
            this.f154921d = System.currentTimeMillis();
            try {
                u<?> execute = this.f154918a.execute();
                this.f154922e = System.currentTimeMillis();
                e eVar = new e(execute, this.f154919b);
                this.f154920c = eVar;
                return eVar;
            } catch (IOException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        } else if (this.f154924g == null) {
            return null;
        } else {
            try {
                this.f154921d = System.currentTimeMillis();
                Response execute2 = this.f154924g.execute();
                this.f154922e = System.currentTimeMillis();
                e eVar2 = new e(execute2, this.f154919b);
                this.f154920c = eVar2;
                return eVar2;
            } catch (Exception e4) {
                if (!"Canceled".equalsIgnoreCase(e4.getMessage())) {
                    long currentTimeMillis = System.currentTimeMillis();
                    f fVar = new f();
                    fVar.f28917e = this.f154921d;
                    fVar.f28920h = currentTimeMillis;
                    long j2 = this.f154921d;
                    e.a(currentTimeMillis - j2, j2, this.f154919b.f154932a, "", fVar, e4);
                    c.d("HttpCall", "api_error, from okhttp connect: , netInfo: " + fVar + ", url: " + this.f154919b.f154932a + ", error: " + e4.getMessage(), null);
                }
                throw e4;
            }
        }
    }

    public final String a(Exception exc) {
        e eVar;
        String str;
        if (!(this.f154918a == null || (eVar = this.f154920c) == null)) {
            try {
                if (eVar.f154947d != null || !(exc instanceof com.bytedance.frameworks.baselib.network.http.cronet.b.c)) {
                    str = null;
                } else {
                    str = ((com.bytedance.frameworks.baselib.network.http.cronet.b.c) exc).getRequestLog();
                }
                if (!TextUtils.isEmpty(str) || this.f154920c.f154947d == null) {
                    return str;
                }
                b<?> bVar = this.f154918a;
                if (!(bVar instanceof l)) {
                    return str;
                }
                ((l) bVar).doCollect();
                Object obj = this.f154920c.f154947d.f42629a.f42478f;
                if (obj instanceof com.bytedance.ttnet.d.b) {
                    return ((com.bytedance.ttnet.d.b) obj).y;
                }
                return str;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    a(b<?> bVar, d dVar) {
        this.f154918a = bVar;
        this.f154919b = dVar;
    }

    a(Call call, d dVar) {
        this.f154924g = call;
        this.f154919b = dVar;
    }
}

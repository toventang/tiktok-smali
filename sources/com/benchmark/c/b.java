package com.benchmark.c;

import android.content.Context;
import com.benchmark.port.nativePort.ApplogUtilsInvoker;
import com.benchmark.port.nativePort.LogcatInvoker;
import com.benchmark.tools.a;
import com.benchmark.tools.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.d.a.l;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import org.json.JSONObject;

public final class b {

    /* renamed from: l  reason: collision with root package name */
    public static volatile b f6095l = new b();

    /* renamed from: a  reason: collision with root package name */
    public Context f6096a;

    /* renamed from: b  reason: collision with root package name */
    public String f6097b;

    /* renamed from: c  reason: collision with root package name */
    public int f6098c;

    /* renamed from: d  reason: collision with root package name */
    public int f6099d;

    /* renamed from: e  reason: collision with root package name */
    public String f6100e;

    /* renamed from: f  reason: collision with root package name */
    public String f6101f;

    /* renamed from: g  reason: collision with root package name */
    public long f6102g;

    /* renamed from: h  reason: collision with root package name */
    public String f6103h;

    /* renamed from: i  reason: collision with root package name */
    public String f6104i;

    /* renamed from: j  reason: collision with root package name */
    public byte f6105j = 7;

    /* renamed from: k  reason: collision with root package name */
    public String f6106k;

    /* renamed from: m  reason: collision with root package name */
    private AtomicBoolean f6107m = new AtomicBoolean(false);
    private boolean n = true;
    private boolean o = true;
    private String p;
    private boolean q = true;

    static {
        Covode.recordClassIndex(2961);
        a.a();
        if (!a.f6364a) {
            a.a();
        }
    }

    private b() {
    }

    public final boolean a() {
        MethodCollector.i(1434);
        if (!com.benchmark.port.b.a()) {
            MethodCollector.o(1434);
            return false;
        } else if (this.f6107m.get()) {
            MethodCollector.o(1434);
            return true;
        } else {
            synchronized (this) {
                try {
                    if (!this.f6107m.get()) {
                        com.benchmark.a aVar = com.benchmark.port.b.f6323a;
                        if (aVar == null) {
                            return false;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        this.f6096a = aVar.f5999a;
                        this.f6097b = aVar.f6001c;
                        this.f6098c = aVar.f6002d;
                        this.f6099d = aVar.f6003e;
                        this.f6100e = aVar.f6004f;
                        this.f6101f = aVar.f6005g;
                        this.f6102g = aVar.f6006h;
                        this.f6103h = aVar.f6007i;
                        this.f6104i = aVar.f6008j;
                        this.f6105j = aVar.f6009k;
                        this.o = aVar.f6010l;
                        this.f6106k = aVar.f6011m;
                        this.p = aVar.f6000b;
                        KevaBuilder.getInstance().setContext(this.f6096a);
                        Keva.forceInit();
                        com.benchmark.netUtils.a a2 = com.benchmark.netUtils.a.a();
                        a2.f6308b = this.p;
                        a2.f6307a = RetrofitUtils.b(a2.f6308b);
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        builder.connectTimeout(60000, TimeUnit.MILLISECONDS);
                        builder.readTimeout(60000, TimeUnit.MILLISECONDS);
                        builder.retryOnConnectionFailure(true);
                        builder.addNetworkInterceptor(new l());
                        builder.protocols(Collections.singletonList(Protocol.HTTP_1_1));
                        a2.f6309c = builder.build();
                        f.a("ByteBench", this.f6105j);
                        LogcatInvoker.a(this.f6105j);
                        ApplogUtilsInvoker.nativeInit();
                        com.benchmark.strategy.a aVar2 = com.benchmark.strategy.a.f6346b;
                        String str = this.f6106k;
                        com.benchmark.bytemonitor.a.a(this.f6096a);
                        com.benchmark.bytemonitor.a.a();
                        aVar2.f6347a.init(str);
                        com.benchmark.strategy.a aVar3 = com.benchmark.strategy.a.f6346b;
                        aVar3.f6347a.isOpenRuntimeDecision(this.o);
                        com.benchmark.d.b bVar = com.benchmark.d.b.f6186a;
                        synchronized (bVar.f6189d) {
                            try {
                                bVar.f6187b.set(false);
                                bVar.f6189d.notifyAll();
                            } catch (Throwable th) {
                                MethodCollector.o(1434);
                                throw th;
                            }
                        }
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("cost_time", currentTimeMillis2);
                            com.benchmark.a.a.a("bytebench_init", jSONObject);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        this.f6107m.set(true);
                    }
                    MethodCollector.o(1434);
                    return true;
                } finally {
                    MethodCollector.o(1434);
                }
            }
        }
    }
}

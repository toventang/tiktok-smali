package com.bytedance.frameworks.baselib.network.http.d.a.a;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.d.a.a.a;
import com.bytedance.frameworks.baselib.network.http.d.a.a.a.c;
import com.bytedance.frameworks.baselib.network.http.d.a.a.b;
import com.bytedance.frameworks.baselib.network.http.d.a.f;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static String f29131a = e.class.getSimpleName();

    /* renamed from: l  reason: collision with root package name */
    static HandlerThread f29132l;

    /* renamed from: m  reason: collision with root package name */
    public static WeakHandler f29133m;
    private static ExecutorService n;
    private static volatile e o;
    private static String q;

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f29134b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public volatile String f29135c;

    /* renamed from: d  reason: collision with root package name */
    public ConcurrentSkipListSet<String> f29136d = new ConcurrentSkipListSet<>();

    /* renamed from: e  reason: collision with root package name */
    public ConcurrentSkipListSet<String> f29137e = new ConcurrentSkipListSet<>();

    /* renamed from: f  reason: collision with root package name */
    public AtomicInteger f29138f = new AtomicInteger(30);

    /* renamed from: g  reason: collision with root package name */
    public AtomicInteger f29139g = new AtomicInteger(LiveNetAdaptiveHurryTimeSetting.DEFAULT);

    /* renamed from: h  reason: collision with root package name */
    public AtomicInteger f29140h = new AtomicInteger(60);

    /* renamed from: i  reason: collision with root package name */
    public final f f29141i = new f();

    /* renamed from: j  reason: collision with root package name */
    public volatile h f29142j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f29143k = false;
    private AtomicBoolean p = new AtomicBoolean(true);
    private ConcurrentMap<String, CopyOnWriteArrayList<String>> r = new ConcurrentHashMap();
    private AtomicInteger s = new AtomicInteger(0);
    private AtomicInteger t = new AtomicInteger(5);
    private AtomicInteger u = new AtomicInteger(5);
    private final d v;
    private Handler w = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.frameworks.baselib.network.http.d.a.a.e.AnonymousClass1 */

        static {
            Covode.recordClassIndex(17051);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message != null && (message.obj instanceof e)) {
                Bundle data = message.getData();
                data.getSerializable("callback_dnsresult_key");
                if (data.getSerializable("callback_dnsresult_job_key") != null) {
                    int i2 = message.what;
                }
            }
        }
    };

    public final synchronized void a(a.EnumC0624a aVar) {
        MethodCollector.i(5219);
        ConcurrentSkipListSet<String> concurrentSkipListSet = this.f29137e;
        if (concurrentSkipListSet == null || concurrentSkipListSet.size() == 0 || this.f29137e.size() > 10) {
            MethodCollector.o(5219);
            return;
        }
        Iterator<String> it = this.f29137e.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            String next = it.next();
            if (!this.v.d(next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == 0) {
            MethodCollector.o(5219);
            return;
        }
        a((List<String>) arrayList, aVar, false);
        MethodCollector.o(5219);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("ttnet_http_dns_enabled", -1);
            boolean z = false;
            if (optInt >= 0) {
                this.p.set(optInt == 1);
            }
            String optString = jSONObject.optString("ttnet_tt_http_dns_domain");
            if (!TextUtils.isEmpty(optString)) {
                this.f29135c = optString;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("ttnet_tt_http_dns_preload_batch_host");
            if (optJSONArray != null) {
                this.f29137e.clear();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    String optString2 = optJSONArray.optString(i2);
                    if (!TextUtils.isEmpty(optString2)) {
                        this.f29137e.add(optString2);
                    }
                }
            }
            int optInt2 = jSONObject.optInt("localdns_cache_ttl", -1);
            if (optInt2 >= 0) {
                this.f29138f.set(optInt2);
            }
            int optInt3 = jSONObject.optInt("httpdns_prefer_time_ms", -1);
            if (optInt3 >= 0) {
                this.f29139g.set(optInt3);
            }
            int optInt4 = jSONObject.optInt("httpdns_stale_cache_interval", -1);
            if (optInt4 >= 0) {
                this.f29140h.set(optInt4);
            }
            int optInt5 = jSONObject.optInt("enable_compare_localdns_httpdns", -1);
            if (optInt5 >= 0) {
                this.s.set(optInt5);
            }
            int optInt6 = jSONObject.optInt("ttnet_http_dns_prefer", -1);
            if (optInt6 >= 0) {
                AtomicBoolean atomicBoolean = this.f29134b;
                if (optInt6 == 1) {
                    z = true;
                }
                atomicBoolean.set(z);
            }
            int optInt7 = jSONObject.optInt("ttnet_http_dns_timeout", -1);
            if (optInt7 >= 0) {
                this.t.set(optInt7);
            }
            int optInt8 = jSONObject.optInt("ttnet_local_dns_time_out", -1);
            if (optInt8 >= 0) {
                this.u.set(optInt8);
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("ttnet_http_dns_addr");
            if (optJSONObject != null) {
                this.r.clear();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString3 = optJSONObject.optString(next);
                    if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString3)) {
                        String[] split = optString3.split(",");
                        if (next.equals(this.f29135c)) {
                            this.f29136d.clear();
                            this.f29136d.addAll(Arrays.asList(split));
                        } else {
                            this.r.put(next, new CopyOnWriteArrayList<>(Arrays.asList(split)));
                        }
                    }
                }
            }
        }
    }

    private void a(c cVar, b bVar) {
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 1;
        Bundle bundle = new Bundle();
        bundle.putSerializable("callback_dnsresult_job_key", cVar);
        bundle.putSerializable("callback_dnsresult_key", bVar);
        obtain.setData(bundle);
        this.w.sendMessage(obtain);
    }

    /* access modifiers changed from: package-private */
    public final void a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            this.f29136d.clear();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String optString = jSONArray.optString(i2);
                if (!TextUtils.isEmpty(optString)) {
                    this.f29136d.add(optString);
                }
            }
            SharedPreferences.Editor edit = d.a(this.f29142j.a(), "dispatchersdk_httpdns_hardcodeips", 0).edit();
            edit.putString("httpdns_hardcodeips", String.valueOf(jSONArray));
            edit.apply();
        }
    }

    public final b a(String str) {
        boolean z;
        b bVar;
        Future<Void> f2;
        if (this.f29143k && this.p.get() && com.bytedance.frameworks.baselib.network.http.d.a.a.a.a.a(str) && !c.b(str) && !c.a(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        boolean equals = str.equals(this.f29135c);
        if (!this.f29134b.get() || equals) {
            b b2 = b(str, false);
            if (b2 != null) {
                return b2;
            }
            if (this.v.g(str)) {
                f2 = this.v.h(str);
            } else {
                f2 = f(str);
            }
            if (f2 == null) {
                b a2 = a(str, equals);
                if (a2 == null) {
                    return b(str);
                }
                return a2;
            } else if (f2.isDone()) {
                bVar = b(str, true);
                if (bVar == null) {
                    bVar = a(str, equals);
                }
            } else {
                try {
                    f2.get(((long) this.u.get()) * 1000, TimeUnit.MILLISECONDS);
                    bVar = b(str, true);
                    if (bVar == null) {
                        bVar = a(str, equals);
                    }
                } catch (Exception unused) {
                    bVar = a(str, equals);
                }
            }
        } else {
            b c2 = c(str, false);
            if (c2 != null) {
                return c2;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(0, false);
            bVar = a(a(str, arrayList), str, arrayList.get(0).booleanValue());
        }
        if (bVar == null) {
            return b(str);
        }
        return bVar;
    }

    public static void b() {
        try {
            n.submit(new i());
        } catch (RejectedExecutionException e2) {
            e2.printStackTrace();
        }
    }

    static {
        Covode.recordClassIndex(17050);
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 6;
        n = g.a(a2.a());
    }

    public static e a() {
        MethodCollector.i(5103);
        if (o == null) {
            synchronized (e.class) {
                try {
                    if (o == null) {
                        o = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5103);
                    throw th;
                }
            }
        }
        e eVar = o;
        MethodCollector.o(5103);
        return eVar;
    }

    private e() {
        HandlerThread handlerThread = new HandlerThread("TTOK-HTTPDNS");
        f29132l = handlerThread;
        handlerThread.start();
        f29133m = new WeakHandler(f29132l.getLooper(), this);
        q = "4.0.71.7-tiktok";
        this.v = new d(f29133m);
    }

    private void d(String str) {
        if (com.bytedance.frameworks.baselib.network.http.d.a.a.a.a.a(str) && !this.v.d(str)) {
            this.v.a(str);
        }
    }

    private void e(String str) {
        d dVar;
        a c2;
        if (com.bytedance.frameworks.baselib.network.http.d.a.a.a.a.a(str) && (c2 = (dVar = this.v).c(str)) != null) {
            c2.c();
            dVar.f29120b.remove(str);
        }
    }

    private void c(String str) {
        if (com.bytedance.frameworks.baselib.network.http.d.a.a.a.a.a(str) && !this.v.d(str) && this.f29134b.get()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            a((List<String>) arrayList, a.EnumC0624a.CACHE_STALE_EXPIRED, false);
        }
    }

    private synchronized Future<Void> f(String str) {
        MethodCollector.i(5495);
        if (this.v.g(str)) {
            Future<Void> h2 = this.v.h(str);
            MethodCollector.o(5495);
            return h2;
        }
        Future<Void> future = null;
        try {
            future = n.submit(new j(str, this.v, f29133m));
            this.v.f29122d.put(str, future);
        } catch (RejectedExecutionException e2) {
            e2.printStackTrace();
        }
        MethodCollector.o(5495);
        return future;
    }

    private b b(String str) {
        if (!this.r.containsKey(str)) {
            return null;
        }
        b bVar = new b();
        Iterator<String> it = this.r.get(str).iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (c.a(next)) {
                bVar.ipv6List.add(next);
            } else if (c.b(next)) {
                bVar.ipv4List.add(next);
            }
        }
        bVar.source = b.a.HARDCODE_IPS;
        return bVar;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message == null) {
            return;
        }
        if ((message.obj instanceof e) || (message.obj instanceof f) || (message.obj instanceof j) || (message.obj instanceof a) || (message.obj instanceof d)) {
            try {
                if ((message.obj instanceof e) && message.what == 2) {
                    c cVar = (c) message.getData().getSerializable("httpdns_timeout_job_key");
                    if (cVar != null) {
                        if (this.v.a(cVar)) {
                            a(cVar, b(cVar.getHost(), cVar.isLocalDnsExpired()));
                            this.v.b(cVar);
                        }
                    }
                } else if (!(message.obj instanceof f) || message.what != 3) {
                    if ((message.obj instanceof j) && message.what == 1) {
                        String string = message.getData().getString("localdns_completed_host");
                        if (string != null) {
                            if (this.v.f29124f.containsKey(string)) {
                                Iterator<c> it = this.v.f29124f.get(string).iterator();
                                while (it.hasNext()) {
                                    c next = it.next();
                                    b b2 = b(string, true);
                                    if (b2 == null) {
                                        b c2 = c(string, false);
                                        if (c2 == null) {
                                            a(next);
                                            this.v.a(next.getHost(), next);
                                        } else {
                                            a(next, c2);
                                        }
                                    } else {
                                        a(next, b2);
                                    }
                                    this.v.c(next);
                                }
                            }
                        }
                    } else if ((message.obj instanceof e) && message.what == 3) {
                        c cVar2 = (c) message.getData().getSerializable("dns_timeout_job_key");
                        if (cVar2 != null) {
                            d dVar = this.v;
                            if (dVar.f29124f.containsKey(cVar2.getHost()) && dVar.f29124f.get(cVar2.getHost()).contains(cVar2)) {
                                b c3 = c(cVar2.getHost(), false);
                                if (c3 != null) {
                                    a(cVar2, c3);
                                } else {
                                    if (!this.v.d(cVar2.getHost())) {
                                        a(cVar2);
                                    }
                                    this.v.a(cVar2.getHost(), cVar2);
                                }
                                this.v.c(cVar2);
                            }
                        }
                    } else if ((message.obj instanceof e) && message.what == 4) {
                        c cVar3 = (c) message.getData().getSerializable("dns_timeout_job_key");
                        if (cVar3 != null && this.v.a(cVar3)) {
                            a(cVar3, (b) null);
                            this.v.b(cVar3);
                        }
                    } else if ((message.obj instanceof e) && message.what == 5) {
                        String string2 = d.a(this.f29142j.a(), "dispatchersdk_httpdns_hardcodeips", 0).getString("httpdns_hardcodeips", "");
                        if (!TextUtils.isEmpty(string2)) {
                            this.f29136d.clear();
                            try {
                                JSONArray jSONArray = new JSONArray(string2);
                                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                    String optString = jSONArray.optString(i2);
                                    if (!TextUtils.isEmpty(optString)) {
                                        this.f29136d.add(optString);
                                    }
                                }
                            } catch (JSONException unused) {
                            }
                        } else if (this.f29142j.e() != null && this.f29136d.size() == 0) {
                            this.f29136d.addAll(Arrays.asList(this.f29142j.e()));
                        }
                    } else if ((message.obj instanceof e) && message.what == 6) {
                        this.v.a(a().f29142j.a());
                    } else if ((message.obj instanceof e) && message.what == 7) {
                        b();
                    } else if (message.obj instanceof a) {
                        String string3 = message.getData().getString("dnsrecord_host");
                        if (!TextUtils.isEmpty(string3)) {
                            switch (message.what) {
                                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                    a().c(string3);
                                    return;
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                    a().e(string3);
                                    return;
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                    d dVar2 = a().v;
                                    dVar2.f29125g.add(string3);
                                    if (dVar2.f29125g.size() >= 10) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.addAll(dVar2.f29125g);
                                        a().a((List<String>) arrayList, a.EnumC0624a.REFRESH_BATCH, false);
                                        return;
                                    }
                                    return;
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                    a().d(string3);
                                    return;
                                default:
                                    return;
                            }
                        }
                    } else if ((message.obj instanceof d) && message.what == 20) {
                        this.v.b();
                    }
                } else {
                    ArrayList<String> stringArrayList = message.getData().getStringArrayList("httpdns_completed_hosts");
                    if (stringArrayList != null) {
                        for (String str : stringArrayList) {
                            if (this.v.f29123e.containsKey(str)) {
                                Iterator<c> it2 = this.v.f29123e.get(str).iterator();
                                while (it2.hasNext()) {
                                    c next2 = it2.next();
                                    b c4 = c(str, true);
                                    if (a().f29134b.get() && c4 == null) {
                                        c4 = b(str, next2.isLocalDnsExpired());
                                    }
                                    a(next2, c4);
                                    this.v.b(next2);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    private void a(c cVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.getHost());
        a((List<String>) arrayList, a.EnumC0624a.CACHE_UNSET, false);
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = this;
        Bundle bundle = new Bundle();
        bundle.putSerializable("dns_timeout_job_key", cVar);
        obtain.setData(bundle);
        f29133m.sendMessageDelayed(obtain, ((long) this.t.get()) * 1000);
    }

    private b b(String str, boolean z) {
        b bVar = new b();
        a c2 = this.v.c(str);
        if (c2 == null) {
            return null;
        }
        bVar.ipv4List = c2.f29098b;
        bVar.ipv6List = c2.f29099c;
        if (z) {
            bVar.source = b.a.LOCALDNS_REQUEST;
        } else {
            bVar.source = b.a.LOCALDNS_CACHE;
        }
        return bVar;
    }

    private b a(String str, boolean z) {
        Future<Void> a2;
        b bVar = null;
        if (z) {
            return null;
        }
        if (this.v.d(str)) {
            a2 = this.v.f(str);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            a2 = a((List<String>) arrayList, a.EnumC0624a.CACHE_UNSET, true);
        }
        if (a2 == null) {
            return null;
        }
        if (a2.isDone()) {
            return c(str, true);
        }
        try {
            a2.get(((long) this.t.get()) * 1000, TimeUnit.MILLISECONDS);
            bVar = c(str, true);
            return bVar;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return bVar;
        }
    }

    private b c(String str, boolean z) {
        a b2 = this.v.b(str);
        if (b2 == null) {
            return null;
        }
        b bVar = new b();
        bVar.ipv4List = b2.f29098b;
        bVar.ipv6List = b2.f29099c;
        if (!z) {
            if ((b2.f29100d * 1000) + b2.f29101e > System.currentTimeMillis()) {
                bVar.source = b.a.HTTPDNS_CACHE;
            } else {
                bVar.source = b.a.HTTPDNS_STALE_CACHE;
            }
            return bVar;
        } else if ((b2.f29100d * 1000) + b2.f29101e <= System.currentTimeMillis()) {
            return null;
        } else {
            bVar.source = b.a.HTTPDNS_REQUEST;
            return bVar;
        }
    }

    private Future<Void> a(String str, List<Boolean> list) {
        Future<Void> a2;
        MethodCollector.i(5244);
        a c2 = this.v.c(str);
        if (c2 == null || c2.f29101e + (c2.f29100d * 1000) <= System.currentTimeMillis() + ((long) this.f29139g.get())) {
            list.set(0, true);
            if (!this.v.g(str)) {
                f(str);
            }
        }
        if (this.v.d(str)) {
            a2 = this.v.f(str);
        } else {
            synchronized (this) {
                try {
                    if (this.v.d(str)) {
                        a2 = this.v.f(str);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str);
                        a2 = a((List<String>) arrayList, a.EnumC0624a.CACHE_UNSET, true);
                    }
                } finally {
                    MethodCollector.o(5244);
                }
            }
        }
        return a2;
    }

    private b a(Future<Void> future, String str, boolean z) {
        if (future == null) {
            try {
                return b(str, z);
            } catch (InterruptedException unused) {
                return b(str, z);
            } catch (ExecutionException unused2) {
                return b(str, z);
            } catch (TimeoutException unused3) {
                return b(str, z);
            }
        } else if (future.isDone()) {
            b c2 = c(str, true);
            if (c2 == null) {
                return b(str, z);
            }
            return c2;
        } else {
            future.get((long) a().f29139g.get(), TimeUnit.MILLISECONDS);
            b c3 = c(str, true);
            if (c3 == null) {
                return b(str, z);
            }
            return c3;
        }
    }

    private synchronized Future<Void> a(List<String> list, a.EnumC0624a aVar, boolean z) {
        MethodCollector.i(5388);
        Future<Void> future = null;
        if (list.size() == 0) {
            MethodCollector.o(5388);
            return null;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (this.v.d(list.get(i2))) {
                if (z && list.size() == 1 && i2 == 0) {
                    future = this.v.f(list.get(i2));
                }
                list.remove(list.get(i2));
            }
        }
        if (list.size() == 0) {
            MethodCollector.o(5388);
            return future;
        }
        try {
            future = n.submit(new f(com.bytedance.frameworks.baselib.network.http.d.a.a.a.a.a(list), q, this.v, aVar, f29133m));
            for (String str : list) {
                this.v.f29121c.put(str, future);
                if (this.f29134b.get()) {
                    d dVar = this.v;
                    if (dVar.f29125g.contains(str)) {
                        dVar.f29125g.remove(str);
                    }
                }
            }
        } catch (RejectedExecutionException e2) {
            e2.printStackTrace();
        }
        MethodCollector.o(5388);
        return future;
    }
}

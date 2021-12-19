package com.bytedance.frameworks.baselib.network.http.d.a.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.d.a.b.a;
import com.bytedance.frameworks.baselib.network.http.g.e;
import com.bytedance.frameworks.baselib.network.http.g.f;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.ss.android.ugc.aweme.bf.d;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class k {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ boolean f29201h = true;

    /* renamed from: i  reason: collision with root package name */
    private static final String f29202i = k.class.getSimpleName();

    /* renamed from: j  reason: collision with root package name */
    private static volatile k f29203j;
    private static AtomicBoolean p = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public Context f29204a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicLong f29205b = new AtomicLong(0);

    /* renamed from: c  reason: collision with root package name */
    public AtomicInteger f29206c = new AtomicInteger(0);

    /* renamed from: d  reason: collision with root package name */
    public AtomicLong f29207d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    public ConcurrentMap<String, String> f29208e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    public String f29209f;

    /* renamed from: g  reason: collision with root package name */
    public String f29210g;

    /* renamed from: k  reason: collision with root package name */
    private AtomicBoolean f29211k = new AtomicBoolean(true);

    /* renamed from: l  reason: collision with root package name */
    private List<j> f29212l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private final ReentrantReadWriteLock f29213m = new ReentrantReadWriteLock();
    private List<c> n = new ArrayList();
    private final ReentrantReadWriteLock o = new ReentrantReadWriteLock();

    /* access modifiers changed from: package-private */
    public static class a implements Comparator<a> {
        static {
            Covode.recordClassIndex(17072);
        }

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            return aVar.f29172g - aVar2.f29172g;
        }
    }

    public final boolean c() {
        return this.f29212l.isEmpty();
    }

    public final boolean b() {
        if (!this.n.isEmpty()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(17071);
    }

    public static k a() {
        MethodCollector.i(1641);
        if (f29203j == null) {
            synchronized (k.class) {
                try {
                    if (f29203j == null) {
                        f29203j = new k();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1641);
                    throw th;
                }
            }
        }
        k kVar = f29203j;
        MethodCollector.o(1641);
        return kVar;
    }

    public final e a(l lVar) {
        if (i.b(lVar.f29214a) && this.f29211k.get()) {
            return b(lVar);
        }
        return null;
    }

    public static void a(Context context) {
        if (f.a(context) && !p.get()) {
            SharedPreferences a2 = d.a(context, "ttnet_tnc_config", 0);
            String string = a2.getString("tnc_config_str", null);
            String string2 = a2.getString("ttnet_tnc_etag", null);
            String string3 = a2.getString("ttnet_tnc_abtest", null);
            try {
                if (!TextUtils.isEmpty(string)) {
                    a().a(new JSONObject(string), 0, string2, string3, System.currentTimeMillis());
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            p.set(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: java.util.List<com.bytedance.frameworks.baselib.network.http.d.a.b.j> */
    /* JADX WARN: Multi-variable type inference failed */
    private void a(JSONObject jSONObject) {
        int optInt;
        JSONObject optJSONObject;
        String optString = jSONObject.optString("action");
        if (!TextUtils.isEmpty(optString) && (optInt = jSONObject.optInt("act_priority", -1)) >= 0 && (optJSONObject = jSONObject.optJSONObject("param")) != null) {
            String optString2 = jSONObject.optString("lifecycle");
            long j2 = 0;
            long j3 = -1;
            if ("".equals(optString2)) {
                j3 = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                if (e.a(optString2, arrayList) && arrayList.size() == 2) {
                    j2 = ((Long) arrayList.get(0)).longValue();
                    j3 = ((Long) arrayList.get(1)).longValue();
                } else {
                    j2 = -1;
                }
            }
            long optInt2 = (long) jSONObject.optInt("rule_id");
            String optString3 = jSONObject.optString("sign");
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("request_method");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    String optString4 = optJSONArray.optString(i2);
                    if (!TextUtils.isEmpty(optString4)) {
                        arrayList2.add(optString4);
                    }
                }
            }
            a a2 = a.a(optString, optJSONObject, optInt, j2, j3, optInt2, optString3, this.f29205b.get(), arrayList2, jSONObject.optInt("set_req_priority", optInt));
            if (a2 instanceof j) {
                this.f29212l.add(a2);
            }
        }
    }

    private e b(l lVar) {
        String str = lVar.f29214a;
        e eVar = new e();
        ArrayList<d> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0, str);
        this.f29213m.readLock().lock();
        Iterator<j> it = this.f29212l.iterator();
        String str2 = str;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a.EnumC0625a a2 = it.next().a(lVar, str2, arrayList2, arrayList);
            str2 = (String) arrayList2.get(0);
            if (a2 == a.EnumC0625a.DISPATCH_DROP) {
                if (!f29201h && ((String) arrayList2.get(0)).length() != 0) {
                    throw new AssertionError();
                }
            }
        }
        String str3 = (String) arrayList2.get(0);
        this.f29213m.readLock().unlock();
        ArrayList arrayList3 = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("origin_url", str);
            jSONObject.put("dispatched_url", str3);
            JSONArray jSONArray = new JSONArray();
            for (d dVar : arrayList) {
                if (dVar.f29184d) {
                    JSONObject jSONObject2 = new JSONObject();
                    arrayList3.add(Long.valueOf(dVar.f29182b));
                    jSONObject2.put("rule_id", dVar.f29182b);
                    jSONObject2.put("service_name", dVar.f29181a);
                    jSONObject2.put("priority", dVar.f29183c);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("action_info_list", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("dispatch", jSONObject);
            new JSONObject().put("dispatchersdk", jSONObject3);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        eVar.f29189b = arrayList3;
        eVar.f29188a = str3;
        eVar.f29190c = arrayList;
        return eVar;
    }

    public final String a(String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && !str.contains("/network/get_network") && !str.contains("/get_domains/v5") && !str.contains("/ies/speed")) {
            String str3 = null;
            try {
                URL url = new URL(str);
                str2 = url.getProtocol();
                try {
                    str3 = url.getHost();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2) && (("http".equals(str2) || "https".equals(str2)) && !TextUtils.isEmpty(str3))) {
                ConcurrentMap<String, String> concurrentMap = this.f29208e;
                if (concurrentMap == null || !concurrentMap.containsKey(str3)) {
                    Logger.debug();
                } else {
                    String str4 = this.f29208e.get(str3);
                    if (TextUtils.isEmpty(str4)) {
                        return str;
                    }
                    String str5 = str2 + "://" + str3;
                    String str6 = str2 + "://" + str4;
                    if (str.startsWith(str5)) {
                        return str.replaceFirst(str5, str6);
                    }
                    return str;
                }
            }
        }
        return str;
    }

    public final int a(String str, String str2) {
        Logger.debug();
        if (!i.b(str)) {
            Logger.debug();
            return 0;
        }
        this.o.readLock().lock();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, 0);
        Iterator<c> it = this.n.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Logger.debug();
            if (it.next().a(str, str2, arrayList) == a.EnumC0625a.DISPATCH_DELAY) {
                Logger.debug();
                break;
            }
        }
        this.o.readLock().unlock();
        return ((Integer) arrayList.get(0)).intValue();
    }

    /* JADX INFO: finally extract failed */
    public final void a(JSONObject jSONObject, int i2, String str, String str2, long j2) {
        int optInt;
        JSONObject optJSONObject;
        this.f29206c.set(i2);
        this.f29209f = str;
        this.f29210g = str2;
        this.f29207d.set(j2);
        JSONArray optJSONArray = jSONObject.optJSONArray("request_delay_actions");
        try {
            this.o.writeLock().lock();
            this.n.clear();
            boolean z = true;
            if (optJSONArray != null) {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                    if (!(optJSONObject2 == null || (optInt = optJSONObject2.optInt("act_priority", -1)) < 0 || (optJSONObject = optJSONObject2.optJSONObject("param")) == null)) {
                        String optString = optJSONObject2.optString("lifecycle");
                        long j3 = 0;
                        long j4 = -1;
                        if ("".equals(optString)) {
                            j4 = 0;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            if (e.a(optString, arrayList) && arrayList.size() == 2) {
                                j3 = ((Long) arrayList.get(0)).longValue();
                                j4 = ((Long) arrayList.get(1)).longValue();
                            } else {
                                j3 = -1;
                            }
                        }
                        a a2 = a.a("delay", optJSONObject, optInt, j3, j4, 0, "", this.f29205b.get(), null, 0);
                        if (a2 instanceof c) {
                            this.n.add((c) a2);
                        }
                    }
                }
            }
            if (!this.n.isEmpty()) {
                Collections.sort(this.n, new a());
            }
            this.o.writeLock().unlock();
            Logger.debug();
            int optInt2 = jSONObject.optInt("ttnet_url_dispatcher_enabled", -1);
            if (optInt2 >= 0) {
                AtomicBoolean atomicBoolean = this.f29211k;
                if (optInt2 != 1) {
                    z = false;
                }
                atomicBoolean.set(z);
            }
            long optInt3 = (long) jSONObject.optInt("ttnet_dispatch_actions_epoch", -1);
            if (optInt3 != this.f29205b.get()) {
                this.f29205b.set(optInt3);
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ttnet_dispatch_actions");
                if (optJSONArray2 != null) {
                    try {
                        this.f29213m.writeLock().lock();
                        this.f29212l.clear();
                        for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                            JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i4);
                            if (optJSONObject3 != null) {
                                a(optJSONObject3);
                            }
                        }
                        if (!this.f29212l.isEmpty()) {
                            Collections.sort(this.f29212l, new a());
                        }
                    } finally {
                        this.f29213m.writeLock().unlock();
                    }
                }
            }
        } catch (Throwable th) {
            this.o.writeLock().unlock();
            Logger.debug();
            throw th;
        }
    }
}

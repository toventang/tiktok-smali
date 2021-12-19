package com.bytedance.ttnet.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.d.a.e;
import com.bytedance.frameworks.baselib.network.http.f.b;
import com.bytedance.frameworks.baselib.network.http.g.h;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.retrofit2.u;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lancet.j;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.Request;
import org.json.JSONObject;

public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public static String f44624a;

    /* renamed from: e  reason: collision with root package name */
    private static c f44625e;

    /* renamed from: b  reason: collision with root package name */
    public b f44626b;

    /* renamed from: c  reason: collision with root package name */
    Handler f44627c = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.ttnet.f.c.AnonymousClass2 */

        static {
            Covode.recordClassIndex(27289);
        }

        public final void handleMessage(Message message) {
            boolean z;
            a aVar;
            if (message.what == 10000) {
                if (message.arg1 == 0) {
                    z = false;
                } else {
                    z = true;
                }
                c cVar = c.this;
                int i2 = message.arg2;
                if (i2 == 7) {
                    aVar = a.PORTRETRY;
                } else if (i2 == 10) {
                    aVar = a.TTREGION;
                } else if (i2 != 20) {
                    switch (i2) {
                        case -2:
                            aVar = a.TTRESUME;
                            break;
                        case -1:
                            aVar = a.TTHardCode;
                            break;
                        case 0:
                            aVar = a.TTCACHE;
                            break;
                        case 1:
                            aVar = a.TTSERVER;
                            break;
                        case 2:
                            aVar = a.TTERROR;
                            break;
                        case 3:
                            aVar = a.TTPOLL;
                            break;
                        case 4:
                            aVar = a.TTTNC;
                            break;
                        default:
                            aVar = a.TTSERVER;
                            break;
                    }
                } else {
                    aVar = a.TTCRONET;
                }
                cVar.a(z, aVar);
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private long f44628d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f44629f;

    /* renamed from: g  reason: collision with root package name */
    private Context f44630g;

    /* renamed from: h  reason: collision with root package name */
    private int f44631h;

    /* renamed from: i  reason: collision with root package name */
    private long f44632i;

    /* renamed from: j  reason: collision with root package name */
    private int f44633j;

    /* renamed from: k  reason: collision with root package name */
    private HashMap<String, Integer> f44634k = new HashMap<>();

    /* renamed from: l  reason: collision with root package name */
    private HashMap<String, Integer> f44635l = new HashMap<>();

    /* renamed from: m  reason: collision with root package name */
    private int f44636m = 0;
    private HashMap<String, Integer> n = new HashMap<>();
    private HashMap<String, Integer> o = new HashMap<>();
    private boolean p = true;

    static {
        Covode.recordClassIndex(27287);
    }

    private a b() {
        b bVar = this.f44626b;
        if (bVar != null) {
            return bVar.f44618b;
        }
        return null;
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            MethodCollector.i(9849);
            if (f44625e == null) {
                f44625e = new c();
            }
            cVar = f44625e;
            MethodCollector.o(9849);
        }
        return cVar;
    }

    private static boolean d() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean c2 = c();
        j.f107226e = c2;
        return c2;
    }

    private void e() {
        Logger.debug();
        this.f44633j = 0;
        this.f44634k.clear();
        this.f44635l.clear();
        this.f44636m = 0;
        this.n.clear();
        this.o.clear();
    }

    private c() {
    }

    public enum a {
        TTRESUME(-2),
        TTHardCode(-1),
        TTCACHE(0),
        TTSERVER(1),
        TTERROR(2),
        TTPOLL(3),
        TTTNC(4),
        PORTRETRY(7),
        TTREGION(10),
        TTCRONET(20);
        
        public final int mValue;

        static {
            Covode.recordClassIndex(27290);
        }

        private a(int i2) {
            this.mValue = i2;
        }
    }

    public final synchronized void a(Context context, boolean z) {
        MethodCollector.i(10184);
        if (!this.f44629f) {
            this.f44630g = context;
            this.p = z;
            this.f44626b = new b(context, z);
            if (z) {
                SharedPreferences a2 = d.a(this.f44630g, "ttnet_tnc_config", 0);
                this.f44631h = a2.getInt("tnc_probe_cmd", 0);
                this.f44632i = a2.getLong("tnc_probe_version", 0);
            }
            Logger.debug();
            this.f44629f = true;
        }
        MethodCollector.o(10184);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.d.a.e
    public final synchronized void a(Request request, Exception exc) {
        MethodCollector.i(10353);
        if (request == null) {
            MethodCollector.o(10353);
        } else if (!this.p) {
            MethodCollector.o(10353);
        } else if (!d()) {
            MethodCollector.o(10353);
        } else {
            HttpUrl url = request.url();
            String scheme = url.scheme();
            String host = url.host();
            String encodedPath = url.encodedPath();
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String lowerCase = stringWriter.toString().toLowerCase();
            if (!"http".equals(scheme) && !"https".equals(scheme)) {
                MethodCollector.o(10353);
            } else if (TextUtils.isEmpty(host)) {
                MethodCollector.o(10353);
            } else if (TextUtils.isEmpty(lowerCase) || !lowerCase.contains("timeout") || !lowerCase.contains("time out") || lowerCase.contains("unreachable")) {
                MethodCollector.o(10353);
            } else {
                a b2 = b();
                if (b2 == null || !b2.f44605a) {
                    MethodCollector.o(10353);
                } else if (b2.f44607c == null || b2.f44607c.size() <= 0 || !b2.f44607c.containsKey(host)) {
                    MethodCollector.o(10353);
                } else {
                    Logger.debug();
                    this.f44633j++;
                    this.f44634k.put(encodedPath, 0);
                    this.f44635l.put(host, 0);
                    if (this.f44633j >= b2.f44608d && this.f44634k.size() >= b2.f44609e && this.f44635l.size() >= b2.f44610f) {
                        Logger.debug();
                        a(false, 0L, a.TTERROR);
                        e();
                    }
                    MethodCollector.o(10353);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010a  */
    @Override // com.bytedance.frameworks.baselib.network.http.d.a.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(okhttp3.Request r16, okhttp3.Response r17) {
        /*
        // Method dump skipped, instructions count: 430
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.f.c.a(okhttp3.Request, okhttp3.Response):void");
    }

    public final void a(boolean z, a aVar) {
        a b2 = b();
        if (b2 != null) {
            Logger.debug();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (z || this.f44628d + (((long) b2.f44614j) * 1000) <= elapsedRealtime) {
                this.f44628d = elapsedRealtime;
                com.bytedance.ttnet.a.a.a(this.f44630g).b(aVar);
                return;
            }
            Logger.debug();
        }
    }

    private void a(boolean z, long j2, a aVar) {
        if (!this.f44627c.hasMessages(10000)) {
            Message obtainMessage = this.f44627c.obtainMessage();
            obtainMessage.what = 10000;
            obtainMessage.arg1 = z ? 1 : 0;
            obtainMessage.arg2 = aVar.mValue;
            if (j2 > 0) {
                this.f44627c.sendMessageDelayed(obtainMessage, j2);
            } else {
                this.f44627c.sendMessage(obtainMessage);
            }
        }
    }

    public static boolean a(Context context, boolean z, a aVar) {
        String str;
        ArrayList<String> arrayList = new ArrayList();
        if (com.bytedance.ttnet.a.a.a(context).f44441i == null || com.bytedance.ttnet.a.a.a(context).f44441i.size() == 0) {
            com.bytedance.ttnet.a.a.a(context);
            arrayList.addAll(Arrays.asList(com.bytedance.ttnet.a.a.k()));
        } else {
            arrayList.addAll(com.bytedance.ttnet.a.a.a(context).f44441i);
            com.bytedance.ttnet.a.a.a(context);
            String[] k2 = com.bytedance.ttnet.a.a.k();
            for (String str2 : k2) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        for (String str3 : arrayList) {
            StringBuilder sb = new StringBuilder();
            sb.append("https://").append(str3).append("/get_domains/v5/");
            h hVar = new h(sb.toString());
            try {
                if (Build.VERSION.SDK_INT < 21) {
                    str = Build.CPU_ABI;
                } else {
                    str = Build.SUPPORTED_ABIS[0];
                }
                hVar.a("abi", str);
                hVar.a("tnc_src", aVar.mValue);
                hVar.a("okhttp_version", "4.0.71.7-tiktok");
                hVar.a("ttnet_version", "4.0.71.7-tiktok");
                TTNetInit.getTTNetDepend();
            } catch (Throwable unused) {
            }
            HashMap hashMap = new HashMap();
            b a2 = b.a();
            if (a2.f29356i && !a2.f29357j) {
                if (!a2.f29349b.isEmpty()) {
                    hashMap.put("x-tt-store-idc", a2.f29349b);
                }
                if (!a2.f29348a.isEmpty()) {
                    hashMap.put("x-tt-store-region", a2.f29348a);
                }
                if (!a2.f29352e.isEmpty()) {
                    hashMap.put("x-tt-store-region-src", a2.f29352e);
                }
            }
            if (!z) {
                com.bytedance.ttnet.d.a aVar2 = new com.bytedance.ttnet.d.a();
                aVar2.f44569b = hVar.toString();
                aVar2.f44573f = true;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    String a3 = com.bytedance.ttnet.d.c.a(aVar2.f44569b, hashMap, null, aVar2);
                    aVar2.f44570c = System.currentTimeMillis() - currentTimeMillis;
                    if (!m.a(a3)) {
                        if (!m.a(aVar2.f44575h)) {
                            com.bytedance.ttnet.a.a.a(context).f44439g = aVar2.f44575h;
                        }
                        a().f44626b.f44619c = aVar2.f44576i;
                        JSONObject jSONObject = new JSONObject(a3);
                        ClientKeyManager.a().b(a3);
                        return com.bytedance.ttnet.a.a.a(context).a(jSONObject, a.TTSERVER, System.currentTimeMillis());
                    }
                } catch (Throwable unused2) {
                    continue;
                }
            } else {
                hVar.a("aid", TTNetInit.getTTNetDepend().e());
                hVar.a("device_platform", "android");
                if (TTNetInit.getCronetProvider() != null) {
                    hVar.a("version_code", TTNetInit.getCronetProvider().getVersionCode());
                    hVar.a("channel", TTNetInit.getCronetProvider().getChannel());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                        arrayList2.add(new com.bytedance.retrofit2.client.b((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
                String hVar2 = hVar.toString();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    Pair<String, String> a4 = i.a(hVar2, linkedHashMap);
                    String str4 = (String) a4.first;
                    String str5 = (String) a4.second;
                    INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.a(str4, INetworkApi.class);
                    if (iNetworkApi != null) {
                        com.bytedance.retrofit2.b<String> doGet = iNetworkApi.doGet(true, -1, str5, linkedHashMap, arrayList2, null);
                        try {
                            u<String> execute = doGet.execute();
                            List<com.bytedance.retrofit2.client.b> list = execute.f42629a.f42476d;
                            T t = execute.f42630b;
                            String a5 = RetrofitUtils.a(list, "x-ss-etag");
                            String a6 = RetrofitUtils.a(list, "x-tt-tnc-abtest");
                            if (m.a((String) t)) {
                                doGet.cancel();
                            } else {
                                if (!m.a(a5)) {
                                    com.bytedance.ttnet.a.a.a(context).f44439g = a5;
                                }
                                a().f44626b.f44619c = a6;
                                JSONObject jSONObject2 = new JSONObject((String) t);
                                ClientKeyManager.a().b(t);
                                boolean a7 = com.bytedance.ttnet.a.a.a(context).a(jSONObject2, a.TTSERVER, System.currentTimeMillis());
                                doGet.cancel();
                                return a7;
                            }
                        } catch (Throwable unused3) {
                            if (doGet == null) {
                            }
                        }
                    } else {
                        continue;
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return false;
    }
}

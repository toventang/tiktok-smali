package com.bytedance.ttnet.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.a;
import com.bytedance.frameworks.baselib.network.http.d.a.b.k;
import com.bytedance.frameworks.baselib.network.http.g.f;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class g implements SsHttpCall.a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f44470d = g.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private static String f44471e;

    /* renamed from: f  reason: collision with root package name */
    private static g f44472f;

    /* renamed from: h  reason: collision with root package name */
    private static final Object f44473h = new Object();
    private static final Object q = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Context f44474a;

    /* renamed from: b  reason: collision with root package name */
    String f44475b = "";

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Integer> f44476c = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    private final boolean f44477g;

    /* renamed from: i  reason: collision with root package name */
    private Map<a.EnumC0621a, a> f44478i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private boolean f44479j = false;

    /* renamed from: k  reason: collision with root package name */
    private boolean f44480k = false;

    /* renamed from: l  reason: collision with root package name */
    private int f44481l = 1000;

    /* renamed from: m  reason: collision with root package name */
    private int f44482m = 100;
    private Set<String> n = new HashSet();
    private Map<String, Integer> o = new HashMap();
    private AtomicInteger p = new AtomicInteger(0);

    /* access modifiers changed from: package-private */
    public static final class b extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(27240);
        }

        b() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "com.bytedance.ttnet.config.appconfig.SYNC_APP_DELAY_CONFIG_ACTION".equals(intent.getAction())) {
                new e() {
                    /* class com.bytedance.ttnet.a.g.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(27241);
                    }

                    @Override // com.bytedance.common.utility.b.e
                    public final void run() {
                        i.c().d();
                    }
                }.a();
            }
        }
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.a
    public final boolean a() {
        return this.f44479j;
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.a
    public final boolean b() {
        return k.a().b();
    }

    static {
        Covode.recordClassIndex(27238);
    }

    public final void c() {
        String string = d.a(this.f44474a, "tt_state_config", 4).getString("tnc_delay_config", "");
        this.f44475b = string;
        if (!TextUtils.isEmpty(string)) {
            try {
                a(new JSONObject(this.f44475b));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        Logger.debug();
        if (this.f44477g) {
            a(com.bytedance.frameworks.baselib.network.http.cronet.a.f28996b);
        }
    }

    private void d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.f44479j) {
            linkedHashMap.put("app_delay_enable", 1);
        } else {
            linkedHashMap.put("app_delay_enable", 0);
        }
        if (this.f44480k) {
            linkedHashMap.put("app_delay_use_black_list", 1);
        } else {
            linkedHashMap.put("app_delay_use_black_list", 0);
        }
        linkedHashMap.put("app_delay_whitelist_delay_time", Integer.valueOf(this.f44482m));
        Set<String> set = this.n;
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            stringBuffer.append(strArr[i2] + ",");
        }
        if (strArr.length > 0) {
            linkedHashMap.put("app_delay_white_list", stringBuffer.substring(0, stringBuffer.length() - 1));
        } else {
            linkedHashMap.put("app_delay_white_list", "");
        }
        linkedHashMap.put("app_delay_black_list", new JSONObject(this.o).toString());
        TTNetInit.getTTNetDepend().a(this.f44474a, linkedHashMap);
        Intent intent = new Intent("com.bytedance.ttnet.config.appconfig.SYNC_APP_DELAY_CONFIG_ACTION");
        if (!TextUtils.isEmpty(f44471e)) {
            intent.setPackage(f44471e);
        }
        this.f44474a.sendBroadcast(intent);
    }

    public static Set<String> d(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashSet();
        }
        return new HashSet(Arrays.asList(str.split(",")));
    }

    /* access modifiers changed from: package-private */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f44483a;

        /* renamed from: b  reason: collision with root package name */
        boolean f44484b;

        /* renamed from: c  reason: collision with root package name */
        Map<String, Integer> f44485c;

        /* renamed from: d  reason: collision with root package name */
        Set<String> f44486d;

        /* renamed from: e  reason: collision with root package name */
        int f44487e;

        /* renamed from: f  reason: collision with root package name */
        int f44488f;

        /* renamed from: g  reason: collision with root package name */
        int f44489g;

        static {
            Covode.recordClassIndex(27239);
        }

        private a() {
            this.f44484b = true;
            this.f44485c = new HashMap();
            this.f44486d = new HashSet();
            this.f44487e = 1000;
            this.f44488f = 100;
            this.f44489g = 1000;
        }

        /* synthetic */ a(g gVar, byte b2) {
            this();
        }
    }

    public static Map<String, Integer> c(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, Integer.valueOf(jSONObject.optInt(next)));
        }
        return hashMap;
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.a
    public final int a(String str) {
        int i2;
        if (this.f44480k) {
            i2 = this.o.get(str).intValue();
        } else {
            i2 = this.f44482m;
        }
        if (i2 > 0) {
            this.p.incrementAndGet();
        }
        this.f44476c.put(str, Integer.valueOf(i2));
        return this.f44482m;
    }

    public static g a(Context context) {
        g gVar;
        MethodCollector.i(8532);
        synchronized (g.class) {
            try {
                if (f44472f == null) {
                    boolean a2 = f.a(context);
                    Context applicationContext = context.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                        if (applicationContext == null) {
                            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                        }
                    }
                    f44472f = new g(applicationContext, a2);
                    f44471e = context.getPackageName();
                    if (a2) {
                        SsHttpCall.setThrottleControl(f44472f);
                    } else {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("com.bytedance.ttnet.config.appconfig.SYNC_APP_DELAY_CONFIG_ACTION");
                        try {
                            b(context, new b(), intentFilter);
                        } catch (Throwable unused) {
                        }
                        SsHttpCall.setThrottleControl(i.c());
                    }
                }
                gVar = f44472f;
            } finally {
                MethodCollector.o(8532);
            }
        }
        return gVar;
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.a
    public final boolean b(String str) {
        Logger.debug();
        if (!this.f44479j) {
            return false;
        }
        if (this.f44480k) {
            boolean a2 = com.bytedance.ttnet.retrofit.a.a(str, this.o.keySet());
            if (a2) {
                Logger.debug();
            } else {
                Logger.debug();
            }
            return a2;
        } else if (com.bytedance.ttnet.retrofit.a.a(str, this.n)) {
            Logger.debug();
            return false;
        } else {
            Logger.debug();
            return true;
        }
    }

    public final void a(a.EnumC0621a aVar) {
        MethodCollector.i(8908);
        synchronized (f44473h) {
            try {
                int length = Thread.currentThread().getStackTrace().length;
                for (int i2 = 0; i2 < length; i2++) {
                    Logger.debug();
                }
                Logger.debug();
                a aVar2 = this.f44478i.get(aVar);
                synchronized (q) {
                    try {
                        this.f44480k = false;
                        this.o = new HashMap();
                        this.f44482m = 100;
                        this.n = new HashSet();
                        this.f44481l = 1000;
                        this.f44476c.clear();
                        if (aVar2 == null) {
                            Logger.debug();
                            this.f44479j = false;
                        } else if (!aVar2.f44486d.isEmpty()) {
                            Logger.debug();
                            this.f44479j = true;
                            this.f44482m = aVar2.f44488f;
                            this.n = aVar2.f44486d;
                            this.f44481l = aVar2.f44489g;
                        } else if (!aVar2.f44485c.isEmpty()) {
                            Logger.debug();
                            this.f44479j = true;
                            this.f44480k = true;
                            this.o = aVar2.f44485c;
                            this.f44481l = aVar2.f44487e;
                        }
                        d();
                    } finally {
                        MethodCollector.o(8908);
                    }
                }
                com.bytedance.frameworks.baselib.network.http.cronet.a.f28996b = aVar;
                if (aVar == a.EnumC0621a.ColdStart) {
                    new Handler(Looper.getMainLooper()).postDelayed(new h(this), (long) this.f44481l);
                }
            } finally {
                MethodCollector.o(8908);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.util.Set<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public final void a(JSONObject jSONObject) {
        a.EnumC0621a aVar;
        MethodCollector.i(8578);
        JSONArray optJSONArray = jSONObject.optJSONArray("tt_req_delay_config");
        if (optJSONArray == null) {
            synchronized (f44473h) {
                try {
                    this.f44478i.clear();
                } finally {
                    MethodCollector.o(8578);
                }
            }
            return;
        }
        Logger.debug();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            a aVar2 = new a(this, (byte) 0);
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("state", -2);
                if (optInt == -1) {
                    aVar = a.EnumC0621a.NormalStart;
                } else if (optInt == 0) {
                    aVar = a.EnumC0621a.ColdStart;
                } else if (optInt == 1) {
                    aVar = a.EnumC0621a.HotStart;
                } else if (optInt == 2) {
                    aVar = a.EnumC0621a.WarmStart;
                } else if (optInt == 3) {
                    aVar = a.EnumC0621a.WeakNet;
                }
                aVar2.f44486d = new HashSet();
                aVar2.f44485c = new HashMap();
                aVar2.f44483a = false;
                if (!optJSONObject.isNull("bl_with_delay_ms")) {
                    aVar2.f44483a = true;
                    aVar2.f44484b = true;
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("bl_with_delay_ms");
                    Iterator<String> keys = optJSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        aVar2.f44485c.put(next, Integer.valueOf(optJSONObject2.optInt(next)));
                    }
                    aVar2.f44487e = optJSONObject.optInt("bl_disable_time_ms");
                } else if (!optJSONObject.isNull("wl")) {
                    aVar2.f44483a = true;
                    aVar2.f44484b = false;
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("wl");
                    if (optJSONArray2 != null) {
                        for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                            aVar2.f44486d.add(optJSONArray2.opt(i3));
                        }
                    }
                    aVar2.f44488f = optJSONObject.optInt("delay_time_ms");
                    aVar2.f44489g = optJSONObject.optInt("wl_disable_time_ms");
                }
                synchronized (f44473h) {
                    try {
                        a(this.f44474a).f44478i.put(aVar, aVar2);
                    } catch (Throwable th) {
                        MethodCollector.o(8578);
                        throw th;
                    }
                }
            }
        }
        MethodCollector.o(8578);
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.a
    public final int a(String str, String str2) {
        return k.a().a(str, str2);
    }

    private g(Context context, boolean z) {
        this.f44474a = context;
        this.f44477g = z;
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, null, null);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    private static Intent b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        SecurityException securityException;
        com.ss.android.ugc.aweme.lancet.receiver.a.a(com.bytedance.ies.ugc.appcontext.g.a());
        try {
            return a(context, broadcastReceiver, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(broadcastReceiver, intentFilter, null, null);
            } catch (SecurityException e2) {
                securityException = e2;
                com.bytedance.c.a.a.a.b.a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e3) {
                String message = e3.getMessage();
                securityException = e3;
                if (message != null) {
                    boolean contains = e3.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e3;
                    if (contains) {
                        throw e3;
                    }
                }
                com.bytedance.c.a.a.a.b.a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }
}

package com.facebook.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.GraphRequest;
import com.facebook.a.b.a.e;
import com.facebook.a.h;
import com.facebook.ab;
import com.facebook.internal.q;
import com.facebook.m;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.bf.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final String f48657a = r.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, q> f48658b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference<a> f48659c = new AtomicReference<>(a.NOT_LOADED);

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentLinkedQueue<b> f48660d = new ConcurrentLinkedQueue<>();

    /* renamed from: e  reason: collision with root package name */
    public static boolean f48661e = false;

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f48662f = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting"};

    /* renamed from: g  reason: collision with root package name */
    private static boolean f48663g = false;

    /* renamed from: h  reason: collision with root package name */
    private static JSONArray f48664h = null;

    public interface b {
        static {
            Covode.recordClassIndex(29348);
        }

        void a();
    }

    /* access modifiers changed from: package-private */
    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        static {
            Covode.recordClassIndex(29347);
        }
    }

    static {
        Covode.recordClassIndex(29343);
    }

    public static synchronized void b() {
        synchronized (r.class) {
            MethodCollector.i(1035);
            a aVar = f48659c.get();
            if (a.NOT_LOADED.equals(aVar) || a.LOADING.equals(aVar)) {
                MethodCollector.o(1035);
                return;
            }
            ae.a();
            final q qVar = f48658b.get(m.f48915a);
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.ERROR.equals(aVar)) {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue = f48660d;
                    if (!concurrentLinkedQueue.isEmpty()) {
                        final b poll = concurrentLinkedQueue.poll();
                        handler.post(new Runnable() {
                            /* class com.facebook.internal.r.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(29345);
                            }

                            public final void run() {
                                com.facebook.internal.a.b.a.a(this);
                            }
                        });
                    } else {
                        MethodCollector.o(1035);
                        return;
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue2 = f48660d;
                    if (!concurrentLinkedQueue2.isEmpty()) {
                        final b poll2 = concurrentLinkedQueue2.poll();
                        handler.post(new Runnable() {
                            /* class com.facebook.internal.r.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(29346);
                            }

                            public final void run() {
                                if (!com.facebook.internal.a.b.a.a(this)) {
                                    try {
                                        poll2.a();
                                    } catch (Throwable th) {
                                        com.facebook.internal.a.b.a.a(th, this);
                                    }
                                }
                            }
                        });
                    } else {
                        MethodCollector.o(1035);
                        return;
                    }
                }
            }
        }
    }

    public static void a() {
        ae.a();
        final Context context = m.f48921g;
        ae.a();
        final String str = m.f48915a;
        if (ad.a(str)) {
            f48659c.set(a.ERROR);
            b();
        } else if (f48658b.containsKey(str)) {
            f48659c.set(a.SUCCESS);
            b();
        } else {
            AtomicReference<a> atomicReference = f48659c;
            if (atomicReference.compareAndSet(a.NOT_LOADED, a.LOADING) || atomicReference.compareAndSet(a.ERROR, a.LOADING)) {
                final String a2 = com.a.a("com.facebook.internal.APP_SETTINGS.%s", new Object[]{str});
                m.c().execute(new Runnable() {
                    /* class com.facebook.internal.r.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(29344);
                    }

                    public final void run() {
                        a aVar;
                        if (!com.facebook.internal.a.b.a.a(this)) {
                            try {
                                SharedPreferences a2 = d.a(context, "com.facebook.internal.preferences.APP_SETTINGS", 0);
                                q qVar = null;
                                String string = a2.getString(a2, null);
                                if (!ad.a(string)) {
                                    try {
                                        qVar = r.a(str, new JSONObject(string));
                                    } catch (JSONException e2) {
                                        ad.a("FacebookSDK", (Exception) e2);
                                    }
                                }
                                JSONObject b2 = r.b(str);
                                if (b2 != null) {
                                    r.a(str, b2);
                                    a2.edit().putString(a2, b2.toString()).apply();
                                }
                                if (qVar != null) {
                                    String str = qVar.f48652m;
                                    if (!r.f48661e && str != null && str.length() > 0) {
                                        r.f48661e = true;
                                    }
                                }
                                p.a(str);
                                ae.a();
                                Context context = m.f48921g;
                                ae.a();
                                String str2 = m.f48915a;
                                boolean b3 = ab.b();
                                ae.a((Object) context, "context");
                                if (b3 && (context instanceof Application)) {
                                    Application application = (Application) context;
                                    if (!com.facebook.internal.a.b.a.a(h.class)) {
                                        try {
                                            if (m.a()) {
                                                if (!com.facebook.a.b.f46594c) {
                                                    h.g().execute(
                                                    /*  JADX ERROR: Method code generation error
                                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009d: INVOKE  
                                                          (wrap: java.util.concurrent.Executor : 0x0094: INVOKE  (r1v16 java.util.concurrent.Executor) =  type: STATIC call: com.facebook.a.h.g():java.util.concurrent.Executor)
                                                          (wrap: com.facebook.a.b$1 : 0x009a: CONSTRUCTOR  (r0v67 com.facebook.a.b$1) =  call: com.facebook.a.b.1.<init>():void type: CONSTRUCTOR)
                                                         type: INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void in method: com.facebook.internal.r.1.run():void, file: classes2.dex
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009a: CONSTRUCTOR  (r0v67 com.facebook.a.b$1) =  call: com.facebook.a.b.1.<init>():void type: CONSTRUCTOR in method: com.facebook.internal.r.1.run():void, file: classes2.dex
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                                        	... 49 more
                                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.a.b, state: GENERATED_AND_UNLOADED
                                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                                        	... 55 more
                                                        */
                                                    /*
                                                    // Method dump skipped, instructions count: 514
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.r.AnonymousClass1.run():void");
                                                }
                                            });
                                            return;
                                        }
                                        b();
                                    }
                                }

                                public static q a(String str) {
                                    if (str != null) {
                                        return f48658b.get(str);
                                    }
                                    return null;
                                }

                                public static JSONObject b(String str) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(f48662f))));
                                    GraphRequest a2 = GraphRequest.a(str);
                                    a2.n = true;
                                    a2.f46548j = bundle;
                                    return GraphRequest.a(a2).f49017b;
                                }

                                private static Map<String, Map<String, q.a>> a(JSONObject jSONObject) {
                                    JSONArray optJSONArray;
                                    HashMap hashMap = new HashMap();
                                    if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null)) {
                                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                                            String optString = optJSONObject.optString(StringSet.name);
                                            Uri uri = null;
                                            if (!ad.a(optString)) {
                                                String[] split = optString.split("\\|");
                                                if (split.length == 2) {
                                                    String str = split[0];
                                                    String str2 = split[1];
                                                    if (!ad.a(str) && !ad.a(str2)) {
                                                        String optString2 = optJSONObject.optString("url");
                                                        if (!ad.a(optString2)) {
                                                            uri = Uri.parse(optString2);
                                                        }
                                                        q.a aVar = new q.a(str, str2, uri, q.a.a(optJSONObject.optJSONArray("versions")));
                                                        String str3 = aVar.f48653a;
                                                        Map map = (Map) hashMap.get(str3);
                                                        if (map == null) {
                                                            map = new HashMap();
                                                            hashMap.put(str3, map);
                                                        }
                                                        map.put(aVar.f48654b, aVar);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return hashMap;
                                }

                                public static q a(String str, boolean z) {
                                    if (!z) {
                                        Map<String, q> map = f48658b;
                                        if (map.containsKey(str)) {
                                            return map.get(str);
                                        }
                                    }
                                    JSONObject b2 = b(str);
                                    if (b2 == null) {
                                        return null;
                                    }
                                    q a2 = a(str, b2);
                                    ae.a();
                                    if (str.equals(m.f48915a)) {
                                        f48659c.set(a.SUCCESS);
                                        b();
                                    }
                                    return a2;
                                }

                                protected static q a(String str, JSONObject jSONObject) {
                                    l a2;
                                    boolean z;
                                    boolean z2;
                                    boolean z3;
                                    boolean z4;
                                    boolean z5;
                                    JSONArray optJSONArray = jSONObject.optJSONArray("android_sdk_error_categories");
                                    if (optJSONArray == null) {
                                        a2 = l.a();
                                    } else {
                                        a2 = l.a(optJSONArray);
                                    }
                                    int optInt = jSONObject.optInt("app_events_feature_bitmask", 0);
                                    if ((optInt & 8) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if ((optInt & 16) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if ((optInt & 32) != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if ((optInt & 256) != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if ((optInt & 16384) != 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    JSONArray optJSONArray2 = jSONObject.optJSONArray("auto_event_mapping_android");
                                    f48664h = optJSONArray2;
                                    if (optJSONArray2 != null && u.a()) {
                                        e.a(optJSONArray2.toString());
                                    }
                                    q qVar = new q(jSONObject.optBoolean("supports_implicit_sdk_logging", false), jSONObject.optString("gdpv4_nux_content", ""), jSONObject.optBoolean("gdpv4_nux_enabled", false), jSONObject.optInt("app_events_session_timeout", 60), ac.parseOptions(jSONObject.optLong("seamless_login")), a(jSONObject.optJSONObject("android_dialog_configs")), z, a2, jSONObject.optString("smart_login_bookmark_icon_url"), jSONObject.optString("smart_login_menu_icon_url"), z2, z3, optJSONArray2, jSONObject.optString("sdk_update_message"), z4, z5, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"));
                                    f48658b.put(str, qVar);
                                    return qVar;
                                }
                            }

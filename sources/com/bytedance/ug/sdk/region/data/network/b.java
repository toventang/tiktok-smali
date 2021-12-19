package com.bytedance.ug.sdk.region.data.network;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ug.sdk.region.data.c.d;
import com.bytedance.ug.sdk.region.data.d.a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Semaphore;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Semaphore f45805a = new Semaphore(1);

    static {
        Covode.recordClassIndex(27907);
    }

    private static Map<String, String> b() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        if (a.a()) {
            hashMap.put("x-use-boe", "1");
        }
        return hashMap;
    }

    public static String a() {
        String a2 = a.a();
        if (TextUtils.isEmpty(a2)) {
            return "";
        }
        try {
            String a3 = a.a(a2, "/ttloc/config/", b(), new byte[0]);
            if (TextUtils.isEmpty(a3)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(a3);
            if (com.bytedance.ug.sdk.region.data.h.a.a(jSONObject, "err_no") == 0) {
                return jSONObject.optString("data");
            }
            return "";
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static com.bytedance.ug.sdk.region.data.a.a a(Context context) {
        com.bytedance.ug.sdk.region.data.a.a aVar;
        String a2;
        Semaphore semaphore = f45805a;
        if (semaphore.tryAcquire(1)) {
            try {
                com.bytedance.ug.sdk.region.data.a.a b2 = b(context);
                if (b2.b()) {
                    semaphore.release();
                    return b2;
                }
                semaphore.release();
                return b2;
            } catch (Exception e2) {
                e2.printStackTrace();
                com.bytedance.ug.sdk.region.data.a.a b3 = com.bytedance.ug.sdk.region.data.a.a.b(e2.getMessage());
                f45805a.release();
                return b3;
            } catch (Throwable th) {
                f45805a.release();
                throw th;
            }
        } else {
            try {
                semaphore.acquire();
                if (com.bytedance.ug.sdk.region.data.e.b.f45787b != com.bytedance.ug.sdk.region.data.e.b.f45786a) {
                    if (com.bytedance.ug.sdk.region.data.e.b.f45787b == null || com.bytedance.ug.sdk.region.data.e.b.f45787b.b()) {
                        if (com.bytedance.ug.sdk.region.data.e.b.f45787b != null) {
                            aVar = com.bytedance.ug.sdk.region.data.e.b.f45787b;
                        } else {
                            d c2 = a.c();
                            if (c2 != null) {
                                a2 = c2.a();
                            } else {
                                a2 = com.bytedance.ug.sdk.region.data.e.a.a(context, "bd_region");
                            }
                            aVar = com.bytedance.ug.sdk.region.data.a.a.a(a2, 1);
                            if (aVar == null || !aVar.b()) {
                                com.bytedance.ug.sdk.region.data.e.b.f45787b = com.bytedance.ug.sdk.region.data.e.b.f45786a;
                                aVar = com.bytedance.ug.sdk.region.data.e.b.a(context);
                            } else {
                                com.bytedance.ug.sdk.region.data.e.b.f45787b = aVar;
                            }
                        }
                        semaphore.release();
                        return aVar;
                    }
                    com.bytedance.ug.sdk.region.data.e.b.f45787b = com.bytedance.ug.sdk.region.data.e.b.f45786a;
                }
                aVar = com.bytedance.ug.sdk.region.data.e.b.a(context);
                semaphore.release();
                return aVar;
            } catch (InterruptedException e3) {
                e3.printStackTrace();
                f45805a.release();
                return null;
            } catch (Throwable th2) {
                f45805a.release();
                throw th2;
            }
        }
    }

    private static com.bytedance.ug.sdk.region.data.a.a b(Context context) {
        com.bytedance.ug.sdk.region.data.c.b bVar;
        Locale a2;
        String str;
        String networkOperator;
        Locale locale;
        String a3 = a.a();
        if (TextUtils.isEmpty(a3)) {
            return com.bytedance.ug.sdk.region.data.a.a.b("Missing Url");
        }
        Map<String, String> b2 = b();
        JSONObject jSONObject = new JSONObject();
        if (a.f45784a == null || (bVar = a.f45784a.f45772g) == null) {
            a2 = Locale.getDefault();
        } else {
            a2 = bVar.a();
        }
        String country = a2.getCountry();
        String language = a2.getLanguage();
        String locale2 = a2.toString();
        if (TextUtils.isEmpty(country) || TextUtils.isEmpty(language)) {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = Resources.getSystem().getConfiguration().getLocales().get(0);
            } else {
                locale = Resources.getSystem().getConfiguration().locale;
            }
            if (locale != null) {
                country = locale.getCountry();
                language = locale.getLanguage();
                locale2 = language + "_" + country;
            }
        }
        com.bytedance.ug.sdk.region.data.h.a.a(jSONObject, "system_region", country);
        com.bytedance.ug.sdk.region.data.h.a.a(jSONObject, "system_language", language);
        com.bytedance.ug.sdk.region.data.h.a.a(jSONObject, "locale", locale2);
        if (context != null) {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.ug.sdk.region.data.h.b.a(context, "phone");
            if (telephonyManager == null || telephonyManager.getSimState() != 5) {
                str = "";
            } else {
                str = telephonyManager.getSimOperator();
            }
            com.bytedance.ug.sdk.region.data.h.a.a(jSONObject, "carrier_region", str);
            com.bytedance.ug.sdk.region.data.h.a.a(jSONObject, "network_sim_region", str);
            TelephonyManager telephonyManager2 = (TelephonyManager) com.bytedance.ug.sdk.region.data.h.b.a(context, "phone");
            if (telephonyManager2 == null) {
                networkOperator = "";
            } else {
                networkOperator = telephonyManager2.getNetworkOperator();
            }
            com.bytedance.ug.sdk.region.data.h.a.a(jSONObject, "mcc_mnc", networkOperator);
        }
        try {
            String a4 = a.a(a3, "/location/region/", b2, jSONObject.toString().getBytes());
            if (TextUtils.isEmpty(a4)) {
                return com.bytedance.ug.sdk.region.data.a.a.b("Server:Response empty");
            }
            JSONObject jSONObject2 = new JSONObject(a4);
            int a5 = com.bytedance.ug.sdk.region.data.h.a.a(jSONObject2, "status");
            String b3 = com.bytedance.ug.sdk.region.data.h.a.b(jSONObject2, "message", "");
            if (a5 == 0) {
                return a(context, jSONObject2);
            }
            return com.bytedance.ug.sdk.region.data.a.a.b("resp status = " + a5 + ",message " + b3);
        } catch (Exception e2) {
            e2.printStackTrace();
            e2.getMessage();
            return com.bytedance.ug.sdk.region.data.a.a.b(e2.getMessage());
        }
    }

    private static com.bytedance.ug.sdk.region.data.a.a a(Context context, JSONObject jSONObject) {
        try {
            com.bytedance.ug.sdk.region.data.a.a a2 = com.bytedance.ug.sdk.region.data.a.a.a(com.bytedance.ug.sdk.region.data.h.a.b(jSONObject, "data", ""), 0);
            if (a2 != null) {
                com.bytedance.ug.sdk.region.data.e.b.f45787b = a2;
                com.bytedance.ug.sdk.region.data.f.b.a(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0016: INVOKE  
                      (wrap: com.bytedance.ug.sdk.region.data.e.b$1 : 0x0013: CONSTRUCTOR  (r0v7 com.bytedance.ug.sdk.region.data.e.b$1) = (r2v0 'context' android.content.Context), (r1v3 'a2' com.bytedance.ug.sdk.region.data.a.a) call: com.bytedance.ug.sdk.region.data.e.b.1.<init>(android.content.Context, com.bytedance.ug.sdk.region.data.a.a):void type: CONSTRUCTOR)
                     type: STATIC call: com.bytedance.ug.sdk.region.data.f.b.a(java.lang.Runnable):void in method: com.bytedance.ug.sdk.region.data.network.b.a(android.content.Context, org.json.JSONObject):com.bytedance.ug.sdk.region.data.a.a, file: classes2.dex
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
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: CONSTRUCTOR  (r0v7 com.bytedance.ug.sdk.region.data.e.b$1) = (r2v0 'context' android.content.Context), (r1v3 'a2' com.bytedance.ug.sdk.region.data.a.a) call: com.bytedance.ug.sdk.region.data.e.b.1.<init>(android.content.Context, com.bytedance.ug.sdk.region.data.a.a):void type: CONSTRUCTOR in method: com.bytedance.ug.sdk.region.data.network.b.a(android.content.Context, org.json.JSONObject):com.bytedance.ug.sdk.region.data.a.a, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ug.sdk.region.data.e.b, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    */
                /*
                    java.lang.String r1 = "data"
                    java.lang.String r0 = ""
                    java.lang.String r1 = com.bytedance.ug.sdk.region.data.h.a.b(r3, r1, r0)     // Catch:{ Exception -> 0x001a }
                    r0 = 0
                    com.bytedance.ug.sdk.region.data.a.a r1 = com.bytedance.ug.sdk.region.data.a.a.a(r1, r0)     // Catch:{ Exception -> 0x001a }
                    if (r1 == 0) goto L_0x0019
                    com.bytedance.ug.sdk.region.data.e.b.f45787b = r1     // Catch:{ Exception -> 0x001a }
                    com.bytedance.ug.sdk.region.data.e.b$1 r0 = new com.bytedance.ug.sdk.region.data.e.b$1     // Catch:{ Exception -> 0x001a }
                    r0.<init>(r2, r1)     // Catch:{ Exception -> 0x001a }
                    com.bytedance.ug.sdk.region.data.f.b.a(r0)     // Catch:{ Exception -> 0x001a }
                L_0x0019:
                    return r1
                L_0x001a:
                    r2 = move-exception
                    r2.printStackTrace()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r0 = "Server:"
                    r1.<init>(r0)
                    java.lang.String r0 = r2.getMessage()
                    java.lang.StringBuilder r0 = r1.append(r0)
                    java.lang.String r0 = r0.toString()
                    com.bytedance.ug.sdk.region.data.a.a r0 = com.bytedance.ug.sdk.region.data.a.a.b(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ug.sdk.region.data.network.b.a(android.content.Context, org.json.JSONObject):com.bytedance.ug.sdk.region.data.a.a");
            }
        }

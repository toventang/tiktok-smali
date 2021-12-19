package com.facebook.a.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import com.facebook.internal.ae;
import com.facebook.m;
import com.ss.android.ugc.aweme.bf.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final SharedPreferences f46745a = d.a(m.f48921g, "com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: b  reason: collision with root package name */
    private static final String f46746b = h.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap<String, Method> f46747c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<String, Class<?>> f46748d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private static final String f46749e = m.f48921g.getPackageName();

    /* renamed from: f  reason: collision with root package name */
    private static final SharedPreferences f46750f = d.a(m.f48921g, "com.facebook.internal.PURCHASE", 0);

    h() {
    }

    private static void a(Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences.Editor edit = f46745a.edit();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            edit.putString(entry.getKey(), currentTimeMillis + ";" + entry.getValue());
        }
        edit.apply();
    }

    static {
        Covode.recordClassIndex(28484);
        ae.a();
        ae.a();
        ae.a();
    }

    static boolean a(String str) {
        try {
            String optString = new JSONObject(str).optString("freeTrialPeriod");
            if (optString == null || optString.isEmpty()) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
        }
    }

    static ArrayList<String> a(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        SharedPreferences.Editor edit = f46750f.edit();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                JSONObject jSONObject = new JSONObject(next);
                String string = jSONObject.getString("productId");
                long j2 = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (currentTimeMillis - (j2 / 1000) <= 86400) {
                    if (!f46750f.getString(string, "").equals(string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(next);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        edit.apply();
        return arrayList2;
    }

    static ArrayList<String> a(Context context, Object obj) {
        return a(a(context, obj, "inapp"));
    }

    static Class<?> a(Context context, String str) {
        HashMap<String, Class<?>> hashMap = f46748d;
        Class<?> cls = hashMap.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            cls = context.getClassLoader().loadClass(str);
            hashMap.put(str, cls);
            return cls;
        } catch (ClassNotFoundException unused) {
            return cls;
        }
    }

    static Method a(Class<?> cls, String str) {
        HashMap<String, Method> hashMap = f46747c;
        Method method = hashMap.get(str);
        if (method != null) {
            return method;
        }
        Class<?>[] clsArr = null;
        char c2 = 65535;
        try {
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1123215065:
                    if (str.equals("asInterface")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                clsArr = new Class[]{IBinder.class};
            } else if (c2 == 1) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, Bundle.class};
            } else if (c2 == 2) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class};
            } else if (c2 == 3) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class};
            } else if (c2 == 4) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class, Bundle.class};
            }
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            hashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            return method;
        }
    }

    private static Boolean c(Context context, Object obj, String str) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        Object a2 = a(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f46749e, str});
        if (a2 != null && ((Integer) a2).intValue() == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    static ArrayList<String> b(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        ArrayList<String> arrayList = new ArrayList<>();
        if (c(context, obj, str).booleanValue()) {
            String str2 = null;
            int i2 = 0;
            boolean z = false;
            do {
                Object a2 = a(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, f46749e, str, str2, new Bundle()});
                if (a2 != null) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Bundle bundle = (Bundle) a2;
                    if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                        Iterator<String> it = stringArrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            try {
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i2++;
                            } catch (JSONException unused) {
                            }
                        }
                        str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        if (i2 >= 30 || str2 == null) {
                            break;
                        }
                    }
                }
                str2 = null;
            } while (!z);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a A[EDGE_INSN: B:19:0x005a->B:16:0x005a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.ArrayList<java.lang.String> a(android.content.Context r9, java.lang.Object r10, java.lang.String r11) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r10 != 0) goto L_0x0008
            return r4
        L_0x0008:
            java.lang.Boolean r0 = c(r9, r10, r11)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005a
            r8 = 0
            r7 = 0
            r6 = r7
            r3 = 0
        L_0x0016:
            r0 = 4
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r2 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5[r8] = r0
            r1 = 1
            java.lang.String r0 = com.facebook.a.e.h.f46749e
            r5[r1] = r0
            r0 = 2
            r5[r0] = r11
            r5[r2] = r6
            java.lang.String r1 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r0 = "getPurchases"
            java.lang.Object r2 = a(r9, r1, r0, r10, r5)
            if (r2 == 0) goto L_0x005b
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r0 = "RESPONSE_CODE"
            int r0 = r2.getInt(r0)
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r1 = r2.getStringArrayList(r0)
            if (r1 == 0) goto L_0x005a
            int r0 = r1.size()
            int r3 = r3 + r0
            r4.addAll(r1)
            java.lang.String r0 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r6 = r2.getString(r0)
        L_0x0054:
            r0 = 30
            if (r3 >= r0) goto L_0x005a
            if (r6 != 0) goto L_0x0016
        L_0x005a:
            return r4
        L_0x005b:
            r6 = r7
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.e.h.a(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    private static Map<String, String> b(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (obj != null && !arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Object[] objArr = new Object[4];
            objArr[0] = 3;
            objArr[1] = f46749e;
            if (z) {
                str = "subs";
            } else {
                str = "inapp";
            }
            objArr[2] = str;
            objArr[3] = bundle;
            Object a2 = a(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
            if (a2 != null) {
                Bundle bundle2 = (Bundle) a2;
                if (bundle2.getInt("RESPONSE_CODE") == 0) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            hashMap.put(arrayList.get(i2), stringArrayList.get(i2));
                        }
                    }
                    a(hashMap);
                }
            }
        }
        return hashMap;
    }

    static Map<String, String> a(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            String string = f46745a.getString(next, null);
            if (string != null) {
                String[] split = string.split(";", 2);
                if (currentTimeMillis - Long.parseLong(split[0]) < 43200) {
                    hashMap.put(next, split[1]);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String next2 = it2.next();
            if (!hashMap.containsKey(next2)) {
                arrayList2.add(next2);
            }
        }
        hashMap.putAll(b(context, arrayList2, obj, z));
        return hashMap;
    }

    static Object a(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method a2;
        Class<?> a3 = a(context, str);
        if (a3 == null || (a2 = a(a3, str2)) == null) {
            return null;
        }
        if (obj != null) {
            obj = a3.cast(obj);
        }
        try {
            Pair<Boolean, Object> a4 = a.a(a2, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_facebook_appevents_internal_InAppPurchaseEventManager_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a4.first).booleanValue()) {
                return a4.second;
            }
            Object invoke = a2.invoke(obj, objArr);
            a.a(invoke, a2, new Object[]{obj, objArr}, "com_facebook_appevents_internal_InAppPurchaseEventManager_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}

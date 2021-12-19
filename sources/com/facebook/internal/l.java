package com.facebook.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class l {

    /* renamed from: g  reason: collision with root package name */
    private static l f48614g;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Set<Integer>> f48615a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, Set<Integer>> f48616b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Integer, Set<Integer>> f48617c;

    /* renamed from: d  reason: collision with root package name */
    public final String f48618d;

    /* renamed from: e  reason: collision with root package name */
    public final String f48619e;

    /* renamed from: f  reason: collision with root package name */
    public final String f48620f;

    static {
        Covode.recordClassIndex(29325);
    }

    /* renamed from: com.facebook.internal.l$3  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f48621a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 29328(0x7290, float:4.1097E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.FacebookRequestError$a[] r0 = com.facebook.FacebookRequestError.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.internal.l.AnonymousClass3.f48621a = r2
                com.facebook.FacebookRequestError$a r0 = com.facebook.FacebookRequestError.a.OTHER     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.internal.l.AnonymousClass3.f48621a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.FacebookRequestError$a r0 = com.facebook.FacebookRequestError.a.LOGIN_RECOVERABLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.internal.l.AnonymousClass3.f48621a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.FacebookRequestError$a r0 = com.facebook.FacebookRequestError.a.TRANSIENT     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.l.AnonymousClass3.<clinit>():void");
        }
    }

    public static synchronized l a() {
        l lVar;
        synchronized (l.class) {
            MethodCollector.i(982);
            if (f48614g == null) {
                f48614g = new l(null, new HashMap<Integer, Set<Integer>>() {
                    /* class com.facebook.internal.l.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(29326);
                    }

                    {
                        put(2, null);
                        put(4, null);
                        put(9, null);
                        put(17, null);
                        put(341, null);
                    }
                }, new HashMap<Integer, Set<Integer>>() {
                    /* class com.facebook.internal.l.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(29327);
                    }

                    {
                        put(102, null);
                        put(Integer.valueOf((int) BuildConfig.VERSION_CODE), null);
                        put(412, null);
                    }
                }, null, null, null);
            }
            lVar = f48614g;
            MethodCollector.o(982);
        }
        return lVar;
    }

    public static l a(JSONArray jSONArray) {
        String optString;
        if (jSONArray == null) {
            return null;
        }
        Map<Integer, Set<Integer>> map = null;
        Map<Integer, Set<Integer>> map2 = null;
        Map<Integer, Set<Integer>> map3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            if (!(optJSONObject == null || (optString = optJSONObject.optString(StringSet.name)) == null)) {
                if (optString.equalsIgnoreCase("other")) {
                    str = optJSONObject.optString("recovery_message", null);
                    map = a(optJSONObject);
                } else if (optString.equalsIgnoreCase("transient")) {
                    str2 = optJSONObject.optString("recovery_message", null);
                    map2 = a(optJSONObject);
                } else if (optString.equalsIgnoreCase("login_recoverable")) {
                    str3 = optJSONObject.optString("recovery_message", null);
                    map3 = a(optJSONObject);
                }
            }
        }
        return new l(map, map2, map3, str, str2, str3);
    }

    private static Map<Integer, Set<Integer>> a(JSONObject jSONObject) {
        int optInt;
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (!(optJSONObject == null || (optInt = optJSONObject.optInt("code")) == 0)) {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                        int optInt2 = optJSONArray2.optInt(i3);
                        if (optInt2 != 0) {
                            hashSet.add(Integer.valueOf(optInt2));
                        }
                    }
                }
                hashMap.put(Integer.valueOf(optInt), hashSet);
            }
        }
        return hashMap;
    }

    private l(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.f48615a = map;
        this.f48616b = map2;
        this.f48617c = map3;
        this.f48618d = str;
        this.f48619e = str2;
        this.f48620f = str3;
    }
}

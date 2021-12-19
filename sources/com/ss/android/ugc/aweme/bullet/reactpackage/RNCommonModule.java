package com.ss.android.ugc.aweme.bullet.reactpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.rn.core.BulletMethod;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.sdk.webview.m;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.bullet.BulletHostProxy;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.ss.android.ugc.aweme.utils.en;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class RNCommonModule implements com.bytedance.ies.bullet.kit.rn.core.b {
    public static final a Companion = new a((byte) 0);
    private final CommonApi sApi = ((CommonApi) RetrofitFactory.a().a(Api.f66569d).a(CommonApi.class));

    static {
        Covode.recordClassIndex(42872);
    }

    public static int com_ss_android_ugc_aweme_bullet_reactpackage_RNCommonModule_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    @Override // com.bytedance.ies.bullet.kit.rn.core.b
    public final String getName() {
        return "brn";
    }

    @Override // com.bytedance.ies.bullet.kit.rn.core.b
    public final boolean hasConstants() {
        return false;
    }

    @Override // com.bytedance.ies.bullet.kit.rn.core.b
    public final void initialize() {
    }

    @Override // com.bytedance.ies.bullet.kit.rn.core.b
    public final void onCatalystInstanceDestroy() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42873);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RNCommonModule f69519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f69520b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f69521c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ HashMap f69522d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.e f69523e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f69524f;

        static {
            Covode.recordClassIndex(42876);
        }

        d(RNCommonModule rNCommonModule, String str, Map map, HashMap hashMap, z.e eVar, List list) {
            this.f69519a = rNCommonModule;
            this.f69520b = str;
            this.f69521c = map;
            this.f69522d = hashMap;
            this.f69523e = eVar;
            this.f69524f = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f69519a.callInBackground(this.f69520b, this.f69521c, this.f69522d, this.f69523e.element, this.f69524f);
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f69530a;

        static {
            Covode.recordClassIndex(42879);
        }

        g(String str) {
            this.f69530a = str;
        }

        public final void run() {
            if (this.f69530a != null) {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.f.j()).a(this.f69530a).a();
            }
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f69513a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.kit.rn.core.a f69514b;

        static {
            Covode.recordClassIndex(42874);
        }

        b(String str, com.bytedance.ies.bullet.kit.rn.core.a aVar) {
            this.f69513a = str;
            this.f69514b = aVar;
        }

        public final void run() {
            Activity a2 = com.ss.android.ugc.aweme.bullet.b.a().a(this.f69513a);
            if (a2 == null) {
                com.bytedance.ies.bullet.kit.rn.core.a aVar = this.f69514b;
                if (aVar != null) {
                    aVar.a("illegal state to finish page.", null);
                    return;
                }
                return;
            }
            a2.finish();
            com.bytedance.ies.bullet.kit.rn.core.a aVar2 = this.f69514b;
            if (aVar2 != null) {
                aVar2.a(null, null);
            }
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RNCommonModule f69527a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f69528b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.kit.rn.core.a f69529c;

        static {
            Covode.recordClassIndex(42878);
        }

        f(RNCommonModule rNCommonModule, Map map, com.bytedance.ies.bullet.kit.rn.core.a aVar) {
            this.f69527a = rNCommonModule;
            this.f69528b = map;
            this.f69529c = aVar;
        }

        public final void run() {
            boolean z;
            int i2;
            try {
                z = ShareH5Service.a.a().a(new WeakReference<>(com.bytedance.ies.ugc.appcontext.f.j()), new JSONObject(this.f69528b));
            } catch (Exception e2) {
                e2.printStackTrace();
                z = false;
            }
            RNCommonModule rNCommonModule = this.f69527a;
            com.bytedance.ies.bullet.kit.rn.core.a aVar = this.f69529c;
            if (z) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            RNCommonModule.reportCallback$default(rNCommonModule, aVar, Integer.valueOf(i2), null, null, 12, null);
        }
    }

    @Override // com.bytedance.ies.bullet.kit.rn.core.b
    public final Map<String, Object> getConstants() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appName", com.bytedance.ies.ugc.appcontext.d.b());
        linkedHashMap.put("appVersion", com.bytedance.ies.ugc.appcontext.d.f());
        String locale = en.a().toString();
        l.b(locale, "");
        linkedHashMap.put("language", locale);
        linkedHashMap.put("app_language", SettingServiceImpl.v().h());
        String g2 = com.ss.android.ugc.aweme.language.d.g();
        l.b(g2, "");
        linkedHashMap.put("region", g2);
        linkedHashMap.put("channel", com.bytedance.ies.ugc.appcontext.d.s);
        linkedHashMap.put("isFullScreen", Boolean.valueOf(c.b.f66221a.q));
        m a2 = BulletHostProxy.b().a();
        if (a2 != null) {
            String a3 = a2.a();
            l.b(a3, "");
            linkedHashMap.put("assetSource", a3);
        }
        return linkedHashMap;
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RNCommonModule f69515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f69516b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f69517c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.kit.rn.core.a f69518d;

        static {
            Covode.recordClassIndex(42875);
        }

        c(RNCommonModule rNCommonModule, String str, String str2, com.bytedance.ies.bullet.kit.rn.core.a aVar) {
            this.f69515a = rNCommonModule;
            this.f69516b = str;
            this.f69517c = str2;
            this.f69518d = aVar;
        }

        public final void run() {
            boolean z;
            Activity a2 = com.ss.android.ugc.aweme.bullet.b.a().a(this.f69516b);
            String str = this.f69517c;
            int i2 = 1;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || a2 == null) {
                RNCommonModule.reportCallback$default(this.f69515a, this.f69518d, -1, "schema is not legal", null, 8, null);
            } else if (p.b(this.f69517c, "aweme://live/", false)) {
                Uri parse = Uri.parse(this.f69517c);
                String queryParameter = parse.getQueryParameter("room_id");
                String queryParameter2 = parse.getQueryParameter("user_id");
                if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2)) {
                    BulletHostProxy.b().a(a2, p.a(this.f69517c, "aweme", "sslocal", false));
                    RNCommonModule.reportCallback$default(this.f69515a, this.f69518d, 1, null, null, 12, null);
                    return;
                }
                RNCommonModule.reportCallback$default(this.f69515a, this.f69518d, -1, null, null, 12, null);
            } else {
                boolean a3 = t.a(t.a(), a2, com.ss.android.ugc.aweme.bullet.utils.c.b(this.f69517c));
                RNCommonModule rNCommonModule = this.f69515a;
                com.bytedance.ies.bullet.kit.rn.core.a aVar = this.f69518d;
                if (!a3) {
                    i2 = -1;
                }
                RNCommonModule.reportCallback$default(rNCommonModule, aVar, Integer.valueOf(i2), null, null, 12, null);
            }
        }
    }

    private final Map<String, Object> getAppInfo() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appName", com.bytedance.ies.ugc.appcontext.d.b());
        linkedHashMap.put("aid", Integer.valueOf(com.bytedance.ies.ugc.appcontext.d.n));
        linkedHashMap.put("appVersion", com.bytedance.ies.ugc.appcontext.d.f());
        linkedHashMap.put("versionCode", Integer.valueOf((int) com.bytedance.ies.ugc.appcontext.d.e()));
        String com_ss_android_ugc_aweme_bullet_reactpackage_RNCommonModule_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkAccessType_1 = com_ss_android_ugc_aweme_bullet_reactpackage_RNCommonModule_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkAccessType_1(com.bytedance.ies.ugc.appcontext.d.a());
        l.b(com_ss_android_ugc_aweme_bullet_reactpackage_RNCommonModule_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkAccessType_1, "");
        linkedHashMap.put("netType", com_ss_android_ugc_aweme_bullet_reactpackage_RNCommonModule_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkAccessType_1);
        String serverDeviceId = AppLog.getServerDeviceId();
        l.b(serverDeviceId, "");
        linkedHashMap.put("device_id", serverDeviceId);
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        l.b(curUserId, "");
        linkedHashMap.put("user_id", curUserId);
        linkedHashMap.put("channel", com.bytedance.ies.ugc.appcontext.d.s);
        com.ss.android.ugc.aweme.miniapp_api.services.c cVar = c.a.f109704a;
        l.b(cVar, "");
        linkedHashMap.put("ironManSupported", Boolean.valueOf(cVar.a().checkMiniAppEnable(com.bytedance.ies.ugc.appcontext.d.a())));
        return linkedHashMap;
    }

    static final class e<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RNCommonModule f69525a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.kit.rn.core.a f69526b;

        static {
            Covode.recordClassIndex(42877);
        }

        e(RNCommonModule rNCommonModule, com.bytedance.ies.bullet.kit.rn.core.a aVar) {
            this.f69525a = rNCommonModule;
            this.f69526b = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            RNCommonModule rNCommonModule = this.f69525a;
            l.b(iVar, "");
            rNCommonModule.continueWith(iVar, this.f69526b);
            return h.z.f158842a;
        }
    }

    public static String com_ss_android_ugc_aweme_bullet_reactpackage_RNCommonModule_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkAccessType_1(Context context) {
        if (!TextUtils.isEmpty(j.f107227f) && j.b() && !j.c()) {
            return j.f107227f;
        }
        String networkAccessType = NetworkUtils.getNetworkAccessType(context);
        j.f107227f = networkAccessType;
        return networkAccessType;
    }

    @BulletMethod
    public final void showToast(String str) {
        new Handler(Looper.getMainLooper()).post(new g(str));
    }

    @BulletMethod
    public final void getAppInfo(com.bytedance.ies.bullet.kit.rn.core.a aVar) {
        if (aVar != null) {
            try {
                aVar.a(null, getAppInfo());
            } catch (Exception e2) {
                e2.printStackTrace();
                aVar.a(e2.getMessage(), null);
            }
        }
    }

    @BulletMethod
    public final void getUserInfo(com.bytedance.ies.bullet.kit.rn.core.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin()) {
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g3, "");
                User curUser = g3.getCurUser();
                jSONObject.put("login", true);
                l.b(curUser, "");
                jSONObject.put("openid", curUser.getUid());
                jSONObject.put("bindPhone", curUser.getBindPhone());
                if (aVar != null) {
                    aVar.a(null, jSONObject.toString());
                    return;
                }
                return;
            }
            jSONObject.put("login", false);
            if (aVar != null) {
                aVar.a(null, jSONObject.toString());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            if (aVar != null) {
                aVar.a("service get error", null);
            }
        }
    }

    @BulletMethod
    public final void close(String str, com.bytedance.ies.bullet.kit.rn.core.a aVar) {
        if (str != null) {
            new Handler(Looper.getMainLooper()).post(new b(str, aVar));
        }
    }

    @BulletMethod
    public final void share(Map<String, ? extends Object> map, com.bytedance.ies.bullet.kit.rn.core.a aVar) {
        if (map != null) {
            new Handler(Looper.getMainLooper()).post(new f(this, map, aVar));
        }
    }

    @BulletMethod
    public final void logEventV3(String str, Map<String, ? extends Object> map) {
        if (str != null && map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            if (com.bytedance.ies.ugc.appcontext.f.j() != null) {
                try {
                    r.a(str, linkedHashMap);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ee, code lost:
        if (r4.optInt("statusCode") != 0) goto L_0x00f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void continueWith(b.i<androidx.core.g.e<java.lang.String, com.ss.android.ugc.aweme.ax.a.b>> r12, com.bytedance.ies.bullet.kit.rn.core.a r13) {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule.continueWith(b.i, com.bytedance.ies.bullet.kit.rn.core.a):void");
    }

    @BulletMethod
    public final void openSchema(String str, String str2, com.bytedance.ies.bullet.kit.rn.core.a aVar) {
        if (str != null) {
            new Handler(Looper.getMainLooper()).post(new c(this, str, str2, aVar));
        }
    }

    @BulletMethod
    public final void request(String str, Map<String, ? extends Object> map, com.bytedance.ies.bullet.kit.rn.core.a aVar) {
        if (!(str == null || str.length() == 0 || map == null || map.get("method") == null)) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            z.e eVar = new z.e();
            eVar.element = null;
            Object obj = map.get("header");
            if (!(obj instanceof HashMap)) {
                obj = null;
            }
            HashMap hashMap2 = (HashMap) obj;
            if (hashMap2 != null) {
                for (Map.Entry entry : hashMap2.entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        T t = (T) com.bytedance.ies.bullet.kit.rn.b.a.a(value);
                        if (t.length() > 0 && t != null) {
                            arrayList.add(new com.bytedance.retrofit2.client.b((String) entry.getKey(), t));
                            if (p.a("content-type", (String) entry.getKey(), true)) {
                                eVar.element = t;
                            }
                        }
                    }
                }
            }
            Object obj2 = map.get("params");
            if (!(obj2 instanceof HashMap)) {
                obj2 = null;
            }
            HashMap hashMap3 = (HashMap) obj2;
            if (hashMap3 != null) {
                for (Map.Entry entry2 : hashMap3.entrySet()) {
                    Object value2 = entry2.getValue();
                    if (value2 != null) {
                        String a2 = com.bytedance.ies.bullet.kit.rn.b.a.a(value2);
                        if (a2.length() > 0 && a2 != null) {
                            hashMap.put(entry2.getKey(), a2);
                        }
                    }
                }
            }
            i.b(new d(this, str, map, hashMap, eVar, arrayList), i.f4824a).a(new e(this, aVar), i.f4826c, null);
        }
    }

    private final h.z reportCallback(com.bytedance.ies.bullet.kit.rn.core.a aVar, Integer num, String str, Map<String, ? extends Object> map) {
        if (aVar == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", num);
        linkedHashMap.put("message", str);
        linkedHashMap.put("data", map);
        aVar.a(linkedHashMap);
        return h.z.f158842a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.core.g.e<java.lang.String, com.ss.android.ugc.aweme.ax.a.b> callInBackground(java.lang.String r13, java.util.Map<java.lang.String, ? extends java.lang.Object> r14, java.util.HashMap<java.lang.String, java.lang.Object> r15, java.lang.String r16, java.util.List<com.bytedance.retrofit2.client.b> r17) {
        /*
        // Method dump skipped, instructions count: 472
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule.callInBackground(java.lang.String, java.util.Map, java.util.HashMap, java.lang.String, java.util.List):androidx.core.g.e");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ h.z reportCallback$default(RNCommonModule rNCommonModule, com.bytedance.ies.bullet.kit.rn.core.a aVar, Integer num, String str, Map map, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            map = null;
        }
        return rNCommonModule.reportCallback(aVar, num, str, map);
    }
}

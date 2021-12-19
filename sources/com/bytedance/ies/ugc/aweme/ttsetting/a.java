package com.bytedance.ies.ugc.aweme.ttsetting;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingData;
import com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataBean;
import com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataResponse;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.d;
import com.bytedance.retrofit2.u;
import com.google.gson.f;
import com.google.gson.l;
import com.ss.android.ugc.aweme.cw.g;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static volatile TTSettingData f35186a;

    /* renamed from: b  reason: collision with root package name */
    static volatile JSONObject f35187b;

    /* renamed from: c  reason: collision with root package name */
    static boolean f35188c = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);

    /* renamed from: d  reason: collision with root package name */
    public static final a f35189d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static ArrayList<Object> f35190e;

    /* renamed from: f  reason: collision with root package name */
    private static ArrayList<b> f35191f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f35192g;

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a$a  reason: collision with other inner class name */
    public static final class C0797a implements d<l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f35193a;

        static {
            Covode.recordClassIndex(21088);
        }

        /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a$a$a  reason: collision with other inner class name */
        static final class RunnableC0798a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static final RunnableC0798a f35194a = new RunnableC0798a();

            static {
                Covode.recordClassIndex(21089);
            }

            RunnableC0798a() {
            }

            public final void run() {
                a.a();
            }
        }

        /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a$a$b */
        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0797a f35195a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ u f35196b;

            static {
                Covode.recordClassIndex(21090);
            }

            b(C0797a aVar, u uVar) {
                this.f35195a = aVar;
                this.f35196b = uVar;
            }

            public final void run() {
                T t;
                T t2;
                u uVar = this.f35196b;
                if (uVar != null) {
                    t = uVar.f42630b;
                } else {
                    t = null;
                }
                z.e eVar = this.f35195a.f35193a;
                if (t == null || (t2 = (T) t.toString()) == null) {
                    t2 = "";
                }
                eVar.element = t2;
                if (TextUtils.isEmpty(this.f35195a.f35193a.element)) {
                    a.a();
                    return;
                }
                Object a2 = new f().a((l) t, TTSettingData.class);
                h.f.b.l.a(a2, "");
                final TTSettingDataResponse tTSettingDataResponse = new TTSettingDataResponse((TTSettingData) a2, new JSONObject((String) this.f35195a.f35193a.element));
                if (a.f35188c) {
                    a.a(tTSettingDataResponse, this.f35195a.f35193a.element);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                        /* class com.bytedance.ies.ugc.aweme.ttsetting.a.C0797a.b.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f35197a;

                        static {
                            Covode.recordClassIndex(21091);
                        }

                        {
                            this.f35197a = r1;
                        }

                        public final void run() {
                            a.a(tTSettingDataResponse, this.f35197a.f35195a.f35193a.element);
                        }
                    });
                }
            }
        }

        C0797a(z.e eVar) {
            this.f35193a = eVar;
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<l> bVar, u<l> uVar) {
            g.c().submit(new b(this, uVar));
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<l> bVar, Throwable th) {
            h.f.b.l.c(bVar, "");
            h.f.b.l.c(th, "");
            if (a.f35188c) {
                g.c().submit(RunnableC0798a.f35194a);
            } else {
                a.a();
            }
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(21087);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f35199a;

        static {
            Covode.recordClassIndex(21092);
        }

        b(String str) {
            this.f35199a = str;
        }

        public final void run() {
            a.f35186a = (TTSettingData) new f().a(this.f35199a, TTSettingData.class);
            a.f35187b = new JSONObject(this.f35199a);
            if (a.f35188c) {
                a.b();
            } else {
                new Handler(Looper.getMainLooper()).post(AnonymousClass1.f35200a);
            }
        }
    }

    public static void a() {
        String string = Keva.getRepo("TTSettingData").getString("settingData", "");
        if (TextUtils.isEmpty(string)) {
            c();
            return;
        }
        h.f.b.l.a((Object) string, "");
        a(string);
    }

    private static void c() {
        f35192g = true;
        ArrayList<Object> arrayList = f35190e;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
                new Exception("no data to show");
            }
        }
        f35190e = null;
        ArrayList<b> arrayList2 = f35191f;
        if (arrayList2 != null) {
            Iterator<T> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().a(new Exception("no data to show"));
            }
        }
        f35191f = null;
    }

    public static void b() {
        TTSettingDataBean data;
        ArrayList<Object> arrayList = f35190e;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
                TTSettingData tTSettingData = f35186a;
                if (!(tTSettingData == null || (data = tTSettingData.getData()) == null)) {
                    data.getApp();
                }
            }
        }
        f35190e = null;
        ArrayList<b> arrayList2 = f35191f;
        if (arrayList2 != null) {
            Iterator<T> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().a(a(f35187b));
            }
        }
        f35191f = null;
    }

    private static void a(String str) {
        g.c().submit(new b(str));
    }

    private static JSONObject a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("app");
    }

    public static void a(b bVar) {
        h.f.b.l.c(bVar, "");
        JSONObject jSONObject = f35187b;
        if (jSONObject != null) {
            bVar.a(a(jSONObject));
        } else if (f35192g) {
            bVar.a(new Exception("no data to show"));
        } else {
            ArrayList<b> arrayList = f35191f;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            f35191f = arrayList;
            arrayList.add(bVar);
        }
    }

    public static void a(TTSettingDataResponse tTSettingDataResponse, String str) {
        f35186a = tTSettingDataResponse.getTtSettingData();
        f35187b = tTSettingDataResponse.getTtSettingDataJSONObject();
        Keva repo = Keva.getRepo("TTSettingData");
        if (!TextUtils.isEmpty(str)) {
            repo.storeString("settingData", str);
            repo.storeLong("last_get_setting_time", System.currentTimeMillis());
            b();
            return;
        }
        String string = repo.getString("settingData", "");
        if (TextUtils.isEmpty(string)) {
            c();
            return;
        }
        h.f.b.l.a((Object) string, "");
        a(string);
    }
}

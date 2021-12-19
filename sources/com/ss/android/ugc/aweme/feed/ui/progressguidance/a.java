package com.ss.android.ugc.aweme.feed.ui.progressguidance;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.api.UserGrowthDataApi;
import com.ss.android.ugc.aweme.feed.model.NewUserProgressModel;
import com.ss.android.ugc.aweme.utils.hk;
import f.a.b.b;
import f.a.z;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Keva f94980a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<String, Object> f94981b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap<String, Object> f94982c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<String, Object> f94983d;

    /* renamed from: e  reason: collision with root package name */
    public static final HashSet<Integer> f94984e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    public static NewUserProgressModel.ProgressBarInfo f94985f;

    /* renamed from: g  reason: collision with root package name */
    public static NewUserProgressModel.SwipeUpText f94986g;

    /* renamed from: h  reason: collision with root package name */
    public static String f94987h;

    /* renamed from: i  reason: collision with root package name */
    public static int f94988i;

    /* renamed from: j  reason: collision with root package name */
    public static int f94989j;

    /* renamed from: k  reason: collision with root package name */
    public static String f94990k = "";

    /* renamed from: l  reason: collision with root package name */
    public static b f94991l;

    /* renamed from: m  reason: collision with root package name */
    public static final C2284a f94992m = new C2284a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.progressguidance.a$a  reason: collision with other inner class name */
    public static final class C2284a {
        static {
            Covode.recordClassIndex(60241);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.ui.progressguidance.a$a$a  reason: collision with other inner class name */
        public static final class C2285a implements z<NewUserProgressModel> {
            static {
                Covode.recordClassIndex(60242);
            }

            @Override // f.a.z
            public final void onComplete() {
            }

            @Override // f.a.z
            public final void onError(Throwable th) {
                l.d(th, "");
            }

            C2285a() {
            }

            @Override // f.a.z
            public final void onSubscribe(b bVar) {
                l.d(bVar, "");
                a.f94991l = bVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.z
            public final /* synthetic */ void onNext(NewUserProgressModel newUserProgressModel) {
                NewUserProgressModel newUserProgressModel2 = newUserProgressModel;
                l.d(newUserProgressModel2, "");
                a.f94980a.storeBoolean("response_received", true);
                NewUserProgressModel.ProgressBarInfo progressBarInfo = newUserProgressModel2.getProgressBarInfo();
                NewUserProgressModel.SwipeUpText swipeUpText = newUserProgressModel2.getSwipeUpText();
                String b2 = new f().b(progressBarInfo);
                String b3 = new f().b(swipeUpText);
                l.b(b3, "");
                a.f94990k = b3;
                if (hk.a(b2)) {
                    a.f94985f = (NewUserProgressModel.ProgressBarInfo) new f().a(b2, NewUserProgressModel.ProgressBarInfo.class);
                    a.f94980a.storeBoolean("first_init", true);
                    a.f94980a.storeString("progress_bar_data", b2);
                }
                if (hk.a(a.f94990k)) {
                    a.f94986g = (NewUserProgressModel.SwipeUpText) new f().a(a.f94990k, NewUserProgressModel.SwipeUpText.class);
                }
                a.f94980a.storeBoolean("response_caching_complete", true);
            }
        }

        private C2284a() {
        }

        public static void a() {
            a.f94989j = 0;
            a.f94984e.clear();
        }

        public static String d() {
            NewUserProgressModel.SwipeUpText swipeUpText = a.f94986g;
            if (swipeUpText != null) {
                return swipeUpText.getSubTitle();
            }
            return null;
        }

        public static String c() {
            String title;
            NewUserProgressModel.SwipeUpText swipeUpText = a.f94986g;
            if (swipeUpText == null || (title = swipeUpText.getTitle()) == null) {
                return null;
            }
            return p.b(title, "%d", "20", true);
        }

        public static void b() {
            if (!a.f94980a.contains("response_caching_complete")) {
                ((UserGrowthDataApi.NewUserProgressDataApi) RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(UserGrowthDataApi.NewUserProgressDataApi.class)).getGuidanceProgressBarData().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new C2285a());
            }
        }

        public /* synthetic */ C2284a(byte b2) {
            this();
        }

        public static void a(double d2) {
            if (d2 > 2.0d) {
                if (a.f94988i <= 100) {
                    a.f94988i += 5;
                }
                a.f94981b.put(a.f94987h, Integer.valueOf(a.f94988i));
                a.f94980a.storeString("progress_map_key", new JSONObject(a.f94981b).toString());
            }
            a();
        }

        public static void a(JSONObject jSONObject, HashMap<String, Object> hashMap) {
            Iterator<String> keys = jSONObject.keys();
            l.b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
        }

        public static void a(int i2, double d2) {
            if (i2 < a.f94989j || a.f94988i > 100) {
                a.f94989j = i2;
                return;
            }
            a.f94989j = i2;
            if (d2 > 2.0d && !a.f94984e.contains(Integer.valueOf(i2))) {
                a.f94984e.add(Integer.valueOf(i2));
                if (a.f94988i <= 100) {
                    a.f94988i += 5;
                }
                a.f94981b.put(a.f94987h, Integer.valueOf(a.f94988i));
                a.f94980a.storeString("progress_map_key", new JSONObject(a.f94981b).toString());
            }
        }
    }

    public static final void a() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        l.b(curUserId, "");
        f94987h = curUserId;
        Keva keva = f94980a;
        keva.erase("progress_bar_data");
        keva.erase("response_caching_complete");
        keva.erase("response_received");
        C2284a.b();
        HashMap<String, Object> hashMap = f94981b;
        hashMap.put(f94987h, 5);
        f94988i = 5;
        keva.storeString("progress_map_key", new JSONObject(hashMap).toString());
        keva.storeBoolean("progress_dismissed_by_user", false);
        keva.storeInt("milestone_progress_reported", -1);
    }

    static {
        Covode.recordClassIndex(60240);
        Keva repo = Keva.getRepo("guidance_progress_bar");
        f94980a = repo;
        HashMap<String, Object> hashMap = new HashMap<>();
        f94981b = hashMap;
        HashMap<String, Object> hashMap2 = new HashMap<>();
        f94982c = hashMap2;
        HashMap<String, Object> hashMap3 = new HashMap<>();
        f94983d = hashMap3;
        f94987h = "0";
        f94988i = 5;
        if (repo.contains("progress_map_key")) {
            C2284a.a(new JSONObject(repo.getString("progress_map_key", "")), hashMap);
        }
        if (repo.contains("progress_dismiss_key")) {
            C2284a.a(new JSONObject(repo.getString("progress_dismiss_key", "")), hashMap2);
        }
        if (repo.contains("progress_milestone_key")) {
            C2284a.a(new JSONObject(repo.getString("progress_milestone_key", "")), hashMap3);
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        l.b(curUserId, "");
        f94987h = curUserId;
        if (hashMap.containsKey(curUserId)) {
            Object obj = hashMap.get(f94987h);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            f94988i = ((Integer) obj).intValue();
        } else {
            hashMap.put(f94987h, 5);
            f94988i = 5;
        }
        if (hashMap2.containsKey(f94987h)) {
            Object obj2 = hashMap2.get(f94987h);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            repo.storeBoolean("progress_dismissed_by_user", ((Boolean) obj2).booleanValue());
        } else {
            repo.storeBoolean("progress_dismissed_by_user", false);
        }
        if (hashMap3.containsKey(f94987h)) {
            Object obj3 = hashMap3.get(f94987h);
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            repo.storeInt("milestone_progress_reported", ((Integer) obj3).intValue());
        } else {
            repo.storeInt("milestone_progress_reported", -1);
        }
        if (repo.contains("progress_bar_data")) {
            f94985f = (NewUserProgressModel.ProgressBarInfo) new f().a(repo.getString("progress_bar_data", ""), NewUserProgressModel.ProgressBarInfo.class);
        }
    }
}

package com.ss.android.ugc.aweme.commercialize.profile.talent;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.c.h.a.k;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.commercialize.log.i;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ProfileAdTalentShareApi;
import com.ss.android.ugc.aweme.commercialize.profile.talent.a.d;
import com.ss.android.ugc.aweme.commercialize.util.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class TalentAdRevenueShareServiceImpl implements ITalentAdRevenueShareService {

    /* renamed from: f  reason: collision with root package name */
    public static final a f75249f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<String> f75250a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f75251b;

    /* renamed from: c  reason: collision with root package name */
    public int f75252c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f75253d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f75254e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f75255g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f75256h;

    /* renamed from: i  reason: collision with root package name */
    private String f75257i;

    /* renamed from: j  reason: collision with root package name */
    private com.bytedance.ies.ugc.aweme.rich.a.a.b f75258j;

    static {
        Covode.recordClassIndex(46435);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46436);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final List<String> b() {
        return this.f75250a;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final boolean c() {
        return this.f75255g;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final int a() {
        int a2 = SettingsManager.a().a("creator_monetization_ad_upload_item_threshold", 5);
        if (a2 < 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void d() {
        this.f75250a.clear();
        this.f75252c = -1;
        this.f75253d = -1;
        this.f75254e = false;
        this.f75255g = false;
        this.f75257i = null;
        com.bytedance.ies.ugc.aweme.rich.a.a.a.f35121a.b(this.f75258j);
    }

    public static ITalentAdRevenueShareService e() {
        MethodCollector.i(1700);
        Object a2 = com.ss.android.ugc.b.a(ITalentAdRevenueShareService.class, false);
        if (a2 != null) {
            ITalentAdRevenueShareService iTalentAdRevenueShareService = (ITalentAdRevenueShareService) a2;
            MethodCollector.o(1700);
            return iTalentAdRevenueShareService;
        }
        if (com.ss.android.ugc.b.au == null) {
            synchronized (ITalentAdRevenueShareService.class) {
                try {
                    if (com.ss.android.ugc.b.au == null) {
                        com.ss.android.ugc.b.au = new TalentAdRevenueShareServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1700);
                    throw th;
                }
            }
        }
        TalentAdRevenueShareServiceImpl talentAdRevenueShareServiceImpl = (TalentAdRevenueShareServiceImpl) com.ss.android.ugc.b.au;
        MethodCollector.o(1700);
        return talentAdRevenueShareServiceImpl;
    }

    public static final class c implements com.bytedance.ies.ugc.aweme.rich.a.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TalentAdRevenueShareServiceImpl f75262a;

        static {
            Covode.recordClassIndex(46438);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(TalentAdRevenueShareServiceImpl talentAdRevenueShareServiceImpl) {
            this.f75262a = talentAdRevenueShareServiceImpl;
        }

        @Override // com.bytedance.ies.ugc.aweme.rich.a.a.b
        public final void a(String str, String str2, String str3, JSONObject jSONObject) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(jSONObject, "");
            this.f75262a.a(str3, jSONObject);
        }
    }

    public static final class b implements k<d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TalentAdRevenueShareServiceImpl f75259a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f75260b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f75261c;

        static {
            Covode.recordClassIndex(46437);
        }

        @Override // com.google.c.h.a.k
        public final void onFailure(Throwable th) {
            l.d(th, "");
            this.f75259a.f75252c = this.f75260b;
            this.f75259a.f75254e = false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.c.h.a.k
        public final /* synthetic */ void onSuccess(d dVar) {
            Aweme aweme;
            AwemeRawAd awemeRawAd;
            d dVar2 = dVar;
            this.f75259a.f75254e = false;
            if (dVar2 != null) {
                this.f75259a.f75252c = this.f75260b;
                this.f75259a.f75253d = this.f75260b;
                this.f75259a.f75251b = dVar2.f75267a;
                List<com.ss.android.ugc.aweme.commercialize.profile.talent.a.b> list = dVar2.f75268b;
                if (list != null) {
                    for (com.ss.android.ugc.aweme.commercialize.profile.talent.a.b bVar : list) {
                        if (!(bVar == null || (aweme = bVar.f75265b) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
                            ArrayList<String> arrayList = this.f75259a.f75250a;
                            l.b(awemeRawAd, "");
                            arrayList.add(awemeRawAd.getCreativeIdStr());
                        }
                    }
                }
            }
            this.f75261c.a(dVar2);
        }

        b(TalentAdRevenueShareServiceImpl talentAdRevenueShareServiceImpl, int i2, d dVar) {
            this.f75259a = talentAdRevenueShareServiceImpl;
            this.f75260b = i2;
            this.f75261c = dVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void a(String str) {
        if (str != null && l.a(n.i((List) this.f75250a), (Object) str)) {
            this.f75250a.remove(str);
            this.f75256h = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void a(AwemeRawAd awemeRawAd) {
        l.d(awemeRawAd, "");
        if (this.f75255g) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("filter_words", "not interested");
            jSONObject2.put("unified_dislike", 1);
            jSONObject.put("ad_extra_data", jSONObject2);
            i.a aVar = new i.a();
            aVar.f74815a = awemeRawAd;
            aVar.f74818d = jSONObject;
            e.a("draw_ad", "dislike", aVar.a(), awemeRawAd);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "dislike", awemeRawAd).a("filter_words", "not interested").a("unified_dislike", 1).c();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final boolean a(int i2) {
        int i3;
        int i4 = this.f75251b;
        if (i4 <= 0) {
            return false;
        }
        int i5 = this.f75252c;
        if (i5 < 0) {
            return true;
        }
        if (i2 <= i5) {
            return false;
        }
        if (i5 != this.f75253d || this.f75256h) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (i2 - i5 >= i4 + i3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void a(String str, AwemeRawAd awemeRawAd) {
        l.d(str, "");
        l.d(awemeRawAd, "");
        i.a aVar = new i.a();
        aVar.f74815a = awemeRawAd;
        aVar.f74816b = str;
        e.a("draw_ad", "otherclick", aVar.a(), awemeRawAd);
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", awemeRawAd).b("refer", str).c();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (str != null && jSONObject != null) {
            try {
                if (TextUtils.isEmpty(this.f75257i)) {
                    return;
                }
                if (this.f75250a.contains(str)) {
                    String optString = jSONObject.optString("ad_extra_data");
                    if (TextUtils.isEmpty(optString)) {
                        jSONObject2 = new JSONObject();
                    } else {
                        jSONObject2 = new JSONObject(optString);
                    }
                    jSONObject2.put("creator_uid", this.f75257i);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void a(JSONObject jSONObject, AwemeRawAd awemeRawAd) {
        String str;
        String str2;
        String str3;
        String str4 = "";
        l.d(jSONObject, str4);
        l.d(awemeRawAd, str4);
        if (awemeRawAd.getCreativeIdStr() != null && l.a((Object) awemeRawAd.getCreativeIdStr(), n.i((List) this.f75250a))) {
            int i2 = 0;
            if (jSONObject.opt("reason_id") != null) {
                i2 = jSONObject.optInt("reason_id");
            }
            if (jSONObject.opt("report_from") != null) {
                str = jSONObject.optString("report_from");
                l.b(str, str4);
            } else {
                str = str4;
            }
            if (jSONObject.opt("screenshot_uri") != null) {
                str2 = jSONObject.optString("screenshot_uri");
                l.b(str2, str4);
            } else {
                str2 = str4;
            }
            if (jSONObject.opt("description") != null) {
                str3 = jSONObject.optString("description");
                l.b(str3, str4);
            } else {
                str3 = str4;
            }
            int hashCode = str.hashCode();
            if (hashCode != -1755408457) {
                if (hashCode != -326696768) {
                    if (hashCode == 1820422063 && str.equals("creative")) {
                        str4 = "share_ad";
                    }
                } else if (str.equals("long_press")) {
                    str4 = "draw_ad";
                }
            } else if (str.equals("landing_page")) {
                str4 = "landing_ad";
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("reason_id", i2);
            jSONObject3.put("screenshot_url", str2);
            jSONObject3.put("description", str3);
            jSONObject2.put("ad_extra_data", jSONObject3);
            i.a aVar = new i.a();
            aVar.f74815a = awemeRawAd;
            aVar.f74818d = jSONObject2;
            e.a(str4, "report", aVar.a(), awemeRawAd);
            com.bytedance.ies.ugc.aweme.rich.a.a.a(str4, "report", awemeRawAd).a("reason_id", Integer.valueOf(i2)).a("screenshot_url", str2).a("description", str3).c();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void a(boolean z, String str) {
        this.f75255g = z;
        this.f75257i = str;
        this.f75258j = new c(this);
        com.bytedance.ies.ugc.aweme.rich.a.a.a.f35121a.a(this.f75258j);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void a(String str, List<String> list, int i2, com.ss.android.ugc.aweme.commercialize.profile.talent.a.c cVar, d dVar) {
        int i3;
        l.d(str, "");
        l.d(list, "");
        l.d(cVar, "");
        l.d(dVar, "");
        if (!this.f75254e) {
            String str2 = "[";
            for (String str3 : list) {
                if (true ^ l.a((Object) str2, (Object) "[")) {
                    str2 = str2 + ",";
                }
                if (!TextUtils.isEmpty(str3)) {
                    str2 = str2 + str3;
                }
            }
            String str4 = str2 + "]";
            Integer num = null;
            if (cVar == com.ss.android.ugc.aweme.commercialize.profile.talent.a.c.PROFILE_AD_REQUEST_SOURCE_LOAD_MORE && (i3 = this.f75253d) >= 0) {
                num = Integer.valueOf(i2 - i3);
            }
            this.f75254e = true;
            this.f75256h = false;
            Object a2 = RetrofitFactory.a().b(ProfileAdTalentShareApi.a.f75247a).d().a(ProfileAdTalentShareApi.class);
            l.b(a2, "");
            com.google.c.h.a.l.a(((ProfileAdTalentShareApi) a2).getTalentProfileAd(str, str4, i2, cVar.getSOURCE(), num), new b(this, i2, dVar), m.f68150a);
        }
    }
}

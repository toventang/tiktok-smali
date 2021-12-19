package com.ss.android.ad.splash.core.e;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ad.splash.c.a;
import com.ss.android.ad.splash.core.e.n;
import com.ss.android.ad.splash.core.h;
import com.ss.android.ad.splash.f.j;
import com.ss.android.ad.splash.f.l;
import com.ss.android.ad.splash.q;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b extends l implements a, Cloneable {
    public q A;
    public a B;
    public boolean C = false;
    public String D;
    public String E;
    public JSONObject F;
    public int G = 0;
    public String H;
    public int I = 1;
    public int J = 0;
    public g K;
    public m L;
    public String M;
    public boolean N = false;
    public int O = 0;
    public int P = 0;
    public int Q = Integer.MAX_VALUE;
    public int R = 0;
    public String S;
    public int T;
    public int U = 0;
    public String V;
    public long W;
    private long Y;
    private long Z;

    /* renamed from: a  reason: collision with root package name */
    public f f58438a;
    private long aa;
    private long ab;
    private int ac;
    private int ad;
    private int ae;
    private long af;
    private int ag;
    private int ah = 0;
    private boolean ai = false;
    private int aj;
    private o ak;
    private JSONObject al;
    private int am = 0;
    private String an;
    private i ao;
    private e ap;
    private String aq = "web";
    private int ar = 0;
    private String as;
    private String at;
    private String au;
    private String av;

    /* renamed from: b  reason: collision with root package name */
    public long f58439b;

    /* renamed from: c  reason: collision with root package name */
    public int f58440c;

    /* renamed from: d  reason: collision with root package name */
    public long f58441d;

    /* renamed from: e  reason: collision with root package name */
    public String f58442e;

    /* renamed from: f  reason: collision with root package name */
    public String f58443f;

    /* renamed from: g  reason: collision with root package name */
    public String f58444g;

    /* renamed from: h  reason: collision with root package name */
    public String f58445h;

    /* renamed from: i  reason: collision with root package name */
    public int f58446i;

    /* renamed from: j  reason: collision with root package name */
    public String f58447j;

    /* renamed from: k  reason: collision with root package name */
    public String f58448k;

    /* renamed from: l  reason: collision with root package name */
    public String f58449l;

    /* renamed from: m  reason: collision with root package name */
    public int f58450m;
    public int n;
    public int o;
    public final List<b> p = new ArrayList();
    public int q = 0;
    public p r;
    public p s;
    public boolean t = false;
    public int u = 0;
    public List<String> v;
    public List<String> w;
    public List<String> x;
    public List<String> y;
    public int z;

    static {
        Covode.recordClassIndex(36282);
    }

    @Override // com.ss.android.ad.splash.c.a
    public final o B() {
        return this.ak;
    }

    @Override // com.ss.android.ad.splash.c.a
    public final String E() {
        return this.at;
    }

    @Override // com.ss.android.ad.splash.c.a
    public final long f() {
        return this.f58439b;
    }

    @Override // com.ss.android.ad.splash.c.a
    public final long l() {
        return this.f58441d;
    }

    @Override // com.ss.android.ad.splash.c.a
    public final String m() {
        return this.f58447j;
    }

    @Override // com.ss.android.ad.splash.c.a
    public final int q() {
        return this.q;
    }

    @Override // com.ss.android.ad.splash.c.a
    public final List<String> s() {
        return this.y;
    }

    @Override // com.ss.android.ad.splash.c.a
    public final String t() {
        return this.H;
    }

    @Override // com.ss.android.ad.splash.core.e.l
    public final String x() {
        return this.E;
    }

    @Override // com.ss.android.ad.splash.c.a
    public final int y() {
        return this.am;
    }

    @Override // com.ss.android.ad.splash.c.a
    public final String z() {
        return this.an;
    }

    @Override // com.ss.android.ad.splash.c.a
    public final boolean C() {
        if (this.ar == 1) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (this.ac == 1) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (this.G == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ad.splash.core.e.l
    public int hashCode() {
        return super.hashCode();
    }

    public final boolean v() {
        if (this.ah == 1) {
            return true;
        }
        return false;
    }

    public final boolean A() {
        if (this.G == 1 && this.q == 2) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        int i2 = this.Q;
        if (i2 != 0 && this.R >= i2) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            b bVar = (b) super.clone();
            return bVar == null ? this : bVar;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final long d() {
        return this.f58439b + (this.Z * 1000);
    }

    public final long e() {
        return this.f58439b + (this.Z * 1000) + (this.Y * 1000);
    }

    public final boolean i() {
        if (this.G == 2) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (!h() || this.q != 0) {
            return false;
        }
        return true;
    }

    public final boolean k() {
        if (!h() || this.q != 2) {
            return false;
        }
        return true;
    }

    public final int p() {
        m mVar = this.L;
        if (mVar != null) {
            return mVar.f58505h;
        }
        return 0;
    }

    @Override // com.ss.android.ad.splash.c.a
    public final boolean r() {
        if (this.q == 2) {
            return true;
        }
        return false;
    }

    private n F() {
        n.a aVar = new n.a();
        aVar.f58513a = this.f58442e;
        aVar.f58514b = this.f58444g;
        aVar.f58515c = this.f58448k;
        aVar.f58516d = this.w;
        aVar.f58517e = this.v;
        return new n(aVar);
    }

    public final boolean a() {
        if (b() == 2000) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!TextUtils.isEmpty(this.f58442e) || !TextUtils.isEmpty(this.f58444g) || !TextUtils.isEmpty(this.f58448k)) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.aa > ((long) p()) * 1000) {
            return true;
        }
        return false;
    }

    public final long c() {
        long j2 = this.aa;
        if (j2 < 1000) {
            return 1000;
        }
        if (j2 > 17000) {
            return 17000;
        }
        return j2;
    }

    public final boolean u() {
        long currentTimeMillis = System.currentTimeMillis();
        if (h.ak && j.f() != -1) {
            currentTimeMillis = j.f();
        }
        if (currentTimeMillis < d() || currentTimeMillis > e()) {
            return false;
        }
        return true;
    }

    public final int b() {
        if (this.f58441d <= 0) {
            return 4003;
        }
        int i2 = this.q;
        if (!(i2 == 0 || i2 == 1)) {
            if (i2 == 2) {
                p pVar = this.r;
                if (pVar == null || !pVar.a()) {
                    return 4002;
                }
                int i3 = this.G;
                if (i3 == 2) {
                    if (this.al == null) {
                        return 4005;
                    }
                    return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                } else if (i3 != 3) {
                    return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                } else {
                    p pVar2 = this.s;
                    if (pVar2 == null || !pVar2.a()) {
                        return 4006;
                    }
                    return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                }
            } else if (i2 == 3) {
                f fVar = this.f58438a;
                if (fVar == null || !fVar.a()) {
                    return 4001;
                }
                p pVar3 = this.r;
                if (pVar3 == null || !pVar3.a()) {
                    return 4002;
                }
                return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            } else if (i2 != 4) {
                return 4000;
            }
        }
        f fVar2 = this.f58438a;
        if (fVar2 == null || !fVar2.a()) {
            return 4001;
        }
        return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    }

    public final q w() {
        q.a aVar = new q.a();
        aVar.f59016a = this.f58441d;
        aVar.f59017b = this.f58447j;
        aVar.f59018c = this.ai;
        aVar.f59019d = this.f58449l;
        aVar.f59020e = this.z;
        aVar.f59021f = this.ag;
        aVar.f59022g = this.ae;
        aVar.f59024i = this.A;
        aVar.f59023h = this.B;
        aVar.f59025j = this.ap;
        aVar.f59026k = F();
        aVar.f59027l = this.at;
        aVar.f59028m = this.au;
        aVar.n = this.av;
        return aVar.a();
    }

    public String toString() {
        return "SplashAd{mSplashAdImageInfo=" + this.f58438a + ", mFetchTime=" + this.f58439b + ", mExpireSeconds=" + this.Y + ", mDisplayAfter=" + this.Z + ", mDisplayTimeMs=" + this.aa + ", mBannerMode=" + this.ac + ", mRepeat=" + this.ad + ", mId=" + this.f58441d + ", mOpenUrl='" + this.f58442e + '\'' + ", mAppOpenUrl='" + this.f58443f + '\'' + ", mMicroAppOpenUrl='" + this.f58444g + '\'' + ", mBtnText='" + this.f58445h + '\'' + ", mOpenExtraSize=" + this.f58446i + ", mLogExtra='" + this.f58447j + '\'' + ", mWebUrl='" + this.f58448k + '\'' + ", mWebTitle='" + this.f58449l + '\'' + ", mImageMode=" + this.f58450m + ", mClickBtnShow=" + this.n + ", mSkipBtnShow=" + this.o + ", mTimeGapSplash=" + this.p + ", mSplashId=" + this.af + ", mInterceptedFlag=" + this.ag + ", mSplashType=" + this.q + ", mSplashVideoInfo=" + this.r + ", mHasCallBack=" + this.t + ", mSplashAdLoadType=" + this.u + ", mWebUrlList=" + this.v + ", mOpenUrlList=" + this.w + ", mTrackUrlList=" + this.x + ", mClickTrackUrlList=" + this.y + ", mIsForbidJump=" + this.ai + ", mOrientation=" + this.z + ", mCanvasInfo=" + this.A + ", mShareAdInfo=" + this.B + ", mRealTimeShow=" + this.C + ", mSplashOpenNewUIExperiment=" + this.ah + ", mSplashShowType=" + this.G + ", mSplashAdId=" + this.H + ", mPredownload=" + this.I + ", mMicroPreload=" + this.J + ", mPreloadWeb=" + this.am + '}';
    }

    private void m(JSONObject jSONObject) {
        this.ak = o.a(jSONObject);
    }

    private void n(JSONObject jSONObject) {
        this.ao = i.a(jSONObject);
    }

    private void f(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("share_info");
        if (optJSONObject != null) {
            this.B = new a(optJSONObject);
        }
    }

    private void h(JSONObject jSONObject) {
        this.U = jSONObject.optInt("swipe_up_type", 0);
    }

    private void l(JSONObject jSONObject) {
        if (this.G == 2) {
            this.al = jSONObject.optJSONObject("search_info");
        }
    }

    private void c(JSONObject jSONObject) {
        this.at = jSONObject.optString("native_site_config");
        this.au = jSONObject.optString("native_site_ad_info");
        this.av = jSONObject.optString("native_site_custom_data");
    }

    private void k(JSONObject jSONObject) {
        this.K = g.a(jSONObject.optJSONObject("label_info"));
        this.L = m.a(jSONObject.optJSONObject("skip_info"));
    }

    @Override // com.ss.android.ad.splash.core.e.l
    public boolean equals(Object obj) {
        if (!h.Y) {
            return super.equals(obj);
        }
        if ((obj instanceof b) && ((b) obj).f58441d == this.f58441d) {
            return true;
        }
        return false;
    }

    private void d(JSONObject jSONObject) {
        this.as = jSONObject.optString("site_id", "");
        if ("canvas".equalsIgnoreCase(jSONObject.optString("style")) && !l.a(this.as)) {
            q qVar = new q();
            this.A = qVar;
            qVar.f58532a = this.as;
        }
    }

    private void g(JSONObject jSONObject) {
        String optString = jSONObject.optString("download_url", "");
        String optString2 = jSONObject.optString("package", "");
        this.ap = e.a(this.aq, optString, jSONObject.optString("app_name", ""), optString2, jSONObject.optString("avatar_url", ""));
    }

    private void j(JSONObject jSONObject) {
        int i2 = this.q;
        if (i2 == 3 || i2 == 2) {
            p pVar = new p();
            this.r = pVar;
            try {
                pVar.a(jSONObject.getJSONObject("video_info"));
                if (jSONObject.has("extra_video_info")) {
                    p pVar2 = new p();
                    this.s = pVar2;
                    pVar2.a(jSONObject.getJSONObject("extra_video_info"));
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        this.F = jSONObject;
        b(jSONObject);
        d(jSONObject);
        b(jSONObject, this.f58439b);
        e(jSONObject);
        f(jSONObject);
        j(jSONObject);
        i(jSONObject);
        k(jSONObject);
        l(jSONObject);
        n(jSONObject);
        m(jSONObject);
        g(jSONObject);
        h(jSONObject);
        c(jSONObject);
    }

    private void e(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("track_url_list");
        if (!(optJSONArray == null || optJSONArray.length() == 0)) {
            this.x = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    this.x.add(optJSONArray.getString(i2));
                } catch (Exception unused) {
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("click_track_url_list");
        if (!(optJSONArray2 == null || optJSONArray2.length() == 0)) {
            this.y = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                try {
                    this.y.add(optJSONArray2.getString(i3));
                } catch (Exception unused2) {
                }
            }
        }
    }

    private void i(JSONObject jSONObject) {
        if (this.q == 4) {
            if (jSONObject.has("web_url_list")) {
                this.v = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("web_url_list");
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    this.v.add(optJSONArray.optString(i2));
                }
            }
            if (jSONObject.has("open_url_list")) {
                this.w = new ArrayList();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("open_url_list");
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    this.w.add(optJSONArray2.optString(i3));
                }
            }
        }
    }

    private void b(JSONObject jSONObject) {
        boolean z2;
        boolean z3;
        this.f58441d = jSONObject.optLong("id");
        this.f58448k = jSONObject.optString("web_url");
        this.f58442e = jSONObject.optString("open_url");
        this.f58443f = jSONObject.optString("app_open_url");
        this.f58444g = jSONObject.optString("mp_url");
        this.f58446i = jSONObject.optInt("open_extra_size");
        this.f58447j = jSONObject.optString("log_extra");
        this.t = jSONObject.optBoolean("has_callback");
        this.f58438a = f.a(jSONObject.optJSONObject("image_info"));
        this.aa = jSONObject.optLong("display_time_ms");
        this.ad = jSONObject.optInt("repeat");
        this.ac = jSONObject.optInt("banner_mode");
        this.f58445h = jSONObject.optString("button_text");
        this.u = jSONObject.optInt("splash_load_type", 0);
        this.f58450m = jSONObject.optInt("image_mode", 0);
        this.z = jSONObject.optInt("orientation");
        this.f58449l = jSONObject.optString("web_title");
        this.Z = jSONObject.optLong("display_after", 0);
        this.Y = jSONObject.optLong("expire_seconds");
        this.n = jSONObject.optInt("click_btn", 0);
        this.o = jSONObject.optInt("skip_btn", 1);
        this.af = jSONObject.optLong("splash_id");
        this.ag = jSONObject.optInt("intercept_flag");
        if (jSONObject.optInt("forbid_jump") == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.ai = z2;
        this.q = jSONObject.optInt("splash_type");
        this.ae = jSONObject.optInt("ad_lp_style");
        this.f58440c = jSONObject.optInt("show_expected");
        this.ah = jSONObject.optInt("skip_btn_style", 0);
        this.D = jSONObject.optString("report_key");
        this.E = jSONObject.optString("item_key");
        this.G = jSONObject.optInt("splash_show_type", 0);
        this.H = jSONObject.optString("splash_ad_id", "");
        this.I = jSONObject.optInt("predownload", 1);
        this.J = jSONObject.optInt("preload_mp", 0);
        this.M = jSONObject.optString("predownload_text");
        if (jSONObject.optInt("enable_splash_count_down", 0) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.N = z3;
        this.O = jSONObject.optInt("sound_control", 0);
        this.ab = jSONObject.optLong("show_sound_time", 0);
        this.P = jSONObject.optInt("enable_open_type", 0);
        this.am = jSONObject.optInt("preload_web", 0);
        this.an = jSONObject.optString("web_channel_name");
        this.aj = jSONObject.optInt("brand_safety", 1);
        this.V = jSONObject.optString("enter_app_text");
        this.aq = jSONObject.optString(StringSet.type, "web");
        this.ar = jSONObject.optInt("ad_style", 0);
        this.Q = jSONObject.optInt("repeat_times", Integer.MAX_VALUE);
        this.S = jSONObject.optString("action");
        this.T = jSONObject.optInt("logo_color", 0);
        long j2 = this.f58439b;
        if (j2 <= 0) {
            this.f58439b = jSONObject.optLong("model_fetch_time", 0);
            return;
        }
        try {
            this.F.put("model_fetch_time", j2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final void a(JSONObject jSONObject, long j2) {
        if (j2 > 0) {
            this.f58439b = j2;
        }
        a(jSONObject);
    }

    private void b(JSONObject jSONObject, long j2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("interval_creative");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    b bVar = new b();
                    bVar.a(optJSONObject, j2);
                    this.p.add(bVar);
                }
            }
        }
    }

    public final void a(JSONObject jSONObject, long j2, boolean z2) {
        boolean z3;
        boolean z4;
        if (j2 > 0) {
            this.f58439b = j2;
        }
        this.F = jSONObject;
        this.f58441d = jSONObject.optLong("id");
        this.f58448k = jSONObject.optString("web_url");
        this.f58442e = jSONObject.optString("open_url");
        this.f58443f = jSONObject.optString("app_open_url");
        this.f58444g = jSONObject.optString("mp_url");
        this.f58446i = jSONObject.optInt("open_extra_size");
        this.f58447j = jSONObject.optString("log_extra");
        this.t = jSONObject.optBoolean("has_callback");
        this.f58438a = f.a(jSONObject.optJSONObject("image_info"));
        this.aa = jSONObject.optLong("display_time_ms");
        this.ad = jSONObject.optInt("repeat");
        this.ac = jSONObject.optInt("banner_mode");
        this.f58445h = jSONObject.optString("button_text");
        this.u = jSONObject.optInt("splash_load_type", 0);
        this.f58450m = jSONObject.optInt("image_mode", 0);
        this.z = jSONObject.optInt("orientation");
        this.f58449l = jSONObject.optString("web_title");
        this.Z = jSONObject.optLong("display_after", 0);
        this.Y = jSONObject.optLong("expire_seconds");
        this.n = jSONObject.optInt("click_btn", 0);
        this.o = jSONObject.optInt("skip_btn", 1);
        this.af = jSONObject.optLong("splash_id");
        this.ag = jSONObject.optInt("intercept_flag");
        if (jSONObject.optInt("forbid_jump") == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.ai = z3;
        this.q = jSONObject.optInt("splash_type");
        this.ae = jSONObject.optInt("ad_lp_style");
        this.f58440c = jSONObject.optInt("show_expected");
        this.ah = jSONObject.optInt("skip_btn_style", 0);
        this.G = jSONObject.optInt("splash_show_type", 0);
        this.H = jSONObject.optString("splash_ad_id", "");
        this.I = jSONObject.optInt("predownload", 1);
        this.J = jSONObject.optInt("preload_mp", 0);
        this.M = jSONObject.optString("predownload_text");
        if (jSONObject.optInt("enable_splash_count_down", 0) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.N = z4;
        this.O = jSONObject.optInt("sound_control", 0);
        this.ab = jSONObject.optLong("show_sound_time", 0);
        this.P = jSONObject.optInt("enable_open_type", 0);
        this.am = jSONObject.optInt("preload_web", 0);
        this.an = jSONObject.optString("web_channel_name");
        this.aq = jSONObject.optString(StringSet.type, "web");
        this.ar = jSONObject.optInt("ad_style", 0);
        this.Q = jSONObject.optInt("repeat_times", Integer.MAX_VALUE);
        this.S = jSONObject.optString("action");
        this.T = jSONObject.optInt("logo_color", 0);
        if (z2) {
            this.f58439b = jSONObject.optLong("model_fetch_time", 0);
        } else {
            try {
                this.F.putOpt("model_fetch_time", Long.valueOf(this.f58439b));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        this.aj = jSONObject.optInt("brand_safety", 1);
        this.V = jSONObject.optString("enter_app_text");
        this.W = jSONObject.optLong("swipe_up_delay");
        d(jSONObject);
        b(jSONObject, j2);
        e(jSONObject);
        f(jSONObject);
        j(jSONObject);
        i(jSONObject);
        k(jSONObject);
        l(jSONObject);
        n(jSONObject);
        g(jSONObject);
        m(jSONObject);
        h(jSONObject);
        c(jSONObject);
    }
}

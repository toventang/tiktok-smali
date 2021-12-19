package com.ss.ttvideoengine.j;

import android.text.TextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.s.i;
import com.ss.ttvideoengine.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public static int f152976a;

    /* renamed from: b  reason: collision with root package name */
    public static int f152977b = 1;
    public String A;
    public String B;
    public String C;
    boolean D = false;
    HashMap<String, w> E;
    HashMap<String, w> F;
    public int G;
    public JSONObject H;
    long I;
    public String J;
    public float K;
    public float L;
    public String M;
    public int[] N;
    long O;
    private ArrayList<w> P = new ArrayList<>();
    private ArrayList<String> Q = new ArrayList<>();
    private String[] R = null;
    private String S = "";
    private String T = "mp4";
    private String U = "";
    private boolean V = false;
    private boolean W = false;
    private boolean X = false;
    private boolean Y = false;
    private boolean Z = false;
    private boolean aa = false;
    private boolean ab = false;
    private boolean ac = false;
    private String ad;
    private String ae;
    private List<o> af;
    private int ag;
    private int ah;
    private String ai;
    private String aj;
    private int ak;
    private r al;
    private m am;
    private List<s> an;
    private int ao;
    private String ap;
    private String aq;
    private int ar;
    private m as;

    /* renamed from: c  reason: collision with root package name */
    public int f152978c = 1;

    /* renamed from: d  reason: collision with root package name */
    public w[] f152979d;

    /* renamed from: e  reason: collision with root package name */
    public String[] f152980e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f152981f = {-1, -1};

    /* renamed from: g  reason: collision with root package name */
    public String f152982g;

    /* renamed from: h  reason: collision with root package name */
    public String f152983h;

    /* renamed from: i  reason: collision with root package name */
    public String f152984i;

    /* renamed from: j  reason: collision with root package name */
    public String f152985j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f152986k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f152987l;

    /* renamed from: m  reason: collision with root package name */
    public String f152988m;
    public int n;
    public List<o> o;
    public List<o> p;
    public List<o> q;
    public List<o> r;
    public String s;
    public String t;
    public String[] u;
    public int v;
    public int w;
    public r x;
    public List<s> y;
    public List<k> z;

    public final void a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        JSONObject optJSONObject;
        JSONArray optJSONArray3;
        int i2;
        boolean z2;
        JSONArray optJSONArray4;
        JSONArray optJSONArray5;
        JSONObject optJSONObject2;
        JSONArray optJSONArray6;
        JSONArray optJSONArray7;
        int i3;
        boolean z3;
        JSONArray optJSONArray8;
        JSONArray optJSONArray9;
        JSONObject optJSONObject3;
        if (jSONObject != null) {
            JSONArray optJSONArray10 = jSONObject.optJSONArray("PlayInfoList");
            if ((optJSONArray10 == null || optJSONArray10.length() <= 0) && TextUtils.isEmpty(jSONObject.optString("VideoID")) && TextUtils.isEmpty(jSONObject.optString("Vid"))) {
                if (!TextUtils.isEmpty(jSONObject.optString("video_id"))) {
                    if (jSONObject.optInt("version") == 3) {
                        this.f152978c = 3;
                    } else {
                        this.f152978c = 1;
                    }
                }
            } else if (jSONObject.optInt("Version") == 4) {
                this.f152978c = 4;
            } else {
                this.f152978c = 2;
            }
            int i4 = this.f152978c;
            if (i4 == 1 || i4 == 3) {
                if (jSONObject.has("volume") && (optJSONObject3 = jSONObject.optJSONObject("volume")) != null && (optJSONObject3.has("loudness") || optJSONObject3.has("peak"))) {
                    this.K = (float) optJSONObject3.optDouble("loudness");
                    this.L = (float) optJSONObject3.optDouble("peak");
                }
                this.M = jSONObject.optString("full_screen_strategy");
            }
            int i5 = this.f152978c;
            if (i5 == 1) {
                JSONObject optJSONObject4 = jSONObject.optJSONObject("video_list");
                this.w = jSONObject.optInt("video_duration");
                this.v = jSONObject.optInt("status");
                this.f152984i = jSONObject.optString("validate");
                this.f152985j = jSONObject.optString("auto_definition");
                this.f152986k = jSONObject.optBoolean("enable_ssl");
                this.f152987l = jSONObject.optBoolean("enable_adaptive");
                this.f152982g = jSONObject.optString("user_id");
                this.f152983h = jSONObject.optString("video_id");
                this.f152988m = jSONObject.optString("video_name");
                this.n = jSONObject.optInt("popularity_level");
                this.A = jSONObject.optString("media_type");
                this.J = jSONObject.optString("optimal_decoding_mode");
                if (jSONObject.has("subtitle_langs") && (optJSONArray9 = jSONObject.optJSONArray("subtitle_langs")) != null && optJSONArray9.length() > 0) {
                    this.N = new int[optJSONArray9.length()];
                    for (int i6 = 0; i6 < optJSONArray9.length(); i6++) {
                        this.N[i6] = optJSONArray9.optInt(i6);
                    }
                }
                String optString = jSONObject.optString("key_seed");
                if (!TextUtils.isEmpty(optString)) {
                    this.B = optString;
                }
                String optString2 = jSONObject.optString("barrage_mask_url");
                if (!TextUtils.isEmpty(optString2)) {
                    this.ap = i.a(optString2, this.D ? this.B : null);
                }
                if (jSONObject.has("subtitle_infos") && (optJSONArray8 = jSONObject.optJSONArray("subtitle_infos")) != null && optJSONArray8.length() > 0) {
                    this.z = new ArrayList();
                    for (int i7 = 0; i7 < optJSONArray8.length(); i7++) {
                        k kVar = new k();
                        kVar.a(optJSONArray8.getJSONObject(i7));
                        this.z.add(kVar);
                    }
                }
                this.ac = jSONObject.optBoolean("has_embedded_subtitle");
                this.C = jSONObject.optString("fallback_api");
                if (this.A.equals("video")) {
                    this.G = f152976a;
                } else if (this.A.equals(DataType.AUDIO)) {
                    this.G = f152977b;
                }
                if (optJSONObject4 != null) {
                    this.o = new ArrayList();
                    if (optJSONObject4.has("video_1")) {
                        o a2 = a(optJSONObject4.getJSONObject("video_1"), this.G, this.D ? this.B : null);
                        a2.P = this.w;
                        this.o.add(a2);
                    }
                    if (optJSONObject4.has("video_2")) {
                        o a3 = a(optJSONObject4.getJSONObject("video_2"), this.G, this.D ? this.B : null);
                        a3.P = this.w;
                        this.o.add(a3);
                    }
                    if (optJSONObject4.has("video_3")) {
                        o a4 = a(optJSONObject4.getJSONObject("video_3"), this.G, this.D ? this.B : null);
                        a4.P = this.w;
                        this.o.add(a4);
                    }
                    if (optJSONObject4.has("video_4")) {
                        o a5 = a(optJSONObject4.getJSONObject("video_4"), this.G, this.D ? this.B : null);
                        a5.P = this.w;
                        this.o.add(a5);
                    }
                    if (optJSONObject4.has("video_5")) {
                        o a6 = a(optJSONObject4.getJSONObject("video_5"), this.G, this.D ? this.B : null);
                        a6.P = this.w;
                        this.o.add(a6);
                    }
                    if (optJSONObject4.has("video_6")) {
                        o a7 = a(optJSONObject4.getJSONObject("video_6"), this.G, this.D ? this.B : null);
                        a7.P = this.w;
                        this.o.add(a7);
                    }
                    if (optJSONObject4.has("video_7")) {
                        o a8 = a(optJSONObject4.getJSONObject("video_7"), this.G, this.D ? this.B : null);
                        a8.P = this.w;
                        this.o.add(a8);
                    }
                    if (optJSONObject4.has("video_8")) {
                        o a9 = a(optJSONObject4.getJSONObject("video_8"), this.G, this.D ? this.B : null);
                        a9.P = this.w;
                        this.o.add(a9);
                    }
                }
                this.H = jSONObject.optJSONObject("dns_info");
                this.I = jSONObject.optLong("dns_time");
                JSONObject optJSONObject5 = jSONObject.optJSONObject("dynamic_video");
                if (optJSONObject5 != null) {
                    String optString3 = optJSONObject5.optString("main_url");
                    if (!TextUtils.isEmpty(optString3)) {
                        this.s = i.a(optString3, this.D ? this.B : null);
                    }
                    String optString4 = optJSONObject5.optString("backup_url_1");
                    if (!TextUtils.isEmpty(optString4)) {
                        this.t = i.a(optString4, this.D ? this.B : null);
                    }
                    this.S = optJSONObject5.optString("dynamic_type");
                    this.p = new ArrayList();
                    JSONArray optJSONArray11 = optJSONObject5.optJSONArray("dynamic_video_list");
                    if (optJSONArray11 == null || optJSONArray11.length() <= 0) {
                        i3 = 0;
                    } else {
                        int i8 = 0;
                        i3 = 0;
                        while (i8 < optJSONArray11.length()) {
                            o a10 = a(optJSONArray11.getJSONObject(i8), f152976a, this.D ? this.B : null);
                            a10.Y = i3;
                            this.p.add(a10);
                            i8++;
                            i3++;
                        }
                    }
                    JSONArray optJSONArray12 = optJSONObject5.optJSONArray("dynamic_dubbed_audios");
                    if (optJSONArray12 == null || optJSONArray12.length() <= 0) {
                        z3 = false;
                    } else {
                        this.q = new ArrayList();
                        int i9 = 0;
                        z3 = false;
                        while (i9 < optJSONArray12.length()) {
                            o a11 = a(optJSONArray12.getJSONObject(i9), f152977b, this.D ? this.B : null);
                            a11.Y = i3;
                            this.p.add(a11);
                            this.q.add(a11);
                            i9++;
                            i3++;
                            z3 = true;
                        }
                    }
                    JSONArray optJSONArray13 = optJSONObject5.optJSONArray("dynamic_audio_list");
                    int i10 = Integer.MAX_VALUE;
                    if (optJSONArray13 != null && optJSONArray13.length() > 0) {
                        this.r = new ArrayList();
                        int i11 = 0;
                        while (i11 < optJSONArray13.length()) {
                            o a12 = a(optJSONArray13.getJSONObject(i11), f152977b, this.D ? this.B : null);
                            int i12 = i3 + 1;
                            a12.Y = i3;
                            if (z3 && i10 > a12.C) {
                                this.f152981f[f152977b] = a12.Y;
                                i10 = a12.C;
                            }
                            this.p.add(a12);
                            this.r.add(a12);
                            i11++;
                            i3 = i12;
                        }
                    }
                    if (this.p.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        if (!TextUtils.isEmpty(this.s)) {
                            arrayList.add(this.s);
                        }
                        if (!TextUtils.isEmpty(this.t)) {
                            arrayList.add(this.t);
                        }
                        String[] strArr = new String[arrayList.size()];
                        this.u = strArr;
                        arrayList.toArray(strArr);
                    }
                }
                if (jSONObject.has("seek_ts")) {
                    r rVar = new r();
                    this.x = rVar;
                    rVar.a(jSONObject.getJSONObject("seek_ts"));
                }
                if (jSONObject.has("big_thumbs") && (optJSONArray7 = jSONObject.optJSONArray("big_thumbs")) != null && optJSONArray7.length() > 0) {
                    this.y = new ArrayList();
                    for (int i13 = 0; i13 < optJSONArray7.length(); i13++) {
                        s sVar = new s();
                        sVar.f153005l = this.f152978c;
                        sVar.a(optJSONArray7.getJSONObject(i13));
                        this.y.add(sVar);
                    }
                }
            } else if (i5 == 2) {
                this.ag = jSONObject.optInt("Status");
                this.ae = jSONObject.optString("VideoID");
                this.ai = jSONObject.optString("CoverUrl");
                this.ah = jSONObject.optInt("Duration");
                this.aj = jSONObject.optString("MediaType");
                this.ao = jSONObject.optInt("TotalCount");
                this.f152986k = jSONObject.optBoolean("EnableSSL");
                this.f152987l = jSONObject.optBoolean("EnableAdaptive");
                if (this.aj.equals("video")) {
                    this.ak = f152976a;
                } else if (this.aj.equals(DataType.AUDIO)) {
                    this.ak = f152977b;
                }
                if (jSONObject.has("Seekts")) {
                    r rVar2 = new r();
                    this.al = rVar2;
                    rVar2.a(jSONObject.getJSONObject("Seekts"));
                }
                if (jSONObject.has("BigThumbs") && (optJSONArray6 = jSONObject.optJSONArray("BigThumbs")) != null && optJSONArray6.length() > 0) {
                    this.an = new ArrayList();
                    for (int i14 = 0; i14 < optJSONArray6.length(); i14++) {
                        try {
                            s sVar2 = new s();
                            sVar2.f153005l = this.f152978c;
                            sVar2.a(optJSONArray6.getJSONObject(i14));
                            this.an.add(sVar2);
                        } catch (JSONException unused) {
                        }
                    }
                }
                if (optJSONArray10 != null && optJSONArray10.length() > 0) {
                    this.af = new ArrayList();
                    for (int i15 = 0; i15 < optJSONArray10.length(); i15++) {
                        this.af.add(a(optJSONArray10.getJSONObject(i15), this.ak, this.D ? this.B : null));
                    }
                }
                if (jSONObject.has("AdaptiveInfo") && (optJSONObject2 = jSONObject.optJSONObject("AdaptiveInfo")) != null) {
                    m mVar = new m();
                    this.am = mVar;
                    mVar.a(optJSONObject2);
                    this.S = this.am.a(215);
                    this.s = this.am.a(108);
                    this.t = this.am.a(109);
                    ArrayList arrayList2 = new ArrayList();
                    if (!TextUtils.isEmpty(this.s)) {
                        arrayList2.add(this.s);
                    }
                    if (!TextUtils.isEmpty(this.t)) {
                        arrayList2.add(this.t);
                    }
                    String[] strArr2 = new String[arrayList2.size()];
                    this.u = strArr2;
                    arrayList2.toArray(strArr2);
                }
            } else if (i5 == 3) {
                this.w = jSONObject.optInt("video_duration");
                this.v = jSONObject.optInt("status");
                this.f152983h = jSONObject.optString("video_id");
                this.O = jSONObject.optLong("url_expire");
                this.f152986k = jSONObject.optBoolean("enable_ssl");
                this.f152987l = jSONObject.optBoolean("enable_adaptive");
                this.A = jSONObject.optString("media_type");
                this.J = jSONObject.optString("optimal_decoding_mode");
                this.ap = jSONObject.optString("barrage_mask_url");
                this.n = jSONObject.optInt("popularity_level");
                if (this.A.equals("video")) {
                    this.G = f152976a;
                } else if (this.A.equals(DataType.AUDIO)) {
                    this.G = f152977b;
                }
                if (jSONObject.has("subtitle_langs") && (optJSONArray5 = jSONObject.optJSONArray("subtitle_langs")) != null && optJSONArray5.length() > 0) {
                    this.N = new int[optJSONArray5.length()];
                    for (int i16 = 0; i16 < optJSONArray5.length(); i16++) {
                        this.N[i16] = optJSONArray5.optInt(i16);
                    }
                }
                if (jSONObject.has("subtitle_infos") && (optJSONArray4 = jSONObject.optJSONArray("subtitle_infos")) != null && optJSONArray4.length() > 0) {
                    this.z = new ArrayList();
                    for (int i17 = 0; i17 < optJSONArray4.length(); i17++) {
                        k kVar2 = new k();
                        kVar2.a(optJSONArray4.getJSONObject(i17));
                        this.z.add(kVar2);
                    }
                }
                this.ac = jSONObject.optBoolean("has_embedded_subtitle");
                JSONObject optJSONObject6 = jSONObject.optJSONObject("fallback_api");
                if (optJSONObject6 != null) {
                    this.C = optJSONObject6.optString("fallback_api");
                    String optString5 = optJSONObject6.optString("key_seed");
                    if (!TextUtils.isEmpty(optString5)) {
                        this.B = optString5;
                    }
                }
                this.o = new ArrayList();
                JSONArray optJSONArray14 = jSONObject.optJSONArray("video_list");
                if (optJSONArray14 != null && optJSONArray14.length() > 0) {
                    for (int i18 = 0; i18 < optJSONArray14.length(); i18++) {
                        this.o.add(a(optJSONArray14.getJSONObject(i18), this.G, this.D ? this.B : null));
                    }
                }
                JSONObject optJSONObject7 = jSONObject.optJSONObject("dynamic_video");
                if (optJSONObject7 != null) {
                    this.s = optJSONObject7.optString("main_url");
                    this.t = optJSONObject7.optString("backup_url");
                    this.S = optJSONObject7.optString("dynamic_type");
                    this.p = new ArrayList();
                    JSONArray optJSONArray15 = optJSONObject7.optJSONArray("dynamic_video_list");
                    if (optJSONArray15 == null || optJSONArray15.length() <= 0) {
                        i2 = 0;
                    } else {
                        int i19 = 0;
                        i2 = 0;
                        while (i19 < optJSONArray15.length()) {
                            o a13 = a(optJSONArray15.getJSONObject(i19), f152976a, this.D ? this.B : null);
                            a13.Y = i2;
                            this.p.add(a13);
                            i19++;
                            i2++;
                        }
                    }
                    JSONArray optJSONArray16 = optJSONObject7.optJSONArray("dynamic_dubbed_audios");
                    if (optJSONArray16 == null || optJSONArray16.length() <= 0) {
                        z2 = false;
                    } else {
                        this.q = new ArrayList();
                        int i20 = 0;
                        z2 = false;
                        while (i20 < optJSONArray16.length()) {
                            o a14 = a(optJSONArray16.getJSONObject(i20), f152977b, this.D ? this.B : null);
                            a14.Y = i2;
                            this.p.add(a14);
                            this.q.add(a14);
                            i20++;
                            i2++;
                            z2 = true;
                        }
                    }
                    JSONArray optJSONArray17 = optJSONObject7.optJSONArray("dynamic_audio_list");
                    int i21 = Integer.MAX_VALUE;
                    if (optJSONArray17 != null && optJSONArray17.length() > 0) {
                        this.r = new ArrayList();
                        int i22 = 0;
                        while (i22 < optJSONArray17.length()) {
                            o a15 = a(optJSONArray17.getJSONObject(i22), f152977b, this.D ? this.B : null);
                            int i23 = i2 + 1;
                            a15.Y = i2;
                            if (z2 && i21 > a15.C) {
                                this.f152981f[f152977b] = a15.Y;
                                i21 = a15.C;
                            }
                            this.p.add(a15);
                            this.r.add(a15);
                            i22++;
                            i2 = i23;
                        }
                    }
                    if (this.p.size() > 0) {
                        ArrayList arrayList3 = new ArrayList();
                        if (!TextUtils.isEmpty(this.s)) {
                            arrayList3.add(this.s);
                        }
                        if (!TextUtils.isEmpty(this.t)) {
                            arrayList3.add(this.t);
                        }
                        String[] strArr3 = new String[arrayList3.size()];
                        this.u = strArr3;
                        arrayList3.toArray(strArr3);
                    }
                }
                if (jSONObject.has("seek_ts")) {
                    r rVar3 = new r();
                    this.x = rVar3;
                    rVar3.a(jSONObject.getJSONObject("seek_ts"));
                }
                this.H = jSONObject.optJSONObject("dns_info");
                this.I = jSONObject.optLong("dns_time");
                if (jSONObject.has("big_thumbs") && (optJSONArray3 = jSONObject.optJSONArray("big_thumbs")) != null && optJSONArray3.length() > 0) {
                    this.y = new ArrayList();
                    for (int i24 = 0; i24 < optJSONArray3.length(); i24++) {
                        s sVar3 = new s();
                        sVar3.f153005l = this.f152978c;
                        sVar3.a(optJSONArray3.getJSONObject(i24));
                        this.y.add(sVar3);
                    }
                }
            } else if (i5 == 4) {
                this.v = jSONObject.optInt("Status");
                this.f152983h = jSONObject.optString("Vid");
                this.aq = jSONObject.optString("PosterUrl");
                this.w = jSONObject.optInt("Duration");
                this.A = jSONObject.optString("FileType");
                this.ar = jSONObject.optInt("TotalCount");
                this.f152986k = jSONObject.optBoolean("EnableSSL");
                this.f152987l = jSONObject.optBoolean("EnableAdaptive");
                this.ap = jSONObject.optString("BarrageMaskUrl");
                if (this.A.equals("video")) {
                    this.G = f152976a;
                } else if (this.A.equals(DataType.AUDIO)) {
                    this.G = f152977b;
                }
                if (optJSONArray10 != null && optJSONArray10.length() > 0) {
                    this.o = new ArrayList();
                    for (int i25 = 0; i25 < optJSONArray10.length(); i25++) {
                        this.o.add(a(optJSONArray10.getJSONObject(i25), this.G, this.D ? this.B : null));
                    }
                }
                if (jSONObject.has("AdaptiveInfo") && (optJSONObject = jSONObject.optJSONObject("AdaptiveInfo")) != null) {
                    m mVar2 = new m();
                    this.as = mVar2;
                    mVar2.a(optJSONObject);
                    this.S = this.as.a(215);
                    this.s = this.as.a(108);
                    this.t = this.as.a(109);
                    ArrayList arrayList4 = new ArrayList();
                    if (!TextUtils.isEmpty(this.s)) {
                        arrayList4.add(this.s);
                    }
                    if (!TextUtils.isEmpty(this.t)) {
                        arrayList4.add(this.t);
                    }
                    String[] strArr4 = new String[arrayList4.size()];
                    this.u = strArr4;
                    arrayList4.toArray(strArr4);
                }
                if (jSONObject.has("SubtitleInfoList") && (optJSONArray2 = jSONObject.optJSONArray("SubtitleInfoList")) != null && optJSONArray2.length() > 0) {
                    this.z = new ArrayList();
                    for (int i26 = 0; i26 < optJSONArray2.length(); i26++) {
                        k kVar3 = new k();
                        kVar3.a(optJSONArray2.getJSONObject(i26));
                        this.z.add(kVar3);
                    }
                }
                if (jSONObject.has("ThumbInfoList") && (optJSONArray = jSONObject.optJSONArray("ThumbInfoList")) != null && optJSONArray.length() > 0) {
                    this.y = new ArrayList();
                    for (int i27 = 0; i27 < optJSONArray.length(); i27++) {
                        s sVar4 = new s();
                        sVar4.f153005l = this.f152978c;
                        sVar4.a(optJSONArray.getJSONObject(i27));
                        this.y.add(sVar4);
                    }
                }
            }
            List<o> a16 = a();
            if (a16 != null && a16.size() > 0) {
                Iterator<o> it = a16.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    o next = it.next();
                    int a17 = next.a();
                    int i28 = f152976a;
                    if (a17 == i28) {
                        this.ak = i28;
                        this.G = i28;
                        break;
                    }
                    int a18 = next.a();
                    int i29 = f152977b;
                    if (a18 == i29) {
                        this.ak = i29;
                        this.G = i29;
                    }
                }
            }
            JSONObject d2 = d();
            this.U = d2 != null ? d2.toString() : "";
            w[] wVarArr = new w[this.P.size()];
            this.f152979d = wVarArr;
            this.P.toArray(wVarArr);
            String[] strArr5 = new String[this.Q.size()];
            this.f152980e = strArr5;
            this.Q.toArray(strArr5);
        }
    }

    static {
        Covode.recordClassIndex(101680);
    }

    public final List<s> b() {
        if (this.f152978c == 2) {
            return this.an;
        }
        return this.y;
    }

    public final List<o> a() {
        if (this.f152978c == 2) {
            return this.af;
        }
        List<o> list = null;
        List<o> list2 = this.o;
        if (list2 != null && list2.size() > 0) {
            list = this.o;
        }
        List<o> list3 = this.p;
        if (list3 == null || list3.size() <= 0) {
            return list;
        }
        return this.p;
    }

    private JSONObject d() {
        JSONObject d2;
        try {
            List<o> a2 = a();
            if (a2 != null) {
                if (a2.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    for (o oVar : a2) {
                        if (!(oVar == null || (d2 = oVar.d()) == null)) {
                            if (oVar.a() == f152976a) {
                                jSONArray.put(d2);
                            } else if (oVar.a() == f152977b) {
                                jSONArray2.put(d2);
                            }
                        }
                    }
                    if (jSONArray.length() > 0 || jSONArray2.length() > 0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("dynamic_video_list", jSONArray);
                        jSONObject.put("dynamic_audio_list", jSONArray2);
                        return jSONObject;
                    }
                    return null;
                }
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final String[] c() {
        if (this.R == null) {
            List<o> a2 = a();
            ArrayList arrayList = new ArrayList();
            if (a2 != null && a2.size() > 0) {
                for (o oVar : a2) {
                    if (oVar != null) {
                        String b2 = oVar.b(8);
                        if (!TextUtils.isEmpty(b2) && !arrayList.contains(b2)) {
                            arrayList.add(b2);
                        }
                    }
                }
            }
            String[] strArr = new String[arrayList.size()];
            this.R = strArr;
            arrayList.toArray(strArr);
        }
        return this.R;
    }

    public q() {
        HashMap<String, w> hashMap = new HashMap<>();
        hashMap.put("240p", w.L_Standard);
        hashMap.put("360p", w.Standard);
        hashMap.put("480p", w.High);
        hashMap.put("540p", w.H_High);
        hashMap.put("720p", w.SuperHigh);
        hashMap.put("1080p", w.ExtremelyHigh);
        hashMap.put("2k", w.TwoK);
        hashMap.put("4k", w.FourK);
        hashMap.put("hdr", w.HDR);
        hashMap.put("1080p 50fps", w.ExtremelyHigh_50F);
        hashMap.put("2k 50fps", w.TwoK_50F);
        hashMap.put("4k 50fps", w.FourK_50F);
        hashMap.put("1080p 60fps", w.ExtremelyHigh_60F);
        hashMap.put("2k 60fps", w.TwoK_60F);
        hashMap.put("4k 60fps", w.FourK_60F);
        hashMap.put("1080p 120fps", w.ExtremelyHigh_120F);
        hashMap.put("2k 120fps", w.TwoK_120F);
        hashMap.put("4k 120fps", w.FourK_120F);
        hashMap.put("240p HDR", w.L_Standard_HDR);
        hashMap.put("360p HDR", w.Standard_HDR);
        hashMap.put("480p HDR", w.High_HDR);
        hashMap.put("540p HDR", w.H_High_HDR);
        hashMap.put("720p HDR", w.SuperHigh_HDR);
        hashMap.put("1080p HDR", w.ExtremelyHigh_HDR);
        hashMap.put("2k HDR", w.TwoK_HDR);
        hashMap.put("4k HDR", w.FourK_HDR);
        this.E = hashMap;
        HashMap<String, w> hashMap2 = new HashMap<>();
        hashMap2.put("medium", w.Standard);
        hashMap2.put("higher", w.High);
        hashMap2.put("highest", w.SuperHigh);
        hashMap2.put("original", w.ExtremelyHigh);
        this.F = hashMap2;
        int i2 = f152976a;
        this.G = i2;
        this.K = 0.0f;
        this.L = 0.0f;
        this.ad = null;
        this.af = null;
        this.ak = i2;
        this.O = 0;
    }

    public final int a(int i2) {
        int i3 = this.f152978c;
        if (i3 == 2) {
            if (i2 == 3) {
                return this.ah;
            }
            if (i2 == 4) {
                return this.ag;
            }
            if (i2 == 7) {
                return this.ak;
            }
            if (i2 == 209) {
                return this.ao;
            }
            if (i2 != 230) {
                return 0;
            }
            return this.f152981f[f152977b];
        } else if (i2 == 3) {
            return this.w;
        } else {
            if (i2 == 4) {
                return this.v;
            }
            if (i2 == 7) {
                return this.G;
            }
            if (i2 == 9) {
                return i3;
            }
            if (i2 == 209) {
                return this.ar;
            }
            if (i2 == 227) {
                return this.n;
            }
            if (i2 != 230) {
                return 0;
            }
            return this.f152981f[f152977b];
        }
    }

    public final Boolean c(int i2) {
        if (i2 == 106) {
            return Boolean.valueOf(this.f152986k);
        }
        if (i2 == 222) {
            return Boolean.valueOf(this.f152987l);
        }
        if (i2 == 228) {
            return Boolean.valueOf(this.W);
        }
        if (i2 == 229) {
            return Boolean.valueOf(this.ac);
        }
        switch (i2) {
            case 203:
                return Boolean.valueOf(this.X);
            case 204:
                return Boolean.valueOf(this.V);
            case 205:
                return Boolean.valueOf(this.Y);
            case 206:
                return Boolean.valueOf(this.aa);
            case 207:
                return Boolean.valueOf(this.Z);
            case 208:
                return Boolean.valueOf(this.ab);
            default:
                return false;
        }
    }

    public final String b(int i2) {
        if (i2 == 211) {
            return this.T;
        }
        if (i2 == 215) {
            return this.S;
        }
        if (i2 == 8) {
            return this.U;
        }
        if (i2 == 233) {
            return this.ad;
        }
        if (this.f152978c == 2) {
            if (i2 == 2) {
                return this.ae;
            }
            if (i2 == 7) {
                return this.aj;
            }
            if (i2 != 201) {
                return "";
            }
            return this.ai;
        } else if (i2 == 1) {
            return this.f152982g;
        } else {
            if (i2 == 2) {
                return this.f152983h;
            }
            if (i2 == 7) {
                return this.A;
            }
            if (i2 == 201) {
                return this.aq;
            }
            if (i2 == 221) {
                return this.ap;
            }
            if (i2 == 223) {
                return this.J;
            }
            if (i2 == 226) {
                return this.M;
            }
            if (i2 == 104) {
                return this.f152988m;
            }
            if (i2 == 105) {
                return this.f152984i;
            }
            if (i2 == 217) {
                return this.C;
            }
            if (i2 == 218) {
                return this.B;
            }
            switch (i2) {
                case 107:
                    return this.f152985j;
                case 108:
                    return this.s;
                case 109:
                    return this.t;
                default:
                    return "";
            }
        }
    }

    public final o a(Map<Integer, String> map) {
        List<o> a2 = a();
        if (!(a2 == null || a2.size() == 0)) {
            for (o oVar : a2) {
                if (oVar != null) {
                    if (!(map == null || map.size() == 0)) {
                        for (Map.Entry<Integer, String> entry : map.entrySet()) {
                            int intValue = entry.getKey().intValue();
                            String value = entry.getValue();
                            if (TextUtils.isEmpty(value) || value.equals(oVar.b(intValue))) {
                            }
                        }
                    }
                    return oVar;
                }
            }
        }
        return null;
    }

    public final void a(HashMap<String, w> hashMap) {
        int a2 = a(7);
        if (hashMap == null || hashMap.size() <= 0) {
            if (a2 == f152977b) {
                hashMap = this.F;
            } else {
                hashMap = this.E;
            }
        } else if (a2 == f152977b) {
            this.F = hashMap;
        } else {
            this.E = hashMap;
        }
        List<o> a3 = a();
        if (a3 != null) {
            for (int i2 = 0; i2 < a3.size(); i2++) {
                o oVar = a3.get(i2);
                if (oVar != null && oVar.a() == a2) {
                    oVar.a(hashMap);
                    w c2 = oVar.c();
                    String b2 = oVar.b(32);
                    if (!this.Q.contains(b2)) {
                        this.Q.add(b2);
                    }
                    if (!this.P.contains(c2)) {
                        this.P.add(c2);
                    }
                }
            }
        }
        w[] wVarArr = new w[this.P.size()];
        this.f152979d = wVarArr;
        this.P.toArray(wVarArr);
        String[] strArr = new String[this.Q.size()];
        this.f152980e = strArr;
        this.Q.toArray(strArr);
    }

    public final o a(w wVar, Map<Integer, String> map) {
        return a(wVar, a(7), map);
    }

    public final o a(w wVar, int i2, Map<Integer, String> map) {
        List<o> a2 = a();
        if (!(a2 == null || a2.size() == 0)) {
            for (o oVar : a2) {
                if (oVar != null && i2 == oVar.a()) {
                    if (map != null && map.containsKey(32)) {
                        String str = map.get(32);
                        if (!TextUtils.isEmpty(oVar.b(32)) && oVar.b(32).equals(str)) {
                            return oVar;
                        }
                    }
                    if (wVar != oVar.c()) {
                        continue;
                    } else {
                        if (!(map == null || map.size() == 0)) {
                            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                                int intValue = entry.getKey().intValue();
                                String value = entry.getValue();
                                if (TextUtils.isEmpty(value) || value.equals(oVar.b(intValue))) {
                                }
                            }
                        }
                        return oVar;
                    }
                }
            }
        }
        return null;
    }

    private o a(JSONObject jSONObject, int i2, String str) {
        String str2;
        o oVar = new o(str);
        oVar.s = this.f152978c;
        oVar.U = i2;
        oVar.a(39, this.K);
        oVar.a(40, this.L);
        oVar.b(jSONObject);
        w wVar = w.Standard;
        int a2 = oVar.a();
        if (a2 == f152977b) {
            str2 = oVar.b(18);
        } else if (a2 == f152976a) {
            str2 = oVar.b(7);
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (str2.equals(w.L_Standard.toString(a2))) {
                wVar = w.L_Standard;
            } else if (str2.equals(w.Standard.toString(a2))) {
                wVar = w.Standard;
            } else if (str2.equals(w.High.toString(a2))) {
                wVar = w.High;
            } else if (str2.equals(w.H_High.toString(a2))) {
                wVar = w.H_High;
            } else if (str2.equals(w.SuperHigh.toString(a2))) {
                wVar = w.SuperHigh;
            } else if (str2.equals(w.ExtremelyHigh.toString(a2))) {
                wVar = w.ExtremelyHigh;
            } else if (str2.equals(w.TwoK.toString(a2))) {
                wVar = w.TwoK;
            } else if (str2.equals(w.FourK.toString(a2))) {
                wVar = w.FourK;
            } else if (str2.equals(w.HDR.toString(a2))) {
                wVar = w.HDR;
            } else if (str2.equals(w.ExtremelyHigh_50F.toString(a2))) {
                wVar = w.ExtremelyHigh_50F;
            } else if (str2.equals(w.TwoK_50F.toString(a2))) {
                wVar = w.TwoK_50F;
            } else if (str2.equals(w.FourK_50F.toString(a2))) {
                wVar = w.FourK_50F;
            } else if (str2.equals(w.ExtremelyHigh_60F.toString(a2))) {
                wVar = w.ExtremelyHigh_60F;
            } else if (str2.equals(w.TwoK_60F.toString(a2))) {
                wVar = w.TwoK_60F;
            } else if (str2.equals(w.FourK_60F.toString(a2))) {
                wVar = w.FourK_60F;
            } else if (str2.equals(w.ExtremelyHigh_120F.toString(a2))) {
                wVar = w.ExtremelyHigh_120F;
            } else if (str2.equals(w.TwoK_120F.toString(a2))) {
                wVar = w.TwoK_120F;
            } else if (str2.equals(w.FourK_120F.toString(a2))) {
                wVar = w.FourK_120F;
            } else if (str2.equals(w.L_Standard_HDR.toString(a2))) {
                wVar = w.L_Standard_HDR;
            } else if (str2.equals(w.Standard_HDR.toString(a2))) {
                wVar = w.Standard_HDR;
            } else if (str2.equals(w.High_HDR.toString(a2))) {
                wVar = w.High_HDR;
            } else if (str2.equals(w.H_High_HDR.toString(a2))) {
                wVar = w.H_High_HDR;
            } else if (str2.equals(w.SuperHigh_HDR.toString(a2))) {
                wVar = w.SuperHigh_HDR;
            } else if (str2.equals(w.ExtremelyHigh_HDR.toString(a2))) {
                wVar = w.ExtremelyHigh_HDR;
            } else if (str2.equals(w.TwoK_HDR.toString(a2))) {
                wVar = w.TwoK_HDR;
            } else if (str2.equals(w.FourK_HDR.toString(a2))) {
                wVar = w.FourK_HDR;
            }
        }
        oVar.t = wVar;
        oVar.u = str2;
        String b2 = oVar.b(6);
        if (!TextUtils.isEmpty(b2)) {
            this.T = b2;
        }
        if (!this.Z && this.T.equals("mpd")) {
            this.Z = true;
        } else if (!this.Y && this.T.equals("dash")) {
            this.Y = true;
        } else if (!this.aa && this.T.equals("mp4")) {
            this.aa = true;
        } else if (!this.ab && this.T.equals("hls")) {
            this.ab = true;
        }
        String b3 = oVar.b(8);
        if (!this.X && b3.equals("h264")) {
            this.X = true;
        } else if (!this.V && b3.equals("bytevc1")) {
            this.V = true;
        } else if (!this.W && b3.equals("bytevc2")) {
            this.W = true;
        }
        return oVar;
    }
}

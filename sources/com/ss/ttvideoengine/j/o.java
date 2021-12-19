package com.ss.ttvideoengine.j;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;
import com.ss.ttvideoengine.s.i;
import com.ss.ttvideoengine.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class o implements d {
    public int A;
    public int B;
    public int C;
    public int D;
    public boolean E = false;
    public String F = null;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public int L;
    public int M;
    public int N;
    public long O = 0;
    public int P = 0;
    public int Q = 0;
    public int R = 1;
    public boolean S = false;
    public String T;
    public int U = 0;
    public float V = 0.0f;
    public float W = 0.0f;
    public HashMap<Double, Long> X;
    public int Y = -1;
    public int Z = -1;

    /* renamed from: a  reason: collision with root package name */
    private String f152952a = null;
    public String aa = "";
    public String ab = "";
    private String ac;
    private String ad = null;
    private String ae;
    private int af;
    private int ag;
    private int ah;
    private int ai = 0;
    private long aj = 0;
    private String ak = null;
    private String al = null;
    private String am = null;
    private String an = null;
    private String ao = null;
    private i ap = null;
    private String aq;

    /* renamed from: b  reason: collision with root package name */
    private String f152953b = null;

    /* renamed from: c  reason: collision with root package name */
    private long f152954c = 0;

    /* renamed from: d  reason: collision with root package name */
    private String f152955d = null;

    /* renamed from: e  reason: collision with root package name */
    private int f152956e = 0;

    /* renamed from: f  reason: collision with root package name */
    private String f152957f;

    /* renamed from: g  reason: collision with root package name */
    private String f152958g;

    /* renamed from: h  reason: collision with root package name */
    private String f152959h;

    /* renamed from: i  reason: collision with root package name */
    private String f152960i;

    /* renamed from: j  reason: collision with root package name */
    private String f152961j;

    /* renamed from: k  reason: collision with root package name */
    private int f152962k = 0;

    /* renamed from: l  reason: collision with root package name */
    private String[] f152963l = null;

    /* renamed from: m  reason: collision with root package name */
    private String f152964m;
    private String n;
    private int o;
    private int p;
    private int q;
    private String r = null;
    public int s = 1;
    public w t = w.Standard;
    String u = w.Standard.toString(q.f152976a);
    public String[] v;
    public String w;
    public String x;
    public String y;
    public String z;

    static {
        Covode.recordClassIndex(101677);
    }

    public int a(JSONObject jSONObject) {
        return -1;
    }

    @Override // com.ss.ttvideoengine.j.d
    public int a() {
        return this.U;
    }

    @Override // com.ss.ttvideoengine.j.d
    public w c() {
        return this.t;
    }

    @Override // com.ss.ttvideoengine.j.d
    public i e() {
        return this.ap;
    }

    public final void b(JSONObject jSONObject) {
        int i2;
        JSONObject optJSONObject;
        int i3;
        JSONObject optJSONObject2;
        if (jSONObject != null) {
            if (!TextUtils.isEmpty(jSONObject.optString("main_url"))) {
                if (this.s != 3) {
                    this.s = 1;
                }
            } else if (!TextUtils.isEmpty(jSONObject.optString("MainPlayUrl")) && this.s != 4) {
                this.s = 2;
            }
            int i4 = this.s;
            if (i4 == 1) {
                ArrayList arrayList = new ArrayList();
                this.w = i.a(jSONObject.optString("main_url"), this.f152955d);
                this.x = i.a(jSONObject.optString("backup_url_1"), this.f152955d);
                this.y = i.a(jSONObject.optString("backup_url_2"), this.f152955d);
                this.z = i.a(jSONObject.optString("backup_url_3"), this.f152955d);
                if (!TextUtils.isEmpty(this.w)) {
                    arrayList.add(this.w);
                }
                if (!TextUtils.isEmpty(this.x)) {
                    arrayList.add(this.x);
                }
                if (!TextUtils.isEmpty(this.y)) {
                    arrayList.add(this.y);
                }
                if (!TextUtils.isEmpty(this.z)) {
                    arrayList.add(this.z);
                }
                String[] strArr = new String[arrayList.size()];
                this.v = strArr;
                arrayList.toArray(strArr);
                try {
                    this.A = Integer.parseInt(jSONObject.optString("vwidth"));
                } catch (NumberFormatException unused) {
                    this.A = 0;
                }
                try {
                    this.B = Integer.parseInt(jSONObject.optString("vheight"));
                    i3 = 0;
                } catch (NumberFormatException unused2) {
                    i3 = 0;
                    this.B = 0;
                }
                try {
                    this.C = jSONObject.optInt("bitrate");
                } catch (Exception unused3) {
                    this.C = i3;
                }
                try {
                    this.f152962k = jSONObject.optInt("quality_type");
                } catch (Exception unused4) {
                    this.f152962k = 0;
                }
                this.E = jSONObject.optBoolean("encrypt");
                this.F = jSONObject.optString("spade_a");
                this.D = jSONObject.optInt("gbr");
                this.G = jSONObject.optString("storePath");
                this.H = jSONObject.optString("vtype");
                this.K = jSONObject.optString("definition");
                this.I = jSONObject.optString("codec_type");
                try {
                    this.O = jSONObject.optLong("size", 0);
                } catch (Exception unused5) {
                    this.O = 0;
                }
                if (jSONObject.has("volume") && (optJSONObject2 = jSONObject.optJSONObject("volume")) != null && (optJSONObject2.has("loudness") || optJSONObject2.has("peak"))) {
                    this.V = (float) optJSONObject2.optDouble("loudness");
                    this.W = (float) optJSONObject2.optDouble("peak");
                }
                this.L = jSONObject.optInt("preload_size");
                this.M = jSONObject.optInt("play_load_min_step");
                this.N = jSONObject.optInt("play_load_max_step");
                this.Q = jSONObject.optInt("preload_interval", -1);
                this.R = jSONObject.optInt("use_video_proxy", 1);
                this.f152956e = jSONObject.optInt("socket_buffer", 0);
                this.J = jSONObject.optString("file_hash");
                this.T = jSONObject.optString("quality");
                this.an = jSONObject.optString("quality_desc");
                this.f152957f = jSONObject.optString("logo_type");
                String optString = jSONObject.optString("file_id");
                this.f152952a = optString;
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(this.H) && (this.H.equals("hls") || this.H.equals("m3u8"))) {
                    this.J = "fileid" + this.f152952a;
                }
                this.f152953b = i.a(jSONObject.optString("p2p_verify_url"), (String) null);
                this.f152954c = jSONObject.optLong("url_expire");
                this.f152958g = jSONObject.optString("check_info");
                this.f152959h = jSONObject.optString("init_range");
                this.f152960i = jSONObject.optString("index_range");
                this.f152961j = jSONObject.optString("kid");
                this.aq = i.a(jSONObject.optString("barrage_mask_url"), this.f152955d);
                if (jSONObject.has("fitter_info")) {
                    i iVar = new i();
                    this.ap = iVar;
                    iVar.a(jSONObject.optJSONObject("fitter_info"));
                }
                if (jSONObject.has("pkt_offset")) {
                    try {
                        JSONArray jSONArray = new JSONArray(jSONObject.optString("pkt_offset"));
                        if (jSONArray.length() > 0) {
                            this.X = new HashMap<>();
                            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                                JSONArray optJSONArray = jSONArray.optJSONArray(i5);
                                if (optJSONArray != null && optJSONArray.length() == 2) {
                                    this.X.put(Double.valueOf(optJSONArray.optDouble(0)), Long.valueOf(optJSONArray.optLong(1)));
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                try {
                    this.Z = jSONObject.optInt("language_id", -1);
                    this.aa = jSONObject.optString("language_code", "");
                    this.ab = jSONObject.optString("dub_version", "");
                } catch (Exception unused6) {
                    this.Z = -1;
                    this.aa = "";
                    this.ab = "";
                }
            } else if (i4 == 2) {
                this.q = jSONObject.optInt("Bitrate");
                this.n = jSONObject.optString("FileHash");
                this.aj = jSONObject.optLong("Size");
                this.p = jSONObject.optInt("Height");
                this.o = jSONObject.optInt("Width");
                this.ac = jSONObject.optString("Format");
                this.ad = jSONObject.optString("Codec");
                this.ak = jSONObject.optString("Logo");
                this.ae = jSONObject.optString("Definition");
                this.al = jSONObject.optString("Quality");
                this.r = jSONObject.optString("PlayAuth");
                this.f152964m = jSONObject.optString("MainPlayUrl");
                this.am = jSONObject.optString("BackupPlayUrl");
                String optString2 = jSONObject.optString("MediaType");
                try {
                    this.f152962k = jSONObject.optInt("QualityType");
                } catch (Exception unused7) {
                    this.f152962k = 0;
                }
                if (!TextUtils.isEmpty(optString2)) {
                    if (optString2.equals("video")) {
                        this.U = q.f152976a;
                    } else if (optString2.equals(DataType.AUDIO)) {
                        this.U = q.f152977b;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                if (!TextUtils.isEmpty(this.f152964m)) {
                    arrayList2.add(this.f152964m);
                }
                if (!TextUtils.isEmpty(this.am)) {
                    arrayList2.add(this.am);
                }
                String[] strArr2 = new String[arrayList2.size()];
                this.f152963l = strArr2;
                arrayList2.toArray(strArr2);
                this.ai = jSONObject.optInt("PreloadInterval", -1);
                this.ag = jSONObject.optInt("PreloadMinStep");
                this.ah = jSONObject.optInt("PreloadMaxStep");
                this.af = jSONObject.optInt("PreloadSize");
                String optString3 = jSONObject.optString("FileID");
                this.f152952a = optString3;
                if (!TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(this.ac) && (this.ac.equals("hls") || this.ac.equals("m3u8"))) {
                    this.n = "fileid" + this.f152952a;
                }
                this.f152953b = jSONObject.optString("P2pVerifyURL");
                this.f152958g = jSONObject.optString("CheckInfo");
                this.f152959h = jSONObject.optString("InitRange");
                this.f152960i = jSONObject.optString("IndexRange");
                this.f152961j = jSONObject.optString("PlayAuthID");
                if (jSONObject.has("fitter_info")) {
                    i iVar2 = new i();
                    this.ap = iVar2;
                    iVar2.a(jSONObject.optJSONObject("fitter_info"));
                }
                if (jSONObject.has("pkt_offset")) {
                    try {
                        JSONArray jSONArray2 = new JSONArray(jSONObject.optString("pkt_offset"));
                        if (jSONArray2.length() > 0) {
                            this.X = new HashMap<>();
                            for (int i6 = 0; i6 < jSONArray2.length(); i6++) {
                                JSONArray optJSONArray2 = jSONArray2.optJSONArray(i6);
                                if (optJSONArray2 != null && optJSONArray2.length() == 2) {
                                    this.X.put(Double.valueOf(optJSONArray2.optDouble(0)), Long.valueOf(optJSONArray2.optLong(1)));
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                try {
                    this.Z = jSONObject.optInt("LanguageId", -1);
                    this.aa = jSONObject.optString("LanguageCode", "");
                    this.ab = jSONObject.optString("DubVersion", "");
                } catch (Exception unused8) {
                    this.Z = -1;
                    this.aa = "";
                    this.ab = "";
                }
            } else if (i4 == 3) {
                ArrayList arrayList3 = new ArrayList();
                this.w = jSONObject.optString("main_url");
                this.x = jSONObject.optString("backup_url");
                arrayList3.add(this.w);
                arrayList3.add(this.x);
                String[] strArr3 = new String[arrayList3.size()];
                this.v = strArr3;
                arrayList3.toArray(strArr3);
                if (jSONObject.has("volume") && (optJSONObject = jSONObject.optJSONObject("volume")) != null && (optJSONObject.has("loudness") || optJSONObject.has("peak"))) {
                    this.V = (float) optJSONObject.optDouble("loudness");
                    this.W = (float) optJSONObject.optDouble("peak");
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("video_meta");
                if (optJSONObject3 != null) {
                    this.f152957f = optJSONObject3.optString("logo_type");
                    this.an = optJSONObject3.optString("quality_desc");
                    this.H = optJSONObject3.optString("vtype");
                    this.K = optJSONObject3.optString("definition");
                    this.I = optJSONObject3.optString("codec_type");
                    try {
                        this.A = Integer.parseInt(optJSONObject3.optString("vwidth"));
                    } catch (NumberFormatException unused9) {
                        this.A = 0;
                    }
                    try {
                        this.B = Integer.parseInt(optJSONObject3.optString("vheight"));
                        i2 = 0;
                    } catch (NumberFormatException unused10) {
                        i2 = 0;
                        this.B = 0;
                    }
                    try {
                        this.C = optJSONObject3.optInt("bitrate");
                    } catch (Exception unused11) {
                        this.C = i2;
                    }
                    try {
                        this.f152962k = optJSONObject3.optInt("quality_type");
                    } catch (Exception unused12) {
                        this.f152962k = 0;
                    }
                    this.T = optJSONObject3.optString("quality");
                    this.f152952a = optJSONObject3.optString("file_id");
                    this.J = optJSONObject3.optString("file_hash");
                    if (!TextUtils.isEmpty(this.f152952a) && !TextUtils.isEmpty(this.H) && (this.H.equals("hls") || this.H.equals("m3u8") || TextUtils.isEmpty(this.J))) {
                        this.J = "fileid" + this.f152952a;
                    }
                    try {
                        this.O = optJSONObject3.optLong("size", 0);
                    } catch (Exception unused13) {
                        this.O = 0;
                    }
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("audio_meta");
                if (optJSONObject4 != null) {
                    this.an = optJSONObject4.optString("quality_desc");
                    this.H = optJSONObject4.optString("atype");
                    this.K = optJSONObject4.optString("definition");
                    this.T = optJSONObject4.optString("quality");
                    this.I = optJSONObject4.optString("codec_type");
                    try {
                        this.C = optJSONObject4.optInt("bitrate");
                    } catch (Exception unused14) {
                        this.C = 0;
                    }
                    this.f152952a = optJSONObject4.optString("file_id");
                    this.J = optJSONObject4.optString("file_hash");
                    if (!TextUtils.isEmpty(this.f152952a) && TextUtils.isEmpty(this.J)) {
                        this.J = "fileid" + this.f152952a;
                    }
                    try {
                        this.O = optJSONObject4.optLong("size", 0);
                    } catch (Exception unused15) {
                        this.O = 0;
                    }
                }
                JSONObject optJSONObject5 = jSONObject.optJSONObject("encrypt_info");
                if (optJSONObject5 != null) {
                    this.E = optJSONObject5.optBoolean("encrypt");
                    this.F = optJSONObject5.optString("spade_a");
                    this.f152961j = optJSONObject5.optString("kid");
                }
                JSONObject optJSONObject6 = jSONObject.optJSONObject("p2p_info");
                if (optJSONObject6 != null) {
                    this.f152953b = optJSONObject6.optString("p2p_verify_url");
                }
                JSONObject optJSONObject7 = jSONObject.optJSONObject("check_info");
                if (optJSONObject7 != null) {
                    this.f152958g = optJSONObject7.optString("check_info");
                }
                JSONObject optJSONObject8 = jSONObject.optJSONObject("base_range_info");
                if (optJSONObject8 != null) {
                    this.f152959h = optJSONObject8.optString("init_range");
                    this.f152960i = optJSONObject8.optString("index_range");
                }
                JSONObject optJSONObject9 = jSONObject.optJSONObject("barrage_info");
                if (optJSONObject9 != null) {
                    this.ao = optJSONObject9.optString("barrage_mask_offset");
                }
                if (jSONObject.has("fitter_info")) {
                    i iVar3 = new i();
                    this.ap = iVar3;
                    iVar3.a(jSONObject.optJSONObject("fitter_info"));
                }
                if (jSONObject.has("pkt_offset")) {
                    try {
                        JSONArray jSONArray3 = new JSONArray(jSONObject.optString("pkt_offset"));
                        if (jSONArray3.length() > 0) {
                            this.X = new HashMap<>();
                            for (int i7 = 0; i7 < jSONArray3.length(); i7++) {
                                JSONArray optJSONArray3 = jSONArray3.optJSONArray(i7);
                                if (optJSONArray3 != null && optJSONArray3.length() == 2) {
                                    this.X.put(Double.valueOf(optJSONArray3.optDouble(0)), Long.valueOf(optJSONArray3.optLong(1)));
                                }
                            }
                        }
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
                try {
                    this.Z = jSONObject.optInt("language_id", -1);
                    this.aa = jSONObject.optString("language_code", "");
                    this.ab = jSONObject.optString("dub_version", "");
                } catch (Exception unused16) {
                    this.Z = -1;
                    this.aa = "";
                    this.ab = "";
                }
            } else if (i4 == 4) {
                this.C = jSONObject.optInt("Bitrate");
                this.J = jSONObject.optString("Md5");
                this.O = jSONObject.optLong("Size");
                this.B = jSONObject.optInt("Height");
                this.A = jSONObject.optInt("Width");
                this.H = jSONObject.optString("Format");
                this.I = jSONObject.optString("Codec");
                this.f152957f = jSONObject.optString("LogoType");
                this.K = jSONObject.optString("Definition");
                this.T = jSONObject.optString("Quality");
                this.F = jSONObject.optString("PlayAuth");
                this.w = jSONObject.optString("MainPlayUrl");
                this.x = jSONObject.optString("BackupPlayUrl");
                try {
                    this.f152962k = jSONObject.optInt("QualityType");
                } catch (Exception unused17) {
                    this.f152962k = 0;
                }
                String optString4 = jSONObject.optString("FileType");
                if (!TextUtils.isEmpty(optString4)) {
                    if (optString4.equals("video")) {
                        this.U = q.f152976a;
                    } else if (optString4.equals(DataType.AUDIO)) {
                        this.U = q.f152977b;
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                if (!TextUtils.isEmpty(this.w)) {
                    arrayList4.add(this.w);
                }
                if (!TextUtils.isEmpty(this.x)) {
                    arrayList4.add(this.x);
                }
                String[] strArr4 = new String[arrayList4.size()];
                this.v = strArr4;
                arrayList4.toArray(strArr4);
                String optString5 = jSONObject.optString("FileId");
                this.f152952a = optString5;
                if (!TextUtils.isEmpty(optString5) && !TextUtils.isEmpty(this.H) && (this.H.equals("hls") || this.H.equals("m3u8"))) {
                    this.J = "fileid" + this.f152952a;
                }
                this.f152958g = jSONObject.optString("CheckInfo");
                this.f152959h = jSONObject.optString("InitRange");
                this.f152960i = jSONObject.optString("IndexRange");
                this.f152961j = jSONObject.optString("PlayAuthId");
                try {
                    this.Z = jSONObject.optInt("LanguageId", -1);
                    this.aa = jSONObject.optString("LanguageCode", "");
                    this.ab = jSONObject.optString("DubVersion", "");
                } catch (Exception unused18) {
                    this.Z = -1;
                    this.aa = "";
                    this.ab = "";
                }
            }
        }
    }

    public String[] b() {
        if (this.s == 2) {
            return this.f152963l;
        }
        return this.v;
    }

    public JSONObject d() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            String[] b2 = b();
            if (b2 != null) {
                if (b2.length > 0) {
                    jSONObject.put("main_url", b2[0]);
                    if (b2.length > 1) {
                        str = b2[1];
                    } else {
                        str = "";
                    }
                    jSONObject.put("backup_url_1", str);
                    jSONObject.put("bitrate", a(3));
                    jSONObject.put("vwidth", a(1));
                    jSONObject.put("vheight", a(2));
                    jSONObject.put("init_range", b(34));
                    jSONObject.put("index_range", b(35));
                    jSONObject.put("check_info", b(31));
                    jSONObject.put("kid", b(36));
                    jSONObject.put("loudness", (double) d(39));
                    jSONObject.put("peak", (double) d(40));
                    jSONObject.put("info_id", a(42));
                    return jSONObject;
                }
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public Map<String, Object> f() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", b(28));
        if (a() == q.f152976a) {
            str = "video";
        } else {
            str = DataType.AUDIO;
        }
        hashMap.put("media_type", str);
        hashMap.put("file_size", Long.valueOf(c(12)));
        hashMap.put("bitrate", Integer.valueOf(a(3)));
        hashMap.put("quality", b(18));
        hashMap.put("definition", b(7));
        hashMap.put("width", Integer.valueOf(a(1)));
        hashMap.put("height", Integer.valueOf(a(2)));
        hashMap.put("codec", b(8));
        hashMap.put("urls", b());
        hashMap.put("file_hash", b(15));
        String b2 = b(29);
        if (b2 == null) {
            b2 = "";
        }
        hashMap.put("p2p_crc", i.h(b2));
        return hashMap;
    }

    public final float d(int i2) {
        if (i2 == 39) {
            return this.V;
        }
        if (i2 != 40) {
            return 0.0f;
        }
        return this.W;
    }

    public long c(int i2) {
        if (this.s == 2) {
            if (i2 != 12) {
                return -1;
            }
            return this.aj;
        } else if (i2 == 12) {
            return this.O;
        } else {
            if (i2 != 30) {
                return -1;
            }
            return this.f152954c;
        }
    }

    public o(String str) {
        this.f152955d = str;
    }

    public final void a(HashMap<String, w> hashMap) {
        if (hashMap != null && hashMap.size() > 0) {
            String str = null;
            if (this.U == q.f152977b) {
                str = b(18);
                if (TextUtils.isEmpty(str)) {
                    str = w.Standard.toString(this.U);
                }
            } else if (this.U == q.f152976a) {
                str = b(7);
                if (TextUtils.isEmpty(str)) {
                    str = w.Standard.toString(this.U);
                }
            }
            w wVar = hashMap.get(str);
            this.t = wVar;
            if (wVar == null) {
                this.t = w.Standard;
            }
        }
    }

    @Override // com.ss.ttvideoengine.j.d
    public int a(int i2) {
        if (i2 == 38) {
            i iVar = this.ap;
            if (iVar != null) {
                return iVar.f152925b;
            }
            return 0;
        } else if (this.s == 2) {
            if (i2 == 1) {
                return this.o;
            }
            if (i2 == 2) {
                return this.p;
            }
            if (i2 == 3) {
                return this.q;
            }
            if (i2 == 13) {
                return this.ai;
            }
            if (i2 == 41) {
                return this.f152962k;
            }
            if (i2 == 42) {
                return this.Y;
            }
            switch (i2) {
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return this.af;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return this.ag;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return this.ah;
                default:
                    return -1;
            }
        } else if (i2 == 1) {
            return this.A;
        } else {
            if (i2 == 2) {
                return this.B;
            }
            if (i2 == 3) {
                return this.C;
            }
            if (i2 == 13) {
                return this.Q;
            }
            if (i2 == 27) {
                return this.P;
            }
            if (i2 == 41) {
                return this.f152962k;
            }
            if (i2 == 42) {
                return this.Y;
            }
            switch (i2) {
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return this.L;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return this.M;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return this.N;
                default:
                    switch (i2) {
                        case v.U:
                            return this.D;
                        case 21:
                            return this.R;
                        case 22:
                            return this.f152956e;
                        default:
                            return -1;
                    }
            }
        }
    }

    @Override // com.ss.ttvideoengine.j.d
    public String b(int i2) {
        switch (i2) {
            case 26:
                return this.u;
            case 27:
            case 30:
            case 32:
            case 33:
            default:
                if (this.s == 2) {
                    if (i2 == 0) {
                        return this.f152964m;
                    }
                    if (i2 == 15) {
                        return this.n;
                    }
                    if (i2 == 5) {
                        return this.r;
                    }
                    if (i2 == 6) {
                        return this.ac;
                    }
                    if (i2 == 7) {
                        return this.ae;
                    }
                    if (i2 == 8) {
                        return this.ad;
                    }
                    switch (i2) {
                        case 17:
                            return this.am;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            return this.al;
                        case 19:
                            return this.ak;
                        default:
                            return "";
                    }
                } else if (i2 == 0) {
                    return this.w;
                } else {
                    if (i2 == 15) {
                        return this.J;
                    }
                    if (i2 == 37) {
                        return this.aq;
                    }
                    if (i2 == 5) {
                        return this.F;
                    }
                    if (i2 == 6) {
                        return this.H;
                    }
                    if (i2 == 7) {
                        return this.K;
                    }
                    if (i2 == 8) {
                        return this.I;
                    }
                    if (i2 == 32) {
                        return this.an;
                    }
                    if (i2 == 33) {
                        return this.ao;
                    }
                    switch (i2) {
                        case 17:
                            return this.x;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            return this.T;
                        case 19:
                            return this.f152957f;
                        default:
                            switch (i2) {
                                case 23:
                                    return this.y;
                                case 24:
                                    return this.z;
                                case 25:
                                    return this.G;
                                default:
                                    return "";
                            }
                    }
                }
            case 28:
                return this.f152952a;
            case 29:
                return this.f152953b;
            case 31:
                return this.f152958g;
            case 34:
                return this.f152959h;
            case 35:
                return this.f152960i;
            case 36:
                return this.f152961j;
        }
    }

    public final void a(int i2, float f2) {
        if (i2 == 39) {
            this.V = f2;
        } else if (i2 == 40) {
            this.W = f2;
        }
    }
}

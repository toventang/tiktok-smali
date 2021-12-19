package com.ss.videoarch.a.a;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.videoarch.a.g;
import com.ss.videoarch.live.LiveIOWrapper;
import java.net.InetAddress;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.apache.commons.net.ntp.NTPUDPClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b implements Handler.Callback {
    private static final String eu = b.class.getCanonicalName();
    public boolean A;
    public String B = "none";
    public boolean C;
    public String D = "none";
    public boolean E;
    public int F = -1;
    public float G = -1.0f;
    public int H = -1;
    public float I = -1.0f;
    public int J;
    public String K = "none";
    public String L = "none";
    public long M;
    public int N;
    public int O = -1;
    public int P;
    public int Q;
    public int R;
    public int S = -1;
    public int T;
    public int U;
    public int V = -1;
    public float W = -1.0f;
    public String X = "none";
    public String Y = "none";
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    Context f154191a;
    public boolean aA;
    public String aB;
    public int aC;
    public int aD;
    public long aE;
    public int aF;
    public int aG;
    public int aH;
    public int aI;
    public int aJ = -1;
    public String aK;
    public int aL;
    public int aM;
    public int aN;
    public int aO = -1;
    public ArrayList<Long> aP;
    public String aQ = "none";
    public String aR = "none";
    public boolean aS;
    public boolean aT;
    public int aU;
    public int aV = -1;
    public String aW = "none";
    public boolean aX;
    public int aY = -1;
    public int aZ;
    public long aa;
    public long ab;
    public long ac;
    public long ad;
    public boolean ae;
    public long af;
    public long ag;
    public long ah;
    public long ai;
    public long aj;
    public int ak;
    public int al;
    public int am = -1;
    public boolean an;
    public boolean ao;
    public long ap = 10000;
    public boolean aq;
    public long ar;
    public long as;
    public long at;
    NTPUDPClient au;
    public InetAddress av;
    public a aw;
    public boolean ax;
    public int ay = -1;
    String az;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.videoarch.a.a f154192b;
    public boolean bA;
    public String bB = "origin";
    public String bC = "origin";
    public String bD = "none";
    public long bE = -1;
    public int bF = -1;
    public int bG;
    public String bH = "none";
    public boolean bI;
    public int bJ = -1;
    public long bK = -1;
    public long bL = -1;
    public long bM = -1;
    public long bN = -1;
    public String bO = "none";
    public int bP = 4;
    public boolean bQ;
    public long bR;
    public long bS;
    public long bT = -1;
    public long bU = -1;
    public long bV;
    public int bW = -1;
    public int bX = -1;
    public int bY = -1;
    public int bZ = -1;
    public int ba = -1;
    public boolean bb;
    public int bc;
    public int bd = 1;
    public long be;
    public long bf;
    public String bg = "none";
    public int bh;
    public boolean bi;
    public boolean bj;
    public float bk = -1.0f;
    public long bl;
    public String bm = "none";
    public String bn = "none";
    public int bo = -1;
    public String bp = "none";
    public String bq = "none";
    public boolean br;
    public boolean bs;
    public JSONObject bt;
    public JSONObject bu;
    public JSONObject bv;
    public String bw = "none";
    public String bx = "none";
    public boolean by;
    public String bz = "rad";

    /* renamed from: c  reason: collision with root package name */
    public c f154193c;
    public int cA;
    public int cB = 1;
    public boolean cC;
    public int cD = -1;
    public int cE;
    public String cF = "none";
    public Map<String, String> cG;
    public String cH = "none";
    public int cI;
    public int cJ = -1;
    public float cK = -1.0f;
    public float cL = -1.0f;
    public int cM;
    public int cN = -1;
    public int cO = -1;
    public long cP;
    public int cQ;
    public c cR;
    public boolean cS;
    public long cT;
    public long cU;
    public long cV;
    public long cW;
    public long cX;
    public long cY;
    public long cZ;
    public int ca = -1;
    public int cb;
    public int cc;
    public List<String> cd;
    public LinkedBlockingQueue<Long> ce;
    public int cf = -1;
    public int cg;
    public int ch;
    public int ci;
    public int cj;
    public int ck;
    public int cl;
    public int cm;
    public int cn = 10;
    public int co = 5000;
    public int cp = 500;
    public String cq = "none";
    public int cr = -1;
    public long cs;
    public long ct;
    public long cu;
    public long cv;
    public int cw;
    public String cx = "none";
    public String cy = "none";
    public int cz;

    /* renamed from: d  reason: collision with root package name */
    public g f154194d;
    public long dA;
    public long dB;
    public long dC;
    public long dD;
    public long dE;
    public long dF;
    public int dG;
    public int dH;
    public String dI = "none";
    public long dJ;
    public String dK = "none";
    public long dL;
    public long dM;
    public int dN;
    public int dO;
    public long dP;
    public long dQ;
    public long dR;
    public long dS;
    public int dT = 4096;
    public int dU = 512;
    public String dV = "";
    public String dW = "";
    public int dX;
    public int dY;
    public int dZ = -1;
    public long da;
    public long db;
    public long dc;
    public long dd;
    public long de;
    public long df;
    public long dg;
    public long dh;
    public long di;
    public long dj;
    public long dk;
    public long dl;
    public int dm = -1;
    public int dn = -1;

    /* renamed from: do  reason: not valid java name */
    public int f351do = -1;
    public long dp;
    public long dq;
    public long dr;
    public long ds;
    public long dt;
    public long du;
    public long dv;
    public long dw;
    public long dx;
    public long dy;
    public long dz;

    /* renamed from: e  reason: collision with root package name */
    public String f154195e = "none";
    private boolean eA;
    private long eB;
    private String eC = "none";
    private boolean eD;
    private boolean eE;
    private String eF = "flv";
    private int eG;
    private int eH;
    private long eI;
    private long eJ;
    private long eK = -1;
    private long eL;
    private long eM;
    private long eN;
    private long eO;
    private long eP;
    private long eQ;
    private long eR;
    private int eS;
    private int eT;
    private int eU;
    private int eV;
    private int eW;
    private int eX;
    private long eY;
    private long eZ;
    public StringBuilder ea;
    public long eb;
    public ArrayList<Integer> ec = new ArrayList<>();
    public volatile long ed = 0;
    public volatile long ee = 0;
    public String ef = "none";
    public float eg = -1.0f;
    public int eh = 0;
    public int ei = 0;
    public int ej = 0;
    public int ek = 0;
    public int el = 0;
    public int em = 0;
    public int en = 0;
    public long eo = 0;
    public int ep = 0;
    public int eq = 0;
    public int er = 0;
    public String es = "none";
    public int et = -1;
    private Handler ev;
    private final long ew;
    private boolean ex;
    private String ey = "none";
    private String ez = "none";

    /* renamed from: f  reason: collision with root package name */
    public String f154196f = "none";
    private int fA;
    private long fB;
    private final int fC = 1;
    private final int fD = 2;
    private final int fE = 3;
    private final int fF = 4;
    private final int fG = 600;
    private int fH = -1;
    private int fI = -1;
    private long fJ = -1;
    private int fK;
    private long fL;
    private long fM;
    private long fN;
    private long fO;
    private long fP;
    private long fQ;
    private long fR;
    private long fS;
    private int fT = -1;
    private int fU = -1;
    private String fV = "none";
    private long fW;
    private long fX;
    private long fY;
    private long fZ;
    private long fa;
    private long fb;
    private int fc;
    private int fd;
    private int fe;
    private int ff;
    private int fg;
    private int fh;
    private long fi;
    private long fj;
    private int fk;
    private boolean fl;
    private final long fm = 300000;
    private ArrayList<Long> fn;
    private ArrayList<Long> fo;
    private ArrayList<Long> fp;
    private ArrayList<Long> fq;
    private long fr = -1;
    private String fs = "none";
    private String ft = "none";
    private JSONObject fu;
    private ArrayList<Integer> fv;
    private ArrayList<Integer> fw;
    private String fx = "tcp";
    private String fy = Build.BOARD;
    private String fz = Build.HARDWARE;

    /* renamed from: g  reason: collision with root package name */
    public String f154197g = "none";
    private long ga;
    private long gb;
    private long gc;
    private long gd;
    private long ge;
    private long gf;
    private long gg;
    private long gh;
    private long gi;
    private long gj;
    private long gk;
    private long gl;
    private long gm;
    private long gn;
    private boolean go;
    private long gp = 5000;

    /* renamed from: h  reason: collision with root package name */
    public String f154198h = "none";

    /* renamed from: i  reason: collision with root package name */
    public String f154199i = "none";

    /* renamed from: j  reason: collision with root package name */
    public String f154200j = "none";

    /* renamed from: k  reason: collision with root package name */
    public boolean f154201k;

    /* renamed from: l  reason: collision with root package name */
    public String f154202l = "none";

    /* renamed from: m  reason: collision with root package name */
    public String f154203m = "none";
    public String n = "none";
    public String o = "none";
    public String p = "none";
    public String q = "none";
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public String w = "none";
    public String x = "none";
    public String y = "";
    public boolean z;

    public final void a(String str) {
        if (this.ex) {
            this.ex = false;
            this.ev.removeCallbacksAndMessages(null);
            a aVar = this.aw;
            if (aVar != null) {
                aVar.f154204a.removeCallbacksAndMessages(null);
            }
            this.aA = false;
        }
        j();
        e(str);
        e();
    }

    public final void a(String str, String str2) {
        if (this.cR != null) {
            this.cT = System.currentTimeMillis();
        }
        this.f154193c.f154208a = System.currentTimeMillis();
        if (this.f154201k) {
            this.gm = this.f154193c.f154208a;
        }
        this.f154193c.av = str2;
        this.ez = str;
        this.f154198h = str;
        JSONObject b2 = b();
        this.ac = 0;
        if (b2 != null) {
            try {
                b2.put("event_key", "start_play").put("rule_ids", this.X).put("set_surface_cost", this.be).put("start_play_time", this.f154193c.f154208a).put("stream_data", this.bg).put("suggest_format", this.bm).put("play_format", this.eF).put("suggest_protocol", this.bn).put("suggest_access_code", this.bq).put("origin_url", this.bp).put("log_total_count_when_playing", this.ac);
                if (TextUtils.equals(this.fx, "h2") || TextUtils.equals(this.fx, "h2q") || TextUtils.equals(this.fx, "h2qu")) {
                    b2.remove("h2_context_start_cost");
                }
                this.f154192b.a(b2, "live_client_monitor_log");
                this.ac++;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(boolean z2, boolean z3) {
        this.f154193c.f154209b = System.currentTimeMillis();
        c cVar = this.cR;
        if (cVar != null) {
            cVar.f154209b = System.currentTimeMillis();
        }
        this.eD = z3;
        this.eE = z2;
    }

    public final void a(JSONObject jSONObject, JSONArray jSONArray, String str) {
        JSONObject b2 = b();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            b2.put(next, jSONObject.getLong(next));
        }
        if (b2 != null) {
            try {
                b2.put("event_key", str).put("push_retry_stall", jSONArray).put("sei_source", this.f154193c.ak);
                this.f154192b.a(b2, "live_client_monitor_log");
                long j2 = this.ac;
                if (j2 > 0) {
                    this.ac = j2 + 1;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(String str, String str2, String str3, int i2) {
        if (this.f154194d != null && this.f154192b != null) {
            try {
                JSONObject b2 = b();
                JSONObject put = b2.put("event_key", "switch_url");
                if (str == null) {
                    str = "null";
                }
                JSONObject put2 = put.put("last_cdn_play_url", str);
                if (str2 == null) {
                    str2 = "null";
                }
                put2.put("next_cdn_play_url", str2).put("res_bitrate", this.bE).put("last_res", this.bD).put("code", i2).put("reason", str3);
                this.f154192b.a(b2, "live_client_monitor_log");
                long j2 = this.ac;
                if (j2 > 0) {
                    this.ac = j2 + 1;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(int i2) {
        g gVar;
        if (!this.Z && (gVar = this.f154194d) != null && this.f154192b != null) {
            gVar.a(this.f154193c, 2);
            JSONObject b2 = b();
            if (b2 != null) {
                try {
                    b2.put("event_key", "first_frame_failed").put("start_time", System.currentTimeMillis()).put("reason", i2);
                    a(b2);
                    this.f154192b.a(b2, "live_client_monitor_log");
                    long j2 = this.ac;
                    if (j2 > 0) {
                        this.ac = j2 + 1;
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final void a(int i2, boolean z2) {
        this.eG = -100015;
        if (z2) {
            this.f154194d.a(this.f154193c, 5);
            long currentTimeMillis = System.currentTimeMillis();
            this.eI = currentTimeMillis;
            if (this.fi == 0) {
                this.fi = currentTimeMillis;
            }
            if (this.cQ == 1) {
                if (this.fR == 0) {
                    this.fR = currentTimeMillis;
                }
                this.fU = this.eG;
            }
            this.eJ = currentTimeMillis;
            this.eK = (long) i2;
            this.ae = true;
            if (this.fq == null) {
                this.fq = new ArrayList<>();
            }
            this.fr = this.eI - this.f154193c.f154208a;
        }
    }

    public final void a(long j2, int i2, boolean z2, boolean z3) {
        this.ee = 1;
        if (j2 <= System.currentTimeMillis() - this.f154193c.f154208a && j2 > ((long) i2)) {
            if (z2) {
                this.fe++;
                this.eY++;
                this.ff = (int) (((long) this.ff) + j2);
                this.eZ += j2;
                if (this.cQ == 1) {
                    this.fN++;
                    this.fO += j2;
                }
                long currentTimeMillis = System.currentTimeMillis() - this.f154193c.f154219l;
                if (this.ft.equals("none")) {
                    this.ft = currentTimeMillis + ":" + j2;
                } else {
                    this.ft += "," + currentTimeMillis + ":" + j2;
                }
                if (this.f154201k) {
                    this.eO++;
                    this.eP += j2;
                    this.eU++;
                    this.eV = (int) (((long) this.eV) + j2);
                }
            } else {
                this.fg++;
                this.fa++;
                this.fh = (int) (((long) this.fh) + j2);
                this.fb += j2;
                if (this.cQ == 1) {
                    this.fP++;
                    this.fQ += j2;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - this.f154193c.f154219l;
                if (this.fs.equals("none")) {
                    this.fs = currentTimeMillis2 + ":" + j2;
                } else {
                    this.fs += "," + currentTimeMillis2 + ":" + j2;
                }
                if (this.f154201k) {
                    this.eQ++;
                    this.eR += j2;
                    this.eW++;
                    this.eX = (int) (((long) this.eX) + j2);
                }
            }
            if (z3) {
                this.f154194d.a(this.f154193c, 4);
                JSONObject b2 = b();
                if (b2 != null) {
                    try {
                        b2.put("event_key", "render_stall").put(StringSet.type, z2 ? "video" : DataType.AUDIO).put("stall_time", j2).put("video_buffer_time", this.f154193c.ac).put("audio_buffer_time", this.f154193c.ad);
                        this.f154192b.a(b2, "live_client_monitor_log");
                        long j3 = this.ac;
                        if (j3 > 0) {
                            this.ac = j3 + 1;
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    public final void a(long j2, int i2, boolean z2) {
        if (j2 <= System.currentTimeMillis() - this.f154193c.f154208a && j2 > ((long) i2)) {
            if (z2) {
                this.ga++;
                this.gb += j2;
                if (this.f154201k) {
                    this.gi++;
                    this.gj += j2;
                }
            } else {
                this.gc++;
                this.gd += j2;
                if (this.f154201k) {
                    this.gk++;
                    this.gl += j2;
                }
            }
            JSONObject b2 = b();
            if (b2 != null) {
                try {
                    b2.put("event_key", "demux_stall").put(StringSet.type, z2 ? "video" : DataType.AUDIO).put("stall_time", j2);
                    this.f154192b.a(b2, "live_client_monitor_log");
                    long j3 = this.ac;
                    if (j3 > 0) {
                        this.ac = j3 + 1;
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final void a(long j2, boolean z2) {
        JSONObject b2;
        if (j2 <= System.currentTimeMillis() - this.f154193c.f154208a && (b2 = b()) != null) {
            try {
                b2.put("event_key", "rtc_decode_stall").put(StringSet.type, z2 ? "video" : DataType.AUDIO).put("decode_stall_time", j2);
                this.f154192b.a(b2, "live_client_monitor_log");
                long j3 = this.ac;
                if (j3 > 0) {
                    this.ac = j3 + 1;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(int i2, String str) {
        if (this.fu == null) {
            this.fu = new JSONObject();
        }
        try {
            this.fu.put(Long.toString(System.currentTimeMillis() - this.f154193c.f154208a), i2);
        } catch (JSONException e2) {
            this.fu = null;
            e2.printStackTrace();
        }
        this.f154194d.a(this.f154193c, 2);
        JSONObject b2 = b();
        this.f154194d.g();
        if (b2 != null) {
            try {
                b2.put("event_key", "play_error").put("code", i2).put("info", str);
                a(b2);
                this.f154192b.a(b2, "live_client_monitor_log");
                long j2 = this.ac;
                if (j2 > 0) {
                    this.ac = j2 + 1;
                }
                this.eG = i2;
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    public final void a(boolean z2) {
        if (this.aF == 1) {
            com.ss.videoarch.a.b.b.a(z2 ? 8013 : 8014, this.Y, -1);
        }
        if (this.aI == 1) {
            LiveIOWrapper.getInstance().setInt64ValueByStrKey(z2 ? 1008 : 1009, this.f154194d.aY, -1);
        }
        JSONObject b2 = b();
        if (b2 != null) {
            try {
                b2.put("event_key", "link").put("info", z2 ? "start" : "end");
                this.f154192b.a(b2, "live_client_monitor_log");
                long j2 = this.ac;
                if (j2 > 0) {
                    this.ac = j2 + 1;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(String str, boolean z2) {
        this.f154199i = str;
        this.eA = z2;
    }

    public final void a(int i2, int i3, long j2) {
        LinkedBlockingQueue<Long> linkedBlockingQueue;
        int i4;
        JSONObject b2;
        if (i2 >= 0 && i3 > 0 && j2 >= 0 && (linkedBlockingQueue = this.ce) != null) {
            int i5 = this.fH;
            if (i5 == -1) {
                this.fH = i2;
                this.fI = i3;
                this.fJ = j2;
            } else if (i2 != i5) {
                long j3 = -1;
                if (linkedBlockingQueue.size() > 0) {
                    j3 = this.ce.peek().longValue();
                }
                int i6 = 0;
                if (j3 > 0 && j3 <= this.fJ) {
                    boolean z2 = false;
                    int i7 = 0;
                    while (this.ce.size() > 0) {
                        long longValue = this.ce.peek().longValue();
                        long j4 = this.fJ;
                        if (longValue == j4) {
                            z2 = true;
                        } else if (!z2) {
                            continue;
                            this.ce.poll().longValue();
                        }
                        if (longValue > j4 && longValue <= j2) {
                            i7++;
                            if (longValue == j2) {
                                break;
                            }
                        }
                        this.ce.poll().longValue();
                    }
                    if (i2 - this.fH == 1 && i7 > 0 && i7 != i3) {
                        if (i7 < i3) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        if (!(this.f154194d == null || (b2 = b()) == null)) {
                            try {
                                b2.put("event_key", "stream_abnormal").put("stream_type", "video").put(StringSet.type, i4).put("sent_frames", i3).put("received_frames", i7);
                                this.f154192b.a(b2, "live_client_monitor_log");
                                long j5 = this.ac;
                                if (j5 > 0) {
                                    this.ac = j5 + 1;
                                }
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                }
                int i8 = this.fH;
                if (i2 - i8 != 1) {
                    if (i2 <= i8) {
                        i6 = 1;
                    }
                    a(i6, i2, i8);
                }
                this.fH = i2;
                this.fI = i3;
                this.fJ = j2;
            }
        }
    }

    public final void a(int i2, int i3, int i4) {
        JSONObject b2;
        if (this.f154194d != null && (b2 = b()) != null) {
            try {
                b2.put("event_key", "stream_abnormal").put("stream_type", "video").put(StringSet.type, i2).put("cur_index", i3).put("last_index", i4);
                this.f154192b.a(b2, "live_client_monitor_log");
                long j2 = this.ac;
                if (j2 > 0) {
                    this.ac = j2 + 1;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    static {
        Covode.recordClassIndex(102838);
    }

    public final void f() {
        c cVar;
        g gVar = this.f154194d;
        if (gVar != null && (cVar = this.f154193c) != null) {
            gVar.a(cVar, 8);
        }
    }

    public final void g() {
        c cVar;
        g gVar = this.f154194d;
        if (gVar != null && (cVar = this.f154193c) != null) {
            gVar.a(cVar, 9);
        }
    }

    public final void i() {
        this.aq = true;
        this.ar = System.currentTimeMillis();
    }

    public final boolean k() {
        g gVar = this.f154194d;
        if (gVar != null) {
            return gVar.w();
        }
        return false;
    }

    public final void c() {
        if (!this.Z) {
            this.f154193c.f154210c = System.currentTimeMillis();
            c cVar = this.cR;
            if (cVar != null) {
                cVar.f154210c = System.currentTimeMillis();
            }
        }
    }

    public final void j() {
        LinkedBlockingQueue<Long> linkedBlockingQueue = this.ce;
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.clear();
            this.ce = null;
        }
        this.fH = -1;
        this.fI = -1;
        this.fJ = -1;
        this.cf = -1;
        this.fH = -1;
    }

    private void m() {
        c cVar;
        if (this.cQ != 0 && (cVar = this.cR) != null) {
            this.cS = false;
            this.fR = 0;
            this.fS = 0;
            this.fL = 0;
            this.fM = 0;
            this.cT = 0;
            this.cU = 0;
            this.cV = 0;
            this.fN = 0;
            this.fO = 0;
            this.fP = 0;
            this.fQ = 0;
            this.fT = -1;
            this.fU = 0;
            this.fV = "none";
            cVar.a();
        }
    }

    private void p() {
        long j2 = this.cV;
        if (j2 > 0 && this.cU > 0) {
            this.fT = 0;
        } else if (j2 > 0 && this.cU <= 0) {
            this.fT = 1;
        } else if (j2 > 0 || this.cU <= 0) {
            this.fT = 3;
        } else {
            this.fT = 2;
        }
    }

    private void o() {
        if (this.f154193c.f154220m > 0 && this.f154193c.f154219l > 0) {
            this.eH = 0;
        } else if (this.f154193c.f154220m > 0 && this.f154193c.f154219l <= 0) {
            this.eH = 1;
        } else if (this.f154193c.f154220m > 0 || this.f154193c.f154219l <= 0) {
            this.eH = 3;
        } else {
            this.eH = 2;
        }
    }

    private JSONObject l() {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        n();
        try {
            JSONObject put = new JSONObject().put("start_time", this.f154193c.f154208a).put("duration", System.currentTimeMillis() - this.f154193c.f154208a).put("render_fps_series", new JSONArray((Collection) this.fn)).put("download_bitrate_series", new JSONArray((Collection) this.fo)).put("play_buffer_series", new JSONArray((Collection) this.fp)).put("speed_switch_series", this.L).put("video_stall_series", this.ft).put("audio_stall_series", this.fs);
            if (this.fv == null) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = new JSONArray((Collection) this.fv);
            }
            JSONObject put2 = put.put("push_bitrate_series", jSONArray);
            if (this.fw == null) {
                jSONArray2 = new JSONArray();
            } else {
                jSONArray2 = new JSONArray((Collection) this.fw);
            }
            JSONObject put3 = put2.put("push_fps_series", jSONArray2);
            if (this.fq == null) {
                jSONArray3 = new JSONArray();
            } else {
                jSONArray3 = new JSONArray((Collection) this.fq);
            }
            JSONObject put4 = put3.put("stall_series", jSONArray3);
            JSONObject jSONObject = this.fu;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject put5 = put4.put("error_series", jSONObject);
            if (this.aP == null) {
                jSONArray4 = new JSONArray();
            } else {
                jSONArray4 = new JSONArray((Collection) this.aP);
            }
            return put5.put("push_stall_series", jSONArray4).put("push_video_stall_series", this.aR).put("push_audio_stall_series", this.aQ);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void n() {
        c cVar;
        g gVar = this.f154194d;
        if (gVar != null && this.f154192b != null && (cVar = this.f154193c) != null) {
            gVar.a(cVar, 3);
            if (this.fn == null) {
                this.fn = new ArrayList<>();
                this.fp = new ArrayList<>();
                this.fo = new ArrayList<>();
            }
            this.fn.add(Long.valueOf((long) this.f154193c.Z));
            this.fp.add(Long.valueOf(this.f154193c.ad));
            this.fo.add(Long.valueOf(this.f154193c.aa));
            if (this.aS) {
                if (this.fw == null) {
                    this.fw = new ArrayList<>();
                    this.fv = new ArrayList<>();
                }
                this.fw.add(Integer.valueOf(this.f154193c.an));
                this.fv.add(Integer.valueOf(this.f154193c.am));
            }
        }
    }

    public final void a() {
        a aVar;
        if (!this.ex) {
            this.ev.sendEmptyMessageDelayed(101, this.ew);
            if (this.aX) {
                this.ev.sendEmptyMessageDelayed(102, 5000);
            }
            if (this.aD == 1 && !this.aA && (aVar = this.aw) != null) {
                aVar.a(103);
                this.aA = true;
            }
            this.ex = true;
        }
    }

    public final void d() {
        c cVar;
        long currentTimeMillis;
        long j2;
        long j3;
        long j4;
        int i2;
        long j5;
        int i3;
        int i4;
        int i5;
        long j6;
        if (this.cQ != 0 && (cVar = this.cR) != null) {
            this.f154194d.a(cVar);
            JSONObject b2 = b();
            if (this.cS) {
                j2 = System.currentTimeMillis() - this.cU;
                currentTimeMillis = 0;
            } else {
                currentTimeMillis = System.currentTimeMillis() - this.cT;
                j2 = 0;
            }
            this.fK++;
            long j7 = this.fR;
            if (j7 > 0) {
                j3 = j7 - this.cU;
                j4 = this.fS - j7;
            } else {
                j3 = 0;
                j4 = 0;
            }
            if (this.ae) {
                this.fL++;
                if (this.eI >= this.cT) {
                    this.fM += System.currentTimeMillis() - this.eI;
                } else {
                    this.fM += System.currentTimeMillis() - this.cT;
                }
            }
            p();
            long j8 = this.cR.U;
            if (b2 != null) {
                try {
                    JSONObject put = b2.put("event_key", "session_stop").put("index", this.fK).put("socket_err_code", this.f154193c.aD).put("socket_err_type", this.f154193c.aC).put("stop_time", System.currentTimeMillis()).put("play_time", j2);
                    if (this.cS) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    JSONObject put2 = put.put("is_stream_received", i2).put("render_fail_type", this.fT).put("code", this.fU).put("stall_count", this.fL).put("stall_time", this.fM).put("audio_render_stall_count", this.fP).put("audio_render_stall_time", this.fQ).put("video_render_stall_count", this.fN).put("video_render_stall_time", this.fO).put("start", this.cT).put("sdk_dns_analysis_end", this.cR.f154209b).put("player_dns_analysis_end", this.f154193c.f154211d).put("http_req_finish_time", this.cR.S).put("http_res_finish_time", this.cR.T).put("tcp_first_package_end", this.f154193c.f154214g).put("first_video_package_end", this.cR.f154215h).put("first_audio_package_end", this.cR.f154216i).put("first_video_frame_decode_end", this.cR.f154217j).put("first_audio_frame_decode_end", this.cR.f154218k).put("video_device_open_start", this.cR.p).put("video_device_open_end", this.cR.q).put("audio_device_open_start", this.cR.r).put("audio_device_open_end", this.cR.s).put("video_device_wait_start", this.cR.at).put("video_device_wait_end", this.cR.au).put("find_stream_info_start", this.cR.ar).put("find_stream_info_end", this.cR.as).put("video_param_send_outlet_time", this.cR.ao).put("first_video_frame_send_outlet_time", this.cR.ap).put("first_frame_render_end", this.cU).put("first_audio_frame_end", this.cV).put("prepare_end", this.cR.o).put("prepare_block_end", this.cR.f154210c).put("video_first_pkt_pos", this.cR.M).put("video_first_pkt_pts", this.cR.N).put("audio_first_pkt_pos", this.cR.O).put("audio_first_pkt_pts", this.cR.P).put("video_render_type", this.cR.aq).put("download_speed", this.cR.ae).put("video_buffer_time", this.cR.af).put("audio_buffer_time", this.cR.ag);
                    if (this.cR.ah > 0) {
                        j5 = this.f154193c.ah;
                    } else {
                        j5 = -this.f154193c.ah;
                    }
                    JSONObject put3 = put2.put("wait_time", j5);
                    if (this.cR.ah >= 0) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    JSONObject put4 = put3.put("is_waiting", i3).put("first_stall_time", j3).put("first_stall_duration", j4).put("play_time_on_no_frame", currentTimeMillis);
                    String str = this.f154202l;
                    if (str == null) {
                        str = "none";
                    }
                    JSONObject put5 = put4.put("sdk_params", str).put("total_download_size", j8).put("drop_audio_pts_diff", this.cR.Q).put("drop_audio_cost", this.cR.R);
                    if (this.bi) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    JSONObject put6 = put5.put("sr_used", i4);
                    if (this.go) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    put6.put("sharpen_used", i5).put("network_timeout", this.bW).put("suggest_format", this.bm).put("suggest_protocol", this.bn).put("suggest_access_code", this.bq).put("error_msg", this.fV);
                    if (this.ez == null) {
                        b2.put("tcp_connect_end", this.cR.f154213f);
                    } else {
                        if ("kcp".equals(this.fx)) {
                            j6 = this.cR.f154211d;
                        } else {
                            j6 = this.cR.f154213f;
                        }
                        b2.put("tcp_connect_end", j6);
                    }
                    this.ac++;
                    this.f154192b.a(b2, "live_client_monitor_log");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            m();
        }
    }

    public final void e() {
        this.ez = "none";
        this.f154198h = "none";
        this.f154199i = "none";
        this.eA = false;
        this.eB = 0;
        this.f154203m = "none";
        this.n = "none";
        this.o = "none";
        this.p = "none";
        this.q = "none";
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = "none";
        this.x = "none";
        this.eC = "none";
        this.eD = false;
        this.A = false;
        this.eE = false;
        this.bQ = false;
        this.aO = -1;
        this.E = false;
        this.F = -1;
        this.G = -1.0f;
        this.H = -1;
        this.I = -1.0f;
        this.J = 0;
        this.K = "none";
        this.M = 0;
        this.N = 0;
        this.O = -1;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.T = 0;
        this.aV = -1;
        this.aU = 0;
        this.Z = false;
        this.aa = 0;
        this.eG = 0;
        this.eI = 0;
        this.eK = -1;
        this.ad = 0;
        this.eL = 0;
        this.eZ = 0;
        this.eY = 0;
        this.fb = 0;
        this.fa = 0;
        this.as = 0;
        this.at = 0;
        this.aq = false;
        this.ae = false;
        this.fc = 0;
        this.fd = 0;
        this.fg = 0;
        this.fh = 0;
        this.fe = 0;
        this.ff = 0;
        this.eJ = 0;
        this.fi = 0;
        this.fj = 0;
        this.af = 0;
        this.ag = 0;
        this.ah = 0;
        this.ai = 0;
        this.aj = 0;
        this.ak = 0;
        this.fk = 0;
        this.al = 0;
        this.am = -1;
        this.ax = false;
        this.aE = 0;
        this.aC = 0;
        this.aD = 0;
        this.aM = 0;
        this.aN = 0;
        this.aY = -1;
        this.bi = false;
        this.bh = 0;
        this.bj = false;
        this.bk = -1.0f;
        this.bl = 0;
        this.cP = 0;
        this.fn = null;
        this.fo = null;
        this.fp = null;
        this.fv = null;
        this.fw = null;
        this.fu = null;
        this.fq = null;
        this.fr = -1;
        this.L = "none";
        this.fs = "none";
        this.ft = "none";
        this.aR = "none";
        this.aQ = "none";
        this.aP = null;
        c cVar = this.f154193c;
        if (cVar != null) {
            cVar.a();
        }
        this.D = "none";
        this.B = "none";
        this.bd = 1;
        this.X = "none";
        this.Y = "none";
        this.bw = "none";
        this.bx = "none";
        this.es = "none";
        this.aG = 0;
        this.aF = 0;
        this.aH = 0;
        this.aJ = -1;
        this.bS = 0;
        this.bR = 0;
        this.by = false;
        this.bA = false;
        this.bz = "rad";
        this.bB = "origin";
        this.bC = "origin";
        this.bD = "none";
        this.bF = -1;
        this.bE = -1;
        this.bG = 0;
        this.bH = "none";
        this.bO = "none";
        this.bK = -1;
        this.bL = -1;
        this.bM = -1;
        this.bN = -1;
        this.bP = 4;
        this.bI = false;
        this.bJ = -1;
        this.bW = -1;
        this.bY = -1;
        this.bX = -1;
        this.bZ = -1;
        this.ca = -1;
        this.fA = 0;
        this.fB = 0;
        this.bV = 0;
        this.cb = 0;
        this.cc = 0;
        this.eh = 0;
        this.ei = 0;
        this.ej = 0;
        this.el = 0;
        this.ek = 0;
        this.em = 0;
        this.en = 0;
        this.eo = 0;
        this.U = 0;
        this.V = -1;
        this.W = -1.0f;
        this.ep = 0;
        this.cd = null;
        this.ck = 0;
        this.ct = 0;
        this.cv = 0;
        this.cu = 0;
        this.cm = 0;
        this.cw = 0;
        this.cx = "none";
        this.cy = "none";
        this.cI = 0;
        this.cF = "none";
        this.cG = null;
        this.cH = "none";
        this.cM = 0;
        this.cN = -1;
        this.cO = -1;
        this.cQ = 0;
        this.fK = 0;
        this.fW = 0;
        this.fX = 0;
        this.fY = 0;
        this.fZ = 0;
        this.ga = 0;
        this.gb = 0;
        this.gc = 0;
        this.gd = 0;
        this.dN = 0;
        this.dO = 0;
        this.dP = 0;
        this.dQ = 0;
        this.dR = 0;
        this.dS = 0;
        this.dW = "";
        this.dV = "";
        this.aI = 0;
        this.dG = 0;
        this.dH = 0;
        this.dI = "none";
        this.dJ = 0;
        this.dK = "none";
        this.dX = 0;
        this.dY = 0;
        this.dZ = -1;
        this.ea = null;
        this.eb = 0;
        this.eM = 0;
        this.eN = 0;
        this.eO = 0;
        this.eP = 0;
        this.eQ = 0;
        this.eR = 0;
        this.eT = 0;
        this.eS = 0;
        this.eV = 0;
        this.eU = 0;
        this.eW = 0;
        this.eX = 0;
        this.ge = 0;
        this.gf = 0;
        this.gg = 0;
        this.gh = 0;
        this.gi = 0;
        this.gj = 0;
        this.gk = 0;
        this.gl = 0;
        this.gm = 0;
        this.gn = 0;
        this.dF = 0;
        this.cX = 0;
        this.cZ = 0;
        this.cW = 0;
        this.cY = 0;
        this.dj = 0;
        this.dl = 0;
        this.di = 0;
        this.dk = 0;
        this.dm = -1;
        this.dn = -1;
        this.f351do = -1;
        this.dp = 0;
        this.dq = 0;
        this.dr = 0;
        this.ds = 0;
        this.dt = 0;
        this.du = 0;
        this.dv = 0;
        this.dw = 0;
        this.dx = 0;
        this.dy = 0;
        this.dz = 0;
        this.dA = 0;
        this.dB = 0;
        this.dC = 0;
        this.dD = 0;
        this.dE = 0;
        this.de = 0;
        this.dg = 0;
        this.df = 0;
        this.dh = 0;
        this.ef = "none";
        this.eq = 0;
        this.er = 0;
    }

    public final JSONObject h() {
        int i2;
        String str;
        String str2;
        c cVar = new c();
        this.f154194d.a(cVar, 1);
        try {
            JSONObject put = new JSONObject().put("playing_time:", System.currentTimeMillis() - this.aa).put("live_sdk_version:", "1.4.30.8");
            String str3 = this.f154200j;
            String str4 = "-1";
            if (str3 == null) {
                str3 = str4;
            }
            JSONObject put2 = put.put("player_sdk_version:", str3);
            String str5 = this.f154199i;
            if (str5 != null) {
                str4 = str5;
            }
            JSONObject put3 = put2.put("cdn_ip:", str4).put("push_client_sdk_version:", this.f154203m).put("push_client_platform:", this.n).put("push_client_model:", this.p).put("push_client_os_version:", this.o).put("push_client_is_hardware_encode:", this.r).put("push_client_push_protocol:", this.w).put("push_client_qid:", this.x).put("push_client_bitrate:", this.f154193c.am).put("push_client_fps:", this.f154193c.an);
            int i3 = 0;
            if (this.eD) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            JSONObject put4 = put3.put("Hit_Node_Optimizer:", i2).put("Evaluator_Symbol:", this.eC);
            if (this.A) {
                i3 = 1;
            }
            JSONObject put5 = put4.put("Is_Remote_Sorted:", i3).put("Stall_Total_Count:", this.ad).put("Stall_Total_Time:", this.eL);
            long j2 = this.eK;
            if (j2 == -1) {
                str = "no stall";
            } else if (j2 == 0) {
                str = "network stall";
            } else {
                str = "decode stall";
            }
            JSONObject put6 = put5.put("Stall_Reason:", str).put("audio_Render_Stall_Total_Count：", this.fa).put("audio_Render_Stall_Total_Time：", this.fb).put("video_Render_Stall_Total_Count：", this.eY).put("video_Render_Stall_Total_Time：", this.eZ).put("first_frame_time:", this.f154193c.f154219l - this.f154193c.f154208a).put("video_Buffer_Time:", cVar.ac).put("audio_Buffer_Time:", cVar.ad).put("delay:", this.f154193c.aj).put("render_fps:", (double) cVar.Z).put("sei_source:", this.f154193c.ak).put("download_Speed:", cVar.aa).put("Error_Code:", this.eG).put("HardDecode:", this.C).put("Codec_Type:", this.B).put("Codec_Name:", this.D);
            if (this.aH == 1) {
                str2 = "PCDN";
            } else if (this.aF == 1) {
                str2 = "Http-CDN";
            } else {
                str2 = "none";
            }
            JSONObject put7 = put6.put("MDL_Vendor:", str2).put("audio_Buffer_Time_On_First_Frame:", this.f154193c.ag).put("waiting_Time_After_First_Frame:", this.f154193c.ah).put("dns_ip:", this.f154193c.av).put("url:", this.ez).put("width:", this.aM).put("height:", this.aN).put("resolution:", cVar.aw).put("play_format:", this.eF).put("play_protocol:", this.fx).put("settings_res:", this.bB).put("enable_resolution_auto_degrade:", this.by);
            if (TextUtils.equals(this.bn, "quicu")) {
                put7.put("audio_quicu_frame_drop_time:", this.db).put("video_quicu_frame_drop_time:", this.dd).put("audio_quicu_frame_drop_count:", this.da).put("video_quicu_frame_drop_count:", this.dc);
            }
            return put7;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final JSONObject b() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        boolean z2;
        boolean z3;
        boolean z4;
        g gVar = this.f154194d;
        if (!(gVar.f154319j == null || gVar.f154311b == null)) {
            int b2 = gVar.f154319j.b(141, -1);
            if (b2 == 0) {
                gVar.f154311b.B = "h264";
            } else if (b2 == 1) {
                gVar.f154311b.B = "bytevc1";
            }
        }
        g gVar2 = this.f154194d;
        int i14 = 0;
        if (gVar2.f154319j != null) {
            String c2 = gVar2.f154319j.c(71);
            if (gVar2.x() && c2 != null && !c2.startsWith("[")) {
                c2 = com.a.a("[%s]", new Object[]{c2});
            }
            if (!(c2 == null || gVar2.B == null || c2.equals(gVar2.B))) {
                if (gVar2.B.equals("none")) {
                    gVar2.f154311b.a(c2, true);
                } else {
                    gVar2.f154311b.ef = c2;
                }
            }
            gVar2.f154311b.ef = "none";
        }
        try {
            JSONObject put = new JSONObject().put("report_version", "5").put("live_sdk_version", "1.4.30.8").put("product_line", "live").put("client_timestamp", System.currentTimeMillis());
            String str2 = this.f154200j;
            String str3 = "-1";
            if (str2 == null) {
                str2 = str3;
            }
            JSONObject put2 = put.put("player_sdk_version", str2);
            String str4 = this.f154197g;
            if (str4 == null) {
                str4 = str3;
            }
            JSONObject put3 = put2.put("project_key", str4);
            String str5 = this.f154195e;
            if (str5 == null) {
                str5 = "none";
            }
            JSONObject put4 = put3.put("live_stream_enter_method", str5);
            String str6 = this.f154196f;
            if (str6 == null) {
                str6 = "none";
            }
            JSONObject put5 = put4.put("live_stream_enter_action", str6);
            String str7 = this.ez;
            if (str7 != null) {
                str3 = str7;
            }
            JSONObject put6 = put5.put("cdn_play_url", str3);
            String str8 = this.f154199i;
            if (str8 == null) {
                str8 = "none";
            }
            JSONObject put7 = put6.put("cdn_ip", str8).put("request_url", this.cF);
            if (this.eA) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            JSONObject put8 = put7.put("ip_from_player_core", i2);
            if (this.f154201k) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            JSONObject put9 = put8.put("is_preview", i3).put("push_client_sdk_version", this.f154203m).put("push_client_platform", this.n).put("push_client_os_version", this.o).put("push_client_model", this.p).put("push_client_start_time", this.q).put("push_client_is_hardware_encode", this.r).put("push_client_min_bitrate", this.s).put("push_client_max_bitrate", this.t).put("push_client_default_bitrate", this.u).put("push_client_push_protocol", this.w).put("push_client_qid", this.x).put("push_client_hit_node_optimize", this.v);
            if (this.z) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            JSONObject put10 = put9.put("open_dns_optimizer", i4);
            if (this.eD) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            JSONObject put11 = put10.put("hit_node_optimize", i5).put("evaluator_symbol", this.eC);
            if (this.A) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            JSONObject put12 = put11.put("remote_sorted", i6).put("common_tag", this.ey).put("codec_type", this.B).put("codec_name", this.D);
            if (this.C) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            JSONObject put13 = put12.put("hardware_decode", i7);
            if (this.an) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            JSONObject put14 = put13.put("sharp", i8);
            if (this.E) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            JSONObject put15 = put14.put("enable_hurry", i9).put("hurry_time", this.F).put("catch_speed", new DecimalFormat("0.00").format((double) this.G)).put("slow_play_time", this.H).put("slow_speed", new DecimalFormat("0.00").format((double) this.I));
            if (this.Z) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            JSONObject put16 = put15.put("first_screen", i10);
            if (this.aT) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            JSONObject put17 = put16.put("enable_httpDns", i11).put("enable_ntp", this.aC).put("enable_media_codec_async", this.aU).put("default_codec_id", this.aV).put("url_ability", this.aW).put("max_cache_seconds", this.aY).put("enable_fast_open", this.bc).put("enable_mdl", this.aF).put("enable_p2p", this.aG).put("p2p_loader_type", this.aJ).put("used_p2p", this.aH);
            String str9 = this.aK;
            if (str9 == null) {
                str9 = "none";
            }
            JSONObject put18 = put17.put("mdl_version", str9).put("enable_mdl_proto", this.aL).put("enable_low_latency_flv", this.cc).put("open_strategy_sdk", this.eh).put("enable_strategy_node_opt", this.ei).put("enable_strategy_httpDNS", this.ej).put("enable_strategy_httpDNS_by_localDNS_timeout", this.ek).put("enable_strategy_ipv6", this.el).put("enable_strategy_flv_low_strategy", this.em).put("hit_strategy_opt", this.ep);
            if (this.f154193c.av == null) {
                str = "none";
            } else {
                str = this.f154193c.av;
            }
            JSONObject put19 = put18.put("dns_ip", str).put("in_main_looper", this.bd).put("start_play_buffer_threshold", this.M).put("enable_change_start_play_buffer_advance", this.T).put("fast_open_gop_cache", this.O).put("buffering_end_ignore_video", this.P).put("start_direct_after_prepared", this.Q).put("check_buffering_end_advance", this.R).put("channel_id", this.f154193c.al).put("sei_delay", this.f154193c.aj).put("sei_source", this.f154193c.ak).put("chip_board", this.fy).put("chip_hardware", this.fz).put("width", this.aM).put("height", this.aN).put("settings_info", this.bw).put("ttnet_nqe_info", this.bx).put("play_format", this.eF).put("play_protocol", this.fx).put("url_set_method", this.f154194d.ak).put("enable_resolution_auto_degrade", this.by).put("has_abr_info", this.bA).put("quic_load_succ", this.bo).put("link_info", this.y);
            if (this.bj) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            JSONObject put20 = put19.put("used_texturerender", i12).put("settings_res", this.bB).put("is_too_large_av_diff", this.f154193c.aW).put("stall_retry_time_interval", this.ap).put("is_too_large_av_diff", this.f154193c.aW);
            g gVar3 = this.f154194d;
            if (gVar3 == null) {
                i13 = 0;
            } else if (gVar3.aE == 1) {
                i13 = 2;
            } else {
                i13 = gVar3.aD;
            }
            JSONObject put21 = put20.put("enable_rtc_play", i13).put("enable_mini_sdp", this.cl).put("rtc_play_fallback", this.cm).put("fallback_type", this.cw).put("mute_audio", this.cJ).put("volume_setting", (double) this.cK).put("player_volume_setting", (double) this.cL).put("enable_liveio_play", this.aI).put("liveio_play", this.dG).put("liveio_p2p", this.dH).put("timer_version", this.ca).put("is_background", this.dY).put("duration_of_start_auto_speed", this.N).put("redirect_ip", this.ef).put("request_id", this.cH).put("backup_to_origin", this.eq).put("enable_strategy_performance_optimization", this.en).put("strategy_start_up_delay", this.eo).put("request_id", this.cH).put("udp_probe_result", this.et).put("quic_fallback_tcp", this.er).put("enable_global_volume_balance", this.U).put("volume_balance_type", this.V).put("volume_balance_targetlufs", (double) this.W);
            ArrayList<Integer> arrayList = this.ec;
            if (arrayList != null && !arrayList.isEmpty()) {
                put21.put("ab_group_id", new JSONArray((Collection) this.ec));
            }
            if (this.aI == 1) {
                put21.put("liveio_error_msg", this.dI);
                put21.put("liveio_version", this.dK);
            }
            if (k()) {
                put21.put("rtc_get_width", this.f154194d.k());
                put21.put("rtc_get_height", this.f154194d.l());
            }
            if (!this.cx.equals("none")) {
                put21.put("live_stream_session_id", this.cx);
            } else {
                put21.put("live_stream_session_id", this.Y);
            }
            if (this.bB.equals("auto")) {
                put21.put("auto_res", this.bC);
            }
            if (this.f154194d.n == 1) {
                put21.put("texturerender_error", this.bh);
            }
            if (this.f154194d.o == 1 && this.f154194d.n == 1) {
                g gVar4 = this.f154194d;
                if (gVar4.f154322m == null || gVar4.f154322m.c(6, -1) != 1) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4) {
                    if (this.f154194d.q == 0) {
                        put21.put("sr_width", this.aM * 2).put("sr_height", this.aN * 2);
                    } else if (this.f154194d.q == 4) {
                        put21.put("sr_width", (this.aM * 3) / 2).put("sr_height", (this.aN * 3) / 2);
                    }
                    this.bi = true;
                } else {
                    put21.put("sr_width", this.aM).put("sr_height", this.aN);
                }
            }
            if (this.f154194d.aZ == 1) {
                g gVar5 = this.f154194d;
                if (gVar5.f154322m == null || gVar5.f154322m.c(19, 10) != 1) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    put21.put("used_gaussican_blur", 1);
                    put21.put("gaussican_blur_strength", (double) this.eg);
                }
            }
            if (this.f154194d.ba == 1) {
                g gVar6 = this.f154194d;
                if (gVar6.f154322m == null || gVar6.f154322m.c(19, 2) != 1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    put21.put("used_lut_filter", 1);
                }
            }
            if (this.f154194d.aP == 1 && this.f154194d.n == 1) {
                if (this.f154194d.u()) {
                    i14 = 1;
                }
                put21.put("used_sharpen", i14);
                if (!this.go) {
                    this.go = this.f154194d.u();
                }
            }
            if (this.by || this.bA) {
                put21.put("abr_strategy", this.bz).put("defualt_res_bitrate", this.bF).put("stall_count_rad", this.bP);
            }
            if (TextUtils.equals(this.fx, "quic") || TextUtils.equals(this.fx, "quicu") || TextUtils.equals(this.fx, "h2q") || TextUtils.equals(this.fx, "h2qu")) {
                put21.put("quic_config_cached", this.f154193c.aE).put("quic_CHLO_count", this.f154193c.aF);
            }
            if (TextUtils.equals(this.fx, "h2") || TextUtils.equals(this.fx, "h2q") || TextUtils.equals(this.fx, "h2qu")) {
                put21.put("h2_context_start_cost", this.f154193c.aI);
                put21.put("h2_reused", this.f154193c.aJ);
            }
            if (this.f154194d.aI == 1) {
                put21.put("disable_video_render", this.cI);
            }
            int i15 = this.ba;
            if (i15 > 0) {
                put21.put("tsl_timeshift", i15);
            }
            Map<String, String> map = this.cG;
            if (map != null) {
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, String> next = it.next();
                    if (next.getKey().equals("Host")) {
                        put21.put("headers_host", next.getValue().replace(" ", ""));
                        break;
                    }
                }
            }
            int i16 = this.cN;
            if (i16 != -1) {
                put21.put("fcdn_res_type", i16);
            }
            int i17 = this.cO;
            if (i17 != -1) {
                put21.put("fcdn_trans_strategy", i17);
            }
            if (!TextUtils.isEmpty(this.fx) && ((this.fx.equals("quic") || this.fx.equals("quicu")) && !TextUtils.isEmpty(this.f154193c.az))) {
                put21.put("ttquic_sdk_version", this.f154193c.az);
            }
            if (!TextUtils.isEmpty(this.fx) && (this.fx.equals("quic") || this.fx.equals("quicu") || this.fx.equals("h2q") || this.fx.equals("h2qu"))) {
                put21.put("quic_rej_count", this.f154193c.aB);
                put21.put("quic_rej_reasons", this.f154193c.aA);
            }
            return put21;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void d(String str) {
        if (str != null) {
            this.eC = str;
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Handler f154204a;

        /* renamed from: b  reason: collision with root package name */
        private HandlerThread f154205b;

        static {
            Covode.recordClassIndex(102839);
        }

        public final void a(int i2) {
            Handler handler;
            if (this.f154205b != null && (handler = this.f154204a) != null) {
                handler.sendEmptyMessage(i2);
            }
        }

        public a(final b bVar) {
            HandlerThread handlerThread = new HandlerThread("DnsHandlerThread");
            this.f154205b = handlerThread;
            handlerThread.start();
            this.f154204a = new Handler(this.f154205b.getLooper()) {
                /* class com.ss.videoarch.a.a.b.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(102840);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
                    if (r3.av == null) goto L_0x0068;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void handleMessage(android.os.Message r11) {
                    /*
                    // Method dump skipped, instructions count: 230
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.a.b.a.AnonymousClass1.handleMessage(android.os.Message):void");
                }
            };
        }
    }

    public final void a(long j2) {
        c cVar = this.f154193c;
        if (cVar != null) {
            cVar.ah = j2;
        }
        c cVar2 = this.cR;
        if (cVar2 != null) {
            cVar2.ah = j2;
        }
    }

    public final void c(long j2) {
        if (j2 >= 1000) {
            this.gp = j2;
        }
    }

    public final void e(int i2) {
        boolean z2;
        int i3 = 0;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.fl = z2;
        if (i2 <= 0) {
            i3 = -1;
        }
        this.am = i3;
    }

    public static long a(JSONArray jSONArray) {
        int length = jSONArray.length();
        long j2 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            j2 += (long) jSONArray.getInt(i2);
        }
        return j2;
    }

    public boolean handleMessage(Message message) {
        int i2 = message.what;
        if (101 == i2) {
            b(false);
            return true;
        } else if (102 != i2) {
            return true;
        } else {
            n();
            if (!this.ex) {
                return true;
            }
            this.ev.sendEmptyMessageDelayed(102, 5000);
            return true;
        }
    }

    private void a(JSONObject jSONObject) {
        if (TextUtils.equals(this.fx, "quic") || TextUtils.equals(this.fx, "quicu")) {
            jSONObject.put("quic_open_result", this.f154193c.aG);
        }
    }

    public final void b(String str) {
        g gVar = this.f154194d;
        if (gVar != null && this.f154192b != null) {
            gVar.a(this.f154193c, 2);
            JSONObject b2 = b();
            if (b2 != null) {
                try {
                    b2.put("event_key", "illegal_call").put("api_name", str);
                    a(b2);
                    this.f154192b.a(b2, "live_client_monitor_log");
                    long j2 = this.ac;
                    if (j2 > 0) {
                        this.ac = j2 + 1;
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final void c(String str) {
        JSONObject b2;
        if (this.f154194d != null && this.f154192b != null && (b2 = b()) != null) {
            try {
                b2.put("event_key", "call_not_in_main_thread").put("api_name", str);
                this.f154192b.a(b2, "live_client_monitor_log");
                long j2 = this.ac;
                if (j2 > 0) {
                    this.ac = j2 + 1;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    private void b(boolean z2) {
        c cVar;
        if (this.f154194d != null && this.f154192b != null && (cVar = this.f154193c) != null) {
            try {
                long j2 = cVar.U;
                long j3 = this.f154193c.V;
                long j4 = this.f154193c.W;
                long j5 = this.f154193c.Y;
                long j6 = this.f154193c.X;
                this.f154194d.a(this.f154193c, 1);
                this.f154192b.a(a(this.f154193c, j2, j3, j4, j5, z2, j6), "live_client_monitor_log");
                long j7 = this.ac;
                if (j7 > 0) {
                    this.ac = j7 + 1;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            long j8 = this.ew;
            if (k()) {
                j8 = this.gp;
            }
            if (this.ex) {
                this.ev.sendEmptyMessageDelayed(101, j8);
            }
        }
    }

    public final void c(int i2) {
        this.fk++;
        this.al++;
        this.f154194d.a(this.f154193c, 2);
        JSONObject b2 = b();
        o();
        if (b2 != null) {
            try {
                b2.put("event_key", "retry").put("reason", this.eG).put("code", i2).put("socket_err_code", this.f154193c.aD).put("socket_err_type", this.f154193c.aC).put("render_fail_type", this.eH);
                a(b2);
                this.f154192b.a(b2, "live_client_monitor_log");
                long j2 = this.ac;
                if (j2 > 0) {
                    this.ac = j2 + 1;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051 A[Catch:{ JSONException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a A[Catch:{ JSONException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c A[Catch:{ JSONException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(int r11) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.a.b.d(int):void");
    }

    public final void b(int i2) {
        if (this.eG == -100015) {
            this.eG = 0;
        }
        if (this.ae) {
            this.ae = false;
            this.f154194d.a(this.f154193c, 6);
            JSONObject b2 = b();
            if (this.fq == null) {
                this.fq = new ArrayList<>();
            }
            this.fq.add(Long.valueOf(this.fr));
            this.fq.add(Long.valueOf(-(System.currentTimeMillis() - this.f154193c.f154208a)));
            if (this.fj == 0) {
                this.fj = System.currentTimeMillis();
            }
            if (this.cQ == 1 && this.fS == 0) {
                this.fS = System.currentTimeMillis();
            }
            if (b2 != null && this.eI != 0) {
                try {
                    if (this.eJ != 0) {
                        this.fc++;
                        this.fd = (int) (((long) this.fd) + (System.currentTimeMillis() - this.eJ));
                        if (this.f154201k) {
                            this.eS++;
                            this.eT = (int) (((long) this.eT) + (System.currentTimeMillis() - this.eJ));
                        }
                    }
                    this.ad++;
                    this.eL += System.currentTimeMillis() - this.eI;
                    this.ed += System.currentTimeMillis() - this.eI;
                    if (this.f154201k) {
                        this.eN++;
                        this.eM += System.currentTimeMillis() - this.eI;
                    }
                    if (this.cQ == 1) {
                        this.fL++;
                        this.fM += System.currentTimeMillis() - this.eI;
                    }
                    b2.put("event_key", "stall").put("stall_start", this.eI).put("stall_end", System.currentTimeMillis()).put("video_buffer_time_stall_start", this.f154193c.aK).put("audio_buffer_time_stall_start", this.f154193c.aL).put("video_buffer_time_stall_end", this.f154193c.aM).put("audio_buffer_time_stall_end", this.f154193c.aN).put("last_res", this.bD).put("reason", this.eK).put("recover_reason", i2);
                    this.f154192b.a(b2, "live_client_monitor_log");
                    long j2 = this.ac;
                    if (j2 > 0) {
                        this.ac = j2 + 1;
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final void b(long j2) {
        c cVar;
        this.Z = true;
        this.fA = this.al;
        this.fB = this.bV;
        long currentTimeMillis = System.currentTimeMillis();
        this.aa = currentTimeMillis;
        if (this.f154201k) {
            this.gn = currentTimeMillis;
        }
        if (this.f154194d != null && this.f154192b != null && (cVar = this.f154193c) != null) {
            try {
                cVar.W = System.currentTimeMillis();
                if (this.f154201k) {
                    c cVar2 = this.f154193c;
                    cVar2.X = cVar2.W;
                }
                this.f154194d.a(this.f154193c, 0);
                JSONObject a2 = a(this.f154193c, this.eE, j2);
                this.dJ = this.aa - this.f154193c.f154208a;
                String str = this.eF;
                if (str != null && ("cmaf".equals(str) || "avph".equals(this.eF))) {
                    a2.put("video_dns_analysis_end", this.f154193c.E).put("audio_dns_analysis_end", this.f154193c.F).put("video_tcp_connect_time", this.f154193c.C).put("audio_tcp_connect_time", this.f154193c.D).put("video_tcp_first_packet_time", this.f154193c.G).put("audio_tcp_first_packet_time", this.f154193c.H).put("video_http_req_finish_time", this.f154193c.I).put("audio_http_req_finish_time", this.f154193c.J).put("video_http_res_finish_time", this.f154193c.K).put("audio_http_res_finish_time", this.f154193c.L);
                    if ("cmaf".equals(this.eF)) {
                        a2.put("cmaf_mpd_dns_analysis_end", this.f154193c.u).put("cmaf_mpd_tcp_connect_time", this.f154193c.v).put("cmaf_mpd_tcp_first_package_end", this.f154193c.x).put("cmaf_mpd_http_req_finish_time", this.f154193c.w).put("cmaf_mpd_http_res_finish_time", this.f154193c.y).put("cmaf_audio_firstseg_connect_time", this.f154193c.A).put("cmaf_video_firstseg_connect_time", this.f154193c.B).put("cmaf_mpd_connect_time", this.f154193c.z);
                    }
                    a(a2);
                }
                this.f154192b.a(a2, "live_client_monitor_log");
                long j3 = this.ac;
                if (j3 > 0) {
                    this.ac = j3 + 1;
                }
                this.K = "1.0:" + this.aa;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    private void e(String str) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        int i2;
        long j8;
        int i3;
        int i4;
        int i5;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        if (this.Z) {
            b(true);
        } else {
            this.f154194d.a(this.f154193c, 2);
            this.fA = this.al;
            this.fB = this.bV;
        }
        d();
        JSONObject b2 = b();
        if (b2 != null) {
            try {
                if (this.Z) {
                    j3 = System.currentTimeMillis() - this.aa;
                    if (this.f154201k) {
                        j12 = System.currentTimeMillis();
                        j13 = this.gn;
                    } else {
                        j12 = this.dF;
                        j13 = this.gn;
                    }
                    j4 = j12 - j13;
                    j5 = 0;
                    j2 = 0;
                } else if (this.eG != 0 || this.f154193c.f154208a == 0) {
                    j5 = 0;
                    j3 = 0;
                    j2 = 0;
                    j4 = 0;
                } else {
                    j2 = System.currentTimeMillis() - this.f154193c.f154208a;
                    if (this.f154201k) {
                        j10 = System.currentTimeMillis();
                        j11 = this.gm;
                    } else {
                        j10 = this.dF;
                        j11 = this.gm;
                    }
                    j5 = j10 - j11;
                    j4 = 0;
                    j3 = 0;
                }
                long j14 = this.fi;
                if (j14 > 0) {
                    j6 = j14 - this.f154193c.f154219l;
                    j7 = this.fj - this.fi;
                } else {
                    j6 = 0;
                    j7 = 0;
                }
                if (this.ae) {
                    this.ad++;
                    this.eL += System.currentTimeMillis() - this.eI;
                    if (this.f154201k) {
                        this.eN++;
                        this.eM += System.currentTimeMillis() - this.eI;
                    }
                }
                if (this.aq && this.ar != 0) {
                    this.as++;
                    this.at += System.currentTimeMillis() - this.ar;
                }
                o();
                long j15 = this.bS + this.f154193c.U;
                JSONObject put = b2.put("event_key", "play_stop").put("socket_err_code", this.f154193c.aD).put("socket_err_type", this.f154193c.aC).put("stop_time", System.currentTimeMillis()).put("play_time", j3);
                if (this.Z) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                JSONObject put2 = put.put("is_stream_received", i2).put("render_fail_type", this.eH).put("code", this.eG).put("stall_count", this.ad).put("stall_time", this.eL).put("audio_render_stall_count", this.fa).put("audio_render_stall_time", this.fb).put("video_render_stall_count", this.eY).put("video_render_stall_time", this.eZ).put("video_decode_stall_count", this.fW).put("video_decode_stall_time", this.fX).put("audio_decode_stall_count", this.fY).put("audio_decode_stall_time", this.fZ).put("video_demux_stall_count", this.ga).put("video_demux_stall_time", this.gb).put("audio_demux_stall_count", this.gc).put("audio_demux_stall_time", this.gd).put("stall_count_preview", this.eN).put("stall_time_preview", this.eM).put("audio_render_stall_count_preview", this.eQ).put("audio_render_stall_time_preview", this.eR).put("video_render_stall_count_preview", this.eO).put("video_render_stall_time_preview", this.eP).put("video_decode_stall_count_preview", this.ge).put("video_decode_stall_time_preview", this.gf).put("audio_decode_stall_count_preview", this.gg).put("audio_decode_stall_time_preview", this.gh).put("video_demux_stall_count_preview", this.gi).put("video_demux_stall_time_preview", this.gj).put("audio_demux_stall_count_preview", this.gk).put("audio_demux_stall_time_preview", this.gl).put("play_time_preview", j4).put("play_time_on_no_frame_preview", j5).put("error_recover_count", this.as).put("error_recover_time", this.at).put("start", this.f154193c.f154208a).put("sdk_dns_analysis_end", this.f154193c.f154209b).put("http_req_finish_time", this.f154193c.S).put("http_res_finish_time", this.f154193c.T).put("first_video_package_end", this.f154193c.f154215h).put("first_audio_package_end", this.f154193c.f154216i).put("first_video_frame_decode_end", this.f154193c.f154217j).put("first_audio_frame_decode_end", this.f154193c.f154218k).put("first_frame_render_end", this.f154193c.f154219l).put("first_audio_frame_end", this.f154193c.f154220m).put("video_device_open_start", this.f154193c.p).put("video_device_open_end", this.f154193c.q).put("audio_device_open_start", this.f154193c.r).put("audio_device_open_end", this.f154193c.s).put("video_device_wait_start", this.f154193c.at).put("video_device_wait_end", this.f154193c.au).put("find_stream_info_start", this.f154193c.ar).put("find_stream_info_end", this.f154193c.as).put("video_param_send_outlet_time", this.f154193c.ao).put("first_video_frame_send_outlet_time", this.f154193c.ap).put("video_first_pkt_pos", this.f154193c.M).put("video_first_pkt_pts", this.f154193c.N).put("audio_first_pkt_pos", this.f154193c.O).put("audio_first_pkt_pts", this.f154193c.P).put("set_surface_time", this.bf).put("set_surface_cost", this.be).put("video_render_type", this.f154193c.aq).put("prepare_block_end", this.f154193c.f154210c).put("prepare_end", this.f154193c.o).put("retry_count", this.al).put("download_speed", this.f154193c.ae).put("video_buffer_time", this.f154193c.af).put("audio_buffer_time", this.f154193c.ag).put("socket_receive_buffer_size_on_first_frame", this.f154193c.ai).put("socket_receive_buffer_size_on_stop", this.f154194d.q());
                if (this.f154193c.ah > 0) {
                    j8 = this.f154193c.ah;
                } else {
                    j8 = -this.f154193c.ah;
                }
                JSONObject put3 = put2.put("wait_time", j8);
                if (this.f154193c.ah >= 0) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                JSONObject put4 = put3.put("is_waiting", i3).put("first_stall_time", j6).put("first_stall_duration", j7).put("call_api_name", str).put("play_time_on_no_frame", j2).put("abr_switch_count", this.bG).put("abr_switch_count_info", this.bH);
                String str2 = this.f154202l;
                if (str2 == null) {
                    str2 = "none";
                }
                JSONObject put5 = put4.put("sdk_params", str2).put("total_download_size", j15).put("drop_audio_pts_diff", this.f154193c.Q).put("drop_audio_cost", this.f154193c.R).put("first_frame_retry_count", this.fA).put("first_frame_retry_duration", this.fB).put("abr_check_enhance", this.ck);
                if (this.bi) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                JSONObject put6 = put5.put("sr_used", i4);
                if (this.go) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                put6.put("sharpen_used", i5).put("network_timeout", this.bW).put("suggest_format", this.bm).put("suggest_protocol", this.bn).put("suggest_access_code", this.bq).put("is_change_network_type", this.br).put("degrade_for_net_change", this.bs).put("session_num", this.fK).put("use_live_threadpool", this.dX).put("used_drm", this.dZ).put("push_audio_stall_time_0", this.af).put("push_audio_stall_time_2", this.ag).put("push_video_stall_time_0", this.ah).put("push_video_stall_time_1", this.ai).put("push_video_stall_time_2", this.aj).put("push_retry_stall", this.ak).put("preconnect_result", this.es).put("ipv6_probe_result", this.f154193c.aY);
                if (this.f154193c.aU != null) {
                    b2.put("abr_stream_info", this.f154193c.aU);
                }
                int i6 = this.S;
                if (i6 != -1) {
                    b2.put("audio_timescale_enable", i6);
                }
                if (this.f154193c.aX != null) {
                    b2.put("avph_stream_info", this.f154193c.aX);
                }
                if (this.f154194d.n == 1) {
                    b2.put("render_start_timestamp", this.bl);
                    b2.put("texturerender_renderstart_timestamp", this.cP);
                }
                int i7 = this.dN;
                if (i7 > 0) {
                    b2.put("av_out_sync_count", i7).put("av_out_sync_duration", this.dP).put("av_out_sync_info", this.dV);
                }
                a(b2);
                if (k()) {
                    b2.put("player_dns_analysis_end", this.cs);
                    b2.put("rtc_use_sdk_dns", this.cr);
                    b2.put("tcp_connect_end", this.ct);
                    b2.put("rtc_tls_handshake_end", this.cu);
                    b2.put("tcp_first_package_end", this.cv);
                    b2.put("rtc_inited_end", this.f154193c.aO);
                    b2.put("rtc_offer_send_end", this.f154193c.aP);
                    b2.put("rtc_answer_recv_end", this.f154193c.aQ);
                    b2.put("rtc_start_end", this.f154193c.aR);
                    b2.put("rtc_playstop_info", this.cy);
                } else {
                    b2.put("tcp_first_package_end", this.f154193c.f154214g);
                    b2.put("player_dns_analysis_end", this.f154193c.f154211d);
                    if (this.ez == null) {
                        b2.put("tcp_connect_end", this.f154193c.f154213f);
                    } else {
                        if ("kcp".equals(this.fx)) {
                            j9 = this.f154193c.f154211d;
                        } else {
                            j9 = this.f154193c.f154213f;
                        }
                        b2.put("tcp_connect_end", j9);
                    }
                }
                String str3 = this.eF;
                if (str3 != null && ("cmaf".equals(str3) || "avph".equals(this.eF))) {
                    b2.put("video_dns_analysis_end", this.f154193c.E).put("audio_dns_analysis_end", this.f154193c.F).put("video_tcp_connect_time", this.f154193c.C).put("audio_tcp_connect_time", this.f154193c.D).put("video_tcp_first_packet_time", this.f154193c.G).put("audio_tcp_first_packet_time", this.f154193c.H).put("video_http_req_finish_time", this.f154193c.I).put("audio_http_req_finish_time", this.f154193c.J).put("video_http_res_finish_time", this.f154193c.K).put("audio_http_res_finish_time", this.f154193c.L);
                    if ("cmaf".equals(this.eF)) {
                        b2.put("cmaf_mpd_dns_analysis_end", this.f154193c.u).put("cmaf_mpd_tcp_connect_time", this.f154193c.v).put("cmaf_mpd_tcp_first_package_end", this.f154193c.x).put("cmaf_mpd_http_req_finish_time", this.f154193c.w).put("cmaf_mpd_http_res_finish_time", this.f154193c.y).put("cmaf_audio_firstseg_connect_time", this.f154193c.A).put("cmaf_video_firstseg_connect_time", this.f154193c.B).put("cmaf_mpd_connect_time", this.f154193c.z);
                        int i8 = this.cE;
                        if (i8 == 1) {
                            b2.put("enable_async", i8);
                        }
                    }
                }
                if (TextUtils.equals(this.bn, "quicu")) {
                    b2.put("audio_quicu_frame_drop_time", this.db).put("video_quicu_frame_drop_time", this.dd).put("audio_quicu_frame_drop_count", this.da).put("video_quicu_frame_drop_count", this.dc).put("audio_quicu_frame_drop_time_preview", this.df).put("video_quicu_frame_drop_time_preview", this.dh).put("audio_quicu_frame_drop_count_preview", this.de).put("video_quicu_frame_drop_count_preview", this.dg).put("audio_level1_frame_drop_time", this.dz).put("video_level1_frame_drop_time", this.dt).put("audio_level2_frame_drop_time", this.dB).put("video_level2_frame_drop_time", this.dv).put("audio_level3_frame_drop_time", this.dD).put("video_level3_frame_drop_time", this.dx).put("audio_before_first_frame_drop_time", this.dr).put("video_before_first_frame_drop_time", this.dp);
                }
                if (this.aX) {
                    b2.put("session_time_series", l());
                }
                if (this.ao) {
                    b2.put("expected_sei_count", this.cg);
                    b2.put("received_sei_count", this.ch);
                    b2.put("expected_unique_sei_count", this.ci);
                    b2.put("received_unique_sei_count", this.cj);
                }
                int i9 = this.cz;
                if (i9 != 0) {
                    b2.put("bitrate_amnormal", i9);
                }
                int i10 = this.cA;
                if (i10 != 0) {
                    b2.put("abr_codec_not_same", i10);
                }
                if (this.cB == 0) {
                    b2.put("abr_list_not_match", 1);
                }
                if (TextUtils.equals(this.fx, "quic") || TextUtils.equals(this.fx, "quicu")) {
                    b2.put("scfg", this.bX).put("mtu", this.bY).put("pad_hello", this.bZ);
                    a(b2, this.bu);
                }
                if (TextUtils.equals(this.fx, "h2") || TextUtils.equals(this.fx, "h2q") || TextUtils.equals(this.fx, "h2qu")) {
                    a(b2, this.bt);
                }
                if (TextUtils.equals(this.eF, "avph")) {
                    a(b2, this.bv);
                }
                if (this.cC) {
                    b2.put("cdn_abr_switch_performed", 1).put("cdn_abr_switch_code", this.cD);
                }
                long j16 = this.ac + 1;
                this.ac = j16;
                b2.put("log_total_count_when_playing", j16);
                this.f154192b.a(b2, "live_client_monitor_log");
                this.ac = 0;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void b(String str, String str2) {
        this.bm = str;
        this.eF = str2;
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null && jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final long a(int i2, long j2) {
        g gVar;
        if (i2 == 0) {
            int i3 = this.t;
            if (i3 != -1 || (gVar = this.f154194d) == null) {
                return (long) i3;
            }
            return gVar.a(i2, j2);
        } else if (i2 == 100) {
            return this.f154193c.aj;
        } else {
            if (i2 != 101) {
                return j2;
            }
            return this.f154193c.f154219l;
        }
    }

    public final void a(String str, String str2, String str3) {
        this.bn = str;
        this.fx = str2;
        this.bq = str3;
    }

    public final void b(long j2, int i2, boolean z2) {
        String str;
        if (j2 <= System.currentTimeMillis() - this.f154193c.f154208a && j2 > ((long) i2)) {
            if (z2) {
                this.fW++;
                this.fX += j2;
                if (this.f154201k) {
                    this.ge++;
                    this.gf += j2;
                }
            } else {
                this.fY++;
                this.fZ += j2;
                if (this.f154201k) {
                    this.gg++;
                    this.gh += j2;
                }
            }
            JSONObject b2 = b();
            if (b2 != null) {
                try {
                    JSONObject put = b2.put("event_key", "decode_stall");
                    if (z2) {
                        str = "video";
                    } else {
                        str = DataType.AUDIO;
                    }
                    put.put(StringSet.type, str).put("stall_time", j2);
                    this.f154192b.a(b2, "live_client_monitor_log");
                    long j3 = this.ac;
                    if (j3 > 0) {
                        this.ac = j3 + 1;
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private JSONObject a(c cVar, boolean z2, long j2) {
        long j3;
        JSONArray jSONArray;
        long j4;
        JSONObject b2 = b();
        if (b2 == null) {
            return null;
        }
        JSONObject put = b2.put("event_key", "first_frame").put("last_retry_end", 0L).put("hit_cache", z2 ? 1 : 0).put("start", cVar.f154208a).put("sdk_dns_analysis_end", cVar.f154209b).put("prepare_block_end", cVar.f154210c);
        if (cVar.t <= 0) {
            j3 = cVar.f154211d;
        } else {
            j3 = cVar.t;
        }
        JSONObject put2 = put.put("tfo_fall_back_time", j3).put("pre_connect", this.aO).put("http_req_finish_time", cVar.S).put("http_res_finish_time", cVar.T).put("first_video_package_end", cVar.f154215h).put("first_audio_package_end", cVar.f154216i).put("first_video_frame_decode_end", cVar.f154217j).put("first_audio_frame_decode_end", cVar.f154218k).put("first_frame_from_player_core", cVar.n).put("first_frame_render_end", cVar.f154219l).put("video_param_send_outlet_time", cVar.ao).put("first_video_frame_send_outlet_time", cVar.ap).put("set_surface_time", this.bf).put("set_surface_cost", this.be).put("video_render_type", cVar.aq).put("video_device_open_start", cVar.p).put("video_device_open_end", cVar.q).put("audio_device_open_start", cVar.r).put("audio_device_open_end", cVar.s).put("video_device_wait_start", cVar.at).put("video_device_wait_end", cVar.au).put("find_stream_info_start", cVar.ar).put("find_stream_info_end", cVar.as).put("video_first_pkt_pos", cVar.M).put("video_first_pkt_pts", cVar.N).put("audio_first_pkt_pos", cVar.O).put("audio_first_pkt_pts", cVar.P).put("video_buffer_time", this.f154193c.ac).put("audio_buffer_time", this.f154193c.ad).put("download_speed", this.f154193c.aa).put("stall_time", j2).put("first_sei_delay", this.f154193c.aj).put("response_header_X-Server-IP", this.f154193c.ax).put("response_header_Via", this.f154193c.ay).put("prepare_end", cVar.o).put("drop_audio_pts_diff", cVar.Q).put("drop_audio_cost", cVar.R).put("enable_tcp_fast_open", this.cb).put("tfo_success", cVar.aV).put("abr_check_enhance", this.ck);
        if (this.cd == null) {
            jSONArray = new JSONArray();
        } else {
            jSONArray = new JSONArray((Collection) this.cd);
        }
        put2.put("optimize_backup_ips", jSONArray).put("suggest_format", this.bm).put("suggest_protocol", this.bn).put("suggest_access_code", this.bq).put("container_fps", (double) this.bk).put("used_drm", this.dZ).put("ipv6_probe_result", cVar.aY);
        if (this.dZ == 1) {
            b2.put("drm_get_secret_key_end", this.eb);
        }
        if (k()) {
            b2.put("player_dns_analysis_end", this.cs);
            b2.put("rtc_use_sdk_dns", this.cr);
            b2.put("tcp_connect_end", this.ct);
            b2.put("rtc_tls_handshake_end", this.cu);
            b2.put("tcp_first_package_end", this.cv);
            b2.put("rtc_inited_end", cVar.aO);
            b2.put("rtc_offer_send_end", cVar.aP);
            b2.put("rtc_answer_recv_end", cVar.aQ);
            b2.put("rtc_start_end", cVar.aR);
        } else {
            b2.put("player_dns_analysis_end", cVar.f154211d);
            b2.put("player_open_input_start", cVar.f154212e);
            if ("kcp".equals(this.fx)) {
                j4 = cVar.f154211d;
            } else {
                j4 = cVar.f154213f;
            }
            b2.put("tcp_connect_end", j4);
            b2.put("tcp_first_package_end", cVar.f154214g);
        }
        int i2 = this.S;
        if (i2 != -1) {
            b2.put("audio_timescale_enable", i2);
        }
        if (this.bI) {
            b2.put("abr_startup_bitrate", cVar.ab);
        }
        if (TextUtils.equals(this.fx, "quic") || TextUtils.equals(this.fx, "quicu")) {
            a(b2, this.bu);
        }
        if (TextUtils.equals(this.fx, "h2") || TextUtils.equals(this.fx, "h2q") || TextUtils.equals(this.fx, "h2qu")) {
            a(b2, this.bt);
        }
        if (TextUtils.equals(this.eF, "avph")) {
            a(b2, this.bv);
        }
        return b2;
    }

    public b(g gVar, com.ss.videoarch.a.a aVar, long j2, long j3, Context context, int i2) {
        this.f154191a = context;
        this.ev = new Handler(this);
        this.ew = j2 <= 0 ? 60000 : j2;
        this.f154192b = aVar;
        this.f154194d = gVar;
        this.f154193c = new c();
        NTPUDPClient nTPUDPClient = new NTPUDPClient();
        this.au = nTPUDPClient;
        nTPUDPClient.setDefaultTimeout(10000);
        this.ap = j3;
        if (i2 == 1) {
            this.cR = new c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0244  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject a(com.ss.videoarch.a.a.c r20, long r21, long r23, long r25, long r27, boolean r29, long r30) {
        /*
        // Method dump skipped, instructions count: 609
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.a.b.a(com.ss.videoarch.a.a.c, long, long, long, long, boolean, long):org.json.JSONObject");
    }
}

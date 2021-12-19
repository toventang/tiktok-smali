package com.ss.ttvideoengine;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.webkit.URLUtil;
import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRAudioStream;
import com.bytedance.vcloud.abrmodule.ABRBufferInfo;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.vcloud.abrmodule.ABRResult;
import com.bytedance.vcloud.abrmodule.ABRResultElement;
import com.bytedance.vcloud.abrmodule.ABRVideoStream;
import com.bytedance.vcloud.abrmodule.DefaultABRModule;
import com.bytedance.vcloud.abrmodule.IABRInfoListener;
import com.bytedance.vcloud.abrmodule.IABRModule;
import com.bytedance.vcloud.abrmodule.IABRModuleSpeedRecord;
import com.bytedance.vcloud.abrmodule.IAudioStream;
import com.bytedance.vcloud.abrmodule.IBufferInfo;
import com.bytedance.vcloud.abrmodule.IPlayStateSupplier;
import com.bytedance.vcloud.abrmodule.ISegmentInfo;
import com.bytedance.vcloud.abrmodule.IVideoStream;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.texturerender.VideoSurface;
import com.ss.texturerender.l;
import com.ss.ttm.player.AudioProcessor;
import com.ss.ttm.player.IMediaDataSource;
import com.ss.ttm.player.LoadControl;
import com.ss.ttm.player.MaskInfo;
import com.ss.ttm.player.NativeAudioProcessor;
import com.ss.ttm.player.SubInfo;
import com.ss.ttm.player.m;
import com.ss.ttvideoengine.ag;
import com.ss.ttvideoengine.aq;
import com.ss.ttvideoengine.be;
import com.ss.ttvideoengine.bg;
import com.ss.ttvideoengine.c.b;
import com.ss.ttvideoengine.c.c;
import com.ss.ttvideoengine.d;
import com.ss.ttvideoengine.f.d;
import com.ss.ttvideoengine.f.e;
import com.ss.ttvideoengine.h.aa;
import com.ss.ttvideoengine.j.e;
import com.ss.ttvideoengine.j.f;
import com.ss.ttvideoengine.q.e;
import java.io.File;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONObject;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public static String f152201a = com.ss.ttvideoengine.o.a.f153129b;

    /* renamed from: b  reason: collision with root package name */
    public static String f152202b = com.ss.ttvideoengine.o.a.f153130c;
    public static boolean bB = false;
    public static com.ss.ttvideoengine.n.c.a bS = null;
    public static int bZ = 0;
    static boolean bd;

    /* renamed from: c  reason: collision with root package name */
    public static String f152203c = com.ss.ttvideoengine.o.a.f153131d;
    private static int cG = 2400;
    private static boolean cH;
    public static int ca = 500;
    public static int cb = 0;
    public static int cc = 100;
    public static int cd = 0;
    public static int ce = 0;
    public static int cf = 0;
    public static String[] cj = new String[0];

    /* renamed from: d  reason: collision with root package name */
    public static e f152204d;
    private static int dd = -1;
    private static int eg;
    private static l.a fJ = null;
    private static boolean fy = true;
    private static Lock fz = new ReentrantLock();
    private static boolean hq = false;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f152205i;

    /* renamed from: j  reason: collision with root package name */
    public static int[] f152206j;
    private static com.ss.ttvideoengine.f.b jc;

    /* renamed from: k  reason: collision with root package name */
    public static int f152207k;
    public int A;
    public String B;
    public int C;
    public boolean D;
    public com.ss.ttm.player.p E;
    public HashMap<String, String> F;
    public com.ss.ttvideoengine.k.k G;
    public g H;
    public ab I;
    ax J;
    bb K;
    ac L;
    public ad M;
    bf N;
    public az O;
    y P;
    public c Q;
    public z R;
    public com.ss.ttvideoengine.h.g S;
    av T;
    public au U;
    public a V;
    public x W;
    public o X;
    public ay Y;
    public String Z;
    public int aA;
    public boolean aB;
    String aC;
    String aD;
    String aE;
    public boolean aF;
    public boolean aG;
    public String aH;
    public String aI;
    public String aJ;
    public boolean aK;
    com.ss.ttvideoengine.m.a aL;
    boolean aM;
    ar aN;
    public int aO;
    public boolean aP;
    public boolean aQ;
    public com.ss.ttvideoengine.s.c aR;
    boolean aS;
    boolean aT;
    boolean aU;
    public boolean aV;
    public boolean aW;
    public boolean aX;
    public boolean aY;
    public boolean aZ;
    public Context aa;
    public Surface ab;
    public SurfaceHolder ac;
    public com.ss.ttvideoengine.j.e ad;
    public com.ss.ttvideoengine.h.j ae;
    public com.ss.ttvideoengine.h.h af;
    com.ss.ttvideoengine.f.e ag;
    public com.ss.ttm.player.m ah;
    public long ai = -1;
    public long aj = -1;
    public long ak = -1;
    public w al;
    public long am = 0;
    public com.ss.ttvideoengine.j.o an;
    Map<String, b> ao;
    public com.ss.ttvideoengine.j.j ap;
    public String aq;
    public boolean ar;
    public boolean as;
    long at;
    public boolean au;
    public boolean av;
    public boolean aw;
    public boolean ax;
    public boolean ay;
    public int az;
    public String bA;
    public Handler bC;
    public int bD;
    public long bE;
    public boolean bF;
    public LoadControl bG;
    public SubInfo bH;
    public long bI;
    public long bJ;
    public long bK;
    public x bL;
    public String bM;
    float bN;
    float bO;
    int bP;
    public String bQ;
    String bR;
    public com.ss.ttvideoengine.n.c.b bT;
    public IABRModule bU;
    public int bV;
    public int bW;
    int bX;
    public int bY;
    long ba;
    public int bb;
    IMediaDataSource bc;
    public boolean be;
    public int bf;
    public com.ss.ttvideoengine.s.f bg;
    public boolean bh;
    int bi;
    public ArrayList<String> bj;
    public ArrayList<String> bk;
    String bl;
    public int bm;
    public VideoSurface bn;
    public int bo;
    public boolean bp;
    public boolean bq;
    public boolean br;
    public boolean bs;
    public Bundle bt;
    public boolean bu;
    public boolean bv;
    public boolean bw;
    boolean bx;
    public com.ss.ttvideoengine.r.c by;
    int bz;
    public String cA;
    public com.ss.ttvideoengine.h.d cB;
    public int cC;
    public boolean cD;
    private int cE = 30;
    private long cF;
    private int cI;
    private boolean cJ;
    private String cK = "h264";
    private boolean cL;
    private boolean cM;
    private int cN;
    private int cO;
    private boolean cP;
    private boolean cQ;
    private boolean cR;
    private boolean cS;
    private boolean cT;
    private boolean cU;
    private int cV;
    private int cW;
    private int cX;
    private int cY;
    private int cZ;
    protected String cg;
    public aq ch;
    public HashMap<String, String> ci;
    public String ck;
    List<String> cl;
    public int cm;
    public int cn;
    public int co;
    public int cp;
    public int cq;
    public int cr;
    public int cs;
    public int ct;
    public int cu;
    public int cv;
    public com.ss.ttvideoengine.j.f cw;
    public int cx;
    public boolean cy;
    public boolean cz;
    private int dA = 10;
    private int dB = 300;
    private int dC;
    private int dD;
    private int dE = 2;
    private int dF = 1;
    private int dG;
    private int dH;
    private int dI = 1;
    private int dJ;
    private int dK;
    private int dL;
    private int dM;
    private int dN;
    private int dO = -1;
    private int dP;
    private float dQ = 0.25f;
    private float dR = -18.0f;
    private float dS = 8.0f;
    private float dT = 0.007f;
    private float dU;
    private float dV;
    private float dW;
    private int dX;
    private boolean dY;
    private int dZ = -2;
    private int da;
    private int db;
    private int dc = 3;
    private int de;
    private int df = 1;
    private int dg;
    private int dh;
    private int di;
    private int dj;
    private int dk;
    private int dl;
    private int dm = -1;
    private int dn;

    /* renamed from: do  reason: not valid java name */
    private int f348do;
    private int dp;
    private int dq = -1;
    private String dr = "";
    private int ds;
    private int dt;
    private int du;
    private int dv = 1;
    private int dw = 1;
    private int dx;
    private int dy = 31;
    private int dz;

    /* renamed from: e  reason: collision with root package name */
    int f152208e = 500;
    private com.ss.ttvideoengine.f.d eA;
    private w eB;
    private w eC;
    private com.ss.ttvideoengine.j.o eD;
    private com.ss.ttvideoengine.j.o eE;
    private String[] eF;
    private Map<w, Integer> eG;
    private Map<w, String> eH;
    private Map<Integer, String> eI;
    private String eJ;
    private boolean eK;
    private long eL;
    private int eM;
    private int eN;
    private int eO;
    private int eP;
    private int eQ;
    private int eR;
    private int eS;
    private int eT;
    private boolean eU;
    private String eV;
    private String eW;
    private String eX;
    private String eY;
    private String eZ;
    private int ea = -1;
    private int eb;
    private int ec;
    private int ed = 5000;
    private int ee;
    private int ef;
    private int eh;
    private int ei = 30;
    private int ej;
    private float ek = 50.0f;
    private int el;
    private int em;
    private int en;
    private int eo = 1;
    private int ep = -1;
    private boolean eq;
    private int er = 1;
    private int es;
    private LinkedList<Pair<Surface, Integer>> et = new LinkedList<>();
    private as eu = null;
    private String ev;
    private String ew;
    private Boolean ex;
    private int ey;
    private com.ss.ttvideoengine.k.c ez;

    /* renamed from: f  reason: collision with root package name */
    int f152209f = -1;
    private HashMap<String, w> fA;
    private boolean fB;
    private boolean fC;
    private long fD;
    private AudioProcessor fE;
    private int fF;
    private int fG;
    private com.ss.texturerender.m fH;
    private String fI;
    private int fK;
    private int fL;
    private int fM;
    private String fN;
    private String fO;
    private String fP;
    private int fQ;
    private int fR;
    private boolean fS;
    private int fT;
    private int fU;
    private int fV;
    private int fW;
    private Queue<Bundle> fX;
    private Map<Integer, String> fY;
    private Map<Integer, String> fZ;
    private boolean fa;
    private String fb;
    private String fc;
    private String fd;
    private String fe;
    private String ff;
    private String fg;
    private boolean fh;
    private int fi;
    private boolean fj;
    private boolean fk;
    private float fl;
    private float fm;
    private int fn;
    private long fo;
    private FileDescriptor fp;
    private long fq;
    private long fr;
    private boolean fs;
    private int ft;
    private bg fu;
    private boolean fv;
    private int fw;
    private int fx;

    /* renamed from: g  reason: collision with root package name */
    Handler f152210g;
    private MaskInfo gA;
    private int gB;
    private int gC;
    private int gD;
    private float gE;
    private int gF;
    private int gG;
    private int gH;
    private boolean gI;
    private final long gJ;
    private int gK;
    private int gL;
    private int gM;
    private int gN;
    private int gO;
    private int gP;
    private int gQ;
    private int gR;
    private int gS;
    private int gT;
    private int gU;
    private int gV;
    private int gW;
    private int gX;
    private int gY;
    private int gZ;
    private String ga;
    private boolean gb;
    private boolean gc;
    private int gd;
    private int ge;
    private boolean gf;
    private boolean gg;
    private boolean gh;
    private boolean gi;
    private int gj;
    private int gk;
    private int gl;
    private String gm;
    private int gn;
    private int go;
    private int gp;
    private int gq;
    private int gr;
    private int gs;
    private int gt;
    private int gu;
    private int gv;
    private int gw;
    private int gx;
    private int gy;
    private int gz;

    /* renamed from: h  reason: collision with root package name */
    Runnable f152211h;
    private float hA;
    private String hB;
    private int hC;
    private com.ss.ttvideoengine.n.b.h hD;
    private boolean hE;
    private long hF;
    private int hG;
    private int hH;
    private int hI;
    private int hJ;
    private int hK;
    private int hL;
    private int hM;
    private int hN;
    private int hO;
    private int hP;
    private int hQ;
    private String hR;
    private String hS;
    private String hT;
    private String hU;
    private int hV;
    private String hW;
    private int hX;
    private int hY;
    private float hZ;
    private int ha;
    private int hb;
    private int hc;
    private int hd;
    private int he;
    private int hf;
    private int hg;
    private HashMap<Integer, Integer> hh;
    private int hi;
    private int hj;
    private int hk;
    private int hl;
    private int hm;
    private com.ss.ttm.player.m hn;
    private int ho;
    private int hp;
    private int hr;
    private int hs;
    private long ht;
    private long hu;
    private long hv;
    private long hw;
    private long hx;
    private float hy;
    private float hz;
    private int iA;
    private int iB;
    private int iC;
    private int iD;
    private int iE;
    private int iF;
    private boolean iG;
    private boolean iH;
    private String iI;
    private int iJ;
    private int iK;
    private int iL;
    private int iM;
    private int iN;
    private int iO;
    private int iP;
    private int iQ;
    private int iR;
    private int iS;
    private int iT;
    private long iU;
    private float iV;
    private int iW;
    private boolean iX;
    private boolean iY;
    private int iZ;
    private float ia;
    private float ib;
    private float ic;
    private int id;
    private int ie;

    /* renamed from: if  reason: not valid java name */
    private int f349if;
    private int ig;
    private int ih;
    private boolean ii;
    private float ij;
    private int ik;
    private int il;
    private int im;
    private int in;
    private int io;
    private int ip;
    private int iq;
    private int ir;
    private int is;
    private int it;
    private int iu;
    private int iv;
    private int iw;
    private int ix;
    private int iy;
    private int iz;
    private int ja;
    private com.ss.ttvideoengine.f.a.b jb;
    private long jd;
    private int je;
    private int jf;
    private int jg;
    private int jh;
    private int ji;
    private int jj;
    private ArrayList<String> jk;
    private int jl;
    private int jm;
    private boolean jn;
    private int jo;
    private String jp;
    private int jq;
    private int jr;
    private int js;
    private final com.ss.ttvideoengine.p.a.b jt;
    private boolean ju;
    private boolean jv;
    private String jw;
    private int jx;

    /* renamed from: l  reason: collision with root package name */
    public boolean f152212l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f152213m;
    public int n;
    public String o = "";
    public int p;
    public int q = 5;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u = true;
    public int v;
    public int w;
    public int x;
    public int y;
    int z;

    /* access modifiers changed from: package-private */
    public static class v implements l.a {
        static {
            Covode.recordClassIndex(101480);
        }

        private v() {
        }

        /* synthetic */ v(byte b2) {
            this();
        }

        @Override // com.ss.texturerender.l.a
        public final int a(String str, String str2) {
            com.ss.ttvideoengine.s.j.a(str, str2);
            return 0;
        }
    }

    public final boolean a(int i2, int i3) {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "[SRLog]doOpenSR open=" + i2 + " reason=" + i3 + " mTextureSurface=" + this.bn + " mHasFirstFrameShown=" + this.av);
        this.fK = i2;
        if (i2 == 0) {
            this.ja = i3;
        }
        VideoSurface videoSurface = this.bn;
        if (videoSurface != null) {
            if (1 == i2) {
                try {
                    if (this.av) {
                        videoSurface.b(i2);
                    }
                } catch (Exception e2) {
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "[SRLog]doOpenSR catch exception e=".concat(String.valueOf(e2)));
                }
            } else {
                videoSurface.b(i2);
            }
            this.by.f153224h = i2;
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z2) {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "[SRLog]openTextureSR =  sr = true, open =" + z2);
        this.by.f153219c = 1;
        this.bv = true;
        this.fK = z2 ? 1 : 0;
        int i2 = 0;
        if (z2 == 0) {
            i2 = -7890;
        }
        if (this.fS) {
            a((int) z2, i2);
        }
    }

    public final void b(int i2, int i3) {
        this.fQ = i2;
        this.fR = i3;
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "[SRLog]setSrMaxTextureSize:" + this.fQ + "," + this.fR);
        com.ss.ttvideoengine.r.d dVar = new com.ss.ttvideoengine.r.d();
        dVar.a(i2).b(i3);
        this.by.a(dVar);
    }

    public final void b(boolean z2) {
        this.bx = z2;
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "[SRLog]asyncInitSR = ".concat(String.valueOf(z2)));
    }

    public final void c(boolean z2) {
        this.fS = z2;
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "[SRLog]dynamicControlSR = ".concat(String.valueOf(z2)));
    }

    public final void a(int i2, String str, String str2, String str3) {
        this.fL = this.fM;
        this.fM = i2;
        this.fN = str;
        this.fO = str2;
        this.fP = str3;
        this.ae.U(i2);
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "[SRLog]sr init config = " + this.fM + "," + this.fN + "," + this.fO + ", " + this.fP);
    }

    public final boolean b() {
        VideoSurface videoSurface = this.bn;
        boolean z2 = false;
        if (videoSurface != null && videoSurface.c(6, -1) == 1) {
            z2 = true;
        }
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "isplaybackUsedSR ,mPlayBackUsedSR = " + this.bu + ", mTextureSrOpen = " + this.fK + ", ret = " + z2);
        return z2;
    }

    public final void d(boolean z2) {
        this.bw = z2;
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "[SRLog]ignoreSRResolutionLimit ignore=".concat(String.valueOf(z2)));
    }

    public final void a(Bundle bundle) {
        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "setEffect:" + bundle.toString() + " TextureSurface:" + this.bn);
        VideoSurface videoSurface = this.bn;
        if (videoSurface != null) {
            videoSurface.a(bundle);
        } else {
            this.fX.offer(bundle);
        }
        this.ae.a(bundle);
    }

    private void a(VideoSurface videoSurface) {
        Bundle bundle;
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "initSr,mTextureAlgType:" + this.fM);
        if (this.fM != -1 && videoSurface != null) {
            if (this.bt != null) {
                bundle = new Bundle(this.bt);
            } else {
                bundle = new Bundle();
            }
            bundle.putInt("effect_type", 5);
            bundle.putInt("action", 21);
            bundle.putInt("srAlgType", this.fM);
            bundle.putInt("srMaxSizeWidth", this.fQ);
            bundle.putInt("srMaxSizeHeight", this.fR);
            bundle.putString("kernelBinPath", this.fN);
            bundle.putString("oclModleName", this.fO);
            bundle.putString("dspModleName", this.fP);
            bundle.putString("moduleName", "");
            videoSurface.a(bundle);
        }
    }

    public final String a(List<com.ss.ttvideoengine.j.c> list) {
        Exception e2;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    for (com.ss.ttvideoengine.j.c cVar : list) {
                        if (cVar != null) {
                            if (!TextUtils.isEmpty(cVar.f152889h)) {
                                String str = cVar.f152889h;
                                try {
                                    String a2 = a(str, null, (long) this.bi, new String[]{cVar.f152883b}, w.Undefine, null, null, null, null);
                                    if (!TextUtils.isEmpty(a2)) {
                                        cVar.f152883b = a2;
                                    }
                                } catch (Exception e3) {
                                    e2 = e3;
                                    e2.printStackTrace();
                                    return null;
                                }
                            }
                            JSONObject a3 = cVar.a();
                            if (a3 != null) {
                                if (cVar.f152882a == 0) {
                                    jSONArray.put(a3);
                                } else if (cVar.f152882a == 1) {
                                    jSONArray2.put(a3);
                                }
                            }
                        }
                    }
                    jSONObject.put("dynamic_video_list", jSONArray);
                    jSONObject.put("dynamic_audio_list", jSONArray2);
                    return "mem://bash/url_index:0/segment_format:1/" + jSONObject.toString();
                }
            } catch (Exception e4) {
                e2 = e4;
                e2.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static void a(Context context, Map map) {
        if (map.size() > 0) {
            try {
                com.ss.ttvideoengine.s.j.b("TTVideoEngine", "setAppInfo:" + map.toString());
                b.f152303a = context;
                b.f152304b = com.ss.ttvideoengine.s.i.a(map.get("appid"));
                b.f152305c = (String) map.get("appname");
                b.f152306d = (String) map.get("appchannel");
                b.f152307e = (String) map.get("appversion");
                if (map.containsKey("screen_height")) {
                    b.f152311i = ((Integer) map.get("screen_height")).intValue();
                }
                if (map.containsKey("screen_width")) {
                    b.f152310h = ((Integer) map.get("screen_width")).intValue();
                }
                if (map.containsKey("deviceid")) {
                    b.f152308f = (String) map.get("deviceid");
                }
                if (map.containsKey("region")) {
                    b.f152309g = (String) map.get("region");
                }
                e.c.f153200a.a(b.a(), map);
                com.ss.ttvideoengine.o.a.a().b().a(com.ss.ttvideoengine.o.a.f153132e);
            } catch (Exception e2) {
                com.ss.ttvideoengine.s.j.b("TTVideoEngine", e2.toString());
            }
        }
    }

    public final void a(int i2, long j2) {
        int i3;
        com.ss.ttvideoengine.j.j jVar = this.ap;
        int i4 = 3;
        int i5 = -1;
        if (jVar != null && jVar.f152930c > 0 && !TextUtils.isEmpty(this.ap.f152928a)) {
            if (i2 == 0) {
                i4 = 2;
            } else if (i2 != 2) {
                i4 = -1;
            }
            if (i2 == 1) {
                com.ss.ttvideoengine.s.j.d("PROXY-XY-SETPLAYINFO", com.a.a("set play info into xyproxy p2p  key is play pos value:%d", new Object[]{Long.valueOf(j2)}));
                return;
            }
            com.ss.ttvideoengine.s.j.d("PROXY-XY-SETPLAYINFO", com.a.a("set play info into xyproxy p2p key:%d value:%d", new Object[]{Integer.valueOf(i4), Long.valueOf(j2)}));
        } else if (this.bf <= 0) {
        } else {
            if (TextUtils.isEmpty(this.cg)) {
                com.ss.ttvideoengine.s.j.d("TTVideoEngine", "trace id null, not allow setplayinfo");
                return;
            }
            switch (i2) {
                case 0:
                    i3 = 22;
                    break;
                case 1:
                    i3 = 23;
                    break;
                case 2:
                    i3 = 24;
                    break;
                case 3:
                    i3 = 25;
                    break;
                case 4:
                    i3 = 26;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    com.ss.ttm.player.m mVar = this.ah;
                    if (mVar != null) {
                        if (j2 == -1) {
                            j2 = mVar.a(73, -1L);
                            long a2 = mVar.a(72, -1L);
                            if (j2 >= 0 && a2 >= 0) {
                                j2 = Math.min(j2, a2);
                            } else if (a2 >= 0) {
                                j2 = a2;
                            }
                        }
                        i3 = 27;
                        break;
                    } else {
                        com.ss.ttvideoengine.s.j.d("MDL-SETPLAYINFO", "mediaplayer is null not allow set PLAY_INFO_CURRENT_BUFFER");
                        return;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    i3 = 28;
                    break;
                default:
                    i3 = -1;
                    break;
            }
            if (this.gr == 0 || this.dj == 1) {
                d.h.f152465a.a(i3, this.B, j2);
            } else {
                d dVar = d.h.f152465a;
                String str = this.cg;
                String str2 = this.B;
                if (dVar.f152369d != 0) {
                    com.ss.ttvideoengine.s.j.b("DataLoaderHelper", "dataloader not started, not allow set play info");
                } else {
                    dVar.r.lock();
                    dVar.a(i3, str2, j2);
                    switch (i3) {
                        case 22:
                            i5 = 7210;
                            break;
                        case 23:
                            i5 = 7211;
                            break;
                        case 24:
                            i5 = 7212;
                            break;
                        case 25:
                            i5 = 7213;
                            break;
                        case 26:
                            i5 = 7214;
                            break;
                        case 27:
                            i5 = 7215;
                            break;
                        case 28:
                            i5 = 7338;
                            break;
                    }
                    try {
                        dVar.f152375j.setInt64ValueByStrKey(i5, str, j2);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    } catch (Throwable th) {
                        dVar.r.unlock();
                        throw th;
                    }
                    dVar.r.unlock();
                }
            }
            com.ss.ttvideoengine.s.j.d("MDL-SETPLAYINFO", com.a.a("set play info into mdl key:%d value:%d traceid:%s", new Object[]{Integer.valueOf(i3), Long.valueOf(j2), this.cg}));
        }
    }

    public final void a(Surface surface) {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "setsurface = " + surface + ", pre-surface:" + this.ab + ",this:" + this);
        if (this.ch.a(false)) {
            this.ch.a(54, 0, 0, surface);
        } else {
            c(surface);
        }
    }

    public final void a(Surface surface, int i2) {
        MethodCollector.i(11522);
        synchronized (this.et) {
            try {
                this.et.offer(new Pair<>(surface, Integer.valueOf(i2)));
                W();
            } finally {
                MethodCollector.o(11522);
            }
        }
    }

    public final void b(Surface surface) {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "setSurfaceSync = " + surface + ",this:" + this);
        if (this.ch.a(false)) {
            this.ch.a(54, this.jd, surface);
        } else {
            c(surface);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(Surface surface, int i2) {
        VideoSurface videoSurface;
        com.ss.ttm.player.m mVar = this.hn;
        if (mVar != null || (mVar = this.ah) != null) {
            if (surface == null) {
                surface = null;
            } else if (!(i2 == 1 || (videoSurface = this.bn) == null)) {
                surface = videoSurface;
            }
            mVar.a(surface);
        }
    }

    public final void a(SurfaceHolder surfaceHolder) {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "setSurfaceHolder = " + surfaceHolder + ",this:" + this);
        if (this.ch.a(false)) {
            this.ch.a(55, 0, 0, surfaceHolder);
        } else {
            b(surfaceHolder);
        }
    }

    public final void a(String str, String str2) {
        if (this.ch.a(false)) {
            this.ch.a(57, 0, 0, str, str2);
        } else {
            c(str, str2);
        }
    }

    public final void a(float f2, float f3) {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "setVolume left:" + f2 + " right:" + f3);
        this.fl = f2;
        this.fm = f3;
        if (this.ch.a(false)) {
            this.ch.a(9, 0, 0, Float.valueOf(f2), Float.valueOf(f3));
        } else {
            b(f2, f3);
        }
    }

    public final void a(int i2) {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "setStartTime:".concat(String.valueOf(i2)));
        this.aA = i2;
        this.ae.n(i2);
    }

    public final void a(bb bbVar) {
        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "setListener ".concat(String.valueOf(bbVar)));
        this.K = bbVar;
    }

    public final void a(ax axVar) {
        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "setVideoEngineSimpleCallback ".concat(String.valueOf(axVar)));
        this.J = axVar;
    }

    public final void a(bf bfVar) {
        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "setVideoInfoListener ".concat(String.valueOf(bfVar)));
        this.N = bfVar;
    }

    public final void a(av avVar) {
        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "setVideoBufferListener ".concat(String.valueOf(avVar)));
        this.T = avVar;
    }

    public final void a(String str) {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "setDecryptionKey");
        this.aE = str;
    }

    public final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "setEncodedKey");
            this.eV = str;
        }
    }

    public final void c(String str) {
        this.eY = str;
        com.ss.ttvideoengine.j.f fVar = this.cw;
        if (fVar != null) {
            fVar.a(str);
        }
    }

    public final void a(FileDescriptor fileDescriptor, long j2, long j3) {
        this.fq = j2;
        this.fr = j3;
        if (this.ch.a(false)) {
            this.ch.a(12, 0, 0, fileDescriptor);
        } else {
            a(fileDescriptor);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(FileDescriptor fileDescriptor) {
        z();
        this.fp = fileDescriptor;
        com.ss.ttvideoengine.h.j jVar = this.ae;
        if (jVar != null) {
            jVar.b(6, (String) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void e(String str) {
        if (str != null && !str.equals(this.B)) {
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("set video id:%s", new Object[]{str}));
            z();
            this.aG = false;
            this.aS = true;
            this.aU = true;
            this.aT = true;
            this.A = 0;
            this.ar = false;
            this.az = 0;
            this.aq = null;
        }
        this.t = false;
        this.B = str;
        this.ba = 0;
        this.ae.b(5, str);
        this.ao.clear();
        this.aC = null;
        this.aD = null;
    }

    public final void a(com.ss.ttvideoengine.j.e eVar) {
        if (eVar != null) {
            if (this.ch.a(false)) {
                this.ch.a(16, 0, 0, eVar);
            } else {
                b(eVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(com.ss.ttvideoengine.j.e eVar) {
        String b2 = eVar.b(2);
        if (TextUtils.isEmpty(b2)) {
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "_doSetVideoModel vid is empty");
            return;
        }
        if (!eVar.equals(this.ad)) {
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "_doSetVideoModel VideoModel is new");
            z();
            this.aG = false;
            this.aS = true;
            this.aU = true;
            this.aT = true;
            this.A = 0;
            this.ar = false;
            this.az = 0;
            this.ag = null;
            this.aq = null;
        }
        this.t = false;
        this.ad = eVar;
        this.ev = eVar.b(218);
        this.ew = this.ad.b(217);
        this.ey = this.ad.a(9);
        this.ad.a(this.fA);
        this.B = b2;
        av();
        this.fh = true;
        this.ba = 0;
        this.ae.b(4, this.B);
        this.ae.a(eVar);
        this.aC = null;
        this.aD = null;
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("set video model, fallback api:%s, keyseed:%s", new Object[]{this.ew, this.ev}));
    }

    public final void b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            a(str, str2, this.B);
        }
    }

    public final void a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            b(new String[]{str}, str2, str3);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String[] strArr, String str, String str2) {
        String str3 = str;
        if (strArr == null || strArr.length == 0 || TextUtils.isEmpty(strArr[0])) {
            com.ss.ttvideoengine.s.j.e("TTVideoEngine", "invalid urls list, it is empty");
            return;
        }
        this.jp = com.ss.ttvideoengine.q.e.a(str2, str3, strArr);
        if (TextUtils.isEmpty(str3) || this.bf == 0) {
            i(strArr[0]);
        } else {
            G();
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "setDirectUrlUseDataLoader key = " + str3 + ", videoId = " + str2);
            String a2 = a(str3, str2, (long) this.bi, strArr, w.Undefine, this.aE, null, null, null);
            if (!this.cl.contains(str3)) {
                this.cl.add(str3);
            }
            if (TextUtils.isEmpty(a2)) {
                i(strArr[0]);
            } else {
                this.B = str2;
                if (this.hc == 1) {
                    for (String str4 : strArr) {
                        if (!URLUtil.isValidUrl(str4)) {
                        }
                    }
                    com.ss.ttvideoengine.s.j.e("TTVideoEngine", "invalid urls list, all url invalid");
                    a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainVideoOwnPlayer", -9966, "Direct url is invalid url."));
                    return;
                }
                i(a2);
            }
            com.ss.ttvideoengine.h.j jVar = this.ae;
            if (jVar != null) {
                jVar.w(a2);
            }
        }
        if (this.ju) {
            if (!TextUtils.isEmpty(str2)) {
                str3 = str2;
            } else {
                String e2 = aa.e(strArr[0]);
                if (!TextUtils.isEmpty(e2)) {
                    str3 = e2;
                }
            }
            aa.b.f152568a.a(str3);
            com.ss.ttvideoengine.h.j jVar2 = this.ae;
            if (jVar2 != null) {
                jVar2.d(53, str3);
            }
        }
        this.B = str2;
    }

    public static void a(int i2, String str) {
        com.ss.ttvideoengine.o.a.a().a(i2, str);
        d.h.f152465a.a(i2, str);
    }

    public final void c(int i2, String str) {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("setPlayAPIVersion:%d", new Object[]{Integer.valueOf(i2)}));
        this.n = i2;
        this.o = str;
        com.ss.ttvideoengine.h.j jVar = this.ae;
        if (jVar != null) {
            jVar.a(i2, str);
        }
    }

    public final void a(com.ss.ttm.player.p pVar) {
        if (pVar != null) {
            com.ss.ttvideoengine.s.j.b("TTVideoEngine", "[SRLog]setPlaybackParams:" + pVar + ", speed:" + pVar.f152093d + ", pitch:" + pVar.f152092c);
        }
        this.E = pVar;
        if (!(pVar == null || pVar.f152093d == -1.0f)) {
            com.ss.ttvideoengine.r.d dVar = new com.ss.ttvideoengine.r.d();
            dVar.b(((int) (pVar.f152093d * 100.0f)) != 100);
            this.by.a(dVar);
        }
        if (this.ch.a(false)) {
            this.ch.a(53, 0, 0, pVar);
        } else {
            b(pVar);
        }
    }

    public final void b(int i2) {
        if (this.ch.a(false)) {
            this.ch.a(50, 1, i2);
        } else {
            b(true, i2);
        }
    }

    public final void a(boolean z2, int i2) {
        this.dN = z2 ? 1 : 0;
        this.dO = i2;
    }

    public final void a(int i2, float f2) {
        if (i2 == 359) {
            this.ek = f2;
        } else if (i2 == 535) {
            this.ij = f2;
            this.ae.c(f2);
        } else if (i2 != 651) {
            switch (i2) {
                case 325:
                    this.dQ = f2;
                    break;
                case 326:
                    this.dR = f2;
                    break;
                case 327:
                    this.dS = f2;
                    break;
                case 328:
                    this.dT = f2;
                    break;
                default:
                    boolean z2 = true;
                    switch (i2) {
                        case 344:
                            this.dW = f2;
                            com.ss.ttm.player.m mVar = this.ah;
                            if (mVar != null) {
                                mVar.a(645, f2);
                                break;
                            }
                            break;
                        case 345:
                            this.cS = true;
                            this.dU = f2;
                            com.ss.ttm.player.m mVar2 = this.ah;
                            if (mVar2 != null) {
                                mVar2.a(644, f2);
                                break;
                            }
                            break;
                        case 346:
                            this.cT = true;
                            this.dV = f2;
                            com.ss.ttm.player.m mVar3 = this.ah;
                            if (mVar3 != null) {
                                mVar3.a(646, f2);
                                break;
                            }
                            break;
                        case 347:
                            if (f2 <= 0.0f) {
                                z2 = false;
                            }
                            this.cU = z2;
                            break;
                        default:
                            switch (i2) {
                                case 526:
                                    this.hZ = f2;
                                    break;
                                case 527:
                                    this.ia = f2;
                                    break;
                                case 528:
                                    this.ib = f2;
                                    break;
                                case 529:
                                    this.ic = f2;
                                    break;
                            }
                    }
            }
        } else {
            VideoSurface videoSurface = this.bn;
            if (videoSurface != null) {
                videoSurface.a(4, f2);
            }
        }
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "set float option key:" + i2 + ",value:" + f2);
    }

    public final void a(w wVar) {
        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "configResolution ".concat(String.valueOf(wVar)));
        if (wVar != null) {
            b(wVar);
        }
    }

    public final boolean d(int i2) {
        int i3;
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar != null) {
            i3 = q(mVar.b());
        } else {
            i3 = this.C;
        }
        return i3 == i2;
    }

    public final void a(int[] iArr) {
        if (q()) {
            if (this.ch.a(false)) {
                this.ch.a(51, 0, 0, iArr);
            } else {
                b(iArr);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int[] iArr) {
        int length = iArr.length;
        if (length > 0) {
            int length2 = com.ss.ttm.player.m.f152066c.length;
            this.fn = 0;
            int i2 = 0;
            do {
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        break;
                    } else if (com.ss.ttm.player.m.f152066c[i3] == iArr[i2]) {
                        this.fn = (1 << i3) | this.fn;
                        break;
                    } else {
                        i3++;
                    }
                }
                i2++;
            } while (i2 < length);
            com.ss.ttm.player.m mVar = this.ah;
            if (mVar != null) {
                mVar.a(111, this.fn);
            }
        }
    }

    public final void a(int i2, y yVar) {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("seek to time:%d", new Object[]{Integer.valueOf(i2)}));
        this.P = yVar;
        if (this.ah != null && this.t && this.cq > 0) {
            this.cp = i2;
        }
        if (this.ch.a(false)) {
            this.ch.a(7, i2);
        } else {
            a(i2, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z2) {
        int an2;
        com.ss.ttvideoengine.j.j jVar;
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("_seekTo:%d", new Object[]{Integer.valueOf(i2)}));
        if (this.ah == null || !this.t) {
            j(false);
            return;
        }
        if (z2) {
            an2 = this.az;
        } else {
            an2 = an();
        }
        if (this.gu > 0 && (jVar = this.ap) != null && jVar.f152930c > 0 && !TextUtils.isEmpty(this.ap.f152928a)) {
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "forbid proxy p2p when seek");
        }
        this.as = true;
        this.at = SystemClock.currentThreadTimeMillis();
        this.az = i2;
        a(6, 1L);
        this.ah.a(i2);
        a(1, (long) i2);
        this.ae.a(an2, i2, z2);
    }

    /* access modifiers changed from: protected */
    public final void a(w wVar, Map<Integer, String> map) {
        com.ss.ttvideoengine.s.f fVar;
        int i2;
        Map<Integer, String> map2;
        if (this.al != wVar || ((map2 = this.fY) != null ? !map2.equals(map) : map != null)) {
            com.ss.ttvideoengine.j.e eVar = this.ad;
            if (eVar != null) {
                if (!(this.al == wVar || (this.K == null && this.J == null))) {
                    com.ss.ttvideoengine.j.o a2 = eVar.a(wVar, eVar.a(7), map, false);
                    com.ss.ttvideoengine.j.e eVar2 = this.ad;
                    com.ss.ttvideoengine.j.o a3 = eVar2.a(this.al, eVar2.a(7), this.fY, false);
                    if (!(a3 == null || a2 == null || a2.a(3) != a3.a(3))) {
                        if (this.ch.b()) {
                            this.ch.b(407, this.ad.a(7), 0, null);
                        } else {
                            bb bbVar = this.K;
                            if (bbVar != null) {
                                bbVar.d(this, this.ad.a(7));
                            }
                            ax axVar = this.J;
                            if (axVar != null) {
                                axVar.d(this, this.ad.a(7));
                            }
                        }
                    }
                }
                this.eC = this.al;
                this.am = System.currentTimeMillis();
                this.al = wVar;
                this.fY = map;
                com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("will switch to resolution:%s, from resolution:%s", new Object[]{d(wVar), d(this.eC)}));
                if (map != null) {
                    for (Map.Entry<Integer, String> entry : map.entrySet()) {
                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "will switch to params, Key = " + entry.getKey() + ",Value = " + entry.getValue());
                    }
                }
                boolean g2 = g(this.ad);
                if (g2 && this.v != 2) {
                    int i3 = com.ss.ttvideoengine.j.q.f152976a;
                    if (this.ad.a()) {
                        if (map == null) {
                            map = new HashMap<>();
                        }
                        if (this.cK.equals("bytevc2") && this.ad.c(228)) {
                            map.put(8, "bytevc2");
                        } else if (this.cK.equals("bytevc1") && this.ad.c(204)) {
                            map.put(8, "bytevc1");
                        } else if (this.ad.c(203)) {
                            map.put(8, "h264");
                        }
                        com.ss.ttvideoengine.j.o a4 = a(this.al, this.ad.a(7), map);
                        if (a4 != null) {
                            i2 = a4.a(3);
                            i3 = a4.a();
                        } else {
                            i2 = 0;
                        }
                        if (this.O != null) {
                            ArrayList arrayList = new ArrayList();
                            if (this.ad.a(e.a.DASH)) {
                                String h2 = this.ad.h();
                                if (!TextUtils.isEmpty(h2) && h2.equals("segment_base")) {
                                    com.ss.ttvideoengine.j.o a5 = a(this.al, com.ss.ttvideoengine.j.q.f152976a, map);
                                    com.ss.ttvideoengine.j.o a6 = a(this.al, com.ss.ttvideoengine.j.q.f152977b, map);
                                    if (a5 != null) {
                                        arrayList.add(a5);
                                    }
                                    if (a6 != null) {
                                        arrayList.add(a6);
                                    }
                                }
                            } else if (a4 != null) {
                                arrayList.add(a4);
                            }
                            if (arrayList.size() > 0) {
                                ba baVar = new ba();
                                baVar.f152316a = "usingUrlInfos";
                                baVar.f152317b = arrayList;
                                if (this.ch.b()) {
                                    this.ch.b(412, 0, 0, baVar);
                                } else {
                                    this.O.a(baVar);
                                }
                            }
                        }
                    } else {
                        i2 = 0;
                    }
                    if (this.ah != null && q()) {
                        this.ae.a(d(this.al), d(this.eC), false);
                        i(true);
                        this.ah.c(i2, i3);
                        return;
                    }
                }
                if (!this.au) {
                    this.au = true;
                    this.ae.a(d(this.al), d(this.eC), true);
                    i(true);
                    if (!g2 && (fVar = this.bg) != null) {
                        fVar.b();
                    }
                    this.az = an();
                }
                com.ss.ttm.player.m mVar = this.ah;
                if (mVar != null) {
                    mVar.g();
                }
                c(this.ad);
                return;
            }
            return;
        }
        com.ss.ttvideoengine.s.j.e("TTVideoEngine", com.a.a("switch to the same resolution:%s, drop", new Object[]{d(wVar)}));
    }

    private boolean a(com.ss.ttvideoengine.j.o oVar, com.ss.ttvideoengine.j.e eVar) {
        if (oVar == null || eVar == null || this.fC) {
            return false;
        }
        if (eVar.d(220) > 0 && com.ss.ttvideoengine.s.m.b() && com.ss.ttvideoengine.s.m.a() - (eVar.d(220) * 1000) > -30000) {
            return true;
        }
        if (oVar.c(30) <= 0 || !com.ss.ttvideoengine.s.m.b() || com.ss.ttvideoengine.s.m.a() - (oVar.c(30) * 1000) <= -30000) {
            return false;
        }
        return true;
    }

    private void a(IABRModule iABRModule, com.ss.ttvideoengine.j.e eVar) {
        List<com.ss.ttvideoengine.j.o> b2;
        long i2;
        if (eVar == null) {
            return;
        }
        if (!((this.bW == 0 && this.bV == 0) || (b2 = eVar.b()) == null || b2.size() == 0)) {
            for (com.ss.ttvideoengine.j.o oVar : b2) {
                if (oVar != null) {
                    String b3 = oVar.b(15);
                    if (this.iG) {
                        i2 = d.h.f152465a.d(b3);
                        if (i2 == 0) {
                            i2 = d.h.f152465a.i(b3);
                        }
                    } else {
                        i2 = d.h.f152465a.i(b3);
                    }
                    iABRModule.addBufferInfo(oVar.a(), b3, (long) oVar.a(3), i2, (long) oVar.a(38));
                }
            }
            iABRModule.setIntOptionForKey(6, this.f349if);
            iABRModule.setIntOptionForKey(7, this.ig);
        }
    }

    public final void c(com.ss.ttvideoengine.j.e eVar) {
        if (this.ch.a(false)) {
            this.ch.a(301, 0, 0, eVar);
        } else {
            e(eVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ba, code lost:
        if (r18.cJ == false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01bd, code lost:
        if (r13 == false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c7, code lost:
        if (r18.cK.equals("bytevc2") == false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01cb, code lost:
        if (r18.ah == null) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d1, code lost:
        if (d(5) == false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d3, code lost:
        a(com.ss.ttvideoengine.s.c.a(r18.ah, -9993, "create exoplayer failed"));
        com.bytedance.frameworks.apm.trace.MethodCollector.o(12746);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01e1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01e4, code lost:
        if (r18.f152212l != false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01e6, code lost:
        if (r13 != false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01f0, code lost:
        if (r18.cK.equals("bytevc1") != false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01fa, code lost:
        if (r18.cK.equals("bytevc2") != false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01fe, code lost:
        if (r18.cJ == false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0200, code lost:
        r0 = r18.ah;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0202, code lost:
        if (r0 == null) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0208, code lost:
        if (r0.b() == 3) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0210, code lost:
        if (r18.ah.b() != 4) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0212, code lost:
        a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainVideoOwnPlayer", -9989, "create own plugin player failed"));
        com.bytedance.frameworks.apm.trace.MethodCollector.o(12746);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0223, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0224, code lost:
        r0 = r18.fT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0226, code lost:
        if (r0 == 2) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0228, code lost:
        if (r0 != 4) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0230, code lost:
        if (r18.ah.b() == 1) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0238, code lost:
        if (r18.ah.b() == 2) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x023a, code lost:
        a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainVideoOwnPlayer", -9993, "osplayer don't support overlay"));
        com.bytedance.frameworks.apm.trace.MethodCollector.o(12746);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0249, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x024a, code lost:
        r0 = r18.ah.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0250, code lost:
        if (r0 == 0) goto L_0x07ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0252, code lost:
        if (r0 == 1) goto L_0x07e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0254, code lost:
        if (r0 == 2) goto L_0x07e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0256, code lost:
        if (r0 == 3) goto L_0x07e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0258, code lost:
        if (r0 == 4) goto L_0x07dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x025a, code lost:
        if (r0 == 5) goto L_0x07d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x025e, code lost:
        if (r18.dh != 1) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0260, code lost:
        if (r16 == false) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0264, code lost:
        if (r18.bf > 0) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0266, code lost:
        r18.ah.a(14, 1);
        r7 = aq();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0275, code lost:
        if (android.text.TextUtils.isEmpty(r18.eX) != false) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0277, code lost:
        r7 = r18.eX;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0279, code lost:
        r18.ah.a(34, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0280, code lost:
        r18.ah.a(823, r18.gn);
        r18.ah.a(619, r18.gp);
        r18.ah.a(828, r18.gq);
        r18.ah.a(870, r18.iW);
        r18.ah.a(853, r18.iQ);
        r18.ah.a(829, r18.iR);
        r18.ah.a(854, r18.iS);
        r18.ah.a(185, r18.go);
        r18.ah.a(201, r18.bm);
        r18.ah.a(94, r18.dC);
        r18.ah.a(98, r18.dD);
        r18.ah.a(95, r18.p);
        r18.ah.a(96, r18.dx);
        r18.ah.a(133, r18.dt);
        r18.ah.a(81, r18.ei);
        r18.ah.a(9, r18.q * 1000000);
        r18.ah.a(197, r18.dw);
        r18.ah.a(253, r18.hk);
        r7 = r18.dv;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0328, code lost:
        if (r7 != 0) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x032a, code lost:
        r18.ah.a(183, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0331, code lost:
        r18.ah.a(827, r18.f348do);
        r18.ah.a(67, r18.dn);
        r18.ah.a(86, r18.dp);
        r18.ah.a(110, r18.ed);
        r18.ah.a(111, r18.fn);
        r18.ah.a(159, r18.dE);
        r18.ah.a(195, r18.dG);
        r18.ah.a(79, r18.f152209f);
        r18.ah.a(66, r18.f152208e);
        r7 = r18.cI;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0384, code lost:
        if (r7 == 0) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0388, code lost:
        if (r18.aW == false) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x038a, code lost:
        r18.ah.a(24, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0391, code lost:
        r7 = r18.fl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0395, code lost:
        if (r7 < 0.0f) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0397, code lost:
        r1 = r18.fm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x039b, code lost:
        if (r1 < 0.0f) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x039d, code lost:
        b(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03a0, code lost:
        r18.ah.a(159, r18.dE);
        r18.ah.a(83, r18.dk);
        r18.ah.a(37, r18.cZ);
        r18.ah.a(38, r18.da);
        r18.ah.a(36, r18.db);
        r9 = com.ss.ttvideoengine.aj.dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03d0, code lost:
        if (r9 == -1) goto L_0x07cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03d2, code lost:
        r18.ah.a(56, r9);
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "set renderType from static context, renderType:".concat(java.lang.String.valueOf(r9)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03e8, code lost:
        r18.ah.a(301, r18.eh);
        r18.ah.a(211, r18.dK);
        r18.ah.a(247, r18.eb);
        r18.ah.a(248, r18.ec);
        r18.ah.a(134, r18.dy);
        r18.ah.a(1010, r18.dz);
        r18.ah.a(1011, r18.dA);
        r18.ah.a(1012, r18.dB);
        r18.ah.a(192, r18.dF);
        r18.ah.a(358, r18.ej);
        ai();
        r18.ah.a(278, r18.gx);
        r18.ah.a(276, r18.gw);
        r18.ah.a(263, r18.gv);
        r18.ah.a(261, r18.bD);
        r18.ah.a(199, r18.dH);
        r18.ah.a(256, r18.hs);
        r18.ah.a(285, r18.gC);
        r18.ah.a(286, r18.gD);
        r18.ah.a(292, r18.gF);
        r18.ah.a(293, r18.gG);
        r18.ah.a(297, r18.gH);
        r18.ah.a(647, r18.cq);
        ak();
        r18.ah.a(565, r18.jm);
        r18.ah.a(664, r18.js);
        r18.ah.a(666, r18.jx);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04d1, code lost:
        if (r18.de != 1) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04d3, code lost:
        r18.ah.a(254, r18.hp);
        r18.ah.a(400, r18.ho);
        r18.ah.a(182, r18.cX);
        r18.ah.a(181, r18.cY);
        r18.ah.a(90, r18.ee);
        r18.ah.a(215, r18.dM);
        r18.ah.a(216, r18.dL);
        r7 = r18.dN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0514, code lost:
        if (r7 != 1) goto L_0x0526;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0516, code lost:
        r18.ah.a(212, r7);
        r18.ah.a(213, r18.dO);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0528, code lost:
        if (r18.eP != 1) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x052a, code lost:
        r18.ah.a(184, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0531, code lost:
        r18.ah.a(279, r18.gy);
        r7 = r18.gz;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x053c, code lost:
        if (r7 != 1) goto L_0x0545;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x053e, code lost:
        r18.ah.a(280, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0545, code lost:
        r18.ah.a(401, r18.gB);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0550, code lost:
        if (r18.du != 1) goto L_0x0559;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0552, code lost:
        r18.ah.a(189, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x055b, code lost:
        if (r18.gK != 1) goto L_0x0564;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x055d, code lost:
        r18.ah.a(312, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0564, code lost:
        r0 = r18.fD;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x056a, code lost:
        if (r0 <= 0) goto L_0x0573;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x056c, code lost:
        r18.ah.b(231, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0573, code lost:
        r18.ah.a(223, r18.ef);
        r18.ah.a(984, com.ss.ttvideoengine.aj.eg);
        r1 = r18.fE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0587, code lost:
        if (r1 == null) goto L_0x0590;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0589, code lost:
        ((com.ss.ttvideoengine.m) r18.ah).a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0590, code lost:
        r18.ah.a(48, r18.hj);
        r7 = r18.dg;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x059b, code lost:
        if (r7 <= 0) goto L_0x05a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x059d, code lost:
        r18.ah.a(252, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x05a4, code lost:
        r18.ah.a(88, r18.dI);
        r18.ah.a(199, r18.dH);
        r18.ah.a(97, r18.dJ);
        r18.ah.a(536, r18.hd);
        r18.ah.a(537, r18.he);
        r18.ah.a(538, r18.hf);
        r18.ah.a(539, r18.hg);
        r18.ah.a(new com.ss.ttvideoengine.aj.q(r18));
        r18.ah.a(new com.ss.ttvideoengine.aj.e(r18));
        r18.ah.a(new com.ss.ttvideoengine.aj.f(r18));
        r18.ah.a(new com.ss.ttvideoengine.aj.i(r18));
        r18.ah.a(new com.ss.ttvideoengine.aj.t(r18));
        r18.ah.a(new com.ss.ttvideoengine.aj.l(r18));
        r18.ah.a(new com.ss.ttvideoengine.aj.o(r18));
        r18.ah.a(new com.ss.ttvideoengine.aj.n(r18));
        r18.ah.a(5003, r18.ih);
        aj();
        r18.ah.a(542, r18.ik);
        r18.ah.a(550, r18.il);
        r18.ah.a(551, r18.im);
        r18.ah.a(552, r18.in);
        r18.ah.a(556, r18.z);
        r18.ah.a(654, r18.em);
        r18.ah.a(348, r18.en);
        r18.ah.a(557, r18.io);
        r18.ah.a(558, r18.ip);
        r18.ah.a(559, r18.iq);
        r18.ah.a(257, r18.eo);
        r18.ah.a(560, r18.ir);
        r18.ah.a(952, r18.jf);
        r18.ah.a(561, r18.is);
        r18.ah.a(562, r18.it);
        r18.ah.a(563, r18.iu);
        r18.ah.a(564, r18.iv);
        r18.ah.a(566, r18.iw);
        r18.ah.a(149, r18.jn ? 1 : 0);
        r18.ah.a(164, r18.iy);
        r18.ah.a(571, r18.iz);
        r18.ah.a(572, r18.iA);
        r18.ah.a(573, r18.iB);
        r18.ah.a(574, r18.iC);
        r18.ah.a(575, r18.iD);
        r18.ah.a(576, r18.iE);
        r18.ah.a(580, r18.iF);
        r7 = r18.jg;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0735, code lost:
        if (r7 == -1) goto L_0x073e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0737, code lost:
        r18.ah.a(982, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x073e, code lost:
        r7 = r18.jh;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0740, code lost:
        if (r7 == -1) goto L_0x0749;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0742, code lost:
        r18.ah.a(985, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0749, code lost:
        r7 = r18.ji;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x074b, code lost:
        if (r7 == -1) goto L_0x0754;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x074d, code lost:
        r18.ah.a(1000, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0754, code lost:
        r9 = r18.ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0756, code lost:
        if (r9 == null) goto L_0x07c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0758, code lost:
        r7 = r18.ah;
        r0 = r18.ep;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x075e, code lost:
        if (r0 != -1) goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0760, code lost:
        r0 = r9.a(230);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0766, code lost:
        r7.a(662, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0769, code lost:
        r18.ae.c(97, r18.jn ? 1 : 0);
        r18.ae.c(93, r18.iu);
        r18.ae.c(94, r18.iv);
        r18.ae.c(55, r18.ik);
        r18.ae.c(96, com.ss.ttvideoengine.q.e.a().d() ? 1 : 0);
        r7 = r18.jj;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x079f, code lost:
        if (r7 == -1) goto L_0x07f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x07a1, code lost:
        r18.ah.a(1003, r7);
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x07af, code lost:
        if (r9 >= r18.jk.size()) goto L_0x07f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x07b1, code lost:
        r18.ah.a(1002, r18.jk.get(r9));
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x07c3, code lost:
        r18.ah.a(662, r18.ep);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x07cd, code lost:
        r18.ah.a(56, r18.dc);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x07d8, code lost:
        r18.C = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x07dc, code lost:
        r18.C = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x07e0, code lost:
        r18.C = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x07e4, code lost:
        r18.C = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x07e8, code lost:
        r18.C = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x07ec, code lost:
        r18.C = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x07f0, code lost:
        r7 = r18.jl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x07f3, code lost:
        if (r7 == -1) goto L_0x07fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x07f5, code lost:
        r18.ah.a(1005, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x07fc, code lost:
        r0 = r18.fT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x07fe, code lost:
        if (r0 == 2) goto L_0x0802;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0800, code lost:
        if (r0 != 4) goto L_0x0830;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0804, code lost:
        if (r18.bn == null) goto L_0x0830;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0806, code lost:
        r18.fV = 1;
        r18.fU = 1;
        r18.ah.a(820, 1);
        r18.ah.a(333, r18.fU);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x081c, code lost:
        if (r18.fT != 4) goto L_0x0820;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x081e, code lost:
        r18.aF = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0820, code lost:
        r1 = r18.ah;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0824, code lost:
        if ((r1 instanceof com.ss.ttvideoengine.m) == false) goto L_0x0830;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0826, code lost:
        ((com.ss.ttvideoengine.m) r1).a(new com.ss.ttvideoengine.aj.k(r18, (byte) 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0830, code lost:
        f(r18.aF);
        r1 = r18.ah;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0839, code lost:
        if ((r1 instanceof com.ss.ttvideoengine.m) == false) goto L_0x0844;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x083b, code lost:
        r0 = r18.bG;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x083d, code lost:
        if (r0 == null) goto L_0x0844;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x083f, code lost:
        ((com.ss.ttvideoengine.m) r1).a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0844, code lost:
        r18.r = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0959  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x097d  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x09d7  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0a50  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0b8a  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0b9b  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0bbf  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0ce8  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0d92  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0da8  */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x0e1e  */
    /* JADX WARNING: Removed duplicated region for block: B:539:0x0ef1  */
    /* JADX WARNING: Removed duplicated region for block: B:541:0x0f08  */
    /* JADX WARNING: Removed duplicated region for block: B:547:0x0f35 A[Catch:{ all -> 0x13a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0f40 A[Catch:{ all -> 0x13a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x0fdc  */
    /* JADX WARNING: Removed duplicated region for block: B:598:0x1158  */
    /* JADX WARNING: Removed duplicated region for block: B:615:0x11c4  */
    /* JADX WARNING: Removed duplicated region for block: B:618:0x11d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r19, java.util.HashMap r20) {
        /*
        // Method dump skipped, instructions count: 5068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.a(java.lang.String, java.util.HashMap):void");
    }

    private void a(Map<Integer, Integer> map) {
        if (map != null) {
            int i2 = 0;
            map.put(2, Integer.valueOf(this.C == 1 ? 1 : 0));
            int i3 = this.C;
            map.put(1, Integer.valueOf((i3 == 2 || i3 == 5) ? 0 : 1));
            HashMap<Integer, Integer> hashMap = this.hh;
            if (this.C == 5) {
                i2 = 1;
            }
            hashMap.put(26, Integer.valueOf(i2));
            map.put(11, Integer.valueOf(this.ha));
            map.put(100, Integer.valueOf(this.er));
            map.put(27, Integer.valueOf(this.jv ? 1 : 0));
        }
    }

    private static boolean a(com.ss.ttvideoengine.j.o oVar) {
        String b2 = oVar.b(6);
        if (!TextUtils.isEmpty(b2)) {
            return b2.equals("dash") || b2.equals("mpd");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0334, code lost:
        if (r8 != 0) goto L_0x030b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.ttvideoengine.s.c r17) {
        /*
        // Method dump skipped, instructions count: 823
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.a(com.ss.ttvideoengine.s.c):void");
    }

    private static boolean a(String str, com.ss.ttvideoengine.j.e eVar) {
        if (eVar != null && (eVar.a(e.a.DASH) || eVar.d() == e.b.LIVE)) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str.indexOf(".m3u8") > 0 || str.indexOf(".mpd") > 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final String a(String str, String str2, long j2, String[] strArr, w wVar, String str3, com.ss.ttvideoengine.j.o oVar, String str4, String str5) {
        boolean z2;
        aj ajVar;
        String str6 = str2;
        com.ss.ttvideoengine.j.e eVar = this.ad;
        boolean z3 = eVar != null && eVar.a(e.a.HLS);
        if (this.C != 0) {
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "force disable native mal because play type: " + this.C);
            z2 = true;
        } else {
            z2 = false;
        }
        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "cdn type is: " + this.di);
        String a2 = d.h.f152465a.a(str, str6, j2, strArr, wVar, str3, oVar, str4, str5, z2, z3, this.bM);
        if (!TextUtils.isEmpty(a2)) {
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "_mdlUrl get proxyUrl: key = " + str + ", videoId = " + str6);
            if (a2.startsWith("mdl://")) {
                ajVar = this;
                ajVar.ae.I(2);
            } else {
                ajVar = this;
                ajVar.ae.I(1);
            }
            ajVar.ae.w(a2);
            if (TextUtils.isEmpty(str6)) {
                str6 = str;
            }
            ajVar.bl = str6;
            if (!TextUtils.isEmpty(str4)) {
                ajVar.bk.add(str4);
            }
            if (!TextUtils.isEmpty(str)) {
                ajVar.bj.add(str);
            }
            ar();
        }
        return a2;
    }

    private static void a(com.ss.ttm.player.m mVar) {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "_tryRegisterMdlHandle, player type:" + mVar.b());
        if (!hq && mVar.b() == 1) {
            long c2 = d.h.f152465a.c(1003);
            if (c2 != -1) {
                d.a(d.h.f152465a, 1004, (int) mVar.b(500, c2));
                hq = true;
            }
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "get handle: ".concat(String.valueOf(c2)));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public final void b(boolean z2, int i2) {
        com.ss.ttm.player.m mVar = this.hn;
        if (mVar == null) {
            mVar = this.ah;
        }
        this.cY = z2 ? 1 : 0;
        if (this.ad != null) {
            i2 = -1;
        }
        this.cX = i2;
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("setAsyncInit enable:%b codecid:%d", new Object[]{Integer.valueOf((int) z2), Integer.valueOf(this.cX)}));
        if (mVar != null && this.de == 1) {
            mVar.a(181, this.cY);
            mVar.a(182, this.cX);
            this.ae.a(this.cY, this.cX);
        }
    }

    /* access modifiers changed from: package-private */
    public final void h(int i2, int i3) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        int i4 = i3;
        if (i2 == 11) {
            this.ei = i4;
            this.cF |= 4;
            com.ss.ttm.player.m mVar = this.ah;
            if (mVar != null) {
                mVar.a(81, i4);
            }
            this.ae.c(24, i4);
        } else if (i2 == 12) {
            if (d.a().d(12) == 200) {
                i4 = 0;
            }
            this.q = i4;
            com.ss.ttm.player.m mVar2 = this.ah;
            if (mVar2 != null) {
                mVar2.a(9, 1000000 * i4);
            }
            this.ae.c(25, i4);
        } else if (i2 == 100) {
            if (i4 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.aY = z2;
            com.ss.ttm.player.m mVar3 = this.ah;
            if (mVar3 != null) {
                mVar3.a(196, !z2 ? 1 : 0);
            }
        } else if (i2 == 101) {
            this.du = i4;
        } else if (i2 == 110) {
            this.fw = i4;
        } else if (i2 == 111) {
            if (i4 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.gI = z3;
        } else if (i2 == 117) {
            com.ss.ttm.player.r.b(4, i4);
        } else if (i2 == 118) {
            this.dp = i4;
            com.ss.ttm.player.m mVar4 = this.ah;
            if (mVar4 != null) {
                mVar4.a(86, i4);
            }
        } else if (i2 == 160) {
            this.bf = i4;
            com.ss.ttvideoengine.s.j.b("TTVideoEngine", "DataLoaderEnable is: " + this.bf);
        } else if (i2 == 161) {
            this.bi = i4;
        } else if (i2 == 183) {
            this.dv = i4;
            com.ss.ttm.player.m mVar5 = this.ah;
            if (mVar5 != null && i4 == 0) {
                mVar5.a(183, i4);
            }
        } else if (i2 != 184) {
            switch (i2) {
                case 0:
                    this.cI = i4;
                    com.ss.ttm.player.m mVar6 = this.ah;
                    if (mVar6 != null) {
                        mVar6.a(24, i4);
                        break;
                    }
                    break;
                case 1:
                    this.cZ = i4;
                    com.ss.ttm.player.m mVar7 = this.ah;
                    if (mVar7 != null) {
                        mVar7.a(37, i4);
                        break;
                    }
                    break;
                case 2:
                    this.da = i4;
                    com.ss.ttm.player.m mVar8 = this.ah;
                    if (mVar8 != null) {
                        mVar8.a(38, i4);
                        break;
                    }
                    break;
                case 3:
                    this.ha = i4;
                    com.ss.ttm.player.r.b(11, i4);
                    break;
                case 4:
                    this.db = i4;
                    if (this.bn == null) {
                        com.ss.ttm.player.m mVar9 = this.ah;
                        if (mVar9 != null) {
                            mVar9.a(36, i4);
                            break;
                        }
                    } else {
                        p(i4);
                        break;
                    }
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    this.dc = i4;
                    com.ss.ttm.player.m mVar10 = this.ah;
                    if (mVar10 != null) {
                        mVar10.a(56, i4);
                        break;
                    }
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    this.cF |= 64;
                    if (i4 != 0) {
                        this.cK = "bytevc1";
                        break;
                    }
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    this.cQ = true;
                    com.ss.ttm.player.m mVar11 = this.hn;
                    if (mVar11 == null) {
                        mVar11 = this.ah;
                    }
                    this.de = i4;
                    this.cF |= 32;
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "hardware enable = " + this.de);
                    if (mVar11 != null) {
                        mVar11.a(59, i4);
                        break;
                    }
                    break;
                default:
                    switch (i2) {
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            this.dn = i4;
                            com.ss.ttm.player.m mVar12 = this.ah;
                            if (mVar12 != null) {
                                mVar12.a(67, i4);
                                break;
                            }
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            this.dm = i4;
                            break;
                        case 15:
                            this.dl = i4;
                            break;
                        case 16:
                            this.dk = i4;
                            com.ss.ttm.player.m mVar13 = this.ah;
                            if (mVar13 != null) {
                                mVar13.a(83, i4);
                                break;
                            }
                            break;
                        case 17:
                            if (i4 == 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            this.f152212l = z4;
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            this.fs = i4 == 1;
                            break;
                        case 19:
                            this.ft = i4;
                            break;
                        case com.ss.android.ugc.playerkit.model.v.U:
                            this.dt = i4;
                            this.ae.o(i4);
                            com.ss.ttm.player.m mVar14 = this.ah;
                            if (mVar14 != null) {
                                mVar14.a(133, i4);
                                break;
                            }
                            break;
                        case 21:
                            if (i4 != 1) {
                                this.fv = false;
                                break;
                            } else {
                                this.fv = true;
                                this.fu = bg.a();
                                com.ss.ttvideoengine.d.d.a(this.aa);
                                break;
                            }
                        case 22:
                            if (this.fu != null) {
                                bg.a(i4);
                                break;
                            }
                            break;
                        case 23:
                            if (this.fu != null) {
                                bg.b(i4);
                                break;
                            }
                            break;
                        case 24:
                            this.eM = i4;
                            com.ss.ttm.player.m mVar15 = this.ah;
                            if (mVar15 != null) {
                                mVar15.a(137, i4);
                                break;
                            }
                            break;
                        case 25:
                            this.eN = i4;
                            com.ss.ttm.player.m mVar16 = this.ah;
                            if (mVar16 != null) {
                                mVar16.a(138, i4);
                                break;
                            }
                            break;
                        case 26:
                            this.eQ = i4;
                            com.ss.ttm.player.m mVar17 = this.ah;
                            if (mVar17 != null) {
                                mVar17.a(154, i4);
                                break;
                            }
                            break;
                        case 27:
                            this.fx = i4;
                            break;
                        case 28:
                            this.cE = i4;
                            break;
                        case 29:
                        case 494:
                            this.bV = i4;
                            if (i4 > 0) {
                                if (this.bU == null) {
                                    this.bU = f(this.ad);
                                }
                                if (this.bU != null && g(this.ad)) {
                                    this.bU.start(ce, this.hG);
                                    this.ae.N(1);
                                }
                            } else {
                                IABRModule iABRModule = this.bU;
                                if (iABRModule != null) {
                                    iABRModule.stop();
                                    this.ae.N(0);
                                }
                            }
                            com.ss.ttm.player.m mVar18 = this.ah;
                            if (mVar18 != null) {
                                mVar18.a(172, i4);
                                break;
                            }
                            break;
                        case 85:
                            if (i4 != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            this.jv = z5;
                            break;
                        case 120:
                            this.ee = i4;
                            com.ss.ttm.player.m mVar19 = this.ah;
                            if (mVar19 != null) {
                                mVar19.a(90, i4);
                                break;
                            }
                            break;
                        case 198:
                            this.bm = i4;
                            com.ss.ttm.player.m mVar20 = this.ah;
                            if (mVar20 != null) {
                                mVar20.a(201, i4);
                                break;
                            }
                            break;
                        case 199:
                            this.fF = i4;
                            if (i4 == 1 && (!(this.hn == null && this.ah == null) && this.bn == null)) {
                                c();
                                VideoSurface videoSurface = this.bn;
                                if (videoSurface != null) {
                                    videoSurface.a(u(), v());
                                }
                                SurfaceHolder surfaceHolder = this.ac;
                                if (surfaceHolder == null) {
                                    Surface surface = this.ab;
                                    if (surface != null) {
                                        e(surface);
                                        break;
                                    }
                                } else {
                                    e(surfaceHolder.getSurface());
                                    break;
                                }
                            }
                            break;
                        case 200:
                            int i5 = i4 * 1000;
                            this.dp = i5;
                            com.ss.ttm.player.m mVar21 = this.ah;
                            if (mVar21 != null) {
                                mVar21.a(86, i5);
                                break;
                            }
                            break;
                        case 201:
                            this.f152208e = i4;
                            if (i4 < 500) {
                                this.f152208e = 500;
                            }
                            com.ss.ttm.player.m mVar22 = this.ah;
                            if (mVar22 != null) {
                                mVar22.a(66, this.f152208e);
                                break;
                            }
                            break;
                        case 202:
                            this.ed = i4;
                            com.ss.ttm.player.m mVar23 = this.ah;
                            if (mVar23 != null) {
                                mVar23.a(110, i4);
                                break;
                            }
                            break;
                        case 203:
                        case 311:
                            this.p = i4;
                            com.ss.ttm.player.m mVar24 = this.ah;
                            if (mVar24 != null) {
                                mVar24.a(95, i4);
                                break;
                            }
                            break;
                        case 204:
                            this.dx = i4;
                            com.ss.ttm.player.m mVar25 = this.ah;
                            if (mVar25 != null) {
                                mVar25.a(96, i4);
                                break;
                            }
                            break;
                        case 205:
                            this.dy = i4;
                            com.ss.ttm.player.m mVar26 = this.ah;
                            if (mVar26 != null) {
                                mVar26.a(134, i4);
                                break;
                            }
                            break;
                        case 206:
                            com.ss.ttvideoengine.h.j jVar = this.ae;
                            break;
                        case 207:
                            if (this.dE >= 0) {
                                this.dE = i4;
                                com.ss.ttm.player.m mVar27 = this.ah;
                                if (mVar27 != null) {
                                    mVar27.a(159, i4);
                                    break;
                                }
                            } else {
                                return;
                            }
                            break;
                        case 208:
                            this.dF = i4;
                            com.ss.ttm.player.m mVar28 = this.ah;
                            if (mVar28 != null) {
                                mVar28.a(192, i4);
                                break;
                            }
                            break;
                        case 213:
                            this.dG = i4;
                            com.ss.ttm.player.m mVar29 = this.ah;
                            if (mVar29 != null) {
                                mVar29.a(195, i4);
                                break;
                            }
                            break;
                        case 214:
                            this.dH = i4;
                            com.ss.ttm.player.m mVar30 = this.ah;
                            if (mVar30 != null) {
                                mVar30.a(199, i4);
                                break;
                            }
                            break;
                        case 215:
                            this.dI = i4;
                            com.ss.ttm.player.m mVar31 = this.ah;
                            if (mVar31 != null) {
                                mVar31.a(88, i4);
                                break;
                            }
                            break;
                        case 216:
                            this.dJ = i4;
                            com.ss.ttm.player.m mVar32 = this.ah;
                            if (mVar32 != null) {
                                mVar32.a(97, i4);
                                break;
                            }
                            break;
                        case 250:
                            this.hi = i4;
                            com.ss.ttm.player.m mVar33 = this.ah;
                            if (mVar33 != null) {
                                mVar33.a(250, i4);
                                break;
                            }
                            break;
                        case 255:
                            this.dZ = i4;
                            com.ss.ttm.player.m mVar34 = this.ah;
                            if (mVar34 != null) {
                                mVar34.a(255, i4);
                                break;
                            }
                            break;
                        case 301:
                            this.di = i4;
                            d.a().a(this.di);
                            break;
                        case 302:
                            this.dj = i4;
                            break;
                        case 310:
                            this.dq = i4;
                            com.ss.ttm.player.m mVar35 = this.ah;
                            if (mVar35 != null) {
                                mVar35.a(230, i4);
                                break;
                            }
                            break;
                        case 312:
                            this.gf = i4 == 1;
                            break;
                        case 313:
                            if (i4 == 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            this.gh = z6;
                            break;
                        case 314:
                            this.gK = i4;
                            break;
                        case 320:
                        case 472:
                            this.ef = i4;
                            com.ss.ttm.player.m mVar36 = this.ah;
                            if (mVar36 != null) {
                                mVar36.a(223, i4);
                            }
                            d.a().b(i4);
                            break;
                        case 321:
                            this.eh = i4;
                            com.ss.ttm.player.m mVar37 = this.ah;
                            if (mVar37 != null) {
                                mVar37.a(301, i4);
                                break;
                            }
                            break;
                        case 322:
                            this.dK = i4;
                            com.ss.ttm.player.m mVar38 = this.ah;
                            if (mVar38 != null) {
                                mVar38.a(211, i4);
                            }
                            this.ae.c(26, i4);
                            break;
                        case 323:
                            this.dL = i4;
                            com.ss.ttm.player.m mVar39 = this.ah;
                            if (mVar39 != null) {
                                mVar39.a(216, i4);
                                break;
                            }
                            break;
                        case 324:
                            this.dM = i4;
                            com.ss.ttm.player.m mVar40 = this.ah;
                            if (mVar40 != null) {
                                mVar40.a(215, i4);
                                break;
                            }
                            break;
                        case 329:
                            this.dP = i4;
                            com.ss.ttm.player.m mVar41 = this.ah;
                            if (mVar41 != null) {
                                mVar41.a(302, i4);
                                break;
                            }
                            break;
                        case 330:
                            this.eb = i4;
                            com.ss.ttm.player.m mVar42 = this.ah;
                            if (mVar42 != null) {
                                mVar42.a(247, i4);
                                break;
                            }
                            break;
                        case 331:
                            this.ec = i4;
                            com.ss.ttm.player.m mVar43 = this.ah;
                            if (mVar43 != null) {
                                mVar43.a(248, i4);
                                break;
                            }
                            break;
                        case 332:
                            this.ho = i4;
                            com.ss.ttm.player.m mVar44 = this.hn;
                            if (!(mVar44 == null && (mVar44 = this.ah) == null)) {
                                mVar44.a(400, i4);
                                break;
                            }
                        case 333:
                            this.hp = i4;
                            com.ss.ttm.player.m mVar45 = this.hn;
                            if (!(mVar45 == null && (mVar45 = this.ah) == null)) {
                                mVar45.a(254, i4);
                                break;
                            }
                        case 334:
                            this.id = i4;
                            break;
                        case 335:
                            this.ie = i4;
                            break;
                        case 339:
                            this.gz = i4;
                            com.ss.ttm.player.m mVar46 = this.ah;
                            if (mVar46 != null) {
                                mVar46.a(280, i4);
                                break;
                            }
                            break;
                        case 340:
                            this.dD = i4;
                            com.ss.ttm.player.m mVar47 = this.ah;
                            if (mVar47 != null) {
                                mVar47.a(98, i4);
                                break;
                            }
                            break;
                        case 341:
                            this.f349if = i4;
                            IABRModule iABRModule2 = this.bU;
                            if (iABRModule2 != null) {
                                iABRModule2.setIntOptionForKey(6, i4);
                            }
                            com.ss.ttvideoengine.h.j jVar2 = this.ae;
                            if (jVar2 != null) {
                                jVar2.d(i4, 0);
                                break;
                            }
                            break;
                        case 342:
                            this.ig = i4;
                            IABRModule iABRModule3 = this.bU;
                            if (iABRModule3 != null) {
                                iABRModule3.setIntOptionForKey(7, i4);
                            }
                            com.ss.ttvideoengine.h.j jVar3 = this.ae;
                            if (jVar3 != null) {
                                jVar3.d(0, i4);
                                break;
                            }
                            break;
                        case 343:
                            this.dX = i4;
                            com.ss.ttm.player.m mVar48 = this.ah;
                            if (mVar48 != null) {
                                mVar48.a(643, i4);
                                break;
                            }
                            break;
                        case 358:
                            this.ej = i4;
                            com.ss.ttm.player.m mVar49 = this.ah;
                            if (mVar49 != null) {
                                mVar49.a(358, i4);
                                break;
                            }
                            break;
                        case 370:
                            this.el = i4;
                            com.ss.ttm.player.m mVar50 = this.ah;
                            if (mVar50 != null) {
                                mVar50.a(370, i4);
                                break;
                            }
                            break;
                        case 371:
                            this.f348do = i4;
                            com.ss.ttm.player.m mVar51 = this.ah;
                            if (mVar51 != null) {
                                mVar51.a(827, i4);
                                break;
                            }
                            break;
                        case 400:
                            if (i4 == 1) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            this.fB = z7;
                            break;
                        case 401:
                            this.eP = i4;
                            break;
                        case 402:
                            this.cV = i4;
                            break;
                        case 403:
                            this.gc = i4 == 1;
                            break;
                        case 410:
                            if (i4 == 1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            this.gb = z8;
                            break;
                        case 411:
                            com.ss.ttm.player.r.b(24, i4);
                            break;
                        case 413:
                            this.gd = i4;
                            break;
                        case 414:
                            this.ge = i4;
                            com.ss.ttm.player.m mVar52 = this.ah;
                            break;
                        case 415:
                            this.dC = i4;
                            com.ss.ttm.player.m mVar53 = this.ah;
                            if (mVar53 != null) {
                                mVar53.a(94, i4);
                                break;
                            }
                            break;
                        case 416:
                            this.gr = i4;
                            break;
                        case 417:
                            this.go = i4;
                            com.ss.ttm.player.m mVar54 = this.ah;
                            if (mVar54 != null) {
                                mVar54.a(185, i4);
                                break;
                            }
                            break;
                        case 418:
                            this.gu = i4;
                            break;
                        case 419:
                            this.gL = i4;
                            break;
                        case 420:
                            this.gM = i4;
                            break;
                        case 421:
                            this.gO = i4;
                            break;
                        case 422:
                            this.gW = i4;
                            break;
                        case 423:
                            this.gX = i4;
                            break;
                        case 424:
                            this.gk = i4;
                            break;
                        case 425:
                            this.gl = i4;
                            break;
                        case 427:
                            if (i4 == 1) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            this.gi = z9;
                            break;
                        case 430:
                            this.hj = i4;
                            com.ss.ttm.player.m mVar55 = this.ah;
                            if (mVar55 != null) {
                                mVar55.a(378, i4);
                                break;
                            }
                            break;
                        case 431:
                            this.hk = i4;
                            break;
                        case 432:
                            this.cF |= 128;
                            if (i4 != 0) {
                                this.cK = "bytevc2";
                                break;
                            }
                            break;
                        case 450:
                            if (i4 > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.fC = z10;
                            break;
                        case 460:
                            this.dg = i4;
                            com.ss.ttm.player.m mVar56 = this.ah;
                            if (mVar56 != null) {
                                mVar56.a(252, i4);
                            }
                            this.ae.c(32, this.dg);
                            break;
                        case 470:
                            ap.f152259a = i4 == 1;
                            break;
                        case 471:
                            this.hl = i4;
                            break;
                        case 473:
                            this.gR = i4;
                            break;
                        case 474:
                            this.gY = i4;
                            break;
                        case 475:
                            this.gZ = i4;
                            break;
                        case 476:
                            this.hs = i4;
                            com.ss.ttm.player.m mVar57 = this.ah;
                            if (mVar57 != null) {
                                mVar57.a(256, i4);
                                break;
                            }
                            break;
                        case 478:
                            this.gN = i4;
                            break;
                        case 479:
                            com.ss.ttvideoengine.h.j jVar4 = this.ae;
                            if (jVar4 != null) {
                                jVar4.c(10, i4);
                                break;
                            }
                            break;
                        case 480:
                            this.bD = i4;
                            this.bE = System.currentTimeMillis();
                            com.ss.ttm.player.m mVar58 = this.ah;
                            if (mVar58 != null) {
                                mVar58.a(261, i4);
                            }
                            this.ae.c(45, i4);
                            this.ae.c(11, i4);
                            break;
                        case 481:
                            this.gv = i4;
                            com.ss.ttm.player.m mVar59 = this.ah;
                            if (mVar59 != null) {
                                mVar59.a(263, i4);
                                break;
                            }
                            break;
                        case 482:
                            this.gw = i4;
                            com.ss.ttm.player.m mVar60 = this.ah;
                            if (mVar60 != null) {
                                mVar60.a(276, i4);
                                break;
                            }
                            break;
                        case 483:
                            this.gS = i4;
                            break;
                        case 484:
                            this.gx = i4;
                            com.ss.ttm.player.m mVar61 = this.ah;
                            if (mVar61 != null) {
                                mVar61.a(278, i4);
                                break;
                            }
                            break;
                        case 485:
                            this.gy = i4;
                            com.ss.ttm.player.m mVar62 = this.ah;
                            if (mVar62 != null) {
                                mVar62.a(279, i4);
                                break;
                            }
                            break;
                        case 486:
                            this.gs = i4;
                            break;
                        case 487:
                            this.gt = i4;
                            break;
                        case 488:
                            this.gB = i4;
                            com.ss.ttm.player.m mVar63 = this.ah;
                            if (mVar63 != null) {
                                mVar63.a(401, i4);
                                break;
                            }
                            break;
                        case 489:
                            this.gV = i4;
                            break;
                        case 490:
                            this.gC = i4;
                            com.ss.ttm.player.m mVar64 = this.ah;
                            if (mVar64 != null) {
                                mVar64.a(285, i4);
                                break;
                            }
                            break;
                        case 491:
                            if (i4 > 0) {
                                this.gD = i4;
                                com.ss.ttm.player.m mVar65 = this.ah;
                                if (mVar65 != null) {
                                    mVar65.a(286, i4);
                                    break;
                                }
                            }
                            break;
                        case 492:
                            this.ex = Boolean.valueOf(i4 > 0);
                            break;
                        case 493:
                            this.cP = i4 == 1;
                            break;
                        case 495:
                            this.gT = i4;
                            break;
                        case 496:
                            this.gU = i4;
                            break;
                        case 497:
                            this.gE = ((float) i4) / 1000.0f;
                            break;
                        case 498:
                            this.gP = i4;
                            com.ss.ttm.player.m mVar66 = this.ah;
                            if (mVar66 != null) {
                                mVar66.a(146, i4);
                                break;
                            }
                            break;
                        case 499:
                            this.cm = i4;
                            com.ss.ttm.player.m mVar67 = this.ah;
                            if (mVar67 != null) {
                                mVar67.a(613, i4);
                            }
                            com.ss.ttvideoengine.h.j jVar5 = this.ae;
                            if (jVar5 != null) {
                                jVar5.c(48, i4);
                                break;
                            }
                            break;
                        case 500:
                            this.hG = i4;
                            break;
                        case 501:
                            this.hH = i4;
                            break;
                        case 502:
                            this.hN = i4;
                            break;
                        case 503:
                            this.bX = i4;
                            break;
                        case 504:
                            this.hI = i4;
                            ABRConfig.setSwitchModel(i4);
                            break;
                        case 505:
                            this.hJ = i4;
                            ABRConfig.setStartupModel(i4);
                            break;
                        case 506:
                            this.hL = i4;
                            ABRConfig.setFixedLevel(i4);
                            break;
                        case 507:
                            this.hX = i4;
                            break;
                        case 508:
                            if (d.a().d(12) == 200) {
                                i4 = 1;
                            }
                            this.gF = i4;
                            com.ss.ttm.player.m mVar68 = this.ah;
                            if (mVar68 != null) {
                                mVar68.a(292, i4);
                                break;
                            }
                            break;
                        case 509:
                            this.gG = i4;
                            com.ss.ttm.player.m mVar69 = this.ah;
                            if (mVar69 != null) {
                                mVar69.a(293, i4);
                                break;
                            }
                            break;
                        case 510:
                            this.iN = i4;
                            com.ss.ttvideoengine.h.j jVar6 = this.ae;
                            if (jVar6 != null) {
                                jVar6.c(46, i4);
                                break;
                            }
                            break;
                        case 515:
                            this.hb = i4;
                            com.ss.ttm.player.m mVar70 = this.ah;
                            if (mVar70 != null) {
                                mVar70.a(515, i4);
                                break;
                            }
                            break;
                        case 516:
                            this.gH = i4;
                            com.ss.ttm.player.m mVar71 = this.ah;
                            if (mVar71 != null) {
                                mVar71.a(297, i4);
                                break;
                            }
                            break;
                        case 517:
                            this.iO = i4;
                            break;
                        case 518:
                            this.iP = i4;
                            break;
                        case 519:
                            if (i4 != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.cR = z11;
                            break;
                        case 520:
                            if (i4 != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            this.dY = z12;
                            break;
                        case 521:
                            this.bW = i4;
                            if (i4 > 0 && this.bV == 0) {
                                ce = 4;
                                break;
                            }
                        case 522:
                            if (i4 != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            this.ii = z13;
                            this.ae.c(18, i4);
                            break;
                        case 523:
                            cc = i4;
                            this.ae.c(19, i4);
                            break;
                        case 525:
                            this.hY = i4;
                            break;
                        case 530:
                            this.gp = i4;
                            com.ss.ttm.player.m mVar72 = this.ah;
                            if (!(mVar72 == null || this.ae == null)) {
                                mVar72.a(619, i4);
                                this.ae.b();
                                break;
                            }
                        case 533:
                            this.cn = i4;
                            com.ss.ttm.player.m mVar73 = this.ah;
                            if (mVar73 != null) {
                                mVar73.a(618, i4);
                            }
                            com.ss.ttvideoengine.h.j jVar7 = this.ae;
                            if (jVar7 != null) {
                                jVar7.c(49, i4);
                                break;
                            }
                            break;
                        case 534:
                            this.co = i4;
                            com.ss.ttvideoengine.h.j jVar8 = this.ae;
                            if (jVar8 != null) {
                                jVar8.c(47, i4);
                                break;
                            }
                            break;
                        case 536:
                            this.hO = i4;
                            break;
                        case 537:
                            this.hP = i4;
                            break;
                        case 541:
                            this.gQ = i4;
                            break;
                        case 542:
                            this.fG = i4;
                            break;
                        case 543:
                            this.ik = i4;
                            com.ss.ttm.player.m mVar74 = this.ah;
                            if (mVar74 != null) {
                                mVar74.a(542, i4);
                                break;
                            }
                            break;
                        case 544:
                            this.hV = i4;
                            break;
                        case 550:
                            this.il = i4;
                            com.ss.ttm.player.m mVar75 = this.ah;
                            if (mVar75 != null) {
                                mVar75.a(550, i4);
                                break;
                            }
                            break;
                        case 551:
                            this.im = i4;
                            com.ss.ttm.player.m mVar76 = this.ah;
                            if (mVar76 != null) {
                                mVar76.a(551, i4);
                                break;
                            }
                            break;
                        case 552:
                            this.in = i4;
                            com.ss.ttm.player.m mVar77 = this.ah;
                            if (mVar77 != null) {
                                mVar77.a(552, i4);
                                break;
                            }
                            break;
                        case 557:
                            this.io = i4;
                            com.ss.ttm.player.m mVar78 = this.ah;
                            if (mVar78 != null) {
                                mVar78.a(557, i4);
                                break;
                            }
                            break;
                        case 558:
                            if (i4 != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            this.u = z14;
                            break;
                        case 559:
                            this.ip = i4;
                            com.ss.ttm.player.m mVar79 = this.ah;
                            if (mVar79 != null) {
                                mVar79.a(558, i4);
                                break;
                            }
                            break;
                        case 560:
                            this.iq = i4;
                            com.ss.ttm.player.m mVar80 = this.ah;
                            if (mVar80 != null) {
                                mVar80.a(559, i4);
                                break;
                            }
                            break;
                        case 561:
                            this.ir = i4;
                            break;
                        case 562:
                            this.is = i4;
                            com.ss.ttm.player.m mVar81 = this.ah;
                            if (mVar81 != null) {
                                mVar81.a(561, i4);
                                break;
                            }
                            break;
                        case 563:
                            this.it = i4;
                            com.ss.ttm.player.m mVar82 = this.ah;
                            if (mVar82 != null) {
                                mVar82.a(562, i4);
                                break;
                            }
                            break;
                        case 564:
                            this.iu = i4;
                            break;
                        case 565:
                            this.iv = i4;
                            break;
                        case 566:
                            this.jm = i4;
                            com.ss.ttm.player.m mVar83 = this.ah;
                            if (mVar83 != null) {
                                mVar83.a(565, i4);
                                break;
                            }
                            break;
                        case 567:
                            this.iw = i4;
                            break;
                        case 568:
                            this.iQ = i4;
                            com.ss.ttm.player.m mVar84 = this.ah;
                            if (mVar84 != null) {
                                mVar84.a(853, i4);
                                break;
                            }
                            break;
                        case 569:
                            this.iS = i4;
                            com.ss.ttm.player.m mVar85 = this.ah;
                            if (mVar85 != null) {
                                mVar85.a(854, i4);
                                break;
                            }
                            break;
                        case 571:
                            this.hQ = i4;
                            break;
                        case 572:
                            this.iy = i4;
                            break;
                        case 573:
                            this.hK = i4;
                            break;
                        case 574:
                            this.hM = i4;
                            com.ss.ttvideoengine.n.a.a.a(i4);
                            break;
                        case 575:
                            this.iz = i4;
                            break;
                        case 576:
                            this.iA = i4;
                            break;
                        case 577:
                            this.iB = i4;
                            break;
                        case 578:
                            this.iC = i4;
                            break;
                        case 579:
                            this.iD = i4;
                            break;
                        case 580:
                            this.iE = i4;
                            break;
                        case 581:
                            this.iF = i4;
                            break;
                        case 582:
                            this.js = i4;
                            com.ss.ttm.player.m mVar86 = this.ah;
                            if (mVar86 != null) {
                                mVar86.a(664, i4);
                                break;
                            }
                            break;
                        case 583:
                            this.hC = i4;
                            break;
                        case 584:
                            if (i4 == 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            this.iG = z15;
                            break;
                        case 600:
                            this.cN = i4;
                            break;
                        case 601:
                            this.cO = i4;
                            break;
                        case 602:
                            this.cq = i4;
                            com.ss.ttm.player.m mVar87 = this.ah;
                            if (mVar87 != null) {
                                mVar87.a(647, i4);
                                break;
                            }
                            break;
                        case 603:
                            this.hr = i4;
                            break;
                        case 604:
                            com.ss.ttvideoengine.h.j jVar9 = this.ae;
                            if (jVar9 != null) {
                                jVar9.c(22, i4);
                                break;
                            }
                            break;
                        case 605:
                            com.ss.ttvideoengine.h.j jVar10 = this.ae;
                            if (jVar10 != null) {
                                jVar10.c(23, i4);
                                break;
                            }
                            break;
                        case 606:
                            this.hc = i4;
                            break;
                        case 607:
                            this.hd = i4;
                            com.ss.ttm.player.m mVar88 = this.ah;
                            if (mVar88 != null) {
                                mVar88.a(536, i4);
                                break;
                            }
                            break;
                        case 608:
                            this.he = i4;
                            com.ss.ttm.player.m mVar89 = this.ah;
                            if (mVar89 != null) {
                                mVar89.a(537, i4);
                                break;
                            }
                            break;
                        case 609:
                            this.hf = i4;
                            break;
                        case 610:
                            this.hg = i4;
                            break;
                        case 611:
                            this.ih = i4;
                            com.ss.ttm.player.m mVar90 = this.ah;
                            if (mVar90 != null) {
                                mVar90.a(5003, i4);
                                break;
                            }
                            break;
                        case 612:
                            if (i4 != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            this.aZ = z16;
                            break;
                        case 613:
                            this.fU = i4;
                            com.ss.ttm.player.m mVar91 = this.ah;
                            if (mVar91 != null) {
                                mVar91.a(333, i4);
                                break;
                            }
                            break;
                        case 616:
                            if (i4 == 1) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            this.ju = z17;
                            break;
                        case 617:
                            com.ss.ttvideoengine.h.j jVar11 = this.ae;
                            if (jVar11 != null) {
                                jVar11.c(52, i4);
                                break;
                            }
                            break;
                        case 618:
                            if (i4 != 0 && this.cB == null) {
                                this.cB = new com.ss.ttvideoengine.h.d(this.aa);
                                break;
                            }
                        case 620:
                            this.fV = i4;
                            com.ss.ttm.player.m mVar92 = this.ah;
                            if (mVar92 != null) {
                                mVar92.a(820, i4);
                                break;
                            }
                            break;
                        case 650:
                            this.fT = i4;
                            break;
                        case 652:
                            this.bz = i4;
                            break;
                        case 654:
                            this.fW = i4;
                            VideoSurface videoSurface2 = this.bn;
                            if (videoSurface2 != null) {
                                videoSurface2.b(9, i4);
                                break;
                            }
                            break;
                        case 656:
                            if (i4 == 1) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            this.cz = z18;
                            break;
                        case 657:
                            if (i4 > 0) {
                                this.iZ = i4;
                                break;
                            }
                            break;
                        case 658:
                            this.gn = i4;
                            com.ss.ttm.player.m mVar93 = this.ah;
                            if (mVar93 != null) {
                                mVar93.a(823, i4);
                                break;
                            }
                            break;
                        case 661:
                            this.bo = i4;
                            break;
                        case 663:
                            if (i4 == 1) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            this.iY = z19;
                            break;
                        case 664:
                            this.z = i4;
                            break;
                        case 665:
                            this.em = i4;
                            break;
                        case 666:
                            this.en = i4;
                            break;
                        case 668:
                            if (i4 >= 0) {
                                this.hm = i4;
                                break;
                            }
                            break;
                        case 669:
                            this.gq = i4;
                            com.ss.ttm.player.m mVar94 = this.ah;
                            if (mVar94 != null) {
                                mVar94.a(828, i4);
                                break;
                            }
                            break;
                        case 670:
                            this.eo = i4;
                            break;
                        case 671:
                            if (i4 == 1) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            this.cM = z20;
                            break;
                        case 673:
                            if (i4 == 1) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            this.jn = z21;
                            com.ss.ttm.player.m mVar95 = this.ah;
                            if (mVar95 != null) {
                                mVar95.a(149, i4);
                            }
                            this.ae.c(97, this.jn ? 1 : 0);
                            break;
                        case 675:
                            com.ss.ttm.player.m mVar96 = this.ah;
                            if (!(mVar96 == null || this.ep == i4)) {
                                mVar96.a(660, i4);
                            }
                            this.ep = i4;
                            break;
                        case 677:
                            this.iW = i4;
                            com.ss.ttm.player.m mVar97 = this.ah;
                            if (mVar97 != null) {
                                mVar97.a(870, i4);
                                break;
                            }
                            break;
                        case 678:
                            this.iR = i4;
                            com.ss.ttm.player.m mVar98 = this.ah;
                            if (mVar98 != null) {
                                mVar98.a(829, i4);
                                break;
                            }
                            break;
                        case 679:
                            this.cW = i4;
                            break;
                        case 680:
                            this.jq = i4;
                            break;
                        case 681:
                            if (i4 == 1) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            this.cD = z22;
                            break;
                        case 700:
                            this.ea = i4;
                            com.ss.ttm.player.m mVar99 = this.ah;
                            if (mVar99 != null) {
                                mVar99.a(960, i4);
                                break;
                            }
                            break;
                        case 703:
                            this.jo = i4;
                            break;
                        case 704:
                            this.ae.c(100, i4);
                            break;
                        case 705:
                            this.jx = i4;
                            break;
                        case 800:
                            this.jr = i4;
                            break;
                        case 850:
                            this.dz = i4;
                            com.ss.ttm.player.m mVar100 = this.ah;
                            if (mVar100 != null) {
                                mVar100.a(1010, i4);
                                break;
                            }
                            break;
                        case 851:
                            this.dA = i4;
                            com.ss.ttm.player.m mVar101 = this.ah;
                            if (mVar101 != null) {
                                mVar101.a(1011, i4);
                                break;
                            }
                            break;
                        case 852:
                            this.dB = i4;
                            com.ss.ttm.player.m mVar102 = this.ah;
                            if (mVar102 != null) {
                                mVar102.a(1012, i4);
                                break;
                            }
                            break;
                        case 950:
                            this.jd = (long) i4;
                            break;
                        case 951:
                            this.je = i4;
                            break;
                        case 952:
                            this.jf = i4;
                            com.ss.ttm.player.m mVar103 = this.ah;
                            if (mVar103 != null) {
                                mVar103.a(952, i4);
                                break;
                            }
                            break;
                        case 953:
                            this.jg = i4;
                            com.ss.ttm.player.m mVar104 = this.ah;
                            if (!(mVar104 == null || i4 == -1)) {
                                mVar104.a(982, i4);
                                break;
                            }
                        case 954:
                            this.jh = i4;
                            com.ss.ttm.player.m mVar105 = this.ah;
                            if (!(mVar105 == null || i4 == -1)) {
                                mVar105.a(985, i4);
                                break;
                            }
                        case 955:
                            this.ji = i4;
                            com.ss.ttm.player.m mVar106 = this.ah;
                            if (!(mVar106 == null || i4 == -1)) {
                                mVar106.a(1000, i4);
                                break;
                            }
                        case 956:
                            this.jj = i4;
                            com.ss.ttm.player.m mVar107 = this.ah;
                            if (!(mVar107 == null || i4 == -1)) {
                                mVar107.a(1003, i4);
                                break;
                            }
                        case 958:
                            this.jl = i4;
                            com.ss.ttm.player.m mVar108 = this.ah;
                            if (mVar108 != null) {
                                mVar108.a(1005, i4);
                                break;
                            }
                            break;
                        default:
                            switch (i2) {
                                case 31:
                                    com.ss.ttm.player.m mVar109 = this.ah;
                                    if (mVar109 != null) {
                                        mVar109.a(59, i4);
                                        break;
                                    }
                                    break;
                                case 32:
                                    this.eO = i4;
                                    com.ss.ttm.player.m mVar110 = this.ah;
                                    if (mVar110 != null) {
                                        mVar110.a(193, i4);
                                        break;
                                    }
                                    break;
                                case 33:
                                    if (i4 == 1) {
                                        z23 = true;
                                    } else {
                                        z23 = false;
                                    }
                                    this.cL = z23;
                                    break;
                                case 34:
                                    this.eR = i4;
                                    com.ss.ttm.player.m mVar111 = this.ah;
                                    if (mVar111 != null) {
                                        mVar111.a(206, i4);
                                        break;
                                    }
                                    break;
                                default:
                                    switch (i2) {
                                        case 36:
                                            this.eS = i4;
                                            com.ss.ttm.player.m mVar112 = this.ah;
                                            if (mVar112 != null) {
                                                mVar112.a(208, i4);
                                                break;
                                            }
                                            break;
                                        case 37:
                                            if (i4 == 1) {
                                                z24 = true;
                                            } else {
                                                z24 = false;
                                            }
                                            this.eU = z24;
                                            break;
                                        case 38:
                                            this.eT = i4;
                                            com.ss.ttm.player.m mVar113 = this.ah;
                                            if (mVar113 != null) {
                                                mVar113.a(209, i4);
                                                break;
                                            }
                                            break;
                                    }
                            }
                    }
                    break;
            }
        } else {
            this.dw = i4;
            com.ss.ttm.player.m mVar114 = this.ah;
            if (mVar114 != null) {
                mVar114.a(197, i4);
            }
        }
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("set int option key:%d value:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i4)}));
    }

    /* access modifiers changed from: package-private */
    public final void b(com.ss.ttm.player.p pVar) {
        if (this.ah != null) {
            try {
                if (!d(2) || (Build.VERSION.SDK_INT >= 23 && this.r)) {
                    this.ah.a(pVar);
                    this.ae.a(this.E);
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(Surface surface) {
        com.ss.ttvideoengine.h.j jVar;
        this.ab = surface;
        if (!(surface == null || (jVar = this.ae) == null || this.av)) {
            jVar.u(surface.toString());
        }
        if (this.hn != null || this.ah != null) {
            e(this.ab);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(SurfaceHolder surfaceHolder) {
        com.ss.ttvideoengine.h.j jVar;
        if (!(this.eu == null || this.ac == null)) {
            com.ss.ttvideoengine.s.j.b("TTVideoEngine", "remove callback:" + this.eu + ", surfaceholder:" + surfaceHolder + ", mSurface:" + this.ab + ", mSurfaceHolder:" + this.ac);
            this.eu.f152283a.clear();
            this.ac.removeCallback(this.eu);
            this.eu = null;
        }
        this.ac = surfaceHolder;
        if (!(surfaceHolder == null || (jVar = this.ae) == null)) {
            jVar.u(surfaceHolder.toString());
        }
        if (this.je != 0) {
            com.ss.ttm.player.m mVar = this.ah;
            if (mVar != null) {
                mVar.a(surfaceHolder);
            }
        } else if (this.ac == null) {
            e((Surface) null);
        } else {
            as asVar = new as(this);
            this.eu = asVar;
            this.ac.addCallback(asVar);
            e(this.ac.getSurface());
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.F.put(str.substring(0, 1).toUpperCase() + str.substring(1), str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0370, code lost:
        if (r5 == null) goto L_0x0372;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(com.ss.ttvideoengine.j.e r32) {
        /*
        // Method dump skipped, instructions count: 2565
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.e(com.ss.ttvideoengine.j.e):void");
    }

    public static void a(String str, String str2, String[] strArr, long j2, String str3) {
        d.h.f152465a.a(str, str2, strArr, j2, str3);
    }

    private String[] a(String[] strArr) {
        if (b.a.f152363a.e() == 1 && this.dj == 0) {
            return strArr;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                strArr[i2] = com.ss.ttvideoengine.s.i.b(strArr[i2], "p2p=0");
            }
        }
        return strArr;
    }

    /* access modifiers changed from: package-private */
    public static class g implements com.ss.ttvideoengine.k.b {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<aj> f152231a;

        static {
            Covode.recordClassIndex(101465);
        }

        @Override // com.ss.ttvideoengine.k.b
        public final void a() {
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "dns cancelled");
        }

        public g(aj ajVar) {
            this.f152231a = new WeakReference<>(ajVar);
        }

        @Override // com.ss.ttvideoengine.k.b
        public final void a(com.ss.ttvideoengine.s.c cVar) {
            if (cVar == null) {
                Object[] objArr = new Object[1];
                throw new NullPointerException("toString");
            }
        }

        @Override // com.ss.ttvideoengine.k.b
        public final void a(JSONObject jSONObject, com.ss.ttvideoengine.s.c cVar) {
            aj ajVar = this.f152231a.get();
            if (ajVar != null) {
                if (ajVar.aX) {
                    com.ss.ttvideoengine.s.j.c("TTVideoEngine", "MyDNSCompletionListener should stop");
                } else if (cVar != null) {
                    com.ss.ttvideoengine.s.j.e("TTVideoEngine", com.a.a("dns failed:%s", new Object[]{cVar.toString()}));
                    ajVar.a(cVar);
                } else {
                    String str = null;
                    if (jSONObject != null) {
                        str = jSONObject.optString("ip");
                        long optLong = jSONObject.optLong("time");
                        String optString = jSONObject.optString("dns_type");
                        if (ajVar.ae != null) {
                            ajVar.ae.o(optLong);
                            ajVar.ae.d(86, optString);
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        ajVar.a(new com.ss.ttvideoengine.s.c("", -9997, "DNS result empty"));
                        com.ss.ttvideoengine.s.j.e("TTVideoEngine", "dns parse empty");
                    } else if (ajVar.ch.a(false)) {
                        ajVar.ch.a(300, 0, 0, str);
                    } else {
                        ajVar.l(str);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class p implements IPlayStateSupplier {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<aj> f152240a;

        /* renamed from: b  reason: collision with root package name */
        private int f152241b = -1;

        /* renamed from: c  reason: collision with root package name */
        private int f152242c = -1;

        static {
            Covode.recordClassIndex(101474);
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final Queue<IABRModuleSpeedRecord> getTimelineNetworkSpeed() {
            return null;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getNetworkState() {
            return ag.a().f152179a;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getCurrentDownloadAudioBitrate() {
            aj ajVar = this.f152240a.get();
            if (ajVar == null) {
                return -1;
            }
            return ajVar.bY;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getCurrentDownloadAudioSegmentIndex() {
            com.ss.ttm.player.m mVar;
            aj ajVar = this.f152240a.get();
            if (ajVar == null || (mVar = ajVar.ah) == null) {
                return -1;
            }
            return mVar.b(519, -1);
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getCurrentDownloadVideoBitrate() {
            aj ajVar = this.f152240a.get();
            if (ajVar == null || ajVar.ah == null) {
                return -1;
            }
            return ajVar.ah.b(601, -1);
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getCurrentDownloadVideoSegmentIndex() {
            com.ss.ttm.player.m mVar;
            aj ajVar = this.f152240a.get();
            if (ajVar == null || (mVar = ajVar.ah) == null) {
                return -1;
            }
            return mVar.b(520, -1);
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getCurrentPlaybackTime() {
            aj ajVar = this.f152240a.get();
            if (ajVar == null || ajVar.ah == null) {
                return -1;
            }
            return ajVar.ah.k();
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getLoaderType() {
            aj ajVar = this.f152240a.get();
            if (ajVar == null || ajVar.ah == null) {
                return -1;
            }
            try {
                return Integer.parseInt(ajVar.ah.c(200));
            } catch (Exception unused) {
                return -1;
            }
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getMaxCacheAudioTime() {
            com.ss.ttm.player.m mVar;
            int b2;
            aj ajVar = this.f152240a.get();
            if (ajVar == null || (mVar = ajVar.ah) == null || (b2 = mVar.b(24, -1)) <= 0) {
                return 30000;
            }
            return b2 * 1000;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getMaxCacheVideoTime() {
            com.ss.ttm.player.m mVar;
            int b2;
            aj ajVar = this.f152240a.get();
            if (ajVar == null || (mVar = ajVar.ah) == null || (b2 = mVar.b(24, -1)) <= 0) {
                return 30000;
            }
            return b2 * 1000;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final float getPlaySpeed() {
            aj ajVar = this.f152240a.get();
            if (ajVar == null || ajVar.E == null) {
                return 1.0f;
            }
            return ajVar.E.f152093d;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getPlayerAudioCacheTime() {
            com.ss.ttm.player.m mVar;
            aj ajVar = this.f152240a.get();
            if (ajVar == null || (mVar = ajVar.ah) == null) {
                return -1;
            }
            return (int) mVar.a(73, -1L);
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getPlayerVideoCacheTime() {
            com.ss.ttm.player.m mVar;
            aj ajVar = this.f152240a.get();
            if (ajVar == null || (mVar = ajVar.ah) == null) {
                return -1;
            }
            return (int) mVar.a(72, -1L);
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final float getDownloadSpeed() {
            Map<String, String> downloadSpeed;
            if (com.ss.ttvideoengine.q.c.f153180b == null || (downloadSpeed = com.ss.ttvideoengine.q.c.f153180b.getDownloadSpeed(com.ss.ttvideoengine.j.q.f152976a)) == null || downloadSpeed.get("download_speed") == null) {
                return -1.0f;
            }
            return Float.parseFloat(downloadSpeed.get("download_speed"));
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final float getNetworkSpeed() {
            if (com.ss.ttvideoengine.q.c.f153180b == null) {
                return -1.0f;
            }
            float predictSpeed = com.ss.ttvideoengine.q.c.f153180b.getPredictSpeed(0);
            com.ss.ttvideoengine.s.j.b("TTVideoEngine", com.a.a("[ABR] get network speed:%f", new Object[]{Float.valueOf(predictSpeed)}));
            return predictSpeed;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final float getSpeedConfidence() {
            if (com.ss.ttvideoengine.q.c.f153180b == null) {
                return -1.0f;
            }
            float lastPredictConfidence = com.ss.ttvideoengine.q.c.f153180b.getLastPredictConfidence();
            com.ss.ttvideoengine.s.j.b("TTVideoEngine", com.a.a("[ABR] get network confidence:%f", new Object[]{Float.valueOf(lastPredictConfidence)}));
            return lastPredictConfidence;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final Map<String, IBufferInfo> getAudioBufferInfo() {
            List<com.ss.ttvideoengine.j.o> b2;
            HashMap hashMap = new HashMap();
            aj ajVar = this.f152240a.get();
            if (!(ajVar == null || ajVar.ad == null || (b2 = ajVar.ad.b()) == null || b2.size() == 0)) {
                for (com.ss.ttvideoengine.j.o oVar : b2) {
                    if (oVar != null && oVar.a() == com.ss.ttvideoengine.j.q.f152977b) {
                        ABRBufferInfo aBRBufferInfo = new ABRBufferInfo();
                        String b3 = oVar.b(15);
                        aBRBufferInfo.setStreamId(b3);
                        aBRBufferInfo.setFileAvailSize(d.h.f152465a.i(b3));
                        com.ss.ttvideoengine.j.i e2 = oVar.e();
                        if (e2 != null) {
                            aBRBufferInfo.setHeadSize((long) e2.f152925b);
                        }
                        hashMap.put(new StringBuilder().append(oVar.a(3)).toString(), aBRBufferInfo);
                    }
                }
            }
            return hashMap;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final Map<String, IBufferInfo> getVideoBufferInfo() {
            List<com.ss.ttvideoengine.j.o> b2;
            HashMap hashMap = new HashMap();
            aj ajVar = this.f152240a.get();
            if (!(ajVar == null || ajVar.ad == null || (b2 = ajVar.ad.b()) == null || b2.size() == 0)) {
                for (com.ss.ttvideoengine.j.o oVar : b2) {
                    if (oVar != null && oVar.a() == com.ss.ttvideoengine.j.q.f152976a) {
                        ABRBufferInfo aBRBufferInfo = new ABRBufferInfo();
                        String b3 = oVar.b(15);
                        aBRBufferInfo.setStreamId(b3);
                        aBRBufferInfo.setFileAvailSize(d.h.f152465a.i(b3));
                        com.ss.ttvideoengine.j.i e2 = oVar.e();
                        if (e2 != null) {
                            aBRBufferInfo.setHeadSize((long) e2.f152925b);
                        }
                        hashMap.put(new StringBuilder().append(oVar.a(3)).toString(), aBRBufferInfo);
                    }
                }
            }
            return hashMap;
        }

        public p(aj ajVar) {
            this.f152240a = new WeakReference<>(ajVar);
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final List<? extends ISegmentInfo> getSegmentInfoList(int i2, int i3) {
            Object u;
            aj ajVar = this.f152240a.get();
            if (ajVar == null) {
                return null;
            }
            com.ss.ttm.player.m mVar = ajVar.ah;
            ArrayList arrayList = new ArrayList();
            if (i2 != this.f152241b) {
                this.f152241b = i2;
                mVar.a(522, i2);
            }
            if (i3 != this.f152242c) {
                this.f152242c = i3;
                mVar.a(523, i3);
            }
            if ((mVar instanceof m) && (u = ((m) mVar).u()) != null) {
                for (Object obj : (Object[]) u) {
                    arrayList.add(new com.ss.ttvideoengine.a.b(obj));
                }
            }
            return arrayList;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final float getAverageDownloadSpeed(int i2, int i3, boolean z) {
            if (com.ss.ttvideoengine.q.c.f153180b != null) {
                return com.ss.ttvideoengine.q.c.f153180b.getAverageDownloadSpeed(i2, i3, z);
            }
            return -1.0f;
        }
    }

    static class w implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private File f152248a;

        static {
            Covode.recordClassIndex(101481);
        }

        public final void run() {
            com.ss.ttvideoengine.s.i.a(this.f152248a);
        }

        public w(File file) {
            this.f152248a = file;
        }
    }

    private boolean Y() {
        return d(2);
    }

    private void ar() {
        d.h.f152465a.a(this, this.bl);
    }

    public final void E() {
        this.ae.a((com.ss.ttvideoengine.j.p) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void U() {
        c(this.ad);
    }

    public final float f() {
        return com.ss.ttvideoengine.s.i.b(this.aa);
    }

    public final long i() {
        return m(60);
    }

    /* access modifiers changed from: package-private */
    public static class t implements m.i {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<aj> f152246a;

        static {
            Covode.recordClassIndex(101478);
        }

        @Override // com.ss.ttm.player.m.i
        public final void a() {
            aj ajVar = this.f152246a.get();
            if (ajVar != null) {
                ajVar.j(true);
            }
        }

        public t(aj ajVar) {
            this.f152246a = new WeakReference<>(ajVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static class u implements d.a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<aj> f152247a;

        static {
            Covode.recordClassIndex(101479);
        }

        @Override // com.ss.ttvideoengine.f.d.a
        public final void a() {
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "sub fetcher cancelled");
            this.f152247a.get();
        }

        public u(aj ajVar) {
            this.f152247a = new WeakReference<>(ajVar);
        }

        @Override // com.ss.ttvideoengine.f.d.a
        public final void a(String str, com.ss.ttvideoengine.s.c cVar) {
            aj ajVar = this.f152247a.get();
            if (ajVar != null) {
                ac acVar = ajVar.L;
                ad adVar = ajVar.M;
                if (acVar == null || ajVar.cn <= 0) {
                    if (adVar == null || ajVar.cn <= 0) {
                        com.ss.ttvideoengine.s.j.e("TTVideoEngine", "mSubInfoListener is null");
                    } else {
                        adVar.a(cVar);
                    }
                }
                if (str == null || cVar != null) {
                    com.ss.ttvideoengine.s.j.e("TTVideoEngine", com.a.a("sub fetch info failed:%s", new Object[]{cVar.toString()}));
                    if (ajVar.ae != null) {
                        ajVar.ae.c(cVar.toString());
                    }
                } else if (ajVar.ah != null && ajVar.ae != null) {
                    ajVar.k(str);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class x {

        /* renamed from: a  reason: collision with root package name */
        public String f152249a;

        /* renamed from: b  reason: collision with root package name */
        public String f152250b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f152251c;

        static {
            Covode.recordClassIndex(101482);
        }

        public final String a() {
            if (this.f152251c) {
                return this.f152250b;
            }
            return this.f152249a;
        }

        private x() {
        }

        public final void a(String str) {
            this.f152249a = str;
            this.f152251c = false;
        }

        /* synthetic */ x(aj ajVar, byte b2) {
            this();
        }
    }

    private int an() {
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar == null) {
            return 0;
        }
        return mVar.k();
    }

    /* access modifiers changed from: package-private */
    public final void G() {
        this.bj.clear();
        this.bk.clear();
        this.bl = null;
    }

    /* access modifiers changed from: package-private */
    public final void K() {
        this.aV = true;
        this.aX = false;
        this.ar = false;
        this.fi = 0;
        k(true);
        this.bh = false;
    }

    public final com.ss.ttvideoengine.i.b d() {
        com.ss.ttvideoengine.h.j jVar = this.ae;
        if (jVar == null) {
            return null;
        }
        return jVar.w();
    }

    public final boolean g() {
        boolean z2 = this.aF;
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar != null) {
            return mVar.r();
        }
        return z2;
    }

    public final com.ss.ttvideoengine.k.k h() {
        com.ss.ttvideoengine.k.k kVar = this.G;
        if (kVar != null) {
            return kVar;
        }
        if (ap.f152260b != null) {
            return ap.f152260b;
        }
        return null;
    }

    public final int u() {
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar != null) {
            return mVar.m();
        }
        return 0;
    }

    public final int v() {
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar != null) {
            return mVar.l();
        }
        return 0;
    }

    public final int w() {
        com.ss.ttvideoengine.s.f fVar = this.bg;
        if (fVar != null) {
            return fVar.f153268a.c();
        }
        return 0;
    }

    static class m implements com.ss.ttvideoengine.h.f {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<aj> f152237a;

        static {
            Covode.recordClassIndex(101471);
        }

        @Override // com.ss.ttvideoengine.h.f
        public final ArrayList e() {
            aj ajVar = this.f152237a.get();
            if (!(ajVar == null || ajVar.Y == null)) {
                Object a2 = ajVar.Y.a();
                if (a2 instanceof ArrayList) {
                    return (ArrayList) a2;
                }
            }
            return null;
        }

        @Override // com.ss.ttvideoengine.h.f
        public final String c() {
            aj ajVar = this.f152237a.get();
            if (ajVar != null && ajVar.bf != 0) {
                return d.h.f152465a.e(ajVar.cg);
            }
            com.ss.ttvideoengine.s.j.e("TTVideoEngine", "videoEngine is:" + ajVar + ", dataloader enable:" + ajVar.bf);
            return null;
        }

        @Override // com.ss.ttvideoengine.h.f
        public final Map<String, Object> d() {
            Intent a2;
            int i2;
            aj ajVar = this.f152237a.get();
            if (ajVar == null || ajVar.cB == null) {
                return null;
            }
            com.ss.ttvideoengine.h.d dVar = ajVar.cB;
            if (dVar.f152608a == null || (a2 = com.ss.ttvideoengine.h.d.a(dVar.f152608a, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
                return null;
            }
            int intExtra = a2.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            int intExtra2 = a2.getIntExtra("plugged", -1);
            int intExtra3 = a2.getIntExtra("level", -1);
            int intExtra4 = a2.getIntExtra("scale", -1);
            HashMap hashMap = new HashMap(3);
            hashMap.put("isCharging", Integer.valueOf(i2));
            hashMap.put("chargePlug", Integer.valueOf(intExtra2));
            hashMap.put("power", Integer.valueOf((intExtra3 * 100) / intExtra4));
            return hashMap;
        }

        @Override // com.ss.ttvideoengine.h.f
        public final Map<String, String> a() {
            aj ajVar = this.f152237a.get();
            if (ajVar == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            String a2 = com.ss.ttm.player.r.a(14, "");
            if (ajVar.C == 0 || ajVar.C == 1) {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "3.0");
                hashMap.put("pc", a2);
                hashMap.put("sdk_version", "1.10.62.3");
            } else if (ajVar.C == 2) {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "1.0");
                hashMap.put("pc", "0");
                hashMap.put("sdk_version", "1.10.62.3");
            } else if (ajVar.C == 5) {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "5.0");
                hashMap.put("pc", "5");
                hashMap.put("sdk_version", "1.10.62.3");
            } else {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "4.0");
                hashMap.put("pc", a2);
                hashMap.put("sdk_version", "1.10.62.3");
            }
            hashMap.put("trv", "3.10.0");
            try {
                hashMap.put("ffv", (String) Class.forName("com.ss.ttffmpeg.FFmpegLibLoaderWrapper").getMethod("getFFmpegVersion", new Class[0]).invoke(null, new Object[0]));
            } catch (Throwable th) {
                com.ss.ttvideoengine.s.j.c("TTVideoEngine", "get ffmpeg version error: " + th.toString());
            }
            return hashMap;
        }

        @Override // com.ss.ttvideoengine.h.f
        public final Map<String, Long> b() {
            com.ss.ttm.player.m mVar;
            aj ajVar = this.f152237a.get();
            if (ajVar == null || (mVar = ajVar.ah) == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("vds", Long.valueOf(mVar.a(45, 0L)));
            hashMap.put("vps", Long.valueOf(mVar.a(46, 0L)));
            hashMap.put("download_speed", Long.valueOf(mVar.a(63, -1L)));
            hashMap.put("vlen", Long.valueOf(mVar.a(72, 0L)));
            hashMap.put("alen", Long.valueOf(mVar.a(73, 0L)));
            hashMap.put("vDecLen", Long.valueOf(mVar.a(602, 0L)));
            hashMap.put("aDecLen", Long.valueOf(mVar.a(603, 0L)));
            hashMap.put("vBaseLen", Long.valueOf(mVar.a(604, 0L)));
            hashMap.put("aBaseLen", Long.valueOf(mVar.a(605, 0L)));
            hashMap.put("avGap", Long.valueOf(mVar.a(606, -1L)));
            hashMap.put("single_vds", Long.valueOf(mVar.a(145, 0L)));
            return hashMap;
        }

        public m(aj ajVar) {
            this.f152237a = new WeakReference<>(ajVar);
        }

        @Override // com.ss.ttvideoengine.h.f
        public final float d(int i2) {
            aj ajVar = this.f152237a.get();
            if (ajVar == null || ajVar.ah == null) {
                return 0.0f;
            }
            if (i2 == 82) {
                return ajVar.ah.b(151);
            }
            if (i2 != 83) {
                return 0.0f;
            }
            return ajVar.ah.b(150);
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.ss.ttvideoengine.h.f
        public final String a(int i2) {
            aj ajVar = this.f152237a.get();
            if (ajVar == null) {
                return "";
            }
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        com.ss.ttm.player.m mVar = ajVar.ah;
                        if (mVar != null) {
                            return mVar.c(5002);
                        }
                    } else if (i2 == 3) {
                        return ajVar.aq;
                    } else {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                switch (i2) {
                                    case com.ss.android.ugc.playerkit.model.v.U:
                                        if (ajVar.ap != null) {
                                            return c.a.f152365a.a();
                                        }
                                        break;
                                    case 29:
                                        return ajVar.o;
                                    case 37:
                                        return d.h.f152465a.f();
                                    case 46:
                                        if (ajVar.ae != null) {
                                            return ajVar.ae.p();
                                        }
                                        return "";
                                    case 55:
                                        if (ajVar.ah != null) {
                                            return ajVar.ah.c(609);
                                        }
                                        break;
                                    case 65:
                                        if (ajVar.ah != null) {
                                            return ajVar.ah.c(516);
                                        }
                                        break;
                                    case 76:
                                        if (ajVar.an != null) {
                                            return ajVar.an.b(7);
                                        }
                                        return "";
                                    case 78:
                                        if (ajVar.ah != null) {
                                            return ajVar.ah.c(825);
                                        }
                                        break;
                                    case 80:
                                        if (ajVar.ah != null) {
                                            return ajVar.ah.c(824);
                                        }
                                        break;
                                    case 102:
                                        return ajVar.bQ;
                                    case 110:
                                        if (ajVar.ah != null) {
                                            return ajVar.ah.c(467);
                                        }
                                        break;
                                    default:
                                        switch (i2) {
                                            case 31:
                                                try {
                                                    return Build.BOARD;
                                                } catch (Exception unused) {
                                                    return "";
                                                }
                                            case 32:
                                                try {
                                                    return Build.HARDWARE;
                                                } catch (Exception unused2) {
                                                    return "";
                                                }
                                            case 33:
                                                if (ajVar.ah != null) {
                                                    return ajVar.ah.c(200);
                                                }
                                                break;
                                        }
                                }
                            } else if (ajVar.ah != null) {
                                return ajVar.ah.c(71);
                            }
                        } else if (ajVar.h() == null) {
                            return "own";
                        } else {
                            return "user";
                        }
                    }
                } else if (ajVar.ah != null) {
                    int b2 = ajVar.ah.b(139, -1);
                    if (b2 == 0) {
                        return "opengl";
                    }
                    if (b2 != 1) {
                        return "";
                    }
                    return "nativewindow";
                }
            } else if (ajVar.ah != null) {
                int i3 = ajVar.ct;
                if (i3 < 0) {
                    i3 = ajVar.ah.b(141, -1);
                }
                if (i3 == 0) {
                    return "h264";
                }
                if (i3 == 1) {
                    return "bytevc1";
                }
                if (i3 == 33) {
                    return "bytevc2";
                }
            }
            return "";
        }

        @Override // com.ss.ttvideoengine.h.f
        public final long b(int i2) {
            aj ajVar = this.f152237a.get();
            if (ajVar == null) {
                return 0;
            }
            if (i2 != 95) {
                com.ss.ttm.player.m mVar = ajVar.ah;
                if (mVar == null) {
                    return 0;
                }
                if (i2 == 7) {
                    return mVar.a(68, 0L);
                }
                if (i2 == 45) {
                    return mVar.a(152, -1L);
                }
                if (i2 == 66) {
                    return mVar.a(517, -1L);
                }
                if (i2 == 68) {
                    return mVar.a(72, -1L);
                }
                if (i2 == 75) {
                    return mVar.a(171, -1L);
                }
                if (i2 == 96) {
                    return mVar.a(526, -1L);
                }
                switch (i2) {
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        return mVar.a(69, 0L);
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        return mVar.a(70, 0L);
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        return mVar.a(75, 0L);
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        return mVar.a(76, 0L);
                    case ABRConfig.ABR_SELECT_SCENE:
                        return mVar.a(77, 0L);
                    case 15:
                        return mVar.a(78, 0L);
                    case 16:
                        return mVar.a(156, -1L);
                    case 17:
                        return mVar.a(155, -1L);
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        return mVar.a(163, -1L);
                    case 19:
                        return mVar.a(162, -1L);
                    default:
                        switch (i2) {
                            case 38:
                                return mVar.a(307, -1L);
                            case 39:
                                return mVar.a(308, -1L);
                            case 40:
                                return ajVar.bI;
                            case 41:
                                return ajVar.bJ;
                            default:
                                switch (i2) {
                                    case 51:
                                        return mVar.a(267, 0L);
                                    case 52:
                                        return mVar.a(268, 0L);
                                    case 53:
                                        return mVar.a(269, 0L);
                                    case 54:
                                        return mVar.a(606, -1L);
                                    default:
                                        switch (i2) {
                                            case 56:
                                                return mVar.a(45, -1L);
                                            case 57:
                                                return mVar.a(607, -1L);
                                            case 58:
                                                return mVar.a(608, -1L);
                                            default:
                                                switch (i2) {
                                                    case 70:
                                                        return mVar.a(636, -1L);
                                                    case 71:
                                                        return mVar.a(637, -1L);
                                                    case 72:
                                                        return mVar.a(638, -1L);
                                                    case 73:
                                                        return mVar.a(639, -1L);
                                                    default:
                                                        switch (i2) {
                                                            case 91:
                                                                return ajVar.bE;
                                                            case 92:
                                                                return ajVar.am;
                                                            case 93:
                                                                com.ss.ttvideoengine.h.h hVar = ajVar.af;
                                                                if (hVar == null) {
                                                                    return 0;
                                                                }
                                                                return hVar.f152617d;
                                                            default:
                                                                switch (i2) {
                                                                    case 104:
                                                                        return mVar.a(73, -1L);
                                                                    case 105:
                                                                        return mVar.a(72, -1L);
                                                                    case 106:
                                                                        return mVar.a(579, ajVar.ak);
                                                                    case 107:
                                                                        return mVar.a(577, ajVar.ak);
                                                                    case 108:
                                                                        return mVar.a(578, ajVar.ak);
                                                                    default:
                                                                        return 0;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } else if (ajVar.Y == null) {
                return -1;
            } else {
                Object a2 = ajVar.Y.a();
                if (a2 instanceof Long) {
                    return ((Long) a2).longValue();
                }
                return -1;
            }
        }

        @Override // com.ss.ttvideoengine.h.f
        public final int c(int i2) {
            aj ajVar = this.f152237a.get();
            if (ajVar == null) {
                return 0;
            }
            if (i2 == 48) {
                b.a.f152363a.a(ajVar.ae.x());
                return 0;
            } else if (i2 != 49) {
                if (i2 != 63) {
                    if (i2 != 64) {
                        if (i2 != 84) {
                            if (i2 == 85) {
                                return aj.f152207k;
                            }
                            switch (i2) {
                                case 21:
                                    return ajVar.v;
                                case 22:
                                    return ajVar.w;
                                case 23:
                                    return ajVar.A;
                                case 24:
                                    if (ajVar.ah == null) {
                                        return 0;
                                    }
                                    if (ajVar.cr < 0) {
                                        ajVar.cr = ajVar.ah.b(157, -1);
                                    }
                                    return ajVar.cr;
                                case 25:
                                    if (ajVar.ah == null) {
                                        return 0;
                                    }
                                    if (ajVar.cs < 0) {
                                        ajVar.cs = ajVar.ah.b(158, -1);
                                    }
                                    return ajVar.cs;
                                case 26:
                                    return (int) com.ss.ttvideoengine.s.i.b(ajVar.aa);
                                case 27:
                                    if (ajVar.ah == null) {
                                        return -1;
                                    }
                                    if (ajVar.ah.r()) {
                                        return 1;
                                    }
                                    return 0;
                                default:
                                    switch (i2) {
                                        case 30:
                                            return ajVar.n;
                                        case 61:
                                            if (ajVar.ah != null) {
                                                return ajVar.ah.b(53, -1);
                                            }
                                            return -1;
                                        case 67:
                                            if (ajVar.cp > 0) {
                                                return ajVar.cp;
                                            }
                                            if (ajVar.ah != null) {
                                                return ajVar.ah.k();
                                            }
                                            return -1;
                                        case 69:
                                            if (ajVar.ah != null) {
                                                return ajVar.ah.b(601, -1);
                                            }
                                            return -1;
                                        case 74:
                                            ag a2 = ag.a();
                                            if (a2.f152185h != null) {
                                                return a2.f152185h.a();
                                            }
                                            return -1;
                                        case 77:
                                            if (ajVar.ah != null) {
                                                return ajVar.ah.b(540, -1);
                                            }
                                            return -1;
                                        case 79:
                                            if (ajVar.ah != null) {
                                                return ajVar.ah.b(826, -1);
                                            }
                                            return -1;
                                        case 81:
                                            if (ajVar.ah == null) {
                                                return 0;
                                            }
                                            return ajVar.ah.b(643, -1);
                                        case 94:
                                            if (ajVar.Y == null) {
                                                return Integer.MIN_VALUE;
                                            }
                                            Object a3 = ajVar.Y.a();
                                            if (a3 instanceof Integer) {
                                                return ((Integer) a3).intValue();
                                            }
                                            return Integer.MIN_VALUE;
                                        case 103:
                                            if (ajVar.ah == null) {
                                                return -1;
                                            }
                                            return ajVar.ah.b(24, 0);
                                        case 109:
                                            IABRModule iABRModule = ajVar.bU;
                                            if (iABRModule != null) {
                                                return (int) iABRModule.getLongOption(53, -1);
                                            }
                                            return -1;
                                        default:
                                            switch (i2) {
                                                case 34:
                                                    return ajVar.p;
                                                case 35:
                                                    return ajVar.q;
                                                case 36:
                                                    return ajVar.bm;
                                                default:
                                                    switch (i2) {
                                                        case 42:
                                                            if (ajVar.ah == null) {
                                                                return 0;
                                                            }
                                                            return ajVar.ah.b(221, -1);
                                                        case 43:
                                                            if (ajVar.ah == null) {
                                                                return 0;
                                                            }
                                                            return ajVar.ah.b(222, -1);
                                                        case BuildConfig.VERSION_CODE:
                                                            if (ajVar.ah == null) {
                                                                return 0;
                                                            }
                                                            return ajVar.ah.b(245, -1);
                                                        default:
                                                            switch (i2) {
                                                                case 87:
                                                                    if (ajVar.ab == null) {
                                                                        return 1;
                                                                    }
                                                                    return 0;
                                                                case 88:
                                                                    return ajVar.bD;
                                                                case 89:
                                                                    com.ss.ttvideoengine.h.h hVar = ajVar.af;
                                                                    if (hVar != null && hVar.b()) {
                                                                        return 1;
                                                                    }
                                                                    return 0;
                                                                case 90:
                                                                    com.ss.ttvideoengine.h.h hVar2 = ajVar.af;
                                                                    if (hVar2 != null && hVar2.c()) {
                                                                        return 1;
                                                                    }
                                                                    return 0;
                                                                default:
                                                                    switch (i2) {
                                                                        case 99:
                                                                            ag a4 = ag.a();
                                                                            if (a4.f152185h != null) {
                                                                                return a4.f152185h.b();
                                                                            }
                                                                            return -1;
                                                                        case com.bytedance.nita.c.a.f41622a:
                                                                            return ajVar.cC;
                                                                        case 101:
                                                                            if (ajVar.b()) {
                                                                                return 1;
                                                                            }
                                                                            return 0;
                                                                        default:
                                                                            return 0;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                        } else if (ajVar.ah != null) {
                            return ajVar.ah.b(186, -1);
                        } else {
                            return -1;
                        }
                    } else if (ajVar.cu != -1) {
                        return ajVar.cu;
                    } else {
                        if (ajVar.ah != null) {
                            ajVar.cu = ajVar.ah.b(402, -1);
                        }
                        return ajVar.cu;
                    }
                } else if (ajVar.cv != -1) {
                    return ajVar.cv;
                } else {
                    if (ajVar.ah != null) {
                        ajVar.cv = ajVar.ah.b(403, -1);
                    }
                    return ajVar.cv;
                }
            } else if (ajVar.ah == null) {
                return 0;
            } else {
                return ajVar.ah.b(44, -1);
            }
        }

        @Override // com.ss.ttvideoengine.h.f
        public final void a(int i2, Map map) {
            aj ajVar = this.f152237a.get();
            switch (i2) {
                case 0:
                    if (ajVar != null && ajVar.O != null) {
                        ba baVar = new ba();
                        baVar.f152316a = "bufferStartInfos";
                        baVar.f152318c = map;
                        if (ajVar.ch.b()) {
                            ajVar.ch.a(412, 0, 0, baVar);
                            return;
                        } else if (ajVar.O != null) {
                            ajVar.O.a(baVar);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 1:
                    if (ajVar != null && ajVar.O != null) {
                        ba baVar2 = new ba();
                        baVar2.f152316a = "bufferEndInfos";
                        baVar2.f152318c = map;
                        if (ajVar.ch.b()) {
                            ajVar.ch.a(412, 0, 0, baVar2);
                            return;
                        } else if (ajVar.O != null) {
                            ajVar.O.a(baVar2);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 2:
                    if (ajVar != null && ajVar.O != null) {
                        JSONObject jSONObject = new JSONObject(map);
                        ba baVar3 = new ba();
                        baVar3.f152316a = "firstframe_split";
                        baVar3.f152318c = jSONObject;
                        baVar3.f152322g = ajVar.aH;
                        if (ajVar.ch.b()) {
                            ajVar.ch.b(412, 0, 0, baVar3);
                            return;
                        } else {
                            ajVar.O.a(baVar3);
                            return;
                        }
                    } else {
                        return;
                    }
                case 3:
                    if (ajVar != null && ajVar.O != null) {
                        ba baVar4 = new ba();
                        baVar4.f152316a = "outsyncStartInfos";
                        baVar4.f152318c = map;
                        if (ajVar.ch.b()) {
                            ajVar.ch.a(412, 0, 0, baVar4);
                            return;
                        } else if (ajVar.O != null) {
                            ajVar.O.a(baVar4);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 4:
                    if (ajVar != null && ajVar.O != null) {
                        ba baVar5 = new ba();
                        baVar5.f152316a = "outsyncEndInfos";
                        baVar5.f152318c = map;
                        if (ajVar.ch.b()) {
                            ajVar.ch.a(412, 0, 0, baVar5);
                            return;
                        } else if (ajVar.O != null) {
                            ajVar.O.a(baVar5);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (ajVar != null && ajVar.O != null) {
                        ba baVar6 = new ba();
                        baVar6.f152316a = "noRenderStartInfos";
                        baVar6.f152318c = map;
                        if (ajVar.ch.b()) {
                            ajVar.ch.a(412, 0, 0, baVar6);
                            return;
                        } else if (ajVar.O != null) {
                            ajVar.O.a(baVar6);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (ajVar != null && ajVar.O != null) {
                        ba baVar7 = new ba();
                        baVar7.f152316a = "noRenderEndInfos";
                        baVar7.f152318c = map;
                        if (ajVar.ch.b()) {
                            ajVar.ch.a(412, 0, 0, baVar7);
                            return;
                        } else if (ajVar.O != null) {
                            ajVar.O.a(baVar7);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    static class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private com.ss.ttm.player.m f152244a;

        static {
            Covode.recordClassIndex(101476);
        }

        public final void run() {
            if (this.f152244a != null) {
                try {
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "MyReleaseRunnable release");
                    this.f152244a.d();
                    this.f152244a = null;
                } catch (Exception e2) {
                    com.ss.ttvideoengine.s.j.e("TTVideoEngine", e2.toString());
                }
            }
        }

        public r(com.ss.ttm.player.m mVar) {
            this.f152244a = mVar;
        }
    }

    public static synchronized void a() {
        synchronized (aj.class) {
            MethodCollector.i(11514);
            try {
                com.ss.texturerender.m.a().b();
                MethodCollector.o(11514);
            } catch (NullPointerException unused) {
                MethodCollector.o(11514);
            }
        }
    }

    private void ae() {
        Surface surface;
        if (this.dY) {
            SurfaceHolder surfaceHolder = this.ac;
            if (surfaceHolder != null) {
                surface = surfaceHolder.getSurface();
            } else {
                surface = this.ab;
            }
            d(surface);
        }
    }

    private void al() {
        if (this.bC == null) {
            this.bC = new Handler(com.ss.ttvideoengine.s.i.a()) {
                /* class com.ss.ttvideoengine.aj.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(101458);
                }

                public final void handleMessage(Message message) {
                    super.handleMessage(message);
                    if (message.what == 10) {
                        String str = (String) message.obj;
                        long j2 = (long) message.arg1;
                        String str2 = aj.this.ci.get("video");
                        String str3 = aj.this.ci.get(DataType.AUDIO);
                        if (aj.this.A != 5) {
                            if (TextUtils.isEmpty(str3) || !str3.equals(str)) {
                                if (!TextUtils.isEmpty(str2) && str2.equals(str) && aj.this.ae != null) {
                                    aj.this.ae.s(j2);
                                }
                            } else if (aj.this.ae != null) {
                                aj.this.ae.r(j2);
                            }
                            String str4 = "";
                            if (aj.this.bk != null && aj.this.bk.contains(str)) {
                                aj.this.bK += j2;
                                if (aj.this.ae != null) {
                                    aj.this.ae.q(aj.this.bK);
                                }
                                StringBuilder append = new StringBuilder("using mdl cache, key :").append(str).append(" size = ").append(j2).append(" vid = ");
                                if (!TextUtils.isEmpty(aj.this.B)) {
                                    str4 = aj.this.B;
                                }
                                com.ss.ttvideoengine.s.j.a("TTVideoEngine", append.append(str4).toString());
                                if ((aj.this.ci.size() < 2 || aj.this.ci.containsValue(str)) && aj.this.O != null) {
                                    ba baVar = new ba();
                                    baVar.f152316a = "mdlfilepathhitcachesize";
                                    baVar.f152320e = str;
                                    baVar.f152321f = j2;
                                    if (aj.this.ch.b()) {
                                        aj.this.ch.b(412, 0, 0, baVar);
                                    } else {
                                        aj.this.O.a(baVar);
                                    }
                                }
                            } else if (aj.this.bj != null && aj.this.bj.contains(str)) {
                                aj.this.bK += j2;
                                if (aj.this.ae != null) {
                                    aj.this.ae.q(aj.this.bK);
                                }
                                StringBuilder append2 = new StringBuilder("using mdl cache, key :").append(str).append(" size = ").append(j2).append(" vid = ");
                                if (!TextUtils.isEmpty(aj.this.B)) {
                                    str4 = aj.this.B;
                                }
                                com.ss.ttvideoengine.s.j.a("TTVideoEngine", append2.append(str4).toString());
                                if ((aj.this.ci.size() < 2 || aj.this.ci.containsValue(str)) && aj.this.O != null) {
                                    ba baVar2 = new ba();
                                    baVar2.f152316a = "mdlhitcachesize";
                                    baVar2.f152319d = str;
                                    baVar2.f152321f = j2;
                                    if (aj.this.ch.b()) {
                                        aj.this.ch.b(412, 0, 0, baVar2);
                                    } else {
                                        aj.this.O.a(baVar2);
                                    }
                                }
                            }
                        }
                    }
                }
            };
        }
    }

    private void ap() {
        w[] allResolutions = w.getAllResolutions();
        for (w wVar : allResolutions) {
            this.eG.put(wVar, 0);
            this.eH.put(wVar, "");
        }
    }

    private void aw() {
        com.ss.ttvideoengine.f.b.a(this.B);
        try {
            com.ss.ttvideoengine.f.a.a.b(this.jb);
        } catch (Throwable th) {
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "fetcherMakerNew exception ".concat(String.valueOf(th)));
        }
        this.jb = null;
    }

    /* access modifiers changed from: package-private */
    public final void L() {
        this.aV = false;
        this.ae.g();
        ac();
        this.fo = SystemClock.elapsedRealtime();
        com.ss.ttvideoengine.s.f fVar = this.bg;
        if (fVar != null) {
            fVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final int P() {
        int i2;
        if (this.au || this.as) {
            i2 = this.az;
        } else {
            i2 = an();
        }
        k(i2);
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 < 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float e() {
        /*
            r3 = this;
            android.content.Context r1 = r3.aa
            if (r1 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.lang.String r0 = "audio"
            java.lang.Object r2 = a(r1, r0)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            r1 = 0
            if (r2 == 0) goto L_0x001a
            r0 = 3
            int r0 = r2.getStreamMaxVolume(r0)
            if (r0 >= 0) goto L_0x001b
        L_0x0018:
            float r0 = (float) r1
            return r0
        L_0x001a:
            r0 = 0
        L_0x001b:
            r1 = r0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.e():float");
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar != null) {
            mVar.a(this.D);
        }
        this.ae.c(this.D);
    }

    public final String r() {
        if (this.aG) {
            return this.eZ;
        }
        return this.bL.f152249a;
    }

    public final synchronized void x() {
        MethodCollector.i(11700);
        if (this.hn == null) {
            this.hn = ab();
        }
        MethodCollector.o(11700);
    }

    private void V() {
        if (this.fH != null) {
            if (this.bn != null) {
                com.ss.ttvideoengine.s.j.a("TTVideoEngine", "release video surface : " + this.bn);
                a(0, -7880);
                this.bn.release();
                this.bn = null;
            }
            this.fH = null;
            this.bz = 0;
            this.fW = 0;
            this.cC = 0;
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "mTextureRenderer become to null");
        }
    }

    private void W() {
        if (this.bn != null) {
            while (this.et.peek() != null) {
                Pair<Surface, Integer> poll = this.et.poll();
                VideoSurface videoSurface = this.bn;
                Surface surface = (Surface) poll.first;
                int intValue = ((Integer) poll.second).intValue();
                if (videoSurface.f151767a != null) {
                    videoSurface.f151767a.setExtraSurface(surface, intValue);
                }
            }
        }
    }

    private void X() {
        VideoSurface videoSurface = this.bn;
        if (videoSurface != null) {
            videoSurface.b(29, 0);
            this.bn.b(31, 0);
            this.bn.b(30, 0);
            p(this.db);
            this.bn.b(25, 1);
        }
    }

    private void ac() {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "_pause");
        if (!this.r) {
            this.s = true;
            i(2);
            return;
        }
        if (this.ah != null) {
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "player will pause");
            this.ah.g();
            i(2);
            j(2);
        }
        IABRModule iABRModule = this.bU;
        if (iABRModule != null) {
            iABRModule.stop();
            this.ae.N(0);
        }
    }

    private void ah() {
        this.eG.put(this.al, Integer.valueOf(this.eG.get(this.al).intValue() + 1));
        c(this.ad);
    }

    private void aj() {
        this.ik = com.ss.ttvideoengine.o.a.a().a("native_yv12_render", this.ik);
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "enabled native YV12: " + this.ik);
    }

    private void ak() {
        this.jm = com.ss.ttvideoengine.o.a.a().a("native_render_rotation_adapt", this.jm);
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "native render rotation adapt: " + this.jm);
    }

    private String aq() {
        String a2 = com.ss.ttvideoengine.s.i.a(this.aa);
        if (a2 != null) {
            return a2 + File.separator + "mediattmp";
        }
        return null;
    }

    private void av() {
        com.ss.ttvideoengine.f.b.a(this.B, this.ev, this.ew, this.ey);
        if (this.jb == null) {
            this.jb = new h(this);
        }
        try {
            com.ss.ttvideoengine.f.a.a.a(this.jb);
        } catch (Throwable th) {
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "fetcherMakerNew exception ".concat(String.valueOf(th)));
        }
    }

    /* access modifiers changed from: package-private */
    public final void I() {
        al();
        boolean z2 = true;
        this.aV = true;
        this.aX = false;
        this.ar = false;
        this.fi = 0;
        com.ss.ttvideoengine.j.e eVar = this.ad;
        if (eVar != null) {
            eVar.a(this.fA);
        }
        if (this.aB) {
            this.ae.c(14, 1);
            this.aB = false;
        }
        if (!this.aY && this.bI <= 0 && !this.r) {
            z2 = false;
        }
        k(z2);
        this.bh = false;
    }

    /* access modifiers changed from: package-private */
    public final void J() {
        this.aY = false;
        this.aV = false;
        this.aX = false;
        this.ar = false;
        this.fi = 0;
        com.ss.ttvideoengine.j.e eVar = this.ad;
        if (eVar != null) {
            eVar.a(this.fA);
        }
        com.ss.ttvideoengine.h.j jVar = this.ae;
        if (jVar != null) {
            jVar.Q(65);
        }
        k(false);
        this.bh = false;
    }

    /* access modifiers changed from: package-private */
    public final JSONObject Q() {
        String str;
        try {
            com.ss.ttm.player.m mVar = this.ah;
            if (mVar != null) {
                if (mVar.b(5000, 0) != 0) {
                    JSONObject jSONObject = new JSONObject();
                    String c2 = this.ah.c(5001);
                    if (this.ah.b(26, 1) == 1) {
                        str = "breakpad crash";
                    } else {
                        str = "simple crash";
                    }
                    jSONObject.put(str, c2);
                    return jSONObject;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void T() {
        Handler handler;
        au();
        if (this.bf > 0) {
            d.h.f152465a.e();
        }
        aq aqVar = this.ch;
        int i2 = this.iZ;
        if (aqVar.f152271i.A != 5 && (handler = aqVar.f152264b) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("paramObj", null);
            Message obtainMessage = handler.obtainMessage(24, 0, 0);
            obtainMessage.obj = hashMap;
            handler.postDelayed(new aq.c(handler, obtainMessage), (long) i2);
        }
    }

    public final void j() {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "prepare,".concat(String.valueOf(this)));
        if (this.ch.a(false)) {
            this.ch.a(22);
        } else {
            J();
        }
    }

    public final void k() {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "play:".concat(String.valueOf(this)));
        if (this.A == 5) {
            com.ss.ttvideoengine.s.j.e("TTVideoEngine", "already released, return");
        } else if (this.ch.a(false)) {
            this.ch.a(1);
        } else {
            I();
        }
    }

    public final void l() {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "pause,".concat(String.valueOf(this)));
        if (this.ch.a(false)) {
            this.ch.a(2);
        } else {
            L();
        }
    }

    public final void m() {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "stop:".concat(String.valueOf(this)));
        this.aV = false;
        this.be = false;
        this.bp = false;
        this.br = false;
        this.aX = true;
        this.bz = 0;
        this.fW = 0;
        if (this.ch.a(false)) {
            this.ch.a(3);
        } else {
            M();
        }
    }

    public final int t() {
        if (this.C == 2 || this.cq <= 0) {
            return s();
        }
        return this.cp;
    }

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Context f152218a;

        static {
            Covode.recordClassIndex(101459);
        }

        public final void run() {
            String a2;
            File[] listFiles;
            Context context = this.f152218a;
            if (!(context == null || (a2 = com.ss.ttvideoengine.s.i.a(context)) == null)) {
                File file = new File(a2);
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (file2.isFile() && file2.getName().matches("^[0-9]{1,15}\\.cach$")) {
                            com.ss.ttvideoengine.s.i.b(file2);
                        }
                    }
                }
            }
        }

        public a(Context context) {
            this.f152218a = context;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<String> f152225a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<String> f152226b;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<aj> f152227c;

        static {
            Covode.recordClassIndex(101461);
        }

        public final void run() {
            aj ajVar = this.f152227c.get();
            if (ajVar != null && ajVar.A != 5) {
                ArrayList<String> arrayList = this.f152226b;
                int i2 = 0;
                if (arrayList == null || arrayList.size() <= 0) {
                    ArrayList<String> arrayList2 = this.f152225a;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        while (i2 < this.f152225a.size()) {
                            String str = this.f152225a.get(i2);
                            long i3 = d.h.f152465a.i(str);
                            if (ajVar.bC != null) {
                                int i4 = (int) i3;
                                ajVar.bC.sendMessage(Message.obtain(ajVar.bC, 10, i4, i4, str));
                            }
                            i2++;
                        }
                        return;
                    }
                    return;
                }
                while (i2 < this.f152226b.size()) {
                    String str2 = this.f152226b.get(i2);
                    long g2 = d.h.f152465a.g(str2);
                    if (ajVar.bC != null) {
                        int i5 = (int) g2;
                        ajVar.bC.sendMessage(Message.obtain(ajVar.bC, 10, i5, i5, str2));
                    }
                    i2++;
                }
            }
        }

        public c(aj ajVar, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
            this.f152227c = new WeakReference<>(ajVar);
            this.f152225a = arrayList;
            this.f152226b = arrayList2;
        }
    }

    static {
        Covode.recordClassIndex(101455);
    }

    private String Z() {
        com.ss.ttvideoengine.j.o oVar;
        if (!this.aG && !this.aM && !this.aK) {
            if (this.fa) {
                return this.aD;
            }
            if (!TextUtils.isEmpty(this.eW) && ((oVar = this.an) == null || !TextUtils.isEmpty(oVar.b(15)))) {
                String aa2 = aa();
                if (TextUtils.isEmpty(aa2)) {
                    return null;
                }
                if (this.eW.charAt(this.eW.length() - 1) == '/') {
                    return com.a.a("%s%s.ttmp", new Object[]{this.eW, aa2});
                }
                return com.a.a("%s/%s.ttmp", new Object[]{this.eW, aa2});
            }
        }
        return null;
    }

    private com.ss.ttm.player.m ab() {
        a(this.hh);
        com.ss.ttm.player.m a2 = m.a(this.aa, this.ds, this.hh);
        m mVar = (m) a2;
        if (mVar.f153086b && this.ae != null) {
            this.ae.r(mVar.f153087d + ",customState:" + this.hU);
        }
        if (mVar.f153085a == null) {
            return null;
        }
        a(a2);
        com.ss.ttvideoengine.h.j jVar = this.ae;
        if (jVar != null) {
            jVar.p(System.currentTimeMillis());
        }
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "_playInternal MediaPlayerWrapper.create done videoId = " + this.B);
        return a2;
    }

    private void ao() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.ao.entrySet()) {
            String key = entry.getKey();
            b value = entry.getValue();
            if (!(key == null || value == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("url", key);
                hashMap.put("ip", value.f152219a);
                hashMap.put("dns", value.f152220b);
                hashMap.put("dns_cache_open", Integer.valueOf(value.f152221c));
                hashMap.put("server_dns_open", Integer.valueOf(value.f152222d));
                hashMap.put("url_desc", value.f152223e);
                if (this.fa && !TextUtils.isEmpty(this.aH)) {
                    hashMap.put("gid", this.aH);
                }
                arrayList.add(hashMap);
            }
        }
        if (!this.fa) {
            this.ae.a(arrayList);
        }
    }

    private boolean at() {
        com.ss.ttvideoengine.j.f fVar = this.cw;
        if (fVar != null) {
            fVar.c();
        } else {
            this.cw = new com.ss.ttvideoengine.j.f();
        }
        int a2 = this.cw.a(this.aa, this.eT);
        if (a2 != 0) {
            if (a2 == -1000) {
                a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainIntertrustDRM", -9939));
                return false;
            } else if (a2 == -1) {
                a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainIntertrustDRM", -9938));
                return false;
            } else if (a2 == -1002) {
                a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainIntertrustDRM", -9933));
                return false;
            } else {
                a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainIntertrustDRM", -9938, a2));
                return false;
            }
        } else if (this.cw.b() == -1) {
            a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainIntertrustDRM", -9938));
            return false;
        } else {
            this.cw.f152903d = new h(this);
            if (TextUtils.isEmpty(this.eY)) {
                return true;
            }
            this.cw.a(this.eY);
            return true;
        }
    }

    private void au() {
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar == null) {
            return;
        }
        if (this.di == 0 && !d.h.f152465a.d()) {
            return;
        }
        if (this.bh || this.iX) {
            com.ss.ttvideoengine.s.j.b("TTVideoEngine", "_syncPlayInfoToMdl complete");
            return;
        }
        long a2 = mVar.a(73, -1L);
        long a3 = mVar.a(72, -1L);
        if (a2 >= 0 && a3 >= 0) {
            a2 = Math.min(a2, a3);
        } else if (a2 < 0) {
            if (a3 >= 0) {
                a2 = a3;
            } else {
                return;
            }
        }
        a(5, a2);
    }

    public final void C() {
        o oVar;
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "_audioRenderStart,this:".concat(String.valueOf(this)));
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar != null) {
            if (!(this.z == 0 || (oVar = this.X) == null)) {
                mVar.b(48, -1);
                oVar.e(mVar.a(156, -1L), mVar.a(163, -1L));
            }
            if (!this.ax) {
                this.ax = true;
                this.ae.c(77, mVar.a(628, 0L));
            }
            if (!this.av) {
                if (mVar.b(62, -100) == 0 || this.bD != 0 || this.bF) {
                    B();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void M() {
        c(true, 0);
        if (this.fx > 0) {
            com.ss.ttm.player.m mVar = this.ah;
            if (mVar != null) {
                mVar.h();
                this.r = false;
            }
            com.ss.ttm.player.m mVar2 = this.ah;
            if (!(mVar2 == null || this.fG <= 0 || this.bn == null)) {
                mVar2.a((Surface) null);
            }
            com.ss.ttm.player.m mVar3 = this.ah;
            if (mVar3 != null && mVar3.b() == 0) {
                this.ah.d();
                this.ah = null;
            }
            com.ss.ttm.player.m mVar4 = this.hn;
            if (mVar4 != null) {
                mVar4.d();
                this.hn = null;
            }
            this.A = 0;
        }
        Handler handler = this.f152210g;
        if (handler != null) {
            handler.removeCallbacks(this.f152211h);
        }
        as();
        this.ja = 0;
    }

    /* access modifiers changed from: package-private */
    public final void N() {
        com.ss.ttvideoengine.k.h.c(this.aa);
        aw();
        com.ss.ttvideoengine.s.b.a(new be.c(this.gJ));
        this.aV = false;
        c(false, 1);
        V();
        IABRModule iABRModule = this.bU;
        if (iABRModule != null) {
            iABRModule.release();
            this.bU = null;
        }
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar != null) {
            try {
                mVar.d();
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.ah = null;
                throw th;
            }
            this.ah = null;
            ae();
        }
        com.ss.ttvideoengine.h.h hVar = this.af;
        if (hVar != null) {
            hVar.a();
            this.af = null;
        }
        this.cB = null;
        this.fE = null;
        this.aL = null;
        this.aK = false;
        this.aC = null;
        this.aD = null;
        this.gA = null;
        this.bH = null;
        this.ck = null;
        this.cT = false;
        this.cS = false;
        this.ja = 0;
        as();
        com.ss.ttvideoengine.j.f fVar = this.cw;
        if (fVar != null) {
            fVar.a();
            this.cw = null;
        }
        this.A = 5;
        this.ch.a();
    }

    public final boolean R() {
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar == null) {
            return true;
        }
        try {
            int k2 = mVar.k();
            int n2 = this.ah.n();
            long a2 = this.ah.a(72, -1L);
            if (this.ah.b(157, -1) == 5 && this.v == 1 && this.w == 1 && k2 >= 1000 && n2 - k2 >= 1000 && a2 >= 500) {
                int b2 = this.ah.b(160, 100);
                long a3 = this.ah.a(152, -1L);
                int b3 = this.ah.b(153, -1);
                float b4 = this.ah.b(151);
                if (b4 > ((float) this.dy)) {
                    b4 /= 2.0f;
                }
                int i2 = this.dE;
                int i3 = (((int) b4) * i2) / (i2 + 1);
                if (a3 > -350 || b3 < (i3 * 2) / 3 || b2 <= 2) {
                    return true;
                }
                return false;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean S() {
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar == null) {
            return true;
        }
        try {
            int k2 = mVar.k();
            int n2 = this.ah.n();
            long a2 = this.ah.a(72, -1L);
            if (this.ah.b(157, -1) == 7 && this.v == 1 && this.w == 1 && k2 >= 1000 && n2 - k2 >= 1000 && a2 >= 500) {
                int b2 = this.ah.b(160, 100);
                long a3 = this.ah.a(152, -1L);
                int b3 = this.ah.b(153, -1);
                float b4 = this.ah.b(151);
                if (b4 > ((float) this.dy)) {
                    b4 /= 2.0f;
                }
                int i2 = this.dE;
                int i3 = (((int) b4) * i2) / (i2 + 1);
                if (a3 > -350 || b3 < (i3 * 2) / 3 || b2 <= 2) {
                    return true;
                }
                return false;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public final boolean p() {
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar == null) {
            int i2 = this.C;
            if (i2 == 2 || i2 == 5) {
                return true;
            }
            return false;
        } else if (mVar.a() || mVar.b() == 5) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean q() {
        if (d(0) || d(1) || d(3) || d(4)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static class h implements f.a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<aj> f152232a;

        static {
            Covode.recordClassIndex(101466);
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
            if (r1.equals("dash") == false) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
            if (r1.equals("mpd") == false) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
            if (r1.equals("hls") == false) goto L_0x0029;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
        @Override // com.ss.ttvideoengine.j.f.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.h.a():void");
        }

        public h(aj ajVar) {
            this.f152232a = new WeakReference<>(ajVar);
        }

        @Override // com.ss.ttvideoengine.j.f.a
        public final void a(com.ss.ttvideoengine.s.c cVar) {
            aj ajVar = this.f152232a.get();
            if (ajVar != null && cVar != null) {
                ajVar.a(cVar);
            }
        }
    }

    private String aa() {
        String str;
        String str2;
        String str3;
        long j2;
        if (!this.aG && !this.aM && !this.aK) {
            if (this.fa) {
                return this.aD;
            }
            if (this.ad == null) {
                return null;
            }
            com.ss.ttvideoengine.j.o oVar = this.an;
            if (oVar != null) {
                str = oVar.b(26);
                j2 = this.an.c(12);
                str2 = this.an.b(5);
                str3 = this.an.b(15);
            } else {
                str = null;
                str2 = null;
                str3 = null;
                j2 = 0;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && j2 != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    return com.a.a("%s_%s_%s_%d_%s", new Object[]{this.B, str, str3, Long.valueOf(j2), com.ss.ttvideoengine.s.i.b(str2)});
                }
                return com.a.a("%s_%s_%s_%d", new Object[]{this.B, str, str3, Long.valueOf(j2)});
            }
        }
        return null;
    }

    private void af() {
        String str;
        String str2;
        com.ss.ttvideoengine.s.f fVar = this.bg;
        if (fVar != null) {
            fVar.c();
        }
        this.ae.o(this.aI);
        this.ae.q(this.aJ);
        if (this.hF == 0) {
            this.hF = System.currentTimeMillis();
            b.a.f152363a.b();
        }
        if (this.aG || this.fa || this.fp != null || this.bc != null) {
            n(this.B);
            if (this.aG) {
                str = this.eZ;
            } else {
                str = this.fb;
            }
            s(str);
            if (this.aG) {
                str2 = this.eZ;
            } else {
                str2 = this.fb;
            }
            b(str2, this.F);
        } else if (this.aK) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (this.aL.f153093f > 0 && currentTimeMillis - this.aL.f153093f > ((long) cG)) {
                ag();
            }
            s(this.aL.f153089b);
            n(this.aL.f153088a);
            b(this.aL.f153089b, this.F);
        } else if (this.aM) {
            n(this.B);
            s(this.aN.f152279a);
            b(this.aN.f152279a, this.F);
        } else if (this.fh) {
            n(this.B);
            c(this.ad);
        } else {
            n(this.B);
            ag();
        }
        if (this.ah != null && this.di != 0) {
            a(5, 0L);
        }
    }

    private void am() {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "resumed video, shouldplay:" + this.aV + ", mediaplayer:" + this.ah + ", prepared:" + this.r);
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar != null && this.aV) {
            mVar.q();
            if (this.r) {
                if ((this.v == 0 || this.bh) && !TextUtils.isEmpty(this.B) && !this.fh && this.ad != null && this.N != null) {
                    if (this.ch.b()) {
                        this.ch.b(411, 0, 0, this.ad);
                    } else {
                        this.N.a((com.ss.ttvideoengine.j.p) this.ad);
                    }
                }
                this.ah.a(100, this.aA);
                this.ah.f();
                m("_renderVideo");
                j(1);
                if (this.av) {
                    com.ss.ttvideoengine.s.f fVar = this.bg;
                    if (fVar != null) {
                        fVar.a();
                    }
                    i(1);
                }
                if (this.bU != null && this.bV > 0 && g(this.ad)) {
                    this.bU.start(ce, this.hG);
                    this.ae.N(1);
                    return;
                }
                return;
            }
            this.s = false;
        }
    }

    private void as() {
        MethodCollector.i(13944);
        com.ss.ttvideoengine.q.e eVar = e.c.f153200a;
        String str = this.B;
        com.ss.ttvideoengine.q.d dVar = eVar.q;
        if (!TextUtils.isEmpty(str)) {
            synchronized (dVar) {
                try {
                    dVar.f153181a.remove(str);
                } catch (Throwable th) {
                    MethodCollector.o(13944);
                    throw th;
                }
            }
        }
        d dVar2 = d.h.f152465a;
        String str2 = this.bl;
        if (!TextUtils.isEmpty(str2)) {
            try {
                dVar2.f152374i.lock();
                ArrayList<aj> arrayList = dVar2.f152373h.get(str2);
                if (arrayList != null) {
                    arrayList.remove(this);
                    com.ss.ttvideoengine.s.j.a("DataLoaderHelper", "remove engine ref,rawKey = " + str2 + " engine ref count: " + arrayList.size());
                    if (arrayList.size() == 0) {
                        dVar2.f152373h.remove(str2);
                    }
                }
                dVar2.f152374i.unlock();
            } catch (Throwable th2) {
                dVar2.f152374i.unlock();
                MethodCollector.o(13944);
                throw th2;
            }
        }
        if (this.bj != null) {
            for (int i2 = 0; i2 < this.bj.size(); i2++) {
                d.h.f152465a.m(this.bj.get(i2));
            }
        }
        G();
        this.ci.clear();
        MethodCollector.o(13944);
    }

    public final void D() {
        if (!this.av) {
            if (this.ae != null) {
                this.bJ = System.currentTimeMillis();
                this.aj = SystemClock.elapsedRealtime();
                com.ss.ttvideoengine.s.j.a("TTVideoEngine", "mRenderStartTime:" + this.aj + ", curT:" + this.bJ);
                this.ae.e();
            }
            ad();
            com.ss.ttvideoengine.h.j jVar = this.ae;
            if (jVar != null) {
                jVar.y();
            }
            this.av = true;
        }
        this.ae.a(com.ss.android.ugc.h.g.e().d(), 0);
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar != null) {
            this.cr = mVar.b(157, -1);
            this.cs = mVar.b(158, -1);
            this.ct = mVar.b(141, -1);
            this.iT = mVar.b(140, -1);
            this.cu = mVar.b(402, -1);
            this.cv = mVar.b(403, -1);
            this.iU = mVar.a(171, -1L);
            this.iV = mVar.b(151);
        }
    }

    /* access modifiers changed from: package-private */
    public final void F() {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "reset, this:".concat(String.valueOf(this)));
        this.aV = false;
        this.aX = false;
        this.r = false;
        this.be = false;
        this.hE = false;
        this.bN = 0.0f;
        this.bO = 0.0f;
        this.bP = 0;
        this.F.clear();
        c(true, 6);
        if (this.ah != null) {
            if (this.de == 1) {
                e((Surface) null);
            }
            if (this.fK == 1 && this.bu && this.bn != null) {
                com.ss.ttvideoengine.s.j.a("TTVideoEngine", "disable sr while _ShutdownOldSource = " + this.fK);
                a(0, -7880);
            }
            VideoSurface videoSurface = this.bn;
            if (videoSurface != null) {
                videoSurface.a(false);
            }
            this.ah.h();
            ae();
        }
        this.by.a();
        this.bq = false;
        this.av = false;
        this.aw = false;
        this.ax = false;
        this.cJ = false;
        this.gg = false;
        this.hC = 0;
        this.bT.a();
        this.ev = null;
        this.ew = null;
        this.gj = 0;
        this.aP = false;
        this.ae.q();
        this.fk = true;
        this.ay = true;
        this.au = false;
        this.cx = 0;
        this.ai = -1;
        this.aj = -1;
        this.ht = -1;
        this.gm = null;
        IABRModule iABRModule = this.bU;
        if (iABRModule != null) {
            iABRModule.release();
            this.bU = null;
        }
        this.jw = null;
        this.bF = false;
        this.ep = -1;
        this.bE = 0;
        this.am = 0;
        this.cC = 0;
    }

    public final bd H() {
        bd bdVar = new bd();
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar != null) {
            String c2 = mVar.c(516);
            if (!TextUtils.isEmpty(c2)) {
                if (c2.indexOf("mp4") > 0) {
                    bdVar.f152323a = "mp4";
                } else {
                    int indexOf = c2.indexOf(",");
                    if (indexOf < 0) {
                        bdVar.f152323a = c2;
                    } else {
                        bdVar.f152323a = c2.substring(0, indexOf);
                    }
                }
            }
            bdVar.f152324b = this.ah.a(171, 0L);
            bdVar.f152325c = this.ah.b(157, -1);
            bdVar.f152326d = this.ah.b(403, -1);
            bdVar.f152327e = this.ah.m();
            bdVar.f152328f = this.ah.l();
            bdVar.f152329g = this.ah.b(555, -1);
            bdVar.f152330h = this.ah.b(151);
            bdVar.f152331i = this.ah.b(158, -1);
            bdVar.f152332j = this.ah.b(402, -1);
            bdVar.f152333k = this.ah.b(553, -1);
            bdVar.f152334l = this.ah.b(554, -1);
        }
        return bdVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r4.ab != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        if (r4.ab == null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O() {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.O():void");
    }

    public final void n() {
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "release,".concat(String.valueOf(this)));
        this.aX = true;
        if (this.ch.a(false)) {
            this.ch.a(4);
        } else {
            N();
        }
    }

    public final int s() {
        int i2 = this.A;
        int i3 = -1;
        if (i2 != 3) {
            if (this.au || i2 == 4) {
                i3 = this.az;
            }
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "state not correct return:" + this.A);
            return i3;
        }
        int i4 = this.v;
        if ((i4 != 1 && i4 != 2 && !this.r) || this.aX) {
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "playbackstate not correct return:" + this.v);
            return -1;
        } else if (this.aB) {
            int i5 = this.x;
            if (i5 > 0) {
                return i5;
            }
            return -1;
        } else if (this.iY || !this.ch.a(true)) {
            return P();
        } else {
            if (!this.ch.a(151, this.jd, (Object) null)) {
                return -1;
            }
            this.ch.f152266d.setDataPosition(0);
            return this.ch.f152266d.readInt();
        }
    }

    /* access modifiers changed from: package-private */
    public final void z() {
        this.aG = false;
        this.fa = false;
        this.aK = false;
        this.aM = false;
        this.fh = false;
        com.ss.ttm.player.m mVar = this.ah;
        if (mVar != null && mVar.b() == 0) {
            this.ah.d();
            this.ah = null;
        }
        F();
        ap();
        aw();
        this.A = 0;
        this.an = null;
        this.eD = null;
        this.eE = null;
        this.ad = null;
        this.fb = null;
        this.eZ = null;
        this.B = null;
        this.fp = null;
        this.fb = null;
        this.bp = false;
        this.br = false;
        this.av = false;
        this.aw = false;
        this.ax = false;
        this.bg.d();
        this.bh = false;
        this.bs = false;
        this.hF = 0;
        this.aB = false;
        this.bI = 0;
        this.aQ = false;
        this.eI.clear();
        this.cp = -1;
        this.cr = -1;
        this.cs = -1;
        this.ct = -1;
        this.iT = -1;
        this.cu = -1;
        this.cv = -1;
        this.iU = -1;
        this.iV = 0.0f;
        this.fE = null;
        this.cT = false;
        this.cS = false;
        this.I = null;
        this.as = false;
        com.ss.ttvideoengine.h.j jVar = this.ae;
        if (jVar != null) {
            jVar.Q(63);
        }
        this.cl.clear();
    }

    private void ad() {
        com.ss.ttm.player.m mVar = this.ah;
        if (this.ae != null && mVar != null && !this.av) {
            long a2 = mVar.a(68, 0L);
            this.ae.a(a2, 1);
            this.ae.a(mVar.a(69, 0L));
            this.ae.b(mVar.a(70, 0L));
            this.ae.c(mVar.a(267, 0L));
            this.ae.d(mVar.a(268, 0L));
            this.ae.e(mVar.a(269, 0L));
            this.ae.f(mVar.a(75, 0L));
            this.ae.h(mVar.a(76, 0L));
            this.ae.g(mVar.a(77, 0L));
            this.ae.i(mVar.a(78, 0L));
            this.ae.n(mVar.c(71));
            this.ae.a(1, mVar.a(156, -1L));
            this.ae.a(0, mVar.a(155, -1L));
            this.ae.b(1, mVar.a(163, -1L));
            this.ae.b(0, mVar.a(162, -1L));
            long a3 = mVar.a(210, 0L);
            this.ae.j(a3);
            if (a2 > 0) {
                this.ae.o(a2);
            }
            long a4 = mVar.a(622, 0L);
            if (a4 > 0) {
                this.ae.b(a4, 1);
            }
            long a5 = mVar.a(623, 0L);
            if (a5 > 0) {
                this.ae.c(66, a5);
            }
            this.ae.c(67, mVar.a(620, 0L));
            this.ae.c(68, mVar.a(624, 0L));
            this.ae.c(78, mVar.a(621, 0L));
            this.ae.c(69, mVar.a(625, 0L));
            this.ae.c(70, mVar.a(626, 0L));
            this.ae.c(71, mVar.a(627, 0L));
            this.ae.c(72, mVar.a(629, 0L));
            this.ae.c(73, mVar.a(631, 0L));
            this.ae.c(74, mVar.a(630, 0L));
            this.ae.c(75, mVar.a(632, 0L));
            this.ae.c(76, a3);
            this.ae.c(77, mVar.a(628, 0L));
            this.ae.c(87, mVar.a(822, 0L));
            this.ae.c(88, mVar.a(307, 0L));
        }
    }

    private void ag() {
        String str;
        bg.a a2;
        Handler handler;
        this.A = 1;
        ap();
        String A2 = A();
        if (this.fB) {
            A2 = com.ss.ttvideoengine.s.i.c(A2);
        }
        String a3 = com.ss.ttvideoengine.s.l.a(A2);
        this.aq = a3;
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("start to fetch video info:%s", new Object[]{a3}));
        if (this.fu != null && !TextUtils.isEmpty(this.B) && this.fv) {
            boolean b2 = com.ss.ttvideoengine.k.h.b(this.aa);
            if ((this.aO <= 1 || !b2) && (a2 = this.fu.a(this.B, this.aq)) != null && (!a2.f152349c || (!b2 && d.h.f152465a.c() && this.bf > 0))) {
                com.ss.ttvideoengine.s.j.a("TTVideoEngine", "using videomodel cache");
                this.ae.L(1);
                com.ss.ttvideoengine.j.p pVar = a2.f152347a;
                this.ad = pVar;
                d(pVar);
                if (this.N != null) {
                    if (!this.ch.b()) {
                        com.ss.ttvideoengine.j.e eVar = this.ad;
                        if ((eVar instanceof com.ss.ttvideoengine.j.p) && this.N.a((com.ss.ttvideoengine.j.p) eVar)) {
                            return;
                        }
                    } else if (this.u) {
                        this.ch.a(this.ad);
                        this.ch.f152269g.setDataPosition(0);
                        if (this.ch.f152269g.readInt() == 1) {
                            return;
                        }
                    } else {
                        this.ch.b(411, 0, 0, this.ad);
                    }
                }
                if (this.gb && (handler = this.bC) != null) {
                    try {
                        handler.post(new al(this));
                        return;
                    } catch (Exception e2) {
                        com.ss.ttvideoengine.s.j.e("TTVideoEngine", e2.toString());
                    }
                }
                c(this.ad);
                return;
            }
        }
        if (this.fv) {
            this.ae.L(0);
        }
        this.be = true;
        com.ss.ttvideoengine.f.e eVar2 = new com.ss.ttvideoengine.f.e(this.aa, h(), this.aI);
        this.ag = eVar2;
        eVar2.f152549g = this.B;
        this.ag.a(this.fv);
        this.ag.f152545c = this.es;
        if (this.ex.booleanValue() && this.ew != null) {
            this.ag.a(this.ex);
        }
        this.ag.f152547e = new j(this);
        com.ss.ttvideoengine.f.e eVar3 = this.ag;
        String str2 = this.aq;
        int i2 = this.n;
        if (i2 == 2 || i2 == 4) {
            str = null;
        } else {
            str = this.o;
        }
        eVar3.a(str2, str, i2, this.ev);
        this.ag.f152548f = this.fA;
    }

    private void ai() {
        com.ss.ttvideoengine.j.e eVar;
        JSONArray b2;
        boolean z2;
        int a2 = com.ss.ttvideoengine.o.a.a().a("config_hardware_type", 0);
        this.ae.c(95, a2);
        if (a2 > 0) {
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "settings hardware config ".concat(String.valueOf(a2)));
            if (a2 == com.ss.ttvideoengine.o.a.f153134g) {
                com.ss.ttvideoengine.j.e eVar2 = this.ad;
                if (eVar2 != null) {
                    String b3 = eVar2.b(223);
                    if (!TextUtils.isEmpty(b3) && b3.equals("hw")) {
                        this.de = 1;
                    }
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "using videoModel hardware: " + this.de);
                }
            } else if (a2 == com.ss.ttvideoengine.o.a.f153135h) {
                com.ss.ttvideoengine.o.a a3 = com.ss.ttvideoengine.o.a.a();
                if (a3.f153139l != 0 && (b2 = a3.f153136i.f46195c.get("vod").b("hw_nin_tags")) != null && this.aI != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= b2.length()) {
                            break;
                        } else if (this.aI.equals(b2.optString(i2))) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "using settings hardware: " + this.de + ", async = " + this.cY + ", ninTag = " + z2);
                }
                z2 = false;
                if (com.ss.ttvideoengine.o.a.a().a("hardware_decode_priority", 0) == 0 || !this.cQ) {
                    int a4 = com.ss.ttvideoengine.o.a.a().a("hardware_decode", 0);
                    this.ae.a("st_hw", Integer.valueOf(a4));
                    this.de = a4;
                    if (this.ad != null) {
                        this.cY = com.ss.ttvideoengine.o.a.a().a("hardware_async_init", 1);
                    }
                }
                com.ss.ttvideoengine.s.j.a("TTVideoEngine", "using settings hardware: " + this.de + ", async = " + this.cY + ", ninTag = " + z2);
            }
        } else if ((!this.cQ || this.cR) && (eVar = this.ad) != null) {
            String b4 = eVar.b(223);
            if (!TextUtils.isEmpty(b4) && b4.equals("hw")) {
                this.de = 1;
            }
        }
        if (this.ah.b() != 1 && this.ah.b() != 2 && this.ah.b() != 5) {
            this.de = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final String A() {
        int i2;
        if (!TextUtils.isEmpty(this.ew)) {
            try {
                i2 = JniUtils.b();
            } catch (Exception unused) {
                i2 = 0;
            }
            StringBuilder sb = new StringBuilder(this.ew);
            sb.append(com.a.a("&method=%d", new Object[]{Integer.valueOf(i2)}));
            if (!TextUtils.isEmpty(this.jw)) {
                sb.append(com.a.a("&%s=%s", new Object[]{"force_codec", this.jw}));
            }
            String sb2 = sb.toString();
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("api string from fallback api:%s", new Object[]{sb2}));
            return sb2;
        } else if (this.H == null) {
            return null;
        } else {
            HashMap hashMap = new HashMap();
            boolean s2 = m.s();
            String a2 = com.ss.ttm.player.r.a(14, "");
            if (s2) {
                if (this.f152212l) {
                    hashMap.put("format_type", "dash");
                }
                if (this.cK.equals("bytevc2")) {
                    hashMap.put("codec_type", "4");
                } else if (this.cK.equals("bytevc1")) {
                    hashMap.put("codec_type", "3");
                }
            } else {
                this.de = 0;
            }
            if (this.C == 2 && this.eR == 2) {
                hashMap.put("format_type", "mpd");
            }
            if (this.gf || this.gg) {
                this.cJ = true;
                hashMap.put("ssl", "1");
            } else {
                this.cJ = false;
            }
            hashMap.put("player_version", a2);
            if (this.iN > 1) {
                hashMap.put("barragemask", "1");
            }
            hashMap.put("cdn_type", String.valueOf(this.di));
            int c2 = ag.a.a().c();
            if (c2 != -1) {
                hashMap.put("network_score", String.valueOf(c2));
            }
            if (!TextUtils.isEmpty(this.jw)) {
                hashMap.put("force_codec", this.jw);
            }
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", hashMap.toString());
            String a3 = this.H.a(hashMap);
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "api string from apiForFetcher:".concat(String.valueOf(a3)));
            return a3;
        }
    }

    public final void B() {
        int i2;
        int i3;
        String str;
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "start to render,this:".concat(String.valueOf(this)));
        if (this.aV) {
            i(1);
        }
        D();
        com.ss.ttvideoengine.j.e eVar = this.ad;
        if (eVar == null || eVar.c() == null || this.co <= 0) {
            i2 = 0;
        } else {
            i2 = this.ad.c().size();
            com.ss.ttvideoengine.s.j.b("TTVideoEngine", "subtitle num:".concat(String.valueOf(i2)));
        }
        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "_setup subtitle info in");
        if (this.co > 0) {
            ab abVar = this.I;
            if (abVar != null) {
                String abVar2 = abVar.toString();
                if (abVar2 != null && abVar2.length() > 0 && this.I.a() > 0) {
                    com.ss.ttvideoengine.h.j jVar = this.ae;
                    if (jVar != null) {
                        jVar.c(i2);
                    }
                    com.ss.ttvideoengine.s.j.b("TTVideoEngine", "using subtitle description info for setup subtitle");
                    k(abVar2);
                }
            } else if (!this.aw && i2 > 0) {
                com.ss.ttvideoengine.h.j jVar2 = this.ae;
                if (jVar2 != null) {
                    jVar2.c(i2);
                }
                com.ss.ttvideoengine.s.j.b("TTVideoEngine", "start fetch subtitle info");
                if (this.ad == null || this.an == null) {
                    str = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    String b2 = this.an.b(28);
                    if (b2 == null) {
                        b2 = "";
                    }
                    if (!TextUtils.isEmpty(this.fg)) {
                        if (this.fg.startsWith("http://") || this.fg.startsWith("https://")) {
                            sb.append(com.a.a("%s/video/subtitle/v1/%s/%s?", new Object[]{this.fg, this.B, b2}));
                        } else {
                            sb.append(com.a.a("https://%s/video/subtitle/v1/%s/%s?", new Object[]{this.fg, this.B, b2}));
                        }
                        if (!TextUtils.isEmpty(this.fe)) {
                            sb.append(com.a.a("sub_ids=%s", new Object[]{this.fe}));
                        }
                        if (!TextUtils.isEmpty(this.ff)) {
                            if (!TextUtils.isEmpty(this.fe)) {
                                sb.append("&");
                            }
                            sb.append(com.a.a("format=%s", new Object[]{this.ff}));
                        }
                    }
                    str = sb.toString();
                }
                if (this.fB) {
                    str = com.ss.ttvideoengine.s.i.c(str);
                }
                String a2 = com.ss.ttvideoengine.s.l.a(str);
                com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("start to fetch sub info:%s", new Object[]{a2}));
                com.ss.ttvideoengine.h.j jVar3 = this.ae;
                if (jVar3 != null) {
                    jVar3.a(a2);
                }
                com.ss.ttvideoengine.f.d dVar = new com.ss.ttvideoengine.f.d(this.aa, h());
                this.eA = dVar;
                dVar.f152538d = new u(this);
                com.ss.ttvideoengine.f.d dVar2 = this.eA;
                dVar2.f152537c = a2;
                if (TextUtils.isEmpty(dVar2.f152537c)) {
                    dVar2.a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainSubFetchingInfo", -9930, "sub ApiString empty"));
                } else {
                    dVar2.f152539e.a(dVar2.f152537c, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02c2: INVOKE  
                          (wrap: com.ss.ttvideoengine.k.k : 0x02bb: IGET  (r1v18 com.ss.ttvideoengine.k.k) = (r7v0 'dVar2' com.ss.ttvideoengine.f.d) com.ss.ttvideoengine.f.d.e com.ss.ttvideoengine.k.k)
                          (wrap: java.lang.String : 0x02b9: IGET  (r2v9 java.lang.String) = (r7v0 'dVar2' com.ss.ttvideoengine.f.d) com.ss.ttvideoengine.f.d.c java.lang.String)
                          (wrap: com.ss.ttvideoengine.f.d$1 : 0x02bf: CONSTRUCTOR  (r0v83 com.ss.ttvideoengine.f.d$1) = (r7v0 'dVar2' com.ss.ttvideoengine.f.d) call: com.ss.ttvideoengine.f.d.1.<init>(com.ss.ttvideoengine.f.d):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.ss.ttvideoengine.k.k.a(java.lang.String, com.ss.ttvideoengine.k.k$a):void in method: com.ss.ttvideoengine.aj.B():void, file: classes4.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02bf: CONSTRUCTOR  (r0v83 com.ss.ttvideoengine.f.d$1) = (r7v0 'dVar2' com.ss.ttvideoengine.f.d) call: com.ss.ttvideoengine.f.d.1.<init>(com.ss.ttvideoengine.f.d):void type: CONSTRUCTOR in method: com.ss.ttvideoengine.aj.B():void, file: classes4.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 31 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.ttvideoengine.f.d, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 37 more
                        */
                    /*
                    // Method dump skipped, instructions count: 738
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.B():void");
                }

                public final void y() {
                    com.ss.ttm.player.m mVar = this.ah;
                    com.ss.ttvideoengine.h.j jVar = this.ae;
                    if (jVar != null) {
                        if (mVar != null) {
                            jVar.a(mVar.b(150));
                            this.ae.b(mVar.b(151));
                            this.ae.y(mVar.b(186, -1));
                            this.ae.l(mVar.a(152, -1L));
                            this.ae.B(mVar.b(153, -1));
                            this.ae.A(mVar.b(189, -1));
                            this.ae.D(mVar.b(221, -1));
                            this.ae.E(mVar.b(222, -1));
                            this.ae.F(mVar.b(245, -1));
                            if (this.de > 0) {
                                this.ae.t(mVar.c(187));
                                this.ae.z(mVar.b(188, -1));
                            }
                            if (this.v != 0) {
                                this.ae.n(mVar.a(73, -1L));
                                this.ae.m(mVar.a(72, -1L));
                            }
                            this.ae.z(this.fI);
                            this.ae.c(21, mVar.a(171, -1L));
                            this.ae.c(56, mVar.a(468, -1L));
                            this.ae.c(82, mVar.a(850, 0L));
                            this.ae.c(84, mVar.a(851, 0L));
                            this.ae.c(85, mVar.a(852, 0L));
                            int b2 = mVar.b(62, -100);
                            int b3 = mVar.b(61, -100);
                            if (b2 == 0) {
                                this.ae.c(12, 1);
                            } else {
                                this.ae.c(12, 0);
                            }
                            if (b3 == 0) {
                                this.ae.c(13, 1);
                            } else {
                                this.ae.c(13, 0);
                            }
                            this.ae.c(89, mVar.b(912, -1));
                            ad();
                            HashMap hashMap = new HashMap();
                            hashMap.put("abrv", this.bQ);
                            if (com.ss.ttvideoengine.q.c.f153180b != null) {
                                this.hB = com.ss.ttvideoengine.q.c.f153180b.getVersion();
                            }
                            hashMap.put("netv", this.hB);
                            hashMap.put("used", Integer.valueOf(this.hE ? 1 : 0));
                            hashMap.put("pcnt", Integer.valueOf(mVar.b(179, 0)));
                            hashMap.put("scnt", Integer.valueOf(mVar.b(173, 0)));
                            hashMap.put("apbr", Integer.valueOf(mVar.b(174, 0)));
                            hashMap.put("apsp", Float.valueOf(mVar.b(175)));
                            hashMap.put("adbr", Integer.valueOf(mVar.b(610, 0)));
                            hashMap.put("npad", Float.valueOf(this.bN));
                            hashMap.put("npap", Float.valueOf(this.bO));
                            hashMap.put("adob", Integer.valueOf(mVar.b(615, 0)));
                            hashMap.put("aplb", Integer.valueOf(mVar.b(614, 0)));
                            hashMap.put("avbl", Float.valueOf(mVar.b(616)));
                            hashMap.put("iast", Integer.valueOf(this.bW));
                            hashMap.put("acsm", Integer.valueOf(ABRConfig.getSwitchModel()));
                            hashMap.put("stbr", Long.valueOf(this.ht));
                            hashMap.put("uebr", Long.valueOf(this.hu));
                            hashMap.put("stre", this.bR);
                            hashMap.put("dgbt", Long.valueOf(this.hv));
                            this.ae.a(hashMap);
                            if (this.hE || this.bW > 0) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("adtp", Integer.valueOf(ce));
                                hashMap2.put("sptp", Integer.valueOf(cd));
                                hashMap2.put("astp", Integer.valueOf(ABRConfig.getStartupModel()));
                                hashMap2.put("mcbr", Long.valueOf(this.hw));
                                hashMap2.put("stsp", Float.valueOf(this.hy));
                                hashMap2.put("spsp", Float.valueOf(this.hz));
                                hashMap2.put("sasp", Float.valueOf(this.hA));
                                hashMap2.put("stfs", Long.valueOf(this.hx));
                                ArrayList arrayList = new ArrayList();
                                com.ss.ttvideoengine.j.e eVar = this.ad;
                                if (eVar != null) {
                                    List<com.ss.ttvideoengine.j.o> b4 = eVar.b();
                                    if (b4 == null) {
                                        b4 = Collections.emptyList();
                                    }
                                    for (com.ss.ttvideoengine.j.o oVar : b4) {
                                        if (oVar != null) {
                                            HashMap hashMap3 = new HashMap();
                                            hashMap3.put("br", Integer.valueOf(oVar.a(3)));
                                            String b5 = oVar.b(32);
                                            if (!TextUtils.isEmpty(b5)) {
                                                hashMap3.put("def", b5);
                                            } else {
                                                hashMap3.put("def", d(oVar.c()));
                                            }
                                            arrayList.add(hashMap3);
                                        }
                                    }
                                }
                                if (arrayList.size() > 0) {
                                    hashMap2.put("brs", arrayList.toArray());
                                }
                                this.ae.b(hashMap2);
                            }
                        }
                        this.ae.c(11, this.bD);
                        this.ae.c(79, b() ? 1 : 0);
                        this.ae.c(80, this.iJ);
                        this.ae.c(81, this.iK);
                    }
                }

                /* access modifiers changed from: package-private */
                public final void c() {
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "[SRLog]setupTextureRender");
                    int i2 = 0;
                    if (this.cC != 0) {
                        this.ae.v(0);
                    }
                    this.cC = 0;
                    com.ss.ttvideoengine.h.j jVar = this.ae;
                    if (jVar != null) {
                        jVar.R(this.fF);
                    }
                    this.fH = com.ss.texturerender.m.a();
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "get texture renderer start");
                    com.ss.texturerender.m mVar = this.fH;
                    if (mVar == null) {
                        this.fF = 0;
                        com.ss.ttvideoengine.s.j.e("TTVideoEngine", "couldn't get rendererManager");
                        return;
                    }
                    Context context = this.aa;
                    if (context != null) {
                        Context applicationContext = context.getApplicationContext();
                        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                        }
                        mVar.f151841d = applicationContext;
                    }
                    if (fJ == null) {
                        v vVar = new v((byte) 0);
                        fJ = vVar;
                        com.ss.texturerender.l.a(vVar);
                    }
                    boolean z2 = this.bv;
                    this.bu = z2;
                    if (!this.fX.isEmpty() || !z2 || !this.bx || this.fH.c()) {
                        this.bx = false;
                        if (this.fH.c() && (this.bv || this.bu)) {
                            this.bu = true;
                            z2 = true;
                        }
                        VideoSurface e2 = e(z2);
                        if (e2 == null) {
                            this.fF = 0;
                            this.fI = this.fH.f151840c;
                            com.ss.ttvideoengine.s.j.e("TTVideoEngine", "genOffscreenSurface failed = " + this.fI);
                            return;
                        }
                        e2.b(this.bw);
                        e2.f151768b = new VideoSurface.a() {
                            /* class com.ss.ttvideoengine.aj.AnonymousClass1 */

                            /* renamed from: b  reason: collision with root package name */
                            private int f152215b;

                            static {
                                Covode.recordClassIndex(101456);
                            }

                            @Override // com.ss.texturerender.VideoSurface.a
                            public final void a() {
                                if (aj.this.bs) {
                                    aj.this.cx++;
                                    if (aj.this.bn != null) {
                                        int c2 = aj.this.bn.c(6, -1);
                                        if (this.f152215b != c2) {
                                            com.ss.ttvideoengine.s.j.b("TTVideoEngine", "[SRLog]using sr:" + c2 + " frameCount:" + aj.this.cx);
                                            this.f152215b = c2;
                                        }
                                        aj.this.by.a(c2, 0);
                                    }
                                }
                                if (!aj.this.bp && aj.this.bs) {
                                    com.ss.ttvideoengine.s.j.b("TTVideoEngine", "recive first frame render from texture");
                                    aj.this.bp = true;
                                }
                                if (aj.this.bq && !aj.this.br && aj.this.aV && aj.this.bo != 1) {
                                    com.ss.ttvideoengine.s.j.b("TTVideoEngine", "render start by texture, state =" + aj.this.v);
                                    aj.this.B();
                                }
                            }
                        };
                        e2.a(new ak(this));
                        e2.b(3, 1);
                        if (this.fT == 2) {
                            i2 = 1;
                        }
                        e2.b(2, i2);
                        while (!this.fX.isEmpty()) {
                            e2.a(this.fX.poll());
                        }
                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "get a surface = ".concat(String.valueOf(e2)));
                        this.bn = e2;
                        X();
                        return;
                    }
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "sr instance not exist, useSR:" + z2 + ", asyncInitSR:" + this.bx);
                    this.bv = false;
                }

                public final void a(com.ss.ttvideoengine.j.p pVar) {
                    a((com.ss.ttvideoengine.j.e) pVar);
                }

                public final void d(com.ss.ttvideoengine.j.e eVar) {
                    this.ae.b(eVar);
                }

                /* access modifiers changed from: package-private */
                public static class d implements IABRInfoListener {

                    /* renamed from: a  reason: collision with root package name */
                    private final WeakReference<aj> f152228a;

                    static {
                        Covode.recordClassIndex(101462);
                    }

                    public d(aj ajVar) {
                        this.f152228a = new WeakReference<>(ajVar);
                    }

                    @Override // com.bytedance.vcloud.abrmodule.IABRInfoListener
                    public final void onInfo(int i2, int i3) {
                        ABRResult predict;
                        int size;
                        int i4;
                        int i5;
                        int i6;
                        aj ajVar = this.f152228a.get();
                        if (ajVar != null && i2 == 1 && ajVar.bU != null && (predict = ajVar.bU.getPredict()) != null && (size = predict.size()) != 0) {
                            if (size > 0) {
                                ABRResultElement aBRResultElement = predict.get(0);
                                i5 = aBRResultElement.getMediaType();
                                i6 = (int) aBRResultElement.getBitrate();
                                i4 = aBRResultElement.getCacheTime();
                            } else {
                                i4 = 0;
                                i5 = 0;
                                i6 = 0;
                            }
                            com.ss.ttvideoengine.s.j.b("TTVideoEngine", com.a.a(Locale.ENGLISH, "[ABR] predict next segment bitrate:%dbps", new Object[]{Integer.valueOf(i6)}) + ", this:" + ajVar);
                            if (i6 != -1) {
                                if (ajVar.ch.b()) {
                                    ajVar.ch.b(600, i5, i6, null);
                                }
                                com.ss.ttm.player.m mVar = ajVar.ah;
                                long j2 = (long) i6;
                                if (ajVar.ak != j2) {
                                    if (mVar != null) {
                                        ajVar.ae.a(ajVar.ak, j2);
                                        ajVar.ak = j2;
                                    } else {
                                        return;
                                    }
                                } else if (mVar == null) {
                                    return;
                                }
                                if (ajVar.bX == 0) {
                                    if (i4 >= 0) {
                                        mVar.a(270, i4);
                                    }
                                    mVar.a(600, i6);
                                }
                            }
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                public static class e implements m.a {

                    /* renamed from: a  reason: collision with root package name */
                    private final WeakReference<aj> f152229a;

                    static {
                        Covode.recordClassIndex(101463);
                    }

                    public e(aj ajVar) {
                        this.f152229a = new WeakReference<>(ajVar);
                    }

                    @Override // com.ss.ttm.player.m.a
                    public final void a(int i2) {
                        aj ajVar = this.f152229a.get();
                        if (ajVar != null) {
                            if (ajVar.aG) {
                                i2 = 100;
                            }
                            ajVar.y = i2;
                            ajVar.a(2, (long) i2);
                            if (ajVar.ch.b()) {
                                ajVar.ch.b(403, i2, 0, null);
                                return;
                            }
                            if (ajVar.K != null) {
                                ajVar.K.c(ajVar, i2);
                            }
                            if (ajVar.J != null) {
                                ajVar.J.c(ajVar, i2);
                            }
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                public static class f implements m.b {

                    /* renamed from: a  reason: collision with root package name */
                    private final WeakReference<aj> f152230a;

                    static {
                        Covode.recordClassIndex(101464);
                    }

                    public f(aj ajVar) {
                        this.f152230a = new WeakReference<>(ajVar);
                    }

                    @Override // com.ss.ttm.player.m.b
                    public final void a(com.ss.ttm.player.m mVar) {
                        aj ajVar = this.f152230a.get();
                        if (ajVar != null) {
                            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "receive onCompletion,this:".concat(String.valueOf(ajVar)));
                            ajVar.ae.m();
                            if (!ajVar.D) {
                                ajVar.bh = true;
                                ajVar.i(0);
                                if (ajVar.bg != null) {
                                    ajVar.bg.b();
                                    ajVar.ae.J(ajVar.bg.f153268a.c());
                                }
                                if (ajVar.cq > 0) {
                                    ajVar.cp = ajVar.x;
                                }
                                ajVar.ae.x(ajVar.x);
                                ajVar.y();
                                ajVar.ae.w(3);
                                ajVar.av = false;
                                ajVar.aw = false;
                                ajVar.ai = -1;
                                ajVar.aj = -1;
                                ajVar.ax = false;
                                ajVar.au = false;
                                ajVar.i(false);
                                ajVar.az = 0;
                                ajVar.aP = false;
                                ajVar.t = false;
                                ajVar.aB = true;
                                ajVar.as = false;
                                ajVar.j(3);
                            } else {
                                ajVar.ae.n();
                            }
                            if (ajVar.ch.b()) {
                                ajVar.ch.b(408, 0, 0, null);
                            } else {
                                if (ajVar.K != null) {
                                    ajVar.K.d(ajVar);
                                }
                                if (ajVar.J != null) {
                                    ajVar.J.d(ajVar);
                                }
                            }
                            if (mVar.a()) {
                                ajVar.r = false;
                            }
                            ajVar.aA = 0;
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                public static class i implements m.c {

                    /* renamed from: a  reason: collision with root package name */
                    private final WeakReference<aj> f152233a;

                    static {
                        Covode.recordClassIndex(101467);
                    }

                    public i(aj ajVar) {
                        this.f152233a = new WeakReference<>(ajVar);
                    }

                    @Override // com.ss.ttm.player.m.c
                    public final boolean a(com.ss.ttm.player.m mVar, int i2, int i3) {
                        aj ajVar = this.f152233a.get();
                        if (ajVar == null) {
                            return false;
                        }
                        if (ajVar.bg != null) {
                            ajVar.bg.b();
                        }
                        ajVar.i(3);
                        ajVar.g(3, -1);
                        String c2 = mVar.c(5002);
                        String a2 = com.ss.ttvideoengine.s.c.a(mVar);
                        b.a.f152363a.a(i2);
                        if (!a2.equals("kTTVideoErrorDomainVideoOwnPlayer") || !ajVar.aQ) {
                            ajVar.aR = new com.ss.ttvideoengine.s.c(a2, i2, i3, c2);
                            ajVar.a(ajVar.aR);
                            return true;
                        }
                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "retrying, not handle error: " + i2 + ", i1:" + i3);
                        return true;
                    }
                }

                /* access modifiers changed from: package-private */
                public static class j implements e.a {

                    /* renamed from: a  reason: collision with root package name */
                    private final WeakReference<aj> f152234a;

                    static {
                        Covode.recordClassIndex(101468);
                    }

                    public j(aj ajVar) {
                        this.f152234a = new WeakReference<>(ajVar);
                    }

                    @Override // com.ss.ttvideoengine.f.e.a
                    public final void a(String str) {
                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "fetcher cancelled");
                        aj ajVar = this.f152234a.get();
                        if (ajVar != null) {
                            ajVar.ae.x(str);
                        }
                    }

                    @Override // com.ss.ttvideoengine.f.e.a
                    public final void a(com.ss.ttvideoengine.s.c cVar) {
                        if (cVar != null) {
                            com.ss.ttvideoengine.s.j.e("TTVideoEngine", com.a.a("fetcher should retry, error:%s", new Object[]{cVar.toString()}));
                            aj ajVar = this.f152234a.get();
                            if (ajVar != null) {
                                ajVar.ae.a(cVar, ajVar.n);
                            }
                        }
                    }

                    @Override // com.ss.ttvideoengine.f.e.a
                    public final void a(int i2, String str) {
                        aj ajVar = this.f152234a.get();
                        if (ajVar != null) {
                            com.ss.ttvideoengine.s.j.e("TTVideoEngine", com.a.a("video status exception:%d", new Object[]{Integer.valueOf(i2)}));
                            ajVar.be = false;
                            if (ajVar.ae != null) {
                                ajVar.ae.c(i2, str);
                            }
                            if (ajVar.ch.b()) {
                                ajVar.ch.b(410, i2, 0, null);
                                return;
                            }
                            if (ajVar.K != null) {
                                ajVar.K.a(i2);
                            }
                            if (ajVar.J != null) {
                                ajVar.J.a(i2);
                            }
                        }
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
                        if (r4.ch.f152269g.readInt() == 1) goto L_0x0091;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
                        if (r4.N.a(r7) != false) goto L_0x0091;
                     */
                    @Override // com.ss.ttvideoengine.f.e.a
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void a(com.ss.ttvideoengine.j.p r7, com.ss.ttvideoengine.s.c r8) {
                        /*
                        // Method dump skipped, instructions count: 178
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.j.a(com.ss.ttvideoengine.j.p, com.ss.ttvideoengine.s.c):void");
                    }
                }

                /* access modifiers changed from: package-private */
                public static class k implements com.ss.ttm.player.f {

                    /* renamed from: a  reason: collision with root package name */
                    private final WeakReference<aj> f152235a;

                    static {
                        Covode.recordClassIndex(101469);
                    }

                    private k(aj ajVar) {
                        this.f152235a = new WeakReference<>(ajVar);
                    }

                    /* synthetic */ k(aj ajVar, byte b2) {
                        this(ajVar);
                    }

                    @Override // com.ss.ttm.player.f
                    public final void a(long j2, long j3, Map<Integer, String> map) {
                        aj ajVar = this.f152235a.get();
                        if (ajVar != null && ajVar.bn != null) {
                            VideoSurface videoSurface = ajVar.bn;
                            if (videoSurface.f151767a != null) {
                                videoSurface.f151767a.frameMetaCallback(j2, j3, map);
                            }
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                public static class l implements m.e {

                    /* renamed from: a  reason: collision with root package name */
                    private final WeakReference<aj> f152236a;

                    static {
                        Covode.recordClassIndex(101470);
                    }

                    public l(aj ajVar) {
                        this.f152236a = new WeakReference<>(ajVar);
                    }

                    @Override // com.ss.ttm.player.m.e
                    public final boolean a(com.ss.ttm.player.m mVar, int i2, int i3) {
                        aj ajVar = this.f152236a.get();
                        if (ajVar == null) {
                            return false;
                        }
                        if (i2 == 3) {
                            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "player callback render start");
                            if (!(ajVar.z == 0 || ajVar.ah == null || ajVar.X == null)) {
                                o oVar = ajVar.X;
                                ajVar.ah.b(139, -1);
                                oVar.c(ajVar.ah.a(155, -1L), ajVar.ah.a(162, -1L));
                            }
                            if (ajVar.bo == 1) {
                                ajVar.bq = true;
                                ajVar.B();
                                if (!(ajVar.bn == null || ajVar.ab == null || ajVar.ac != null)) {
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    mVar.a(ajVar.bn);
                                    ajVar.bn.a(ajVar.ab);
                                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "renderstart change to texturesurface,time:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                                }
                            } else if (ajVar.bn == null) {
                                com.ss.ttvideoengine.s.j.a("TTVideoEngine", "render start by player");
                                ajVar.B();
                            } else {
                                ajVar.bq = true;
                                if (ajVar.bp) {
                                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "render start by player after texture");
                                    ajVar.B();
                                }
                            }
                            if (!ajVar.q()) {
                                ajVar.h(0);
                            }
                            if (ajVar.cC != 0) {
                                ajVar.ae.u(0);
                            }
                        } else if (i2 == 4) {
                            ajVar.D();
                        } else if (i2 == 701) {
                            ajVar.f(i3);
                        } else if (i2 != 702) {
                            switch (i2) {
                                case -268435438:
                                    ajVar.cp = i3;
                                    ajVar.k(i3);
                                    break;
                                case -268435436:
                                    if (ajVar.J != null) {
                                        ajVar.J.c(i3);
                                        break;
                                    }
                                    break;
                                case -268435392:
                                    if (ajVar.ae != null) {
                                        ajVar.ae.d(i3);
                                        break;
                                    }
                                    break;
                                case -268435390:
                                    if (!ajVar.ch.b()) {
                                        if (ajVar.J != null) {
                                            ajVar.J.e(ajVar);
                                            break;
                                        }
                                    } else {
                                        ajVar.ch.b(419, i2, 0, null);
                                        break;
                                    }
                                    break;
                                case 801:
                                    ajVar.j(false);
                                    break;
                                case 251658244:
                                    ajVar.h(i3);
                                    break;
                                case 251658252:
                                    ajVar.C();
                                    break;
                                default:
                                    switch (i2) {
                                        case -268435408:
                                            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "preBuffering start,this:" + ajVar + ", code:" + i3);
                                            if (ajVar.ae != null) {
                                                ajVar.ae.q(i3);
                                                break;
                                            }
                                            break;
                                        case -268435407:
                                            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "av outsync start:".concat(String.valueOf(i3)));
                                            ajVar.ae.s(i3);
                                            break;
                                        case -268435406:
                                            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "av outsync end:".concat(String.valueOf(i3)));
                                            ajVar.ae.t(i3);
                                            break;
                                        case -268435405:
                                            if (!(ajVar.z == 0 || ajVar.X == null || ajVar.ah == null)) {
                                                o oVar2 = ajVar.X;
                                                ajVar.H();
                                                oVar2.a(ajVar.ah.a(621, 0L), ajVar.ah.a(625, 0L));
                                                break;
                                            }
                                        case -268435404:
                                            if (!(ajVar.ah == null || ajVar.z == 0)) {
                                                if (i3 != 0) {
                                                    if (i3 == 1 && ajVar.X != null) {
                                                        o oVar3 = ajVar.X;
                                                        ajVar.ah.b(158, -1);
                                                        oVar3.d(ajVar.ah.a(631, -1L), ajVar.ah.a(632, -1L));
                                                        break;
                                                    }
                                                } else if (ajVar.X != null) {
                                                    o oVar4 = ajVar.X;
                                                    ajVar.ah.b(157, -1);
                                                    oVar4.b(ajVar.ah.a(629, -1L), ajVar.ah.a(630, -1L));
                                                    ajVar.X.a(ajVar.ah.a(77, -1L));
                                                    break;
                                                }
                                            }
                                            break;
                                        case -268435403:
                                            ajVar.ae.u(i3);
                                            break;
                                        case -268435402:
                                            ajVar.ae.v(i3);
                                            break;
                                        case -268435401:
                                            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "starttime is bigger than video duration:".concat(String.valueOf(i3)));
                                            ajVar.bF = true;
                                            break;
                                        default:
                                            switch (i2) {
                                                case 251658248:
                                                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("render seek complete:%d", new Object[]{Integer.valueOf(i3)}));
                                                    if (ajVar.ae != null) {
                                                        ajVar.ae.p(i3);
                                                        ajVar.ae.e();
                                                    }
                                                    if (ajVar.as) {
                                                        ajVar.as = false;
                                                        ajVar.at = 0;
                                                        if (ajVar.ae != null) {
                                                            ajVar.ae.h();
                                                            ajVar.ae.e();
                                                        }
                                                    }
                                                    if (ajVar.O != null) {
                                                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "render seek complete call back ".concat(String.valueOf(i3)));
                                                        ba baVar = new ba();
                                                        baVar.f152316a = "renderSeekComplete";
                                                        baVar.f152318c = Integer.valueOf(i3);
                                                        if (!ajVar.ch.b()) {
                                                            ajVar.O.a(baVar);
                                                            break;
                                                        } else {
                                                            ajVar.ch.b(412, 0, 0, baVar);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case 251658249:
                                                    ajVar.e(i3);
                                                    break;
                                            }
                                    }
                                    break;
                            }
                        } else {
                            ajVar.g(i3);
                        }
                        return false;
                    }
                }

                /* access modifiers changed from: package-private */
                public static class n implements m.k {

                    /* renamed from: a  reason: collision with root package name */
                    private final WeakReference<aj> f152238a;

                    static {
                        Covode.recordClassIndex(101472);
                    }

                    public n(aj ajVar) {
                        this.f152238a = new WeakReference<>(ajVar);
                    }

                    @Override // com.ss.ttm.player.m.k
                    public final void a(int i2, int i3) {
                        aj ajVar = this.f152238a.get();
                        if (ajVar != null) {
                            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "onSARChanged = " + i2 + ", " + i3);
                            if (ajVar.ch.b()) {
                                ajVar.ch.b(418, i2, i3, null);
                            }
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                public static class o implements m.j {

                    /* renamed from: a  reason: collision with root package name */
                    private final WeakReference<aj> f152239a;

                    static {
                        Covode.recordClassIndex(101473);
                    }

                    public o(aj ajVar) {
                        this.f152239a = new WeakReference<>(ajVar);
                    }

                    @Override // com.ss.ttm.player.m.j
                    public final void a(com.ss.ttm.player.m mVar, int i2, int i3) {
                        int i4;
                        boolean z;
                        aj ajVar = this.f152239a.get();
                        if (ajVar != null) {
                            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "[SRLog]video size changed = " + i2 + ", " + i3);
                            com.ss.ttvideoengine.r.d dVar = new com.ss.ttvideoengine.r.d();
                            dVar.s = Integer.valueOf(i2);
                            dVar.t = Integer.valueOf(i3);
                            ajVar.by.a(dVar);
                            if (ajVar.bn != null) {
                                ajVar.bn.a(i2, i3);
                                if (ajVar.bu && !ajVar.bw) {
                                    VideoSurface videoSurface = ajVar.bn;
                                    if (videoSurface.f151767a == null || !videoSurface.f151767a.supportProcessResolution(i2, i3)) {
                                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "VideoSurface resolution not support for sr");
                                        ajVar.a(0, -7891);
                                    }
                                }
                            }
                            int b2 = mVar.b(912, -1);
                            com.ss.ttvideoengine.s.j.b("TTVideoEngine", "colorTrc ".concat(String.valueOf(b2)));
                            if (b2 == 16) {
                                i4 = 1;
                            } else if (b2 == 18) {
                                i4 = 2;
                            } else {
                                i4 = 0;
                            }
                            if (ajVar.bn != null) {
                                VideoSurface videoSurface2 = ajVar.bn;
                                if (ajVar.bz == 1) {
                                    if (i4 == 1 || i4 == 2) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (videoSurface2 != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("effect_type", 4);
                                        if (z) {
                                            bundle.putInt("action", 21);
                                            bundle.putInt("hdr_type", i4);
                                            bundle.putInt("use_effect", 1);
                                        } else {
                                            bundle.putInt("action", 19);
                                            bundle.putInt("use_effect", 0);
                                        }
                                        videoSurface2.a(bundle);
                                    }
                                }
                            }
                            ajVar.ae.c(90, i4);
                            if (ajVar.ch.b()) {
                                ajVar.ch.b(402, i2, i3, null);
                            } else {
                                if (ajVar.K != null) {
                                    ajVar.K.a(ajVar, i2, i3);
                                }
                                if (ajVar.J != null) {
                                    ajVar.J.a(ajVar, i2, i3);
                                }
                            }
                            if (!ajVar.au && ajVar.ay) {
                                com.ss.ttvideoengine.s.j.b("TTVideoEngine", "changed video size set");
                                ajVar.ay = false;
                                ajVar.ae.e(i2);
                                ajVar.ae.f(i3);
                            }
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                public static class q implements m.g {

                    /* renamed from: a  reason: collision with root package name */
                    private final WeakReference<aj> f152243a;

                    static {
                        Covode.recordClassIndex(101475);
                    }

                    public q(aj ajVar) {
                        this.f152243a = new WeakReference<>(ajVar);
                    }

                    @Override // com.ss.ttm.player.m.g
                    public final void a(com.ss.ttm.player.m mVar) {
                        aj ajVar = this.f152243a.get();
                        if (ajVar != null && !ajVar.aX && ajVar.ah != null && mVar != null) {
                            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "receive onPrepared");
                            com.ss.ttvideoengine.s.j.b("TTVideoEngine", "onPrepared mediaFormat " + ajVar.ah.b(44, -1) + ", videoCodecID " + ajVar.ah.b(141, -1));
                            ajVar.aO = 0;
                            ajVar.aR = null;
                            ajVar.x = mVar.n();
                            ajVar.r = true;
                            if (ajVar.ae != null) {
                                ajVar.ae.d();
                                ajVar.ae.m(ajVar.x);
                            }
                            if (ajVar.ch.b()) {
                                ajVar.ch.b(405, 0, 0, null);
                            } else {
                                if (ajVar.K != null) {
                                    ajVar.K.b(ajVar);
                                }
                                if (ajVar.J != null) {
                                    ajVar.J.b(ajVar);
                                }
                            }
                            if (ajVar.ah == null) {
                                com.ss.ttvideoengine.s.j.e("TTVideoEngine", "onPrepared mediaplayer is null!");
                                return;
                            }
                            ajVar.m("onPrepared");
                            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "mPausedBeforePrepared:" + ajVar.s + ", mShouldPlay:" + ajVar.aV + ", mIsStartPlayAutomatically:" + ajVar.aY + ", mIsPreDecodeAutoPause:" + ajVar.aZ + ", skip start:" + ajVar.cD);
                            if (!ajVar.cD && ((!ajVar.s && ajVar.aV) || (!ajVar.aY && ajVar.aZ))) {
                                mVar.f();
                            }
                            if (ajVar.au && !ajVar.aV) {
                                mVar.f();
                                mVar.g();
                            }
                            if (!TextUtils.isEmpty(ajVar.ck) && ajVar.au && ajVar.co > 0) {
                                ajVar.ah.a(618, ajVar.cn);
                                ajVar.ah.a(617, ajVar.ck);
                                com.ss.ttvideoengine.s.j.b("TTVideoEngine", "sub option: " + ajVar.cn + " url:" + ajVar.ck);
                            }
                            if (ajVar.E != null && ajVar.d(2) && Build.VERSION.SDK_INT >= 23) {
                                mVar.a(ajVar.E);
                                ajVar.ae.a(ajVar.E);
                            }
                            int b2 = mVar.b(62, -100);
                            int b3 = mVar.b(61, -100);
                            if (b2 == 0) {
                                ajVar.ae.c(12, 1);
                            } else {
                                ajVar.ae.c(12, 0);
                            }
                            if (b3 == 0) {
                                ajVar.ae.c(13, 1);
                            } else {
                                ajVar.ae.c(13, 0);
                            }
                            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "videoEnabled:" + b2 + ",audioEnabled:" + b3);
                            long a2 = ajVar.ah.a(524, -100L);
                            long a3 = ajVar.ah.a(525, -100L);
                            ajVar.ae.c(98, a2);
                            ajVar.ae.c(99, a3);
                            if (ajVar.cz && !ajVar.cy) {
                                ajVar.ch.a(24);
                                ajVar.cy = true;
                            }
                            if (mVar.a() && ajVar.bD == 1 && !ajVar.av) {
                                com.ss.ttvideoengine.s.j.a("TTVideoEngine", "OSPlayer in radioMode enter renderStart");
                                ajVar.B();
                            }
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                public static class s implements com.ss.ttvideoengine.r.b {

                    /* renamed from: a  reason: collision with root package name */
                    private final WeakReference<aj> f152245a;

                    static {
                        Covode.recordClassIndex(101477);
                    }

                    public s(aj ajVar) {
                        this.f152245a = new WeakReference<>(ajVar);
                    }

                    @Override // com.ss.ttvideoengine.r.b
                    public final void a(com.ss.ttvideoengine.r.c cVar) {
                        aj ajVar = this.f152245a.get();
                        if (ajVar != null) {
                            int i2 = cVar.f153219c;
                            int i3 = cVar.f153223g;
                            int i4 = cVar.f153224h;
                            boolean z = cVar.f153220d;
                            boolean b2 = cVar.b();
                            int i5 = cVar.f153222f;
                            boolean z2 = cVar.f153221e;
                            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "[SRLog]onSRStrategy  mode=" + i2 + " srRealStatus=" + i3 + " srOpenStatus=" + i4 + " satisfied=" + z + " enabled=" + b2 + " notUseReason=" + i5 + " shouldUseSRTexture=" + z2);
                            if (i3 == 2) {
                                if (i4 != 0 && 1 != i2) {
                                    ajVar.a(0, i5);
                                    if (ajVar.bW > 0 && ajVar.bV == 0) {
                                        w wVar = cVar.f153226j;
                                        w wVar2 = cVar.f153227k;
                                        if (wVar != null && wVar2 != null && ajVar.al != null && ajVar.al.compareTo((Enum) wVar) == 0 && wVar.compareTo((Enum) wVar2) != 0) {
                                            ajVar.a(wVar2, (Map<Integer, String>) null);
                                            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "[SRLog]onSRStrategy sr open fail switch resolution to ".concat(String.valueOf(wVar2)));
                                        }
                                    }
                                }
                            } else if (1 != i2) {
                                ajVar.bv = z2;
                                if (z) {
                                    if (i4 != 1) {
                                        ajVar.a(1, 0);
                                    }
                                } else if (i4 != 0) {
                                    ajVar.a(0, i5);
                                }
                            }
                        }
                    }
                }

                public static Context a(Context context) {
                    Context applicationContext = context.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                        return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                    return applicationContext;
                }

                private boolean r(int i2) {
                    if (((this.gV >> i2) & 1) == 1) {
                        return true;
                    }
                    return false;
                }

                public final float c(int i2) {
                    if (i2 != 474) {
                        return n(i2);
                    }
                    return this.bN;
                }

                public final void j(int i2) {
                    VideoSurface videoSurface = this.bn;
                    if (videoSurface != null) {
                        videoSurface.b(1, i2);
                    }
                }

                private void c(w wVar) {
                    boolean z2;
                    String d2 = d(wVar);
                    if (this.fk) {
                        if (wVar == w.Auto) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.fk = z2;
                        this.ae.j(d2);
                    }
                    this.ae.k(d2);
                }

                private String d(w wVar) {
                    if (wVar == null) {
                        return "nil";
                    }
                    com.ss.ttvideoengine.j.e eVar = this.ad;
                    if (eVar != null) {
                        return eVar.a(wVar);
                    }
                    return wVar.toString(com.ss.ttvideoengine.j.q.f152976a);
                }

                private static boolean i(com.ss.ttvideoengine.j.e eVar) {
                    if (eVar != null && eVar.a(e.a.HLS)) {
                        return eVar.l();
                    }
                    return false;
                }

                private boolean l(boolean z2) {
                    com.ss.ttvideoengine.h.j jVar;
                    if ((this.fw == 1 || z2) && (jVar = this.ae) != null) {
                        jVar.d(86, "localDNS");
                    }
                    int i2 = this.fw;
                    if (i2 == 1) {
                        return true;
                    }
                    if (i2 == 0) {
                        return false;
                    }
                    return z2;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
                    if (r5 != 2) goto L_0x000e;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private void p(int r5) {
                    /*
                        r4 = this;
                        com.ss.texturerender.VideoSurface r3 = r4.bn
                        if (r3 != 0) goto L_0x0005
                        return
                    L_0x0005:
                        r2 = 2
                        r1 = 1
                        r0 = 0
                        if (r5 == 0) goto L_0x000e
                        if (r5 == r1) goto L_0x0015
                        if (r5 == r2) goto L_0x000f
                    L_0x000e:
                        r2 = 0
                    L_0x000f:
                        r0 = 26
                        r3.b(r0, r2)
                        return
                    L_0x0015:
                        r2 = 1
                        goto L_0x000f
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.p(int):void");
                }

                private static boolean q(String str) {
                    if (TextUtils.isEmpty(str) || str.indexOf(".mpd") <= 0) {
                        return false;
                    }
                    return true;
                }

                private void t(String str) {
                    if (this.fj) {
                        this.fj = false;
                        this.ae.l(str);
                    }
                    this.ae.m(str);
                }

                public final void h(String str) {
                    if (this.ch.a(false)) {
                        this.ch.a(19, 0, 0, str);
                    } else {
                        i(str);
                    }
                }

                /* access modifiers changed from: package-private */
                public final void k(int i2) {
                    a(1, (long) i2);
                    if (!this.cz) {
                        au();
                        if (this.bf > 0) {
                            d.h.f152465a.e();
                        }
                    }
                }

                private boolean g(com.ss.ttvideoengine.j.e eVar) {
                    if (eVar == null) {
                        return false;
                    }
                    if (eVar.a(e.a.DASH)) {
                        return true;
                    }
                    if (eVar.a(e.a.MP4)) {
                        if (!this.cL || !h(eVar)) {
                            return false;
                        }
                        return true;
                    } else if (!eVar.a(e.a.HLS) || !this.cM || !i(eVar)) {
                        return false;
                    } else {
                        return true;
                    }
                }

                private boolean h(com.ss.ttvideoengine.j.e eVar) {
                    if (eVar == null) {
                        return false;
                    }
                    if ((!eVar.a(e.a.DASH) || !r(1)) && (!eVar.a(e.a.MP4) || !r(2))) {
                        return false;
                    }
                    return eVar.k();
                }

                private void n(String str) {
                    if (this.ae != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        this.bI = currentTimeMillis;
                        this.ae.h(this.fw);
                        this.ae.a(str, currentTimeMillis, b.f152308f);
                        this.cg = this.ae.o();
                    }
                }

                private static boolean p(String str) {
                    if (TextUtils.isEmpty(str)) {
                        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "url null, may not use p2p");
                        return false;
                    } else if (!str.contains("http://127.0.0.1") && !str.contains("mdl://")) {
                        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "url not 127 or mdl protocol, may not use p2p");
                        return false;
                    } else if (!str.contains("cdn_type")) {
                        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "url not contain cdntype, may not use p2p");
                        return false;
                    } else {
                        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "url  may use p2p");
                        return true;
                    }
                }

                private static int q(int i2) {
                    if (i2 == 0) {
                        return 2;
                    }
                    if (i2 == 1) {
                        return 0;
                    }
                    if (i2 == 2) {
                        return 1;
                    }
                    if (i2 == 3) {
                        return 3;
                    }
                    if (i2 == 4) {
                        return 4;
                    }
                    if (i2 == 5) {
                        return 5;
                    }
                    throw new RuntimeException("unknown internal player type: ".concat(String.valueOf(i2)));
                }

                private static boolean r(String str) {
                    if (TextUtils.isEmpty(str)) {
                        return false;
                    }
                    String lowerCase = str.toLowerCase();
                    if (lowerCase.startsWith("mem://bash") || lowerCase.startsWith("mem://hls") || lowerCase.indexOf(".m3u8") > 0 || lowerCase.indexOf(".mpd") > 0) {
                        return true;
                    }
                    return false;
                }

                /* access modifiers changed from: package-private */
                public final VideoSurface e(boolean z2) {
                    int i2;
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "use sr tex = ".concat(String.valueOf(z2)));
                    if (this.fT != 0) {
                        i2 = 4;
                    } else {
                        i2 = 0;
                    }
                    VideoSurface a2 = this.fH.a(z2, i2 | 0);
                    if (a2 != null) {
                        if (z2) {
                            a(a2);
                        }
                        a2.b(26, this.db);
                    }
                    return a2;
                }

                public final void f(String str) {
                    if (this.ch.a(false)) {
                        this.ch.a(18, 0, 0, str);
                    } else {
                        g(str);
                    }
                }

                public final void i(boolean z2) {
                    if (z2) {
                        this.eK = true;
                        this.eL = SystemClock.currentThreadTimeMillis();
                        return;
                    }
                    this.eK = false;
                    this.eL = 0;
                }

                private void c(com.ss.ttvideoengine.s.c cVar) {
                    com.ss.ttvideoengine.h.j jVar = this.ae;
                    if (jVar != null) {
                        com.ss.ttvideoengine.s.f fVar = this.bg;
                        if (fVar != null) {
                            jVar.J(fVar.f153268a.c());
                        }
                        this.ae.b(cVar, this.n);
                    }
                    this.t = false;
                    this.aY = true;
                    if (this.ch.b()) {
                        this.ch.b(409, 0, 0, cVar);
                    } else {
                        bb bbVar = this.K;
                        if (bbVar != null) {
                            bbVar.a(cVar);
                        }
                        ax axVar = this.J;
                        if (axVar != null) {
                            axVar.a(cVar);
                        }
                    }
                    this.aO = 0;
                    this.fi = 0;
                    this.iX = true;
                }

                /* access modifiers changed from: package-private */
                public final void f(boolean z2) {
                    float f2;
                    com.ss.ttm.player.m mVar = this.ah;
                    if (mVar == null) {
                        return;
                    }
                    if (mVar.a()) {
                        if (z2) {
                            f2 = 0.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        try {
                            this.ah.a(f2, f2);
                        } catch (Exception unused) {
                        }
                    } else {
                        this.ah.b(z2);
                    }
                }

                /* access modifiers changed from: package-private */
                public final void g(String str) {
                    if (str != null && !str.equals(this.eZ)) {
                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("set local url:%s", new Object[]{str}));
                        z();
                        this.A = 0;
                        this.ar = false;
                        this.az = 0;
                        this.aS = true;
                        this.aq = null;
                    }
                    this.t = false;
                    this.aG = true;
                    this.eZ = str;
                    this.ba = 0;
                    this.ae.b(0, "");
                    this.aC = null;
                    this.aD = null;
                    w wVar = w.Undefine;
                    this.al = wVar;
                    this.ae.b(d(wVar), "");
                }

                /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: boolean */
                /* JADX WARN: Multi-variable type inference failed */
                public final void h(boolean z2) {
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("setLooping:%s", new Object[]{Boolean.valueOf(z2)}));
                    this.D = z2;
                    if (this.ch.a(false)) {
                        this.ch.a(6, (int) z2);
                    } else {
                        o();
                    }
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("set looping value:%d", new Object[]{Integer.valueOf(z2 ? 1 : 0)}));
                }

                public final void i(int i2) {
                    int i3 = this.v;
                    if (i3 != i2) {
                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("playback state changed, prev:%d, current:%d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}));
                        this.v = i2;
                        if (this.ch.b()) {
                            this.ch.b(400, this.v, 0, null);
                            return;
                        }
                        bb bbVar = this.K;
                        if (bbVar != null) {
                            bbVar.a(this, this.v);
                        }
                        ax axVar = this.J;
                        if (axVar != null) {
                            axVar.a(this, this.v);
                        }
                    }
                }

                /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
                /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void j(java.lang.String r4) {
                    /*
                    // Method dump skipped, instructions count: 110
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.j(java.lang.String):void");
                }

                public final void k(String str) {
                    this.ck = str;
                    if (!TextUtils.isEmpty(str) && this.co > 0) {
                        this.ah.a(618, this.cn);
                        this.ah.a(617, this.ck);
                        this.ae.c(83, System.currentTimeMillis());
                    }
                    com.ss.ttvideoengine.s.j.b("TTVideoEngine", "sub option: " + this.cn + "sub thread: " + this.co + " url:" + this.ck);
                }

                /* access modifiers changed from: package-private */
                public final float n(int i2) {
                    com.ss.ttm.player.m mVar = this.ah;
                    if (i2 == 70) {
                        if (this.iV <= 0.0f) {
                            this.iV = mVar.b(151);
                        }
                        return this.iV;
                    } else if (i2 != 71) {
                        if (i2 != 474) {
                            return 0.0f;
                        }
                        try {
                            return this.bN;
                        } catch (Throwable unused) {
                            return 0.0f;
                        }
                    } else if (mVar != null) {
                        return mVar.b(150);
                    } else {
                        return 0.0f;
                    }
                }

                private void b(com.ss.ttvideoengine.s.c cVar) {
                    String str = this.ew;
                    if (str != null && "dash".equals(com.ss.ttvideoengine.s.i.c(str, "format_type")) && (-9993 == cVar.f153260a || !q())) {
                        this.ew = com.ss.ttvideoengine.s.i.a(this.ew, "format_type", "mp4");
                    }
                    if (this.ew == null) {
                        return;
                    }
                    if (-9993 == cVar.f153260a || !q()) {
                        this.ew = com.ss.ttvideoengine.s.i.a(this.ew, "codec_type", "0");
                    }
                }

                private static boolean d(Surface surface) {
                    com.ss.texturerender.n nVar;
                    try {
                        com.ss.texturerender.m a2 = com.ss.texturerender.m.a();
                        if (surface == null) {
                            com.ss.texturerender.l.a("TextureRenderManager", "invalid parameter");
                            return false;
                        }
                        com.ss.texturerender.a.d dVar = new com.ss.texturerender.a.d();
                        a2.f151839b.lock();
                        Iterator<com.ss.texturerender.n> it2 = a2.f151838a.iterator();
                        while (true) {
                            nVar = null;
                            if (it2.hasNext()) {
                                nVar = it2.next();
                                if (nVar.p == 2) {
                                    if (nVar.f151849h > 0) {
                                        break;
                                    }
                                    com.ss.texturerender.l.a("TextureRenderManager", "remove render =" + nVar + " state = " + nVar.f151849h);
                                    nVar.g();
                                    it2.remove();
                                }
                            } else {
                                com.ss.texturerender.n a3 = com.ss.texturerender.e.a(dVar, 2);
                                if (a3.f151849h != -1) {
                                    a2.f151838a.add(a3);
                                    com.ss.texturerender.l.a("TextureRenderManager", "add render = " + a3 + ", effectconfig= " + dVar + ", texType =2,size = " + a2.f151838a.size());
                                    nVar = a3;
                                } else {
                                    a2.f151840c = a3.f151850i;
                                    a3.g();
                                }
                            }
                        }
                        a2.f151839b.unlock();
                        if (nVar != null) {
                            return nVar.a(surface);
                        }
                        com.ss.texturerender.l.a("TextureRenderManager", "couldn't get a renderer return");
                        return false;
                    } catch (Exception unused) {
                        return false;
                    }
                }

                private IABRModule f(com.ss.ttvideoengine.j.e eVar) {
                    boolean z2;
                    float f2;
                    float f3;
                    float f4;
                    float f5;
                    DefaultABRModule defaultABRModule = null;
                    if (!(eVar == null || (this.bV == 0 && this.bW == 0))) {
                        if (!g(eVar) && this.bW <= 0) {
                            return null;
                        }
                        if (this.bV == 1 || this.hE) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.hE = z2;
                        com.ss.ttvideoengine.s.j.b("TTVideoEngine", com.a.a("[ABR] init ABR，algorithm type:%d", new Object[]{Integer.valueOf(ce)}));
                        ABRConfig.setSwitchSensitivity(this.hH);
                        ABRConfig.setStartupBandwidthParameter(this.hZ);
                        ABRConfig.setStallPenaltyParameter(this.ia);
                        ABRConfig.setSwitchPenaltyParameter(this.ib);
                        ABRConfig.setBandwidthParameter(this.ic);
                        defaultABRModule = new DefaultABRModule();
                        defaultABRModule.setInfoListener(new d(this));
                        defaultABRModule.init(new p(this));
                        defaultABRModule.setIntOptionForKey(34, this.id);
                        defaultABRModule.setIntOptionForKey(35, this.ie);
                        defaultABRModule.setIntOptionForKey(6, this.f349if);
                        defaultABRModule.setIntOptionForKey(7, this.ig);
                        defaultABRModule.setLongOptionForKey(26, this.hF);
                        float f6 = 0.0f;
                        if (com.ss.ttvideoengine.q.c.f153180b != null) {
                            Map<String, String> downloadSpeed = com.ss.ttvideoengine.q.c.f153180b.getDownloadSpeed(com.ss.ttvideoengine.j.q.f152976a);
                            if (!(downloadSpeed == null || downloadSpeed.get("download_speed") == null)) {
                                f6 = Float.parseFloat(downloadSpeed.get("download_speed"));
                            }
                            f4 = com.ss.ttvideoengine.q.c.f153180b.getPredictSpeed(0);
                            f5 = com.ss.ttvideoengine.q.c.f153180b.getLastPredictConfidence();
                            f3 = com.ss.ttvideoengine.q.c.f153180b.getAverageDownloadSpeed(com.ss.ttvideoengine.j.q.f152976a, 1, true);
                            f2 = com.ss.ttvideoengine.q.c.f153180b.getAverageDownloadSpeed(com.ss.ttvideoengine.j.q.f152976a, this.hM, false);
                        } else {
                            f2 = 0.0f;
                            f3 = 0.0f;
                            f4 = 0.0f;
                            f5 = 0.0f;
                        }
                        defaultABRModule.setFloatOptionForKey(25, f6);
                        defaultABRModule.setFloatOptionForKey(23, f4);
                        defaultABRModule.setFloatOptionForKey(24, f5);
                        defaultABRModule.setFloatOptionForKey(27, f3);
                        defaultABRModule.setFloatOptionForKey(28, f2);
                        defaultABRModule.setIntOptionForKey(21, ag.a().f152179a);
                        b(defaultABRModule, eVar);
                    }
                    return defaultABRModule;
                }

                private void o(String str) {
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("hostnameURL:%s", new Object[]{str}));
                    if (this.aX) {
                        com.ss.ttvideoengine.s.j.c("TTVideoEngine", "_parseDNS should stop");
                        return;
                    }
                    this.A = 2;
                    com.ss.ttvideoengine.h.j jVar = this.ae;
                    if (jVar != null) {
                        jVar.b(System.currentTimeMillis(), 0);
                    }
                    try {
                        com.ss.ttvideoengine.k.c cVar = new com.ss.ttvideoengine.k.c(this.aa, new URL(str).getHost(), h());
                        this.ez = cVar;
                        cVar.f153010d = new g(this);
                        if (this.aO != 0) {
                            this.ez.f153015h = true;
                        }
                        this.ez.f153016i = this.fs;
                        int i2 = this.ft;
                        if (i2 > 0) {
                            this.ez.f153018k = i2;
                        }
                        boolean z2 = this.gc;
                        if (z2 && this.ad != null) {
                            this.ez.f153017j = z2;
                            this.ez.a(this.ad.j(), Long.valueOf(this.ad.d(216)));
                        }
                        this.ez.b();
                    } catch (Exception unused) {
                    }
                }

                /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
                    if (r14 == 0) goto L_0x004c;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void g(int r14) {
                    /*
                    // Method dump skipped, instructions count: 173
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.g(int):void");
                }

                /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
                    if (r6 == 0) goto L_0x004b;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void h(int r6) {
                    /*
                    // Method dump skipped, instructions count: 135
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.h(int):void");
                }

                /* access modifiers changed from: package-private */
                public final void i(String str) {
                    if (str != null && !str.equals(this.fb)) {
                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("set direct url:%s", new Object[]{str}));
                        z();
                        this.A = 0;
                        this.aS = true;
                        this.aU = true;
                        this.aT = true;
                        this.ar = false;
                        this.az = 0;
                        this.aq = null;
                    }
                    this.t = false;
                    this.fa = true;
                    this.fb = str;
                    this.fc = str;
                    this.ba = 0;
                    this.aC = null;
                    this.aD = null;
                    w wVar = w.Undefine;
                    this.al = wVar;
                    this.ae.b(d(wVar), "");
                    this.ae.b(1, "");
                    this.ae.c(51, this.ju ? 1 : 0);
                }

                public final void j(boolean z2) {
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "seek complete");
                    if (!q()) {
                        this.as = false;
                        this.at = 0;
                        com.ss.ttvideoengine.h.j jVar = this.ae;
                        if (jVar != null) {
                            jVar.h();
                            this.ae.e();
                        }
                    }
                    if (this.au) {
                        this.au = false;
                        i(false);
                        com.ss.ttvideoengine.h.j jVar2 = this.ae;
                        if (jVar2 != null) {
                            jVar2.b(true);
                        }
                    }
                    if (this.ch.b()) {
                        this.ch.b(414, z2 ? 1 : 0, 0, null);
                    } else {
                        y yVar = this.P;
                        if (yVar != null) {
                            yVar.a(z2);
                            this.P = null;
                        }
                    }
                    com.ss.ttm.player.m mVar = this.ah;
                    if (mVar != null && this.di != 0) {
                        long a2 = mVar.a(73, -1L);
                        long a3 = this.ah.a(72, -1L);
                        if (a2 >= 0 && a3 >= 0) {
                            a2 = Math.min(a2, a3);
                        } else if (a2 < 0) {
                            if (a3 >= 0) {
                                a2 = a3;
                            } else {
                                return;
                            }
                        }
                        a(5, a2);
                    }
                }

                public final long m(int i2) {
                    com.ss.ttm.player.m mVar = this.ah;
                    if (i2 != 81) {
                        if (i2 != 315) {
                            if (i2 == 461) {
                                return this.bK;
                            }
                            if (i2 == 614) {
                                long j2 = this.ai;
                                com.ss.ttvideoengine.s.j.a("TTVideoEngine", "get mPlayStartTime:".concat(String.valueOf(j2)));
                                return j2;
                            } else if (i2 != 615) {
                                switch (i2) {
                                    case AudiencePingIntervalSetting.DEFAULT:
                                        if (this.iU < 0) {
                                            this.iU = mVar.a(171, 0L);
                                        }
                                        return this.iU;
                                    case 61:
                                        if (mVar != null) {
                                            return mVar.a(73, 0L);
                                        }
                                        return -1;
                                    case 62:
                                        if (mVar != null) {
                                            return mVar.a(72, 0L);
                                        }
                                        return -1;
                                    case 63:
                                        if (mVar != null) {
                                            return mVar.a(63, -1L);
                                        }
                                        return -1;
                                    case 64:
                                        if (mVar == null) {
                                            return -1;
                                        }
                                        try {
                                            return mVar.a(468, -1L);
                                        } catch (Throwable unused) {
                                            return -1;
                                        }
                                    default:
                                        return -1;
                                }
                            } else {
                                long j3 = this.aj;
                                com.ss.ttvideoengine.s.j.a("TTVideoEngine", "get mRenderStartTime:".concat(String.valueOf(j3)));
                                return j3;
                            }
                        } else if (mVar != null) {
                            return mVar.a(46, 0L);
                        } else {
                            return -1;
                        }
                    } else if (mVar == null) {
                        return -1;
                    } else {
                        long a2 = mVar.a(240, 0L);
                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "get value of KeyIsLastBufferSizeU64: ".concat(String.valueOf(a2)));
                        return a2;
                    }
                }

                private void e(Surface surface) {
                    com.ss.ttm.player.m mVar = this.hn;
                    if (mVar == null) {
                        mVar = this.ah;
                    }
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "setSurfaceHook, player:" + mVar + ", surface:" + surface + ", texturesurface:" + this.bn + ", this:" + this);
                    if (mVar == null) {
                        return;
                    }
                    if (this.bo == 1 && this.ac == null && !this.bq) {
                        b(surface, 1);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("set surface to player = ");
                    Surface surface2 = this.bn;
                    if (surface2 == null) {
                        surface2 = surface;
                    }
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", sb.append(surface2).toString());
                    Surface surface3 = this.bn;
                    if (surface3 == null) {
                        surface3 = surface;
                    }
                    b(surface3, 0);
                    VideoSurface videoSurface = this.bn;
                    if (videoSurface != null && this.fH != null) {
                        videoSurface.a(surface);
                    }
                }

                /* JADX INFO: finally extract failed */
                private void k(boolean z2) {
                    com.ss.ttvideoengine.m.a aVar;
                    com.ss.ttm.player.m mVar;
                    String str;
                    b bVar;
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "_play, mState:" + this.A + ", byPlay:" + z2 + ", this:" + this);
                    this.t = true;
                    this.s = false;
                    if (z2 && !this.eq) {
                        d dVar = d.h.f152465a;
                        ai aiVar = new ai(this, com.ss.ttvideoengine.q.c.f153179a, com.ss.ttvideoengine.q.c.f153180b);
                        dVar.r.lock();
                        try {
                            dVar.f152368c = aiVar;
                            dVar.r.unlock();
                            this.eq = true;
                            this.ae.c(17, ca);
                            this.ae.c(18, cb);
                            this.ae.c(19, cc);
                            this.ae.M(cd);
                        } catch (Throwable th) {
                            dVar.r.unlock();
                            throw th;
                        }
                    }
                    al();
                    com.ss.ttvideoengine.h.j jVar = this.ae;
                    if (jVar != null) {
                        if (z2) {
                            jVar.Q(64);
                            if (this.ai < 0) {
                                this.ai = SystemClock.elapsedRealtime();
                                com.ss.ttvideoengine.s.j.a("TTVideoEngine", "mPlayStartTime:" + this.ai + ", curT:" + System.currentTimeMillis());
                            }
                        } else if (this.iJ != 0) {
                            jVar.c(31, 1);
                        }
                        this.ae.f();
                    }
                    int i2 = this.A;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 3) {
                                int i3 = this.v;
                                if (((i3 != 0 && i3 != 3) || this.r) && ((mVar = this.ah) == null || mVar.b() != 0 || this.r)) {
                                    com.ss.ttvideoengine.s.j.b("TTVideoEngine", "_replayOrResume state:" + this.v + ", playtime:" + this.bI);
                                    if (this.bh || (this.v == 0 && this.bI == 0)) {
                                        n(this.B);
                                        com.ss.ttvideoengine.s.f fVar = this.bg;
                                        if (fVar != null) {
                                            fVar.c();
                                        }
                                    }
                                    am();
                                    return;
                                } else if (this.aG || this.fa || this.fp != null || this.bc != null) {
                                    n(this.B);
                                    if (this.aG) {
                                        str = this.eZ;
                                    } else {
                                        str = this.fb;
                                    }
                                    b(str, this.F);
                                    return;
                                } else if (this.aK) {
                                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                                    if (this.aL.f153093f > 0 && currentTimeMillis - this.aL.f153093f > ((long) cG)) {
                                        ag();
                                    }
                                    n(this.aL.f153088a);
                                    b(this.aL.f153089b, this.F);
                                    return;
                                } else if (this.aM) {
                                    n(this.B);
                                    b(this.aN.f152279a, this.F);
                                    return;
                                } else {
                                    n(this.B);
                                    Map<String, b> map = this.ao;
                                    if (!(map == null || (bVar = map.get(this.bL.f152249a)) == null)) {
                                        bVar.f152220b = "FromCache";
                                        this.ao.put(this.bL.f152249a, bVar);
                                        ao();
                                    }
                                    a(this.bL.a(), this.F);
                                    return;
                                }
                            } else if (i2 != 4) {
                                return;
                            }
                        } else if (this.ad != null) {
                            if (!this.aK || (aVar = this.aL) == null) {
                                n(this.B);
                            } else {
                                n(aVar.f153088a);
                            }
                            c(this.ad);
                            return;
                        } else if (!this.be) {
                            af();
                            return;
                        } else {
                            return;
                        }
                    }
                    af();
                }

                private void s(String str) {
                    String str2;
                    com.ss.ttvideoengine.j.o oVar;
                    if (TextUtils.isEmpty(str)) {
                        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "log first url . url is null");
                        return;
                    }
                    if (this.aS) {
                        int i2 = 0;
                        this.aS = false;
                        String str3 = "";
                        if (str.startsWith("mem://bash") && (oVar = this.an) != null) {
                            if (oVar.a() == com.ss.ttvideoengine.j.q.f152976a) {
                                str2 = this.eH.get(this.al);
                                if (str2 == null || str2.isEmpty()) {
                                    str2 = str;
                                }
                                for (Map.Entry<Integer, String> entry : this.eI.entrySet()) {
                                    if (i2 == 0) {
                                        i2 = entry.getKey().intValue();
                                    } else if (i2 > entry.getKey().intValue()) {
                                        i2 = entry.getKey().intValue();
                                    }
                                }
                                if (i2 > 0) {
                                    str3 = this.eI.get(Integer.valueOf(i2));
                                }
                                this.ae.a(str2, str3);
                            } else if (this.an.a() == com.ss.ttvideoengine.j.q.f152977b) {
                                str3 = this.eI.get(Integer.valueOf(this.an.a(3)));
                            }
                        }
                        str2 = str;
                        this.ae.a(str2, str3);
                    }
                    String[] strArr = null;
                    com.ss.ttvideoengine.j.o oVar2 = this.an;
                    if (oVar2 != null) {
                        strArr = oVar2.b();
                    } else {
                        com.ss.ttvideoengine.j.e eVar = this.ad;
                        if (eVar != null) {
                            strArr = eVar.b(this.al, this.fY);
                        }
                    }
                    if (strArr == null || strArr.length <= 0) {
                        this.ae.e(str);
                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "set curUrl:".concat(String.valueOf(str)));
                        return;
                    }
                    int intValue = this.eG.get(this.al).intValue();
                    if (intValue < strArr.length) {
                        this.ae.e(strArr[intValue]);
                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "find curUrl:" + strArr[intValue]);
                        return;
                    }
                    this.ae.e(str);
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "set curUrl:".concat(String.valueOf(str)));
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: com.ss.ttvideoengine.aq */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [int, boolean] */
                /* JADX WARNING: Unknown variable types count: 1 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void f(int r9) {
                    /*
                    // Method dump skipped, instructions count: 158
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.f(int):void");
                }

                /* access modifiers changed from: package-private */
                /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
                /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
                /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
                /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
                /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
                /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4  */
                /* JADX WARNING: Removed duplicated region for block: B:43:0x00f2  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void l(java.lang.String r17) {
                    /*
                    // Method dump skipped, instructions count: 300
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.l(java.lang.String):void");
                }

                /* access modifiers changed from: package-private */
                public final void m(String str) {
                    StringBuilder append = new StringBuilder().append(this).append(" -> ").append(str).append(" dumpSurface: mSurface = ").append(this.ab);
                    if (this.ab != null) {
                        append.append(" isValid = ").append(this.ab.isValid());
                    }
                    append.append(", mSurfaceHolder = ").append(this.ac);
                    SurfaceHolder surfaceHolder = this.ac;
                    if (surfaceHolder != null) {
                        Surface surface = surfaceHolder.getSurface();
                        append.append(" surface = ").append(surface);
                        if (surface != null) {
                            append.append(" isValid = ").append(surface.isValid());
                        }
                    }
                    append.append(", mTextureSurface = ").append(this.bn);
                    if (this.bn != null) {
                        append.append(" isValid = ").append(this.bn.isValid());
                    }
                    com.ss.ttvideoengine.s.j.b("TTVideoEngine", append.toString());
                }

                public final String o(int i2) {
                    com.ss.ttm.player.m mVar = this.ah;
                    String str = "";
                    if (i2 != 80) {
                        if (i2 != 82) {
                            if (i2 == 462) {
                                Map<String, b> map = this.ao;
                                if (map == null) {
                                    return str;
                                }
                                for (Map.Entry<String, b> entry : map.entrySet()) {
                                    String key = entry.getKey();
                                    b value = entry.getValue();
                                    if (!(key == null || value == null)) {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("ip", value.f152219a);
                                        hashMap.put("dns", value.f152220b);
                                        hashMap.put("dns_cache_open", Integer.valueOf(value.f152221c));
                                        hashMap.put("server_dns_open", Integer.valueOf(value.f152222d));
                                        hashMap.put("url_desc", value.f152223e);
                                        str = hashMap.toString();
                                    }
                                }
                                return str;
                            } else if (i2 == 477) {
                                com.ss.ttvideoengine.h.j jVar = this.ae;
                                if (jVar != null) {
                                    return jVar.t();
                                }
                                return str;
                            } else if (i2 != 957 || mVar == null) {
                                return str;
                            } else {
                                try {
                                    return mVar.c(1002);
                                } catch (Throwable unused) {
                                    return str;
                                }
                            }
                        } else if (bB) {
                            return m.t();
                        } else {
                            return com.ss.ttm.player.r.a(14, str);
                        }
                    } else if (mVar != null) {
                        return mVar.c(142);
                    } else {
                        return str;
                    }
                }

                private void b(w wVar) {
                    int i2;
                    if (this.bX == 0) {
                        if (wVar == w.Auto) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        f(494, i2);
                    }
                    if (wVar != w.Auto) {
                        int i3 = this.A;
                        if (i3 == 0 || i3 == 1 || this.bh) {
                            this.eC = wVar;
                            this.al = wVar;
                            this.fY = null;
                            if (TextUtils.isEmpty(this.fb) && TextUtils.isEmpty(this.eZ)) {
                                this.ae.b(d(wVar), d(wVar));
                            }
                        } else if (i3 != 3) {
                        } else {
                            if (this.ch.a(false)) {
                                this.ch.a(8, 0, 0, wVar, null);
                            } else {
                                a(wVar, (Map<Integer, String>) null);
                            }
                        }
                    }
                }

                public final void e(int i2) {
                    w wVar = w.Undefine;
                    com.ss.ttvideoengine.j.e eVar = this.ad;
                    if (eVar != null && eVar.a()) {
                        w[] allResolutions = w.getAllResolutions();
                        int i3 = 0;
                        while (true) {
                            if (i3 < allResolutions.length) {
                                com.ss.ttvideoengine.j.o a2 = this.ad.a(allResolutions[i3], com.ss.ttvideoengine.j.q.f152976a, (Map<Integer, String>) null);
                                if (a2 != null && a2.a(3) == i2) {
                                    wVar = allResolutions[i3];
                                    this.eC = this.al;
                                    this.ak = (long) i2;
                                    this.al = wVar;
                                    this.bA = a2.b(32);
                                    c(this.al);
                                    this.ae.b(d(this.al), d(this.eC));
                                    this.ae.s(this.bA);
                                    break;
                                }
                                i3++;
                            } else {
                                break;
                            }
                        }
                    }
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("video bitrate changed:%d, resoluton:%s", new Object[]{Integer.valueOf(i2), wVar.toString(com.ss.ttvideoengine.j.q.f152976a)}));
                    if (this.v != 2 || !this.au) {
                        if (this.eK) {
                            this.ae.b(false);
                        }
                        i(false);
                    } else {
                        this.au = false;
                        i(false);
                        com.ss.ttvideoengine.h.j jVar = this.ae;
                        if (jVar != null) {
                            jVar.b(true);
                        }
                    }
                    if (this.ch.b()) {
                        this.ch.b(417, i2, 0, wVar);
                    } else {
                        z zVar = this.R;
                        if (zVar != null) {
                            zVar.a(wVar, i2);
                        }
                    }
                    if (this.bV == 1) {
                        this.ae.k((long) i2);
                    }
                }

                public final void g(boolean z2) {
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("setIsMute:%s", new Object[]{Boolean.valueOf(z2)}));
                    this.aF = z2;
                    if (this.ch.a(false)) {
                        this.ch.a(10, z2 ? 1 : 0);
                    } else {
                        f(z2);
                    }
                }

                public final int l(int i2) {
                    long j2;
                    int i3;
                    int i4;
                    int i5;
                    com.ss.ttm.player.m mVar = this.ah;
                    if (i2 != 0) {
                        if (i2 != 4) {
                            if (i2 == 83) {
                                com.ss.ttvideoengine.s.f fVar = this.bg;
                                if (fVar != null) {
                                    i3 = fVar.f153269b.c();
                                }
                            } else if (i2 == 84) {
                                com.ss.ttvideoengine.s.f fVar2 = this.bg;
                                if (fVar2 != null) {
                                    Context context = this.aa;
                                    if (context == null || context.getPackageManager().checkPermission("android.permission.BLUETOOTH", context.getPackageName()) != 0) {
                                        j2 = 0;
                                        return (int) j2;
                                    }
                                    i3 = fVar2.f153270c.c();
                                }
                            } else if (i2 == 301) {
                                return this.di;
                            } else {
                                if (i2 == 302) {
                                    return this.dj;
                                }
                                if (i2 == 424) {
                                    return this.gk;
                                }
                                if (i2 == 425) {
                                    return this.gl;
                                }
                                if (i2 != 700) {
                                    if (i2 != 701) {
                                        switch (i2) {
                                            case 4:
                                                break;
                                            case 26:
                                                return this.eQ;
                                            case 29:
                                            case 494:
                                                return this.bV;
                                            case 33:
                                                return this.cL ? 1 : 0;
                                            case 160:
                                                return this.bf;
                                            case 313:
                                                return this.gh ? 1 : 0;
                                            case 343:
                                                if (mVar != null) {
                                                    return mVar.b(643, 0);
                                                }
                                                break;
                                            case 371:
                                                if (mVar != null) {
                                                    return mVar.b(540, -1);
                                                }
                                                break;
                                            case 416:
                                                return this.gr;
                                            case 480:
                                                return this.bD;
                                            case 499:
                                                return this.cm;
                                            case 525:
                                                return this.hY;
                                            case 530:
                                                return this.gp;
                                            case 533:
                                                return this.cn;
                                            case 650:
                                                return this.fT;
                                            case 655:
                                                if (mVar != null) {
                                                    return mVar.b(541, 0);
                                                }
                                                break;
                                            case 660:
                                                i4 = this.ja;
                                                if (i4 >= 0) {
                                                    VideoSurface videoSurface = this.bn;
                                                    if (videoSurface == null) {
                                                        if (this.t) {
                                                            return -7893;
                                                        }
                                                        return -7897;
                                                    } else if (videoSurface.c(10, -1) != 1) {
                                                        com.ss.texturerender.m mVar2 = this.fH;
                                                        if (mVar2 == null || !mVar2.c()) {
                                                            return -7889;
                                                        }
                                                        return -7894;
                                                    } else if (this.bn.c(6, -1) == 1) {
                                                        return 0;
                                                    } else {
                                                        return -7899;
                                                    }
                                                }
                                                break;
                                            case 667:
                                                com.ss.ttvideoengine.j.e eVar = this.ad;
                                                if (eVar == null) {
                                                    return 0;
                                                }
                                                com.ss.ttvideoengine.j.o a2 = eVar.a(this.al, 0, (Map<Integer, String>) null);
                                                if (a2 == null) {
                                                    return 0;
                                                }
                                                return a2.a(41);
                                            default:
                                                switch (i2) {
                                                    case 40:
                                                        com.ss.ttvideoengine.h.j jVar = this.ae;
                                                        if (jVar != null) {
                                                            return jVar.r();
                                                        }
                                                        break;
                                                    case 41:
                                                        com.ss.ttvideoengine.h.j jVar2 = this.ae;
                                                        if (jVar2 != null) {
                                                            j2 = jVar2.s();
                                                            return (int) j2;
                                                        }
                                                        break;
                                                    case 42:
                                                        if (mVar != null) {
                                                            return mVar.b(153, -1);
                                                        }
                                                        break;
                                                    case 43:
                                                        if (this.cr < 0 && mVar != null) {
                                                            this.cr = mVar.b(157, -1);
                                                        }
                                                        return this.cr;
                                                    case BuildConfig.VERSION_CODE:
                                                        if (this.cs < 0 && mVar != null) {
                                                            this.cs = mVar.b(158, -1);
                                                        }
                                                        return this.cs;
                                                    case 45:
                                                        if (this.ct < 0 && mVar != null) {
                                                            this.ct = mVar.b(141, -1);
                                                        }
                                                        return this.ct;
                                                    case 46:
                                                        if (this.iT < 0 && mVar != null) {
                                                            this.iT = mVar.b(140, -1);
                                                        }
                                                        return this.iT;
                                                    case 47:
                                                        return this.C;
                                                    case 48:
                                                        Context context2 = this.aa;
                                                        if (context2 != null) {
                                                            AudioManager audioManager = (AudioManager) a(context2, DataType.AUDIO);
                                                            if (audioManager == null) {
                                                                return 0;
                                                            }
                                                            i5 = audioManager.getStreamMaxVolume(3);
                                                            if (i5 < 0) {
                                                                return 0;
                                                            }
                                                            return i5;
                                                        }
                                                        break;
                                                    case 49:
                                                        Context context3 = this.aa;
                                                        if (context3 != null) {
                                                            AudioManager audioManager2 = (AudioManager) a(context3, DataType.AUDIO);
                                                            if (audioManager2 == null) {
                                                                return 0;
                                                            }
                                                            i5 = audioManager2.getStreamVolume(3);
                                                            if (i5 < 0) {
                                                                return 0;
                                                            }
                                                            return i5;
                                                        }
                                                        break;
                                                    case 50:
                                                        return this.x;
                                                    case 51:
                                                        return this.y;
                                                    case 52:
                                                        if (this.au) {
                                                            return this.az;
                                                        }
                                                        return an();
                                                    case 53:
                                                        com.ss.ttvideoengine.s.f fVar3 = this.bg;
                                                        if (fVar3 != null) {
                                                            return fVar3.f153268a.c();
                                                        }
                                                        break;
                                                    case 54:
                                                        return this.bb;
                                                    case 55:
                                                        return this.v;
                                                    case 56:
                                                        return this.w;
                                                    case 57:
                                                        return this.A;
                                                    case 58:
                                                        try {
                                                            if (this.cv == -1 && mVar != null) {
                                                                this.cv = mVar.b(403, -1);
                                                            }
                                                            return this.cv;
                                                        } catch (Throwable unused) {
                                                            break;
                                                        }
                                                    case 59:
                                                        if (this.cu == -1 && mVar != null) {
                                                            this.cu = mVar.b(402, -1);
                                                        }
                                                        return this.cu;
                                                }
                                        }
                                    } else if (mVar != null) {
                                        i4 = mVar.b(569, -1);
                                    }
                                    return i4;
                                } else if (mVar != null) {
                                    return mVar.b(961, -1);
                                }
                            }
                            j2 = (long) i3;
                            return (int) j2;
                        }
                        return this.db;
                    } else if (mVar != null) {
                        return mVar.b(24, -1);
                    }
                    return -1;
                }

                public final void d(String str) {
                    if (this.ch.a(false)) {
                        this.ch.a(14, 0, 0, str);
                    } else {
                        e(str);
                    }
                }

                public static void b(int i2, long j2) {
                    d.h.f152465a.a(i2, j2);
                }

                public static void b(int i2, String str) {
                    e.c.f153200a.a(i2, str);
                }

                public final void f(int i2, int i3) {
                    if (this.ch.a(false)) {
                        this.ch.a(101, i2, i3);
                    } else {
                        h(i2, i3);
                    }
                }

                public static long a(com.ss.ttvideoengine.j.e eVar, w wVar) {
                    long j2 = 0;
                    if (eVar == null || wVar == null) {
                        return 0;
                    }
                    com.ss.ttvideoengine.j.o a2 = eVar.a(wVar, com.ss.ttvideoengine.j.q.f152976a, null, false);
                    if (a2 != null) {
                        j2 = 0 + d.h.f152465a.i(a2.b(15));
                    }
                    com.ss.ttvideoengine.j.o a3 = eVar.a(wVar, com.ss.ttvideoengine.j.q.f152977b, null, true);
                    if (a3 != null) {
                        return j2 + d.h.f152465a.i(a3.b(15));
                    }
                    return j2;
                }

                /* access modifiers changed from: package-private */
                public final void b(float f2, float f3) {
                    if (this.ah != null) {
                        if (this.dC == 0 && !q()) {
                            float f4 = 1.0f;
                            if (f2 != 0.0f) {
                                f3 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            AudioManager audioManager = (AudioManager) a(this.aa, DataType.AUDIO);
                            if (audioManager != null) {
                                audioManager.setStreamVolume(3, (int) f2, 0);
                            }
                            f2 = f4;
                        }
                        this.ah.a(f2, f3);
                    }
                }

                public final void c(int i2, int i3) {
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "set auto range read = " + i2 + ", " + i3);
                    this.iJ = i2;
                    this.iK = i3;
                }

                public final void d(int i2, int i3) {
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "setBufferThresholdControl= " + i2 + ", " + i3);
                    if (i2 > 0 && i3 > 0) {
                        if (d.h.f152465a.d(12) == 200) {
                            i2 = 0;
                            i3 = 0;
                        }
                        this.iL = i2;
                        this.iM = i3;
                    }
                }

                private int b(com.ss.ttvideoengine.s.c cVar, boolean z2) {
                    switch (cVar.f153260a) {
                        case -1094995529:
                        case -499985:
                        case -499978:
                        case -499977:
                            if (this.hr > 0) {
                                for (String str : this.cl) {
                                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("clear mdl cache by filekey: %s", new Object[]{str}));
                                    d.h.f152465a.h(str);
                                }
                            }
                            return 11;
                        case -499972:
                        case -499970:
                            return a(cVar, z2);
                        default:
                            return 11;
                    }
                }

                public static void e(int i2, int i3) {
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "TTVideoEngine.setIntValue key=" + i2 + " value=" + i3);
                    if (i2 == 672) {
                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "do set static render type, value = ".concat(String.valueOf(i3)));
                        dd = i3;
                    } else if (i2 == 674) {
                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "enable https for fetch");
                        com.ss.ttvideoengine.s.l.f153286a = i3;
                    } else if (i2 == 112) {
                        if (i3 > 0) {
                            cf = 2;
                            d.a(d.h.f152465a, 112, i3);
                            return;
                        }
                        cf = 1;
                        d.a(d.h.f152465a, 112, 0);
                    } else if (i2 == 676) {
                        com.ss.ttvideoengine.q.c.a(i3);
                    } else if (i2 == 702) {
                        eg = i3;
                    } else {
                        d.a(d.h.f152465a, i2, i3);
                        com.ss.ttvideoengine.q.f.a(i2, i3);
                    }
                }

                /* access modifiers changed from: package-private */
                public final void d(int i2, long j2) {
                    if (i2 == 217) {
                        this.fD = j2;
                        d.h.f152465a.a(62, j2);
                    } else if (i2 == 440 && j2 > 0) {
                        NativeAudioProcessor nativeAudioProcessor = new NativeAudioProcessor();
                        this.fE = nativeAudioProcessor;
                        nativeAudioProcessor.setNativeWrapper(j2);
                        com.ss.ttm.player.m mVar = this.ah;
                        if (mVar != null) {
                            ((m) mVar).a(this.fE);
                        }
                    }
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "set long option key:" + i2 + ",value:" + j2);
                }

                private int a(com.ss.ttvideoengine.s.c cVar, boolean z2) {
                    com.ss.ttvideoengine.j.e eVar;
                    List<com.ss.ttvideoengine.j.o> b2;
                    if (!this.gi) {
                        c(cVar);
                        return 10;
                    }
                    this.ae.l(cVar.f153260a);
                    f152206j = new int[]{this.gk, this.gl};
                    com.ss.ttvideoengine.j.e eVar2 = this.ad;
                    if (eVar2 != null && eVar2.a() && (b2 = eVar2.b()) != null && b2.size() > 0) {
                        for (com.ss.ttvideoengine.j.o oVar : b2) {
                            d.h.f152465a.h(oVar.b(15));
                        }
                    }
                    d.h.f152465a.g();
                    d.a(d.h.f152465a, 90, this.gk);
                    d.a(d.h.f152465a, 91, this.gl);
                    if (this.gj != 0 || z2 || (eVar = this.ad) == null || !eVar.c(106)) {
                        this.gj = 0;
                        c(cVar);
                        return 10;
                    }
                    this.gj++;
                    this.gg = true;
                    return 2;
                }

                private com.ss.ttvideoengine.j.j e(String str, HashMap hashMap) {
                    int indexOf;
                    int i2;
                    String str2;
                    com.ss.ttvideoengine.j.j jVar = new com.ss.ttvideoengine.j.j(str, hashMap);
                    if (this.di != 0 && !TextUtils.isEmpty(str) && !str.startsWith("http://127.0.0.1") && !str.startsWith("mem://bash") && !TextUtils.isEmpty(str) && (indexOf = str.indexOf("cdn_type=")) != -1 && (i2 = indexOf + 9) < str.length()) {
                        char charAt = str.charAt(i2);
                        if (Character.isDigit(charAt) && Character.getNumericValue(charAt) == 1) {
                            if (hashMap != null && hashMap.containsKey("Host")) {
                                String obj = hashMap.get("Host").toString();
                                try {
                                    str2 = new URI(str).getHost();
                                } catch (URISyntaxException unused) {
                                    str2 = "";
                                }
                                if (!TextUtils.isEmpty(obj) && !TextUtils.isEmpty(str2)) {
                                    str = str.replaceFirst(str2, obj.trim());
                                    if (!TextUtils.isEmpty(str2)) {
                                        str = com.ss.ttvideoengine.s.i.b(str, "xycip=".concat(String.valueOf(str2)));
                                    }
                                }
                            }
                            if (this.dj == 1) {
                                str = com.ss.ttvideoengine.s.i.b(str, "xyp2p=0");
                            }
                            com.ss.ttvideoengine.s.i.b(str, "xynp=1&xyer=1");
                            if (!TextUtils.isEmpty(null)) {
                                throw new NullPointerException("startsWith");
                            }
                            return jVar;
                        }
                    }
                    return jVar;
                }

                public final void c(int i2, long j2) {
                    if (this.ch.a(false)) {
                        this.ch.a(102, i2, 0, Long.valueOf(j2));
                    } else {
                        d(i2, j2);
                    }
                }

                private void b(IABRModule iABRModule, com.ss.ttvideoengine.j.e eVar) {
                    HashMap hashMap;
                    HashMap hashMap2;
                    List<com.ss.ttvideoengine.j.o> b2 = eVar.b();
                    if (!(b2 == null || b2.size() == 0)) {
                        List<IVideoStream> arrayList = new ArrayList<>();
                        List<IAudioStream> arrayList2 = new ArrayList<>();
                        for (com.ss.ttvideoengine.j.o oVar : b2) {
                            if (oVar != null) {
                                int i2 = -1;
                                if (oVar.a() == com.ss.ttvideoengine.j.q.f152976a) {
                                    ABRVideoStream aBRVideoStream = new ABRVideoStream();
                                    String b3 = oVar.b(15);
                                    aBRVideoStream.setStreamId(b3);
                                    aBRVideoStream.setBandWidth(oVar.a(3));
                                    aBRVideoStream.setCodec(oVar.b(8));
                                    int a2 = oVar.a(1);
                                    int a3 = oVar.a(2);
                                    aBRVideoStream.setWidth(a2);
                                    aBRVideoStream.setHeight(a3);
                                    aBRVideoStream.setFrameRate(-1);
                                    aBRVideoStream.setSegmentDuration(5000);
                                    if (!TextUtils.isEmpty(b3)) {
                                        arrayList.add(aBRVideoStream);
                                    }
                                    aBRVideoStream.setSupportSR(0);
                                    Integer num = this.by.f153217a.f153237i;
                                    Integer num2 = this.by.f153217a.f153238j;
                                    if (num != null && num2 != null && a2 <= num.intValue() && a3 <= num2.intValue()) {
                                        aBRVideoStream.setSupportSR(1);
                                    }
                                    w c2 = oVar.c();
                                    if (c2 != null) {
                                        i2 = c2.getIndex();
                                    }
                                    String b4 = oVar.b(32);
                                    if (b4 != null) {
                                        try {
                                            i2 = Integer.parseInt(b4);
                                        } catch (NumberFormatException unused) {
                                        }
                                    }
                                    aBRVideoStream.setResolution(i2);
                                } else {
                                    ABRAudioStream aBRAudioStream = new ABRAudioStream();
                                    String b5 = oVar.b(15);
                                    aBRAudioStream.setStreamId(b5);
                                    aBRAudioStream.setBandWidth(oVar.a(3));
                                    aBRAudioStream.setCodec(oVar.b(8));
                                    aBRAudioStream.setSampleRate(-1);
                                    aBRAudioStream.setSegmentDuration(5000);
                                    if (!TextUtils.isEmpty(b5)) {
                                        arrayList2.add(aBRAudioStream);
                                    }
                                }
                            }
                        }
                        iABRModule.setMediaInfo(arrayList, arrayList2);
                        w valueOf = w.valueOf(this.hN);
                        HashMap hashMap3 = null;
                        if (valueOf != null || !TextUtils.isEmpty(this.hR)) {
                            if (!TextUtils.isEmpty(this.hR)) {
                                hashMap2 = new HashMap();
                                hashMap2.put(32, this.hR);
                            } else {
                                hashMap2 = null;
                            }
                            com.ss.ttvideoengine.j.o a4 = eVar.a(valueOf, (Map<Integer, String>) hashMap2, true);
                            if (a4 != null) {
                                iABRModule.setLongOptionForKey(2, (long) a4.a(3));
                            }
                        }
                        w valueOf2 = w.valueOf(this.hO);
                        if (valueOf2 != null || !TextUtils.isEmpty(this.hS)) {
                            if (!TextUtils.isEmpty(this.hS)) {
                                hashMap = new HashMap();
                                hashMap.put(32, this.hS);
                            } else {
                                hashMap = null;
                            }
                            com.ss.ttvideoengine.j.o a5 = eVar.a(valueOf2, (Map<Integer, String>) hashMap, true);
                            if (a5 != null) {
                                iABRModule.setLongOptionForKey(12, (long) a5.a(3));
                            }
                        }
                        w valueOf3 = w.valueOf(this.hP);
                        if (valueOf3 != null || !TextUtils.isEmpty(this.hT)) {
                            if (!TextUtils.isEmpty(this.hT)) {
                                hashMap3 = new HashMap();
                                hashMap3.put(32, this.hT);
                            }
                            com.ss.ttvideoengine.j.o a6 = eVar.a(valueOf3, (Map<Integer, String>) hashMap3, true);
                            if (a6 != null) {
                                iABRModule.setLongOptionForKey(13, (long) a6.a(3));
                            }
                        }
                    }
                }

                private void c(String str, HashMap hashMap) {
                    String str2;
                    int i2;
                    String d2 = d(str, hashMap);
                    if (this.gg) {
                        d2 = com.ss.ttvideoengine.s.i.d(d2);
                    }
                    System.currentTimeMillis();
                    com.ss.ttvideoengine.j.j e2 = e(d2, hashMap);
                    if (e2.f152930c > 0) {
                        this.ah.a(310, this.dq);
                        com.ss.ttvideoengine.h.j jVar = this.ae;
                        if (jVar != null) {
                            jVar.g(this.dq);
                        }
                    }
                    this.ap = e2;
                    System.currentTimeMillis();
                    com.ss.ttvideoengine.h.j jVar2 = this.ae;
                    if (jVar2 != null) {
                        jVar2.G(this.di);
                        if (e2.f152930c > 0) {
                            this.ae.v(e2.f152928a);
                        }
                    }
                    if (!this.r) {
                        long currentTimeMillis = System.currentTimeMillis();
                        com.ss.ttvideoengine.h.j jVar3 = this.ae;
                        if (jVar3 != null) {
                            this.cg = jVar3.o();
                        } else {
                            this.cg = com.ss.ttvideoengine.s.i.a(b.f152308f, currentTimeMillis);
                        }
                        if (!TextUtils.isEmpty(this.cg)) {
                            e2.f152929b.put("X-Tt-Traceid", this.cg);
                            this.F.put("X-Tt-Traceid", this.cg);
                            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "X-Tt-Traceid:" + this.cg);
                        }
                        if (!this.fa && (i2 = this.hl) != 0) {
                            this.F.put("X-Tt-Fapi", String.valueOf(i2));
                            this.F.put("Engine-ID", String.valueOf(this.cA));
                            this.ae.c(34, this.hl);
                        }
                        if (cf == 1) {
                            this.F.put("X-SpeedTest-TimeInternal", String.valueOf(bZ));
                        }
                        HashMap<String, String> hashMap2 = this.F;
                        if (TextUtils.isEmpty(this.aI)) {
                            str2 = "default";
                        } else {
                            str2 = this.aI;
                        }
                        hashMap2.put("X-Tt-Tag", str2);
                        if (!TextUtils.isEmpty(this.aJ)) {
                            this.F.put("X-Tt-SubTag", this.aJ);
                        }
                    }
                    if (e2.f152929b != null) {
                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "setDataSource X-Tt-Traceid:" + e2.f152929b.get("X-Tt-Traceid"));
                    }
                    this.ah.a(this.aa, Uri.parse(e2.f152928a), e2.f152929b);
                }

                /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
                /* JADX WARNING: Removed duplicated region for block: B:59:0x0123  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private java.lang.String d(java.lang.String r11, java.util.HashMap r12) {
                    /*
                    // Method dump skipped, instructions count: 318
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.d(java.lang.String, java.util.HashMap):java.lang.String");
                }

                public final void g(int i2, int i3) {
                    com.ss.ttm.player.m mVar;
                    int i4 = this.w;
                    if (i4 != i2) {
                        com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("load state changed, prev:%d, current:%d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i2)}));
                        if (i2 == 2 && this.av && !this.as && this.w != 3) {
                            int an2 = an();
                            this.bb = i3;
                            int i5 = -1;
                            com.ss.ttvideoengine.h.j jVar = this.ae;
                            if (jVar != null) {
                                jVar.b(i3, an2);
                                i5 = this.ae.i();
                            }
                            if (i3 == 0) {
                                a(3, (long) i5);
                            }
                            this.ba = SystemClock.elapsedRealtime();
                        }
                        this.w = i2;
                        if (this.ch.b()) {
                            this.ch.b(401, this.w, this.aV ? 1 : 0, null);
                        } else {
                            bb bbVar = this.K;
                            if (bbVar != null && (this.aV || i2 != 3)) {
                                bbVar.b(this, this.w);
                            }
                            ax axVar = this.J;
                            if (axVar != null) {
                                if (this.aV || i2 != 3) {
                                    axVar.b(this, this.w);
                                } else {
                                    return;
                                }
                            }
                        }
                        if (i2 == 2 && (mVar = this.ah) != null) {
                            long a2 = mVar.a(665, 0L);
                            if (a2 > 0) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("diff", Long.valueOf(a2));
                                this.ae.t(a2);
                                if (this.ch.b()) {
                                    this.ch.b(420, 0, 0, hashMap);
                                }
                            }
                        }
                    }
                }

                private static Object a(Context context, String str) {
                    Object obj;
                    MethodCollector.i(11525);
                    if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                        if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                            try {
                                new com.bytedance.platform.godzilla.b.b.b().a();
                                com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                                obj = context.getSystemService(str);
                            } catch (Throwable unused) {
                            }
                        }
                        obj = context.getSystemService(str);
                    } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
                        synchronized (ClipboardManager.class) {
                            try {
                                obj = context.getSystemService(str);
                                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                    try {
                                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                        declaredField.setAccessible(true);
                                        declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                                    } catch (Exception e2) {
                                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                                    }
                                }
                                com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                            } finally {
                                MethodCollector.o(11525);
                            }
                        }
                    } else {
                        obj = context.getSystemService(str);
                    }
                    return obj;
                }

                private void c(boolean z2, int i2) {
                    com.ss.ttvideoengine.s.f fVar;
                    X();
                    com.ss.ttm.player.m mVar = this.hn;
                    if (mVar == null) {
                        mVar = this.ah;
                    }
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "_stop, mState:" + this.A + ", this:" + this);
                    int i3 = this.A;
                    if (i3 == 0) {
                        this.ar = true;
                    } else if (i3 == 1) {
                        this.ar = true;
                        com.ss.ttvideoengine.f.e eVar = this.ag;
                        if (eVar != null) {
                            eVar.a();
                        }
                    } else if (i3 == 2) {
                        this.ar = true;
                        com.ss.ttvideoengine.k.c cVar = this.ez;
                        if (cVar != null) {
                            cVar.c();
                        }
                    } else if (i3 == 3) {
                        this.ar = true;
                    }
                    y();
                    if (mVar != null && z2 && (mVar.b() != 0 || (mVar.b() == 0 && this.r))) {
                        mVar.i();
                    }
                    com.ss.ttvideoengine.s.f fVar2 = this.bg;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                    com.ss.ttvideoengine.j.f fVar3 = this.cw;
                    if (fVar3 != null) {
                        fVar3.c();
                    }
                    if (this.ae != null) {
                        if (mVar != null) {
                            int k2 = mVar.k();
                            if (this.cq > 0) {
                                this.cp = k2;
                            }
                            this.ae.x(k2);
                            if (this.A == 3) {
                                this.ae.l(mVar.b(204, -1));
                            }
                            this.ae.a(com.ss.android.ugc.h.g.e().d(), 1);
                        }
                        if (!(this.v == 0 || (fVar = this.bg) == null)) {
                            this.ae.J(fVar.f153268a.c());
                        }
                        this.ae.a(i2);
                    }
                    i(0);
                    this.av = false;
                    this.aw = false;
                    this.aj = -1;
                    this.ai = -1;
                    this.ax = false;
                    this.bI = 0;
                    this.bs = false;
                    this.bq = false;
                    this.bp = false;
                    this.as = false;
                    if (i2 != 6) {
                        as asVar = this.eu;
                        if (asVar != null) {
                            SurfaceHolder surfaceHolder = this.ac;
                            if (surfaceHolder != null) {
                                surfaceHolder.removeCallback(asVar);
                            }
                            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "remove surface callback:" + this.eu);
                            this.eu.f152283a.clear();
                            this.eu = null;
                        }
                        this.cD = false;
                    }
                    j(3);
                }

                public final void d(int i2, String str) {
                    if (this.ch.a(false)) {
                        this.ch.a(108, i2, 0, str);
                    } else {
                        e(i2, str);
                    }
                }

                public aj(Context context, int i2) {
                    int i3;
                    boolean z2;
                    boolean z3;
                    MethodCollector.i(11513);
                    boolean z4 = false;
                    this.ar = false;
                    this.as = false;
                    this.at = 0;
                    this.au = false;
                    this.eK = false;
                    this.eL = 0;
                    this.av = false;
                    this.aw = false;
                    this.ax = false;
                    this.ay = true;
                    this.az = 0;
                    this.aA = 0;
                    this.eM = 0;
                    this.eN = 0;
                    this.eO = 0;
                    this.eP = 0;
                    this.eQ = 0;
                    this.eR = 0;
                    this.eS = 0;
                    this.eT = 0;
                    this.eU = true;
                    this.aB = false;
                    this.aC = null;
                    this.aD = null;
                    this.aE = "";
                    this.eV = "";
                    this.eW = "";
                    this.eX = null;
                    this.eY = "";
                    this.aG = false;
                    this.eZ = "";
                    this.fa = false;
                    this.fb = "";
                    this.fc = "";
                    this.aH = "";
                    this.aI = "";
                    this.aJ = "";
                    this.aK = false;
                    this.aL = null;
                    this.fd = "";
                    this.fe = "";
                    this.ff = "";
                    this.fg = "";
                    this.fh = false;
                    this.aM = false;
                    this.aN = null;
                    this.aO = 0;
                    this.fi = 0;
                    this.aP = false;
                    this.aQ = false;
                    this.aR = null;
                    this.aS = true;
                    this.aT = true;
                    this.aU = true;
                    this.fj = true;
                    this.fk = true;
                    this.fl = -1.0f;
                    this.fm = -1.0f;
                    this.aV = false;
                    this.aW = false;
                    this.aX = false;
                    this.aY = true;
                    this.aZ = true;
                    this.ba = 0;
                    this.bb = -1;
                    this.fo = 0;
                    this.fp = null;
                    this.fq = 0;
                    this.fr = 0;
                    this.bc = null;
                    this.fs = false;
                    this.ft = 0;
                    this.fv = false;
                    this.fw = -1;
                    this.fx = 0;
                    this.be = false;
                    this.bf = 0;
                    this.fA = null;
                    this.fB = false;
                    this.bh = false;
                    this.bi = 0;
                    this.bj = new ArrayList<>();
                    this.bk = new ArrayList<>();
                    this.bl = null;
                    this.fC = false;
                    this.bm = 0;
                    this.fD = 0;
                    this.fE = null;
                    this.fF = 0;
                    this.fG = 0;
                    this.bo = 0;
                    this.bp = false;
                    this.bq = false;
                    this.br = false;
                    this.fI = null;
                    this.bs = false;
                    this.fK = 0;
                    this.fL = -1;
                    this.fM = -1;
                    this.fQ = 0;
                    this.fR = 0;
                    this.bt = null;
                    this.by = new com.ss.ttvideoengine.r.c();
                    this.fU = 0;
                    this.fV = 0;
                    this.bz = 0;
                    this.fW = 0;
                    this.fX = new LinkedList();
                    this.fY = null;
                    this.fZ = null;
                    this.ga = "";
                    this.bA = "";
                    this.gb = false;
                    this.gc = false;
                    this.gd = 0;
                    this.ge = 3;
                    this.gf = false;
                    this.gg = false;
                    this.gh = false;
                    this.gi = true;
                    this.gj = 0;
                    this.gk = 2;
                    this.gl = 0;
                    this.gm = null;
                    this.gn = 0;
                    this.go = 1;
                    this.gp = 0;
                    this.gq = 0;
                    this.gr = 1;
                    this.gs = 0;
                    this.gt = -1;
                    this.gu = 0;
                    this.bD = 0;
                    this.bE = 0;
                    this.bF = false;
                    this.gv = 0;
                    this.gw = 0;
                    this.gx = 0;
                    this.gy = 0;
                    this.gz = 0;
                    this.gB = 0;
                    this.gC = 0;
                    this.gD = 1000;
                    this.gE = 0.0f;
                    this.gF = 0;
                    this.gG = 0;
                    this.gH = 0;
                    this.gI = false;
                    this.gJ = System.currentTimeMillis();
                    this.gK = 0;
                    this.gL = 0;
                    this.gM = 0;
                    this.gN = 0;
                    this.gO = 0;
                    this.gP = 1;
                    this.gQ = 0;
                    this.gR = 0;
                    this.gS = 0;
                    this.gT = 1;
                    this.gU = 1;
                    this.gV = 2;
                    this.gW = 1048576;
                    this.gX = 409600;
                    this.gY = 5000;
                    this.gZ = 10000;
                    this.ha = 0;
                    this.hb = 0;
                    this.hc = 0;
                    this.hd = 5000000;
                    this.he = 0;
                    this.hf = 0;
                    this.hg = 1;
                    this.hh = null;
                    this.bI = 0;
                    this.bJ = 0;
                    this.bK = 0;
                    this.bL = new x(this, (byte) 0);
                    this.hi = 0;
                    this.bM = "";
                    this.hj = -1;
                    this.hk = 0;
                    this.hl = 0;
                    this.hm = 0;
                    this.ho = 0;
                    this.hp = 0;
                    this.hr = 0;
                    this.hs = 2;
                    this.bN = 0.0f;
                    this.bO = 0.0f;
                    this.bP = 0;
                    this.ht = -1;
                    this.hu = -1;
                    this.hv = -1;
                    this.hw = -1;
                    this.hx = -1;
                    this.hy = -1.0f;
                    this.hz = -1.0f;
                    this.hA = -1.0f;
                    this.bQ = null;
                    this.hB = null;
                    this.bR = "";
                    this.hC = 0;
                    this.bT = new com.ss.ttvideoengine.n.c.b();
                    this.bV = 0;
                    this.hE = false;
                    this.bW = 0;
                    this.hG = 500;
                    this.bX = 0;
                    this.hH = 0;
                    this.hI = 1;
                    this.hJ = 0;
                    this.hK = 0;
                    this.hL = 2;
                    this.hM = 4;
                    this.hN = w.Undefine.getIndex();
                    this.hO = w.SuperHigh.getIndex();
                    this.hP = w.SuperHigh.getIndex();
                    this.hQ = 1;
                    this.hR = null;
                    this.hS = null;
                    this.hT = null;
                    this.hU = null;
                    this.hV = w.Undefine.getIndex();
                    this.hW = null;
                    this.hX = 0;
                    this.hY = 0;
                    this.hZ = 0.9f;
                    this.ia = 9.0f;
                    this.ib = 2.0f;
                    this.ic = 1.0f;
                    this.id = -1;
                    this.ie = -1;
                    this.f349if = -1;
                    this.ig = -1;
                    this.ih = 0;
                    this.ii = false;
                    this.ij = 0.0f;
                    this.ik = 0;
                    this.il = 0;
                    this.im = 0;
                    this.in = 0;
                    this.io = 0;
                    this.ip = 0;
                    this.iq = 0;
                    this.ir = 0;
                    this.is = 0;
                    this.it = 0;
                    this.iu = 0;
                    this.iv = 0;
                    this.iw = 0;
                    this.ix = 0;
                    this.iy = 1;
                    this.iz = 0;
                    this.iA = 0;
                    this.iB = 0;
                    this.iC = 1;
                    this.iD = 0;
                    this.iE = 0;
                    this.iF = 0;
                    this.iG = false;
                    this.cg = "";
                    this.iH = false;
                    this.ci = new HashMap<>();
                    this.ck = null;
                    this.cl = new ArrayList();
                    this.iJ = 0;
                    this.cm = 0;
                    this.iN = 0;
                    this.iO = -3;
                    this.iP = 0;
                    this.cn = 0;
                    this.co = 0;
                    this.iQ = -1;
                    this.iR = 0;
                    this.iS = 0;
                    this.cp = -1;
                    this.cq = 0;
                    this.cr = -1;
                    this.cs = -1;
                    this.ct = -1;
                    this.iT = -1;
                    this.cu = -1;
                    this.cv = -1;
                    this.iU = -1;
                    this.iV = 0.0f;
                    this.iW = 0;
                    this.cw = null;
                    this.cx = 0;
                    this.cy = false;
                    this.iX = false;
                    this.cz = false;
                    this.iY = false;
                    this.iZ = 300;
                    this.ja = 0;
                    this.jd = 0;
                    this.je = 0;
                    this.jf = 0;
                    this.jg = -1;
                    this.jh = -1;
                    this.ji = -1;
                    this.jj = -1;
                    this.jk = new ArrayList<>();
                    this.jl = -1;
                    this.jm = 0;
                    this.jn = false;
                    this.jo = 0;
                    this.jp = null;
                    this.jq = 0;
                    this.jr = 0;
                    this.js = 0;
                    this.jt = new com.ss.ttvideoengine.p.a.b();
                    this.ju = false;
                    this.jw = null;
                    this.cB = null;
                    this.cD = false;
                    this.jx = 0;
                    JniUtils.a();
                    com.ss.ttvideoengine.s.j.a("TTVideoEngine", "init, type:" + i2 + ", this:" + this + ", version:1.10.62.3");
                    this.aa = context;
                    this.aF = false;
                    this.aS = true;
                    this.aU = true;
                    this.aT = true;
                    this.ex = true;
                    this.al = w.Standard;
                    this.eB = w.Auto;
                    this.eG = new HashMap();
                    this.eH = new HashMap();
                    this.eI = new HashMap();
                    ap();
                    this.ao = new HashMap();
                    this.F = new HashMap<>();
                    this.hh = new HashMap<>();
                    this.C = i2;
                    this.bp = false;
                    this.bq = false;
                    this.bf = cH ? 1 : 0;
                    this.jd = 500;
                    com.ss.ttvideoengine.s.j.b("TTVideoEngine", "DataLoaderEnable is: " + this.bf);
                    com.ss.ttm.player.r.a(6, false);
                    if (i2 == 2 || i2 == 5) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    com.ss.ttm.player.r.b(1, i3);
                    if (i2 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    com.ss.ttm.player.r.a(2, z2);
                    if (i2 == 5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    com.ss.ttm.player.r.a(26, z3);
                    com.ss.ttm.player.r.a(11, false);
                    com.ss.ttm.player.r.a(4, false);
                    if (i2 == 3) {
                        bd = true;
                    }
                    this.af = new com.ss.ttvideoengine.h.h(context);
                    com.ss.ttvideoengine.h.r rVar = new com.ss.ttvideoengine.h.r(context, new m(this), this.af);
                    this.ae = rVar;
                    rVar.a();
                    this.ae.b(d(this.al), "");
                    if (!cH && fz.tryLock()) {
                        try {
                            if (fy) {
                                fy = false;
                                String aq2 = aq();
                                File file = new File(aq2);
                                if (!file.exists()) {
                                    file.mkdirs();
                                } else if (file.list() != null) {
                                    File file2 = new File(aq2 + "tem");
                                    file.renameTo(file2);
                                    file.mkdirs();
                                    com.ss.ttvideoengine.s.b.a(new w(file2));
                                }
                                com.ss.ttvideoengine.s.b.a(new a(a(this.aa)));
                            }
                        } catch (Throwable unused) {
                        }
                        fz.unlock();
                    }
                    this.bg = new com.ss.ttvideoengine.s.f(this.af);
                    if (!com.ss.ttvideoengine.s.m.b()) {
                        Context context2 = this.aa;
                        if (!com.ss.ttvideoengine.s.m.f153290d && !TextUtils.isEmpty(com.ss.ttvideoengine.s.m.f153287a)) {
                            synchronized (com.ss.ttvideoengine.s.m.class) {
                                try {
                                    if (com.ss.ttvideoengine.s.m.f153288b == null || !com.ss.ttvideoengine.s.m.f153288b.a()) {
                                        if (context2 != null && !com.ss.ttvideoengine.k.h.b(context2)) {
                                            com.ss.ttvideoengine.s.j.b("TimeService", "network unavailable");
                                        } else if (com.ss.ttvideoengine.s.m.f153289c == 0) {
                                            com.ss.ttvideoengine.s.m.f153289c = 1;
                                            if (com.ss.ttvideoengine.s.m.f153291e <= 6) {
                                                com.ss.ttvideoengine.s.b.a(
                                                /*  JADX ERROR: Method code generation error
                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x05fa: INVOKE  
                                                      (wrap: com.ss.ttvideoengine.s.m$1 : 0x05f7: CONSTRUCTOR  (r0v141 com.ss.ttvideoengine.s.m$1) = (r4v3 'context2' android.content.Context) call: com.ss.ttvideoengine.s.m.1.<init>(android.content.Context):void type: CONSTRUCTOR)
                                                     type: STATIC call: com.ss.ttvideoengine.s.b.a(java.lang.Runnable):java.util.concurrent.Future in method: com.ss.ttvideoengine.aj.<init>(android.content.Context, int):void, file: classes4.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x05f7: CONSTRUCTOR  (r0v141 com.ss.ttvideoengine.s.m$1) = (r4v3 'context2' android.content.Context) call: com.ss.ttvideoengine.s.m.1.<init>(android.content.Context):void type: CONSTRUCTOR in method: com.ss.ttvideoengine.aj.<init>(android.content.Context, int):void, file: classes4.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                                    	... 53 more
                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.ttvideoengine.s.m, state: GENERATED_AND_UNLOADED
                                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                                    	... 59 more
                                                    */
                                                /*
                                                // Method dump skipped, instructions count: 1546
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aj.<init>(android.content.Context, int):void");
                                            }

                                            private void a(int i2, com.ss.ttvideoengine.s.c cVar) {
                                                String str;
                                                String str2;
                                                if (i2 == 0) {
                                                    c(cVar);
                                                } else if (i2 == 1) {
                                                    b(cVar);
                                                    ag();
                                                } else if (i2 == 2) {
                                                    ah();
                                                } else if (i2 == 3) {
                                                    if (this.aG) {
                                                        str = this.eZ;
                                                    } else if (this.fa) {
                                                        str = this.fb;
                                                    } else {
                                                        if (this.aK) {
                                                            str2 = this.aL.f153089b;
                                                        } else if (this.aM) {
                                                            str2 = this.aN.f152279a;
                                                        } else {
                                                            a(this.bL.a(), this.F);
                                                            return;
                                                        }
                                                        b(str2, this.F);
                                                        return;
                                                    }
                                                    b(str, this.F);
                                                } else if (i2 == 12 && !this.jt.a(this, cVar)) {
                                                    c(cVar);
                                                }
                                            }

                                            private void b(String str, HashMap hashMap) {
                                                this.bL.a(str);
                                                boolean q2 = q(str);
                                                this.f152213m = q2;
                                                this.f152212l = q2;
                                                if (l(true) || this.aG) {
                                                    a(str, hashMap);
                                                } else if (com.ss.ttvideoengine.s.i.f(str) || str.indexOf("http") != 0) {
                                                    a(str, hashMap);
                                                } else {
                                                    this.ao.put(this.bL.f152249a, new b("", "", this.fs ? 1 : 0, this.gc ? 1 : 0, "single"));
                                                    this.eF = new String[]{str};
                                                    ao();
                                                    o(str);
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            public final void e(int i2, String str) {
                                                if (i2 == 531) {
                                                    this.fg = str;
                                                } else if (i2 == 532) {
                                                    this.fd = str;
                                                } else if (i2 == 659) {
                                                    this.hU = str;
                                                } else if (i2 == 662) {
                                                    this.gm = str;
                                                } else if (i2 != 957) {
                                                    switch (i2) {
                                                        case 538:
                                                            this.hR = str;
                                                            break;
                                                        case 539:
                                                            this.hS = str;
                                                            break;
                                                        case 540:
                                                            this.hT = str;
                                                            break;
                                                        default:
                                                            switch (i2) {
                                                                case 545:
                                                                    this.hW = str;
                                                                    break;
                                                                case 546:
                                                                    this.fe = str;
                                                                    break;
                                                                case 547:
                                                                    this.ff = str;
                                                                    break;
                                                            }
                                                    }
                                                } else if (!this.jk.contains(str)) {
                                                    this.jk.add(str);
                                                }
                                                com.ss.ttvideoengine.s.j.a("TTVideoEngine", com.a.a("set int option key:%d value:%s", new Object[]{Integer.valueOf(i2), str}));
                                            }

                                            private void b(String[] strArr, String str, String str2) {
                                                if (this.ch.a(false)) {
                                                    this.ch.a(20, 0, 0, strArr, str, str2);
                                                } else {
                                                    a(strArr, str, str2);
                                                }
                                            }

                                            private com.ss.ttvideoengine.j.o a(w wVar, int i2, Map<Integer, String> map) {
                                                com.ss.ttvideoengine.j.e eVar = this.ad;
                                                if (eVar == null || !eVar.a()) {
                                                    return null;
                                                }
                                                com.ss.ttvideoengine.j.o a2 = this.ad.a(wVar, i2, map, true);
                                                if (a2 != null) {
                                                    int a3 = this.ad.a(7);
                                                    if (a3 == com.ss.ttvideoengine.j.q.f152977b && a2.a() == com.ss.ttvideoengine.j.q.f152977b) {
                                                        this.al = a2.c();
                                                        this.bA = a2.b(32);
                                                    } else if (a3 == com.ss.ttvideoengine.j.q.f152976a && a2.a() == com.ss.ttvideoengine.j.q.f152976a) {
                                                        this.al = a2.c();
                                                        this.bA = a2.b(32);
                                                    }
                                                    this.ae.s(this.bA);
                                                    this.ae.b(d(this.al), "");
                                                }
                                                return a2;
                                            }

                                            public static void a(String str, String str2, String str3, long j2) {
                                                d.h.f152465a.a(str, str2, str3, j2);
                                            }

                                            public static w a(com.ss.ttvideoengine.j.e eVar, w wVar, int i2, com.ss.ttvideoengine.n.b.h hVar) {
                                                w a2 = com.ss.ttvideoengine.n.a.a(eVar, wVar);
                                                if (i2 == 1) {
                                                    return com.ss.ttvideoengine.n.a.b(eVar, a2);
                                                }
                                                if (i2 == 2) {
                                                    return com.ss.ttvideoengine.n.a.c(eVar, a2);
                                                }
                                                if (i2 != 3) {
                                                    return a2;
                                                }
                                                double d2 = -1.0d;
                                                if (com.ss.ttvideoengine.q.c.f153179a != null) {
                                                    d2 = (double) ((com.ss.ttvideoengine.q.c.f153179a.getPredictSpeed() / 8.0f) / 1024.0f);
                                                }
                                                return com.ss.ttvideoengine.n.a.a(eVar, a2, d2, hVar);
                                            }

                                            /* access modifiers changed from: package-private */
                                            public class b {

                                                /* renamed from: a  reason: collision with root package name */
                                                public String f152219a;

                                                /* renamed from: b  reason: collision with root package name */
                                                public String f152220b;

                                                /* renamed from: c  reason: collision with root package name */
                                                public int f152221c;

                                                /* renamed from: d  reason: collision with root package name */
                                                public int f152222d;

                                                /* renamed from: e  reason: collision with root package name */
                                                public String f152223e;

                                                static {
                                                    Covode.recordClassIndex(101460);
                                                }

                                                public b(String str, String str2, int i2, int i3, String str3) {
                                                    this.f152219a = str;
                                                    this.f152220b = str2;
                                                    this.f152221c = i2;
                                                    this.f152222d = i3;
                                                    this.f152223e = str3;
                                                }
                                            }
                                        }

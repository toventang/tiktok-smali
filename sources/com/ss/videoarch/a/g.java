package com.ss.videoarch.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.kakao.usermgmt.StringSet;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.texturerender.VideoSurface;
import com.ss.texturerender.l;
import com.ss.ttm.player.AudioProcessor;
import com.ss.ttm.player.m;
import com.ss.ttm.player.r;
import com.ss.videoarch.a.b.b;
import com.ss.videoarch.a.c;
import com.ss.videoarch.a.d.a;
import com.ss.videoarch.a.f.a;
import com.ss.videoarch.live.LiveIOWrapper;
import com.ss.videoarch.strategy.LiveStrategyManager;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {
    public static int S = 500;
    public static int T = 200;
    public static int X = 900;
    public static int Y = 600;
    private static l.a bi;
    private static int dd = -1;
    public boolean A;
    public String B;
    public int C;
    public boolean D;
    public boolean E;
    public String F;
    public int G;
    public boolean H;
    int I;
    long J;
    long K;
    public String L;
    int M;
    String N;
    public boolean O;
    public String P;
    public String Q;
    public String R;
    public int U;
    public long V;
    public boolean W;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f154310a;
    public Handler aA;
    public final Object aB;
    public volatile boolean aC;
    public int aD;
    public int aE;
    public int aF;
    public int aG;
    public int aH;
    public int aI;
    public boolean aJ;
    public boolean aK;
    public int aL;
    public boolean aM;
    public int aN;
    public int aO;
    public int aP;
    public int aQ;
    public boolean aR;
    public int aS;
    public float aT;
    public float aU;
    public float aV;
    public int aW;
    public boolean aX;
    public String aY;
    public int aZ;
    public long aa;
    public long ab;
    public long ac;
    public int ad;
    public int ae;
    public boolean af;
    public boolean ag;
    public long ah;
    public int ai;
    public boolean aj;
    public int ak;
    public boolean al;
    public boolean am;
    public int an;
    public boolean ao;
    public int ap;
    public long aq;
    public boolean ar;
    public int as;
    public long at;
    String au;
    String av;
    public long aw;
    public boolean ax;
    public int ay;
    public boolean az;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.videoarch.a.a.b f154311b;
    private int bA;
    private int bB;
    private int bC;
    private int bD;
    private int bE;
    private int bF;
    private int bG;
    private int bH;
    private int bI;
    private int bJ;
    private int bK;
    private float bL;
    private int bM;
    private float bN;
    private int bO;
    private String bP;
    private String bQ;
    private boolean bR;
    private int bS;
    private int bT;
    private int bU;
    private int bV;
    private int bW;
    private int bX;
    private int bY;
    private int bZ;
    public int ba;
    public int bb;
    private final Context bc;
    private final int bd;
    private SurfaceHolder be;
    private p bf;
    private Surface bg;
    private int bh;
    private String bj;
    private String bk;
    private String bl;
    private String bm;
    private boolean bn;
    private int bo;
    private boolean bp;
    private int bq;
    private int br;
    private int bs;
    private int bt;
    private int bu;
    private int bv;
    private int bw;
    private int bx;
    private int by;
    private int bz;

    /* renamed from: c  reason: collision with root package name */
    final c f154312c;
    private String cA;
    private boolean cB;
    private String cC;
    private String cD;
    private String cE;
    private String cF;
    private String cG;
    private int cH;
    private int cI;
    private int cJ;
    private int cK;
    private int cL;
    private int cM;
    private int cN;
    private int cO;
    private int cP;
    private int cQ;
    private int cR;
    private int cS;
    private int cT;
    private int cU;
    private int cV;
    private int cW;
    private int cX;
    private int cY;
    private int cZ;
    private int ca;
    private int cb;
    private int cc;
    private int cd;
    private int ce;
    private long cf;
    private int cg;
    private int ch;
    private int ci;
    private int cj;
    private int ck;
    private int cl;
    private int cm;
    private long cn;
    private int co;
    private int cp;
    private int cq;
    private int cr;
    private int cs;
    private Object ct;
    private f cu;
    private long cv;
    private int cw;
    private String cx;
    private String cy;
    private String cz;

    /* renamed from: d  reason: collision with root package name */
    public final a f154313d;
    private int dA;
    private int dB;
    private int dC;
    private int dD;
    private JSONObject dE;
    private int dF;
    private String dG;
    private int dH;
    private boolean dI;
    private boolean dJ;
    private String dK;
    private String dL;
    private String dM;
    private int dN;
    private int dO;
    private boolean dP;
    private boolean dQ;
    private boolean dR;
    private int dS;
    private int dT;
    private int dU;
    private int dV;
    private int dW;
    private int dX;
    private int dY;
    private int dZ;
    private long da;
    private int db;
    private int dc;
    private int de;
    private int df;
    private int dg;
    private int dh;
    private int di;
    private int dj;
    private com.ss.optimizer.live.sdk.dns.e dk;
    private int dl;
    private int dm;
    private boolean dn;

    /* renamed from: do  reason: not valid java name */
    private boolean f352do;
    private boolean dp;
    private int dq;
    private int dr;
    private int ds;
    private int dt;
    private int du;
    private int dv;
    private int dw;
    private long dx;
    private long dy;
    private int dz;

    /* renamed from: e  reason: collision with root package name */
    final b f154314e;
    private int eA;
    private float eB;
    private float eC;
    private float eD;
    private float eE;
    private float eF;
    private int eG;
    private int eH;
    private int eI;
    private int eJ;
    private int eK;
    private int eL;
    private int eM;
    private int eN;
    private int eO;
    private int eP;
    private int eQ;
    private float eR;
    private float eS;
    private float eT;
    private float eU;
    private float eV;
    private float eW;
    private float eX;
    private float eY;
    private float eZ;
    private int ea;
    private int eb;
    private int ec;
    private int ed;
    private int ee;
    private int ef;
    private int eg;
    private int eh;
    private int ei;
    private int ej;
    private int ek;
    private int el;
    private int em;
    private int en;
    private int eo;
    private int ep;
    private int eq;
    private int er;
    private int es;
    private boolean et;
    private String eu;
    private List<String> ev;
    private List<String> ew;
    private JSONObject ex;
    private boolean ey;
    private int ez;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.videoarch.a.d.a f154315f;
    private int fA;
    private String fB;
    private String fC;
    private AudioProcessor fD;
    private int fE;
    private int fF;
    private int fG;
    private int fH;
    private int fI;
    private int fJ;
    private long fK;
    private long fL;
    private boolean fM;
    private int fN;
    private int fO;
    private int fP;
    private int fQ;
    private int fR;
    private int fS;
    private b fT;
    private int fU;
    private int fV;
    private ExecutorService fW;
    private int fX;
    private int fY;
    private int fZ;
    private int fa;
    private int fb;
    private int fc;
    private int fd;
    private int fe;
    private int ff;
    private boolean fg;
    private int fh;
    private int fi;
    private int fj;
    private int fk;
    private HandlerThread fl;
    private final q fm;
    private int fn;
    private int fo;
    private int fp;
    private int fq;
    private int fr;
    private int fs;
    private int ft;
    private int fu;
    private int fv;
    private int fw;
    private String fx;
    private String fy;
    private JSONObject fz;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.videoarch.a.f.a f154316g;
    private JSONObject ga;
    private JSONObject gb;
    private int gc;
    private int gd;
    private boolean ge;
    private int gf;
    private int gg;
    private String gh;
    private JSONObject gi;
    private String gj;
    private int gk;
    private int gl;
    private int gm;
    private boolean gn;
    private Queue<Bundle> go;
    private int gp;
    private int gq;
    private int gr;
    private int gs;
    private int gt;
    private int gu;
    private int gv;
    private int gw;
    private int gx;

    /* renamed from: h  reason: collision with root package name */
    public final com.ss.videoarch.a.e.b f154317h;

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.videoarch.a.c.a f154318i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.ttm.player.m f154319j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.videoarch.a.d.c f154320k;

    /* renamed from: l  reason: collision with root package name */
    public com.ss.texturerender.m f154321l;

    /* renamed from: m  reason: collision with root package name */
    public VideoSurface f154322m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public boolean r;
    public o s;
    public c t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public String z;

    static class m implements ThreadFactory {
        static {
            Covode.recordClassIndex(102894);
        }

        private m() {
        }

        /* synthetic */ m(byte b2) {
            this();
        }

        public Thread newThread(Runnable runnable) {
            MethodCollector.i(1953);
            Thread thread = new Thread(runnable, "VideoLiveManager");
            thread.setPriority(10);
            MethodCollector.o(1953);
            return thread;
        }
    }

    public final void a(Runnable runnable, long j2) {
        this.f154310a.postDelayed(runnable, j2);
    }

    public final void a(SurfaceHolder surfaceHolder) {
        f("setSurfaceHolder");
        this.f154313d.b("setSurfaceHolder: ".concat(String.valueOf(surfaceHolder)));
        if (!(this.be == null || this.bf == null)) {
            new StringBuilder("remove callback:").append(this.bf).append(", surfaceholder:").append(surfaceHolder).append(", mSurface:").append(this.bg).append(", mSurfaceHolder:").append(this.be);
            this.bf.f154373a.clear();
            this.be.removeCallback(this.bf);
            this.bf = null;
        }
        this.be = surfaceHolder;
        if (this.f154319j != null) {
            this.f154311b.bf = System.currentTimeMillis();
            if (this.be != null) {
                if (this.bf == null) {
                    p pVar = new p(this);
                    this.bf = pVar;
                    this.be.addCallback(pVar);
                }
                a(this.be.getSurface());
            }
            this.f154311b.be = System.currentTimeMillis() - this.f154311b.bf;
        }
    }

    public final void a(Surface surface) {
        VideoSurface videoSurface;
        f("setSurface");
        this.f154313d.b("setSurface: ".concat(String.valueOf(surface)));
        this.bg = surface;
        if (!(surface == null || (videoSurface = this.f154322m) == null || this.f154321l == null)) {
            videoSurface.a(surface);
        }
        if (this.f154319j != null) {
            this.f154311b.bf = System.currentTimeMillis();
            if (this.n != 1 || this.f154322m == null) {
                this.f154319j.a(surface);
            } else {
                this.f154311b.bj = true;
                this.f154319j.a(this.f154322m);
            }
            this.f154311b.be = System.currentTimeMillis() - this.f154311b.bf;
        }
    }

    public final void a(com.ss.optimizer.live.sdk.dns.e eVar) {
        this.dk = eVar;
        this.f154311b.z = this.f352do;
    }

    public final void a(com.ss.videoarch.a.c.c[] cVarArr) {
        f("setPlayURLS");
        this.f154318i.a(cVarArr);
        this.ak = 0;
        if (this.bQ != null && this.f154318i.f().f154253a != this.bQ) {
            l("setPlayURLs");
        }
    }

    public final boolean a(String str) {
        VideoSurface videoSurface;
        f("playResolution");
        if (this.t == c.PAUSED && (videoSurface = this.f154322m) != null) {
            videoSurface.a(false);
        }
        if (this.f154318i.f154226b != 2 || this.s != o.PREPARED) {
            return false;
        }
        if (this.P.equals(str)) {
            return true;
        }
        this.f154316g.a();
        this.cw = -1;
        this.C = 0;
        this.f154311b.a(this.bQ, "none", "setting_" + this.P + "_to_" + str, 0);
        this.f154311b.bO = "manual_abr_" + this.P + "_to_" + str;
        S();
        this.P = str;
        if (this.F.equals("abr_bb_4live") || (this.F.equals("rad") && !str.equals("auto"))) {
            String a2 = this.f154318i.a(this.P.equals("auto") ? this.f154318i.a() : this.P, this.R, this.Q);
            if (TextUtils.isEmpty(a2)) {
                return false;
            }
            v();
            this.f154311b.d();
            t();
            this.W = true;
            d();
            f();
            this.f154311b.f154198h = a2;
            this.al = true;
            this.f154311b.cT = System.currentTimeMillis();
            e(a2);
        }
        return true;
    }

    public final void a(boolean z2) {
        com.ss.videoarch.a.a.b bVar = this.f154311b;
        if (bVar != null) {
            if (bVar.f154201k && !z2) {
                this.f154311b.dF = System.currentTimeMillis();
            }
            this.f154311b.f154201k = z2;
        }
    }

    public final void a() {
        this.dp = true;
        this.f154311b.aX = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x057b  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0620  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0629  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x063b  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0664  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0674  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x068b  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0694  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x06ab  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x06b6  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0739  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0749  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0754  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0772  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x077f  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0788  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0791  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x07a3  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x07ac  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x07b5  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x07be  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x07c7  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x07d0  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x07d9  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x07ee  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x07f5  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x082c  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0849  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x08ab  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x08ba  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x08c3  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x08cc  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x08d5  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x08e5  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x08f3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0266  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void C() {
        /*
        // Method dump skipped, instructions count: 2304
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.g.C():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0ac5, code lost:
        if (r0 == 1) goto L_0x0ca2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void F() {
        /*
        // Method dump skipped, instructions count: 3287
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.g.F():void");
    }

    public final void a(int i2, String str) {
        com.ss.videoarch.a.c.a aVar;
        if (i2 == 26) {
            this.z = str;
            if (this.f154319j != null) {
                String sb = new StringBuilder().append(System.currentTimeMillis()).toString();
                this.bP = sb;
                this.f154319j.a(17, sb);
                this.f154319j.a(14, 1);
                this.f154319j.a(str);
            }
        } else if (i2 == 43) {
            S();
            this.P = str;
            if (this.f154319j != null && (aVar = this.f154318i) != null && aVar.f154226b == 2) {
                long c2 = this.f154318i.c(this.P, this.Q);
                if (c2 > 0) {
                    this.f154319j.a(650, (int) c2);
                    this.f154311b.cM = 1;
                }
            }
        } else if (i2 == 60) {
            this.R = str;
            this.f154311b.b(str, str);
            if (this.f154319j == null) {
                return;
            }
            if (this.R.equals("avph") || this.R.equals("cmaf")) {
                this.f154319j.a(315, str);
            }
        } else if (i2 == 81) {
            this.fB = str;
        } else if (i2 == 86) {
            this.av = str;
            I();
        } else if (i2 == 89) {
            this.fC = str;
        } else if (i2 != 91) {
            switch (i2) {
                case 63:
                    this.f154311b.f154195e = str;
                    return;
                case 64:
                    this.f154311b.f154196f = str;
                    return;
                case 65:
                    this.F = str;
                    return;
                case 66:
                    if (str.equals("tcp") || str.equals("quic")) {
                        this.cA = str;
                    }
                    this.dR = true;
                    return;
                default:
                    switch (i2) {
                        case 72:
                            this.bj = str;
                            return;
                        case 73:
                            this.bk = str;
                            return;
                        case 74:
                            this.bl = str;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            i(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r6, int r7) {
        /*
        // Method dump skipped, instructions count: 834
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.g.a(int, int):void");
    }

    public final long a(int i2, long j2) {
        com.ss.ttm.player.m mVar;
        if (i2 == 0) {
            com.ss.ttm.player.m mVar2 = this.f154319j;
            return mVar2 != null ? (mVar2.a(63, 0L) * 8) / 1000 : j2;
        } else if (i2 == 68) {
            com.ss.ttm.player.m mVar3 = this.f154319j;
            return mVar3 != null ? (mVar3.a(63, 0L) * 8) / 1000 : j2;
        } else if (i2 == 78) {
            com.ss.ttm.player.m mVar4 = this.f154319j;
            return mVar4 != null ? (long) mVar4.b(379, 0) : j2;
        } else if (i2 == 79) {
            return (long) this.ff;
        } else {
            if (i2 != 98) {
                return (i2 == 99 && (mVar = this.f154319j) != null) ? (long) mVar.b(157, -1) : j2;
            }
            com.ss.ttm.player.m mVar5 = this.f154319j;
            return mVar5 != null ? (long) mVar5.b(141, -1) : j2;
        }
    }

    public final void a(int i2, float f2) {
        if (i2 != 19) {
            if (i2 == 20 && this.dD != 1) {
                this.bN = f2;
                com.ss.ttm.player.m mVar = this.f154319j;
                if (mVar != null) {
                    mVar.a(191, f2);
                    this.f154311b.I = f2;
                }
            }
        } else if (this.dD != 1) {
            this.bL = f2;
            com.ss.ttm.player.m mVar2 = this.f154319j;
            if (mVar2 != null) {
                mVar2.a(80, f2);
                this.f154311b.G = f2;
            }
        }
    }

    private void a(boolean z2, String str) {
        if (this.t == c.PLAYED || this.t == c.PAUSED) {
            if (z2) {
                d();
            } else {
                this.s = o.INITIALIZED;
            }
            k(str);
            this.t = c.STOPPED;
            this.ay = 0;
            this.ap = 0;
            this.aL = 0;
            this.aZ = 0;
            this.gn = false;
            this.ge = false;
            this.gp = -1;
            this.f154311b.cJ = -1;
            this.f154311b.cK = -1.0f;
            this.f154311b.cL = -1.0f;
            this.f154311b.ec.clear();
            this.ev = null;
            this.ew = null;
            return;
        }
        this.f154311b.b(str);
        this.f154313d.b("illegal call: " + str + " -- " + this.gm);
    }

    public final void a(Boolean bool) {
        this.f154317h.a(bool.booleanValue());
        this.f154311b.cJ = bool.booleanValue() ? 1 : 0;
    }

    public final void a(com.ss.videoarch.a.a.c cVar) {
        com.ss.ttm.player.m mVar;
        if (cVar != null && (mVar = this.f154319j) != null) {
            cVar.f154211d = mVar.a(68, -1L);
            cVar.t = this.f154319j.a(318, -1L);
            cVar.Q = this.f154319j.a(345, -1L);
            cVar.R = this.f154319j.a(346, -1L);
            cVar.f154213f = this.f154319j.a(69, -1L);
            cVar.f154214g = this.f154319j.a(70, -1L);
            cVar.f154215h = this.f154319j.a(75, -1L);
            cVar.f154216i = this.f154319j.a(76, -1L);
            cVar.f154217j = this.f154319j.a(77, -1L);
            cVar.f154218k = this.f154319j.a(78, -1L);
            cVar.p = this.f154319j.a(155, -1L);
            cVar.q = this.f154319j.a(162, -1L);
            cVar.r = this.f154319j.a(156, -1L);
            cVar.s = this.f154319j.a(163, -1L);
            cVar.aa = (this.f154319j.a(63, 0L) * 8) / 1000;
            cVar.ad = this.f154319j.a(73, 0L);
            cVar.ac = this.f154319j.a(72, 0L);
            cVar.aw = this.P;
            cVar.ao = this.f154319j.a(458, 0L);
            cVar.ap = this.f154319j.a(459, 0L);
            cVar.aq = this.f154319j.o();
            cVar.ar = this.f154319j.a(624, 0L);
            cVar.as = this.f154319j.a(338, 0L);
            cVar.at = this.f154319j.a(336, 0L);
            cVar.au = this.f154319j.a(337, 0L);
            cVar.M = this.f154319j.a(341, -1L);
            cVar.N = this.f154319j.a(343, -1L);
            cVar.O = this.f154319j.a(342, -1L);
            cVar.P = this.f154319j.a(344, -1L);
            cVar.S = this.f154319j.a(821, 0L);
            cVar.T = this.f154319j.a(822, 0L);
            cVar.U = this.f154319j.a(45, 0L);
        }
    }

    public final void a(com.ss.videoarch.a.a.c cVar, int i2) {
        com.ss.ttm.player.m mVar;
        if (!(cVar == null || (mVar = this.f154319j) == null)) {
            cVar.aD = mVar.b(466, 0);
            cVar.aC = this.f154319j.b(465, -1);
            cVar.aW = this.f154319j.b(349, 0);
            if (TextUtils.equals(this.cA, "h2") || TextUtils.equals(this.cA, "h2q") || TextUtils.equals(this.cA, "h2qu")) {
                cVar.aI = this.f154319j.b(945, -1);
                cVar.aJ = this.f154319j.b(947, -1);
            }
            if (i2 == 0 || i2 == 2) {
                cVar.f154211d = this.f154319j.a(68, -1L);
                cVar.t = this.f154319j.a(318, -1L);
                cVar.Q = this.f154319j.a(345, -1L);
                cVar.R = this.f154319j.a(346, -1L);
                cVar.U = this.f154319j.a(45, 0L);
                if (this.fj == 1 && this.gx == 1) {
                    cVar.aY = ((Integer) LiveStrategyManager.inst().getConfigAndStrategyByKeyInt(0, 16, -1, null)).intValue();
                }
                if (!TextUtils.isEmpty(this.cA) && (this.cA.equals("quic") || this.cA.equals("quicu"))) {
                    String c2 = this.f154319j.c(946);
                    if (!TextUtils.isEmpty(c2)) {
                        cVar.az = c2;
                    }
                    cVar.aG = this.f154319j.b(355, -1);
                    cVar.aE = this.f154319j.b(351, -1);
                }
                if (!TextUtils.isEmpty(this.cA) && (this.cA.equals("quic") || this.cA.equals("quicu") || this.cA.equals("h2q") || this.cA.equals("h2qu"))) {
                    cVar.aB = this.f154319j.b(948, -1);
                    String c3 = this.f154319j.c(949);
                    if (!TextUtils.isEmpty(c3)) {
                        cVar.aA = c3;
                    }
                }
                String str = this.R;
                if (str != null && (str.equals("cmaf") || this.R.equals("avph"))) {
                    cVar.E = this.f154319j.a(264, -1L);
                    cVar.F = this.f154319j.a(267, -1L);
                    cVar.C = this.f154319j.a(265, -1L);
                    cVar.D = this.f154319j.a(268, -1L);
                    cVar.H = this.f154319j.a(269, -1L);
                    cVar.G = this.f154319j.a(266, -1L);
                    cVar.I = this.f154319j.a(272, -1L);
                    cVar.J = this.f154319j.a(273, -1L);
                    cVar.K = this.f154319j.a(274, -1L);
                    cVar.L = this.f154319j.a(275, -1L);
                    if (this.R.equals("cmaf")) {
                        cVar.u = this.f154319j.a(457, -1L);
                        cVar.v = this.f154319j.a(450, -1L);
                        cVar.x = this.f154319j.a(451, -1L);
                        cVar.z = this.f154319j.a(452, -1L);
                        cVar.y = this.f154319j.a(456, -1L);
                        cVar.A = this.f154319j.a(453, -1L);
                        cVar.B = this.f154319j.a(454, -1L);
                        cVar.w = this.f154319j.a(455, -1L);
                    }
                }
                if (w()) {
                    cVar.aO = this.f154319j.a(806, -1L);
                    cVar.aP = this.f154319j.a(807, -1L);
                    cVar.aQ = this.f154319j.a(808, -1L);
                    cVar.aR = this.f154319j.a(809, -1L);
                }
                cVar.f154213f = this.f154319j.a(69, -1L);
                cVar.f154214g = this.f154319j.a(70, -1L);
                cVar.f154215h = this.f154319j.a(75, -1L);
                cVar.f154216i = this.f154319j.a(76, -1L);
                cVar.f154217j = this.f154319j.a(77, -1L);
                cVar.f154218k = this.f154319j.a(78, -1L);
                cVar.p = this.f154319j.a(155, -1L);
                cVar.q = this.f154319j.a(162, -1L);
                cVar.r = this.f154319j.a(156, -1L);
                cVar.s = this.f154319j.a(163, -1L);
                cVar.aa = (this.f154319j.a(63, 0L) * 8) / 1000;
                cVar.ad = this.f154319j.a(73, 0L);
                cVar.ac = this.f154319j.a(72, 0L);
                cVar.aw = this.P;
                cVar.ao = this.f154319j.a(458, 0L);
                cVar.ap = this.f154319j.a(459, 0L);
                cVar.aq = this.f154319j.o();
                cVar.ar = this.f154319j.a(624, 0L);
                cVar.as = this.f154319j.a(338, 0L);
                cVar.at = this.f154319j.a(336, 0L);
                cVar.au = this.f154319j.a(337, 0L);
                cVar.M = this.f154319j.a(341, -1L);
                cVar.N = this.f154319j.a(343, -1L);
                cVar.O = this.f154319j.a(342, -1L);
                cVar.P = this.f154319j.a(344, -1L);
                cVar.S = this.f154319j.a(821, 0L);
                cVar.T = this.f154319j.a(822, 0L);
                if (i2 == 0) {
                    cVar.aV = this.f154319j.b(518, -1);
                    cVar.ae = cVar.aa;
                    cVar.af = cVar.ac;
                    cVar.ag = cVar.ad;
                    cVar.ai = this.f154319j.b(25, -1);
                    cVar.av = this.f154315f.c();
                    cVar.n = this.f154319j.a(210, -1L);
                    cVar.f154219l = System.currentTimeMillis();
                    cVar.ab = this.f154319j.b(931, 0);
                    cVar.f154212e = this.f154319j.a(970, 0L);
                    String c4 = this.f154319j.c(335);
                    if (c4 != null) {
                        String[] split = c4.split("\r\n");
                        for (String str2 : split) {
                            if (str2.startsWith("X-Server-Ip: ")) {
                                cVar.ax = str2.split(": ", 2)[1];
                            } else if (str2.startsWith("Via: ")) {
                                cVar.ay = str2.split(": ", 2)[1];
                            }
                        }
                    }
                }
                if (!this.w && i2 == 2) {
                    cVar.ah = this.f154319j.a(314, 0L);
                } else if (i2 == 0) {
                    cVar.aH = this.f154319j.b(352, -1);
                }
                if (this.aM) {
                    if (i2 == 0) {
                        this.fT.a();
                    }
                    if (this.fT.f154354a != -1) {
                        cVar.f154211d = this.fT.f154354a;
                    }
                    if (this.fT.f154355b != -1) {
                        cVar.f154213f = this.fT.f154355b;
                    }
                    if (this.fT.f154356c != -1) {
                        cVar.f154214g = this.fT.f154356c;
                    }
                    if (this.cA.equals("quic") || this.cA.equals("quicu")) {
                        if (i2 == 0) {
                            cVar.aH = (int) LiveIOWrapper.getInstance().getLongValueByStr(this.aY, 1106);
                        }
                        cVar.aG = (int) LiveIOWrapper.getInstance().getLongValueByStr(this.aY, 1105);
                        cVar.aF = (int) LiveIOWrapper.getInstance().getLongValueByStr(this.aY, 1106);
                        cVar.aE = (int) LiveIOWrapper.getInstance().getLongValueByStr(this.aY, 1107);
                    }
                }
            } else if (i2 == 1) {
                cVar.U = this.f154319j.a(45, 0L);
                cVar.V = this.f154319j.a(46, 0L);
                cVar.Z = this.f154319j.b(150);
                cVar.aa = (this.f154319j.a(63, 0L) * 8) / 1000;
                cVar.ad = this.f154319j.a(73, 0L);
                cVar.ac = this.f154319j.a(72, 0L);
                cVar.Y = (long) this.f154319j.k();
                cVar.W = System.currentTimeMillis();
                cVar.av = this.f154315f.c();
                cVar.aw = this.P;
                if (w()) {
                    cVar.aS = this.f154319j.c(810);
                    String str3 = cVar.aS;
                    if (!TextUtils.isEmpty(str3)) {
                        try {
                            JSONObject jSONObject = new JSONObject(str3);
                            if (jSONObject.has("video_codec_impl_name")) {
                                String optString = jSONObject.optString("video_codec_impl_name");
                                if (!TextUtils.isEmpty(optString)) {
                                    if ("MediaCodec".equals(optString)) {
                                        this.f154311b.D = "hardware_codec";
                                        this.f154311b.C = true;
                                    } else {
                                        this.f154311b.D = "software_codec";
                                        this.f154311b.C = false;
                                    }
                                }
                            }
                            if (jSONObject.has("video_codec_name")) {
                                String optString2 = jSONObject.optString("video_codec_name");
                                if (!TextUtils.isEmpty(optString2)) {
                                    if ("ByteVC1".equalsIgnoreCase(optString2)) {
                                        this.f154311b.B = "bytevc1";
                                    } else {
                                        this.f154311b.B = "h264";
                                    }
                                }
                            }
                            if (jSONObject.has("video_recv_media_bps")) {
                                cVar.aa = jSONObject.getLong("video_recv_media_bps") / 1000;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } else if (i2 == 3) {
                cVar.Z = this.f154319j.b(150);
                cVar.aa = (this.f154319j.a(63, 0L) * 8) / 1000;
                cVar.ad = this.f154319j.a(73, 0L);
                cVar.aw = this.P;
            } else if (i2 == 4) {
                cVar.ad = this.f154319j.a(73, 0L);
                cVar.ac = this.f154319j.a(72, 0L);
            } else if (i2 == 5) {
                cVar.aL = this.f154319j.a(73, -1L);
                cVar.aK = this.f154319j.a(72, -1L);
            } else if (i2 == 6) {
                cVar.aN = this.f154319j.a(73, -1L);
                cVar.aM = this.f154319j.a(72, -1L);
            } else if (i2 == 7) {
                int b2 = this.f154319j.b(61, -1);
                int b3 = this.f154319j.b(62, -1);
                if (b2 == 1) {
                    if (b3 == 1) {
                        cVar.aT = 2;
                    } else {
                        cVar.aT = 1;
                    }
                } else if (b3 == 1) {
                    cVar.aT = 0;
                }
                if (!TextUtils.isEmpty(this.cA) && (this.cA.equals("quic") || this.cA.equals("quicu"))) {
                    String c5 = this.f154319j.c(946);
                    if (!TextUtils.isEmpty(c5)) {
                        cVar.az = c5;
                    }
                    cVar.aG = this.f154319j.b(355, -1);
                    cVar.aE = this.f154319j.b(351, -1);
                }
                if (!TextUtils.isEmpty(this.cA) && (this.cA.equals("quic") || this.cA.equals("quicu") || this.cA.equals("h2q") || this.cA.equals("h2qu"))) {
                    cVar.aB = this.f154319j.b(948, -1);
                    String c6 = this.f154319j.c(949);
                    if (!TextUtils.isEmpty(c6)) {
                        cVar.aA = c6;
                    }
                }
            } else if (i2 == 8) {
                String c7 = this.f154319j.c(147);
                if (c7 != null) {
                    cVar.aU = o(c7);
                }
            } else if (i2 == 9) {
                String c8 = this.f154319j.c(710);
                if (!TextUtils.isEmpty(c8)) {
                    cVar.aX = n(c8);
                }
            }
            if (cVar.aF == -1) {
                cVar.aF = this.f154319j.b(352, -1);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x05d2  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x073d  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x07a0  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x07cd  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0816  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x081d  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0826 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0827  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0838 A[SYNTHETIC, Splitter:B:264:0x0838] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
        // Method dump skipped, instructions count: 2155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.g.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final String a(String str, boolean z2) {
        List<String> list;
        String str2;
        if (this.gq != 1) {
            return str;
        }
        if ((!TextUtils.equals(this.cA, "quic") && !TextUtils.equals(this.cA, "quicu") && !TextUtils.equals(this.cA, "h2q") && !TextUtils.equals(this.cA, "h2qu")) || !com.ss.videoarch.a.d.a.a(str)) {
            return str;
        }
        if (z2) {
            list = this.ev;
        } else {
            list = this.ew;
        }
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                str2 = it.next();
                if (!com.ss.videoarch.a.d.a.a(str2)) {
                    break;
                }
                it.remove();
            }
        }
        str2 = str;
        return str2.equals(str) ? "" : str2;
    }

    public final boolean a(int i2) {
        if (this.Q.equals("main")) {
            String a2 = this.f154318i.a(this.P.equals("auto") ? this.f154318i.a() : this.P, "flv", "backup");
            if (!TextUtils.isEmpty(a2)) {
                v();
                this.f154311b.d();
                t();
                this.W = true;
                this.f154311b.a(this.bQ, a2, "main_to_backup", i2);
                this.f154311b.f154198h = a2;
                this.bQ = a2;
                this.Q = "backup";
                z();
                B();
                this.f154316g.a();
                f();
                this.fK = System.currentTimeMillis();
                this.ey = true;
                e(a2);
                this.C = 0;
                return true;
            }
        } else if (this.Q.equals("backup")) {
            String a3 = this.f154318i.a(this.P.equals("auto") ? this.f154318i.a() : this.P, "flv", "main");
            if (!TextUtils.isEmpty(a3)) {
                v();
                this.f154311b.d();
                t();
                this.W = true;
                this.f154311b.a(this.bQ, a3, "backup_to_main", i2);
                this.f154311b.f154198h = a3;
                this.bQ = a3;
                this.Q = "main";
                z();
                B();
                this.f154316g.a();
                f();
                this.fK = System.currentTimeMillis();
                this.ey = true;
                e(a3);
                this.C = 0;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.a.g$g  reason: collision with other inner class name */
    public static final class C4107g implements m.e {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<g> f154362a;

        static {
            Covode.recordClassIndex(102888);
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.ss.ttm.player.m.e
        public final boolean a(com.ss.ttm.player.m mVar, int i2, int i3) {
            String str;
            boolean z;
            int i4;
            g gVar = this.f154362a.get();
            if (gVar == null || gVar.f154319j == null) {
                return false;
            }
            if (i2 != -268435437) {
                if (i2 != 3) {
                    if (i2 == 251658247) {
                        gVar.f154311b.J++;
                        StringBuilder sb = new StringBuilder();
                        com.ss.videoarch.a.a.b bVar = gVar.f154311b;
                        StringBuilder append = sb.append(bVar.K).append(",");
                        double d2 = (double) i3;
                        Double.isNaN(d2);
                        double d3 = d2 / 1000.0d;
                        bVar.K = append.append(d3).append(":").append(System.currentTimeMillis()).toString();
                        if (gVar.f154311b.L.equals("none")) {
                            gVar.f154311b.L = (System.currentTimeMillis() - gVar.f154311b.a(101, 0)) + ":" + d3;
                            return false;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        com.ss.videoarch.a.a.b bVar2 = gVar.f154311b;
                        bVar2.L = sb2.append(bVar2.L).append(",").append(System.currentTimeMillis() - gVar.f154311b.a(101, 0)).append(":").append(d3).toString();
                        return false;
                    } else if (i2 == 701) {
                        gVar.C++;
                        gVar.t();
                        gVar.D = true;
                        gVar.f154313d.b();
                        if (!gVar.v) {
                            gVar.aa = System.currentTimeMillis();
                            gVar.f154311b.a(i3, false);
                        } else {
                            gVar.f154311b.a(i3, true);
                            if (gVar.r) {
                                com.ss.videoarch.a.b.b.a(7213, gVar.f154311b.Y, i3);
                            }
                            if (gVar.aM) {
                                LiveIOWrapper.getInstance().setInt64ValueByStrKey(1003, gVar.aY, (long) i3);
                            }
                        }
                        if (gVar.E && gVar.f154318i.f154226b == 2) {
                            if (!gVar.F.equals("rad") || gVar.C < gVar.G) {
                                if (gVar.F.equals("abr_bb_4live") && gVar.P.equals("auto") && gVar.as == 3 && gVar.C >= gVar.G) {
                                    if (gVar.f154319j == null) {
                                        return false;
                                    }
                                    gVar.f154319j.a(545, 1);
                                    return false;
                                }
                            } else if (gVar.r()) {
                                return false;
                            }
                        }
                        if (gVar.O) {
                            return false;
                        }
                        if (gVar.an == 1 && gVar.f154319j.a(530, -1L) == 0 && gVar.f154319j.a(531, -1L) == 0) {
                            gVar.am = true;
                        }
                        gVar.f154316g.a(true, gVar.am);
                        return false;
                    } else if (i2 != 702) {
                        switch (i2) {
                            case -268435442:
                                gVar.f154311b.a((long) i3, g.X, true);
                                return false;
                            case -268435441:
                                gVar.f154311b.a((long) i3, g.X, false);
                                return false;
                            case -268435440:
                                gVar.f154311b.b((long) i3, g.Y, true);
                                return false;
                            case -268435439:
                                gVar.f154311b.b((long) i3, g.Y, false);
                                return false;
                            default:
                                switch (i2) {
                                    case -268435424:
                                        gVar.f154311b.a((long) i3, true);
                                        return false;
                                    case -268435423:
                                        gVar.f154311b.a((long) i3, false);
                                        return false;
                                    default:
                                        String str2 = null;
                                        switch (i2) {
                                            case -268435407:
                                                System.currentTimeMillis();
                                                gVar.f154311b.dL = System.currentTimeMillis();
                                                gVar.f154311b.dM = (long) i3;
                                                return false;
                                            case -268435406:
                                                System.currentTimeMillis();
                                                long currentTimeMillis = System.currentTimeMillis();
                                                long j2 = ((long) i3) - gVar.f154311b.dM;
                                                long j3 = currentTimeMillis - gVar.f154311b.dL;
                                                if (j2 <= ((long) gVar.aO)) {
                                                    return false;
                                                }
                                                gVar.f154311b.dN++;
                                                gVar.f154311b.dO++;
                                                gVar.f154311b.dP += j3;
                                                gVar.f154311b.dQ += j3;
                                                gVar.f154311b.dR += j2;
                                                gVar.f154311b.dS += j2;
                                                try {
                                                    str2 = new JSONObject().put("start_time", gVar.f154311b.dL).put("end_time", currentTimeMillis).put("start_pts", gVar.f154311b.dM).put("end_pts", i3).put("info", gVar.f154319j.c(825)).toString();
                                                } catch (JSONException e2) {
                                                    e2.printStackTrace();
                                                }
                                                if (((long) (gVar.f154311b.dW.length() + str2.length())) < ((long) gVar.f154311b.dU)) {
                                                    gVar.f154311b.dW += str2;
                                                }
                                                if (((long) (gVar.f154311b.dV.length() + str2.length())) >= ((long) gVar.f154311b.dT)) {
                                                    return false;
                                                }
                                                gVar.f154311b.dV += str2;
                                                return false;
                                            default:
                                                switch (i2) {
                                                    case 251658249:
                                                        int i5 = i3 / 1000;
                                                        if (!gVar.E || !gVar.F.equals("abr_bb_4live") || gVar.f154318i.f154226b != 2) {
                                                            return false;
                                                        }
                                                        com.ss.videoarch.a.c.a aVar = gVar.f154318i;
                                                        long j4 = (long) i5;
                                                        String str3 = gVar.Q;
                                                        if (aVar.f154226b == 2 && aVar.f154225a != null) {
                                                            str2 = aVar.f154225a.a(j4, str3);
                                                        }
                                                        if (TextUtils.isEmpty(str2) && gVar.f154311b.cz == 1 && j4 == gVar.at / 1000) {
                                                            str2 = "origin";
                                                        }
                                                        String a2 = gVar.f154318i.a();
                                                        if (a2 == null || a2.equals(str2)) {
                                                            return false;
                                                        }
                                                        if (str2 != null) {
                                                            gVar.f154311b.bO = "abr_" + gVar.f154318i.a() + "_to_" + str2;
                                                            gVar.f154318i.b(str2);
                                                            gVar.f154311b.bC = str2;
                                                            String replace = gVar.f154318i.a(gVar.P, gVar.R, gVar.Q).replace("mem://llash/", "");
                                                            gVar.f154311b.cF = gVar.f154318i.a(str2, gVar.R, gVar.Q) + "&llash=" + replace;
                                                        } else {
                                                            gVar.f154311b.bO = "none";
                                                        }
                                                        gVar.f154311b.bG++;
                                                        StringBuilder sb3 = new StringBuilder();
                                                        com.ss.videoarch.a.a.b bVar3 = gVar.f154311b;
                                                        bVar3.bH = sb3.append(bVar3.bH).append(",").append(i5).append(":").append(System.currentTimeMillis()).toString();
                                                        gVar.f154311b.bK = (gVar.f154319j.a(63, 0L) * 8) / 1000;
                                                        gVar.f154311b.bL = gVar.f154319j.a(73, 0L);
                                                        gVar.f154311b.bM = gVar.f154319j.a(72, 0L);
                                                        gVar.f154311b.bN = gVar.f154319j.a(930, -1L);
                                                        com.ss.videoarch.a.a.b bVar4 = gVar.f154311b;
                                                        if (!(bVar4.f154194d == null || bVar4.f154192b == null)) {
                                                            try {
                                                                JSONObject b2 = bVar4.b();
                                                                b2.put("event_key", "abr_switch").put("auto_switch", 1).put("target_resoultion", str2).put("predict_bitrate", j4).put("abr_switch_info", bVar4.bO).put("cur_download_speed", bVar4.bK).put("cur_audio_buffer_time", bVar4.bL).put("cur_video_buffer_time", bVar4.bM).put("stall_count", bVar4.ad).put("switch_cost", bVar4.bN).put("use_expect_bitrate", bVar4.cM);
                                                                bVar4.cM = 0;
                                                                bVar4.f154192b.a(b2, "live_client_monitor_log");
                                                                if (bVar4.ac > 0) {
                                                                    bVar4.ac++;
                                                                }
                                                            } catch (JSONException e3) {
                                                                e3.printStackTrace();
                                                            }
                                                        }
                                                        if (!gVar.aM) {
                                                            return false;
                                                        }
                                                        LiveIOWrapper.getInstance().setInt64ValueByStrKey(1104, gVar.aY, -1);
                                                        return false;
                                                    case 251658250:
                                                        gVar.f154311b.a((long) i3, g.T, false, true);
                                                        return false;
                                                    case 251658251:
                                                        gVar.f154311b.a((long) i3, g.S, true, true);
                                                        return false;
                                                    case 251658252:
                                                        long a3 = gVar.f154319j.a(628, -1L);
                                                        com.ss.videoarch.a.a.b bVar5 = gVar.f154311b;
                                                        bVar5.f154193c.f154220m = a3;
                                                        if (bVar5.cQ == 1) {
                                                            bVar5.cV = a3;
                                                        }
                                                        if (gVar.f154319j.b(62, -1) != 0) {
                                                            return false;
                                                        }
                                                        break;
                                                    case 251658253:
                                                        gVar.f154311b.am++;
                                                        return false;
                                                    default:
                                                        return false;
                                                }
                                        }
                                }
                        }
                    } else {
                        gVar.D = false;
                        gVar.f154313d.c();
                        gVar.f154316g.a(false, gVar.am);
                        if (gVar.v && gVar.f154311b.ae) {
                            gVar.f154311b.b(1);
                        } else if (!gVar.v && gVar.aa != 0) {
                            gVar.ab = System.currentTimeMillis() - gVar.aa;
                        }
                        if (gVar.r) {
                            com.ss.videoarch.a.b.b.a(7214, gVar.f154311b.Y, i3);
                        }
                        if (!gVar.aM) {
                            return false;
                        }
                        LiveIOWrapper.getInstance().setInt64ValueByStrKey(1004, gVar.aY, (long) i3);
                        return false;
                    }
                }
                if (gVar.aD == 1 && gVar.aF == 0 && gVar.aH > 0) {
                    gVar.aH = 0;
                }
                if (gVar.o == 1 && gVar.f154322m != null && !gVar.az) {
                    float b3 = gVar.f154319j.b(151);
                    gVar.f154311b.bk = b3;
                    if (gVar.f154318i.a(gVar.f154311b.aM, gVar.f154311b.aN, b3)) {
                        gVar.ax = true;
                    } else {
                        gVar.ax = false;
                    }
                }
                String c2 = gVar.f154319j.c(142);
                com.ss.videoarch.a.a.b bVar6 = gVar.f154311b;
                if (c2 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(c2);
                        if (jSONObject.has("sdk_version")) {
                            bVar6.f154203m = jSONObject.getString("sdk_version");
                        }
                        if (jSONObject.has("platform")) {
                            bVar6.n = jSONObject.getString("platform");
                        }
                        if (jSONObject.has("os_version")) {
                            bVar6.o = jSONObject.getString("os_version");
                        }
                        if (jSONObject.has("model")) {
                            bVar6.p = jSONObject.getString("model");
                        }
                        if (jSONObject.has("start_time")) {
                            bVar6.q = jSONObject.getString("start_time");
                        }
                        if (jSONObject.has("is_hardware_encode")) {
                            bVar6.r = jSONObject.getInt("is_hardware_encode");
                        }
                        if (jSONObject.has("min_bitrate")) {
                            bVar6.s = jSONObject.getInt("min_bitrate");
                        }
                        if (jSONObject.has("max_bitrate")) {
                            bVar6.t = jSONObject.getInt("max_bitrate");
                        }
                        if (jSONObject.has("default_bitrate")) {
                            bVar6.u = jSONObject.getInt("default_bitrate");
                        }
                        if (jSONObject.has("hit_node_optimize")) {
                            bVar6.v = jSONObject.getInt("hit_node_optimize");
                        }
                        if (jSONObject.has("push_protocol")) {
                            bVar6.w = jSONObject.getString("push_protocol");
                        }
                        if (jSONObject.has("qId")) {
                            bVar6.x = jSONObject.getString("qId");
                        }
                        if (jSONObject.has("link_info")) {
                            bVar6.y = jSONObject.getString("link_info");
                        }
                        if (jSONObject.has("h_id")) {
                            bVar6.cN = jSONObject.getInt("h_id");
                        }
                        if (jSONObject.has("s_id")) {
                            bVar6.cO = jSONObject.getInt("s_id");
                        }
                    } catch (JSONException e4) {
                        e4.printStackTrace();
                    }
                }
                int b4 = gVar.f154319j.b(141, -1);
                if (b4 == 0) {
                    gVar.f154311b.B = "h264";
                } else if (b4 == 1) {
                    gVar.f154311b.B = "bytevc1";
                }
                int b5 = gVar.f154319j.b(157, -1);
                com.ss.videoarch.a.a.b bVar7 = gVar.f154311b;
                switch (b5) {
                    case 1:
                        str = "IOSHWCodec";
                        break;
                    case 2:
                        str = "hardware_codec";
                        break;
                    case 3:
                        str = "ff_H264_codec";
                        break;
                    case 4:
                        str = "ff_ByteVC1_codec";
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        str = "KS_ByteVC1_codec";
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        str = "JX_ByteVC1_codec";
                        break;
                    default:
                        str = "none_codec";
                        break;
                }
                bVar7.D = str;
                gVar.f154311b.d(0);
                gVar.D = false;
                if (gVar.n == 1 && gVar.f154322m != null) {
                    gVar.f154311b.bl = System.currentTimeMillis();
                }
                if (gVar.aL == 1) {
                    gVar.f154311b.cS = true;
                    gVar.f154311b.cU = System.currentTimeMillis();
                    if (!(gVar.f154311b.cR == null || gVar.f154319j == null)) {
                        gVar.f154311b.cR.ae = (gVar.f154319j.a(63, 0L) * 8) / 1000;
                        gVar.f154311b.cR.af = gVar.f154319j.a(72, 0L);
                        gVar.f154311b.cR.ag = gVar.f154319j.a(73, 0L);
                    }
                }
                if (gVar.aM) {
                    LiveIOWrapper.getInstance().setInt64ValueByStrKey(1007, gVar.aY, System.currentTimeMillis());
                }
                if (!gVar.v) {
                    if (gVar.n != 1 || gVar.f154322m == null || gVar.aK) {
                        gVar.f154311b.b(gVar.ab);
                        gVar.f154311b.a();
                        gVar.v = true;
                        gVar.f154313d.a();
                    }
                    if (gVar.r) {
                        i4 = -1;
                        com.ss.videoarch.a.b.b.a(8015, gVar.f154311b.Y, -1);
                    } else {
                        i4 = -1;
                    }
                    if (gVar.f154311b.f154201k) {
                        if (gVar.r) {
                            com.ss.videoarch.a.b.b.a(8016, gVar.f154311b.Y, i4);
                        }
                        if (gVar.aM) {
                            LiveIOWrapper.getInstance().setInt64ValueByStrKey(1006, gVar.aY, -1);
                        }
                    }
                } else if (gVar.ar && gVar.W) {
                    gVar.f154313d.a();
                    if (gVar.al) {
                        gVar.al = false;
                    } else {
                        gVar.f154311b.c(0);
                        if (gVar.f154311b.ae) {
                            gVar.f154313d.c();
                            gVar.f154311b.b(2);
                        }
                        gVar.s();
                    }
                    if (gVar.f154311b.aq) {
                        com.ss.videoarch.a.a.b bVar8 = gVar.f154311b;
                        bVar8.aq = false;
                        System.currentTimeMillis();
                        if (bVar8.ar != 0) {
                            bVar8.as++;
                            bVar8.at += System.currentTimeMillis() - bVar8.ar;
                        }
                    }
                }
                if (gVar.f154311b.eq == 1) {
                    z = false;
                    gVar.f154311b.eq = 0;
                } else {
                    z = false;
                }
                gVar.ar = true;
                gVar.W = z;
                gVar.f154316g.a();
                return false;
            }
            com.ss.videoarch.a.a.b bVar9 = gVar.f154311b;
            long j5 = (long) i3;
            JSONObject b6 = bVar9.b();
            if (b6 == null) {
                return false;
            }
            try {
                b6.put("event_key", "pts_back").put(StringSet.type, DataType.AUDIO).put("pts_back_diff", j5);
                bVar9.f154192b.a(b6, "live_client_monitor_log");
                return false;
            } catch (JSONException e5) {
                e5.printStackTrace();
                return false;
            }
        }

        public C4107g(g gVar) {
            this.f154362a = new WeakReference<>(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private com.ss.ttm.player.m f154366a;

        static {
            Covode.recordClassIndex(102892);
        }

        public final void run() {
            com.ss.ttm.player.m mVar = this.f154366a;
            if (mVar != null) {
                try {
                    mVar.d();
                    this.f154366a = null;
                } catch (Exception unused) {
                }
            }
        }

        public k(com.ss.ttm.player.m mVar) {
            this.f154366a = mVar;
        }
    }

    private void A() {
        this.aD = 0;
        this.aE = 0;
        com.ss.videoarch.a.c.a aVar = this.f154318i;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void f() {
        com.ss.ttm.player.m mVar = this.f154319j;
        if (mVar != null) {
            mVar.h();
        }
        this.s = o.INITIALIZED;
    }

    public final boolean j() {
        com.ss.ttm.player.m mVar = this.f154319j;
        if (mVar == null || !mVar.a()) {
            return false;
        }
        return true;
    }

    public final int k() {
        com.ss.ttm.player.m mVar = this.f154319j;
        if (mVar != null) {
            return mVar.m();
        }
        return 0;
    }

    public final int l() {
        com.ss.ttm.player.m mVar = this.f154319j;
        if (mVar != null) {
            return mVar.l();
        }
        return 0;
    }

    public final String m() {
        return this.f154319j.c(5002);
    }

    public final JSONObject n() {
        com.ss.videoarch.a.a.b bVar = this.f154311b;
        if (bVar == null) {
            return null;
        }
        return bVar.h();
    }

    public final int q() {
        com.ss.ttm.player.m mVar = this.f154319j;
        if (mVar != null) {
            return mVar.b(25, -1);
        }
        return -1;
    }

    public final boolean w() {
        if (this.aD == 1 && this.aF == 0) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        String str = this.B;
        if (str == null || !str.startsWith("[")) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(102873);
    }

    private boolean L() {
        if (this.f154318i.f154226b != 2 || !this.F.equals("abr_bb_4live") || !this.P.equals("auto")) {
            return false;
        }
        return true;
    }

    private void R() {
        if (this.f154321l != null) {
            VideoSurface videoSurface = this.f154322m;
            if (videoSurface != null) {
                videoSurface.release();
                this.f154322m = null;
            }
            this.f154321l = null;
        }
    }

    private void S() {
        com.ss.videoarch.a.a.b bVar;
        String str;
        if (this.t != c.IDLE && (bVar = this.f154311b) != null) {
            if (this.P.equals("auto")) {
                str = this.f154311b.bC;
            } else {
                str = this.P;
            }
            bVar.bD = str;
        }
    }

    public final boolean o() {
        if (this.o != 1 || this.f154322m == null || this.p || !this.ax || this.f154311b.bh != 0) {
            return false;
        }
        return true;
    }

    public final boolean p() {
        if (this.aP != 1 || this.f154322m == null || !this.aR || this.f154311b.bh != 0) {
            return false;
        }
        return true;
    }

    public final boolean u() {
        VideoSurface videoSurface = this.f154322m;
        if (videoSurface == null || videoSurface.c(15, -1) != 1) {
            return false;
        }
        return true;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Context f154340a;

        /* renamed from: b  reason: collision with root package name */
        public a f154341b;

        /* renamed from: c  reason: collision with root package name */
        String f154342c;

        /* renamed from: d  reason: collision with root package name */
        public c f154343d;

        /* renamed from: e  reason: collision with root package name */
        public b f154344e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f154345f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f154346g;

        /* renamed from: h  reason: collision with root package name */
        public int f154347h;

        /* renamed from: i  reason: collision with root package name */
        public int f154348i;

        /* renamed from: j  reason: collision with root package name */
        String f154349j;

        /* renamed from: k  reason: collision with root package name */
        String f154350k;

        /* renamed from: l  reason: collision with root package name */
        boolean f154351l;

        /* renamed from: m  reason: collision with root package name */
        boolean f154352m;
        public long n;
        public long o;
        public long p;
        public long q;
        public ExecutorService r;

        static {
            Covode.recordClassIndex(102882);
        }

        public final g a() {
            if (this.f154340a == null) {
                throw new IllegalArgumentException("mContext should not be null");
            } else if (this.f154341b == null) {
                throw new IllegalArgumentException("mListener should not be null");
            } else if (this.f154343d != null) {
                return new g(this, (byte) 0);
            } else {
                throw new IllegalArgumentException("mNetworkClient should not be null");
            }
        }

        private a(Context context) {
            this.f154347h = 60000;
            this.f154348i = 1;
            this.f154349j = "origin";
            this.f154350k = "flv";
            this.f154352m = true;
            this.n = 10000;
            this.o = 60000;
            this.p = 5000;
            this.q = 8000;
            this.f154340a = context;
        }

        /* synthetic */ a(Context context, byte b2) {
            this(context);
        }
    }

    /* access modifiers changed from: package-private */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public long f154354a;

        /* renamed from: b  reason: collision with root package name */
        public long f154355b;

        /* renamed from: c  reason: collision with root package name */
        public long f154356c;

        static {
            Covode.recordClassIndex(102883);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f154354a = LiveIOWrapper.getInstance().getLongValueByStr(g.this.aY, 1101);
            this.f154355b = LiveIOWrapper.getInstance().getLongValueByStr(g.this.aY, 1102);
            this.f154356c = LiveIOWrapper.getInstance().getLongValueByStr(g.this.aY, 1103);
        }

        private b() {
            this.f154354a = -1;
            this.f154355b = -1;
            this.f154356c = -1;
        }

        /* synthetic */ b(g gVar, byte b2) {
            this();
        }
    }

    public enum c {
        IDLE,
        PLAYED,
        PAUSED,
        STOPPED;

        static {
            Covode.recordClassIndex(102884);
        }
    }

    public enum o {
        IDLE,
        INITIALIZED,
        PREPARING,
        PREPARED;

        static {
            Covode.recordClassIndex(102896);
        }
    }

    private void I() {
        this.f154311b.cC = true;
        if ((this.f154318i.f154226b != 2 || this.f154318i.c(this.Q)) && !this.fW.isShutdown()) {
            this.fW.submit(new Runnable() {
                /* class com.ss.videoarch.a.g.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(102875);
                }

                public final void run() {
                    String c2;
                    g gVar = g.this;
                    if (!TextUtils.isEmpty(gVar.au) && !TextUtils.isEmpty(gVar.av) && !gVar.av.equals(gVar.P) && gVar.f154319j != null && (c2 = gVar.f154319j.c(335)) != null) {
                        String str = null;
                        String[] split = c2.split("\r\n");
                        for (String str2 : split) {
                            if (str2.startsWith("X-Has-Token: ")) {
                                str = str2.split(": ", 2)[1];
                            }
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (!TextUtils.isEmpty(gVar.f154311b.Y)) {
                                jSONObject.put("live_stream_session_id", gVar.f154311b.Y);
                            }
                            String a2 = gVar.f154318i.a(gVar.av, "flv", gVar.Q);
                            if (!TextUtils.isEmpty(a2)) {
                                jSONObject.put("play_url", a2);
                                if (!TextUtils.isEmpty(str)) {
                                    jSONObject.put("token", str);
                                }
                                String substring = a2.substring(a2.indexOf("//") + 2);
                                String substring2 = substring.substring(substring.indexOf("/"));
                                if (!gVar.au.startsWith("/")) {
                                    gVar.au = "/" + gVar.au;
                                }
                                c.a b2 = gVar.f154312c.b(a2.substring(0, a2.indexOf(substring2)) + gVar.au, jSONObject.toString());
                                if (b2 != null) {
                                    gVar.f154311b.cD = b2.f154233d;
                                    if (b2.f154233d == 200 && b2.f154230a.has("code")) {
                                        gVar.f154311b.cD = b2.f154230a.optInt("code");
                                        if (gVar.f154311b.cD == 0) {
                                            gVar.P = gVar.av;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    private void O() {
        MethodCollector.i(646);
        synchronized (this.aB) {
            try {
                Handler handler = this.aA;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.aA = null;
                }
                HandlerThread handlerThread = this.fl;
                if (handlerThread != null) {
                    handlerThread.quit();
                    this.fl = null;
                }
                this.aC = false;
            } finally {
                MethodCollector.o(646);
            }
        }
    }

    public final void g() {
        String str;
        if (this.dk != null) {
            try {
                Class<?> cls = Class.forName("com.ss.optimizer.live.sdk.dns.a");
                if (cls != null) {
                    Method method = cls.getMethod("getCurrentNetWorkType", new Class[0]);
                    method.setAccessible(true);
                    str = (String) method.invoke(this.dk, new Object[0]);
                    String str2 = this.cz;
                    if (str2 != "none" && !str2.equals(str)) {
                        this.cB = true;
                    }
                    this.cz = str;
                }
            } catch (Throwable unused) {
            }
        }
        str = "none";
        String str22 = this.cz;
        this.cB = true;
        this.cz = str;
    }

    public final void s() {
        if ((this.D || this.W) && this.cZ == 1) {
            if (this.da != -1) {
                this.f154311b.a((long) ((int) (System.currentTimeMillis() - this.da)), 0, false, false);
            }
            if (this.V != -1) {
                this.f154311b.a((long) ((int) (System.currentTimeMillis() - this.V)), 0, true, false);
            }
        }
    }

    public final void t() {
        if (!this.W && !this.D) {
            if (this.U == 0 || this.f154322m == null) {
                this.V = this.f154319j.a(320, -1L);
                this.da = this.f154319j.a(319, -1L);
            }
        }
    }

    public final void v() {
        long a2 = this.f154319j.a(45, 0L);
        this.f154311b.bS += a2;
        long j2 = this.f154311b.bR;
        if (!this.f154311b.bQ) {
            com.ss.videoarch.a.a.b bVar = this.f154311b;
            bVar.bR = a2 - bVar.f154193c.U;
            this.f154311b.bQ = true;
            return;
        }
        this.f154311b.bR = a2 + j2;
    }

    static final class l implements a.AbstractC4105a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<g> f154367a;

        static {
            Covode.recordClassIndex(102893);
        }

        @Override // com.ss.videoarch.a.f.a.AbstractC4105a
        public final void c() {
            String str;
            g gVar = this.f154367a.get();
            if (gVar != null && gVar.f154319j != null) {
                gVar.W = true;
                gVar.d();
                gVar.aF = 1;
                gVar.f154311b.cm = 1;
                gVar.f154318i.b();
                if (!gVar.v) {
                    if (gVar.aG == 1) {
                        gVar.aG = 0;
                        gVar.f154311b.cl = 0;
                    }
                    gVar.f154311b.cw = 1;
                } else {
                    gVar.f154311b.cw = 2;
                }
                String str2 = null;
                if (gVar.f154318i.f154226b == 1) {
                    str2 = gVar.f154318i.g();
                } else if (gVar.f154318i.f154226b == 2) {
                    if (gVar.P.equals("auto")) {
                        str = gVar.f154318i.a();
                    } else {
                        str = gVar.P;
                    }
                    str2 = gVar.f154318i.a(str, gVar.R, gVar.Q);
                }
                gVar.f154311b.f154198h = str2;
                if (gVar.s == o.PREPARED) {
                    gVar.e(str2);
                    return;
                }
                gVar.f();
                gVar.e(str2);
            }
        }

        @Override // com.ss.videoarch.a.f.a.AbstractC4105a
        public final void a() {
            String str;
            g gVar = this.f154367a.get();
            if (gVar != null && gVar.f154319j != null) {
                gVar.v();
                gVar.f154311b.d();
                gVar.t();
                gVar.W = true;
                if (!gVar.w) {
                    gVar.w = true;
                    gVar.f154311b.a(gVar.f154319j.a(314, 0L));
                }
                gVar.d();
                String str2 = null;
                if (gVar.f154318i.f154226b == 1) {
                    if (gVar.f154318i.f() != null) {
                        str2 = gVar.f154318i.f().f154253a;
                    }
                } else if (gVar.f154318i.f154226b == 2) {
                    if (gVar.P.equals("auto")) {
                        str = gVar.f154318i.a();
                    } else {
                        str = gVar.P;
                    }
                    str2 = gVar.f154318i.a(str, gVar.R, gVar.Q);
                }
                gVar.f154311b.f154198h = str2;
                gVar.ac = System.currentTimeMillis();
                gVar.f154311b.cT = System.currentTimeMillis();
                if (gVar.s == o.PREPARED) {
                    gVar.e(str2);
                    return;
                }
                gVar.f();
                gVar.e(str2);
            }
        }

        @Override // com.ss.videoarch.a.f.a.AbstractC4105a
        public final void b() {
            String str;
            g gVar = this.f154367a.get();
            if (gVar != null && gVar.f154319j != null) {
                gVar.v();
                gVar.f154311b.d();
                gVar.t();
                gVar.W = true;
                String str2 = null;
                if (gVar.f154318i.f154226b == 1) {
                    str2 = gVar.f154318i.g();
                } else if (gVar.f154318i.f154226b == 2) {
                    if (gVar.P.equals("auto")) {
                        str = gVar.f154318i.a();
                    } else {
                        str = gVar.P;
                    }
                    str2 = gVar.f154318i.a(str, gVar.R, gVar.Q);
                }
                gVar.f154311b.f154198h = str2;
                if (!gVar.w) {
                    gVar.w = true;
                    gVar.f154311b.a(gVar.f154319j.a(314, 0L));
                }
                gVar.d();
                gVar.f154311b.cT = System.currentTimeMillis();
                if (gVar.s == o.PREPARED) {
                    gVar.e(str2);
                    return;
                }
                gVar.f();
                gVar.e(str2);
            }
        }

        public l(g gVar) {
            this.f154367a = new WeakReference<>(gVar);
        }

        @Override // com.ss.videoarch.a.f.a.AbstractC4105a
        public final void a(com.ss.videoarch.a.a.a aVar) {
            g gVar = this.f154367a.get();
            if (gVar != null && gVar.f154319j != null) {
                gVar.f154313d.a(aVar);
                gVar.f154320k.a();
                gVar.f154316g.a();
            }
        }
    }

    private void N() {
        MethodCollector.i(645);
        synchronized (this.aB) {
            try {
                if (!this.aC) {
                    if (this.fl == null) {
                        HandlerThread handlerThread = new HandlerThread("stallCounter");
                        this.fl = handlerThread;
                        handlerThread.start();
                    }
                    if (this.aA == null) {
                        this.aA = new Handler(this.fl.getLooper());
                    }
                    this.aA.post(this.fm);
                    this.aC = true;
                    MethodCollector.o(645);
                }
            } finally {
                MethodCollector.o(645);
            }
        }
    }

    private void y() {
        com.ss.videoarch.a.c.a aVar = this.f154318i;
        if (aVar != null) {
            String b2 = aVar.b(this.P, this.Q);
            if (!TextUtils.isEmpty(b2)) {
                try {
                    JSONObject jSONObject = new JSONObject(b2);
                    if (jSONObject.has("ForceDecodeSwitch")) {
                        this.cH = jSONObject.optInt("ForceDecodeSwitch");
                    }
                    if (jSONObject.has("ForceDecodeMsGaps")) {
                        this.cI = jSONObject.optInt("ForceDecodeMsGaps");
                    }
                    if (jSONObject.has("ForceRenderMsGaps")) {
                        this.cJ = jSONObject.optInt("ForceRenderMsGaps");
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final void c() {
        this.f154313d.b("stop start -- " + this.gm);
        f("stop");
        a(true, "stop");
        R();
        this.f154316g.f154306g = false;
        this.f154313d.b("stop end-- " + this.gm);
    }

    public final void d() {
        String str;
        if (this.f154319j != null && (this.s == o.PREPARED || this.s == o.PREPARING)) {
            com.ss.videoarch.a.a.b bVar = this.f154311b;
            if (bVar != null) {
                bVar.f();
                this.f154311b.g();
                if (this.M == 1 || this.cg == 1) {
                    this.f154311b.j();
                }
            }
            if (this.t != c.PAUSED) {
                this.f154319j.i();
                g();
            } else {
                this.f154319j.h();
            }
        }
        if (this.r && (str = this.L) != null) {
            com.ss.videoarch.a.b.b.a(8018, str, 0);
        }
        if (this.aM && this.aY != null) {
            if (this.f154311b.f154201k) {
                LiveIOWrapper.getInstance().setInt64ValueByStrKey(1006, this.aY, -1);
            }
            if (!this.v) {
                this.fT.a();
            }
            LiveIOWrapper.getInstance().notifyFinish(this.aY, (String) null);
        }
        this.s = o.INITIALIZED;
    }

    public final void e() {
        f("reset");
        if (this.f154319j != null) {
            l("reset");
            this.f154311b.e();
            this.bP = null;
            this.z = null;
            this.E = false;
            this.fg = false;
            this.H = true;
            this.o = 0;
            this.n = 0;
            this.ap = 0;
            this.P = "origin";
            this.cw = -1;
            this.R = "flv";
            this.cA = "tcp";
            this.cx = "none";
            this.cy = "none";
            this.Q = "main";
            this.N = null;
            this.O = false;
            this.bO = 0;
            this.bJ = -1;
            this.cD = "";
            this.dP = false;
            this.v = false;
            this.es = 0;
            this.aD = 0;
            this.aE = 0;
        }
    }

    public final void h() {
        this.f154313d.b("release start -- " + this.gm);
        f("release");
        if (this.t == c.PLAYED || this.t == c.PAUSED) {
            a(true, "release");
        }
        R();
        this.fW.shutdown();
        this.f154310a.removeCallbacksAndMessages(null);
        com.ss.ttm.player.m mVar = this.f154319j;
        if (mVar != null) {
            mVar.c();
            this.f154319j.d();
            this.f154319j = null;
            this.f154311b.e();
            this.s = o.IDLE;
            this.t = c.IDLE;
            this.aY = null;
            this.f154313d.b("release end -- " + this.gm);
            this.gm = -1;
        }
    }

    /* access modifiers changed from: package-private */
    public class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        String f154368a;

        /* renamed from: b  reason: collision with root package name */
        boolean f154369b;

        /* renamed from: d  reason: collision with root package name */
        private final WeakReference<g> f154371d;

        static {
            Covode.recordClassIndex(102895);
        }

        public final void run() {
            String str;
            long j2;
            g gVar = this.f154371d.get();
            if (gVar != null && (str = this.f154368a) != null && !str.isEmpty()) {
                if (!this.f154369b && !this.f154368a.equals(gVar.L)) {
                    return;
                }
                if (this.f154369b && !this.f154368a.equals(gVar.aY)) {
                    return;
                }
                if (gVar.t != c.PLAYED) {
                    a(500);
                    return;
                }
                g gVar2 = this.f154371d.get();
                if (gVar2 != null) {
                    long a2 = gVar2.f154319j.a(73, -1L);
                    long a3 = gVar2.f154319j.a(605, -1L);
                    long a4 = gVar2.f154319j.a(603, -1L);
                    if (a2 >= 0) {
                        j2 = a2 + 0;
                    } else {
                        j2 = 0;
                    }
                    if (a3 >= 0) {
                        j2 += a3;
                    }
                    if (a4 >= 0) {
                        j2 += a4;
                    }
                    if (j2 >= 0 && j2 != -1) {
                        if (!this.f154369b || g.this.aN != 1) {
                            com.ss.videoarch.a.b.b.a(7215, gVar.L, (int) j2);
                        } else {
                            LiveIOWrapper.getInstance().setInt64ValueByStrKey(1002, gVar.aY, (long) ((int) j2));
                        }
                        if (j2 > 5000) {
                            a(500);
                            return;
                        } else {
                            a(300);
                            return;
                        }
                    }
                }
                a(500);
            }
        }

        private void a(long j2) {
            g gVar = this.f154371d.get();
            if (gVar != null) {
                gVar.a(new n(gVar, this.f154368a, this.f154369b), j2);
            }
        }

        public n(g gVar, String str, boolean z) {
            this.f154371d = new WeakReference<>(gVar);
            this.f154368a = str;
            this.f154369b = z;
        }
    }

    private void B() {
        String str;
        String e2;
        com.ss.videoarch.a.c.a aVar = this.f154318i;
        if (this.P.equals("auto")) {
            str = this.f154318i.a();
        } else {
            str = this.P;
        }
        String a2 = aVar.a(str, this.R, this.Q);
        if (a2 != null) {
            this.f154311b.bp = a2;
            if (a2.startsWith("http")) {
                this.cA = "tcp";
            }
            if (a2.startsWith("httpk")) {
                this.cA = "kcp";
            }
            if (a2.startsWith("https")) {
                this.cA = "tls";
            }
            this.cC = this.cA;
        }
        com.ss.videoarch.a.c.a aVar2 = this.f154318i;
        String str2 = this.P;
        String str3 = this.Q;
        String str4 = null;
        if (aVar2.f154225a == null) {
            e2 = null;
        } else {
            e2 = aVar2.f154225a.e(str2, str3);
        }
        this.cx = e2;
        com.ss.videoarch.a.c.a aVar3 = this.f154318i;
        String str5 = this.P;
        String str6 = this.Q;
        if (aVar3.f154225a != null) {
            str4 = aVar3.f154225a.f(str5, str6);
        }
        this.cy = str4;
        String str7 = this.cx;
        if (str7 != null) {
            boolean z2 = true;
            if (str4 == null || str4.equals(this.cz)) {
                if ((this.cx.equals("quic") || this.cx.equals("quicu") || this.cx.equals("h2") || this.cx.equals("h2q") || this.cx.equals("h2qu")) && !this.dJ) {
                    try {
                        d.a("ttquic");
                        this.dJ = true;
                        this.f154311b.bo = 1;
                    } catch (Throwable unused) {
                        str7 = this.cA;
                        this.dJ = false;
                        this.f154311b.bo = 0;
                    }
                }
                this.cA = str7;
                z2 = false;
            }
            this.f154311b.bs = z2;
        }
        if (!TextUtils.isEmpty(this.cx) && !TextUtils.isEmpty(this.cA) && !TextUtils.isEmpty(this.cy)) {
            this.f154311b.a(this.cx, this.cA, this.cy);
        }
    }

    private void D() {
        String str;
        this.f154311b.a(this.cx, this.cA, this.cy);
        this.f154311b.f154202l = this.f154318i.b(this.P, this.Q);
        com.ss.ttm.player.m mVar = this.f154319j;
        if (!(mVar == null || (str = this.R) == null)) {
            mVar.a(315, str);
        }
        com.ss.ttm.player.m mVar2 = this.f154319j;
        if (mVar2 != null && this.eA == 1) {
            mVar2.a(302, 1);
            float f2 = this.eB;
            if (f2 != -1.0f) {
                this.f154319j.a(303, f2);
            }
            float f3 = this.eC;
            if (f3 != -1.0f) {
                this.f154319j.a(304, f3);
            }
            float f4 = this.eD;
            if (f4 != -1.0f) {
                this.f154319j.a(305, f4);
            }
            float f5 = this.eE;
            if (f5 != -1.0f) {
                this.f154319j.a(306, f5);
            }
            int i2 = this.eG;
            if (i2 != -1) {
                this.f154319j.a(643, i2);
                this.f154311b.V = this.eG;
            }
            float f6 = this.eF;
            if (f6 != -1.0f) {
                this.f154319j.a(645, f6);
                this.f154311b.W = this.eF;
            }
            this.f154311b.U = 1;
        }
    }

    private void J() {
        if (this.f154318i != null) {
            if (!this.P.equals("auto") || (this.F.equals("abr_bb_4live") && this.E)) {
                com.ss.videoarch.a.c.a aVar = this.f154318i;
                boolean z2 = this.fg;
                if (aVar.f154225a != null) {
                    aVar.f154225a.f154243d = z2;
                }
                if (this.E && this.f154318i.f154226b == 2 && this.F.equals("abr_bb_4live")) {
                    String a2 = this.f154318i.a();
                    if (!TextUtils.isEmpty(a2)) {
                        if (this.fg || !a2.equals("origin")) {
                            h(a2);
                        } else {
                            h("uhd");
                        }
                    }
                    if (!this.f154318i.c(this.Q)) {
                        this.P = this.f154318i.a();
                        this.F = "rad";
                        this.E = false;
                        if (!this.f154318i.c(this.Q)) {
                            this.f154311b.cA = 1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            String a3 = this.f154318i.a();
            this.P = a3;
            if (TextUtils.isEmpty(a3)) {
                this.P = "origin";
            }
            this.F = "rad";
            this.E = false;
        }
    }

    private void K() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        boolean z2;
        com.ss.videoarch.a.c.a aVar = this.f154318i;
        if (aVar.f154226b != 2 || aVar.f154225a == null) {
            jSONObject = null;
        } else {
            jSONObject = aVar.f154225a.a();
        }
        if (jSONObject != null) {
            boolean z3 = true;
            this.bR = true;
            try {
                if (jSONObject.has("enable")) {
                    if (jSONObject.optInt("enable") == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.E = z2;
                }
                if (jSONObject.has("strategy")) {
                    this.F = jSONObject.getString("strategy");
                }
                if (jSONObject.has("enable_origin_resolution")) {
                    if (jSONObject.optInt("enable_origin_resolution") != 1) {
                        z3 = false;
                    }
                    this.fg = z3;
                }
                if (jSONObject.has("disable_algorithm")) {
                    this.fG = jSONObject.optInt("disable_algorithm");
                }
                if (jSONObject.has("demotion") && (jSONObject2 = jSONObject.getJSONObject("demotion")) != null && jSONObject2.has("stall_count")) {
                    this.G = jSONObject2.getInt("stall_count");
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
                this.bR = false;
                this.E = false;
                this.F = "rad";
                this.fg = false;
                this.G = 4;
            }
        } else {
            this.bR = false;
            this.E = false;
            this.fg = false;
            this.F = "rad";
            this.G = 4;
        }
    }

    private void P() {
        this.f154319j.a(159, this.cK);
        this.f154319j.a(653, this.cY);
        this.f154319j.a(655, this.cL);
        this.f154319j.a(656, this.cM);
        this.f154319j.a(326, this.cN);
        this.f154319j.a(327, this.cO);
        this.f154319j.a(328, this.cP);
        this.f154319j.a(329, this.cQ);
        this.f154319j.a(330, this.cR);
        this.f154319j.a(331, this.cS);
        this.f154319j.a(332, this.cU);
        this.f154319j.a(712, this.cT);
        this.f154319j.a(711, this.cV);
        this.f154319j.a(713, this.cW);
        this.f154319j.a(714, this.cX);
        String str = new String();
        String str2 = new String();
        if (this.cF.equals("only_audio=1")) {
            str = a(str, "only_audio", "1");
        }
        if (this.cE.equals("only_video=1")) {
            str2 = a(str2, "only_video", "1");
        }
        this.f154319j.a(376, str);
        this.f154319j.a(377, str2);
        String str3 = this.dL;
        if (str3 != null) {
            this.f154319j.a(941, str3);
        }
    }

    public final void i() {
        this.f154313d.b("releaseAsync start -- " + this.gm);
        f("releaseAsync");
        if (this.t == c.PLAYED || this.t == c.PAUSED) {
            a(false, "releaseAsync");
        }
        this.fW.shutdown();
        this.f154310a.removeCallbacksAndMessages(null);
        com.ss.ttm.player.m mVar = this.f154319j;
        if (mVar != null) {
            if ((this.n != 1 || this.f154322m == null) && this.be != null) {
                mVar.a((SurfaceHolder) null);
            }
            R();
            com.ss.ttm.player.m mVar2 = this.f154319j;
            this.f154319j = null;
            this.f154311b.e();
            this.s = o.IDLE;
            this.t = c.IDLE;
            com.ss.videoarch.a.g.a.a(new k(mVar2));
            this.f154313d.b("releaseAsync end -- " + this.gm);
        }
    }

    public final boolean r() {
        String a2;
        if (this.P == "ld") {
            return false;
        }
        if (this.cw == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= e.f154288a.length) {
                    break;
                } else if (e.f154288a[i2].equals(this.P)) {
                    this.cw = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        int i3 = this.cw + 1;
        while (i3 < e.f154288a.length) {
            com.ss.videoarch.a.c.a aVar = this.f154318i;
            String str = e.f154288a[i3];
            if (aVar.f154226b == 2 && aVar.f154225a != null && aVar.f154225a.d(str)) {
                break;
            }
            i3++;
        }
        if (i3 >= e.f154288a.length || (a2 = this.f154318i.a(e.f154288a[i3], this.R, this.Q)) == null) {
            return false;
        }
        String str2 = this.bQ;
        this.bQ = a2;
        this.cw = i3;
        S();
        com.ss.videoarch.a.a.b bVar = this.f154311b;
        String str3 = e.f154288a[i3];
        this.P = str3;
        bVar.bB = str3;
        this.f154311b.a(str2, this.bQ, "auto_" + this.f154311b.bD + "_to_" + this.P, -100015);
        a aVar2 = this.f154313d;
        if (aVar2 != null) {
            aVar2.c(this.P);
        }
        this.f154311b.f154198h = this.bQ;
        this.C = 0;
        e(a2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public class q implements Runnable {
        static {
            Covode.recordClassIndex(102898);
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x015f A[Catch:{ all -> 0x0178 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 386
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.g.q.run():void");
        }

        private q() {
        }

        /* synthetic */ q(g gVar, byte b2) {
            this();
        }
    }

    private void G() {
        String b2 = this.f154318i.b(this.P, this.Q);
        if (b2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(b2);
                if (jSONObject.has("NetworkAdapt")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString("NetworkAdapt"));
                    if (jSONObject2.has("Enabled")) {
                        int optInt = jSONObject2.optInt("Enabled");
                        this.bO = optInt;
                        if (optInt == 1) {
                            this.bJ = 0;
                        }
                        if (jSONObject2.has("HurryTime")) {
                            int optInt2 = jSONObject2.optInt("HurryTime");
                            this.bK = optInt2;
                            this.f154319j.a(15, optInt2);
                            this.f154311b.F = this.bK;
                        }
                        if (jSONObject2.has("HurryMillisecond")) {
                            int optInt3 = jSONObject2.optInt("HurryMillisecond");
                            this.bK = optInt3;
                            this.f154319j.a(397, optInt3);
                            this.f154311b.F = this.bK;
                        }
                        if (jSONObject2.has("HurrySpeed")) {
                            float parseFloat = Float.parseFloat(jSONObject2.optString("HurrySpeed"));
                            this.bL = parseFloat;
                            this.f154319j.a(80, parseFloat);
                            this.f154311b.G = this.bL;
                        }
                        if (jSONObject2.has("SlowTime")) {
                            int optInt4 = jSONObject2.optInt("SlowTime");
                            this.bM = optInt4;
                            this.f154319j.a(BuildConfig.VERSION_CODE, optInt4);
                            this.f154311b.H = this.bM;
                        }
                        if (jSONObject2.has("SlowMillisecond")) {
                            int optInt5 = jSONObject2.optInt("SlowMillisecond");
                            this.bM = optInt5;
                            this.f154319j.a(398, optInt5);
                            this.f154311b.H = this.bM;
                        }
                        if (jSONObject2.has("SlowSpeed")) {
                            float parseFloat2 = Float.parseFloat(jSONObject2.optString("SlowSpeed"));
                            this.bN = parseFloat2;
                            this.f154319j.a(191, parseFloat2);
                            this.f154311b.I = this.bN;
                        }
                    }
                }
                if (jSONObject.has("FastOpenDuration")) {
                    dd = jSONObject.optInt("FastOpenDuration");
                }
                if (jSONObject.has("EnableLowLatencyFLV")) {
                    int optInt6 = jSONObject.optInt("EnableLowLatencyFLV");
                    this.dD = optInt6;
                    if (optInt6 == 1) {
                        if (this.fj == 1 && this.fk == 1) {
                            b(this.dE);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("stallTotalCount", (int) this.f154311b.ad);
                            jSONObject3.put("retryTotalCount", this.f154311b.al);
                            this.dy = ((Long) LiveStrategyManager.inst().getConfigAndStrategyByKeyInt(0, 12, Long.valueOf(this.dy), jSONObject3.toString())).longValue();
                            return;
                        }
                    } else if (optInt6 != 1) {
                        return;
                    }
                    if (this.dk != null) {
                        b(this.dE);
                        this.dy = ((Long) this.dk.a("live_start_play_buffer_thres", Long.valueOf(this.dy), (int) this.f154311b.ad, this.f154311b.al)).longValue();
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    private void H() {
        int i2;
        int i3;
        if (this.v && (i3 = this.es) == 1) {
            this.f154319j.a(532, i3);
        }
        if (this.eN == 1) {
            this.f154311b.ck = 1;
            this.f154319j.a(533, this.eN);
            this.f154319j.a(534, this.eO);
        }
        int i4 = this.as;
        if (i4 >= 0) {
            this.f154319j.a(535, i4);
        }
        int i5 = this.eP;
        if (i5 > 0) {
            this.f154319j.a(543, i5);
        }
        this.f154319j.a(544, this.eQ);
        float f2 = this.eR;
        if (f2 > 0.0f) {
            this.f154319j.a(177, f2);
        }
        float f3 = this.eS;
        if (f3 > 0.0f) {
            this.f154319j.a(178, f3);
        }
        if (this.fd == 1) {
            this.f154319j.a(546, 1);
            if (!TextUtils.isEmpty(this.f154311b.bx)) {
                try {
                    JSONObject jSONObject = new JSONObject(this.f154311b.bx);
                    if (jSONObject.has("recommend_bitrate")) {
                        this.f154319j.a(547, jSONObject.optInt("recommend_bitrate"));
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        float f4 = this.eT;
        if (f4 > 0.0f) {
            this.f154319j.a(990, f4);
        }
        float f5 = this.eU;
        if (f5 > 0.0f) {
            this.f154319j.a(991, f5);
        }
        float f6 = this.eV;
        if (f6 > 0.0f) {
            this.f154319j.a(992, f6);
        }
        float f7 = this.eW;
        if (f7 > 0.0f) {
            this.f154319j.a(993, f7);
        }
        float f8 = this.eX;
        if (f8 > 0.0f) {
            this.f154319j.a(994, f8);
        }
        float f9 = this.eY;
        if (f9 > 0.0f) {
            this.f154319j.a(995, f9);
        }
        float f10 = this.eZ;
        if (f10 > 0.0f) {
            this.f154319j.a(998, f10);
        }
        int i6 = this.fa;
        if (i6 > 0) {
            this.f154319j.a(996, i6);
        }
        int i7 = this.fb;
        if (i7 > 0) {
            this.f154319j.a(999, i7);
        }
        com.ss.ttm.player.m mVar = this.f154319j;
        if (!this.v) {
            i2 = this.fc;
        } else {
            i2 = -1;
        }
        mVar.a(997, i2);
    }

    private void M() {
        boolean z2;
        boolean z3;
        Class<?> cls;
        boolean z4;
        boolean z5 = false;
        if (this.bd != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        r.a(1, z2);
        if (this.bd == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        r.a(2, z3);
        r.a(6, false);
        r.a(11, true);
        com.ss.ttm.player.m mVar = this.f154319j;
        if (mVar != null) {
            boolean a2 = mVar.a();
            if (this.bd == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (a2 ^ z4) {
                this.f154319j.e();
                this.f154319j = null;
            }
        }
        if (this.f154319j == null) {
            this.f154319j = com.ss.videoarch.a.e.a.a(this.bc, this.bF);
            b.a.f154224a.f154223c = this.f154319j;
            if (!(this.f154319j.b() == 1 || this.f154319j.b() == 2)) {
                this.bv = 0;
                this.dq = 0;
                this.dr = 0;
            }
            C();
            this.f154319j.a(new j(this));
            this.f154319j.a(new e(this));
            this.f154319j.a(new C4107g(this));
            this.f154319j.a(new d(this));
            this.f154319j.a(new f(this));
            this.f154319j.a(new i(this));
            if (this.f154319j instanceof com.ss.videoarch.a.e.a) {
                this.cu = new f(this);
                try {
                    Class<?> cls2 = Class.forName("com.ss.ttm.player.f");
                    Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, this.cu);
                    this.ct = newProxyInstance;
                    com.ss.videoarch.a.e.a aVar = (com.ss.videoarch.a.e.a) this.f154319j;
                    if (!(aVar.f154289a == null || (cls = Class.forName("com.ss.ttm.player.f")) == null)) {
                        Method method = Class.forName("com.ss.ttm.player.TTPlayerClient").getMethod("setFrameMetadataListener", cls);
                        method.setAccessible(true);
                        method.invoke(aVar.f154289a, newProxyInstance);
                    }
                } catch (Throwable unused) {
                }
            }
            AudioProcessor audioProcessor = this.fD;
            if (audioProcessor != null) {
                com.ss.ttm.player.m mVar2 = this.f154319j;
                if (mVar2 instanceof com.ss.videoarch.a.e.a) {
                    com.ss.videoarch.a.e.a aVar2 = (com.ss.videoarch.a.e.a) mVar2;
                    if (aVar2.f154289a != null) {
                        try {
                            Method method2 = Class.forName("com.ss.ttm.player.TTPlayerClient").getMethod("setAudioProcessor", AudioProcessor.class);
                            method2.setAccessible(true);
                            method2.invoke(aVar2.f154289a, audioProcessor);
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        }
        if (this.f154319j.a()) {
            this.f154311b.f154200j = "-1";
        } else {
            this.f154311b.f154200j = r.a(14, "0");
        }
        com.ss.videoarch.a.d.a aVar3 = this.f154315f;
        boolean z6 = this.et;
        String str = this.eu;
        if (z6 && aVar3.f154259a != null && !TextUtils.isEmpty(str) && !str.equals("null")) {
            z5 = true;
        }
        aVar3.f154260b = z5;
        aVar3.f154261c = str;
        boolean z7 = aVar3.f154260b;
        if (this.f154320k == null) {
            this.f154320k = new com.ss.videoarch.a.d.c(this.fW, this.f154312c);
        }
        this.f154317h.f154292b = this.f154319j;
    }

    private void Q() {
        boolean z2;
        boolean z3;
        com.ss.texturerender.m a2 = com.ss.texturerender.m.a();
        this.f154321l = a2;
        if (a2 == null) {
            this.n = 0;
            this.o = 0;
            this.aP = 0;
            return;
        }
        if (bi == null) {
            AnonymousClass5 r0 = new l.a() {
                /* class com.ss.videoarch.a.g.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(102879);
                }

                @Override // com.ss.texturerender.l.a
                public final int a(String str, String str2) {
                    g.this.f154313d.b(str2);
                    return 0;
                }
            };
            bi = r0;
            com.ss.texturerender.l.a(r0);
        }
        final com.ss.texturerender.a.d dVar = new com.ss.texturerender.a.d();
        if (this.aP == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        dVar.f151793b = z2;
        HashMap<Integer, Integer> hashMap = dVar.f151794c;
        int i2 = z2 ? 1 : 0;
        int i3 = z2 ? 1 : 0;
        int i4 = z2 ? 1 : 0;
        hashMap.put(1, Integer.valueOf(i2));
        if (this.o == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        dVar.a(z3);
        if (this.aZ == 1) {
            dVar.a(10, 1);
        }
        if (this.ba == 1) {
            dVar.a(2, 1);
        }
        final Bundle bundle = new Bundle();
        if (!this.f154321l.a(dVar)) {
            if (this.o == 1) {
                JSONObject jSONObject = this.gb;
                if (jSONObject != null) {
                    this.q = jSONObject.optInt("SRAlgType");
                    this.fH = this.gb.optInt("ShorterSideUpperBound");
                    this.fI = this.gb.optInt("LongerSideUpperBound");
                    if (this.gb.has("SROpenMaliSync")) {
                        this.bn = this.gb.optBoolean("SROpenMaliSync");
                    }
                }
                bundle.putInt("effect_type", 5);
                bundle.putInt("action", 21);
                bundle.putInt("srAlgType", this.q);
                bundle.putInt("srMaxSizeWidth", this.fH);
                bundle.putInt("srMaxSizeHeight", this.fI);
                bundle.putString("kernelBinPath", this.bj);
                bundle.putString("oclModleName", this.bk);
                bundle.putString("dspModleName", this.bl);
                bundle.putBoolean("srIsMaliSync", this.bn);
            }
            if (this.aP == 1) {
                JSONObject jSONObject2 = this.ga;
                if (jSONObject2 != null) {
                    if (jSONObject2.has("Amount")) {
                        this.aT = (float) this.ga.optDouble("Amount");
                    }
                    if (this.ga.has("EdgeWeightGamma")) {
                        this.aV = (float) this.ga.optDouble("EdgeWeightGamma");
                    }
                    if (this.ga.has("OverRatio")) {
                        this.aU = (float) this.ga.optDouble("OverRatio");
                    }
                    if (this.ga.has("SceneMode")) {
                        this.aW = this.ga.optInt("SceneMode");
                    }
                    if (this.ga.has("PowerLevel")) {
                        this.fZ = this.ga.optInt("PowerLevel");
                    }
                }
                bundle.putInt("action", 21);
                bundle.putInt("effect_type", 1);
                bundle.putInt("max_width", this.fX);
                bundle.putInt("max_height", this.fY);
                bundle.putInt("power_level", this.fZ);
            }
            if (!this.fW.isShutdown()) {
                this.fW.submit(new Runnable() {
                    /* class com.ss.videoarch.a.g.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(102878);
                    }

                    public final void run() {
                        VideoSurface a2 = g.this.f154321l.a(dVar, 1);
                        if (a2 != null) {
                            if (g.this.o == 1) {
                                a2.a(bundle);
                            }
                            if (g.this.aP == 1) {
                                a2.a(bundle);
                                a2.a(11, g.this.aT);
                                a2.a(12, g.this.aU);
                                a2.a(13, g.this.aV);
                                a2.b(17, g.this.aW);
                                a2.b(14, -1);
                            }
                            a2.release();
                        }
                    }
                });
            }
            this.gn = true;
        }
        if (this.gn) {
            dVar = new com.ss.texturerender.a.d();
            if (this.aZ == 1) {
                dVar.a(10, 1);
            }
            if (this.ba == 1) {
                dVar.a(2, 1);
            }
        }
        VideoSurface a3 = this.f154321l.a(dVar, 1);
        this.f154322m = a3;
        if (a3 == null) {
            this.n = 0;
            this.o = 0;
            this.aP = 0;
            this.bm = this.f154321l.f151840c;
            return;
        }
        while (!this.go.isEmpty()) {
            Bundle poll = this.go.poll();
            if (poll != null) {
                poll.getInt("effect_type");
                this.f154322m.a(poll);
            }
        }
        this.f154322m.b(true);
        this.f154322m.f151768b = new VideoSurface.a() {
            /* class com.ss.videoarch.a.g.AnonymousClass6 */

            static {
                Covode.recordClassIndex(102880);
            }

            @Override // com.ss.texturerender.VideoSurface.a
            public final void a() {
                if (g.this.f154319j != null) {
                    if (g.this.U == 1) {
                        if (g.this.V != -1) {
                            long currentTimeMillis = System.currentTimeMillis() - g.this.V;
                            if (currentTimeMillis >= ((long) g.S)) {
                                if (!g.this.aX) {
                                    g.this.f154311b.a(currentTimeMillis, g.S, true, true);
                                } else {
                                    g.this.aX = false;
                                }
                            }
                        }
                        g.this.V = System.currentTimeMillis();
                    }
                    if (!g.this.aK) {
                        if (!g.this.v && g.this.f154319j.a(77, -1L) != -1 && g.this.f154319j.a(77, -1L) != 0) {
                            g.this.v = true;
                            g.this.f154311b.b(g.this.ab);
                            g.this.f154311b.a();
                            g.this.f154313d.a();
                            g.this.f154311b.cP = System.currentTimeMillis();
                        }
                    } else if (!g.this.aJ && g.this.f154319j.a(77, -1L) != -1 && g.this.f154319j.a(77, -1L) != 0) {
                        g.this.aJ = true;
                        g.this.f154311b.cP = System.currentTimeMillis();
                    }
                }
            }
        };
        this.f154322m.a(new VideoSurface.b() {
            /* class com.ss.videoarch.a.g.AnonymousClass7 */

            static {
                Covode.recordClassIndex(102881);
            }

            @Override // com.ss.texturerender.VideoSurface.b
            public final void a(int i2) {
                g.this.f154311b.bh = i2;
                g.this.a(75, 0);
                g.this.a(87, 0);
            }
        });
    }

    private void E() {
        b bVar = this.f154314e;
        if (bVar != null) {
            this.di = ((Integer) bVar.a("live_enable_check_drop_audio", 0)).intValue();
            this.bu = ((Integer) this.f154314e.a("live_option_render_type", 3)).intValue();
            this.bU = ((Integer) this.f154314e.a("live_enable_cmaf_fast_mode", 0)).intValue();
            this.dy = ((Long) this.f154314e.a("live_start_play_buffer_thres", 0L)).longValue();
            this.dz = ((Integer) this.f154314e.a("live_check_buffering_end_ignore_video", 0)).intValue();
            this.ai = ((Integer) this.f154314e.a("live_direct_start_after_prepared", 0)).intValue();
            this.dA = ((Integer) this.f154314e.a("live_check_buffering_end_advance", 0)).intValue();
            if (!this.bR) {
                this.E = ((Boolean) this.f154314e.a("live_enable_resolution_degrade", Boolean.FALSE)).booleanValue();
                this.G = ((Integer) this.f154314e.a("live_stall_count_thres_for_degrade", 4)).intValue();
            }
            this.bo = ((Integer) this.f154314e.a("live_open_mdl_enable", 0)).intValue();
            this.dB = ((Integer) this.f154314e.a("live_enable_tcp_fast_open", 0)).intValue();
            this.dC = ((Integer) this.f154314e.a("live_enable_check_packet_corrupt", 0)).intValue();
            this.er = ((Integer) this.f154314e.a("live_enable_flv_abr", 0)).intValue();
            this.et = ((Boolean) this.f154314e.a("live_sdk_http_dns_enabled", Boolean.FALSE)).booleanValue();
            this.eu = (String) this.f154314e.a("live_sdk_http_dns_server_host", "null");
            this.f154311b.aT = this.et;
            this.f154311b.aB = (String) this.f154314e.a("live_sdk_ntp_server_name", "null");
            this.aj = ((Boolean) this.f154314e.a("live_sdk_cancel_sdk_dns_fail_retry", Boolean.FALSE)).booleanValue();
            this.dh = ((Integer) this.f154314e.a("live_enable_close_play_retry", 0)).intValue();
            this.ez = ((Integer) this.f154314e.a("live_sdk_optimize_backup_enabled", 0)).intValue();
            this.an = ((Integer) this.f154314e.a("live_sdk_stall_retry_instantly_enabled", 1)).intValue();
            this.eA = ((Integer) this.f154314e.a("live_sdk_audio_volume_balance_enable", 0)).intValue();
            this.eB = ((Float) this.f154314e.a("live_sdk_audio_volume_balance_pregain", Float.valueOf(-1.0f))).floatValue();
            this.eC = ((Float) this.f154314e.a("live_sdk_audio_volume_balance_threshold", Float.valueOf(-1.0f))).floatValue();
            this.eD = ((Float) this.f154314e.a("live_sdk_audio_volume_balance_ratio", Float.valueOf(-1.0f))).floatValue();
            this.eE = ((Float) this.f154314e.a("live_sdk_audio_volume_balance_predelay", Float.valueOf(-1.0f))).floatValue();
            this.eH = ((Integer) this.f154314e.a("live_sdk_enable_sei_pts_synced", 0)).intValue();
            this.aw = ((Long) this.f154314e.a("stall_retry_time_interval_manager", 10000L)).longValue();
            this.eI = ((Integer) this.f154314e.a("live_sdk_enable_decode_multi_sei", 0)).intValue();
            this.aI = ((Integer) this.f154314e.a("live_sdk_enable_radiolive_disable_render", 0)).intValue();
            this.fN = ((Integer) this.f154314e.a("live_sdk_enable_liveio", 0)).intValue();
            this.eJ = ((Integer) this.f154314e.a("live_sdk_enable_decode_sei_once", 0)).intValue();
            this.eL = ((Integer) this.f154314e.a("live_sdk_notify_sei_immediately_before_first_frame_enabled", 0)).intValue();
            this.dF = ((Integer) this.f154314e.a("live_sdk_dropping_dts_rollback_frame_enabled", 0)).intValue();
            this.gc = ((Integer) this.f154314e.a("live_sdk_enable_ignore_background_renderstall", 0)).intValue();
            this.gl = ((Integer) this.f154314e.a("live_sdk_enable_save_frame", 0)).intValue();
            this.fj = ((Integer) this.f154314e.a("live_stream_strategy_sdk_enable", 0)).intValue();
            this.ci = ((Integer) this.f154314e.a("live_stream_open_optimizer_enable", 0)).intValue();
            this.cj = ((Integer) this.f154314e.a("live_stream_strategy_enable_httpdns", 0)).intValue();
            this.ck = ((Integer) this.f154314e.a("live_stream_strategy_send_httpdns_by_localdns_timeout", 0)).intValue();
            this.cl = ((Integer) this.f154314e.a("live_stream_strategy_enable_ipv6", 0)).intValue();
            this.gx = ((Integer) this.f154314e.a("live_stream_strategy_enable_ipv6_probe", 0)).intValue();
            this.fk = ((Integer) this.f154314e.a("live_stream_strategy_enable_flv_strategy", 0)).intValue();
            this.cm = ((Integer) this.f154314e.a("live_stream_strategy_enable_performance_optimization", 0)).intValue();
            this.cn = ((Long) this.f154314e.a("live_stream_strategy_start_up_delay", 0L)).longValue();
            this.cq = ((Integer) this.f154314e.a("live_stream_strategy_enable_listener", 1)).intValue();
            this.cp = ((Integer) this.f154314e.a("live_stream_strategy_enable_refresh", 1)).intValue();
            this.co = ((Integer) this.f154314e.a("live_stream_strategy_enable_thread_timeout", 1)).intValue();
            String str = (String) this.f154314e.a("live_sdk_low_latency_flv_default_strategy_map", "");
            if (str.length() > 0) {
                try {
                    this.dE = new JSONObject(str);
                } catch (JSONException e2) {
                    this.dE = null;
                    e2.printStackTrace();
                }
            }
            this.fE = ((Integer) this.f154314e.a("live_sdk_bytevc1_software_decode_forbiden", Integer.valueOf(this.fE))).intValue();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0196 A[Catch:{ JSONException -> 0x019b }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x017e A[Catch:{ JSONException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0183 A[Catch:{ JSONException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x018a A[Catch:{ JSONException -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018f A[Catch:{ JSONException -> 0x01a1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void z() {
        /*
        // Method dump skipped, instructions count: 530
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.g.z():void");
    }

    public final void b() {
        String str;
        String str2;
        String str3;
        String str4;
        this.f154313d.b("play start -- " + this.gm);
        f("play");
        if (this.t == c.PLAYED) {
            this.f154311b.b("play");
            this.f154313d.b("illegal call: play -- " + this.gm);
        } else if (this.t == c.PAUSED) {
            this.f154313d.b("play resume -- " + this.gm);
            this.t = c.PLAYED;
            com.ss.ttm.player.m mVar = this.f154319j;
            if (mVar != null) {
                mVar.f();
            }
            VideoSurface videoSurface = this.f154322m;
            if (videoSurface != null) {
                videoSurface.a(false);
            }
        } else {
            g();
            E();
            if (this.f154318i.f154226b == 2) {
                K();
                z();
                B();
                J();
            }
            b bVar = this.f154314e;
            if (bVar != null && this.aD == 0) {
                this.n = ((Integer) bVar.a("live_sdk_texture_render_enable", 0)).intValue();
                this.aK = ((Boolean) this.f154314e.a("live_sdk_texturerender_use_player_renderstart", Boolean.FALSE)).booleanValue();
                if (((Integer) this.f154314e.a("live_sdk_super_resolution_enable", 0)).intValue() == 1) {
                    JSONObject e2 = this.f154318i.e(this.P, this.Q);
                    this.gb = e2;
                    if (e2 != null) {
                        this.o = e2.optInt("Enabled");
                    }
                }
                if (((Integer) this.f154314e.a("live_sdk_sharpen_enable", 0)).intValue() == 1) {
                    JSONObject f2 = this.f154318i.f(this.P, this.Q);
                    this.ga = f2;
                    if (f2 != null) {
                        this.aP = f2.optInt("Enabled");
                    }
                }
            }
            int i2 = this.gp;
            if (i2 == 1 || (i2 == -1 && this.n == 1)) {
                this.n = 1;
            }
            if (this.n == 1 && this.f154322m == null) {
                Q();
            }
            this.t = c.PLAYED;
            this.J = -1;
            this.K = -1;
            String str5 = null;
            com.ss.videoarch.a.c.a aVar = this.f154318i;
            if (aVar != null) {
                if (aVar.f154226b == 1 && this.f154318i.f() != null) {
                    str5 = this.f154318i.f().f154253a;
                    if (this.O) {
                        str3 = this.N;
                    } else {
                        str3 = str5;
                    }
                    if (str3 != null) {
                        if (str3.startsWith("http")) {
                            this.cA = "tcp";
                        }
                        if (str3.startsWith("https")) {
                            this.cA = "tls";
                        }
                        if (str3.startsWith("httpk")) {
                            this.cA = "kcp";
                        }
                        this.cC = this.cA;
                    }
                    if (this.dR) {
                        try {
                            d.a("ttquic");
                            this.dJ = true;
                            this.f154311b.bo = 1;
                            str4 = "quic";
                        } catch (Throwable unused) {
                            str4 = this.cA;
                            this.dJ = false;
                            this.f154311b.bo = 0;
                        }
                    } else {
                        str4 = "";
                    }
                    if (str4.isEmpty()) {
                        str4 = this.cA;
                    }
                    this.cA = str4;
                } else if (this.f154318i.f154226b == 2) {
                    com.ss.videoarch.a.c.a aVar2 = this.f154318i;
                    if (this.P.equals("auto")) {
                        str2 = this.f154318i.a();
                    } else {
                        str2 = this.P;
                    }
                    str5 = aVar2.a(str2, this.R, this.Q);
                }
            }
            if (this.O) {
                str5 = this.N;
            }
            if (str5 != null) {
                String d2 = this.f154318i.d();
                this.dG = d2;
                if (TextUtils.isEmpty(d2)) {
                    this.dG = UUID.randomUUID().toString().replace("-", "").toLowerCase();
                }
                this.f154311b.a(this.cx, this.cA, this.cy);
                this.f154311b.e();
                this.f154311b.Y = this.dG + "." + System.currentTimeMillis();
                this.f154311b.X = this.f154318i.c();
                this.f154311b.bB = this.P;
                this.f154311b.bC = this.f154318i.a();
                com.ss.videoarch.a.a.b bVar2 = this.f154311b;
                if (this.O) {
                    str = this.N;
                } else {
                    str = str5;
                }
                bVar2.a(str, this.f154315f.c());
                j(str5);
                this.f154316g.f154306g = true;
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("url", "no playurl found while play");
                this.f154316g.a(new com.ss.videoarch.a.a.a(-100002, "playURL is null", hashMap), this.v);
            }
            if (this.dg == 1) {
                N();
            }
            this.f154313d.b("play end -- " + this.gm);
        }
    }

    public static a a(Context context) {
        return new a(context, (byte) 0);
    }

    public final void d(String str) {
        this.f154311b.f154197g = str;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements m.b {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<g> f154359a;

        static {
            Covode.recordClassIndex(102885);
        }

        public d(g gVar) {
            this.f154359a = new WeakReference<>(gVar);
        }

        @Override // com.ss.ttm.player.m.b
        public final void a(com.ss.ttm.player.m mVar) {
            g gVar = this.f154359a.get();
            if (gVar != null && gVar.f154319j != null) {
                gVar.f154313d.d();
                gVar.f154311b.d(-100009);
                gVar.ao = false;
                if (!gVar.O) {
                    if (gVar.H && gVar.f154318i.f154226b == 2 && gVar.a(-100009)) {
                        return;
                    }
                    if (gVar.f154318i.f154226b == 1 && gVar.b(-100009)) {
                        return;
                    }
                    if (gVar.y == 1) {
                        gVar.A = true;
                        if (gVar.x && !TextUtils.isEmpty(gVar.z)) {
                            gVar.c(gVar.z);
                            gVar.x = true;
                            if (gVar.f154319j != null && gVar.O && !TextUtils.isEmpty(gVar.N)) {
                                gVar.f154319j.a(gVar.x);
                            }
                            gVar.e(gVar.z);
                            return;
                        }
                        return;
                    }
                    gVar.f154316g.a(new com.ss.videoarch.a.a.a(-100009, "live stream dry up, push stream may occur error", new HashMap()), gVar.v);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements m.c {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<g> f154360a;

        static {
            Covode.recordClassIndex(102886);
        }

        public e(g gVar) {
            this.f154360a = new WeakReference<>(gVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
            if (r0 == false) goto L_0x0060;
         */
        @Override // com.ss.ttm.player.m.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(com.ss.ttm.player.m r9, int r10, int r11) {
            /*
            // Method dump skipped, instructions count: 227
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.g.e.a(com.ss.ttm.player.m, int, int):boolean");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements m.d {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<g> f154361a;

        static {
            Covode.recordClassIndex(102887);
        }

        public f(g gVar) {
            this.f154361a = new WeakReference<>(gVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:344:0x06c4 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:427:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        @Override // com.ss.ttm.player.m.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r31, java.lang.String r32) {
            /*
            // Method dump skipped, instructions count: 2032
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.g.f.a(int, java.lang.String):void");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements com.ss.videoarch.a.b.a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<g> f154363a;

        static {
            Covode.recordClassIndex(102889);
        }

        public h(g gVar) {
            this.f154363a = new WeakReference<>(gVar);
        }

        @Override // com.ss.videoarch.a.b.a
        public final long a(long j2) {
            g gVar = this.f154363a.get();
            if (gVar == null || gVar.f154319j == null) {
                return j2;
            }
            return gVar.f154311b.a(0, j2);
        }

        @Override // com.ss.videoarch.a.b.a
        public final void a(int i2, String str) {
            com.ss.videoarch.a.a.b bVar;
            JSONObject b2;
            g gVar = this.f154363a.get();
            if (gVar != null && gVar.f154319j != null && (b2 = (bVar = gVar.f154311b).b()) != null) {
                try {
                    b2.put("event_key", "p2p_error").put("error_msg", str).put("code", i2);
                    bVar.f154192b.a(b2, "live_client_monitor_log");
                    if (bVar.ac > 0) {
                        bVar.ac++;
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }

        @Override // com.ss.videoarch.a.b.a
        public final void b(int i2, String str) {
            com.ss.videoarch.a.a.b bVar;
            JSONObject b2;
            g gVar = this.f154363a.get();
            if (gVar != null && gVar.f154319j != null && (b2 = (bVar = gVar.f154311b).b()) != null) {
                try {
                    if (str.equals("cdn_to_p2p")) {
                        bVar.aH = 1;
                    }
                    b2.put("event_key", "p2p_switch").put("switch_info", str).put("p2p_vendor", "none").put("reason", i2);
                    bVar.f154192b.a(b2, "live_client_monitor_log");
                    if (bVar.ac > 0) {
                        bVar.ac++;
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class i implements m.j {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<g> f154364a;

        static {
            Covode.recordClassIndex(102890);
        }

        public i(g gVar) {
            this.f154364a = new WeakReference<>(gVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0113  */
        @Override // com.ss.ttm.player.m.j
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.ttm.player.m r9, int r10, int r11) {
            /*
            // Method dump skipped, instructions count: 286
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.g.i.a(com.ss.ttm.player.m, int, int):void");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements m.g {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<g> f154365a;

        static {
            Covode.recordClassIndex(102891);
        }

        public j(g gVar) {
            this.f154365a = new WeakReference<>(gVar);
        }

        @Override // com.ss.ttm.player.m.g
        public final void a(com.ss.ttm.player.m mVar) {
            g gVar = this.f154365a.get();
            if (gVar != null && gVar.s == o.PREPARING && gVar.f154319j != null) {
                com.ss.videoarch.a.a.b bVar = gVar.f154311b;
                if (bVar.cR != null) {
                    bVar.cR.o = System.currentTimeMillis();
                }
                if (!bVar.Z) {
                    bVar.f154193c.o = System.currentTimeMillis();
                }
                gVar.s = o.PREPARED;
                if (gVar.ai == 0) {
                    gVar.f154319j.f();
                }
                gVar.f154313d.e();
            }
        }
    }

    private void a(Runnable runnable) {
        this.f154310a.post(runnable);
    }

    private static Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private static void g(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        com.ss.android.ugc.aweme.lancet.m.a(uptimeMillis, str);
    }

    /* access modifiers changed from: package-private */
    public class p implements SurfaceHolder.Callback {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<g> f154373a;

        static {
            Covode.recordClassIndex(102897);
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            g gVar = this.f154373a.get();
            if (gVar != null) {
                gVar.a(surfaceHolder.getSurface());
            }
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            g gVar = this.f154373a.get();
            if (gVar != null) {
                gVar.f154313d.b("surfaceDestroyed, ".concat(String.valueOf(surfaceHolder)));
                VideoSurface videoSurface = gVar.f154322m;
                if (videoSurface != null) {
                    videoSurface.b(9, 1);
                    gVar.b(videoSurface);
                    videoSurface.b(9, 0);
                    return;
                }
                gVar.b(surfaceHolder.getSurface());
            }
        }

        public p(g gVar) {
            this.f154373a = new WeakReference<>(gVar);
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            String str = "surfaceChanged, " + surfaceHolder + ", pixel format: " + i2 + ", width: " + i3 + ", height: " + i4;
            g gVar = this.f154373a.get();
            if (gVar != null) {
                gVar.f154313d.b(str);
            }
        }
    }

    private static File b(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    private void l(String str) {
        d();
        f();
        k(str);
        this.cw = -1;
        this.t = c.IDLE;
    }

    public final void c(String str) {
        f("setLocalURL");
        if (!(str == null || str.equals(this.N) || this.N == null)) {
            e();
        }
        this.N = str;
        this.O = true;
    }

    public final void f(String str) {
        com.ss.videoarch.a.a.b bVar;
        if (this.dH == 1 && Looper.myLooper() != Looper.getMainLooper() && (bVar = this.f154311b) != null) {
            bVar.c(str);
        }
    }

    private static JSONArray n(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (str.contains(";")) {
            for (String str2 : str.split(";")) {
                JSONObject m2 = m(str2);
                if (m2 != null) {
                    arrayList.add(m2);
                }
            }
        } else {
            JSONObject m3 = m(str);
            if (m3 != null) {
                arrayList.add(m3);
            }
        }
        return new JSONArray((Collection) arrayList);
    }

    public final void b(Surface surface) {
        if (this.bg == surface) {
            VideoSurface videoSurface = this.f154322m;
            if (videoSurface == null || this.f154321l == null) {
                com.ss.ttm.player.m mVar = this.f154319j;
                if (mVar != null) {
                    mVar.a((Surface) null);
                }
            } else {
                videoSurface.a((Surface) null);
                com.ss.ttm.player.m mVar2 = this.f154319j;
                if (mVar2 != null) {
                    mVar2.a(this.f154322m);
                }
            }
            this.bg = null;
        }
    }

    private void i(String str) {
        JSONObject optJSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("DRM") && (optJSONObject = jSONObject.optJSONObject("DRM")) != null) {
                    boolean optBoolean = optJSONObject.optBoolean("isEnabled");
                    this.ge = optBoolean;
                    if (optBoolean) {
                        int optInt = optJSONObject.optInt("drmType");
                        this.gf = optInt;
                        if (optInt == 0) {
                            String optString = optJSONObject.optString("verifyServerUrl");
                            this.gh = optString;
                            if (optString != null) {
                                this.gi = optJSONObject.optJSONObject("verifyRequestPara");
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    private void j(String str) {
        if (this.s == o.PREPARED && this.f154319j != null) {
            String str2 = this.B;
            if (str2 != null) {
                this.f154311b.a(str2, false);
            }
            this.f154319j.f();
        } else if (this.s == o.IDLE || this.f154319j == null) {
            M();
            this.s = o.INITIALIZED;
            if (!this.O || TextUtils.isEmpty(this.N)) {
                e(str);
            } else {
                this.f154311b.c();
                a(this.N, (String) null, (String) null, (String) null);
            }
        } else {
            C();
            if (!this.O || TextUtils.isEmpty(this.N)) {
                e(str);
            } else {
                a(this.N, (String) null, (String) null, (String) null);
            }
        }
        VideoSurface videoSurface = this.f154322m;
        if (videoSurface != null) {
            videoSurface.a(false);
        }
        this.u = false;
    }

    private void b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (jSONObject != null && jSONObject.has("net_effective_connection_type_strategy")) {
            try {
                jSONObject2 = jSONObject.getJSONObject("net_effective_connection_type_strategy");
            } catch (JSONException e2) {
                e2.printStackTrace();
                jSONObject2 = null;
            }
            if (this.fj == 1 && this.fk == 1) {
                jSONObject3 = (JSONObject) LiveStrategyManager.inst().getConfigAndStrategyByKeyInt(0, 14, null, "");
            } else {
                com.ss.optimizer.live.sdk.dns.e eVar = this.dk;
                if (eVar != null) {
                    jSONObject3 = (JSONObject) eVar.a("net_effective_connection_type_strategy", jSONObject2, (int) this.f154311b.ad, this.f154311b.al);
                } else {
                    return;
                }
            }
            if (jSONObject3 != null) {
                if (jSONObject3.has("live_start_fs_time")) {
                    dd = jSONObject3.optInt("live_start_fs_time");
                }
                if (jSONObject3.has("hurry_millisecond")) {
                    int optInt = jSONObject3.optInt("hurry_millisecond");
                    this.bK = optInt;
                    this.f154319j.a(397, optInt);
                    this.f154311b.F = this.bK;
                }
                if (jSONObject3.has("catch_speed")) {
                    float parseFloat = Float.parseFloat(jSONObject3.optString("catch_speed"));
                    this.bL = parseFloat;
                    this.f154319j.a(80, parseFloat);
                    this.f154311b.G = this.bL;
                }
                if (jSONObject3.has("slow_play_millisecond")) {
                    int optInt2 = jSONObject3.optInt("slow_play_millisecond");
                    this.bM = optInt2;
                    this.f154319j.a(398, optInt2);
                    this.f154311b.H = this.bM;
                }
                if (jSONObject3.has("slow_play_speed")) {
                    float parseFloat2 = Float.parseFloat(jSONObject3.optString("slow_play_speed"));
                    this.bN = parseFloat2;
                    this.f154319j.a(191, parseFloat2);
                    this.f154311b.I = this.bN;
                }
            }
        }
    }

    private static JSONArray o(String str) {
        if (str == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                JSONObject jSONObject = new JSONObject();
                int indexOf = str.indexOf("index:");
                int indexOf2 = str.indexOf(",pts_diff:");
                if (indexOf < 0 || indexOf2 < 0 || indexOf >= indexOf2) {
                    break;
                }
                jSONObject.put("index", Integer.parseInt(str.substring(indexOf + 6, indexOf2)));
                String substring = str.substring(indexOf2);
                int indexOf3 = substring.indexOf(",drop_dur:");
                if (indexOf3 < 0 || 10 >= indexOf3) {
                    break;
                }
                jSONObject.put("pts_diff", Long.parseLong(substring.substring(10, indexOf3)));
                String substring2 = substring.substring(indexOf3);
                int indexOf4 = substring2.indexOf(",key:");
                if (indexOf4 < 0 || 10 >= indexOf4) {
                    break;
                }
                jSONObject.put("drop_dur", Long.parseLong(substring2.substring(10, indexOf4)));
                String substring3 = substring2.substring(indexOf4);
                int indexOf5 = substring3.indexOf(",index:");
                if (indexOf5 != -1) {
                    if (5 >= indexOf5) {
                        break;
                    }
                    jSONObject.put("key_frame", Integer.parseInt(substring3.substring(5, indexOf5)));
                    arrayList.add(jSONObject);
                    str = substring3.substring(indexOf5 + 1);
                } else if (substring3.length() != 0) {
                    jSONObject.put("key_frame", Integer.parseInt(substring3.substring(5)));
                    arrayList.add(jSONObject);
                }
            }
            return new JSONArray((Collection) arrayList);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final boolean c(int i2) {
        String replaceAll;
        if (this.bQ == null) {
            return false;
        }
        if ((!TextUtils.equals(this.cA, "quic") && !TextUtils.equals(this.cA, "quicu")) || i2 != -499499) {
            return false;
        }
        if (this.cC.equals("tls")) {
            this.cA = "tls";
            replaceAll = this.bQ.replaceAll("httpq", "https");
        } else if (this.cC.equals("kcp")) {
            this.cA = "kcp";
            replaceAll = this.bQ.replaceAll("httpq", "httpk");
        } else {
            this.cA = "tcp";
            replaceAll = this.bQ.replaceAll("httpq", "http");
        }
        String replaceAll2 = replaceAll.replaceAll(":(\\d+)/", "/");
        v();
        this.f154311b.d();
        t();
        this.W = true;
        if (replaceAll2 != null) {
            this.f154311b.f154198h = replaceAll2;
            this.f154311b.a(this.bQ, replaceAll2, "quic_library_load_error", i2);
            this.bQ = replaceAll2;
            d();
            f();
            this.fK = System.currentTimeMillis();
            e(this.bQ);
        }
        return true;
    }

    public final boolean d(int i2) {
        String replaceAll;
        String str = this.bQ;
        if (str == null || !str.startsWith("httpk") || (replaceAll = this.bQ.replaceAll("httpk", "http").replaceAll(":(\\d+)/", "/")) == null) {
            return false;
        }
        v();
        this.f154311b.d();
        t();
        this.W = true;
        this.f154311b.f154198h = replaceAll;
        this.f154311b.a(this.bQ, replaceAll, "httpk_to_http", i2);
        this.bQ = replaceAll;
        d();
        f();
        this.fK = System.currentTimeMillis();
        e(this.bQ);
        return true;
    }

    private void h(String str) {
        if (this.F.equals("abr_bb_4live") && this.E && !TextUtils.isEmpty(str)) {
            String str2 = str;
            while (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(this.f154318i.a(str2, this.R, this.Q))) {
                    this.f154318i.b(str2);
                    this.f154311b.bC = this.f154318i.a();
                    return;
                }
                str2.hashCode();
                switch (str2.hashCode()) {
                    case -1008619738:
                        if (str2.equals("origin")) {
                            str2 = "uhd";
                            continue;
                        }
                        break;
                    case 3324:
                        if (str2.equals("hd")) {
                            str2 = "sd";
                            continue;
                        }
                        break;
                    case 3448:
                        if (!str2.equals("ld")) {
                        }
                        break;
                    case 3665:
                        if (str2.equals("sd")) {
                            str2 = "ld";
                            continue;
                        }
                        break;
                    case 115761:
                        if (str2.equals("uhd")) {
                            str2 = "hd";
                            continue;
                        }
                        break;
                }
                str2 = null;
            }
            while (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(this.f154318i.a(str, this.R, this.Q))) {
                    this.f154318i.b(str);
                    this.f154311b.bC = this.f154318i.a();
                    return;
                }
                str.hashCode();
                switch (str.hashCode()) {
                    case -1008619738:
                        if (!str.equals("origin")) {
                        }
                        break;
                    case 3324:
                        if (str.equals("hd")) {
                            str = "uhd";
                            continue;
                        }
                        break;
                    case 3448:
                        if (str.equals("ld")) {
                            str = "sd";
                            continue;
                        }
                        break;
                    case 3665:
                        if (str.equals("sd")) {
                            str = "hd";
                            continue;
                        }
                        break;
                    case 115761:
                        if (str.equals("uhd")) {
                            str = "origin";
                            continue;
                        }
                        break;
                }
                str = null;
            }
            TextUtils.isEmpty(str);
        }
    }

    private void k(String str) {
        com.ss.videoarch.a.d.c cVar = this.f154320k;
        if (cVar != null) {
            cVar.a();
        }
        com.ss.videoarch.a.d.a aVar = this.f154315f;
        if (aVar != null) {
            aVar.a();
        }
        if (this.t == c.PLAYED || this.t == c.PAUSED) {
            s();
            if (this.D) {
                this.f154311b.b(0);
            }
            VideoSurface videoSurface = this.f154322m;
            if (videoSurface != null) {
                videoSurface.a(true);
                a(75, 0);
            }
            if (this.fj == 1) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("sessionId", this.dG + "." + System.currentTimeMillis());
                    jSONObject.put("stallTotalCount", (int) this.f154311b.ad);
                    jSONObject.put("retryTotalCount", this.f154311b.al);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                LiveStrategyManager.inst().stopSession(jSONObject);
            }
            com.ss.optimizer.live.sdk.dns.e eVar = this.dk;
            if (eVar != null && this.dD == 1) {
                eVar.a(this.dG + "." + System.currentTimeMillis(), (int) this.f154311b.ad, this.f154311b.al);
            }
            this.f154311b.br = this.cB;
            this.f154311b.a(str);
        }
        a(75, 0);
        this.f154311b.e();
        this.f154316g.a();
        if (str.equals("reset")) {
            this.f154318i.h();
        }
        this.v = false;
        this.ar = false;
        this.p = true;
        this.ax = false;
        this.aa = 0;
        this.ab = 0;
        this.C = 0;
        this.u = true;
        this.t = c.STOPPED;
        this.ag = false;
        this.ah = 0;
        this.D = false;
        this.W = false;
        this.w = false;
        this.ao = true;
        this.ak = -1;
        this.I = 0;
        this.ce = 0;
        this.M = 0;
        this.am = false;
        this.cD = "";
        this.dP = false;
        this.R = "flv";
        this.cA = "tcp";
        this.cx = "none";
        this.cy = "none";
        this.bT = 1;
        this.dQ = false;
        this.ap = 0;
        this.ay = 0;
        this.o = 0;
        this.n = 0;
        this.dS = 39;
        this.dT = 1200;
        this.dU = 0;
        this.ec = 0;
        this.ed = 0;
        this.ee = 0;
        this.ef = 0;
        this.eg = 0;
        this.eh = 0;
        this.ei = 0;
        this.dV = 1;
        this.dW = 1;
        this.dX = 1;
        this.dY = 50;
        this.dZ = 1;
        this.ea = 1;
        this.di = 0;
        this.r = false;
        this.ep = 10000;
        this.eq = 0;
        this.ey = false;
        this.eN = 0;
        this.eO = 1000;
        this.as = -1;
        this.B = null;
        this.fo = 0;
        this.fn = 5000;
        this.fp = 300;
        this.aF = 0;
        this.aD = 0;
        this.fr = 0;
        this.fs = 0;
        this.fQ = 0;
        this.fG = 0;
        this.aJ = false;
        this.aK = false;
        dd = -1;
        this.f154310a.removeCallbacksAndMessages(null);
        if (this.dg == 1) {
            O();
        }
        this.aO = 5000;
        this.fU = 200;
        this.dO = 1;
        this.gq = 1;
        this.gr = -1;
        this.gs = 1;
        this.bb = 0;
        this.gt = 0;
        this.gw = 0;
    }

    private static JSONObject m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String[] split = str.split(",");
            for (String str2 : split) {
                if (str2.startsWith("video_key")) {
                    jSONObject.put("video_key", Integer.parseInt(str2.substring(10)));
                } else if (str2.startsWith("video_last_dts")) {
                    jSONObject.put("video_last_dts", Integer.parseInt(str2.substring(15)));
                } else if (str2.startsWith("video_cur_dts")) {
                    jSONObject.put("video_cur_dts", Integer.parseInt(str2.substring(14)));
                } else if (str2.startsWith("vv_dts_diff")) {
                    jSONObject.put("vv_dts_diff", Integer.parseInt(str2.substring(12)));
                } else if (str2.startsWith("audio_cur_dts")) {
                    jSONObject.put("audio_cur_dts", Integer.parseInt(str2.substring(14)));
                } else if (str2.startsWith("av_dts_diff")) {
                    jSONObject.put("av_dts_diff", Integer.parseInt(str2.substring(12)));
                } else if (str2.startsWith("audio_first_pkt_ts")) {
                    jSONObject.put("audio_first_pkt_ts", Long.parseLong(str2.substring(19)));
                } else if (str2.startsWith("audio_first_pkt_dts")) {
                    jSONObject.put("audio_first_pkt_dts", Long.parseLong(str2.substring(20)));
                } else if (str2.startsWith("video_first_pkt_ts")) {
                    jSONObject.put("video_first_pkt_ts", Long.parseLong(str2.substring(19)));
                } else if (str2.startsWith("video_first_pkt_dts")) {
                    jSONObject.put("video_first_pkt_dts", Long.parseLong(str2.substring(20)));
                } else if (str2.startsWith("audio_open_input_cost")) {
                    jSONObject.put("audio_open_input_cost", Long.parseLong(str2.substring(22)));
                } else if (str2.startsWith("audio_find_stream_info_cost")) {
                    jSONObject.put("audio_find_stream_info_cost", Long.parseLong(str2.substring(28)));
                } else if (str2.startsWith("video_open_input_cost")) {
                    jSONObject.put("video_open_input_cost", Long.parseLong(str2.substring(22)));
                } else if (str2.startsWith("video_find_stream_info_cost")) {
                    jSONObject.put("video_find_stream_info_cost", Long.parseLong(str2.substring(28)));
                }
            }
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public final void b(String str) {
        this.f154311b.bg = str;
        f("setStreamInfo");
        try {
            JSONObject jSONObject = new JSONObject(str);
            l("setStreamInfo");
            this.f154318i.a(new com.ss.videoarch.a.c.b(jSONObject));
            this.ak = 1;
            y();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012e, code lost:
        if (r7.equals("quicu") == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0136, code lost:
        if (r7.equals("quic") == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013e, code lost:
        if (r7.equals("tls") == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0146, code lost:
        if (r7.equals("tcp") == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014a, code lost:
        r3 = "80";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015f, code lost:
        if (r7.equals("h2q") == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0169, code lost:
        if (r7.equals("h2") == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x016d, code lost:
        r3 = "443";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 1004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.g.e(java.lang.String):void");
    }

    private g(a aVar) {
        this.f154310a = new Handler(Looper.myLooper());
        this.f154318i = new com.ss.videoarch.a.c.a();
        this.bf = null;
        this.f154322m = null;
        this.n = 0;
        this.o = 0;
        this.bh = -1;
        this.p = true;
        this.q = 0;
        this.bj = "none";
        this.bk = "test";
        this.bl = "test";
        this.bm = null;
        this.bn = true;
        this.bo = 0;
        this.bp = false;
        this.r = false;
        this.s = o.IDLE;
        this.t = c.IDLE;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.bq = 0;
        this.br = 0;
        this.bs = 0;
        this.bt = 0;
        this.bu = 3;
        this.bv = 0;
        this.bw = 0;
        this.bx = 0;
        this.y = -1;
        this.by = -1;
        this.bz = -1;
        this.bA = -1;
        this.bB = 1;
        this.bC = -1;
        this.bD = -1;
        this.bE = -1;
        this.bF = 0;
        this.bG = 0;
        this.bH = -1;
        this.bI = 0;
        this.bJ = -1;
        this.bK = 0;
        this.bL = -1.0f;
        this.bM = -1;
        this.bN = -1.0f;
        this.bO = -1;
        this.z = null;
        this.bP = null;
        this.A = false;
        this.bQ = null;
        this.B = null;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = "rad";
        this.bR = false;
        this.bS = -1;
        this.G = 4;
        this.H = true;
        this.bT = 1;
        this.bU = 0;
        this.bV = 0;
        this.bW = 0;
        this.bX = 1;
        this.bY = 0;
        this.bZ = 0;
        this.ca = 0;
        this.cb = -1;
        this.cc = -1;
        this.cd = 0;
        this.I = 0;
        this.ce = 0;
        this.cf = 10000;
        this.J = -1;
        this.K = -1;
        this.L = null;
        this.M = 0;
        this.cg = 0;
        this.ch = 4;
        this.ci = 0;
        this.cj = 0;
        this.ck = 0;
        this.cl = 0;
        this.cm = 0;
        this.cn = 0;
        this.co = -1;
        this.cp = -1;
        this.cq = -1;
        this.cr = 0;
        this.cs = 5000000;
        this.ct = null;
        this.cu = null;
        this.N = null;
        this.O = false;
        this.cv = -1;
        this.P = "origin";
        this.cw = -1;
        this.Q = "main";
        this.R = "flv";
        this.cx = "none";
        this.cy = "none";
        this.cz = "none";
        this.cA = "tcp";
        this.cB = false;
        this.cC = "none";
        this.cD = "";
        this.cE = "";
        this.cF = "";
        this.cG = "";
        this.cH = 0;
        this.cI = 0;
        this.cJ = 0;
        this.cK = 15;
        this.cL = 0;
        this.cM = 2000000;
        this.cN = 4096;
        this.cO = 100000;
        this.cP = 4096;
        this.cQ = 100000;
        this.cR = 1;
        this.cS = 10000;
        this.cT = 1;
        this.cU = 0;
        this.cV = 15000;
        this.cW = 100;
        this.cX = 1;
        this.cY = 0;
        this.cZ = 1;
        this.U = 0;
        this.da = -1;
        this.V = -1;
        this.W = false;
        this.db = 1;
        this.dc = 1;
        this.de = -1;
        this.df = -1;
        this.dg = 0;
        this.Z = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        this.dh = 0;
        this.di = 0;
        this.dj = 1;
        this.dk = null;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.dl = 0;
        this.dm = 0;
        this.dn = true;
        this.f352do = true;
        this.dp = false;
        this.dq = 0;
        this.dr = 0;
        this.ds = -1;
        this.dt = 0;
        this.du = 1;
        this.ad = 0;
        this.ae = 1;
        this.dv = 1;
        this.dw = 1;
        this.dx = 8000;
        this.af = false;
        this.ag = false;
        this.ah = 0;
        this.dy = 0;
        this.dz = 0;
        this.ai = 0;
        this.dA = 0;
        this.dB = 0;
        this.dC = 0;
        this.dD = 0;
        this.dE = null;
        this.dF = 0;
        this.dH = 1;
        this.dI = false;
        this.dJ = false;
        this.dK = null;
        this.dL = null;
        this.dM = null;
        this.dN = 0;
        this.dO = 1;
        this.dP = false;
        this.dQ = false;
        this.dR = false;
        this.dS = 39;
        this.dT = 1200;
        this.dU = 0;
        this.dV = 1;
        this.dW = 1;
        this.dX = 1;
        this.dY = 50;
        this.dZ = 1;
        this.ea = 1;
        this.eb = 1;
        this.ec = 0;
        this.ed = 0;
        this.ee = 0;
        this.ef = 0;
        this.eg = 0;
        this.eh = 0;
        this.ei = 0;
        this.ej = -1;
        this.ek = -1;
        this.el = 0;
        this.em = 0;
        this.en = 0;
        this.eo = 0;
        this.ep = 10000;
        this.eq = 0;
        this.er = 0;
        this.es = 0;
        this.et = false;
        this.eu = null;
        this.aj = false;
        this.ak = -1;
        this.al = false;
        this.am = false;
        this.an = 1;
        this.ev = null;
        this.ew = null;
        this.ex = null;
        this.ey = false;
        this.ez = 0;
        this.ao = true;
        this.ap = 0;
        this.aq = 0;
        this.ar = false;
        this.eA = 0;
        this.eB = -1.0f;
        this.eC = -1.0f;
        this.eD = -1.0f;
        this.eE = -1.0f;
        this.eF = -1.0f;
        this.eG = -1;
        this.eH = 0;
        this.eI = 0;
        this.eJ = 0;
        this.eK = 0;
        this.eL = 0;
        this.eM = 0;
        this.eN = 0;
        this.eO = 1000;
        this.as = -1;
        this.eP = -1;
        this.eQ = 1000000;
        this.eR = 0.0f;
        this.eS = 0.0f;
        this.eT = 0.0f;
        this.eU = 0.0f;
        this.eV = 0.0f;
        this.eW = 0.0f;
        this.eX = 0.0f;
        this.eY = 0.0f;
        this.eZ = 0.0f;
        this.fa = -1;
        this.fb = -1;
        this.fc = -1;
        this.fd = 0;
        this.fe = -1;
        this.ff = 60;
        this.fg = false;
        this.at = -1;
        this.fh = -3;
        this.au = null;
        this.av = null;
        this.fi = -1;
        this.fj = 0;
        this.fk = 0;
        this.aw = 10000;
        this.ax = false;
        this.ay = 0;
        this.az = false;
        this.fl = null;
        this.aA = null;
        this.fm = new q(this, (byte) 0);
        this.aB = new Object();
        this.aC = false;
        this.aD = 0;
        this.aE = 0;
        this.aF = 0;
        this.fn = 5000;
        this.fo = 1;
        this.fp = 300;
        this.fq = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        this.fr = 0;
        this.fs = 0;
        this.aG = 0;
        this.aH = 0;
        this.ft = 5000;
        this.fu = 0;
        this.fv = 0;
        this.fw = 0;
        this.fx = "";
        this.fy = "";
        this.fz = null;
        this.aI = 0;
        this.fA = 0;
        this.fB = "";
        this.fC = "";
        this.fE = -1;
        this.fF = -1;
        this.fG = 0;
        this.aJ = false;
        this.aK = false;
        this.fH = 0;
        this.fI = 0;
        this.aL = 0;
        this.fJ = 0;
        this.fK = 0;
        this.fL = 0;
        this.fM = false;
        this.fN = 0;
        this.aM = false;
        this.fO = 0;
        this.aN = 0;
        this.fP = 0;
        this.fQ = 0;
        this.fR = 0;
        this.fS = 0;
        this.fT = new b(this, (byte) 0);
        this.aO = 5000;
        this.fU = 200;
        this.fV = 0;
        this.fW = null;
        this.aP = 0;
        this.aQ = 0;
        this.aR = false;
        this.aS = -1;
        this.fX = 1920;
        this.fY = 1080;
        this.fZ = 0;
        this.aT = -1.0f;
        this.aU = -1.0f;
        this.aV = 6.0f;
        this.aW = 1;
        this.ga = null;
        this.gb = null;
        this.gc = 0;
        this.gd = 0;
        this.aX = false;
        this.ge = false;
        this.gf = 0;
        this.gg = 5;
        this.gh = "";
        this.gi = null;
        this.gj = "";
        this.gk = 0;
        this.gl = 0;
        this.gm = -1;
        this.aY = null;
        this.aZ = 0;
        this.ba = 0;
        this.gn = false;
        this.go = new LinkedList();
        this.gp = -1;
        this.gq = 1;
        this.gr = -1;
        this.gs = 1;
        this.bb = 0;
        this.gt = 0;
        this.gu = 0;
        this.gv = 0;
        this.gw = 0;
        this.gx = 0;
        Context context = aVar.f154340a;
        this.bc = context;
        a aVar2 = aVar.f154341b;
        this.f154313d = aVar2;
        b bVar = aVar.f154344e;
        this.f154314e = bVar;
        aVar.n = this.aw;
        if (bVar != null) {
            this.aL = ((Integer) bVar.a("live_sdk_should_report_session_stop", 0)).intValue();
            this.fV = ((Integer) bVar.a("live_sdk_enable_use_live_threadpool", 0)).intValue();
        }
        com.ss.videoarch.a.a.b bVar2 = new com.ss.videoarch.a.a.b(this, aVar2, aVar.o, aVar.n, context, this.aL);
        this.f154311b = bVar2;
        bVar2.f154197g = aVar.f154342c;
        if (this.fV != 1 || aVar.r == null) {
            this.fW = new ThreadPoolExecutor(1, 3, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new m() {
                /* class com.ss.videoarch.a.g.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(102874);
                }
            });
        } else {
            this.fW = aVar.r;
            this.f154311b.dX = 1;
        }
        this.f154316g = new com.ss.videoarch.a.f.a(new l(this), aVar.f154347h, aVar.n, this.f154311b);
        this.f154317h = new com.ss.videoarch.a.e.b(context);
        boolean z2 = aVar.f154345f;
        this.et = z2;
        this.f154311b.aT = z2;
        c cVar = aVar.f154343d;
        this.f154312c = cVar;
        com.ss.videoarch.a.d.a aVar3 = new com.ss.videoarch.a.d.a(context, this.fW, cVar);
        this.f154315f = aVar3;
        aVar3.b();
        this.bd = aVar.f154348i;
        this.R = aVar.f154350k;
        this.P = aVar.f154349j;
        this.C = 0;
        this.E = aVar.f154351l;
        this.H = aVar.f154352m;
        this.dx = aVar.q;
        this.gm = hashCode();
    }

    private void a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("hw_dec")) != null && optJSONObject.has("enable")) {
            boolean optBoolean = optJSONObject.optBoolean("enable");
            this.bw = optBoolean ? 1 : 0;
            boolean z2 = true;
            if (!(this.bv == 1 && optBoolean)) {
                z2 = false;
                this.bx = 0;
            }
            try {
                optJSONObject.put("enable", z2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final boolean b(int i2) {
        String str;
        boolean z2 = false;
        if (this.dj != 2 || (str = this.f154318i.d("h264").f154253a) == null) {
            return false;
        }
        v();
        this.f154311b.d();
        t();
        this.W = true;
        this.f154311b.f154198h = str;
        this.f154311b.a(this.bQ, str, "bytevc1_to_h264", i2);
        this.bQ = str;
        this.dj = 1;
        this.f154311b.aW = "h264";
        if (this.bv != 1 && this.dq == 1) {
            this.bv = 1;
            this.bH = 0;
            this.f154319j.a(59, 1);
            com.ss.videoarch.a.a.b bVar = this.f154311b;
            if (this.bv == 1) {
                z2 = true;
            }
            bVar.C = z2;
        }
        f();
        this.fK = System.currentTimeMillis();
        e(str);
        return true;
    }

    /* synthetic */ g(a aVar, byte b2) {
        this(aVar);
    }

    private static JSONObject a(JSONObject jSONObject, String str) {
        try {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                return (JSONObject) obj;
            }
            if (obj instanceof String) {
                return new JSONObject((String) obj);
            }
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private String a(String str, long j2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.dG)) {
            return null;
        }
        String str2 = this.dG + "." + j2;
        this.f154311b.Y = str2;
        if (!str.contains("_session_id")) {
            return b(str, "_session_id", str2);
        }
        return str;
    }

    private String a(String str, String str2) {
        try {
            URL url = new URL(str);
            String protocol = url.getProtocol();
            String host = url.getHost();
            url.getPort();
            String file = url.getFile();
            if (2 == this.f154318i.f154226b) {
                if (this.cA.equals("kcp")) {
                    protocol = "httpk";
                } else if (this.cA.equals("quic") || this.cA.equals("quicu")) {
                    protocol = "httpq";
                } else if (this.cA.equals("tls")) {
                    protocol = "https";
                } else if (this.cA.equals("tcp")) {
                    protocol = "http";
                } else if (TextUtils.equals(this.cA, "h2") || TextUtils.equals(this.cA, "h2q") || TextUtils.equals(this.cA, "h2qu")) {
                    protocol = "httpx";
                }
            }
            StringBuilder append = new StringBuilder().append(protocol).append("://").append(host);
            if (TextUtils.isEmpty(str2)) {
                append.append(file);
            } else {
                append.append(":").append(str2).append(file);
            }
            return append.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    private static String c(String str, String str2, String str3) {
        return str + "&" + str2 + "=" + str3;
    }

    private static String a(String str, String str2, String str3) {
        if (!str.equals("")) {
            str = str + "&";
        }
        return ((str + str2) + "=") + str3;
    }

    private static String b(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str4 = str2 + "=" + str3;
        int indexOf = str.indexOf("?");
        if (indexOf == -1) {
            str4 = "?".concat(String.valueOf(str4));
        } else if (indexOf != str.length() - 1) {
            str4 = "&".concat(String.valueOf(str4));
        }
        return str + str4;
    }

    private String a(String str, String str2, String str3, Map<String, String> map) {
        boolean z2;
        String str4;
        AVMDLDataLoader instance;
        if (!this.R.equals("flv") || this.E || TextUtils.isEmpty(this.L) || (this.gw == 0 && (this.cA.equals("quic") || this.cA.equals("quicu")))) {
            this.f154311b.dI = "proxy not support format: " + this.R + ", protocol: " + this.cA + ", liveio support quic: " + this.gw + " ,abr: " + this.E + ", session id invalid: " + TextUtils.isEmpty(this.L);
            return null;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            if (!TextUtils.isEmpty(str2)) {
                z2 = com.ss.videoarch.a.d.a.a(str2);
            } else {
                z2 = false;
            }
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str)) {
                str4 = null;
            } else {
                a.b a2 = com.ss.videoarch.a.d.a.a(str, z2);
                str.startsWith("http");
                String str5 = str.substring(0, a2.f154275a) + str3;
                int i2 = a2.f154276b;
                if (a2.f154277c != -1) {
                    str5 = str5 + str.substring(a2.f154276b, a2.f154277c);
                    i2 = a2.f154277c;
                }
                str4 = str5 + str.substring(i2);
            }
            if (this.aN == 1 && (this.cA.equals("quic") || this.cA.equals("quicu"))) {
                this.aN = 0;
            }
            if (this.fN == 1 && this.fO == 1) {
                return a(str4, str2, map, z2);
            }
            com.ss.videoarch.a.b.b.a(8100);
            com.ss.videoarch.a.b.b.a();
            if (this.bo == 1 && com.ss.videoarch.a.b.b.a(8100) == 1 && !com.ss.videoarch.a.d.a.a(str2) && com.ss.videoarch.a.b.b.a() && this.bp) {
                long j2 = this.cv;
                if (!(j2 == -1 || (instance = AVMDLDataLoader.getInstance()) == null)) {
                    instance.setLongValue(1100, j2);
                }
                this.r = true;
                a(new n(this, this.L, false));
                String a3 = com.ss.videoarch.a.b.b.a(str4, Boolean.valueOf(this.bp));
                if (a3 != null && !a3.isEmpty()) {
                    map.put("Stream-Type", "live");
                    String str6 = this.L;
                    if (str6 != null) {
                        map.put("X-Tt-Traceid", str6);
                    }
                    if (str2 != null && !str2.equals("none")) {
                        if (str2.startsWith("[")) {
                            str2 = str2.substring(1, str2.length() - 1);
                        }
                        map.put("X-Given-IPs", str2);
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("url", a3);
                        if (str2 != null) {
                            jSONObject.put("ip", str2);
                        }
                        String str7 = this.L;
                        if (str7 != null) {
                            jSONObject.put("traceId", str7);
                        }
                        String jSONObject2 = jSONObject.toString();
                        AVMDLDataLoader instance2 = AVMDLDataLoader.getInstance();
                        if (instance2 != null) {
                            instance2.setStringValue(8017, jSONObject2);
                        }
                    } catch (Exception unused) {
                    }
                    return a3;
                }
            }
        }
        return null;
    }

    private String a(String str, String str2, Map<String, String> map, boolean z2) {
        if (!this.fM) {
            this.f154311b.dI = "liveio protocol register fail";
            return null;
        } else if (!LiveIOWrapper.getInstance().isRunning()) {
            this.f154311b.dI = "liveio not running";
            return null;
        } else {
            String liveURL = LiveIOWrapper.getInstance().getLiveURL(str);
            if (TextUtils.isEmpty(liveURL)) {
                return null;
            }
            String str3 = this.L;
            if (str3 != null) {
                if (this.gm != -1) {
                    this.aY = this.L + "." + this.gm;
                } else {
                    this.aY = str3;
                }
                map.put("X-Session-ID", this.aY);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                if (str2 != null && !str2.equals("none")) {
                    if (z2) {
                        str2 = com.a.a("[%s]", new Object[]{str2});
                    }
                    jSONObject.put("given_ips", str2);
                }
                jSONObject.put("url", str);
                jSONObject.put("http_is_enable_prepare", this.fP);
                jSONObject.put("is_pcdn", this.aN);
                jSONObject.put("is_pcdn_up", this.fR);
                jSONObject.put("ab_group_id", this.fS);
                jSONObject.put("pcdn_io_type", this.gk);
                jSONObject.put("fastopen", this.dB);
                if (this.cA.equals("quicu")) {
                    jSONObject.put("suggest_protocol", "quic");
                } else {
                    jSONObject.put("suggest_protocol", this.cA);
                }
                jSONObject.put("is_freeflow", this.fQ);
                jSONObject.put("task_start_time", System.currentTimeMillis());
                jSONObject.put("is_low_latency_flv", this.dD);
                jSONObject.put("ttnet_nqe_info", this.f154311b.bx);
                LiveIOWrapper.getInstance().prepare(this.aY, jSONObject.toString());
                this.aM = true;
                this.f154311b.dG = 1;
                this.f154311b.dK = LiveIOWrapper.getInstance().getStringValue(1100);
                if (this.aN == 1) {
                    this.f154311b.dH = 1;
                }
                a(new n(this, this.aY, true));
                return liveURL;
            } catch (Exception unused) {
                this.f154311b.dI = "liveio prepare fail";
                return null;
            }
        }
    }
}

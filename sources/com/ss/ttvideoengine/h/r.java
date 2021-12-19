package com.ss.ttvideoengine.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.vcloud.networkpredictor.SpeedPredictorResult;
import com.bytedance.vcloud.networkpredictor.SpeedPredictorResultCollection;
import com.bytedance.vcloud.networkpredictor.SpeedPredictorResultItem;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.ttm.player.p;
import com.ss.ttvideoengine.ag;
import com.ss.ttvideoengine.ah;
import com.ss.ttvideoengine.be;
import com.ss.ttvideoengine.c.c;
import com.ss.ttvideoengine.d;
import com.ss.ttvideoengine.h.aa;
import com.ss.ttvideoengine.h.n;
import com.ss.ttvideoengine.h.v;
import com.ss.ttvideoengine.j.e;
import com.ss.ttvideoengine.q.e;
import com.ss.ttvideoengine.s.g;
import com.ss.ttvideoengine.s.i;
import com.ss.ttvideoengine.s.j;
import com.ss.ttvideoengine.s.m;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONObject;

public final class r implements j {
    private static int aB = 1;
    private static Map be = new HashMap();
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private ArrayList E;
    private ArrayList<String> F;
    private ArrayList G;
    private ArrayList H;
    private ArrayList I;
    private String J;
    private String K;
    private String L;
    private String M;
    private String N;
    private String O = "";
    private String P = "";
    private String Q = "";
    private String R = "";
    private int S;
    private int T;
    private int U;
    private boolean V;
    private Map W;
    private int X = -1;
    private String Y = "";
    private String Z = "";

    /* renamed from: a  reason: collision with root package name */
    public f f152673a;
    private long aA;
    private int aC;
    private int aD;
    private int aE;
    private long aF = -2147483648L;
    private long aG = -2147483648L;
    private long aH = -2147483648L;
    private int aI;
    private boolean aJ;
    private boolean aK;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private boolean aP;
    private boolean aQ;
    private boolean aR;
    private float aS;
    private boolean aT;
    private boolean aU;
    private Timer aV;
    private TimerTask aW;
    private int aX;
    private int aY;
    private m aZ;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private long af;
    private String ag;
    private int ah = -1;
    private long ai;
    private int aj = -1;
    private int ak;
    private int al;
    private int am = -1;
    private String an;
    private int ao;
    private int ap;
    private e aq;
    private long ar;
    private long as;
    private int at;
    private int au;
    private int av;
    private Context aw;
    private String ax = "";
    private int ay = -1002;
    private long az;

    /* renamed from: b  reason: collision with root package name */
    public z f152674b;
    private ArrayList<Integer> bA = new ArrayList<>();
    private ArrayList<String> bB = new ArrayList<>();
    private boolean bC = false;
    private com.ss.ttvideoengine.s.c bD = null;
    private int bE = -1;
    private long bF = -2147483648L;
    private ac ba;
    private e bb;
    private ad bc;
    private Map bd = new HashMap();
    private int bf = -1;
    private int bg = 0;
    private int bh = 0;
    private int bi = 0;
    private int bj = 0;
    private int bk = 0;
    private int bl = 0;
    private int bm = 0;
    private String bn = "";
    private String bo = "";
    private String bp = "";
    private int bq = 0;
    private b br;
    private ArrayList<String> bs = new ArrayList<>();
    private ArrayList<String> bt = new ArrayList<>();
    private ArrayList<String> bu = new ArrayList<>();
    private ArrayList<String> bv = new ArrayList<>();
    private ArrayList<String> bw = new ArrayList<>();
    private ArrayList<String> bx = new ArrayList<>();
    private ArrayList<String> by = new ArrayList<>();
    private ArrayList<Integer> bz = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public o f152675c;

    /* renamed from: d  reason: collision with root package name */
    public int f152676d;

    /* renamed from: e  reason: collision with root package name */
    public long f152677e;

    /* renamed from: f  reason: collision with root package name */
    public int f152678f;

    /* renamed from: g  reason: collision with root package name */
    public int f152679g;

    /* renamed from: h  reason: collision with root package name */
    public int f152680h;

    /* renamed from: i  reason: collision with root package name */
    public int f152681i = Integer.MIN_VALUE;

    /* renamed from: j  reason: collision with root package name */
    public int f152682j = Integer.MIN_VALUE;

    /* renamed from: k  reason: collision with root package name */
    public int f152683k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f152684l = 1000;

    /* renamed from: m  reason: collision with root package name */
    public long f152685m;
    public long n;
    public long o = -2147483648L;
    public long p = -2147483648L;
    public long q = -2147483648L;
    public long r = -2147483648L;
    private u s;
    private x t;
    private y u;
    private v v;
    private ab w;
    private n x;
    private final h y;
    private boolean z;

    @Override // com.ss.ttvideoengine.h.j
    public final void k() {
        C();
    }

    @Override // com.ss.ttvideoengine.h.j
    public final String p() {
        return this.ax;
    }

    @Override // com.ss.ttvideoengine.h.j
    public final int r() {
        return this.f152676d;
    }

    @Override // com.ss.ttvideoengine.h.j
    public final long s() {
        return this.f152677e;
    }

    @Override // com.ss.ttvideoengine.h.j
    public final void a(int i2, String str) {
        this.am = i2;
        this.an = str;
    }

    @Override // com.ss.ttvideoengine.h.j
    public final void a(boolean z2) {
        if (z2) {
            this.S = 1;
        } else {
            this.S = 0;
        }
    }

    @Override // com.ss.ttvideoengine.h.j
    public final void a(String str, String str2, float f2, float f3, float f4, float f5, long j2, Map<String, String> map, Map<String, String> map2) {
        Map map3;
        ab abVar = this.w;
        if (abVar != null && abVar.f152571c && abVar.f152574f != null) {
            abVar.c();
            String valueOf = String.valueOf(abVar.f152574f.am);
            if (abVar.f152574f != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (map3 = abVar.f152574f.aa) != null && !str.equals("-1") && !str2.equals("-1")) {
                for (Map.Entry entry : ((Map) map3.get("fileKey")).entrySet()) {
                    if (((String) entry.getValue()).equals(str)) {
                        if (entry.getKey() == null) {
                            abVar.f152573e.f152593k.add(-1);
                        } else if (((Integer) entry.getKey()).intValue() == 0) {
                            abVar.f152573e.f152593k.add(-1);
                        } else {
                            abVar.f152573e.f152593k.add(abVar.a((Integer) entry.getKey()));
                        }
                        abVar.f152573e.f152587e.add(Integer.valueOf((int) j2));
                        abVar.f152573e.f152588f.add(Float.valueOf(f2));
                        abVar.f152573e.f152590h.add(Float.valueOf(f4));
                        abVar.f152573e.f152591i.add(valueOf);
                        abVar.a(map, 0);
                    }
                    if (((String) entry.getValue()).equals(str2)) {
                        if (entry.getKey() == null) {
                            abVar.f152573e.x.add(-1);
                        } else if (((Integer) entry.getKey()).intValue() == 0) {
                            abVar.f152573e.x.add(-1);
                        } else {
                            abVar.f152573e.x.add(abVar.a((Integer) entry.getKey()));
                        }
                        abVar.f152573e.r.add(Integer.valueOf((int) j2));
                        abVar.f152573e.s.add(Float.valueOf(f3));
                        abVar.f152573e.u.add(Float.valueOf(f5));
                        abVar.f152573e.v.add(valueOf);
                        abVar.a(map2, 1);
                    }
                }
            }
            abVar.f152573e.f152586d++;
            abVar.f152573e.q++;
            j.b("VideoEventSampleRecord", "brian video count:" + abVar.f152573e.f152586d + ",audio count:" + abVar.f152573e.q);
            if (abVar.f152573e.f152586d < abVar.f152569a && abVar.f152573e.q < abVar.f152569a) {
                return;
            }
            if (abVar.f152573e.G == 0) {
                abVar.a(0);
            } else {
                abVar.d();
            }
        }
    }

    @Override // com.ss.ttvideoengine.h.j
    public final void a(SpeedPredictorResultCollection speedPredictorResultCollection, SpeedPredictorResultCollection speedPredictorResultCollection2, long j2) {
        ab abVar;
        Map map;
        if (speedPredictorResultCollection != null && speedPredictorResultCollection2 != null && (abVar = this.w) != null && abVar.f152571c && abVar.f152574f != null) {
            abVar.c();
            Map map2 = abVar.f152574f.aa;
            if (map2 != null && (map = (Map) map2.get("fileKey")) != null && !map.isEmpty()) {
                int i2 = 0;
                Boolean[] boolArr = {false};
                Boolean[] boolArr2 = {false};
                for (Map.Entry entry : map.entrySet()) {
                    Object value = entry.getValue();
                    Iterator<SpeedPredictorResult> it = speedPredictorResultCollection.getResultCollection().iterator();
                    while (true) {
                        int i3 = 3;
                        if (!it.hasNext()) {
                            break;
                        }
                        SpeedPredictorResult next = it.next();
                        if (next.getFileId().equals(value)) {
                            if (!next.getResultItems().isEmpty()) {
                                if (next.getResultItems().get(i2).getTrackType() == 0) {
                                    if (entry.getKey() == null) {
                                        abVar.f152573e.f152593k.add(-1);
                                    } else if (((Integer) entry.getKey()).intValue() == 0) {
                                        abVar.f152573e.f152593k.add(-1);
                                    } else {
                                        abVar.f152573e.f152593k.add(abVar.a((Integer) entry.getKey()));
                                    }
                                } else if (entry.getKey() == null) {
                                    abVar.f152573e.x.add(-1);
                                } else if (((Integer) entry.getKey()).intValue() == 0) {
                                    abVar.f152573e.x.add(-1);
                                } else {
                                    abVar.f152573e.x.add(abVar.a((Integer) entry.getKey()));
                                }
                            }
                            Object key = entry.getKey();
                            Iterator<SpeedPredictorResultItem> it2 = next.getResultItems().iterator();
                            while (it2.hasNext()) {
                                SpeedPredictorResultItem next2 = it2.next();
                                Object[] objArr = new Object[i3];
                                objArr[i2] = next2.getLoadType();
                                objArr[1] = next2.getHost();
                                objArr[2] = String.valueOf(key);
                                String a2 = com.a.a("%s|%s|%s", objArr);
                                if (next2.getTrackType() == 0) {
                                    abVar.f152573e.f152588f.add(Float.valueOf(next2.getBandwidth()));
                                    abVar.f152573e.f152589g.add(a2);
                                    if (!boolArr[i2].booleanValue()) {
                                        abVar.f152573e.f152587e.add(Integer.valueOf((int) j2));
                                        boolArr[i2] = true;
                                    } else {
                                        abVar.f152573e.f152587e.add(Integer.valueOf(i2));
                                    }
                                } else {
                                    if (next2.getTrackType() == 1) {
                                        abVar.f152573e.s.add(Float.valueOf(next2.getBandwidth()));
                                        abVar.f152573e.t.add(a2);
                                        if (!boolArr2[0].booleanValue()) {
                                            abVar.f152573e.r.add(Integer.valueOf((int) j2));
                                            boolArr2[0] = true;
                                        } else {
                                            abVar.f152573e.r.add(0);
                                        }
                                    }
                                    i2 = 0;
                                }
                                i3 = 3;
                            }
                        }
                        i2 = 0;
                    }
                    Iterator<SpeedPredictorResult> it3 = speedPredictorResultCollection2.getResultCollection().iterator();
                    while (it3.hasNext()) {
                        SpeedPredictorResult next3 = it3.next();
                        if (next3.getFileId().equals(value)) {
                            Object key2 = entry.getKey();
                            Iterator<SpeedPredictorResultItem> it4 = next3.getResultItems().iterator();
                            while (it4.hasNext()) {
                                SpeedPredictorResultItem next4 = it4.next();
                                String a3 = com.a.a("%s|%s|%s|%s", new Object[]{next4.getLoadType(), next4.getHost(), String.valueOf(key2), String.valueOf(abVar.f152574f.am)});
                                if (next4.getTrackType() == 0) {
                                    abVar.f152573e.f152590h.add(Float.valueOf(next4.getBandwidth()));
                                    abVar.f152573e.f152591i.add(a3);
                                } else if (next4.getTrackType() == 1) {
                                    abVar.f152573e.u.add(Float.valueOf(next4.getBandwidth()));
                                    abVar.f152573e.v.add(a3);
                                }
                            }
                        }
                    }
                    i2 = 0;
                }
                abVar.f152573e.f152586d++;
                abVar.f152573e.q++;
                if (abVar.f152573e.f152586d < abVar.f152569a && abVar.f152573e.q < abVar.f152569a) {
                    return;
                }
                if (abVar.f152573e.G == 0) {
                    abVar.a(0);
                } else {
                    abVar.d();
                }
            }
        }
    }

    @Override // com.ss.ttvideoengine.h.j
    public final void b(long j2, long j3) {
        MethodCollector.i(14135);
        synchronized ("VideoEventLoggerV2") {
            try {
                j.b("VideoEventLoggerV2", "global speed size:" + j2 + ", time:" + j3 + ", totalsize:" + this.f152685m + ", totaltime:" + this.n);
                this.f152685m += j2;
                this.n += j3;
            } finally {
                MethodCollector.o(14135);
            }
        }
    }

    @Override // com.ss.ttvideoengine.h.j
    public final void a(e eVar) {
        if (eVar != null) {
            c(eVar);
        }
    }

    @Override // com.ss.ttvideoengine.h.j
    public final void a(String str, String str2) {
        this.K = str;
        o oVar = this.f152675c;
        if (oVar != null) {
            oVar.s = str;
        }
        this.L = str2;
    }

    @Override // com.ss.ttvideoengine.h.j
    public final void a(long j2, int i2) {
        z zVar = this.f152674b;
        if (zVar != null && zVar.ae <= 0) {
            this.f152674b.ae = j2;
            this.f152674b.bZ = i2;
        }
    }

    @Override // com.ss.ttvideoengine.h.j
    public final void a(long j2) {
        z zVar = this.f152674b;
        if (zVar != null) {
            zVar.af = j2;
        }
    }

    @Override // com.ss.ttvideoengine.h.j
    public final void a(ArrayList arrayList) {
        this.I = arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: java.util.ArrayList<java.lang.Integer> */
    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: java.util.ArrayList<java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ttvideoengine.h.j
    public final void a(String str, long j2, String str2) {
        Map<String, Object> d2;
        MethodCollector.i(14267);
        this.av = 1;
        o oVar = this.f152675c;
        oVar.C = str;
        oVar.f152652g = str2;
        String str3 = oVar.f152652g;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
            sb.append("T");
        }
        sb.append(Long.toString(System.currentTimeMillis()));
        sb.append("T");
        sb.append(Integer.toString((int) (Math.random() * 65535.0d)));
        oVar.r = sb.toString();
        oVar.Z = oVar.r;
        if (this.aL == 1) {
            this.aG = j2;
        }
        if (this.aH <= 0) {
            this.aH = j2;
            f fVar = this.f152673a;
            if (!(fVar == null || (d2 = fVar.d()) == null)) {
                this.bz.add(d2.get("power"));
                this.bA.add(d2.get("isCharging"));
            }
        }
        this.A = true;
        this.f152674b.bP = this.f152675c.r;
        if (this.aL == 1) {
            this.f152674b.t = j2;
        } else {
            this.f152674b.t = 0;
        }
        this.f152674b.u = 0;
        this.f152674b.ae = 0;
        this.f152674b.af = 0;
        this.f152674b.ah = 0;
        this.f152674b.ai = 0;
        this.f152674b.aj = 0;
        this.f152674b.ak = 0;
        this.f152674b.al = 0;
        this.f152674b.am = 0;
        this.f152674b.an = 0;
        this.f152674b.ao = 0;
        this.f152674b.aw = 0;
        this.f152674b.ay = 0;
        this.f152674b.ax = 0;
        this.f152674b.az = 0;
        this.al++;
        this.f152674b.bH = -2147483648L;
        this.f152674b.bI = -2147483648L;
        this.f152674b.bJ = -2147483648L;
        this.f152674b.bK = -2147483648L;
        this.f152674b.bL = -2147483648L;
        this.f152674b.bM = -2147483648L;
        this.f152674b.bN = Integer.MIN_VALUE;
        this.f152674b.dY = this.aP;
        if (!this.aP) {
            this.aP = true;
        }
        if (this.f152675c.D.equals("vid")) {
            a(-1002, true);
        } else if (this.f152675c.D.equals("local_url")) {
            a(-1005, true);
        } else if (this.f152674b.bZ == 0) {
            a(-1003, true);
        } else if (this.f152674b.bZ == 1) {
            a(-1005, true);
        }
        if (this.aR) {
            this.w.a();
        }
        j.a("VideoEventLoggerV2", "netlevel interval:" + this.aX + ", max count:" + this.f152684l);
        if (this.aX > 0 && this.aV == null && this.aW == null) {
            this.aV = new Timer();
            c cVar = new c(this, (byte) 0);
            this.aW = cVar;
            this.aV.schedule(cVar, 1000, (long) this.aX);
            this.f152674b.cW = this.aX;
            o oVar2 = this.f152675c;
            if (oVar2.ac != null) {
                synchronized ("VideoEventBase") {
                    try {
                        if (o.f152648d == null) {
                            o.f152648d = ag.a();
                        }
                        oVar2.f152650e = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01b8: IPUT  
                              (wrap: com.ss.ttvideoengine.h.o$1 : 0x01b5: CONSTRUCTOR  (r0v76 com.ss.ttvideoengine.h.o$1) = (r5v2 'oVar2' com.ss.ttvideoengine.h.o) call: com.ss.ttvideoengine.h.o.1.<init>(com.ss.ttvideoengine.h.o):void type: CONSTRUCTOR)
                              (r5v2 'oVar2' com.ss.ttvideoengine.h.o)
                             com.ss.ttvideoengine.h.o.e com.ss.ttvideoengine.ah in method: com.ss.ttvideoengine.h.r.a(java.lang.String, long, java.lang.String):void, file: classes10.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01b5: CONSTRUCTOR  (r0v76 com.ss.ttvideoengine.h.o$1) = (r5v2 'oVar2' com.ss.ttvideoengine.h.o) call: com.ss.ttvideoengine.h.o.1.<init>(com.ss.ttvideoengine.h.o):void type: CONSTRUCTOR in method: com.ss.ttvideoengine.h.r.a(java.lang.String, long, java.lang.String):void, file: classes10.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 38 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.ttvideoengine.h.o, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 42 more
                            */
                        /*
                        // Method dump skipped, instructions count: 531
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.h.r.a(java.lang.String, long, java.lang.String):void");
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(com.ss.ttvideoengine.s.c cVar, int i2) {
                        HashMap a2 = cVar.a();
                        a2.put("apiver", Integer.valueOf(i2));
                        this.E.add(a2);
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(com.ss.ttvideoengine.s.c cVar) {
                        this.G.add(cVar);
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void b(e eVar) {
                        if (eVar != null) {
                            c(eVar);
                            if (this.f152674b.w <= 0) {
                                this.f152674b.s = System.currentTimeMillis();
                            }
                            this.B = true;
                            if (this.f152674b.bZ == 1) {
                                a(-1005, true);
                            } else if (this.f152674b.bZ == 0) {
                                a(-1004, true);
                            }
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(int i2, String str, com.ss.ttvideoengine.s.c cVar) {
                        HashMap hashMap = new HashMap();
                        if (cVar != null) {
                            hashMap = cVar.a();
                        }
                        hashMap.put("result", Integer.valueOf(i2));
                        if (str != null) {
                            hashMap.put("filehash", str);
                        }
                        this.F.add(new JSONObject(hashMap).toString());
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void b(String str, String str2) {
                        this.f152675c.a(str, str2);
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(String str, String str2, boolean z2) {
                        if (z2) {
                            if (this.av == 4) {
                                this.t.a("switch", 0);
                            }
                            if (this.av == 3) {
                                this.s.a("switch");
                                this.f152674b.bK = System.currentTimeMillis();
                            }
                        }
                        if (this.bC) {
                            long j2 = -1;
                            f fVar = this.f152673a;
                            if (fVar != null) {
                                j2 = (long) fVar.c(67);
                            }
                            this.u.a((int) j2, "switch");
                            this.bC = false;
                        }
                        this.f152674b.x = System.currentTimeMillis();
                        if (!str.equals(str2)) {
                            this.ao++;
                        }
                        this.f152675c.a(str, str2);
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.bL = System.currentTimeMillis();
                        }
                        if (z2) {
                            a(-2005, true);
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void b(boolean z2) {
                        if (z2) {
                            if (this.av == 4) {
                                this.t.a("wait", 0);
                            }
                            if (this.av == 3) {
                                this.av = 2;
                            }
                        }
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.bM = System.currentTimeMillis();
                            if (this.f152674b.bL > 0) {
                                long j2 = this.f152674b.bM - this.f152674b.bL;
                                int i2 = -1;
                                f fVar = this.f152673a;
                                if (fVar != null) {
                                    i2 = fVar.c(67);
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("to", this.f152675c.Q);
                                hashMap.put("p", Integer.valueOf(i2));
                                hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                                hashMap.put("c", Long.valueOf(j2));
                                hashMap.put("seam", Boolean.valueOf(z2));
                                this.bu.add(new JSONObject(hashMap).toString());
                            }
                        }
                        if (z2) {
                            a(-2005, false);
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(long j2, long j3) {
                        n nVar = this.x;
                        j.b("VideoEventAbrEvent", "abrSwitchStart");
                        n.b bVar = new n.b(nVar, (byte) 0);
                        bVar.f152633a = System.currentTimeMillis();
                        bVar.f152636d = nVar.f152623a.f152649a.a(102);
                        bVar.f152637e = j2;
                        bVar.f152638f = j3;
                        bVar.f152639g = (long) nVar.f152623a.f152649a.c(103);
                        bVar.f152640h = nVar.f152623a.f152649a.b(104);
                        bVar.f152641i = nVar.f152623a.f152649a.b(105);
                        bVar.n = nVar.f152623a.f152649a.c(109);
                        if (com.ss.ttvideoengine.q.c.f153180b != null) {
                            bVar.f152642j = com.ss.ttvideoengine.q.c.f153180b.getPredictSpeed(0);
                        }
                        nVar.f152624b.add(bVar);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ee  */
                    @Override // com.ss.ttvideoengine.h.j
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void a(com.ss.ttvideoengine.s.c r14, int r15, int r16) {
                        /*
                        // Method dump skipped, instructions count: 384
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.h.r.a(com.ss.ttvideoengine.s.c, int, int):void");
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void b(com.ss.ttvideoengine.s.c cVar, int i2) {
                        boolean z2;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (this.av == 4) {
                            this.t.a("error", 0);
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (this.av == 3) {
                            this.s.a("error");
                            this.f152674b.bK = currentTimeMillis;
                            z2 = false;
                        }
                        this.av = 5;
                        HashMap a2 = cVar.a();
                        a2.put("strategy", 0);
                        a2.put("apiver", Integer.valueOf(i2));
                        this.H.add(a2);
                        if (!this.A || this.f152674b.w > 0) {
                            if (cVar.d() && this.I.size() <= 1) {
                                this.f152680h++;
                            }
                            this.f152674b.x = currentTimeMillis;
                        } else {
                            this.f152674b.y = currentTimeMillis;
                        }
                        b(cVar);
                        long j2 = -1;
                        f fVar = this.f152673a;
                        if (fVar != null) {
                            j2 = (long) fVar.c(67);
                            if (this.f152674b.cw <= 0) {
                                this.f152673a.a(2, I());
                            }
                        }
                        if (this.bD != null) {
                            long j3 = this.bF;
                            if (j3 > 0) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("ec", Integer.valueOf(this.bD.f153260a));
                                hashMap.put("p", Long.valueOf(j2));
                                hashMap.put("t", Long.valueOf(currentTimeMillis));
                                hashMap.put("c", Long.valueOf(currentTimeMillis - j3));
                                hashMap.put("st", Integer.valueOf(this.bE));
                                this.by.add(new JSONObject(hashMap).toString());
                                this.bD = null;
                                this.bE = -1;
                                this.bF = -2147483648L;
                            }
                        }
                        if (z2) {
                            this.f152675c.a();
                        }
                        if (this.bC) {
                            this.u.a((int) j2, "error");
                            this.bC = false;
                        }
                        this.f152674b.K = cVar.b();
                        this.f152674b.L = cVar.f153260a;
                        V(4);
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(p pVar) {
                        if (this.f152674b != null) {
                            float f2 = pVar.f152093d;
                            HashMap hashMap = new HashMap();
                            this.W = hashMap;
                            hashMap.put("AFMode", Integer.valueOf(pVar.f152091b));
                            this.W.put("pitch", Float.valueOf(pVar.f152092c));
                            this.W.put("speed", Float.valueOf(f2));
                            if (this.f152675c.Y != f2 || this.bv.isEmpty()) {
                                this.f152675c.Y = f2;
                                HashMap hashMap2 = new HashMap();
                                int i2 = -1;
                                f fVar = this.f152673a;
                                if (fVar != null) {
                                    i2 = fVar.c(67);
                                }
                                hashMap2.put("to", Float.valueOf(this.f152675c.Y));
                                hashMap2.put("p", Integer.valueOf(i2));
                                hashMap2.put("t", Long.valueOf(System.currentTimeMillis()));
                                this.bv.add(new JSONObject(hashMap2).toString());
                            }
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(Map<String, Object> map) {
                        o oVar = this.f152675c;
                        if (oVar != null) {
                            oVar.al = map;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void b(Map<String, Object> map) {
                        o oVar = this.f152675c;
                        if (oVar != null) {
                            oVar.aq = map;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(String str) {
                        this.bn = str;
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v136, resolved type: java.util.ArrayList<java.lang.Integer> */
                    /* JADX DEBUG: Multi-variable search result rejected for r1v137, resolved type: java.util.ArrayList<java.lang.Integer> */
                    /* JADX WARN: Multi-variable type inference failed */
                    private void F() {
                        if (this.f152674b != null) {
                            if (!this.aT || !this.aU) {
                                j.a("VideoEventLoggerV2", "sendEvent pt_new:" + this.f152674b.f152822d + ", mEvent:" + this.f152674b + ", eventBase:" + this.f152675c);
                            } else {
                                j.a("VideoEventLoggerV2", "player degrade, store context");
                            }
                            if (this.f152674b.f152822d > 0 || this.aH > 0) {
                                f fVar = this.f152673a;
                                if (fVar != null) {
                                    Map<String, Long> b2 = fVar.b();
                                    if (b2 != null) {
                                        int intValue = b2.get("vps").intValue();
                                        int intValue2 = b2.get("vds").intValue();
                                        int intValue3 = b2.get("single_vds").intValue();
                                        this.f152674b.D = this.at + intValue;
                                        if (this.V) {
                                            this.f152674b.E = this.au + intValue3;
                                        } else {
                                            this.f152674b.E = this.au + intValue2;
                                        }
                                        com.ss.ttvideoengine.s.b.a(new be.a((long) this.f152674b.D));
                                    }
                                    this.f152674b.ba = this.f152673a.a(1);
                                    x(this.f152673a.a(2));
                                    this.f152674b.bb = this.f152673a.a(3);
                                    this.f152674b.bc = this.f152673a.a(4);
                                    this.f152674b.aD = this.f152673a.c(23);
                                    this.f152674b.bw = this.f152673a.c(34);
                                    this.f152674b.bv = this.f152673a.c(35);
                                    this.f152674b.bx = this.f152673a.c(36);
                                    if (this.f152674b.aF == null) {
                                        String a2 = this.f152673a.a(5);
                                        if (a2 == null) {
                                            a2 = "";
                                        }
                                        this.f152674b.aF = a2;
                                    }
                                    String a3 = this.f152673a.a(33);
                                    if (!TextUtils.isEmpty(a3)) {
                                        this.f152674b.aG = a3;
                                    }
                                    if (this.f152674b.ae <= 0) {
                                        this.f152674b.bZ = 1;
                                        this.f152674b.ae = this.f152673a.b(7);
                                    }
                                    if (this.f152674b.af <= 0) {
                                        long b3 = this.f152673a.b(10);
                                        if (b3 > this.aH) {
                                            this.f152674b.af = b3;
                                        }
                                    }
                                    if (this.f152674b.ah <= 0) {
                                        long b4 = this.f152673a.b(11);
                                        if (b4 > this.aH) {
                                            this.f152674b.ah = b4;
                                        }
                                    }
                                    if (this.f152674b.ai <= 0) {
                                        this.f152674b.ai = this.f152673a.b(51);
                                    }
                                    if (this.f152674b.aj <= 0) {
                                        long b5 = this.f152673a.b(52);
                                        if (b5 > this.aH) {
                                            this.f152674b.aj = b5;
                                        }
                                    }
                                    if (this.f152674b.ak <= 0) {
                                        long b6 = this.f152673a.b(53);
                                        if (b6 > this.aH) {
                                            this.f152674b.ak = b6;
                                        }
                                    }
                                    if (this.f152674b.al <= 0) {
                                        this.f152674b.al = this.f152673a.b(12);
                                    }
                                    if (this.f152674b.am <= 0) {
                                        this.f152674b.am = this.f152673a.b(13);
                                    }
                                    if (this.f152674b.an <= 0) {
                                        this.f152674b.an = this.f152673a.b(14);
                                    }
                                    if (this.f152674b.ao <= 0) {
                                        this.f152674b.ao = this.f152673a.b(15);
                                    }
                                    if (this.f152674b.aw <= 0) {
                                        this.f152674b.aw = this.f152673a.b(17);
                                    }
                                    if (this.f152674b.ay <= 0) {
                                        this.f152674b.ay = this.f152673a.b(16);
                                    }
                                    if (this.f152674b.ax <= 0) {
                                        this.f152674b.ax = this.f152673a.b(19);
                                    }
                                    if (this.f152674b.az <= 0) {
                                        this.f152674b.az = this.f152673a.b(18);
                                    }
                                    if (this.f152674b.bU <= 0) {
                                        this.f152674b.bU = this.f152673a.b(38);
                                    }
                                    if (this.f152674b.bV <= 0) {
                                        this.f152674b.bV = this.f152673a.b(39);
                                    }
                                    this.f152674b.bf = this.f152673a.c(61);
                                    this.f152674b.bg = this.f152673a.c(27);
                                    this.f152674b.aI = this.f152673a.c(30);
                                    this.f152674b.bs = this.f152673a.a(31);
                                    this.f152674b.bt = this.f152673a.a(32);
                                    this.f152674b.bn = this.f152673a.c(81);
                                    this.f152674b.cp = this.f152673a.b(54);
                                    this.f152674b.cq = this.f152673a.b(57);
                                    this.f152674b.cr = this.f152673a.b(58);
                                    int c2 = this.f152673a.c(100);
                                    if (c2 != 0) {
                                        this.f152674b.ci = c2;
                                    }
                                    if (this.f152674b.cL == Integer.MIN_VALUE) {
                                        this.f152674b.cL = this.f152673a.c(63);
                                    }
                                    if (this.f152674b.cM == Integer.MIN_VALUE) {
                                        this.f152674b.cM = this.f152673a.c(64);
                                    }
                                    if (this.f152675c.F == 1 && this.f152675c.E == 0) {
                                        this.f152674b.cv = this.f152673a.c(77);
                                    }
                                    this.f152674b.dZ = this.f152673a.c(87);
                                    Map<String, Object> d2 = this.f152673a.d();
                                    if (d2 != null) {
                                        this.bz.add(d2.get("power"));
                                        this.bA.add(d2.get("isCharging"));
                                    }
                                    ArrayList e2 = this.f152673a.e();
                                    if (e2 != null) {
                                        this.f152674b.dv = e2;
                                    }
                                }
                                int i2 = this.aa;
                                if (i2 > 0) {
                                    this.f152675c.H = i2;
                                }
                                Context context = this.aw;
                                if (context != null) {
                                    SharedPreferences a4 = d.a(context, "VideoEventLogger", 0);
                                    this.f152674b.cK = a4.getString("playersessionid", "");
                                    SharedPreferences.Editor edit = a4.edit();
                                    edit.putString("playersessionid", this.f152675c.r);
                                    edit.apply();
                                }
                                this.f152674b.cI = this.f152675c.r;
                                this.f152674b.bD = this.ay;
                                this.f152674b.aH = this.am;
                                this.f152674b.aJ = this.an;
                                this.f152674b.aP = this.ab;
                                this.f152674b.aQ = this.ae;
                                this.f152674b.C = this.I;
                                this.f152674b.J = this.f152675c.P;
                                this.f152674b.I = this.f152675c.Q;
                                this.f152674b.ab = this.S;
                                this.f152674b.ac = this.T;
                                this.f152674b.aL = this.U;
                                this.f152674b.F = this.ac;
                                this.f152674b.G = this.ad;
                                this.f152674b.aT = this.Y;
                                this.f152674b.aR = this.X;
                                this.f152674b.aS = this.C;
                                this.f152674b.bj = this.aj;
                                z zVar = this.f152674b;
                                com.ss.ttvideoengine.k.d.a();
                                zVar.bl = com.ss.ttvideoengine.k.d.f153021a;
                                this.f152674b.A = this.f152678f;
                                this.f152674b.B = this.f152680h;
                                this.f152674b.cm = this.az;
                                this.f152674b.cn = this.aA;
                                this.f152674b.cs = (long) this.aC;
                                this.f152674b.ct = (long) this.aD;
                                this.f152674b.cu = (long) this.aE;
                                this.f152674b.cB = this.aI;
                                this.f152674b.cD = this.aK;
                                this.f152674b.cC = this.aJ;
                                this.f152674b.cE = this.aL;
                                this.f152674b.cf = this.f152681i;
                                this.f152674b.cj = this.D;
                                long j2 = this.af;
                                if (j2 > 0) {
                                    this.f152674b.aA = j2;
                                }
                                this.f152674b.aB = this.ag;
                                u uVar = this.s;
                                if (uVar != null) {
                                    this.f152674b.aV = uVar.f152715d;
                                }
                                this.f152674b.aW = this.f152677e;
                                this.f152674b.aZ = this.ap;
                                this.f152674b.aM = this.ao;
                                this.f152674b.cF = this.aM;
                                this.f152674b.cH = this.aN;
                                this.f152674b.cG = this.aO;
                                this.f152674b.bu = this.f152682j;
                                this.f152674b.de = this.r;
                                this.f152674b.dd = this.q;
                                this.f152674b.db = this.p;
                                this.f152674b.da = this.o;
                                this.f152674b.dM = this.bf;
                                this.f152674b.dN = H();
                                this.f152674b.dO = G();
                                this.f152674b.dP = g.a();
                                this.f152674b.dQ = g.b();
                                this.f152674b.dR = g.c();
                                if (this.aZ.a() > 0.0f) {
                                    this.f152674b.dS = this.aZ.a();
                                }
                                if (this.aZ.b() > 0.0f) {
                                    this.f152674b.dT = this.aZ.b();
                                }
                                this.f152674b.dU = this.ba.f152597b;
                                this.f152674b.dV = this.bb.f152610b;
                                this.f152674b.dW = this.bc.a();
                                HashMap hashMap = new HashMap();
                                int i3 = 0;
                                while (i3 < this.E.size() && i3 < 3) {
                                    try {
                                        hashMap.put(com.a.a("fetchretry%d", new Object[]{Integer.valueOf(i3)}), this.E.get(i3));
                                        i3++;
                                    } catch (Exception e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                int i4 = 0;
                                while (i4 < this.G.size() && i4 < 3) {
                                    hashMap.put(com.a.a("ldns%d", new Object[]{Integer.valueOf(i4)}), ((com.ss.ttvideoengine.s.c) this.G.get(i4)).a());
                                    i4++;
                                }
                                for (int i5 = 0; i5 < this.H.size(); i5++) {
                                    if (i5 < 2 || i5 == this.H.size() - 1) {
                                        hashMap.put(com.a.a("error%d", new Object[]{Integer.valueOf(i5)}), this.H.get(i5));
                                    }
                                }
                                if (!TextUtils.isEmpty(this.R)) {
                                    hashMap.put("log", this.R);
                                }
                                if (!TextUtils.isEmpty(this.f152674b.ch)) {
                                    hashMap.put("tr_err_msg", this.f152674b.ch);
                                }
                                this.R = "";
                                this.f152674b.ad = hashMap;
                                this.ax = hashMap.toString();
                                String str = this.J;
                                if (str != null) {
                                    this.f152674b.R = str;
                                }
                                String str2 = this.K;
                                if (str2 != null) {
                                    this.f152674b.S = str2;
                                }
                                String str3 = this.L;
                                if (str3 != null) {
                                    this.f152674b.T = str3;
                                }
                                String str4 = this.M;
                                if (str4 != null) {
                                    this.f152674b.U = str4;
                                }
                                String str5 = this.N;
                                if (str5 != null) {
                                    this.f152674b.V = str5;
                                }
                                String str6 = this.O;
                                if (str6 != null) {
                                    this.f152674b.W = str6;
                                }
                                String str7 = this.P;
                                if (str7 != null) {
                                    this.f152674b.X = str7;
                                }
                                Map map = this.W;
                                if (map != null) {
                                    this.f152674b.aK = map;
                                }
                                String str8 = this.bn;
                                if (str8 != null) {
                                    this.f152674b.dJ = str8;
                                }
                                String str9 = this.bo;
                                if (str9 != null) {
                                    this.f152674b.dI = str9;
                                }
                                String str10 = this.bp;
                                if (str10 != null) {
                                    this.f152674b.dK = str10;
                                }
                                if (this.f152674b.dA <= 0) {
                                    this.f152674b.dA = -2147483648L;
                                }
                                if (this.f152674b.dz <= 0) {
                                    this.f152674b.dz = -2147483648L;
                                }
                                if (this.f152674b.dx <= 0) {
                                    this.f152674b.dx = -2147483648L;
                                }
                                if (this.f152674b.dy <= 0) {
                                    this.f152674b.dy = -2147483648L;
                                }
                                this.f152674b.dC = this.bi;
                                this.f152674b.dD = this.bk;
                                this.f152674b.dE = this.bl;
                                this.f152674b.dF = this.bm;
                                this.f152674b.dB = this.bq;
                                this.f152674b.dG = this.bg;
                                this.f152674b.dH = this.bh;
                                this.f152674b.bh = this.ak;
                                this.f152674b.bi = this.f152675c.ar;
                                this.f152674b.br = this.ah;
                                this.f152674b.co = aB;
                                aB = 0;
                                if (this.f152674b.bI < this.f152674b.bH) {
                                    this.f152674b.bI = -2147483648L;
                                }
                                if (this.f152674b.bM < this.f152674b.bL) {
                                    this.f152674b.bM = -2147483648L;
                                }
                                this.f152674b.f152819a = this.aF;
                                this.f152674b.f152820b = this.aG;
                                z zVar2 = this.f152674b;
                                zVar2.r = zVar2.f152822d;
                                this.f152674b.f152821c = this.aH;
                                if (this.f152674b.x <= 0 && this.f152674b.w > 0) {
                                    this.f152674b.x = System.currentTimeMillis();
                                }
                                this.f152674b.df = this.bs;
                                this.f152674b.dg = this.bt;
                                this.f152674b.dh = this.bu;
                                this.f152674b.di = this.bv;
                                this.f152674b.dj = this.bw;
                                this.f152674b.dk = this.bx;
                                this.f152674b.dl = this.by;
                                this.f152674b.dm = this.s.f152716e;
                                this.f152674b.dn = this.t.f152768g;
                                this.f152674b.dp = this.y.d();
                                this.f152674b.f350do = this.u.f152793c;
                                this.f152674b.dw = this.u.f152794d;
                                this.f152674b.dX = this.F;
                                this.f152674b.ds = this.bz;
                                this.f152674b.dt = this.bA;
                                this.f152674b.du = this.bB;
                                if (this.v.f152742c) {
                                    this.v.a();
                                }
                                this.f152674b.dq = this.v.f152745f;
                                this.f152674b.dr = this.v.f152744e;
                                B();
                                A();
                                if (TextUtils.isEmpty(this.f152674b.cJ)) {
                                    D();
                                }
                                if (this.ar > 0) {
                                    this.f152674b.bE = (int) (SystemClock.elapsedRealtime() - this.ar);
                                }
                                x xVar = this.t;
                                if (xVar != null) {
                                    this.f152674b.bG = xVar.f152767f;
                                }
                                if (m.b()) {
                                    this.f152674b.bO = m.a() - System.currentTimeMillis();
                                }
                                E();
                                this.f152674b.cY = ag.a.a().c();
                                if (!this.aT) {
                                    com.ss.ttvideoengine.s.b.a(new a(this.aw, this.f152674b, this, this.f152675c));
                                } else if (this.aU) {
                                    j.a("VideoEventLoggerV2", "degrade1, vid:" + this.f152675c.ah);
                                    aa.b.f152568a.a(this.f152675c.ah, this.f152674b);
                                    aa.b.f152568a.a(this.f152675c.ah, this.f152675c.r);
                                    this.aU = false;
                                } else {
                                    j.a("VideoEventLoggerV2", "degrade2, vid:" + this.f152675c.ah);
                                    aa.b.f152568a.a(this.f152675c.ah, this.f152674b);
                                    this.f152675c.e();
                                    this.f152674b = aa.b.f152568a.c(this.f152675c.ah);
                                    com.ss.ttvideoengine.s.b.a(new a(this.aw, this.f152674b, this, this.f152675c));
                                    aa.b.f152568a.d(this.f152675c.ah);
                                }
                                z();
                            }
                        }
                    }

                    /* access modifiers changed from: package-private */
                    public static class a implements Runnable {

                        /* renamed from: a  reason: collision with root package name */
                        r f152688a;

                        /* renamed from: b  reason: collision with root package name */
                        o f152689b;

                        /* renamed from: c  reason: collision with root package name */
                        private z f152690c;

                        /* renamed from: d  reason: collision with root package name */
                        private Context f152691d;

                        /* renamed from: e  reason: collision with root package name */
                        private Handler f152692e = new Handler(Looper.getMainLooper());

                        static {
                            Covode.recordClassIndex(101626);
                        }

                        public final void run() {
                            JSONObject jSONObject;
                            j.a("VideoEventLoggerV2", "AyncGetLogDataRunnable enter");
                            z zVar = this.f152690c;
                            if (zVar == null) {
                                j.e("VideoEventLoggerV2", "rEvent is null, return.");
                                return;
                            }
                            zVar.be = (int) i.b(this.f152691d);
                            if (TextUtils.isEmpty(this.f152690c.aU)) {
                                this.f152690c.aU = c.a.f152365a.a();
                            }
                            o oVar = this.f152689b;
                            if (oVar != null) {
                                oVar.c();
                                this.f152689b.ab = o.d();
                                if (this.f152689b.ai.f152663d == 2) {
                                    this.f152690c.cZ.put("preload", 1);
                                }
                            }
                            z zVar2 = this.f152690c;
                            o oVar2 = this.f152689b;
                            if (oVar2 == null) {
                                jSONObject = null;
                            } else {
                                HashMap hashMap = new HashMap();
                                if (zVar2.w <= 0) {
                                    if (oVar2.D.equals("vid") && zVar2.s <= 0) {
                                        zVar2.bD = -1002;
                                    }
                                    if (zVar2.bz <= 0 && zVar2.ai <= 0 && !oVar2.D.equals("local_url")) {
                                        zVar2.bD = -1004;
                                    } else if (zVar2.t <= 0) {
                                        zVar2.bD = -1003;
                                    } else if (zVar2.f152824f <= 0) {
                                        zVar2.bD = -1006;
                                    } else if (zVar2.f152827i <= 0) {
                                        zVar2.bD = -1007;
                                    } else if (zVar2.af <= 0) {
                                        zVar2.bD = -1008;
                                    } else if (zVar2.ah <= 0) {
                                        zVar2.bD = -1009;
                                    } else if (zVar2.f152825g <= 0) {
                                        zVar2.bD = -1010;
                                    } else if (zVar2.f152826h <= 0) {
                                        zVar2.bD = -1011;
                                    } else if (zVar2.f152828j <= 0) {
                                        zVar2.bD = -1012;
                                    } else if (zVar2.cB == 0 && zVar2.q <= 0) {
                                        zVar2.bD = -1014;
                                    } else if (zVar2.p <= 0) {
                                        zVar2.bD = -1015;
                                    } else if (zVar2.f152829k <= 0) {
                                        zVar2.bD = -1013;
                                    } else if (zVar2.cB != 0 || zVar2.ax > 0) {
                                        if (zVar2.az <= 0) {
                                            zVar2.bD = -1017;
                                        } else if (zVar2.cB == 0 && zVar2.al <= 0) {
                                            zVar2.bD = -1018;
                                        } else if (zVar2.am <= 0) {
                                            zVar2.bD = -1019;
                                        } else if (zVar2.cB == 0 && zVar2.an <= 0) {
                                            zVar2.bD = -1020;
                                        } else if (zVar2.ao <= 0) {
                                            zVar2.bD = -1021;
                                        } else if (zVar2.cB == 0 && zVar2.f152830l <= 0) {
                                            zVar2.bD = -1022;
                                        } else if (zVar2.f152831m <= 0) {
                                            zVar2.bD = -1023;
                                        } else {
                                            zVar2.bD = -1024;
                                        }
                                    } else if (zVar2.aA <= 0) {
                                        zVar2.bD = -1025;
                                    } else {
                                        zVar2.bD = -1016;
                                    }
                                }
                                l.a(hashMap, "player_sessionid", zVar2.cI);
                                l.a(hashMap, "log_type", "video_playq");
                                l.a(hashMap, "sdk_version", oVar2.f152656k);
                                l.a((Map) hashMap, "plugin_exception", zVar2.Z);
                                l.a(hashMap, "sv", oVar2.f152655j);
                                l.a(hashMap, "pv", oVar2.f152653h);
                                l.a(hashMap, "pc", oVar2.f152654i);
                                l.a(hashMap, "ffv", oVar2.f152657l);
                                l.a(hashMap, "vcnv", oVar2.f152658m);
                                l.a(hashMap, "trv", oVar2.n);
                                l.a(hashMap, "prldv", oVar2.o);
                                l.a(hashMap, "abrv", oVar2.p);
                                l.a(hashMap, "prdtv", oVar2.q);
                                l.a(hashMap, "v", oVar2.C);
                                l.a((Map) hashMap, "play_type", oVar2.B);
                                l.a(hashMap, "pt", zVar2.r);
                                l.a(hashMap, "at", zVar2.s);
                                l.a(hashMap, "prepare_start_time", zVar2.t);
                                l.a(hashMap, "prepare_end_time", zVar2.u);
                                l.a(hashMap, "play_preparedt", zVar2.bU);
                                l.a(hashMap, "play_startedt", zVar2.bV);
                                l.a(hashMap, "vt", zVar2.w);
                                l.a(hashMap, "et", zVar2.x);
                                l.a(hashMap, "lt", zVar2.y);
                                l.a(hashMap, "bft", zVar2.z);
                                l.a((Map) hashMap, "bc", zVar2.A);
                                l.a((Map) hashMap, "br", zVar2.B);
                                l.a(hashMap, "vu", zVar2.C);
                                l.a((Map) hashMap, "vd", oVar2.H);
                                l.a((Map) hashMap, "vs", oVar2.I);
                                l.a((Map) hashMap, "vps", zVar2.D);
                                l.a((Map) hashMap, "vds", zVar2.E);
                                l.a((Map) hashMap, "width", zVar2.F);
                                l.a((Map) hashMap, "height", zVar2.G);
                                l.a((Map) hashMap, "async_init", zVar2.aS);
                                l.a((Map) hashMap, "async_codec_id", zVar2.bj);
                                l.a((Map) hashMap, "video_preload_size", zVar2.H);
                                l.a(hashMap, "df", zVar2.I);
                                l.a(hashMap, "lf", zVar2.J);
                                l.a(hashMap, "codec", oVar2.J);
                                l.a(hashMap, "render_type", zVar2.ba);
                                l.a((Map) hashMap, "hijack", zVar2.Y);
                                l.a((Map) hashMap, "hw", oVar2.E);
                                l.a((Map) hashMap, "hw_user", oVar2.F);
                                l.a((Map) hashMap, "hw_err_reason", zVar2.cv);
                                l.a((Map) hashMap, "audio_hw_user", oVar2.G);
                                l.a(hashMap, "dns_t", zVar2.ae);
                                l.a(hashMap, "tran_ct", zVar2.af);
                                l.a(hashMap, "tran_ft", zVar2.ah);
                                l.a(hashMap, "a_dns_t", zVar2.ai);
                                l.a(hashMap, "a_tran_ct", zVar2.aj);
                                l.a(hashMap, "a_tran_ft", zVar2.ak);
                                l.a(hashMap, "re_f_videoframet", zVar2.al);
                                l.a(hashMap, "de_f_videoframet", zVar2.an);
                                l.a(hashMap, "re_f_audioframet", zVar2.am);
                                l.a(hashMap, "de_f_audioframet", zVar2.ao);
                                l.a(hashMap, "bu_acu_t", zVar2.aV);
                                l.a(hashMap, "de_bu_acu_t", zVar2.aW);
                                l.a(hashMap, "internal_ip", zVar2.aF);
                                l.a(hashMap, "tag", oVar2.T);
                                l.a(hashMap, "subtag", oVar2.U);
                                l.a(hashMap, "ex", z.a(zVar2.ad));
                                l.a(hashMap, "mdlretry", zVar2.dX);
                                l.a(hashMap, "first_buf_startt", zVar2.ap);
                                l.a(hashMap, "first_buf_endt", zVar2.aq);
                                l.a(hashMap, "cur_play_pos", zVar2.ar);
                                l.a((Map) hashMap, "engine_state", zVar2.aD);
                                l.a((Map) hashMap, "video_out_fps", zVar2.as);
                                l.a((Map) hashMap, "container_fps", zVar2.at);
                                l.a((Map) hashMap, "video_decoder_fps", zVar2.bo);
                                l.a(hashMap, "clock_diff", zVar2.au);
                                l.a((Map) hashMap, "drop_count", zVar2.av);
                                l.a(hashMap, "video_device_opened_t", zVar2.ax);
                                l.a(hashMap, "audio_device_opened_t", zVar2.az);
                                l.a((Map) hashMap, "finish", zVar2.aE);
                                l.a((Map) hashMap, "is_start_play_automatically", zVar2.ab);
                                l.a(hashMap, "player_create_exception", zVar2.aa);
                                l.a(hashMap, "custom_str", zVar2.R);
                                l.a(hashMap, "initial_url", zVar2.S);
                                l.a(hashMap, "init_audio_url", zVar2.T);
                                l.a(hashMap, "initial_host", zVar2.U);
                                l.a(hashMap, "initial_ip", zVar2.V);
                                l.a(hashMap, "initial_resolution", zVar2.W);
                                l.a(hashMap, "initial_quality", zVar2.X);
                                l.a((Map) hashMap, "apiver", zVar2.aH);
                                l.a(hashMap, "auth", zVar2.aJ);
                                l.a((Map) hashMap, "apiver_final", zVar2.aI);
                                l.a(hashMap, "playparam", z.a(zVar2.aK));
                                l.a(hashMap, "vtype", oVar2.N);
                                l.a(hashMap, "dynamic_type", oVar2.O);
                                l.a((Map) hashMap, "lc", zVar2.aL);
                                l.a((Map) hashMap, "switch_resolution_c", zVar2.aM);
                                l.a((Map) hashMap, "watch_dur", zVar2.aN);
                                l.a((Map) hashMap, "sc", zVar2.aZ);
                                l.a((Map) hashMap, "vid_cache", zVar2.aO);
                                l.a((Map) hashMap, "custom_p2p_cdn_type", zVar2.aR);
                                l.a(hashMap, "p2p_load_info", zVar2.aU);
                                l.a((Map) hashMap, "start_time", zVar2.aP);
                                l.a((Map) hashMap, "disable_accurate_start", zVar2.aQ);
                                l.a((Map) hashMap, "audio_codec_nameId", oVar2.K);
                                l.a((Map) hashMap, "video_codec_nameId", oVar2.L);
                                l.a((Map) hashMap, "format_type", oVar2.M);
                                l.a(hashMap, "surface_set_time", zVar2.aA);
                                l.a(hashMap, "surface_code", zVar2.aB);
                                l.a((Map) hashMap, "frames_drop_set_num", zVar2.aC);
                                l.a(hashMap, "video_device_start_t", zVar2.aw);
                                l.a(hashMap, "audio_device_start_t", zVar2.ay);
                                l.a((Map) hashMap, "video_length", zVar2.aX);
                                l.a((Map) hashMap, "audio_length", zVar2.aY);
                                l.a(hashMap, "api_str", zVar2.bb);
                                l.a(hashMap, "net_client", zVar2.bc);
                                l.a((Map) hashMap, "fetch_lv", zVar2.bd);
                                l.a((Map) hashMap, "volume", zVar2.be);
                                l.a((Map) hashMap, "core_volume", zVar2.bf);
                                l.a((Map) hashMap, "ae_type", zVar2.bn);
                                l.a((Map) hashMap, "mute", zVar2.bg);
                                l.a(hashMap, "source_type", oVar2.D);
                                l.a((Map) hashMap, "sharp", zVar2.bk);
                                l.a(hashMap, "dns_server_ip", zVar2.bl);
                                l.a(hashMap, "abr_info", z.a(oVar2.al));
                                l.a(hashMap, "abr_general_info", z.a(oVar2.aq));
                                l.a(hashMap, "enc_key", zVar2.bm);
                                l.a(hashMap, "hw_codec_name", zVar2.bp);
                                l.a((Map) hashMap, "hw_codec_exception", zVar2.bq);
                                l.a((Map) hashMap, "enable_bash", zVar2.bh);
                                l.a((Map) hashMap, "enable_mdl", zVar2.bi);
                                l.a((Map) hashMap, "network_try_count", zVar2.br);
                                l.a(hashMap, "chipboard", zVar2.bs);
                                l.a(hashMap, "chiphardware", zVar2.bt);
                                l.a((Map) hashMap, "buffer_timeout", zVar2.bu);
                                l.a(hashMap, "dns_start_t", zVar2.by);
                                l.a(hashMap, "dns_end_t", zVar2.bz);
                                l.a(hashMap, "dns_type", oVar2.y);
                                l.a(hashMap, "player_created_t", zVar2.bA);
                                l.a((Map) hashMap, "errt", zVar2.K);
                                l.a((Map) hashMap, "errc", zVar2.L);
                                l.a((Map) hashMap, "fir_errt", zVar2.M);
                                l.a((Map) hashMap, "fir_errc", zVar2.N);
                                l.a((Map) hashMap, "fir_errc_in", zVar2.O);
                                l.a((Map) hashMap, "vsc", zVar2.P);
                                l.a(hashMap, "vsc_message", zVar2.Q);
                                l.a(hashMap, "sub_events", z.a(zVar2.bB));
                                l.a(hashMap, "mask_events", z.a(zVar2.bC));
                                l.a((Map) hashMap, "lv_reason", zVar2.bD);
                                l.a((Map) hashMap, "lv_bt", zVar2.bE);
                                l.a((Map) hashMap, "lv_method", zVar2.bF);
                                l.a((Map) hashMap, "sat", zVar2.bG);
                                l.a(hashMap, "lsst", zVar2.bH);
                                l.a(hashMap, "lset", zVar2.bI);
                                l.a(hashMap, "lbst", zVar2.bJ);
                                l.a(hashMap, "lbet", zVar2.bK);
                                l.a((Map) hashMap, "lsp", zVar2.bN);
                                l.a(hashMap, "sl_diff", zVar2.bO);
                                l.a(hashMap, "trace_id", zVar2.bP);
                                l.a((Map) hashMap, "network_timeout", zVar2.bv);
                                l.a((Map) hashMap, "is_pref_near_sam", zVar2.bw);
                                l.a((Map) hashMap, "is_disable_short_seek", zVar2.bx);
                                l.a((Map) hashMap, "drm_type", oVar2.W);
                                l.a(hashMap, "drm_token_url", oVar2.X);
                                l.a((Map) hashMap, "check_hijack", zVar2.bQ);
                                l.a((Map) hashMap, "hijack_retry", zVar2.bR);
                                l.a((Map) hashMap, "first_hijack_code", zVar2.bS);
                                l.a((Map) hashMap, "last_hijack_code", zVar2.bT);
                                l.a(hashMap, "mdl_loader_type", zVar2.aG);
                                l.a(hashMap, "mdl_version", oVar2.ad);
                                l.a((Map) hashMap, "dns_mod", zVar2.bZ);
                                l.a((Map) hashMap, "vd_err", zVar2.bW);
                                l.a((Map) hashMap, "ad_err", zVar2.bX);
                                l.a((Map) hashMap, "vr_err", zVar2.bY);
                                l.a(hashMap, "nt", oVar2.ab);
                                l.a(hashMap, "vpls", zVar2.ca);
                                l.a(hashMap, "d_apls", zVar2.cc);
                                l.a(hashMap, "d_vpls", zVar2.cb);
                                l.a((Map) hashMap, "vt_speed", (float) zVar2.cd);
                                l.a((Map) hashMap, "end_speed", (float) zVar2.ce);
                                l.a((Map) hashMap, "mediacodec_render", zVar2.cf);
                                l.a((Map) hashMap, "tr", zVar2.cg);
                                l.a((Map) hashMap, "tr_err", zVar2.ci);
                                l.a((Map) hashMap, "cp", zVar2.cj);
                                l.a(hashMap, "bit_rate", zVar2.cm);
                                l.a(hashMap, "audio_bitrate", zVar2.cn);
                                l.a((Map) hashMap, "cold_start", zVar2.co);
                                l.a(hashMap, "av_gap", zVar2.cp);
                                l.a(hashMap, "moov_pos", zVar2.cq);
                                l.a(hashMap, "mdat_pos", zVar2.cr);
                                l.a(hashMap, "frange_size", zVar2.cs);
                                l.a(hashMap, "net_speed_level", zVar2.ct);
                                l.a(hashMap, "video_model_version", zVar2.cu);
                                l.a((Map) hashMap, "p2p_play_num", zVar2.cy);
                                l.a((Map) hashMap, "p2p_min_play_num", zVar2.cx);
                                l.a((Map) hashMap, "p2p_min_speed", zVar2.cz);
                                l.a((Map) hashMap, "p2p_probe_speed", zVar2.cA);
                                l.a(hashMap, "prepare_before_play_t", zVar2.f152819a);
                                l.a(hashMap, "setds_t", zVar2.f152820b);
                                l.a(hashMap, "ps_t", zVar2.f152821c);
                                l.a(hashMap, "pt_new", zVar2.f152822d);
                                l.a(hashMap, "a_dns_start_t", zVar2.f152823e);
                                l.a(hashMap, "formater_create_t", zVar2.f152824f);
                                l.a(hashMap, "avformat_open_t", zVar2.f152825g);
                                l.a(hashMap, "demuxer_begin_t", zVar2.f152827i);
                                l.a(hashMap, "demuxer_create_t", zVar2.f152826h);
                                l.a(hashMap, "dec_create_t", zVar2.f152828j);
                                l.a(hashMap, "outlet_create_t", zVar2.f152829k);
                                l.a(hashMap, "v_render_f_t", zVar2.f152830l);
                                l.a(hashMap, "a_render_f_t", zVar2.f152831m);
                                l.a(hashMap, "a_dec_start_t", zVar2.n);
                                l.a(hashMap, "v_dec_start_t", zVar2.o);
                                l.a(hashMap, "a_dec_opened_t", zVar2.p);
                                l.a(hashMap, "v_dec_opened_t", zVar2.q);
                                l.a((Map) hashMap, "radio_mode", zVar2.cB);
                                l.a((Map) hashMap, "v_disabled", zVar2.cC ? 1 : 0);
                                l.a((Map) hashMap, "a_disabled", zVar2.cD ? 1 : 0);
                                l.a((Map) hashMap, "is_replay", zVar2.cE);
                                l.a(hashMap, "play_log_id", zVar2.cJ);
                                l.a((Map) hashMap, "enable_nnsr", zVar2.cF);
                                l.a((Map) hashMap, "at_r", zVar2.cH);
                                l.a((Map) hashMap, "at_rs", zVar2.cG);
                                l.a((Map) hashMap, "video_codec_profile", zVar2.cL);
                                l.a((Map) hashMap, "audio_codec_profile", zVar2.cM);
                                l.a(hashMap, "last_sessionid", zVar2.cK);
                                l.a(hashMap, "nettype_list", z.a(zVar2.cP));
                                l.a(hashMap, "sigstrength_list", z.a(zVar2.cQ));
                                l.a(hashMap, "netspeed_list", zVar2.cR);
                                l.a(hashMap, "quality_list", z.a(zVar2.cS));
                                l.a(hashMap, "bitrate_list", z.a(zVar2.cT));
                                l.a(hashMap, "catowerrtt_list", zVar2.cU);
                                l.a(hashMap, "catowerrttms_list", zVar2.cV);
                                l.a((Map) hashMap, "netquality_int", zVar2.cW);
                                l.a(hashMap, "features", z.a(zVar2.cZ));
                                l.a((Map) hashMap, "network_score", zVar2.cY);
                                l.a(hashMap, "before_play_buffer_start_t", zVar2.ck);
                                l.a(hashMap, "before_play_buffer_end_t", zVar2.cl);
                                l.a(hashMap, "cur_req_pos", oVar2.ai.f152660a);
                                l.a(hashMap, "cur_end_pos", oVar2.ai.f152661b);
                                l.a(hashMap, "cur_cache_pos", oVar2.ai.f152662c);
                                l.a((Map) hashMap, "cache_type", oVar2.ai.f152663d);
                                l.a(hashMap, "cur_ip", oVar2.ai.f152664e);
                                l.a(hashMap, "cur_host", oVar2.ai.f152665f);
                                l.a(hashMap, "cur_url", oVar2.ai.f152666g);
                                l.a(hashMap, "reply_size", oVar2.ai.f152667h);
                                l.a(hashMap, "down_pos", oVar2.ai.f152668i);
                                l.a(hashMap, "player_wait_time", oVar2.ai.f152669j);
                                l.a((Map) hashMap, "player_wait_num", oVar2.ai.f152670k);
                                l.a((Map) hashMap, "mdl_speed", oVar2.ai.n);
                                l.a(hashMap, "mdl_file_key", oVar2.ai.o);
                                l.a((Map) hashMap, "mdl_is_socrf", oVar2.ai.p);
                                l.a((Map) hashMap, "mdl_req_num", oVar2.ai.Q);
                                l.a((Map) hashMap, "mdl_url_index", oVar2.ai.q);
                                l.a(hashMap, "mdl_re_url", oVar2.ai.r);
                                l.a((Map) hashMap, "mdl_cur_source", oVar2.ai.s);
                                l.a(hashMap, "mdl_extra_info", oVar2.ai.t);
                                l.a((Map) hashMap, "mdl_ec", oVar2.ai.f152672m);
                                l.a(hashMap, "mdl_fs", oVar2.ai.D);
                                l.a((Map) hashMap, "mdl_stage", oVar2.ai.f152671l);
                                l.a(hashMap, "req_t", oVar2.ai.v);
                                l.a(hashMap, "end_t", oVar2.ai.w);
                                l.a(hashMap, "mdl_dns_t", oVar2.ai.x);
                                l.a(hashMap, "tcp_con_start_t", oVar2.ai.y);
                                l.a(hashMap, "tcp_con_t", oVar2.ai.z);
                                l.a(hashMap, "tcp_first_pack_t", oVar2.ai.A);
                                l.a(hashMap, "http_first_body_t", oVar2.ai.B);
                                l.a(hashMap, "http_open_end_t", oVar2.ai.C);
                                l.a((Map) hashMap, "http_code", oVar2.ai.u);
                                l.a((Map) hashMap, "mdl_p2p_sp", oVar2.ai.E);
                                l.a((Map) hashMap, "mdl_res_err", oVar2.ai.H);
                                l.a((Map) hashMap, "mdl_read_src", oVar2.ai.I);
                                l.a((Map) hashMap, "mdl_seek_num", oVar2.ai.J);
                                l.a(hashMap, "mdl_last_msg", oVar2.ai.K);
                                l.a(hashMap, "mdl_server_timing", oVar2.ai.L);
                                l.a((Map) hashMap, "mdl_v_lt", oVar2.ai.M);
                                l.a((Map) hashMap, "mdl_v_p2p_ier", oVar2.ai.N);
                                l.a(hashMap, "mdl_ip_list", oVar2.ai.O);
                                l.a(hashMap, "mdl_blocked_ips", oVar2.ai.P);
                                l.a(hashMap, "mdl_response_cache", oVar2.ai.R);
                                l.a(hashMap, "mdl_response_cinfo", oVar2.ai.S);
                                l.a((Map) hashMap, "mdl_disable_seek", oVar2.ai.T);
                                l.a(hashMap, "a_cur_req_pos", oVar2.aj.f152660a);
                                l.a(hashMap, "a_cur_end_pos", oVar2.aj.f152661b);
                                l.a(hashMap, "a_cur_cache_pos", oVar2.aj.f152662c);
                                l.a((Map) hashMap, "a_cache_type", oVar2.aj.f152663d);
                                l.a(hashMap, "a_cur_ip", oVar2.aj.f152664e);
                                l.a(hashMap, "a_cur_host", oVar2.aj.f152665f);
                                l.a(hashMap, "a_cur_url", oVar2.aj.f152666g);
                                l.a(hashMap, "a_reply_size", oVar2.aj.f152667h);
                                l.a(hashMap, "a_down_pos", oVar2.aj.f152668i);
                                l.a(hashMap, "a_player_wait_time", oVar2.aj.f152669j);
                                l.a((Map) hashMap, "a_player_wait_num", oVar2.aj.f152670k);
                                l.a((Map) hashMap, "a_mdl_speed", oVar2.aj.n);
                                l.a(hashMap, "a_mdl_file_key", oVar2.aj.o);
                                l.a((Map) hashMap, "a_mdl_is_socrf", oVar2.aj.p);
                                l.a((Map) hashMap, "a_mdl_req_num", oVar2.aj.Q);
                                l.a((Map) hashMap, "a_mdl_url_index", oVar2.aj.q);
                                l.a(hashMap, "a_mdl_re_url", oVar2.aj.r);
                                l.a((Map) hashMap, "a_mdl_cur_source", oVar2.aj.s);
                                l.a(hashMap, "a_mdl_extra_info", oVar2.aj.t);
                                l.a((Map) hashMap, "a_mdl_ec", oVar2.aj.f152672m);
                                l.a(hashMap, "a_mdl_fs", oVar2.aj.D);
                                l.a((Map) hashMap, "a_mdl_stage", oVar2.aj.f152671l);
                                l.a(hashMap, "a_req_t", oVar2.aj.v);
                                l.a(hashMap, "a_end_t", oVar2.aj.w);
                                l.a(hashMap, "a_mdl_dns_t", oVar2.aj.x);
                                l.a(hashMap, "a_tcp_con_start_t", oVar2.aj.y);
                                l.a(hashMap, "a_tcp_con_t", oVar2.aj.z);
                                l.a(hashMap, "a_tcp_first_pack_t", oVar2.aj.A);
                                l.a(hashMap, "a_http_first_body_t", oVar2.aj.B);
                                l.a(hashMap, "a_http_open_end_t", oVar2.aj.C);
                                l.a((Map) hashMap, "a_http_code", oVar2.aj.u);
                                l.a((Map) hashMap, "a_mdl_res_err", oVar2.aj.H);
                                l.a((Map) hashMap, "a_mdl_read_src", oVar2.aj.I);
                                l.a((Map) hashMap, "a_mdl_seek_num", oVar2.aj.J);
                                l.a(hashMap, "a_mdl_last_msg", oVar2.aj.K);
                                l.a(hashMap, "a_mdl_server_timing", oVar2.aj.L);
                                l.a(hashMap, "a_mdl_ip_list", oVar2.aj.O);
                                l.a(hashMap, "a_mdl_blocked_ips", oVar2.aj.P);
                                l.a(hashMap, "a_mdl_response_cache", oVar2.aj.R);
                                l.a(hashMap, "a_mdl_response_cinfo", oVar2.aj.S);
                                l.a(hashMap, "custom_click_t", zVar2.da);
                                l.a(hashMap, "custom_vm_t", zVar2.db);
                                l.a(hashMap, "custom_init_t", zVar2.dd);
                                l.a(hashMap, "custom_play_t", zVar2.de);
                                l.a((Map) hashMap, "screen_w", zVar2.dN);
                                l.a((Map) hashMap, "screen_h", zVar2.dO);
                                l.a((Map) hashMap, "p_density", zVar2.dP);
                                l.a((Map) hashMap, "xdpi", zVar2.dQ);
                                l.a((Map) hashMap, "ydpi", zVar2.dR);
                                l.a((Map) hashMap, "sr_w", zVar2.dS);
                                l.a((Map) hashMap, "sr_h", zVar2.dT);
                                l.a(hashMap, "eye_filter", zVar2.dU);
                                l.a(hashMap, "bright_list", zVar2.dV);
                                l.a(hashMap, "view_size_list", zVar2.dW);
                                l.a(hashMap, "play_list", zVar2.df);
                                l.a(hashMap, "pause_list", zVar2.dg);
                                l.a(hashMap, "resolution_list", zVar2.dh);
                                l.a(hashMap, "playspeed_list", zVar2.di);
                                l.a(hashMap, "radiomode_list", zVar2.dj);
                                l.a(hashMap, "loop_list", zVar2.dk);
                                l.a(hashMap, "error_list", zVar2.dl);
                                l.a(hashMap, "rebuf_list", zVar2.dm);
                                l.a(hashMap, "seek_list", zVar2.dn);
                                l.a(hashMap, "av_outsync_list", zVar2.f350do);
                                l.a((Map) hashMap, "av_outsync_count", zVar2.dw);
                                l.a((Map) hashMap, "color_trc", zVar2.dL);
                                l.a(hashMap, "headset_list", zVar2.dp);
                                l.a((Map) hashMap, "hw_conf_type", zVar2.dM);
                                l.a(hashMap, "no_a_list", zVar2.dr);
                                l.a(hashMap, "no_v_list", zVar2.dq);
                                l.a((Map) hashMap, "is_reuse_engine", zVar2.dY ? 1 : 0);
                                l.a(hashMap, "v_duration", zVar2.cN);
                                l.a(hashMap, "a_duration", zVar2.cO);
                                l.a((Map) hashMap, "view_hidden", zVar2.dZ);
                                l.a(hashMap, "power", zVar2.ds);
                                l.a(hashMap, "is_charging", zVar2.dt);
                                l.a(hashMap, "foreback_switch_list", zVar2.dv);
                                l.a(hashMap, "r_stage_errcs", zVar2.ea);
                                l.a(hashMap, "bad_interlaced_list", zVar2.du);
                                com.ss.ttvideoengine.q.e eVar = e.c.f153200a;
                                Map<String, Object> a2 = eVar.q.a(oVar2.C);
                                if (a2 != null && a2.size() > 0) {
                                    hashMap.putAll(a2);
                                }
                                j.a("VideoEventOnePlay", "play_time:" + zVar2.r + ", pt_new:" + zVar2.f152822d + ",ps_t:" + zVar2.f152821c + ", vv_time:" + zVar2.w + ", lwp_time:" + zVar2.y + ", outsync count:" + zVar2.dw + ", outsync list:" + zVar2.f350do + ", vs:" + oVar2.I + ", vtype:" + oVar2.N + ", cur_url:" + oVar2.ai.f152666g + ", features:" + zVar2.cZ + ", exception:" + zVar2.aa);
                                j.b("VideoEventOnePlay", "no_a_list: " + zVar2.dr + ", no_v_list: " + zVar2.dq);
                                jSONObject = new JSONObject(hashMap);
                            }
                            boolean z = this.f152689b.as;
                            Handler handler = this.f152692e;
                            if (handler == null || handler.getLooper() == null) {
                                j.a("VideoEventLoggerV2", "report in child thread");
                                t.instance.a(z, jSONObject);
                                return;
                            }
                            j.a("VideoEventLoggerV2", "report in main looper");
                            this.f152692e.post(new s(z, jSONObject));
                        }

                        static final /* synthetic */ void a(boolean z, JSONObject jSONObject) {
                            t.instance.a(z, jSONObject);
                        }

                        public a(Context context, z zVar, r rVar, o oVar) {
                            this.f152690c = zVar;
                            this.f152691d = context;
                            this.f152688a = rVar;
                            this.f152689b = oVar;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(Bundle bundle) {
                        ac acVar = this.ba;
                        if (bundle == null) {
                            return;
                        }
                        if (bundle.getInt("effect_type") != 2) {
                            j.b("VideoFilterMonitor", "not eye protection filter bundle");
                            return;
                        }
                        int i2 = bundle.getInt("action");
                        boolean z2 = false;
                        if (bundle.getInt("effect_type") == 2 && (i2 != 21 ? i2 == 19 && bundle.getInt("int_value") == 1 : bundle.getInt("use_effect") == 1)) {
                            z2 = true;
                        }
                        if (z2 != acVar.f152596a) {
                            acVar.f152596a = z2;
                            HashMap hashMap = new HashMap();
                            hashMap.put("on", z2 ? "1" : "0");
                            hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                            acVar.f152597b.add(new JSONObject(hashMap).toString());
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(String str, Object obj) {
                        if (!TextUtils.isEmpty(str) && obj != null) {
                            this.bd.put(str, obj);
                            j.b("VideoEventLoggerV2", "addFeature, key:" + str + ", value:" + obj);
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a() {
                        this.aQ = true;
                        this.f152675c.as = true;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void b() {
                        this.bg++;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final String t() {
                        try {
                            return this.f152675c.D;
                        } catch (Throwable unused) {
                            return "";
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final int i() {
                        u uVar = this.s;
                        if (uVar != null) {
                            return uVar.f152714c.f152731e;
                        }
                        return -1;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void m() {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.aE = 1;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final String o() {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            return zVar.bP;
                        }
                        return null;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final com.ss.ttvideoengine.i.b w() {
                        z zVar = this.f152674b;
                        com.ss.ttvideoengine.i.a aVar = new com.ss.ttvideoengine.i.a(0);
                        aVar.a(zVar);
                        return aVar;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void y() {
                        if (this.f152673a != null) {
                            this.f152673a.a(2, I());
                        }
                    }

                    static {
                        Covode.recordClassIndex(101624);
                    }

                    private int G() {
                        if (com.ss.ttvideoengine.b.f152311i <= 0) {
                            com.ss.ttvideoengine.b.f152311i = g.a(this.aw).y;
                        }
                        return com.ss.ttvideoengine.b.f152311i;
                    }

                    private int H() {
                        if (com.ss.ttvideoengine.b.f152310h <= 0) {
                            com.ss.ttvideoengine.b.f152310h = g.a(this.aw).x;
                        }
                        return com.ss.ttvideoengine.b.f152310h;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void c() {
                        if (this.f152674b.w <= 0) {
                            this.f152674b.t = System.currentTimeMillis();
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void d() {
                        if (this.f152674b.w <= 0) {
                            this.f152674b.u = System.currentTimeMillis();
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void h() {
                        if (this.as > 0) {
                            this.as = 0;
                            z zVar = this.f152674b;
                            if (zVar != null) {
                                zVar.bI = System.currentTimeMillis();
                            }
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void n() {
                        this.U++;
                        this.bx.add(String.valueOf(System.currentTimeMillis()));
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void u() {
                        if (this.f152674b.ck <= 0) {
                            this.f152674b.ck = System.currentTimeMillis();
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void v() {
                        if (this.f152674b.cl <= 0) {
                            this.f152674b.cl = System.currentTimeMillis();
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final long x() {
                        z zVar = this.f152674b;
                        if (zVar == null || zVar.f152822d <= 0 || this.f152674b.y <= 0) {
                            return 0;
                        }
                        return this.f152674b.y - this.f152674b.f152822d;
                    }

                    private void C() {
                        Map<String, Long> b2;
                        f fVar = this.f152673a;
                        if (fVar != null && (b2 = fVar.b()) != null) {
                            int intValue = b2.get("vps").intValue();
                            int intValue2 = b2.get("vds").intValue();
                            this.at += intValue;
                            this.au += intValue2;
                        }
                    }

                    private void A() {
                        if (this.f152674b != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("sub_langs_c", Integer.valueOf(this.bh));
                            hashMap.put("sub_req_fin_ts", Long.valueOf(this.f152674b.dx));
                            hashMap.put("sub_load_fin_ts", Long.valueOf(this.f152674b.dy));
                            hashMap.put("sub_switch_c", Integer.valueOf(this.bg));
                            hashMap.put("sub_error", this.bp);
                            hashMap.put("sub_req_url", this.bn);
                            hashMap.put("sub_enable", Integer.valueOf(this.bi));
                            hashMap.put("sub_enable_opt_load", Integer.valueOf(this.bj));
                            hashMap.put("sub_thread_enable", Integer.valueOf(this.bk));
                            this.f152674b.bB = hashMap;
                        }
                    }

                    private void B() {
                        if (this.f152674b != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("mask_open_ts", Long.valueOf(this.f152674b.dz));
                            hashMap.put("mask_opened_ts", Long.valueOf(this.f152674b.dA));
                            hashMap.put("mask_errc", Integer.valueOf(this.bq));
                            hashMap.put("mask_enable", Integer.valueOf(this.bl));
                            hashMap.put("mask_thread_enable", Integer.valueOf(this.bm));
                            hashMap.put("mask_url", this.bo);
                            this.f152674b.bC = hashMap;
                        }
                    }

                    private void D() {
                        String str;
                        String substring;
                        if (!TextUtils.isEmpty(this.K)) {
                            str = this.K;
                        } else if (!TextUtils.isEmpty(this.Q)) {
                            str = this.Q;
                        } else if (!TextUtils.isEmpty(this.L)) {
                            str = this.L;
                        } else {
                            return;
                        }
                        try {
                            str = URLDecoder.decode(str, "UTF-8");
                        } catch (UnsupportedEncodingException e2) {
                            j.e("VideoEventLoggerV2", "exception:" + e2.toString());
                        } catch (IllegalArgumentException e3) {
                            j.e("VideoEventLoggerV2", "exception:" + e3.toString());
                        }
                        int indexOf = str.indexOf("&l=");
                        if (indexOf > 0) {
                            int indexOf2 = str.indexOf("&", indexOf + 1);
                            if (indexOf2 > 0) {
                                substring = str.substring(indexOf + 3, indexOf2);
                            } else {
                                substring = str.substring(indexOf + 3);
                            }
                            this.f152674b.cJ = substring;
                        }
                    }

                    private Map I() {
                        HashMap hashMap = new HashMap();
                        hashMap.put("format_open_input", Long.valueOf(this.f152674b.f152826h));
                        hashMap.put("tran_connect", Long.valueOf(this.f152674b.af));
                        hashMap.put("http_response", Long.valueOf(this.f152674b.ag));
                        hashMap.put("receive_first_video_frame", Long.valueOf(this.f152674b.al));
                        hashMap.put("decode_first_video_frame", Long.valueOf(this.f152674b.an));
                        hashMap.put("render_first_video_frame", Long.valueOf(this.f152674b.f152830l));
                        hashMap.put("prepared", Long.valueOf(this.f152674b.v));
                        return hashMap;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void e() {
                        if (this.av != 4 || this.A) {
                            this.av = 2;
                            this.A = false;
                            if (this.aL == 1 && this.f152674b.u <= 0) {
                                this.f152674b.u = System.currentTimeMillis();
                            }
                            if (this.f152674b.w <= 0) {
                                this.f152674b.w = System.currentTimeMillis();
                                u uVar = this.s;
                                if (uVar != null) {
                                    uVar.f152717f = System.currentTimeMillis();
                                }
                                y yVar = this.u;
                                if (yVar != null) {
                                    yVar.f152796f = System.currentTimeMillis();
                                }
                                f fVar = this.f152673a;
                                if (fVar != null) {
                                    this.f152674b.cL = fVar.c(63);
                                    this.f152674b.cM = this.f152673a.c(64);
                                }
                            }
                            a(-2001, true);
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void f() {
                        int i2;
                        f fVar = this.f152673a;
                        if (fVar != null) {
                            i2 = fVar.c(67);
                        } else {
                            i2 = -1;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("p", Integer.valueOf(i2));
                        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                        this.bs.add(new JSONObject(hashMap).toString());
                        e eVar = this.bb;
                        if (!eVar.f152611c) {
                            eVar.f152611c = true;
                            try {
                                eVar.f152609a.getContentResolver().registerContentObserver(Settings.System.getUriFor("screen_brightness"), true, eVar.f152612d);
                            } catch (Exception e2) {
                                j.c("BrightnessMonitor", e2.getMessage());
                            }
                            eVar.a();
                        }
                        ad adVar = this.bc;
                        if (adVar.f152598a <= 0 && adVar.f152599b <= 0) {
                            adVar.a(adVar.f152600c, adVar.f152601d);
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void g() {
                        int i2;
                        f fVar = this.f152673a;
                        if (fVar != null) {
                            i2 = fVar.c(67);
                        } else {
                            i2 = -1;
                        }
                        HashMap hashMap = new HashMap();
                        long currentTimeMillis = System.currentTimeMillis();
                        hashMap.put("p", Integer.valueOf(i2));
                        hashMap.put("t", Long.valueOf(currentTimeMillis));
                        this.bt.add(new JSONObject(hashMap).toString());
                        if (this.bC) {
                            this.u.f152792b.J.add(Long.valueOf(currentTimeMillis));
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void j() {
                        String str;
                        u uVar = this.s;
                        if (uVar != null && uVar.f152712a != null && uVar.f152712a.f152649a != null) {
                            HashMap hashMap = new HashMap();
                            if (uVar.f152712a.ar > 0) {
                                hashMap.put("cur_url", uVar.f152712a.ai.f152666g);
                                hashMap.put("cur_ip", uVar.f152712a.ai.f152664e);
                                str = uVar.f152712a.ai.f152666g;
                            } else {
                                hashMap.put("cur_url", uVar.f152712a.v);
                                hashMap.put("cur_ip", uVar.f152712a.x);
                                str = uVar.f152712a.v;
                            }
                            try {
                                hashMap.put("cur_host", Uri.parse(str).getHost());
                            } catch (Exception e2) {
                                j.a("VideoEventOneEvent", "triggerBufferStartCb:" + e2.toString());
                            }
                            uVar.f152712a.f152649a.a(0, hashMap);
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void l() {
                        int i2;
                        if (this.bD != null && this.bF > 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j2 = currentTimeMillis - this.bF;
                            HashMap hashMap = new HashMap();
                            f fVar = this.f152673a;
                            if (fVar != null) {
                                i2 = fVar.c(67);
                            } else {
                                i2 = -1;
                            }
                            hashMap.put("ec", Integer.valueOf(this.bD.f153260a));
                            hashMap.put("p", Integer.valueOf(i2));
                            hashMap.put("t", Long.valueOf(currentTimeMillis));
                            hashMap.put("c", Long.valueOf(j2));
                            hashMap.put("st", Integer.valueOf(this.bE));
                            this.by.add(new JSONObject(hashMap).toString());
                        }
                        this.bD = null;
                        this.bF = -2147483648L;
                        this.bE = -1;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void q() {
                        this.z = false;
                        this.A = true;
                        this.E = new ArrayList();
                        this.F = new ArrayList<>();
                        this.G = new ArrayList();
                        this.H = new ArrayList();
                        this.I = new ArrayList();
                        this.J = null;
                        this.K = null;
                        this.L = null;
                        this.M = null;
                        this.N = null;
                        this.O = null;
                        this.P = null;
                        this.R = "";
                        this.T = 0;
                        this.W = null;
                        this.aa = 0;
                        this.ab = 0;
                        this.f152678f = 0;
                        this.f152679g = 0;
                        this.f152676d = 0;
                        this.f152680h = 0;
                        this.f152677e = 0;
                        this.ap = 0;
                        this.ao = 0;
                        this.at = 0;
                        this.au = 0;
                        this.aI = 0;
                        this.aM = 0;
                        this.aN = 0;
                        this.aO = 0;
                        this.aK = false;
                        this.aJ = false;
                        this.f152681i = Integer.MIN_VALUE;
                        this.ac = 0;
                        this.ad = 0;
                        this.Q = null;
                        this.B = false;
                        this.ak = 0;
                        int i2 = this.f152675c.ar;
                        o oVar = this.f152675c;
                        if (o.f152648d != null) {
                            ag agVar = o.f152648d;
                            WeakReference<ah> weakReference = oVar.f152651f;
                            if (weakReference != null) {
                                agVar.f152181c.lock();
                                agVar.f152182d.remove(weakReference);
                                agVar.f152181c.unlock();
                            }
                        }
                        o oVar2 = new o(this.f152673a, this.aQ, this.aw);
                        this.f152675c = oVar2;
                        oVar2.ar = i2;
                        ab abVar = new ab(this.f152675c);
                        this.w = abVar;
                        abVar.f152570b = this.aS;
                        this.s.f152712a = this.f152675c;
                        this.t.f152762a = this.f152675c;
                        this.u.f152791a = this.f152675c;
                        this.x.f152623a = this.f152675c;
                        this.v.f152740a = this.f152675c;
                        this.br = new b();
                        this.bc = new ad();
                    }

                    private void z() {
                        this.E = new ArrayList();
                        this.F = new ArrayList<>();
                        this.G = new ArrayList();
                        this.H = new ArrayList();
                        v vVar = this.v;
                        vVar.f152741b = new v.b((byte) 0);
                        vVar.f152745f = null;
                        vVar.f152744e = null;
                        vVar.f152742c = false;
                        vVar.f152743d = 0;
                        this.av = 0;
                        this.ar = 0;
                        this.at = 0;
                        this.au = 0;
                        this.az = 0;
                        this.aA = 0;
                        this.A = true;
                        this.f152678f = 0;
                        this.f152679g = 0;
                        this.f152676d = 0;
                        this.f152680h = 0;
                        this.f152677e = 0;
                        this.U = 0;
                        this.V = false;
                        this.ao = 0;
                        this.ap = 0;
                        this.as = 0;
                        this.aF = -2147483648L;
                        this.aH = -2147483648L;
                        this.aG = -2147483648L;
                        this.aI = 0;
                        this.aK = false;
                        this.aJ = false;
                        this.aL = 0;
                        this.ag = null;
                        this.af = 0;
                        this.bs = new ArrayList<>();
                        this.bt = new ArrayList<>();
                        this.bu = new ArrayList<>();
                        this.bv = new ArrayList<>();
                        this.bw = new ArrayList<>();
                        this.bx = new ArrayList<>();
                        this.by = new ArrayList<>();
                        this.bz = new ArrayList<>();
                        this.bA = new ArrayList<>();
                        this.bB = new ArrayList<>();
                        this.bD = null;
                        this.bF = -2147483648L;
                        this.bE = -1;
                        this.o = -2147483648L;
                        this.p = -2147483648L;
                        this.q = -2147483648L;
                        this.r = -2147483648L;
                        this.bC = false;
                        this.bi = 0;
                        this.bj = 0;
                        this.bk = 0;
                        this.bl = 0;
                        this.bm = 0;
                        this.bo = null;
                        this.bn = null;
                        this.bp = null;
                        this.bh = 0;
                        this.bg = 0;
                        this.bq = 0;
                        this.br.t = 0;
                        this.br.u = 0;
                        this.br.v = 0;
                        this.aZ = new m();
                        this.ba = new ac();
                        this.bb = new e(this.aw);
                        ad adVar = this.bc;
                        adVar.f152598a = 0;
                        adVar.f152599b = 0;
                        adVar.f152602e.clear();
                        this.bd.clear();
                        h hVar = this.y;
                        hVar.f152617d = 0;
                        hVar.f152618e.clear();
                    }

                    class c extends TimerTask {
                        static {
                            Covode.recordClassIndex(101628);
                        }

                        public final void run() {
                            int i2;
                            int i3;
                            String str;
                            String str2;
                            MethodCollector.i(13634);
                            f fVar = r.this.f152673a;
                            o oVar = r.this.f152675c;
                            z zVar = r.this.f152674b;
                            int i4 = -1;
                            if (fVar != null) {
                                i2 = fVar.c(74);
                                i3 = fVar.c(99);
                            } else {
                                i2 = -1;
                                i3 = -1;
                            }
                            String d2 = o.d();
                            if (o.f152646b.equals("unknown")) {
                                str = "unknown";
                            } else {
                                if (o.f152647c.equals("unknown") && o.f152648d != null) {
                                    o.f152647c = o.b(o.f152648d.f152180b);
                                }
                                str = o.f152647c;
                            }
                            if (oVar != null) {
                                str2 = oVar.A;
                                i4 = oVar.R;
                                if (i4 < 0 && fVar != null) {
                                    i4 = (int) fVar.b(75);
                                }
                            } else {
                                str2 = null;
                            }
                            float f2 = -1.0f;
                            if (zVar != null) {
                                if (zVar.cU.size() >= r.this.f152684l) {
                                    zVar.cU.remove(0);
                                }
                                zVar.cU.add(Integer.valueOf(i2));
                                if (zVar.cV.size() >= r.this.f152684l) {
                                    zVar.cV.remove(0);
                                }
                                zVar.cV.add(Integer.valueOf(i3));
                                synchronized ("VideoEventLoggerV2") {
                                    try {
                                        if (r.this.n > 0) {
                                            f2 = (float) (((r.this.f152685m * 8) * 1000) / r.this.n);
                                        }
                                        r.this.n = 0;
                                        r.this.f152685m = 0;
                                    } catch (Throwable th) {
                                        MethodCollector.o(13634);
                                        throw th;
                                    }
                                }
                                zVar.cR.add(Float.valueOf(f2));
                                if (i4 > 0) {
                                    int size = zVar.cT.size();
                                    if (size > 0) {
                                        int intValue = zVar.cT.get(zVar.cT.keySet().toArray()[size - 1]).intValue();
                                        if (intValue > 0 && intValue != i4) {
                                            zVar.cT.put(Integer.toString(zVar.cX), Integer.valueOf(i4));
                                        }
                                    } else {
                                        zVar.cT.put(Integer.toString(zVar.cX), Integer.valueOf(i4));
                                    }
                                }
                                int size2 = zVar.cS.size();
                                if (size2 > 0) {
                                    String str3 = zVar.cS.get(zVar.cS.keySet().toArray()[size2 - 1]);
                                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !str3.equals(str2)) {
                                        zVar.cS.put(Integer.toString(zVar.cX), str2);
                                    }
                                } else {
                                    zVar.cS.put(Integer.toString(zVar.cX), str2);
                                }
                                int size3 = zVar.cP.size();
                                if (size3 > 0) {
                                    String str4 = zVar.cP.get(zVar.cP.keySet().toArray()[size3 - 1]);
                                    if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(d2) && !str4.equals(d2)) {
                                        zVar.cP.put(Integer.toString(zVar.cX), d2);
                                    }
                                } else {
                                    zVar.cP.put(Integer.toString(zVar.cX), d2);
                                }
                                int size4 = zVar.cQ.size();
                                if (size4 > 0) {
                                    String str5 = zVar.cQ.get(zVar.cQ.keySet().toArray()[size4 - 1]);
                                    if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str) && !str5.equals(str)) {
                                        zVar.cQ.put(Integer.toString(zVar.cX), str);
                                    }
                                } else {
                                    zVar.cQ.put(Integer.toString(zVar.cX), str);
                                }
                                zVar.cX++;
                            }
                            j.b("VideoEventLoggerV2", "netlevel rttLevel:" + i2 + ", rttMs:" + i3 + ", netType:" + d2 + ", sigLevel:" + str + ", bitrate:" + i4 + ", quality:" + str2 + ", speed:" + f2);
                            MethodCollector.o(13634);
                        }

                        private c() {
                        }

                        /* synthetic */ c(r rVar, byte b2) {
                            this();
                        }
                    }

                    private void E() {
                        int d2;
                        HashMap hashMap = new HashMap();
                        hashMap.putAll(be);
                        hashMap.putAll(this.bd);
                        if (this.f152675c.E != 0) {
                            hashMap.put("v_hw", Integer.valueOf(this.f152675c.E));
                        }
                        if (this.f152675c.G != 0) {
                            hashMap.put("a_hw", Integer.valueOf(this.f152675c.G));
                        }
                        int i2 = this.C;
                        if (i2 != 0) {
                            hashMap.put("async_init", Integer.valueOf(i2));
                        }
                        int i3 = this.D;
                        if (i3 != 0) {
                            hashMap.put("codec_pool", Integer.valueOf(i3));
                        }
                        if (this.f152675c.J.equals("bytevc1")) {
                            hashMap.put("bytevc1", 1);
                        } else if (this.f152675c.J.equals("bytevc2")) {
                            hashMap.put("bytevc2", 1);
                        }
                        int i4 = this.f152683k;
                        if (i4 > 0) {
                            hashMap.put("network_timeout", Integer.valueOf(i4));
                        }
                        int i5 = this.f152682j;
                        if (i5 > 0) {
                            hashMap.put("buffer_timeout", Integer.valueOf(i5));
                        }
                        if (this.br.f152693a > 0) {
                            hashMap.put("buffer_directly", Integer.valueOf(this.br.f152693a));
                        }
                        if (this.br.f152694b > 0) {
                            hashMap.put("first_buf_end_ms", Integer.valueOf(this.br.f152694b));
                        }
                        if (this.f152674b.cg > 0) {
                            hashMap.put("oes_texture", Integer.valueOf(this.f152674b.cg));
                        }
                        int i6 = this.aM;
                        if (i6 > 0) {
                            hashMap.put("sr", Integer.valueOf(i6));
                        }
                        if (this.br.f152695c > 0) {
                            if (this.br.f152696d == 0) {
                                hashMap.put("volume_balance", 1);
                            } else if (this.br.f152696d == 1) {
                                hashMap.put("volume_balancev2", 1);
                            }
                        }
                        int i7 = this.ak;
                        if (i7 > 0) {
                            hashMap.put("bash", Integer.valueOf(i7));
                        }
                        if (this.f152675c.an > 0) {
                            hashMap.put("abr", Integer.valueOf(this.f152675c.an));
                        }
                        if (this.br.f152697e > 0) {
                            hashMap.put("engine_looper", Integer.valueOf(this.br.f152697e));
                        }
                        if (this.br.f152698f > 0) {
                            hashMap.put("auto_range", Integer.valueOf(this.br.f152698f));
                        }
                        if (this.br.f152699g > 0) {
                            hashMap.put("hw_drop", Integer.valueOf(this.br.f152699g));
                        }
                        if (this.br.f152700h > 0) {
                            hashMap.put("enable_https", Integer.valueOf(this.br.f152700h));
                        }
                        if (this.f152674b.bQ > 0) {
                            hashMap.put("enable_hijack", Integer.valueOf(this.f152674b.bQ));
                        }
                        if (this.f152674b.bR > 0) {
                            hashMap.put("hijack_retry", Integer.valueOf(this.f152674b.bR));
                        }
                        if (this.br.f152701i > 0) {
                            hashMap.put("fallback_api", Integer.valueOf(this.br.f152701i));
                        }
                        if (this.br.f152702j > 0) {
                            hashMap.put("async_pos", Integer.valueOf(this.br.f152702j));
                        }
                        if (this.f152675c.V > 0) {
                            hashMap.put("socket_reuse", Integer.valueOf(this.f152675c.V));
                        }
                        if (this.f152675c.ar > 0) {
                            hashMap.put("mdl_type", Integer.valueOf(this.f152675c.ar));
                        }
                        if (this.br.f152703k > 0) {
                            hashMap.put("enable_loadcontrol", Integer.valueOf(this.br.f152703k));
                        }
                        if (this.br.f152704l != 5) {
                            hashMap.put("render_type", Integer.valueOf(this.br.f152704l));
                        } else if (this.f152675c.E == 0) {
                            hashMap.put("render_type", 5);
                        } else {
                            hashMap.put("render_type", 3);
                        }
                        hashMap.put("image_scale", Integer.valueOf(this.br.f152705m));
                        int i8 = this.f152681i;
                        if (i8 >= 0) {
                            hashMap.put("mc_render", Integer.valueOf(i8));
                        }
                        if (this.br.n >= 0) {
                            hashMap.put("audio_render_type", Integer.valueOf(this.br.n));
                        }
                        if (this.br.o > 0) {
                            hashMap.put("skip_find_stream", Integer.valueOf(this.br.o));
                        }
                        if (this.br.p > 0) {
                            hashMap.put("async_prepare", Integer.valueOf(this.br.p));
                        }
                        if (this.br.q > 0) {
                            hashMap.put("frc_level", Integer.valueOf(this.br.q));
                        }
                        if (this.br.r > 0) {
                            hashMap.put("lazy_seek", Integer.valueOf(this.br.r));
                        }
                        if (this.br.s > 0) {
                            hashMap.put("keep_formater_alive", Integer.valueOf(this.br.s));
                        }
                        if (this.f152674b.bx > 0) {
                            hashMap.put("dis_short_seek", Integer.valueOf(this.f152674b.bx));
                        }
                        if (this.f152674b.bw > 0) {
                            hashMap.put("pref_near_sample", Integer.valueOf(this.f152674b.bw));
                        }
                        int i9 = this.bk;
                        if (i9 > 0) {
                            hashMap.put("sub_thread_enable", Integer.valueOf(i9));
                        }
                        int i10 = this.bm;
                        if (i10 > 0) {
                            hashMap.put("mask_thread_enable", Integer.valueOf(i10));
                        }
                        if ((this.br.t & 1) == 1) {
                            hashMap.put("hdr_pq", 1);
                        }
                        if ((this.br.t & 2) == 2) {
                            hashMap.put("hdr_hlg", 1);
                        }
                        if (this.br.u > 0) {
                            hashMap.put("abr_startup", 1);
                        }
                        if (this.br.v > 0) {
                            hashMap.put("thread_priority", 1);
                        }
                        if (this.br.w > 0) {
                            hashMap.put("smooth_clock", 1);
                        }
                        if (this.br.x > 0) {
                            hashMap.put("disable_split_voice", 1);
                        }
                        if (this.f152675c.E == 0 && this.br.y > 0) {
                            hashMap.put("yv12", 1);
                        }
                        if (this.f152674b.cM == 28) {
                            hashMap.put("heaacv2", 1);
                        }
                        if (this.br.z > 0) {
                            hashMap.put("strategy_center", 1);
                        } else {
                            hashMap.put("strategy_center", 0);
                        }
                        if (this.br.A >= 0) {
                            hashMap.put("drop_limit", Integer.valueOf(this.br.A));
                        }
                        int d3 = d.h.f152465a.d(8);
                        if (d3 > 0) {
                            hashMap.put("mdl_socket_reuse", Integer.valueOf(d3));
                        }
                        int d4 = d.h.f152465a.d(1001);
                        if (d4 > 0) {
                            hashMap.put("mdl_preconn", Integer.valueOf(d4));
                        }
                        if (d.h.f152465a.d(7) > 0 && ((d2 = d.h.f152465a.d(90)) == 2 || d2 == 3 || d2 == 4)) {
                            hashMap.put("mdl_httpdns", Integer.valueOf(d2));
                        }
                        int d5 = d.h.f152465a.d(114);
                        if (d5 > 0) {
                            hashMap.put("mdl_predns", Integer.valueOf(d5));
                        }
                        int d6 = d.h.f152465a.d(105);
                        if (d6 > 0) {
                            hashMap.put("mdl_dns_refresh", Integer.valueOf(d6));
                        }
                        int d7 = d.h.f152465a.d(103);
                        if (d7 > 0) {
                            hashMap.put("mdl_dns_parallel", Integer.valueOf(d7));
                        }
                        int d8 = d.h.f152465a.d(115);
                        if (d8 > 0) {
                            hashMap.put("mdl_backip", Integer.valueOf(d8));
                        }
                        int d9 = d.h.f152465a.d(101);
                        if (d9 > 0) {
                            hashMap.put("mdl_session_reuse", Integer.valueOf(d9));
                        }
                        int d10 = d.h.f152465a.d(100);
                        if (d10 == 3) {
                            hashMap.put("mdl_tls_ver", Integer.valueOf(d10));
                        }
                        long c2 = d.h.f152465a.c(1152);
                        long c3 = d.h.f152465a.c(1153);
                        if (c2 > 0 && c3 > 0) {
                            hashMap.put("mdl_socket_monitor", 1);
                        }
                        this.f152674b.cZ = hashMap;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void G(int i2) {
                        this.X = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void H(int i2) {
                        this.ak = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void S(int i2) {
                        this.f152681i = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void T(int i2) {
                        this.D = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(com.ss.ttvideoengine.j.p pVar) {
                        b(pVar);
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void b(String str) {
                        this.bo = str;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void c(int i2) {
                        this.bh = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void d(int i2) {
                        this.bq = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void e(int i2) {
                        this.ac = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void f(int i2) {
                        this.ad = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void g(int i2) {
                        this.ah = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void l(String str) {
                        this.P = str;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void n(int i2) {
                        this.ab = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void o(int i2) {
                        this.ae = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void w(String str) {
                        this.Q = str;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void A(int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.bk = i2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void B(int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.av = i2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void C(int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.aC = i2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void I(int i2) {
                        this.f152675c.ar = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void J(int i2) {
                        this.f152674b.aN = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void K(int i2) {
                        this.f152674b.bd = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void L(int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.aO = i2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void M(int i2) {
                        this.f152675c.am = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void N(int i2) {
                        this.f152675c.an = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void O(int i2) {
                        this.f152675c.ao = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void P(int i2) {
                        this.f152675c.ap = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void R(int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.cg = i2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void U(int i2) {
                        this.aZ.f152622a = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void c(float f2) {
                        this.aS = f2;
                        this.w.f152570b = f2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void d(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.aj = j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void e(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.ak = j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void f(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.al = j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void g(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.an = j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void h(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.am = j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void i(int i2) {
                        this.f152675c.W = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void j(int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.bQ = i2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void k(int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.bR = i2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void l(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.au = j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void m(int i2) {
                        this.aa = i2;
                        this.f152675c.H = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void p(String str) {
                        this.f152675c.X = str;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void q(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.ca = j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void r(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.cc = j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void s(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.cb = j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void v(String str) {
                        if (str != null) {
                            this.Y = str;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void y(int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.bo = i2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void z(int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.bq = i2;
                        }
                    }

                    private void c(com.ss.ttvideoengine.j.e eVar) {
                        if (eVar != null) {
                            this.f152675c.a(eVar);
                            this.aq = eVar;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void A(final String str) {
                        com.ss.ttvideoengine.s.b.a(new Runnable() {
                            /* class com.ss.ttvideoengine.h.r.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(101625);
                            }

                            public final void run() {
                                Throwable th;
                                Exception e2;
                                MethodCollector.i(13045);
                                synchronized ("VideoEventLoggerV2") {
                                    try {
                                        JSONArray optJSONArray = new JSONObject(str).optJSONArray("data");
                                        long j2 = 0;
                                        long j3 = 0;
                                        int i2 = 0;
                                        while (i2 < optJSONArray.length()) {
                                            JSONArray optJSONArray2 = optJSONArray.getJSONObject(i2).optJSONArray("downinfo");
                                            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                                                int i3 = 0;
                                                while (i3 < optJSONArray2.length()) {
                                                    JSONObject jSONObject = optJSONArray2.getJSONObject(i3);
                                                    long optLong = jSONObject.optLong("size");
                                                    try {
                                                        long optLong2 = jSONObject.optLong("costTime");
                                                        if (optLong != j2 || optLong2 != -1) {
                                                            r.this.f152685m += optLong;
                                                            j3 = Math.max(j3, optLong2);
                                                        }
                                                        i3++;
                                                        j2 = 0;
                                                    } catch (Exception e3) {
                                                        e2 = e3;
                                                        try {
                                                            j.e("VideoEventLoggerV2", "update networkspeed error " + e2.toString());
                                                            MethodCollector.o(13045);
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            MethodCollector.o(13045);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            }
                                            i2++;
                                            j2 = 0;
                                        }
                                        r.this.n = j3;
                                        j.b("VideoEventLoggerV2", "update multi speed size:" + r.this.f152685m + ", time:" + r.this.n);
                                    } catch (Exception e4) {
                                        e2 = e4;
                                        j.e("VideoEventLoggerV2", "update networkspeed error " + e2.toString());
                                        MethodCollector.o(13045);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        MethodCollector.o(13045);
                                        throw th;
                                    }
                                    MethodCollector.o(13045);
                                }
                            }
                        });
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void D(int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null && i2 > 0) {
                            zVar.bW = i2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void E(int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null && i2 > 0) {
                            zVar.bX = i2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void F(int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null && i2 >= 0) {
                            zVar.bY = i2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(float f2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.as = f2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void b(float f2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.at = f2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void d(String str) {
                        this.J = str;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void f(String str) {
                        this.M = str;
                        o oVar = this.f152675c;
                        if (oVar != null) {
                            oVar.t = str;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void h(String str) {
                        this.N = str;
                        o oVar = this.f152675c;
                        if (oVar != null) {
                            oVar.u = str;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void k(String str) {
                        o oVar = this.f152675c;
                        if (oVar != null) {
                            oVar.z = str;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void n(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.aY = (int) j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void s(String str) {
                        o oVar = this.f152675c;
                        if (TextUtils.isEmpty(oVar.ae)) {
                            oVar.ae = str;
                        }
                        oVar.af = str;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void t(int i2) {
                        this.u.a(i2, "wait");
                        this.bC = false;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void x(int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.ar = (long) i2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void z(String str) {
                        if (this.f152674b != null && !TextUtils.isEmpty(str)) {
                            this.f152674b.ch = str;
                        }
                    }

                    /* access modifiers changed from: package-private */
                    public class b {
                        public int A = -1;

                        /* renamed from: a  reason: collision with root package name */
                        public int f152693a;

                        /* renamed from: b  reason: collision with root package name */
                        public int f152694b;

                        /* renamed from: c  reason: collision with root package name */
                        public int f152695c;

                        /* renamed from: d  reason: collision with root package name */
                        public int f152696d = -1;

                        /* renamed from: e  reason: collision with root package name */
                        public int f152697e;

                        /* renamed from: f  reason: collision with root package name */
                        public int f152698f;

                        /* renamed from: g  reason: collision with root package name */
                        public int f152699g;

                        /* renamed from: h  reason: collision with root package name */
                        public int f152700h;

                        /* renamed from: i  reason: collision with root package name */
                        public int f152701i;

                        /* renamed from: j  reason: collision with root package name */
                        public int f152702j;

                        /* renamed from: k  reason: collision with root package name */
                        public int f152703k;

                        /* renamed from: l  reason: collision with root package name */
                        public int f152704l = Integer.MIN_VALUE;

                        /* renamed from: m  reason: collision with root package name */
                        public int f152705m;
                        public int n = Integer.MIN_VALUE;
                        public int o;
                        public int p;
                        public int q;
                        public int r;
                        public int s;
                        public int t;
                        public int u;
                        public int v;
                        public int w;
                        public int x;
                        public int y;
                        public int z;

                        static {
                            Covode.recordClassIndex(101627);
                        }

                        b() {
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void b(int i2) {
                        o oVar = this.f152675c;
                        oVar.E = i2;
                        oVar.F = i2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void e(String str) {
                        if (this.f152675c != null && str != null && !str.isEmpty()) {
                            this.f152675c.v = str;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void g(String str) {
                        if (this.f152675c != null && str != null && !str.isEmpty()) {
                            this.f152675c.w = str;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void i(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.ao = j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void j(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null && zVar.cw <= 0) {
                            this.f152674b.cw = j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void l(int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null && i2 != -1) {
                            if (zVar.bS == -1) {
                                this.f152674b.bS = i2;
                            } else {
                                this.f152674b.bT = i2;
                            }
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void m(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.aX = (int) j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void o(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.bz = j2;
                            if (this.A && this.f152674b.bZ == 0) {
                                a(-1005, true);
                            }
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void p(int i2) {
                        a(-2002, false);
                        this.av = 2;
                        this.t.a("wait", i2);
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void q(String str) {
                        if (this.f152675c != null && str != null && !str.isEmpty()) {
                            this.f152675c.U = str;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void r(String str) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.Z = 1;
                            if (!TextUtils.isEmpty(str)) {
                                this.f152674b.aa = str;
                            }
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void t(String str) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.bp = str;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void y(String str) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.bm = str;
                        }
                    }

                    private void b(com.ss.ttvideoengine.s.c cVar) {
                        z zVar = this.f152674b;
                        if (zVar != null && zVar.N == Integer.MIN_VALUE && this.f152674b.M == Integer.MIN_VALUE && this.f152674b.O == Integer.MIN_VALUE) {
                            this.f152674b.M = cVar.b();
                            this.f152674b.N = cVar.f153260a;
                            this.f152674b.O = cVar.f153261b;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void Q(int i2) {
                        long currentTimeMillis = System.currentTimeMillis();
                        switch (i2) {
                            case 63:
                                if (this.aG <= 0) {
                                    this.aG = currentTimeMillis;
                                    return;
                                }
                                return;
                            case 64:
                                if (this.f152674b.f152822d <= 0) {
                                    this.f152674b.f152822d = currentTimeMillis;
                                    return;
                                }
                                return;
                            case 65:
                                if (this.aF <= 0) {
                                    this.aF = currentTimeMillis;
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void h(int i2) {
                        if (i2 == 1 || ((i2 != 0 && this.f152675c.D.equals("dir_url")) || this.f152675c.ar == 1 || this.f152675c.ar == 2)) {
                            this.f152674b.bZ = 1;
                        } else {
                            this.f152674b.bZ = 0;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void i(String str) {
                        if (this.f152675c != null && str != null && !str.isEmpty()) {
                            this.f152675c.x = str;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void m(String str) {
                        o oVar = this.f152675c;
                        if (oVar != null) {
                            oVar.A = str;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void n(String str) {
                        if (this.f152674b != null && !TextUtils.isEmpty(str)) {
                            this.f152674b.aF = str;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void o(String str) {
                        if (this.f152675c != null && str != null && !str.isEmpty()) {
                            this.f152675c.T = str;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void p(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null && zVar.bA <= 0) {
                            this.f152674b.bA = j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void q(int i2) {
                        j.a("VideoEventLoggerV2", "movie may stall");
                        u uVar = this.s;
                        uVar.f152714c.f152730d = System.currentTimeMillis();
                        uVar.f152714c.f152731e = i2;
                        j.b("VideoEventOneEvent", "movie stall type:".concat(String.valueOf(i2)));
                        if (uVar.f152712a != null) {
                            uVar.f152712a.c();
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void t(long j2) {
                        u uVar = this.s;
                        if (uVar != null) {
                            uVar.f152714c.G = 1;
                        }
                        y yVar = this.u;
                        if (yVar != null) {
                            yVar.f152792b.K = 1;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("pts", "-1");
                        hashMap.put(StringSet.type, "non");
                        hashMap.put("diff", Long.toString(j2));
                        this.bB.add(new JSONObject(hashMap).toString());
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void u(String str) {
                        if (TextUtils.isEmpty(this.ag)) {
                            this.ag = str;
                        }
                        if (this.af <= 0) {
                            this.af = System.currentTimeMillis();
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void x(String str) {
                        if (!TextUtils.isEmpty(str)) {
                            this.R += str;
                        }
                    }

                    private void V(int i2) {
                        this.f152674b.bF = i2;
                        TimerTask timerTask = this.aW;
                        if (timerTask != null) {
                            timerTask.cancel();
                            this.aW = null;
                        }
                        Timer timer = this.aV;
                        if (timer != null) {
                            timer.cancel();
                            this.aV = null;
                        }
                        if (this.aR) {
                            this.w.b();
                        }
                        ag.a.a().b();
                        F();
                        this.f152674b = new z();
                        this.w.f152574f = this.f152675c;
                        this.s.a();
                        this.t.a();
                        this.u.a();
                        this.x.f152624b.clear();
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void c(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.ai = j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void k(long j2) {
                        n nVar = this.x;
                        if (nVar.f152624b != null) {
                            n.b bVar = null;
                            while (true) {
                                if (!nVar.f152624b.isEmpty()) {
                                    bVar = nVar.f152624b.remove(0);
                                    if (bVar != null && bVar.f152638f == j2) {
                                        break;
                                    }
                                } else if (bVar == null) {
                                    return;
                                }
                            }
                            j.b("VideoEventAbrEvent", "abrSwitchEnd");
                            bVar.f152645m = (int) nVar.f152623a.f152649a.b(106);
                            bVar.f152643k = nVar.f152623a.f152649a.b(107);
                            bVar.f152634b = System.currentTimeMillis() - bVar.f152633a;
                            nVar.f152623a.a();
                            com.ss.ttvideoengine.s.b.a(new n.a(nVar.f152623a.ac, nVar, nVar.f152623a, bVar));
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void r(int i2) {
                        if (i2 == 0 && this.av == 3) {
                            this.av = 2;
                            this.s.a("wait");
                        }
                        if (this.f152674b != null) {
                            if (i2 == 0) {
                                if (this.av != 4) {
                                    a(-2003, false);
                                }
                            } else if (i2 == 1) {
                                a(-2004, false);
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            if (this.f152674b.aq <= 0) {
                                this.f152674b.aq = currentTimeMillis;
                            }
                            if (i2 == 1) {
                                long j2 = this.ai;
                                if (j2 > 0 && currentTimeMillis >= j2) {
                                    this.f152677e += currentTimeMillis - j2;
                                    this.ai = 0;
                                }
                            }
                            this.f152674b.bK = currentTimeMillis;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void v(int i2) {
                        j.b("VideoEventLoggerV2", "AVNoRenderEnd, type: ".concat(String.valueOf(i2)));
                        if (!this.v.f152742c) {
                            j.a("VideoEventLoggerV2", "AVNoRenderEnd, not started before, abort");
                        } else if (this.v.f152741b.f152750a == i2) {
                            this.v.a();
                            HashMap hashMap = new HashMap();
                            hashMap.put(StringSet.type, Integer.valueOf(i2));
                            hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                            f fVar = this.f152673a;
                            if (fVar != null) {
                                fVar.a(6, hashMap);
                            }
                        } else {
                            j.a("VideoEventLoggerV2", "AVNoRenderEnd, type does not match, abort");
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void w(int i2) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (i2 != 5) {
                            boolean z2 = true;
                            if (this.av == 4) {
                                this.t.a("wait", 0);
                                z2 = false;
                            }
                            if (this.av == 3) {
                                this.s.a("wait");
                                this.f152674b.bK = currentTimeMillis;
                            } else if (z2) {
                                this.f152675c.a();
                            }
                        }
                        if (this.bC) {
                            long j2 = -1;
                            f fVar = this.f152673a;
                            if (fVar != null) {
                                j2 = (long) fVar.c(67);
                            }
                            this.u.a((int) j2, "finish");
                            this.bC = false;
                        }
                        if (!this.A || this.f152674b.w > 0) {
                            this.f152674b.x = currentTimeMillis;
                        } else {
                            this.f152674b.y = currentTimeMillis;
                        }
                        V(i2);
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(int i2) {
                        if (this.av != 0) {
                            boolean z2 = true;
                            long currentTimeMillis = System.currentTimeMillis();
                            if (this.av == 4) {
                                this.t.a("exit", 0);
                                z2 = false;
                            }
                            if (this.av == 3) {
                                this.s.a("exit");
                                this.f152674b.bK = currentTimeMillis;
                                z2 = false;
                            }
                            this.av = 0;
                            if (!this.A || this.f152674b.f152822d <= 0 || this.f152674b.w > 0) {
                                this.f152674b.x = currentTimeMillis;
                            } else if (this.f152674b.y <= 0) {
                                this.f152674b.y = currentTimeMillis;
                            }
                            if (z2) {
                                this.f152675c.a();
                            }
                            if (this.bC) {
                                long j2 = -1;
                                f fVar = this.f152673a;
                                if (fVar != null) {
                                    j2 = (long) fVar.c(67);
                                }
                                this.u.a((int) j2, "exit");
                                this.bC = false;
                            }
                            if (this.f152674b.cw <= 0) {
                                this.f152673a.a(2, I());
                            }
                            e eVar = this.bb;
                            if (eVar.f152611c) {
                                eVar.f152611c = false;
                                eVar.f152609a.getContentResolver().unregisterContentObserver(eVar.f152612d);
                            }
                            V(i2);
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void j(String str) {
                        this.O = str;
                        HashMap hashMap = new HashMap();
                        hashMap.put("to", str);
                        hashMap.put("p", -1);
                        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                        hashMap.put("c", 0);
                        hashMap.put("seam", false);
                        this.bu.add(new JSONObject(hashMap).toString());
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void s(int i2) {
                        long j2;
                        Object obj;
                        this.bC = true;
                        u uVar = this.s;
                        long j3 = -1;
                        if (uVar != null) {
                            j2 = uVar.b();
                        } else {
                            j2 = -1;
                        }
                        x xVar = this.t;
                        if (xVar != null) {
                            j3 = xVar.b();
                        }
                        y yVar = this.u;
                        long currentTimeMillis = System.currentTimeMillis();
                        yVar.f152792b.f152806a = currentTimeMillis;
                        yVar.f152792b.r = i2;
                        if (j2 == 0) {
                            yVar.f152792b.p = yVar.f152792b.f152806a;
                        } else {
                            yVar.f152792b.p = j2;
                        }
                        if (j3 == 0) {
                            yVar.f152792b.q = yVar.f152792b.f152806a;
                        } else {
                            yVar.f152792b.q = j3;
                        }
                        if (yVar.f152791a != null) {
                            yVar.f152792b.f152816k = yVar.f152791a.Q;
                            yVar.f152792b.f152818m = yVar.f152791a.R;
                            yVar.f152792b.w = yVar.f152791a.af;
                            if (!(yVar.f152791a.al == null || (obj = yVar.f152791a.al.get("abr_used")) == null)) {
                                yVar.f152792b.v = ((Integer) obj).intValue();
                            }
                            if (yVar.f152791a.f152649a != null) {
                                Map<String, Long> a2 = l.a(yVar.f152791a.f152649a.a(55));
                                if (a2.get("fvl") != null) {
                                    yVar.f152792b.f152811f = a2.get("fvl").longValue();
                                }
                                if (a2.get("fal") != null) {
                                    yVar.f152792b.f152810e = a2.get("fal").longValue();
                                }
                                if (a2.get("dvl") != null) {
                                    yVar.f152792b.f152813h = a2.get("dvl").longValue();
                                }
                                if (a2.get("dal") != null) {
                                    yVar.f152792b.f152812g = a2.get("dal").longValue();
                                }
                                if (a2.get("bvl") != null) {
                                    yVar.f152792b.f152815j = a2.get("bvl").longValue();
                                }
                                if (a2.get("bal") != null) {
                                    yVar.f152792b.f152814i = a2.get("bal").longValue();
                                }
                                yVar.f152792b.y = yVar.f152791a.f152649a.c(88);
                                yVar.f152792b.B = yVar.f152791a.f152649a.c(89);
                                yVar.f152792b.C = yVar.f152791a.f152649a.c(90);
                                yVar.f152792b.H = yVar.f152791a.f152649a.c(94);
                                long b2 = yVar.f152791a.f152649a.b(91);
                                if (b2 > 0) {
                                    yVar.f152792b.z = currentTimeMillis - b2;
                                }
                                long b3 = yVar.f152791a.f152649a.b(92);
                                if (b3 > 0) {
                                    yVar.f152792b.A = currentTimeMillis - b3;
                                }
                                long b4 = yVar.f152791a.f152649a.b(93);
                                if (b4 > 0) {
                                    yVar.f152792b.D = currentTimeMillis - b4;
                                }
                                long b5 = yVar.f152791a.f152649a.b(95);
                                if (b5 > 0) {
                                    yVar.f152792b.I = currentTimeMillis - b5;
                                }
                                Map<String, Object> d2 = yVar.f152791a.f152649a.d();
                                if (d2 != null) {
                                    yVar.f152792b.E = ((Integer) d2.get("power")).intValue();
                                    yVar.f152792b.F = ((Integer) d2.get("isCharging")).intValue();
                                }
                            }
                        }
                        if (yVar.f152791a != null && yVar.f152791a.f152649a != null) {
                            yVar.f152791a.f152649a.a(3, new HashMap());
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void u(int i2) {
                        j.b("VideoEventLoggerV2", "AVNoRenderStart, type: ".concat(String.valueOf(i2)));
                        if (this.v.f152742c) {
                            j.b("VideoEventLoggerV2", "AVNoRenderStart event is already started, abort");
                            return;
                        }
                        v vVar = this.v;
                        vVar.f152742c = true;
                        vVar.f152741b.f152757h = System.currentTimeMillis();
                        vVar.f152741b.f152750a = i2;
                        if (!(vVar.f152740a == null || vVar.f152740a.f152649a == null)) {
                            Map<String, Long> a2 = l.a(vVar.f152740a.f152649a.a(55));
                            if (a2.get("fvl") != null) {
                                vVar.f152741b.f152751b = a2.get("fvl").longValue();
                            }
                            if (a2.get("fal") != null) {
                                vVar.f152741b.f152752c = a2.get("fal").longValue();
                            }
                            if (a2.get("dvl") != null) {
                                vVar.f152741b.f152753d = a2.get("dvl").longValue();
                            }
                            if (a2.get("dal") != null) {
                                vVar.f152741b.f152754e = a2.get("dal").longValue();
                            }
                            if (a2.get("bvl") != null) {
                                vVar.f152741b.f152755f = a2.get("bvl").longValue();
                            }
                            if (a2.get("bal") != null) {
                                vVar.f152741b.f152756g = a2.get("bal").longValue();
                            }
                            vVar.f152741b.f152759j = v.a(vVar.f152740a.f152649a.a(110));
                            j.b("VideoEventOneNoRender", "stage error: " + vVar.f152741b.f152759j);
                        }
                        this.f152674b.ea = this.v.f152741b.f152759j;
                        long j2 = -1;
                        if (this.f152674b.w > 0) {
                            j2 = this.f152674b.w - this.f152674b.f152822d;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put(StringSet.type, Integer.valueOf(i2));
                        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                        o oVar = this.f152675c;
                        Object obj = "";
                        String str = obj;
                        if (oVar.aa != null) {
                            Map map = (Map) oVar.aa.get("codec");
                            Object obj2 = obj;
                            if (map.get(oVar.Q) != null) {
                                obj2 = map.get(oVar.Q);
                            }
                            str = (String) obj2;
                        }
                        String str2 = str;
                        if (oVar.f152649a != null) {
                            boolean isEmpty = TextUtils.isEmpty(str);
                            str2 = str;
                            if (isEmpty) {
                                str2 = oVar.f152649a.a(0);
                            }
                        }
                        hashMap.put("codec", str2 == 1 ? 1 : 0);
                        hashMap.put("resolution", this.f152675c.z);
                        hashMap.put("quality_desc", this.f152675c.af);
                        hashMap.put("hw", Integer.valueOf(this.f152675c.E));
                        hashMap.put("ps_t", Long.valueOf(this.aH));
                        hashMap.put("first_frame_cost", Long.valueOf(j2));
                        if (this.f152674b.bH != -2147483648L) {
                            hashMap.put("seek_t", Long.valueOf(this.f152674b.bH));
                        }
                        f fVar = this.f152673a;
                        if (fVar != null) {
                            hashMap.put("enable_nnsr", Integer.valueOf(fVar.c(101)));
                            hashMap.put("surface_error_code", Integer.valueOf(this.f152673a.c(100)));
                            hashMap.put("switch_resolution_t", Long.valueOf(this.f152673a.b(92)));
                            this.f152673a.a(5, hashMap);
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void b(long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.ah = j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void c(String str) {
                        this.bp = str;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void c(boolean z2) {
                        this.V = z2;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(double d2, int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            if (i2 == 0) {
                                zVar.cd = d2;
                            } else if (i2 == 1) {
                                zVar.ce = d2;
                            }
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(int i2, int i3) {
                        this.C = i2;
                        this.aj = i3;
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void c(int i2, String str) {
                        boolean z2;
                        boolean z3 = false;
                        if (this.av == 4) {
                            this.t.a("error", 0);
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (this.av == 3) {
                            this.s.a("error");
                            this.f152674b.bK = System.currentTimeMillis();
                        } else {
                            z3 = z2;
                        }
                        this.av = 5;
                        if (z3) {
                            this.f152675c.a();
                        }
                        this.f152674b.P = i2;
                        this.f152674b.Q = str;
                        w(5);
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void d(int i2, int i3) {
                        ad adVar = this.bc;
                        if (i2 > 0) {
                            adVar.f152598a = i2;
                            adVar.f152600c = i2;
                        }
                        if (i3 > 0) {
                            adVar.f152599b = i3;
                            adVar.f152601d = i3;
                        }
                        adVar.a(adVar.f152598a, adVar.f152599b);
                    }

                    private void a(int i2, boolean z2) {
                        if (this.f152674b != null) {
                            if (z2) {
                                this.ay = i2;
                                if (i2 == -1002 || i2 == -1003 || i2 == -1004 || i2 == -1005) {
                                    if (this.ar == 0) {
                                        this.ar = SystemClock.elapsedRealtime();
                                    }
                                } else if (i2 == -2003 || i2 == -2002) {
                                    this.ar = SystemClock.elapsedRealtime();
                                } else {
                                    this.ar = 0;
                                }
                            } else {
                                this.ay = -2001;
                                this.ar = 0;
                            }
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void b(int i2, long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            if (i2 == 0) {
                                zVar.ax = j2;
                            } else if (i2 == 1) {
                                zVar.az = j2;
                            }
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void d(int i2, String str) {
                        if (i2 == 15) {
                            this.f152674b.cJ = str;
                        } else if (i2 == 53) {
                            this.f152675c.ah = str;
                        } else if (i2 == 86) {
                            this.f152675c.y = str;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void b(int i2, String str) {
                        if (i2 == 0) {
                            this.z = true;
                        }
                        o oVar = this.f152675c;
                        switch (i2) {
                            case 0:
                                oVar.D = "local_url";
                                break;
                            case 1:
                                oVar.D = "dir_url";
                                break;
                            case 2:
                                oVar.D = "playitem";
                                break;
                            case 3:
                                oVar.D = "preload";
                                break;
                            case 4:
                                oVar.D = "feed";
                                break;
                            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                                oVar.D = "vid";
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                oVar.D = "fd";
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                                oVar.D = "mds";
                                break;
                        }
                        oVar.C = str;
                        this.al = 0;
                        if (i2 == 6 || i2 == 0) {
                            this.ay = -1005;
                        } else if (i2 == 1 || i2 == 4 || i2 == 2 || i2 == 3 || i2 == 7) {
                            this.ay = -1004;
                        } else if (i2 == 5) {
                            this.ay = -1002;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void c(int i2, long j2) {
                        if (i2 == 21) {
                            this.az = j2;
                        } else if (i2 == 56) {
                            this.aA = j2;
                        } else if (i2 == 87) {
                            this.f152674b.ag = j2;
                        } else if (i2 == 88) {
                            this.f152674b.v = j2;
                        } else if (i2 == 98) {
                            this.f152674b.cN = j2;
                        } else if (i2 != 99) {
                            switch (i2) {
                                case 66:
                                    this.f152674b.f152823e = j2;
                                    return;
                                case 67:
                                    this.f152674b.f152824f = j2;
                                    return;
                                case 68:
                                    this.f152674b.f152825g = j2;
                                    return;
                                case 69:
                                    this.f152674b.f152826h = j2;
                                    return;
                                case 70:
                                    this.f152674b.f152828j = j2;
                                    return;
                                case 71:
                                    this.f152674b.f152829k = j2;
                                    return;
                                case 72:
                                    this.f152674b.o = j2;
                                    return;
                                case 73:
                                    this.f152674b.n = j2;
                                    return;
                                case 74:
                                    this.f152674b.q = j2;
                                    return;
                                case 75:
                                    this.f152674b.p = j2;
                                    return;
                                case 76:
                                    this.f152674b.f152830l = j2;
                                    return;
                                case 77:
                                    this.f152674b.f152831m = j2;
                                    return;
                                case 78:
                                    this.f152674b.f152827i = j2;
                                    return;
                                default:
                                    switch (i2) {
                                        case 82:
                                            this.f152674b.dy = j2;
                                            return;
                                        case 83:
                                            this.f152674b.dx = j2;
                                            return;
                                        case 84:
                                            this.f152674b.dz = j2;
                                            return;
                                        case 85:
                                            this.f152674b.dA = j2;
                                            return;
                                        default:
                                            return;
                                    }
                            }
                        } else {
                            this.f152674b.cO = j2;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void b(int i2, int i3) {
                        Object obj;
                        j.a("VideoEventLoggerV2", "movieStalled, type: ".concat(String.valueOf(i2)));
                        if (i2 == 0) {
                            int i4 = this.av;
                            if (!(i4 == 3 || i4 == 4)) {
                                this.av = 3;
                                int i5 = this.f152679g + 1;
                                this.f152679g = i5;
                                u uVar = this.s;
                                j.b("VideoEventOneEvent", "movieStalled");
                                uVar.f152714c.f152732f = System.currentTimeMillis();
                                uVar.f152714c.f152735i = i3;
                                uVar.f152714c.p = i5;
                                uVar.f152714c.f152727a = "block_net";
                                if (!(uVar.f152712a == null || uVar.f152712a.f152649a == null)) {
                                    uVar.f152714c.z = uVar.f152712a.Q;
                                    uVar.f152714c.B = uVar.f152712a.R;
                                    uVar.f152714c.E = uVar.f152712a.af;
                                    if (!(uVar.f152712a.al == null || (obj = uVar.f152712a.al.get("abr_used")) == null)) {
                                        uVar.f152714c.D = ((Integer) obj).intValue();
                                    }
                                    uVar.f152714c.o = uVar.f152712a.f152649a.b(56);
                                    Map<String, Long> a2 = l.a(uVar.f152712a.f152649a.a(55));
                                    if (a2.get("fvl") != null) {
                                        uVar.f152714c.f152737k = a2.get("fvl").longValue();
                                    }
                                    if (a2.get("fal") != null) {
                                        uVar.f152714c.f152738l = a2.get("fal").longValue();
                                    }
                                    if (a2.get("dvl") != null) {
                                        uVar.f152714c.q = a2.get("dvl").longValue();
                                    }
                                    if (a2.get("dal") != null) {
                                        uVar.f152714c.s = a2.get("dal").longValue();
                                    }
                                    if (a2.get("bvl") != null) {
                                        uVar.f152714c.u = a2.get("bvl").longValue();
                                    }
                                    if (a2.get("bal") != null) {
                                        uVar.f152714c.w = a2.get("bal").longValue();
                                    }
                                    uVar.f152712a.ab = o.d();
                                }
                            }
                            this.f152678f++;
                            if (this.av != 4) {
                                a(-2003, true);
                            }
                        } else if (i2 == 1) {
                            this.f152676d++;
                            a(-2004, true);
                        }
                        if (this.f152674b != null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (this.f152674b.ap <= 0) {
                                this.f152674b.ap = currentTimeMillis;
                            }
                            if (i2 == 1) {
                                this.ai = currentTimeMillis;
                            }
                            this.f152674b.bJ = currentTimeMillis;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void c(int i2, int i3) {
                        if (i2 == 54) {
                            this.br.f152696d = i3;
                        } else if (i2 == 55) {
                            this.br.y = i3;
                        } else if (i2 == 59) {
                            this.aC = i3;
                        } else if (i2 == 60) {
                            this.aD = i3;
                        } else if (i2 == 62) {
                            this.aE = i3;
                        } else if (i2 != 100) {
                            boolean z2 = false;
                            switch (i2) {
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                    this.aI = i3;
                                    return;
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                    if (i3 == 1) {
                                        z2 = true;
                                    }
                                    this.aJ = z2;
                                    return;
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                                    if (i3 == 1) {
                                        z2 = true;
                                    }
                                    this.aK = z2;
                                    return;
                                case ABRConfig.ABR_SELECT_SCENE:
                                    this.aL = i3;
                                    return;
                                default:
                                    switch (i2) {
                                        case 16:
                                            this.f152675c.G = i3;
                                            return;
                                        case 17:
                                            ab abVar = this.w;
                                            if (i3 > 0) {
                                                abVar.f152572d = i3;
                                                return;
                                            }
                                            return;
                                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                                            if (i3 != 0) {
                                                this.aR = true;
                                                this.w.a();
                                                return;
                                            }
                                            this.aR = false;
                                            this.w.b();
                                            return;
                                        case 19:
                                            ab abVar2 = this.w;
                                            if (i3 > 0) {
                                                abVar2.f152569a = i3;
                                                return;
                                            }
                                            return;
                                        default:
                                            switch (i2) {
                                                case 22:
                                                    this.aX = i3;
                                                    return;
                                                case 23:
                                                    this.f152684l = i3;
                                                    return;
                                                case 24:
                                                    this.f152682j = i3;
                                                    return;
                                                case 25:
                                                    this.f152683k = i3;
                                                    return;
                                                case 26:
                                                    this.br.f152693a = i3;
                                                    return;
                                                case 27:
                                                    this.br.f152694b = i3;
                                                    return;
                                                default:
                                                    switch (i2) {
                                                        case 29:
                                                            this.br.f152695c = i3;
                                                            return;
                                                        case 30:
                                                            this.br.f152697e = i3;
                                                            return;
                                                        case 31:
                                                            this.br.f152698f = i3;
                                                            return;
                                                        case 32:
                                                            this.br.f152699g = i3;
                                                            return;
                                                        case 33:
                                                            this.br.f152700h = i3;
                                                            return;
                                                        case 34:
                                                            this.br.f152701i = i3;
                                                            return;
                                                        case 35:
                                                            this.br.f152702j = i3;
                                                            return;
                                                        case 36:
                                                            this.br.f152703k = i3;
                                                            return;
                                                        case 37:
                                                            this.br.f152704l = i3;
                                                            return;
                                                        case 38:
                                                            this.br.f152705m = i3;
                                                            return;
                                                        case 39:
                                                            this.br.n = i3;
                                                            return;
                                                        case 40:
                                                            this.br.o = i3;
                                                            return;
                                                        case 41:
                                                            this.br.p = i3;
                                                            return;
                                                        case 42:
                                                            this.br.q = i3;
                                                            return;
                                                        case 43:
                                                            this.br.r = i3;
                                                            return;
                                                        case BuildConfig.VERSION_CODE:
                                                            this.br.s = i3;
                                                            return;
                                                        case 45:
                                                            int i4 = -1;
                                                            HashMap hashMap = new HashMap();
                                                            f fVar = this.f152673a;
                                                            if (fVar != null) {
                                                                i4 = fVar.c(67);
                                                            }
                                                            hashMap.put("s", Integer.valueOf(this.aI));
                                                            hashMap.put("p", Integer.valueOf(i4));
                                                            hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                                                            this.bw.add(new JSONObject(hashMap).toString());
                                                            return;
                                                        case 46:
                                                            this.bm = i3;
                                                            return;
                                                        case 47:
                                                            this.bk = i3;
                                                            return;
                                                        case 48:
                                                            this.bl = i3;
                                                            return;
                                                        case 49:
                                                            this.bi = i3;
                                                            return;
                                                        case 50:
                                                            this.bj = i3;
                                                            return;
                                                        case 51:
                                                            if (i3 == 1) {
                                                                z2 = true;
                                                            }
                                                            this.aT = z2;
                                                            this.f152675c.ag = z2;
                                                            return;
                                                        case 52:
                                                            if (i3 == 1) {
                                                                z2 = true;
                                                            }
                                                            this.aU = z2;
                                                            return;
                                                        default:
                                                            switch (i2) {
                                                                case 79:
                                                                    this.aM = i3;
                                                                    return;
                                                                case 80:
                                                                    this.aN = i3;
                                                                    return;
                                                                case 81:
                                                                    this.aO = i3;
                                                                    return;
                                                                default:
                                                                    switch (i2) {
                                                                        case 89:
                                                                            this.f152674b.dL = i3;
                                                                            return;
                                                                        case 90:
                                                                            if (i3 > 0) {
                                                                                b bVar = this.br;
                                                                                bVar.t = i3 | bVar.t;
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 91:
                                                                            this.br.u = i3;
                                                                            return;
                                                                        case 92:
                                                                            if (i3 > 0) {
                                                                                this.br.v = i3;
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 93:
                                                                            this.br.w = i3;
                                                                            return;
                                                                        case 94:
                                                                            this.br.x = i3;
                                                                            return;
                                                                        case 95:
                                                                            this.bf = i3;
                                                                            return;
                                                                        case 96:
                                                                            this.br.z = i3;
                                                                            return;
                                                                        case 97:
                                                                            this.br.A = i3;
                                                                            return;
                                                                        default:
                                                                            return;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                        } else {
                            this.t.f152769h = i3;
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(int i2, long j2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            if (i2 == 0) {
                                zVar.aw = j2;
                            } else if (i2 == 1) {
                                zVar.ay = j2;
                            }
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void b(long j2, int i2) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.by = j2;
                            this.f152674b.bZ = i2;
                            if (this.A && i2 == 0) {
                                a(-1004, true);
                            }
                        }
                    }

                    public r(Context context, f fVar, h hVar) {
                        this.f152673a = fVar;
                        this.f152675c = new o(this.f152673a, this.aQ, context);
                        this.f152674b = new z();
                        this.t = new x(this.f152675c);
                        this.s = new u(this.f152675c, this.t);
                        this.w = new ab(this.f152675c);
                        this.u = new y(this.f152675c);
                        this.v = new v(this.f152675c);
                        this.x = new n(this.f152675c);
                        this.br = new b();
                        this.E = new ArrayList();
                        this.F = new ArrayList<>();
                        this.G = new ArrayList();
                        this.H = new ArrayList();
                        this.I = new ArrayList();
                        this.A = true;
                        this.B = false;
                        this.aw = context;
                        this.y = hVar;
                        this.aZ = new m();
                        this.ba = new ac();
                        this.bb = new e(this.aw);
                        this.bc = new ad();
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(int i2, int i3, boolean z2) {
                        if (!this.A) {
                            if (!z2) {
                                long currentTimeMillis = System.currentTimeMillis();
                                if (this.av == 3) {
                                    this.s.a("seek");
                                    this.f152674b.bK = currentTimeMillis;
                                }
                                if (this.av == 4) {
                                    this.t.a("seek", 0);
                                }
                                int i4 = this.ap + 1;
                                this.ap = i4;
                                this.av = 4;
                                x xVar = this.t;
                                j.b("VideoEventOneOpera", "brian beginSeek from " + i2 + " to " + i3);
                                xVar.f152764c.f152783f = System.currentTimeMillis();
                                xVar.f152764c.f152778a = "seek";
                                xVar.f152764c.f152779b = Integer.toString(i2);
                                xVar.f152764c.f152780c = Integer.toString(i3);
                                xVar.f152764c.f152781d = 0;
                                xVar.f152764c.f152789l = i4;
                                if (xVar.f152762a != null) {
                                    xVar.f152764c.f152790m = xVar.f152762a.Q;
                                    xVar.f152764c.o = xVar.f152762a.R;
                                }
                                this.t.f152765d = this.f152674b.bJ;
                                this.t.f152766e = this.f152674b.bK;
                                this.as = currentTimeMillis;
                                z zVar = this.f152674b;
                                if (zVar != null) {
                                    zVar.bH = currentTimeMillis;
                                    this.f152674b.bN = i3;
                                }
                                this.as = SystemClock.elapsedRealtime();
                                if (this.bC) {
                                    this.u.a(i2, "seek");
                                    this.bC = false;
                                }
                            }
                            a(-2002, true);
                        }
                    }

                    @Override // com.ss.ttvideoengine.h.j
                    public final void a(int i2, int i3, int i4, int i5) {
                        z zVar = this.f152674b;
                        if (zVar != null) {
                            zVar.cx = i2;
                            this.f152674b.cy = i3;
                            this.f152674b.cz = i4;
                            this.f152674b.cA = i5;
                        }
                    }
                }

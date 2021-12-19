package com.ss.android.ugc.playerkit.model;

import android.content.Context;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.aweme.player.sdk.b.b;
import com.ss.android.ugc.aweme.player.sdk.b.e;
import com.ss.android.ugc.playerkit.a.a;
import com.ss.android.ugc.playerkit.a.d;
import java.util.ArrayList;
import java.util.List;

public final class p {
    private static i aG = new i() {
        /* class com.ss.android.ugc.playerkit.model.p.AnonymousClass1 */

        static {
            Covode.recordClassIndex(98011);
        }

        @Override // com.ss.android.ugc.playerkit.model.i
        public final String getFirstFrameKey() {
            return null;
        }

        @Override // com.ss.android.ugc.playerkit.model.i
        public final String getPrepareKey() {
            return null;
        }

        @Override // com.ss.android.ugc.playerkit.model.i
        public final boolean isLoop() {
            return true;
        }

        @Override // com.ss.android.ugc.playerkit.model.i
        public final boolean isPlayLoop() {
            return true;
        }
    };
    public boolean A;
    public boolean B;
    public u C;
    List<s> D;
    public List<t> E;
    public boolean F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public d R;
    public int S;
    public int T;
    public String U;
    public String V;
    public int W;
    public boolean X = true;
    public String Y;
    public float Z = 1.0f;

    /* renamed from: a  reason: collision with root package name */
    public OnPreRenderListener f148794a;
    public boolean aA;
    public boolean aB;
    public boolean aC;
    public int aD;
    public boolean aE;
    public a<Long, Long> aF;
    public boolean aa;
    public int ab;
    public int ac;
    public int ad;
    public Float ae = Float.valueOf(0.0f);
    public Float af;
    public Float ag;
    public boolean ah;
    public boolean ai;
    public boolean aj;
    public Long ak;
    public List<Surface> al;
    public boolean am;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public int aq;
    public boolean ar;
    public int as;
    public String at;
    public boolean au;
    public boolean av;
    public int aw;
    public int ax;
    public int ay;
    public int az;

    /* renamed from: b  reason: collision with root package name */
    public d<u> f148795b;

    /* renamed from: c  reason: collision with root package name */
    public List<d<s>> f148796c;

    /* renamed from: d  reason: collision with root package name */
    public List<d<t>> f148797d;

    /* renamed from: e  reason: collision with root package name */
    public e f148798e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f148799f;

    /* renamed from: g  reason: collision with root package name */
    public d<Boolean> f148800g;

    /* renamed from: h  reason: collision with root package name */
    public d<b> f148801h;

    /* renamed from: i  reason: collision with root package name */
    public Context f148802i;

    /* renamed from: j  reason: collision with root package name */
    public String f148803j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f148804k;

    /* renamed from: l  reason: collision with root package name */
    public i f148805l = aG;

    /* renamed from: m  reason: collision with root package name */
    public boolean f148806m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public Surface u;
    public int v = 1;
    public d<Integer> w;
    public String x;
    public String y;
    public String z;

    static {
        Covode.recordClassIndex(98010);
    }

    public final boolean d() {
        d<Boolean> dVar = this.f148800g;
        if (dVar == null) {
            return false;
        }
        return dVar.a().booleanValue();
    }

    public final void e() {
        a<Long, Long> aVar;
        if (this.aj && (aVar = this.aF) != null) {
            this.ak = aVar.a(this.ak);
        }
    }

    public final u a() {
        u uVar;
        d<u> dVar;
        if (this.C == null && (dVar = this.f148795b) != null) {
            this.C = dVar.a();
        }
        if (c.f148702a.isDynamicBitrateEnable() && (uVar = this.C) != null) {
            this.n = uVar.f148827d;
        }
        u uVar2 = this.C;
        if (uVar2 != null) {
            this.y = uVar2.f148829f;
            this.z = this.C.f148830g;
        }
        return this.C;
    }

    public final List<s> b() {
        if (this.D == null && this.f148796c != null) {
            this.D = new ArrayList();
            for (d<s> dVar : this.f148796c) {
                this.D.add(dVar.a());
            }
        }
        return this.D;
    }

    public final List<t> c() {
        if (this.E == null && this.f148797d != null) {
            this.E = new ArrayList();
            for (d<t> dVar : this.f148797d) {
                this.E.add(dVar.a());
            }
        }
        return this.E;
    }

    public p() {
        Float valueOf = Float.valueOf(Float.MIN_VALUE);
        this.af = valueOf;
        this.ag = valueOf;
        this.ah = false;
        this.ai = false;
        this.ak = 0L;
        this.al = null;
        this.am = false;
        this.an = false;
        this.ao = false;
        this.ap = false;
        this.aq = 15;
        this.ar = false;
        this.as = 0;
        this.at = null;
        this.au = false;
        this.av = false;
        this.aw = 0;
        this.ax = 0;
        this.ay = 0;
        this.az = 0;
        this.aA = true;
        this.aB = false;
        this.aC = false;
        this.aD = -1;
        this.aE = false;
        this.aF = q.f148807a;
    }

    public final String toString() {
        return "PrepareData{urlSupplier=" + this.f148795b + ", cacheSupplier=" + this.f148800g + ", resolutionSupplier=" + this.f148801h + ", context=" + this.f148802i + ", id='" + this.f148803j + '\'' + ", isRenderReady=" + this.f148804k + ", config=" + this.f148805l + ", vr=" + this.f148806m + ", bytevc1=" + this.n + ", renderType=" + this.q + ", decoderType=" + this.r + ", enableAlog=" + this.s + ", prepareOnly=" + this.t + ", surface=" + this.u + ", framesWait=" + this.v + ", prepareQualitySupplier=" + this.w + ", uri='" + this.x + '\'' + ", cacheKey='" + this.y + '\'' + ", checksum='" + this.z + '\'' + ", isCurPlayer=" + this.A + ", isPrepareCallback=" + this.B + ", processUrlData=" + this.C + ", isAsyncInit=" + this.F + ", initialStartTimeMs=" + this.G + ", isUseTextureRenderer=" + this.H + ", needSetCookieToken=" + this.I + ", dashHijackRetry=" + this.J + ", forceNotReuseEngine=" + this.O + ", fixPrepareSeqTmp=" + this.P + ", preloadSocketReuse=" + this.Q + ", dashPlayInfo=" + this.R + ", tag='" + this.U + '\'' + ", subTag='" + this.V + '\'' + ", networkSpeed=" + this.W + ", isLoop=" + this.X + ", dk='" + this.Y + '\'' + ", speed=" + this.Z + ", isEnableBufferThresholdControl=" + this.aa + ", bufferThresholdControlDangerThreshold=" + this.ab + ", bufferThresholdControlSecureThreshold=" + this.ac + ", duration=" + this.ad + ", volumeLoudnessTarget=" + this.ae + ", videoVolumeSrcLoudness=" + this.af + ", videoVolumeSrcPeak=" + this.ag + ", disableRenderAudio=" + this.aj + ", processAudioAddr=" + this.ak + ", extraSurface=" + this.al + ", subtitlesEnable=" + this.ar + ", languageId=" + this.as + ", subtitleDesInfoModel=" + this.at + ", callCurrentPlaybackTime=" + this.aB + '}';
    }

    public p(d<u> dVar, d<Boolean> dVar2, Context context, String str, boolean z2, i iVar, boolean z3, boolean z4, int i2, d<Integer> dVar3, String str2, boolean z5, boolean z6, int i3, Runnable runnable) {
        Float valueOf = Float.valueOf(Float.MIN_VALUE);
        this.af = valueOf;
        this.ag = valueOf;
        this.ah = false;
        this.ai = false;
        this.ak = 0L;
        this.al = null;
        this.am = false;
        this.an = false;
        this.ao = false;
        this.ap = false;
        this.aq = 15;
        this.ar = false;
        this.as = 0;
        this.at = null;
        this.au = false;
        this.av = false;
        this.aw = 0;
        this.ax = 0;
        this.ay = 0;
        this.az = 0;
        this.aA = true;
        this.aB = false;
        this.aC = false;
        this.aD = -1;
        this.aE = false;
        this.aF = r.f148808a;
        this.f148795b = dVar;
        this.f148800g = dVar2;
        this.f148802i = context;
        this.f148803j = str;
        this.f148804k = z2;
        this.f148805l = iVar;
        this.f148806m = z3;
        this.n = z4;
        this.q = i2;
        this.w = dVar3;
        this.x = str2;
        this.A = true;
        this.B = z5;
        this.F = z6;
        this.r = i3;
        this.f148799f = runnable;
    }
}

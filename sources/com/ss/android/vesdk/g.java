package com.ss.android.vesdk;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ttve.model.b;
import com.ss.android.ttve.model.c;
import com.ss.android.ttve.model.d;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.h.a;
import com.ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.ss.android.vesdk.model.VEPrePlayParams;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import com.ss.android.vesdk.runtime.e;
import java.util.List;

public abstract class g {
    Context S;
    public a T;
    public l U;
    e V;
    public VEListener.ai W;
    VEListener.k X;
    public VEListener.h Y;
    ax.k Z;
    String aA;
    long aB;
    long aC;
    int aD;
    int aE = as.RADIO_FULL.ordinal();
    VESize aF = null;
    boolean aG = false;
    com.ss.android.ttve.model.a aH = new com.ss.android.ttve.model.a();
    VEEffectFilterParam aI = new VEEffectFilterParam();
    c aJ = new c();
    d aK = new d();
    b aL = new b();
    VEVolumeParam aM = new VEVolumeParam();
    public boolean aN;
    VESize aO = new VESize(0, 0);
    float aP = 0.125f;
    float aQ = 0.125f;
    public boolean aR = false;
    boolean aS;
    VEWatermarkParam aT;
    boolean aU = false;
    boolean aV = false;
    String aW = null;
    public boolean aX = false;
    protected AssetManager aY = null;
    protected boolean aZ = false;
    public VEListener.ag aa;
    ax.n ab;
    ax.m ac;
    ax.o ad;
    MessageCenter.Listener ae;
    ax.b af;
    ax.l ag;
    ax.i ah;
    ax.s ai;
    a<Object> aj = new a<>();
    ax.p ak;
    VEListener.f al;
    public VEListener.g am;
    ax.a an = null;
    ax.q ao;
    public VEListener.ak ap;
    long aq = -1;
    IStickerRequestCallback ar;
    public VECameraSettings as;
    VEVideoEncodeSettings at;
    VEAudioEncodeSettings au;
    String av;
    public boolean aw;
    w ax;
    av ay;
    public aw az = aw.DEFAULT;
    public int ba = 0;
    public int bb = 0;
    public int bc = 0;
    public float bd = 0.0f;
    public float be = 0.0f;
    public int bf = 0;
    public float bg = 0.0f;
    public int bh = 0;
    public int bi = 0;
    public int bj = 0;
    public float bk = 0.0f;
    public float bl = 0.0f;
    public double bm = 0.0d;
    public double bn = 0.0d;
    public double bo = 0.0d;
    public double bp = 0.0d;
    protected boolean bq = false;
    protected boolean br = false;
    protected boolean bs = false;
    protected com.ss.android.ttvecamera.k.b bt;
    boolean bu = false;
    boolean bv = false;

    static {
        Covode.recordClassIndex(99512);
    }

    public void A() {
    }

    public abstract float a(String str);

    public abstract int a(double d2, double d3, double d4, double d5);

    public abstract int a(float f2, float f3);

    public abstract int a(float f2, float f3, float f4, float f5, float f6);

    public abstract int a(int i2, float f2);

    public abstract int a(int i2, float f2, float f3, int i3);

    public abstract int a(int i2, int i3, ax.d dVar);

    public abstract int a(int i2, String str);

    public int a(int i2, VESafeAreaParams[] vESafeAreaParamsArr) {
        return 0;
    }

    public int a(Bitmap bitmap) {
        return -1;
    }

    public abstract int a(Surface surface);

    public abstract int a(VEEffectParams vEEffectParams);

    public abstract int a(ax.g gVar);

    public abstract int a(ax.h hVar);

    public abstract int a(be beVar);

    public abstract int a(String str, float f2);

    public abstract int a(String str, float f2, float f3);

    public abstract int a(String str, int i2, int i3, Bitmap.CompressFormat compressFormat, ax.e eVar);

    public abstract int a(String str, int i2, int i3, String str2);

    public abstract int a(String str, String str2, float f2);

    /* access modifiers changed from: package-private */
    public abstract int a(boolean z, String str);

    public abstract int a(boolean z, boolean z2, boolean z3, boolean z4);

    public abstract int a(double[] dArr, double d2);

    public abstract int a(String[] strArr);

    public abstract int a(String[] strArr, int i2);

    public int a(String[] strArr, String[] strArr2, float[] fArr) {
        return 0;
    }

    public abstract void a(double d2);

    public abstract void a(float f2, float f3, float f4);

    public abstract void a(float f2, float f3, float f4, float f5);

    public abstract void a(int i2, int i3, int i4, int i5);

    public abstract void a(int i2, long j2, long j3, String str);

    public abstract void a(VECherEffectParam vECherEffectParam);

    public void a(VEListener.j jVar) {
    }

    public void a(VEBaseRecorderLensParams vEBaseRecorderLensParams, ax.q qVar) {
    }

    public abstract void a(Runnable runnable);

    public void a(String str, String str2) {
    }

    public abstract void a(String str, String str2, float f2, float f3, float f4);

    public abstract void a(String str, String str2, String str3);

    public abstract void a(boolean z);

    public abstract void a(boolean z, long j2);

    public abstract void a(float[] fArr);

    public abstract boolean a(bh bhVar, int i2);

    public abstract int[] a(int i2, int i3, int i4, int i5, float f2);

    public abstract int b(double d2, double d3, double d4, double d5);

    public abstract int b(float f2, float f3);

    public abstract int b(ax.h hVar);

    public abstract int b(String str);

    public abstract int b(String str, float f2);

    public abstract int b(String str, float f2, float f3);

    public abstract int b(String[] strArr, int i2);

    public abstract void b(int i2);

    public abstract void b(String str, String str2);

    public abstract void b(boolean z);

    public abstract boolean b(int i2, int i3);

    public abstract int c(double d2, double d3, double d4, double d5);

    public abstract int c(float f2, float f3);

    public com.ss.android.vesdk.c.a c() {
        return null;
    }

    public void c(String str) {
    }

    public abstract int[] c(String str, String str2);

    public abstract int d(float f2, float f3);

    public abstract int d(String str, String str2);

    public abstract void d();

    public void d(int i2) {
    }

    public abstract void d(boolean z);

    public abstract int e(float f2, float f3);

    public abstract int e(int i2);

    public void e(VEListener.j jVar) {
    }

    public abstract boolean e(boolean z);

    public abstract int[] e();

    public void f(int i2) {
    }

    public abstract void f(boolean z);

    public abstract int[] f();

    public abstract float g();

    public abstract void g(boolean z);

    public int h() {
        return 0;
    }

    public void h(boolean z) {
    }

    public abstract int i(boolean z);

    public abstract void i();

    public abstract void j(boolean z);

    public abstract void k(boolean z);

    public long l() {
        return 0;
    }

    public void l(boolean z) {
    }

    public long m() {
        return 0;
    }

    public void m(boolean z) {
    }

    public int n() {
        return 0;
    }

    public void n(boolean z) {
    }

    public abstract void p(boolean z);

    /* access modifiers changed from: package-private */
    public abstract float[] p();

    public void q(boolean z) {
    }

    public void u() {
        this.ai = null;
    }

    public long v() {
        return 0;
    }

    public VEMapBufferInfo w() {
        return null;
    }

    public abstract EnigmaResult y();

    public abstract com.ss.android.medialib.presenter.d z();

    public int a(com.ss.android.vesdk.b.a aVar, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, at atVar, String str, String str2, boolean z) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    public int a(e eVar) {
        this.V = eVar;
        return 0;
    }

    public void a(ax.i iVar) {
        this.ah = iVar;
    }

    public int a(String str, long j2, long j3, int i2) {
        this.aA = str;
        this.aB = j2;
        this.aC = j3;
        this.aD = i2;
        return 0;
    }

    public void a(List<bf> list, String str, int i2, VEListener.j jVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void a(Surface surface, VEListener.j jVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void a(VEListener.j jVar, boolean z) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void a(float f2, VEListener.j jVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void b(VEListener.j jVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void a(String str, String str2, int i2, String str3, String str4, VEListener.j jVar) {
        jVar.a(-1);
    }

    public void a(boolean z, PrivacyCert privacyCert) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void a(PrivacyCert privacyCert) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void a(VEVolumeParam vEVolumeParam) {
        this.aM = vEVolumeParam;
    }

    public void a(long j2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void a(r rVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int a(VEPrePlayParams vEPrePlayParams) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public void a(com.ss.android.vesdk.b.b bVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public VEFrame a(ax.c cVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void a(ax.p pVar) {
        this.ak = pVar;
    }

    /* access modifiers changed from: protected */
    public int a(VEEffectFilterParam vEEffectFilterParam) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void a(ax.n nVar) {
        this.ab = nVar;
    }

    public void b(ax.n nVar) {
        this.ab = null;
    }

    public void a(ax.l lVar) {
        this.ag = lVar;
    }

    public void a(ax.s sVar) {
        this.ai = sVar;
    }

    public void a(MessageCenter.Listener listener) {
        this.ae = listener;
    }

    public void a(ax.b bVar, int i2) {
        this.af = bVar;
    }

    public void a(al alVar) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    public void b(al alVar) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    public void a(float[] fArr, double d2) {
        a(fArr);
    }

    public String[] j() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int q() {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public void t() {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public void o() {
        this.X = null;
        this.Z = null;
        this.aa = null;
        this.W = null;
        this.Y = null;
        this.ah = null;
        this.ab = null;
        this.ac = null;
        this.ad = null;
        this.af = null;
        this.ae = null;
        this.ag = null;
        this.ai = null;
        this.ak = null;
        this.al = null;
        this.am = null;
        this.S = null;
        this.T = null;
    }

    public int a(float f2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int d(VEListener.j jVar) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public void c(VEListener.j jVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052 A[Catch:{ JSONException -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(com.ss.android.vesdk.filterparam.VEEffectFilterParam r7) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.g.b(com.ss.android.vesdk.filterparam.VEEffectFilterParam):int");
    }

    public void b(float f2) {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public void b(PrivacyCert privacyCert) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int d(int i2, int i3) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public int c(int i2, int i3) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public int a(int i2, VETrackParams vETrackParams) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public g(Context context, e eVar, a aVar) {
        this.S = context;
        this.V = eVar;
        this.T = null;
    }

    public int a(int i2, int i3, long j2) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public int a(int i2, int i3, boolean z) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }
}

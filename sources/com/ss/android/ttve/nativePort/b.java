package com.ss.android.ttve.nativePort;

import android.media.ImageReader;
import android.media.MediaCodec;
import android.os.HandlerThread;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.ad;
import com.ss.android.vesdk.an;
import java.nio.ByteBuffer;

public class b {

    /* renamed from: c  reason: collision with root package name */
    static String f61300c;

    /* renamed from: d  reason: collision with root package name */
    static String f61301d;
    boolean A;
    boolean B;
    public boolean C;
    public boolean D;

    /* renamed from: a  reason: collision with root package name */
    long f61302a = Thread.currentThread().getId();

    /* renamed from: b  reason: collision with root package name */
    public String f61303b = "HwFrameExtractor2_";

    /* renamed from: e  reason: collision with root package name */
    String f61304e;

    /* renamed from: f  reason: collision with root package name */
    int[] f61305f;

    /* renamed from: g  reason: collision with root package name */
    int f61306g;

    /* renamed from: h  reason: collision with root package name */
    int f61307h;

    /* renamed from: i  reason: collision with root package name */
    boolean f61308i;

    /* renamed from: j  reason: collision with root package name */
    int f61309j;

    /* renamed from: k  reason: collision with root package name */
    ad f61310k;

    /* renamed from: l  reason: collision with root package name */
    VEFrame f61311l;

    /* renamed from: m  reason: collision with root package name */
    VEFrame f61312m;
    VEFrame n;
    VEFrame o;
    MediaCodec p = null;
    long q;
    int r;
    public final Object s = new Object();
    public int t;
    public int u;
    HandlerThread v;
    HandlerThread w;
    ImageReader x;
    int y;
    boolean z;

    static {
        Covode.recordClassIndex(37756);
    }

    private void c() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f61306g * this.f61307h * 4);
        allocateDirect.clear();
        this.f61311l = VEFrame.createByteBufferFrame(allocateDirect, this.f61306g, this.f61307h, 0, 0, VEFrame.a.TEPixFmt_ARGB8);
    }

    public final void a() {
        try {
            an.a(this.f61303b, "stop begin");
            if (!this.z) {
                this.z = true;
                if (this.x != null) {
                    this.p.reset();
                    this.p.release();
                }
                ImageReader imageReader = this.x;
                if (imageReader != null) {
                    imageReader.close();
                }
                HandlerThread handlerThread = this.w;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                an.a(this.f61303b, "stop end");
            }
        } catch (Exception e2) {
            an.a(this.f61303b, "stop crash");
            Log.getStackTraceString(e2);
            b();
        }
    }

    public final void b() {
        if (!this.z) {
            while (this.y < this.f61305f.length * this.f61309j) {
                an.a(this.f61303b, "processFrameLast processing hasProcxessCount:" + this.y + " ptsMsLength: " + this.f61305f.length);
                if (!this.f61310k.processFrame(null, this.f61306g, this.f61307h, 0)) {
                    an.a(this.f61303b, "processFrameLast stop hasProcxessCount:" + this.y + " ptsMsLength: " + this.f61305f.length);
                    return;
                }
                this.y++;
            }
        }
    }

    public b(String str, int[] iArr, int i2, int i3, int i4, int i5, ad adVar) {
        this.y = 0;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.f61303b += i5 + "_" + this.f61302a;
        this.f61304e = str;
        this.f61305f = iArr;
        this.f61306g = i2;
        this.f61307h = i3;
        this.f61308i = false;
        this.f61309j = i4;
        this.f61310k = adVar;
        try {
            c();
        } catch (OutOfMemoryError unused) {
            an.c(this.f61303b, "init alloc oom");
            Runtime.getRuntime().gc();
            try {
                c();
            } catch (Exception unused2) {
                b();
                return;
            }
        }
        this.f61305f = new int[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            this.f61305f[i6] = iArr[i6] * 1000;
            an.a(this.f61303b, "ptsMS: " + this.f61305f[i6]);
        }
    }
}

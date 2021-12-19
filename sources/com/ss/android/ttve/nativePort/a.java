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

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static String f61273c;

    /* renamed from: d  reason: collision with root package name */
    public static String f61274d;

    /* renamed from: a  reason: collision with root package name */
    public long f61275a = Thread.currentThread().getId();

    /* renamed from: b  reason: collision with root package name */
    public String f61276b = "HwFrameExtractor_";

    /* renamed from: e  reason: collision with root package name */
    public String f61277e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f61278f;

    /* renamed from: g  reason: collision with root package name */
    public int f61279g;

    /* renamed from: h  reason: collision with root package name */
    public int f61280h;

    /* renamed from: i  reason: collision with root package name */
    boolean f61281i;

    /* renamed from: j  reason: collision with root package name */
    public int f61282j;

    /* renamed from: k  reason: collision with root package name */
    ad f61283k;

    /* renamed from: l  reason: collision with root package name */
    VEFrame f61284l;

    /* renamed from: m  reason: collision with root package name */
    public VEFrame f61285m;
    VEFrame n;
    public VEFrame o;
    public MediaCodec p = null;
    public long q;
    public int r;
    public int s;
    public int t;
    public HandlerThread u;
    public HandlerThread v;
    public ImageReader w;
    int x;
    boolean y;
    public boolean z;

    static {
        Covode.recordClassIndex(37752);
    }

    private void c() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f61279g * this.f61280h * 4);
        allocateDirect.clear();
        this.f61284l = VEFrame.createByteBufferFrame(allocateDirect, this.f61279g, this.f61280h, 0, 0, VEFrame.a.TEPixFmt_ARGB8);
    }

    public final void a() {
        try {
            an.a(this.f61276b, "stop begin");
            if (this.w != null) {
                this.p.reset();
                this.p.release();
            }
            ImageReader imageReader = this.w;
            if (imageReader != null) {
                imageReader.close();
            }
            HandlerThread handlerThread = this.v;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            HandlerThread handlerThread2 = this.u;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
            }
        } catch (Exception e2) {
            an.a(this.f61276b, "stop crash");
            Log.getStackTraceString(e2);
            b();
        }
    }

    public final void b() {
        this.y = true;
        an.a(this.f61276b, "processFrameLast begin hasProcessCount:" + this.x + " ptsMsLength: " + this.f61278f.length);
        while (this.x < this.f61278f.length * this.f61282j) {
            an.a(this.f61276b, "processFrameLast processing hasProcxessCount:" + this.x + " ptsMsLength: " + this.f61278f.length);
            if (!this.f61283k.processFrame(null, this.f61279g, this.f61280h, 0)) {
                an.a(this.f61276b, "processFrameLast stop hasProcxessCount:" + this.x + " ptsMsLength: " + this.f61278f.length);
                return;
            }
            this.x += this.f61282j;
        }
    }

    public a(String str, int[] iArr, int i2, int i3, int i4, int i5, ad adVar) {
        this.x = 0;
        this.y = false;
        this.z = false;
        this.f61276b += i5 + "_" + this.f61275a;
        this.f61277e = str;
        this.f61278f = iArr;
        this.f61279g = i2;
        this.f61280h = i3;
        this.f61281i = false;
        this.f61282j = i4;
        this.f61283k = adVar;
        try {
            c();
        } catch (OutOfMemoryError unused) {
            an.c(this.f61276b, "init alloc oom");
            Runtime.getRuntime().gc();
            try {
                c();
            } catch (Exception unused2) {
                b();
                return;
            }
        }
        this.f61278f = new int[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            this.f61278f[i6] = iArr[i6] * 1000;
            an.a(this.f61276b, "ptsMS: " + this.f61278f[i6]);
        }
    }
}

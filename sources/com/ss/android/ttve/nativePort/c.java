package com.ss.android.ttve.nativePort;

import android.media.ImageReader;
import android.media.MediaCodec;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.ad;
import com.ss.android.vesdk.an;
import java.nio.ByteBuffer;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public String f61329a = "HwFrameExtractorRange_";

    /* renamed from: b  reason: collision with root package name */
    String f61330b;

    /* renamed from: c  reason: collision with root package name */
    int f61331c;

    /* renamed from: d  reason: collision with root package name */
    int f61332d;

    /* renamed from: e  reason: collision with root package name */
    int f61333e;

    /* renamed from: f  reason: collision with root package name */
    int f61334f;

    /* renamed from: g  reason: collision with root package name */
    boolean f61335g;

    /* renamed from: h  reason: collision with root package name */
    ad f61336h;

    /* renamed from: i  reason: collision with root package name */
    VEFrame f61337i;

    /* renamed from: j  reason: collision with root package name */
    MediaCodec f61338j = null;

    /* renamed from: k  reason: collision with root package name */
    public final Object f61339k = new Object();

    /* renamed from: l  reason: collision with root package name */
    HandlerThread f61340l;

    /* renamed from: m  reason: collision with root package name */
    HandlerThread f61341m;
    ImageReader n;
    int o = 0;
    boolean p = false;
    private long q = Thread.currentThread().getId();

    static {
        Covode.recordClassIndex(37761);
    }

    private void b() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f61333e * this.f61334f * 4);
        allocateDirect.clear();
        this.f61337i = VEFrame.createByteBufferFrame(allocateDirect, this.f61333e, this.f61334f, 0, 0, VEFrame.a.TEPixFmt_ARGB8);
    }

    public final void a() {
        if (!this.p) {
            an.a(this.f61329a, "processFrameLast begin hasProcessCount:" + this.o);
            if (!this.f61336h.processFrame(null, this.f61333e, this.f61334f, 0)) {
                an.a(this.f61329a, "processFrameLast stop hasProcxessCount:" + this.o);
            }
        }
    }

    public c(String str, int i2, int i3, int i4, int i5, int i6, ad adVar) {
        this.f61329a += i6 + "_" + this.q;
        this.f61330b = str;
        this.f61331c = Math.max(i2, 0);
        this.f61332d = i3;
        this.f61333e = i4;
        this.f61334f = i5;
        this.f61335g = false;
        this.f61336h = adVar;
        try {
            b();
        } catch (OutOfMemoryError unused) {
            an.c(this.f61329a, "init alloc oom");
            Runtime.getRuntime().gc();
            try {
                b();
            } catch (Exception unused2) {
                a();
            }
        }
    }
}

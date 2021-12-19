package com.ss.ttm.player;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttm.a.e;
import com.ss.ttm.player.DummySurface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

class AJMediaCodec {

    /* renamed from: h  reason: collision with root package name */
    private static ArrayList<MediaCodecInfo> f151908h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private static Object f151909i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private static boolean f151910j = false;

    /* renamed from: k  reason: collision with root package name */
    private static boolean f151911k = false;

    /* renamed from: m  reason: collision with root package name */
    private static boolean f151912m = false;
    private static boolean n = false;
    private static boolean p = false;
    private static int q = 1;

    /* renamed from: a  reason: collision with root package name */
    public MediaCodec f151913a;

    /* renamed from: b  reason: collision with root package name */
    public MediaFormat f151914b;

    /* renamed from: c  reason: collision with root package name */
    public AJMediaFormat f151915c = new AJMediaFormat();

    /* renamed from: d  reason: collision with root package name */
    public long f151916d = 0;

    /* renamed from: e  reason: collision with root package name */
    private ByteBuffer[] f151917e;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer[] f151918f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f151919g;

    /* renamed from: l  reason: collision with root package name */
    private MediaCodec.BufferInfo f151920l;
    private Surface o;
    private int r = 0;
    private String s;

    public static final native void _onEmptyBuffer(long j2, int i2);

    public static final native void _onError(long j2);

    public static final native void _onFilledBuffer(long j2, int i2, int i3, int i4, long j3, int i5);

    public static final native void _onFormatChanged(long j2, int i2, AJMediaFormat aJMediaFormat);

    public String getErrorInfo() {
        return this.s;
    }

    public int getOSVerion() {
        return e.f151888a;
    }

    private boolean supportSetSurface() {
        if (!f151911k) {
            return true;
        }
        return false;
    }

    public void flush() {
        try {
            this.f151913a.flush();
        } catch (Exception unused) {
        }
    }

    private void b() {
        int i2 = Build.VERSION.SDK_INT;
        this.o = new DummySurface.a().a();
    }

    public int getChannelCount() {
        MediaFormat mediaFormat = this.f151914b;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("channel-count");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public ByteBuffer[] getInputBuffers() {
        if (this.f151919g) {
            return this.f151918f;
        }
        return null;
    }

    public int getSampleRate() {
        MediaFormat mediaFormat = this.f151914b;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("sample-rate");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getSliceHeight() {
        MediaFormat mediaFormat = this.f151914b;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("slice-height");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getStride() {
        MediaFormat mediaFormat = this.f151914b;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("stride");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int stop() {
        if (this.f151919g) {
            try {
                this.f151919g = false;
                this.f151913a.stop();
            } catch (Exception unused) {
                return -1;
            }
        }
        return 0;
    }

    public void close() {
        if (this.f151913a != null) {
            stop();
            final MediaCodec mediaCodec = this.f151913a;
            this.f151918f = null;
            this.f151917e = null;
            this.f151913a = null;
            try {
                b.a(new Runnable() {
                    /* class com.ss.ttm.player.AJMediaCodec.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(101288);
                    }

                    public final void run() {
                        AJMediaCodec.this.a(mediaCodec);
                    }
                });
            } catch (Throwable unused) {
                a(mediaCodec);
            }
        }
    }

    public int getColorFormat() {
        MediaFormat mediaFormat = this.f151914b;
        if (mediaFormat != null) {
            try {
                int integer = mediaFormat.getInteger("color-format");
                if (integer == 21 || integer == 2130706688 || integer == 2141391872) {
                    return 3;
                }
                return 0;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getColorTransfer() {
        MediaFormat mediaFormat = this.f151914b;
        if (mediaFormat != null) {
            try {
                int integer = mediaFormat.getInteger("color-transfer");
                if (integer == 6) {
                    return 16;
                }
                if (integer != 7) {
                    return 0;
                }
                return 18;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int vendorOppoHWEnable() {
        if (e.f151893f.equals("OPPO")) {
            try {
                return Integer.parseInt(a("persist.sys.aweme.hdsupport", "1"));
            } catch (NumberFormatException unused) {
            }
        }
        return 1;
    }

    static {
        Covode.recordClassIndex(101286);
    }

    public int start() {
        try {
            this.f151913a.start();
            if (this.r == 0) {
                this.f151918f = this.f151913a.getInputBuffers();
                if (e.f151888a >= 21) {
                    this.f151917e = this.f151913a.getOutputBuffers();
                }
            } else {
                this.f151918f = null;
                this.f151917e = null;
            }
            this.f151919g = true;
            this.f151920l = new MediaCodec.BufferInfo();
            return 0;
        } catch (Exception e2) {
            b(e2);
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r1.startsWith("mt6750") == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AJMediaCodec() {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodec.<init>():void");
    }

    public int getFormatHeight() {
        MediaFormat mediaFormat = this.f151914b;
        if (mediaFormat != null) {
            try {
                if (!mediaFormat.containsKey("crop-right") || !this.f151914b.containsKey("crop-left") || !this.f151914b.containsKey("crop-bottom") || !this.f151914b.containsKey("crop-top")) {
                    return this.f151914b.getInteger("height");
                }
                return (this.f151914b.getInteger("crop-bottom") - this.f151914b.getInteger("crop-top")) + 1;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getFormatWidth() {
        MediaFormat mediaFormat = this.f151914b;
        if (mediaFormat != null) {
            try {
                if (!mediaFormat.containsKey("crop-right") || !this.f151914b.containsKey("crop-left") || !this.f151914b.containsKey("crop-bottom") || !this.f151914b.containsKey("crop-top")) {
                    return this.f151914b.getInteger("width");
                }
                return (this.f151914b.getInteger("crop-right") - this.f151914b.getInteger("crop-left")) + 1;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r3.equals("mido") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        if (r2.equals("AFTA") != false) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070 A[Catch:{ all -> 0x0083 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c() {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodec.c():boolean");
    }

    private static boolean a() {
        String a2 = a("ro.board.platform", (String) null);
        if (e.f151888a != 26 || a2 == null) {
            return false;
        }
        if (!a2.startsWith("kirin960") && !a2.startsWith("hi3660")) {
            return false;
        }
        double d2 = 0.0d;
        try {
            d2 = Double.parseDouble(a("ro.config.hw_codec_support", "0.0"));
        } catch (NumberFormatException unused) {
        }
        if (d2 < 0.18041d) {
            return true;
        }
        return false;
    }

    public void setEnableVC1BlockList(int i2) {
        q = i2;
    }

    public void setHandler(long j2) {
        this.f151916d = j2;
    }

    public void setMode(int i2) {
        this.r = i2;
    }

    private static int b(int i2) {
        return ((i2 + 16) - 1) / 16;
    }

    public int createByCodecName(String str) {
        try {
            this.f151913a = MediaCodec.createByCodecName(str);
            return 0;
        } catch (Exception e2) {
            b(e2);
            return -1;
        }
    }

    public int dequeueInputBuffer(long j2) {
        try {
            return this.f151913a.dequeueInputBuffer(j2);
        } catch (Exception e2) {
            return b(e2);
        }
    }

    public ByteBuffer getInputBuffer(int i2) {
        if (this.f151919g) {
            try {
                return this.f151913a.getInputBuffer(i2);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private int a(int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            this.f151913a.setCallback(new MediaCodec.Callback() {
                /* class com.ss.ttm.player.AJMediaCodec.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101287);
                }

                public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
                    MethodCollector.i(92);
                    AJMediaCodec._onError(AJMediaCodec.this.f151916d);
                    MethodCollector.o(92);
                }

                public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
                    MethodCollector.i(2598);
                    if (mediaCodec == AJMediaCodec.this.f151913a) {
                        AJMediaCodec._onEmptyBuffer(AJMediaCodec.this.f151916d, i2);
                    }
                    MethodCollector.o(2598);
                }

                /* JADX WARNING: Removed duplicated region for block: B:38:0x00b1  */
                /* JADX WARNING: Removed duplicated region for block: B:47:0x00de  */
                /* JADX WARNING: Removed duplicated region for block: B:50:0x00ee  */
                /* JADX WARNING: Removed duplicated region for block: B:63:0x0121  */
                /* JADX WARNING: Removed duplicated region for block: B:64:0x0123  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onOutputFormatChanged(android.media.MediaCodec r18, android.media.MediaFormat r19) {
                    /*
                    // Method dump skipped, instructions count: 345
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodec.AnonymousClass1.onOutputFormatChanged(android.media.MediaCodec, android.media.MediaFormat):void");
                }

                public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
                    MethodCollector.i(91);
                    if (mediaCodec == AJMediaCodec.this.f151913a) {
                        AJMediaCodec._onFilledBuffer(AJMediaCodec.this.f151916d, i2, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                    }
                    MethodCollector.o(91);
                }
            });
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    private int b(Exception exc) {
        this.s = exc.toString();
        if (e.f151888a >= 21) {
            return a(exc);
        }
        if (exc instanceof IllegalStateException) {
            return -10002;
        }
        return -10000;
    }

    public void decodeFRC(int i2) {
        if (this.f151913a != null && this.f151919g && e.f151888a >= 23) {
            Bundle bundle = new Bundle();
            bundle.putInt("vivo.video-dec.dynamic-frc", i2);
            try {
                this.f151913a.setParameters(bundle);
            } catch (Exception unused) {
            }
        }
    }

    public int setOutputSurface(Surface surface) {
        if (f151911k || !this.f151919g) {
            return -1;
        }
        if (surface == null) {
            if (this.o == null) {
                b();
            }
            surface = this.o;
        }
        return a(this.f151913a, surface);
    }

    public void speedEnhance(float f2) {
        if (this.f151913a != null && this.f151919g && e.f151888a >= 23 && f2 > 30.0f) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", f2);
            try {
                this.f151913a.setParameters(bundle);
            } catch (Exception unused) {
            }
        }
    }

    public int write(AJMediaCodecFrame aJMediaCodecFrame) {
        if (!(aJMediaCodecFrame == null || aJMediaCodecFrame.data == null)) {
            try {
                int dequeueInputBuffer = this.f151913a.dequeueInputBuffer(30000);
                if (dequeueInputBuffer >= 0) {
                    this.f151918f[dequeueInputBuffer].put(aJMediaCodecFrame.data);
                    this.f151913a.queueInputBuffer(dequeueInputBuffer, 0, aJMediaCodecFrame.size, aJMediaCodecFrame.pts, 0);
                    return 0;
                } else if (dequeueInputBuffer == -1) {
                    return 4;
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    private static int a(Exception exc) {
        if (exc instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) exc;
            if (e.f151888a >= 23) {
                codecException.isRecoverable();
                codecException.getErrorCode();
                if (!(codecException.isRecoverable() || codecException.getErrorCode() == 1100 || codecException.getErrorCode() == 1101)) {
                    return -10001;
                }
            } else {
                codecException.isRecoverable();
                if (!codecException.isRecoverable()) {
                    return -10001;
                }
            }
        }
        if (exc instanceof IllegalStateException) {
            return -10002;
        }
        return -10000;
    }

    public String getBestCodecName(String str) {
        int i2;
        MediaCodecInfo mediaCodecInfo;
        String[] supportedTypes;
        boolean z;
        a a2;
        MethodCollector.i(184);
        if (e.f151888a < 16) {
            MethodCollector.o(184);
            return null;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(184);
            return null;
        } else if (!str.equals("video/hevc") || !n || q <= 0) {
            ArrayList arrayList = new ArrayList();
            synchronized (f151909i) {
                try {
                    boolean z2 = !f151908h.isEmpty();
                    if (z2) {
                        try {
                            i2 = f151908h.size();
                        } catch (Exception unused) {
                            MethodCollector.o(184);
                            return null;
                        }
                    } else {
                        i2 = MediaCodecList.getCodecCount();
                    }
                    for (int i3 = 0; i3 < i2 && (!z2 || arrayList.isEmpty()); i3++) {
                        if (z2) {
                            mediaCodecInfo = f151908h.get(i3);
                        } else {
                            mediaCodecInfo = MediaCodecList.getCodecInfoAt(i3);
                        }
                        String name = mediaCodecInfo.getName();
                        if (!mediaCodecInfo.isEncoder() && !name.startsWith("OMX.google") && !name.startsWith("c2.android") && (supportedTypes = mediaCodecInfo.getSupportedTypes()) != null) {
                            for (String str2 : supportedTypes) {
                                if (!TextUtils.isEmpty(str2)) {
                                    if (!z2 && str2.startsWith("video/")) {
                                        f151908h.add(mediaCodecInfo);
                                    }
                                    if (str2.equalsIgnoreCase(str) && ((name.startsWith("OMX.") || name.startsWith("c2.")) && !name.startsWith("OMX.pv") && !name.startsWith("OMX.ittiam") && !name.contains("ffmpeg") && !name.contains("avcodec") && !name.contains("secure") && (!name.startsWith("OMX.MTK.") || e.f151888a >= 18))) {
                                        if (e.f151888a < 18 || ((e.f151888a == 18 && ("OMX.SEC.avc.dec".equals(name) || "OMX.SEC.avc.dec.secure".equals(name))) || (e.f151888a == 19 && e.f151891d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(name) || "OMX.Exynos.avc.dec.secure".equals(name))))) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (!z && (a2 = a.a(mediaCodecInfo, str)) != null) {
                                            a2.f152027a.getName();
                                            if ((a2.f152028b != 40 || e.f151888a >= 21) && a2.f152028b != 20) {
                                                arrayList.add(a2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    a aVar = (a) arrayList.get(0);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a aVar2 = (a) it.next();
                        if (aVar2.f152028b > aVar.f152028b) {
                            aVar = aVar2;
                        }
                    }
                    String name2 = aVar.f152027a.getName();
                    MethodCollector.o(184);
                    return name2;
                } finally {
                    MethodCollector.o(184);
                }
            }
        } else {
            MethodCollector.o(184);
            return null;
        }
    }

    public final void a(MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                mediaCodec.release();
                Surface surface = this.o;
                if (surface != null) {
                    surface.release();
                    this.o = null;
                }
            } catch (Exception unused) {
                if (this.o != null) {
                    this.o.release();
                    this.o = null;
                }
            } catch (Throwable th) {
                if (this.o != null) {
                    this.o.release();
                    this.o = null;
                }
                throw th;
            }
        }
    }

    private int a(int i2, long j2) {
        try {
            this.f151913a.releaseOutputBuffer(i2, j2);
            return 0;
        } catch (Exception unused) {
            return -10000;
        }
    }

    private int a(MediaCodec mediaCodec, Surface surface) {
        try {
            mediaCodec.setOutputSurface(surface);
            return 0;
        } catch (Exception e2) {
            b(e2);
            return -1;
        }
    }

    public int read(AJMediaCodecFrame aJMediaCodecFrame, long j2) {
        while (true) {
            try {
                int dequeueOutputBuffer = this.f151913a.dequeueOutputBuffer(this.f151920l, j2);
                if (dequeueOutputBuffer >= 0) {
                    aJMediaCodecFrame.data = this.f151917e[dequeueOutputBuffer];
                    aJMediaCodecFrame.pts = this.f151920l.presentationTimeUs;
                    aJMediaCodecFrame.index = dequeueOutputBuffer;
                    aJMediaCodecFrame.size = this.f151920l.size;
                    aJMediaCodecFrame.flags = this.f151920l.flags;
                    return 0;
                } else if (dequeueOutputBuffer == -3) {
                    try {
                        this.f151917e = this.f151913a.getOutputBuffers();
                    } catch (Exception e2) {
                        return b(e2);
                    }
                } else if (dequeueOutputBuffer != -2) {
                    return -1;
                } else {
                    try {
                        this.f151914b = this.f151913a.getOutputFormat();
                        if (this.f151917e == null) {
                            try {
                                this.f151917e = this.f151913a.getOutputBuffers();
                            } catch (Exception e3) {
                                return b(e3);
                            }
                        }
                        return dequeueOutputBuffer;
                    } catch (Exception e4) {
                        return b(e4);
                    }
                }
            } catch (Exception e5) {
                return b(e5);
            }
        }
    }

    private static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable unused) {
        }
        return str2;
    }

    private static void a(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public int releaseBuffer(int i2, boolean z, long j2) {
        if (e.f151888a >= 21 && z) {
            return a(i2, j2);
        }
        try {
            this.f151913a.releaseOutputBuffer(i2, z);
            return 0;
        } catch (Exception e2) {
            return b(e2);
        }
    }

    private static void a(MediaFormat mediaFormat, ByteBuffer byteBuffer, int i2) {
        if (byteBuffer != null) {
            mediaFormat.setByteBuffer("csd-".concat(String.valueOf(i2)), byteBuffer);
        }
    }

    public int queueInputBuffer(int i2, int i3, int i4, long j2, int i5) {
        try {
            this.f151913a.queueInputBuffer(i2, i3, i4, j2, i5);
            return 0;
        } catch (Exception e2) {
            return b(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int configure(int r15, int r16, int r17, int r18, int r19, java.lang.String r20, java.nio.ByteBuffer r21, java.nio.ByteBuffer r22, java.nio.ByteBuffer r23, android.view.Surface r24, boolean r25, boolean r26, int r27, int r28, boolean r29, int r30, boolean r31, boolean r32, int r33, int r34) {
        /*
        // Method dump skipped, instructions count: 502
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodec.configure(int, int, int, int, int, java.lang.String, java.nio.ByteBuffer, java.nio.ByteBuffer, java.nio.ByteBuffer, android.view.Surface, boolean, boolean, int, int, boolean, int, boolean, boolean, int, int):int");
    }
}

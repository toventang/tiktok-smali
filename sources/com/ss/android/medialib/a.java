package com.ss.android.medialib;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.b.d;
import com.ss.android.ttve.monitor.g;
import com.ss.android.vesdk.an;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static b f59653a;

    /* renamed from: b  reason: collision with root package name */
    static int f59654b = 5000;

    /* renamed from: c  reason: collision with root package name */
    static int f59655c;

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f59656m = {"BITRATE_MODE_CQ", "BITRATE_MODE_VBR", "BITRATE_MODE_CBR"};

    /* renamed from: d  reason: collision with root package name */
    MediaCodec.BufferInfo f59657d;

    /* renamed from: e  reason: collision with root package name */
    ByteBuffer[] f59658e;

    /* renamed from: f  reason: collision with root package name */
    ByteBuffer[] f59659f;

    /* renamed from: g  reason: collision with root package name */
    int f59660g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f59661h = 30;

    /* renamed from: i  reason: collision with root package name */
    public int f59662i = 1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f59663j = false;

    /* renamed from: k  reason: collision with root package name */
    public int f59664k = -1;

    /* renamed from: l  reason: collision with root package name */
    BufferedOutputStream f59665l = null;
    private MediaCodec n;
    private String o = "video/avc";
    private MediaCodecInfo p;
    private Surface q;
    private d r;
    private int s;
    private int t;
    private boolean u;
    private Queue<Pair<Integer, Integer>> v = new LinkedList();
    private int w;
    private EnumC1299a x = EnumC1299a.H264;
    private int y = 0;
    private int z = 0;

    public static int a() {
        try {
            return MediaCodecList.getCodecCount();
        } catch (Exception e2) {
            an.d("AVCEncoder", Log.getStackTraceString(e2));
            return 0;
        }
    }

    /* renamed from: com.ss.android.medialib.a$a  reason: collision with other inner class name */
    public enum EnumC1299a {
        H264,
        ByteVC1,
        MPEG4;

        static {
            Covode.recordClassIndex(36855);
        }
    }

    static {
        Covode.recordClassIndex(36853);
        new Thread(new Runnable() {
            /* class com.ss.android.medialib.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36854);
            }

            public final void run() {
                MethodCollector.i(3346);
                synchronized (a.class) {
                    try {
                        a.a();
                    } finally {
                        MethodCollector.o(3346);
                    }
                }
            }
        }).start();
    }

    public final synchronized void d() {
        MethodCollector.i(5942);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.n.release();
        } catch (Exception unused) {
        }
        this.n = null;
        this.f59660g = 0;
        an.a("AVCEncoder", "time cost: " + (System.currentTimeMillis() - currentTimeMillis));
        MethodCollector.o(5942);
    }

    private MediaCodecInfo e() {
        String[] supportedTypes;
        int a2 = a();
        for (int i2 = 0; i2 < a2; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    for (String str : codecInfoAt.getSupportedTypes()) {
                        if (str.equalsIgnoreCase(this.o)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public final void c() {
        MediaCodec mediaCodec;
        MethodCollector.i(5936);
        an.a("AVCEncoder", "uninitAVCEncoder == enter");
        synchronized (this) {
            try {
                int i2 = this.f59660g;
                if (i2 != 0 && (mediaCodec = this.n) != null) {
                    if (i2 == 2) {
                        try {
                            mediaCodec.stop();
                        } catch (Exception unused) {
                            an.d("AVCEncoder", "MediaCodec Exception");
                        }
                    }
                    this.f59660g = 3;
                    Surface surface = this.q;
                    if (surface != null) {
                        surface.release();
                    }
                    d();
                    an.a("AVCEncoder", "uninitAVCEncoder == exit");
                    MethodCollector.o(5936);
                }
            } finally {
                MethodCollector.o(5936);
            }
        }
    }

    private int f() {
        MediaCodecInfo e2;
        String[] supportedTypes;
        an.a("AVCEncoder", "start == ");
        int[] iArr = null;
        if (Build.VERSION.SDK_INT >= 21) {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            if (codecInfos != null && codecInfos.length != 0) {
                int length = codecInfos.length;
                int i2 = 0;
                loop1:
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    e2 = codecInfos[i2];
                    if (e2 != null && e2.isEncoder()) {
                        String name = e2.getName();
                        if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                            for (String str : e2.getSupportedTypes()) {
                                if (str.equalsIgnoreCase(this.o)) {
                                    break loop1;
                                }
                            }
                            continue;
                        }
                    }
                    i2++;
                }
            }
            e2 = null;
        } else {
            e2 = e();
        }
        this.p = e2;
        an.a("AVCEncoder", "end == ");
        if (this.p == null) {
            an.d("AVCEncoder", "mMediaCodecInfo failed");
        } else {
            an.a("AVCEncoder", "mMediaCodecInfo name = " + this.p.getName());
            MediaCodecInfo.CodecCapabilities capabilitiesForType = this.p.getCapabilitiesForType(this.o);
            int length2 = capabilitiesForType.colorFormats.length;
            iArr = new int[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                iArr[i3] = capabilitiesForType.colorFormats[i3];
            }
        }
        if (iArr == null) {
            return -1;
        }
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (iArr[i4] == 2130708361) {
                an.a("AVCEncoder", "====== mColorFormat support COLOR_FormatSurface ======");
                return iArr[i4];
            }
        }
        return -1;
    }

    public final synchronized int b() {
        MethodCollector.i(5637);
        if (this.f59660g != 0) {
            an.d("AVCEncoder", "createEncoder is wrong status: " + this.f59660g);
            MethodCollector.o(5637);
            return -302;
        }
        int f2 = f();
        this.w = f2;
        if (f2 < 0) {
            an.d("AVCEncoder", "get color format failed");
            MethodCollector.o(5637);
            return -100;
        }
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(this.o);
            this.n = createEncoderByType;
            MediaCodecInfo codecInfo = createEncoderByType.getCodecInfo();
            if (codecInfo.getName().startsWith("OMX.google.")) {
                an.d("AVCEncoder", "find OMX.google encode...");
                MethodCollector.o(5637);
                return -608;
            }
            for (String str : codecInfo.getSupportedTypes()) {
                an.a("AVCEncoder", "CodecNames: ".concat(String.valueOf(str)));
            }
            this.f59660g = 1;
            MethodCollector.o(5637);
            return 0;
        } catch (IOException e2) {
            e2.printStackTrace();
            an.d("AVCEncoder", "createEncoderByTyp: " + e2.getMessage());
            g.a(e2);
            MethodCollector.o(5637);
            return -607;
        }
    }

    public final void a(int i2) {
        this.x = EnumC1299a.values()[i2];
        EnumC1299a aVar = EnumC1299a.MPEG4;
        EnumC1299a aVar2 = this.x;
        if (aVar == aVar2) {
            this.o = "video/mp4v-es";
        } else if (aVar2 == EnumC1299a.ByteVC1) {
            this.o = "video/hevc";
        } else {
            this.o = "video/avc";
        }
        an.a("AVCEncoder", "setCodecType on AVCEncoder " + this.x);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00be, code lost:
        if (r5.profile < 2) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ce, code lost:
        if (r5.profile < 8) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af A[LOOP:2: B:18:0x0081->B:25:0x00af, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0043 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.media.MediaCodecInfo.CodecProfileLevel b(int r12) {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.a.b(int):android.media.MediaCodecInfo$CodecProfileLevel");
    }

    public final int a(byte[] bArr, int i2, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        MethodCollector.i(6090);
        synchronized (this) {
            try {
                if (this.f59660g == 2) {
                    if (this.n != null) {
                        an.b("AVCEncoder", "encodeBuffer pts: " + i2 + "  isEndStream = " + z2);
                        if (Build.VERSION.SDK_INT >= 21) {
                            int dequeueInputBuffer = this.n.dequeueInputBuffer(-1);
                            if (dequeueInputBuffer >= 0) {
                                ByteBuffer inputBuffer = this.n.getInputBuffer(dequeueInputBuffer);
                                inputBuffer.clear();
                                inputBuffer.put(bArr, 0, bArr.length);
                                MediaCodec mediaCodec = this.n;
                                int length = bArr.length;
                                long j2 = (long) i2;
                                if (z2) {
                                    i6 = 4;
                                } else {
                                    i6 = 0;
                                }
                                mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, length, j2, i6);
                            }
                            int dequeueOutputBuffer = this.n.dequeueOutputBuffer(this.f59657d, (long) f59654b);
                            an.b("AVCEncoder", "outputBufferIndex = ".concat(String.valueOf(dequeueOutputBuffer)));
                            an.b("AVCEncoder", "mBufferInfo.flags = " + this.f59657d.flags);
                            while (dequeueOutputBuffer >= 0) {
                                ByteBuffer outputBuffer = this.n.getOutputBuffer(dequeueOutputBuffer);
                                outputBuffer.position(this.f59657d.offset);
                                outputBuffer.limit(this.f59657d.offset + this.f59657d.size);
                                if ((this.f59657d.flags & 2) != 0) {
                                    an.b("AVCEncoder", "mEncoderCaller.onSetCodecConfig");
                                    b bVar = f59653a;
                                    if (bVar != null) {
                                        bVar.onSetCodecConfig(outputBuffer);
                                    }
                                    this.f59657d.size = 0;
                                } else {
                                    int i7 = (int) this.f59657d.presentationTimeUs;
                                    if ((this.f59657d.flags & 1) != 0) {
                                        i5 = 1;
                                    } else {
                                        i5 = 0;
                                    }
                                    an.b("AVCEncoder", "mEncoderCaller.onWriteFile");
                                    b bVar2 = f59653a;
                                    if (bVar2 != null) {
                                        bVar2.onWriteFile(outputBuffer, i7, 0, i5);
                                    }
                                }
                                this.n.releaseOutputBuffer(dequeueOutputBuffer, false);
                                dequeueOutputBuffer = this.n.dequeueOutputBuffer(this.f59657d, 0);
                            }
                        } else {
                            int dequeueInputBuffer2 = this.n.dequeueInputBuffer(-1);
                            if (dequeueInputBuffer2 >= 0) {
                                ByteBuffer byteBuffer = this.f59658e[dequeueInputBuffer2];
                                byteBuffer.clear();
                                byteBuffer.put(bArr, 0, bArr.length);
                                MediaCodec mediaCodec2 = this.n;
                                int length2 = bArr.length;
                                long j3 = (long) i2;
                                if (z2) {
                                    i4 = 4;
                                } else {
                                    i4 = 0;
                                }
                                mediaCodec2.queueInputBuffer(dequeueInputBuffer2, 0, length2, j3, i4);
                            }
                            int dequeueOutputBuffer2 = this.n.dequeueOutputBuffer(this.f59657d, (long) f59654b);
                            while (dequeueOutputBuffer2 >= 0) {
                                ByteBuffer byteBuffer2 = this.f59659f[dequeueOutputBuffer2];
                                byteBuffer2.position(this.f59657d.offset);
                                byteBuffer2.limit(this.f59657d.offset + this.f59657d.size);
                                if ((this.f59657d.flags & 2) != 0) {
                                    an.b("AVCEncoder", "mEncoderCaller.onSetCodecConfig");
                                    b bVar3 = f59653a;
                                    if (bVar3 != null) {
                                        bVar3.onSetCodecConfig(byteBuffer2);
                                    }
                                    this.f59657d.size = 0;
                                } else {
                                    int i8 = (int) this.f59657d.presentationTimeUs;
                                    if ((this.f59657d.flags & 1) != 0) {
                                        i3 = 1;
                                    } else {
                                        i3 = 0;
                                    }
                                    an.b("AVCEncoder", "mEncoderCaller.onWriteFile");
                                    b bVar4 = f59653a;
                                    if (bVar4 != null) {
                                        bVar4.onWriteFile(byteBuffer2, i8, 0, i3);
                                    }
                                }
                                this.n.releaseOutputBuffer(dequeueOutputBuffer2, false);
                                dequeueOutputBuffer2 = this.n.dequeueOutputBuffer(this.f59657d, 0);
                            }
                        }
                        MethodCollector.o(6090);
                        return 0;
                    }
                }
                return -1;
            } finally {
                MethodCollector.o(6090);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0250, code lost:
        if (r23 != false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0252, code lost:
        r0 = r19.r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0254, code lost:
        if (r0 == null) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0256, code lost:
        r0.b();
        r19.r = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r20, int r21, int r22, boolean r23) {
        /*
        // Method dump skipped, instructions count: 695
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.a.a(int, int, int, boolean):int");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0171 A[Catch:{ Exception -> 0x033b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.Surface a(int r17, int r18, int r19, int r20, int r21, int r22, boolean r23) {
        /*
        // Method dump skipped, instructions count: 877
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.a.a(int, int, int, int, int, int, boolean):android.view.Surface");
    }
}

package com.ss.android.ttve.nativePort;

import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.common.TEImageUtils;
import com.ss.android.ttve.common.a;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.model.e;
import com.ss.android.vesdk.ad;
import com.ss.android.vesdk.an;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HwFrameExtractorWrapper {
    private static final String TAG = HwFrameExtractorWrapper.class.getSimpleName();
    private b mExtractor;
    private c mExtractorRange;
    private long mNativeAddr;

    public native boolean nativeOnFrameAvailable(long j2, ByteBuffer byteBuffer, int i2, int i3, int i4);

    static {
        Covode.recordClassIndex(37693);
    }

    public void stop() {
        MethodCollector.i(12973);
        b bVar = this.mExtractor;
        if (bVar != null) {
            bVar.A = true;
            if (bVar.v != null) {
                try {
                    new Handler(bVar.v.getLooper()).post(new Runnable() {
                        /* class com.ss.android.ttve.nativePort.b.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(37760);
                        }

                        public final void run() {
                            MethodCollector.i(11938);
                            synchronized (b.this.s) {
                                try {
                                    b.this.a();
                                    b.this.s.notify();
                                } finally {
                                    MethodCollector.o(11938);
                                }
                            }
                        }
                    });
                    synchronized (bVar.s) {
                        try {
                            if (!bVar.z) {
                                bVar.s.wait();
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(12973);
                            throw th;
                        }
                    }
                    bVar.v.quitSafely();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            this.mExtractor = null;
        }
        c cVar = this.mExtractorRange;
        if (cVar != null) {
            if (cVar.f61340l != null) {
                try {
                    new Handler(cVar.f61340l.getLooper()).post(new Runnable() {
                        /* class com.ss.android.ttve.nativePort.c.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(37762);
                        }

                        public final void run() {
                            MethodCollector.i(9177);
                            synchronized (c.this.f61339k) {
                                try {
                                    c cVar = c.this;
                                    try {
                                        an.a(cVar.f61329a, "stop begin");
                                        if (!cVar.p) {
                                            cVar.p = true;
                                            if (cVar.n != null) {
                                                cVar.f61338j.reset();
                                                cVar.f61338j.release();
                                            }
                                            if (cVar.n != null) {
                                                cVar.n.close();
                                            }
                                            if (cVar.f61341m != null) {
                                                cVar.f61341m.quitSafely();
                                            }
                                            an.a(cVar.f61329a, "stop end");
                                        }
                                    } catch (Exception e2) {
                                        an.a(cVar.f61329a, "stop crash");
                                        Log.getStackTraceString(e2);
                                        cVar.a();
                                    }
                                    c.this.f61339k.notify();
                                } finally {
                                    MethodCollector.o(9177);
                                }
                            }
                        }
                    });
                    synchronized (cVar.f61339k) {
                        try {
                            if (!cVar.p) {
                                cVar.f61339k.wait();
                            }
                        } catch (Throwable th2) {
                            MethodCollector.o(12973);
                            throw th2;
                        }
                    }
                    cVar.f61340l.quitSafely();
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
            }
            this.mExtractorRange = null;
        }
        MethodCollector.o(12973);
    }

    public HwFrameExtractorWrapper(long j2) {
        this.mNativeAddr = j2;
    }

    public static HwFrameExtractorWrapper create(long j2) {
        return new HwFrameExtractorWrapper(j2);
    }

    public void startExtractFrameForRangeTime(String str, int i2, int i3, int i4, int i5, int i6) {
        final long j2 = this.mNativeAddr;
        this.mExtractorRange = new c(str, i2, i3, i4, i5, i6, new ad() {
            /* class com.ss.android.ttve.nativePort.HwFrameExtractorWrapper.AnonymousClass2 */

            static {
                Covode.recordClassIndex(37695);
            }

            @Override // com.ss.android.vesdk.ad
            public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                MethodCollector.i(8056);
                boolean nativeOnFrameAvailable = HwFrameExtractorWrapper.this.nativeOnFrameAvailable(j2, byteBuffer, i2, i3, i4);
                MethodCollector.o(8056);
                return nativeOnFrameAvailable;
            }
        });
    }

    public void startExtractFrame(String str, int[] iArr, int i2, int i3, int i4, int i5) {
        OutOfMemoryError e2;
        Exception e3;
        int i6;
        boolean z;
        final long j2 = this.mNativeAddr;
        b bVar = new b(str, iArr, i2, i3, i4, i5, new ad() {
            /* class com.ss.android.ttve.nativePort.HwFrameExtractorWrapper.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37694);
            }

            @Override // com.ss.android.vesdk.ad
            public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                MethodCollector.i(9174);
                boolean nativeOnFrameAvailable = HwFrameExtractorWrapper.this.nativeOnFrameAvailable(j2, byteBuffer, i2, i3, i4);
                MethodCollector.o(9174);
                return nativeOnFrameAvailable;
            }
        });
        this.mExtractor = bVar;
        try {
            an.a(bVar.f61303b, "method start begin");
            if (bVar.f61305f.length <= 0) {
                try {
                    an.a(bVar.f61303b, "ptsMs.length is wrong: " + bVar.f61305f.length);
                } catch (OutOfMemoryError e4) {
                    e2 = e4;
                    an.a(bVar.f61303b, "start crash oom");
                    Log.getStackTraceString(e2);
                    Runtime.getRuntime().gc();
                    bVar.b();
                    bVar.a();
                } catch (Exception e5) {
                    e3 = e5;
                    an.a(bVar.f61303b, "start crash");
                    Log.getStackTraceString(e3);
                    bVar.b();
                    bVar.a();
                }
            } else {
                bVar.A = false;
                if (b.f61300c == null || b.f61301d == null) {
                    String lowerCase = a.a().toLowerCase();
                    if (lowerCase.contains("qualcomm")) {
                        b.f61300c = "qualcomm";
                        if (lowerCase.contains("sdm660")) {
                            b.f61301d = "sdm660";
                        } else if (lowerCase.contains("msm8994")) {
                            b.f61301d = "msm8994";
                        } else if (lowerCase.contains("sdm845")) {
                            b.f61301d = "sdm845";
                        } else if (lowerCase.contains("sm8150")) {
                            b.f61301d = "sm8150";
                        } else {
                            b.f61301d = "";
                        }
                    }
                }
                bVar.q = System.currentTimeMillis();
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(bVar.f61304e);
                int i7 = bVar.f61306g;
                int i8 = bVar.f61307h;
                MediaFormat mediaFormat = null;
                for (int i9 = 0; i9 < mediaExtractor.getTrackCount(); i9++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i9);
                    String string = trackFormat.getString("mime");
                    if (string.startsWith("video")) {
                        bVar.C = string.equals("video/avc");
                        bVar.D = string.equals("video/hevc");
                        bVar.t = trackFormat.getInteger("width");
                        bVar.u = trackFormat.getInteger("height");
                        if (trackFormat.containsKey("rotation-degrees")) {
                            bVar.r = trackFormat.getInteger("rotation-degrees");
                        }
                        if (bVar.r != 0) {
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((bVar.f61306g * bVar.f61307h) * 3) / 2);
                            allocateDirect.clear();
                            bVar.o = VEFrame.createByteBufferFrame(allocateDirect, bVar.f61306g, bVar.f61307h, 0, 0, VEFrame.a.TEPixFmt_YUV420P);
                            if (bVar.r == 90 || bVar.r == 270) {
                                i7 = bVar.f61307h;
                                i8 = bVar.f61306g;
                            }
                        }
                        mediaExtractor.selectTrack(i9);
                        mediaFormat = trackFormat;
                    }
                }
                if (bVar.f61312m == null) {
                    ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(((i7 * i8) * 3) / 2);
                    allocateDirect2.clear();
                    i6 = 2;
                    bVar.f61312m = VEFrame.createByteBufferFrame(allocateDirect2, i7, i8, bVar.r, 0, VEFrame.a.TEPixFmt_YUV420P);
                } else {
                    i6 = 2;
                }
                bVar.p = MediaCodec.createDecoderByType("video/avc");
                ArrayList arrayList = new ArrayList();
                mediaExtractor.seekTo((long) bVar.f61305f[0], i6);
                ArrayList arrayList2 = new ArrayList();
                int i10 = bVar.f61309j;
                while (true) {
                    long sampleTime = mediaExtractor.getSampleTime();
                    if (sampleTime < 0 && mediaExtractor.advance()) {
                        bVar.B = true;
                        break;
                    }
                    arrayList2.add(Long.valueOf(sampleTime));
                    if (mediaExtractor.getSampleFlags() == 1) {
                        z = true;
                        arrayList.add(Long.valueOf(sampleTime));
                    } else {
                        z = false;
                    }
                    if (sampleTime > ((long) bVar.f61305f[bVar.f61305f.length - 1]) && z) {
                        i10--;
                    }
                    try {
                        if (mediaExtractor.advance()) {
                            if (i10 <= 0) {
                                break;
                            }
                        }
                    } catch (OutOfMemoryError e6) {
                        e2 = e6;
                        an.a(bVar.f61303b, "start crash oom");
                        Log.getStackTraceString(e2);
                        Runtime.getRuntime().gc();
                        bVar.b();
                        bVar.a();
                    } catch (Exception e7) {
                        e3 = e7;
                        an.a(bVar.f61303b, "start crash");
                        Log.getStackTraceString(e3);
                        bVar.b();
                        bVar.a();
                    }
                }
                try {
                    if (bVar.B) {
                        an.a(bVar.f61303b, "start wrong");
                        bVar.b();
                        return;
                    }
                    Collections.sort(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    int length = bVar.f61305f.length;
                    List[] listArr = new List[length];
                    int size = arrayList2.size();
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < size && i12 < bVar.f61305f.length) {
                        if (((Long) arrayList2.get(i11)).longValue() < ((long) bVar.f61305f[i12])) {
                            i11++;
                        } else {
                            if (listArr[i12] == null) {
                                listArr[i12] = new ArrayList();
                            }
                            for (int i13 = 0; i13 < bVar.f61309j; i13++) {
                                int i14 = i11 + i13;
                                if (i14 < size) {
                                    Long l2 = (Long) arrayList2.get(i14);
                                    listArr[i12].add(l2);
                                    arrayList3.add(l2);
                                }
                            }
                            i11++;
                            i12++;
                        }
                    }
                    if (listArr[bVar.f61305f.length - 1] != null && listArr[bVar.f61305f.length - 1].size() == 1) {
                        listArr[bVar.f61305f.length - 1].add(listArr[bVar.f61305f.length - 1].get(0));
                        listArr[bVar.f61305f.length - 1].set(0, arrayList2.get(arrayList2.size() - 2));
                        arrayList3.add(arrayList3.get(arrayList3.size() - 1));
                    }
                    for (int i15 = 0; i15 < length; i15++) {
                        List list = listArr[i15];
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            an.a(bVar.f61303b, "sensArray i: " + i16 + " value: " + list.get(i16).toString());
                        }
                    }
                    mediaExtractor.seekTo((long) bVar.f61305f[0], 0);
                    bVar.v = new HandlerThread("MediaCodec Callback");
                    an.a(bVar.f61303b, "getVideoFramesHW: mCodecHandlerThread = " + bVar.v.getThreadId() + ", curr-threadId = " + bVar.f61302a);
                    bVar.v.start();
                    bVar.p.setCallback(new MediaCodec.Callback(mediaExtractor, arrayList3, listArr, arrayList) {
                        /* class com.ss.android.ttve.nativePort.b.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        int f61313a;

                        /* renamed from: b  reason: collision with root package name */
                        int f61314b;

                        /* renamed from: c  reason: collision with root package name */
                        List<Long> f61315c = new ArrayList();

                        /* renamed from: d  reason: collision with root package name */
                        List<Long> f61316d = new ArrayList();

                        /* renamed from: e  reason: collision with root package name */
                        long f61317e = 0;

                        /* renamed from: f  reason: collision with root package name */
                        final /* synthetic */ MediaExtractor f61318f;

                        /* renamed from: g  reason: collision with root package name */
                        final /* synthetic */ List f61319g;

                        /* renamed from: h  reason: collision with root package name */
                        final /* synthetic */ List[] f61320h;

                        /* renamed from: i  reason: collision with root package name */
                        final /* synthetic */ List f61321i;

                        static {
                            Covode.recordClassIndex(37757);
                        }

                        public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
                        }

                        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
                        }

                        public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
                            long j2;
                            try {
                                if (this.f61313a >= b.this.f61305f.length) {
                                    b.this.p.queueInputBuffer(i2, 0, 0, 0, 4);
                                    an.a(b.this.f61303b, "onInputBufferAvailable end");
                                    return;
                                }
                                ByteBuffer inputBuffer = b.this.p.getInputBuffer(i2);
                                int readSampleData = this.f61318f.readSampleData(inputBuffer, 0);
                                long sampleTime = this.f61318f.getSampleTime();
                                int sampleFlags = this.f61318f.getSampleFlags();
                                if (b.this.C || b.this.D) {
                                    System.currentTimeMillis();
                                    while (true) {
                                        if (b.this.A || sampleTime < 0 || sampleFlags == 1 || !TEVideoUtils.isFrameCanDrop(inputBuffer, inputBuffer.remaining(), b.this.D) || this.f61319g.contains(Long.valueOf(sampleTime))) {
                                            break;
                                        }
                                        System.currentTimeMillis();
                                        if (!this.f61318f.advance()) {
                                            an.d(b.this.f61303b, "onInputBufferAvailable end");
                                            break;
                                        }
                                        inputBuffer.clear();
                                        this.f61318f.readSampleData(inputBuffer, 0);
                                        sampleTime = this.f61318f.getSampleTime();
                                        sampleFlags = this.f61318f.getSampleFlags();
                                    }
                                }
                                if (sampleFlags == 1) {
                                    this.f61317e = sampleTime;
                                }
                                this.f61315c.add(Long.valueOf(sampleTime));
                                if (readSampleData <= 0 || sampleTime < 0) {
                                    an.a(b.this.f61303b, "onInputBufferAvailable sampSize<0 or time<0 sampSize" + readSampleData + " time: " + sampleTime);
                                    b.this.b();
                                    b.this.a();
                                    return;
                                }
                                b.this.p.queueInputBuffer(i2, 0, readSampleData, sampleTime, 0);
                                if (!this.f61315c.containsAll(this.f61320h[this.f61313a])) {
                                    this.f61318f.advance();
                                    return;
                                }
                                this.f61315c.clear();
                                int i3 = this.f61313a + 1;
                                this.f61313a = i3;
                                if (i3 < b.this.f61305f.length) {
                                    int indexOf = this.f61321i.indexOf(Long.valueOf(this.f61317e));
                                    long longValue = ((Long) this.f61320h[this.f61313a].get(0)).longValue();
                                    if (indexOf == -1 || indexOf >= this.f61321i.size() - 1) {
                                        j2 = Long.MAX_VALUE;
                                    } else {
                                        j2 = ((Long) this.f61321i.get(indexOf + 1)).longValue();
                                    }
                                    if (longValue <= sampleTime || longValue >= j2) {
                                        this.f61318f.seekTo(longValue, 0);
                                    } else {
                                        this.f61318f.advance();
                                    }
                                } else {
                                    an.a(b.this.f61303b, "timer begin");
                                    new Handler().postDelayed(new Runnable() {
                                        /* class com.ss.android.ttve.nativePort.b.AnonymousClass1.AnonymousClass1 */

                                        static {
                                            Covode.recordClassIndex(37758);
                                        }

                                        public final void run() {
                                            b.this.b();
                                            b.this.a();
                                        }
                                    }, 1000);
                                }
                            } catch (Exception e2) {
                                an.a(b.this.f61303b, "onInputBufferAvailable crash");
                                Log.getStackTraceString(e2);
                                b.this.b();
                                b.this.a();
                            }
                        }

                        public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
                            int i3;
                            MethodCollector.i(12766);
                            try {
                                if (bufferInfo.flags == 4 || (i3 = this.f61314b) >= this.f61320h.length) {
                                    b.this.b();
                                    b.this.a();
                                    MethodCollector.o(12766);
                                    return;
                                }
                                if (i3 >= b.this.f61305f.length || !this.f61320h[this.f61314b].contains(Long.valueOf(bufferInfo.presentationTimeUs))) {
                                    mediaCodec.releaseOutputBuffer(i2, false);
                                } else {
                                    this.f61316d.add(Long.valueOf(bufferInfo.presentationTimeUs));
                                    synchronized (b.this) {
                                        try {
                                            if (Build.VERSION.SDK_INT >= 23) {
                                                mediaCodec.releaseOutputBuffer(i2, true);
                                            } else {
                                                mediaCodec.releaseOutputBuffer(i2, bufferInfo.presentationTimeUs * 1000);
                                            }
                                            long j2 = bufferInfo.presentationTimeUs;
                                            b.this.wait(0);
                                            long j3 = bufferInfo.presentationTimeUs;
                                        } catch (Throwable th) {
                                            MethodCollector.o(12766);
                                            throw th;
                                        }
                                    }
                                    if (this.f61316d.containsAll(this.f61320h[this.f61314b])) {
                                        this.f61314b++;
                                        this.f61316d.clear();
                                    }
                                    if (this.f61314b >= b.this.f61305f.length) {
                                        b.this.a();
                                        MethodCollector.o(12766);
                                        return;
                                    }
                                }
                                MethodCollector.o(12766);
                            } catch (Exception e2) {
                                Log.getStackTraceString(e2);
                                b.this.b();
                                b.this.a();
                                MethodCollector.o(12766);
                            }
                        }

                        {
                            this.f61318f = r4;
                            this.f61319g = r5;
                            this.f61320h = r6;
                            this.f61321i = r7;
                        }
                    }, new Handler(bVar.v.getLooper()));
                    bVar.w = new HandlerThread("ImageReader Callback");
                    an.a(bVar.f61303b, "getVideoFramesHW: mReaderHandlerThread = " + bVar.w.getThreadId() + ", curr-threadId = " + bVar.f61302a);
                    bVar.w.start();
                    Handler handler = new Handler(bVar.w.getLooper());
                    bVar.x = ImageReader.newInstance(bVar.t, bVar.u, 35, 2);
                    bVar.x.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener(listArr) {
                        /* class com.ss.android.ttve.nativePort.b.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        int f61324a;

                        /* renamed from: b  reason: collision with root package name */
                        List<Long> f61325b = new ArrayList();

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ List[] f61326c;

                        static {
                            Covode.recordClassIndex(37759);
                        }

                        public final void onImageAvailable(ImageReader imageReader) {
                            VEFrame createYUVPlanFrame;
                            VEFrame vEFrame;
                            MethodCollector.i(12637);
                            try {
                                synchronized (b.this) {
                                    try {
                                        Image acquireNextImage = imageReader.acquireNextImage();
                                        long timestamp = acquireNextImage.getTimestamp() / 1000;
                                        if (this.f61326c[this.f61324a].contains(Long.valueOf(timestamp))) {
                                            if (b.this.f61310k != null) {
                                                if (acquireNextImage.getFormat() == 35) {
                                                    if (acquireNextImage.getPlanes() == null || acquireNextImage.getPlanes()[1].getPixelStride() <= 1) {
                                                        createYUVPlanFrame = VEFrame.createYUVPlanFrame(new e(acquireNextImage.getPlanes()), b.this.t, b.this.u, b.this.r, 0, VEFrame.a.TEPixFmt_YUV420P);
                                                    } else {
                                                        VEFrame createYUVPlanFrame2 = VEFrame.createYUVPlanFrame(new e(acquireNextImage.getPlanes()), b.this.t, b.this.u, b.this.r, 0, VEFrame.a.TEPixFmt_NV12);
                                                        if (b.this.n == null) {
                                                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((b.this.t * b.this.u) * 3) / 2);
                                                            allocateDirect.clear();
                                                            b bVar = b.this;
                                                            bVar.n = VEFrame.createByteBufferFrame(allocateDirect, bVar.t, b.this.u, b.this.r, 0, VEFrame.a.TEPixFmt_YUV420P);
                                                        }
                                                        TEImageUtils.a(createYUVPlanFrame2, b.this.n, VEFrame.b.OP_CONVERT);
                                                        createYUVPlanFrame = b.this.n;
                                                    }
                                                    if (b.this.f61312m != null) {
                                                        TEImageUtils.a(createYUVPlanFrame, b.this.f61312m, VEFrame.b.OP_SCALE);
                                                    }
                                                    if (b.this.r != 0) {
                                                        vEFrame = b.this.o;
                                                        TEImageUtils.a(b.this.f61312m, vEFrame, VEFrame.b.OP_ROTATION);
                                                    } else {
                                                        vEFrame = b.this.f61312m;
                                                    }
                                                    TEImageUtils.a(vEFrame, b.this.f61311l, VEFrame.b.OP_CONVERT);
                                                    ((VEFrame.ByteBufferFrame) b.this.f61311l.getFrame()).getByteBuffer().clear();
                                                }
                                                b bVar2 = b.this;
                                                ByteBuffer byteBuffer = ((VEFrame.ByteBufferFrame) bVar2.f61311l.getFrame()).getByteBuffer();
                                                int width = b.this.f61311l.getWidth();
                                                int height = b.this.f61311l.getHeight();
                                                double timestamp2 = (double) acquireNextImage.getTimestamp();
                                                Double.isNaN(timestamp2);
                                                int i2 = (int) (timestamp2 / 1000000.0d);
                                                if (bVar2.y < bVar2.f61305f.length * bVar2.f61309j && !bVar2.z) {
                                                    if (!bVar2.f61310k.processFrame(byteBuffer, width, height, i2)) {
                                                        an.a(bVar2.f61303b, "processFrame right stop hasProcxessCount:" + bVar2.y + " ptsMsLength: " + bVar2.f61305f.length);
                                                        bVar2.a();
                                                    }
                                                    bVar2.y++;
                                                }
                                            }
                                            this.f61325b.add(Long.valueOf(timestamp));
                                            if (this.f61325b.containsAll(this.f61326c[this.f61324a])) {
                                                this.f61325b.clear();
                                                this.f61324a++;
                                            }
                                            b.this.notify();
                                        }
                                        acquireNextImage.close();
                                    } finally {
                                        MethodCollector.o(12637);
                                    }
                                }
                            } catch (OutOfMemoryError e2) {
                                Runtime.getRuntime().gc();
                                Log.getStackTraceString(e2);
                                b.this.b();
                                b.this.notify();
                                b.this.a();
                                MethodCollector.o(12637);
                            } catch (Exception e3) {
                                Log.getStackTraceString(e3);
                                b.this.b();
                                b.this.notify();
                                b.this.a();
                                MethodCollector.o(12637);
                            }
                        }

                        {
                            this.f61326c = r3;
                        }
                    }, handler);
                    mediaFormat.setInteger("color-format", 2135033992);
                    int a2 = (((a.a(b.f61301d) * 1080) * 1920) / bVar.t) / bVar.u;
                    if (a2 > 0) {
                        an.a(bVar.f61303b, "extract frame targetFps:".concat(String.valueOf(a2)));
                        mediaFormat.setInteger("operating-rate", a2);
                    }
                    bVar.p.configure(mediaFormat, bVar.x.getSurface(), (MediaCrypto) null, 0);
                    bVar.p.start();
                } catch (OutOfMemoryError e8) {
                    e2 = e8;
                    an.a(bVar.f61303b, "start crash oom");
                    Log.getStackTraceString(e2);
                    Runtime.getRuntime().gc();
                    bVar.b();
                    bVar.a();
                } catch (Exception e9) {
                    e3 = e9;
                    an.a(bVar.f61303b, "start crash");
                    Log.getStackTraceString(e3);
                    bVar.b();
                    bVar.a();
                }
            }
        } catch (OutOfMemoryError e10) {
            e2 = e10;
            an.a(bVar.f61303b, "start crash oom");
            Log.getStackTraceString(e2);
            Runtime.getRuntime().gc();
            bVar.b();
            bVar.a();
        } catch (Exception e11) {
            e3 = e11;
            an.a(bVar.f61303b, "start crash");
            Log.getStackTraceString(e3);
            bVar.b();
            bVar.a();
        }
    }
}

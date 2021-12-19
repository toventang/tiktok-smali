package com.ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.ad;
import com.ss.android.vesdk.an;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class VEBingoManager {
    public static int Bingo_TransBlack = 2;
    public static int Bingo_TransDissolve = 1;
    public static int Bingo_TransNull = 0;
    public static int Bingo_TransWhite = 3;
    public static int Bingo_TransZoomIn = 5;
    public static int Bingo_TransZoomOut = 4;
    private Handler imageHandler;
    private HandlerThread imageHandlerThread;
    private volatile long mNative = 0;
    private Map<Integer, Handler> workThreadHandlerMap = new HashMap();
    private Map<Integer, HandlerThread> workThreadMap = new HashMap();

    interface e {
        static {
            Covode.recordClassIndex(37747);
        }

        void a();

        boolean a(int i2, int i3);
    }

    public interface g {
        static {
            Covode.recordClassIndex(37750);
        }

        boolean a();
    }

    private native int[] addVideoClipsByNative(long j2, String[] strArr, int i2);

    private native VETransitionResult[] getBingoTransitionResultsByNative(long j2);

    private native long init(int i2);

    private native int processBingoImageFrameByNative(long j2, Bitmap bitmap, float f2, String str);

    private native int processBingoVideoFrameByNative(long j2, ByteBuffer byteBuffer, int i2, int i3, float f2, String str);

    public native int destroy(long j2);

    class f {

        /* renamed from: a  reason: collision with root package name */
        public g f61267a;

        /* renamed from: b  reason: collision with root package name */
        public volatile boolean f61268b;

        /* renamed from: d  reason: collision with root package name */
        private final int f61270d;

        /* renamed from: e  reason: collision with root package name */
        private final AtomicInteger f61271e;

        static {
            Covode.recordClassIndex(37748);
        }

        public final synchronized void b() {
            MethodCollector.i(1688);
            if (!this.f61268b) {
                this.f61268b = true;
            }
            MethodCollector.o(1688);
        }

        public final synchronized boolean a() {
            boolean z;
            MethodCollector.i(1670);
            int incrementAndGet = this.f61271e.incrementAndGet();
            if (!this.f61268b) {
                this.f61268b = this.f61267a.a();
                if (incrementAndGet == this.f61270d) {
                    new Handler(Looper.myLooper()).post(new Runnable() {
                        /* class com.ss.android.ttve.nativePort.VEBingoManager.f.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(37749);
                        }

                        public final void run() {
                            VEBingoManager.this.getBingoTransitionResults();
                        }
                    });
                }
            }
            z = this.f61268b;
            MethodCollector.o(1670);
            return z;
        }

        private f(int i2, g gVar) {
            this.f61271e = new AtomicInteger(0);
            this.f61268b = false;
            this.f61270d = i2;
            this.f61267a = gVar;
        }

        /* synthetic */ f(VEBingoManager vEBingoManager, int i2, g gVar, byte b2) {
            this(i2, gVar);
        }
    }

    static {
        Covode.recordClassIndex(37741);
        d.a();
    }

    public void destroy() {
        MethodCollector.i(1093);
        reset();
        if (this.mNative > 0) {
            destroy(this.mNative);
            this.mNative = 0;
        }
        MethodCollector.o(1093);
    }

    public VETransitionResult[] getBingoTransitionResults() {
        MethodCollector.i(1740);
        if (this.mNative <= 0) {
            MethodCollector.o(1740);
            return null;
        }
        VETransitionResult[] bingoTransitionResultsByNative = getBingoTransitionResultsByNative(this.mNative);
        MethodCollector.o(1740);
        return bingoTransitionResultsByNative;
    }

    enum a {
        BingoModelAfterEffect(0),
        BingoModelVideoTrans(1);
        
        public final int value;

        static {
            Covode.recordClassIndex(37742);
        }

        private a(int i2) {
            this.value = i2;
        }
    }

    private void reset() {
        for (HandlerThread handlerThread : this.workThreadMap.values()) {
            if (handlerThread != null) {
                handlerThread.quit();
            }
        }
        this.workThreadMap.clear();
        this.workThreadHandlerMap.clear();
        HandlerThread handlerThread2 = this.imageHandlerThread;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        this.imageHandlerThread = null;
        this.imageHandler = null;
    }

    public long initBingoWithTransition() {
        MethodCollector.i(1060);
        reset();
        if (this.mNative > 0) {
            long j2 = this.mNative;
            MethodCollector.o(1060);
            return j2;
        }
        this.mNative = init(a.BingoModelVideoTrans.value);
        long j3 = this.mNative;
        MethodCollector.o(1060);
        return j3;
    }

    class b extends Handler {

        /* renamed from: b  reason: collision with root package name */
        private String[] f61245b;

        /* renamed from: c  reason: collision with root package name */
        private List<Integer> f61246c;

        /* renamed from: d  reason: collision with root package name */
        private f f61247d;

        /* renamed from: e  reason: collision with root package name */
        private TEVideoUtilsCallback f61248e = new TEVideoUtilsCallback();

        /* renamed from: f  reason: collision with root package name */
        private final AtomicInteger f61249f = new AtomicInteger(0);

        static {
            Covode.recordClassIndex(37743);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1 && !this.f61247d.f61268b && this.f61249f.get() < this.f61246c.size()) {
                String str = this.f61245b[this.f61246c.get(this.f61249f.getAndIncrement()).intValue()];
                Bitmap decodeBitmap = VEBingoManager.this.decodeBitmap(str);
                if (decodeBitmap == null || decodeBitmap.isRecycled()) {
                    an.d("VEBingoManager", "decodeBitmap fail, path: ".concat(String.valueOf(str)));
                    this.f61247d.b();
                    return;
                }
                int processBingoImageFrame = VEBingoManager.this.processBingoImageFrame(decodeBitmap, 0.0f, str);
                decodeBitmap.recycle();
                if (processBingoImageFrame < 0) {
                    an.d("VEBingoManager", "processBingoImageFrame fail, path: ".concat(String.valueOf(str)));
                    this.f61247d.b();
                } else if (!this.f61247d.a()) {
                    Message.obtain(this, 1).sendToTarget();
                }
            }
        }

        b(Looper looper, String[] strArr, List<Integer> list, f fVar) {
            super(looper);
            this.f61245b = strArr;
            this.f61246c = list;
            this.f61247d = fVar;
        }
    }

    class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public f f61250a;

        /* renamed from: c  reason: collision with root package name */
        private Map<Integer, int[]> f61252c;

        /* renamed from: d  reason: collision with root package name */
        private String[] f61253d;

        /* renamed from: e  reason: collision with root package name */
        private Map<Integer, com.ss.android.ttve.common.f> f61254e;

        /* renamed from: f  reason: collision with root package name */
        private List<Integer> f61255f;

        /* renamed from: g  reason: collision with root package name */
        private TEVideoUtilsCallback f61256g = new TEVideoUtilsCallback();

        /* renamed from: h  reason: collision with root package name */
        private final AtomicInteger f61257h = new AtomicInteger(0);

        static {
            Covode.recordClassIndex(37744);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1 && !this.f61250a.f61268b && this.f61257h.get() < this.f61255f.size()) {
                final int intValue = this.f61255f.get(this.f61257h.getAndIncrement()).intValue();
                final String str = this.f61253d[intValue];
                int[] iArr = this.f61252c.get(Integer.valueOf(intValue));
                com.ss.android.ttve.common.f fVar = this.f61254e.get(Integer.valueOf(intValue));
                this.f61256g.setListener(new d(intValue, str, iArr.length, new e() {
                    /* class com.ss.android.ttve.nativePort.VEBingoManager.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(37745);
                    }

                    @Override // com.ss.android.ttve.nativePort.VEBingoManager.e
                    public final void a() {
                        c.this.f61250a.b();
                    }

                    @Override // com.ss.android.ttve.nativePort.VEBingoManager.e
                    public final boolean a(int i2, int i3) {
                        boolean a2 = c.this.f61250a.a();
                        if (i2 == i3) {
                            an.a("VEBingoManager", "index: " + intValue + ", videoPath: " + str + ", complete " + i3 + " frame, thread: " + Thread.currentThread().getName());
                            if (!a2) {
                                Message.obtain(c.this, 1).sendToTarget();
                            }
                        }
                        return a2;
                    }
                }));
                int videoFramesMore = TEVideoUtils.getVideoFramesMore(str, iArr, fVar.f61074a, fVar.f61075b, false, false, 1, true, this.f61256g);
                an.a("VEBingoManager", "getVideoFramesMore result: " + videoFramesMore + " , index: " + intValue + ", videoPath: " + str + ", thread: " + Thread.currentThread().getName());
                if (videoFramesMore != 0) {
                    removeCallbacksAndMessages(null);
                    this.f61250a.b();
                }
            }
        }

        c(Looper looper, Map<Integer, int[]> map, String[] strArr, Map<Integer, com.ss.android.ttve.common.f> map2, List<Integer> list, f fVar) {
            super(looper);
            this.f61252c = map;
            this.f61253d = strArr;
            this.f61254e = map2;
            this.f61255f = list;
            this.f61250a = fVar;
        }
    }

    public Bitmap decodeBitmap(String str) {
        int i2;
        int i3;
        MethodCollector.i(1786);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(1786);
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            if (options.outWidth <= 0 || options.outHeight <= 0) {
                an.d("VEBingoManager", "inJustDecodeBounds true, invalid out size, outWidth: " + options.outWidth + ", outHeight: " + options.outHeight);
                MethodCollector.o(1786);
                return null;
            }
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            int i6 = 320;
            if (i4 > i5) {
                float f2 = (((float) i4) * 1.0f) / 320.0f;
                i2 = (int) f2;
                int i7 = (int) (((float) i5) / f2);
                int i8 = i7 % 16;
                if (i8 >= 8) {
                    i7 += 16;
                }
                i3 = i7 - i8;
            } else {
                float f3 = (((float) i5) * 1.0f) / 320.0f;
                i2 = (int) f3;
                int i9 = (int) (((float) i4) / f3);
                int i10 = i9 % 16;
                if (i10 >= 8) {
                    i9 += 16;
                }
                i6 = i9 - i10;
                i3 = 320;
            }
            if (i6 <= 0 || i3 <= 0) {
                an.d("VEBingoManager", "imagePath: " + str + " invalid scale size, scaleWidth: " + i6 + ", scaleHeight: " + i3 + ", bitmap origin width: " + i4 + ", height: " + i5);
                MethodCollector.o(1786);
                return null;
            }
            if (i2 > 1) {
                options.inSampleSize = i2;
            }
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            if (decodeFile == null) {
                an.d("VEBingoManager", "BitmapFactory.decodeFile(inJustDecodeBounds false) failed: ".concat(String.valueOf(str)));
                MethodCollector.o(1786);
                return null;
            }
            an.a("VEBingoManager", "imagePath: " + str + ", origin size: " + i4 + "*" + i5 + ", scale size: " + i6 + "*" + i3 + ", inSampleSize: " + i2 + ", final size: " + decodeFile.getWidth() + "*" + decodeFile.getHeight() + ", thread: " + Thread.currentThread().getName());
            if (!(decodeFile.getConfig() == Bitmap.Config.ARGB_8888 && decodeFile.getWidth() == i6 && decodeFile.getHeight() == i3)) {
                an.a("VEBingoManager", "switch bitmap, config from " + decodeFile.getConfig().name() + " to " + Bitmap.Config.ARGB_8888.name() + ", size from " + decodeFile.getWidth() + "*" + decodeFile.getHeight() + " to " + i6 + "*" + i3);
                Bitmap createBitmap = Bitmap.createBitmap(i6, i3, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(decodeFile, (Rect) null, new RectF(0.0f, 0.0f, (float) i6, (float) i3), (Paint) null);
                decodeFile.recycle();
                decodeFile = createBitmap;
            }
            MethodCollector.o(1786);
            return decodeFile;
        } catch (Exception e2) {
            an.d("VEBingoManager", "decodeBitmap, imagePath: " + str + ", exception: " + e2.toString());
            MethodCollector.o(1786);
            return null;
        }
    }

    private int[] addVideoClips(String[] strArr, int i2) {
        MethodCollector.i(1719);
        if (this.mNative <= 0) {
            an.d("VEBingoManager", "addVideoClips, invalid mNative: " + this.mNative);
            MethodCollector.o(1719);
            return null;
        }
        int[] addVideoClipsByNative = addVideoClipsByNative(this.mNative, strArr, i2);
        MethodCollector.o(1719);
        return addVideoClipsByNative;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void saveBitmap(java.lang.String r6, android.graphics.Bitmap r7) {
        /*
            r5 = this;
            r4 = 1810(0x712, float:2.536E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            java.io.File r3 = new java.io.File
            r3.<init>(r6)
            java.io.File r0 = r3.getParentFile()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x001b
            java.io.File r0 = r3.getParentFile()
            r0.mkdir()
        L_0x001b:
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0034, all -> 0x0046 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0034, all -> 0x0046 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0032 }
            r0 = 100
            r7.compress(r1, r0, r2)     // Catch:{ Exception -> 0x0032 }
            r2.flush()     // Catch:{ Exception -> 0x0032 }
            r2.close()     // Catch:{ IOException -> 0x0051 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0032:
            r0 = move-exception
            goto L_0x0036
        L_0x0034:
            r0 = move-exception
            r2 = r1
        L_0x0036:
            r0.printStackTrace()     // Catch:{ all -> 0x003a }
            goto L_0x004b
        L_0x003a:
            r0 = move-exception
            if (r2 == 0) goto L_0x0047
            r2.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0047
        L_0x0046:
            r0 = move-exception
        L_0x0047:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        L_0x004b:
            if (r2 == 0) goto L_0x0059
            r2.close()
            goto L_0x0059
        L_0x0051:
            r0 = move-exception
            r0.printStackTrace()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0059:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.VEBingoManager.saveBitmap(java.lang.String, android.graphics.Bitmap):void");
    }

    public int processBingoImageFrame(Bitmap bitmap, float f2, String str) {
        MethodCollector.i(1734);
        if (this.mNative <= 0) {
            MethodCollector.o(1734);
            return -112;
        }
        int processBingoImageFrameByNative = processBingoImageFrameByNative(this.mNative, bitmap, f2, str);
        MethodCollector.o(1734);
        return processBingoImageFrameByNative;
    }

    class d implements ad {

        /* renamed from: b  reason: collision with root package name */
        private final int f61262b;

        /* renamed from: c  reason: collision with root package name */
        private final String f61263c;

        /* renamed from: d  reason: collision with root package name */
        private volatile int f61264d;

        /* renamed from: e  reason: collision with root package name */
        private final AtomicInteger f61265e = new AtomicInteger(0);

        /* renamed from: f  reason: collision with root package name */
        private e f61266f;

        static {
            Covode.recordClassIndex(37746);
        }

        @Override // com.ss.android.vesdk.ad
        public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
            int processBingoVideoFrame = VEBingoManager.this.processBingoVideoFrame(byteBuffer, i2, i3, (float) i4, this.f61263c);
            if (processBingoVideoFrame < 0) {
                an.d("VEBingoManager", "index: " + this.f61262b + ", videoPath: " + this.f61263c + ", processBingoVideoFrame fail: " + processBingoVideoFrame + ", thread: " + Thread.currentThread().getName());
                this.f61266f.a();
                return false;
            }
            this.f61265e.incrementAndGet();
            if (this.f61266f.a(this.f61265e.get(), this.f61264d) || this.f61265e.get() == this.f61264d) {
                return false;
            }
            return true;
        }

        d(int i2, String str, int i3, e eVar) {
            this.f61262b = i2;
            this.f61263c = str;
            this.f61264d = i3;
            this.f61266f = eVar;
        }
    }

    public void detectTransition(String[] strArr, int i2, int i3, g gVar) {
        int i4;
        HashMap hashMap;
        int i5;
        int i6;
        int i7;
        if (strArr != null) {
            int i8 = 2;
            if (strArr.length >= 2 && i2 > 0 && i3 > 0) {
                reset();
                int[] addVideoClips = addVideoClips(strArr, 1000 / i3);
                if (addVideoClips != null && addVideoClips.length == strArr.length) {
                    HashMap hashMap2 = new HashMap();
                    HashMap hashMap3 = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    while (i9 < strArr.length) {
                        String str = strArr[i9];
                        int i12 = addVideoClips[i9];
                        if (i8 == i12) {
                            arrayList.add(Integer.valueOf(i9));
                            i11++;
                        } else if (1 == i12) {
                            arrayList2.add(Integer.valueOf(i9));
                            int[] iArr = new int[10];
                            TEVideoUtils.getVideoFileInfo(str, iArr);
                            if (iArr[0] <= 0 || iArr[1] <= 0 || iArr[3] <= 0) {
                                an.d("VEBingoManager", "invalid video info, index: " + i9 + ", videoPath: " + str + ", duration: " + iArr[3] + ", size: " + iArr[0] + "*" + iArr[1]);
                                return;
                            }
                            if (iArr[0] > iArr[1]) {
                                int i13 = (int) (((float) iArr[1]) / ((((float) iArr[0]) * 1.0f) / 320.0f));
                                int i14 = i13 % 16;
                                if (i14 >= 8) {
                                    i13 += 16;
                                }
                                i7 = i13 - i14;
                                i6 = 320;
                            } else {
                                int i15 = (int) (((float) iArr[0]) / ((((float) iArr[1]) * 1.0f) / 320.0f));
                                int i16 = i15 % 16;
                                if (i16 >= 8) {
                                    i15 += 16;
                                }
                                i6 = i15 - i16;
                                i7 = 320;
                                if (i6 <= 0) {
                                    an.d("VEBingoManager", "invalid scale size, index: " + i9 + ", videoPath: " + str + ", size: " + i6 + "*" + i7);
                                    return;
                                }
                            }
                            if (i7 <= 0) {
                                an.d("VEBingoManager", "invalid scale size, index: " + i9 + ", videoPath: " + str + ", size: " + i6 + "*" + i7);
                                return;
                            }
                            hashMap3.put(Integer.valueOf(i9), new com.ss.android.ttve.common.f(i6, i7));
                            int i17 = iArr[3];
                            LinkedList linkedList = new LinkedList();
                            if (i9 == 0) {
                                for (int i18 = 0; i18 < i2; i18++) {
                                    int i19 = i17 - (i18 * i3);
                                    if (i19 < 0) {
                                        break;
                                    }
                                    linkedList.add(Integer.valueOf(i19));
                                }
                            } else if (i9 != strArr.length - 1) {
                                int i20 = 0;
                                for (int i21 = 0; i21 < i2; i21++) {
                                    int i22 = i21 * i3;
                                    if (i22 > i17) {
                                        break;
                                    }
                                    if (i22 > i20) {
                                        i20 = i22;
                                    }
                                    linkedList.add(Integer.valueOf(i22));
                                }
                                for (int i23 = 0; i23 < i2; i23++) {
                                    int i24 = i17 - (i23 * i3);
                                    if (i24 < 0 || i24 <= i20) {
                                        break;
                                    }
                                    if (!linkedList.contains(Integer.valueOf(i24))) {
                                        linkedList.add(Integer.valueOf(i24));
                                    }
                                }
                            } else {
                                for (int i25 = 0; i25 < i2; i25++) {
                                    int i26 = i25 * i3;
                                    if (i26 > i17) {
                                        break;
                                    }
                                    linkedList.add(Integer.valueOf(i26));
                                }
                            }
                            Collections.sort(linkedList);
                            int size = linkedList.size();
                            int[] iArr2 = new int[size];
                            for (int i27 = 0; i27 < linkedList.size(); i27++) {
                                iArr2[i27] = ((Integer) linkedList.get(i27)).intValue();
                            }
                            hashMap2.put(Integer.valueOf(i9), iArr2);
                            i10 += size;
                            an.a("VEBingoManager", "video clip, index: " + i9 + ", videoPath: " + str + ", duration: " + i17 + ", origin size: " + iArr[0] + "*" + iArr[1] + ", scale size: " + i6 + "*" + i7 + ", ptsList: " + linkedList);
                        } else {
                            return;
                        }
                        i9++;
                        i8 = 2;
                    }
                    an.a("VEBingoManager", "total video frame num: " + i10 + ", total image frame num: " + i11 + ", image clip: " + arrayList);
                    f fVar = new f(this, i10 + i11, gVar, (byte) 0);
                    HashMap hashMap4 = new HashMap();
                    if (arrayList2.size() > 2) {
                        int size2 = arrayList2.size() / 3;
                        int size3 = arrayList2.size() % 3;
                        if (size2 > 0) {
                            int i28 = 0;
                            do {
                                ArrayList arrayList3 = new ArrayList();
                                int i29 = i28 * size2;
                                while (true) {
                                    i5 = i28 + 1;
                                    if (i29 < i5 * size2 && i29 < arrayList2.size()) {
                                        arrayList3.add(arrayList2.get(i29));
                                        i29++;
                                    }
                                }
                                if (arrayList3.size() > 0) {
                                    if (hashMap4.get(Integer.valueOf(i28)) == null) {
                                        hashMap4.put(Integer.valueOf(i28), arrayList3);
                                    } else {
                                        ((List) hashMap4.get(Integer.valueOf(i28))).addAll(arrayList3);
                                    }
                                }
                                i28 = i5;
                            } while (i28 < 3);
                        }
                        if (size3 > 0) {
                            int i30 = 0;
                            for (int size4 = arrayList2.size() - size3; size4 < arrayList2.size(); size4++) {
                                if (hashMap4.get(Integer.valueOf(i30)) == null) {
                                    ArrayList arrayList4 = new ArrayList();
                                    arrayList4.add(arrayList2.get(size4));
                                    hashMap4.put(Integer.valueOf(i30), arrayList4);
                                } else {
                                    ((List) hashMap4.get(Integer.valueOf(i30))).add(arrayList2.get(size4));
                                }
                                i30 = (i30 + 1) % 3;
                            }
                        }
                        int i31 = 0;
                        do {
                            List list = (List) hashMap4.get(Integer.valueOf(i31));
                            if (list == null || list.size() <= 0) {
                                hashMap = hashMap2;
                            } else {
                                HandlerThread handlerThread = new HandlerThread("HandlerThread_Video_".concat(String.valueOf(i31)));
                                handlerThread.start();
                                hashMap = hashMap2;
                                c cVar = new c(handlerThread.getLooper(), hashMap2, strArr, hashMap3, list, fVar);
                                this.workThreadMap.put(Integer.valueOf(i31), handlerThread);
                                this.workThreadHandlerMap.put(Integer.valueOf(i31), cVar);
                                Message.obtain(cVar, 1).sendToTarget();
                                an.a("VEBingoManager", "HandlerThread_Video_" + i31 + " is responsible for " + list);
                            }
                            i31++;
                            hashMap2 = hashMap;
                        } while (i31 < 3);
                        i4 = 1;
                    } else {
                        i4 = 1;
                        if (arrayList2.size() > 0) {
                            HandlerThread handlerThread2 = new HandlerThread("HandlerThread_Video_Single");
                            handlerThread2.start();
                            c cVar2 = new c(handlerThread2.getLooper(), hashMap2, strArr, hashMap3, arrayList2, fVar);
                            this.workThreadMap.put(0, handlerThread2);
                            this.workThreadHandlerMap.put(0, cVar2);
                            Message.obtain(cVar2, 1).sendToTarget();
                            an.a("VEBingoManager", "HandlerThread_Single  is responsible for ".concat(String.valueOf(arrayList2)));
                        }
                    }
                    if (arrayList.size() > 0) {
                        HandlerThread handlerThread3 = new HandlerThread("HandlerThread_Image");
                        this.imageHandlerThread = handlerThread3;
                        handlerThread3.start();
                        b bVar = new b(this.imageHandlerThread.getLooper(), strArr, arrayList, fVar);
                        this.imageHandler = bVar;
                        Message.obtain(bVar, i4).sendToTarget();
                    }
                }
            }
        }
    }

    public int processBingoVideoFrame(ByteBuffer byteBuffer, int i2, int i3, float f2, String str) {
        MethodCollector.i(1722);
        if (this.mNative <= 0) {
            MethodCollector.o(1722);
            return -112;
        }
        int processBingoVideoFrameByNative = processBingoVideoFrameByNative(this.mNative, byteBuffer, i2, i3, f2, str);
        MethodCollector.o(1722);
        return processBingoVideoFrameByNative;
    }
}

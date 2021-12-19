package com.ss.android.medialib.presenter;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.RecordInvoker;
import com.ss.android.medialib.b.a;
import com.ss.android.medialib.camera.ImageFrame;
import com.ss.android.medialib.listener.AudioManagerCallback;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ttve.monitor.h;
import com.ss.android.vesdk.LandMarkFrame;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.VEDebugSettings;
import com.ss.android.vesdk.VEEffectParams;
import com.ss.android.vesdk.VESafeAreaParams;
import com.ss.android.vesdk.al;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.bh;
import com.ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import com.ss.android.vesdk.u;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.libsdl.app.AudioRecorderInterface;
import org.libsdl.app.AudioRecorderInterfaceExt;
import org.libsdl.app.BufferedAudioRecorder;

public class e implements AudioRecorderInterfaceExt {

    /* renamed from: a  reason: collision with root package name */
    public static final String f59771a = e.class.getSimpleName();
    public long A = 0;
    public long B = 0;
    public SurfaceTexture.OnFrameAvailableListener C = new SurfaceTexture.OnFrameAvailableListener() {
        /* class com.ss.android.medialib.presenter.e.AnonymousClass10 */

        static {
            Covode.recordClassIndex(36939);
        }

        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            if (e.this.y == -1) {
                e.this.A = System.currentTimeMillis();
            }
            e.this.y++;
            e.this.B = System.currentTimeMillis();
            float f2 = ((float) (e.this.B - e.this.A)) / 1000.0f;
            if (f2 >= 1.0f) {
                e eVar = e.this;
                eVar.z = ((float) eVar.y) / f2;
                e eVar2 = e.this;
                eVar2.A = eVar2.B;
                e.this.y = 0;
            }
        }
    };
    private String D;
    private long E;
    private long F = -1;
    private long G;
    private boolean H;
    private AtomicBoolean I = new AtomicBoolean(false);
    private int J = 18;
    private int K = -1;
    private boolean L = false;
    private float M = 1.0f;
    private volatile boolean N = false;
    private boolean O = false;
    private AtomicInteger P = new AtomicInteger(-1);
    private boolean Q = false;
    private boolean R = false;
    private c<a> S;
    private boolean T = false;
    private VEDebugSettings U = null;
    private double V = -1.0d;
    private com.ss.android.medialib.listener.d W = new com.ss.android.medialib.listener.d() {
        /* class com.ss.android.medialib.presenter.e.AnonymousClass11 */

        static {
            Covode.recordClassIndex(36940);
        }

        @Override // com.ss.android.medialib.listener.d
        public final long a() {
            SurfaceTexture surfaceTexture = e.this.w;
            long abs = Math.abs(System.nanoTime() - surfaceTexture.getTimestamp());
            int i2 = Build.VERSION.SDK_INT;
            long abs2 = Math.abs(SystemClock.elapsedRealtimeNanos() - surfaceTexture.getTimestamp());
            long abs3 = Math.abs((SystemClock.uptimeMillis() * 1000000) - surfaceTexture.getTimestamp());
            an.b(e.f59771a, "nano_time: " + abs + ",elapsed: " + abs2 + " ,delta_uptime_nano: " + abs3);
            return Math.min(Math.min(abs, abs2), abs3) / 1000;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public BufferedAudioRecorder f59772b;

    /* renamed from: c  reason: collision with root package name */
    public int f59773c = 1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f59774d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f59775e = false;

    /* renamed from: f  reason: collision with root package name */
    public AudioRecorderInterface f59776f;

    /* renamed from: g  reason: collision with root package name */
    public a f59777g;

    /* renamed from: h  reason: collision with root package name */
    public c f59778h;

    /* renamed from: i  reason: collision with root package name */
    protected RecordInvoker f59779i;

    /* renamed from: j  reason: collision with root package name */
    public g f59780j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f59781k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f59782l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f59783m = false;
    public int n = 0;
    public int o = 44100;
    public int p = 2;
    public int q = 131072;
    public boolean r = true;
    public boolean s = true;
    public boolean t = false;
    public f u;
    public com.ss.android.medialib.a.b v;
    public SurfaceTexture w;
    public boolean x = false;
    public int y = -1;
    public float z = -1.0f;

    public interface a {
        static {
            Covode.recordClassIndex(36949);
        }

        void a(int i2, int i3);
    }

    public interface b {
        static {
            Covode.recordClassIndex(36950);
        }

        void a(int i2);
    }

    public interface c {
        static {
            Covode.recordClassIndex(36951);
        }

        void a(com.ss.android.medialib.model.a aVar);

        boolean b();
    }

    public interface d {
        static {
            Covode.recordClassIndex(36952);
        }

        void a(Bitmap bitmap, int i2);
    }

    /* renamed from: com.ss.android.medialib.presenter.e$e  reason: collision with other inner class name */
    public interface AbstractC1303e {
        static {
            Covode.recordClassIndex(36953);
        }

        void a(int[] iArr, int i2, int i3);
    }

    @Override // org.libsdl.app.AudioRecorderInterfaceExt
    public void startMicError() {
    }

    public final e a(int i2, int i3, int i4) {
        this.o = i2;
        this.p = i3;
        this.q = i4;
        return this;
    }

    public final e a(String str) {
        this.D = str;
        this.f59779i.changeMusicPath(str);
        return this;
    }

    public final e a(float f2, int i2) {
        this.M = f2;
        this.f59779i.setBGMVolume(f2, i2);
        return this;
    }

    public final void a(String str, String str2, float f2, float f3, float f4, boolean z2, boolean z3, int i2) {
        this.f59779i.initDuet(str, f2, f3, f4, z2, z3, i2);
        a(0L, 0L);
        a(str2);
        this.f59782l = true;
    }

    public final void a(boolean z2) {
        RecordInvoker recordInvoker = this.f59779i;
        if (recordInvoker != null) {
            recordInvoker.setSwapReactionRegion(true);
        }
    }

    public final void a(int i2, int i3) {
        an.a(f59771a, "changeOutputVideoSize: width=" + i2 + ", height=" + i3);
        this.f59779i.changeOutputVideoSize(i2, i3);
    }

    public final void a(float f2) {
        this.f59779i.chooseAreaFromRatio34(f2);
    }

    public final void b(float f2) {
        this.f59779i.setPaddingBottomInRatio34(f2);
    }

    public final void b(boolean z2) {
        this.f59779i.forceFirstFrameHasEffect(z2);
    }

    public final void a(long j2) {
        this.f59779i.setEffectAlgorithmRequirement(j2);
    }

    public final void a(RecordInvoker.OnPreviewRadioListener onPreviewRadioListener) {
        this.f59779i.setPreviewRadioListener(onPreviewRadioListener);
    }

    public final void b(int i2, int i3) {
        this.f59779i.setCaptureRenderWidth(i2, i3);
    }

    public final void a(Context context, String str, String str2) {
        this.f59779i.initReaction(context, str, str2);
        a(0L, 0L);
        a(str2);
    }

    public final e a(long j2, long j3) {
        return a(j2, this.F, j3);
    }

    public final e a(long j2, long j3, long j4) {
        this.E = j2;
        this.F = j3;
        this.G = j4;
        this.f59779i.setMusicTime(j2, j3, j4);
        return this;
    }

    public final synchronized int a(Context context, int i2, AudioRecorderInterface audioRecorderInterface) {
        BufferedAudioRecorder bufferedAudioRecorder;
        MethodCollector.i(6195);
        this.f59776f = audioRecorderInterface;
        if (context == null) {
            an.d(f59771a, "file " + an.a() + ",fun " + an.c() + ",line " + an.b() + ": context is null");
            MethodCollector.o(6195);
            return -1000;
        }
        this.f59773c = i2;
        if (!this.f59775e && (bufferedAudioRecorder = this.f59772b) != null) {
            bufferedAudioRecorder.unInit();
            an.a(f59771a, "initRecord: mAudioRecorder.unInit()");
        }
        if ((this.f59773c & 1) != 0 && !this.f59775e) {
            BufferedAudioRecorder bufferedAudioRecorder2 = new BufferedAudioRecorder(this, this.o, this.p, this.q, this.u);
            this.f59772b = bufferedAudioRecorder2;
            bufferedAudioRecorder2.init(y());
            J();
        }
        int i3 = 0;
        if ((this.f59773c & 4) != 0 && !TextUtils.isEmpty(this.D)) {
            this.f59779i.setBGMVolume(this.M, -1);
            i3 = this.f59779i.initAudioPlayer(context, this.D, this.G + this.E, this.f59774d, this.f59783m);
        }
        an.a(f59771a, "initRecord return: ".concat(String.valueOf(i3)));
        MethodCollector.o(6195);
        return i3;
    }

    public final void a(AssetManager assetManager) {
        this.f59779i.configStyleResourceFinder(assetManager);
    }

    public final void a() {
        this.f59779i.setEffectBuildChainType(1);
    }

    public final int[] a(int i2, int i3, int i4, int i5, float f2) {
        return this.f59779i.updateReactionCameraPosWithRotation(i2, i3, i4, i5, f2);
    }

    public final void a(int i2, int i3, int i4, int i5) {
        this.f59779i.setReactionPosMargin(i2, i3, i4, i5);
    }

    public final void a(Context context, String str, String str2, String str3) {
        this.f59779i.setCustomVideoBg(context, str, str2, str3, 0, true, this.f59783m);
        if (!TextUtils.isEmpty(str2)) {
            this.f59779i.previewVideoBg();
        }
        if (TextUtils.isEmpty(this.D)) {
            this.f59779i.uninitAudioPlayer();
            a((String) null);
            a(0);
        }
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.D) && !TextUtils.isEmpty(str3)) {
            an.a(f59771a, "setCustomVideoBg, initAudioPlayer ret = ".concat(String.valueOf(this.f59779i.initAudioPlayer(context, str3, this.G, false, this.f59783m))));
        }
    }

    public final void a(String str, String str2) {
        this.f59779i.setCustomVideoBg(str, str2);
    }

    public final void a(double d2) {
        this.f59779i.setVideoBgSpeed(d2);
    }

    public final void a(int i2) {
        this.f59779i.setUseMusic(i2);
    }

    public final void b(int i2) {
        this.f59779i.enableAudio(i2);
    }

    public final int a(int i2, float[] fArr, boolean z2) {
        SurfaceTexture surfaceTexture;
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = this.C;
        if (!(onFrameAvailableListener == null || (surfaceTexture = this.w) == null)) {
            if (fArr != null) {
                boolean z3 = false;
                if ((fArr[0] * fArr[5]) - (fArr[1] * fArr[4]) >= 0.0f) {
                    z3 = true;
                }
                this.r = z3;
            }
            onFrameAvailableListener.onFrameAvailable(surfaceTexture);
        }
        return this.f59779i.onDrawFrame(i2, fArr, z2);
    }

    public final void a(int i2, boolean z2, boolean z3) {
        this.f59779i.updateRotation((i2 + this.n) % 360, z2, z3);
    }

    public final void a(float f2, float f3, float f4) {
        this.f59779i.updateRotation(f2, f3, f4);
    }

    public final void a(float[] fArr) {
        this.f59779i.setDeviceRotation(fArr);
    }

    public final void a(float[] fArr, double d2) {
        this.f59779i.setDeviceRotation(fArr, d2);
    }

    public final void a(LandMarkFrame landMarkFrame) {
        this.f59779i.setLandMarkInfo(landMarkFrame);
    }

    public final int a(boolean z2, int i2, boolean z3) {
        return this.f59779i.startPrePlay(z2, i2, z3);
    }

    public final int a(byte[] bArr, int i2, long j2) {
        if (!this.f59775e) {
            return 0;
        }
        this.f59779i.onAudioCallback(bArr, i2);
        AudioRecorderInterface audioRecorderInterface = this.f59776f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.addPCMData(bArr, i2, j2);
            an.b(f59771a, "addPCMData is running");
        }
        if (this.P.get() != 0) {
            return 0;
        }
        this.v.a(Arrays.copyOf(bArr, i2), i2, j2);
        return 0;
    }

    public final synchronized int a(String str, String str2, int i2, String str3, String str4, boolean z2, int i3) {
        int concat;
        MethodCollector.i(3800);
        n();
        long currentTimeMillis = System.currentTimeMillis();
        concat = this.f59779i.concat(str, str2, i2, str3, str4, z2, i3);
        h.a(0, "te_record_concat_ret", (long) concat);
        h.a(0, "te_record_concat_time", System.currentTimeMillis() - currentTimeMillis);
        MethodCollector.o(3800);
        return concat;
    }

    public final int a(Surface surface, String str) {
        com.ss.android.medialib.camera.b.a();
        com.ss.android.medialib.camera.b.a();
        an.b("MediaPresenter", "Start Play >>> ");
        int startPlay = this.f59779i.startPlay(surface, str, this.H, 0, 0);
        an.b("MediaPresenter", "Start Play ret = ".concat(String.valueOf(startPlay)));
        return startPlay;
    }

    public final int a(Surface surface) {
        return this.f59779i.changeSurface(surface);
    }

    public final void a(float f2, int i2, int i3) {
        this.f59779i.setPreviewSizeRatio(f2, i2, i3);
    }

    public final void b(int i2, String str) {
        an.b(f59771a, "nativeSetBeautyFace: ".concat(String.valueOf(i2)));
        this.f59779i.setBeautyFace(i2, str);
    }

    public final void a(float f2, float f3) {
        this.f59779i.setBeautyFaceIntensity(f2, f3);
    }

    public final int a(String str, float f2, float f3) {
        return this.f59779i.setReshape(str, f2, f3);
    }

    public final void a(String[] strArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f59779i.setWaterMark(strArr, i2, i3, i4, i5, i6, i7, i8);
    }

    public final void a(Bitmap bitmap, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f59779i.setWaterMark(bitmap, i2, i3, i4, i5, i6, i7, i8);
    }

    public final void a(Context context) {
        this.f59779i.setNativeLibraryDir(context.getApplicationInfo().nativeLibraryDir);
    }

    public final void a(String str, float f2) {
        an.b(f59771a, "ret = ".concat(String.valueOf(this.f59779i.setFilterNew(str, f2))));
    }

    public final void b(String str) {
        an.b(f59771a, "ret = ".concat(String.valueOf(this.f59779i.setFilter(str))));
    }

    public final void a(String str, String str2, float f2) {
        this.f59779i.setFilter(str, str2, f2);
    }

    public final void a(String str, String str2, float f2, float f3, float f4) {
        this.f59779i.setFilterNew(str, str2, f2, f3, f4);
    }

    public final void a(a.b bVar) {
        this.f59779i.setOnOpenGLCallback(bVar);
    }

    public final int a(final String str, int[] iArr, boolean z2, final Bitmap.CompressFormat compressFormat, a.c cVar, boolean z3) {
        int i2;
        if (compressFormat == Bitmap.CompressFormat.JPEG) {
            i2 = 1;
        } else {
            i2 = compressFormat == Bitmap.CompressFormat.PNG ? 0 : -1;
        }
        return this.f59779i.shotScreen(str, iArr, z2, i2, new RecordInvoker.OnPictureCallback() {
            /* class com.ss.android.medialib.presenter.e.AnonymousClass4 */

            static {
                Covode.recordClassIndex(36943);
            }

            @Override // com.ss.android.medialib.RecordInvoker.OnPictureCallback
            public final void onResult(int[] iArr, int i2, int i3) {
                MethodCollector.i(3472);
                Bitmap createBitmap = Bitmap.createBitmap(iArr, i2, i3, Bitmap.Config.ARGB_8888);
                com.ss.android.medialib.b.b.a(createBitmap, str, compressFormat);
                if (createBitmap != null) {
                    createBitmap.recycle();
                }
                MethodCollector.o(3472);
            }
        }, cVar, z3);
    }

    public final int a(int[] iArr, boolean z2, final d dVar, boolean z3) {
        return this.f59779i.shotScreen("", iArr, z2, -1, new RecordInvoker.OnPictureCallback() {
            /* class com.ss.android.medialib.presenter.e.AnonymousClass5 */

            static {
                Covode.recordClassIndex(36944);
            }

            @Override // com.ss.android.medialib.RecordInvoker.OnPictureCallback
            public final void onResult(int[] iArr, int i2, int i3) {
                MethodCollector.i(3440);
                e.this.f59779i.setIsDuringScreenshot(false);
                if (iArr == null || iArr.length <= 0 || i2 <= 0 || i3 <= 0) {
                    d dVar = dVar;
                    if (dVar != null) {
                        dVar.a(null, -3000);
                    }
                    MethodCollector.o(3440);
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(iArr, i2, i3, Bitmap.Config.ARGB_8888);
                d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.a(createBitmap, 0);
                }
                MethodCollector.o(3440);
            }
        }, new a.c() {
            /* class com.ss.android.medialib.presenter.e.AnonymousClass6 */

            static {
                Covode.recordClassIndex(36945);
            }

            @Override // com.ss.android.medialib.b.a.c
            public final void a(int i2) {
                d dVar = dVar;
                if (dVar != null && i2 < 0) {
                    dVar.a(null, i2);
                }
            }
        }, z3);
    }

    public final int a(final boolean z2, int[] iArr, boolean z3, final d dVar, boolean z4, final AbstractC1303e eVar, boolean z5) {
        MethodCollector.i(3843);
        AnonymousClass8 r12 = null;
        final Bitmap createBitmap = z2 ? Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888) : null;
        AnonymousClass7 r9 = new RecordInvoker.OnPictureCallback() {
            /* class com.ss.android.medialib.presenter.e.AnonymousClass7 */

            static {
                Covode.recordClassIndex(36946);
            }

            @Override // com.ss.android.medialib.RecordInvoker.OnPictureCallback
            public final void onResult(int[] iArr, int i2, int i3) {
                MethodCollector.i(3441);
                if (iArr == null || iArr.length <= 0 || i2 <= 0) {
                    if (i2 == -1 && i3 == -1 && iArr == null) {
                        d dVar = dVar;
                        if (dVar != null) {
                            dVar.a(createBitmap, 0);
                            MethodCollector.o(3441);
                            return;
                        }
                        MethodCollector.o(3441);
                    }
                } else if (i3 > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(iArr, i2, i3, Bitmap.Config.ARGB_8888);
                    d dVar2 = dVar;
                    if (dVar2 != null) {
                        dVar2.a(createBitmap, 0);
                    }
                    MethodCollector.o(3441);
                    return;
                }
                d dVar3 = dVar;
                if (dVar3 != null) {
                    dVar3.a(null, -3000);
                }
                if (z2 && !createBitmap.isRecycled()) {
                    createBitmap.recycle();
                }
                MethodCollector.o(3441);
            }
        };
        if (eVar != null) {
            r12 = new RecordInvoker.OnPictureCallback() {
                /* class com.ss.android.medialib.presenter.e.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(36947);
                }

                @Override // com.ss.android.medialib.RecordInvoker.OnPictureCallback
                public final void onResult(int[] iArr, int i2, int i3) {
                    if (iArr == null || iArr.length <= 0 || i2 <= 0 || i3 <= 0) {
                        eVar.a(null, i2, i3);
                    } else {
                        eVar.a(iArr, i2, i3);
                    }
                }
            };
        }
        int shotHDScreen = this.f59779i.shotHDScreen("", iArr, z3, -1, r9, new a.c() {
            /* class com.ss.android.medialib.presenter.e.AnonymousClass9 */

            static {
                Covode.recordClassIndex(36948);
            }

            @Override // com.ss.android.medialib.b.a.c
            public final void a(int i2) {
                d dVar = dVar;
                if (dVar != null && i2 < 0) {
                    dVar.a(null, i2);
                }
            }
        }, z4, r12, createBitmap, z5);
        MethodCollector.o(3843);
        return shotHDScreen;
    }

    public final int a(boolean z2, boolean z3, boolean z4, boolean z5) {
        return this.f59779i.slamDeviceConfig(z2, z3, z4, z5);
    }

    public final int a(double[] dArr, double d2) {
        return this.f59779i.slamProcessIngestOri(dArr, d2);
    }

    public final int a(String str, int i2, int i3, String str2) {
        return this.f59779i.slamSetInputText(str, i2, i3, str2);
    }

    public final int a(RecordInvoker.OnARTextCountCallback onARTextCountCallback) {
        return this.f59779i.slamGetTextLimitCount(onARTextCountCallback);
    }

    public final int a(RecordInvoker.OnARTextContentCallback onARTextContentCallback) {
        return this.f59779i.slamGetTextParagraphContent(onARTextContentCallback);
    }

    public final int a(RecordInvoker.OnARTextBitmapCallback onARTextBitmapCallback) {
        return this.f59779i.slamGetTextBitmap(onARTextBitmapCallback);
    }

    public final void a(al alVar) {
        this.f59779i.addLandMarkDetectListener(alVar);
    }

    public final void b(al alVar) {
        this.f59779i.removeLandMarkDetectListener(alVar);
    }

    public final int a(Bitmap bitmap) {
        return this.f59779i.setSlamFace(bitmap);
    }

    public final int a(int i2, String str, long j2, long j3) {
        return this.f59779i.addTrack(i2, str, j2, j3);
    }

    public final int a(ImageFrame imageFrame, boolean z2) {
        SurfaceTexture surfaceTexture;
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = this.C;
        if (!(onFrameAvailableListener == null || (surfaceTexture = this.w) == null)) {
            onFrameAvailableListener.onFrameAvailable(surfaceTexture);
        }
        return this.f59779i.onDrawFrame(imageFrame, z2);
    }

    public final int a(ImageFrame imageFrame, int i2, boolean z2) {
        return this.f59779i.onDrawFrame(imageFrame, i2, z2);
    }

    public final void a(int i2, long j2, long j3, String str) {
        this.f59779i.sendEffectMsg(i2, j2, j3, str);
    }

    public final void a(MessageCenter.Listener listener) {
        this.f59779i.setMessageListenerV2(listener);
    }

    public final void a(RecordInvoker.FaceResultCallback faceResultCallback) {
        this.f59779i.registerFaceResultCallback(true, faceResultCallback);
    }

    public final void a(float f2, float f3, float f4, float f5) {
        a(true, f2, f3, f4, f5, true, 0, 0, 0, false, false, true);
    }

    public final void a(boolean z2, float f2, float f3, float f4, float f5, boolean z3, int i2, long j2, int i3, boolean z4, boolean z5, boolean z6) {
        this.f59779i.setEnigmaDetectParams(z2, f2, f3, f4, f5, z3, i2, j2, i3, z4, z5, z6);
    }

    public final void a(boolean z2, long j2) {
        this.f59779i.enableScan(z2, j2);
    }

    public final void a(RecordInvoker.OnSkeletonDetectCallback onSkeletonDetectCallback) {
        this.f59779i.registerSkeletonDetectCallback(onSkeletonDetectCallback);
    }

    public final void a(RecordInvoker.OnCherEffectParmaCallback onCherEffectParmaCallback) {
        this.f59779i.registerCherEffectParamCallback(onCherEffectParmaCallback);
    }

    public final void a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f59779i.recoverCherEffect(strArr, dArr, zArr);
    }

    public final void a(c cVar, int i2) {
        AnonymousClass2 r1;
        boolean z2;
        this.f59778h = cVar;
        RecordInvoker recordInvoker = this.f59779i;
        if (cVar == null) {
            r1 = null;
        } else {
            r1 = new RecordInvoker.OnFrameCallback() {
                /* class com.ss.android.medialib.presenter.e.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                volatile com.ss.android.medialib.model.a f59787a = new com.ss.android.medialib.model.a();

                /* renamed from: c  reason: collision with root package name */
                private double f59789c = 0.0d;

                /* renamed from: d  reason: collision with root package name */
                private double f59790d = 0.0d;

                /* renamed from: e  reason: collision with root package name */
                private float f59791e = 0.0f;

                static {
                    Covode.recordClassIndex(36941);
                }

                @Override // com.ss.android.medialib.RecordInvoker.OnFrameCallback
                public final void onFrame(int i2, double d2) {
                    this.f59787a.f59742b = i2;
                    this.f59787a.f59746f = (long) d2;
                    this.f59787a.f59749i = e.this.r;
                    if (e.this.f59778h != null) {
                        e.this.f59778h.a(this.f59787a);
                    }
                }

                @Override // com.ss.android.medialib.RecordInvoker.OnFrameCallback
                public final void onInit(EGLContext eGLContext, int i2, int i3, int i4, long j2) {
                    this.f59787a.f59741a = eGLContext;
                    this.f59787a.f59743c = i2;
                    this.f59787a.f59744d = i3;
                    this.f59787a.f59745e = i4;
                    this.f59787a.f59747g = j2;
                    this.f59791e = ((Float) u.a().a("ve_recorder_fps_downgrade", Float.valueOf(-1.0f))).floatValue();
                }

                @Override // com.ss.android.medialib.RecordInvoker.OnFrameCallback
                public final void onFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, double d2) {
                    this.f59787a.f59748h = byteBuffer;
                    this.f59787a.f59743c = i2;
                    this.f59787a.f59744d = i3;
                    this.f59787a.f59745e = i4;
                    this.f59787a.f59746f = (long) d2;
                    this.f59787a.f59749i = e.this.r;
                    if (e.this.f59778h != null) {
                        e.this.f59778h.a(this.f59787a);
                    }
                }
            };
            if (cVar.b()) {
                z2 = true;
                recordInvoker.setFrameCallback(r1, z2, i2);
            }
        }
        z2 = false;
        recordInvoker.setFrameCallback(r1, z2, i2);
    }

    public final void b(String str, String str2) {
        this.f59779i.setRenderCacheString(str, str2);
    }

    public final void a(RecordInvoker.OnRunningErrorCallback onRunningErrorCallback) {
        this.f59779i.setRunningErrorCallback(onRunningErrorCallback);
    }

    public final void a(com.ss.android.medialib.listener.a aVar) {
        this.f59779i.setFaceDetectListener2(aVar);
    }

    public final void a(com.ss.android.medialib.listener.b bVar) {
        this.f59779i.setNativeInitListener2(bVar);
    }

    public final void a(IStickerRequestCallback iStickerRequestCallback) {
        this.f59779i.setStickerRequestCallback(iStickerRequestCallback);
    }

    public final int a(String[] strArr, int i2) {
        return this.f59779i.setComposerNodes(strArr, 0);
    }

    public final int a(int i2, String[] strArr, String[] strArr2, float[] fArr) {
        return this.f59779i.updateMultiComposerNodes(2, strArr, strArr2, fArr);
    }

    public final int b(String[] strArr, int i2) {
        return this.f59779i.appendComposerNodes(strArr, i2);
    }

    public final void a(com.ss.android.medialib.listener.c cVar) {
        this.f59779i.addSlamDetectListener2(cVar);
    }

    public final void b(com.ss.android.medialib.listener.c cVar) {
        this.f59779i.removeSlamDetectListener2(cVar);
    }

    public final int a(VEEffectParams vEEffectParams) {
        return this.f59779i.setVEEffectParams(vEEffectParams);
    }

    public final boolean a(bh bhVar, int i2) {
        return this.f59779i.processTouchEvent(bhVar, i2);
    }

    public final int a(boolean z2, String str) {
        if (!this.f59782l || this.f59781k) {
            return this.f59779i.setEnableAEC(z2, str);
        }
        return -1;
    }

    public final int a(boolean z2, int i2) {
        return this.f59779i.setLoudness(z2, i2);
    }

    public final void a(Object obj) {
        this.f59779i.attachExtFrameData(obj);
    }

    public final void a(VEBaseRecorderLensParams vEBaseRecorderLensParams, RecordInvoker.OnLensResultCallback onLensResultCallback) {
        this.f59779i.setLensParams(vEBaseRecorderLensParams, onLensResultCallback);
    }

    public final void a(int i2, boolean z2) {
        this.f59779i.enableLensProcess(24, z2);
    }

    public final void a(int i2, VESafeAreaParams[] vESafeAreaParamsArr) {
        this.f59779i.setSafeArea(i2, vESafeAreaParamsArr);
    }

    public final void a(boolean z2, String str, String str2) {
        this.f59779i.enableAudioAlgorithmParam(z2, str, str2);
    }

    public final void a(boolean z2, double d2) {
        this.f59779i.enableAudioLoudnessBalanceFilter(z2, d2);
    }

    public final void b(boolean z2, String str, String str2) {
        this.f59779i.enableBachAlgorithm(z2, str, str2);
    }

    public final boolean a(Context context, AudioManagerCallback audioManagerCallback) {
        Pair<Integer, Integer> a2 = com.ss.android.medialib.c.a.a(context);
        return this.f59779i.setEffectAudioManagerCallback(((Integer) a2.first).intValue(), ((Integer) a2.second).intValue(), false, audioManagerCallback);
    }

    public final void a(VEARCoreParam vEARCoreParam) {
        this.f59779i.setARCoreParam(vEARCoreParam);
    }

    public final void a(String str, Map<Integer, Float> map) {
        this.f59779i.setReshapeResource(str);
        if (map != null) {
            for (Map.Entry<Integer, Float> entry : map.entrySet()) {
                b(entry.getKey().intValue(), entry.getValue().floatValue());
            }
        }
    }

    public final int A() {
        return this.f59779i.pauseRender();
    }

    public final int B() {
        return this.f59779i.startRender();
    }

    public final int D() {
        return this.f59779i.turnToOffScreenRender();
    }

    public final VEMapBufferInfo E() {
        return this.f59779i.getMapBuffer();
    }

    public final void F() {
        this.f59779i.onDestroy();
    }

    public final long f() {
        return this.f59779i.getEndFrameTime();
    }

    public final int h() {
        return this.f59779i.getLastRecordFrameNum();
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public void lackPermission() {
        AudioRecorderInterface audioRecorderInterface = this.f59776f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.lackPermission();
        }
    }

    public final int m() {
        return this.f59779i.stopPrePlay();
    }

    public final void o() {
        this.f59779i.setModeChangeState(2);
    }

    public final void p() {
        this.f59779i.releaseGPUResources();
    }

    public final void s() {
        this.f59779i.setSwitchEffectInGLTask(true);
    }

    public final void t() {
        this.f59779i.unRegisterFaceResultCallback();
    }

    public final EnigmaResult u() {
        return this.f59779i.getEnigmaResult();
    }

    public final void v() {
        this.f59779i.registerSkeletonDetectCallback(null);
    }

    public final int x() {
        return this.f59779i.bindEffectAudioProcessor(0, 0, false);
    }

    static {
        Covode.recordClassIndex(36937);
    }

    public final long C() {
        return this.f59779i.getEffectHandler();
    }

    public final float b() {
        return this.f59779i.getReactionCamRotation();
    }

    public final long g() {
        return this.f59779i.getLastAudioLength();
    }

    public final void w() {
        a((c) null, -1);
    }

    public final float[] z() {
        return this.f59779i.getAECSuggestVolume();
    }

    private synchronized void G() {
        MethodCollector.i(3095);
        this.f59779i.clearFragFile();
        MethodCollector.o(3095);
    }

    private boolean I() {
        if (this.f59775e) {
            com.ss.android.medialib.a.b bVar = this.v;
            if (bVar == null || !bVar.b()) {
                return false;
            }
            return true;
        }
        BufferedAudioRecorder bufferedAudioRecorder = this.f59772b;
        if (bufferedAudioRecorder == null || !bufferedAudioRecorder.isProcessing()) {
            return false;
        }
        return true;
    }

    private void J() {
        BufferedAudioRecorder bufferedAudioRecorder;
        if (!this.f59775e && (bufferedAudioRecorder = this.f59772b) != null) {
            bufferedAudioRecorder.attachRecordingObserver(new androidx.lifecycle.u<Boolean>() {
                /* class com.ss.android.medialib.presenter.e.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(36942);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    e.this.t = bool.booleanValue();
                    an.b(e.f59771a, "change audio recording state: " + e.this.t);
                }
            });
        }
    }

    public static int y() {
        u.d a2 = u.a().a("ve_audio_source_type");
        if (a2 == null || !(a2.f151496b instanceof Integer)) {
            return 1;
        }
        return ((Integer) a2.f151496b).intValue();
    }

    public final String[] j() {
        return this.f59779i.getRecordedVideoPaths();
    }

    public final synchronized void l() {
        MethodCollector.i(3101);
        H();
        MethodCollector.o(3101);
    }

    public final void n() {
        if (!this.f59775e && this.f59772b != null && I()) {
            this.f59772b.waitUtilAudioProcessDone();
        }
    }

    public final void q() {
        BufferedAudioRecorder bufferedAudioRecorder;
        if (!this.f59775e && (bufferedAudioRecorder = this.f59772b) != null) {
            bufferedAudioRecorder.stopRecording();
        }
        this.f59779i.stopPlay();
        n();
    }

    public final void r() {
        if (!this.f59775e) {
            BufferedAudioRecorder bufferedAudioRecorder = this.f59772b;
            if (bufferedAudioRecorder != null) {
                bufferedAudioRecorder.stopRecording();
                return;
            }
            return;
        }
        this.v.a();
    }

    public final void e() {
        this.f59779i.uninitBeautyPlay();
    }

    public final void i() {
        MethodCollector.i(3097);
        synchronized (this) {
            try {
                if (I()) {
                    an.d(f59771a, "Audio processing, will delete after nativeCloseWavFile");
                    this.L = true;
                    return;
                }
                an.a(f59771a, "Delete last frag now");
                this.f59779i.deleteLastFrag();
                MethodCollector.o(3097);
            } finally {
                MethodCollector.o(3097);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k() {
        /*
            r3 = this;
            boolean r0 = r3.f59782l
            if (r0 == 0) goto L_0x000b
            boolean r1 = r3.s
            boolean r0 = r3.f59781k
            r1 = r1 & r0
            r3.s = r1
        L_0x000b:
            boolean r2 = r3.f59775e
            r1 = 1
            r0 = 0
            if (r2 == 0) goto L_0x001a
            boolean r0 = r3.s
            if (r0 == 0) goto L_0x0023
            com.ss.android.medialib.a.b r0 = r3.v
            if (r0 == 0) goto L_0x0023
        L_0x0019:
            return r1
        L_0x001a:
            boolean r0 = r3.s
            if (r0 == 0) goto L_0x0023
            org.libsdl.app.BufferedAudioRecorder r0 = r3.f59772b
            if (r0 == 0) goto L_0x0023
            goto L_0x0019
        L_0x0023:
            r1 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.presenter.e.k():boolean");
    }

    private synchronized int H() {
        MethodCollector.i(3506);
        if (this.R) {
            this.T = false;
        }
        if (this.I.get()) {
            MethodCollector.o(3506);
            return -1;
        }
        this.I.getAndSet(true);
        int stopRecord = this.f59779i.stopRecord(false);
        if (this.f59775e) {
            com.ss.android.medialib.a.b bVar = this.v;
            if (bVar != null && !this.O) {
                bVar.a();
                this.P.getAndSet(-1);
            }
        } else {
            BufferedAudioRecorder bufferedAudioRecorder = this.f59772b;
            if (bufferedAudioRecorder != null && !this.O) {
                bufferedAudioRecorder.stopFeeding();
            }
        }
        this.I.getAndSet(false);
        TEMonitorInvoker.nativeMonitorPerfWithType(0);
        MethodCollector.o(3506);
        return stopRecord;
    }

    public e() {
        RecordInvoker recordInvoker = new RecordInvoker();
        this.f59779i = recordInvoker;
        recordInvoker.resetPerfStats();
        this.f59780j = new g(this.f59779i);
    }

    public final int[] d() {
        return this.f59779i.getReactionPosMarginInViewPixel();
    }

    public final int[] c() {
        return this.f59779i.getReactionCameraPosInViewPixel();
    }

    public final int C(boolean z2) {
        return this.f59779i.enableDuetGlFinish(z2);
    }

    public final float c(String str) {
        return this.f59779i.getFilterIntensity(str);
    }

    public final int d(float f2) {
        return b(12, f2);
    }

    public final int g(int i2) {
        return this.f59779i.setCodecType(i2);
    }

    public final void k(boolean z2) {
        this.f59779i.setCameraClose(z2);
    }

    public final boolean n(boolean z2) {
        return this.f59779i.setSharedTextureStatus(z2);
    }

    public final void q(boolean z2) {
        this.f59779i.setCameraFirstFrameOptimize(z2);
    }

    public final int r(boolean z2) {
        return this.f59779i.slamNotifyHideKeyBoard(z2);
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public void recordStatus(boolean z2) {
        AudioRecorderInterface audioRecorderInterface = this.f59776f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.recordStatus(z2);
        }
    }

    public final int w(boolean z2) {
        return this.f59779i.setHandDetectLowpower(z2);
    }

    public final void y(boolean z2) {
        this.f59779i.enableLandMark(z2);
    }

    public final void z(boolean z2) {
        RecordInvoker recordInvoker = this.f59779i;
        if (recordInvoker != null) {
            recordInvoker.setEnableDuetV2(z2);
        }
    }

    public final void A(boolean z2) {
        this.f59779i.setBgmMute(z2);
    }

    public final int B(boolean z2) {
        return this.f59779i.enableRecordMaxDuration(z2);
    }

    public final void D(boolean z2) {
        this.f59779i.setUseMultiPreviewRatio(z2);
    }

    public final int e(int i2) {
        return this.f59779i.initImageDrawer(i2);
    }

    public final ImageFrame f(String str) {
        return this.f59779i.getFrameByKey(str);
    }

    public final int h(int i2) {
        return this.f59779i.setRecordMode(i2);
    }

    public final void i(boolean z2) {
        this.f59779i.enableTimestampCallback(z2);
    }

    public final void j(boolean z2) {
        this.f59779i.enableAutoTestLog(z2);
    }

    public final void l(boolean z2) {
        RecordInvoker recordInvoker = this.f59779i;
        if (recordInvoker != null) {
            recordInvoker.setDetectionMode(z2);
        }
    }

    public final void o(boolean z2) {
        this.f59779i.enablePBO(z2);
    }

    public final void p(boolean z2) {
        this.f59779i.enableWaterMark(z2);
    }

    public final void s(boolean z2) {
        this.f59779i.pauseEffectAudio(z2);
    }

    public final void t(boolean z2) {
        this.f59779i.enableEffectBGM(z2);
    }

    public final void u(boolean z2) {
        this.f59779i.enableEffect(z2);
    }

    public final void v(boolean z2) {
        this.f59779i.setRecordContentType(z2);
    }

    public final void x(boolean z2) {
        this.f59779i.useLargeMattingModel(z2);
    }

    public final int b(double d2) {
        return this.f59779i.onDrawFrameTime(d2);
    }

    public final int d(String str) {
        return this.f59779i.slamSetLanguge(str);
    }

    public final int e(String str) {
        return this.f59779i.setMusicNodes(str);
    }

    public final void f(int i2) {
        this.f59779i.setForceAlgorithmCnt(i2);
    }

    public final void m(boolean z2) {
        BufferedAudioRecorder bufferedAudioRecorder;
        BufferedAudioRecorder bufferedAudioRecorder2;
        if (!z2) {
            if (!this.f59775e && (bufferedAudioRecorder2 = this.f59772b) != null) {
                bufferedAudioRecorder2.unInit();
            }
        } else if (!this.f59775e && (bufferedAudioRecorder = this.f59772b) != null) {
            bufferedAudioRecorder.init(y());
        }
        this.s = z2;
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public int closeWavFile(boolean z2) {
        int closeWavFile;
        MethodCollector.i(3792);
        synchronized (this) {
            try {
                closeWavFile = this.f59779i.closeWavFile(z2);
                AudioRecorderInterface audioRecorderInterface = this.f59776f;
                if (audioRecorderInterface != null) {
                    audioRecorderInterface.closeWavFile(z2);
                }
                if (this.L) {
                    this.f59779i.deleteLastFrag();
                }
                this.L = false;
                an.a(f59771a, "closeWavFile");
            } finally {
                MethodCollector.o(3792);
            }
        }
        return closeWavFile;
    }

    public final void f(boolean z2) {
        this.f59779i.enableMakeUpBackground(z2);
    }

    public final void g(boolean z2) {
        this.f59779i.enableClearColorAfterRender(z2);
    }

    public final void h(boolean z2) {
        this.f59775e = z2;
        if (z2) {
            this.v = new com.ss.android.medialib.a.b(this);
        } else {
            this.v = null;
        }
    }

    public final void d(int i2) {
        this.f59779i.setDetectInterval(i2);
    }

    public final int b(long j2) {
        return this.f59779i.setRecordMaxDuration(j2);
    }

    public final void c(float f2) {
        this.f59779i.setScale(f2);
    }

    public final void d(boolean z2) {
        this.f59779i.enablePreloadEffectRes(z2);
    }

    public final void e(boolean z2) {
        this.f59779i.enableEffectRT(z2);
    }

    public final int b(Context context) {
        boolean z2;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || !packageManager.hasSystemFeature("android.hardware.audio.low_latency")) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str = f59771a;
        an.b(str, "has low latency ? ".concat(String.valueOf(z2)));
        Pair<Integer, Integer> a2 = com.ss.android.medialib.c.a.a(context);
        an.b(str, "nativeSampleRate ? " + a2.first + " nativeSamleBufferSize? " + a2.second);
        return this.f59779i.bindEffectAudioProcessor(((Integer) a2.first).intValue(), ((Integer) a2.second).intValue(), true);
    }

    public final void c(int i2) {
        this.f59779i.changePreviewRadioMode(i2);
    }

    public final void c(boolean z2) {
        this.f59779i.enable3buffer(z2);
    }

    private int b(int i2, float f2) {
        return this.f59779i.setIntensityByType(i2, f2);
    }

    public final int a(int i2, float f2) {
        return b(i2, f2);
    }

    public final int e(float f2, float f3) {
        return this.f59779i.slamProcessDoubleClickEvent(f2, f3);
    }

    public final int i(int i2, int i3) {
        return this.f59779i.removeTrack(i2, i3);
    }

    public final int j(int i2, int i3) {
        return this.f59779i.setComposerMode(i2, 0);
    }

    public final int d(float f2, float f3) {
        return this.f59779i.slamProcessRotationEvent(f2, f3);
    }

    public final int c(float f2, float f3) {
        return this.f59779i.slamProcessScaleEvent(f2, f3);
    }

    public final void g(int i2, int i3) {
        this.f59779i.setCamPreviewSize(i2, i3);
    }

    public final int h(int i2, int i3) {
        return this.f59779i.startPlay(i2, i3, Build.DEVICE, -1, -1);
    }

    public final int c(String[] strArr, int i2) {
        return this.f59779i.removeComposerNodes(strArr, i2);
    }

    public final int d(String str, String str2) {
        if (str2 != null) {
            return this.f59779i.animateImageToPreview(str, str2);
        }
        an.d(f59771a, "Illegal argument. imagePath can't be null. Consider using empty string to cancel.");
        return -100;
    }

    public final int b(float f2, float f3) {
        return this.f59779i.processTouchEvent(f2, f3);
    }

    public final e c(int i2, int i3) {
        this.K = i2;
        this.J = i3;
        return this;
    }

    public final void e(int i2, int i3) {
        this.f59779i.setReactionBorderParam(i2, i3);
    }

    public final boolean f(int i2, int i3) {
        return this.f59779i.posInReactionRegion(i2, i3);
    }

    public final int[] d(int i2, int i3) {
        return this.f59779i.updateReactionCameraPos(0, 0, i2, i3);
    }

    public final synchronized int a(int i2, String str) {
        int tryRestore;
        MethodCollector.i(3094);
        G();
        tryRestore = this.f59779i.tryRestore(i2, str);
        MethodCollector.o(3094);
        return tryRestore;
    }

    public final int[] c(String str, String str2) {
        return this.f59779i.checkComposerNodeExclusion(str, str2);
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public int initWavFile(int i2, int i3, double d2) {
        int initWavFile = this.f59779i.initWavFile(i2, i3, d2);
        AudioRecorderInterface audioRecorderInterface = this.f59776f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.initWavFile(i2, i3, d2);
            an.a(f59771a, "initWavFile");
        }
        return initWavFile;
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public int addPCMData(byte[] bArr, int i2, long j2) {
        if (this.f59775e) {
            an.b(f59771a, "onProcessData is running");
            this.f59779i.addPCMData(bArr, i2, j2);
            return 0;
        }
        if (this.R && !this.T && this.S != null) {
            this.S.addLastSafe(new a(Arrays.copyOf(bArr, i2), i2));
        }
        this.f59779i.onAudioCallback(bArr, i2);
        AudioRecorderInterface audioRecorderInterface = this.f59776f;
        if (audioRecorderInterface == null) {
            return 0;
        }
        audioRecorderInterface.addPCMData(bArr, i2, j2);
        an.b(f59771a, "addPCMData is running");
        return 0;
    }

    public final int a(int i2, int i3, long j2) {
        return this.f59779i.seekTrack(i2, i3, j2);
    }

    @Override // org.libsdl.app.AudioRecorderInterfaceExt, com.ss.android.medialib.a.a.AbstractC1300a
    public int onProcessData(byte[] bArr, int i2, long j2) {
        an.b(f59771a, "onProcessData is running");
        if (this.R) {
            if (!this.T && this.S != null) {
                for (int i3 = 0; i3 < this.S.getMaxSize(); i3++) {
                    a pollSafe = this.S.pollSafe();
                    if (pollSafe != null) {
                        this.f59779i.addPCMData(pollSafe.f59770b, pollSafe.f59769a, 0);
                        an.b(f59771a, "cached buffer in");
                    }
                }
            }
            this.T = true;
        }
        return this.f59779i.addPCMData(bArr, i2, j2);
    }

    public final synchronized int b(Context context, int i2, AudioRecorderInterface audioRecorderInterface) {
        BufferedAudioRecorder bufferedAudioRecorder;
        MethodCollector.i(6298);
        if (this.f59772b == null && this.s && (i2 & 1) != 0) {
            an.a(f59771a, "changeAudioRecord make sure audioRecorder will be created here !!");
        }
        int i3 = this.f59773c;
        if (i3 == i2) {
            an.c(f59771a, "changeAudioRecord: no need");
            MethodCollector.o(6298);
            return 1;
        } else if (context == null) {
            an.d(f59771a, "file " + an.a() + ",fun " + an.c() + ",line " + an.b() + ": context is null");
            MethodCollector.o(6298);
            return -1000;
        } else {
            this.f59776f = audioRecorderInterface;
            int i4 = -2000;
            if ((i3 & 1 & i2) == 0 && !this.f59775e && (bufferedAudioRecorder = this.f59772b) != null) {
                bufferedAudioRecorder.unInit();
                this.f59772b = null;
                an.a(f59771a, "changeAudioRecord: mAudioRecorder.unInit()");
            }
            if (this.s && (i2 & 1) != 0 && !this.f59775e && this.f59772b == null) {
                BufferedAudioRecorder bufferedAudioRecorder2 = new BufferedAudioRecorder(this, this.o, this.p, this.q, this.u);
                this.f59772b = bufferedAudioRecorder2;
                bufferedAudioRecorder2.init(y());
                J();
                an.a(f59771a, "changeAudioRecord: mAudioRecorder.init()");
            }
            if ((i2 & 4) != 0) {
                this.f59779i.setBGMVolume(this.M, -1);
                i4 = this.f59779i.initAudioPlayer(context, this.D, this.G + this.E, this.f59774d, this.f59783m);
                an.a(f59771a, "changeAudioRecord: initAudioPlayer return: ".concat(String.valueOf(i4)));
            } else {
                this.f59779i.uninitAudioPlayer();
                a(0);
            }
            this.f59773c = i2;
            MethodCollector.o(6298);
            return i4;
        }
    }

    public final int b(String str, float f2, float f3) {
        return this.f59779i.setFaceMakeUp(str, f2, f3);
    }

    public final int b(String str, String str2, float f2) {
        return this.f59779i.updateComposerNode(str, str2, f2);
    }

    public final int a(double d2, double d3, double d4, double d5) {
        return this.f59779i.slamProcessIngestAcc(d2, d3, d4, d5);
    }

    public final int c(double d2, double d3, double d4, double d5) {
        return this.f59779i.slamProcessIngestGra(d2, d3, d4, d5);
    }

    public final int a(int i2, float f2, float f3, int i3) {
        return this.f59779i.slamProcessTouchEventByType(i2, f2, f3, i3);
    }

    public final int b(double d2, double d3, double d4, double d5) {
        return this.f59779i.slamProcessIngestGyr(d2, d3, d4, d5);
    }

    public final int a(float f2, float f3, float f4, float f5, float f6) {
        return this.f59779i.slamProcessPanEvent(f2, f3, f4, f5, f6);
    }

    @Override // org.libsdl.app.AudioRecorderInterfaceExt
    public int initAudioConfig(int i2, int i3, int i4, int i5, int i6) {
        an.a(f59771a, "initAudioConfig");
        a aVar = this.f59777g;
        if (aVar != null) {
            aVar.a(i2, i3);
        }
        return this.f59779i.initAudioConfig(i2, i3, i4, i5, i6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r6 > 0) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(double r21, boolean r23, float r24, int r25, java.lang.String r26, java.lang.String r27) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.presenter.e.a(double, boolean, float, int, java.lang.String, java.lang.String):int");
    }

    public final int a(int i2, String str, int i3, int i4, String str2, String[] strArr, float[] fArr, boolean z2, boolean z3) {
        return this.f59779i.setStickerPathWithTag(i2, str, i3, i4, str2, strArr, fArr, z2, z3);
    }

    public final int a(int i2, int i3, String str, int i4, int i5, String str2, int i6, boolean z2, boolean z3, boolean z4) {
        MethodCollector.i(6387);
        String str3 = f59771a;
        an.b(str3, "init enter ");
        com.ss.android.medialib.h.a().f59725a = this.f59779i;
        TEMonitorInvoker.nativeReset(0);
        h.a(0);
        int initBeautyPlay = this.f59779i.initBeautyPlay(i2, i3, str, i4, i5, str2, i6, z2, z3, z4);
        this.f59779i.setTextureTimeListener(this.W);
        RecordInvoker.setRecordStopCallback(new RecordInvoker.a() {
            /* class com.ss.android.medialib.presenter.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36938);
            }

            @Override // com.ss.android.medialib.RecordInvoker.a
            public final void a() {
                if (!e.this.f59775e && e.this.f59772b != null) {
                    e.this.f59772b.markRecordStop();
                }
            }
        });
        an.b(str3, "init ret = ".concat(String.valueOf(initBeautyPlay)));
        MethodCollector.o(6387);
        return initBeautyPlay;
    }

    public final int a(int i2, long j2, float f2, int i3, int i4, int i5, int i6, float f3, int i7, int i8, int i9, int i10, int i11, int i12, boolean z2, int i13) {
        return this.f59779i.setDisplaySettings(i2, j2, f2, i3, i4, i5, i6, f3, i7, i8, i9, i10, i11, i12, z2, i13);
    }
}

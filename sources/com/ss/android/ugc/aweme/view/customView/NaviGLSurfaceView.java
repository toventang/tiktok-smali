package com.ss.android.ugc.aweme.view.customView;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.Surface;
import com.bef.effectsdk.BEFEffectNative;
import com.bef.effectsdk.OpenGLUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class NaviGLSurfaceView extends GLSurfaceView implements SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer {

    /* renamed from: a  reason: collision with root package name */
    Surface f144156a;

    /* renamed from: b  reason: collision with root package name */
    SurfaceTexture f144157b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f144158c;

    /* renamed from: d  reason: collision with root package name */
    public final Semaphore f144159d = new Semaphore(1);

    /* renamed from: e  reason: collision with root package name */
    public CameraDevice f144160e;

    /* renamed from: f  reason: collision with root package name */
    public CameraCaptureSession f144161f;

    /* renamed from: g  reason: collision with root package name */
    public CaptureRequest.Builder f144162g;

    /* renamed from: h  reason: collision with root package name */
    private final String f144163h = NaviGLSurfaceView.class.getSimpleName();

    /* renamed from: i  reason: collision with root package name */
    private boolean f144164i;

    /* renamed from: j  reason: collision with root package name */
    private int f144165j;

    /* renamed from: k  reason: collision with root package name */
    private int[] f144166k = new int[1];

    /* renamed from: l  reason: collision with root package name */
    private final int[] f144167l = new int[10];

    /* renamed from: m  reason: collision with root package name */
    private final float[] f144168m = new float[10];
    private final float[] n = new float[10];
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private HandlerThread t;
    private String u = "0";
    private a v;

    public static final class a extends CameraCaptureSession.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NaviGLSurfaceView f144169a;

        static {
            Covode.recordClassIndex(94348);
        }

        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            l.d(cameraCaptureSession, "");
        }

        /* renamed from: com.ss.android.ugc.aweme.view.customView.NaviGLSurfaceView$a$a  reason: collision with other inner class name */
        public static final class C3841a extends CameraCaptureSession.CaptureCallback {
            static {
                Covode.recordClassIndex(94349);
            }

            C3841a() {
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(NaviGLSurfaceView naviGLSurfaceView) {
            this.f144169a = naviGLSurfaceView;
        }

        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            l.d(cameraCaptureSession, "");
            if (this.f144169a.f144160e != null) {
                this.f144169a.f144161f = cameraCaptureSession;
                try {
                    CaptureRequest.Builder builder = this.f144169a.f144162g;
                    if (builder == null) {
                        l.b();
                    }
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
                    CaptureRequest.Builder builder2 = this.f144169a.f144162g;
                    if (builder2 == null) {
                        l.b();
                    }
                    builder2.set(CaptureRequest.CONTROL_AE_MODE, 2);
                    C3841a aVar = new C3841a();
                    CameraCaptureSession cameraCaptureSession2 = this.f144169a.f144161f;
                    if (cameraCaptureSession2 == null) {
                        l.b();
                    }
                    CaptureRequest.Builder builder3 = this.f144169a.f144162g;
                    if (builder3 == null) {
                        l.b();
                    }
                    cameraCaptureSession2.setRepeatingRequest(builder3.build(), aVar, this.f144169a.f144158c);
                } catch (CameraAccessException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(94347);
    }

    public final int getGLVersion() {
        return this.f144165j;
    }

    public final a getNaviManager() {
        return this.v;
    }

    public final void onResume() {
        super.onResume();
        if (this.r && Build.VERSION.SDK_INT >= 21) {
            setCameraHW(true);
        }
    }

    private final void a() {
        try {
            int i2 = Build.VERSION.SDK_INT;
            HandlerThread handlerThread = this.t;
            if (handlerThread == null) {
                l.b();
            }
            handlerThread.quitSafely();
            HandlerThread handlerThread2 = this.t;
            if (handlerThread2 == null) {
                l.b();
            }
            handlerThread2.join();
            this.t = null;
            this.f144158c = null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void onPause() {
        try {
            if (this.r && Build.VERSION.SDK_INT >= 21) {
                setCameraHW(false);
            }
            a aVar = this.v;
            if (aVar == null) {
                l.b();
            }
            aVar.c();
            a aVar2 = this.v;
            if (aVar2 == null) {
                l.b();
            }
            aVar2.e();
            a aVar3 = this.v;
            if (aVar3 == null) {
                l.b();
            }
            aVar3.b();
            this.f144164i = false;
        } catch (NullPointerException e2) {
            if (e2.getMessage() == null) {
                l.b();
            }
        }
        super.onPause();
    }

    public final void setMultiTouchEnabled(boolean z) {
        this.p = z;
    }

    public final void setPaused(boolean z) {
        this.o = z;
    }

    public final void setTouchEnabled(boolean z) {
        this.q = z;
    }

    public static final class b extends CameraDevice.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NaviGLSurfaceView f144170a;

        static {
            Covode.recordClassIndex(94350);
        }

        private static void a(CameraDevice cameraDevice) {
            if (!((Boolean) com.bytedance.helios.sdk.a.a(cameraDevice, new Object[0], 100201, "void", false, null).first).booleanValue()) {
                com.bytedance.helios.sdk.a.a(null, cameraDevice, new Object[0], 100205, "com_ss_android_ugc_aweme_view_customView_NaviGLSurfaceView$setCameraHW$1_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
                cameraDevice.close();
                com.bytedance.helios.sdk.a.a(null, cameraDevice, new Object[0], 100201, "com_ss_android_ugc_aweme_view_customView_NaviGLSurfaceView$setCameraHW$1_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(NaviGLSurfaceView naviGLSurfaceView) {
            this.f144170a = naviGLSurfaceView;
        }

        public final void onDisconnected(CameraDevice cameraDevice) {
            l.d(cameraDevice, "");
            this.f144170a.f144159d.release();
            a(cameraDevice);
            this.f144170a.f144160e = null;
        }

        public final void onOpened(CameraDevice cameraDevice) {
            if (!((Boolean) com.bytedance.helios.sdk.a.a(this, new Object[]{cameraDevice}, 100200, "void", false, null).first).booleanValue()) {
                com.bytedance.helios.sdk.a.a(this, new Object[]{cameraDevice}, 100200, "onOpened(Landroid/hardware/camera2/CameraDevice;)V");
                l.d(cameraDevice, "");
                this.f144170a.f144160e = cameraDevice;
                NaviGLSurfaceView naviGLSurfaceView = this.f144170a;
                try {
                    SurfaceTexture surfaceTexture = naviGLSurfaceView.f144157b;
                    if (surfaceTexture == null) {
                        l.b();
                    }
                    surfaceTexture.setDefaultBufferSize(1920, 1080);
                    naviGLSurfaceView.f144156a = new Surface(naviGLSurfaceView.f144157b);
                    CameraDevice cameraDevice2 = naviGLSurfaceView.f144160e;
                    if (cameraDevice2 == null) {
                        l.b();
                    }
                    naviGLSurfaceView.f144162g = cameraDevice2.createCaptureRequest(1);
                    CaptureRequest.Builder builder = naviGLSurfaceView.f144162g;
                    if (builder == null) {
                        l.b();
                    }
                    Surface surface = naviGLSurfaceView.f144156a;
                    if (surface == null) {
                        l.b();
                    }
                    builder.addTarget(surface);
                    CameraDevice cameraDevice3 = naviGLSurfaceView.f144160e;
                    if (cameraDevice3 == null) {
                        l.b();
                    }
                    cameraDevice3.createCaptureSession(Arrays.asList(naviGLSurfaceView.f144156a), new a(naviGLSurfaceView), naviGLSurfaceView.f144158c);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }

        public final void onError(CameraDevice cameraDevice, int i2) {
            l.d(cameraDevice, "");
            this.f144170a.f144159d.release();
            a(cameraDevice);
            this.f144170a.f144160e = null;
        }
    }

    public final synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
        MethodCollector.i(3181);
        l.d(surfaceTexture, "");
        this.s = true;
        requestRender();
        MethodCollector.o(3181);
    }

    public final void setCamera(boolean z) {
        this.r = z;
        if (Build.VERSION.SDK_INT >= 21) {
            if (z) {
                Object a2 = a(getContext(), "camera");
                Objects.requireNonNull(a2, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
                CameraManager cameraManager = (CameraManager) a2;
                try {
                    String[] cameraIdList = cameraManager.getCameraIdList();
                    int length = cameraIdList.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        String str = cameraIdList[i2];
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                        l.b(cameraCharacteristics, "");
                        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                        if (num != null) {
                            if (num.intValue() == 0) {
                                l.b(str, "");
                                this.u = str;
                                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                                if (streamConfigurationMap == null) {
                                    l.b();
                                }
                                Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                                for (Size size : outputSizes) {
                                    l.b(size, "");
                                    if (1920 == size.getWidth() && 1080 == size.getHeight()) {
                                        break;
                                    }
                                }
                            }
                        }
                        i2++;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            setCameraHW(z);
        }
    }

    public final void setCameraHW(boolean z) {
        if (z) {
            Object a2 = a(getContext(), "camera");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            CameraManager cameraManager = (CameraManager) a2;
            try {
                HandlerThread handlerThread = new HandlerThread("CameraBackground");
                this.t = handlerThread;
                handlerThread.start();
                HandlerThread handlerThread2 = this.t;
                if (handlerThread2 == null) {
                    l.b();
                }
                this.f144158c = new Handler(handlerThread2.getLooper());
                cameraManager.openCamera(this.u, new b(this), (Handler) null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            try {
                this.f144159d.acquire();
                Surface surface = this.f144156a;
                if (surface != null) {
                    surface.release();
                    CaptureRequest.Builder builder = this.f144162g;
                    if (builder == null) {
                        l.b();
                    }
                    Surface surface2 = this.f144156a;
                    if (surface2 == null) {
                        l.b();
                    }
                    builder.removeTarget(surface2);
                }
                CameraCaptureSession cameraCaptureSession = this.f144161f;
                if (cameraCaptureSession != null) {
                    try {
                        cameraCaptureSession.stopRepeating();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    CameraCaptureSession cameraCaptureSession2 = this.f144161f;
                    if (cameraCaptureSession2 == null) {
                        l.b();
                    }
                    cameraCaptureSession2.close();
                    this.f144161f = null;
                }
                CameraDevice cameraDevice = this.f144160e;
                if (cameraDevice != null) {
                    if (!((Boolean) com.bytedance.helios.sdk.a.a(cameraDevice, new Object[0], 100201, "void", false, null).first).booleanValue()) {
                        com.bytedance.helios.sdk.a.a(null, cameraDevice, new Object[0], 100205, "com_ss_android_ugc_aweme_view_customView_NaviGLSurfaceView_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
                        cameraDevice.close();
                        com.bytedance.helios.sdk.a.a(null, cameraDevice, new Object[0], 100201, "com_ss_android_ugc_aweme_view_customView_NaviGLSurfaceView_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
                    }
                    this.f144160e = null;
                }
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            } catch (Throwable th) {
                a();
                this.f144159d.release();
                throw th;
            }
            a();
            this.f144159d.release();
        }
    }

    public final void onDrawFrame(GL10 gl10) {
        int i2;
        int i3;
        int i4;
        int i5;
        MethodCollector.i(3177);
        l.d(gl10, "");
        if (!this.f144164i || this.o) {
            MethodCollector.o(3177);
            return;
        }
        synchronized (this) {
            try {
                if (this.s) {
                    SurfaceTexture surfaceTexture = this.f144157b;
                    if (surfaceTexture == null) {
                        l.b();
                    }
                    surfaceTexture.updateTexImage();
                    this.s = false;
                }
            } finally {
                MethodCollector.o(3177);
            }
        }
        a aVar = this.v;
        if (aVar == null) {
            l.b();
        }
        boolean z = this.r;
        int i6 = this.f144166k[0];
        int[] iArr = aVar.M;
        if (iArr == null) {
            l.b();
        }
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glClearColor(aVar.f144182k, aVar.f144183l, aVar.f144184m, aVar.n);
        GLES20.glClear(16384);
        if (aVar.f144175d != null) {
            if (z) {
                if (aVar.p) {
                    GLES20.glViewport(0, 0, aVar.f144178g, aVar.f144179h);
                    int[] iArr2 = aVar.T;
                    if (iArr2 == null) {
                        l.b();
                    }
                    aVar.a(i6, iArr2[0], 1.0f);
                } else {
                    float f2 = ((float) (aVar.f144177f * aVar.f144181j)) / ((float) (aVar.f144176e * aVar.f144180i));
                    GLES20.glViewport(0, 0, aVar.f144176e, aVar.f144177f);
                    int[] iArr3 = aVar.Q;
                    if (iArr3 == null) {
                        l.b();
                    }
                    aVar.a(i6, iArr3[0], f2);
                }
                GLES20.glFlush();
            }
            if (aVar.p) {
                int[] iArr4 = aVar.U;
                if (iArr4 == null) {
                    l.b();
                }
                i2 = iArr4[0];
            } else {
                int[] iArr5 = aVar.R;
                if (iArr5 == null) {
                    l.b();
                }
                i2 = iArr5[0];
            }
            if (aVar.p) {
                i3 = aVar.f144178g;
            } else {
                i3 = aVar.f144176e;
            }
            if (aVar.p) {
                i4 = aVar.f144179h;
            } else {
                i4 = aVar.f144177f;
            }
            double nanoTime = (double) System.nanoTime();
            Double.isNaN(nanoTime);
            double d2 = nanoTime / 1.0E9d;
            BEFEffectNative.processAlgorithm(aVar.f144173b, i2, i3, i4, d2);
            if (aVar.p) {
                long j2 = aVar.f144173b;
                int[] iArr6 = aVar.U;
                if (iArr6 == null) {
                    l.b();
                }
                int i7 = iArr6[0];
                int[] iArr7 = aVar.P;
                if (iArr7 == null) {
                    l.b();
                }
                BEFEffectNative.processFrame(j2, i7, iArr7[0], aVar.f144178g, aVar.f144179h, d2);
            } else {
                if (aVar.q) {
                    int[] iArr8 = aVar.R;
                    if (iArr8 == null) {
                        l.b();
                    }
                    i5 = iArr8[0];
                } else {
                    int[] iArr9 = aVar.N;
                    if (iArr9 == null) {
                        l.b();
                    }
                    i5 = iArr9[0];
                }
                long j3 = aVar.f144173b;
                int[] iArr10 = aVar.P;
                if (iArr10 == null) {
                    l.b();
                }
                BEFEffectNative.processFrame(j3, i5, iArr10[0], aVar.f144176e, aVar.f144177f, d2);
            }
        } else {
            GLES20.glViewport(0, 0, aVar.f144176e, aVar.f144177f);
            int[] iArr11 = aVar.N;
            if (iArr11 == null) {
                l.b();
            }
            int i8 = iArr11[0];
            int[] iArr12 = aVar.O;
            if (iArr12 == null) {
                l.b();
            }
            aVar.a(i8, iArr12[0], 0.0f);
        }
        if (aVar.t) {
            GLES20.glViewport(0, 0, aVar.u, aVar.v);
            int[] iArr13 = aVar.P;
            if (iArr13 == null) {
                l.b();
            }
            int i9 = iArr13[0];
            int[] iArr14 = aVar.S;
            if (iArr14 == null) {
                l.b();
            }
            aVar.a(i9, iArr14[0], 0.0f);
            GLES20.glFlush();
        }
        if (aVar.o) {
            GLES20.glViewport(0, 0, aVar.f144176e, aVar.f144177f);
            int[] iArr15 = aVar.P;
            if (iArr15 == null) {
                l.b();
            }
            aVar.a(iArr15[0], 0, 0.0f);
            GLES20.glFlush();
        }
        if (aVar.t) {
            aVar.f144172a.lock();
            if (aVar.t && aVar.w != null) {
                int[] iArr16 = aVar.S;
                if (iArr16 == null) {
                    l.b();
                }
                GLES20.glBindFramebuffer(36160, iArr16[0]);
                Bitmap a2 = a.a(aVar.u, aVar.v, true);
                List<ByteArrayOutputStream> list = aVar.w;
                if (list == null) {
                    l.b();
                }
                int size = list.size();
                List<ByteArrayOutputStream> list2 = aVar.w;
                if (list2 == null) {
                    l.b();
                }
                list2.add(new ByteArrayOutputStream());
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                List<ByteArrayOutputStream> list3 = aVar.w;
                if (list3 == null) {
                    l.b();
                }
                a2.compress(compressFormat, 90, list3.get(size));
            }
            aVar.f144172a.unlock();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (!this.q) {
            return super.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > 10) {
            pointerCount = 10;
        }
        for (int i2 = 0; i2 < pointerCount; i2++) {
            this.f144167l[i2] = motionEvent.getPointerId(i2);
            this.f144168m[i2] = motionEvent.getX(i2);
            this.n[i2] = motionEvent.getY(i2);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            a(this.f144168m, this.n, 1);
            int[] iArr = {this.f144167l[0]};
            float[] fArr = {this.f144168m[0]};
            float[] fArr2 = {this.n[0]};
            a aVar = this.v;
            if (aVar == null) {
                l.b();
            }
            aVar.a(iArr, fArr, fArr2);
        } else if (action == 1) {
            a(this.f144168m, this.n, 1);
            int[] iArr2 = {this.f144167l[0]};
            float[] fArr3 = {this.f144168m[0]};
            float[] fArr4 = {this.n[0]};
            a aVar2 = this.v;
            if (aVar2 == null) {
                l.b();
            }
            aVar2.c(iArr2, fArr3, fArr4);
        } else if (action == 2) {
            a(this.f144168m, this.n, pointerCount);
            if (!this.p) {
                int[] iArr3 = {this.f144167l[0]};
                float[] fArr5 = {this.f144168m[0]};
                float[] fArr6 = {this.n[0]};
                a aVar3 = this.v;
                if (aVar3 == null) {
                    l.b();
                }
                aVar3.b(iArr3, fArr5, fArr6);
            } else {
                for (int i3 = 0; i3 < pointerCount; i3++) {
                    int[] iArr4 = {this.f144167l[i3]};
                    float[] fArr7 = {this.f144168m[i3]};
                    float[] fArr8 = {this.n[i3]};
                    a aVar4 = this.v;
                    if (aVar4 == null) {
                        l.b();
                    }
                    aVar4.b(iArr4, fArr7, fArr8);
                }
            }
        } else if (action == 5) {
            int action2 = motionEvent.getAction() >> 8;
            if (this.p || action2 == 0) {
                a(this.f144168m, this.n, pointerCount);
                int[] iArr5 = {this.f144167l[action2]};
                float[] fArr9 = {this.f144168m[action2]};
                float[] fArr10 = {this.n[action2]};
                a aVar5 = this.v;
                if (aVar5 == null) {
                    l.b();
                }
                aVar5.a(iArr5, fArr9, fArr10);
            }
        } else if (action == 6) {
            int action3 = motionEvent.getAction() >> 8;
            if (this.p || action3 == 0) {
                a(this.f144168m, this.n, pointerCount);
                int[] iArr6 = {this.f144167l[action3]};
                float[] fArr11 = {this.f144168m[action3]};
                float[] fArr12 = {this.n[action3]};
                a aVar6 = this.v;
                if (aVar6 == null) {
                    l.b();
                }
                aVar6.c(iArr6, fArr11, fArr12);
            }
        }
        return true;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3147);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(3147);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NaviGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        l.d(context, "");
        MethodCollector.i(3216);
        Object a2 = a(context, "activity");
        if (a2 != null) {
            if (((ActivityManager) a2).getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            this.f144165j = i2;
            setEGLContextClientVersion(i2);
            setZOrderOnTop(true);
            setEGLConfigChooser(8, 8, 8, 8, 16, 0);
            getHolder().setFormat(1);
            setRenderer(this);
            setRenderMode(1);
            this.v = new a();
            MethodCollector.o(3216);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        MethodCollector.o(3216);
        throw nullPointerException;
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        boolean z;
        l.d(gl10, "");
        l.d(eGLConfig, "");
        if (!this.f144164i) {
            a aVar = this.v;
            if (aVar == null) {
                l.b();
            }
            aVar.C = OpenGLUtils.loadProgram("attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4(vPosition.x, vPosition.y, 0.0, 1.0);\n}", "precision mediump float;\nuniform sampler2D sTexture;\nvarying vec2 texCoord;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, texCoord);\n}");
            aVar.D = GLES20.glGetAttribLocation(aVar.C, "vTexCoord");
            aVar.E = GLES20.glGetAttribLocation(aVar.C, "vPosition");
            aVar.F = GLES20.glGetUniformLocation(aVar.C, "sTexture");
            aVar.x = OpenGLUtils.loadProgram("attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4(vPosition.x, vPosition.y, 0.0, 1.0);\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sCamera;\nuniform float uCamera;\nvarying vec2 texCoord;\nvoid main() {\n  vec2 uv = texCoord;\n  float off = (1.0 - uCamera) / 2.0;\n  uv.x = uv.x * uCamera + off;\n  gl_FragColor = texture2D(sCamera, uv);\n}");
            aVar.A = GLES20.glGetAttribLocation(aVar.x, "vTexCoord");
            aVar.z = GLES20.glGetAttribLocation(aVar.x, "vPosition");
            aVar.y = GLES20.glGetUniformLocation(aVar.x, "sCamera");
            aVar.B = GLES20.glGetUniformLocation(aVar.x, "uCamera");
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(a.V.length * 4);
            allocateDirect.order(ByteOrder.nativeOrder());
            aVar.J = allocateDirect.asFloatBuffer();
            FloatBuffer floatBuffer = aVar.J;
            if (floatBuffer != null) {
                floatBuffer.put(a.V);
            }
            FloatBuffer floatBuffer2 = aVar.J;
            if (floatBuffer2 != null) {
                floatBuffer2.position(0);
            }
            aVar.G = new int[1];
            GLES20.glGenBuffers(1, aVar.G, 0);
            int[] iArr = aVar.G;
            if (iArr == null) {
                l.b();
            }
            GLES20.glBindBuffer(34962, iArr[0]);
            GLES20.glBufferData(34962, a.V.length * 4, aVar.J, 35044);
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(a.W.length * 4);
            allocateDirect2.order(ByteOrder.nativeOrder());
            aVar.K = allocateDirect2.asFloatBuffer();
            FloatBuffer floatBuffer3 = aVar.K;
            if (floatBuffer3 != null) {
                floatBuffer3.put(a.W);
            }
            FloatBuffer floatBuffer4 = aVar.K;
            if (floatBuffer4 != null) {
                floatBuffer4.position(0);
            }
            aVar.H = new int[1];
            GLES20.glGenBuffers(1, aVar.H, 0);
            int[] iArr2 = aVar.H;
            if (iArr2 == null) {
                l.b();
            }
            GLES20.glBindBuffer(34962, iArr2[0]);
            GLES20.glBufferData(34962, a.W.length * 4, aVar.K, 35044);
            ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(a.X.length * 2);
            allocateDirect3.order(ByteOrder.nativeOrder());
            aVar.L = allocateDirect3.asShortBuffer();
            ShortBuffer shortBuffer = aVar.L;
            if (shortBuffer != null) {
                shortBuffer.put(a.X);
            }
            ShortBuffer shortBuffer2 = aVar.L;
            if (shortBuffer2 != null) {
                shortBuffer2.position(0);
            }
            aVar.I = new int[1];
            GLES20.glGenBuffers(1, aVar.I, 0);
            int[] iArr3 = aVar.I;
            if (iArr3 == null) {
                l.b();
            }
            GLES20.glBindBuffer(34963, iArr3[0]);
            GLES20.glBufferData(34963, a.X.length * 2, aVar.L, 35044);
            a aVar2 = this.v;
            if (aVar2 == null) {
                l.b();
            }
            aVar2.d();
            a aVar3 = this.v;
            if (aVar3 == null) {
                l.b();
            }
            if (this.f144165j == 3) {
                z = true;
            } else {
                z = false;
            }
            aVar3.b();
            aVar3.f144173b = BEFEffectNative.createHandle(z);
            if (!(aVar3.f144173b == 0 || aVar3.f144174c == null)) {
                BEFEffectNative.initResourceFinder(aVar3.f144173b, aVar3.f144174c, aVar3.f144181j, aVar3.f144180i, "android");
                BEFEffectNative.setOrientation(aVar3.f144173b, 0);
                BEFEffectNative.setFrameOrientation(aVar3.f144173b, 0);
                BEFEffectNative.setCameraPosition(aVar3.f144173b, true);
            }
            this.f144166k = new int[1];
            gl10.glDisable(3024);
            gl10.glHint(3152, 4353);
            gl10.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            gl10.glEnable(2884);
            gl10.glShadeModel(7425);
            gl10.glEnable(2929);
            GLES20.glGenTextures(1, this.f144166k, 0);
            GLES20.glBindTexture(36197, this.f144166k[0]);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f144166k[0]);
            this.f144157b = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            this.f144164i = true;
        }
    }

    private final void a(float[] fArr, float[] fArr2, int i2) {
        int width = getWidth();
        int height = getHeight();
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = fArr[i3];
            float f3 = fArr2[i3];
            fArr[i3] = f2 / ((float) width);
            fArr2[i3] = 1.0f - (f3 / ((float) height));
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        l.d(gl10, "");
        a aVar = this.v;
        if (aVar == null) {
            l.b();
        }
        aVar.f144176e = i2;
        aVar.f144177f = i3;
        a aVar2 = this.v;
        if (aVar2 == null) {
            l.b();
        }
        aVar2.d();
    }
}

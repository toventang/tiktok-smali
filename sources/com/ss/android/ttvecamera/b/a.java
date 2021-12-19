package com.ss.android.ttvecamera.b;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.d.f;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.e.b;
import com.ss.android.ttvecamera.i;
import com.ss.android.ttvecamera.j;
import com.ss.android.ttvecamera.j.c;
import com.ss.android.ttvecamera.l;
import com.ss.android.ttvecamera.m;
import com.ss.android.ttvecamera.n;
import com.ss.android.ttvecamera.o;
import com.ss.android.ttvecamera.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public long f61423a;
    private final Handler ae = new Handler(Looper.getMainLooper());
    private StreamConfigurationMap af = null;
    private List<CaptureRequest.Key<?>> ag = null;
    private boolean ah = false;
    private boolean ai = true;
    private long aj = 0;
    private int ak = -1;
    private int al = 0;
    private l.AbstractC1345l am;

    /* renamed from: b  reason: collision with root package name */
    public final HandlerC1338a f61424b;

    /* renamed from: c  reason: collision with root package name */
    protected ImageReader f61425c;

    /* renamed from: d  reason: collision with root package name */
    protected ImageReader f61426d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f61427e = -1;

    /* renamed from: f  reason: collision with root package name */
    public TotalCaptureResult[] f61428f;

    /* renamed from: g  reason: collision with root package name */
    public TotalCaptureResult f61429g = null;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f61430h = false;

    /* renamed from: i  reason: collision with root package name */
    public int f61431i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f61432j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f61433k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f61434l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f61435m = false;
    public int n = 0;
    public int o = 0;
    public ConditionVariable p = null;
    public l.c q = null;
    public int r = 0;
    public long s = 0;

    static {
        Covode.recordClassIndex(37820);
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int n() {
        return this.ak;
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final void a(l.AbstractC1345l lVar, int i2) {
        super.a(lVar, i2);
        this.am = lVar;
        this.q = null;
        this.f61432j = i2;
        this.f61434l = false;
        this.aj = System.currentTimeMillis();
        if (this.f61426d == null || this.Z) {
            o.a("TEImage2Mode", "takePicture...flash strategy: " + this.A.ad);
            long j2 = this.Z ? 1600 : 800;
            if (this.A.f61802e != 0) {
                this.f61431i = 1;
                k();
            } else if (this.A.ad == 3) {
                if (this.Z) {
                    this.f61423a = System.currentTimeMillis();
                    this.f61431i = 2;
                    this.f61424b.sendEmptyMessageDelayed(1001, j2);
                    this.v.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.v.set(CaptureRequest.FLASH_MODE, 2);
                    if (this.ah) {
                        this.v.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        this.v.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.v.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
                        c(this.v);
                        this.v.setTag(null);
                        this.v.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        this.v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                        d(this.v);
                        b.a d2 = d(this.v);
                        if (!d2.f61543a) {
                            HandlerC1338a aVar = this.f61424b;
                            aVar.sendMessage(aVar.obtainMessage(1003, d2.a()));
                            return;
                        }
                        return;
                    }
                    this.f61424b.sendEmptyMessageDelayed(1000, 300);
                    return;
                }
                k();
            } else if (this.A.ad == 2) {
                if (this.Z || !this.f61435m) {
                    this.f61423a = System.currentTimeMillis();
                    this.f61431i = 2;
                    this.f61424b.sendEmptyMessageDelayed(1001, j2);
                    if (this.ah) {
                        this.v.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    }
                    this.v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                    this.v.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
                    c(this.v);
                    this.v.setTag(null);
                    this.v.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    this.v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                    b.a d3 = d(this.v);
                    if (!d3.f61543a) {
                        HandlerC1338a aVar2 = this.f61424b;
                        aVar2.sendMessage(aVar2.obtainMessage(1003, d3.a()));
                        return;
                    }
                    return;
                }
                o.a("TEImage2Mode", "af converge, do capture...");
                k();
            } else if (this.A.ad == 0) {
                if (this.Z || !this.f61435m) {
                    this.f61423a = System.currentTimeMillis();
                    this.f61431i = 1;
                    this.f61424b.sendEmptyMessageDelayed(1007, j2);
                    if (this.ah) {
                        this.v.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    }
                    this.v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                    b.a a2 = a(this.v, this.ad, this.D);
                    if (!a2.f61543a) {
                        HandlerC1338a aVar3 = this.f61424b;
                        aVar3.sendMessage(aVar3.obtainMessage(1003, a2.a()));
                        return;
                    }
                    return;
                }
                o.a("TEImage2Mode", "af converge, do capture...");
                j();
            } else if (this.A.ad == 1) {
                this.f61431i = 1;
                if (this.Z) {
                    this.v.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.v.set(CaptureRequest.FLASH_MODE, 2);
                }
                j();
            } else {
                this.f61431i = 1;
                k();
            }
        } else {
            this.f61431i = 1;
            this.f61430h = true;
            o.a("TEImage2Mode", "takePicture...use zsl buffer");
        }
    }

    public final void a(Exception exc, int i2) {
        if (!(this.am == null || this.z == null)) {
            exc = e.a(exc, i2);
        }
        this.f61431i = 0;
        o.c("TEImage2Mode", "onCaptureFailed, err = " + exc + ", errCode = " + i2);
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final void a(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, final Handler handler, boolean z) {
        if (Build.VERSION.SDK_INT < 28 || (!z && !this.A.T)) {
            o.a("TEImage2Mode", "createSession by normally");
            this.C.createCaptureSession(list, stateCallback, handler);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Surface surface : list) {
            arrayList.add(new OutputConfiguration(surface));
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(a(list), arrayList, new Executor() {
            /* class com.ss.android.ttvecamera.b.a.AnonymousClass5 */

            static {
                Covode.recordClassIndex(37825);
            }

            public final void execute(Runnable runnable) {
                Handler handler = handler;
                if (handler != null) {
                    handler.post(runnable);
                } else {
                    o.d("TEImage2Mode", "executor run, handler is null");
                }
            }
        }, stateCallback);
        this.v.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, a(new Range<>(Integer.valueOf(this.Q.f61371a / this.A.f61801d.f61373c), Integer.valueOf(this.Q.f61372b / this.A.f61801d.f61373c))));
        d(this.ak);
        sessionConfiguration.setSessionParameters(this.v.build());
        o.a("TEImage2Mode", "createSession by sessionConfiguration");
        this.C.createCaptureSession(sessionConfiguration);
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int m() {
        d(this.ak);
        return super.m();
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int[] P_() {
        ImageReader imageReader = this.f61425c;
        if (imageReader == null) {
            return null;
        }
        int width = imageReader.getWidth();
        int height = this.f61425c.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        return new int[]{width, height};
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int[] i() {
        ImageReader imageReader = this.f61425c;
        if (imageReader == null) {
            return null;
        }
        return new int[]{imageReader.getWidth(), this.f61425c.getHeight()};
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final void b() {
        this.f61431i = 0;
        this.f61424b.removeCallbacksAndMessages(null);
        Handler x = x();
        if (x != null) {
            x.removeCallbacksAndMessages(null);
        }
        this.f61423a = 0;
        this.f61434l = false;
        this.n = 0;
        this.ak = -1;
        this.f61429g = null;
        this.Z = false;
        ImageReader imageReader = this.f61425c;
        if (imageReader != null) {
            imageReader.close();
            this.f61425c = null;
        }
        ImageReader imageReader2 = this.f61426d;
        if (imageReader2 != null) {
            imageReader2.close();
            this.f61426d = null;
        }
        this.f61428f = null;
        this.am = null;
        this.q = null;
        super.b();
    }

    @Override // com.ss.android.ttvecamera.d.a.AbstractC1340a
    public final int f() {
        if (this.v == null) {
            this.y.a(-100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        this.v.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.v.set(CaptureRequest.CONTROL_AF_MODE, 4);
        d(this.v);
        return 0;
    }

    @Override // com.ss.android.ttvecamera.d.a.AbstractC1340a
    public final int g() {
        if (this.v == null) {
            this.y.a(-100, "rollbackMeteringSessionRequest : param is null.");
            return -100;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        if (this.N) {
            b(this.v);
        }
        this.v.set(CaptureRequest.CONTROL_AE_MODE, 1);
        d(this.v);
        return 0;
    }

    public final void k() {
        this.aj = System.currentTimeMillis();
        this.f61431i = 0;
        CaptureRequest.Builder w = w();
        if (w == null) {
            a(new Exception("capture build is null"), -1001);
            return;
        }
        ImageReader imageReader = this.f61425c;
        if (imageReader == null) {
            a(new Exception("image reader is null"), -1001);
            return;
        }
        w.addTarget(imageReader.getSurface());
        e(w);
        a(w, new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.b.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(37824);
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                o.b("TEImage2Mode", "onCaptureCompleted, do capture done");
                a.this.f61424b.sendEmptyMessage(1002);
                a.this.f61429g = totalCaptureResult;
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                o.d("TEImage2Mode", "onCaptureCompleted, do capture failed");
                if (a.this.A.am) {
                    a.this.A.am = false;
                }
                if (a.this.A.f61806i) {
                    a.this.A.f61806i = false;
                }
                a.this.f61424b.sendMessage(a.this.f61424b.obtainMessage(1003, new Exception("Capture failed: " + captureFailure.getReason())));
                a.this.f61424b.sendEmptyMessage(1002);
            }
        }, (Handler) null);
    }

    private Range<Integer> B() {
        int i2;
        Range<Integer> range = null;
        if (this.t == null) {
            return null;
        }
        Range<Integer>[] rangeArr = (Range[]) this.t.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            int i3 = 30;
            if (this.A != null && (i2 = this.A.W) >= 30) {
                i3 = i2;
            }
            int i4 = 0;
            for (Range<Integer> range2 : rangeArr) {
                o.b("TEImage2Mode", "fps: " + range2.toString());
                int intValue = range2.getUpper().intValue();
                if (intValue <= i3 && intValue == range2.getLower().intValue() && intValue > i4) {
                    range = range2;
                    i4 = intValue;
                }
            }
        }
        return range;
    }

    public final void j() {
        this.aj = System.currentTimeMillis();
        this.f61431i = 0;
        CaptureRequest.Builder w = w();
        if (w == null) {
            a(new Exception("capture build is null"), -1001);
            return;
        }
        ImageReader imageReader = this.f61425c;
        if (imageReader == null) {
            a(new Exception("image reader is null"), -1001);
            return;
        }
        w.addTarget(imageReader.getSurface());
        e(w);
        b.a a2 = a(w, new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.b.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(37823);
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                o.d("TEImage2Mode", "captureStillPicture, capture failed");
                if (a.this.A.am) {
                    a.this.A.am = false;
                }
                if (a.this.A.f61806i) {
                    a.this.A.f61806i = false;
                }
                a.this.f61424b.sendMessage(a.this.f61424b.obtainMessage(1003, new Exception("Capture failed: " + captureFailure.getReason())));
                a.this.f61424b.sendEmptyMessage(1002);
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                a.this.f61429g = totalCaptureResult;
                Integer num = (Integer) a.this.v.get(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER);
                Integer num2 = (Integer) a.this.v.get(CaptureRequest.CONTROL_AF_TRIGGER);
                if ((num != null && num.intValue() == 1) || (num2 != null && num2.intValue() == 1)) {
                    o.a("TEImage2Mode", "need cancel ae af trigger");
                    if (Build.VERSION.SDK_INT >= 23) {
                        a.this.v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
                    }
                    a.this.v.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    a aVar = a.this;
                    b.a a2 = aVar.a(aVar.v, (CameraCaptureSession.CaptureCallback) null, (Handler) null);
                    if (!a2.f61543a) {
                        o.c("TEImage2Mode", "onCaptureSequenceCompleted: error = " + a2.f61544b);
                        return;
                    } else {
                        a.this.v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                        a.this.v.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    }
                }
                a aVar2 = a.this;
                aVar2.d(aVar2.v);
            }
        }, this.D);
        if (!a2.f61543a) {
            a(a2.a(), -1001);
        }
    }

    public final void l() {
        if (this.A.f61802e == 0) {
            if (this.A.ad == 3) {
                if (this.Z) {
                    this.v.set(CaptureRequest.CONTROL_AE_MODE, 3);
                    this.v.set(CaptureRequest.FLASH_MODE, 1);
                }
            } else if (this.A.ad == 2 && this.ah) {
                this.v.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                a(this.v, (CameraCaptureSession.CaptureCallback) null, (Handler) null);
            }
            if (this.ah) {
                this.v.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            }
            this.v.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            d(this.v);
        }
    }

    private Range<Integer> A() {
        int i2;
        int i3;
        Range<Integer> range = null;
        if (this.t == null) {
            return null;
        }
        Range<Integer>[] rangeArr = (Range[]) this.t.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            if (this.A == null || (i2 = this.A.W) < 30) {
                i2 = 30;
            }
            int i4 = 0;
            int i5 = 0;
            for (Range<Integer> range2 : rangeArr) {
                o.b("TEImage2Mode", "fps: " + range2.toString());
                int intValue = range2.getUpper().intValue();
                int intValue2 = range2.getLower().intValue();
                if (intValue2 < 5) {
                    o.a("TEImage2Mode", "discard fps: " + range2.toString());
                } else {
                    if (intValue > i4) {
                        i4 = intValue;
                    }
                    if (intValue <= i2 && (i3 = intValue - intValue2) > i5) {
                        range = range2;
                        i5 = i3;
                    }
                }
            }
            if (i4 > 30) {
                j.a("te_record_camera_max_fps", (long) i4);
            }
        }
        return range;
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int d() {
        int intValue;
        boolean z;
        Handler handler;
        this.Z = false;
        Float f2 = (Float) this.t.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (f2 == null) {
            intValue = 0;
        } else {
            intValue = f2.intValue();
        }
        o.b("TEImage2Mode", "lensInfoMinFocusDistance = ".concat(String.valueOf(intValue)));
        boolean z2 = true;
        if (intValue != 0) {
            z = true;
        } else {
            z = false;
        }
        this.ah = z;
        c cVar = this.z.t;
        if (this.C == null || cVar == null) {
            o.d("TEImage2Mode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        if (this.A.al) {
            o.a("TEImage2Mode", "bind surface lifecycle to camera...");
            if (!this.ai) {
                if (cVar.f61616b != null) {
                    cVar.f61616b.d();
                } else {
                    o.d("TEImage2Mode", "reallocate st...err");
                }
            }
            this.ai = false;
        }
        int a2 = super.a();
        if (a2 != 0) {
            return a2;
        }
        b(this.A.q.f61374a, this.A.q.f61375b);
        this.v = this.C.createCaptureRequest(1);
        if (this.K != null) {
            this.v.set(CaptureRequest.SCALER_CROP_REGION, this.K);
        }
        ArrayList<Surface> arrayList = new ArrayList();
        if (cVar.f61616b.c() == 8) {
            arrayList.addAll(Arrays.asList(cVar.c()));
        } else {
            arrayList.add(cVar.b());
        }
        ImageReader imageReader = this.f61426d;
        if (imageReader != null) {
            arrayList.add(imageReader.getSurface());
        }
        for (Surface surface : arrayList) {
            this.v.addTarget(surface);
        }
        ImageReader imageReader2 = this.f61425c;
        if (imageReader2 != null) {
            arrayList.add(imageReader2.getSurface());
        }
        this.v.set(CaptureRequest.CONTROL_AF_MODE, 4);
        if (this.A.X) {
            if (Build.VERSION.SDK_INT >= 28) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.t != null && this.ag == null) {
                    this.ag = this.t.getAvailableSessionKeys();
                }
                List<CaptureRequest.Key<?>> list = this.ag;
                if (list != null) {
                    Iterator<CaptureRequest.Key<?>> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE.getName().equals(it.next().getName())) {
                                this.A.X = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z2 = false;
                o.a("TEImage2Mode", "check aeTargetFpsRange is session key: " + z2 + ", consume: " + (System.currentTimeMillis() - currentTimeMillis));
            } else {
                this.A.X = false;
            }
        }
        this.s = 0;
        this.r = 0;
        this.n = 0;
        this.f61427e = -1;
        int i2 = this.A.V;
        this.o = i2;
        if (i2 > 0) {
            o.a("TEImage2Mode", "release camera metadata threshold: " + this.o);
        }
        this.f61435m = false;
        this.f61431i = 0;
        this.V = System.currentTimeMillis();
        if (this.A.f61809l) {
            handler = x();
        } else {
            handler = this.D;
        }
        this.w = null;
        a((List<Surface>) arrayList, this.ac, handler, false);
        if (this.w == null) {
            z();
        }
        return 0;
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final void a(l.AbstractC1345l lVar) {
        a(lVar, this.A.f61802e);
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int a(boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        b(i2);
        return 0;
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int a(n nVar) {
        if (this.f61431i == 0) {
            return super.a(nVar);
        }
        o.d("TEImage2Mode", "focus action discard, state = " + this.f61431i);
        return -108;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ttvecamera.b.a$a  reason: collision with other inner class name */
    public class HandlerC1338a extends Handler {
        static {
            Covode.recordClassIndex(37829);
        }

        public final void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            o.a("TEImage2Mode", "dispatch msg = " + message.what);
            switch (message.what) {
                case 1000:
                case 1001:
                    a.this.k();
                    return;
                case 1002:
                    a.this.l();
                    return;
                case 1003:
                    a.this.a((Exception) message.obj, -1000);
                    return;
                case 1004:
                    a aVar = a.this;
                    aVar.d(aVar.v);
                    return;
                case 1005:
                    a aVar2 = a.this;
                    Integer num = (Integer) aVar2.v.get(CaptureRequest.CONTROL_AF_TRIGGER);
                    if (num != null && num.intValue() == 1) {
                        o.a("TEImage2Mode", "need cancel af trigger");
                        aVar2.v.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                        aVar2.a(aVar2.v, (CameraCaptureSession.CaptureCallback) null, (Handler) null);
                        aVar2.v.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        aVar2.d(aVar2.v);
                        return;
                    }
                    return;
                case 1006:
                case 1007:
                    a.this.j();
                    return;
                default:
                    return;
            }
        }

        public HandlerC1338a(Looper looper) {
            super(looper);
        }
    }

    private void e(CaptureRequest.Builder builder) {
        if (builder != null) {
            Object obj = this.v.get(CaptureRequest.CONTROL_AF_MODE);
            if (obj != null) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, obj);
                o.b("TEImage2Mode", "sync afMode: ".concat(String.valueOf(obj)));
            }
            Object[] objArr = (Object[]) this.v.get(CaptureRequest.CONTROL_AE_REGIONS);
            if (objArr != null) {
                builder.set(CaptureRequest.CONTROL_AE_REGIONS, objArr);
                o.b("TEImage2Mode", "sync aeRect: " + Arrays.toString(objArr));
            }
            Object[] objArr2 = (Object[]) this.v.get(CaptureRequest.CONTROL_AF_REGIONS);
            if (objArr != null) {
                builder.set(CaptureRequest.CONTROL_AF_REGIONS, objArr2);
                o.b("TEImage2Mode", "sync afRect: " + Arrays.toString(objArr2));
            }
            a(this.v, builder);
            Object obj2 = this.v.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
            if (obj2 != null) {
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, obj2);
                o.b("TEImage2Mode", "sync fpsRange: ".concat(String.valueOf(obj2)));
            }
            if (this.K != null) {
                builder.set(CaptureRequest.SCALER_CROP_REGION, this.K);
                o.b("TEImage2Mode", "sync crop region: " + this.K);
            }
        }
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final void c(int i2) {
        Surface surface;
        Surface surface2;
        this.al = i2;
        o.a("TEImage2Mode", "setSceneMode: ".concat(String.valueOf(i2)));
        if (i2 == 0) {
            if (this.A.X) {
                Range<Integer> A = A();
                if (!(this.v == null || A == null)) {
                    this.v.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, A);
                    d(this.v);
                    o.a("TEImage2Mode", "apply capture scene: ".concat(String.valueOf(A)));
                }
            }
            ImageReader imageReader = this.f61426d;
            if (imageReader != null && (surface2 = imageReader.getSurface()) != null && surface2.isValid()) {
                if (this.v != null) {
                    try {
                        this.v.removeTarget(surface2);
                        this.v.addTarget(surface2);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                d(this.v);
            }
        } else if (i2 == 1) {
            if (this.A.X) {
                Range<Integer> B = B();
                if (!(this.v == null || B == null)) {
                    this.v.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, B);
                    d(this.v);
                    o.a("TEImage2Mode", "apply record scene: ".concat(String.valueOf(B)));
                }
            }
            ImageReader imageReader2 = this.f61426d;
            if (imageReader2 != null && (surface = imageReader2.getSurface()) != null && surface.isValid()) {
                if (this.v != null) {
                    try {
                        this.v.removeTarget(surface);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                d(this.v);
            }
        } else {
            throw new IllegalArgumentException("un support scene");
        }
    }

    public final void d(int i2) {
        int intValue;
        o.a("TEImage2Mode", "updateFlashModeParam: ".concat(String.valueOf(i2)));
        this.ak = i2;
        if (this.v == null) {
            o.d("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.y.a(-100, "switchFlashMode : CaptureRequest.Builder is null");
            return;
        }
        Integer num = (Integer) this.v.get(CaptureRequest.FLASH_MODE);
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        if (i2 == 1) {
            if (this.A.f61802e == 1) {
                o.d("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
                o.c("TEImage2Mode", "flash on is not supported in front camera!");
                return;
            }
            this.v.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.v.set(CaptureRequest.FLASH_MODE, 1);
            this.Z = true;
        } else if (i2 == 0) {
            this.Z = false;
            if (intValue == 0) {
                o.a("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_OFF");
                return;
            }
            this.v.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.v.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i2 == 2) {
            this.Z = false;
            if (intValue == 2) {
                o.a("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_TORCH");
                return;
            }
            this.v.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.v.set(CaptureRequest.FLASH_MODE, 2);
        } else {
            o.d("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support flash mode ".concat(String.valueOf(i2)));
            o.d("TEImage2Mode", "not support flash mode: ".concat(String.valueOf(i2)));
        }
    }

    @Override // com.ss.android.ttvecamera.e.a
    public final void b(int i2) {
        boolean z;
        b.a d2;
        int i3 = this.ak;
        if (i3 == -1 || i3 == 0 || i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        d(i2);
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.p == null) {
                this.p = new ConditionVariable();
            }
            this.p.close();
            d2 = b(this.v, new CameraCaptureSession.CaptureCallback() {
                /* class com.ss.android.ttvecamera.b.a.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(37828);
                }

                public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    a.this.p.open();
                    o.a("TEImage2Mode", "onCaptureCompleted");
                }

                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    a.this.p.open();
                    o.d("TEImage2Mode", "set flash failed");
                }

                public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j2) {
                    a.this.p.open();
                    o.d("TEImage2Mode", "set flash request abort");
                }
            }, this.ae);
            if (true ^ this.p.block(33)) {
                o.a("TEImage2Mode", "close flash: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            }
            d(this.v);
        } else {
            d2 = d(this.v);
        }
        if (!d2.f61543a) {
            o.d("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: " + d2.f61544b);
            this.y.a(-100, -100, d2.f61544b);
        }
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final Range<Integer> a(Range<Integer> range) {
        Range<Integer> B;
        if (this.t == null) {
            return range;
        }
        int i2 = this.al;
        if (i2 == 0) {
            B = A();
        } else {
            if (i2 == 1) {
                B = B();
            }
            o.a("TEImage2Mode", "select fps: ".concat(String.valueOf(range)));
            return range;
        }
        if (B != null) {
            range = B;
        }
        o.a("TEImage2Mode", "select fps: ".concat(String.valueOf(range)));
        return range;
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int a(int i2, int i3) {
        this.A.y = true;
        this.A.q.f61374a = i2;
        this.A.q.f61375b = i3;
        b();
        try {
            return d();
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    private static void a(CaptureRequest.Builder builder, CaptureRequest.Builder builder2) {
        Integer num;
        Integer num2 = (Integer) builder.get(CaptureRequest.CONTROL_AE_MODE);
        if (num2 == null) {
            return;
        }
        if (num2.intValue() == 3) {
            builder2.set(CaptureRequest.CONTROL_AE_MODE, 3);
            builder2.set(CaptureRequest.FLASH_MODE, 1);
        } else if (num2.intValue() == 1 && (num = (Integer) builder.get(CaptureRequest.FLASH_MODE)) != null && num.intValue() == 2) {
            builder2.set(CaptureRequest.CONTROL_AE_MODE, 1);
            builder2.set(CaptureRequest.FLASH_MODE, 2);
        }
    }

    private void b(int i2, int i3) {
        int i4;
        boolean z;
        int i5 = 256;
        if (this.A.am || this.A.f61806i) {
            i4 = 35;
        } else {
            i4 = 256;
        }
        TEFrameSizei a2 = a(i4, i2, i3, this.A.t);
        if (a2 == null) {
            o.d("TEImage2Mode", "select picture size failed...format: ".concat(String.valueOf(i4)));
            return;
        }
        this.A.q = a2;
        int i6 = a2.f61374a;
        int i7 = a2.f61375b;
        if (!this.A.f61806i || i6 > 4096 || i4 != 35) {
            z = false;
            i5 = i4;
        } else {
            this.f61428f = new TotalCaptureResult[5];
            ImageReader newInstance = ImageReader.newInstance(i6, i7, 35, 3);
            this.f61426d = newInstance;
            newInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
                /* class com.ss.android.ttvecamera.b.a.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(37826);
                }

                public final void onImageAvailable(ImageReader imageReader) {
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (a.this.f61430h) {
                        int i2 = 0;
                        a.this.f61430h = false;
                        if (acquireNextImage != null) {
                            long timestamp = acquireNextImage.getTimestamp();
                            TotalCaptureResult totalCaptureResult = null;
                            TotalCaptureResult[] totalCaptureResultArr = a.this.f61428f;
                            int length = totalCaptureResultArr.length;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                TotalCaptureResult totalCaptureResult2 = totalCaptureResultArr[i2];
                                Long l2 = (Long) totalCaptureResult2.get(TotalCaptureResult.SENSOR_TIMESTAMP);
                                if (l2 != null && timestamp >= l2.longValue()) {
                                    totalCaptureResult = totalCaptureResult2;
                                    break;
                                }
                                i2++;
                            }
                            a.this.a(acquireNextImage, totalCaptureResult);
                        } else {
                            a.this.a(new Exception("no image data"), -1000);
                            return;
                        }
                    } else if (acquireNextImage == null) {
                        return;
                    }
                    acquireNextImage.close();
                }
            }, this.ae);
            z = true;
            Size[] outputSizes = this.af.getOutputSizes(256);
            if (outputSizes != null) {
                for (Size size : outputSizes) {
                    if (size.getWidth() == i6 && size.getHeight() == i7) {
                        i6 = size.getWidth();
                        i7 = size.getHeight();
                        break;
                    }
                }
            }
            this.f61428f = null;
            this.f61426d.setOnImageAvailableListener(null, null);
            this.f61426d.close();
            this.f61426d = null;
            i5 = i4;
        }
        this.f61425c = ImageReader.newInstance(i6, i7, i5, 1);
        o.a("TEImage2Mode", "image reader width: " + this.f61425c.getWidth() + ", height = " + this.f61425c.getHeight() + ", format: " + i5 + ", maxWidth: " + this.A.t + ", hasZslYuvSurface: " + z);
        this.f61425c.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
            /* class com.ss.android.ttvecamera.b.a.AnonymousClass7 */

            static {
                Covode.recordClassIndex(37827);
            }

            public final void onImageAvailable(ImageReader imageReader) {
                TotalCaptureResult totalCaptureResult;
                Image acquireNextImage = imageReader.acquireNextImage();
                if (acquireNextImage == null) {
                    a.this.a(new Exception("no image data"), -1000);
                    return;
                }
                a aVar = a.this;
                if (acquireNextImage.getFormat() != 256) {
                    totalCaptureResult = a.this.f61429g;
                } else {
                    totalCaptureResult = null;
                }
                aVar.a(acquireNextImage, totalCaptureResult);
                a.this.f61429g = null;
                acquireNextImage.close();
            }
        }, this.ae);
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int a(String str, int i2) {
        this.ai = true;
        this.al = 0;
        this.ag = null;
        if (this.ak == -1) {
            this.ak = 0;
        }
        return super.a(str, i2);
    }

    public final void a(Image image, TotalCaptureResult totalCaptureResult) {
        int i2;
        i.b bVar;
        int width = image.getWidth();
        int height = image.getHeight();
        if (this.f61432j == 1) {
            i2 = 270;
        } else {
            i2 = 90;
        }
        o.a("TEImage2Mode", "on image available, consume: " + (System.currentTimeMillis() - this.aj) + ", size: " + width + "x" + height + ", format: " + image.getFormat() + ", rotation: " + i2);
        if (this.am != null) {
            p pVar = new p(image.getPlanes());
            if (image.getFormat() == 256) {
                bVar = i.b.PIXEL_FORMAT_JPEG;
            } else {
                bVar = i.b.PIXEL_FORMAT_YUV420;
            }
            i iVar = new i(pVar, bVar, width, height, i2);
            if (image.getFormat() == 35) {
                i.c cVar = new i.c();
                cVar.f61583c = System.currentTimeMillis();
                cVar.f61584d = totalCaptureResult;
                iVar.f61567b = cVar;
                Image.Plane[] planes = image.getPlanes();
                int length = planes.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        Image.Plane plane = planes[i3];
                        if (plane != null && plane.getRowStride() != width) {
                            o.d("TEImage2Mode", "process image frame: rowStride: " + plane.getRowStride() + ", w: " + width);
                            byte[] bArr = new byte[(((width * height) * 3) / 2)];
                            m.a(image, bArr);
                            new i(bArr, i.b.PIXEL_FORMAT_NV21, width, height, i2);
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
            }
        }
        if (this.q != null) {
            m.a(image, new byte[(((width * height) * 3) / 2)]);
        }
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final void a(com.ss.android.ttvecamera.i.a aVar, int i2, l.c cVar) {
        MethodCollector.i(252);
        if (!((aVar.f61576c == 0 || aVar.f61576c == this.f61425c.getWidth()) && (aVar.f61577d == 0 || aVar.f61577d == this.f61425c.getHeight()))) {
            o.d("TEImage2Mode", "restart preview for burst capture");
            this.A.f61809l = true;
            a(aVar.f61576c, aVar.f61577d);
        }
        this.am = null;
        this.q = cVar;
        this.f61432j = i2;
        this.aj = System.currentTimeMillis();
        final int width = this.f61425c.getWidth();
        final int height = this.f61425c.getHeight();
        List<Integer> list = aVar.f61575b;
        AnonymousClass2 r5 = new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.b.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(37822);
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                o.a("TEImage2Mode", "capture burst failed: " + captureFailure.getReason());
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Object obj = totalCaptureResult.get(TotalCaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
                Object obj2 = totalCaptureResult.get(TotalCaptureResult.SENSOR_SENSITIVITY);
                o.a("TEImage2Mode", "onCaptureCompleted, aeExposure: " + obj + ", iso: " + obj2 + ", exposureTime: " + totalCaptureResult.get(TotalCaptureResult.SENSOR_EXPOSURE_TIME));
            }

            public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j2) {
                o.a("TEImage2Mode", "capture burst buffer last...");
            }
        };
        if (aVar.f61574a == 1) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Integer num : list) {
                CaptureRequest.Builder w = w();
                e(w);
                w.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num);
                w.set(CaptureRequest.CONTROL_AE_LOCK, true);
                w.addTarget(this.f61425c.getSurface());
                arrayList.add(w.build());
            }
            a(arrayList, r5);
            MethodCollector.o(252);
            return;
        }
        if (aVar.f61574a == 0) {
            if (aVar.f61579f) {
                v();
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Integer num2 = list.get(i3);
                CaptureRequest.Builder w2 = w();
                e(w2);
                w2.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num2);
                w2.set(CaptureRequest.CONTROL_AE_LOCK, true);
                w2.addTarget(this.f61425c.getSurface());
                a(w2.build(), r5);
                if (i3 > 0 && i3 < size - 1 && aVar.f61578e > 0) {
                    try {
                        Thread.sleep((long) aVar.f61578e);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            if (aVar.f61579f) {
                d(this.v);
            }
        }
        MethodCollector.o(252);
    }

    public a(e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, handler);
        this.x = cameraManager;
        if (this.A.n) {
            this.B = new f(this);
        } else {
            this.B = new com.ss.android.ttvecamera.d.e(this);
        }
        this.f61424b = new HandlerC1338a(handler.getLooper());
        this.ad = new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.b.a.AnonymousClass1 */

            /* renamed from: b  reason: collision with root package name */
            private Integer f61437b = -1;

            /* renamed from: c  reason: collision with root package name */
            private Integer f61438c = -1;

            /* renamed from: d  reason: collision with root package name */
            private Integer f61439d = -1;

            /* renamed from: e  reason: collision with root package name */
            private Integer f61440e = -1;

            static {
                Covode.recordClassIndex(37821);
            }

            private void a(CaptureResult captureResult) {
                int i2;
                boolean z;
                Integer num;
                int i3 = a.this.f61431i;
                boolean z2 = true;
                if (i3 == 0) {
                    Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (num2 != null) {
                        i2 = num2.intValue();
                    } else {
                        i2 = -1;
                    }
                    Integer valueOf = Integer.valueOf(i2);
                    a aVar = a.this;
                    if (valueOf.intValue() == -1 || valueOf.intValue() == 2 || valueOf.intValue() == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.f61435m = z;
                    if (a.this.v != null && (num = (Integer) a.this.v.get(CaptureRequest.CONTROL_AF_TRIGGER)) != null && num.intValue() == 1) {
                        if (4 == valueOf.intValue() || 5 == valueOf.intValue() || -1 == valueOf.intValue()) {
                            a.this.v.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                            if (a.this.f61424b != null) {
                                a.this.f61424b.sendEmptyMessage(1004);
                            }
                        }
                    }
                } else if (i3 == 1) {
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                    Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 != null && num3.intValue() == 1) {
                        a.this.f61433k = true;
                        o.a("TEImage2Mode", "ae trigger start...");
                    }
                    if (a.this.f61433k) {
                        if (num4 == null || num4.intValue() == 2 || num4.intValue() == 4) {
                            a.this.f61433k = false;
                            o.a("TEImage2Mode", "ae converge, is shot can do");
                        } else {
                            z2 = false;
                        }
                        if (!this.f61440e.equals(num4)) {
                            o.a("TEImage2Mode", "ae state:".concat(String.valueOf(num4)));
                        }
                        this.f61440e = num4;
                        if (z2) {
                            long currentTimeMillis = System.currentTimeMillis() - a.this.f61423a;
                            a.this.f61431i = 0;
                            a.this.f61433k = false;
                            if (a.this.f61424b != null) {
                                a.this.f61424b.removeMessages(1007);
                                a.this.f61424b.sendEmptyMessage(1006);
                                a.this.f61424b.sendEmptyMessage(1005);
                            }
                            o.a("TEImage2Mode", "send-capture-command consume = ".concat(String.valueOf(currentTimeMillis)));
                        }
                    }
                }
            }

            public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                a(captureResult);
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                if (a.this.f61431i == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
                    a.this.f61434l = true;
                    o.d("TEImage2Mode", "onCaptureFailed: ");
                }
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                int i2;
                int i3;
                int i4;
                int i5;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - a.this.s > 1000) {
                    o.b("TEImage2Mode", "on frame arrived fps: " + a.this.r);
                    a.this.r = 0;
                    a.this.s = currentTimeMillis;
                } else {
                    a.this.r++;
                }
                a(totalCaptureResult);
                if (!a.this.U) {
                    a.this.y();
                    a.this.U = true;
                    long currentTimeMillis2 = System.currentTimeMillis() - a.this.X;
                    o.a("TEImage2Mode", "first preview frame callback arrived! consume = " + currentTimeMillis2 + ", session consume: " + a.this.W);
                    j.a("te_record_camera2_set_repeating_request_cost", currentTimeMillis2);
                    Long.valueOf(currentTimeMillis2);
                }
                if (a.this.f61431i == 2) {
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
                    Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                    Integer num3 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE);
                    Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = -1;
                    }
                    Integer valueOf = Integer.valueOf(i2);
                    if (num2 != null) {
                        i3 = num2.intValue();
                    } else {
                        i3 = -1;
                    }
                    Integer valueOf2 = Integer.valueOf(i3);
                    if (num3 != null) {
                        i4 = num3.intValue();
                    } else {
                        i4 = -1;
                    }
                    Integer valueOf3 = Integer.valueOf(i4);
                    if (num4 != null) {
                        i5 = num4.intValue();
                    } else {
                        i5 = -1;
                    }
                    Integer valueOf4 = Integer.valueOf(i5);
                    if (!this.f61437b.equals(valueOf) || !this.f61438c.equals(valueOf2) || !this.f61439d.equals(valueOf3) || !this.f61440e.equals(valueOf4)) {
                        o.b("TEImage2Mode", "[afMode=" + valueOf + ", afState=" + valueOf2 + ",aeMode=" + valueOf3 + ", aeState=" + valueOf4 + "]");
                    }
                    this.f61437b = valueOf;
                    this.f61438c = valueOf2;
                    this.f61439d = valueOf3;
                    this.f61440e = valueOf4;
                    if ("CAPTURE_REQUEST_TAG_FOR_SHOT".equals(totalCaptureResult.getRequest().getTag())) {
                        a.this.f61434l = true;
                        o.a("TEImage2Mode", "is shot can do");
                    }
                    if (!a.this.f61434l) {
                        o.b("TEImage2Mode", "discard previous callback");
                    } else if ((valueOf2.intValue() == -1 || valueOf2.intValue() == 4 || valueOf2.intValue() == 5 || valueOf2.intValue() == 2) && (valueOf4.intValue() == -1 || valueOf4.intValue() == 4 || valueOf4.intValue() == 2)) {
                        long currentTimeMillis3 = System.currentTimeMillis() - a.this.f61423a;
                        a.this.f61424b.removeMessages(1001);
                        a.this.f61424b.sendEmptyMessage(1000);
                        a.this.f61434l = false;
                        o.a("TEImage2Mode", "send-capture-command consume = ".concat(String.valueOf(currentTimeMillis3)));
                        j.a("te_record_send_capture_command_cost", currentTimeMillis3);
                    }
                }
                a.this.n++;
                if (a.this.o != 0 && a.this.n > a.this.o) {
                    a.this.n = 0;
                    Runtime.getRuntime().gc();
                }
                a.this.f61427e++;
                if (a.this.f61427e % 5 == 0) {
                    a.this.f61427e = 0;
                }
                if (a.this.f61428f != null) {
                    a.this.f61428f[a.this.f61427e] = totalCaptureResult;
                }
            }

            public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j2) {
                if (a.this.f61431i == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
                    a.this.f61434l = true;
                    o.d("TEImage2Mode", "onCaptureBufferLost: ");
                }
            }
        };
    }

    private TEFrameSizei a(int i2, int i3, int i4, int i5) {
        if (this.A.y) {
            this.A.y = false;
            return this.A.q;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.t.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        this.af = streamConfigurationMap;
        if (streamConfigurationMap == null) {
            o.d("TEImage2Mode", "no stream configuration map...");
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(i2);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        if (this.A.x) {
            return m.a(arrayList, this.A.p, i5);
        }
        if (this.L != null) {
            Size[] outputSizes2 = this.af.getOutputSizes(SurfaceTexture.class);
            ArrayList arrayList2 = new ArrayList();
            for (Size size2 : outputSizes2) {
                arrayList2.add(new TEFrameSizei(size2.getWidth(), size2.getHeight()));
            }
            try {
                TEFrameSizei a2 = this.L.a(arrayList, arrayList2);
                if (a2 != null) {
                    return a2;
                }
            } catch (Exception e2) {
                o.d("TEImage2Mode", "select pic size from client err: " + e2.getMessage());
            }
        }
        TEFrameSizei a3 = m.a(arrayList, this.A.p, new TEFrameSizei(i3, i4));
        o.a("TEImage2Mode", "select pic size is null, get closest size: ".concat(String.valueOf(a3)));
        return a3;
    }
}

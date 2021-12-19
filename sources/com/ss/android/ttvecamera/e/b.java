package com.ss.android.ttvecamera.e;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.TEFocusParameters;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.d.a;
import com.ss.android.ttvecamera.d.d;
import com.ss.android.ttvecamera.g;
import com.ss.android.ttvecamera.g.e;
import com.ss.android.ttvecamera.i;
import com.ss.android.ttvecamera.j;
import com.ss.android.ttvecamera.j.c;
import com.ss.android.ttvecamera.l;
import com.ss.android.ttvecamera.m;
import com.ss.android.ttvecamera.n;
import com.ss.android.ttvecamera.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class b implements a.AbstractC1340a, a {
    public l A;
    protected d B;
    public CameraDevice C;
    public Handler D;
    public CaptureRequest E;
    protected AtomicBoolean F = new AtomicBoolean(false);
    protected boolean G = true;
    protected float H = 0.0f;
    protected float I = 1.0f;
    protected Range<Float> J = null;
    protected Rect K = null;
    protected g.c L;
    protected int[] M;
    protected boolean N = false;
    protected CaptureRequest.Key<?> O = null;
    protected n P;
    protected TEFrameRateRange Q = new TEFrameRateRange(7, 30);
    protected int R;
    public HandlerThread S = null;
    public Handler T = null;
    public volatile boolean U = false;
    public long V = 0;
    public long W = 0;
    public long X = 0;
    protected int Y = 0;
    protected boolean Z = false;

    /* renamed from: a  reason: collision with root package name */
    private Rect f61532a;
    public volatile boolean aa = false;
    protected HashMap<Integer, String> ab = new HashMap<>();
    protected CameraCaptureSession.StateCallback ac = new CameraCaptureSession.StateCallback() {
        /* class com.ss.android.ttvecamera.e.b.AnonymousClass4 */

        static {
            Covode.recordClassIndex(37866);
        }

        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            o.d("TECameraModeBase", "onConfigureFailed...");
            b.this.y();
            j.a("te_record_camera2_create_session_ret", 0L);
            Integer.valueOf(0);
        }

        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - b.this.V;
            b.this.W = j2;
            b.this.X = currentTimeMillis;
            b.this.U = false;
            b.this.w = cameraCaptureSession;
            try {
                final int m2 = b.this.m();
                if (m2 != 0) {
                    b.this.y();
                    AnonymousClass1 r3 = new Runnable() {
                        /* class com.ss.android.ttvecamera.e.b.AnonymousClass4.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(37867);
                        }

                        public final void run() {
                            b.this.y.a(m2, "updateCapture : something wrong.");
                        }
                    };
                    if (b.this.A.f61809l) {
                        b.this.D.post(r3);
                    } else {
                        r3.run();
                    }
                }
            } catch (Exception e2) {
                b.this.y();
                e2.printStackTrace();
            }
            j.a("te_record_camera2_create_session_ret", 1L);
            j.a("te_record_camera2_create_session_cost", j2);
            Integer.valueOf(1);
            Long.valueOf(j2);
        }
    };
    public CameraCaptureSession.CaptureCallback ad = new CameraCaptureSession.CaptureCallback() {
        /* class com.ss.android.ttvecamera.e.b.AnonymousClass5 */

        static {
            Covode.recordClassIndex(37868);
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (b.this.A.ae && !b.this.U && captureFailure.getReason() == 0) {
                b.this.Y++;
                int i2 = b.this.Y;
                b.this.A.getClass();
                if (i2 >= 5) {
                    b.this.y.b(-437, "Camera previewing failed");
                }
            }
            o.d("TECameraModeBase", "failure: " + captureFailure + ",reason:" + captureFailure.getReason());
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            int intValue;
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (totalCaptureResult != null) {
                b bVar = b.this;
                if (totalCaptureResult.get(CaptureResult.SENSOR_SENSITIVITY) == null) {
                    intValue = -1;
                } else {
                    intValue = ((Integer) totalCaptureResult.get(CaptureResult.SENSOR_SENSITIVITY)).intValue();
                }
                bVar.R = intValue;
            }
            if (!b.this.U) {
                b.this.y();
                b.this.U = true;
                long currentTimeMillis = System.currentTimeMillis() - b.this.X;
                o.a("TECameraModeBase", "first preview frame callback arrived! consume = " + currentTimeMillis + ", session consume: " + b.this.W);
                j.a("te_record_camera2_set_repeating_request_cost", currentTimeMillis);
                Long.valueOf(currentTimeMillis);
            }
            if (b.this.A.ak) {
                i.c cVar = new i.c();
                cVar.f61583c = System.currentTimeMillis();
                cVar.f61584d = totalCaptureResult;
                cVar.f61585e = b.this.q()[1];
                cVar.f61586f = b.this.q()[0];
                b.this.z.t.f61616b.f61612l = cVar;
            }
            if (b.this.G) {
                b.this.G = m.a(totalCaptureResult);
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private boolean f61533b = false;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Integer> f61534c = new HashMap<String, Integer>() {
        /* class com.ss.android.ttvecamera.e.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37863);
        }

        {
            put("auto", 1);
            put("incandescent", 2);
            put("fluorescent", 3);
            put("warm-fluorescent", 4);
            put("daylight", 5);
            put("cloudy-daylight", 6);
            put("twilight", 7);
            put("shade", 8);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private Runnable f61535d = new Runnable() {
        /* class com.ss.android.ttvecamera.e.b.AnonymousClass3 */

        static {
            Covode.recordClassIndex(37865);
        }

        public final void run() {
            b.this.B.a();
        }
    };
    public CameraCharacteristics t;
    protected e u;
    public CaptureRequest.Builder v;
    public volatile CameraCaptureSession w;
    protected CameraManager x;
    public g.a y;
    public com.ss.android.ttvecamera.e z;

    static {
        Covode.recordClassIndex(37862);
    }

    public int[] P_() {
        return null;
    }

    public int Q_() {
        return 0;
    }

    public int R_() {
        return 0;
    }

    public int a(int i2, int i3) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public Range<Integer> a(Range<Integer> range) {
        return range;
    }

    public void a(com.ss.android.ttvecamera.i.a aVar, int i2, l.c cVar) {
    }

    public void a(l.AbstractC1345l lVar) {
    }

    public void c(int i2) {
    }

    public abstract int d();

    public int[] i() {
        return null;
    }

    public int n() {
        return -1;
    }

    public void a(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, final Handler handler, boolean z2) {
        if (Build.VERSION.SDK_INT < 28 || (!z2 && !this.A.T)) {
            o.a("TECameraModeBase", "createSession by normally");
            this.C.createCaptureSession(list, stateCallback, handler);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Surface surface : list) {
            arrayList.add(new OutputConfiguration(surface));
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(a(list), arrayList, new Executor() {
            /* class com.ss.android.ttvecamera.e.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(37864);
            }

            public final void execute(Runnable runnable) {
                Handler handler = handler;
                if (handler != null) {
                    handler.post(runnable);
                }
            }
        }, stateCallback);
        sessionConfiguration.setSessionParameters(this.v.build());
        o.a("TECameraModeBase", "createSession by sessionConfiguration");
        this.C.createCaptureSession(sessionConfiguration);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r7 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c3, code lost:
        com.ss.android.ttvecamera.o.c("TECameraModeBase", "selectCamera: camera tag is null, set 0 for default");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(int r11) {
        /*
        // Method dump skipped, instructions count: 458
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.e.b.a(int):java.lang.String");
    }

    public final void a(Object obj) {
        this.C = (CameraDevice) obj;
    }

    public void a(l.AbstractC1345l lVar, int i2) {
        if (this.Z) {
            this.v.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.v.set(CaptureRequest.FLASH_MODE, 1);
        }
    }

    public Rect a(float f2) {
        CameraCharacteristics cameraCharacteristics = this.t;
        if (cameraCharacteristics == null || this.v == null) {
            this.y.a(-420, "Camera info is null, may be you need reopen camera.");
            return null;
        }
        float floatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) this.t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int width = (int) (((float) rect.width()) / floatValue);
        int height = (int) (((float) rect.height()) / floatValue);
        int width2 = (int) ((((float) (rect.width() - width)) / floatValue) * f2);
        int height2 = (int) ((((float) (rect.height() - height)) / floatValue) * f2);
        int i2 = width2 - (width2 & 3);
        int i3 = height2 - (height2 & 3);
        return new Rect(i2, i3, rect.width() - i2, rect.height() - i3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: int[][] */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(String str) {
        int intValue;
        if (this.v == null || this.w == null) {
            this.y.a(-424, -424, "Capture Session is null");
        }
        if (this.f61534c.get(str) == null) {
            intValue = 1;
        } else {
            intValue = this.f61534c.get(str).intValue();
        }
        if (!Arrays.asList(this.t.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES)).contains(Integer.valueOf(intValue))) {
            this.y.a(-424, -424, "invalid white balance");
            return;
        }
        a d2 = d(this.v);
        if (!d2.f61543a) {
            o.d("TECameraModeBase", "setWhiteBalance exception: " + d2.f61544b);
            this.y.a(-424, -424, d2.f61544b);
        }
    }

    public final void a(g.c cVar) {
        this.L = cVar;
    }

    /* access modifiers changed from: protected */
    public final a a(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        a aVar = new a();
        if (this.w == null) {
            aVar.f61544b = "Capture Session is null";
            o.d("TECameraModeBase", "capture: " + aVar.f61544b);
            return aVar;
        }
        try {
            this.w.captureBurst(list, captureCallback, null);
            aVar.f61543a = true;
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
            aVar.f61544b = e2.getMessage();
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
            aVar.f61544b = e3.getMessage();
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    public final a a(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        a aVar = new a();
        if (captureRequest == null) {
            aVar.f61544b = "CaptureRequest is null";
            o.d("TECameraModeBase", "capture: " + aVar.f61544b);
            return aVar;
        } else if (this.w == null) {
            aVar.f61544b = "Capture Session is null";
            o.d("TECameraModeBase", "capture: " + aVar.f61544b);
            return aVar;
        } else {
            try {
                this.w.capture(captureRequest, captureCallback, null);
                aVar.f61543a = true;
            } catch (CameraAccessException e2) {
                e2.printStackTrace();
                aVar.f61544b = e2.getMessage();
            } catch (IllegalStateException e3) {
                e3.printStackTrace();
                aVar.f61544b = e3.getMessage();
            }
            return aVar;
        }
    }

    public final a a(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        a aVar = new a();
        if (builder == null) {
            aVar.f61544b = "CaptureRequest.Builder is null";
            o.d("TECameraModeBase", "capture: " + aVar.f61544b);
            return aVar;
        } else if (this.w == null) {
            aVar.f61544b = "Capture Session is null";
            o.d("TECameraModeBase", "capture: " + aVar.f61544b);
            return aVar;
        } else {
            try {
                this.w.capture(builder.build(), captureCallback, handler);
                aVar.f61543a = true;
            } catch (CameraAccessException e2) {
                e2.printStackTrace();
                aVar.f61544b = e2.getMessage();
            } catch (IllegalStateException e3) {
                e3.printStackTrace();
                aVar.f61544b = e3.getMessage();
            }
            return aVar;
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f61543a;

        /* renamed from: b  reason: collision with root package name */
        public String f61544b = "";

        static {
            Covode.recordClassIndex(37869);
        }

        protected a() {
        }

        public final Exception a() {
            return new Exception(this.f61544b);
        }

        public final String toString() {
            return "Response{isSuccess=" + this.f61543a + ", errMsg='" + this.f61544b + '\'' + '}';
        }
    }

    public final void o() {
        this.K = null;
        this.Y = 0;
    }

    public int e() {
        if (this.v != null) {
            return this.B.a();
        }
        this.y.a(-100, -100, "rollbackNormalSessionRequest : param is null.");
        return -100;
    }

    public final int p() {
        CaptureRequest.Builder builder = this.v;
        if (builder == null) {
            this.y.a(-100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        this.B.a(builder);
        d(this.v);
        return 0;
    }

    public final int r() {
        if (this.v == null || this.w == null) {
            this.y.a(-430, -430, "Capture Session is null");
        }
        return this.R;
    }

    public final CaptureRequest.Builder w() {
        CameraDevice cameraDevice = this.C;
        if (cameraDevice != null) {
            try {
                return cameraDevice.createCaptureRequest(2);
            } catch (CameraAccessException e2) {
                e2.printStackTrace();
            } catch (IllegalStateException e3) {
                e3.printStackTrace();
            }
        }
        return null;
    }

    private void l() {
        this.Q = e.a(this.t, this.A.f61801d.f61371a, this.A.f61801d.f61372b, this.A.L, this.A.f61802e);
        o.a("TECameraModeBase", "Set Fps Range: " + this.Q.toString());
    }

    public final float[] t() {
        if (this.v == null || this.w == null) {
            this.y.a(-432, -432, "Capture Session is null");
        }
        float[] fArr = (float[]) this.t.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        if (fArr == null) {
            return new float[]{-1.0f, -1.0f};
        }
        return fArr;
    }

    public final Handler x() {
        if (this.S == null) {
            HandlerThread handlerThread = new HandlerThread("camera thread");
            this.S = handlerThread;
            handlerThread.start();
            o.a("TECameraModeBase", "getCameraHandler, init camera thread");
        }
        if (this.T == null) {
            this.T = new Handler(this.S.getLooper());
        }
        return this.T;
    }

    public final void y() {
        com.ss.android.ttvecamera.e eVar = this.z;
        if (eVar != null) {
            eVar.F();
        } else {
            o.b("TECameraModeBase", "openCameraLock failed, " + o.a());
        }
    }

    /* access modifiers changed from: protected */
    public final void z() {
        com.ss.android.ttvecamera.e eVar = this.z;
        if (eVar != null) {
            eVar.E();
        } else {
            o.b("TECameraModeBase", "waitCameraTaskDoneOrTimeout failed, " + o.a());
        }
    }

    public final int[] q() {
        if (this.v == null || this.w == null) {
            this.y.a(-430, -430, "Capture Session is null");
        }
        Range range = (Range) this.t.get(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        if (range == null || ((Integer) range.getUpper()).intValue() < 800 || ((Integer) range.getLower()).intValue() > 100) {
            return new int[]{-1, -1};
        }
        return new int[]{((Integer) range.getUpper()).intValue(), ((Integer) range.getLower()).intValue()};
    }

    public final long[] s() {
        if (this.v == null || this.w == null) {
            this.y.a(-431, -431, "Capture Session is null");
        }
        Range range = (Range) this.t.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE);
        if (range == null) {
            return new long[]{-1, -1};
        }
        return new long[]{((Long) range.getUpper()).longValue(), ((Long) range.getLower()).longValue()};
    }

    public final a v() {
        a aVar = new a();
        if (this.w == null) {
            aVar.f61544b = "Capture Session is null";
            o.d("TECameraModeBase", "stopRepeating: " + aVar.f61544b);
            return aVar;
        }
        try {
            this.w.stopRepeating();
            aVar.f61543a = true;
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
            aVar.f61544b = e2.getMessage();
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
            aVar.f61544b = e3.getMessage();
        }
        return aVar;
    }

    private void A() {
        Bundle bundle;
        if (this.z.B.containsKey(this.A.F)) {
            bundle = this.z.B.get(this.A.F);
        } else {
            bundle = new Bundle();
            this.z.B.put(this.A.F, bundle);
        }
        bundle.putParcelable("camera_preview_size", this.A.p);
        if (this.u != null) {
            bundle.putBoolean("camera_torch_supported", e.b(this.t));
        } else {
            bundle.putBoolean("camera_torch_supported", false);
        }
        if (!(this.t == null || this.E == null)) {
            TEFocusParameters tEFocusParameters = new TEFocusParameters();
            tEFocusParameters.f61367a = (Rect) this.t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            tEFocusParameters.f61368b = (Rect) this.E.get(CaptureRequest.SCALER_CROP_REGION);
            tEFocusParameters.f61370d = ((Integer) this.t.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
            tEFocusParameters.f61369c = ((Integer) this.t.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
            bundle.putParcelable("camera_focus_parameters", tEFocusParameters);
        }
        bundle.putInt("camera_sensor_orientation", this.A.f61803f);
    }

    public int a() {
        c cVar = this.z.t;
        if (this.C == null || cVar == null) {
            o.d("TECameraModeBase", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.t.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (cVar.f61616b.f61610j) {
            cVar.a(streamConfigurationMap, (TEFrameSizei) null);
            this.A.p = cVar.e();
            if (this.A.p != null) {
                this.y.a(50, 0, this.A.p.toString());
            }
        } else {
            cVar.a(streamConfigurationMap, this.A.p);
            this.A.q = cVar.f();
        }
        o.a("TECameraModeBase", "Camera provider type: " + cVar.a());
        if (cVar.a() == 1 || cVar.a() == 16) {
            if (cVar.d() == null) {
                o.d("TECameraModeBase", "SurfaceTexture is null.");
                return -100;
            }
            cVar.d().setDefaultBufferSize(this.A.p.f61374a, this.A.p.f61375b);
        } else if (cVar.a() != 2) {
            if (cVar.a() == 8) {
                cVar.d().setDefaultBufferSize(this.A.p.f61374a, this.A.p.f61375b);
            } else {
                o.d("TECameraModeBase", "Unsupported camera provider type : " + cVar.a());
                return -200;
            }
        }
        return 0;
    }

    public void b() {
        l lVar;
        if (!(this.z == null || (lVar = this.A) == null || !lVar.f61809l)) {
            o.a("TECameraModeBase", "close session process...state = " + this.z.f61510b);
            if (this.z.f61510b == 2) {
                this.z.E();
            }
        }
        this.aa = false;
        if (this.C == null) {
            o.d("TECameraModeBase", "close session process...device is null");
        } else if (this.w == null) {
            o.d("TECameraModeBase", "close session process...session is null");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                this.w.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.w = null;
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            j.a("te_record_camera2_close_session_cost", currentTimeMillis2);
            Long.valueOf(currentTimeMillis2);
            o.a("TECameraModeBase", "close session...consume = ".concat(String.valueOf(currentTimeMillis2)));
        }
    }

    public Rect h() {
        if (this.E == null) {
            o.d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: mCaptureRequest is null");
            o.d("TECameraModeBase", "mCaptureRequest == null");
            this.y.a(-420, -420, "mCaptureRequest == null.");
            return null;
        }
        Rect rect = this.f61532a;
        if (rect == null) {
            o.d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: mActiveArraySize is null");
            o.d("TECameraModeBase", "ActiveArraySize == null");
            this.y.a(-420, -420, "ActiveArraySize == null.");
            return null;
        }
        float f2 = this.I;
        if (f2 <= 0.0f || f2 > this.H) {
            o.d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: invalid factor");
            o.d("TECameraModeBase", "factor invalid");
            this.y.a(-420, -420, "factor invalid.");
            return null;
        }
        float f3 = 1.0f / f2;
        int width = rect.width() - Math.round(((float) this.f61532a.width()) * f3);
        int height = this.f61532a.height() - Math.round(((float) this.f61532a.height()) * f3);
        int i2 = width / 2;
        int i3 = height / 2;
        Rect rect2 = new Rect(m.a(i2, this.f61532a.left, this.f61532a.right), m.a(i3, this.f61532a.top, this.f61532a.bottom), m.a(this.f61532a.width() - i2, this.f61532a.left, this.f61532a.right), m.a(this.f61532a.height() - i3, this.f61532a.top, this.f61532a.bottom));
        if (rect2.equals(this.E.get(CaptureRequest.SCALER_CROP_REGION))) {
            o.a("TECameraModeBase", "same SCALER_CROP_REGION, no need to set");
        }
        return rect2;
    }

    public int m() {
        if (this.z.t == null || this.v == null) {
            o.d("TECameraModeBase", "update capture failed");
            return -100;
        }
        this.y.a("TECamera2 preview");
        if (this.u.c(this.t)) {
            o.a("TECameraModeBase", "Stabilization Supported, toggle = " + this.A.R);
            if (this.u.a(this.t, this.v, this.A.R) == 0 && this.A.R) {
                this.y.a(113, 1, "enable stablization");
            }
        }
        this.v.set(CaptureRequest.CONTROL_MODE, 1);
        l();
        this.v.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, a(new Range<>(Integer.valueOf(this.Q.f61371a / this.A.f61801d.f61373c), Integer.valueOf(this.Q.f61372b / this.A.f61801d.f61373c))));
        if (this.N) {
            b(this.v);
        }
        a d2 = d(this.v);
        if (!d2.f61543a) {
            o.d("TECameraModeBase", "first request failed: " + d2.f61544b);
        }
        this.A.f61803f = ((Integer) this.t.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.z.f(3);
        A();
        o.a("TECameraModeBase", "send capture request...");
        return 0;
    }

    public final float[] u() {
        if (this.u == null || this.E == null || this.w == null || this.v == null) {
            o.c("TECameraModeBase", "Env is null");
            return new float[]{-2.0f, -2.0f};
        }
        float[] fArr = new float[2];
        double[] dArr = new double[2];
        SizeF sizeF = (SizeF) this.t.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Rect rect = (Rect) this.t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Size size = (Size) this.t.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Float f2 = (Float) this.v.get(CaptureRequest.LENS_FOCAL_LENGTH);
        int abs = StrictMath.abs(rect.right - rect.left);
        int abs2 = StrictMath.abs(rect.top - rect.bottom);
        int i2 = this.A.p.f61374a;
        int i3 = this.A.p.f61375b;
        if (abs * i3 >= i2 / abs2) {
            dArr[0] = StrictMath.atan((double) (((sizeF.getWidth() * ((float) abs)) / ((float) size.getWidth())) / (f2.floatValue() * 2.0f))) * 2.0d;
            dArr[1] = StrictMath.atan((double) (((((sizeF.getHeight() * ((float) abs2)) / ((float) size.getHeight())) * ((float) (i2 / i3))) / ((float) (abs / abs2))) / (f2.floatValue() * 2.0f))) * 2.0d;
        } else {
            dArr[1] = StrictMath.atan((double) (((sizeF.getHeight() * ((float) abs2)) / ((float) size.getHeight())) / (f2.floatValue() * 2.0f))) * 2.0d;
            dArr[0] = StrictMath.atan((double) (((((sizeF.getWidth() * ((float) abs)) / ((float) size.getWidth())) * ((float) (i3 / i2))) / ((float) (abs2 / abs))) / (f2.floatValue() * 2.0f))) * 2.0d;
        }
        fArr[0] = (float) ((dArr[1] * 180.0d) / 3.141592653589793d);
        fArr[1] = (float) ((dArr[0] * 180.0d) / 3.141592653589793d);
        o.b("TECameraModeBase", "Camera2:verticalFOV = " + fArr[0] + ",horizontalFOV = " + fArr[1]);
        return fArr;
    }

    /* access modifiers changed from: protected */
    public int a(List<Surface> list) {
        int i2 = Build.VERSION.SDK_INT;
        return 0;
    }

    public final a d(CaptureRequest.Builder builder) {
        return a(builder, this.ad);
    }

    /* access modifiers changed from: protected */
    public final a c(CaptureRequest.Builder builder) {
        return a(builder, this.ad, x());
    }

    @Override // com.ss.android.ttvecamera.d.a.AbstractC1340a
    public final void a(CaptureRequest.Builder builder) {
        d(builder);
    }

    /* access modifiers changed from: protected */
    public final void b(CaptureRequest.Builder builder) {
        int[] iArr = this.M;
        if (iArr == null) {
            o.b("TECameraModeBase", "FaceDetect is not supported!");
        } else if (m.a(iArr, 1)) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
        } else if (m.a(this.M, 2)) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 2);
        } else if (m.a(this.M, 0)) {
            o.c("TECameraModeBase", "FaceDetect is not supported!");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d9, code lost:
        if (0 != 0) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int b(com.ss.android.ttvecamera.n r20) {
        /*
        // Method dump skipped, instructions count: 500
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.e.b.b(com.ss.android.ttvecamera.n):int");
    }

    public int a(n nVar) {
        boolean z2;
        if (this.A.n) {
            return b(nVar);
        }
        this.P = nVar;
        this.B.f61486c = nVar;
        this.B.a(this.A);
        if (this.u == null || this.w == null || this.v == null) {
            o.c("TECameraModeBase", "Env is null");
            this.P.f61854m.a(-100, this.A.f61802e, "Env is null");
            return -100;
        }
        boolean f2 = e.f(this.t);
        boolean e2 = e.e(this.t);
        if (e2 || f2) {
            boolean z3 = nVar.f61850i;
            boolean z4 = this.F.get();
            if (!e2 || !this.P.f61848g) {
                z2 = true;
            } else {
                z2 = false;
            }
            o.b("TECameraModeBase", "focusAtPoint++");
            if (z4 && !z2) {
                this.f61535d.run();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
                o.b("TECameraModeBase", "cancel previous touch af..");
            }
            Rect b2 = this.P.b();
            if (b2 == null) {
                b2 = a(this.P.f61842a, this.P.f61843b, (float) this.P.f61844c, (float) this.P.f61845d, this.A.f61803f, 0);
            }
            Rect c2 = this.P.c();
            if (c2 == null) {
                c2 = a(this.P.f61842a, this.P.f61843b, (float) this.P.f61844c, (float) this.P.f61845d, this.A.f61803f, 1);
            }
            if (!m.a(b2) || !m.a(c2)) {
                o.d("TECameraModeBase", "focusRect or meteringRect is not valid!");
                this.P.f61854m.a(-100, this.A.f61802e, "focusRect or meteringRect is not valid!");
                return -100;
            }
            if (this.P.f61849h && f2) {
                this.B.b(this.v, c2);
            }
            if (z2) {
                if (f2 && this.P.f61849h) {
                    b(this.v, this.B.a(!z2), this.D);
                    this.F.set(false);
                }
                return -412;
            }
            this.F.set(true);
            this.B.a(this.v, b2);
            CaptureRequest.Builder builder = this.v;
            a b3 = b(builder, this.B.a(builder, this.F, z3), this.D);
            if (b3.f61543a) {
                return 0;
            }
            this.F.set(false);
            this.P.f61854m.a(-108, this.A.f61802e, b3.f61544b);
            this.y.a(-411, -411, b3.f61544b);
            return -108;
        }
        o.c("TECameraModeBase", "do not support MeteringAreaAF!");
        this.P.f61854m.a(-412, this.A.f61802e, "do not support MeteringAreaAF!");
        return -412;
    }

    public final void b(boolean z2) {
        if (!z2 && this.I != 1.0f) {
            this.I = 1.0f;
            if (Build.VERSION.SDK_INT >= 30) {
                if (this.v == null || this.w == null) {
                    this.y.a(-100, "enableMulticamZoom : Capture Session is null");
                    return;
                }
                this.v.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.I));
                a d2 = d(this.v);
                if (!d2.f61543a) {
                    o.d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + d2.f61544b);
                    this.y.a(-420, -420, d2.f61544b);
                    return;
                }
            }
            this.K = h();
        }
        this.f61533b = z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public int a(boolean z2) {
        int i2;
        CaptureRequest.Builder builder = this.v;
        if (builder == null) {
            o.d("TECameraModeBase", "[VE_UI_TEST]Failed event: TOGGLE. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.y.a(-100, "toggleTorch : CaptureRequest.Builder is null");
            this.y.d(z2, "toggleTorch : CaptureRequest.Builder is null");
            return -100;
        }
        CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
        if (z2 != 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        builder.set(key, Integer.valueOf(i2));
        this.y.a(104, 0, "camera2 will change flash mode ".concat(String.valueOf(z2)));
        a d2 = d(this.v);
        this.y.a(105, 0, "camera2 did change flash mode ".concat(String.valueOf(z2)));
        if (!d2.f61543a) {
            o.d("TECameraModeBase", "[VE_UI_TEST]Failed event: TOGGLE. Code: -417. Reason: " + d2.f61544b);
            this.y.a(-417, -417, d2.f61544b);
            this.y.d(z2, d2.f61544b);
            return -417;
        }
        this.y.c(z2 ? 1 : 0, "camera torch success");
        return 0;
    }

    private a a(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback) {
        return b(builder, captureCallback, x());
    }

    public int a(float f2, l.p pVar) {
        CaptureRequest.Builder builder;
        Rect a2 = a(f2);
        if (this.u == null || this.E == null || this.w == null || (builder = this.v) == null) {
            o.d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.y.a(-420, -420, "startZoom : Env is null");
            return -100;
        } else if (a2 == null) {
            o.d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: zoomRect is null");
            this.y.a(-420, -420, "zoom rect is null.");
            return -420;
        } else {
            builder.set(CaptureRequest.SCALER_CROP_REGION, a2);
            a d2 = d(this.v);
            if (!d2.f61543a) {
                o.d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + d2.f61544b);
                this.y.a(-420, -420, d2.f61544b);
                return -420;
            }
            if (pVar != null) {
                pVar.onChange(this.A.f61800c, f2, true);
            }
            A();
            return 0;
        }
    }

    public void b(float f2, l.p pVar) {
        if (this.w == null || this.E == null || this.v == null) {
            o.d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.y.a(-420, "Camera info is null, may be you need reopen camera.");
            return;
        }
        if (Build.VERSION.SDK_INT < 30 || !this.f61533b || !e.d(this.t)) {
            if (this.I < this.H || f2 <= 1.0f) {
                Rect rect = this.K;
                if (rect == null || !rect.equals(this.f61532a) || f2 > 1.0f) {
                    o.b("TECameraModeBase", "mNowZoom = " + this.I);
                    this.I *= f2;
                } else {
                    o.b("TECameraModeBase", "mZoomSize = " + this.K + ";mActiveArraySize = " + this.f61532a + ";factor = " + f2);
                    this.I = 1.0f;
                }
            } else {
                o.b("TECameraModeBase", "mNowZoom = " + this.I + ";mMaxZoom = " + this.H + ";factor = " + f2);
                this.I = this.H;
            }
            Rect h2 = h();
            if (h2 != null) {
                this.v.set(CaptureRequest.SCALER_CROP_REGION, h2);
                a d2 = d(this.v);
                if (!d2.f61543a) {
                    o.d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + d2.f61544b);
                    this.y.a(-420, -420, d2.f61544b);
                    return;
                }
                this.K = h2;
            } else {
                return;
            }
        } else {
            Range<Float> range = this.J;
            if (range != null) {
                Float upper = range.getUpper();
                Float lower = this.J.getLower();
                if (this.I * f2 >= upper.floatValue() && f2 > 1.0f) {
                    this.I = upper.floatValue();
                } else if (this.I * f2 > lower.floatValue() || f2 > 1.0f) {
                    this.I *= f2;
                    o.d("TECameraModeBase", "zoom ratio = " + this.I);
                } else {
                    this.I = lower.floatValue();
                }
            }
            this.v.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.I));
            a d3 = d(this.v);
            if (!d3.f61543a) {
                o.d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + d3.f61544b);
                this.y.a(-420, -420, d3.f61544b);
                return;
            }
        }
        if (pVar != null) {
            pVar.onChange(this.A.f61800c, this.I, true);
        }
        A();
    }

    public int a(String str, int i2) {
        Range<Float> range;
        CameraCharacteristics cameraCharacteristics = this.t;
        if (cameraCharacteristics == null) {
            o.b("TECameraModeBase", "open failed, mCameraCharacteristics = null");
            return -439;
        }
        int i3 = -1;
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            i3 = num.intValue();
        }
        if (i3 < 0 || i3 > 3) {
            o.d("TECameraHardware2Proxy", "Invalid hardware level = ".concat(String.valueOf(i3)));
            return -403;
        }
        int i4 = com.ss.android.ttvecamera.g.d.f61546b[i3];
        j.a("te_record_camera_hardware_level", (long) i4);
        if (Build.VERSION.SDK_INT < 22 && i3 == 2) {
            return -403;
        }
        if (i4 >= i2) {
            o.a("TECameraHardware2Proxy", "Camera hardware level supported, deviceLevel = " + i4 + ", require = " + i2);
            this.A.f61803f = ((Integer) this.t.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            if (this.t.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP) == null) {
                return -439;
            }
            this.H = e.a(this.t, this.A.f61800c, this.A.o);
            if (this.A.ap == -1.0f || this.A.aq == -1.0f) {
                CameraCharacteristics cameraCharacteristics2 = this.t;
                if (Build.VERSION.SDK_INT < 30 || (range = (Range) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) == null) {
                    range = new Range<>(Float.valueOf(0.0f), (Float) cameraCharacteristics2.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM));
                }
                this.J = range;
            } else {
                this.J = new Range<>(Float.valueOf(this.A.aq), Float.valueOf(this.A.ap));
            }
            this.I = 1.0f;
            this.f61532a = (Rect) this.t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            l();
            this.N = this.A.C.getBoolean("useCameraFaceDetect");
            this.M = (int[]) this.t.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
            return 0;
        }
        o.d("TECameraHardware2Proxy", "Camera hardware level not supported, deviceLevel = " + i4 + ", require = " + i2);
        return -403;
    }

    public b(com.ss.android.ttvecamera.e eVar, Context context, Handler handler) {
        this.z = eVar;
        l lVar = eVar.o;
        this.A = lVar;
        this.u = e.a(context, lVar.f61800c);
        this.y = this.z.q;
        this.D = handler;
        this.G = this.A.f61808k;
        this.Z = false;
    }

    /* access modifiers changed from: protected */
    public final a b(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        a aVar = new a();
        if (builder == null) {
            aVar.f61544b = "CaptureRequest.Builder is null";
            o.d("TECameraModeBase", "updatePreview: " + aVar.f61544b);
            return aVar;
        } else if (this.w == null) {
            aVar.f61544b = "Capture Session is null";
            o.d("TECameraModeBase", "updatePreview: " + aVar.f61544b);
            return aVar;
        } else {
            CaptureRequest build = builder.build();
            this.E = build;
            try {
                this.w.setRepeatingRequest(build, captureCallback, handler);
                aVar.f61543a = true;
                this.aa = true;
            } catch (CameraAccessException e2) {
                e2.printStackTrace();
                aVar.f61544b = e2.getMessage();
            } catch (IllegalStateException e3) {
                e3.printStackTrace();
                aVar.f61544b = e3.getMessage();
                this.aa = false;
            } catch (IllegalArgumentException e4) {
                e4.printStackTrace();
                aVar.f61544b = e4.getMessage();
            } catch (SecurityException e5) {
                e5.printStackTrace();
                aVar.f61544b = e5.getMessage();
            }
            return aVar;
        }
    }

    private Rect a(int i2, int i3, float f2, float f3, int i4, int i5) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        Rect rect = (Rect) this.t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        o.b("TECameraModeBase", "SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom + "]");
        Size size = (Size) this.t.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        o.a("onAreaTouchEvent", "mCameraCharacteristics:[width, height]: [" + size.getWidth() + ", " + size.getHeight() + "]");
        int i6 = this.A.p.f61374a;
        int i7 = this.A.p.f61375b;
        if (90 == this.A.f61803f || 270 == this.A.f61803f) {
            i6 = this.A.p.f61375b;
            i7 = this.A.p.f61374a;
        }
        float f9 = 0.0f;
        if (i7 * i2 >= i6 * i3) {
            f4 = (((float) i2) * 1.0f) / ((float) i6);
            f6 = ((((float) i7) * f4) - ((float) i3)) / 2.0f;
            f5 = 0.0f;
        } else {
            f4 = (((float) i3) * 1.0f) / ((float) i7);
            f5 = ((((float) i6) * f4) - ((float) i2)) / 2.0f;
            f6 = 0.0f;
        }
        float f10 = (f2 + f5) / f4;
        float f11 = (f3 + f6) / f4;
        if (90 == i4) {
            float f12 = ((float) this.A.p.f61375b) - f10;
            f10 = f11;
            f11 = f12;
        } else if (270 == i4) {
            float f13 = ((float) this.A.p.f61374a) - f11;
            f11 = f10;
            f10 = f13;
        }
        Rect rect2 = (Rect) this.E.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null || rect2.isEmpty()) {
            o.c("TECameraModeBase", "can't get crop region");
        } else {
            rect = rect2;
        }
        int width = rect.width();
        int height = rect.height();
        if (this.A.p.f61375b * width > this.A.p.f61374a * height) {
            f7 = (((float) height) * 1.0f) / ((float) this.A.p.f61375b);
            f9 = (((float) width) - (((float) this.A.p.f61374a) * f7)) / 2.0f;
            f8 = 0.0f;
        } else {
            f7 = (((float) width) * 1.0f) / ((float) this.A.p.f61374a);
            f8 = (((float) height) - (((float) this.A.p.f61375b) * f7)) / 2.0f;
        }
        float f14 = (f10 * f7) + f9 + ((float) rect.left);
        float f15 = (f11 * f7) + f8 + ((float) rect.top);
        if (this.A.f61802e == 1) {
            f15 = ((float) rect.height()) - f15;
        }
        Rect rect3 = new Rect();
        if (i5 == 0) {
            double d2 = (double) f14;
            double width2 = (double) rect.width();
            Double.isNaN(width2);
            Double.isNaN(d2);
            rect3.left = m.a((int) (d2 - (width2 * 0.05d)), 0, rect.width());
            double width3 = (double) rect.width();
            Double.isNaN(width3);
            Double.isNaN(d2);
            rect3.right = m.a((int) (d2 + (width3 * 0.05d)), 0, rect.width());
            double d3 = (double) f15;
            double height2 = (double) rect.height();
            Double.isNaN(height2);
            Double.isNaN(d3);
            rect3.top = m.a((int) (d3 - (height2 * 0.05d)), 0, rect.height());
            double height3 = (double) rect.height();
            Double.isNaN(height3);
            Double.isNaN(d3);
            rect3.bottom = m.a((int) (d3 + (height3 * 0.05d)), 0, rect.height());
        } else {
            double d4 = (double) f14;
            double width4 = (double) rect.width();
            Double.isNaN(width4);
            Double.isNaN(d4);
            rect3.left = m.a((int) (d4 - (width4 * 0.1d)), 0, rect.width());
            double width5 = (double) rect.width();
            Double.isNaN(width5);
            Double.isNaN(d4);
            rect3.right = m.a((int) (d4 + (width5 * 0.1d)), 0, rect.width());
            double d5 = (double) f15;
            double height4 = (double) rect.height();
            Double.isNaN(height4);
            Double.isNaN(d5);
            rect3.top = m.a((int) (d5 - (height4 * 0.1d)), 0, rect.height());
            double height5 = (double) rect.height();
            Double.isNaN(height5);
            Double.isNaN(d5);
            rect3.bottom = m.a((int) (d5 + (height5 * 0.1d)), 0, rect.height());
        }
        if (rect3.left < 0 || rect3.left > rect.right) {
            rect3.left = rect.left;
        }
        if (rect3.top < 0 || rect3.top > rect.bottom) {
            rect3.top = rect.top;
        }
        if (rect3.right < 0 || rect3.right > rect.right) {
            rect3.right = rect.right;
        }
        if (rect3.bottom < 0 || rect3.bottom > rect.bottom) {
            rect3.bottom = rect.bottom;
        }
        o.a("TECameraModeBase", "Focus Rect: [left, top, right, bottom] = [" + rect3.left + ", " + rect3.top + ", " + rect3.right + ", " + rect3.bottom + "]");
        return rect3;
    }
}

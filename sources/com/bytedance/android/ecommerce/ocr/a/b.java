package com.bytedance.android.ecommerce.ocr.a;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Pair;
import com.bytedance.android.ecommerce.k.k;
import com.bytedance.android.ecommerce.ocr.a.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public f f7161a;

    /* renamed from: b  reason: collision with root package name */
    public e f7162b;

    /* renamed from: c  reason: collision with root package name */
    public c f7163c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f7164d;

    /* renamed from: e  reason: collision with root package name */
    public h f7165e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f7166f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7167g = true;

    /* renamed from: h  reason: collision with root package name */
    public Handler f7168h;

    /* renamed from: i  reason: collision with root package name */
    public d f7169i = new d();

    /* renamed from: j  reason: collision with root package name */
    private Runnable f7170j = new Runnable() {
        /* class com.bytedance.android.ecommerce.ocr.a.b.AnonymousClass4 */

        static {
            Covode.recordClassIndex(3453);
        }

        public final void run() {
            Camera camera;
            try {
                c cVar = b.this.f7163c;
                int a2 = com.bytedance.android.ecommerce.ocr.c.a.a.a.a.a(cVar.f7192e.f7204a);
                if (a2 == -1) {
                    camera = null;
                } else {
                    Pair<Boolean, Object> a3 = com.bytedance.helios.sdk.a.a(Camera.class, new Object[]{Integer.valueOf(a2)}, 100100, "android.hardware.Camera", false, null);
                    if (((Boolean) a3.first).booleanValue()) {
                        camera = (Camera) a3.second;
                    } else {
                        camera = Camera.open(a2);
                        com.bytedance.helios.sdk.a.a(camera, Camera.class, new Object[]{Integer.valueOf(a2)}, 100100, "com_bytedance_android_ecommerce_ocr_zxing_android_camera_open_OpenCameraInterface_android_hardware_Camera_open(I)Landroid/hardware/Camera;");
                    }
                }
                cVar.f7188a = camera;
                if (cVar.f7188a != null) {
                    int a4 = com.bytedance.android.ecommerce.ocr.c.a.a.a.a.a(cVar.f7192e.f7204a);
                    cVar.f7189b = new Camera.CameraInfo();
                    Camera.getCameraInfo(a4, cVar.f7189b);
                    return;
                }
                throw new RuntimeException("Failed to open camera");
            } catch (Exception e2) {
                b.this.a(e2);
            }
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private Runnable f7171k = new Runnable() {
        /* class com.bytedance.android.ecommerce.ocr.a.b.AnonymousClass5 */

        static {
            Covode.recordClassIndex(3454);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(16:3|4|5|(12:(2:8|(2:10|(1:13))(1:14))(1:15)|16|(1:18)(1:20)|19|21|22|23|24|25|(1:28)(1:33)|29|(4:31|(1:34)(2:35|(1:37)(1:39))|38|46)(1:45))|12|16|(0)(0)|19|21|22|23|24|25|(0)(0)|29|(0)(0)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004b */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0028 A[Catch:{ Exception -> 0x0047 }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x003d A[Catch:{ Exception -> 0x0047 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:45:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 175
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.ocr.a.b.AnonymousClass5.run():void");
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private Runnable f7172l = new Runnable() {
        /* class com.bytedance.android.ecommerce.ocr.a.b.AnonymousClass6 */

        static {
            Covode.recordClassIndex(3455);
        }

        public final void run() {
            try {
                c cVar = b.this.f7163c;
                e eVar = b.this.f7162b;
                Camera camera = cVar.f7188a;
                if (eVar.f7212a != null) {
                    camera.setPreviewDisplay(eVar.f7212a);
                } else {
                    camera.setPreviewTexture(eVar.f7213b);
                }
                c cVar2 = b.this.f7163c;
                Camera camera2 = cVar2.f7188a;
                if (camera2 != null && !cVar2.f7191d) {
                    camera2.startPreview();
                    cVar2.f7191d = true;
                    cVar2.f7190c = new a(cVar2.f7188a, cVar2.f7192e);
                }
            } catch (Exception e2) {
                b.this.a(e2);
            }
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private Runnable f7173m = new Runnable() {
        /* class com.bytedance.android.ecommerce.ocr.a.b.AnonymousClass7 */

        static {
            Covode.recordClassIndex(3456);
        }

        public final void run() {
            try {
                c cVar = b.this.f7163c;
                if (cVar.f7190c != null && !cVar.f7190c.f7149a) {
                    cVar.f7190c.d();
                    cVar.f7190c.b();
                }
            } catch (Exception e2) {
                b.this.a(e2);
            }
        }
    };
    private a n = new a(this, (byte) 0);
    private Runnable o = new Runnable() {
        /* class com.bytedance.android.ecommerce.ocr.a.b.AnonymousClass8 */

        static {
            Covode.recordClassIndex(3457);
        }

        public final void run() {
            MethodCollector.i(3475);
            try {
                c cVar = b.this.f7163c;
                if (cVar.f7190c != null) {
                    cVar.f7190c.d();
                    cVar.f7190c = null;
                }
                if (cVar.f7188a != null && cVar.f7191d) {
                    cVar.f7188a.stopPreview();
                    cVar.f7200m.f7201a = null;
                    cVar.f7191d = false;
                }
                c cVar2 = b.this.f7163c;
                if (cVar2.f7188a != null) {
                    Camera camera = cVar2.f7188a;
                    if (!((Boolean) com.bytedance.helios.sdk.a.a(camera, new Object[0], 100101, "void", false, null).first).booleanValue()) {
                        com.bytedance.helios.sdk.a.a(null, camera, new Object[0], 100106, "com_bytedance_android_ecommerce_ocr_camera_CameraManager_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
                        camera.release();
                        com.bytedance.helios.sdk.a.a(null, camera, new Object[0], 100101, "com_bytedance_android_ecommerce_ocr_camera_CameraManager_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
                    }
                    cVar2.f7188a = null;
                }
            } catch (Exception unused) {
            }
            b.this.f7167g = true;
            b.this.f7164d.sendEmptyMessage(R.id.fny);
            f fVar = b.this.f7161a;
            synchronized (fVar.f7218e) {
                try {
                    fVar.f7217d--;
                    if (fVar.f7217d == 0) {
                        synchronized (fVar.f7218e) {
                            try {
                                fVar.f7216c.quit();
                                fVar.f7216c = null;
                                fVar.f7215b = null;
                            } catch (Throwable th) {
                                MethodCollector.o(3475);
                                throw th;
                            }
                        }
                    }
                } finally {
                    MethodCollector.o(3475);
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(3448);
    }

    public final void b() {
        k.a();
        if (this.f7166f) {
            this.f7161a.a(this.f7171k);
        }
    }

    public final void c() {
        k.a();
        if (this.f7166f) {
            this.f7161a.a(this.f7172l);
        }
    }

    public final void d() {
        if (this.f7161a != null && this.f7166f) {
            this.f7161a.a(this.f7173m);
        }
    }

    public final void a() {
        k.a();
        this.f7166f = true;
        this.f7167g = false;
        this.f7161a.b(this.f7170j);
    }

    public final void e() {
        k.a();
        if (this.f7166f) {
            this.f7161a.a(this.o);
        } else {
            this.f7167g = true;
        }
        this.f7166f = false;
    }

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public int f7186a;

        static {
            Covode.recordClassIndex(3458);
        }

        public final void run() {
            try {
                c cVar = b.this.f7163c;
                int i2 = this.f7186a;
                if (cVar.f7188a != null) {
                    Camera.Parameters parameters = cVar.f7188a.getParameters();
                    if (parameters.isZoomSupported()) {
                        int maxZoom = parameters.getMaxZoom();
                        int zoom = parameters.getZoom();
                        cVar.f7199l = 1.0f;
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    if (zoom > 0) {
                                        cVar.a(0);
                                        return;
                                    } else {
                                        cVar.a(maxZoom / 3);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else if (zoom > 0) {
                                zoom--;
                            }
                        } else if (zoom < maxZoom) {
                            zoom++;
                        }
                        parameters.setZoom(zoom);
                        cVar.f7188a.setParameters(parameters);
                    }
                }
            } catch (Exception e2) {
                b.this.a(e2);
            }
        }

        private a() {
        }

        /* synthetic */ a(b bVar, byte b2) {
            this();
        }
    }

    public final void a(c.b bVar) {
        this.f7163c.f7197j = bVar;
    }

    public final void a(Exception exc) {
        Handler handler = this.f7164d;
        if (handler != null) {
            handler.obtainMessage(R.id.fnz, exc).sendToTarget();
        }
    }

    public final void a(final float f2) {
        k.a();
        if (this.f7166f) {
            this.f7161a.a(new Runnable() {
                /* class com.bytedance.android.ecommerce.ocr.a.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(3449);
                }

                public final void run() {
                    c cVar = b.this.f7163c;
                    float f2 = f2;
                    Camera.Parameters parameters = cVar.f7188a.getParameters();
                    if (cVar.f7188a != null && parameters.isZoomSupported() && f2 > 1.0f) {
                        try {
                            cVar.f7199l *= f2;
                            double d2 = (double) cVar.f7199l;
                            List<Integer> zoomRatios = parameters.getZoomRatios();
                            int maxZoom = parameters.getMaxZoom();
                            if (!(zoomRatios == null || zoomRatios.isEmpty())) {
                                if (zoomRatios.size() == maxZoom + 1) {
                                    Double.isNaN(d2);
                                    double d3 = d2 * 100.0d;
                                    double d4 = Double.POSITIVE_INFINITY;
                                    int i2 = 0;
                                    for (int i3 = 0; i3 < zoomRatios.size(); i3++) {
                                        double intValue = (double) zoomRatios.get(i3).intValue();
                                        Double.isNaN(intValue);
                                        double abs = Math.abs(intValue - d3);
                                        if (abs < d4) {
                                            i2 = i3;
                                            d4 = abs;
                                        }
                                    }
                                    if (i2 != -1) {
                                        int zoom = parameters.getZoom();
                                        int maxZoom2 = parameters.getMaxZoom();
                                        if (i2 > zoom && maxZoom2 > i2) {
                                            parameters.setZoom(i2);
                                            cVar.f7188a.setParameters(parameters);
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public b(Context context) {
        k.a();
        if (f.f7214a == null) {
            f.f7214a = new f();
        }
        this.f7161a = f.f7214a;
        c cVar = new c(context);
        this.f7163c = cVar;
        cVar.f7192e = this.f7169i;
        this.f7168h = new Handler();
    }

    public final void a(int i2) {
        if (this.f7161a != null && this.f7166f) {
            this.n.f7186a = i2;
            this.f7161a.a(this.n);
        }
    }

    public final void a(final boolean z) {
        k.a();
        if (this.f7166f) {
            this.f7161a.a(new Runnable() {
                /* class com.bytedance.android.ecommerce.ocr.a.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(3450);
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0032 A[Catch:{ RuntimeException -> 0x0088 }] */
                /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 137
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.ocr.a.b.AnonymousClass2.run():void");
                }
            });
        }
    }
}

package com.bytedance.android.ecommerce.ocr.a;

import android.content.Context;
import android.hardware.Camera;
import android.os.SystemClock;
import com.bytedance.android.ecommerce.ocr.view.f;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public Camera f7188a;

    /* renamed from: b  reason: collision with root package name */
    Camera.CameraInfo f7189b;

    /* renamed from: c  reason: collision with root package name */
    public a f7190c;

    /* renamed from: d  reason: collision with root package name */
    boolean f7191d;

    /* renamed from: e  reason: collision with root package name */
    public d f7192e = new d();

    /* renamed from: f  reason: collision with root package name */
    public h f7193f;

    /* renamed from: g  reason: collision with root package name */
    m f7194g;

    /* renamed from: h  reason: collision with root package name */
    public m f7195h;

    /* renamed from: i  reason: collision with root package name */
    public int f7196i = -1;

    /* renamed from: j  reason: collision with root package name */
    public b f7197j;

    /* renamed from: k  reason: collision with root package name */
    public long f7198k;

    /* renamed from: l  reason: collision with root package name */
    float f7199l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    final a f7200m;
    private String n;
    private Context o;
    private int p = 10;

    public interface b {
        static {
            Covode.recordClassIndex(3461);
        }
    }

    static {
        Covode.recordClassIndex(3459);
    }

    public final boolean a() {
        int i2 = this.f7196i;
        if (i2 == -1) {
            throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
        } else if (i2 % LiveFeedRefreshTimeSetting.DEFAULT != 0) {
            return true;
        } else {
            return false;
        }
    }

    final class a implements Camera.PreviewCallback {

        /* renamed from: a  reason: collision with root package name */
        public k f7201a;

        /* renamed from: b  reason: collision with root package name */
        public m f7202b;

        static {
            Covode.recordClassIndex(3460);
        }

        public a() {
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            m mVar = this.f7202b;
            k kVar = this.f7201a;
            if (mVar != null) {
                if (kVar == null) {
                    return;
                }
                if (bArr != null) {
                    try {
                        kVar.a(new f(bArr, mVar.f7229a, mVar.f7230b));
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - c.this.f7198k >= 200) {
                            c.this.f7198k = elapsedRealtime;
                        }
                    } catch (Throwable unused) {
                        new Exception("parse data error");
                        kVar.a();
                    }
                } else {
                    throw new NullPointerException("No preview data received");
                }
            } else if (kVar != null) {
                new Exception("No resolution available");
                kVar.a();
            }
        }
    }

    public c(Context context) {
        this.o = context;
        this.f7200m = new a();
    }

    public final void a(int i2) {
        Camera camera = this.f7188a;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (i2 >= 0 && i2 < parameters.getMaxZoom()) {
                a aVar = this.f7190c;
                if (aVar != null) {
                    aVar.d();
                }
                if (parameters.isSmoothZoomSupported()) {
                    this.f7188a.startSmoothZoom(i2);
                } else {
                    int zoom = this.f7188a.getParameters().getZoom();
                    if (zoom < i2) {
                        while (zoom <= i2) {
                            parameters.setZoom(zoom);
                            this.f7188a.setParameters(parameters);
                            zoom++;
                        }
                    } else if (zoom > i2) {
                        while (zoom >= i2) {
                            parameters.setZoom(zoom);
                            this.f7188a.setParameters(parameters);
                            zoom--;
                        }
                    }
                }
                a aVar2 = this.f7190c;
                if (aVar2 != null) {
                    aVar2.b();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r1 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r1.equals(r4.getFocusMode()) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r4.setFocusMode(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r9 != false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        com.bytedance.android.ecommerce.ocr.c.a.a.a.a(r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r8.f7192e.f7205b == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        if ("negative".equals(r4.getColorEffect()) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        r0 = com.bytedance.android.ecommerce.ocr.c.a.a.a.a(r4.getSupportedColorEffects(), "negative");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        if (r0 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r4.setColorEffect(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (r8.f7192e.f7206c == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        if ("barcode".equals(r4.getSceneMode()) != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        r0 = com.bytedance.android.ecommerce.ocr.c.a.a.a.a(r4.getSupportedSceneModes(), "barcode");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        if (r0 == null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        r4.setSceneMode(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        if (r8.f7192e.f7207d == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        r0 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r4.isVideoStabilizationSupported() == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if (r4.getVideoStabilization() != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
        r4.setVideoStabilization(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        if (r4.getMaxNumFocusAreas() <= 0) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        r4.setFocusAreas(com.bytedance.android.ecommerce.ocr.c.a.a.a.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bf, code lost:
        if (r4.getMaxNumMeteringAreas() <= 0) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r4.setMeteringAreas(com.bytedance.android.ecommerce.ocr.c.a.a.a.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        r0 = r4.getSupportedPreviewSizes();
        r7 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d1, code lost:
        if (r0 != null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d3, code lost:
        r0 = r4.getPreviewSize();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d7, code lost:
        if (r0 == null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d9, code lost:
        r7.add(new com.bytedance.android.ecommerce.ocr.a.m(r0.width, r0.height));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
        if (r7.size() != 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00eb, code lost:
        r8.f7194g = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f5, code lost:
        if ("glass-1".equals(android.os.Build.DEVICE) == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        com.bytedance.android.ecommerce.ocr.c.a.a.a.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fa, code lost:
        r4.setPreviewFormat(17);
        r8.f7188a.setParameters(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0104, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0105, code lost:
        r2 = r8.f7193f;
        r1 = a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010d, code lost:
        if (r2.f7221a != null) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010f, code lost:
        r1 = r2.f7223c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0111, code lost:
        if (r3 != null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0113, code lost:
        r0 = (com.bytedance.android.ecommerce.ocr.a.m) r7.get(0);
        r8.f7194g = r0;
        r4.setPreviewSize(r0.f7229a, r8.f7194g.f7230b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0125, code lost:
        java.util.Collections.sort(r7, new com.bytedance.android.ecommerce.ocr.a.l.AnonymousClass1(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012e, code lost:
        if (r1 == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0130, code lost:
        r3 = r2.f7221a.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0137, code lost:
        r3 = r2.f7221a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013a, code lost:
        r5 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0142, code lost:
        if (r5.hasNext() == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0144, code lost:
        r0 = r5.next();
        r7.add(new com.bytedance.android.ecommerce.ocr.a.m(r0.width, r0.height));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r9 == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r1 == null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r9) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.ocr.a.c.a(boolean):void");
    }
}

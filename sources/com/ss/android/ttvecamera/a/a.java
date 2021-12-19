package com.ss.android.ttvecamera.a;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.CameraConfig;
import com.google.ar.core.Config;
import com.google.ar.core.Session;
import com.google.ar.core.SharedCamera;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.l;
import com.ss.android.ttvecamera.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f61376a = a.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    static int f61377b = 5;

    /* renamed from: c  reason: collision with root package name */
    public Handler f61378c;

    /* renamed from: d  reason: collision with root package name */
    CameraCaptureSession.StateCallback f61379d;

    /* renamed from: e  reason: collision with root package name */
    public SharedCamera f61380e;

    /* renamed from: f  reason: collision with root package name */
    public Session f61381f;

    /* renamed from: g  reason: collision with root package name */
    List<CameraConfig> f61382g;

    /* renamed from: h  reason: collision with root package name */
    final Object f61383h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public long f61384i = 0;

    /* renamed from: j  reason: collision with root package name */
    List<Long> f61385j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private CameraDevice.StateCallback f61386k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f61387l;

    /* renamed from: com.ss.android.ttvecamera.a.a$a  reason: collision with other inner class name */
    public static class C1337a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f61390a = new a();

        static {
            Covode.recordClassIndex(37808);
        }
    }

    public final String c() {
        Session session = this.f61381f;
        if (session == null) {
            return null;
        }
        return session.getCameraConfig().getCameraId();
    }

    static {
        Covode.recordClassIndex(37805);
    }

    public final void a() {
        long currentTimeMillis = System.currentTimeMillis();
        Session session = this.f61381f;
        if (session != null) {
            session.close();
            this.f61381f = null;
        }
        this.f61387l = false;
        this.f61386k = null;
        this.f61379d = null;
        this.f61382g = null;
        o.a(f61376a, "close consume = " + (System.currentTimeMillis() - currentTimeMillis));
    }

    public final CameraDevice.StateCallback b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f61386k == null && this.f61380e != null && Build.VERSION.SDK_INT >= 21) {
            this.f61386k = this.f61380e.createARDeviceStateCallback(new CameraDevice.StateCallback() {
                /* class com.ss.android.ttvecamera.a.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(37807);
                }

                public final void onDisconnected(CameraDevice cameraDevice) {
                    o.a(a.f61376a, "onDisconnected");
                }

                public final void onOpened(CameraDevice cameraDevice) {
                    if (!((Boolean) com.bytedance.helios.sdk.a.a(this, new Object[]{cameraDevice}, 100200, "void", false, null).first).booleanValue()) {
                        com.bytedance.helios.sdk.a.a(this, new Object[]{cameraDevice}, 100200, "onOpened(Landroid/hardware/camera2/CameraDevice;)V");
                        o.a(a.f61376a, "onOpened");
                    }
                }

                public final void onError(CameraDevice cameraDevice, int i2) {
                    o.a(a.f61376a, "onError");
                }
            }, this.f61378c);
        }
        o.a(f61376a, "getDevicesStateCallback consume = " + (System.currentTimeMillis() - currentTimeMillis));
        return this.f61386k;
    }

    public final long d() {
        long j2;
        MethodCollector.i(270);
        synchronized (this.f61383h) {
            try {
                j2 = 0;
                for (Long l2 : this.f61385j) {
                    j2 += l2.longValue();
                }
                if (this.f61385j.size() > 0) {
                    j2 /= (long) this.f61385j.size();
                }
            } finally {
                MethodCollector.o(270);
            }
        }
        return j2;
    }

    public final void a(TEFrameSizei tEFrameSizei) {
        if (Build.VERSION.SDK_INT >= 21 && this.f61381f != null) {
            for (CameraConfig cameraConfig : this.f61382g) {
                if (cameraConfig.getTextureSize().getWidth() == tEFrameSizei.f61374a && cameraConfig.getTextureSize().getHeight() == tEFrameSizei.f61375b) {
                    this.f61381f.setCameraConfig(cameraConfig);
                    return;
                }
            }
        }
    }

    public final boolean a(CameraCaptureSession.CaptureCallback captureCallback) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        Session session = this.f61381f;
        if (session != null) {
            try {
                session.resume();
                this.f61380e.setCaptureCallback(captureCallback, this.f61378c);
                o.a(f61376a, "ARCore resumed");
                z = true;
            } catch (Exception e2) {
                o.b(f61376a, "Failed to resume ARCore session".concat(String.valueOf(e2)));
            }
            o.a(f61376a, "resume consume = " + (System.currentTimeMillis() - currentTimeMillis));
            return z;
        }
        z = false;
        o.a(f61376a, "resume consume = " + (System.currentTimeMillis() - currentTimeMillis));
        return z;
    }

    public final boolean a(Context context, l lVar) {
        l.a aVar;
        Config config;
        if (this.f61387l) {
            o.a(f61376a, "init already...");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (lVar.at == null) {
            aVar = new l.a();
        } else {
            aVar = lVar.at;
        }
        if (aVar.f61811a == l.a.EnumC1344a.MESH3D) {
            lVar.f61802e = 1;
        } else {
            lVar.f61802e = 0;
        }
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(Session.Feature.SHARED_CAMERA);
            if (lVar.f61802e == 1) {
                hashSet.add(Session.Feature.FRONT_CAMERA);
            }
            this.f61381f = new Session(context, hashSet);
            String str = f61376a;
            o.a(str, "create session consume = " + (System.currentTimeMillis() - currentTimeMillis));
            Session session = this.f61381f;
            if (session == null) {
                config = null;
            } else {
                config = new Config(this.f61381f);
                config.setAugmentedFaceMode(Config.AugmentedFaceMode.values()[aVar.f61811a.ordinal()]);
                config.setCloudAnchorMode(Config.CloudAnchorMode.values()[aVar.f61812b.ordinal()]);
                config.setDepthMode(Config.DepthMode.values()[aVar.f61813c.ordinal()]);
                config.setFocusMode(Config.FocusMode.values()[aVar.f61814d.ordinal()]);
                config.setLightEstimationMode(Config.LightEstimationMode.values()[aVar.f61815e.ordinal()]);
                config.setPlaneFindingMode(Config.PlaneFindingMode.values()[aVar.f61816f.ordinal()]);
                if (!this.f61381f.isDepthModeSupported(config.getDepthMode())) {
                    o.b(str, config.getDepthMode().name() + " is not supported, fallback to DepthMode.DISABLED");
                    config.setDepthMode(Config.DepthMode.DISABLED);
                }
            }
            session.configure(config);
            o.a(str, "configure consume = " + (System.currentTimeMillis() - currentTimeMillis) + ", get id =" + c());
        } catch (Exception e2) {
            String str2 = f61376a;
            if ((o.f61856b & 1) != 0) {
                o.f61857c.Log((byte) 1, str2, "Failed to create ARCore session that supports camera sharing" + e2.getMessage() + "stack: " + Log.getStackTraceString(e2));
            }
        }
        Session session2 = this.f61381f;
        if (session2 == null) {
            o.d(f61376a, "create ar session failed...");
            return false;
        }
        this.f61380e = session2.getSharedCamera();
        this.f61387l = true;
        return true;
    }
}

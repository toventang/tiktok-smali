package com.ss.android.ttvecamera.b;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.d.h;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.e.b;
import com.ss.android.ttvecamera.g;
import com.ss.android.ttvecamera.j.c;
import com.ss.android.ttvecamera.o;
import java.util.ArrayList;
import java.util.Arrays;

public class b extends com.ss.android.ttvecamera.e.b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f61452a = b.class.getSimpleName();

    @Override // com.ss.android.ttvecamera.e.b
    public final int Q_() {
        return super.Q_();
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int R_() {
        return super.R_();
    }

    static {
        Covode.recordClassIndex(37830);
    }

    @Override // com.ss.android.ttvecamera.d.a.AbstractC1340a
    public final int f() {
        if (this.v == null) {
            this.y.a(-100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        this.v.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.v.set(CaptureRequest.CONTROL_AF_MODE, 3);
        this.v.set(CaptureRequest.CONTROL_AE_MODE, 1);
        d(this.v);
        return 0;
    }

    @Override // com.ss.android.ttvecamera.d.a.AbstractC1340a
    public final int g() {
        if (this.v == null) {
            this.y.a(-100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        if (this.N) {
            b(this.v);
        }
        this.v.set(CaptureRequest.CONTROL_AE_MODE, 1);
        d(this.v);
        return 0;
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int d() {
        Handler handler;
        c cVar = this.z.t;
        if (this.C == null || cVar == null) {
            o.b(f61452a, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int a2 = super.a();
        if (a2 != 0) {
            return a2;
        }
        this.v = this.C.createCaptureRequest(3);
        ArrayList arrayList = new ArrayList();
        if (cVar.f61616b.c() == 8) {
            arrayList.addAll(Arrays.asList(cVar.c()));
        } else if (cVar.f61616b.c() == 16) {
            arrayList.add(cVar.b());
            arrayList.add(cVar.f61616b.f());
        } else {
            arrayList.add(cVar.b());
        }
        boolean z = false;
        for (Surface surface : arrayList) {
            this.v.addTarget(surface);
            if (!surface.isValid()) {
                z = true;
            }
        }
        if (this.A.T) {
            this.v.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, a(new Range<>(Integer.valueOf(this.Q.f61371a / this.A.f61801d.f61373c), Integer.valueOf(this.Q.f61372b / this.A.f61801d.f61373c))));
        }
        if (z) {
            o.d(f61452a, "start preview may be failed, surface invalid...");
        }
        this.U = false;
        this.V = System.currentTimeMillis();
        if (this.A.f61809l) {
            handler = x();
        } else {
            handler = this.D;
        }
        this.w = null;
        a(arrayList, this.ac, handler, false);
        if (this.w == null) {
            z();
        }
        return 0;
    }

    @Override // com.ss.android.ttvecamera.e.a
    public final void b(int i2) {
        int i3 = 1;
        if (this.v == null) {
            String str = f61452a;
            o.d(str, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            o.d(str, "switchFlashMode: ".concat("CaptureRequest.Builder is null"));
            this.y.a(-100, "switchFlashMode:".concat("CaptureRequest.Builder is null"));
            g.a aVar = this.y;
            if (i2 == 0) {
                i3 = 0;
            }
            aVar.d(i3, "switchFlashMode:".concat("CaptureRequest.Builder is null"));
            return;
        }
        if (i2 == 0) {
            this.v.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.v.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i2 != 2) {
            String str2 = f61452a;
            o.d(str2, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: not support flash mode ".concat(String.valueOf(i2)));
            o.c(str2, "Video Mode not support this mode : ".concat(String.valueOf(i2)));
            this.y.d(-1, "Video Mode not support this mode : ".concat(String.valueOf(i2)));
            return;
        } else {
            this.v.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.v.set(CaptureRequest.FLASH_MODE, 2);
        }
        this.A.ab = i2;
        this.y.a(104, 0, "camera2 will change flash mode ".concat(String.valueOf(i2)));
        b.a d2 = d(this.v);
        this.y.a(105, 0, "camera2 did change flash mode ".concat(String.valueOf(i2)));
        if (!d2.f61543a) {
            o.d(f61452a, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -418. Reason: " + d2.f61544b);
            this.y.a(-418, -418, "switch flash failed." + d2.f61544b);
            g.a aVar2 = this.y;
            if (i2 == 0) {
                i3 = 0;
            }
            aVar2.d(i3, "switch flash failed." + d2.f61544b);
            return;
        }
        g.a aVar3 = this.y;
        if (i2 == 0) {
            i3 = 0;
        }
        aVar3.c(i3, "torch success");
    }

    public b(e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, handler);
        this.x = cameraManager;
        if (this.A.n) {
            this.B = new h(this);
        } else {
            this.B = new com.ss.android.ttvecamera.d.g(this);
        }
    }
}

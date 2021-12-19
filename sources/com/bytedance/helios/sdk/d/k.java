package com.bytedance.helios.sdk.d;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class k extends n {

    /* renamed from: b  reason: collision with root package name */
    public static final a f30901b = new a((byte) 0);

    static {
        Covode.recordClassIndex(17931);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(17932);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.helios.sdk.d.b
    public final int[] a() {
        return j.f30897c;
    }

    @Override // com.bytedance.helios.sdk.d.n
    public final String b() {
        return j.f30895a;
    }

    public k() {
        a(j.f30898d);
    }

    @Override // com.bytedance.helios.sdk.d.n
    public final long a(d dVar) {
        Object obj;
        CameraCaptureSession cameraCaptureSession;
        l.c(dVar, "");
        int i2 = dVar.f30865d;
        int i3 = 0;
        if (i2 != 100100) {
            switch (i2) {
                case 100200:
                    Object[] objArr = dVar.f30864c;
                    if (objArr != null) {
                        obj = objArr[0];
                        break;
                    }
                    break;
                case 100201:
                case 100205:
                    obj = dVar.f30863b;
                    break;
                case 100202:
                case 100203:
                case 100204:
                    if (Build.VERSION.SDK_INT >= 21 && (cameraCaptureSession = (CameraCaptureSession) dVar.f30863b) != null) {
                        obj = cameraCaptureSession.getDevice();
                        break;
                    }
                default:
                    obj = dVar.f30863b;
                    break;
            }
            return (long) i3;
        }
        obj = dVar.f30862a;
        if (obj != null) {
            i3 = obj.hashCode();
        }
        return (long) i3;
    }

    @Override // com.bytedance.helios.sdk.d.n
    public final List<Integer> b(int i2) {
        switch (i2) {
            case 100101:
                return n.a((Object) 100100);
            case 100103:
                return n.a((Object) 100102);
            case 100105:
                return n.a((Object) 100104);
            case 100201:
                return n.b(100200, 100202, 100203);
            case 100204:
                return n.b(100202, 100203);
            default:
                return z.INSTANCE;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.helios.sdk.d.b
    public final void a(d dVar, Throwable th) {
        l.c(dVar, "");
        e eVar = (e) this.f30855a.get(dVar.f30865d);
        if (eVar.f30874b == 3) {
            int i2 = eVar.f30875c;
            if (i2 == 100106 || i2 == 100205) {
                b(dVar);
                return;
            }
            return;
        }
        l.a((Object) eVar, "");
        a(eVar, dVar, th);
    }
}

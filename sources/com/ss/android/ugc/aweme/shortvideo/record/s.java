package com.ss.android.ugc.aweme.shortvideo.record;

import android.hardware.Camera;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.i.g;
import h.f.b.l;

public final class s implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f130147a = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static int f130148c = -1;

    /* renamed from: b  reason: collision with root package name */
    private final ar f130149b;

    public static final class a {
        static {
            Covode.recordClassIndex(85381);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(85380);
    }

    private static int b() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            if (numberOfCameras <= 0) {
                return -1;
            }
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int i2 = 0;
            while (true) {
                Camera.getCameraInfo(i2, cameraInfo);
                if (cameraInfo.facing == 1) {
                    return 1;
                }
                i2++;
                if (i2 >= numberOfCameras) {
                    return -1;
                }
            }
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.i.g
    public final int a() {
        Integer a2 = this.f130149b.a();
        if (a2 != null) {
            return a2.intValue();
        }
        if (f130148c == -1) {
            f130148c = b();
        }
        int i2 = f130148c;
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.i.g
    public final void b(int i2) {
        this.f130149b.a(i2);
    }

    public s(ar arVar) {
        l.d(arVar, "");
        this.f130149b = arVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.i.g
    public final int a(int i2) {
        if (i2 == 1) {
            i2 = b();
        }
        if (i2 != -1) {
            return i2;
        }
        return 0;
    }
}

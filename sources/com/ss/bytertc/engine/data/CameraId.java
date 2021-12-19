package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public enum CameraId {
    CAMERA_ID_FRONT(0),
    CAMERA_ID_BACK(1);
    
    private int value = 1;

    public final int value() {
        return this.value;
    }

    public final String toString() {
        int i2 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$CameraId[ordinal()];
        if (i2 == 1) {
            return "kCameraIDFront";
        }
        if (i2 != 2) {
            return "";
        }
        return "kCameraIDBack";
    }

    /* renamed from: com.ss.bytertc.engine.data.CameraId$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$CameraId;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 100852(0x189f4, float:1.41324E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.engine.data.CameraId[] r0 = com.ss.bytertc.engine.data.CameraId.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.bytertc.engine.data.CameraId.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$CameraId = r2
                com.ss.bytertc.engine.data.CameraId r0 = com.ss.bytertc.engine.data.CameraId.CAMERA_ID_FRONT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.bytertc.engine.data.CameraId.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$CameraId     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.engine.data.CameraId r0 = com.ss.bytertc.engine.data.CameraId.CAMERA_ID_BACK     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.data.CameraId.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(100851);
    }

    public static CameraId fromId(int i2) {
        CameraId[] values = values();
        for (CameraId cameraId : values) {
            if (cameraId.value() == i2) {
                return cameraId;
            }
        }
        return null;
    }

    private CameraId(int i2) {
        this.value = i2;
    }
}

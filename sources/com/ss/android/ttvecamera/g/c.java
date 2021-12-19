package com.ss.android.ttvecamera.g;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class c extends e {
    static {
        Covode.recordClassIndex(37881);
    }

    @Override // com.ss.android.ttvecamera.g.e
    public final String b() {
        if (e()) {
            return "3";
        }
        return super.b();
    }

    @Override // com.ss.android.ttvecamera.g.e
    public final boolean a() {
        if (!"0".equals(b()) || e()) {
            return true;
        }
        return false;
    }

    private static boolean e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("YAL-AL00");
        arrayList.add("YAL-AL10");
        arrayList.add("YAL-TL00");
        arrayList.add("YAL-TL10");
        arrayList.add("YAL-L21");
        arrayList.add("YAL-L41");
        arrayList.add("YAL-AL50");
        arrayList.add("YAL-TL50");
        arrayList.add("YAL-L51");
        arrayList.add("SEA-AL00");
        arrayList.add("SEA-TL00");
        arrayList.add("SEA-AL10");
        arrayList.add("SEA-TL10");
        return arrayList.contains(Build.MODEL);
    }

    public c(Context context) {
        super(context);
    }

    @Override // com.ss.android.ttvecamera.g.e
    public final void a(int i2, CameraManager cameraManager) {
        if (e()) {
            f61547b = "3";
        } else {
            super.a(i2, cameraManager);
        }
    }
}

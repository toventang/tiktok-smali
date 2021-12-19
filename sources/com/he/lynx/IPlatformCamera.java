package com.he.lynx;

import android.graphics.SurfaceTexture;
import android.util.Size;
import com.bytedance.covode.number.Covode;
import com.he.lynx.HeliumApp;

public interface IPlatformCamera extends HeliumApp.StateCallback {

    public interface CameraEventCallback {
        static {
            Covode.recordClassIndex(34209);
        }

        void onPause();

        void onResume(boolean z, String str);
    }

    static {
        Covode.recordClassIndex(34208);
    }

    void autoFocus();

    void dispose();

    Size getCameraResolution();

    void onSurfaceTextureReady(SurfaceTexture surfaceTexture);

    void request(boolean z, boolean z2, boolean z3, int i2, int i3);

    void setCameraEventCallback(CameraEventCallback cameraEventCallback);

    void setZoom(float f2);
}

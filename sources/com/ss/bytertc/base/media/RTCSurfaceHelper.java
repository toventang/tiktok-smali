package com.ss.bytertc.base.media;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class RTCSurfaceHelper {
    static {
        Covode.recordClassIndex(100712);
    }

    static class RTCSurfaceTextureListener implements TextureView.SurfaceTextureListener {
        private long nativeCallbackHandle;
        private Surface surface;

        static {
            Covode.recordClassIndex(100713);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void resetCallback() {
            this.nativeCallbackHandle = 0;
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            MethodCollector.i(9368);
            long j2 = this.nativeCallbackHandle;
            if (j2 != 0) {
                RTCNativeFunctions.nativeNotifySurfaceDestroyed(j2, this.surface, true);
            }
            this.surface = null;
            MethodCollector.o(9368);
            return true;
        }

        RTCSurfaceTextureListener(SurfaceTexture surfaceTexture, long j2) {
            Surface surface2;
            MethodCollector.i(8967);
            if (surfaceTexture != null) {
                surface2 = new Surface(surfaceTexture);
            } else {
                surface2 = null;
            }
            this.surface = surface2;
            this.nativeCallbackHandle = j2;
            if (!(surface2 == null || j2 == 0)) {
                RTCNativeFunctions.nativeNotifySurfaceAvailable(j2, surface2, true);
            }
            MethodCollector.o(8967);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            MethodCollector.i(9166);
            if (this.nativeCallbackHandle != 0) {
                Surface surface2 = new Surface(surfaceTexture);
                this.surface = surface2;
                RTCNativeFunctions.nativeNotifySurfaceAvailable(this.nativeCallbackHandle, surface2, true);
            }
            MethodCollector.o(9166);
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            MethodCollector.i(9366);
            long j2 = this.nativeCallbackHandle;
            if (j2 != 0) {
                RTCNativeFunctions.nativeNotifySurfaceSizeChanged(j2);
            }
            MethodCollector.o(9366);
        }
    }

    static class RTCSurfaceViewListener implements SurfaceHolder.Callback {
        private long nativeCallbackHandle;
        private Surface surface;

        static {
            Covode.recordClassIndex(100714);
        }

        public void resetCallback() {
            this.nativeCallbackHandle = 0;
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            MethodCollector.i(7064);
            if (this.nativeCallbackHandle != 0) {
                Surface surface2 = surfaceHolder.getSurface();
                this.surface = surface2;
                RTCNativeFunctions.nativeNotifySurfaceAvailable(this.nativeCallbackHandle, surface2, false);
            }
            MethodCollector.o(7064);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            MethodCollector.i(7107);
            long j2 = this.nativeCallbackHandle;
            if (j2 != 0) {
                RTCNativeFunctions.nativeNotifySurfaceDestroyed(j2, surfaceHolder.getSurface(), false);
            }
            this.surface = null;
            MethodCollector.o(7107);
        }

        RTCSurfaceViewListener(Surface surface2, long j2) {
            MethodCollector.i(7062);
            this.surface = surface2;
            this.nativeCallbackHandle = j2;
            if (!(surface2 == null || j2 == 0)) {
                RTCNativeFunctions.nativeNotifySurfaceAvailable(j2, surface2, false);
            }
            MethodCollector.o(7062);
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            MethodCollector.i(7104);
            long j2 = this.nativeCallbackHandle;
            if (j2 != 0) {
                RTCNativeFunctions.nativeNotifySurfaceSizeChanged(j2);
            }
            MethodCollector.o(7104);
        }
    }

    public static Object registerSurfaceCallback(Object obj, long j2) {
        if (obj instanceof SurfaceView) {
            SurfaceView surfaceView = (SurfaceView) obj;
            RTCSurfaceViewListener rTCSurfaceViewListener = new RTCSurfaceViewListener(surfaceView.getHolder().getSurface(), j2);
            surfaceView.getHolder().addCallback(rTCSurfaceViewListener);
            return rTCSurfaceViewListener;
        } else if (!(obj instanceof TextureView)) {
            return null;
        } else {
            TextureView textureView = (TextureView) obj;
            RTCSurfaceTextureListener rTCSurfaceTextureListener = new RTCSurfaceTextureListener(textureView.getSurfaceTexture(), j2);
            textureView.setSurfaceTextureListener(rTCSurfaceTextureListener);
            return rTCSurfaceTextureListener;
        }
    }

    public static void unRegisterSurfaceCallback(View view, Object obj) {
        if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            if (obj != null) {
                ((RTCSurfaceTextureListener) obj).resetCallback();
            }
            textureView.setSurfaceTextureListener(null);
        } else if (view instanceof SurfaceView) {
            SurfaceView surfaceView = (SurfaceView) view;
            if (obj != null) {
                ((RTCSurfaceViewListener) obj).resetCallback();
            }
            surfaceView.getHolder().removeCallback((SurfaceHolder.Callback) obj);
        }
    }
}

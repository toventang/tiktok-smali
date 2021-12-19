package com.ss.android.ugc.aweme.services.external.ability;

import android.content.Context;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ability.camera.AVCameraParams;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVEnigmaResult;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVScanSettings;

public interface IQRCodeScanner {
    public static final Companion Companion = Companion.$$INSTANCE;

    public interface OnEnigmaScanListener {
        static {
            Covode.recordClassIndex(79671);
        }

        void onFail(int i2);

        void onSuccess(AVEnigmaResult aVEnigmaResult);
    }

    static {
        Covode.recordClassIndex(79669);
    }

    void closeLight();

    void enableCameraScan(boolean z, long j2);

    void openLight();

    void pauseEffectAudio(boolean z);

    void processTouchEvent(float f2, float f3);

    void release();

    void setScanListener(OnEnigmaScanListener onEnigmaScanListener);

    void startPicScan(String str, AVScanSettings aVScanSettings, long j2);

    void startScan(Context context, AVCameraParams aVCameraParams, SurfaceHolder surfaceHolder, AVScanSettings aVScanSettings);

    void stop();

    void stopPicScan();

    void switchEffectWithTag(String str, int i2, int i3, String str2);

    void zoomByRatio(float f2);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79670);
        }
    }
}

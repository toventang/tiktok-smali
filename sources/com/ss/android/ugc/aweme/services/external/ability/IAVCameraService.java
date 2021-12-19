package com.ss.android.ugc.aweme.services.external.ability;

import android.content.Context;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;

public interface IAVCameraService {

    public interface IAVCameraReadyCallback<T> {
        static {
            Covode.recordClassIndex(79648);
        }

        void finish(T t);
    }

    static {
        Covode.recordClassIndex(79647);
    }

    void getScanner(boolean z, Context context, SurfaceHolder surfaceHolder, IAVCameraReadyCallback<IQRCodeScanner> iAVCameraReadyCallback);
}

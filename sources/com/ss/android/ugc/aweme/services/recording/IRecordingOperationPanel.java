package com.ss.android.ugc.aweme.services.recording;

import androidx.lifecycle.LiveData;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.shortvideo.x.i;
import com.ss.android.ugc.aweme.shortvideo.x.k;

public interface IRecordingOperationPanel {
    static {
        Covode.recordClassIndex(79792);
    }

    SimpleDraweeView backgroundView();

    void closeCamera(PrivacyCert privacyCert);

    void closeRecording();

    i filterModule();

    androidx.fragment.app.i fragmentManager();

    int getCameraPos();

    androidx.lifecycle.i getLifecycle();

    LiveData<Float> getZoomEvent();

    void onGameStickerChosen(IStickerService.FaceSticker faceSticker, String str);

    void onHidePanel(String str);

    void onShowPanel(String str);

    void onStickerCancel(IStickerService.FaceSticker faceSticker, String str);

    void onStickerChosen(IStickerService.FaceSticker faceSticker, String str);

    void openCamera(PrivacyCert privacyCert);

    void setCameraPos(int i2, PrivacyCert privacyCert);

    void updateLiveBackgroundView();

    k videoRecorder();
}

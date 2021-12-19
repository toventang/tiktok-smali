package com.bytedance.creativex.editor.preview;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.MultiSegmentPropExtra;
import java.util.List;

public interface a {
    static {
        Covode.recordClassIndex(16418);
    }

    String[] getAudioPaths();

    int getCanvasHeight();

    int getCanvasWidth();

    long getEditorHandler();

    boolean getEnableAutoStart();

    boolean getEnableMusicSync();

    int getFps();

    MultiSegmentPropExtra getMultiSegmentPropInfo();

    boolean getNeedVEUserConfig();

    int getPreviewHeight();

    int getPreviewWidth();

    int[] getRotateArray();

    float[] getSpeedArray();

    int[] getVTrimIn();

    int[] getVTrimOut();

    IAudioEffectParam getVeAudioEffectParam();

    List<IAudioEffectParam> getVeAudioEffectParamList();

    String[] getVideoPaths();

    float getVolume();

    String getWorkspace();

    boolean isCanvasVEEditorType();
}

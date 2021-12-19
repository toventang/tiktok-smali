package com.ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.livestreamv2.RenderView;
import com.ss.avframework.livestreamv2.core.ILayerControl;
import com.ss.avframework.mixer.VideoMixer;

public interface ILayerControlExt extends ILayerControl {

    public interface ILayerExt extends ILayerControl.ILayer {
        static {
            Covode.recordClassIndex(100068);
        }

        int getMixerOutHeight();

        int getMixerOutWidth();

        void renderFrame(VideoFrame videoFrame);

        void renderFrame(VideoMixer.VideoMixerTexture videoMixerTexture);
    }

    static {
        Covode.recordClassIndex(100067);
    }

    ILayerExt createLayerExt(String str, VideoMixer.VideoMixerDescription videoMixerDescription, int i2, int i3, int i4);

    RenderView getRenderView();

    VideoMixer getVideoMixer();

    boolean isFitMode();

    boolean isMirror(boolean z);

    void pause();

    void resume();

    void setFitMode(boolean z);

    void setLocalOrigin(String str);

    void setMirror(boolean z, boolean z2);
}

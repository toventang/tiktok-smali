package com.ss.avframework.livestreamv2.core;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.mixer.VideoMixer;

public interface ILayerControl {

    public interface ILayer {
        static {
            Covode.recordClassIndex(100066);
        }

        void dispose();

        int getHeight();

        VideoMixer.VideoMixerDescription getLayerDescription();

        int getRealFps();

        int getWidth();

        boolean isEnable();

        Canvas lockCanvas();

        String name();

        void pause();

        void resume();

        void setAnimationMode(int i2, long j2, RectF rectF);

        void setEnable(boolean z);

        void setVisibility(int i2);

        void unlockCanvasAndPost(Canvas canvas, long j2);

        void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription);
    }

    static {
        Covode.recordClassIndex(100065);
    }

    ILayer createLayer(String str, VideoMixer.VideoMixerDescription videoMixerDescription, int i2, int i3);

    ILayer getLayer(String str);

    ILayer[] getLayers();

    ILayer getLocalOriginLayer();

    float getRealRenderFps();

    int layerSize();

    void setOriginTriggering(String str);
}

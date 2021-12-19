package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.VideoTrack;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import com.ss.avframework.mixer.VideoMixer;

public interface IDualGameEngine {

    public interface IDualGameNotifierToLiveCore {
        static {
            Covode.recordClassIndex(99856);
        }

        void onDualGameStatusChange(boolean z);
    }

    static {
        Covode.recordClassIndex(99855);
    }

    void connectVideoTrack(VideoTrack videoTrack, boolean z);

    void enable(boolean z);

    IFilterManager getDualGameFilterManager();

    VideoMixer getDualGameMixer();

    VideoTrack getEncodeVideoTrack();

    void init(float f2);

    boolean isEnable();

    void release();
}

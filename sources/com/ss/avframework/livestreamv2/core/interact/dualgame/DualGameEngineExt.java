package com.ss.avframework.livestreamv2.core.interact.dualgame;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.VideoSink;
import com.ss.avframework.engine.VideoTrack;
import com.ss.avframework.livestreamv2.IDualGameEngine;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import com.ss.avframework.mixer.VideoMixer;

public abstract class DualGameEngineExt extends VideoSink implements IDualGameEngine {

    public interface IDualGameFrameCallback {
        static {
            Covode.recordClassIndex(100240);
        }

        boolean onDualGameFrameCallback(int i2, int i3, int i4, int i5);
    }

    static {
        Covode.recordClassIndex(100239);
    }

    @Override // com.ss.avframework.livestreamv2.IDualGameEngine
    public abstract void connectVideoTrack(VideoTrack videoTrack, boolean z);

    @Override // com.ss.avframework.livestreamv2.IDualGameEngine
    public abstract void enable(boolean z);

    @Override // com.ss.avframework.livestreamv2.IDualGameEngine
    public abstract IFilterManager getDualGameFilterManager();

    @Override // com.ss.avframework.livestreamv2.IDualGameEngine
    public abstract VideoMixer getDualGameMixer();

    @Override // com.ss.avframework.livestreamv2.IDualGameEngine
    public abstract VideoTrack getEncodeVideoTrack();

    @Override // com.ss.avframework.livestreamv2.IDualGameEngine
    public abstract void init(float f2);

    @Override // com.ss.avframework.livestreamv2.IDualGameEngine
    public abstract boolean isEnable();

    public abstract boolean mixInteractVideoFrame(int i2, int i3, int i4, int i5, float[] fArr);

    @Override // com.ss.avframework.engine.NativeObject, com.ss.avframework.livestreamv2.IDualGameEngine
    public abstract void release();

    public abstract void setDualGameNotifierToLiveCore(IDualGameEngine.IDualGameNotifierToLiveCore iDualGameNotifierToLiveCore);

    public abstract void setInteractVideoSink(com.ss.avframework.livestreamv2.core.interact.video.VideoSink videoSink);
}

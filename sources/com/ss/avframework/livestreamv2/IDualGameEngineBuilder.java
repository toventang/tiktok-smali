package com.ss.avframework.livestreamv2;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.livestreamv2.IDualGameEngine;
import com.ss.avframework.livestreamv2.core.ILayerControlExt;

public interface IDualGameEngineBuilder {
    static {
        Covode.recordClassIndex(99857);
    }

    IDualGameEngine create();

    IDualGameEngineBuilder setAdm(AudioDeviceModule audioDeviceModule);

    IDualGameEngineBuilder setBuilder(LiveStreamBuilder liveStreamBuilder);

    IDualGameEngineBuilder setHandler(Handler handler);

    IDualGameEngineBuilder setInputAudioStream(IInputAudioStream iInputAudioStream);

    IDualGameEngineBuilder setLayerControl(ILayerControlExt iLayerControlExt);

    IDualGameEngineBuilder setMediaEngineFactory(MediaEngineFactory mediaEngineFactory);

    IDualGameEngineBuilder setOnDualGameStatusChange(IDualGameEngine.IDualGameNotifierToLiveCore iDualGameNotifierToLiveCore);
}

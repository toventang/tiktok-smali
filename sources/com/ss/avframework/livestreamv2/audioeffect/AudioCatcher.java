package com.ss.avframework.livestreamv2.audioeffect;

import android.os.Bundle;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.livestreamv2.ILiveStream;

public class AudioCatcher {
    static {
        Covode.recordClassIndex(99950);
    }

    public static void CatchAudio(AudioDeviceModule audioDeviceModule, Handler handler, Bundle bundle, ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
    }

    public static void Stop(Handler handler) {
    }
}

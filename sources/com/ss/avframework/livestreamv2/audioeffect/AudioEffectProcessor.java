package com.ss.avframework.livestreamv2.audioeffect;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.AudioProcessor;
import com.ss.avframework.utils.TEBundle;
import java.util.Vector;

public abstract class AudioEffectProcessor extends AudioProcessor {

    public interface Callback {
        static {
            Covode.recordClassIndex(99952);
        }

        void onProgress(long j2);

        void start();

        void stop();
    }

    public interface CallbackV2 extends Callback {
        static {
            Covode.recordClassIndex(99953);
        }

        void onError(int i2, Exception exc);
    }

    static {
        Covode.recordClassIndex(99951);
    }

    public Vector<Vector<Double>> getMidiDrawingData() {
        return null;
    }

    public void getScoreInfo(double[] dArr) {
    }

    public TEBundle getStreamInfo() {
        return null;
    }

    public abstract void initEarMonitor();

    public abstract boolean isSupportHardWareEarMonitor();

    public void pause() {
    }

    public void resume() {
    }

    public void seek(long j2) {
    }

    public void seekLyricPos(double d2) {
    }

    public abstract void setBGMMusic(String str);

    public abstract void setBGMMusic(String str, long j2);

    public abstract void setBGMMusic(String str, String str2);

    public abstract void setBGMMusic(String str, String str2, long j2);

    public abstract void setBGMProgressListener(Callback callback);

    public abstract void setBGMVolume(float f2);

    public abstract void setDRCEnable(boolean z);

    public abstract void setEchoMode(boolean z);

    public abstract void setLoopEnable(boolean z);

    public abstract void setMixerEnable(boolean z);

    public abstract void setMusicPitch(int i2);

    public abstract void setOriginEnable(boolean z);

    public int setScoringSources(String str, String str2, double d2) {
        return -1;
    }

    public int setScoringSources(String str, int[] iArr) {
        return -1;
    }

    public void setSongScore(double d2) {
    }

    public abstract void setTuningParams(String str);

    public abstract void setTuningParams(String str, String str2);

    public abstract void setVoiceVolume(float f2);
}

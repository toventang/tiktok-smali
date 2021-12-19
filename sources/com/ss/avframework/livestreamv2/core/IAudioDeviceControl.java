package com.ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.AudioTrack;
import java.nio.ByteBuffer;

public interface IAudioDeviceControl {

    public interface IAudioTrack {
        static {
            Covode.recordClassIndex(100052);
        }

        void dispose();

        void enableAGC(boolean z, boolean z2);

        int getChannel();

        double getOption(int i2);

        long getQuirks();

        int getSampleHz();

        float getVolume();

        boolean isEnableAGC();

        boolean isMute();

        String name();

        void onData(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2);

        void onData(ByteBuffer byteBuffer, int i2, long j2);

        void setAudioTrack(AudioTrack audioTrack);

        boolean setMute(boolean z);

        void setQuirks(long j2);

        void setVolume(float f2);
    }

    static {
        Covode.recordClassIndex(100051);
    }

    IAudioTrack createTrack(String str, int i2, int i3, int i4);

    boolean enableAEC(boolean z);

    boolean enableEcho(boolean z);

    IAudioTrack getTrack(String str);

    IAudioTrack[] getTracks();

    float getVolume();

    boolean isEnableAEC();

    boolean isEnableEcho();

    void setOriginTriggering(String str);

    void setVolume(float f2);
}

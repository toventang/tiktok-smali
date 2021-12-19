package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.mixer.AudioMixer;
import com.ss.avframework.mixer.VideoMixer;

public class MediaEditorStream {
    private AudioMixer mAudioMixer;
    private long mNativeObj;
    private VideoMixer mVideoMixer;

    static {
        Covode.recordClassIndex(99815);
    }

    private native long nativeGetAudioMixer(long j2);

    private native long nativeGetVideoMixer(long j2);

    private native boolean nativeSetAudioMixerDescription(long j2, String str, AudioMixer.AudioMixerDescription audioMixerDescription);

    private native void nativeSetOriginAudioTrack(long j2, String str);

    private native void nativeSetOriginVideoTrack(long j2, String str);

    private native boolean nativeSetVideoMixerDescription(long j2, String str, VideoMixer.VideoMixerDescription videoMixerDescription);

    public AudioMixer getAudioMixer() {
        MethodCollector.i(12901);
        AudioMixer audioMixer = this.mAudioMixer;
        if (audioMixer == null) {
            audioMixer = new AudioMixer(nativeGetAudioMixer(this.mNativeObj));
            this.mAudioMixer = audioMixer;
        }
        MethodCollector.o(12901);
        return audioMixer;
    }

    public VideoMixer getVideoMixer() {
        MethodCollector.i(12900);
        VideoMixer videoMixer = this.mVideoMixer;
        if (videoMixer == null) {
            videoMixer = new VideoMixer(nativeGetVideoMixer(this.mNativeObj));
            this.mVideoMixer = videoMixer;
        }
        MethodCollector.o(12900);
        return videoMixer;
    }

    public synchronized void release() {
        MethodCollector.i(12899);
        if (this.mNativeObj == 0) {
            MethodCollector.o(12899);
            return;
        }
        VideoMixer videoMixer = this.mVideoMixer;
        if (videoMixer != null) {
            videoMixer.release();
            this.mVideoMixer = null;
        }
        AudioMixer audioMixer = this.mAudioMixer;
        if (audioMixer != null) {
            audioMixer.release();
            this.mAudioMixer = null;
        }
        this.mNativeObj = 0;
        MethodCollector.o(12899);
    }

    public MediaEditorStream(long j2) {
        this.mNativeObj = j2;
    }

    public void setOriginAudioTrack(String str) {
        MethodCollector.i(12905);
        nativeSetOriginAudioTrack(this.mNativeObj, str);
        MethodCollector.o(12905);
    }

    public void setOriginVideoTrack(String str) {
        MethodCollector.i(12904);
        nativeSetOriginVideoTrack(this.mNativeObj, str);
        MethodCollector.o(12904);
    }

    public boolean setAudioMixerDescription(String str, AudioMixer.AudioMixerDescription audioMixerDescription) {
        MethodCollector.i(12903);
        boolean nativeSetAudioMixerDescription = nativeSetAudioMixerDescription(this.mNativeObj, str, audioMixerDescription);
        MethodCollector.o(12903);
        return nativeSetAudioMixerDescription;
    }

    public boolean setVideoMixerDescription(String str, VideoMixer.VideoMixerDescription videoMixerDescription) {
        MethodCollector.i(12902);
        boolean nativeSetVideoMixerDescription = nativeSetVideoMixerDescription(this.mNativeObj, str, videoMixerDescription);
        MethodCollector.o(12902);
        return nativeSetVideoMixerDescription;
    }
}

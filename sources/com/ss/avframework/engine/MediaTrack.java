package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.statics.StaticsReport;
import com.ss.avframework.utils.JniCommon;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class MediaTrack implements StaticsReport.StaticReportInterface {
    protected ArrayList<AudioSink> mAudioSinks = new ArrayList<>();
    private long mNativeObj;
    private MediaSource mSource;
    protected ArrayList<VideoSink> mVideoSinks = new ArrayList<>();

    static {
        Covode.recordClassIndex(99821);
    }

    private native boolean nativeEnable(long j2);

    private native String nativeId(long j2);

    private native String nativeKind(long j2);

    private native void nativeSetEnable(long j2, boolean z);

    /* access modifiers changed from: protected */
    public native void nativeAddAudioSink(long j2, AudioSink audioSink);

    /* access modifiers changed from: protected */
    public native void nativeAddVideoSink(long j2, VideoSink videoSink);

    /* access modifiers changed from: protected */
    public native boolean nativeGetStaticsReport(long j2, StaticsReport staticsReport);

    /* access modifiers changed from: protected */
    public native void nativeRemoveAudioSink(long j2, AudioSink audioSink);

    /* access modifiers changed from: protected */
    public native void nativeRemoveVideoSink(long j2, VideoSink videoSink);

    private long getNativeObj() {
        return this.mNativeObj;
    }

    public boolean enable() {
        return nativeEnable(this.mNativeObj);
    }

    public String id() {
        return nativeId(this.mNativeObj);
    }

    public String kind() {
        return nativeKind(this.mNativeObj);
    }

    public synchronized void release() {
        if (this.mNativeObj != 0) {
            Iterator<VideoSink> it = this.mVideoSinks.iterator();
            while (it.hasNext()) {
                VideoSink next = it.next();
                nativeRemoveVideoSink(this.mNativeObj, next);
                next.release();
                it.remove();
            }
            Iterator<AudioSink> it2 = this.mAudioSinks.iterator();
            while (it2.hasNext()) {
                AudioSink next2 = it2.next();
                nativeRemoveAudioSink(this.mNativeObj, next2);
                next2.release();
                it2.remove();
            }
            JniCommon.nativeReleaseRef(this.mNativeObj);
            this.mNativeObj = 0;
        }
    }

    /* access modifiers changed from: protected */
    public boolean containVideoSink(VideoSink videoSink) {
        return this.mVideoSinks.contains(videoSink);
    }

    @Override // com.ss.avframework.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return nativeGetStaticsReport(this.mNativeObj, staticsReport);
    }

    public void setEnable(boolean z) {
        nativeSetEnable(this.mNativeObj, z);
    }

    /* access modifiers changed from: protected */
    public void removeAudioSink(AudioSink audioSink) {
        if (this.mAudioSinks.remove(audioSink)) {
            nativeRemoveAudioSink(this.mNativeObj, audioSink);
        }
    }

    /* access modifiers changed from: protected */
    public void removeVideoSink(VideoSink videoSink) {
        if (this.mVideoSinks.remove(videoSink)) {
            nativeRemoveVideoSink(this.mNativeObj, videoSink);
        }
    }

    /* access modifiers changed from: protected */
    public void addAudioSink(AudioSink audioSink) {
        if (this.mAudioSinks.indexOf(audioSink) < 0) {
            this.mAudioSinks.add(audioSink);
            nativeAddAudioSink(this.mNativeObj, audioSink);
        }
    }

    /* access modifiers changed from: protected */
    public void addVideoSink(VideoSink videoSink) {
        if (this.mVideoSinks.indexOf(videoSink) < 0) {
            this.mVideoSinks.add(videoSink);
            nativeAddVideoSink(this.mNativeObj, videoSink);
        }
    }

    public MediaTrack(long j2, MediaSource mediaSource) {
        this.mNativeObj = j2;
        this.mSource = mediaSource;
    }
}

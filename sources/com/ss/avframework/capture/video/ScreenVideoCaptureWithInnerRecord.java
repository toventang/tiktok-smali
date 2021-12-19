package com.ss.avframework.capture.video;

import android.content.Intent;
import android.media.AudioRecord;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import com.ss.avframework.capture.audio.AudioRecordThread;
import com.ss.avframework.capture.video.VideoCapturer;

public class ScreenVideoCaptureWithInnerRecord extends ScreenVideoCapturer {
    private AudioRecord mAudioRecord;
    private AudioRecordThread mAudioRecordThread;
    private AudioRecordThread.IAudioRecordThreadObserver mIAudioRecordThreadObserver;

    static {
        Covode.recordClassIndex(99731);
    }

    private static void com_ss_avframework_capture_video_ScreenVideoCaptureWithInnerRecord_android_media_AudioRecord_release(AudioRecord audioRecord) {
        if (!((Boolean) a.a(audioRecord, new Object[0], 100403, "void", false, null).first).booleanValue()) {
            a.a(null, audioRecord, new Object[0], 100405, "com_ss_avframework_capture_video_ScreenVideoCaptureWithInnerRecord_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
            audioRecord.release();
            a.a(null, audioRecord, new Object[0], 100403, "com_ss_avframework_capture_video_ScreenVideoCaptureWithInnerRecord_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
        }
    }

    private static void com_ss_avframework_capture_video_ScreenVideoCaptureWithInnerRecord_android_media_AudioRecord_stop(AudioRecord audioRecord) {
        if (!((Boolean) a.a(audioRecord, new Object[0], 100401, "void", false, null).first).booleanValue()) {
            a.a(null, audioRecord, new Object[0], 100404, "com_ss_avframework_capture_video_ScreenVideoCaptureWithInnerRecord_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
            audioRecord.stop();
            a.a(null, audioRecord, new Object[0], 100401, "com_ss_avframework_capture_video_ScreenVideoCaptureWithInnerRecord_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
        }
    }

    private void startAudioPlayBack() {
    }

    public void setAudioPlayBackObserver(AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver) {
    }

    @Override // com.ss.avframework.capture.video.ScreenVideoCapturer, com.ss.avframework.engine.NativeObject
    public void release() {
        AudioRecord audioRecord = this.mAudioRecord;
        this.mAudioRecord = null;
        if (audioRecord != null) {
            com_ss_avframework_capture_video_ScreenVideoCaptureWithInnerRecord_android_media_AudioRecord_release(audioRecord);
        }
        this.mAudioRecordThread = null;
        super.release();
    }

    @Override // com.ss.avframework.capture.video.ScreenVideoCapturer, com.ss.avframework.capture.video.VideoCapturer
    public void stop() {
        this.mIAudioRecordThreadObserver = null;
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord != null) {
            com_ss_avframework_capture_video_ScreenVideoCaptureWithInnerRecord_android_media_AudioRecord_stop(audioRecord);
        }
        AudioRecordThread audioRecordThread = this.mAudioRecordThread;
        if (audioRecordThread != null) {
            audioRecordThread.stop();
        }
        super.stop();
    }

    public ScreenVideoCaptureWithInnerRecord(Intent intent, VideoCapturer.VideoCapturerObserver videoCapturerObserver) {
        super(intent, videoCapturerObserver);
    }
}

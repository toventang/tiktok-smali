package com.ss.avframework.capture.audio;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.ss.avframework.capture.audio.AudioCapturer;
import com.ss.avframework.capture.audio.AudioRecordThread;
import com.ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class AudioCapturerAudioRecord extends AudioCapturer {
    private static String TAG = "AudioCapturerAudioRecord";
    public AudioCapturer.AudioCaptureObserver mAudioCaptureObserver;
    private AudioRecord mAudioRecord;
    private int mAudioSource;
    private AudioRecordThread mAudioThread;
    private final int mBitWidth;
    private int mChannel;
    public boolean mPause;
    private List<AudioManager.AudioRecordingCallback> mRecordCallbackList;
    private final int mSample;
    private int mStat;

    private int channelCountToConfiguration(int i2) {
        return i2 == 1 ? 16 : 12;
    }

    private static void com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_release(AudioRecord audioRecord) {
        if (!((Boolean) a.a(audioRecord, new Object[0], 100403, "void", false, null).first).booleanValue()) {
            a.a(null, audioRecord, new Object[0], 100405, "com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
            audioRecord.release();
            a.a(null, audioRecord, new Object[0], 100403, "com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
        }
    }

    private static void com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_startRecording(AudioRecord audioRecord) {
        if (!((Boolean) a.a(audioRecord, new Object[0], 100400, "void", false, null).first).booleanValue()) {
            audioRecord.startRecording();
            a.a(null, audioRecord, new Object[0], 100400, "com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_startRecording(Landroid/media/AudioRecord;)V");
        }
    }

    private static void com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_stop(AudioRecord audioRecord) {
        if (!((Boolean) a.a(audioRecord, new Object[0], 100401, "void", false, null).first).booleanValue()) {
            a.a(null, audioRecord, new Object[0], 100404, "com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
            audioRecord.stop();
            a.a(null, audioRecord, new Object[0], 100401, "com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
        }
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void pause() {
        this.mPause = true;
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void resume() {
        this.mPause = false;
    }

    public int getAudioSource() {
        return this.mAudioSource;
    }

    @Override // com.ss.avframework.engine.MediaSource
    public int status() {
        return this.mStat;
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public int updateChannel() {
        return this.mChannel;
    }

    static {
        Covode.recordClassIndex(99712);
    }

    @Override // com.ss.avframework.engine.NativeObject, com.ss.avframework.engine.AudioSource, com.ss.avframework.capture.audio.AudioCapturer
    public synchronized void release() {
        MethodCollector.i(12964);
        AVLog.iod(TAG, "Release audioRecord ".concat(String.valueOf(this)));
        releaseAllAudioRecordingCbs();
        stop();
        super.release();
        MethodCollector.o(12964);
    }

    private synchronized void releaseAllAudioRecordingCbs() {
        MethodCollector.i(13059);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.mRecordCallbackList.size() == 0 || this.mAudioRecord == null) {
                MethodCollector.o(13059);
                return;
            }
            for (AudioManager.AudioRecordingCallback audioRecordingCallback : this.mRecordCallbackList) {
                this.mAudioRecord.unregisterAudioRecordingCallback(audioRecordingCallback);
            }
            this.mRecordCallbackList.clear();
        }
        MethodCollector.o(13059);
    }

    private void startRecording() {
        AVLog.d(TAG, "startRecording");
        try {
            com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_startRecording(this.mAudioRecord);
            if (this.mAudioRecord.getRecordingState() == 3) {
                AudioRecordThread audioRecordThread = new AudioRecordThread(this.mAudioRecord, new AudioRecordThread.IAudioRecordThreadObserver() {
                    /* class com.ss.avframework.capture.audio.AudioCapturerAudioRecord.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(99713);
                    }

                    @Override // com.ss.avframework.capture.audio.AudioRecordThread.IAudioRecordThreadObserver
                    public void onError(int i2, Exception exc) {
                        if (AudioCapturerAudioRecord.this.mAudioCaptureObserver != null) {
                            AudioCapturerAudioRecord.this.mAudioCaptureObserver.onAudioCaptureError(i2, exc);
                        }
                    }

                    @Override // com.ss.avframework.capture.audio.AudioRecordThread.IAudioRecordThreadObserver
                    public void onData(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
                        if (!AudioCapturerAudioRecord.this.mPause) {
                            AudioCapturerAudioRecord.this.nativeOnData(byteBuffer, i2, i3, i4, j2);
                        }
                    }
                });
                this.mAudioThread = audioRecordThread;
                audioRecordThread.start();
                this.mStat = 1;
                AVLog.iow(TAG, "AudioRecord started");
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("AudioRecord.startRecording failed - incorrect state :" + this.mAudioRecord.getRecordingState());
            AVLog.w(TAG, illegalStateException.getMessage());
            AVLog.ioe(TAG, illegalStateException.getMessage());
            throw illegalStateException;
        } catch (IllegalStateException e2) {
            throw new IllegalStateException("AudioRecord.startRecording failed: " + e2.getMessage());
        }
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public synchronized void stop() {
        MethodCollector.i(12867);
        AudioRecordThread audioRecordThread = this.mAudioThread;
        if (audioRecordThread != null) {
            audioRecordThread.stop();
            this.mAudioThread = null;
        }
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord != null) {
            try {
                com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_stop(audioRecord);
                AVLog.iow(TAG, "AudioRecord stopped");
            } catch (IllegalStateException e2) {
                AVLog.ioe(TAG, "AudioRecord.stop() error: " + e2.toString());
            }
            com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_release(this.mAudioRecord);
            this.mAudioRecord = null;
            AVLog.iow(TAG, "AudioRecord released");
        }
        this.mAudioCaptureObserver = null;
        this.mStat = 2;
        MethodCollector.o(12867);
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void start() {
        int channelCountToConfiguration = channelCountToConfiguration(this.mChannel);
        int minBufferSize = AudioRecord.getMinBufferSize(this.mSample, channelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            throw new IllegalStateException("AudioRecord.getMinBufferSize failed: ".concat(String.valueOf(minBufferSize)));
        }
        AVLog.d(TAG, "AudioRecord.getMinBufferSize: ".concat(String.valueOf(minBufferSize)));
        int max = Math.max(minBufferSize * 2, this.mChannel * (this.mBitWidth / 8) * (this.mSample / 100));
        AVLog.d(TAG, "bufferSizeInBytes: ".concat(String.valueOf(max)));
        try {
            AVLog.ioi(TAG, "Using audio mode " + this.mAudioSource + " at AudioRecord " + this);
            AudioRecord audioRecord = new AudioRecord(this.mAudioSource, this.mSample, channelCountToConfiguration, 2, max);
            this.mAudioRecord = audioRecord;
            if (audioRecord.getState() == 1) {
                startRecording();
                return;
            }
            throw new IllegalStateException("Failed to create a new AudioRecord instance");
        } catch (IllegalArgumentException e2) {
            if (this.mChannel != 1) {
                AudioRecord audioRecord2 = this.mAudioRecord;
                if (audioRecord2 != null) {
                    com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_release(audioRecord2);
                }
                this.mChannel = 1;
                AVLog.d(TAG, "AudioRecord trying mono...");
                start();
                return;
            }
            throw new IllegalStateException("AudioRecord ctor error: " + e2.getMessage());
        }
    }

    public synchronized void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        MethodCollector.i(13156);
        if (!(Build.VERSION.SDK_INT < 29 || audioRecordingCallback == null || this.mAudioRecord == null)) {
            if (!this.mRecordCallbackList.contains(audioRecordingCallback)) {
                MethodCollector.o(13156);
                return;
            } else {
                this.mRecordCallbackList.remove(audioRecordingCallback);
                this.mAudioRecord.unregisterAudioRecordingCallback(audioRecordingCallback);
            }
        }
        MethodCollector.o(13156);
    }

    public synchronized void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        MethodCollector.i(12966);
        if (!(Build.VERSION.SDK_INT < 29 || audioRecordingCallback == null || this.mAudioRecord == null || executor == null)) {
            if (this.mRecordCallbackList.contains(audioRecordingCallback)) {
                MethodCollector.o(12966);
                return;
            } else {
                this.mRecordCallbackList.add(audioRecordingCallback);
                this.mAudioRecord.registerAudioRecordingCallback(executor, audioRecordingCallback);
            }
        }
        MethodCollector.o(12966);
    }

    public AudioCapturerAudioRecord(int i2, int i3, int i4) {
        this(1, i2, i3, i4, null);
    }

    public AudioCapturerAudioRecord(int i2, int i3, int i4, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this(1, i2, i3, i4, audioCaptureObserver);
    }

    public AudioCapturerAudioRecord(int i2, int i3, int i4, int i5, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this.mRecordCallbackList = new ArrayList();
        AVLog.iod(TAG, "Construct audioRecord ".concat(String.valueOf(this)));
        this.mStat = 0;
        this.mSample = i3;
        this.mChannel = i4;
        this.mBitWidth = i5;
        this.mAudioSource = i2;
        this.mAudioCaptureObserver = audioCaptureObserver;
        setMode(i2);
        pause();
    }
}

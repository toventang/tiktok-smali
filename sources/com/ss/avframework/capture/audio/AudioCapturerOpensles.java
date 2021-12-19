package com.ss.avframework.capture.audio;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.capture.audio.AudioCapturer;

public class AudioCapturerOpensles extends AudioCapturer {
    public AudioCapturer.AudioCaptureObserver mAudioCaptureObserver;
    private int mChannel;
    private Runnable mCheckRecordingRunnable;
    private Handler mHandler;
    private int mStat;

    static {
        Covode.recordClassIndex(99715);
    }

    private native void nativeCreate(int i2, int i3, int i4, int i5);

    private native void nativePause();

    private native void nativeResume();

    private native int nativeStart();

    private native void nativeStop();

    public native boolean nativeRecording();

    @Override // com.ss.avframework.engine.MediaSource
    public int status() {
        return this.mStat;
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public int updateChannel() {
        return this.mChannel;
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void pause() {
        MethodCollector.i(14072);
        nativePause();
        MethodCollector.o(14072);
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void resume() {
        MethodCollector.i(14071);
        nativeResume();
        MethodCollector.o(14071);
    }

    @Override // com.ss.avframework.engine.NativeObject, com.ss.avframework.engine.AudioSource, com.ss.avframework.capture.audio.AudioCapturer
    public synchronized void release() {
        MethodCollector.i(13610);
        stop();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mCheckRecordingRunnable);
        }
        super.release();
        MethodCollector.o(13610);
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public synchronized void stop() {
        MethodCollector.i(13608);
        if (this.mStat != 2) {
            pause();
            nativeStop();
            this.mStat = 2;
        }
        MethodCollector.o(13608);
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void start() {
        MethodCollector.i(12370);
        int nativeStart = nativeStart();
        if (nativeStart == 0) {
            this.mStat = 1;
            if (this.mHandler == null) {
                this.mHandler = new Handler(Looper.myLooper());
                this.mCheckRecordingRunnable = new Runnable() {
                    /* class com.ss.avframework.capture.audio.AudioCapturerOpensles.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(99716);
                    }

                    public void run() {
                        MethodCollector.i(14405);
                        if (!AudioCapturerOpensles.this.nativeRecording() && AudioCapturerOpensles.this.mAudioCaptureObserver != null) {
                            AudioCapturerOpensles.this.mAudioCaptureObserver.onAudioCaptureError(-303, new Exception("OpenSL ES is not recording."));
                        }
                        MethodCollector.o(14405);
                    }
                };
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.postDelayed(this.mCheckRecordingRunnable, 3000);
            }
            MethodCollector.o(12370);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Start failure (" + nativeStart + ")");
        MethodCollector.o(12370);
        throw illegalStateException;
    }

    private void channelChange(int i2) {
        this.mChannel = i2;
    }

    public AudioCapturerOpensles(int i2, int i3, int i4, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this(1, i2, i3, i4, audioCaptureObserver);
    }

    public AudioCapturerOpensles(int i2, int i3, int i4, int i5, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        MethodCollector.i(14492);
        this.mChannel = i4;
        this.mAudioCaptureObserver = audioCaptureObserver;
        nativeCreate(i2, i3, i4, i5);
        setMode(i2);
        MethodCollector.o(14492);
    }
}

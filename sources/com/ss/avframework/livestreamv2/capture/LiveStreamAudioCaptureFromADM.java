package com.ss.avframework.livestreamv2.capture;

import android.media.AudioManager;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.WrapperNativeAudioBuffer;
import com.ss.avframework.capture.audio.AudioCapturer;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.engine.AudioSink;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.ss.avframework.utils.TEBundle;
import com.ss.avframework.utils.ThreadUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

public class LiveStreamAudioCaptureFromADM extends LiveStreamAudioCapture {
    public static final String TAG = LiveStreamAudioCaptureFromADM.class.getSimpleName();
    public boolean mRecording;
    public boolean mStoped;

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public int getCurrentCaptureDevice() {
        return 5;
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void pause() {
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void resume() {
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.ss.avframework.engine.MediaSource
    public int status() {
        return 1;
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
    }

    static {
        Covode.recordClassIndex(99992);
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public int getMode() {
        if (this.mADM.isVoIPMode()) {
            return 7;
        }
        return 1;
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void toBackground() {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99994);
            }

            public void run() {
                boolean z;
                if (!LiveStreamAudioCaptureFromADM.this.mStoped) {
                    AudioDeviceModule audioDeviceModule = LiveStreamAudioCaptureFromADM.this.mADM;
                    if (LiveStreamAudioCaptureFromADM.this.mBGMMode == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    audioDeviceModule.disableLocalAudioStream(z);
                    LiveStreamAudioCaptureFromADM.this.mADM.pause();
                    AVLog.iod(LiveStreamAudioCaptureFromADM.TAG, "toBackground with stop recording (" + LiveStreamAudioCaptureFromADM.this.mRecording + ") and disable stream (" + LiveStreamAudioCaptureFromADM.this.mADM.isDisableLocalAudioStream() + ")");
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void toFront() {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.AnonymousClass3 */

            static {
                Covode.recordClassIndex(99995);
            }

            public void run() {
                String str;
                if (!LiveStreamAudioCaptureFromADM.this.mStoped) {
                    LiveStreamAudioCaptureFromADM.this.mADM.disableLocalAudioStream(false);
                    LiveStreamAudioCaptureFromADM.this.mADM.resume();
                    String str2 = LiveStreamAudioCaptureFromADM.TAG;
                    StringBuilder sb = new StringBuilder("toFront with ");
                    if (LiveStreamAudioCaptureFromADM.this.mRecording) {
                        str = "start recording ";
                    } else {
                        str = "stop recording";
                    }
                    AVLog.iod(str2, sb.append(str).toString());
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.ss.avframework.capture.audio.AudioCapturer
    public int updateChannel() {
        return this.mADM.getParameter().getInt("audio_channels");
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public boolean isMute() {
        final boolean[] zArr = {false};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.AnonymousClass5 */

            static {
                Covode.recordClassIndex(99997);
            }

            public void run() {
                zArr[0] = LiveStreamAudioCaptureFromADM.this.mADM.isMute();
            }
        });
        return zArr[0];
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.ss.avframework.capture.audio.AudioCapturer
    public synchronized void start() {
        MethodCollector.i(12129);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.AnonymousClass6 */

            static {
                Covode.recordClassIndex(99998);
            }

            public void run() {
                LiveStreamAudioCaptureFromADM.this.mADM.startRecording();
                AVLog.iod(LiveStreamAudioCaptureFromADM.TAG, "start recording.");
                LiveStreamAudioCaptureFromADM.this.mRecording = true;
            }
        });
        MethodCollector.o(12129);
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.ss.avframework.capture.audio.AudioCapturer
    public synchronized void stop() {
        MethodCollector.i(12130);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.AnonymousClass7 */

            static {
                Covode.recordClassIndex(99999);
            }

            public void run() {
                if (!LiveStreamAudioCaptureFromADM.this.mStoped) {
                    LiveStreamAudioCaptureFromADM.this.mStoped = true;
                    AudioDeviceModule audioDeviceModule = LiveStreamAudioCaptureFromADM.this.mADM;
                    if (audioDeviceModule != null) {
                        audioDeviceModule.stopRecording();
                    }
                    LiveStreamAudioCaptureFromADM.this.mRecording = false;
                    AVLog.iod(LiveStreamAudioCaptureFromADM.TAG, "stop recording.");
                }
            }
        });
        MethodCollector.o(12130);
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.ss.avframework.engine.NativeObject, com.ss.avframework.engine.AudioSource, com.ss.avframework.capture.audio.AudioCapturer
    public synchronized void release() {
        MethodCollector.i(12277);
        String str = TAG;
        AVLog.iod(str, "release this ".concat(String.valueOf(this)));
        stop();
        this.mObserver = null;
        long[] jArr = {-1};
        jArr[0] = ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.AnonymousClass8 */

            static {
                Covode.recordClassIndex(100000);
            }

            public void run() {
            }
        }, 3000);
        SafeHandlerThreadPoolExecutor.unlockThread(this.mThread);
        AVLog.iod(str, "release this " + this + " done, ret " + jArr[0]);
        super.superRelease();
        MethodCollector.o(12277);
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.ss.avframework.capture.audio.AudioCapturer
    public void mute(final boolean z) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.AnonymousClass4 */

            static {
                Covode.recordClassIndex(99996);
            }

            public void run() {
                LiveStreamAudioCaptureFromADM.this.mADM.setMicMute(z);
                AVLog.iod(LiveStreamAudioCaptureFromADM.TAG, "set microphone mute " + z);
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.ss.avframework.capture.audio.AudioCapturer
    public void setVolume(double d2) {
        AudioDeviceModule audioDeviceModule = this.mADM;
        if (audioDeviceModule != null) {
            audioDeviceModule.setMicVolume((float) d2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void switchAudioMode(final int i2) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99993);
            }

            public void run() {
                boolean z;
                if (!LiveStreamAudioCaptureFromADM.this.mStoped) {
                    if (7 == i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LiveStreamAudioCaptureFromADM.this.mADM.switchToVoIP(z);
                    AVLog.iod(LiveStreamAudioCaptureFromADM.TAG, "switch to VoIP ".concat(String.valueOf(z)));
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void addOriginAudioSink(AudioSink audioSink) {
        if (audioSink != null) {
            if (this.mADM == null || !this.mADM.isSeperateRecordingCallback()) {
                super.addOriginAudioSink(audioSink);
            } else {
                this.mADM.addAudioSink(3, audioSink);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void removeAudioSink(AudioSink audioSink) {
        if (audioSink != null) {
            if (this.mADM == null || !this.mADM.isSeperateRecordingCallback()) {
                super.removeAudioSink(audioSink);
            } else {
                this.mADM.removeAudioSink(3, audioSink);
            }
        }
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void setAudioQuantizeGapPeriod(long j2) {
        AudioDeviceModule audioDeviceModule = this.mADM;
        if (audioDeviceModule != null) {
            TEBundle parameter = audioDeviceModule.getParameter();
            parameter.setInt("adm_audio_record_power_gap_ms", (int) j2);
            audioDeviceModule.setParameter(parameter);
        }
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void setMode(int i2) {
        AVLog.iow(TAG, "Ignore switch mode(" + i2 + ") on ADM mode.");
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void switchSource(int i2) {
        AVLog.iow(TAG, "Ignore switch capture(" + i2 + ") on ADM mode.");
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.ss.avframework.capture.audio.AudioCapturer.AudioCaptureObserver
    public void onAudioCaptureError(int i2, Exception exc) {
        AudioCapturer.AudioCaptureObserver audioCaptureObserver = this.mObserver;
        if (audioCaptureObserver != null) {
            audioCaptureObserver.onAudioCaptureError(i2, exc);
        }
        AVLog.logKibana(5, TAG, "onAudioCaptureError,code:" + i2 + "," + this, exc);
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void setOutputFormat(int i2, int i3, int i4) {
        nativeAdaptedOutputFormat(i2, i3, i4);
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void onData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer, int i2, int i3, int i4, long j2) {
        throw new AndroidRuntimeException("Not should be here.");
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void onData(Buffer buffer, int i2, int i3, int i4, long j2) {
        throw new AndroidRuntimeException("Not should be here.");
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public int pushAudioFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j2) {
        throw new AndroidRuntimeException("No Implement");
    }

    public LiveStreamAudioCaptureFromADM(int i2, int i3, int i4, int i5, int i6, Handler handler, AudioCapturer.AudioCaptureObserver audioCaptureObserver, MediaEngineFactory mediaEngineFactory, int i7, AudioDeviceModule audioDeviceModule) {
        super(i2, i3, i4, i5, i6, handler, audioCaptureObserver, null, i7);
        this.mADM = audioDeviceModule;
        AVLog.iod(TAG, "Create LiveStreamAudioCaptureFromADM with bgmMode " + i7 + " source " + i3 + " this " + this);
    }
}

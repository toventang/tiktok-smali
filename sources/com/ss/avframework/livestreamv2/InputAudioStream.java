package com.ss.avframework.livestreamv2;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.capture.audio.AudioCapturer;
import com.ss.avframework.engine.AudioTrack;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.livestreamv2.capture.AudioCapturerExternal;
import com.ss.avframework.mixer.AudioMixer;
import java.nio.ByteBuffer;

class InputAudioStream implements AudioCapturer.AudioCaptureObserver, IInputAudioStream {
    private AudioCapturerExternal mAudioCapturer;
    private AudioMixer.AudioMixerDescription mAudioMixerDescription = new AudioMixer.AudioMixerDescription();
    private AudioTrack mAudioTrack;
    private int mChannel;
    private Handler mHandler;
    private Observer mObserver;
    private int mSample;

    public interface Observer {
        static {
            Covode.recordClassIndex(99870);
        }

        void releaseInputStream(InputAudioStream inputAudioStream);

        void updateVolume(InputAudioStream inputAudioStream);
    }

    static {
        Covode.recordClassIndex(99869);
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer.AudioCaptureObserver
    public void onAudioCaptureError(int i2, Exception exc) {
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public AudioTrack getAudioTrack() {
        return this.mAudioTrack;
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public int getChannel() {
        return this.mChannel;
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public AudioMixer.AudioMixerDescription getMixerDescription() {
        return this.mAudioMixerDescription;
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public int getSample() {
        return this.mSample;
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public String name() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            return audioTrack.id();
        }
        return "";
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public int start() {
        AudioCapturerExternal audioCapturerExternal = this.mAudioCapturer;
        if (audioCapturerExternal == null) {
            return 0;
        }
        audioCapturerExternal.start();
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public int stop() {
        AudioCapturerExternal audioCapturerExternal = this.mAudioCapturer;
        if (audioCapturerExternal == null) {
            return 0;
        }
        audioCapturerExternal.stop();
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public synchronized void release() {
        MethodCollector.i(13569);
        stop();
        Observer observer = this.mObserver;
        if (observer != null) {
            observer.releaseInputStream(this);
        }
        AudioCapturerExternal audioCapturerExternal = this.mAudioCapturer;
        if (audioCapturerExternal != null) {
            audioCapturerExternal.release();
            this.mAudioCapturer = null;
        }
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.mAudioTrack = null;
        }
        MethodCollector.o(13569);
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription) {
        if (audioMixerDescription != null) {
            this.mAudioMixerDescription = audioMixerDescription;
            Observer observer = this.mObserver;
            if (observer != null) {
                observer.updateVolume(this);
            }
        }
    }

    InputAudioStream(MediaEngineFactory mediaEngineFactory, Observer observer, int i2, int i3, Handler handler) {
        AudioCapturerExternal audioCapturerExternal = new AudioCapturerExternal(i2, i3, 16, handler, this);
        this.mAudioCapturer = audioCapturerExternal;
        this.mAudioTrack = mediaEngineFactory.createAudioTrack(audioCapturerExternal);
        this.mObserver = observer;
        this.mSample = i2;
        this.mChannel = i3;
        this.mHandler = handler;
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public int pushAudioFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j2) {
        AudioCapturerExternal audioCapturerExternal = this.mAudioCapturer;
        if (audioCapturerExternal != null) {
            return audioCapturerExternal.pushAudioFrame(byteBuffer, i2, i3, i4, i5, j2);
        }
        return -1;
    }
}

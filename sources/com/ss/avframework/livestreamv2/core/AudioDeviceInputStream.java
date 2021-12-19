package com.ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.engine.AudioSink;
import com.ss.avframework.engine.AudioTrack;
import com.ss.avframework.livestreamv2.IInputAudioStream;
import com.ss.avframework.mixer.AudioMixer;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class AudioDeviceInputStream extends AudioSink implements IInputAudioStream {
    private final WeakReference<AudioDeviceModule> mAudioDeviceModule;
    public final IInputAudioStream mAudioStream;

    static {
        Covode.recordClassIndex(100030);
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public AudioTrack getAudioTrack() {
        return null;
    }

    @Override // com.ss.avframework.engine.AudioSink
    public void onNoData() {
    }

    class RenderStream implements IInputAudioStream {
        private AudioDeviceModule.AudioRenderSink mAudioRenderSink;
        private boolean mStart;
        private float mVolume = 1.0f;

        static {
            Covode.recordClassIndex(100031);
        }

        @Override // com.ss.avframework.livestreamv2.IInputAudioStream
        public AudioTrack getAudioTrack() {
            return null;
        }

        public AudioDeviceModule.AudioRenderSink getAudioRenderSink() {
            return this.mAudioRenderSink;
        }

        @Override // com.ss.avframework.livestreamv2.IInputAudioStream
        public int getChannel() {
            return AudioDeviceInputStream.this.getChannel();
        }

        @Override // com.ss.avframework.livestreamv2.IInputAudioStream
        public int getSample() {
            return AudioDeviceInputStream.this.getSample();
        }

        @Override // com.ss.avframework.livestreamv2.IInputAudioStream
        public String name() {
            return AudioDeviceInputStream.this.name();
        }

        @Override // com.ss.avframework.livestreamv2.IInputAudioStream
        public AudioMixer.AudioMixerDescription getMixerDescription() {
            AudioMixer.AudioMixerDescription audioMixerDescription = new AudioMixer.AudioMixerDescription();
            audioMixerDescription.volumeCoeff = this.mVolume;
            return audioMixerDescription;
        }

        @Override // com.ss.avframework.livestreamv2.IInputAudioStream
        public void release() {
            this.mAudioRenderSink.release();
            this.mAudioRenderSink = null;
        }

        @Override // com.ss.avframework.livestreamv2.IInputAudioStream
        public int start() {
            this.mStart = true;
            return AudioDeviceInputStream.this.start();
        }

        @Override // com.ss.avframework.livestreamv2.IInputAudioStream
        public int stop() {
            this.mStart = false;
            return AudioDeviceInputStream.this.stop();
        }

        @Override // com.ss.avframework.livestreamv2.IInputAudioStream
        public void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription) {
            AudioDeviceModule.AudioRenderSink audioRenderSink;
            if (audioMixerDescription != null && (audioRenderSink = this.mAudioRenderSink) != null) {
                audioRenderSink.setVolume(audioMixerDescription.volumeCoeff);
                this.mVolume = audioMixerDescription.volumeCoeff;
            }
        }

        public RenderStream(AudioDeviceModule.AudioRenderSink audioRenderSink) {
            this.mAudioRenderSink = audioRenderSink;
        }

        @Override // com.ss.avframework.livestreamv2.IInputAudioStream
        public int pushAudioFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j2) {
            if (AudioDeviceInputStream.this.mAudioStream == null || !this.mStart) {
                return -1;
            }
            AudioDeviceInputStream.this.mAudioStream.pushAudioFrame(byteBuffer, i2, i3, 16, i5, j2);
            return 0;
        }
    }

    public IInputAudioStream getAudioRenderSink() {
        return this.mAudioStream;
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public int getChannel() {
        return this.mAudioStream.getChannel();
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public AudioMixer.AudioMixerDescription getMixerDescription() {
        return this.mAudioStream.getMixerDescription();
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public int getSample() {
        return this.mAudioStream.getSample();
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public String name() {
        return this.mAudioStream.name();
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public int start() {
        return this.mAudioStream.start();
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public int stop() {
        return this.mAudioStream.stop();
    }

    public RenderStream createRenderSteream() {
        if (this.mAudioDeviceModule.get() != null) {
            return new RenderStream(this.mAudioDeviceModule.get().createRenderSink());
        }
        return null;
    }

    @Override // com.ss.avframework.engine.NativeObject, com.ss.avframework.livestreamv2.IInputAudioStream
    public synchronized void release() {
        MethodCollector.i(10174);
        IInputAudioStream iInputAudioStream = this.mAudioStream;
        if (iInputAudioStream != null) {
            iInputAudioStream.release();
            if (this.mAudioDeviceModule.get() != null) {
                this.mAudioDeviceModule.get().getRenderMixer().removeAudioSink(this);
            }
        }
        MethodCollector.o(10174);
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription) {
        this.mAudioStream.setMixerDescription(audioMixerDescription);
    }

    public AudioDeviceInputStream(AudioDeviceModule audioDeviceModule, IInputAudioStream iInputAudioStream) {
        WeakReference<AudioDeviceModule> weakReference = new WeakReference<>(audioDeviceModule);
        this.mAudioDeviceModule = weakReference;
        this.mAudioStream = iInputAudioStream;
        weakReference.get().getRenderMixer().addAudioSink(this);
    }

    @Override // com.ss.avframework.engine.AudioSink
    public void onData(Buffer buffer, int i2, int i3, int i4, long j2) {
        IInputAudioStream iInputAudioStream = this.mAudioStream;
        if (iInputAudioStream != null) {
            iInputAudioStream.pushAudioFrame((ByteBuffer) buffer, i3, i4, 16, i2 * i4, j2 * 1000);
        }
    }

    @Override // com.ss.avframework.livestreamv2.IInputAudioStream
    public int pushAudioFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j2) {
        IInputAudioStream iInputAudioStream = this.mAudioStream;
        if (iInputAudioStream != null) {
            return iInputAudioStream.pushAudioFrame(byteBuffer, i2, i3, i4, i5, j2);
        }
        return -1;
    }
}

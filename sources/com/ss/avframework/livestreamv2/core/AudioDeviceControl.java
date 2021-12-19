package com.ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.engine.AudioTrack;
import com.ss.avframework.livestreamv2.core.IAudioDeviceControl;
import com.ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AudioDeviceControl implements IAudioDeviceControl {
    private AudioDeviceModule mAudioDeviceModule;
    private List<AudioLayer> mLayers = new ArrayList();

    static {
        Covode.recordClassIndex(100028);
    }

    @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl
    public IAudioDeviceControl.IAudioTrack[] getTracks() {
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl
    public float getVolume() {
        return 0.0f;
    }

    @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl
    public void setVolume(float f2) {
    }

    /* access modifiers changed from: package-private */
    public class AudioLayer implements IAudioDeviceControl.IAudioTrack {
        private AudioDeviceModule.AudioRenderSink mAudioRenderSink;
        private int mChannel;
        private final String mName;
        private int mSampleHz;
        public int mTrackId;
        private float mVolumeCoeff = 1.0f;

        static {
            Covode.recordClassIndex(100029);
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public int getChannel() {
            return this.mChannel;
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public int getSampleHz() {
            return this.mSampleHz;
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public float getVolume() {
            return this.mVolumeCoeff;
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public String name() {
            return this.mName;
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public long getQuirks() {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                return audioRenderSink.getQuirks();
            }
            return 0;
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public boolean isEnableAGC() {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                return audioRenderSink.isEnableAGC();
            }
            return false;
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public boolean isMute() {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                return audioRenderSink.isMute();
            }
            return true;
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void dispose() {
            AudioDeviceControl.this.removeTrack(name());
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.release();
                this.mAudioRenderSink = null;
            }
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void setAudioTrack(AudioTrack audioTrack) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setAudioTrack(audioTrack);
            }
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void setQuirks(long j2) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setQuirks(j2);
            }
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public double getOption(int i2) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                return audioRenderSink.getOption(i2);
            }
            return 0.0d;
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public boolean setMute(boolean z) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink == null) {
                return true;
            }
            audioRenderSink.setMute(z);
            return true;
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void setVolume(float f2) {
            this.mVolumeCoeff = f2;
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setVolume(f2);
            }
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void enableAGC(boolean z, boolean z2) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setEnableAGC(z, z2);
            }
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void onData(ByteBuffer byteBuffer, int i2, long j2) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.onData(byteBuffer, i2, this.mSampleHz, this.mChannel, j2 / 1000000);
            }
        }

        @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void onData(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.onData(byteBuffer, i4, i2, i3, j2 / 1000000);
            }
        }

        public AudioLayer(String str, int i2, int i3, int i4, AudioDeviceModule.AudioRenderSink audioRenderSink) {
            this.mAudioRenderSink = audioRenderSink;
            this.mName = str;
            this.mTrackId = audioRenderSink.getRenderTrackId();
            this.mSampleHz = i2;
            this.mChannel = i3;
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl
    public boolean isEnableAEC() {
        return this.mAudioDeviceModule.isEnableBuiltInAEC();
    }

    @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl
    public boolean isEnableEcho() {
        return this.mAudioDeviceModule.isEchoMode();
    }

    public void release() {
        MethodCollector.i(13588);
        synchronized (this.mLayers) {
            while (!this.mLayers.isEmpty()) {
                try {
                    AudioLayer remove = this.mLayers.remove(0);
                    if (remove != null) {
                        remove.dispose();
                    }
                } finally {
                    MethodCollector.o(13588);
                }
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl
    public boolean enableAEC(boolean z) {
        this.mAudioDeviceModule.enableBuiltInAEC(z);
        return true;
    }

    @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl
    public boolean enableEcho(boolean z) {
        this.mAudioDeviceModule.enableEchoMode(z);
        return true;
    }

    @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl
    public IAudioDeviceControl.IAudioTrack getTrack(String str) {
        return findTrack(str);
    }

    public AudioDeviceControl(AudioDeviceModule audioDeviceModule) {
        this.mAudioDeviceModule = audioDeviceModule;
    }

    private void addTrack(AudioLayer audioLayer) {
        MethodCollector.i(13523);
        synchronized (this.mLayers) {
            try {
                this.mLayers.add(audioLayer);
            } finally {
                MethodCollector.o(13523);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl
    public void setOriginTriggering(String str) {
        AudioLayer findTrack = findTrack(str);
        if (findTrack != null) {
            this.mAudioDeviceModule.getRenderMixer().setOriginTrackIndex(findTrack.mTrackId);
        }
    }

    private AudioLayer findTrack(String str) {
        MethodCollector.i(13587);
        synchronized (this.mLayers) {
            try {
                for (AudioLayer audioLayer : this.mLayers) {
                    if (audioLayer.name().equals(str)) {
                        return audioLayer;
                    }
                }
                MethodCollector.o(13587);
                return null;
            } finally {
                MethodCollector.o(13587);
            }
        }
    }

    public void removeTrack(String str) {
        MethodCollector.i(13441);
        synchronized (this.mLayers) {
            try {
                Iterator<AudioLayer> it = this.mLayers.iterator();
                while (it.hasNext()) {
                    if (it.next().name().equals(str)) {
                        it.remove();
                    }
                }
            } finally {
                MethodCollector.o(13441);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.IAudioDeviceControl
    public IAudioDeviceControl.IAudioTrack createTrack(String str, int i2, int i3, int i4) {
        if (str == null) {
            return null;
        }
        AudioLayer findTrack = findTrack(str);
        if (findTrack != null) {
            AVLog.logKibana(6, "AudioDeviceControl", "Audio render with name " + str + " already exists", null);
            return findTrack;
        }
        AudioLayer audioLayer = new AudioLayer(str, i2, i3, i4, this.mAudioDeviceModule.createRenderSink());
        addTrack(audioLayer);
        return audioLayer;
    }
}

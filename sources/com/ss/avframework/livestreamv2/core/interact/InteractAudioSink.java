package com.ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.livestreamv2.IInputAudioStream;
import com.ss.avframework.livestreamv2.core.IAudioDeviceControl;
import com.ss.avframework.livestreamv2.core.InteractEngineBuilder;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioSink;
import com.ss.avframework.livestreamv2.recorder.IRecorderManager;
import com.ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;

class InteractAudioSink implements AudioSink {
    private boolean isRenderAble = true;
    private IAudioDeviceControl.IAudioTrack mAudioRender;
    private InteractEngineBuilder mBuilder;
    private String mName;
    private IInputAudioStream mOutAudioStream;
    private IRecorderManager mRecorderMgr;

    static {
        Covode.recordClassIndex(100206);
    }

    /* access modifiers changed from: package-private */
    public IInputAudioStream getOutAudioStream() {
        return this.mOutAudioStream;
    }

    /* access modifiers changed from: package-private */
    public void release() {
        MethodCollector.i(13496);
        synchronized (this) {
            try {
                IInputAudioStream iInputAudioStream = this.mOutAudioStream;
                if (iInputAudioStream != null) {
                    IRecorderManager iRecorderManager = this.mRecorderMgr;
                    if (iRecorderManager != null) {
                        iRecorderManager.removeAudioTrack(iInputAudioStream.getAudioTrack());
                        this.mRecorderMgr = null;
                    }
                    IAudioDeviceControl.IAudioTrack iAudioTrack = this.mAudioRender;
                    if (iAudioTrack != null) {
                        iAudioTrack.setQuirks(0);
                        this.mAudioRender.setAudioTrack(null);
                    }
                    this.mOutAudioStream.stop();
                    this.mOutAudioStream.release();
                    this.mOutAudioStream = null;
                }
                IAudioDeviceControl.IAudioTrack iAudioTrack2 = this.mAudioRender;
                if (iAudioTrack2 != null) {
                    iAudioTrack2.dispose();
                    this.mAudioRender = null;
                }
            } finally {
                MethodCollector.o(13496);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSink
    public void setRenderAble(boolean z) {
        AVLog.ioi("InteractAudioSink", "render old state:" + this.isRenderAble + ", new state:" + z);
        this.isRenderAble = z;
    }

    InteractAudioSink(InteractEngineBuilder interactEngineBuilder, String str, int i2, int i3) {
        this.mBuilder = interactEngineBuilder;
        this.mName = str;
        if (interactEngineBuilder.mUseInteractAudioSink) {
            AVLog.iow("InteractAudioSink", "Using livecore audio capture, should use livecore audio play too.");
            IInputAudioStream createInputAudioStream = interactEngineBuilder.getLiveCore().createInputAudioStream();
            this.mOutAudioStream = createInputAudioStream;
            if (createInputAudioStream == null) {
                AVLog.iow("InteractAudioSink", "mOutAudioStream is null, maybe LiveStream is being released.");
                return;
            }
            createInputAudioStream.start();
            IRecorderManager recorderMgr = interactEngineBuilder.getLiveCore().getRecorderMgr();
            this.mRecorderMgr = recorderMgr;
            recorderMgr.addAudioTrack(this.mOutAudioStream.getAudioTrack());
            IAudioDeviceControl audioDeviceControl = this.mBuilder.getLiveCore().getAudioDeviceControl();
            if (audioDeviceControl != null) {
                IAudioDeviceControl.IAudioTrack createTrack = audioDeviceControl.createTrack(this.mName, i2, i3, 16);
                this.mAudioRender = createTrack;
                if (createTrack != null) {
                    createTrack.setVolume(1.0f);
                    this.mAudioRender.setAudioTrack(this.mOutAudioStream.getAudioTrack());
                    this.mAudioRender.setQuirks(2);
                }
                this.mBuilder.getLiveCore().startAudioPlayer();
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSink
    public void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
        ByteBuffer byteBuffer2;
        if (this.isRenderAble) {
            byteBuffer.position(0);
            if (!byteBuffer.isDirect()) {
                byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.capacity());
                byteBuffer.position(0);
                byteBuffer2.position(0);
                byteBuffer2.put(byteBuffer);
            } else {
                byteBuffer2 = byteBuffer;
            }
            long j3 = j2 * 1000;
            IAudioDeviceControl.IAudioTrack iAudioTrack = this.mAudioRender;
            if (iAudioTrack != null) {
                AVLog.logToIODevice2(4, "InteractAudioSink", "onPlaybackAudioFrame", null, "Client.java:onPlaybackAudioFrame", 10000);
                iAudioTrack.onData(byteBuffer2, i3, i4, i2, j3 * 1000);
            }
        }
    }
}

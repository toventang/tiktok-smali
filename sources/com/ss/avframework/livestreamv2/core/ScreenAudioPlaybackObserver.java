package com.ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.capture.audio.AudioRecordThread;
import com.ss.avframework.livestreamv2.IInputAudioStream;
import java.nio.ByteBuffer;

class ScreenAudioPlaybackObserver implements AudioRecordThread.IAudioRecordThreadObserver {
    private final IInputAudioStream mInputAudioStream;
    private final AudioRecordThread.IAudioRecordThreadObserver mOutObserver;

    static {
        Covode.recordClassIndex(100120);
    }

    public void release() {
        this.mInputAudioStream.stop();
        this.mInputAudioStream.release();
    }

    @Override // com.ss.avframework.capture.audio.AudioRecordThread.IAudioRecordThreadObserver
    public void onError(int i2, Exception exc) {
        AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver = this.mOutObserver;
        if (iAudioRecordThreadObserver != null) {
            iAudioRecordThreadObserver.onError(i2, exc);
        }
    }

    ScreenAudioPlaybackObserver(IInputAudioStream iInputAudioStream, AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver) {
        this.mOutObserver = iAudioRecordThreadObserver;
        this.mInputAudioStream = iInputAudioStream;
        iInputAudioStream.start();
    }

    @Override // com.ss.avframework.capture.audio.AudioRecordThread.IAudioRecordThreadObserver
    public void onData(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
        this.mInputAudioStream.pushAudioFrame(byteBuffer, i3, i4, 16, i2 * i4, j2);
        AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver = this.mOutObserver;
        if (iAudioRecordThreadObserver != null) {
            iAudioRecordThreadObserver.onData(byteBuffer, i2, i3, i4, j2);
        }
    }
}

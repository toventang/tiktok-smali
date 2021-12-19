package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.AudioSink;
import com.ss.avframework.livestreamv2.ILiveStream;
import java.nio.Buffer;

public class AudioOriginFrameSink extends AudioSink {
    private ILiveStream.IAudioFrameAvailableListener listener;

    static {
        Covode.recordClassIndex(99845);
    }

    @Override // com.ss.avframework.engine.AudioSink
    public void onNoData() {
    }

    public void setListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        this.listener = iAudioFrameAvailableListener;
    }

    @Override // com.ss.avframework.engine.AudioSink
    public void onData(Buffer buffer, int i2, int i3, int i4, long j2) {
        if (this.listener != null) {
            buffer.position(0);
            this.listener.onAudioFrameAvailable(buffer, i2, i3, i4, j2);
        }
    }
}

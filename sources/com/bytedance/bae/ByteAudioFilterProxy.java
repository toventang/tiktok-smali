package com.bytedance.bae;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class ByteAudioFilterProxy {
    private ByteBuffer directBuffer = ByteBuffer.allocateDirect(15360);
    private ByteAudioFilter sink;
    private ByteAudioStreamBuffer streamBuffer = new ByteAudioStreamBuffer(this.directBuffer.array(), 0, new ByteAudioStreamFormat(0, 0, 0, 0), 0);

    static {
        Covode.recordClassIndex(15309);
    }

    public ByteBuffer getDirectBuffer() {
        return this.directBuffer;
    }

    public ByteAudioStreamBuffer getStreamBuffer() {
        return this.streamBuffer;
    }

    public int onProcess() {
        if (this.sink == null) {
            return -1;
        }
        this.directBuffer.flip();
        byte[] bArr = new byte[1920];
        System.arraycopy(this.directBuffer.array(), this.directBuffer.arrayOffset(), bArr, 0, this.streamBuffer.getLength());
        ByteAudioStreamBuffer byteAudioStreamBuffer = new ByteAudioStreamBuffer(bArr, this.streamBuffer.getLength(), this.streamBuffer.getStreamFormat(), this.streamBuffer.getTimestamp());
        int onProcess = this.sink.onProcess(byteAudioStreamBuffer);
        System.arraycopy(bArr, 0, this.directBuffer.array(), this.directBuffer.arrayOffset(), byteAudioStreamBuffer.getLength());
        this.directBuffer.flip();
        return onProcess;
    }

    public ByteAudioFilterProxy(ByteAudioFilter byteAudioFilter) {
        this.sink = byteAudioFilter;
    }
}

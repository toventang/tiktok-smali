package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class ByteAudioOutputSinkProxy {
    private long nativeSinkPtr;
    private ByteBuffer pullDirectBuffer = ByteBuffer.allocateDirect(15360);
    private ByteAudioStreamBuffer pullStreamBuffer = new ByteAudioStreamBuffer(this.pullDirectBuffer.array(), 0, new ByteAudioStreamFormat(0, 0, 0, 0), 0);
    private ByteAudioSinkInterface.ByteAudioOutputSink sink;
    private ByteAudioOutputStream stream;

    static {
        Covode.recordClassIndex(15313);
    }

    public ByteBuffer getDirectBuffer() {
        return this.pullDirectBuffer;
    }

    public ByteAudioStreamBuffer getStreamBuffer() {
        return this.pullStreamBuffer;
    }

    public void setNativeSink(long j2) {
        this.nativeSinkPtr = j2;
    }

    public int onPullAudioBufferToStream(long j2) {
        if (this.sink == null) {
            return -1;
        }
        this.pullDirectBuffer.clear();
        byte[] bArr = new byte[1920];
        ByteAudioStreamBuffer byteAudioStreamBuffer = new ByteAudioStreamBuffer(bArr, this.pullStreamBuffer.getLength(), this.pullStreamBuffer.getStreamFormat(), this.pullStreamBuffer.getTimestamp());
        int onPullAudioBufferToStream = this.sink.onPullAudioBufferToStream(this.stream, byteAudioStreamBuffer);
        System.arraycopy(bArr, 0, this.pullDirectBuffer.array(), this.pullDirectBuffer.arrayOffset(), byteAudioStreamBuffer.getLength());
        this.pullStreamBuffer.length = byteAudioStreamBuffer.length;
        this.pullStreamBuffer.streamFormat.sampleRate = byteAudioStreamBuffer.streamFormat.sampleRate;
        this.pullStreamBuffer.streamFormat.channelNum = byteAudioStreamBuffer.streamFormat.channelNum;
        this.pullStreamBuffer.streamFormat.codecType = byteAudioStreamBuffer.streamFormat.codecType;
        this.pullDirectBuffer.flip();
        return onPullAudioBufferToStream;
    }

    public ByteAudioOutputSinkProxy(ByteAudioSinkInterface.ByteAudioOutputSink byteAudioOutputSink, ByteAudioOutputStream byteAudioOutputStream) {
        this.sink = byteAudioOutputSink;
        this.stream = byteAudioOutputStream;
    }
}

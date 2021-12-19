package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class ByteAudioAuxSinkProxy {
    private long nativeSinkPtr;
    private ByteBuffer pullDirectBuffer = ByteBuffer.allocateDirect(15360);
    private ByteAudioStreamBuffer pullStreamBuffer = new ByteAudioStreamBuffer(this.pullDirectBuffer.array(), 0, new ByteAudioStreamFormat(0, 0, 0, 0), 0);
    private ByteAudioSinkInterface.ByteAudioAuxSink sink;
    private ByteAudioAuxStream stream;

    static {
        Covode.recordClassIndex(15302);
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

    public void onMixingBegin(long j2) {
        ByteAudioSinkInterface.ByteAudioAuxSink byteAudioAuxSink = this.sink;
        if (byteAudioAuxSink != null) {
            byteAudioAuxSink.onMixingBegin(this.stream);
        }
    }

    public void onMixingEnd(long j2) {
        ByteAudioSinkInterface.ByteAudioAuxSink byteAudioAuxSink = this.sink;
        if (byteAudioAuxSink != null) {
            byteAudioAuxSink.onMixingEnd(this.stream);
        }
    }

    public int onPullAudioBufferToStream(long j2) {
        if (this.sink == null) {
            return -1;
        }
        this.pullDirectBuffer.clear();
        byte[] bArr = new byte[1920];
        ByteAudioStreamBuffer byteAudioStreamBuffer = new ByteAudioStreamBuffer(bArr, this.pullStreamBuffer.getLength(), this.pullStreamBuffer.getStreamFormat(), this.pullStreamBuffer.getTimestamp());
        int onPullAudioBufferToAuxStream = this.sink.onPullAudioBufferToAuxStream(this.stream, byteAudioStreamBuffer);
        System.arraycopy(bArr, 0, this.pullDirectBuffer.array(), this.pullDirectBuffer.arrayOffset(), byteAudioStreamBuffer.getLength());
        this.pullStreamBuffer.length = byteAudioStreamBuffer.length;
        this.pullStreamBuffer.streamFormat.sampleRate = byteAudioStreamBuffer.streamFormat.sampleRate;
        this.pullStreamBuffer.streamFormat.channelNum = byteAudioStreamBuffer.streamFormat.channelNum;
        this.pullStreamBuffer.streamFormat.codecType = byteAudioStreamBuffer.streamFormat.codecType;
        this.pullDirectBuffer.flip();
        return onPullAudioBufferToAuxStream;
    }

    public ByteAudioAuxSinkProxy(ByteAudioSinkInterface.ByteAudioAuxSink byteAudioAuxSink, ByteAudioAuxStream byteAudioAuxStream) {
        this.sink = byteAudioAuxSink;
        this.stream = byteAudioAuxStream;
    }
}

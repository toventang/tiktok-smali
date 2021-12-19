package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {
    static {
        Covode.recordClassIndex(106624);
    }

    MediaCodecWrapperFactoryImpl() {
    }

    static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        private final MediaCodec mediaCodec;

        static {
            Covode.recordClassIndex(106625);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void flush() {
            this.mediaCodec.flush();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public ByteBuffer[] getInputBuffers() {
            return this.mediaCodec.getInputBuffers();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public ByteBuffer[] getOutputBuffers() {
            return this.mediaCodec.getOutputBuffers();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void release() {
            this.mediaCodec.release();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void start() {
            this.mediaCodec.start();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void stop() {
            this.mediaCodec.stop();
        }

        public MediaCodecWrapperImpl(MediaCodec mediaCodec2) {
            this.mediaCodec = mediaCodec2;
        }

        @Override // org.webrtc.MediaCodecWrapper
        public int dequeueInputBuffer(long j2) {
            return this.mediaCodec.dequeueInputBuffer(j2);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j2) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j2);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void releaseOutputBuffer(int i2, boolean z) {
            this.mediaCodec.releaseOutputBuffer(i2, z);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i2) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i2);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void queueInputBuffer(int i2, int i3, int i4, long j2, int i5) {
            this.mediaCodec.queueInputBuffer(i2, i3, i4, j2, i5);
        }
    }

    @Override // org.webrtc.MediaCodecWrapperFactory
    public MediaCodecWrapper createByCodecName(String str) {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }
}

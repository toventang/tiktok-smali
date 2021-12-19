package org.webrtc;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

public class EncodedImage {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final boolean completeFrame;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;
    public final Integer qp;
    public final int rotation;

    /* renamed from: org.webrtc.EncodedImage$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(106583);
        }
    }

    static {
        Covode.recordClassIndex(106582);
    }

    public static class Builder {
        private ByteBuffer buffer;
        private long captureTimeNs;
        private boolean completeFrame;
        private int encodedHeight;
        private int encodedWidth;
        private FrameType frameType;
        private Integer qp;
        private int rotation;

        static {
            Covode.recordClassIndex(106584);
        }

        private Builder() {
        }

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.completeFrame, this.qp, null);
        }

        public Builder setBuffer(ByteBuffer byteBuffer) {
            this.buffer = byteBuffer;
            return this;
        }

        public Builder setCaptureTimeNs(long j2) {
            this.captureTimeNs = j2;
            return this;
        }

        public Builder setCompleteFrame(boolean z) {
            this.completeFrame = z;
            return this;
        }

        public Builder setEncodedHeight(int i2) {
            this.encodedHeight = i2;
            return this;
        }

        public Builder setEncodedWidth(int i2) {
            this.encodedWidth = i2;
            return this;
        }

        public Builder setFrameType(FrameType frameType2) {
            this.frameType = frameType2;
            return this;
        }

        public Builder setQp(Integer num) {
            this.qp = num;
            return this;
        }

        public Builder setRotation(int i2) {
            this.rotation = i2;
            return this;
        }

        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public Builder setCaptureTimeMs(long j2) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j2);
            return this;
        }
    }

    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);
        
        private final int nativeIndex;

        public final int getNative() {
            return this.nativeIndex;
        }

        static {
            Covode.recordClassIndex(106585);
        }

        static FrameType fromNativeIndex(int i2) {
            FrameType[] values = values();
            for (FrameType frameType : values) {
                if (frameType.getNative() == i2) {
                    return frameType;
                }
            }
            throw new IllegalArgumentException("Unknown native frame type: ".concat(String.valueOf(i2)));
        }

        private FrameType(int i2) {
            this.nativeIndex = i2;
        }
    }

    private ByteBuffer getBuffer() {
        return this.buffer;
    }

    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    private boolean getCompleteFrame() {
        return this.completeFrame;
    }

    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    private Integer getQp() {
        return this.qp;
    }

    private int getRotation() {
        return this.rotation;
    }

    public static Builder builder() {
        return new Builder(null);
    }

    private int getFrameType() {
        return this.frameType.getNative();
    }

    private EncodedImage(ByteBuffer byteBuffer, int i2, int i3, long j2, FrameType frameType2, int i4, boolean z, Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i2;
        this.encodedHeight = i3;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j2);
        this.captureTimeNs = j2;
        this.frameType = frameType2;
        this.rotation = i4;
        this.completeFrame = z;
        this.qp = num;
    }

    /* synthetic */ EncodedImage(ByteBuffer byteBuffer, int i2, int i3, long j2, FrameType frameType2, int i4, boolean z, Integer num, AnonymousClass1 r10) {
        this(byteBuffer, i2, i3, j2, frameType2, i4, z, num);
    }
}

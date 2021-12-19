package com.ss.avframework.buffer;

import android.graphics.Matrix;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;

public class VideoFrame {
    private final Buffer buffer;
    private final int rotation;
    private final long timestampNs;

    public interface Buffer {
        static {
            Covode.recordClassIndex(99702);
        }

        Buffer cropAndScale(int i2, int i3, int i4, int i5, int i6, int i7);

        long getCaptureMs();

        IExtraData getExtData();

        int getHeight();

        RoiInfo getROIInfo();

        int getWidth();

        boolean isTexture();

        void release();

        void retain();

        void setROIInfo(RoiInfo roiInfo);

        I420Buffer toI420();

        void updateCaptureMs(long j2);
    }

    public interface I420Buffer extends Buffer {
        static {
            Covode.recordClassIndex(99703);
        }

        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public interface IExtraData {
        static {
            Covode.recordClassIndex(99704);
        }

        int peekParcelSize();

        int readParcel(ByteBuffer byteBuffer);

        void releaseExtraData(Object obj);
    }

    public interface TextureBuffer extends Buffer {
        static {
            Covode.recordClassIndex(99705);
        }

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();

        public enum Type {
            OES(36197),
            RGB(3553);
            
            private final int glTarget;

            public final int getGlTarget() {
                return this.glTarget;
            }

            static {
                Covode.recordClassIndex(99706);
            }

            private Type(int i2) {
                this.glTarget = i2;
            }
        }
    }

    static {
        Covode.recordClassIndex(99700);
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, int i5, int i6, int i7, int i8, ByteBuffer byteBuffer4, int i9, ByteBuffer byteBuffer5, int i10, ByteBuffer byteBuffer6, int i11, int i12, int i13);

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    public IExtraData getExtraData() {
        return this.buffer.getExtData();
    }

    public boolean isTexture() {
        return this.buffer instanceof TextureBuffer;
    }

    public void release() {
        this.buffer.release();
    }

    public void retain() {
        this.buffer.retain();
    }

    public int getRotatedHeight() {
        if (this.rotation % LiveFeedRefreshTimeSetting.DEFAULT == 0) {
            return this.buffer.getHeight();
        }
        return this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        if (this.rotation % LiveFeedRefreshTimeSetting.DEFAULT == 0) {
            return this.buffer.getWidth();
        }
        return this.buffer.getHeight();
    }

    public VideoFrame(Buffer buffer2, int i2, long j2) {
        if (buffer2 == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        } else if (i2 % 90 == 0) {
            this.buffer = buffer2;
            this.rotation = i2;
            this.timestampNs = j2;
        } else {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
    }

    public static Buffer cropAndScaleI420(final I420Buffer i420Buffer, int i2, int i3, int i4, int i5, int i6, int i7) {
        MethodCollector.i(14242);
        if (i4 == i6 && i5 == i7) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            dataY.position((i420Buffer.getStrideY() * i3) + i2);
            int i8 = i2 / 2;
            int i9 = i3 / 2;
            dataU.position((i420Buffer.getStrideU() * i9) + i8);
            dataV.position(i8 + (i9 * i420Buffer.getStrideV()));
            i420Buffer.retain();
            JavaI420Buffer wrap = JavaI420Buffer.wrap(i420Buffer.getWidth(), i420Buffer.getHeight(), dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), i420Buffer.getCaptureMs(), new Runnable() {
                /* class com.ss.avframework.buffer.VideoFrame.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(99701);
                }

                public final void run() {
                    i420Buffer.release();
                }
            });
            MethodCollector.o(14242);
            return wrap;
        }
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i6, i7);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i2, i3, i4, i5, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i6, i7);
        allocate.updateCaptureMs(i420Buffer.getCaptureMs());
        MethodCollector.o(14242);
        return allocate;
    }
}

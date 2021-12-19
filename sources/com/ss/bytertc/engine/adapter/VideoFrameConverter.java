package com.ss.bytertc.engine.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.mediaio.CountDownLatchI420Buffer;
import com.ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import org.webrtc.JavaI420Buffer;
import org.webrtc.VideoFrame;

public class VideoFrameConverter {
    private static int MAX_BYTE_BUFFER_POOL_SIZE = 2;
    private int abandonFrameCount;
    private ArrayList<ByteBufferHolder> byteBufferPool;
    private ByteBuffer[] byteBuffers;
    private boolean isBufferDirect;
    final int[] steps;
    final int[] strides;

    /* access modifiers changed from: protected */
    public static class ByteBufferHolder {
        public ByteBuffer byteBuffer;
        public volatile boolean isPending;

        static {
            Covode.recordClassIndex(100831);
        }

        protected ByteBufferHolder() {
        }

        public boolean isPending() {
            return this.isPending;
        }

        public ByteBuffer getByteBuffer() {
            ByteBuffer byteBuffer2 = this.byteBuffer;
            if (byteBuffer2 != null) {
                byteBuffer2.clear();
            }
            return this.byteBuffer;
        }

        public byte[] getArray() {
            ByteBuffer byteBuffer2 = this.byteBuffer;
            if (byteBuffer2 == null) {
                return null;
            }
            byteBuffer2.clear();
            if (this.byteBuffer.hasArray() && this.byteBuffer.arrayOffset() == 0) {
                return this.byteBuffer.array();
            }
            int remaining = this.byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            this.byteBuffer.get(bArr, 0, remaining);
            return bArr;
        }

        public void setByteBuffer(ByteBuffer byteBuffer2) {
            this.byteBuffer = byteBuffer2;
        }

        public void setPending(boolean z) {
            this.isPending = z;
        }
    }

    static class I420BufferWrapper {
        private VideoFrame.I420Buffer i420Buffer;
        private boolean needManualRelease;

        static {
            Covode.recordClassIndex(100832);
        }

        public VideoFrame.I420Buffer getBuffer() {
            return this.i420Buffer;
        }

        public void release() {
            VideoFrame.I420Buffer i420Buffer2 = this.i420Buffer;
            if ((i420Buffer2 instanceof JavaI420Buffer) && this.needManualRelease) {
                i420Buffer2.release();
            }
        }

        public I420BufferWrapper(VideoFrame videoFrame) {
            if (videoFrame.getBuffer() instanceof JavaI420Buffer) {
                this.i420Buffer = (JavaI420Buffer) videoFrame.getBuffer();
                this.needManualRelease = false;
                return;
            }
            this.i420Buffer = videoFrame.getBuffer().toI420();
            this.needManualRelease = true;
            videoFrame.getBuffer().release();
        }
    }

    public VideoFrameConverter() {
        this(false);
    }

    static {
        Covode.recordClassIndex(100826);
    }

    private ByteBufferHolder getPendingBuffer() {
        Iterator<ByteBufferHolder> it = this.byteBufferPool.iterator();
        while (it.hasNext()) {
            ByteBufferHolder next = it.next();
            if (!next.isPending) {
                next.setPending(true);
                return next;
            }
        }
        return null;
    }

    public VideoFrameConverter(boolean z) {
        this.byteBuffers = new ByteBuffer[3];
        this.strides = new int[3];
        this.steps = new int[2];
        this.byteBufferPool = new ArrayList<>();
        this.abandonFrameCount = 0;
        for (int i2 = 0; i2 < MAX_BYTE_BUFFER_POOL_SIZE; i2++) {
            this.byteBufferPool.add(new ByteBufferHolder());
        }
        this.isBufferDirect = z;
    }

    public ByteBufferHolder convert2YUV(VideoFrame videoFrame) {
        ByteBufferHolder pendingBuffer = getPendingBuffer();
        if (pendingBuffer == null) {
            return null;
        }
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        I420BufferWrapper i420BufferWrapper = new I420BufferWrapper(videoFrame);
        VideoFrame.I420Buffer buffer = i420BufferWrapper.getBuffer();
        boolean convertRawYUV2ByteHolder = convertRawYUV2ByteHolder(pendingBuffer, buffer.getDataY(), buffer.getDataU(), buffer.getDataV(), buffer.getStrideY(), buffer.getStrideU(), buffer.getStrideV(), width, height);
        i420BufferWrapper.release();
        if (!convertRawYUV2ByteHolder) {
            return null;
        }
        return pendingBuffer;
    }

    public void checkReuseByteBuffer(int i2, ByteBufferHolder byteBufferHolder) {
        ByteBuffer allocate;
        if (byteBufferHolder.getByteBuffer() == null || byteBufferHolder.getByteBuffer().capacity() < i2) {
            if (this.isBufferDirect) {
                allocate = ByteBuffer.allocateDirect(i2);
            } else {
                allocate = ByteBuffer.allocate(i2);
            }
            allocate.order(ByteOrder.nativeOrder());
            byteBufferHolder.setByteBuffer(allocate);
        }
    }

    public VideoFrame.I420Buffer convertToJavaI420Buffer(ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        if (byteBuffer == null) {
            return null;
        }
        ByteBufferHolder pendingBuffer = getPendingBuffer();
        if (pendingBuffer == null) {
            int i4 = this.abandonFrameCount + 1;
            this.abandonFrameCount = i4;
            if (i4 >= 60) {
                LogUtil.e("VideoFrameConverter", "连续丢弃60帧，检查视频帧Buffer是否正常释放");
                this.abandonFrameCount = 0;
            }
            return null;
        }
        this.abandonFrameCount = 0;
        int i5 = (i3 + 1) / 2;
        int i6 = (i2 + 1) / 2;
        int i7 = i2 * i3;
        int i8 = (i6 * 2 * i5) + i7;
        checkReuseByteBuffer(i8, pendingBuffer);
        ByteBuffer byteBuffer2 = pendingBuffer.getByteBuffer();
        byteBuffer.position(0);
        byteBuffer2.position(0);
        if (byteBuffer.limit() > i8) {
            byteBuffer.limit(i8);
        }
        byteBuffer2.limit(i8);
        byteBuffer2.put(byteBuffer);
        int i9 = i7 + 0;
        int i10 = i5 * i6;
        int i11 = i9 + i10;
        byteBuffer2.position(0);
        byteBuffer2.limit(i9);
        ByteBuffer slice = byteBuffer2.slice();
        byteBuffer2.position(i9);
        byteBuffer2.limit(i11);
        ByteBuffer slice2 = byteBuffer2.slice();
        byteBuffer2.position(i11);
        byteBuffer2.limit(i11 + i10);
        ByteBuffer slice3 = byteBuffer2.slice();
        if (z) {
            return CountDownLatchI420Buffer.wrap(i2, i3, slice, i2, slice2, i6, slice3, i6, new VideoFrameConverter$$Lambda$0(pendingBuffer));
        }
        return JavaI420Buffer.wrap(i2, i3, slice, i2, slice2, i6, slice3, i6, new VideoFrameConverter$$Lambda$1(pendingBuffer));
    }

    public VideoFrame.I420Buffer convertToJavaI420Buffer(byte[] bArr, int i2, int i3, boolean z) {
        if (bArr == null) {
            return null;
        }
        ByteBufferHolder pendingBuffer = getPendingBuffer();
        if (pendingBuffer == null) {
            int i4 = this.abandonFrameCount + 1;
            this.abandonFrameCount = i4;
            if (i4 >= 60) {
                LogUtil.e("VideoFrameConverter", "连续丢弃60帧，检查视频帧Buffer是否正常释放");
                this.abandonFrameCount = 0;
            }
            return null;
        }
        this.abandonFrameCount = 0;
        int i5 = (i3 + 1) / 2;
        int i6 = (i2 + 1) / 2;
        int i7 = i2 * i3;
        int i8 = (i6 * 2 * i5) + i7;
        checkReuseByteBuffer(i8, pendingBuffer);
        ByteBuffer byteBuffer = pendingBuffer.getByteBuffer();
        byteBuffer.position(0);
        byteBuffer.limit(i8);
        byteBuffer.put(bArr, 0, Math.min(bArr.length, i8));
        int i9 = i7 + 0;
        int i10 = i5 * i6;
        int i11 = i9 + i10;
        byteBuffer.position(0);
        byteBuffer.limit(i9);
        ByteBuffer slice = byteBuffer.slice();
        byteBuffer.position(i9);
        byteBuffer.limit(i11);
        ByteBuffer slice2 = byteBuffer.slice();
        byteBuffer.position(i11);
        byteBuffer.limit(i11 + i10);
        ByteBuffer slice3 = byteBuffer.slice();
        if (z) {
            return CountDownLatchI420Buffer.wrap(i2, i3, slice, i2, slice2, i6, slice3, i6, new VideoFrameConverter$$Lambda$2(pendingBuffer));
        }
        return JavaI420Buffer.wrap(i2, i3, slice, i2, slice2, i6, slice3, i6, new VideoFrameConverter$$Lambda$3(pendingBuffer));
    }

    public ByteBuffer convertRawYUV2ByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3, int i4, int i5, int i6) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.order(ByteOrder.nativeOrder());
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(bArr2.length);
        allocateDirect2.order(ByteOrder.nativeOrder());
        allocateDirect2.put(bArr2);
        allocateDirect2.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(bArr3.length);
        allocateDirect3.order(ByteOrder.nativeOrder());
        allocateDirect3.put(bArr3);
        allocateDirect3.position(0);
        ByteBuffer allocate = ByteBuffer.allocate((i5 * i6) + (((i5 + 1) / 2) * 2 * i5));
        allocate.clear();
        convertRawYUV2ByteArray(allocate.array(), allocateDirect, allocateDirect2, allocateDirect3, i2, i3, i4, i5, i6);
        return allocate;
    }

    public boolean convertRawYUV2ByteHolder(ByteBufferHolder byteBufferHolder, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2, int i3, int i4, int i5, int i6) {
        checkReuseByteBuffer((i5 * i6) + (((i5 + 1) / 2) * 2 * i6), byteBufferHolder);
        return convertRawYUV2ByteBuffer(byteBufferHolder.byteBuffer, byteBuffer, byteBuffer2, byteBuffer3, i2, i3, i4, i5, i6);
    }

    private boolean convertRawYUV2ByteArray(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int[] iArr = this.strides;
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        int[] iArr2 = this.steps;
        iArr2[0] = i5;
        iArr2[1] = (i5 + 1) / 2;
        int i8 = (i5 * i6) + (iArr2[1] * 2 * i6);
        byteBuffer.clear();
        byteBuffer2.clear();
        byteBuffer3.clear();
        if (bArr == null || i8 > bArr.length) {
            return false;
        }
        ByteBuffer[] byteBufferArr = this.byteBuffers;
        byteBufferArr[0] = byteBuffer;
        byteBufferArr[1] = byteBuffer2;
        byteBufferArr[2] = byteBuffer3;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ByteBuffer[] byteBufferArr2 = this.byteBuffers;
            if (i9 < byteBufferArr2.length) {
                ByteBuffer byteBuffer4 = byteBufferArr2[i9];
                int i11 = this.strides[i9];
                int[] iArr3 = this.steps;
                if (i9 == 0) {
                    i7 = iArr3[0];
                } else {
                    i7 = iArr3[1];
                }
                int i12 = i11 - i7;
                if (i11 != i7) {
                    while (byteBuffer4.hasRemaining() && byteBuffer4.position() + i7 <= byteBuffer4.capacity()) {
                        byteBuffer4.get(bArr, i10, i7);
                        i10 += i7;
                        int position = byteBuffer4.position() + i12;
                        if (!byteBuffer4.hasRemaining() || position > byteBuffer4.capacity()) {
                            break;
                        }
                        byteBuffer4.position(position);
                    }
                } else {
                    int remaining = byteBuffer4.remaining();
                    byteBuffer4.get(bArr, i10, remaining);
                    i10 += remaining;
                }
                i9++;
            } else {
                byteBufferArr2[0] = null;
                byteBufferArr2[1] = null;
                byteBufferArr2[2] = null;
                return true;
            }
        }
    }

    private boolean convertRawYUV2ByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int[] iArr = this.strides;
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        int[] iArr2 = this.steps;
        iArr2[0] = i5;
        iArr2[1] = (i5 + 1) / 2;
        int i8 = (i5 * i6) + (iArr2[1] * 2 * i6);
        byteBuffer2.clear();
        byteBuffer3.clear();
        byteBuffer4.clear();
        if (byteBuffer == null || i8 > byteBuffer.capacity()) {
            return false;
        }
        byteBuffer.clear();
        ByteBuffer[] byteBufferArr = this.byteBuffers;
        byteBufferArr[0] = byteBuffer2;
        byteBufferArr[1] = byteBuffer3;
        byteBufferArr[2] = byteBuffer4;
        int i9 = 0;
        while (true) {
            ByteBuffer[] byteBufferArr2 = this.byteBuffers;
            if (i9 < byteBufferArr2.length) {
                ByteBuffer byteBuffer5 = byteBufferArr2[i9];
                int i10 = this.strides[i9];
                int[] iArr3 = this.steps;
                if (i9 == 0) {
                    i7 = iArr3[0];
                } else {
                    i7 = iArr3[1];
                }
                int i11 = i10 - i7;
                if (i10 != i7) {
                    while (byteBuffer5.hasRemaining() && byteBuffer5.position() + i7 <= byteBuffer5.capacity()) {
                        byteBuffer5.limit(byteBuffer5.position() + i7);
                        byteBuffer.put(byteBuffer5);
                        int position = byteBuffer5.position() + i11;
                        if (position > byteBuffer5.capacity()) {
                            break;
                        }
                        byteBuffer5.limit(byteBuffer5.capacity());
                        byteBuffer5.position(position);
                    }
                } else {
                    byteBuffer.put(byteBuffer5);
                }
                i9++;
            } else {
                byteBufferArr2[0] = null;
                byteBufferArr2[1] = null;
                byteBufferArr2[2] = null;
                return true;
            }
        }
    }
}

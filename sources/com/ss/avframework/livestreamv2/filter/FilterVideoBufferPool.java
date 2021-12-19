package com.ss.avframework.livestreamv2.filter;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.GlTextureFrameBuffer;
import com.ss.avframework.buffer.VideoFrame;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class FilterVideoBufferPool {
    private final int mMaxSize;
    private List<Recycle> mPools = new ArrayList();

    static {
        Covode.recordClassIndex(100379);
    }

    public static class Recycle implements Runnable {
        private AtomicInteger mAtomicInteger = new AtomicInteger(0);
        private VideoFrame.IExtraData mExtraData;
        private GlTextureFrameBuffer mTextureBuffer;

        static {
            Covode.recordClassIndex(100380);
        }

        public void release() {
            this.mTextureBuffer = null;
        }

        public GlTextureFrameBuffer getBuffer() {
            return this.mTextureBuffer;
        }

        public VideoFrame.IExtraData getExtraData() {
            return this.mExtraData;
        }

        public void run() {
            decRef();
        }

        public void addRef() {
            this.mAtomicInteger.incrementAndGet();
        }

        public void decRef() {
            this.mAtomicInteger.decrementAndGet();
        }

        public int getRefCounts() {
            return this.mAtomicInteger.get();
        }

        public String toString() {
            return "tex:" + this.mTextureBuffer.getTextureId() + ",fb:" + this.mTextureBuffer.getFrameBufferId() + ",w:" + this.mTextureBuffer.getWidth() + ",h:" + this.mTextureBuffer.getHeight();
        }

        public void setExtrData(VideoFrame.IExtraData iExtraData) {
            this.mExtraData = iExtraData;
        }

        public Recycle(GlTextureFrameBuffer glTextureFrameBuffer) {
            this.mTextureBuffer = glTextureFrameBuffer;
        }

        public void setSize(int i2, int i3) {
            GlTextureFrameBuffer glTextureFrameBuffer = this.mTextureBuffer;
            if (glTextureFrameBuffer != null) {
                glTextureFrameBuffer.setSize(i2, i3);
            }
        }
    }

    public int size() {
        return this.mPools.size();
    }

    private Recycle getRecycle() {
        for (Recycle recycle : this.mPools) {
            if (recycle.getRefCounts() == 0) {
                return recycle;
            }
        }
        return null;
    }

    public Recycle pop() {
        if (this.mPools.size() > 0) {
            return this.mPools.remove(0);
        }
        return null;
    }

    private void add(Recycle recycle) {
        this.mPools.add(recycle);
    }

    public FilterVideoBufferPool(int i2) {
        this.mMaxSize = i2;
    }

    public synchronized Recycle getBuffer(int i2, int i3) {
        Recycle recycle;
        MethodCollector.i(14349);
        recycle = getRecycle();
        if (recycle == null) {
            if (this.mPools.size() < this.mMaxSize) {
                GlTextureFrameBuffer glTextureFrameBuffer = new GlTextureFrameBuffer(6408);
                recycle = new Recycle(glTextureFrameBuffer);
                add(recycle);
                glTextureFrameBuffer.setSize(i2, i3);
            }
            MethodCollector.o(14349);
        }
        recycle.addRef();
        MethodCollector.o(14349);
        return recycle;
    }
}

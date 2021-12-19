package com.ss.avframework.livestreamv2.filter;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class KaraokeRegulator {
    public long mCaptureDelayMs;
    private List<Frame> mFrames = new ArrayList();
    public long mPlayerDelayMs;

    static {
        Covode.recordClassIndex(100396);
    }

    class Frame {
        private ByteBuffer buffer;
        private long elapseMs;
        private long timeMs = System.currentTimeMillis();

        static {
            Covode.recordClassIndex(100397);
        }

        public ByteBuffer extract() {
            this.buffer.position(0);
            ByteBuffer byteBuffer = this.buffer;
            this.buffer = null;
            return byteBuffer;
        }

        public boolean elapseProfileDone() {
            if (System.currentTimeMillis() - this.timeMs >= (KaraokeRegulator.this.mPlayerDelayMs + KaraokeRegulator.this.mCaptureDelayMs) - 10) {
                return true;
            }
            return false;
        }

        protected Frame(ByteBuffer byteBuffer) {
            this.buffer = ByteBuffer.allocateDirect(byteBuffer.capacity());
            byteBuffer.position(0);
            this.buffer.put(byteBuffer);
            this.elapseMs = KaraokeRegulator.this.mPlayerDelayMs + KaraokeRegulator.this.mCaptureDelayMs;
        }
    }

    public KaraokeRegulator() {
        AVLog.ioi("KaraokeRegulator", "Create regulator ".concat(String.valueOf(this)));
    }

    /* access modifiers changed from: package-private */
    public int size() {
        int size;
        MethodCollector.i(14121);
        synchronized (this.mFrames) {
            try {
                size = this.mFrames.size();
            } finally {
                MethodCollector.o(14121);
            }
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer popBackgroundMusicFrame() {
        MethodCollector.i(14088);
        synchronized (this.mFrames) {
            try {
                if (this.mFrames.size() <= 0 || !this.mFrames.get(0).elapseProfileDone()) {
                    MethodCollector.o(14088);
                    return null;
                }
                return this.mFrames.remove(0).extract();
            } finally {
                MethodCollector.o(14088);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void updateCaptureDelayMs(long j2) {
        this.mCaptureDelayMs = j2;
    }

    /* access modifiers changed from: package-private */
    public void updatePlayerDelayMs(long j2) {
        this.mPlayerDelayMs = j2;
    }

    /* access modifiers changed from: package-private */
    public void pushBackgroundMusicFrame(ByteBuffer byteBuffer) {
        MethodCollector.i(14087);
        synchronized (this.mFrames) {
            try {
                if (this.mFrames.size() > 100) {
                    AVLog.ioe("KaraokeRegulator", "Regulator exception with drop " + this.mFrames.size() + " frames and capture delay " + this.mCaptureDelayMs + " ms player delay " + this.mPlayerDelayMs);
                    this.mFrames.clear();
                }
                if (byteBuffer != null) {
                    this.mFrames.add(new Frame(byteBuffer));
                    MethodCollector.o(14087);
                }
            } finally {
                MethodCollector.o(14087);
            }
        }
    }
}

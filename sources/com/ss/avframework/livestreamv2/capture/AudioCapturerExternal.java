package com.ss.avframework.livestreamv2.capture;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.capture.audio.AudioCapturer;
import com.ss.avframework.utils.ThreadUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class AudioCapturerExternal extends AudioCapturer {

    /* renamed from: m  reason: collision with root package name */
    private int f151624m;
    private AudioCapturer.AudioCaptureObserver mAudioCaptureObserver;
    private int mBitwidth;
    private ByteBuffer mByteBuffer10ms;
    private int mChannel;
    private Handler mHandler;
    private int mSampleHZ;
    private int mSize;
    private boolean mStart;
    private long mStartTimestamp;
    private Object mStopFence = new Object();

    public interface AudioCaptureObserver {
        static {
            Covode.recordClassIndex(99957);
        }

        void onError(int i2, Exception exc);

        void onStarted();

        void onStoped();
    }

    static {
        Covode.recordClassIndex(99955);
    }

    @Override // com.ss.avframework.engine.MediaSource
    public int status() {
        return 1;
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public int updateChannel() {
        return this.mChannel;
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public void start() {
        MethodCollector.i(12281);
        nativeAdaptedOutputFormat(this.mSampleHZ, this.mChannel, this.mBitwidth);
        synchronized (this.mStopFence) {
            try {
                this.mStart = true;
            } finally {
                MethodCollector.o(12281);
            }
        }
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer
    public synchronized void stop() {
        MethodCollector.i(12282);
        synchronized (this.mStopFence) {
            try {
                this.mStart = false;
            } finally {
                MethodCollector.o(12282);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onData(final Buffer buffer, final int i2, final int i3, final int i4, final long j2) {
        Handler handler = this.mHandler;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
                /* class com.ss.avframework.livestreamv2.capture.AudioCapturerExternal.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(99956);
                }

                public void run() {
                    AudioCapturerExternal.this.nativeOnData(buffer, i2, i3, i4, j2);
                }
            });
        } else {
            nativeOnData(buffer, i2, i3, i4, j2);
        }
    }

    public AudioCapturerExternal(int i2, int i3, int i4, Handler handler, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this.mAudioCaptureObserver = audioCaptureObserver;
        this.mSampleHZ = i2;
        this.mChannel = i3;
        this.mBitwidth = i4;
        this.mHandler = handler;
        this.mStart = false;
        this.mSize = 0;
        this.mByteBuffer10ms = ByteBuffer.allocateDirect(4096);
    }

    public int pushAudioFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j2) {
        ByteBuffer byteBuffer2;
        if (!this.mStart) {
            return -1;
        }
        if (!byteBuffer.isDirect()) {
            byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.capacity());
            byteBuffer.position(0);
            byteBuffer2.put(byteBuffer);
            byteBuffer2.position(0);
        } else {
            byteBuffer2 = byteBuffer;
        }
        onData(byteBuffer2, i5 / i3, i2, i3, j2);
        return 0;
    }

    private void adjustBufferTo10MsAndSend(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j2) {
        int i6 = ((i3 * i2) / 100) * 2;
        byteBuffer.position(0);
        int i7 = i5 * 2;
        if (byteBuffer.capacity() >= i7) {
            if (i6 > this.mSize) {
                ByteBuffer byteBuffer2 = null;
                int position = this.mByteBuffer10ms.position();
                if (position > 0) {
                    byteBuffer2 = ByteBuffer.allocate(position);
                    this.mByteBuffer10ms.position(0);
                    this.mByteBuffer10ms.limit(position);
                    byteBuffer2.put(this.mByteBuffer10ms);
                }
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i6);
                this.mByteBuffer10ms = allocateDirect;
                allocateDirect.position(0);
                this.mSize = i6;
                if (byteBuffer2 != null) {
                    byteBuffer2.position(0);
                    this.mByteBuffer10ms.put(byteBuffer2);
                }
            }
            if (this.mByteBuffer10ms.position() + i7 >= i6) {
                this.mStartTimestamp = j2 / 1000;
                boolean z = true;
                int i8 = 0;
                do {
                    int position2 = this.mByteBuffer10ms.position();
                    byteBuffer.position(i8);
                    if (position2 > 0) {
                        int i9 = i6 - position2;
                        byteBuffer.limit(i9);
                        this.mByteBuffer10ms.put(byteBuffer.slice());
                        this.mByteBuffer10ms.position(0);
                        this.mByteBuffer10ms.limit(i6);
                        this.mByteBuffer10ms.limit(this.mSize);
                        this.mByteBuffer10ms.position(0);
                        onData(byteBuffer.slice(), i2 / 100, i2, i3, this.mStartTimestamp * 1000);
                        i8 += i9;
                        byteBuffer.limit(i7);
                    } else if (i7 - i8 > i6) {
                        byteBuffer.limit(i6);
                        onData(byteBuffer.slice(), i2 / 100, i2, i3, this.mStartTimestamp * 1000);
                        i8 += i6;
                    } else {
                        byteBuffer.limit(i7);
                        this.mByteBuffer10ms.put(byteBuffer.slice());
                        z = false;
                    }
                    this.mStartTimestamp += 10;
                } while (z);
            }
        }
    }
}

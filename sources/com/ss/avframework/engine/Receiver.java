package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.utils.TEBundle;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public abstract class Receiver extends NativeObject {
    static {
        Covode.recordClassIndex(99823);
    }

    private native void nativeCloseStream();

    private native long nativeGetCurrentPos(boolean z, long j2);

    private native TEBundle nativeGetOption();

    private native int nativeGetStreamInfo(TEBundle tEBundle);

    public static native int nativeMixer(Buffer buffer, Buffer buffer2, float f2, float f3, int i2, int i3, boolean z);

    private native int nativeOpenStream(String str);

    private native int nativeOpenStreamWithFd(int i2);

    private native int nativeSeek(long j2, boolean z, long j3);

    private native void nativeSetOption(TEBundle tEBundle);

    public boolean isNativeReceiver() {
        return false;
    }

    public abstract int readAudioBuffer(ByteBuffer byteBuffer, boolean z);

    public abstract int readAudioBuffer(ByteBuffer byteBuffer, boolean z, IntBuffer intBuffer);

    public abstract int readVideoBuffer(ByteBuffer byteBuffer);

    public void closeStream() {
        nativeCloseStream();
    }

    public TEBundle getOption() {
        return nativeGetOption();
    }

    public void setOption(TEBundle tEBundle) {
        nativeSetOption(tEBundle);
    }

    public long getCurrentPos(boolean z) {
        return nativeGetCurrentPos(z, this.mNativeObj);
    }

    public int getStreamInfo(TEBundle tEBundle) {
        return nativeGetStreamInfo(tEBundle);
    }

    public int openStream(int i2) {
        return nativeOpenStreamWithFd(i2);
    }

    public int openStream(String str) {
        return nativeOpenStream(str);
    }

    public int seek(long j2, boolean z) {
        return nativeSeek(j2, z, this.mNativeObj);
    }
}

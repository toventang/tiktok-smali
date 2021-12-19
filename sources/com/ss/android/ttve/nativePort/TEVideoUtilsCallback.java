package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.ad;
import com.ss.android.vesdk.ae;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class TEVideoUtilsCallback {
    private ae frameDataListener;
    private ad frameListener;

    static {
        Covode.recordClassIndex(37739);
    }

    public ad getFrameAvailableListener() {
        return this.frameListener;
    }

    public void setFrameDataListener(Object obj) {
        this.frameDataListener = (ae) obj;
    }

    public void setListener(Object obj) {
        this.frameListener = (ad) obj;
    }

    public static ByteBuffer allocateBuffer(int i2) {
        return ByteBuffer.allocateDirect(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static ByteBuffer allocateFrame(int i2, int i3) {
        return ByteBuffer.allocateDirect(i2 * i3 * 4).order(ByteOrder.LITTLE_ENDIAN);
    }

    public boolean onFrameAvailable(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        ad adVar = this.frameListener;
        if (adVar == null || !adVar.processFrame(byteBuffer, i2, i3, i4)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameAvailable(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        ad adVar;
        if (!(obj instanceof TEVideoUtilsCallback) || (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) == null || (adVar = tEVideoUtilsCallback.frameListener) == null || !adVar.processFrame(byteBuffer, i2, i3, i4)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameAvailable2(Object obj, byte[] bArr, int i2, int i3, int i4) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        ad adVar;
        if (!(obj instanceof TEVideoUtilsCallback) || (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) == null || (adVar = tEVideoUtilsCallback.frameListener) == null || !adVar.processFrame(ByteBuffer.wrap(bArr), i2, i3, i4)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameDataAvailable(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4, int i5) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        ae aeVar;
        if (!(obj instanceof TEVideoUtilsCallback) || (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) == null || (aeVar = tEVideoUtilsCallback.frameDataListener) == null || !aeVar.a()) {
            return false;
        }
        return true;
    }
}

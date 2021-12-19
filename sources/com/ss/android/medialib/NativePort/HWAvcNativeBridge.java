package com.ss.android.medialib.NativePort;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.a;
import com.ss.android.medialib.b;
import java.nio.ByteBuffer;

public class HWAvcNativeBridge implements b {
    private a mAVCEncoder;
    private long mNativePtr;

    static {
        Covode.recordClassIndex(36826);
    }

    public static int com_ss_android_medialib_NativePort_HWAvcNativeBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    @Override // com.ss.android.medialib.b
    public int getProfile() {
        return 0;
    }

    public native int nativeSetCodecConfig(long j2, ByteBuffer byteBuffer, int i2);

    public native int nativeSetColorFormat(long j2, int i2);

    public native int nativeSetHardEncoderStatus(long j2, boolean z);

    public native void nativeSwapGlBuffer(long j2);

    public native int nativeWriteFile(long j2, ByteBuffer byteBuffer, int i2, int i3, int i4, int i5);

    public void onEncoderData(ByteBuffer byteBuffer, int i2, boolean z) {
    }

    @Override // com.ss.android.medialib.b
    public void onEncoderData(byte[] bArr, int i2, boolean z) {
    }

    @Override // com.ss.android.medialib.b
    public Surface onInitHardEncoder(int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8) {
        return null;
    }

    @Override // com.ss.android.medialib.b
    public void onWriteFile(ByteBuffer byteBuffer, long j2, long j3, int i2, boolean z) {
    }

    @Override // com.ss.android.medialib.b
    public void onSwapGlBuffers() {
        MethodCollector.i(4153);
        nativeSwapGlBuffer(this.mNativePtr);
        MethodCollector.o(4153);
    }

    @Override // com.ss.android.medialib.b
    public void onUninitHardEncoder() {
        a aVar = this.mAVCEncoder;
        if (aVar != null) {
            aVar.c();
            this.mAVCEncoder = null;
        }
    }

    public HWAvcNativeBridge(long j2) {
        this.mNativePtr = j2;
    }

    @Override // com.ss.android.medialib.b
    public void setColorFormat(int i2) {
        MethodCollector.i(3375);
        nativeSetColorFormat(this.mNativePtr, i2);
        MethodCollector.o(3375);
    }

    @Override // com.ss.android.medialib.b
    public void onSetCodecConfig(ByteBuffer byteBuffer) {
        MethodCollector.i(3974);
        nativeSetCodecConfig(this.mNativePtr, byteBuffer, byteBuffer.remaining());
        MethodCollector.o(3974);
    }

    @Override // com.ss.android.medialib.b
    public int onEncoderData(int i2, int i3, int i4, boolean z) {
        a aVar = this.mAVCEncoder;
        if (aVar == null) {
            return 0;
        }
        aVar.a(i2, i3, i4, z);
        return 0;
    }

    @Override // com.ss.android.medialib.b
    public void onWriteFile(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        MethodCollector.i(3976);
        nativeWriteFile(this.mNativePtr, byteBuffer, byteBuffer.remaining(), i2, i3, i4);
        MethodCollector.o(3976);
    }

    public Surface onInitHardEncoder(int i2, int i3, int i4, int i5, boolean z) {
        MethodCollector.i(3732);
        if (this.mAVCEncoder == null) {
            a aVar = new a();
            this.mAVCEncoder = aVar;
            aVar.f59661h = i5;
        }
        a.f59653a = this;
        Surface a2 = this.mAVCEncoder.a(i2, i3, i4, 1, 1, i5, z);
        if (a2 == null) {
            this.mAVCEncoder = null;
            nativeSetHardEncoderStatus(this.mNativePtr, false);
            MethodCollector.o(3732);
            return null;
        }
        com_ss_android_medialib_NativePort_HWAvcNativeBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("HWAvcNativeBridge", "====== initAVCEncoder succeed ======");
        nativeSetHardEncoderStatus(this.mNativePtr, true);
        com_ss_android_medialib_NativePort_HWAvcNativeBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("HWAvcNativeBridge", "MarkManager onInitHardEncoder == exit");
        MethodCollector.o(3732);
        return a2;
    }
}

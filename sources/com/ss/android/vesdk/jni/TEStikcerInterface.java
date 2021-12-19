package com.ss.android.vesdk.jni;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.nativePort.NativeCallbacks;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.filterparam.VEStickerPinAreaParam;
import com.ss.android.vesdk.z;
import java.nio.ByteBuffer;

public class TEStikcerInterface {

    /* renamed from: a  reason: collision with root package name */
    public long f151338a;

    /* renamed from: b  reason: collision with root package name */
    public int f151339b;

    static {
        Covode.recordClassIndex(99524);
    }

    private native int nativeAddInfoSticker(long j2, String str, String[] strArr);

    private native int nativeAddSubTrack(long j2, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d2, double d3, double d4, double d5, int i2, int i3);

    private native int nativeControlInfoStickerAnimationPreview(long j2, boolean z, int i2, int i3);

    private native int nativeGet2DBrushStrokeCount(long j2);

    private native float[] nativeGetInfoStickerBoundingBox(long j2, int i2);

    private native float[] nativeGetInfoStickerBoundingBoxWithoutRotate(long j2, int i2);

    private native int nativeRemoveInfoStickerWithBuffer(long j2, int i2);

    private native int nativeSetInfoStickerFlip(long j2, int i2, boolean z, boolean z2);

    public native int nativeAddInfoStickerWithBuffer(long j2);

    public native int nativeBegin2DBrush(long j2);

    public native int nativeBeginInfoStickerPin(long j2, int i2);

    public native int nativeCancelInfoStickerPin(long j2, int i2);

    public native int nativeDeleteSubTrack(long j2, int i2);

    public native int nativeEnd2DBrush(long j2, String str);

    public native int nativeGetInfoStickerFlip(long j2, int i2, boolean[] zArr);

    public native int nativeGetInfoStickerPinData(long j2, int i2, ByteBuffer[] byteBufferArr);

    public native int nativeGetInfoStickerPinState(long j2, int i2);

    public native int nativeGetInfoStickerPosition(long j2, int i2, float[] fArr);

    public native float nativeGetInfoStickerRotate(long j2, int i2);

    public native float nativeGetInfoStickerScale(long j2, int i2);

    public native String nativeGetInfoStickerTemplateParam(long j2, int i2);

    public native String nativeGetInfoStickerTemplateParamWithPath(long j2, String str);

    public native boolean nativeGetInfoStickerVisible(long j2, int i2);

    public native int nativeGetSrtInfoStickerInitPosition(long j2, int i2, float[] fArr);

    public native int nativeGetSubTrackFilter(long j2, int i2);

    public native int nativeGetTextContentCallback(long j2, NativeCallbacks.OnARTextContentCallback onARTextContentCallback);

    public native int nativeGetTextLimitCount(long j2);

    public native boolean nativeIsInfoStickerAnimatable(long j2, int i2);

    public native int nativeNotifyHideKeyBoard(long j2, boolean z);

    public native int nativePauseEffectAudio(long j2, boolean z);

    public native int nativePauseInfoStickerAnimation(long j2, boolean z);

    public native int nativeRemoveInfoSticker(long j2, int i2);

    public native int nativeRestoreInfoStickerPinWithJson(long j2, int i2, ByteBuffer byteBuffer, int i3);

    public native int nativeSet2DBrushCanvasColor(long j2, float f2);

    public native int nativeSet2DBrushColor(long j2, float f2, float f3, float f4, float f5);

    public native int nativeSet2DBrushSize(long j2, float f2);

    public native int nativeSetEffectBgmEnable(long j2, boolean z);

    public native int nativeSetEffectFontPath(long j2, String str, int i2);

    public native int nativeSetEffectInputText(long j2, String str, int i2, int i3, String str2);

    public native int nativeSetInfoStickerAnimationParam(long j2, int i2, boolean z, String str, int i3, String str2, int i4, int i5);

    public native int nativeSetInfoStickerAnimationPreview(long j2, int i2, boolean z);

    public native int nativeSetInfoStickerBufferCallback(long j2, VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener);

    public native int nativeSetInfoStickerCallSync(long j2, boolean z);

    public native int nativeSetInfoStickerRestoreMode(long j2, int i2);

    public native float nativeSetInfoStickerScale(long j2, int i2, float f2);

    public native int nativeSetLanguage(long j2, String str);

    public native int nativeSetStickerPinArea(long j2, int i2, VEStickerPinAreaParam vEStickerPinAreaParam);

    public native int nativeSetTextBitmapCallback(long j2, NativeCallbacks.OnARTextBitmapCallback onARTextBitmapCallback);

    public native int nativeStopInfoStickerPin(long j2, int i2);

    public native int nativeUndo2DBrush(long j2);

    public native int nativeUpdateTextSticker(long j2, int i2, String str);

    public final int a() {
        MethodCollector.i(8683);
        long j2 = this.f151338a;
        if (j2 == 0) {
            MethodCollector.o(8683);
            return -112;
        }
        int nativeGet2DBrushStrokeCount = nativeGet2DBrushStrokeCount(j2);
        MethodCollector.o(8683);
        return nativeGet2DBrushStrokeCount;
    }

    public TEStikcerInterface(long j2) {
        this.f151338a = j2;
        an.a("TEMVInterface", "enable public pin adaptor:trueenable info sticker code refactor:true");
    }

    public final int a(String str, String[] strArr) {
        MethodCollector.i(8220);
        long j2 = this.f151338a;
        if (j2 == 0) {
            MethodCollector.o(8220);
            return -112;
        } else if (this.f151339b < 0) {
            MethodCollector.o(8220);
            return -105;
        } else {
            int nativeAddInfoSticker = nativeAddInfoSticker(j2, str, strArr);
            MethodCollector.o(8220);
            return nativeAddInfoSticker;
        }
    }

    public final float[] a(int i2, boolean z) {
        float[] nativeGetInfoStickerBoundingBoxWithoutRotate;
        MethodCollector.i(8282);
        long j2 = this.f151338a;
        if (j2 == 0) {
            z zVar = new z(-112, "");
            MethodCollector.o(8282);
            throw zVar;
        } else if (this.f151339b >= 0) {
            if (z) {
                nativeGetInfoStickerBoundingBoxWithoutRotate = nativeGetInfoStickerBoundingBox(j2, i2);
            } else {
                nativeGetInfoStickerBoundingBoxWithoutRotate = nativeGetInfoStickerBoundingBoxWithoutRotate(j2, i2);
            }
            if (nativeGetInfoStickerBoundingBoxWithoutRotate[0] == 0.0f) {
                float[] fArr = new float[4];
                System.arraycopy(nativeGetInfoStickerBoundingBoxWithoutRotate, 1, fArr, 0, 4);
                MethodCollector.o(8282);
                return fArr;
            }
            z zVar2 = new z(-1, "native getInfoStickerBoundingBox failed: " + nativeGetInfoStickerBoundingBoxWithoutRotate[0] + " index: " + i2);
            MethodCollector.o(8282);
            throw zVar2;
        } else {
            z zVar3 = new z(-100, "");
            MethodCollector.o(8282);
            throw zVar3;
        }
    }

    public final int a(boolean z, int i2, int i3) {
        MethodCollector.i(8471);
        long j2 = this.f151338a;
        if (j2 == 0) {
            MethodCollector.o(8471);
            return -112;
        }
        int nativeControlInfoStickerAnimationPreview = nativeControlInfoStickerAnimationPreview(j2, z, i2, i3);
        MethodCollector.o(8471);
        return nativeControlInfoStickerAnimationPreview;
    }

    public final int a(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d2, double d3, double d4, double d5) {
        MethodCollector.i(8473);
        long j2 = this.f151338a;
        if (j2 == 0) {
            MethodCollector.o(8473);
            return -112;
        }
        int i2 = this.f151339b;
        if (i2 < 0) {
            MethodCollector.o(8473);
            return -105;
        }
        int nativeAddSubTrack = nativeAddSubTrack(j2, strArr, null, iArr, iArr2, iArr3, iArr4, d2, d3, d4, d5, 0, i2);
        MethodCollector.o(8473);
        return nativeAddSubTrack;
    }
}

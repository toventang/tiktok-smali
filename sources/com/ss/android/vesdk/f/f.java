package com.ss.android.vesdk.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEListener;
import java.nio.ByteBuffer;

public interface f {
    static {
        Covode.recordClassIndex(99438);
    }

    int addImageSticker(String str, float f2, float f3, float f4, float f5);

    int addImageStickerWithRatio(String str, float f2, float f3, float f4, float f5);

    int addInfoSticker(String str, String[] strArr);

    int addInfoStickerWithBuffer();

    int beginInfoStickerPin(int i2);

    int cancelInfoStickerPin(int i2);

    void clearNativeFromSticker();

    float[] getInfoStickerBoundingBox(int i2);

    int getInfoStickerPinData(int i2, ByteBuffer[] byteBufferArr);

    float getInfoStickerRotate(int i2);

    float getInfoStickerScale(int i2);

    boolean getInfoStickerVisible(int i2);

    int getSrtInfoStickerInitPosition(int i2, float[] fArr);

    boolean isInfoStickerAnimatable(int i2);

    int removeInfoSticker(int i2);

    int restoreInfoStickerPinWithData(int i2, ByteBuffer byteBuffer);

    int setInfoStickerAlpha(int i2, float f2);

    int setInfoStickerBufferCallback(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener);

    int setInfoStickerLayer(int i2, int i3);

    int setInfoStickerPosition(int i2, float f2, float f3);

    int setInfoStickerRestoreMode(int i2);

    int setInfoStickerRotation(int i2, float f2);

    int setInfoStickerScale(int i2, float f2);

    int setInfoStickerTime(int i2, int i3, int i4);

    int setSrtInitialPosition(int i2, float f2, float f3);
}

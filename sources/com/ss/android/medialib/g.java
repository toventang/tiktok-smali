package com.ss.android.medialib;

import android.media.Image;
import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.camera.ImageFrame;
import com.ss.android.medialib.camera.c;
import com.ss.android.vesdk.an;
import java.nio.ByteBuffer;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    ImageFrame f59722a;

    static {
        Covode.recordClassIndex(36882);
    }

    public g(ImageFrame imageFrame) {
        this.f59722a = imageFrame;
    }

    public final boolean a(int[][] iArr, ByteBuffer[] byteBufferArr) {
        Image.Plane[] planeArr;
        c plane = this.f59722a.getPlane();
        if (plane == null || (planeArr = plane.f59717a) == null) {
            return false;
        }
        for (int i2 = 0; i2 < planeArr.length; i2++) {
            byteBufferArr[i2] = planeArr[i2].getBuffer();
            int remaining = byteBufferArr[i2].remaining();
            int rowStride = planeArr[i2].getRowStride();
            if (rowStride <= 0) {
                rowStride = this.f59722a.width;
                an.d("PlanFrame", "rowStride <= 0");
            }
            int pixelStride = planeArr[i2].getPixelStride();
            if (pixelStride <= 0) {
                an.d("PlanFrame", "pixelStride <= 0");
                pixelStride = 1;
            }
            iArr[i2] = new int[]{remaining, rowStride, pixelStride};
        }
        return true;
    }
}

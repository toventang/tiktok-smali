package com.ss.android.vesdk.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.nativePort.f;

public class BefTextLayoutResult {
    Bitmap bitmap;
    int height;
    int lineCount;
    int width;

    static {
        Covode.recordClassIndex(99541);
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBitmap(Bitmap bitmap2) {
        this.bitmap = bitmap2;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setLineCount(int i2) {
        this.lineCount = i2;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }

    public static BefTextLayoutResult readFromByteArray(byte[][] bArr) {
        Bitmap bitmap2;
        MethodCollector.i(1747);
        f fVar = new f(bArr[0]);
        BefTextLayoutResult befTextLayoutResult = new BefTextLayoutResult();
        if (fVar.f61358a.length != 0) {
            bitmap2 = BitmapFactory.decodeByteArray(fVar.f61358a, 0, fVar.f61358a.length);
        } else {
            bitmap2 = null;
        }
        befTextLayoutResult.setBitmap(bitmap2);
        befTextLayoutResult.setWidth(fVar.a());
        befTextLayoutResult.setHeight(fVar.a());
        befTextLayoutResult.setLineCount(fVar.a());
        MethodCollector.o(1747);
        return befTextLayoutResult;
    }
}

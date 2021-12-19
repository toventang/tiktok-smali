package com.ss.android.medialib.camera;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class ImageFrame {
    public Bitmap bitmap;
    public ByteBuffer byteBuffer;
    public int format;
    public int height;
    public byte[] mBuf;
    public c mPlane;
    public int rotate;
    public int width;

    static {
        Covode.recordClassIndex(36873);
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public byte[] getBuf() {
        return this.mBuf;
    }

    public int getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    public c getPlane() {
        return this.mPlane;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBuf(byte[] bArr) {
        this.mBuf = bArr;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }

    public ImageFrame(Bitmap bitmap2, int i2) {
        this.bitmap = bitmap2;
        this.format = i2;
    }

    public ImageFrame(c cVar, int i2, int i3, int i4) {
        this.mPlane = cVar;
        this.format = i2;
        this.width = i3;
        this.height = i4;
    }

    public ImageFrame(byte[] bArr, int i2, int i3, int i4) {
        this.mBuf = bArr;
        this.format = i2;
        this.width = i3;
        this.height = i4;
    }

    public static ImageFrame create(ByteBuffer byteBuffer2, int i2, int i3, int i4, int i5) {
        return new ImageFrame(byteBuffer2, i2, i3, i4, i5);
    }

    public ImageFrame(ByteBuffer byteBuffer2, int i2, int i3, int i4, int i5) {
        this.byteBuffer = byteBuffer2;
        this.width = i2;
        this.height = i3;
        this.format = i4;
        this.rotate = i5;
    }
}

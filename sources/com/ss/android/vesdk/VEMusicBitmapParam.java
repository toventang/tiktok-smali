package com.ss.android.vesdk;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

public class VEMusicBitmapParam {
    public int lineCnt;
    public Bitmap lyricsBitmap;

    static {
        Covode.recordClassIndex(99194);
    }

    public void recycleBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public VEMusicBitmapParam(Bitmap bitmap, int i2) {
        this.lyricsBitmap = bitmap;
        this.lineCnt = i2;
    }
}

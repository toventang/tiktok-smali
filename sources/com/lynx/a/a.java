package com.lynx.a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

public abstract class a {
    static {
        Covode.recordClassIndex(34552);
    }

    public abstract void recycle(Bitmap bitmap);

    public abstract Bitmap require(int i2, int i3, Bitmap.Config config);
}

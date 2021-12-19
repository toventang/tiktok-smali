package com.bef.effectsdk.text.data;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

public class TextBitmapResult {
    public Bitmap bitmap;
    public int channel;
    public CharLayout[] charLayouts;
    public int lineCount;
    public int type;

    static {
        Covode.recordClassIndex(2900);
    }
}

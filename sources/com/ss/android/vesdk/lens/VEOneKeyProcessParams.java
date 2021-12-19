package com.ss.android.vesdk.lens;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

public class VEOneKeyProcessParams extends VEBaseRecorderLensParams {
    public int faceNum;
    public Rect[] faceRects;
    public boolean isFirstFrame;
    public int iso;
    public int maxIso;
    public int minIso;

    static {
        Covode.recordClassIndex(99536);
    }
}

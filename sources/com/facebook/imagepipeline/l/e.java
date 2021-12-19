package com.facebook.imagepipeline.l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.g.f;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.memory.d;
import com.facebook.imageutils.a;

public class e extends b {
    static {
        Covode.recordClassIndex(29030);
    }

    public e(d dVar, int i2, f.c cVar) {
        super(dVar, i2, cVar);
    }

    @Override // com.facebook.imagepipeline.l.b
    public int a(int i2, int i3, BitmapFactory.Options options) {
        if (options.outColorSpace == null || !options.outColorSpace.isWideGamut() || options.inPreferredConfig == Bitmap.Config.RGBA_F16) {
            return a.a(i2, i3, options.inPreferredConfig);
        }
        return i2 * i3 * 8;
    }
}

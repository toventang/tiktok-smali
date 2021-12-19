package com.bytedance.push.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import java.io.IOException;

public final class d implements a {
    static {
        Covode.recordClassIndex(25707);
    }

    @Override // com.bytedance.push.b.a
    public final Bitmap a(c cVar) {
        try {
            return b(cVar);
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap b(com.bytedance.push.b.c r15) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.b.d.b(com.bytedance.push.b.c):android.graphics.Bitmap");
    }

    private static void a(int i2, int i3, BitmapFactory.Options options) {
        a(i2, i3, options.outWidth, options.outHeight, options);
    }

    private static void a(int i2, int i3, int i4, int i5, BitmapFactory.Options options) {
        int i6;
        if (i5 > i3 || i4 > i2) {
            int floor = (int) Math.floor((double) (((float) i5) / ((float) i3)));
            i6 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
            if (floor < i6) {
                i6 = floor;
            }
        } else {
            i6 = 1;
        }
        options.inSampleSize = i6;
        options.inJustDecodeBounds = false;
    }
}

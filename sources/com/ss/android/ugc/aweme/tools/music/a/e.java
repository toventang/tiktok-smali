package com.ss.android.ugc.aweme.tools.music.a;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class e {
    static {
        Covode.recordClassIndex(91697);
    }

    public static final Bitmap a(Bitmap bitmap) {
        MethodCollector.i(1848);
        l.d(bitmap, "");
        Matrix matrix = new Matrix();
        matrix.postScale(256.0f / ((float) bitmap.getWidth()), 256.0f / ((float) bitmap.getHeight()));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        l.b(createBitmap, "");
        MethodCollector.o(1848);
        return createBitmap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> List<E> a(List<E> list, int i2) {
        l.d(list, "");
        if (list.size() <= i2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        float size = (((float) (list.size() - 1)) * 1.0f) / ((float) (i2 - 1));
        int i3 = 0;
        int i4 = i2 - 2;
        if (i4 >= 0) {
            while (true) {
                arrayList.add(list.get(Math.round(((float) i3) * size)));
                if (i3 == i4) {
                    break;
                }
                i3++;
            }
        }
        arrayList.add(n.i((List) list));
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0095 A[SYNTHETIC, Splitter:B:40:0x0095] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(android.graphics.Bitmap r7, java.lang.String r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.a.e.a(android.graphics.Bitmap, java.lang.String, java.lang.String):boolean");
    }
}

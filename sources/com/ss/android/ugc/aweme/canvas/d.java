package com.ss.android.ugc.aweme.canvas;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;
import h.v;
import java.util.Comparator;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69675a = new a((byte) 0);

    static {
        Covode.recordClassIndex(42966);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42967);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.canvas.c
    public final p<Integer, Integer> a(Bitmap bitmap) {
        l.d(bitmap, "");
        int width = bitmap.getWidth();
        double height = (double) bitmap.getHeight();
        Double.isNaN(height);
        Integer valueOf = Integer.valueOf(a(bitmap, new Rect(0, 0, width, (int) (height * 0.1d))));
        int height2 = bitmap.getHeight();
        double height3 = (double) bitmap.getHeight();
        Double.isNaN(height3);
        return v.a(valueOf, Integer.valueOf(a(bitmap, new Rect(0, height2 - ((int) (height3 * 0.1d)), bitmap.getWidth(), bitmap.getHeight()))));
    }

    public static final class b<T> implements Comparator {
        static {
            Covode.recordClassIndex(42968);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t2.f69647b), Integer.valueOf(t.f69647b));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(android.graphics.Bitmap r18, android.graphics.Rect r19) {
        /*
        // Method dump skipped, instructions count: 664
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.canvas.d.a(android.graphics.Bitmap, android.graphics.Rect):int");
    }
}

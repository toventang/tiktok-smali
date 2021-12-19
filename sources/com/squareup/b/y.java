package com.squareup.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.bytedance.covode.number.Covode;
import com.squareup.b.t;
import java.io.InputStream;

public abstract class y {
    static {
        Covode.recordClassIndex(36092);
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean a(NetworkInfo networkInfo) {
        return false;
    }

    public abstract boolean a(w wVar);

    public abstract a b(w wVar);

    /* access modifiers changed from: package-private */
    public boolean b() {
        return false;
    }

    static boolean a(BitmapFactory.Options options) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        return true;
    }

    static BitmapFactory.Options d(w wVar) {
        boolean z;
        boolean c2 = wVar.c();
        if (wVar.q != null) {
            z = true;
        } else {
            z = false;
        }
        BitmapFactory.Options options = null;
        if (c2 || z) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = c2;
            if (z) {
                options.inPreferredConfig = wVar.q;
            }
        }
        return options;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final t.d f58151a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f58152b;

        /* renamed from: c  reason: collision with root package name */
        public final InputStream f58153c;

        /* renamed from: d  reason: collision with root package name */
        public final int f58154d;

        static {
            Covode.recordClassIndex(36093);
        }

        public a(Bitmap bitmap, t.d dVar) {
            this((Bitmap) ae.a(bitmap, "bitmap == null"), null, dVar, 0);
        }

        public a(InputStream inputStream, t.d dVar) {
            this(null, (InputStream) ae.a(inputStream, "stream == null"), dVar, 0);
        }

        a(Bitmap bitmap, InputStream inputStream, t.d dVar, int i2) {
            boolean z;
            boolean z2 = true;
            if (bitmap != null) {
                z = true;
            } else {
                z = false;
            }
            if ((inputStream == null ? false : z2) ^ z) {
                this.f58152b = bitmap;
                this.f58153c = inputStream;
                this.f58151a = (t.d) ae.a(dVar, "loadedFrom == null");
                this.f58154d = i2;
                return;
            }
            throw new AssertionError();
        }
    }

    static void a(int i2, int i3, BitmapFactory.Options options, w wVar) {
        a(i2, i3, options.outWidth, options.outHeight, options, wVar);
    }

    static void a(int i2, int i3, int i4, int i5, BitmapFactory.Options options, w wVar) {
        int i6;
        double floor;
        if (i5 > i3 || i4 > i2) {
            if (i3 == 0) {
                floor = Math.floor((double) (((float) i4) / ((float) i2)));
            } else if (i2 == 0) {
                floor = Math.floor((double) (((float) i5) / ((float) i3)));
            } else {
                int floor2 = (int) Math.floor((double) (((float) i5) / ((float) i3)));
                int floor3 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                if (wVar.f58122k) {
                    i6 = Math.max(floor2, floor3);
                } else {
                    i6 = Math.min(floor2, floor3);
                }
            }
            i6 = (int) floor;
        } else {
            i6 = 1;
        }
        options.inSampleSize = i6;
        options.inJustDecodeBounds = false;
    }
}

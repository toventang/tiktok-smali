package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.utils.ae;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.WeakHashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<a, Bitmap> f22611a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<Bitmap> f22612b;

    /* renamed from: c  reason: collision with root package name */
    private static TypedArray f22613c = y.a().obtainTypedArray(R.array.av);

    /* renamed from: d  reason: collision with root package name */
    private static Random f22614d = new Random();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f22615a;

        /* renamed from: b  reason: collision with root package name */
        public int f22616b;

        /* renamed from: c  reason: collision with root package name */
        public int f22617c;

        /* renamed from: d  reason: collision with root package name */
        public int f22618d = -1;

        static {
            Covode.recordClassIndex(13359);
        }

        public final int hashCode() {
            return ((((((this.f22615a + 629) * 37) + this.f22616b) * 37) + this.f22617c) * 37) + this.f22618d;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                if (this.f22616b == aVar.f22616b && this.f22617c == aVar.f22617c && this.f22615a == aVar.f22615a && this.f22618d == aVar.f22618d) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public a(int i2, int i3, int i4) {
            this.f22616b = i3;
            this.f22617c = i4;
            this.f22615a = i2;
        }
    }

    static {
        Covode.recordClassIndex(13358);
    }

    public static Bitmap a(Context context, String str) {
        int i2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.x2);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.x1);
        if (!TextUtils.isEmpty(str)) {
            try {
                i2 = Integer.valueOf(str).intValue();
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a(6, "HeartView", e2.getStackTrace());
                i2 = f22614d.nextInt(f22613c.length());
            }
        } else {
            i2 = f22614d.nextInt(f22613c.length());
            com.bytedance.android.live.core.c.a.a(3, "HeartView", "digg index is null, get random index!");
        }
        if (i2 < 0) {
            com.bytedance.android.live.core.c.a.a(6, "HeartView", "the index from remote is negative number!");
            i2 = f22614d.nextInt(f22613c.length());
        }
        if (f22613c.length() <= 0) {
            return null;
        }
        TypedArray typedArray = f22613c;
        return ae.a(context, typedArray.getResourceId(i2 % typedArray.length(), 0), dimensionPixelSize, dimensionPixelSize2);
    }
}

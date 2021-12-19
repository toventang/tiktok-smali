package com.ss.android.ugc.aweme.shortvideo.mvtemplate;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.c.g;
import com.bytedance.lighten.a.c.h;
import h.f.b.l;

public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f128807a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Paint f128808b = new Paint();

    static {
        Covode.recordClassIndex(84505);
    }

    @Override // com.bytedance.lighten.a.c.h
    public final String a() {
        return "top_bottom_black_transform";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84506);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.lighten.a.c.h
    public final com.bytedance.lighten.a.c.b a(Bitmap bitmap, g gVar) {
        int i2;
        int i3;
        l.d(bitmap, "");
        l.d(gVar, "");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            i3 = (width - height) / 2;
            i2 = width;
        } else {
            i2 = height;
            i3 = 0;
        }
        com.bytedance.lighten.a.c.b a2 = gVar.a(width, i2, Bitmap.Config.RGB_565);
        l.b(a2, "");
        new Canvas(a2.a()).drawBitmap(bitmap, new Rect(0, 0, width, height), new Rect(0, i3, width, height + i3), this.f128808b);
        return a2;
    }
}

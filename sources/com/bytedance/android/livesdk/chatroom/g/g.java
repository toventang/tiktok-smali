package com.bytedance.android.livesdk.chatroom.g;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.a.c;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.a.a.e;
import com.facebook.imagepipeline.o.b;
import com.zhiliaoapp.musically.R;
import f.a.t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

public final class g {

    public interface a {
        static {
            Covode.recordClassIndex(8588);
        }

        void a();

        void a(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(8583);
    }

    public static t<Bitmap> a(ImageModel imageModel) {
        return t.a(new h(imageModel));
    }

    public static Rect a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
        if (order.get() == 0) {
            return null;
        }
        order.get();
        order.get();
        order.get();
        order.getInt();
        order.getInt();
        Rect rect = new Rect();
        rect.left = order.getInt();
        rect.right = order.getInt();
        rect.top = order.getInt();
        rect.bottom = order.getInt();
        return rect;
    }

    public static b[] b(ImageModel imageModel) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c cVar = new c();
        for (String str : imageModel.getUrls()) {
            if (!m.a(str)) {
                com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(Uri.parse(str));
                cVar.a(a2);
                arrayList.add(a2.a());
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Drawable c(ImageModel imageModel) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return null;
        }
        e eVar = (e) com.facebook.drawee.a.a.c.b().a(b(imageModel));
        eVar.f47322j = true;
        com.facebook.drawee.c.a c2 = eVar.e();
        com.facebook.drawee.f.a a2 = new com.facebook.drawee.f.b(y.a()).a();
        y.e();
        com.facebook.drawee.view.b a3 = com.facebook.drawee.view.b.a(a2);
        a3.a(c2);
        return a3.f();
    }

    public static void b(HSImageView hSImageView, ImageModel imageModel) {
        p.b(hSImageView, imageModel, R.drawable.bq3, 2);
    }

    public static void a(HSImageView hSImageView, ImageModel imageModel) {
        k.a(hSImageView, imageModel, k.a(), null, null, false);
    }

    public static byte[] a(byte[] bArr, float f2) {
        if (bArr == null) {
            return null;
        }
        ByteBuffer order = ByteBuffer.allocate(bArr.length).order(ByteOrder.nativeOrder());
        ByteBuffer order2 = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
        if (order2.get() == 0) {
            return null;
        }
        order.put((byte) 1);
        int i2 = order2.get();
        int[] iArr = new int[i2];
        int i3 = order2.get();
        int[] iArr2 = new int[i3];
        int i4 = order2.get();
        int[] iArr3 = new int[i4];
        order.put((byte) i2);
        order.put((byte) i3);
        order.put((byte) i4);
        order.putInt(order2.getInt());
        order.putInt(order2.getInt());
        order.putInt((int) (((float) order2.getInt()) * f2));
        order.putInt((int) (((float) order2.getInt()) * f2));
        order.putInt((int) (((float) order2.getInt()) * f2));
        order.putInt((int) (((float) order2.getInt()) * f2));
        order.putInt(order2.getInt());
        iArr[0] = order2.getInt();
        iArr[1] = order2.getInt();
        order.putInt((int) (((float) iArr[0]) * f2));
        order.putInt((int) (((float) iArr[1]) * f2));
        iArr2[0] = order2.getInt();
        iArr2[1] = order2.getInt();
        order.putInt((int) (((float) iArr2[0]) * f2));
        order.putInt((int) (((float) iArr2[1]) * f2));
        for (int i5 = 0; i5 < i4; i5++) {
            order.putInt(order2.getInt());
        }
        return order.array();
    }

    public static void a(ImageView imageView, ImageModel imageModel, int i2) {
        p.a(imageView, imageModel, 0, 0, i2, null);
    }

    public static void a(ImageView imageView, ImageModel imageModel, p.a aVar) {
        p.a(imageView, imageModel, -1, -1, -1, aVar);
    }

    public static void a(ImageView imageView, ImageModel imageModel, int i2, int i3, int i4) {
        p.a(imageView, imageModel, i2, i3, i4, null);
    }
}

package com.bytedance.android.livesdk.wishlist.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class WishListNotSetView extends ConstraintLayout {
    static {
        Covode.recordClassIndex(13512);
    }

    public WishListNotSetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ WishListNotSetView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WishListNotSetView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9558);
        a.a(LayoutInflater.from(context), R.layout.bgi, this, true);
        Bitmap a2 = com.bytedance.android.livesdk.wishlist.c.a.a(BitmapFactory.decodeResource(y.a(), 2131234274), y.a(6.0f));
        l.b(a2, "");
        ((ImageView) findViewById(R.id.bm0)).setImageBitmap(a2);
        MethodCollector.o(9558);
    }
}

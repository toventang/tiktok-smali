package com.zhihu.matisse.internal.ui.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.o.c;
import com.zhihu.matisse.internal.entity.Album;
import com.zhiliaoapp.musically.R;

public final class b extends CursorAdapter {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f156473a;

    static {
        Covode.recordClassIndex(103903);
    }

    public b(Context context) {
        super(context, (Cursor) null, false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.i4});
        this.f156473a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return a.a(LayoutInflater.from(context), R.layout.cn, viewGroup, false);
    }

    public final void bindView(View view, Context context, Cursor cursor) {
        Album a2 = Album.a(cursor);
        ((TextView) view.findViewById(R.id.ip)).setText(a2.a(context));
        ((TextView) view.findViewById(R.id.io)).setText(String.valueOf(a2.f156419d));
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.im);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ok);
        c a3 = c.a(a2.f156418c);
        a3.f48447d = new d(dimensionPixelSize, dimensionPixelSize);
        com.facebook.imagepipeline.o.b a4 = a3.a();
        com.facebook.drawee.f.a aVar = (com.facebook.drawee.f.a) simpleDraweeView.getHierarchy();
        if (aVar == null) {
            aVar = new com.facebook.drawee.f.b(context.getResources()).a();
        }
        aVar.a(1, this.f156473a);
        simpleDraweeView.setHierarchy(aVar);
        simpleDraweeView.setImageRequest(a4);
    }
}

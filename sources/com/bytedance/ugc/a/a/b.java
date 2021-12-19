package com.bytedance.ugc.a.a;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.a.c;
import h.f.b.l;

public final class b extends c.e<ImageView> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f45828a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(27913);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
    @Override // com.bytedance.ugc.a.c.e
    public final /* synthetic */ int a(ImageView imageView) {
        ImageView imageView2 = imageView;
        l.c(imageView2, "");
        return c.a.C1129a.a(imageView2.getDrawable());
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.bytedance.ugc.a.c.e
    public final /* synthetic */ ImageView b(View view) {
        l.c(view, "");
        if (!(view instanceof ImageView)) {
            view = null;
        }
        return (ImageView) view;
    }
}

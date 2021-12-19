package com.bytedance.tux.b.a;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.g;
import h.f.b.l;

public final class e extends b<View> {
    static {
        Covode.recordClassIndex(27314);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
    @Override // com.bytedance.tux.b.a.b
    public final /* synthetic */ boolean a(View view, int i2, Object obj) {
        View view2 = view;
        l.c(view2, "");
        l.c(obj, "");
        if (i2 == g.a().f44668a) {
            g.a();
            l.c(obj, "");
            view2.setAlpha(((Number) obj).floatValue());
            return true;
        } else if (i2 == g.b().f44668a) {
            g.b();
            l.c(obj, "");
            view2.setBackgroundResource(((Number) obj).intValue());
            return true;
        } else if (i2 != g.c().f44668a) {
            return false;
        } else {
            g.c();
            l.c(obj, "");
            Context context = view2.getContext();
            l.a((Object) context, "");
            view2.setBackground(((com.bytedance.tux.c.e) obj).a(context));
            return true;
        }
    }
}

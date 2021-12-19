package com.bytedance.ugc.a.a;

import android.view.View;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.a.c;
import h.f.b.l;

public final class c extends c.e<ProgressBar> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f45829a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(27914);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
    @Override // com.bytedance.ugc.a.c.e
    public final /* synthetic */ int a(ProgressBar progressBar) {
        ProgressBar progressBar2 = progressBar;
        l.c(progressBar2, "");
        return c.a.C1129a.a(progressBar2.getProgressDrawable());
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.bytedance.ugc.a.c.e
    public final /* synthetic */ ProgressBar b(View view) {
        l.c(view, "");
        if (!(view instanceof ProgressBar)) {
            view = null;
        }
        return (ProgressBar) view;
    }
}

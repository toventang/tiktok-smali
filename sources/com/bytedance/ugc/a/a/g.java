package com.bytedance.ugc.a.a;

import android.view.View;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.a.c;
import h.f.b.l;

public final class g extends c.e<ViewStub> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f45833a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(27918);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
    @Override // com.bytedance.ugc.a.c.e
    public final /* synthetic */ int a(ViewStub viewStub) {
        l.c(viewStub, "");
        return 0;
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.bytedance.ugc.a.c.e
    public final /* synthetic */ ViewStub b(View view) {
        l.c(view, "");
        if (!(view instanceof ViewStub)) {
            view = null;
        }
        return (ViewStub) view;
    }
}

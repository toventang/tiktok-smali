package com.ss.android.ugc.aweme.i18n.language.a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final g f99787a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f99788b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f99789c;

    static {
        Covode.recordClassIndex(63621);
    }

    h(g gVar, Context context, String[] strArr) {
        this.f99787a = gVar;
        this.f99788b = context;
        this.f99789c = strArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        g gVar = this.f99787a;
        Context context = this.f99788b;
        String[] strArr = this.f99789c;
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        if (gVar.f99782d == null) {
            gVar.f99782d = new a(context, strArr);
        }
        if (!gVar.f99782d.isShowing()) {
            gVar.f99782d.show();
        }
        gVar.f99779a = false;
        return null;
    }
}

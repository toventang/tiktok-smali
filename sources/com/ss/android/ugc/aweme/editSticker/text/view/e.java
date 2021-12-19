package com.ss.android.ugc.aweme.editSticker.text.view;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.r;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f88653a;

    /* renamed from: b  reason: collision with root package name */
    private final View f88654b;

    static {
        Covode.recordClassIndex(55784);
    }

    e(c cVar, View view) {
        this.f88653a = cVar;
        this.f88654b = view;
    }

    public final void run() {
        c cVar = this.f88653a;
        View view = this.f88654b;
        cVar.smoothScrollTo((view.getLeft() - (cVar.getWidth() / 2)) - ((int) r.a(view.getContext(), (float) c.f88650a)), 0);
    }
}

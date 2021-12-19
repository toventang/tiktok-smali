package com.ss.android.ugc.aweme.comment.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class an implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final k f72523a;

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView.r f72524b;

    static {
        Covode.recordClassIndex(44693);
    }

    an(k kVar, RecyclerView.r rVar) {
        this.f72523a = kVar;
        this.f72524b = rVar;
    }

    public final void run() {
        k kVar = this.f72523a;
        kVar.u.a(this.f72524b);
    }
}

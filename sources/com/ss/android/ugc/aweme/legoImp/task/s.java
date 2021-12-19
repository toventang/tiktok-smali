package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tux.a.i.a;

final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f107993a;

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f107994b;

    static {
        Covode.recordClassIndex(69231);
    }

    s(Context context, StringBuilder sb) {
        this.f107993a = context;
        this.f107994b = sb;
    }

    public final void run() {
        new a(this.f107993a).a(this.f107994b.toString()).a();
    }
}

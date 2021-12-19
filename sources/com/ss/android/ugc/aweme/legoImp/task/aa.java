package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;

public final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final z f107940a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f107941b;

    static {
        Covode.recordClassIndex(69181);
    }

    public aa(z zVar, Context context) {
        this.f107940a = zVar;
        this.f107941b = context;
    }

    public final void run() {
        Context context = this.f107941b;
        new TuxTextView(context);
        new TuxIconView(context);
    }
}

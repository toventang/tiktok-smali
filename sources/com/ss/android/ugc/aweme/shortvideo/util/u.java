package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f132371a;

    static {
        Covode.recordClassIndex(86676);
    }

    u(Context context) {
        this.f132371a = context;
    }

    public final void run() {
        new a(this.f132371a).a(R.string.cav).a();
    }
}

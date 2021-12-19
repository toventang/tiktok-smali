package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bk;
import com.ss.android.ugc.aweme.shortvideo.util.bj;

final /* synthetic */ class bn implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f129072a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f129073b;

    /* renamed from: c  reason: collision with root package name */
    private final bk.a f129074c;

    static {
        Covode.recordClassIndex(84713);
    }

    bn(boolean z, Context context, bk.a aVar) {
        this.f129072a = z;
        this.f129073b = context;
        this.f129074c = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        boolean z = this.f129072a;
        Context context = this.f129073b;
        bk.a aVar = this.f129074c;
        if (z) {
            bj.a("reuse support open setting activity");
            c.D.c().d(context);
            return;
        }
        bj.a("reuse not support open setting activity");
        bk.a(context, aVar);
    }
}

package com.ss.android.ugc.aweme.share.silent;

import android.content.DialogInterface;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.c;
import com.bytedance.lobby.internal.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;

final /* synthetic */ class l implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f124357a;

    static {
        Covode.recordClassIndex(81649);
    }

    l(j jVar) {
        this.f124357a = jVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        j jVar = this.f124357a;
        if (jVar.getContext() instanceof e) {
            r.onEvent(MobClick.obtain().setEventName("sync_permission").setLabelName("success"));
            jVar.f124345a = "twitter";
            c.a aVar = new c.a((e) jVar.getContext());
            aVar.f40170a = "twitter";
            aVar.f40172c = new r(jVar);
            c a2 = aVar.a();
            d.a();
            d.a(a2);
        }
    }
}

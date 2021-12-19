package com.bytedance.android.livesdk.olddialog.giftpanellist.c;

import android.view.View;
import com.bytedance.android.livesdk.dialogv2.b.d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f20084a;

    static {
        Covode.recordClassIndex(11858);
    }

    k(j jVar) {
        this.f20084a = jVar;
    }

    public final void onClick(View view) {
        j jVar = this.f20084a;
        if (jVar.f20062j instanceof d) {
            Prop prop = (Prop) jVar.f20062j.f17864b;
            if (prop == null || prop.count > 0) {
                jVar.f20063k.a(jVar.f20062j, jVar);
            } else if (prop.banner != null) {
                jVar.f20063k.a(prop.banner.f19076f, "gray_prop");
            }
        }
    }
}

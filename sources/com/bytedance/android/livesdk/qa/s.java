package com.bytedance.android.livesdk.qa;

import android.view.View;
import com.bytedance.android.livesdk.qa.i;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;

final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i.f f20516a;

    static {
        Covode.recordClassIndex(12107);
    }

    s(i.f fVar) {
        this.f20516a = fVar;
    }

    public final void onClick(View view) {
        i.f fVar = this.f20516a;
        fVar.a(fVar.f20488a.f19336e, StringSet.name);
    }
}

package com.ss.android.ugc.aweme.profile.a;

import b.g;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final e f115846a;

    static {
        Covode.recordClassIndex(74724);
    }

    i(e eVar) {
        this.f115846a = eVar;
    }

    @Override // b.g
    public final Object then(b.i iVar) {
        e eVar = this.f115846a;
        if (!iVar.a()) {
            return null;
        }
        Integer num = (Integer) iVar.d();
        eVar.f115838c.setText(eVar.f115838c.getContext().getResources().getQuantityString(R.plurals.hv, num.intValue(), num));
        return null;
    }
}

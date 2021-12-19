package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;

final /* synthetic */ class a implements g {

    /* renamed from: a  reason: collision with root package name */
    static final g f107928a = new a();

    static {
        Covode.recordClassIndex(69178);
    }

    private a() {
    }

    @Override // b.g
    public final Object then(i iVar) {
        Context a2 = d.a();
        float a3 = (float) com.ss.android.ugc.aweme.m.a.a(a2);
        int b2 = com.ss.android.ugc.aweme.m.a.b(a2);
        if (a3 == -1.0f || b2 == -1 || ((float) b2) / a3 <= 0.2f) {
            return null;
        }
        com.ss.android.ugc.aweme.m.a.a(a2, (int) (((float) com.ss.android.ugc.aweme.m.a.a(a2)) * 0.2f));
        return null;
    }
}

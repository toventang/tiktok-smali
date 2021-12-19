package com.ss.android.ugc.aweme.live.settings;

import android.content.Context;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.l.a;
import com.bytedance.l.a.a.e;

final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Context f108574a;

    static {
        Covode.recordClassIndex(69590);
    }

    b(Context context) {
        this.f108574a = context;
    }

    @Override // b.g
    public final Object then(i iVar) {
        c cVar;
        Context context = this.f108574a;
        if (iVar.c() || (cVar = (c) iVar.d()) == null || cVar.status_code != 0 || cVar.f108575a == null) {
            return null;
        }
        ((e) a.b(e.class)).a(context, cVar.f108575a);
        return null;
    }
}

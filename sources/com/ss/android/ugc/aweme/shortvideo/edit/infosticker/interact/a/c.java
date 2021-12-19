package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.compile.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f127175a;

    static {
        Covode.recordClassIndex(83418);
    }

    public c(a aVar) {
        this.f127175a = aVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        a aVar = this.f127175a;
        if (iVar.d() != null) {
            return new a(((d) aVar.f127193l).u(), (b) iVar.d());
        }
        return null;
    }
}

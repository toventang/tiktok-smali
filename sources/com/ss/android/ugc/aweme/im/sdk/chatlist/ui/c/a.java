package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.c;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a.b;
import h.f.b.l;

public final class a extends j.e<com.ss.android.ugc.aweme.im.service.k.a> {
    static {
        Covode.recordClassIndex(65334);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean a(com.ss.android.ugc.aweme.im.service.k.a aVar, com.ss.android.ugc.aweme.im.service.k.a aVar2) {
        com.ss.android.ugc.aweme.im.service.k.a aVar3 = aVar;
        com.ss.android.ugc.aweme.im.service.k.a aVar4 = aVar2;
        l.d(aVar3, "");
        l.d(aVar4, "");
        return l.a((Object) aVar3.bF_(), (Object) aVar4.bF_());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean b(com.ss.android.ugc.aweme.im.service.k.a aVar, com.ss.android.ugc.aweme.im.service.k.a aVar2) {
        com.ss.android.ugc.aweme.im.service.k.a aVar3 = aVar;
        com.ss.android.ugc.aweme.im.service.k.a aVar4 = aVar2;
        l.d(aVar3, "");
        l.d(aVar4, "");
        if (!(aVar3 instanceof b) || !(aVar4 instanceof b)) {
            return l.a(aVar3, aVar4);
        }
        if (aVar3.q == aVar4.q && aVar3.r == aVar4.r) {
            return true;
        }
        return false;
    }
}

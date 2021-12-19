package com.ss.android.ugc.aweme.inbox.widget.multi;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;

public final class l extends j.e<k> {
    static {
        Covode.recordClassIndex(66909);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean a(k kVar, k kVar2) {
        k kVar3 = kVar;
        k kVar4 = kVar2;
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        if (kVar3.f104493j == kVar4.f104493j) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean b(k kVar, k kVar2) {
        k kVar3 = kVar;
        k kVar4 = kVar2;
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        if (!(kVar3 instanceof b) || !(kVar4 instanceof b)) {
            return h.f.b.l.a(kVar3, kVar4);
        }
        if (kVar3.a() != kVar4.a()) {
            return false;
        }
        b bVar = (b) kVar3;
        b bVar2 = (b) kVar4;
        if (!h.f.b.l.a(bVar.f104446e, bVar2.f104446e) || !h.f.b.l.a((Object) bVar.f104445d, (Object) bVar2.f104445d) || kVar3.f104493j != kVar4.f104493j || !h.f.b.l.a((Object) bVar.f104447f, (Object) bVar2.f104447f)) {
            return false;
        }
        return true;
    }
}

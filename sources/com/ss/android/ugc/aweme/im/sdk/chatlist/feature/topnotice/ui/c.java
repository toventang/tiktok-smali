package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends j.e<b> {
    static {
        Covode.recordClassIndex(65287);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean a(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        l.d(bVar3, "");
        l.d(bVar4, "");
        return l.a((Object) bVar3.getNoticeCode(), (Object) bVar4.getNoticeCode());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean b(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        l.d(bVar3, "");
        l.d(bVar4, "");
        if (bVar3.getButtonText() == bVar4.getButtonText() && bVar3.getDescription() == bVar4.getDescription() && bVar3.getTitle() == bVar4.getTitle()) {
            return true;
        }
        return false;
    }
}

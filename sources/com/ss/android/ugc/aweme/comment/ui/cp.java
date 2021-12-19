package com.ss.android.ugc.aweme.comment.ui;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;

final /* synthetic */ class cp implements u {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72693a;

    static {
        Covode.recordClassIndex(44787);
    }

    cp(bz bzVar) {
        this.f72693a = bzVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        bz bzVar = this.f72693a;
        GiftStruct giftStruct = (GiftStruct) obj;
        if (giftStruct == null) {
            bzVar.B.setVisibility(8);
            bzVar.D.setVisibility(8);
            return;
        }
        bzVar.B.setVisibility(0);
        bzVar.D.setVisibility(0);
        if (giftStruct.getIconList() != null && giftStruct.getIconList().getUrlList() != null && !giftStruct.getIconList().getUrlList().isEmpty()) {
            v a2 = r.a(giftStruct.getIconList().getUrlList().get(0));
            a2.E = bzVar.D;
            a2.v = w.CENTER_INSIDE;
            a2.c();
        }
    }
}

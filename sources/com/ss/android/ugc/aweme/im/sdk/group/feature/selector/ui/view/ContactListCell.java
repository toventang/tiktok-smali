package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import h.f.b.l;
import h.n;
import h.v;

public final class ContactListCell extends BaseContactListCell<b> {
    static {
        Covode.recordClassIndex(65850);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell
    public final /* bridge */ /* synthetic */ void a(a aVar) {
        a((b) aVar);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell
    public final void a(b bVar) {
        l.d(bVar, "");
        super.a(bVar);
        ContactListViewModel a2 = a();
        String uid = bVar.f102762a.getUid();
        l.b(uid, "");
        l.d(uid, "");
        int i2 = com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.a.f102785c[a2.g().getEntry().ordinal()];
        if (i2 == 1) {
            l.d(uid, "");
            r.a("show_group_member", v.a(com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.f101506a, "previous_page"), v.a("member_list", "enter_from"), v.a(uid, "to_user_id"));
        } else if (i2 == 2) {
            l.d(uid, "");
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("show_add_member", v.a(uid, "to_user_id"));
        } else {
            throw new n();
        }
    }
}

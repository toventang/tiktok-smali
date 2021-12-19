package com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.share.b.b.g;
import com.ss.android.ugc.aweme.im.service.c.e;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.share.a.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f103611a;

    /* renamed from: b  reason: collision with root package name */
    private int f103612b = -1;

    /* renamed from: c  reason: collision with root package name */
    private IMContact f103613c;

    /* renamed from: d  reason: collision with root package name */
    private final SharePanelViewModel f103614d;

    static {
        Covode.recordClassIndex(66382);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements com.ss.android.ugc.aweme.im.sdk.share.b.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f103615a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f103616b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SharePackage f103617c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f103618d;

        static {
            Covode.recordClassIndex(66383);
        }

        a(c cVar, String str, SharePackage sharePackage, List list) {
            this.f103615a = cVar;
            this.f103616b = str;
            this.f103617c = sharePackage;
            this.f103618d = list;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.a
        public final void a() {
            g.a(this.f103616b, this.f103617c, this.f103618d);
            b bVar = this.f103615a.f103611a;
            if (bVar != null) {
                SharePackage sharePackage = this.f103617c;
                this.f103618d.size();
                bVar.c(sharePackage);
            }
            com.ss.android.ugc.aweme.im.sdk.relations.a.b.a(this.f103617c, "", n.g((Collection) this.f103618d));
        }
    }

    public final void a(IMContact iMContact) {
        b bVar;
        l.d(iMContact, "");
        SharePackage sharePackage = this.f103614d.f103597d;
        if (sharePackage == null || (bVar = this.f103611a) == null || bVar.a(sharePackage)) {
            b(iMContact);
        } else {
            com.ss.android.ugc.aweme.framework.a.a.a("LongPressShare cancel share by callback");
        }
    }

    private final void a(SharePackage sharePackage) {
        sharePackage.f124595i.putInt("is_create_group_chat", 0);
        IMContact iMContact = this.f103613c;
        if (iMContact instanceof IMUser) {
            sharePackage.f124595i.putInt("friends_shared_cnt", 1);
        } else if (iMContact instanceof IMConversation) {
            sharePackage.f124595i.putInt("friends_shared_cnt", ((IMConversation) iMContact).getConversationMemberCount());
        }
    }

    private final void b(IMContact iMContact) {
        SharePackage sharePackage = this.f103614d.f103597d;
        if (sharePackage != null) {
            List c2 = n.c(iMContact);
            Bundle bundle = sharePackage.f124595i;
            StringBuilder sb = new StringBuilder();
            Integer num = null;
            IMUser iMUser = (IMUser) (!(iMContact instanceof IMUser) ? null : iMContact);
            if (iMUser != null) {
                num = Integer.valueOf(iMUser.getFollowStatus());
            }
            bundle.putString("relation_tag", sb.append(String.valueOf(num)).toString());
            bundle.putInt("rank_num", this.f103612b);
            com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(com.ss.android.ugc.aweme.im.sdk.relations.a.a.f102956a, sharePackage, iMContact, false, null, 0, null, null, 120);
            sharePackage.f124595i.remove("rank_num");
            String a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.b.a.a();
            b bVar = this.f103611a;
            if (bVar != null) {
                bVar.b(sharePackage);
            }
            com.ss.android.ugc.aweme.im.sdk.share.b.a.a(sharePackage, c2);
            a(sharePackage);
            a aVar = new a(this, a2, sharePackage, c2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : c2) {
                if (obj instanceof IMConversation) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                com.ss.android.ugc.aweme.im.sdk.share.b.b.a.a(c2, "", sharePackage, (BaseContent) null, a2, (String) null, aVar);
            } else {
                com.ss.android.ugc.aweme.im.sdk.share.b.b.a.a((List<IMContact>) c2, "", sharePackage, a2, false, (com.ss.android.ugc.aweme.im.sdk.share.b.a.a) aVar);
            }
            if (e.b()) {
                this.f103614d.a(iMContact);
            }
        }
    }

    public c(SharePanelViewModel sharePanelViewModel, b bVar) {
        l.d(sharePanelViewModel, "");
        this.f103614d = sharePanelViewModel;
        this.f103611a = bVar;
    }

    public final void a(IMContact iMContact, int i2) {
        l.d(iMContact, "");
        this.f103613c = iMContact;
        this.f103612b = i2;
    }
}

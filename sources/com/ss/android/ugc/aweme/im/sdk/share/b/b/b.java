package com.ss.android.ugc.aweme.im.sdk.share.b.b;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.k;
import com.ss.android.ugc.aweme.im.service.model.m;
import com.ss.android.ugc.aweme.im.service.model.n;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.d.a.c;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements k {

    /* renamed from: a  reason: collision with root package name */
    private final e f103361a;

    /* renamed from: b  reason: collision with root package name */
    private final SharePackage f103362b;

    /* renamed from: c  reason: collision with root package name */
    private final IMContact f103363c;

    static {
        Covode.recordClassIndex(66244);
    }

    b(e eVar, SharePackage sharePackage, IMContact iMContact) {
        this.f103361a = eVar;
        this.f103362b = sharePackage;
        this.f103363c = iMContact;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.k
    public final void a() {
        e eVar = this.f103361a;
        SharePackage sharePackage = this.f103362b;
        IMContact iMContact = this.f103363c;
        if (eVar.f103365a == m.SENDING) {
            a.f103359a.removeMessages(100);
            eVar.a(m.UNDO);
            c.a(new n(eVar.f103367c, eVar.f103366b));
            String str = eVar.f103372h;
            HashMap hashMap = new HashMap();
            if (sharePackage != null) {
                Bundle bundle = sharePackage.f124595i;
                hashMap.put("enter_method", bundle.getString("enter_method"));
                hashMap.put("enter_from", bundle.getString("enter_from"));
            }
            hashMap.put("chat_type", "private");
            if (iMContact != null && (iMContact instanceof IMUser)) {
                IMUser iMUser = (IMUser) iMContact;
                hashMap.put("conversation_id", b.a.a(Long.valueOf(Long.parseLong(iMUser.getUid())).longValue()));
                hashMap.put("to_user_id", iMUser.getUid());
            }
            hashMap.put("process_id", str);
            hashMap.put("message_type", "share_video");
            r.a("send_message_undo", hashMap);
        }
    }
}

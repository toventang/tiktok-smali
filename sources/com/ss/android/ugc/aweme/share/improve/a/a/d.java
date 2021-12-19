package com.ss.android.ugc.aweme.share.improve.a.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.share.improve.a.aj;
import com.ss.android.ugc.aweme.share.qrcode.a;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sticker.model.g;
import h.f.b.l;

public final class d extends aj {

    /* renamed from: b  reason: collision with root package name */
    private final g f123590b;

    /* renamed from: c  reason: collision with root package name */
    private final String f123591c;

    static {
        Covode.recordClassIndex(81130);
    }

    public d(g gVar, String str) {
        l.d(gVar, "");
        this.f123590b = gVar;
        this.f123591c = str;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h, com.ss.android.ugc.aweme.share.improve.a.aj
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        r.a("enter_personal_detail", new com.ss.android.ugc.aweme.app.f.d().a("prop_id", this.f123590b.id).a("to_user_id", this.f123590b.ownerId).a("group_id", this.f123591c).a("enter_from", "prop_page").a("enter_method", "click_name").f66730a);
        String str = this.f123590b.name;
        long j2 = this.f123590b.userCount;
        String str2 = this.f123590b.id;
        l.b(str2, "");
        new a(context, str, j2, "sticker", 17, str2, (byte) 0).show();
    }
}

package com.ss.android.ugc.aweme.share.improve.a.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.qna.model.b;
import com.ss.android.ugc.aweme.share.improve.a.aj;
import com.ss.android.ugc.aweme.share.qrcode.a;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;

public final class c extends aj {

    /* renamed from: b  reason: collision with root package name */
    private final b f123589b;

    static {
        Covode.recordClassIndex(81129);
    }

    public c(b bVar) {
        l.d(bVar, "");
        this.f123589b = bVar;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h, com.ss.android.ugc.aweme.share.improve.a.aj
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        new a(context, this.f123589b.f119477c, (long) this.f123589b.f119478d, "qna", 51, String.valueOf(this.f123589b.f119476b), (byte) 0).show();
        r.a("click_qr_code", new d().a("enter_from", "qa_detail").a("qr_code_type", "question").a("question_id", this.f123589b.f119476b).f66730a);
    }
}

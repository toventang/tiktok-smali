package com.ss.android.ugc.aweme.feed.ui.masklayer2.a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.f;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.c;
import com.ss.android.ugc.aweme.share.improve.c.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import h.f.b.l;

public final class j extends n {

    /* renamed from: a  reason: collision with root package name */
    public SharePackage f94895a;

    static {
        Covode.recordClassIndex(60187);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
    public final void a(View view) {
        l.d(view, "");
        l.d("long_press_download", "");
        c.f123414a = "long_press_download";
        String str = this.f94902g;
        l.d(str, "");
        c.f123415b = str;
        Context context = view.getContext();
        l.b(context, "");
        Activity a2 = b.a(context);
        if (a2 != null) {
            ShareExtService shareExtService = ah.f123353b;
            Aweme aweme = this.f94901f;
            if (aweme == null) {
                l.b();
            }
            h hVar = shareExtService.a(a2, aweme, this.f94902g, "long_press_download");
            if (hVar != null) {
                Context context2 = view.getContext();
                l.b(context2, "");
                hVar.a(context2, this.f94895a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(a aVar, f fVar) {
        super(aVar, fVar);
        l.d(aVar, "");
        l.d(fVar, "");
        this.f94895a = aVar.f94864a;
    }
}

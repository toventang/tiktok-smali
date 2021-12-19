package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ae;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class au extends at {
    private bg B;

    static {
        Covode.recordClassIndex(64827);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.av
    public final void a() {
        super.a();
        this.f101319j = (TuxIconView) a(R.id.e_l);
        this.B = new bg(this.f101319j);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        super.a(onClickListener);
        TuxIconView tuxIconView = this.f101319j;
        if (tuxIconView != null) {
            tuxIconView.setOnClickListener(onClickListener);
        }
        ae.a aVar = this.t;
        if (aVar != null) {
            aVar.a(this.f101319j);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au(View view, b bVar) {
        super(view, bVar);
        l.d(view, "");
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.av, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.at
    public final void a(ai aiVar, ai aiVar2, BaseContent baseContent, int i2) {
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, baseContent, i2);
        bg bgVar = this.B;
        if (bgVar == null) {
            l.a("statusIcon");
        }
        bgVar.a(this.s);
    }
}

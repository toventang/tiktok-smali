package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSearchContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.c.h;
import com.ss.android.ugc.aweme.im.sdk.common.controller.c.i;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.r;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public class at extends av {
    static {
        Covode.recordClassIndex(64826);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void bE_() {
        View view = this.itemView;
        l.b(view, "");
        Context context = view.getContext();
        l.b(context, "");
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.li);
        if (r.a()) {
            b.a(i(), new float[]{dimensionPixelSize, 0.0f, 0.0f, dimensionPixelSize});
            return;
        }
        b.a(i(), new float[]{0.0f, dimensionPixelSize, dimensionPixelSize, 0.0f});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public at(View view, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        super(view, bVar);
        l.d(view, "");
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.av
    public void a(ai aiVar, ai aiVar2, BaseContent baseContent, int i2) {
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, baseContent, i2);
        Objects.requireNonNull(baseContent, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSearchContent");
        ShareSearchContent shareSearchContent = (ShareSearchContent) baseContent;
        this.o.a(50331648, 47);
        this.o.a(50331649, Boolean.valueOf(t.b(aiVar, shareSearchContent)));
        this.o.a(50331650, this.f101322m);
        this.o.a(50331651, Long.valueOf(aiVar.getMsgId()));
        if ((i.a(shareSearchContent.getImage(), i.a())) || (i.a(shareSearchContent.getUrl(), i.a())) || h.a(shareSearchContent.getSchema())) {
            m();
            return;
        }
        j().setText(shareSearchContent.getTitle());
        k().setVisibility(0);
        if (shareSearchContent.getDesc() == null || TextUtils.isEmpty(shareSearchContent.getDesc())) {
            k().setVisibility(8);
        } else {
            k().setText(shareSearchContent.getDesc());
            k().setVisibility(0);
        }
        l().setText(R.string.cjk);
        if (!TextUtils.isEmpty(shareSearchContent.getImage())) {
            a.a(i(), shareSearchContent.getImage());
        } else {
            e.a(i(), 2131232828);
        }
    }
}

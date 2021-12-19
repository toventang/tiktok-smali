package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class be extends av {
    static {
        Covode.recordClassIndex(64839);
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
    public be(View view, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        super(view, bVar);
        l.d(view, "");
        l.d(bVar, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ef  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.av
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.bytedance.im.core.d.ai r9, com.bytedance.im.core.d.ai r10, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r11, int r12) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.be.a(com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int):void");
    }
}

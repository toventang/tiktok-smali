package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.tux.tooltip.a.b.a;
import com.bytedance.tux.tooltip.c;
import com.bytedance.tux.tooltip.h;
import com.zhiliaoapp.musically.R;

final class IMService$showGroupChatGuideBubble$1 implements Runnable {
    final /* synthetic */ View $anchor;
    final /* synthetic */ Context $context;
    final /* synthetic */ Keva $keva;

    static {
        Covode.recordClassIndex(65498);
    }

    IMService$showGroupChatGuideBubble$1(Context context, View view, Keva keva) {
        this.$context = context;
        this.$anchor = view;
        this.$keva = keva;
    }

    public final void run() {
        ((a) new a(this.$context).b(this.$anchor).a().a(h.BOTTOM)).e(R.string.c9b).a(new c.AbstractC1121c(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService$showGroupChatGuideBubble$1.AnonymousClass1 */
            final /* synthetic */ IMService$showGroupChatGuideBubble$1 this$0;

            static {
                Covode.recordClassIndex(65499);
            }

            @Override // com.bytedance.tux.tooltip.c.AbstractC1121c
            public final void onShow() {
                this.this$0.$keva.storeBoolean("im_key_guide_show", true);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.this$0 = r1;
            }
        }).d().a();
    }
}

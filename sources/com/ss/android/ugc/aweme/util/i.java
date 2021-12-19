package com.ss.android.ugc.aweme.util;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.settings.f;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f142502a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(93197);
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f142503a;

        static {
            Covode.recordClassIndex(93198);
        }

        public a(boolean z) {
            this.f142503a = z;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            l.b(view, "");
            Context context = view.getContext();
            if (this.f142503a) {
                str = "personal_detail";
            } else {
                str = "others_homepage";
            }
            SmartRouter.buildRoute(context, f.a(str, "click_avatar")).open();
        }
    }
}

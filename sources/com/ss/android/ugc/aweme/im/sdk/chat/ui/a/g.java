package com.ss.android.ugc.aweme.im.sdk.chat.ui.a;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.f;
import com.ss.android.ugc.aweme.im.service.m.a;
import com.ss.android.ugc.aweme.utils.av;

final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c.AnonymousClass2 f101138a;

    /* renamed from: b  reason: collision with root package name */
    private final View f101139b;

    static {
        Covode.recordClassIndex(64701);
    }

    g(c.AnonymousClass2 r1, View view) {
        this.f101138a = r1;
        this.f101139b = view;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        c.AnonymousClass2 r4 = this.f101138a;
        View view2 = this.f101139b;
        if (r4.f101130b instanceof TextContent) {
            Context context = view2.getContext();
            String text = ((TextContent) r4.f101130b).getText();
            PrivacyCert build = PrivacyCert.Builder.with("bpea-219").usage("When user long presses individual chat message in IM chat page, it will copy the selected message into clipboard. ").tag("longPressToCopyMessage").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build();
            try {
                if (f.a(context)) {
                    av.a("copy_im_label", text, context, build);
                }
            } catch (Throwable th) {
                a.a("copyToClipboard", th);
            }
        }
        com.ss.android.ugc.aweme.im.sdk.chat.a.f.a(c.this.n.isGroupChat(), "copy");
    }
}

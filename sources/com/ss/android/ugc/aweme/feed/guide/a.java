package com.ss.android.ugc.aweme.feed.guide;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.login.c;

final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final EmptyGuideV2 f93242a;

    static {
        Covode.recordClassIndex(59122);
    }

    a(EmptyGuideV2 emptyGuideV2) {
        this.f93242a = emptyGuideV2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        EmptyGuideV2 emptyGuideV2 = this.f93242a;
        c.a(emptyGuideV2.f93199e, "homepage_follow", "click_follow_tab", (Bundle) null, new f() {
            /* class com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2.AnonymousClass1 */

            static {
                Covode.recordClassIndex(59107);
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void b() {
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void a() {
                EmptyGuideV2.this.a(true);
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.follow.b.c());
            }
        });
    }
}

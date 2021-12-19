package com.ss.android.ugc.aweme.feed.guide;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.login.c;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final EmptyGuideV2 f93244a;

    static {
        Covode.recordClassIndex(59125);
    }

    b(EmptyGuideV2 emptyGuideV2) {
        this.f93244a = emptyGuideV2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        EmptyGuideV2 emptyGuideV2 = this.f93244a;
        c.a(emptyGuideV2.f93199e, "homepage_follow", "click_follow_tab", (Bundle) null, new f() {
            /* class com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2.AnonymousClass2 */

            static {
                Covode.recordClassIndex(59108);
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void b() {
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void a() {
                EmptyGuideV2.this.a(true);
            }
        });
    }
}

package com.ss.android.ugc.aweme.feed.guide;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.service.a;
import com.ss.android.ugc.aweme.friends.ui.f;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final EmptyGuideV2 f93245a;

    static {
        Covode.recordClassIndex(59126);
    }

    c(EmptyGuideV2 emptyGuideV2) {
        this.f93245a = emptyGuideV2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        EmptyGuideV2 emptyGuideV2 = this.f93245a;
        if (emptyGuideV2.f93199e != null) {
            r.onEvent(MobClick.obtain().setEventName("phone_number").setLabelName("click"));
            Fragment f2 = emptyGuideV2.f93202h.f();
            if (!a.f97047a.a(emptyGuideV2.f93199e)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(emptyGuideV2.f93199e).a(R.string.su).a();
                a.f97047a.a(emptyGuideV2.f93199e, new f() {
                    /* class com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(59109);
                    }

                    @Override // com.ss.android.ugc.aweme.friends.ui.f
                    public final void b() {
                    }

                    @Override // com.ss.android.ugc.aweme.friends.ui.f
                    public final void a() {
                        Fragment f2 = EmptyGuideV2.this.f93202h.f();
                        if (f2 != null) {
                            SmartRouter.buildFragmentRoute(f2, "//friends/contacts").withParam("just_granted_read_contacts", true).open(1);
                        } else {
                            SmartRouter.buildRoute(EmptyGuideV2.this.f93199e, "//friends/contacts").withParam("just_granted_read_contacts", true).open();
                        }
                    }
                });
            } else if (f2 != null) {
                SmartRouter.buildFragmentRoute(f2, "//friends/contacts").open(1);
            } else {
                SmartRouter.buildRoute(emptyGuideV2.f93199e, "//friends/contacts").open();
            }
        }
    }
}

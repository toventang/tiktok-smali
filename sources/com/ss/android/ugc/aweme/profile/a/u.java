package com.ss.android.ugc.aweme.profile.a;

import android.view.View;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.story.model.c;
import h.f.b.l;
import h.v;

public final class u extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public c f115933a;

    /* renamed from: b  reason: collision with root package name */
    final View f115934b;

    /* renamed from: c  reason: collision with root package name */
    final e f115935c;

    static {
        Covode.recordClassIndex(74768);
    }

    public static void a(String str) {
        r.a("story_archive", v.a("personal_homepage", "enter_from"), v.a(str, "action_type"));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(View view, e eVar) {
        super(view);
        l.d(view, "");
        l.d(eVar, "");
        this.f115934b = view;
        this.f115935c = eVar;
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.profile.a.u.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ u f115936a;

            static {
                Covode.recordClassIndex(74769);
            }

            {
                this.f115936a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                SmartRouter.buildRoute(this.f115936a.f115935c, "//story/archive").withParam("enter_from", "profile").open();
                u.a("click");
            }
        });
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.ugc.aweme.profile.a.u.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ u f115937a;

            static {
                Covode.recordClassIndex(74770);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f115937a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                if (this.f115937a.f115933a != null) {
                    u.a("show");
                }
            }
        });
    }
}

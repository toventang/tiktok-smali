package com.ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.kids.common.c.e;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f107106a = new p();

    private p() {
    }

    static {
        Covode.recordClassIndex(68509);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f107107a;

        static {
            Covode.recordClassIndex(68510);
        }

        a(o oVar) {
            this.f107107a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                o oVar = this.f107107a;
                Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
                oVar.a((CommonItemView) view);
                String a2 = this.f107107a.a();
                if (a2 != null) {
                    e.a("click_setting_item", new c().a("item_name", a2).a());
                }
            }
        }
    }

    public static List<o> a(Activity activity) {
        l.d(activity, "");
        List<o> c2 = n.c(new a(activity), new g(activity), new f(activity), new b(activity), new h(activity), new i(activity), new q(activity), new l(activity), new e(activity), new c(activity), new k(activity), new j(activity), new d(activity), new n(activity), new m(activity));
        for (T t : c2) {
            LinearLayout linearLayout = (LinearLayout) activity.findViewById(R.id.cgl);
            l.b(linearLayout, "");
            t.a(linearLayout).setOnClickListener(new a(t));
        }
        return c2;
    }
}

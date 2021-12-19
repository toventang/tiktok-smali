package com.ss.android.ugc.aweme.find.viewholder;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.profile.ae;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final View f96124a;

    static {
        Covode.recordClassIndex(60894);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c(android.view.ViewGroup r4) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131559486(0x7f0d043e, float:1.8744317E38)
            r0 = 0
            android.view.View r1 = com.a.a(r2, r1, r4, r0)
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            r3.<init>(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.find.viewholder.c.<init>(android.view.ViewGroup):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(ViewGroup viewGroup, View view) {
        super(view);
        l.d(viewGroup, "");
        l.d(view, "");
        this.f96124a = view;
        ((ImageView) view.findViewById(R.id.elj)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.find.viewholder.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f96125a;

            static {
                Covode.recordClassIndex(60895);
            }

            {
                this.f96125a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                Activity a2 = o.a(this.f96125a.f96124a.getContext());
                if (a2 != null) {
                    ae.f115954a.a(a2, "find_friends", "personal_homepage");
                }
            }
        });
    }
}

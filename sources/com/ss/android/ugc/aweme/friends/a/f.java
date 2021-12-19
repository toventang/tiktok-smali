package com.ss.android.ugc.aweme.friends.a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.invite.I18nFollowAndInviteUserBtn;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f extends RecyclerView.ViewHolder {

    public interface a {
        static {
            Covode.recordClassIndex(61408);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(61406);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view, final a aVar) {
        super(view);
        l.d(view, "");
        l.d(aVar, "");
        ((I18nFollowAndInviteUserBtn) view.findViewById(R.id.fap)).d();
        ((LinearLayout) view.findViewById(R.id.cfb)).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.friends.a.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(61407);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                aVar.a();
            }
        });
    }
}

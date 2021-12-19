package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bb implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f72563a;

    static {
        Covode.recordClassIndex(44711);
    }

    bb(k kVar) {
        this.f72563a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        k kVar = this.f72563a;
        if (kVar.I != null) {
            Map<String, Comment> map = kVar.I.f72895b;
            if (kVar.J == null) {
                kVar.J = new a(kVar.getActivity());
                kVar.J.a(new String[]{kVar.getActivity().getResources().getString(R.string.ak9), kVar.getActivity().getResources().getString(R.string.ajv)}, new bd(kVar, map));
            }
            kVar.J.f76416a.b();
            int i2 = 0;
            for (Map.Entry<String, Comment> entry : map.entrySet()) {
                if (entry.getValue().getAliasAweme() != null) {
                    i2++;
                }
            }
            String enterFrom = kVar.f72763b.getEnterFrom();
            l.d(enterFrom, "");
            r.a("comment_batch_management_more_ck", new d().a("video_reply_number", i2).a("enter_from", enterFrom).f66730a);
        }
    }
}

package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f72675a;

    static {
        Covode.recordClassIndex(44771);
    }

    c(b bVar) {
        this.f72675a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        b bVar = this.f72675a;
        Aweme l2 = bVar.l();
        if (l2 == null || l2.getAwemeControl().canComment()) {
            bVar.w = "keyboard_enter";
            bVar.t.f("comment_panel");
            bVar.t.a((CharSequence) bVar.f72551d.getText(), (List<TextExtraStruct>) bVar.f72551d.getTextExtraStructList(), bVar.t.f71477k, false, true);
        }
    }
}

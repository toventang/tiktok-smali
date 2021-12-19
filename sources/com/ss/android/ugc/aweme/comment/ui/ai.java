package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;

final /* synthetic */ class ai implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f72514a;

    static {
        Covode.recordClassIndex(44688);
    }

    ai(k kVar) {
        this.f72514a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        k kVar = this.f72514a;
        if (kVar.f72764c == null || kVar.f72764c.getAwemeControl().canComment()) {
            kVar.z.f("comment_panel");
            kVar.N = "keyboard_enter";
            kVar.z.a((CharSequence) kVar.f72767j.getText(), (List<TextExtraStruct>) kVar.f72767j.getTextExtraStructList(), kVar.z.f71477k, false, true);
            kVar.C.a(false, true, false);
        }
    }
}

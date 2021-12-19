package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;

/* access modifiers changed from: package-private */
public final /* synthetic */ class az implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f72547a;

    static {
        Covode.recordClassIndex(44705);
    }

    az(k kVar) {
        this.f72547a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        k kVar = this.f72547a;
        if (kVar.I != null) {
            kVar.I.a().postValue(false);
            o.a(false, kVar.o, kVar.r);
            o.a(true, kVar.f72766e);
            kVar.K.b(false);
            if (kVar.t()) {
                o.b(true, kVar.n);
            }
            kVar.s();
        }
        r.onEventV3("comment_batch_management_done_ck");
    }
}

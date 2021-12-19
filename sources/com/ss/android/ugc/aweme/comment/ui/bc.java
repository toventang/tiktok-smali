package com.ss.android.ugc.aweme.comment.ui;

import androidx.core.content.b;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bc implements u {

    /* renamed from: a  reason: collision with root package name */
    private final k f72564a;

    static {
        Covode.recordClassIndex(44712);
    }

    bc(k kVar) {
        this.f72564a = kVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        k kVar = this.f72564a;
        Integer num = (Integer) obj;
        if (num.intValue() > 0) {
            kVar.p.setEnabled(true);
            kVar.p.setTextColor(b.c(kVar.getContext(), R.color.bd));
            kVar.p.setText(kVar.getContext().getString(R.string.ak0) + " (" + num + ")");
            kVar.q.setEnabled(true);
            kVar.q.setTextColor(b.c(kVar.getContext(), R.color.bx));
            if (num.intValue() == 1 && !kVar.H) {
                kVar.H = true;
                r.onEventV3("comment_batch_management_select_ck");
                return;
            }
            return;
        }
        kVar.s();
    }
}

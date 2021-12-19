package com.ss.android.ugc.aweme.tools.draft.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.ss.android.ugc.aweme.tools.draft.d.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j extends a<n> {

    /* renamed from: a  reason: collision with root package name */
    private TextView f139933a;

    static {
        Covode.recordClassIndex(91443);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(View view) {
        super(view);
        l.d(view, "");
        this.f139933a = (TextView) view.findViewById(R.id.f9k);
        b.a().a(this.f139933a, d.f33801g);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.tools.draft.d.a] */
    @Override // com.ss.android.ugc.aweme.tools.draft.viewholder.a
    public final /* synthetic */ void a(n nVar) {
        n nVar2 = nVar;
        l.d(nVar2, "");
        int i2 = nVar2.f139514c;
        TextView textView = this.f139933a;
        if (textView != null && i2 >= 0) {
            textView.setText(i2);
        }
    }
}

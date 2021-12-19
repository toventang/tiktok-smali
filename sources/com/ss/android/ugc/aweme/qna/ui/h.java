package com.ss.android.ugc.aweme.qna.ui;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.qna.model.d;
import com.ss.android.ugc.aweme.qna.model.f;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class h extends g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f119575a;

    static {
        Covode.recordClassIndex(77692);
    }

    @Override // com.ss.android.ugc.aweme.qna.ui.g
    public final void a(f fVar) {
        int i2;
        l.d(fVar, "");
        super.a(fVar);
        d dVar = (d) fVar;
        TuxIconView tuxIconView = (TuxIconView) this.f119574c.findViewById(R.id.del);
        if (tuxIconView != null) {
            if (dVar.f119489c) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tuxIconView.setVisibility(i2);
        }
        TuxTextView tuxTextView = (TuxTextView) this.f119574c.findViewById(R.id.dem);
        if (tuxTextView != null) {
            String str = dVar.f119488b;
            if (hk.a(str)) {
                tuxTextView.setText(this.f119575a.getString(dVar.f119487a, str));
                return;
            }
            tuxTextView.setText(this.f119575a.getString(dVar.f119487a));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(View view, Context context) {
        super(view);
        l.d(view, "");
        l.d(context, "");
        this.f119575a = context;
    }
}

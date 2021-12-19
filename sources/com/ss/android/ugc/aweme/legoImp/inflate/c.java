package com.ss.android.ugc.aweme.legoImp.inflate;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.a;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.ies.dmt.ui.widget.e;
import com.ss.android.ugc.aweme.feed.ui.az;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements az.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f107687a;

    /* renamed from: b  reason: collision with root package name */
    private final View.OnClickListener f107688b;

    static {
        Covode.recordClassIndex(68891);
    }

    c(Context context, View.OnClickListener onClickListener) {
        this.f107687a = context;
        this.f107688b = onClickListener;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.az.a
    public final View a(View view) {
        Context context = this.f107687a;
        d dVar = new d.a(context).a(2131233141).b(R.string.h2z).c(R.string.h2y).a(a.BORDER, R.string.h35, this.f107688b).f33648a;
        e eVar = new e(view.getContext());
        eVar.setStatus(dVar);
        return eVar;
    }
}

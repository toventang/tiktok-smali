package com.ss.android.ugc.aweme.legoImp.inflate;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.ss.android.ugc.aweme.feed.ui.az;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements az.a {

    /* renamed from: a  reason: collision with root package name */
    static final az.a f107685a = new a();

    static {
        Covode.recordClassIndex(68889);
    }

    private a() {
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.az.a
    public final View a(View view) {
        return new DmtLoadingLayout(view.getContext());
    }
}

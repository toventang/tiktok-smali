package com.ss.android.ugc.aweme.arch.widgets;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.a;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.au;

public abstract class ListItemWidget<P extends a> extends Widget implements au {

    /* renamed from: a  reason: collision with root package name */
    public a f66990a;

    static {
        Covode.recordClassIndex(41292);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public void a(a aVar) {
        this.f66990a = aVar;
    }
}

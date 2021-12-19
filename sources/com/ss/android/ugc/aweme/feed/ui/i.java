package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.widget.ListView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.helper.n;
import com.ss.android.ugc.aweme.feed.helper.q;
import h.f.b.l;

public final class i extends ListView implements n {

    /* renamed from: a  reason: collision with root package name */
    private q f94781a;

    static {
        Covode.recordClassIndex(60130);
    }

    public final q getOptionClickListener() {
        return this.f94781a;
    }

    @Override // com.ss.android.ugc.aweme.feed.helper.n
    public final void setOptionListener(q qVar) {
        l.d(qVar, "");
        this.f94781a = qVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(7282);
        MethodCollector.o(7282);
    }
}

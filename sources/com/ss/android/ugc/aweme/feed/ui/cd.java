package com.ss.android.ugc.aweme.feed.ui;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class cd implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final cc f94485a;

    static {
        Covode.recordClassIndex(59992);
    }

    cd(cc ccVar) {
        this.f94485a = ccVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        cc ccVar = this.f94485a;
        if (TextUtils.isEmpty(ccVar.f94474m) || TextUtils.isEmpty(ccVar.o)) {
            ccVar.f94474m = new SpannableStringBuilder(ccVar.L.getProcessedDesc());
            ccVar.o = new SpannableStringBuilder(ccVar.L.getEllipsizeDesc());
        }
        boolean equals = ccVar.f94466e.getText().toString().equals(ccVar.R.getString(R.string.bv8));
        if (equals) {
            ccVar.a(ccVar.f94474m, equals);
        } else {
            ccVar.a(ccVar.o, equals);
        }
    }
}

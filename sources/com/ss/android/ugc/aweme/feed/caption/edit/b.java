package com.ss.android.ugc.aweme.feed.caption.edit;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxCheckBox;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final TuxCheckBox f92877a;

    static {
        Covode.recordClassIndex(58914);
    }

    public final TuxCheckBox getCheckbox() {
        return this.f92877a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(9870);
        View findViewById = View.inflate(context, R.layout.s1, this).findViewById(R.id.atk);
        l.b(findViewById, "");
        this.f92877a = (TuxCheckBox) findViewById;
        MethodCollector.o(9870);
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }
}

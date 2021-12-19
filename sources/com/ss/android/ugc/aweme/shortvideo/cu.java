package com.ss.android.ugc.aweme.shortvideo;

import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.l;
import com.zhiliaoapp.musically.R;

public final class cu extends p {
    static {
        Covode.recordClassIndex(82274);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.p
    public final void a(Fragment fragment, View view) {
        MethodCollector.i(12457);
        this.f129529a = l.f115658a.v().a(fragment.getActivity());
        this.f129529a.a(fragment);
        ((LinearLayout) view.findViewById(R.id.eh2)).addView(this.f129529a.c());
        MethodCollector.o(12457);
    }

    public cu(Fragment fragment, View view, boolean z) {
        super(fragment, view, 1, z);
    }
}

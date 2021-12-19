package com.ss.android.ugc.aweme.shortvideo;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.l;
import com.zhiliaoapp.musically.R;

public final class cv extends p {
    static {
        Covode.recordClassIndex(82936);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.p
    public final void a(Fragment fragment, View view) {
        MethodCollector.i(11231);
        this.f129529a = l.f115658a.v().b(fragment.getActivity());
        this.f129529a.a(fragment);
        ((ViewGroup) view.findViewById(R.id.c80)).addView(this.f129529a.c());
        MethodCollector.o(11231);
    }

    public cv(Fragment fragment, View view, boolean z) {
        super(fragment, view, 1, z);
    }
}

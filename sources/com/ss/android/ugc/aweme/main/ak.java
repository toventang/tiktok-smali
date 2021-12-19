package com.ss.android.ugc.aweme.main;

import android.view.View;
import androidx.core.content.b;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.main.experiment.g;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class ak implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ae f109159a;

    static {
        Covode.recordClassIndex(69898);
    }

    ak(ae aeVar) {
        this.f109159a = aeVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        e activity;
        ae aeVar = this.f109159a;
        if (((Integer) ((h.u) obj).getThird()).intValue() != 0) {
            aeVar.f109142e = 2;
        }
        try {
            if (g.a() && (activity = aeVar.getActivity()) != null && activity.getWindow() != null) {
                View decorView = activity.getWindow().getDecorView();
                if (decorView.getBackground() == null) {
                    decorView.setBackgroundColor(b.c(aeVar.getContext(), R.color.f159928l));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}

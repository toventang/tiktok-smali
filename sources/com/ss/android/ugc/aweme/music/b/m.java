package com.ss.android.ugc.aweme.music.b;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.music.j;
import com.zhiliaoapp.musically.R;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final l f111366a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f111367b;

    static {
        Covode.recordClassIndex(71554);
    }

    public m(l lVar, boolean z) {
        this.f111366a = lVar;
        this.f111367b = z;
    }

    public final void run() {
        MethodCollector.i(8896);
        l lVar = this.f111366a;
        boolean z = this.f111367b;
        if (lVar.f111358c != null) {
            RecyclerView.ViewHolder f2 = lVar.f111358c.f(lVar.f111357b);
            if (f2 instanceof j) {
                j jVar = (j) f2;
                if (z) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(jVar.itemView.getContext(), R.anim.da);
                    loadAnimation.setInterpolator(new LinearInterpolator());
                    jVar.f111533f.setImageResource(2131232647);
                    jVar.f111533f.startAnimation(loadAnimation);
                    MethodCollector.o(8896);
                    return;
                }
                jVar.f111533f.clearAnimation();
                jVar.a(true);
            }
        }
        MethodCollector.o(8896);
    }
}

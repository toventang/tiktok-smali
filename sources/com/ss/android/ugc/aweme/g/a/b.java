package com.ss.android.ugc.aweme.g.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.f.b.l;
import h.z;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f98946a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f98947b;

    /* renamed from: c  reason: collision with root package name */
    private final View f98948c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f98949d;

    static {
        Covode.recordClassIndex(62912);
    }

    @Override // com.ss.android.ugc.aweme.g.a.e
    public final void b(a<z> aVar) {
        l.d(aVar, "");
        View view = this.f98948c;
        if (view != null) {
            view.clearAnimation();
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            aVar.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.g.a.e
    public final void a(a<z> aVar) {
        MethodCollector.i(3259);
        l.d(aVar, "");
        TextView textView = this.f98949d;
        if (textView != null) {
            textView.setVisibility(0);
        }
        View view = this.f98948c;
        if (view != null) {
            if (view.getAnimation() == null) {
                view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.b7));
                aVar.invoke();
            }
            MethodCollector.o(3259);
            return;
        }
        MethodCollector.o(3259);
    }

    public b(Context context, ViewGroup viewGroup) {
        l.d(context, "");
        l.d(viewGroup, "");
        this.f98946a = context;
        this.f98947b = viewGroup;
        this.f98948c = viewGroup.findViewById(R.id.e9x);
        this.f98949d = (TextView) viewGroup.findViewById(R.id.e_1);
    }
}

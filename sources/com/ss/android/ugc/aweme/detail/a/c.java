package com.ss.android.ugc.aweme.detail.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.detail.j;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.f.b.l;
import h.z;

public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public final View f79601a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f79602b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f79603c;

    static {
        Covode.recordClassIndex(49446);
    }

    @Override // com.ss.android.ugc.aweme.detail.j
    public final void b(a<z> aVar) {
        l.d(aVar, "");
        this.f79601a.clearAnimation();
        this.f79601a.setVisibility(8);
        aVar.invoke();
    }

    @Override // com.ss.android.ugc.aweme.detail.j
    public final void a(a<z> aVar) {
        MethodCollector.i(11791);
        l.d(aVar, "");
        this.f79601a.setVisibility(0);
        if (this.f79601a.getAnimation() == null) {
            this.f79601a.startAnimation(AnimationUtils.loadAnimation(this.f79602b, R.anim.b9));
        }
        aVar.invoke();
        MethodCollector.o(11791);
    }

    public c(Context context, ViewGroup viewGroup) {
        l.d(context, "");
        l.d(viewGroup, "");
        this.f79602b = context;
        this.f79603c = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.e_0);
        l.b(findViewById, "");
        this.f79601a = findViewById;
        viewGroup.setOnTouchListener(new View.OnTouchListener(this) {
            /* class com.ss.android.ugc.aweme.detail.a.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f79604a;

            static {
                Covode.recordClassIndex(49447);
            }

            {
                this.f79604a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                MethodCollector.i(11793);
                l.b(motionEvent, "");
                int action = motionEvent.getAction();
                if (action == 0) {
                    c cVar = this.f79604a;
                    cVar.b(j.a.b.f79783a);
                    cVar.f79603c.startAnimation(AnimationUtils.loadAnimation(cVar.f79602b, R.anim.b8));
                } else if (action == 1) {
                    c cVar2 = this.f79604a;
                    cVar2.a(j.a.C1860a.f79782a);
                    cVar2.f79603c.clearAnimation();
                }
                MethodCollector.o(11793);
                return false;
            }
        });
    }
}

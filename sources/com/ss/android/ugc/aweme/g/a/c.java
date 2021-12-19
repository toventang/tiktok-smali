package com.ss.android.ugc.aweme.g.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final View f98950a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f98951b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f98952c;

    static {
        Covode.recordClassIndex(62913);
    }

    public static final class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f98955a;

        static {
            Covode.recordClassIndex(62915);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        b(h.f.a.a aVar) {
            this.f98955a = aVar;
        }

        public final void onAnimationEnd(Animation animation) {
            this.f98955a.invoke();
        }
    }

    public static final class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98953a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f98954b;

        static {
            Covode.recordClassIndex(62914);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        public final void onAnimationEnd(Animation animation) {
            this.f98953a.f98950a.setVisibility(8);
            this.f98954b.invoke();
        }

        a(c cVar, h.f.a.a aVar) {
            this.f98953a = cVar;
            this.f98954b = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.g.a.e
    public final void b(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f98950a.clearAnimation();
        this.f98950a.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.g.a.e
    public final void a(h.f.a.a<z> aVar) {
        MethodCollector.i(3238);
        l.d(aVar, "");
        if (this.f98950a.getAnimation() != null) {
            this.f98950a.clearAnimation();
        }
        this.f98950a.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f98951b, R.anim.b5);
        loadAnimation.setAnimationListener(new b(aVar));
        this.f98950a.startAnimation(loadAnimation);
        MethodCollector.o(3238);
    }

    @Override // com.ss.android.ugc.aweme.g.a.f
    public final void c(h.f.a.a<z> aVar) {
        MethodCollector.i(3245);
        l.d(aVar, "");
        if (this.f98950a.getAnimation() != null) {
            this.f98950a.clearAnimation();
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f98951b, R.anim.b6);
        loadAnimation.setAnimationListener(new a(this, aVar));
        this.f98950a.startAnimation(loadAnimation);
        MethodCollector.o(3245);
    }

    public c(Context context, ViewGroup viewGroup) {
        l.d(context, "");
        l.d(viewGroup, "");
        this.f98951b = context;
        this.f98952c = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.e_0);
        l.b(findViewById, "");
        this.f98950a = findViewById;
    }
}

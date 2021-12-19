package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.feed.api.k;
import com.ss.android.ugc.aweme.feed.u.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ap {

    /* renamed from: f  reason: collision with root package name */
    public static final a f94269f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    q f94270a;

    /* renamed from: b  reason: collision with root package name */
    aq f94271b;

    /* renamed from: c  reason: collision with root package name */
    List<k> f94272c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public WeakReference<e> f94273d;

    /* renamed from: e  reason: collision with root package name */
    public final AnimatorSet f94274e = new AnimatorSet();

    static {
        Covode.recordClassIndex(59891);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(59892);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static int b() {
        return n.a(173.0d) + i.b();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        aq aqVar = this.f94271b;
        if (aqVar == null) {
            l.a("mListView");
        }
        aqVar.setData(this.f94272c);
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f94275a;

        static {
            Covode.recordClassIndex(59893);
        }

        b(View view) {
            this.f94275a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            this.f94275a.setVisibility(8);
        }
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f94276a;

        static {
            Covode.recordClassIndex(59894);
        }

        c(View view) {
            this.f94276a = view;
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
            this.f94276a.setVisibility(0);
        }
    }

    public final void a(String str) {
        l.d(str, "");
        if (com.bytedance.ies.abmock.b.a().a(true, "i18n_following_live_skylight_type", 0) != 0) {
            q qVar = this.f94270a;
            if (qVar == null) {
                l.a("mPresenter");
            }
            qVar.a(str);
        }
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ap f94277a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f94278b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f94279c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f94280d;

        static {
            Covode.recordClassIndex(59895);
        }

        public final void onAnimationEnd(Animator animator) {
            WeakReference<e> weakReference;
            e eVar;
            Window window;
            super.onAnimationEnd(animator);
            if (this.f94278b > this.f94279c && com.bytedance.ies.abmock.b.a().a(true, "is_release_window_background", true) && (weakReference = this.f94277a.f94273d) != null && (eVar = weakReference.get()) != null && (window = eVar.getWindow()) != null) {
                window.setBackgroundDrawable(new ColorDrawable(androidx.core.content.b.c(this.f94280d.getContext(), R.color.a2)));
            }
        }

        d(ap apVar, float f2, float f3, View view) {
            this.f94277a = apVar;
            this.f94278b = f2;
            this.f94279c = f3;
            this.f94280d = view;
        }
    }

    public final void a(List<k> list) {
        l.d(list, "");
        this.f94272c = list;
        a();
    }

    public final int b(String str) {
        l.d(str, "");
        int size = this.f94272c.size();
        List<k> list = this.f94272c;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            String uid = t.getUser().getUid();
            if (uid == null || !TextUtils.equals(uid, str)) {
                arrayList.add(t);
            }
        }
        List<k> g2 = h.a.n.g((Collection) arrayList);
        this.f94272c = g2;
        if (g2.size() != size) {
            a();
        }
        return this.f94272c.size();
    }

    public final void a(View view, boolean z) {
        l.d(view, "");
        this.f94274e.cancel();
        this.f94274e.removeAllListeners();
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", 0.0f, 1.0f);
            this.f94274e.setDuration(300L);
            this.f94274e.setInterpolator(new DecelerateInterpolator());
            this.f94274e.addListener(new c(view));
            this.f94274e.playTogether(ofFloat, ofFloat2, ofFloat3);
            this.f94274e.start();
            return;
        }
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    public final void b(View view, boolean z) {
        l.d(view, "");
        this.f94274e.cancel();
        this.f94274e.removeAllListeners();
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.0f);
            this.f94274e.setDuration(300L);
            this.f94274e.setInterpolator(new DecelerateInterpolator());
            this.f94274e.addListener(new b(view));
            this.f94274e.playTogether(ofFloat, ofFloat2, ofFloat3);
            this.f94274e.start();
            return;
        }
        view.setVisibility(8);
    }

    public final void a(View view, float f2, float f3, boolean z) {
        l.d(view, "");
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", f2, f3);
            l.b(ofFloat, "");
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(300L);
            ofFloat.addListener(new d(this, f2, f3, view));
            ofFloat.start();
            return;
        }
        view.setTranslationY(f3);
    }
}

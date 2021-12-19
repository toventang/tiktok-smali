package com.ss.android.ugc.aweme.feed.share;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.be;
import com.ss.android.ugc.aweme.feed.i.ae;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.im.service.model.j;
import com.ss.android.ugc.aweme.im.service.model.l;
import com.ss.android.ugc.aweme.im.service.model.n;
import com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.z;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ValueAnimator f93868a;

    /* renamed from: b  reason: collision with root package name */
    static WeakReference<Object> f93869b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f93870c = new a();

    private a() {
    }

    public final void a(l lVar, be beVar) {
        h.f.b.l.d(lVar, "");
        if (beVar != null) {
            e(beVar);
            ValueAnimator valueAnimator = f93868a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            View view = beVar.f91697b;
            if (view != null) {
                view.setOnClickListener(null);
            }
            a(lVar, beVar, (b) null);
        }
    }

    public static final class c implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f93875a;

        static {
            Covode.recordClassIndex(59724);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.feed.share.a.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f93876a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f93877b;

                static {
                    Covode.recordClassIndex(59725);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f93876a < this.f93877b.f93875a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f93877b.f93875a;
                    int i2 = this.f93876a;
                    this.f93876a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f93877b = r1;
                }
            };
        }

        public c(ViewGroup viewGroup) {
            this.f93875a = viewGroup;
        }
    }

    static {
        Covode.recordClassIndex(59721);
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ be f93878a;

        static {
            Covode.recordClassIndex(59726);
        }

        d(be beVar) {
            this.f93878a = beVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            a.d(this.f93878a);
        }
    }

    public static void a(be beVar) {
        if (beVar != null) {
            a(beVar, (AnimatorListenerAdapter) null);
        }
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f93879a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ be f93880b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f93881c = null;

        static {
            Covode.recordClassIndex(59727);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            a.f93870c.a(this.f93879a, this.f93880b, this.f93881c);
        }

        e(j jVar, be beVar) {
            this.f93879a = jVar;
            this.f93880b = beVar;
        }
    }

    public static final class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f93886a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ be f93887b;

        static {
            Covode.recordClassIndex(59730);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            a.a(this.f93886a, this.f93887b, (b) null);
        }

        h(n nVar, be beVar) {
            this.f93886a = nVar;
            this.f93887b = beVar;
        }
    }

    public static void b(be beVar) {
        if (beVar != null) {
            a(beVar, (AnimatorListenerAdapter) null);
            d(beVar);
        }
    }

    public static boolean b(Aweme aweme) {
        boolean z;
        IMainServiceHelper createIMainServiceHelperbyMonsterPlugin = MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
        if (createIMainServiceHelperbyMonsterPlugin != null) {
            z = createIMainServiceHelperbyMonsterPlugin.isChatFunOfflineUnder16();
        } else {
            z = true;
        }
        if (aweme == null || a(aweme) || z) {
            return true;
        }
        return false;
    }

    public static void c(be beVar) {
        if (beVar != null) {
            View view = beVar.f91697b;
            if (view != null) {
                view.setOnClickListener(null);
            }
            a(beVar, new d(beVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.share.a$a  reason: collision with other inner class name */
    public static final class C2276a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ be f93871a;

        static {
            Covode.recordClassIndex(59722);
        }

        public C2276a(be beVar) {
            this.f93871a = beVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f93871a.f91697b.getLayoutParams();
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            layoutParams.height = (int) ((Float) animatedValue).floatValue();
            this.f93871a.f91697b.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ be f93882a;

        static {
            Covode.recordClassIndex(59728);
        }

        f(be beVar) {
            this.f93882a = beVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f93882a.f91697b.getLayoutParams();
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            layoutParams.height = (int) ((Float) animatedValue).floatValue();
            this.f93882a.f91697b.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f93883a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f93884b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f93885c;

        static {
            Covode.recordClassIndex(59729);
        }

        g(View view, float f2, b bVar) {
            this.f93883a = view;
            this.f93884b = f2;
            this.f93885c = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            View view = this.f93883a;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            layoutParams.height = (int) ((Float) animatedValue).floatValue();
            View view2 = this.f93883a;
            if (view2 != null) {
                view2.requestLayout();
            }
            if (this.f93885c != null) {
                int i2 = this.f93883a.getLayoutParams().height;
            }
        }
    }

    public static final class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f93888a;

        static {
            Covode.recordClassIndex(59731);
        }

        public i(View view) {
            this.f93888a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f93888a.getLayoutParams();
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            layoutParams.height = (int) ((Float) animatedValue).floatValue();
            this.f93888a.requestLayout();
        }
    }

    private static String a(IMContact iMContact) {
        if (!(iMContact instanceof IMUser)) {
            String displayName = iMContact.getDisplayName();
            h.f.b.l.b(displayName, "");
            return displayName;
        } else if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).shouldChangeToHandle("Message")) {
            String displayId = ((IMUser) iMContact).getDisplayId();
            h.f.b.l.b(displayId, "");
            return displayId;
        } else {
            String displayName2 = iMContact.getDisplayName();
            h.f.b.l.b(displayName2, "");
            return displayName2;
        }
    }

    private static void e(be beVar) {
        if (!(beVar == null || beVar.f91701f == null)) {
            int childCount = beVar.f91701f.getChildCount();
            SparseArray<Integer> sparseArray = new SparseArray<>();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = beVar.f91701f.getChildAt(i2);
                h.f.b.l.b(childAt, "");
                sparseArray.put(childAt.getId(), Integer.valueOf(childAt.getVisibility()));
                childAt.setVisibility(8);
            }
            beVar.a(sparseArray);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f93873a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ be f93874b;

        static {
            Covode.recordClassIndex(59723);
        }

        b(j jVar, be beVar) {
            this.f93873a = jVar;
            this.f93874b = beVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            if (createIIMServicebyMonsterPlugin != null) {
                String str = "long_press";
                if (!h.f.b.l.a((Object) str, (Object) this.f93873a.f103918f)) {
                    str = "share_toast";
                }
                if (this.f93873a.f103915c) {
                    Bundle bundle = new Bundle();
                    bundle.putString("enter_from", this.f93873a.f103917e);
                    bundle.putString("enter_method", "share_toast");
                    h.f.b.l.b(view, "");
                    Context context = view.getContext();
                    h.f.b.l.b(context, "");
                    createIIMServicebyMonsterPlugin.openSessionListActivity(context, bundle);
                } else {
                    h.f.b.l.b(view, "");
                    createIIMServicebyMonsterPlugin.startChat(a.b.a(view.getContext(), this.f93873a.f103913a).c(this.f93873a.f103917e).b(str).a(6).f103883a);
                }
            }
            a.d(this.f93874b);
        }
    }

    public static void d(be beVar) {
        if (beVar != null) {
            SparseArray<Integer> sparseArray = beVar.f91702g;
            FrameLayout frameLayout = beVar.f91701f;
            if (frameLayout != null) {
                for (View view : new c(frameLayout)) {
                    if (sparseArray.get(view.getId()) != null) {
                        Integer num = sparseArray.get(view.getId());
                        h.f.b.l.b(num, "");
                        view.setVisibility(num.intValue());
                    } else {
                        com.ss.android.ugc.aweme.framework.a.a.b(4, "FeedShareHelper", "shareCompleteClick, status is null for id " + view.getId());
                    }
                }
            }
            com.ss.android.ugc.d.a.c.a(new ae());
        }
    }

    public static boolean a(Aweme aweme) {
        boolean z;
        h.f.b.l.d(aweme, "");
        com.ss.android.ugc.aweme.account.b.g().isMe(aweme.getAuthorUid());
        boolean d2 = z.d(aweme);
        if (aweme.isProhibited() || aweme.isDelete() || (aweme.isSelfSee() && aweme.isReviewed())) {
            z = true;
        } else {
            z = false;
        }
        boolean a2 = com.ss.android.ugc.aweme.login.b.a.a(aweme);
        boolean z2 = !aweme.getAwemeControl().canShare();
        boolean U = com.ss.android.ugc.aweme.commercialize.e.a.b.U(aweme);
        boolean f2 = com.ss.android.ugc.aweme.feed.x.g.f(aweme);
        if (d2 || z || a2 || z2 || U || f2) {
            return true;
        }
        return false;
    }

    private static void a(be beVar, AnimatorListenerAdapter animatorListenerAdapter) {
        ValueAnimator valueAnimator;
        if (beVar != null && beVar.f91697b != null && beVar.f91697b.getVisibility() != 8) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat((float) beVar.f91697b.getHeight(), 0.0f);
            f93868a = ofFloat;
            if (ofFloat != null) {
                ofFloat.addUpdateListener(new f(beVar));
            }
            if (!(animatorListenerAdapter == null || (valueAnimator = f93868a) == null)) {
                valueAnimator.addListener(animatorListenerAdapter);
            }
            ValueAnimator valueAnimator2 = f93868a;
            if (valueAnimator2 != null) {
                valueAnimator2.setDuration(300L);
            }
            ValueAnimator valueAnimator3 = f93868a;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        }
    }

    public static void a(j jVar, be beVar) {
        String str;
        ValueAnimator valueAnimator;
        h.f.b.l.d(jVar, "");
        if (TextUtils.equals("aweme", jVar.f103916d)) {
            IMService.createIIMServicebyMonsterPlugin(false).cacheRecentShareContact(jVar.f103913a);
        }
        String str2 = jVar.f103921i;
        if (str2 == null || str2.length() == 0) {
            e(beVar);
        }
        ValueAnimator valueAnimator2 = f93868a;
        if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (str = jVar.f103921i) == null || str.length() == 0 || (valueAnimator = f93868a) == null)) {
            valueAnimator.addListener(new e(jVar, beVar));
            if (h.z.f158842a != null) {
                return;
            }
        }
        f93870c.a(jVar, beVar, (b) null);
    }

    public static void a(n nVar, be beVar) {
        ValueAnimator valueAnimator;
        h.f.b.l.d(nVar, "");
        if (beVar != null) {
            View view = beVar.f91697b;
            if (view != null) {
                view.setOnClickListener(null);
            }
            ValueAnimator valueAnimator2 = f93868a;
            if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = f93868a) == null)) {
                valueAnimator.addListener(new h(nVar, beVar));
                if (h.z.f158842a != null) {
                    return;
                }
            }
            a(nVar, beVar, (b) null);
        }
    }

    private static void a(Object obj, be beVar) {
        IMContact iMContact;
        String string;
        String string2;
        Resources resources = com.bytedance.ies.ugc.appcontext.d.a().getResources();
        int i2 = 8;
        if (obj instanceof l) {
            TuxIconView tuxIconView = beVar.f91699d;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
            TextView textView = beVar.f91700e;
            if (textView != null) {
                if (((l) obj).f103927d instanceof IMUser) {
                    i2 = 0;
                }
                textView.setVisibility(i2);
            }
            TuxTextView tuxTextView = beVar.f91696a;
            if (tuxTextView != null) {
                l lVar = (l) obj;
                if (lVar.f103928e) {
                    string2 = resources.getString(R.string.fl9, lVar.f103927d.getDisplayName());
                } else {
                    string2 = resources.getString(R.string.fl8, lVar.f103927d.getDisplayName());
                }
                tuxTextView.setText(string2);
            }
            TuxIconView tuxIconView2 = beVar.f91698c;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_paperplane_fill);
            }
        } else if (obj instanceof j) {
            j jVar = (j) obj;
            List<IMContact> list = jVar.f103914b;
            if (list == null || (iMContact = (IMContact) h.a.n.h((List) list)) == null) {
                iMContact = jVar.f103913a;
            }
            TuxTextView tuxTextView2 = beVar.f91696a;
            if (tuxTextView2 != null) {
                if (jVar.f103915c) {
                    h.f.b.l.b(iMContact, "");
                    string = resources.getString(R.string.ca3, a(iMContact));
                } else if (!(jVar.f103913a instanceof IMConversation) || !jVar.f103920h) {
                    h.f.b.l.b(iMContact, "");
                    string = resources.getString(R.string.ca2, a(iMContact));
                } else {
                    string = resources.getString(R.string.c79);
                }
                tuxTextView2.setText(string);
            }
            TuxIconView tuxIconView3 = beVar.f91699d;
            if (tuxIconView3 != null) {
                tuxIconView3.setVisibility(0);
            }
            TextView textView2 = beVar.f91700e;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TuxIconView tuxIconView4 = beVar.f91698c;
            if (tuxIconView4 != null) {
                tuxIconView4.setIconRes(R.raw.icon_tick_cirlce_fill);
            }
        } else if (obj instanceof n) {
            TuxIconView tuxIconView5 = beVar.f91699d;
            if (tuxIconView5 != null) {
                tuxIconView5.setVisibility(8);
            }
            TextView textView3 = beVar.f91700e;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TuxTextView tuxTextView3 = beVar.f91696a;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.brb));
            }
            TuxIconView tuxIconView6 = beVar.f91698c;
            if (tuxIconView6 != null) {
                tuxIconView6.setIconRes(R.raw.icon_exclamation_mark_circle_fill);
            }
        }
    }

    public final void a(j jVar, be beVar, b bVar) {
        if (beVar != null) {
            View view = beVar.f91697b;
            if (view != null) {
                view.setOnClickListener(new b(jVar, beVar));
            }
            a((Object) jVar, beVar, bVar);
        }
    }

    static void a(Object obj, be beVar, b bVar) {
        a(obj, beVar);
        float b2 = com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), 32.0f);
        View view = beVar.f91697b;
        if (view != null) {
            view.getLayoutParams().height = 0;
            view.requestLayout();
            view.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, b2);
            ofFloat.addUpdateListener(new g(view, b2, bVar));
            h.f.b.l.b(ofFloat, "");
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }
}

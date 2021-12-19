package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.TabFragmentNode;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.bz;
import com.ss.android.ugc.aweme.feed.i.o;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class FollowTab extends TabFragmentNode implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: b  reason: collision with root package name */
    public View f94091b;

    /* renamed from: c  reason: collision with root package name */
    public ViewStub f94092c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f94093d;

    /* renamed from: j  reason: collision with root package name */
    public ViewStub f94094j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f94095k;

    /* renamed from: l  reason: collision with root package name */
    public ViewGroup f94096l;

    /* renamed from: m  reason: collision with root package name */
    public ViewStub f94097m;
    public View n;
    public ViewStub o;
    public final Context p;
    private List<? extends CircleImageView> q;
    private View r;
    private final Map<Integer, com.ss.android.ugc.aweme.notice.api.bean.i> s = new LinkedHashMap();
    private com.ss.android.ugc.aweme.notice.api.bean.i t;
    private final Handler u = new Handler(Looper.getMainLooper());
    private final Runnable v = new i(this);

    static {
        Covode.recordClassIndex(59811);
    }

    private static String b(int i2) {
        switch (i2) {
            case 38:
                return "live";
            case 39:
                return "head";
            case 40:
                return "dot";
            case 41:
                return "number";
            default:
                return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.by, com.ss.android.ugc.aweme.TabFragmentNode
    public final int a() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.by, com.bytedance.hox.d
    public final String d() {
        return "Following";
    }

    @Override // com.bytedance.hox.d
    public final String e() {
        return "homepage_follow";
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(57, new org.greenrobot.eventbus.g(FollowTab.class, "onNoticeFollowingTabInfo", com.ss.android.ugc.aweme.notice.api.bean.i.class, ThreadMode.MAIN, 0, false));
        hashMap.put(58, new org.greenrobot.eventbus.g(FollowTab.class, "onFollowFeedHideRedDotEvent", o.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.hox.d
    public final Class<? extends Fragment> f() {
        return p.class;
    }

    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FollowTab f94107a;

        static {
            Covode.recordClassIndex(59820);
        }

        i(FollowTab followTab) {
            this.f94107a = followTab;
        }

        public final void run() {
            this.f94107a.a(false);
            this.f94107a.k();
        }
    }

    @Override // com.ss.android.ugc.aweme.by, com.ss.android.ugc.aweme.TabFragmentNode
    public final void i() {
        a(true);
        k();
        com.ss.android.ugc.aweme.ad.feed.a.b.f65742b = true;
    }

    public final String l() {
        com.ss.android.ugc.aweme.notice.api.bean.i iVar = this.t;
        if (iVar != null) {
            return b(iVar.f112688a);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FollowTab f94103a;

        static {
            Covode.recordClassIndex(59816);
        }

        e(FollowTab followTab) {
            this.f94103a = followTab;
        }

        public final void run() {
            View view;
            MethodCollector.i(11043);
            FollowTab followTab = this.f94103a;
            ViewStub viewStub = followTab.f94094j;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            followTab.f94093d = (TextView) view;
            this.f94103a.f94094j = null;
            MethodCollector.o(11043);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FollowTab f94104a;

        static {
            Covode.recordClassIndex(59817);
        }

        f(FollowTab followTab) {
            this.f94104a = followTab;
        }

        public final void run() {
            View view;
            MethodCollector.i(11041);
            FollowTab followTab = this.f94104a;
            ViewStub viewStub = followTab.f94092c;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            followTab.f94091b = view;
            this.f94104a.f94092c = null;
            MethodCollector.o(11041);
        }
    }

    private final void m() {
        if (this.f94091b == null && this.f94092c != null) {
            com.ss.android.ugc.aweme.s.b.a(new f(this));
        }
    }

    private final void n() {
        if (this.f94093d == null && this.f94094j != null) {
            com.ss.android.ugc.aweme.s.b.a(new e(this));
        }
    }

    private final void o() {
        if (this.f94096l == null && this.f94097m != null) {
            com.ss.android.ugc.aweme.s.b.a(new h(this));
        }
    }

    private final void p() {
        if (this.n == null && this.o != null) {
            com.ss.android.ugc.aweme.s.b.a(new g(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.by
    public final String U_() {
        Resources resources;
        Context context = this.p;
        if (context != null) {
            resources = context.getResources();
        } else {
            resources = null;
        }
        String string = resources.getString(R.string.gk2);
        if (string == null) {
            return "";
        }
        return string;
    }

    @Override // com.bytedance.hox.d
    public final Bundle g() {
        Bundle bundle = new Bundle(2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 1);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_follow");
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.by, com.ss.android.ugc.aweme.TabFragmentNode
    public final void h() {
        com.ss.android.ugc.aweme.notice.api.bean.i iVar = this.t;
        if (iVar != null) {
            a(iVar, "click");
        }
        SpecActServiceImpl.i().a("Follow");
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FollowTab f94105a;

        static {
            Covode.recordClassIndex(59818);
        }

        g(FollowTab followTab) {
            this.f94105a = followTab;
        }

        public final void run() {
            View view;
            MethodCollector.i(7156);
            FollowTab followTab = this.f94105a;
            ViewStub viewStub = followTab.o;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            followTab.n = view;
            this.f94105a.b();
            this.f94105a.o = null;
            MethodCollector.o(7156);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FollowTab f94106a;

        static {
            Covode.recordClassIndex(59819);
        }

        h(FollowTab followTab) {
            this.f94106a = followTab;
        }

        public final void run() {
            View view;
            MethodCollector.i(10546);
            FollowTab followTab = this.f94106a;
            ViewStub viewStub = followTab.f94097m;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            followTab.f94096l = (ViewGroup) view;
            this.f94106a.j();
            this.f94106a.f94097m = null;
            MethodCollector.o(10546);
        }
    }

    public final void b() {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        View view = this.n;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
        }
        View view2 = this.n;
        if (view2 != null) {
            i2 = view2.getMeasuredWidth();
        } else {
            i2 = 0;
        }
        View view3 = this.n;
        if (view3 != null) {
            layoutParams = view3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            int i3 = Build.VERSION.SDK_INT;
            ((LinearLayout.LayoutParams) layoutParams).setMarginStart(-i2);
        }
    }

    public final void j() {
        ViewGroup viewGroup = this.f94096l;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.f94096l;
        if (viewGroup2 != null) {
            List<Number> b2 = n.b(Integer.valueOf((int) R.id.bvu), Integer.valueOf((int) R.id.bvv), Integer.valueOf((int) R.id.bvw));
            ArrayList arrayList = new ArrayList(n.a((Iterable) b2, 10));
            for (Number number : b2) {
                arrayList.add(viewGroup2.findViewById(number.intValue()));
            }
            ArrayList<CircleImageView> arrayList2 = arrayList;
            this.q = arrayList2;
            if (arrayList2 != null) {
                for (CircleImageView circleImageView : arrayList2) {
                    circleImageView.setVisibility(8);
                }
            }
        }
    }

    public final void k() {
        Object obj;
        String valueOf;
        Iterator it = n.a((Iterable) this.s.values(), (Comparator) new j()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.ss.android.ugc.aweme.notice.api.bean.i iVar = (com.ss.android.ugc.aweme.notice.api.bean.i) obj;
            if (c(iVar.f112688a)) {
                if (com.ss.android.ugc.aweme.notice.api.b.c(iVar.f112688a)) {
                    break;
                }
            }
        }
        com.ss.android.ugc.aweme.notice.api.bean.i iVar2 = (com.ss.android.ugc.aweme.notice.api.bean.i) obj;
        if (iVar2 != null) {
            int i2 = iVar2.f112688a;
            com.ss.android.ugc.aweme.notice.api.bean.i iVar3 = this.t;
            if (iVar3 == null || i2 != iVar3.f112688a) {
                a(iVar2, "show");
                this.t = iVar2;
                this.u.removeCallbacks(this.v);
                switch (iVar2.f112688a) {
                    case 38:
                        a(iVar2.f112688a);
                        this.u.postDelayed(this.v, 120000);
                        return;
                    case 39:
                        a(-1);
                        a(iVar2.f112690c);
                        return;
                    case 40:
                        a(iVar2.f112688a);
                        return;
                    case 41:
                        int a2 = com.ss.android.ugc.aweme.notice.api.b.a(iVar2.f112688a);
                        if (a2 > 0) {
                            TextView textView = this.f94093d;
                            if (textView != null) {
                                if (a2 > 99) {
                                    valueOf = "99+";
                                } else {
                                    valueOf = String.valueOf(a2);
                                }
                                textView.setText(valueOf);
                            }
                            a(iVar2.f112688a);
                            return;
                        }
                        a(40);
                        return;
                    default:
                        return;
                }
            }
        } else if (this.t != null) {
            a(true);
        }
    }

    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FollowTab f94098a;

        static {
            Covode.recordClassIndex(59812);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(FollowTab followTab) {
            this.f94098a = followTab;
        }

        public final void onViewAttachedToWindow(View view) {
            EventBus.a(EventBus.a(), this.f94098a);
        }

        public final void onViewDetachedFromWindow(View view) {
            EventBus.a().b(this.f94098a);
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onFollowFeedHideRedDotEvent(o oVar) {
        a(true);
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FollowTab f94099a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f94100b;

        static {
            Covode.recordClassIndex(59813);
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            ViewGroup viewGroup = this.f94099a.f94096l;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            TextView textView = this.f94099a.f94095k;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }

        b(FollowTab followTab, List list) {
            this.f94099a = followTab;
            this.f94100b = list;
        }
    }

    private static void a(View view) {
        if (com.bytedance.ies.abmock.b.a().a(true, "following_red_dot_reverse", false)) {
            if (view != null) {
                view.setBackgroundResource(R.drawable.a_t);
            }
        } else if (view != null) {
            view.setBackgroundResource(R.drawable.a_q);
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onNoticeFollowingTabInfo(com.ss.android.ugc.aweme.notice.api.bean.i iVar) {
        l.d(iVar, "");
        this.s.put(Integer.valueOf(iVar.f112688a), iVar);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CircleImageView f94101a;

        static {
            Covode.recordClassIndex(59814);
        }

        c(CircleImageView circleImageView) {
            this.f94101a = circleImageView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f94101a.setTranslationY(100.0f * floatValue);
            this.f94101a.setAlpha(1.0f - floatValue);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CircleImageView f94102a;

        static {
            Covode.recordClassIndex(59815);
        }

        d(CircleImageView circleImageView) {
            this.f94102a = circleImageView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f94102a.setVisibility(0);
            this.f94102a.setTranslationY(50.0f * floatValue);
            this.f94102a.setAlpha(1.0f - floatValue);
        }
    }

    public FollowTab(Context context) {
        l.d(context, "");
        this.p = context;
    }

    private static boolean c(int i2) {
        if (i2 != 38) {
            if ((i2 == 40 || i2 == 41) && com.ss.android.ugc.aweme.main.experiment.b.a() == 2) {
                return false;
            }
        } else if (com.bytedance.ies.abmock.b.a().a(true, "i18n_following_live_skylight_type", 0) == 0) {
            return false;
        }
        return true;
    }

    private final void a(int i2) {
        boolean z;
        boolean z2;
        if (com.ss.android.ugc.aweme.s.e.e()) {
            if (i2 == 40) {
                m();
                a(this.f94093d);
            } else if (i2 == 41) {
                n();
            } else if (i2 == 38) {
                p();
            }
        }
        View view = this.f94091b;
        boolean z3 = true;
        if (view != null) {
            if (i2 == 40) {
                z2 = true;
            } else {
                z2 = false;
            }
            k.a(view, z2);
        }
        TextView textView = this.f94093d;
        if (textView != null) {
            if (i2 == 41) {
                z = true;
            } else {
                z = false;
            }
            k.a(textView, z);
        }
        View view2 = this.n;
        if (view2 != null) {
            if (i2 != 38) {
                z3 = false;
            }
            k.a(view2, z3);
        }
    }

    private void a(List<? extends User> list) {
        if (list != null) {
            int size = list.size();
            if (com.ss.android.ugc.aweme.s.e.e()) {
                o();
            }
            List<? extends CircleImageView> list2 = this.q;
            int i2 = 0;
            if (list2 != null) {
                int i3 = 0;
                for (T t2 : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        n.a();
                    }
                    T t3 = t2;
                    if (i3 < size) {
                        com.ss.android.ugc.aweme.base.e.a(t3, ((User) list.get(i3)).getAvatarThumb());
                        t3.setVisibility(4);
                    } else {
                        t3.setVisibility(8);
                    }
                    i3 = i4;
                }
            }
            TextView textView = this.f94095k;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ViewGroup viewGroup = this.f94096l;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            List<? extends CircleImageView> list3 = this.q;
            if (list3 != null) {
                for (T t4 : list3) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        n.a();
                    }
                    T t5 = t4;
                    if (i2 < size) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        l.b(ofFloat, "");
                        ofFloat.setDuration(400L);
                        ofFloat.setStartDelay(((long) i2) * 30);
                        ofFloat.addUpdateListener(new d(t5));
                        arrayList.add(ofFloat);
                    }
                    i2 = i5;
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.by
    public final View a(bz bzVar) {
        TextView textView;
        View view;
        TextView textView2;
        ViewGroup viewGroup;
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        l.d(bzVar, "");
        if (com.ss.android.ugc.aweme.s.e.e()) {
            Context context = this.p;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            this.r = com.a.b.c.a((Activity) context, (int) R.layout.a45);
        } else {
            Context context2 = this.p;
            Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
            this.r = com.a.b.c.a((Activity) context2, (int) R.layout.a44);
        }
        View view2 = this.r;
        if (view2 != null) {
            view2.addOnAttachStateChangeListener(new a(this));
        }
        View view3 = this.r;
        View view4 = null;
        ViewStub viewStub4 = null;
        if (view3 != null) {
            textView = (TextView) view3.findViewById(16908308);
        } else {
            textView = null;
        }
        this.f94095k = textView;
        if (textView != null) {
            textView.setText(U_());
        }
        if (com.ss.android.ugc.aweme.s.e.e()) {
            View view5 = this.r;
            if (view5 != null) {
                viewStub = (ViewStub) view5.findViewById(R.id.f8u);
            } else {
                viewStub = null;
            }
            this.f94092c = viewStub;
            View view6 = this.r;
            if (view6 != null) {
                viewStub2 = (ViewStub) view6.findViewById(R.id.f8s);
            } else {
                viewStub2 = null;
            }
            this.f94094j = viewStub2;
            View view7 = this.r;
            if (view7 != null) {
                viewStub3 = (ViewStub) view7.findViewById(R.id.b8l);
            } else {
                viewStub3 = null;
            }
            this.f94097m = viewStub3;
            View view8 = this.r;
            if (view8 != null) {
                viewStub4 = (ViewStub) view8.findViewById(R.id.f8t);
            }
            this.o = viewStub4;
        } else {
            View view9 = this.r;
            if (view9 != null) {
                view = view9.findViewById(R.id.f8q);
            } else {
                view = null;
            }
            this.f94091b = view;
            View view10 = this.r;
            if (view10 != null) {
                textView2 = (TextView) view10.findViewById(R.id.f8r);
            } else {
                textView2 = null;
            }
            this.f94093d = textView2;
            View view11 = this.r;
            if (view11 != null) {
                viewGroup = (ViewGroup) view11.findViewById(R.id.b8k);
            } else {
                viewGroup = null;
            }
            this.f94096l = viewGroup;
            j();
            View view12 = this.r;
            if (view12 != null) {
                view4 = view12.findViewById(R.id.ce8);
            }
            this.n = view4;
            b();
        }
        a(-1);
        if (!com.ss.android.ugc.aweme.s.e.e()) {
            a(this.f94091b);
        }
        TextView textView3 = this.f94095k;
        if (textView3 != null) {
            textView3.setShadowLayer(com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), 2.0f), 0.0f, com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), 2.0f), Color.parseColor("#26000000"));
        }
        View view13 = this.r;
        if (view13 == null) {
            l.b();
        }
        return view13;
    }

    public final void a(boolean z) {
        List<? extends CircleImageView> list;
        int i2;
        com.ss.android.ugc.aweme.notice.api.bean.i iVar = this.t;
        if (iVar != null) {
            int i3 = iVar.f112688a;
            a(-1);
            if (i3 == 39) {
                if (com.ss.android.ugc.aweme.s.e.e()) {
                    o();
                }
                ViewGroup viewGroup = this.f94096l;
                if (!(viewGroup == null || viewGroup.getVisibility() != 0 || (list = this.q) == null)) {
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                            if (it.next().getVisibility() == 0 && (i2 = i2 + 1) < 0) {
                                n.b();
                            }
                        }
                    } else {
                        i2 = 0;
                    }
                    ArrayList arrayList = new ArrayList();
                    List<? extends CircleImageView> list2 = this.q;
                    if (list2 != null) {
                        int i4 = 0;
                        for (T t2 : list2) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                n.a();
                            }
                            T t3 = t2;
                            if (i4 < i2) {
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                l.b(ofFloat, "");
                                ofFloat.setDuration(400L);
                                ofFloat.setStartDelay(((long) ((i2 - i4) - 1)) * 30);
                                ofFloat.addUpdateListener(new c(t3));
                                arrayList.add(ofFloat);
                            }
                            i4 = i5;
                        }
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.addListener(new b(this, arrayList));
                    animatorSet.playTogether(arrayList);
                    animatorSet.start();
                }
            }
            if (z) {
                com.ss.android.ugc.aweme.notice.api.b.d(38);
                com.ss.android.ugc.aweme.notice.api.b.d(39);
                com.ss.android.ugc.aweme.notice.api.b.d(40);
                com.ss.android.ugc.aweme.notice.api.b.d(41);
            } else {
                com.ss.android.ugc.aweme.notice.api.b.d(i3);
            }
            this.t = null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends m implements h.f.a.m<View, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f94108a = new k();

        static {
            Covode.recordClassIndex(59822);
        }

        k() {
            super(2);
        }

        public static void a(View view, boolean z) {
            int i2;
            l.d(view, "");
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(View view, Boolean bool) {
            a(view, bool.booleanValue());
            return z.f158842a;
        }
    }

    public static final class j<T> implements Comparator {
        static {
            Covode.recordClassIndex(59821);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t2.f112689b), Integer.valueOf(t.f112689b));
        }
    }

    private static void a(com.ss.android.ugc.aweme.notice.api.bean.i iVar, String str) {
        User user;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("notice_type", b(iVar.f112688a)).a("action_type", str);
        List<User> list = iVar.f112690c;
        if (!(list == null || (user = (User) n.h((List) list)) == null)) {
            a2.a("to_user_id", user.getUid());
        }
        if (iVar.f112688a == 41) {
            a2.a("number_cnt", com.ss.android.ugc.aweme.notice.api.b.a(iVar.f112688a));
        }
        com.ss.android.ugc.aweme.common.r.a("homepage_follow_notice", a2.f66730a);
    }
}

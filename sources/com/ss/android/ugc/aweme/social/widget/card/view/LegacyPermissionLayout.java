package com.ss.android.ugc.aweme.social.widget.card.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.widget.card.a.i;
import com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell;
import com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM;
import com.ss.android.ugc.aweme.utils.in;
import h.a.am;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.p;
import h.v;
import h.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class LegacyPermissionLayout extends LinearLayout implements k {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.social.widget.a f133932a;

    /* renamed from: b  reason: collision with root package name */
    public final i f133933b;

    /* renamed from: c  reason: collision with root package name */
    private final h f133934c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<com.ss.android.ugc.aweme.social.widget.card.permission.c, View> f133935d;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup.LayoutParams f133936e;

    /* renamed from: f  reason: collision with root package name */
    private final int f133937f;

    static {
        Covode.recordClassIndex(87628);
    }

    public final SocialCardVM getSocialCardVM() {
        return (SocialCardVM) this.f133934c.getValue();
    }

    public static final class c implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f133942a;

        static {
            Covode.recordClassIndex(87633);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.social.widget.card.view.LegacyPermissionLayout.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f133943a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f133944b;

                static {
                    Covode.recordClassIndex(87634);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f133943a < this.f133944b.f133942a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f133944b.f133942a;
                    int i2 = this.f133943a;
                    this.f133943a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f133944b = r1;
                }
            };
        }

        public c(ViewGroup viewGroup) {
            this.f133942a = viewGroup;
        }
    }

    static final class d extends m implements h.f.a.a<SocialCardVM> {
        final /* synthetic */ LegacyPermissionLayout this$0;

        static {
            Covode.recordClassIndex(87635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LegacyPermissionLayout legacyPermissionLayout) {
            super(0);
            this.this$0 = legacyPermissionLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SocialCardVM invoke() {
            ac a2 = new ad(this.this$0.f133932a, new com.ss.android.ugc.aweme.social.widget.card.rec.vm.a(this.this$0.f133933b)).a(SocialCardVM.class);
            l.b(a2, "");
            return a2;
        }
    }

    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f133936e = layoutParams;
    }

    public static final class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LegacyPermissionLayout f133949a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f133950b;

        static {
            Covode.recordClassIndex(87637);
        }

        public final void onAnimationCancel(Animator animator) {
            View view = (View) this.f133950b.get();
            if (view != null) {
                this.f133949a.removeView(view);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            View view = (View) this.f133950b.get();
            if (view != null) {
                this.f133949a.removeView(view);
            }
        }

        f(LegacyPermissionLayout legacyPermissionLayout, WeakReference weakReference) {
            this.f133949a = legacyPermissionLayout;
            this.f133950b = weakReference;
        }
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LegacyPermissionLayout f133938a;

        static {
            Covode.recordClassIndex(87629);
        }

        a(LegacyPermissionLayout legacyPermissionLayout) {
            this.f133938a = legacyPermissionLayout;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    if (t instanceof com.ss.android.ugc.aweme.social.widget.card.permission.c) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (this.f133938a.getChildCount() == 0) {
                    this.f133938a.setUpInitialData(arrayList2);
                } else {
                    this.f133938a.a(arrayList2);
                }
            }
        }
    }

    public final void removeView(View view) {
        View childAt;
        MethodCollector.i(13288);
        int indexOfChild = indexOfChild(view) - 1;
        int childCount = getChildCount();
        if (indexOfChild >= 0 && childCount > indexOfChild && (childAt = getChildAt(indexOfChild)) != null) {
            com.bytedance.tux.h.i.b(childAt, null, null, 0, null, false, 27);
        }
        super.removeView(view);
        if (getChildCount() == 0) {
            setVisibility(8);
        }
        MethodCollector.o(13288);
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LegacyPermissionLayout f133939a;

        static {
            Covode.recordClassIndex(87630);
        }

        b(LegacyPermissionLayout legacyPermissionLayout) {
            this.f133939a = legacyPermissionLayout;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Context context = this.f133939a.getContext();
            l.b(context, "");
            Class<? extends com.ss.android.ugc.aweme.ufr.a> a2 = com.ss.android.ugc.aweme.social.widget.card.e.a(((com.ss.android.ugc.aweme.social.widget.card.permission.c) obj).f133825a);
            User c2 = in.c();
            l.b(c2, "");
            String uid = c2.getUid();
            String str = this.f133939a.f133933b.f133753d.get("enter_from");
            if (str == null) {
                str = "";
            }
            f.a.b.b a3 = com.ss.android.ugc.aweme.ufr.b.a(context, a2, uid, str, "click", true, false, null).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(AnonymousClass1.f133940a, AnonymousClass2.f133941a);
            l.b(a3, "");
            f.a.j.a.a(a3, this.f133939a.getSocialCardVM().f133910b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LegacyPermissionLayout f133945a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f133946b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f133947c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f133948d;

        static {
            Covode.recordClassIndex(87636);
        }

        e(LegacyPermissionLayout legacyPermissionLayout, WeakReference weakReference, int i2, int i3) {
            this.f133945a = legacyPermissionLayout;
            this.f133946b = weakReference;
            this.f133947c = i2;
            this.f133948d = i3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View view = (View) this.f133946b.get();
            if (this.f133945a.getOrientation() == 0) {
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = (int) (floatValue * ((float) this.f133947c));
                        view.setLayoutParams(layoutParams);
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
            } else if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = (int) (floatValue * ((float) this.f133948d));
                    view.setLayoutParams(layoutParams2);
                    return;
                }
                throw new w("null cannot be cast to non-null type");
            }
        }
    }

    public final void a(List<? extends com.ss.android.ugc.aweme.social.widget.card.permission.c> list) {
        for (Object obj : am.a(this.f133935d.keySet(), list)) {
            View remove = this.f133935d.remove(obj);
            if (remove != null) {
                int width = remove.getWidth();
                int height = remove.getHeight();
                ObjectAnimator duration = ObjectAnimator.ofFloat(remove, "alpha", 1.0f, 0.0f).setDuration(120L);
                l.b(duration, "");
                ValueAnimator duration2 = ObjectAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                WeakReference weakReference = new WeakReference(remove);
                duration2.addUpdateListener(new e(this, weakReference, width, height));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(duration).with(duration2);
                animatorSet.addListener(new f(this, weakReference));
                animatorSet.start();
            }
        }
    }

    public final void setUpInitialData(List<? extends com.ss.android.ugc.aweme.social.widget.card.permission.c> list) {
        int i2 = getLayoutParams().height;
        int i3 = 0;
        for (T t : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                n.a();
            }
            T t2 = t;
            PermissionCell permissionCell = (PermissionCell) com.ss.android.ugc.aweme.social.widget.card.e.a(t2.f133825a, t2.a()).newInstance();
            if (permissionCell instanceof PermissionCell) {
                permissionCell.f133809a = getSocialCardVM();
                View a2 = permissionCell.a((ViewGroup) this);
                if (t2.a() == com.ss.android.ugc.aweme.social.widget.card.a.a.SQUARE && i3 != list.size() - 1) {
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    com.bytedance.tux.h.i.b(a2, null, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()))), null, false, 27);
                }
                permissionCell.b((Object) t2);
                this.f133935d.put(t2, a2);
                addView(a2);
                i2 = a2.getLayoutParams().height;
            }
            i3 = i4;
        }
        if (this.f133936e != null) {
            for (View view : new c(this)) {
                ViewGroup.LayoutParams layoutParams = this.f133936e;
                p pVar = null;
                Integer num = null;
                if (layoutParams != null) {
                    Integer valueOf = layoutParams.width > 0 ? Integer.valueOf(layoutParams.width) : null;
                    if (layoutParams.height > 0) {
                        num = Integer.valueOf(layoutParams.height);
                    }
                    pVar = v.a(valueOf, num);
                }
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    if (pVar != null) {
                        Integer num2 = (Integer) pVar.getFirst();
                        if (num2 != null) {
                            layoutParams2.width = num2.intValue();
                        }
                        Integer num3 = (Integer) pVar.getSecond();
                        if (num3 != null) {
                            layoutParams2.height = num3.intValue();
                        }
                    }
                    view.setLayoutParams(layoutParams2);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.height = i2;
            setLayoutParams(layoutParams3);
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        l.d(mVar, "");
        l.d(aVar, "");
        if (aVar == i.a.ON_DESTROY) {
            this.f133932a.getLifecycle().b(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LegacyPermissionLayout(com.ss.android.ugc.aweme.social.widget.a aVar, com.ss.android.ugc.aweme.social.widget.card.a.i iVar, int i2) {
        super(aVar.f133712a, null, 0);
        ViewGroup.LayoutParams layoutParams;
        l.d(aVar, "");
        l.d(iVar, "");
        MethodCollector.i(13362);
        this.f133932a = aVar;
        this.f133933b = iVar;
        this.f133937f = i2;
        this.f133934c = h.i.a((h.f.a.a) new d(this));
        this.f133935d = new LinkedHashMap();
        setOrientation(i2);
        if (getOrientation() == 1) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        } else {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        setLayoutParams(layoutParams);
        setOrientation(i2);
        aVar.getLifecycle().a(this);
        getSocialCardVM().f133921m.observe(aVar, new a(this));
        getSocialCardVM().t.observe(aVar, new b(this));
        MethodCollector.o(13362);
    }

    public /* synthetic */ LegacyPermissionLayout(com.ss.android.ugc.aweme.social.widget.a aVar, com.ss.android.ugc.aweme.social.widget.card.a.i iVar, int i2, byte b2) {
        this(aVar, iVar, i2);
    }
}

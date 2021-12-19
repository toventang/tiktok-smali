package com.bytedance.android.live.liveinteract.match.ui.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.android.livesdk.model.message.b.o;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class BattleMvpContainerLayout extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f10865f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f10866g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.b<? super Boolean, z> f10867a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f10868b;

    /* renamed from: c  reason: collision with root package name */
    public b f10869c;

    /* renamed from: d  reason: collision with root package name */
    public final List<b> f10870d;

    /* renamed from: e  reason: collision with root package name */
    public final List<b> f10871e;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<Integer> f10872h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<Integer> f10873i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f10874j;

    /* renamed from: k  reason: collision with root package name */
    private HashMap f10875k;

    public BattleMvpContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View a(int i2) {
        if (this.f10875k == null) {
            this.f10875k = new HashMap();
        }
        View view = (View) this.f10875k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f10875k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final HSImageView getMMvpImageView() {
        return (HSImageView) this.f10874j.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5814);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class j extends m implements h.f.a.a<z> {
        final /* synthetic */ BattleMvpContainerLayout this$0;

        static {
            Covode.recordClassIndex(5823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(BattleMvpContainerLayout battleMvpContainerLayout) {
            super(0);
            this.this$0 = battleMvpContainerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            AnimatorSet animatorSet = this.this$0.f10868b;
            if (animatorSet != null && animatorSet.isRunning()) {
                AnimatorSet animatorSet2 = this.this$0.f10868b;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                }
                AnimatorSet animatorSet3 = this.this$0.f10868b;
                if (animatorSet3 != null) {
                    animatorSet3.end();
                }
            }
        }
    }

    public final void b() {
        a(true, null);
    }

    public final void c() {
        a(false, null);
    }

    static final class c extends m implements h.f.a.a<HSImageView> {
        final /* synthetic */ BattleMvpContainerLayout this$0;

        static {
            Covode.recordClassIndex(5816);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(BattleMvpContainerLayout battleMvpContainerLayout) {
            super(0);
            this.this$0 = battleMvpContainerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HSImageView invoke() {
            return this.this$0.findViewById(R.id.bub);
        }
    }

    static final class i extends m implements h.f.a.a<AnimatorSet> {
        final /* synthetic */ e $generateScaleAnimation$1;

        static {
            Covode.recordClassIndex(5822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar) {
            super(0);
            this.$generateScaleAnimation$1 = eVar;
        }

        /* renamed from: a */
        public final AnimatorSet invoke() {
            return this.$generateScaleAnimation$1.a(0.8f, 1.0f, 160);
        }
    }

    static {
        Covode.recordClassIndex(5811);
        boolean z = false;
        if (EnableBattleUiNewStyleSetting.INSTANCE.getValue() > 0) {
            z = true;
        }
        f10865f = z;
    }

    static final class g extends m implements h.f.a.a<AnimatorSet> {
        final /* synthetic */ e $generateScaleAnimation$1;
        final /* synthetic */ f $generateTranslationAnimation$2;

        static {
            Covode.recordClassIndex(5820);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar, e eVar) {
            super(0);
            this.$generateTranslationAnimation$2 = fVar;
            this.$generateScaleAnimation$1 = eVar;
        }

        /* renamed from: a */
        public final AnimatorSet invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(this.$generateTranslationAnimation$2.a(0.0f, 0.0f, 0), this.$generateScaleAnimation$1.a(0.0f, 4.0f, 200), this.$generateScaleAnimation$1.a(4.0f, 3.0f, 160), this.$generateScaleAnimation$1.a(3.0f, 3.5f, 120), this.$generateScaleAnimation$1.a(3.5f, 3.5f, 360));
            return animatorSet;
        }
    }

    public final void a() {
        MethodCollector.i(7143);
        ((LinearLayout) a(R.id.c69)).removeAllViews();
        ((LinearLayout) a(R.id.c7l)).removeAllViews();
        b bVar = this.f10869c;
        if (bVar != null) {
            bVar.a(false);
        }
        this.f10869c = null;
        this.f10870d.clear();
        this.f10871e.clear();
        MethodCollector.o(7143);
    }

    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BattleMvpContainerLayout f10885a;

        static {
            Covode.recordClassIndex(5817);
        }

        public d(BattleMvpContainerLayout battleMvpContainerLayout) {
            this.f10885a = battleMvpContainerLayout;
        }

        public final void run() {
            View view;
            b bVar = this.f10885a.f10869c;
            if (bVar != null && (view = bVar.f10884g) != null && view.findViewById(R.id.c2s) != null) {
                this.f10885a.getMMvpImageView().setVisibility(0);
                k.a(this.f10885a.getMMvpImageView(), "tiktok_live_interaction_resource", "ttlive_pk_army_mvp.png");
                BattleMvpContainerLayout battleMvpContainerLayout = this.f10885a;
                b bVar2 = battleMvpContainerLayout.f10869c;
                if (bVar2 == null) {
                    l.b();
                }
                View findViewById = bVar2.f10884g.findViewById(R.id.c2s);
                l.b(findViewById, "");
                e eVar = new e(battleMvpContainerLayout);
                f fVar = new f(battleMvpContainerLayout);
                g gVar = new g(fVar, eVar);
                h hVar = new h(battleMvpContainerLayout, fVar, eVar);
                i iVar = new i(eVar);
                new j(battleMvpContainerLayout).a();
                battleMvpContainerLayout.f10868b = new AnimatorSet();
                AnimatorSet animatorSet = battleMvpContainerLayout.f10868b;
                if (animatorSet != null) {
                    animatorSet.playSequentially(gVar.invoke(), hVar.invoke(findViewById), iVar.invoke());
                }
                AnimatorSet animatorSet2 = battleMvpContainerLayout.f10868b;
                if (animatorSet2 != null) {
                    animatorSet2.start();
                }
                b bVar3 = this.f10885a.f10869c;
                if (bVar3 != null) {
                    bVar3.a(true);
                }
            }
        }
    }

    public final void setClickCallback(h.f.a.b<? super Boolean, z> bVar) {
        l.d(bVar, "");
        this.f10867a = bVar;
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10878a;

        /* renamed from: b  reason: collision with root package name */
        public final VHeadView f10879b;

        /* renamed from: c  reason: collision with root package name */
        public final AppCompatImageView f10880c;

        /* renamed from: d  reason: collision with root package name */
        public final AppCompatImageView f10881d;

        /* renamed from: e  reason: collision with root package name */
        public final HSImageView f10882e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10883f;

        /* renamed from: g  reason: collision with root package name */
        public final View f10884g;

        static {
            Covode.recordClassIndex(5815);
        }

        public b(View view) {
            l.d(view, "");
            this.f10884g = view;
            View findViewById = view.findViewById(R.id.c2s);
            l.b(findViewById, "");
            this.f10879b = (VHeadView) findViewById;
            View findViewById2 = view.findViewById(R.id.c2v);
            l.b(findViewById2, "");
            this.f10880c = (AppCompatImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.c2t);
            l.b(findViewById3, "");
            this.f10881d = (AppCompatImageView) findViewById3;
            this.f10882e = (HSImageView) view.findViewById(R.id.c2u);
        }

        public final void a(boolean z) {
            int i2;
            AppCompatImageView appCompatImageView = this.f10881d;
            int i3 = 8;
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            appCompatImageView.setVisibility(i2);
            if (!BattleMvpContainerLayout.f10865f) {
                HSImageView hSImageView = this.f10882e;
                l.b(hSImageView, "");
                if (z) {
                    i3 = 0;
                }
                hSImageView.setVisibility(i3);
                k.a(this.f10882e, "tiktok_live_interaction_resource", "ttlive_pk_army_mvp.png");
            }
            this.f10883f = z;
        }

        public final void a(o oVar, int i2, int i3) {
            l.d(oVar, "");
            if (l.a(oVar, o.f19286e)) {
                this.f10878a = true;
                this.f10879b.setImageResource(2131234797);
            } else if (l.a(oVar, o.f19287f)) {
                this.f10878a = true;
                this.f10879b.setImageResource(2131234798);
            } else {
                this.f10878a = false;
                com.bytedance.android.livesdk.chatroom.g.g.a(this.f10879b, oVar.f19292d, this.f10879b.getWidth(), this.f10879b.getHeight(), 2131234424);
            }
            this.f10880c.setImageResource(i2);
            this.f10881d.setVisibility(8);
            this.f10881d.setImageResource(i3);
            if (this.f10883f) {
                this.f10881d.setVisibility(8);
            }
        }
    }

    static final class h extends m implements h.f.a.b<View, AnimatorSet> {
        final /* synthetic */ e $generateScaleAnimation$1;
        final /* synthetic */ f $generateTranslationAnimation$2;
        final /* synthetic */ BattleMvpContainerLayout this$0;

        static {
            Covode.recordClassIndex(5821);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(BattleMvpContainerLayout battleMvpContainerLayout, f fVar, e eVar) {
            super(1);
            this.this$0 = battleMvpContainerLayout;
            this.$generateTranslationAnimation$2 = fVar;
            this.$generateScaleAnimation$1 = eVar;
        }

        /* renamed from: a */
        public final AnimatorSet invoke(View view) {
            boolean z;
            float d2;
            l.d(view, "");
            int c2 = y.c();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            float f2 = ((float) c2) / 2.0f;
            if (((float) iArr[0]) < f2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                d2 = -(f2 - (((float) iArr[0]) + (((float) y.d(R.dimen.ra)) / 2.0f)));
            } else {
                d2 = f2 - (((float) (c2 - iArr[0])) - (((float) y.d(R.dimen.ra)) / 2.0f));
            }
            float bottom = ((float) view.getBottom()) - (((float) this.this$0.getHeight()) / 2.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(this.$generateTranslationAnimation$2.a(d2, bottom, 200), this.$generateScaleAnimation$1.a(3.5f, 0.8f, 200));
            return animatorSet;
        }
    }

    public final void a(boolean z, List<o> list) {
        int i2;
        List<b> list2;
        int i3;
        o oVar;
        List d2;
        MethodCollector.i(7169);
        ArrayList arrayList = new ArrayList();
        if (!(list == null || (d2 = n.d((Iterable) list, 3)) == null)) {
            arrayList.addAll(d2);
        }
        if (arrayList.size() < 3) {
            if (z) {
                oVar = o.f19286e;
            } else {
                oVar = o.f19287f;
            }
            arrayList.add(oVar);
        }
        if (z) {
            i2 = R.id.c69;
        } else {
            i2 = R.id.c7l;
        }
        LinearLayout linearLayout = (LinearLayout) a(i2);
        if (z) {
            list2 = this.f10870d;
        } else {
            list2 = this.f10871e;
        }
        while (true) {
            l.b(linearLayout, "");
            i3 = 0;
            if (linearLayout.getChildCount() >= arrayList.size()) {
                break;
            }
            View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.bbw, linearLayout, false);
            l.b(a2, "");
            linearLayout.addView(a2, 0);
            list2.add(new b(a2));
        }
        if (linearLayout.getChildCount() > 1) {
            for (int childCount = linearLayout.getChildCount() - 1; childCount > 0; childCount--) {
                View childAt = linearLayout.getChildAt(childCount);
                l.b(childAt, "");
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(y.a(-6.0f));
                    View childAt2 = linearLayout.getChildAt(childCount);
                    l.b(childAt2, "");
                    childAt2.setLayoutParams(layoutParams);
                }
            }
        }
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                n.a();
            }
            b bVar = list2.get(i3);
            Integer num = this.f10872h.get(i3);
            l.b(num, "");
            int intValue = num.intValue();
            Integer num2 = this.f10873i.get(i3);
            l.b(num2, "");
            bVar.a((o) obj, intValue, num2.intValue());
            i3 = i4;
        }
        MethodCollector.o(7169);
    }

    private /* synthetic */ BattleMvpContainerLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements q<Float, Float, Long, AnimatorSet> {
        final /* synthetic */ BattleMvpContainerLayout this$0;

        static {
            Covode.recordClassIndex(5818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(BattleMvpContainerLayout battleMvpContainerLayout) {
            super(3);
            this.this$0 = battleMvpContainerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ AnimatorSet invoke(Float f2, Float f3, Long l2) {
            return a(f2.floatValue(), f3.floatValue(), l2.longValue());
        }

        public final AnimatorSet a(float f2, float f3, long j2) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.this$0.getMMvpImageView(), "scaleX", f2, f3), ObjectAnimator.ofFloat(this.this$0.getMMvpImageView(), "scaleY", f2, f3));
            animatorSet.setDuration(j2);
            return animatorSet;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements q<Float, Float, Long, AnimatorSet> {
        final /* synthetic */ BattleMvpContainerLayout this$0;

        static {
            Covode.recordClassIndex(5819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(BattleMvpContainerLayout battleMvpContainerLayout) {
            super(3);
            this.this$0 = battleMvpContainerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ AnimatorSet invoke(Float f2, Float f3, Long l2) {
            return a(f2.floatValue(), f3.floatValue(), l2.longValue());
        }

        public final AnimatorSet a(float f2, float f3, long j2) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.this$0.getMMvpImageView(), "translationX", 0.0f, f2), ObjectAnimator.ofFloat(this.this$0.getMMvpImageView(), "translationY", 0.0f, f3));
            animatorSet.setDuration(j2);
            return animatorSet;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BattleMvpContainerLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(7223);
        this.f10872h = n.d(2131234800, 2131234802, 2131234804);
        this.f10873i = n.d(2131234799, 2131234801, 2131234803);
        this.f10874j = h.i.a((h.f.a.a) new c(this));
        this.f10870d = new ArrayList();
        this.f10871e = new ArrayList();
        com.a.a(LayoutInflater.from(context), R.layout.bbv, this, true);
        ((LinearLayout) a(R.id.c69)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.liveinteract.match.ui.view.BattleMvpContainerLayout.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BattleMvpContainerLayout f10876a;

            static {
                Covode.recordClassIndex(5812);
            }

            {
                this.f10876a = r1;
            }

            public final void onClick(View view) {
                h.f.a.b<? super Boolean, z> bVar;
                if (this.f10876a.getAlpha() == 1.0f && (bVar = this.f10876a.f10867a) != null) {
                    bVar.invoke(true);
                }
            }
        });
        ((LinearLayout) a(R.id.c7l)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.liveinteract.match.ui.view.BattleMvpContainerLayout.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BattleMvpContainerLayout f10877a;

            static {
                Covode.recordClassIndex(5813);
            }

            {
                this.f10877a = r1;
            }

            public final void onClick(View view) {
                h.f.a.b<? super Boolean, z> bVar;
                if (this.f10877a.getAlpha() == 1.0f && (bVar = this.f10877a.f10867a) != null) {
                    bVar.invoke(false);
                }
            }
        });
        MethodCollector.o(7223);
    }
}

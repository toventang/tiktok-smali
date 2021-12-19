package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view;

import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSubmitInfoView;
import com.ss.android.ugc.aweme.ecommerce.util.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class OrderSummaryPanel extends FrameLayout {

    /* renamed from: g  reason: collision with root package name */
    public static final a f85022g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f85023a;

    /* renamed from: b  reason: collision with root package name */
    public View f85024b;

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.a<z> f85025c;

    /* renamed from: d  reason: collision with root package name */
    public final Animation f85026d;

    /* renamed from: e  reason: collision with root package name */
    public final Animation f85027e;

    /* renamed from: f  reason: collision with root package name */
    public Animation f85028f;

    /* renamed from: h  reason: collision with root package name */
    private SparseArray f85029h;

    static {
        Covode.recordClassIndex(53148);
    }

    public OrderSummaryPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private View a(int i2) {
        if (this.f85029h == null) {
            this.f85029h = new SparseArray();
        }
        View view = (View) this.f85029h.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f85029h.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53154);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        View view;
        ViewParent viewParent;
        View view2;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        View view3 = null;
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view4 = (View) parent;
        if (view4 != null) {
            view = view4.findViewById(R.id.d01);
        } else {
            view = null;
        }
        this.f85023a = view;
        ViewParent parent2 = getParent();
        if (parent2 != null) {
            viewParent = parent2.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof View)) {
            viewParent = null;
        }
        View view5 = (View) viewParent;
        if (view5 != null) {
            view2 = view5.findViewById(R.id.em5);
        } else {
            view2 = null;
        }
        if ((view2 instanceof View) && view2 != null) {
            view3 = view2.findViewById(R.id.d02);
        }
        this.f85024b = view3;
    }

    public final void setCloseAction(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f85025c = aVar;
    }

    private final int a(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return b.c(getContext(), R.color.bx);
            }
            if (num.intValue() == 2) {
                return b.c(getContext(), R.color.bh);
            }
        }
        return b.c(getContext(), R.color.c4);
    }

    public final void setBillSummaryData(j jVar) {
        String str;
        MethodCollector.i(7563);
        l.d(jVar, "");
        LinearLayout linearLayout = (LinearLayout) a(R.id.eer);
        l.b(linearLayout, "");
        if (linearLayout.getChildCount() > 0) {
            ((LinearLayout) a(R.id.eer)).removeAllViews();
        }
        for (T t : jVar.f84855a) {
            Context context = getContext();
            l.b(context, "");
            OrderSubmitInfoView orderSubmitInfoView = new OrderSubmitInfoView(context, (AttributeSet) null, 6);
            orderSubmitInfoView.setTitleText(t.f84848a);
            orderSubmitInfoView.setDescText(t.f84849b);
            orderSubmitInfoView.a(false);
            orderSubmitInfoView.setTitleFont(41);
            orderSubmitInfoView.setTitleColor(a(t.f84853f));
            orderSubmitInfoView.setDescFont(41);
            orderSubmitInfoView.setDescColor(a(t.f84850c));
            com.bytedance.lighten.a.a.a aVar = t.f84852e;
            if (!(aVar == null || (str = t.f84851d) == null)) {
                l.d(aVar, "");
                l.d(str, "");
                SmartImageView smartImageView = (SmartImageView) orderSubmitInfoView.a(R.id.bi7);
                l.b(smartImageView, "");
                smartImageView.setVisibility(0);
                v a2 = r.a(aVar);
                a2.E = (SmartImageView) orderSubmitInfoView.a(R.id.bi7);
                a2.c();
                SmartImageView smartImageView2 = (SmartImageView) orderSubmitInfoView.a(R.id.bi7);
                l.b(smartImageView2, "");
                smartImageView2.setOnClickListener(new OrderSubmitInfoView.a(orderSubmitInfoView, str));
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = (int) n.b(getContext(), 15.0f);
            ((LinearLayout) a(R.id.eer)).addView(orderSubmitInfoView, layoutParams);
        }
        MethodCollector.o(7563);
    }

    private /* synthetic */ OrderSummaryPanel(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private OrderSummaryPanel(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(7591);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.au);
        this.f85026d = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.at);
        this.f85027e = loadAnimation2;
        this.f85028f = AnimationUtils.loadAnimation(context, R.anim.as);
        com.a.a(LayoutInflater.from(context), R.layout.rm, this, true);
        TuxNavBar.a aVar = new TuxNavBar.a();
        g gVar = new g();
        String string = context.getString(R.string.fx9);
        l.b(string, "");
        TuxNavBar.a a2 = aVar.a(gVar.a(string));
        com.bytedance.tux.navigation.a.b a3 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small);
        a3.f45194b = true;
        ((TuxNavBar) a(R.id.czz)).setNavActions(a2.b(a3.a((h.f.a.a<z>) new h.f.a.a<z>(this) {
            /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSummaryPanel.AnonymousClass1 */
            final /* synthetic */ OrderSummaryPanel this$0;

            static {
                Covode.recordClassIndex(53149);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                h.f.a.a<z> aVar = this.this$0.f85025c;
                if (aVar == null) {
                    l.a("onClose");
                }
                aVar.invoke();
                return z.f158842a;
            }
        })));
        ((TuxNavBar) a(R.id.czz)).a(true);
        loadAnimation.setAnimationListener(new Animation.AnimationListener(this) {
            /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSummaryPanel.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ OrderSummaryPanel f85030a;

            static {
                Covode.recordClassIndex(53150);
            }

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f85030a = r1;
            }

            public final void onAnimationStart(Animation animation) {
                ViewPropertyAnimator animate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator animate2;
                ViewPropertyAnimator duration2;
                this.f85030a.setVisibility(0);
                this.f85030a.setClickable(true);
                View view = this.f85030a.f85023a;
                if (view != null) {
                    view.setVisibility(0);
                }
                View view2 = this.f85030a.f85024b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                View view3 = this.f85030a.f85023a;
                if (!(view3 == null || (animate2 = view3.animate()) == null || (duration2 = animate2.setDuration(300)) == null)) {
                    duration2.alpha(1.0f);
                }
                View view4 = this.f85030a.f85024b;
                if (view4 != null && (animate = view4.animate()) != null && (duration = animate.setDuration(300)) != null) {
                    duration.alpha(1.0f);
                }
            }
        });
        loadAnimation2.setAnimationListener(new Animation.AnimationListener(this) {
            /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSummaryPanel.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ OrderSummaryPanel f85031a;

            static {
                Covode.recordClassIndex(53151);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f85031a = r1;
            }

            public final void onAnimationEnd(Animation animation) {
                this.f85031a.setVisibility(8);
                this.f85031a.setClickable(false);
                View view = this.f85031a.f85023a;
                if (view != null) {
                    view.setVisibility(8);
                }
                View view2 = this.f85031a.f85024b;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }

            public final void onAnimationStart(Animation animation) {
                ViewPropertyAnimator animate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator animate2;
                ViewPropertyAnimator duration2;
                View view = this.f85031a.f85023a;
                if (!(view == null || (animate2 = view.animate()) == null || (duration2 = animate2.setDuration(300)) == null)) {
                    duration2.alpha(0.0f);
                }
                View view2 = this.f85031a.f85024b;
                if (view2 != null && (animate = view2.animate()) != null && (duration = animate.setDuration(300)) != null) {
                    duration.alpha(0.0f);
                }
            }
        });
        setOnClickListener(AnonymousClass4.f85032a);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new ViewOutlineProvider() {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSummaryPanel.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(53153);
                }

                public final void getOutline(View view, Outline outline) {
                    if (view != null && outline != null) {
                        outline.setRoundRect(0, 0, view.getWidth(), (int) (((float) view.getHeight()) + h.f87570d), h.f87570d);
                    }
                }
            });
            setClipToOutline(true);
        }
        MethodCollector.o(7591);
    }
}

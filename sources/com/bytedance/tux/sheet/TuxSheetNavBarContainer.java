package com.bytedance.tux.sheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.navigation.TuxNavBar;
import h.f.b.l;
import h.w;

public final class TuxSheetNavBarContainer extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final a f45225c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TuxNavBar f45226a;

    /* renamed from: b  reason: collision with root package name */
    public TuxNavBar f45227b;

    /* renamed from: d  reason: collision with root package name */
    private TuxNavBar.a f45228d;

    /* renamed from: e  reason: collision with root package name */
    private final ValueAnimator f45229e;

    static {
        Covode.recordClassIndex(27559);
    }

    public TuxSheetNavBarContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27562);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45229e.cancel();
    }

    public final void setNavActions(TuxNavBar.a aVar) {
        if (this.f45229e.isRunning()) {
            this.f45229e.cancel();
        }
        if (aVar == null) {
            this.f45226a.setVisibility(8);
            this.f45227b.setVisibility(8);
        } else if (this.f45228d == null) {
            this.f45226a.setVisibility(0);
            this.f45226a.setNavActions(aVar);
            this.f45227b.setVisibility(8);
        } else {
            this.f45226a.setVisibility(0);
            this.f45227b.setVisibility(0);
            this.f45226a.setAlpha(0.0f);
            this.f45227b.setAlpha(1.0f);
            this.f45226a.setNavActions(aVar);
            TuxNavBar.a aVar2 = this.f45228d;
            if (aVar2 != null) {
                this.f45227b.setNavActions(aVar2);
            }
            this.f45229e.start();
        }
        this.f45228d = aVar;
    }

    private /* synthetic */ TuxSheetNavBarContainer(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSheetNavBarContainer(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        MethodCollector.i(6498);
        this.f45226a = new TuxNavBar(context, null, 0, 6);
        TuxNavBar tuxNavBar = new TuxNavBar(context, null, 0, 6);
        this.f45227b = tuxNavBar;
        addView(tuxNavBar);
        addView(this.f45226a);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        l.a((Object) ofFloat, "");
        this.f45229e = ofFloat;
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.bytedance.tux.sheet.TuxSheetNavBarContainer.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TuxSheetNavBarContainer f45230a;

            static {
                Covode.recordClassIndex(27560);
            }

            {
                this.f45230a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l.a((Object) valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    this.f45230a.f45227b.setAlpha(1.0f - floatValue);
                    this.f45230a.f45226a.setAlpha(floatValue);
                    return;
                }
                throw new w("null cannot be cast to non-null type");
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter(this) {
            /* class com.bytedance.tux.sheet.TuxSheetNavBarContainer.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TuxSheetNavBarContainer f45231a;

            static {
                Covode.recordClassIndex(27561);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f45231a = r1;
            }

            public final void onAnimationEnd(Animator animator, boolean z) {
                this.f45231a.f45226a.setVisibility(0);
                this.f45231a.f45227b.setVisibility(8);
            }
        });
        MethodCollector.o(6498);
    }
}

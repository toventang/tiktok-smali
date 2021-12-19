package com.bytedance.android.live.publicscreen.impl.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.n.q;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class LandscapePublicScreenWidget extends PublicScreenWidget implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final a f12497c = new a((byte) 0);
    private static final int v = y.a(56.0f);
    private static final int w = y.a(12.0f);

    /* renamed from: a  reason: collision with root package name */
    boolean f12498a;

    /* renamed from: b  reason: collision with root package name */
    boolean f12499b = true;
    private ValueAnimator u;

    @Override // com.bytedance.android.live.publicscreen.impl.e.h.a
    public final boolean e() {
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6876);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void i() {
        super.i();
        this.f12508d.setHasFixedSize(true);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    static {
        Covode.recordClassIndex(6875);
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        View view;
        int i2;
        ValueAnimator valueAnimator;
        if (isViewValid() && (view = getView()) != null) {
            l.b(view, "");
            if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i3 = marginLayoutParams.bottomMargin;
                if (this.f12499b) {
                    i2 = v;
                } else {
                    i2 = w;
                }
                ValueAnimator valueAnimator2 = this.u;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(i3, i2);
                Math.abs(i3 - i2);
                ValueAnimator duration = ofInt.setDuration(200L);
                this.u = duration;
                if (duration != null) {
                    duration.addUpdateListener(new d(this, marginLayoutParams, view));
                }
                if (this.f12499b && (valueAnimator = this.u) != null) {
                    valueAnimator.addListener(new e(this));
                }
                ValueAnimator valueAnimator3 = this.u;
                if (valueAnimator3 != null) {
                    valueAnimator3.start();
                }
            }
        }
    }

    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LandscapePublicScreenWidget f12503a;

        static {
            Covode.recordClassIndex(6880);
        }

        public final void onAnimationCancel(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(LandscapePublicScreenWidget landscapePublicScreenWidget) {
            this.f12503a = landscapePublicScreenWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            this.f12503a.k();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ LandscapePublicScreenWidget this$0;

        static {
            Covode.recordClassIndex(6878);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LandscapePublicScreenWidget landscapePublicScreenWidget) {
            super(1);
            this.this$0 = landscapePublicScreenWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.a(bool.booleanValue());
            return z.f158842a;
        }
    }

    public final void a(boolean z) {
        this.f12498a = z;
        if (!z) {
            j();
        } else {
            k();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ LandscapePublicScreenWidget this$0;

        static {
            Covode.recordClassIndex(6877);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LandscapePublicScreenWidget landscapePublicScreenWidget) {
            super(1);
            this.this$0 = landscapePublicScreenWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            LandscapePublicScreenWidget landscapePublicScreenWidget = this.this$0;
            landscapePublicScreenWidget.f12499b = booleanValue;
            if (!landscapePublicScreenWidget.f12498a) {
                landscapePublicScreenWidget.j();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b((m) this, q.class, (h.f.a.b) new b(this)).a((m) this, ba.class, (h.f.a.b) new c(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LandscapePublicScreenWidget f12500a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup.MarginLayoutParams f12501b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f12502c;

        static {
            Covode.recordClassIndex(6879);
        }

        d(LandscapePublicScreenWidget landscapePublicScreenWidget, ViewGroup.MarginLayoutParams marginLayoutParams, View view) {
            this.f12500a = landscapePublicScreenWidget;
            this.f12501b = marginLayoutParams;
            this.f12502c = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.d(valueAnimator, "");
            if (this.f12500a.isViewValid()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = this.f12501b;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                marginLayoutParams.bottomMargin = ((Integer) animatedValue).intValue();
                this.f12502c.setLayoutParams(this.f12501b);
            }
        }
    }
}

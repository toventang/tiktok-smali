package com.ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.ui.RichTagView;
import com.bytedance.ies.ugc.aweme.rich.ui.a;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class FakeUserAdTagView extends c {

    /* renamed from: b  reason: collision with root package name */
    public AwemeRawAd f75871b;

    /* renamed from: c  reason: collision with root package name */
    private final int f75872c;

    /* renamed from: d  reason: collision with root package name */
    private final int f75873d;

    /* renamed from: e  reason: collision with root package name */
    private final h f75874e;

    /* renamed from: f  reason: collision with root package name */
    private final h f75875f;

    /* renamed from: g  reason: collision with root package name */
    private Animator f75876g;

    /* renamed from: h  reason: collision with root package name */
    private Animator f75877h;

    static {
        Covode.recordClassIndex(46791);
    }

    public FakeUserAdTagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getDefaultBgColor() {
        return ((Number) this.f75875f.getValue()).intValue();
    }

    public final int getDefaultTextColor() {
        return ((Number) this.f75874e.getValue()).intValue();
    }

    static final class a extends m implements h.f.a.a<Integer> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(46792);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.b.c(this.$context, R.color.f159926j));
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(46793);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.b.c(this.$context, R.color.c5));
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FakeUserAdTagView f75878a;

        static {
            Covode.recordClassIndex(46794);
        }

        c(FakeUserAdTagView fakeUserAdTagView) {
            this.f75878a = fakeUserAdTagView;
        }

        public final void run() {
            FakeUserAdTagView fakeUserAdTagView = this.f75878a;
            fakeUserAdTagView.setTopMargin(-fakeUserAdTagView.getMeasuredHeight());
        }
    }

    public final int getTopMargin() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f75876g;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f75877h;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AwemeRawAd awemeRawAd = this.f75871b;
        if (awemeRawAd != null) {
            if (awemeRawAd.getShowLabelSeconds() <= 0) {
                setTopMargin(0);
                setAlpha(1.0f);
                return;
            }
            setTopMargin(-n.a(24.0d));
            setAlpha(0.0f);
            post(new c(this));
        }
    }

    public final void setTopMargin(int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i2;
        setLayoutParams(marginLayoutParams);
    }

    private /* synthetic */ FakeUserAdTagView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FakeUserAdTagView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f75872c = n.a(2.0d);
        int a2 = n.a(4.0d);
        this.f75873d = a2;
        this.f75874e = i.a((h.f.a.a) new b(context));
        this.f75875f = i.a((h.f.a.a) new a(context));
        setSpaceH(a2);
    }

    public final void a(String str, int i2, int i3) {
        Context context = getContext();
        l.b(context, "");
        RichTagView richTagView = new RichTagView(context, (AttributeSet) null, 4);
        addView(richTagView);
        com.bytedance.tux.h.i.b(richTagView, 0, 0, Integer.valueOf(this.f75872c), 0, false, 16);
        a.C0795a a2 = a.C0795a.C0796a.a();
        a.C0795a a3 = a2.a(str).b(81).a(i2).c(i3).a((float) n.a(2.0d));
        com.bytedance.ies.ugc.aweme.rich.ui.a aVar = a3.f35183a;
        if (aVar != null) {
            aVar.f35177i = -2;
        }
        int a4 = n.a(16.0d);
        com.bytedance.ies.ugc.aweme.rich.ui.a aVar2 = a3.f35183a;
        if (aVar2 != null) {
            aVar2.f35178j = Integer.valueOf(a4);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        l.c(truncateAt, "");
        com.bytedance.ies.ugc.aweme.rich.ui.a aVar3 = a3.f35183a;
        if (aVar3 != null) {
            aVar3.f35173e = truncateAt;
        }
        com.bytedance.ies.ugc.aweme.rich.ui.a aVar4 = a3.f35183a;
        if (aVar4 != null) {
            aVar4.f35174f = 1;
        }
        int i4 = this.f75873d;
        com.bytedance.ies.ugc.aweme.rich.ui.a aVar5 = a3.f35183a;
        if (aVar5 != null) {
            aVar5.f35179k = Integer.valueOf(i4);
        }
        int i5 = this.f75873d;
        com.bytedance.ies.ugc.aweme.rich.ui.a aVar6 = a3.f35183a;
        if (aVar6 != null) {
            aVar6.f35180l = Integer.valueOf(i5);
        }
        com.bytedance.ies.ugc.aweme.rich.ui.a aVar7 = a2.f35183a;
        if (aVar7 != null) {
            richTagView.a(aVar7);
        }
    }
}

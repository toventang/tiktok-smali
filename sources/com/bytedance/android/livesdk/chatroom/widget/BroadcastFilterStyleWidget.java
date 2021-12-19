package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;

public final class BroadcastFilterStyleWidget extends LiveWidget implements au {

    /* renamed from: g  reason: collision with root package name */
    public static final a f16533g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f16534a;

    /* renamed from: b  reason: collision with root package name */
    public View f16535b;

    /* renamed from: c  reason: collision with root package name */
    public View f16536c;

    /* renamed from: d  reason: collision with root package name */
    public LiveTextView f16537d;

    /* renamed from: e  reason: collision with root package name */
    public final h f16538e = com.bytedance.android.livesdkapi.m.d.a(new d(this));

    /* renamed from: f  reason: collision with root package name */
    public final h f16539f = com.bytedance.android.livesdkapi.m.d.a(new e(this));

    /* renamed from: h  reason: collision with root package name */
    private int f16540h;

    static {
        Covode.recordClassIndex(9166);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.b5k;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9167);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<AnimationSet> {
        final /* synthetic */ BroadcastFilterStyleWidget this$0;

        static {
            Covode.recordClassIndex(9170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(BroadcastFilterStyleWidget broadcastFilterStyleWidget) {
            super(0);
            this.this$0 = broadcastFilterStyleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnimationSet invoke() {
            return this.this$0.a(true);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<AnimationSet> {
        final /* synthetic */ BroadcastFilterStyleWidget this$0;

        static {
            Covode.recordClassIndex(9171);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(BroadcastFilterStyleWidget broadcastFilterStyleWidget) {
            super(0);
            this.this$0 = broadcastFilterStyleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnimationSet invoke() {
            return this.this$0.a(false);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        View view = this.f16536c;
        if (view == null) {
            l.a("filterStyle");
        }
        view.clearAnimation();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View findViewById = findViewById(R.id.fit);
        l.b(findViewById, "");
        this.f16534a = findViewById;
        View findViewById2 = findViewById(R.id.fiu);
        l.b(findViewById2, "");
        this.f16535b = findViewById2;
        View view = getView();
        if (view != null) {
            this.f16536c = view;
            View findViewById3 = findViewById(R.id.b33);
            l.b(findViewById3, "");
            this.f16537d = (LiveTextView) findViewById3;
            this.f16540h = y.c();
        }
    }

    public static final class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BroadcastFilterStyleWidget f16541a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AlphaAnimation f16542b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TranslateAnimation f16543c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TranslateAnimation f16544d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AlphaAnimation f16545e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ TranslateAnimation f16546f;

        static {
            Covode.recordClassIndex(9168);
        }

        public final void onAnimationRepeat(Animation animation) {
            l.d(animation, "");
        }

        public final void onAnimationEnd(Animation animation) {
            l.d(animation, "");
            BroadcastFilterStyleWidget.a(this.f16541a).setVisibility(4);
        }

        public final void onAnimationStart(Animation animation) {
            l.d(animation, "");
            BroadcastFilterStyleWidget.a(this.f16541a).setVisibility(0);
        }

        b(BroadcastFilterStyleWidget broadcastFilterStyleWidget, AlphaAnimation alphaAnimation, TranslateAnimation translateAnimation, TranslateAnimation translateAnimation2, AlphaAnimation alphaAnimation2, TranslateAnimation translateAnimation3) {
            this.f16541a = broadcastFilterStyleWidget;
            this.f16542b = alphaAnimation;
            this.f16543c = translateAnimation;
            this.f16544d = translateAnimation2;
            this.f16545e = alphaAnimation2;
            this.f16546f = translateAnimation3;
        }
    }

    public static final /* synthetic */ View a(BroadcastFilterStyleWidget broadcastFilterStyleWidget) {
        View view = broadcastFilterStyleWidget.f16536c;
        if (view == null) {
            l.a("filterStyle");
        }
        return view;
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f16547a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BroadcastFilterStyleWidget f16548b;

        static {
            Covode.recordClassIndex(9169);
        }

        public c(View view, BroadcastFilterStyleWidget broadcastFilterStyleWidget) {
            this.f16547a = view;
            this.f16548b = broadcastFilterStyleWidget;
        }

        public final void onClick(View view) {
            this.f16547a.setVisibility(8);
            this.f16547a.setClickable(false);
            View view2 = this.f16548b.f16534a;
            if (view2 == null) {
                l.a("filterArrow1");
            }
            view2.setVisibility(8);
            View view3 = this.f16548b.f16535b;
            if (view3 == null) {
                l.a("filterArrow2");
            }
            view3.setVisibility(8);
        }
    }

    public final AnimationSet a(boolean z) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        LiveTextView liveTextView = this.f16537d;
        if (liveTextView == null) {
            l.a("filterStyleText");
        }
        int width = (this.f16540h - liveTextView.getWidth()) / 2;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new androidx.g.a.a.c());
        alphaAnimation.setDuration(300);
        if (z) {
            f2 = (float) (-width);
        } else {
            f2 = (float) width;
        }
        float f7 = -50.0f;
        if (z) {
            f3 = -50.0f;
        } else {
            f3 = 50.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f2, f3, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new androidx.g.a.a.c());
        translateAnimation.setDuration(300);
        if (z) {
            f4 = -50.0f;
            f5 = 50.0f;
        } else {
            f4 = 50.0f;
            f5 = -50.0f;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(f4, f5, 0.0f, 0.0f);
        translateAnimation2.setInterpolator(new LinearInterpolator());
        translateAnimation2.setStartOffset(300);
        translateAnimation2.setDuration(200);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(500);
        alphaAnimation2.setInterpolator(new androidx.g.a.a.b());
        alphaAnimation2.setDuration(300);
        if (z) {
            f7 = 50.0f;
            f6 = (float) width;
        } else {
            f6 = (float) (-width);
        }
        TranslateAnimation translateAnimation3 = new TranslateAnimation(f7, f6, 0.0f, 0.0f);
        translateAnimation3.setStartOffset(500);
        translateAnimation3.setInterpolator(new androidx.g.a.a.b());
        translateAnimation3.setDuration(300);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.addAnimation(translateAnimation3);
        animationSet.setAnimationListener(new b(this, alphaAnimation, translateAnimation, translateAnimation2, alphaAnimation2, translateAnimation3));
        return animationSet;
    }
}

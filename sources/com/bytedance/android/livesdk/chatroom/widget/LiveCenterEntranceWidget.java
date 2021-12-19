package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.n.r;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.bn;
import com.bytedance.android.livesdk.j.bo;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftBoostAnchorCenterSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class LiveCenterEntranceWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    final int f16559a = 1;

    /* renamed from: b  reason: collision with root package name */
    final int f16560b = 2;

    /* renamed from: c  reason: collision with root package name */
    final int f16561c = 3;

    /* renamed from: d  reason: collision with root package name */
    public LiveTextView f16562d;

    /* renamed from: e  reason: collision with root package name */
    public long f16563e;

    /* renamed from: f  reason: collision with root package name */
    View f16564f;

    /* renamed from: g  reason: collision with root package name */
    ImageView f16565g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f16566h;

    /* renamed from: i  reason: collision with root package name */
    public LiveTextView f16567i;

    /* renamed from: j  reason: collision with root package name */
    View f16568j;

    /* renamed from: k  reason: collision with root package name */
    int f16569k;

    /* renamed from: l  reason: collision with root package name */
    public LiveTextView f16570l;

    /* renamed from: m  reason: collision with root package name */
    public com.bytedance.android.livesdk.c.b f16571m;
    private final f.a.b.a n = new f.a.b.a();

    static {
        Covode.recordClassIndex(9183);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.b5l;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.n.a();
    }

    public LiveCenterEntranceWidget() {
        int i2 = 1;
        this.f16569k = y.g() ? -1 : i2;
        this.f16571m = new com.bytedance.android.livesdk.c.b();
    }

    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCenterEntranceWidget f16576a;

        static {
            Covode.recordClassIndex(9188);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f16577a;

            static {
                Covode.recordClassIndex(9189);
            }

            a(e eVar) {
                this.f16577a = eVar;
            }

            public final void run() {
                LiveCenterEntranceWidget liveCenterEntranceWidget = this.f16577a.f16576a;
                AnimatorSet animatorSet = new AnimatorSet();
                ImageView imageView = liveCenterEntranceWidget.f16565g;
                if (imageView == null) {
                    l.b();
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "Alpha", 0.0f, 1.0f);
                l.b(ofFloat, "");
                ofFloat.setDuration(120L);
                ofFloat.setInterpolator(liveCenterEntranceWidget.f16571m);
                View view = liveCenterEntranceWidget.f16564f;
                if (view == null) {
                    l.b();
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "Alpha", 1.0f, 0.0f);
                l.b(ofFloat2, "");
                ofFloat2.setDuration(120L);
                ofFloat2.setInterpolator(liveCenterEntranceWidget.f16571m);
                LiveTextView liveTextView = liveCenterEntranceWidget.f16562d;
                if (liveTextView == null) {
                    l.b();
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(liveTextView, "Alpha", 0.0f, 1.0f);
                l.b(ofFloat3, "");
                ofFloat3.setDuration(120L);
                ofFloat3.setInterpolator(liveCenterEntranceWidget.f16571m);
                LiveTextView liveTextView2 = liveCenterEntranceWidget.f16567i;
                if (liveTextView2 == null) {
                    l.b();
                }
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(liveTextView2, "Alpha", 1.0f, 0.0f);
                l.b(ofFloat4, "");
                ofFloat4.setDuration(120L);
                ofFloat4.setInterpolator(liveCenterEntranceWidget.f16571m);
                LiveTextView liveTextView3 = liveCenterEntranceWidget.f16570l;
                if (liveTextView3 == null) {
                    l.b();
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(liveTextView3, "Alpha", 1.0f, 0.0f);
                l.b(ofFloat5, "");
                ofFloat5.setDuration(120L);
                ofFloat5.setInterpolator(liveCenterEntranceWidget.f16571m);
                ImageView imageView2 = liveCenterEntranceWidget.f16566h;
                if (imageView2 == null) {
                    l.b();
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView2, "Alpha", 1.0f, 0.0f);
                l.b(ofFloat6, "");
                ofFloat6.setDuration(120L);
                ofFloat6.setInterpolator(liveCenterEntranceWidget.f16571m);
                View view2 = liveCenterEntranceWidget.f16568j;
                if (view2 == null) {
                    l.b();
                }
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view2, "Alpha", 0.0f, 1.0f);
                l.b(ofFloat7, "");
                ofFloat7.setDuration(480L);
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat6, ofFloat7, ofFloat5);
                animatorSet.addListener(new a(liveCenterEntranceWidget));
                animatorSet.start();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(LiveCenterEntranceWidget liveCenterEntranceWidget) {
            this.f16576a = liveCenterEntranceWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            LiveTextView liveTextView = this.f16576a.f16567i;
            if (liveTextView == null) {
                l.b();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(liveTextView, "Alpha", 0.0f, 1.0f);
            l.b(ofFloat, "");
            ofFloat.setDuration(120L);
            ofFloat.setInterpolator(this.f16576a.f16571m);
            ofFloat.start();
            LiveTextView liveTextView2 = this.f16576a.f16570l;
            if (liveTextView2 == null) {
                l.b();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(liveTextView2, "Alpha", 0.0f, 1.0f);
            l.b(ofFloat2, "");
            ofFloat2.setDuration(120L);
            ofFloat2.setInterpolator(this.f16576a.f16571m);
            ofFloat2.start();
            ImageView imageView = this.f16576a.f16566h;
            if (imageView == null) {
                l.b();
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, "ScaleY", 1.6f, 1.0f);
            l.b(ofFloat3, "");
            ofFloat3.setDuration(120L);
            ofFloat3.setInterpolator(this.f16576a.f16571m);
            ofFloat3.start();
            ImageView imageView2 = this.f16576a.f16566h;
            if (imageView2 == null) {
                l.b();
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView2, "ScaleX", 1.6f, 1.0f);
            l.b(ofFloat4, "");
            ofFloat4.setDuration(120L);
            ofFloat4.setInterpolator(this.f16576a.f16571m);
            ofFloat4.start();
            View view = this.f16576a.getView();
            if (view != null) {
                view.postDelayed(new a(this), 2120);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.dataChannel.c(bn.class);
        b.a.a("livesdk_live_center_icon").a().f("show").b();
        View view = getView();
        if (view != null) {
            view.setOnClickListener(new b(this));
        }
        this.f16568j = findViewById(R.id.qq);
        this.f16563e = System.currentTimeMillis();
        this.f16562d = (LiveTextView) findViewById(R.id.wv);
        this.f16565g = (ImageView) findViewById(R.id.e_j);
        this.f16564f = findViewById(R.id.a8s);
        this.f16566h = (ImageView) findViewById(R.id.uj);
        this.f16567i = (LiveTextView) findViewById(R.id.ul);
        this.f16570l = (LiveTextView) findViewById(R.id.um);
        if (LiveGiftBoostAnchorCenterSetting.INSTANCE.getValue()) {
            this.n.a(t.a(1, TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f(this)));
        } else {
            LiveTextView liveTextView = this.f16562d;
            if (liveTextView != null) {
                Context context = this.context;
                l.b(context, "");
                liveTextView.setBackground(context.getResources().getDrawable(2131234624));
                ViewGroup.LayoutParams layoutParams = liveTextView.getLayoutParams();
                layoutParams.height = y.a(16.0f);
                layoutParams.width = y.a(16.0f);
                liveTextView.setLayoutParams(layoutParams);
            }
        }
        if (com.bytedance.android.live.uikit.c.a.a(this.context)) {
            View findViewById = findViewById(R.id.qq);
            l.b(findViewById, "");
            findViewById.setBackground(y.c(R.drawable.c0i));
            View findViewById2 = findViewById(R.id.a8s);
            l.b(findViewById2, "");
            findViewById2.setBackground(y.c(R.drawable.bo8));
        }
        this.n.a(com.bytedance.android.livesdk.an.a.a().a(l.class).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new c(this)));
        this.n.a(com.bytedance.android.livesdk.an.a.a().a(r.class).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new d(this)));
    }

    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCenterEntranceWidget f16572a;

        static {
            Covode.recordClassIndex(9184);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(LiveCenterEntranceWidget liveCenterEntranceWidget) {
            this.f16572a = liveCenterEntranceWidget;
        }

        public final void onAnimationStart(Animator animator) {
            ImageView imageView = this.f16572a.f16566h;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            LiveTextView liveTextView = this.f16572a.f16567i;
            if (liveTextView != null) {
                liveTextView.setVisibility(8);
            }
            LiveTextView liveTextView2 = this.f16572a.f16570l;
            if (liveTextView2 != null) {
                liveTextView2.setVisibility(8);
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCenterEntranceWidget f16573a;

        static {
            Covode.recordClassIndex(9185);
        }

        b(LiveCenterEntranceWidget liveCenterEntranceWidget) {
            this.f16573a = liveCenterEntranceWidget;
        }

        public final void onClick(View view) {
            this.f16573a.dataChannel.c(bo.class);
            b.a.a("livesdk_live_center_icon").a().f("click").b();
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCenterEntranceWidget f16574a;

        static {
            Covode.recordClassIndex(9186);
        }

        c(LiveCenterEntranceWidget liveCenterEntranceWidget) {
            this.f16574a = liveCenterEntranceWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ImageView imageView;
            LiveCenterEntranceWidget liveCenterEntranceWidget = this.f16574a;
            int i2 = ((l) obj).f16662a;
            if (i2 == liveCenterEntranceWidget.f16559a) {
                ImageView imageView2 = liveCenterEntranceWidget.f16565g;
                if (imageView2 != null) {
                    imageView2.setImageResource(2131234566);
                }
            } else if (i2 == liveCenterEntranceWidget.f16560b) {
                ImageView imageView3 = liveCenterEntranceWidget.f16565g;
                if (imageView3 != null) {
                    imageView3.setImageResource(2131234565);
                }
            } else if (i2 == liveCenterEntranceWidget.f16561c && (imageView = liveCenterEntranceWidget.f16565g) != null) {
                imageView.setImageResource(2131234567);
            }
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCenterEntranceWidget f16578a;

        static {
            Covode.recordClassIndex(9190);
        }

        f(LiveCenterEntranceWidget liveCenterEntranceWidget) {
            this.f16578a = liveCenterEntranceWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long currentTimeMillis = (System.currentTimeMillis() - this.f16578a.f16563e) / 1000;
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            } else if (currentTimeMillis > 6000) {
                currentTimeMillis = 6000;
            }
            long j2 = currentTimeMillis / 60;
            long j3 = currentTimeMillis % 60;
            StringBuffer stringBuffer = new StringBuffer();
            if (String.valueOf(j2).length() < 2) {
                stringBuffer.append("0");
            }
            stringBuffer.append(j2);
            stringBuffer.append(":");
            if (String.valueOf(j3).length() < 2) {
                stringBuffer.append("0");
            }
            stringBuffer.append(j3);
            LiveTextView liveTextView = this.f16578a.f16562d;
            if (liveTextView != null) {
                liveTextView.setText(stringBuffer.toString());
            }
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCenterEntranceWidget f16575a;

        static {
            Covode.recordClassIndex(9187);
        }

        d(LiveCenterEntranceWidget liveCenterEntranceWidget) {
            this.f16575a = liveCenterEntranceWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String string;
            String concat;
            r rVar = (r) obj;
            LiveTextView liveTextView = this.f16575a.f16570l;
            if (liveTextView != null) {
                liveTextView.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33796b), 2);
            }
            if (!y.g()) {
                Context context = this.f16575a.context;
                l.b(context, "");
                string = context.getResources().getString(R.string.eg_, String.valueOf(rVar.f12099a));
            } else {
                Context context2 = this.f16575a.context;
                l.b(context2, "");
                string = context2.getResources().getString(R.string.ega, String.valueOf(rVar.f12099a));
            }
            l.b(string, "");
            LiveTextView liveTextView2 = this.f16575a.f16570l;
            if (liveTextView2 != null) {
                if (!y.g()) {
                    concat = string + ' ';
                } else {
                    concat = " ".concat(String.valueOf(string));
                }
                liveTextView2.setText(concat);
            }
            LiveCenterEntranceWidget liveCenterEntranceWidget = this.f16575a;
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet animatorSet2 = new AnimatorSet();
            ImageView imageView = liveCenterEntranceWidget.f16566h;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            LiveTextView liveTextView3 = liveCenterEntranceWidget.f16567i;
            if (liveTextView3 != null) {
                liveTextView3.setVisibility(0);
            }
            LiveTextView liveTextView4 = liveCenterEntranceWidget.f16570l;
            if (liveTextView4 != null) {
                liveTextView4.setVisibility(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            ImageView imageView2 = liveCenterEntranceWidget.f16565g;
            if (imageView2 == null) {
                l.b();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView2, "Alpha", 1.0f, 0.0f);
            l.b(ofFloat, "");
            ofFloat.setDuration(280L);
            ofFloat.setInterpolator(liveCenterEntranceWidget.f16571m);
            View view = liveCenterEntranceWidget.f16568j;
            if (view == null) {
                l.b();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "Alpha", 1.0f, 0.0f);
            l.b(ofFloat2, "");
            ofFloat2.setDuration(280L);
            ofFloat2.setInterpolator(liveCenterEntranceWidget.f16571m);
            View view2 = liveCenterEntranceWidget.f16564f;
            if (view2 == null) {
                l.b();
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "Alpha", 0.0f, 1.0f);
            l.b(ofFloat3, "");
            ofFloat3.setDuration(280L);
            ofFloat3.setInterpolator(liveCenterEntranceWidget.f16571m);
            View view3 = liveCenterEntranceWidget.f16564f;
            if (view3 == null) {
                l.b();
            }
            float measuredWidth = (float) view3.getMeasuredWidth();
            View view4 = liveCenterEntranceWidget.f16564f;
            if (view4 == null) {
                l.b();
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view4, "TranslationX", ((float) liveCenterEntranceWidget.f16569k) * measuredWidth, 0.0f);
            l.b(ofFloat4, "");
            ofFloat4.setDuration(280L);
            ofFloat4.setInterpolator(liveCenterEntranceWidget.f16571m);
            LiveTextView liveTextView5 = liveCenterEntranceWidget.f16562d;
            if (liveTextView5 == null) {
                l.b();
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(liveTextView5, "Alpha", 1.0f, 0.0f);
            l.b(ofFloat5, "");
            ofFloat5.setDuration(280L);
            ofFloat5.setInterpolator(liveCenterEntranceWidget.f16571m);
            animatorSet3.playTogether(ofFloat, ofFloat3, ofFloat4, ofFloat5, ofFloat2);
            ImageView imageView3 = liveCenterEntranceWidget.f16566h;
            if (imageView3 == null) {
                l.b();
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView3, "Alpha", 0.0f, 1.0f);
            l.b(ofFloat6, "");
            ofFloat6.setDuration(120L);
            ofFloat6.setInterpolator(liveCenterEntranceWidget.f16571m);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 100);
            l.b(ofInt, "");
            ofInt.setDuration(160L);
            ofInt.setInterpolator(liveCenterEntranceWidget.f16571m);
            animatorSet2.playSequentially(ofInt, ofFloat6);
            animatorSet2.start();
            AnimatorSet animatorSet4 = new AnimatorSet();
            ImageView imageView4 = liveCenterEntranceWidget.f16566h;
            if (imageView4 == null) {
                l.b();
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(imageView4, "ScaleX", 1.0f, 1.5f);
            l.b(ofFloat7, "");
            ofFloat7.setDuration(120L);
            ofFloat7.setInterpolator(liveCenterEntranceWidget.f16571m);
            ImageView imageView5 = liveCenterEntranceWidget.f16566h;
            if (imageView5 == null) {
                l.b();
            }
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(imageView5, "ScaleY", 1.0f, 1.5f);
            l.b(ofFloat8, "");
            ofFloat8.setDuration(120L);
            ofFloat8.setInterpolator(liveCenterEntranceWidget.f16571m);
            animatorSet4.playTogether(ofFloat7, ofFloat8);
            AnimatorSet animatorSet5 = new AnimatorSet();
            ImageView imageView6 = liveCenterEntranceWidget.f16566h;
            if (imageView6 == null) {
                l.b();
            }
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(imageView6, "ScaleX", 1.5f, 1.6f);
            l.b(ofFloat9, "");
            ofFloat9.setDuration(120L);
            ofFloat9.setInterpolator(liveCenterEntranceWidget.f16571m);
            ImageView imageView7 = liveCenterEntranceWidget.f16566h;
            if (imageView7 == null) {
                l.b();
            }
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(imageView7, "ScaleY", 1.6f, 1.5f);
            l.b(ofFloat10, "");
            ofFloat10.setDuration(120L);
            ofFloat10.setInterpolator(liveCenterEntranceWidget.f16571m);
            animatorSet5.playTogether(ofFloat9, ofFloat10);
            animatorSet5.addListener(new e(liveCenterEntranceWidget));
            animatorSet.playSequentially(animatorSet3, animatorSet4, animatorSet5);
            animatorSet.start();
        }
    }
}

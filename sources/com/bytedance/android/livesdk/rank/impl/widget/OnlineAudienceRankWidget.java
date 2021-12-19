package com.bytedance.android.livesdk.rank.impl.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceAreaListSetting;
import com.bytedance.android.livesdk.rank.impl.a;
import com.bytedance.android.livesdk.rank.impl.b.a;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class OnlineAudienceRankWidget extends RoomRecycleWidget implements a.b, au {

    /* renamed from: a  reason: collision with root package name */
    public a.AbstractC0414a f21074a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f21075b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f21076c;

    /* renamed from: d  reason: collision with root package name */
    View f21077d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f21078e;

    /* renamed from: f  reason: collision with root package name */
    public LottieAnimationView f21079f;

    /* renamed from: g  reason: collision with root package name */
    public View f21080g;

    /* renamed from: h  reason: collision with root package name */
    public HSImageView f21081h;

    /* renamed from: i  reason: collision with root package name */
    int f21082i;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.android.livesdk.c.b f21083j;

    /* renamed from: k  reason: collision with root package name */
    com.bytedance.android.livesdk.rank.impl.a f21084k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f21085l = h.i.a((h.f.a.a) new h(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f21086m = h.i.a((h.f.a.a) new g(this));
    private final h.h n = h.i.a((h.f.a.a) new i(this));
    private boolean o;
    private boolean p;
    private f.a.b.a q;

    static {
        Covode.recordClassIndex(12443);
    }

    private final LinearLayout e() {
        return (LinearLayout) this.f21085l.getValue();
    }

    private final LiveTextView f() {
        return (LiveTextView) this.f21086m.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class m extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ OnlineAudienceRankWidget this$0;

        static {
            Covode.recordClassIndex(12458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            super(0);
            this.this$0 = onlineAudienceRankWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            a aVar;
            j.a.a.f fVar = new j.a.a.f();
            a.AbstractC0414a aVar2 = this.this$0.f21074a;
            if (aVar2 == null || (aVar = aVar2.a()) == null) {
                aVar = a.SELF_NON_ANCHOR_REVENUE;
            }
            DataChannel dataChannel = this.this$0.dataChannel;
            h.f.b.l.b(dataChannel, "");
            fVar.a(com.bytedance.android.livesdk.rank.api.model.a.class, new com.bytedance.android.livesdk.rank.impl.g.c(aVar, dataChannel));
            RecyclerView recyclerView = this.this$0.f21075b;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            }
            RecyclerView recyclerView2 = this.this$0.f21075b;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(fVar);
            }
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ OnlineAudienceRankWidget this$0;

        static {
            Covode.recordClassIndex(12452);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            super(0);
            this.this$0 = onlineAudienceRankWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            return this.this$0.findViewById(R.id.f3w);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ OnlineAudienceRankWidget this$0;

        static {
            Covode.recordClassIndex(12453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            super(0);
            this.this$0 = onlineAudienceRankWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.findViewById(R.id.cz8);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<ImageView> {
        final /* synthetic */ OnlineAudienceRankWidget this$0;

        static {
            Covode.recordClassIndex(12454);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            super(0);
            this.this$0 = onlineAudienceRankWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.findViewById(R.id.fk9);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.a.b
    public final void b() {
        RecyclerView recyclerView = this.f21075b;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.a.b
    public final void d() {
        com.bytedance.android.livesdk.rank.impl.a aVar = this.f21084k;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f21084k = null;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.a.b
    public final void c() {
        try {
            if (this.isViewValid) {
                RecyclerView recyclerView = this.f21075b;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        Object obj;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            obj = dataChannel.b(cp.class);
        } else {
            obj = null;
        }
        if (h.f.b.l.a(obj, (Object) true)) {
            return R.layout.bcm;
        }
        return R.layout.bcn;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        a.AbstractC0414a aVar = this.f21074a;
        if (aVar != null) {
            aVar.c();
        }
        this.o = false;
        this.f21075b = null;
        com.bytedance.android.livesdk.rank.impl.a aVar2 = this.f21084k;
        if (aVar2 != null) {
            aVar2.dismiss();
        }
        this.f21084k = null;
        this.q.a();
        com.bytedance.android.livesdk.rank.impl.c.a.a(-1);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.a.b
    public final void a() {
        try {
            if (this.isViewValid) {
                LiveTextView f2 = f();
                h.f.b.l.b(f2, "");
                f2.setText("0");
                LinearLayout e2 = e();
                h.f.b.l.b(e2, "");
                e2.setVisibility(8);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        } catch (IllegalStateException unused) {
        }
    }

    public OnlineAudienceRankWidget() {
        int i2;
        if (y.g()) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        this.f21082i = i2;
        this.p = y.g();
        this.f21083j = new com.bytedance.android.livesdk.c.b();
        this.q = new f.a.b.a();
    }

    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnlineAudienceRankWidget f21091a;

        static {
            Covode.recordClassIndex(12448);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f21092a;

            static {
                Covode.recordClassIndex(12449);
            }

            a(e eVar) {
                this.f21092a = eVar;
            }

            public final void run() {
                Context context;
                Context context2;
                Context context3;
                OnlineAudienceRankWidget onlineAudienceRankWidget = this.f21092a.f21091a;
                if (onlineAudienceRankWidget.f21076c != null && onlineAudienceRankWidget.f21077d != null && onlineAudienceRankWidget.f21080g != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    int[] iArr = new int[2];
                    iArr[0] = 0;
                    TextView textView = onlineAudienceRankWidget.f21076c;
                    if (textView != null) {
                        context = textView.getContext();
                    } else {
                        context = null;
                    }
                    iArr[1] = (int) ap.a(context, 54.0f);
                    ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(200L);
                    duration.addUpdateListener(new c(onlineAudienceRankWidget));
                    h.f.b.l.b(duration, "");
                    duration.setInterpolator(onlineAudienceRankWidget.f21083j);
                    View view = onlineAudienceRankWidget.f21080g;
                    if (view == null) {
                        h.f.b.l.b();
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "Alpha", 0.0f, 1.0f);
                    h.f.b.l.b(ofFloat, "");
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(onlineAudienceRankWidget.f21083j);
                    HSImageView hSImageView = onlineAudienceRankWidget.f21081h;
                    if (hSImageView == null) {
                        h.f.b.l.b();
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hSImageView, "Alpha", 1.0f, 0.0f);
                    h.f.b.l.b(ofFloat2, "");
                    ofFloat2.setDuration(200L);
                    ofFloat2.setInterpolator(onlineAudienceRankWidget.f21083j);
                    HSImageView hSImageView2 = onlineAudienceRankWidget.f21081h;
                    if (hSImageView2 == null) {
                        h.f.b.l.b();
                    }
                    float[] fArr = new float[2];
                    float f2 = (float) (onlineAudienceRankWidget.f21082i * -1);
                    HSImageView hSImageView3 = onlineAudienceRankWidget.f21081h;
                    if (hSImageView3 != null) {
                        context2 = hSImageView3.getContext();
                    } else {
                        context2 = null;
                    }
                    fArr[0] = f2 * ap.a(context2, 25.0f);
                    fArr[1] = 0.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(hSImageView2, "TranslationX", fArr);
                    h.f.b.l.b(ofFloat3, "");
                    ofFloat3.setDuration(200L);
                    ofFloat3.setInterpolator(onlineAudienceRankWidget.f21083j);
                    HSImageView hSImageView4 = onlineAudienceRankWidget.f21081h;
                    if (hSImageView4 == null) {
                        h.f.b.l.b();
                    }
                    float[] fArr2 = new float[2];
                    HSImageView hSImageView5 = onlineAudienceRankWidget.f21081h;
                    if (hSImageView5 != null) {
                        context3 = hSImageView5.getContext();
                    } else {
                        context3 = null;
                    }
                    fArr2[0] = ap.a(context3, 160.0f);
                    fArr2[1] = 0.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(hSImageView4, "TranslationY", fArr2);
                    h.f.b.l.b(ofFloat4, "");
                    ofFloat4.setDuration(200L);
                    ofFloat4.setInterpolator(onlineAudienceRankWidget.f21083j);
                    HSImageView hSImageView6 = onlineAudienceRankWidget.f21081h;
                    if (hSImageView6 == null) {
                        h.f.b.l.b();
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(hSImageView6, "ScaleX", 4.0f, 2.0f);
                    h.f.b.l.b(ofFloat5, "");
                    ofFloat5.setDuration(200L);
                    ofFloat5.setInterpolator(onlineAudienceRankWidget.f21083j);
                    HSImageView hSImageView7 = onlineAudienceRankWidget.f21081h;
                    if (hSImageView7 == null) {
                        h.f.b.l.b();
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(hSImageView7, "ScaleY", 4.0f, 2.0f);
                    h.f.b.l.b(ofFloat6, "");
                    ofFloat6.setDuration(200L);
                    ofFloat6.setInterpolator(onlineAudienceRankWidget.f21083j);
                    animatorSet.playTogether(duration, ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
                    animatorSet.addListener(new d(onlineAudienceRankWidget));
                    animatorSet.start();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f21091a = onlineAudienceRankWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            HSImageView hSImageView = this.f21091a.f21081h;
            if (hSImageView != null) {
                hSImageView.postDelayed(new a(this), 360);
            }
        }
    }

    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnlineAudienceRankWidget f21087a;

        static {
            Covode.recordClassIndex(12444);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f21087a = onlineAudienceRankWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            TextView textView = this.f21087a.f21078e;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public static final class d implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnlineAudienceRankWidget f21090a;

        static {
            Covode.recordClassIndex(12447);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f21090a = onlineAudienceRankWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            OnlineAudienceRankWidget onlineAudienceRankWidget = this.f21090a;
            AnimatorSet animatorSet = new AnimatorSet();
            TextView textView = onlineAudienceRankWidget.f21076c;
            if (textView == null) {
                h.f.b.l.b();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "Alpha", 0.0f, 1.0f);
            h.f.b.l.b(ofFloat, "");
            ofFloat.setDuration(160L);
            ofFloat.setInterpolator(onlineAudienceRankWidget.f21083j);
            View view = onlineAudienceRankWidget.f21077d;
            if (view == null) {
                h.f.b.l.b();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "Alpha", 0.0f, 1.0f);
            h.f.b.l.b(ofFloat2, "");
            ofFloat2.setDuration(160L);
            ofFloat2.setInterpolator(onlineAudienceRankWidget.f21083j);
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new j(onlineAudienceRankWidget));
            View view2 = onlineAudienceRankWidget.f21077d;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            animatorSet.start();
        }
    }

    public static final class j implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnlineAudienceRankWidget f21096a;

        static {
            Covode.recordClassIndex(12455);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f21096a = onlineAudienceRankWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            OnlineAudienceRankWidget onlineAudienceRankWidget = this.f21096a;
            ValueAnimator duration = ValueAnimator.ofInt(0, 1240).setDuration(1240L);
            duration.addListener(new k(onlineAudienceRankWidget));
            duration.start();
            HSImageView hSImageView = this.f21096a.f21081h;
            if (hSImageView != null) {
                hSImageView.setVisibility(8);
            }
            LottieAnimationView lottieAnimationView = this.f21096a.f21079f;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(0);
            }
            LottieAnimationView lottieAnimationView2 = this.f21096a.f21079f;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.a();
            }
        }
    }

    public static final class k implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnlineAudienceRankWidget f21097a;

        static {
            Covode.recordClassIndex(12456);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f21097a = onlineAudienceRankWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            LottieAnimationView lottieAnimationView = this.f21097a.f21079f;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(8);
            }
            if (this.f21097a.f21078e != null && this.f21097a.f21076c != null) {
                this.f21097a.a(0L);
                TextView textView = this.f21097a.f21078e;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                TextView textView2 = this.f21097a.f21078e;
                if (textView2 == null) {
                    h.f.b.l.b();
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, "Alpha", 0.0f, 1.0f);
                h.f.b.l.b(ofFloat, "");
                ofFloat.setDuration(80L);
                ofFloat.setInterpolator(this.f21097a.f21083j);
                TextView textView3 = this.f21097a.f21076c;
                if (textView3 == null) {
                    h.f.b.l.b();
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, "Alpha", 1.0f, 0.0f);
                h.f.b.l.b(ofFloat2, "");
                ofFloat2.setDuration(80L);
                ofFloat2.setInterpolator(this.f21097a.f21083j);
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.start();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        a.AbstractC0414a aVar = this.f21074a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget
    public final void onVisibilityToUser(boolean z) {
        super.onVisibilityToUser(z);
        a.AbstractC0414a aVar = this.f21074a;
        if (aVar != null) {
            aVar.b(z);
        }
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnlineAudienceRankWidget f21088a;

        static {
            Covode.recordClassIndex(12445);
        }

        b(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f21088a = onlineAudienceRankWidget;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            ViewGroup.LayoutParams layoutParams3;
            TextView textView = this.f21088a.f21076c;
            if (!(textView == null || (layoutParams3 = textView.getLayoutParams()) == null)) {
                h.f.b.l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams3.width = ((Integer) animatedValue).intValue();
            }
            TextView textView2 = this.f21088a.f21076c;
            if (textView2 != null) {
                textView2.requestLayout();
            }
            View view = this.f21088a.f21080g;
            if (!(view == null || (layoutParams2 = view.getLayoutParams()) == null)) {
                h.f.b.l.b(valueAnimator, "");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                layoutParams2.width = ((Integer) animatedValue2).intValue();
            }
            View view2 = this.f21088a.f21080g;
            if (view2 != null) {
                view2.requestLayout();
            }
            TextView textView3 = this.f21088a.f21078e;
            if (!(textView3 == null || (layoutParams = textView3.getLayoutParams()) == null)) {
                h.f.b.l.b(valueAnimator, "");
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.width = ((Integer) animatedValue3).intValue();
            }
            TextView textView4 = this.f21088a.f21078e;
            if (textView4 != null) {
                textView4.requestLayout();
            }
        }
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnlineAudienceRankWidget f21089a;

        static {
            Covode.recordClassIndex(12446);
        }

        c(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f21089a = onlineAudienceRankWidget;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            TextView textView = this.f21089a.f21076c;
            if (!(textView == null || (layoutParams2 = textView.getLayoutParams()) == null)) {
                h.f.b.l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams2.width = ((Integer) animatedValue).intValue();
            }
            TextView textView2 = this.f21089a.f21076c;
            if (textView2 != null) {
                textView2.requestLayout();
            }
            View view = this.f21089a.f21080g;
            if (!(view == null || (layoutParams = view.getLayoutParams()) == null)) {
                h.f.b.l.b(valueAnimator, "");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.width = ((Integer) animatedValue2).intValue();
            }
            View view2 = this.f21089a.f21080g;
            if (view2 != null) {
                view2.requestLayout();
            }
        }
    }

    public final void a(long j2) {
        String string;
        TextView textView = this.f21078e;
        if (textView != null) {
            if (!this.p) {
                Context context = getContext();
                h.f.b.l.b(context, "");
                string = context.getResources().getString(R.string.ehu, ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).getAmountString(j2));
            } else {
                Context context2 = getContext();
                h.f.b.l.b(context2, "");
                string = context2.getResources().getString(R.string.ehv, ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).getAmountString(j2));
            }
            textView.setText(string);
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnlineAudienceRankWidget f21098a;

        static {
            Covode.recordClassIndex(12457);
        }

        l(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f21098a = onlineAudienceRankWidget;
        }

        public final void onClick(View view) {
            Object obj;
            a aVar;
            OnlineAudienceRankWidget onlineAudienceRankWidget = this.f21098a;
            try {
                if (!onlineAudienceRankWidget.isViewValid) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (onlineAudienceRankWidget.dataChannel != null) {
                    androidx.fragment.app.i iVar = (androidx.fragment.app.i) onlineAudienceRankWidget.dataChannel.b(ao.class);
                    if (iVar != null) {
                        a.AbstractC0414a aVar2 = onlineAudienceRankWidget.f21074a;
                        int i2 = 0;
                        if (aVar2 == null || !aVar2.b()) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        DataChannel dataChannel = onlineAudienceRankWidget.dataChannel;
                        com.bytedance.android.livesdk.rank.impl.a aVar3 = null;
                        if (dataChannel != null) {
                            obj = dataChannel.b(ee.class);
                        } else {
                            obj = null;
                        }
                        if (h.f.b.l.a(obj, (Object) true)) {
                            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                            if (room != null) {
                                long id = room.getId();
                                long ownerUserId = room.getOwnerUserId();
                                if (id > 0 && ownerUserId > 0) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("room_id", String.valueOf(id));
                                    linkedHashMap.put("anchor_id", String.valueOf(ownerUserId));
                                    b.a.a("anchor_click_active_user_rank").a().a((Map<String, String>) linkedHashMap).b();
                                }
                            }
                            a aVar4 = a.BOTH_REVENUE;
                            a.AbstractC0414a aVar5 = onlineAudienceRankWidget.f21074a;
                            if (aVar5 != null) {
                                i2 = aVar5.d();
                            }
                            aVar3 = a.C0413a.a(aVar4, i2);
                        } else {
                            a.AbstractC0414a aVar6 = onlineAudienceRankWidget.f21074a;
                            if (aVar6 != null) {
                                aVar = aVar6.a();
                            } else {
                                aVar = null;
                            }
                            if (aVar == a.BOTH_REVENUE) {
                                a aVar7 = a.BOTH_REVENUE;
                                a.AbstractC0414a aVar8 = onlineAudienceRankWidget.f21074a;
                                if (aVar8 != null) {
                                    i2 = aVar8.d();
                                }
                                aVar3 = a.C0413a.a(aVar7, i2);
                            }
                        }
                        onlineAudienceRankWidget.f21084k = aVar3;
                        com.bytedance.android.livesdk.rank.impl.a aVar9 = onlineAudienceRankWidget.f21084k;
                        if (aVar9 != null) {
                            String name = iVar.getClass().getName();
                            h.f.b.l.b(name, "");
                            aVar9.show(iVar, name);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.a.b
    public final void a(int i2) {
        Object obj;
        try {
            if (isViewValid()) {
                com.bytedance.android.livesdk.rank.impl.c.a.a(i2);
                LinearLayout e2 = e();
                h.f.b.l.b(e2, "");
                int i3 = 0;
                e2.setVisibility(0);
                LiveTextView f2 = f();
                h.f.b.l.b(f2, "");
                String a2 = aa.a((long) i2);
                h.f.b.l.b(a2, "");
                Locale locale = Locale.ENGLISH;
                h.f.b.l.b(locale, "");
                Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
                String upperCase = a2.toUpperCase(locale);
                h.f.b.l.b(upperCase, "");
                f2.setText(upperCase);
                ImageView imageView = (ImageView) this.n.getValue();
                h.f.b.l.b(imageView, "");
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    obj = dataChannel.b(ee.class);
                } else {
                    obj = null;
                }
                if (h.f.b.l.a(obj, (Object) true) || (!(!h.f.b.l.a(this.dataChannel.b(cp.class), (Object) true)) && LiveAudienceAreaListSetting.INSTANCE.getValue())) {
                    i3 = 8;
                }
                imageView.setVisibility(i3);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Object obj;
        View view;
        try {
            if (this.dataChannel != null) {
                DataChannel dataChannel = this.dataChannel;
                h.f.b.l.b(dataChannel, "");
                com.bytedance.android.livesdk.rank.impl.e.b bVar = new com.bytedance.android.livesdk.rank.impl.e.b(dataChannel);
                this.f21074a = bVar;
                bVar.a(this);
                this.o = false;
                this.f21079f = (LottieAnimationView) findViewById(R.id.uk);
                this.f21081h = (HSImageView) findViewById(R.id.d6t);
                LinearLayout e2 = e();
                e2.setVisibility(8);
                e2.setOnClickListener(new l(this));
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    obj = dataChannel2.b(cp.class);
                } else {
                    obj = null;
                }
                if (h.f.b.l.a(obj, (Object) true)) {
                    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.drq);
                    this.f21075b = recyclerView;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                        recyclerView.setClickable(false);
                    }
                }
                this.f21076c = (TextView) findViewById(R.id.d6p);
                this.f21077d = findViewById(R.id.d6s);
                this.f21078e = (TextView) findViewById(R.id.d6q);
                this.f21080g = findViewById(R.id.d6r);
                if (y.g() && (view = this.f21080g) != null) {
                    view.setBackground(y.c(2131234199));
                }
                this.q.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.rank.api.a.a.class).d(new f(this)));
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (IllegalStateException unused) {
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnlineAudienceRankWidget f21093a;

        static {
            Covode.recordClassIndex(12450);
        }

        f(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f21093a = onlineAudienceRankWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Context context;
            final com.bytedance.android.livesdk.rank.api.a.a aVar = (com.bytedance.android.livesdk.rank.api.a.a) obj;
            int i2 = aVar.f20582b;
            if (i2 == 1) {
                TextView textView = this.f21093a.f21076c;
                if (textView != null) {
                    textView.postDelayed(new Runnable(this) {
                        /* class com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget.f.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ f f21094a;

                        static {
                            Covode.recordClassIndex(12451);
                        }

                        {
                            this.f21094a = r1;
                        }

                        public final void run() {
                            Context context;
                            Context context2;
                            Context context3;
                            Context context4;
                            OnlineAudienceRankWidget onlineAudienceRankWidget = this.f21094a.f21093a;
                            com.bytedance.android.livesdk.rank.api.a.a aVar = aVar;
                            h.f.b.l.b(aVar, "");
                            HSImageView hSImageView = onlineAudienceRankWidget.f21081h;
                            if (hSImageView != null) {
                                com.bytedance.android.live.core.f.k.a(hSImageView, "tiktok_live_basic_resource", aVar.f20581a);
                            }
                            HSImageView hSImageView2 = onlineAudienceRankWidget.f21081h;
                            if (hSImageView2 != null) {
                                hSImageView2.setVisibility(0);
                            }
                            AnimatorSet animatorSet = new AnimatorSet();
                            HSImageView hSImageView3 = onlineAudienceRankWidget.f21081h;
                            if (hSImageView3 == null) {
                                h.f.b.l.b();
                            }
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hSImageView3, "Alpha", 0.0f, 1.0f);
                            h.f.b.l.b(ofFloat, "");
                            ofFloat.setDuration(200L);
                            ofFloat.setInterpolator(onlineAudienceRankWidget.f21083j);
                            HSImageView hSImageView4 = onlineAudienceRankWidget.f21081h;
                            if (hSImageView4 == null) {
                                h.f.b.l.b();
                            }
                            float[] fArr = new float[2];
                            HSImageView hSImageView5 = onlineAudienceRankWidget.f21081h;
                            if (hSImageView5 != null) {
                                context = hSImageView5.getContext();
                            } else {
                                context = null;
                            }
                            fArr[0] = ap.a(context, 160.0f);
                            HSImageView hSImageView6 = onlineAudienceRankWidget.f21081h;
                            if (hSImageView6 != null) {
                                context2 = hSImageView6.getContext();
                            } else {
                                context2 = null;
                            }
                            fArr[1] = ap.a(context2, 160.0f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hSImageView4, "TranslationY", fArr);
                            h.f.b.l.b(ofFloat2, "");
                            ofFloat2.setDuration(200L);
                            ofFloat2.setInterpolator(onlineAudienceRankWidget.f21083j);
                            HSImageView hSImageView7 = onlineAudienceRankWidget.f21081h;
                            if (hSImageView7 == null) {
                                h.f.b.l.b();
                            }
                            float[] fArr2 = new float[2];
                            float f2 = (float) onlineAudienceRankWidget.f21082i;
                            HSImageView hSImageView8 = onlineAudienceRankWidget.f21081h;
                            if (hSImageView8 != null) {
                                context3 = hSImageView8.getContext();
                            } else {
                                context3 = null;
                            }
                            fArr2[0] = f2 * ap.a(context3, 150.0f);
                            float f3 = (float) (onlineAudienceRankWidget.f21082i * -1);
                            HSImageView hSImageView9 = onlineAudienceRankWidget.f21081h;
                            if (hSImageView9 != null) {
                                context4 = hSImageView9.getContext();
                            } else {
                                context4 = null;
                            }
                            fArr2[1] = f3 * ap.a(context4, 25.0f);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(hSImageView7, "TranslationX", fArr2);
                            h.f.b.l.b(ofFloat3, "");
                            ofFloat3.setDuration(200L);
                            ofFloat3.setInterpolator(onlineAudienceRankWidget.f21083j);
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            AnimatorSet animatorSet4 = new AnimatorSet();
                            HSImageView hSImageView10 = onlineAudienceRankWidget.f21081h;
                            if (hSImageView10 == null) {
                                h.f.b.l.b();
                            }
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(hSImageView10, "ScaleX", 6.0f, 6.0f);
                            h.f.b.l.b(ofFloat4, "");
                            ofFloat4.setDuration(80L);
                            ofFloat4.setInterpolator(onlineAudienceRankWidget.f21083j);
                            HSImageView hSImageView11 = onlineAudienceRankWidget.f21081h;
                            if (hSImageView11 == null) {
                                h.f.b.l.b();
                            }
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(hSImageView11, "ScaleX", 6.0f, 6.0f);
                            h.f.b.l.b(ofFloat5, "");
                            ofFloat5.setDuration(80L);
                            ofFloat5.setInterpolator(onlineAudienceRankWidget.f21083j);
                            HSImageView hSImageView12 = onlineAudienceRankWidget.f21081h;
                            if (hSImageView12 == null) {
                                h.f.b.l.b();
                            }
                            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(hSImageView12, "ScaleX", 6.0f, 4.0f);
                            h.f.b.l.b(ofFloat6, "");
                            ofFloat6.setDuration(120L);
                            ofFloat6.setInterpolator(onlineAudienceRankWidget.f21083j);
                            HSImageView hSImageView13 = onlineAudienceRankWidget.f21081h;
                            if (hSImageView13 == null) {
                                h.f.b.l.b();
                            }
                            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(hSImageView13, "ScaleY", 6.0f, 4.0f);
                            h.f.b.l.b(ofFloat7, "");
                            ofFloat7.setDuration(120L);
                            ofFloat7.setInterpolator(onlineAudienceRankWidget.f21083j);
                            animatorSet4.playTogether(ofFloat6, ofFloat7);
                            animatorSet3.playTogether(ofFloat4, ofFloat5);
                            animatorSet2.playSequentially(animatorSet3, animatorSet4);
                            HSImageView hSImageView14 = onlineAudienceRankWidget.f21081h;
                            if (hSImageView14 != null) {
                                hSImageView14.setVisibility(0);
                            }
                            animatorSet.playTogether(ofFloat, animatorSet2, ofFloat2, ofFloat3);
                            animatorSet.addListener(new e(onlineAudienceRankWidget));
                            animatorSet.start();
                        }
                    }, 1000);
                }
            } else if (i2 == 2) {
                this.f21093a.a(aVar.f20583c);
            } else if (i2 == 3) {
                OnlineAudienceRankWidget onlineAudienceRankWidget = this.f21093a;
                if (onlineAudienceRankWidget.f21080g != null && onlineAudienceRankWidget.f21078e != null && onlineAudienceRankWidget.f21077d != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    View view = onlineAudienceRankWidget.f21080g;
                    if (view == null) {
                        h.f.b.l.b();
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "Alpha", 1.0f, 0.2f);
                    h.f.b.l.b(ofFloat, "");
                    ofFloat.setDuration(240L);
                    ofFloat.setInterpolator(onlineAudienceRankWidget.f21083j);
                    View view2 = onlineAudienceRankWidget.f21080g;
                    if (view2 == null) {
                        h.f.b.l.b();
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "Alpha", 0.2f, 1.0f);
                    h.f.b.l.b(ofFloat2, "");
                    ofFloat2.setDuration(80L);
                    ofFloat2.setInterpolator(onlineAudienceRankWidget.f21083j);
                    View view3 = onlineAudienceRankWidget.f21080g;
                    if (view3 == null) {
                        h.f.b.l.b();
                    }
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, "Alpha", 1.0f, 0.2f);
                    h.f.b.l.b(ofFloat3, "");
                    ofFloat3.setDuration(240L);
                    ofFloat3.setInterpolator(onlineAudienceRankWidget.f21083j);
                    View view4 = onlineAudienceRankWidget.f21080g;
                    if (view4 == null) {
                        h.f.b.l.b();
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view4, "Alpha", 0.2f, 1.0f);
                    h.f.b.l.b(ofFloat4, "");
                    ofFloat4.setDuration(80L);
                    ofFloat4.setInterpolator(onlineAudienceRankWidget.f21083j);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    View view5 = onlineAudienceRankWidget.f21080g;
                    if (view5 == null) {
                        h.f.b.l.b();
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view5, "Alpha", 1.0f, 0.0f);
                    h.f.b.l.b(ofFloat5, "");
                    ofFloat5.setDuration(80L);
                    ofFloat5.setInterpolator(onlineAudienceRankWidget.f21083j);
                    TextView textView2 = onlineAudienceRankWidget.f21078e;
                    if (textView2 == null) {
                        h.f.b.l.b();
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, "Alpha", 1.0f, 0.0f);
                    h.f.b.l.b(ofFloat6, "");
                    ofFloat6.setDuration(80L);
                    ofFloat6.setInterpolator(onlineAudienceRankWidget.f21083j);
                    ofFloat6.addListener(new a(onlineAudienceRankWidget));
                    View view6 = onlineAudienceRankWidget.f21077d;
                    if (view6 == null) {
                        h.f.b.l.b();
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view6, "Alpha", 1.0f, 0.0f);
                    h.f.b.l.b(ofFloat7, "");
                    ofFloat7.setDuration(80L);
                    ofFloat7.setInterpolator(onlineAudienceRankWidget.f21083j);
                    int[] iArr = new int[2];
                    TextView textView3 = onlineAudienceRankWidget.f21076c;
                    if (textView3 != null) {
                        context = textView3.getContext();
                    } else {
                        context = null;
                    }
                    iArr[0] = (int) ap.a(context, 54.0f);
                    iArr[1] = 0;
                    ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(80L);
                    duration.addUpdateListener(new b(onlineAudienceRankWidget));
                    h.f.b.l.b(duration, "");
                    duration.setInterpolator(onlineAudienceRankWidget.f21083j);
                    animatorSet2.playTogether(ofFloat5, ofFloat6, ofFloat7, duration);
                    animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4, animatorSet2);
                    animatorSet.start();
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.a.b
    public final void a(List<com.bytedance.android.livesdk.rank.api.model.a> list) {
        RecyclerView.a aVar;
        h.f.b.l.d(list, "");
        m mVar = new m(this);
        try {
            if (!isViewValid()) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (this.context != null) {
                if (!this.o) {
                    mVar.a();
                    RecyclerView recyclerView = this.f21075b;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                        recyclerView.setClickable(true);
                    }
                    this.o = true;
                }
                RecyclerView recyclerView2 = this.f21075b;
                j.a.a.f fVar = null;
                if (recyclerView2 != null) {
                    aVar = recyclerView2.getAdapter();
                } else {
                    aVar = null;
                }
                if (aVar instanceof j.a.a.f) {
                    fVar = aVar;
                }
                j.a.a.f fVar2 = fVar;
                if (fVar2 != null) {
                    fVar2.a(list);
                    fVar2.notifyDataSetChanged();
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }
}

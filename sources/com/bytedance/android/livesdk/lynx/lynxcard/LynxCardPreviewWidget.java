package com.bytedance.android.livesdk.lynx.lynxcard;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ao;
import com.bytedance.android.livesdk.browser.g;
import com.bytedance.android.livesdk.container.k.c;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxCardConfig;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxCardPriority;
import com.bytedance.android.livesdk.lynx.lynxcard.e;
import com.bytedance.android.livesdk.model.ShortTouchItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public final class LynxCardPreviewWidget extends LiveRecyclableWidget implements au {

    /* renamed from: e  reason: collision with root package name */
    public static final a f18767e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f18768a;

    /* renamed from: b  reason: collision with root package name */
    public final Queue<a> f18769b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    public final Handler f18770c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f18771d;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f18772f = new e(this);

    static {
        Covode.recordClassIndex(11111);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bcg;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(11112);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxCardPreviewWidget f18780a;

        static {
            Covode.recordClassIndex(11114);
        }

        c(LynxCardPreviewWidget lynxCardPreviewWidget) {
            this.f18780a = lynxCardPreviewWidget;
        }

        public final void run() {
            this.f18780a.a();
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxCardPreviewWidget f18782a;

        static {
            Covode.recordClassIndex(11117);
        }

        e(LynxCardPreviewWidget lynxCardPreviewWidget) {
            this.f18782a = lynxCardPreviewWidget;
        }

        public final void run() {
            this.f18782a.f18768a = false;
            this.f18782a.a();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        this.f18768a = false;
        this.f18769b.clear();
        this.f18770c.removeCallbacksAndMessages(null);
    }

    public final void b() {
        this.f18770c.removeCallbacks(this.f18772f);
        this.f18770c.postDelayed(this.f18772f, 660);
    }

    public final void a() {
        MethodCollector.i(8876);
        if (this.f18768a) {
            MethodCollector.o(8876);
            return;
        }
        this.f18768a = true;
        a poll = this.f18769b.poll();
        if (poll == null) {
            this.f18768a = false;
            MethodCollector.o(8876);
        } else if (g.b.f14420a.a(poll.f18788a.getContainerId()) == null) {
            if (poll.f18789b != null && (poll.f18789b instanceof com.bytedance.android.livesdk.container.k.c)) {
                g.b.f14420a.a(poll.f18789b);
            }
            b();
            MethodCollector.o(8876);
        } else if (poll.f18789b == null) {
            a(poll.f18788a, poll.f18790c);
            b();
            MethodCollector.o(8876);
        } else {
            View view = poll.f18789b;
            if (view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
                HashMap hashMap = new HashMap();
                String stackTraceString = Log.getStackTraceString(new Throwable(""));
                l.b(stackTraceString, "");
                hashMap.put("stack_trace", stackTraceString);
                com.bytedance.android.live.core.d.c.a("ttlive_lynx_card_preview_widget_success_message", 0, hashMap);
                LinearLayout linearLayout = this.f18771d;
                if (linearLayout == null) {
                    l.a("container");
                }
                linearLayout.addView(view);
                LinearLayout linearLayout2 = this.f18771d;
                if (linearLayout2 == null) {
                    l.a("container");
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout2, View.TRANSLATION_X, (float) y.a(-82.0f), 0.0f);
                ofFloat.setDuration(480L);
                ofFloat.setInterpolator(androidx.core.h.b.b.a(0.41f, 1.44f, 0.42f, 1.0f));
                LinearLayout linearLayout3 = this.f18771d;
                if (linearLayout3 == null) {
                    l.a("container");
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout3, View.ALPHA, 1.0f, 1.0f);
                ofFloat2.setDuration(660L);
                LinearLayout linearLayout4 = this.f18771d;
                if (linearLayout4 == null) {
                    l.a("container");
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(linearLayout4, View.SCALE_X, 1.0f, 0.0f);
                ofFloat3.setDuration(460L);
                ofFloat3.setInterpolator(androidx.core.h.b.b.a(1.0f, -0.62f, 0.63f, 0.9f));
                LinearLayout linearLayout5 = this.f18771d;
                if (linearLayout5 == null) {
                    l.a("container");
                }
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(linearLayout5, View.SCALE_Y, 1.0f, 0.0f);
                ofFloat4.setDuration(460L);
                ofFloat4.setInterpolator(androidx.core.h.b.b.a(1.0f, -0.62f, 0.63f, 0.9f));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.addListener(new b(this, view, poll, ofFloat, ofFloat2, ofFloat3, ofFloat4));
                animatorSet.play(ofFloat).before(ofFloat2);
                animatorSet.play(ofFloat2).before(ofFloat3);
                animatorSet.play(ofFloat3).with(ofFloat4);
                animatorSet.start();
                MethodCollector.o(8876);
                return;
            }
            HashMap hashMap2 = new HashMap();
            String name = view.getParent().getClass().getName();
            l.b(name, "");
            hashMap2.put("old_parent", name);
            LinearLayout linearLayout6 = this.f18771d;
            if (linearLayout6 == null) {
                l.a("container");
            }
            String name2 = linearLayout6.getClass().getName();
            l.b(name2, "");
            hashMap2.put("container", name2);
            ViewParent parent = view.getParent();
            LinearLayout linearLayout7 = this.f18771d;
            if (linearLayout7 == null) {
                l.a("container");
            }
            hashMap2.put("is_equal", Boolean.valueOf(l.a(parent, linearLayout7)));
            String stackTraceString2 = Log.getStackTraceString(new Throwable(""));
            l.b(stackTraceString2, "");
            hashMap2.put("stack_trace", stackTraceString2);
            com.bytedance.android.live.core.d.c.a("ttlive_lynx_card_preview_widget_error_message", 1, hashMap2);
            b();
            MethodCollector.o(8876);
        }
    }

    public static final /* synthetic */ LinearLayout a(LynxCardPreviewWidget lynxCardPreviewWidget) {
        LinearLayout linearLayout = lynxCardPreviewWidget.f18771d;
        if (linearLayout == null) {
            l.a("container");
        }
        return linearLayout;
    }

    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxCardPreviewWidget f18773a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f18774b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f18775c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ObjectAnimator f18776d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ObjectAnimator f18777e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ObjectAnimator f18778f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ObjectAnimator f18779g;

        static {
            Covode.recordClassIndex(11113);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            ViewParent parent = LynxCardPreviewWidget.a(this.f18773a).getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setVisibility(8);
        }

        public final void onAnimationStart(Animator animator) {
            ViewParent parent = LynxCardPreviewWidget.a(this.f18773a).getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setVisibility(0);
            LynxCardPreviewWidget.a(this.f18773a).setAlpha(1.0f);
            LynxCardPreviewWidget.a(this.f18773a).setScaleX(1.0f);
            LynxCardPreviewWidget.a(this.f18773a).setScaleY(1.0f);
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.i(8181);
            ViewParent parent = LynxCardPreviewWidget.a(this.f18773a).getParent();
            if (parent != null) {
                ((ViewGroup) parent).setVisibility(8);
                LynxCardPreviewWidget.a(this.f18773a).setAlpha(1.0f);
                LynxCardPreviewWidget.a(this.f18773a).setScaleX(1.0f);
                LynxCardPreviewWidget.a(this.f18773a).setScaleY(1.0f);
                LynxCardPreviewWidget.a(this.f18773a).removeView(this.f18774b);
                if (this.f18774b instanceof com.bytedance.android.livesdk.container.k.c) {
                    g.b.f14420a.a(this.f18774b);
                }
                this.f18773a.a(this.f18775c.f18788a, this.f18775c.f18790c);
                this.f18773a.b();
                MethodCollector.o(8181);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.o(8181);
            throw nullPointerException;
        }

        b(LynxCardPreviewWidget lynxCardPreviewWidget, View view, a aVar, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, ObjectAnimator objectAnimator3, ObjectAnimator objectAnimator4) {
            this.f18773a = lynxCardPreviewWidget;
            this.f18774b = view;
            this.f18775c = aVar;
            this.f18776d = objectAnimator;
            this.f18777e = objectAnimator2;
            this.f18778f = objectAnimator3;
            this.f18779g = objectAnimator4;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<e, z> {
        final /* synthetic */ LynxCardPreviewWidget this$0;

        static {
            Covode.recordClassIndex(11115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LynxCardPreviewWidget lynxCardPreviewWidget) {
            super(1);
            this.this$0 = lynxCardPreviewWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e.a aVar;
            e eVar2 = eVar;
            l.d(eVar2, "");
            if (TextUtils.equals(eVar2.f18795a.getHost(), com.bytedance.android.livesdk.container.d.b.f16785f)) {
                Context context = this.this$0.context;
                l.b(context, "");
                com.bytedance.android.livesdk.container.k.c a2 = c.a.a(context, eVar2.f18795a, eVar2.f18799e);
                if (!(eVar2.f18798d == null || (aVar = eVar2.f18798d) == null)) {
                    aVar.a(a2.getContainerId());
                }
                this.this$0.f18769b.offer(new a(a2, eVar2.f18796b, eVar2.f18797c));
                this.this$0.f18770c.postDelayed(new Runnable(this) {
                    /* class com.bytedance.android.livesdk.lynx.lynxcard.LynxCardPreviewWidget.d.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f18781a;

                    static {
                        Covode.recordClassIndex(11116);
                    }

                    {
                        this.f18781a = r1;
                    }

                    public final void run() {
                        this.f18781a.this$0.a();
                    }
                }, 660);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        ViewGroup.LayoutParams layoutParams;
        View view = getView();
        ViewGroup.LayoutParams layoutParams2 = null;
        if (!(view == null || (layoutParams = view.getLayoutParams()) == null)) {
            layoutParams.width = y.a((float) LynxCardConfig.INSTANCE.getPreviewWidth());
            layoutParams.height = y.a((float) LynxCardConfig.INSTANCE.getPreviewHeight());
        }
        View view2 = getView();
        if (view2 != null) {
            layoutParams2 = view2.getLayoutParams();
        }
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.topMargin = y.a((float) LynxCardConfig.INSTANCE.getPreviewTopMargin());
        marginLayoutParams.setMarginStart(y.a((float) LynxCardConfig.INSTANCE.getPreviewStartMargin()));
        View view3 = getView();
        if (view3 == null) {
            l.b();
        }
        View findViewById = view3.findViewById(R.id.ad7);
        l.b(findViewById, "");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        this.f18771d = linearLayout;
        if (linearLayout == null) {
            l.a("container");
        }
        ViewParent parent = linearLayout.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).setVisibility(8);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        List<ShortTouchItem> list;
        this.f18770c.removeCallbacksAndMessages(null);
        Room room = (Room) this.dataChannel.b(df.class);
        if (!(room == null || (list = room.shortTouchItems) == null || list.size() <= 0)) {
            for (ShortTouchItem shortTouchItem : list) {
                if (shortTouchItem.schema != null) {
                    Uri parse = Uri.parse(shortTouchItem.schema);
                    l.b(parse, "");
                    if (TextUtils.equals(parse.getHost(), com.bytedance.android.livesdk.container.d.b.f16785f)) {
                        Context context = this.context;
                        l.b(context, "");
                        Uri parse2 = Uri.parse(shortTouchItem.schema);
                        l.b(parse2, "");
                        com.bytedance.android.livesdk.container.k.c a2 = c.a.a(context, parse2, false);
                        if (shortTouchItem.previewSetting == null || shortTouchItem.previewSetting.f19012a == null) {
                            this.f18769b.offer(new a(a2, null, LynxCardPriority.INSTANCE.getPriority(shortTouchItem.name)));
                        } else {
                            Context context2 = this.context;
                            l.b(context2, "");
                            Uri parse3 = Uri.parse(shortTouchItem.previewSetting.f19012a);
                            l.b(parse3, "");
                            com.bytedance.android.livesdk.container.k.c a3 = c.a.a(context2, parse3, true);
                            a3.setLayoutParams(new LinearLayout.LayoutParams(y.a((float) LynxCardConfig.INSTANCE.getPreviewWidth()), y.a((float) LynxCardConfig.INSTANCE.getPreviewHeight())));
                            a3.setPreview(true);
                            this.f18769b.offer(new a(a2, a3, LynxCardPriority.INSTANCE.getPriority(shortTouchItem.name)));
                        }
                    }
                }
            }
        }
        this.f18770c.postDelayed(new c(this), 660);
        DataChannelGlobal.f34575d.a(this, this, com.bytedance.android.livesdk.a.class, new d(this));
    }

    public final void a(com.bytedance.android.livesdk.container.k.c cVar, int i2) {
        if (!this.isDestroyed) {
            this.dataChannel.c(ao.class, new c(cVar, i2));
        }
    }
}

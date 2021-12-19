package com.bytedance.android.livesdk.container.k;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ax;
import com.bytedance.android.livesdk.browser.g;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.n;
import com.bytedance.android.livesdk.container.config.base.CardConfig;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxCardConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.x;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.Objects;

public final class c extends FrameLayout implements com.bytedance.android.livesdk.container.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f16841e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public CardConfig f16842b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16843c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16844d;

    /* renamed from: f  reason: collision with root package name */
    private final h f16845f;

    /* renamed from: g  reason: collision with root package name */
    private final b f16846g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f16847h;

    static {
        Covode.recordClassIndex(9347);
    }

    public final String getContainerId() {
        return (String) this.f16845f.getValue();
    }

    public final Fragment getFragment() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9348);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static c a(Context context, Uri uri, boolean z) {
            l.d(context, "");
            l.d(uri, "");
            if (com.bytedance.android.livesdk.container.j.a.f16802b.contains(uri.getHost())) {
                uri = uri.buildUpon().appendQueryParameter("init_time", String.valueOf(System.currentTimeMillis())).build();
            }
            CardConfig cardConfig = new CardConfig(uri);
            c cVar = new c(context, (byte) 0);
            cVar.setConfig(cardConfig);
            if (z) {
                cVar.a();
            }
            g gVar = g.b.f14420a;
            String containerId = cVar.getContainerId();
            l.d(containerId, "");
            l.d(cVar, "");
            gVar.f14417a.put(containerId, cVar);
            return cVar;
        }
    }

    public final b getHybridView() {
        return this.f16846g;
    }

    public final boolean getInitFinished() {
        return this.f16847h;
    }

    @Override // com.bytedance.android.livesdk.container.b
    public final String getHybridContainerId() {
        return getContainerId();
    }

    public final CardConfig getConfig() {
        CardConfig cardConfig = this.f16842b;
        if (cardConfig == null) {
            l.a("config");
        }
        return cardConfig;
    }

    static final class b extends m implements h.f.a.a<String> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(9349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (this.this$0.getConfig().getEngineType() == com.bytedance.android.livesdk.container.d.a.LYNX) {
                return com.bytedance.android.livesdk.browser.c.b();
            }
            return com.bytedance.android.livesdk.browser.c.a();
        }
    }

    @Override // com.bytedance.android.livesdk.container.b
    public final void b() {
        DataChannelGlobal.f34575d.c(ax.class, getContainerId());
        this.f16846g.c();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f16843c) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) y.a((float) LynxCardConfig.INSTANCE.getItemWidth()));
            ofFloat.setDuration(200L);
            ofFloat.addListener(new C0343c(this));
            ofFloat.addUpdateListener(new d(this));
            ofFloat.start();
            return;
        }
        this.f16844d = true;
    }

    public final void a() {
        x xVar;
        b bVar = this.f16846g;
        CardConfig cardConfig = this.f16842b;
        if (cardConfig == null) {
            l.a("config");
        }
        bVar.setConfig(cardConfig);
        bVar.setContainerId(getContainerId());
        this.f16846g.a();
        this.f16846g.b();
        b bVar2 = this.f16846g;
        Context context = getContext();
        l.b(context, "");
        bVar2.setBackgroundColor(context.getResources().getColor(R.color.c9));
        com.bytedance.android.livesdk.browser.jsbridge.c cVar = this.f16846g.getComponent().f16750a;
        if (!(cVar == null || (xVar = cVar.f14451b) == null)) {
            xVar.a("close", (f<?, ?>) new n(this));
        }
        addView(this.f16846g);
        this.f16847h = true;
    }

    public final void setAnimatorFinished(boolean z) {
        this.f16844d = z;
    }

    public final void setInitFinished(boolean z) {
        this.f16847h = z;
    }

    public final void setPreview(boolean z) {
        this.f16843c = z;
    }

    /* renamed from: com.bytedance.android.livesdk.container.k.c$c  reason: collision with other inner class name */
    public static final class C0343c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f16848a;

        static {
            Covode.recordClassIndex(9350);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        C0343c(c cVar) {
            this.f16848a = cVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f16848a.setAnimatorFinished(true);
        }

        public final void onAnimationStart(Animator animator) {
            this.f16848a.setAnimatorFinished(false);
        }
    }

    public final void setConfig(CardConfig cardConfig) {
        l.d(cardConfig, "");
        this.f16842b = cardConfig;
    }

    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f16849a;

        static {
            Covode.recordClassIndex(9351);
        }

        d(c cVar) {
            this.f16849a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            c cVar = this.f16849a;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) ((Float) animatedValue).floatValue(), y.a((float) LynxCardConfig.INSTANCE.getItemHeight()));
            layoutParams.setMarginEnd(y.a((float) LynxCardConfig.INSTANCE.getItemSpacing()));
            cVar.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null);
        l.d(context, "");
        MethodCollector.i(9095);
        this.f16845f = com.bytedance.android.livesdkapi.m.d.a(new b(this));
        this.f16846g = new b(context);
        this.f16844d = true;
        MethodCollector.o(9095);
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }
}

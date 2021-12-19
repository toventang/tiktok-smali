package com.ss.android.ugc.aweme.ad.feed.interactive;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.a.a.e;
import com.facebook.drawee.e.q;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveAwardMask;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.ao;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.feed.model.AdGestureGuidance;
import com.ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

public final class FeedAdInteractiveLayout extends FrameLayout implements d, e {

    /* renamed from: j  reason: collision with root package name */
    public static final a f65906j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    FeedAdInteractiveDrawView f65907a;

    /* renamed from: b  reason: collision with root package name */
    FeedAdInteractiveClickView f65908b;

    /* renamed from: c  reason: collision with root package name */
    Aweme f65909c;

    /* renamed from: d  reason: collision with root package name */
    AdInteractionData f65910d;

    /* renamed from: e  reason: collision with root package name */
    public com.facebook.fresco.animation.c.a f65911e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f65912f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f65913g;

    /* renamed from: h  reason: collision with root package name */
    public int f65914h;

    /* renamed from: i  reason: collision with root package name */
    com.ss.android.ugc.aweme.music.service.c f65915i;

    /* renamed from: k  reason: collision with root package name */
    private SimpleDraweeView f65916k;

    /* renamed from: l  reason: collision with root package name */
    private String f65917l;

    /* renamed from: m  reason: collision with root package name */
    private f f65918m;
    private ao n;
    private boolean o;
    private boolean p;

    static {
        Covode.recordClassIndex(40554);
    }

    public FeedAdInteractiveLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40555);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final ao getTextureSize() {
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.interactive.d
    public final void i() {
        p();
    }

    private final com.facebook.drawee.c.c<f> getControllerListener() {
        return new b(this);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.interactive.e
    public final void b() {
        this.f65912f = true;
        d();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.interactive.e
    public final void c() {
        this.f65912f = false;
        d();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.interactive.d
    public final void k() {
        l();
        n();
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        f fVar = this.f65918m;
        if (fVar != null) {
            fVar.b();
        }
    }

    public final void n() {
        f fVar = this.f65918m;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.interactive.e
    public final void a() {
        if (!this.p) {
            o();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.interactive.e
    public final void d() {
        this.p = false;
        l();
        j();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.interactive.e
    public final void e() {
        if (this.f65913g || this.o) {
            m();
        }
    }

    private final void p() {
        AwemeRawAd awemeRawAd;
        Aweme aweme = this.f65909c;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", awemeRawAd).b("refer", "interactive_gesture").b();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.interactive.e
    public final void g() {
        com.facebook.fresco.animation.c.a aVar;
        if (this.f65913g) {
            com.facebook.fresco.animation.c.a aVar2 = this.f65911e;
            if (!(aVar2 == null || !aVar2.isRunning() || (aVar = this.f65911e) == null)) {
                aVar.stop();
            }
            com.ss.android.ugc.aweme.music.service.c cVar = this.f65915i;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.interactive.e
    public final void f() {
        if (this.f65913g) {
            com.facebook.fresco.animation.c.a aVar = this.f65911e;
            if (aVar != null && !aVar.isRunning()) {
                com.facebook.fresco.animation.c.a aVar2 = this.f65911e;
                if (aVar2 != null) {
                    aVar2.start();
                }
                com.facebook.fresco.animation.c.a aVar3 = this.f65911e;
                if (aVar3 != null) {
                    aVar3.a(this.f65914h);
                }
            }
            com.ss.android.ugc.aweme.music.service.c cVar = this.f65915i;
            if (cVar != null) {
                cVar.d();
            }
        }
    }

    public final void j() {
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            FeedAdInteractiveAwardMask feedAdInteractiveAwardMask = (FeedAdInteractiveAwardMask) activity.findViewById(R.id.b0q);
            if (!(feedAdInteractiveAwardMask == null || feedAdInteractiveAwardMask.getVisibility() == 8)) {
                feedAdInteractiveAwardMask.setVisibility(8);
            }
            this.o = false;
        }
    }

    public final void l() {
        com.facebook.fresco.animation.c.a aVar;
        this.f65913g = false;
        setVisibility(8);
        com.facebook.fresco.animation.c.a aVar2 = this.f65911e;
        if (!(aVar2 == null || !aVar2.isRunning() || (aVar = this.f65911e) == null)) {
            aVar.stop();
        }
        this.f65911e = null;
        com.ss.android.ugc.aweme.music.service.c cVar = this.f65915i;
        if (cVar != null) {
            cVar.c();
        }
        this.f65915i = null;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.ex);
        l.b(findViewById, "");
        this.f65916k = (SimpleDraweeView) findViewById;
        View findViewById2 = findViewById(R.id.ew);
        l.b(findViewById2, "");
        this.f65907a = (FeedAdInteractiveDrawView) findViewById2;
        View findViewById3 = findViewById(R.id.ev);
        l.b(findViewById3, "");
        this.f65908b = (FeedAdInteractiveClickView) findViewById3;
        SimpleDraweeView simpleDraweeView = this.f65916k;
        if (simpleDraweeView == null) {
            l.a("interactiveGuideView");
        }
        Context context = getContext();
        l.b(context, "");
        simpleDraweeView.setHierarchy(new com.facebook.drawee.f.b(context.getResources()).a(q.b.f47438d).a());
        FeedAdInteractiveDrawView feedAdInteractiveDrawView = this.f65907a;
        if (feedAdInteractiveDrawView == null) {
            l.a("interactiveDrawView");
        }
        feedAdInteractiveDrawView.setInteractiveListener(this);
        FeedAdInteractiveClickView feedAdInteractiveClickView = this.f65908b;
        if (feedAdInteractiveClickView == null) {
            l.a("interactiveClickView");
        }
        feedAdInteractiveClickView.setInteractiveListener(this);
    }

    private final void o() {
        AdGestureGuidance gestureGuidance;
        String str;
        int width;
        int height;
        int i2;
        int i3;
        AdInteractionData adInteractionData = this.f65910d;
        if (adInteractionData != null && (gestureGuidance = adInteractionData.getGestureGuidance()) != null && (str = this.f65917l) != null) {
            ViewParent parent = getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            ao aoVar = this.n;
            if (aoVar != null) {
                width = aoVar.f74868a;
            } else {
                width = viewGroup.getWidth();
            }
            ao aoVar2 = this.n;
            if (aoVar2 != null) {
                height = aoVar2.f74869b;
            } else {
                height = viewGroup.getHeight();
            }
            float f2 = (float) width;
            float f3 = (float) height;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (gestureGuidance.getWidth() * f2), (int) (gestureGuidance.getHeight() * f3));
            SimpleDraweeView simpleDraweeView = this.f65916k;
            if (simpleDraweeView == null) {
                l.a("interactiveGuideView");
            }
            simpleDraweeView.setLayoutParams(layoutParams);
            if (width > viewGroup.getWidth()) {
                i2 = (width - viewGroup.getWidth()) / 2;
            } else {
                i2 = 0;
            }
            if (height > viewGroup.getHeight()) {
                i3 = (height - viewGroup.getHeight()) / 2;
            } else {
                i3 = 0;
            }
            float positionX = (f2 * gestureGuidance.getPositionX()) - ((float) i2);
            float positionY = (f3 * gestureGuidance.getPositionY()) - ((float) i3);
            SimpleDraweeView simpleDraweeView2 = this.f65916k;
            if (simpleDraweeView2 == null) {
                l.a("interactiveGuideView");
            }
            if (gb.a(getContext())) {
                positionX = -positionX;
            }
            simpleDraweeView2.setTranslationX(positionX);
            SimpleDraweeView simpleDraweeView3 = this.f65916k;
            if (simpleDraweeView3 == null) {
                l.a("interactiveGuideView");
            }
            simpleDraweeView3.setTranslationY(positionY);
            e a2 = com.facebook.drawee.a.a.c.b().a(str);
            a2.f47319g = getControllerListener();
            a2.f47322j = true;
            com.facebook.drawee.c.a c2 = a2.e();
            SimpleDraweeView simpleDraweeView4 = this.f65916k;
            if (simpleDraweeView4 == null) {
                l.a("interactiveGuideView");
            }
            simpleDraweeView4.setController(c2);
            setVisibility(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r10 == null) goto L_0x002f;
     */
    @Override // com.ss.android.ugc.aweme.ad.feed.interactive.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
        // Method dump skipped, instructions count: 380
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveLayout.h():void");
    }

    public final void setTextureSize(ao aoVar) {
        this.n = aoVar;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.interactive.e
    public final void setVideoSize(ao aoVar) {
        this.n = aoVar;
    }

    public static final class b extends com.facebook.drawee.c.c<f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedAdInteractiveLayout f65919a;

        static {
            Covode.recordClassIndex(40556);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(FeedAdInteractiveLayout feedAdInteractiveLayout) {
            this.f65919a = feedAdInteractiveLayout;
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFailure(String str, Throwable th) {
            if (th != null) {
                th.getMessage();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
            AwemeRawAd awemeRawAd;
            UrlModel music;
            List<String> urlList;
            try {
                if (!this.f65919a.f65912f) {
                    return;
                }
                if (animatable == null || !(animatable instanceof com.facebook.fresco.animation.c.a)) {
                    this.f65919a.l();
                    return;
                }
                this.f65919a.f65913g = true;
                Aweme aweme = this.f65919a.f65909c;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", awemeRawAd).b("refer", "interactive_gesture").b();
                this.f65919a.f65911e = (com.facebook.fresco.animation.c.a) animatable;
                FeedAdInteractiveLayout feedAdInteractiveLayout = this.f65919a;
                com.facebook.fresco.animation.c.a aVar = (com.facebook.fresco.animation.c.a) animatable;
                AdInteractionData adInteractionData = feedAdInteractiveLayout.f65910d;
                if (adInteractionData != null) {
                    com.ss.android.ugc.aweme.commercialize.g.d dVar = new com.ss.android.ugc.aweme.commercialize.g.d(aVar.f47564d, 1);
                    aVar.a(dVar);
                    aVar.a(new d(feedAdInteractiveLayout, dVar));
                    aVar.start();
                    if (adInteractionData.getInteractionType() == 0) {
                        FeedAdInteractiveClickView feedAdInteractiveClickView = feedAdInteractiveLayout.f65908b;
                        if (feedAdInteractiveClickView == null) {
                            l.a("interactiveClickView");
                        }
                        feedAdInteractiveClickView.setVisibility(0);
                        FeedAdInteractiveDrawView feedAdInteractiveDrawView = feedAdInteractiveLayout.f65907a;
                        if (feedAdInteractiveDrawView == null) {
                            l.a("interactiveDrawView");
                        }
                        feedAdInteractiveDrawView.setVisibility(8);
                    } else {
                        FeedAdInteractiveClickView feedAdInteractiveClickView2 = feedAdInteractiveLayout.f65908b;
                        if (feedAdInteractiveClickView2 == null) {
                            l.a("interactiveClickView");
                        }
                        feedAdInteractiveClickView2.setVisibility(8);
                        FeedAdInteractiveDrawView feedAdInteractiveDrawView2 = feedAdInteractiveLayout.f65907a;
                        if (feedAdInteractiveDrawView2 == null) {
                            l.a("interactiveDrawView");
                        }
                        feedAdInteractiveDrawView2.setVisibility(0);
                    }
                    feedAdInteractiveLayout.m();
                    AdInteractionData adInteractionData2 = feedAdInteractiveLayout.f65910d;
                    if (adInteractionData2 != null && (music = adInteractionData2.getMusic()) != null && (urlList = music.getUrlList()) != null && !urlList.isEmpty()) {
                        com.ss.android.ugc.aweme.music.service.c a2 = MusicService.m().a(feedAdInteractiveLayout.getContext());
                        com.ss.android.ugc.musicprovider.a.a aVar2 = new com.ss.android.ugc.musicprovider.a.a();
                        aVar2.f148532b = urlList;
                        a2.a(aVar2, true);
                        feedAdInteractiveLayout.f65915i = a2;
                    }
                }
            } catch (Throwable th) {
                com.ss.android.ugc.aweme.framework.a.a.a(th);
                th.getMessage();
            }
        }
    }

    public static final class c implements FeedAdInteractiveAwardMask.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedAdInteractiveLayout f65920a;

        static {
            Covode.recordClassIndex(40557);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(FeedAdInteractiveLayout feedAdInteractiveLayout) {
            this.f65920a = feedAdInteractiveLayout;
        }

        @Override // com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveAwardMask.a
        public final void a(boolean z) {
            AwemeRawAd awemeRawAd;
            this.f65920a.j();
            if (z) {
                this.f65920a.n();
                Aweme aweme = this.f65920a.f65909c;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "close", awemeRawAd).b("refer", "popup_window").b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.interactive.e
    public final void setOperator(f fVar) {
        l.d(fVar, "");
        this.f65918m = fVar;
    }

    public static final class d implements com.facebook.fresco.animation.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedAdInteractiveLayout f65921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.g.d f65922b;

        static {
            Covode.recordClassIndex(40558);
        }

        @Override // com.facebook.fresco.animation.c.b
        public final void a(com.facebook.fresco.animation.c.a aVar) {
            l.d(aVar, "");
        }

        @Override // com.facebook.fresco.animation.c.b
        public final void b(com.facebook.fresco.animation.c.a aVar) {
            l.d(aVar, "");
        }

        @Override // com.facebook.fresco.animation.c.b
        public final void c(com.facebook.fresco.animation.c.a aVar) {
            l.d(aVar, "");
        }

        d(FeedAdInteractiveLayout feedAdInteractiveLayout, com.ss.android.ugc.aweme.commercialize.g.d dVar) {
            this.f65921a = feedAdInteractiveLayout;
            this.f65922b = dVar;
        }

        @Override // com.facebook.fresco.animation.c.b
        public final void a(com.facebook.fresco.animation.c.a aVar, int i2) {
            l.d(aVar, "");
            this.f65921a.f65914h = i2;
            if (i2 == this.f65922b.e() - 1) {
                this.f65921a.l();
                this.f65921a.n();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.interactive.e
    public final void a(Aweme aweme, String str) {
        AdInteractionData adInteractionData;
        AwemeRawAd awemeRawAd;
        this.f65909c = aweme;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            adInteractionData = null;
        } else {
            adInteractionData = awemeRawAd.getAdInteractionData();
        }
        this.f65910d = adInteractionData;
        this.f65917l = str;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(793);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(793);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private /* synthetic */ FeedAdInteractiveLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FeedAdInteractiveLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(800);
        MethodCollector.o(800);
    }
}

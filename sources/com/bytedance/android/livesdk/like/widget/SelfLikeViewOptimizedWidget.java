package com.bytedance.android.livesdk.like.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.g.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.like.widget.anim.BottomLikeOptimizedView;
import com.bytedance.android.livesdk.like.widget.anim.LikeViewOptimizedTapView;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.p;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.d.g;
import f.a.t;
import f.a.x;
import h.f.b.l;
import h.f.b.z;
import h.h;
import java.util.Iterator;
import java.util.LinkedList;

public final class SelfLikeViewOptimizedWidget extends LiveRecyclableWidget implements com.bytedance.android.livesdk.like.d, au {

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f18414a;

    /* renamed from: b  reason: collision with root package name */
    public LikeViewOptimizedTapView f18415b;

    /* renamed from: c  reason: collision with root package name */
    public BottomLikeOptimizedView f18416c;

    /* renamed from: d  reason: collision with root package name */
    public LottieAnimationView f18417d;

    /* renamed from: e  reason: collision with root package name */
    public final f.b<LottieAnimationView> f18418e = new f.b<>(5);

    /* renamed from: f  reason: collision with root package name */
    public final LinkedList<LottieAnimationView> f18419f = new LinkedList<>();

    /* renamed from: g  reason: collision with root package name */
    private final h f18420g = com.bytedance.android.livesdkapi.m.d.a(new f(this));

    /* renamed from: h  reason: collision with root package name */
    private final h f18421h = com.bytedance.android.livesdkapi.m.d.a(new d(this));

    /* renamed from: i  reason: collision with root package name */
    private long f18422i;

    /* renamed from: j  reason: collision with root package name */
    private Room f18423j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f18424k;

    static {
        Covode.recordClassIndex(10358);
    }

    private final c a() {
        return (c) this.f18420g.getValue();
    }

    private final b b() {
        return (b) this.f18421h.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bc5;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class d extends h.f.b.m implements h.f.a.a<b> {
        final /* synthetic */ SelfLikeViewOptimizedWidget this$0;

        static {
            Covode.recordClassIndex(10370);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SelfLikeViewOptimizedWidget selfLikeViewOptimizedWidget) {
            super(0);
            this.this$0 = selfLikeViewOptimizedWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<c> {
        final /* synthetic */ SelfLikeViewOptimizedWidget this$0;

        static {
            Covode.recordClassIndex(10372);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SelfLikeViewOptimizedWidget selfLikeViewOptimizedWidget) {
            super(0);
            this.this$0 = selfLikeViewOptimizedWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c();
        }
    }

    /* access modifiers changed from: package-private */
    public final class c extends a {
        static {
            Covode.recordClassIndex(10368);
        }

        @Override // com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget.a
        public final void b() {
            SelfLikeViewOptimizedWidget.a(SelfLikeViewOptimizedWidget.this).a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c() {
            super();
        }

        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f18436a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ z.e f18437b;

            static {
                Covode.recordClassIndex(10369);
            }

            public final void onAnimationEnd(Animator animator) {
                MethodCollector.i(6481);
                l.d(animator, "");
                if (SelfLikeViewOptimizedWidget.this.f18419f.contains(this.f18437b.element)) {
                    this.f18437b.element.setVisibility(8);
                    if (!SelfLikeViewOptimizedWidget.this.f18418e.release(this.f18437b.element)) {
                        SelfLikeViewOptimizedWidget.b(SelfLikeViewOptimizedWidget.this).removeView(this.f18437b.element);
                    }
                    SelfLikeViewOptimizedWidget.this.f18419f.remove(this.f18437b.element);
                }
                MethodCollector.o(6481);
            }

            a(c cVar, z.e eVar) {
                this.f18436a = cVar;
                this.f18437b = eVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        Bitmap f18426b;

        /* access modifiers changed from: package-private */
        public static final class c<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final c f18430a = new c();

            static {
                Covode.recordClassIndex(10363);
            }

            c() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static final class g<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final g f18434a = new g();

            static {
                Covode.recordClassIndex(10367);
            }

            g() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(10360);
        }

        @Override // com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget.a
        public final void b() {
            SelfLikeViewOptimizedWidget.c(SelfLikeViewOptimizedWidget.this).a();
            Bitmap bitmap = this.f18426b;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }

        @Override // com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget.a
        public final void a() {
            t<Bitmap> a2;
            t<R> d2;
            t<R> b2;
            t<R> a3;
            com.bytedance.android.livesdk.util.rxutils.autodispose.z zVar;
            SelfLikeViewOptimizedWidget.c(SelfLikeViewOptimizedWidget.this).setAvatar(this.f18426b);
            com.bytedance.android.livesdk.at.f b3 = u.a().b();
            l.b(b3, "");
            com.bytedance.android.live.base.model.user.b a4 = b3.a();
            l.b(a4, "");
            ImageModel avatarThumb = a4.getAvatarThumb();
            if (avatarThumb != null && (a2 = com.bytedance.android.livesdk.chatroom.g.g.a(avatarThumb)) != null && (d2 = a2.d(a.f18428a)) != null && (b2 = d2.b(f.a.h.a.b(f.a.k.a.f158006c))) != null && (a3 = b2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a))) != null && (zVar = (com.bytedance.android.livesdk.util.rxutils.autodispose.z) a3.a(WidgetExtendsKt.autoDispose(SelfLikeViewOptimizedWidget.this))) != null) {
                zVar.a(new C0384b(this), c.f18430a);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class a<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            public static final a f18428a = new a();

            static {
                Covode.recordClassIndex(10361);
            }

            a() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                l.d(bitmap, "");
                return OptimizedLikeHelper.a(bitmap, OptimizedLikeHelper.u);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget$b$b  reason: collision with other inner class name */
        public static final class C0384b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18429a;

            static {
                Covode.recordClassIndex(10362);
            }

            C0384b(b bVar) {
                this.f18429a = bVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    SelfLikeViewOptimizedWidget.c(SelfLikeViewOptimizedWidget.this).setAvatar(bitmap);
                }
            }
        }

        static final class d<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            public static final d f18431a = new d();

            static {
                Covode.recordClassIndex(10364);
            }

            d() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                com.bytedance.android.live.base.model.user.b bVar = (com.bytedance.android.live.base.model.user.b) obj;
                l.d(bVar, "");
                return com.bytedance.android.livesdk.chatroom.g.g.a(bVar.getAvatarThumb());
            }
        }

        static final class e<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            public static final e f18432a = new e();

            static {
                Covode.recordClassIndex(10365);
            }

            e() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                l.d(bitmap, "");
                return OptimizedLikeHelper.a(bitmap, OptimizedLikeHelper.u);
            }
        }

        static final class f<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18433a;

            static {
                Covode.recordClassIndex(10366);
            }

            f(b bVar) {
                this.f18433a = bVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    SelfLikeViewOptimizedWidget.c(SelfLikeViewOptimizedWidget.this).setAvatar(bitmap);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
            super();
            MethodCollector.i(4550);
            Context context = SelfLikeViewOptimizedWidget.this.context;
            l.b(context, "");
            this.f18426b = OptimizedLikeHelper.a(BitmapFactory.decodeResource(context.getResources(), 2131234424), OptimizedLikeHelper.u);
            MethodCollector.o(4550);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        MethodCollector.i(4944);
        a().b();
        b().b();
        LottieAnimationView lottieAnimationView = this.f18417d;
        if (lottieAnimationView == null) {
            l.a("flowerAnimation");
        }
        lottieAnimationView.d();
        LottieAnimationView lottieAnimationView2 = this.f18417d;
        if (lottieAnimationView2 == null) {
            l.a("flowerAnimation");
        }
        lottieAnimationView2.setVisibility(8);
        com.bytedance.android.livesdk.like.b likeHelper = ((p) com.bytedance.android.live.t.a.a(p.class)).getLikeHelper(this.f18422i);
        if (likeHelper != null && likeHelper.n() && likeHelper.l()) {
            likeHelper.b(this);
            likeHelper.b((View) null);
        }
        Iterator<LottieAnimationView> it = this.f18419f.iterator();
        while (it.hasNext()) {
            LottieAnimationView next = it.next();
            l.b(next, "");
            LottieAnimationView lottieAnimationView3 = next;
            it.remove();
            lottieAnimationView3.setVisibility(8);
            if (!this.f18418e.release(lottieAnimationView3)) {
                FrameLayout frameLayout = this.f18414a;
                if (frameLayout == null) {
                    l.a("tapLottieContainer");
                }
                frameLayout.removeView(lottieAnimationView3);
            }
            lottieAnimationView3.d();
        }
        a();
        b();
        MethodCollector.o(4944);
    }

    abstract class a {
        static {
            Covode.recordClassIndex(10359);
        }

        public void a() {
        }

        public void b() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SelfLikeViewOptimizedWidget f18438a;

        static {
            Covode.recordClassIndex(10371);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(SelfLikeViewOptimizedWidget selfLikeViewOptimizedWidget) {
            this.f18438a = selfLikeViewOptimizedWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            LottieAnimationView lottieAnimationView = this.f18438a.f18417d;
            if (lottieAnimationView == null) {
                l.a("flowerAnimation");
            }
            lottieAnimationView.setVisibility(8);
        }
    }

    public static final /* synthetic */ FrameLayout b(SelfLikeViewOptimizedWidget selfLikeViewOptimizedWidget) {
        FrameLayout frameLayout = selfLikeViewOptimizedWidget.f18414a;
        if (frameLayout == null) {
            l.a("tapLottieContainer");
        }
        return frameLayout;
    }

    public static final /* synthetic */ BottomLikeOptimizedView c(SelfLikeViewOptimizedWidget selfLikeViewOptimizedWidget) {
        BottomLikeOptimizedView bottomLikeOptimizedView = selfLikeViewOptimizedWidget.f18416c;
        if (bottomLikeOptimizedView == null) {
            l.a("bottomLikeOptimizedView");
        }
        return bottomLikeOptimizedView;
    }

    public static final /* synthetic */ LikeViewOptimizedTapView a(SelfLikeViewOptimizedWidget selfLikeViewOptimizedWidget) {
        LikeViewOptimizedTapView likeViewOptimizedTapView = selfLikeViewOptimizedWidget.f18415b;
        if (likeViewOptimizedTapView == null) {
            l.a("optimizedTapView");
        }
        return likeViewOptimizedTapView;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.eie);
        l.b(findViewById, "");
        this.f18414a = (FrameLayout) findViewById;
        View findViewById2 = findViewById(R.id.eig);
        l.b(findViewById2, "");
        this.f18415b = (LikeViewOptimizedTapView) findViewById2;
        View findViewById3 = findViewById(R.id.dy6);
        l.b(findViewById3, "");
        this.f18416c = (BottomLikeOptimizedView) findViewById3;
        View findViewById4 = findViewById(R.id.b76);
        l.b(findViewById4, "");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById4;
        this.f18417d = lottieAnimationView;
        if (lottieAnimationView == null) {
            l.a("flowerAnimation");
        }
        lottieAnimationView.a(new e(this));
        a().a();
        b().a();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        long j2;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.b(df.class);
        } else {
            room = null;
        }
        this.f18423j = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (bool = (Boolean) dataChannel2.b(ee.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f18424k = z;
        Room room2 = this.f18423j;
        if (room2 != null) {
            j2 = room2.getId();
        } else {
            j2 = 0;
        }
        this.f18422i = j2;
        a();
        b b2 = b();
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) u.a().b().j().a((g<? super com.bytedance.android.live.base.model.user.b, ? extends x<? extends R>>) b.d.f18431a, false).a(f.a.h.a.b(f.a.k.a.f158006c)).d(b.e.f18432a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(WidgetExtendsKt.autoDispose(SelfLikeViewOptimizedWidget.this))).a(new b.f(b2), b.g.f18434a);
        LottieAnimationView lottieAnimationView = this.f18417d;
        if (lottieAnimationView == null) {
            l.a("flowerAnimation");
        }
        lottieAnimationView.setVisibility(8);
        com.bytedance.android.livesdk.like.b likeHelper = ((p) com.bytedance.android.live.t.a.a(p.class)).getLikeHelper(this.f18422i);
        if (likeHelper != null && likeHelper.n() && likeHelper.l()) {
            likeHelper.a(this);
            LikeViewOptimizedTapView likeViewOptimizedTapView = this.f18415b;
            if (likeViewOptimizedTapView == null) {
                l.a("optimizedTapView");
            }
            likeHelper.b(likeViewOptimizedTapView);
        }
    }

    @Override // com.bytedance.android.livesdk.like.d
    public final void a(com.bytedance.android.livesdk.like.b bVar, int i2) {
        l.d(bVar, "");
        if (bVar.o() && i2 >= bVar.d()) {
            LottieAnimationView lottieAnimationView = this.f18417d;
            if (lottieAnimationView == null) {
                l.a("flowerAnimation");
            }
            if (!lottieAnimationView.f5109b.g()) {
                LottieAnimationView lottieAnimationView2 = this.f18417d;
                if (lottieAnimationView2 == null) {
                    l.a("flowerAnimation");
                }
                lottieAnimationView2.setVisibility(0);
                LottieAnimationView lottieAnimationView3 = this.f18417d;
                if (lottieAnimationView3 == null) {
                    l.a("flowerAnimation");
                }
                lottieAnimationView3.a();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.like.d
    public final void a(com.bytedance.android.livesdk.like.b bVar, int i2, int i3, float f2, float f3, float f4, float f5) {
        int i4;
        int i5;
        RoomAuthStatus roomAuthStatus;
        MethodCollector.i(4937);
        l.d(bVar, "");
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        if (b2.e()) {
            Room room = this.f18423j;
            if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || roomAuthStatus.enableDigg) {
                if (Build.VERSION.SDK_INT >= 21 && !this.f18424k) {
                    try {
                        View view = getView();
                        if (view != null) {
                            view.performHapticFeedback(1, 2);
                        }
                    } catch (Throwable unused) {
                    }
                }
                Bitmap j2 = bVar.j();
                if (j2 != null) {
                    b b3 = b();
                    l.d(j2, "");
                    int a2 = y.a((float) (h.i.c.Default.nextInt(1, 16) * 2));
                    BottomLikeOptimizedView c2 = c(SelfLikeViewOptimizedWidget.this);
                    float f6 = OptimizedLikeHelper.w;
                    Bitmap bitmap = b3.f18426b;
                    if (bitmap != null) {
                        i4 = bitmap.getWidth();
                    } else {
                        i4 = 0;
                    }
                    float f7 = f6 - ((float) (i4 / 2));
                    float f8 = OptimizedLikeHelper.x;
                    float f9 = (float) a2;
                    float f10 = OptimizedLikeHelper.w - f9;
                    float f11 = OptimizedLikeHelper.y;
                    float f12 = OptimizedLikeHelper.w - f9;
                    float f13 = OptimizedLikeHelper.v;
                    Bitmap bitmap2 = b3.f18426b;
                    if (bitmap2 != null) {
                        i5 = bitmap2.getHeight();
                    } else {
                        i5 = 0;
                    }
                    c2.a(j2, f7, f8, f10, f11, f12, f13 - ((float) (i5 / 2)));
                    c a3 = a();
                    l.d(bVar, "");
                    l.d(j2, "");
                    z.e eVar = new z.e();
                    eVar.element = (T) SelfLikeViewOptimizedWidget.this.f18418e.acquire();
                    if (eVar.element == null) {
                        T t = (T) new LottieAnimationView(SelfLikeViewOptimizedWidget.this.context);
                        t.setAnimation("digg_tap/data.json");
                        t.setImageAssetsFolder("digg_tap/images");
                        eVar.element = t;
                        int i6 = OptimizedLikeHelper.t;
                        b(SelfLikeViewOptimizedWidget.this).addView(eVar.element, i6, i6);
                        eVar.element.a(new c.a(a3, eVar));
                    }
                    SelfLikeViewOptimizedWidget.this.f18419f.add(eVar.element);
                    eVar.element.setVisibility(0);
                    eVar.element.setX(f2 - ((float) (OptimizedLikeHelper.t / 2)));
                    eVar.element.setY(f3 - ((float) (OptimizedLikeHelper.t / 2)));
                    eVar.element.a();
                    if (f4 > 0.0f && f5 > 0.0f) {
                        LikeViewOptimizedTapView a4 = a(SelfLikeViewOptimizedWidget.this);
                        l.d(j2, "");
                        LikeViewOptimizedTapView.a acquire = a4.f18599a.acquire();
                        if (acquire == null) {
                            acquire = new LikeViewOptimizedTapView.a();
                        } else {
                            a4.a(acquire);
                        }
                        ImageView imageView = acquire.f18601a;
                        int i7 = LikeViewOptimizedTapView.f18597c;
                        a4.addView(imageView, i7, i7);
                        l.d(j2, "");
                        acquire.f18601a.setImageBitmap(j2);
                        acquire.f18601a.setAlpha(1.0f);
                        acquire.f18601a.setX(f2 - ((float) (LikeViewOptimizedTapView.f18597c / 2)));
                        acquire.f18601a.setY(f3 - ((float) (LikeViewOptimizedTapView.f18597c / 2)));
                        acquire.f18602b.f18610a = f4;
                        acquire.f18603c.f18610a = f3;
                        acquire.f18604d.setObjectValues(Float.valueOf(acquire.f18601a.getX()), Float.valueOf(f4 - ((float) (LikeViewOptimizedTapView.f18597c / 2))));
                        acquire.f18605e.setObjectValues(Float.valueOf(acquire.f18601a.getY()), Float.valueOf(f5 - ((float) (LikeViewOptimizedTapView.f18597c / 2))));
                        LikeViewOptimizedTapView.this.f18600b.add(acquire);
                        acquire.f18606f.start();
                    }
                    MethodCollector.o(4937);
                    return;
                }
                MethodCollector.o(4937);
                return;
            }
            MethodCollector.o(4937);
            return;
        }
        MethodCollector.o(4937);
    }
}

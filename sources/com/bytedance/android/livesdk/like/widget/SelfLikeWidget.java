package com.bytedance.android.livesdk.like.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.like.widget.anim.BottomLikeView;
import com.bytedance.android.livesdk.like.widget.anim.DiggTapView;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.p;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.ac;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.ad;
import f.a.af;
import f.a.t;
import f.a.x;
import h.a.n;
import h.f.b.l;
import h.h;
import java.util.HashSet;
import java.util.Iterator;

public final class SelfLikeWidget extends LiveRecyclableWidget implements com.bytedance.android.livesdk.like.d, au {

    /* renamed from: f  reason: collision with root package name */
    public static final int f18439f = y.a(85.0f);

    /* renamed from: g  reason: collision with root package name */
    public static final int f18440g = y.a(32.0f);

    /* renamed from: h  reason: collision with root package name */
    public static final a f18441h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f18442a;

    /* renamed from: b  reason: collision with root package name */
    public DiggTapView f18443b;

    /* renamed from: c  reason: collision with root package name */
    public BottomLikeView f18444c;

    /* renamed from: d  reason: collision with root package name */
    public LottieAnimationView f18445d;

    /* renamed from: e  reason: collision with root package name */
    public User f18446e;

    /* renamed from: i  reason: collision with root package name */
    private final h f18447i = com.bytedance.android.livesdkapi.m.d.a(new g(this));

    /* renamed from: j  reason: collision with root package name */
    private final h f18448j = com.bytedance.android.livesdkapi.m.d.a(new e(this));

    /* renamed from: k  reason: collision with root package name */
    private long f18449k;

    /* renamed from: l  reason: collision with root package name */
    private Room f18450l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f18451m;
    private boolean n;
    private IMessageManager o;
    private boolean p;
    private boolean q;

    private final d a() {
        return (d) this.f18447i.getValue();
    }

    private final c b() {
        return (c) this.f18448j.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bc4;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(10374);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static Bitmap a(Bitmap bitmap, int i2) {
            MethodCollector.i(5455);
            l.d(bitmap, "");
            Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Rect rect = new Rect(0, 0, i2, i2);
            RectF rectF = new RectF(rect);
            float f2 = (float) (i2 / 2);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, f2, f2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            paint.setColor(Color.parseColor("#ffffff"));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth((float) y.a(1.3f));
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
            l.b(createBitmap, "");
            MethodCollector.o(5455);
            return createBitmap;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<c> {
        final /* synthetic */ SelfLikeWidget this$0;

        static {
            Covode.recordClassIndex(10388);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SelfLikeWidget selfLikeWidget) {
            super(0);
            this.this$0 = selfLikeWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<d> {
        final /* synthetic */ SelfLikeWidget this$0;

        static {
            Covode.recordClassIndex(10390);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SelfLikeWidget selfLikeWidget) {
            super(0);
            this.this$0 = selfLikeWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d();
        }
    }

    /* access modifiers changed from: package-private */
    public final class d extends b {

        /* renamed from: b  reason: collision with root package name */
        final HashSet<Bitmap> f18462b = new HashSet<>();

        /* renamed from: c  reason: collision with root package name */
        final HashSet<LottieAnimationView> f18463c = new HashSet<>();

        static {
            Covode.recordClassIndex(10384);
        }

        /* access modifiers changed from: package-private */
        public static final class b implements f.a.d.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f18467a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ LottieAnimationView f18468b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c f18469c;

            static {
                Covode.recordClassIndex(10386);
            }

            b(d dVar, LottieAnimationView lottieAnimationView, c cVar) {
                this.f18467a = dVar;
                this.f18468b = lottieAnimationView;
                this.f18469c = cVar;
            }

            @Override // f.a.d.a
            public final void a() {
                this.f18468b.b(this.f18469c);
                this.f18467a.a(this.f18468b);
            }
        }

        @Override // com.bytedance.android.livesdk.like.widget.SelfLikeWidget.b
        public final void b() {
            SelfLikeWidget.a(SelfLikeWidget.this).a();
            this.f18463c.clear();
        }

        @Override // com.bytedance.android.livesdk.like.widget.SelfLikeWidget.b
        public final void a() {
            MethodCollector.i(5416);
            HashSet<Bitmap> hashSet = this.f18462b;
            Context context = SelfLikeWidget.this.context;
            l.b(context, "");
            hashSet.add(BitmapFactory.decodeResource(context.getResources(), 2131233985));
            MethodCollector.o(5416);
        }

        /* access modifiers changed from: package-private */
        public static final class a<T> implements af {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ LottieAnimationView f18465a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f18466b;

            static {
                Covode.recordClassIndex(10385);
            }

            a(LottieAnimationView lottieAnimationView, c cVar) {
                this.f18465a = lottieAnimationView;
                this.f18466b = cVar;
            }

            @Override // f.a.af
            public final void subscribe(ad<Animator.AnimatorListener> adVar) {
                l.d(adVar, "");
                this.f18465a.a(this.f18466b);
            }
        }

        public static final class c extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f18470a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ LottieAnimationView f18471b;

            static {
                Covode.recordClassIndex(10387);
            }

            public final void onAnimationEnd(Animator animator) {
                l.d(animator, "");
                this.f18471b.b(this);
                this.f18470a.a(this.f18471b);
            }

            c(d dVar, LottieAnimationView lottieAnimationView) {
                this.f18470a = dVar;
                this.f18471b = lottieAnimationView;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public d() {
            super();
        }

        public final void a(LottieAnimationView lottieAnimationView) {
            MethodCollector.i(5426);
            lottieAnimationView.setVisibility(4);
            if (this.f18463c.size() >= 5) {
                SelfLikeWidget.b(SelfLikeWidget.this).removeView(lottieAnimationView);
                MethodCollector.o(5426);
                return;
            }
            this.f18463c.add(lottieAnimationView);
            MethodCollector.o(5426);
        }

        /* access modifiers changed from: package-private */
        public final void a(LottieAnimationView lottieAnimationView, PointF pointF) {
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.setX(pointF.x);
            lottieAnimationView.setY(pointF.y);
            c cVar = new c(this, lottieAnimationView);
            ((ac) ab.a((af) new a(lottieAnimationView, cVar)).b((f.a.d.a) new b(this, lottieAnimationView, cVar)).a((f.a.ac) WidgetExtendsKt.autoDispose(SelfLikeWidget.this))).a();
        }
    }

    /* access modifiers changed from: package-private */
    public final class c extends b {

        /* renamed from: b  reason: collision with root package name */
        public Bitmap f18453b;

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$c$c  reason: collision with other inner class name */
        public static final class C0385c<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final C0385c f18457a = new C0385c();

            static {
                Covode.recordClassIndex(10379);
            }

            C0385c() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static final class g<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final g f18461a = new g();

            static {
                Covode.recordClassIndex(10383);
            }

            g() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(10376);
        }

        @Override // com.bytedance.android.livesdk.like.widget.SelfLikeWidget.b
        public final void b() {
            SelfLikeWidget.c(SelfLikeWidget.this).a();
        }

        @Override // com.bytedance.android.livesdk.like.widget.SelfLikeWidget.b
        public final void a() {
            t<Bitmap> a2;
            t<R> d2;
            t<R> b2;
            t<R> a3;
            z zVar;
            com.bytedance.android.livesdk.at.f b3 = u.a().b();
            l.b(b3, "");
            com.bytedance.android.live.base.model.user.b a4 = b3.a();
            l.b(a4, "");
            ImageModel avatarThumb = a4.getAvatarThumb();
            if (avatarThumb != null && (a2 = com.bytedance.android.livesdk.chatroom.g.g.a(avatarThumb)) != null && (d2 = a2.d(a.f18455a)) != null && (b2 = d2.b(f.a.h.a.b(f.a.k.a.f158006c))) != null && (a3 = b2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a))) != null && (zVar = (z) a3.a(WidgetExtendsKt.autoDispose(SelfLikeWidget.this))) != null) {
                zVar.a(new b(this), C0385c.f18457a);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class a<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            public static final a f18455a = new a();

            static {
                Covode.recordClassIndex(10377);
            }

            a() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                l.d(bitmap, "");
                return a.a(bitmap, SelfLikeWidget.f18440g);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f18456a;

            static {
                Covode.recordClassIndex(10378);
            }

            b(c cVar) {
                this.f18456a = cVar;
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    this.f18456a.f18453b = bitmap;
                }
            }
        }

        static final class d<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            public static final d f18458a = new d();

            static {
                Covode.recordClassIndex(10380);
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
            public static final e f18459a = new e();

            static {
                Covode.recordClassIndex(10381);
            }

            e() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                l.d(bitmap, "");
                return a.a(bitmap, SelfLikeWidget.f18440g);
            }
        }

        static final class f<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f18460a;

            static {
                Covode.recordClassIndex(10382);
            }

            f(c cVar) {
                this.f18460a = cVar;
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    this.f18460a.f18453b = bitmap;
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c() {
            super();
            MethodCollector.i(4303);
            Context context = SelfLikeWidget.this.context;
            l.b(context, "");
            this.f18453b = OptimizedLikeHelper.a(BitmapFactory.decodeResource(context.getResources(), 2131234424), OptimizedLikeHelper.u);
            MethodCollector.o(4303);
        }
    }

    static {
        Covode.recordClassIndex(10373);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        a().b();
        b().b();
        LottieAnimationView lottieAnimationView = this.f18445d;
        if (lottieAnimationView == null) {
            l.a("flowerAnimation");
        }
        lottieAnimationView.d();
        LottieAnimationView lottieAnimationView2 = this.f18445d;
        if (lottieAnimationView2 == null) {
            l.a("flowerAnimation");
        }
        lottieAnimationView2.setVisibility(8);
        com.bytedance.android.livesdk.like.b likeHelper = ((p) com.bytedance.android.live.t.a.a(p.class)).getLikeHelper(this.f18449k);
        if (likeHelper != null && likeHelper.n() && likeHelper.l()) {
            likeHelper.b(this);
            likeHelper.b((View) null);
        }
        Iterator<T> it = a().f18462b.iterator();
        while (it.hasNext()) {
            it.next().recycle();
        }
        b();
    }

    abstract class b {
        static {
            Covode.recordClassIndex(10375);
        }

        public void a() {
        }

        public void b() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }
    }

    public static final class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SelfLikeWidget f18472a;

        static {
            Covode.recordClassIndex(10389);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(SelfLikeWidget selfLikeWidget) {
            this.f18472a = selfLikeWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            LottieAnimationView lottieAnimationView = this.f18472a.f18445d;
            if (lottieAnimationView == null) {
                l.a("flowerAnimation");
            }
            lottieAnimationView.setVisibility(8);
        }
    }

    public static final /* synthetic */ FrameLayout b(SelfLikeWidget selfLikeWidget) {
        FrameLayout frameLayout = selfLikeWidget.f18442a;
        if (frameLayout == null) {
            l.a("tapLottieContainer");
        }
        return frameLayout;
    }

    public static final /* synthetic */ BottomLikeView c(SelfLikeWidget selfLikeWidget) {
        BottomLikeView bottomLikeView = selfLikeWidget.f18444c;
        if (bottomLikeView == null) {
            l.a("bottomLikeView");
        }
        return bottomLikeView;
    }

    public static final /* synthetic */ DiggTapView a(SelfLikeWidget selfLikeWidget) {
        DiggTapView diggTapView = selfLikeWidget.f18443b;
        if (diggTapView == null) {
            l.a("tapView");
        }
        return diggTapView;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.eie);
        l.b(findViewById, "");
        this.f18442a = (FrameLayout) findViewById;
        View findViewById2 = findViewById(R.id.eig);
        l.b(findViewById2, "");
        this.f18443b = (DiggTapView) findViewById2;
        View findViewById3 = findViewById(R.id.dy6);
        l.b(findViewById3, "");
        this.f18444c = (BottomLikeView) findViewById3;
        View findViewById4 = findViewById(R.id.b76);
        l.b(findViewById4, "");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById4;
        this.f18445d = lottieAnimationView;
        if (lottieAnimationView == null) {
            l.a("flowerAnimation");
        }
        lottieAnimationView.a(new f(this));
        a().a();
        b().a();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        boolean z2;
        long j2;
        Boolean bool;
        Boolean bool2;
        this.p = false;
        this.q = false;
        DataChannel dataChannel = this.dataChannel;
        IMessageManager iMessageManager = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.b(df.class);
        } else {
            room = null;
        }
        this.f18450l = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (bool2 = (Boolean) dataChannel2.b(cp.class)) == null) {
            z = true;
        } else {
            z = bool2.booleanValue();
        }
        this.f18451m = z;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null || (bool = (Boolean) dataChannel3.b(ee.class)) == null) {
            z2 = false;
        } else {
            z2 = bool.booleanValue();
        }
        this.n = z2;
        this.f18446e = d.a.a();
        Room room2 = this.f18450l;
        if (room2 != null) {
            j2 = room2.getId();
        } else {
            j2 = 0;
        }
        this.f18449k = j2;
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            iMessageManager = (IMessageManager) dataChannel4.b(cg.class);
        }
        this.o = iMessageManager;
        a();
        c b2 = b();
        ((z) u.a().b().j().a((f.a.d.g<? super com.bytedance.android.live.base.model.user.b, ? extends x<? extends R>>) c.d.f18458a, false).a(f.a.h.a.b(f.a.k.a.f158006c)).d(c.e.f18459a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(WidgetExtendsKt.autoDispose(SelfLikeWidget.this))).a(new c.f(b2), c.g.f18461a);
        LottieAnimationView lottieAnimationView = this.f18445d;
        if (lottieAnimationView == null) {
            l.a("flowerAnimation");
        }
        lottieAnimationView.setVisibility(8);
        com.bytedance.android.livesdk.like.b likeHelper = ((p) com.bytedance.android.live.t.a.a(p.class)).getLikeHelper(this.f18449k);
        if (likeHelper != null && likeHelper.n() && likeHelper.l()) {
            likeHelper.a(this);
            DiggTapView diggTapView = this.f18443b;
            if (diggTapView == null) {
                l.a("tapView");
            }
            likeHelper.b(diggTapView);
        }
    }

    @Override // com.bytedance.android.livesdk.like.d
    public final void a(com.bytedance.android.livesdk.like.b bVar, int i2) {
        l.d(bVar, "");
        if (bVar.o() && i2 >= bVar.d()) {
            LottieAnimationView lottieAnimationView = this.f18445d;
            if (lottieAnimationView == null) {
                l.a("flowerAnimation");
            }
            if (!lottieAnimationView.f5109b.g()) {
                LottieAnimationView lottieAnimationView2 = this.f18445d;
                if (lottieAnimationView2 == null) {
                    l.a("flowerAnimation");
                }
                lottieAnimationView2.setVisibility(0);
                LottieAnimationView lottieAnimationView3 = this.f18445d;
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
        LottieAnimationView lottieAnimationView;
        RoomAuthStatus roomAuthStatus;
        MethodCollector.i(4831);
        l.d(bVar, "");
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        if (b2.e()) {
            Room room = this.f18450l;
            if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || roomAuthStatus.enableDigg) {
                if (Build.VERSION.SDK_INT >= 21 && !this.n) {
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
                    if (!j2.isRecycled()) {
                        c b3 = b();
                        l.d(j2, "");
                        Bitmap bitmap = b3.f18453b;
                        int nextInt = h.i.c.Default.nextInt(1, 16) * 2;
                        BottomLikeView c2 = c(SelfLikeWidget.this);
                        float a2 = (float) y.a(50.0f);
                        if (bitmap != null) {
                            i4 = bitmap.getWidth();
                        } else {
                            i4 = 0;
                        }
                        PointF pointF = new PointF(a2 - ((float) (i4 / 2)), (float) y.a(236.0f));
                        float f6 = 50.0f - ((float) nextInt);
                        float a3 = (float) y.a(f6);
                        float a4 = (float) y.a(150.0f);
                        if (bitmap != null) {
                            i5 = bitmap.getHeight();
                        } else {
                            i5 = 0;
                        }
                        PointF pointF2 = new PointF(a3, a4 - ((float) (i5 / 2)));
                        PointF pointF3 = new PointF((float) y.a(f6), (float) y.a(55.0f));
                        l.d(j2, "");
                        l.d(pointF, "");
                        l.d(pointF2, "");
                        l.d(pointF3, "");
                        c2.f18504a.add(new BottomLikeView.b(c2, true, bitmap, j2, pointF, pointF2, pointF3));
                        d a5 = a();
                        l.d(j2, "");
                        int[] iArr = new int[2];
                        b(SelfLikeWidget.this).getLocationOnScreen(iArr);
                        int i6 = f18439f;
                        PointF pointF4 = new PointF((f2 - ((float) iArr[0])) - ((float) (i6 / 2)), (f3 - ((float) iArr[1])) - ((float) (i6 / 2)));
                        HashSet<LottieAnimationView> hashSet = a5.f18463c;
                        if (!(!hashSet.isEmpty()) || hashSet == null || (lottieAnimationView = (LottieAnimationView) n.d((Iterable) hashSet)) == null) {
                            lottieAnimationView = new LottieAnimationView(SelfLikeWidget.this.context);
                            a5.a(lottieAnimationView, pointF4);
                            lottieAnimationView.setAnimation("digg_tap/data.json");
                            lottieAnimationView.setImageAssetsFolder("digg_tap/images");
                            b(SelfLikeWidget.this).addView(lottieAnimationView, new FrameLayout.LayoutParams(i6, i6));
                        } else {
                            a5.f18463c.remove(lottieAnimationView);
                            a5.a(lottieAnimationView, pointF4);
                        }
                        lottieAnimationView.a();
                        int[] iArr2 = new int[2];
                        a(SelfLikeWidget.this).getLocationOnScreen(iArr2);
                        PointF pointF5 = new PointF(f2 - ((float) iArr2[0]), f3 - ((float) iArr2[1]));
                        if (f4 > 0.0f && f5 > 0.0f) {
                            PointF pointF6 = new PointF(f4, f5);
                            DiggTapView a6 = a(SelfLikeWidget.this);
                            l.d(j2, "");
                            l.d(pointF5, "");
                            l.d(pointF6, "");
                            a6.f18566a.add(new DiggTapView.b(a6, j2, pointF5, pointF6));
                        }
                    }
                    MethodCollector.o(4831);
                    return;
                }
                MethodCollector.o(4831);
                return;
            }
            MethodCollector.o(4831);
            return;
        }
        MethodCollector.o(4831);
    }
}

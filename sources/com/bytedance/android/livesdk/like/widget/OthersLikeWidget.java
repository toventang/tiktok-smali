package com.bytedance.android.livesdk.like.widget;

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
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.like.widget.anim.BottomLikeView;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.model.message.ai;
import com.bytedance.android.livesdk.model.message.bx;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import f.a.t;
import f.a.x;
import h.f.b.l;
import h.h;
import java.util.LinkedList;
import java.util.List;

public final class OthersLikeWidget extends LiveRecyclableWidget implements Handler.Callback, com.bytedance.android.livesdk.like.d, au, OnMessageListener {

    /* renamed from: c  reason: collision with root package name */
    public static final int f18391c = y.a(32.0f);

    /* renamed from: d  reason: collision with root package name */
    public static final a f18392d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public BottomLikeView f18393a;

    /* renamed from: b  reason: collision with root package name */
    public User f18394b;

    /* renamed from: e  reason: collision with root package name */
    private final h f18395e = com.bytedance.android.livesdkapi.m.d.a(new d(this));

    /* renamed from: f  reason: collision with root package name */
    private int f18396f;

    /* renamed from: g  reason: collision with root package name */
    private long f18397g;

    /* renamed from: h  reason: collision with root package name */
    private Room f18398h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f18399i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f18400j;

    /* renamed from: k  reason: collision with root package name */
    private IMessageManager f18401k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f18402l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f18403m;
    private int n = 1;
    private long o = 300;
    private final Handler p = new Handler(Looper.getMainLooper(), this);
    private final LinkedList<Bitmap> q = new LinkedList<>();
    private com.bytedance.android.livesdk.like.b r;
    private int s;

    private final c a() {
        return (c) this.f18395e.getValue();
    }

    @Override // com.bytedance.android.livesdk.like.d
    public final void a(com.bytedance.android.livesdk.like.b bVar, int i2) {
        l.d(bVar, "");
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bbs;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(10347);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static Bitmap a(Bitmap bitmap, int i2) {
            MethodCollector.i(5607);
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
            MethodCollector.o(5607);
            return createBitmap;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<c> {
        final /* synthetic */ OthersLikeWidget this$0;

        static {
            Covode.recordClassIndex(10357);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(OthersLikeWidget othersLikeWidget) {
            super(0);
            this.this$0 = othersLikeWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c();
        }
    }

    static {
        Covode.recordClassIndex(10346);
    }

    private final void c() {
        if (!this.q.isEmpty()) {
            this.p.sendEmptyMessageDelayed(1, this.o);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        a(OthersLikeWidget.this).a();
        IMessageManager iMessageManager = this.f18401k;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        com.bytedance.android.livesdk.like.b bVar = this.r;
        if (bVar != null && bVar.n() && bVar.l()) {
            bVar.b(this);
        }
        this.p.removeCallbacksAndMessages(null);
        b();
        a();
    }

    private final void b() {
        Long l2;
        Long l3;
        String str;
        com.bytedance.android.live.base.model.user.b a2;
        ba userAttr;
        if (this.s > 0) {
            com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_like_special_effect_show").a(this.dataChannel);
            f b2 = u.a().b();
            Room room = (Room) this.dataChannel.b(df.class);
            Boolean bool = null;
            if (b2 != null) {
                l2 = Long.valueOf(b2.c());
            } else {
                l2 = null;
            }
            if (room != null) {
                l3 = Long.valueOf(room.getOwnerUserId());
            } else {
                l3 = null;
            }
            if (l.a(l2, l3)) {
                str = "anchor";
            } else {
                if (!(b2 == null || (a2 = b2.a()) == null || (userAttr = a2.getUserAttr()) == null)) {
                    bool = Boolean.valueOf(userAttr.f19030b);
                }
                if (p.a(bool)) {
                    str = "admin";
                } else {
                    str = "user";
                }
            }
            a3.a("admin_type", str);
            a3.a("special_effect_amount", this.s);
            a3.a("action_type", e.e());
            a3.b();
            this.s = 0;
        }
    }

    abstract class b {
        static {
            Covode.recordClassIndex(10348);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }
    }

    /* access modifiers changed from: package-private */
    public final class c extends b {

        /* renamed from: b  reason: collision with root package name */
        public Bitmap f18405b;

        /* renamed from: com.bytedance.android.livesdk.like.widget.OthersLikeWidget$c$c  reason: collision with other inner class name */
        static final class C0383c<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final C0383c f18409a = new C0383c();

            static {
                Covode.recordClassIndex(10352);
            }

            C0383c() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static final class g<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final g f18413a = new g();

            static {
                Covode.recordClassIndex(10356);
            }

            g() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(10349);
        }

        static final class a<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            public static final a f18407a = new a();

            static {
                Covode.recordClassIndex(10350);
            }

            a() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                l.d(bitmap, "");
                return a.a(bitmap, OthersLikeWidget.f18391c);
            }
        }

        static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f18408a;

            static {
                Covode.recordClassIndex(10351);
            }

            b(c cVar) {
                this.f18408a = cVar;
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    this.f18408a.f18405b = bitmap;
                }
            }
        }

        static final class d<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            public static final d f18410a = new d();

            static {
                Covode.recordClassIndex(10353);
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
            public static final e f18411a = new e();

            static {
                Covode.recordClassIndex(10354);
            }

            e() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                l.d(bitmap, "");
                return a.a(bitmap, OthersLikeWidget.f18391c);
            }
        }

        static final class f<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f18412a;

            static {
                Covode.recordClassIndex(10355);
            }

            f(c cVar) {
                this.f18412a = cVar;
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    this.f18412a.f18405b = bitmap;
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c() {
            super();
            MethodCollector.i(5492);
            Context context = OthersLikeWidget.this.context;
            l.b(context, "");
            this.f18405b = OptimizedLikeHelper.a(BitmapFactory.decodeResource(context.getResources(), 2131234424), OptimizedLikeHelper.u);
            MethodCollector.o(5492);
        }

        public final void a(Bitmap bitmap) {
            int i2;
            l.d(bitmap, "");
            Bitmap bitmap2 = this.f18405b;
            int nextInt = h.i.c.Default.nextInt(1, 16) * 2;
            BottomLikeView a2 = OthersLikeWidget.a(OthersLikeWidget.this);
            float a3 = (float) y.a(50.0f);
            int i3 = 0;
            if (bitmap2 != null) {
                i2 = bitmap2.getWidth();
            } else {
                i2 = 0;
            }
            PointF pointF = new PointF(a3 - ((float) (i2 / 2)), (float) y.a(236.0f));
            float f2 = 50.0f - ((float) nextInt);
            float a4 = (float) y.a(f2);
            float a5 = (float) y.a(150.0f);
            if (bitmap2 != null) {
                i3 = bitmap2.getHeight();
            }
            a2.a(bitmap2, bitmap, pointF, new PointF(a4, a5 - ((float) (i3 / 2))), new PointF((float) y.a(f2), (float) y.a(55.0f)));
        }
    }

    public static final /* synthetic */ BottomLikeView a(OthersLikeWidget othersLikeWidget) {
        BottomLikeView bottomLikeView = othersLikeWidget.f18393a;
        if (bottomLikeView == null) {
            l.a("bottomLikeView");
        }
        return bottomLikeView;
    }

    private final void a(Bitmap bitmap) {
        if (bitmap != null) {
            a().a(bitmap);
        }
    }

    public final boolean handleMessage(Message message) {
        l.d(message, "");
        if (message.what == 1) {
            a(this.q.poll());
            c();
            return true;
        } else if (message.what != 2) {
            return false;
        } else {
            b();
            this.p.sendEmptyMessageDelayed(2, 60000);
            return false;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        t<Bitmap> a2;
        t<R> d2;
        t<R> b2;
        t<R> a3;
        z zVar;
        View findViewById = findViewById(R.id.dy6);
        l.b(findViewById, "");
        this.f18393a = (BottomLikeView) findViewById;
        c a4 = a();
        f b3 = u.a().b();
        l.b(b3, "");
        com.bytedance.android.live.base.model.user.b a5 = b3.a();
        l.b(a5, "");
        ImageModel avatarThumb = a5.getAvatarThumb();
        if (avatarThumb != null && (a2 = g.a(avatarThumb)) != null && (d2 = a2.d(c.a.f18407a)) != null && (b2 = d2.b(f.a.h.a.b(f.a.k.a.f158006c))) != null && (a3 = b2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a))) != null && (zVar = (z) a3.a(WidgetExtendsKt.autoDispose(OthersLikeWidget.this))) != null) {
            zVar.a(new c.b(a4), c.C0383c.f18409a);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Bitmap bitmap;
        if ((iMessage instanceof ai) && this.isViewValid) {
            if (this.f18400j && !this.f18403m) {
                this.f18403m = true;
                bx a2 = com.bytedance.android.livesdk.chatroom.b.b.a(this.f18397g, this.context.getString(R.string.e6m));
                IMessageManager iMessageManager = this.f18401k;
                if (iMessageManager != null) {
                    iMessageManager.insertMessage(a2, true);
                }
            }
            ai aiVar = (ai) iMessage;
            User user = aiVar.f19136h;
            if (user != null) {
                long id = user.getId();
                f b2 = u.a().b();
                l.b(b2, "");
                if (id == b2.c()) {
                    return;
                }
            }
            this.s += this.n;
            List<ImageModel> list = aiVar.f19138j;
            com.bytedance.android.livesdk.like.b bVar = this.r;
            if (bVar != null) {
                bitmap = bVar.a(list);
            } else {
                bitmap = null;
            }
            int i2 = 0;
            if (this.o < 0) {
                int i3 = this.n;
                while (i2 < i3) {
                    a(bitmap);
                    i2++;
                }
                return;
            }
            int i4 = this.n;
            while (i2 < i4) {
                this.q.offer(bitmap);
                i2++;
            }
            if (!this.p.hasMessages(1)) {
                c();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        boolean z2;
        long j2;
        long j3;
        Boolean bool;
        Boolean bool2;
        this.f18402l = false;
        this.f18403m = false;
        this.f18396f = 0;
        DataChannel dataChannel = this.dataChannel;
        IMessageManager iMessageManager = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.b(df.class);
        } else {
            room = null;
        }
        this.f18398h = room;
        DataChannel dataChannel2 = this.dataChannel;
        int i2 = 1;
        if (dataChannel2 == null || (bool2 = (Boolean) dataChannel2.b(cp.class)) == null) {
            z = true;
        } else {
            z = bool2.booleanValue();
        }
        this.f18399i = z;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null || (bool = (Boolean) dataChannel3.b(ee.class)) == null) {
            z2 = false;
        } else {
            z2 = bool.booleanValue();
        }
        this.f18400j = z2;
        this.f18394b = d.a.a();
        Room room2 = this.f18398h;
        if (room2 != null) {
            j2 = room2.getId();
        } else {
            j2 = 0;
        }
        this.f18397g = j2;
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            iMessageManager = (IMessageManager) dataChannel4.b(cg.class);
        }
        this.f18401k = iMessageManager;
        c a2 = a();
        ((z) u.a().b().j().a((f.a.d.g<? super com.bytedance.android.live.base.model.user.b, ? extends x<? extends R>>) c.d.f18410a, false).a(f.a.h.a.b(f.a.k.a.f158006c)).d(c.e.f18411a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(WidgetExtendsKt.autoDispose(OthersLikeWidget.this))).a(new c.f(a2), c.g.f18413a);
        com.bytedance.android.livesdk.like.b likeHelper = ((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).getLikeHelper(this.f18397g);
        this.r = likeHelper;
        if (likeHelper != null) {
            i2 = likeHelper.e();
        }
        this.n = i2;
        com.bytedance.android.livesdk.like.b bVar = this.r;
        if (bVar != null) {
            j3 = bVar.f();
        } else {
            j3 = 300;
        }
        this.o = j3;
        com.bytedance.android.livesdk.like.b bVar2 = this.r;
        if (bVar2 != null && bVar2.n()) {
            IMessageManager iMessageManager2 = this.f18401k;
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LIKE.getIntType(), this);
            }
            if (bVar2.l()) {
                bVar2.a(this);
            }
        }
        this.p.sendEmptyMessageDelayed(2, 60000);
    }

    @Override // com.bytedance.android.livesdk.like.d
    public final void a(com.bytedance.android.livesdk.like.b bVar, int i2, int i3, float f2, float f3, float f4, float f5) {
        User user;
        l.d(bVar, "");
        if (!this.f18402l && this.f18401k != null && (user = this.f18394b) != null) {
            ai a2 = com.bytedance.android.livesdk.chatroom.b.b.a(this.f18397g, user);
            IMessageManager iMessageManager = this.f18401k;
            if (iMessageManager == null) {
                l.b();
            }
            iMessageManager.insertMessage(a2, true);
            this.f18402l = true;
        }
    }
}

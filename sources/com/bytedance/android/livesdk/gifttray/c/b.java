package com.bytedance.android.livesdk.gifttray.c;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.gift.t;
import com.bytedance.android.live.n.z;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.gifttray.a.a;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSelfTrayDisplayStrategySetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayExpSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.bc;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.service.animation.b;
import com.bytedance.android.livesdk.service.c.c.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public HSImageView f18023a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f18024b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f18025c;

    /* renamed from: d  reason: collision with root package name */
    public AnimatorSet f18026d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.android.livesdk.gifttray.a.a f18027e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.livesdk.service.animation.c f18028f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18029g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18030h;

    /* renamed from: i  reason: collision with root package name */
    public long f18031i = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    /* renamed from: j  reason: collision with root package name */
    public View f18032j;

    /* renamed from: k  reason: collision with root package name */
    public final h f18033k = new h(this);

    /* renamed from: l  reason: collision with root package name */
    public final b.c f18034l = new i(this);

    /* renamed from: m  reason: collision with root package name */
    private TextView f18035m;
    private TextView n;
    private ImageView o;
    private ImageView p;
    private LiveTextView q;
    private boolean r;
    private DataChannel s;
    private final Context t;

    static {
        Covode.recordClassIndex(10004);
    }

    private final int getLayoutResource() {
        setClipChildren(false);
        return R.layout.beu;
    }

    @Override // com.bytedance.android.livesdk.gifttray.c.a
    public final void b() {
        this.r = true;
        if (this.f18028f != null) {
            this.f18028f = null;
        }
        removeCallbacks(this.f18033k);
    }

    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f18047a;

        static {
            Covode.recordClassIndex(10012);
        }

        public final void run() {
            if (!this.f18047a.f18029g) {
                this.f18047a.f18029g = true;
                this.f18047a.f18034l.c();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(b bVar) {
            this.f18047a = bVar;
        }
    }

    public static final class i implements b.c {

        /* renamed from: a  reason: collision with root package name */
        public long f18048a;

        /* renamed from: b  reason: collision with root package name */
        public int f18049b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f18050c;

        static {
            Covode.recordClassIndex(10013);
        }

        @Override // com.bytedance.android.livesdk.service.animation.b.c
        public final void d() {
            com.bytedance.android.livesdk.service.animation.c cVar;
            this.f18049b = 0;
            if (this.f18050c.f18028f != null && (cVar = this.f18050c.f18028f) != null) {
                cVar.c();
            }
        }

        @Override // com.bytedance.android.livesdk.service.animation.b.c
        public final void a() {
            this.f18050c.f18030h = false;
            if (this.f18050c.f18032j != null) {
                View view = this.f18050c.f18032j;
                if (view != null) {
                    view.setVisibility(0);
                }
                b bVar = this.f18050c;
                bVar.f18026d = com.bytedance.android.livesdk.service.animation.b.a(bVar.f18024b, this);
                AnimatorSet animatorSet = this.f18050c.f18026d;
                if (animatorSet != null) {
                    animatorSet.start();
                }
                this.f18048a = System.currentTimeMillis();
            }
        }

        @Override // com.bytedance.android.livesdk.service.animation.b.c
        public final void b() {
            long j2;
            com.bytedance.android.livesdk.service.animation.c cVar;
            com.bytedance.android.livesdk.gifttray.a.a aVar;
            com.bytedance.android.livesdk.gifttray.a.a aVar2;
            com.bytedance.android.livesdk.gifttray.a.a aVar3;
            this.f18049b++;
            com.bytedance.android.livesdk.gifttray.a.a aVar4 = this.f18050c.f18027e;
            if ((aVar4 == null || !aVar4.A || (LiveGiftSelfTrayDisplayStrategySetting.INSTANCE.getValue() > 1 && (LiveGiftSelfTrayDisplayStrategySetting.INSTANCE.getValue() < 2 || (aVar3 = this.f18050c.f18027e) == null || aVar3.f18000g))) && (((aVar = this.f18050c.f18027e) == null || aVar.A || ((LiveGiftTrayExpSetting.INSTANCE.getValue() != 2 || (aVar2 = this.f18050c.f18027e) == null || aVar2.f17999f) && LiveGiftTrayExpSetting.INSTANCE.getValue() != 3)) && this.f18050c.f18030h)) {
                j2 = 0;
            } else {
                j2 = this.f18050c.f18031i;
            }
            b bVar = this.f18050c;
            bVar.postDelayed(bVar.f18033k, j2);
            if (this.f18050c.f18028f != null && (cVar = this.f18050c.f18028f) != null) {
                cVar.a();
            }
        }

        @Override // com.bytedance.android.livesdk.service.animation.b.c
        public final void c() {
            Long l2;
            int i2;
            User user;
            com.bytedance.android.livesdk.service.animation.c cVar;
            if (!(this.f18050c.f18028f == null || (cVar = this.f18050c.f18028f) == null)) {
                cVar.b();
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f18048a;
            com.bytedance.android.livesdk.service.c.c.d dVar = d.a.C0463a.f21379a;
            int mIndex = this.f18050c.getMIndex();
            com.bytedance.android.livesdk.gifttray.a.a aVar = this.f18050c.f18027e;
            if (aVar == null || (user = aVar.z) == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(user.getId());
            }
            com.bytedance.android.livesdk.gifttray.a.a aVar2 = this.f18050c.f18027e;
            if (aVar2 != null) {
                i2 = aVar2.f17997d;
            } else {
                i2 = 0;
            }
            dVar.a(mIndex, l2, Integer.valueOf(i2), Long.valueOf(currentTimeMillis), Integer.valueOf(this.f18049b));
            b bVar = this.f18050c;
            bVar.f18026d = com.bytedance.android.livesdk.service.animation.b.b(bVar, this);
            AnimatorSet animatorSet = this.f18050c.f18026d;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(b bVar) {
            this.f18050c = bVar;
        }
    }

    @Override // com.bytedance.android.livesdk.gifttray.c.a
    public final void a() {
        Integer num;
        if (!this.r) {
            removeCallbacks(this.f18033k);
            com.bytedance.android.livesdk.gifttray.a.a aVar = this.f18027e;
            if (aVar != null) {
                num = Integer.valueOf(aVar.f17998e);
            } else {
                num = null;
            }
            b(String.valueOf(num));
            this.f18030h = true;
            View view = this.f18032j;
            if (view != null) {
                AnimatorSet a2 = com.bytedance.android.livesdk.service.animation.b.a(view, this.f18034l);
                this.f18026d = a2;
                if (a2 != null) {
                    a2.start();
                    return;
                }
                return;
            }
            TextView textView = this.f18024b;
            if (textView != null) {
                AnimatorSet a3 = com.bytedance.android.livesdk.service.animation.b.a(textView, this.f18034l);
                this.f18026d = a3;
                if (a3 != null) {
                    a3.start();
                }
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f18040a;

        static {
            Covode.recordClassIndex(10007);
        }

        c(b bVar) {
            this.f18040a = bVar;
        }

        public final void onClick(View view) {
            this.f18040a.a("gift");
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f18041a;

        static {
            Covode.recordClassIndex(10008);
        }

        d(b bVar) {
            this.f18041a = bVar;
        }

        public final void onClick(View view) {
            this.f18041a.a("others");
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f18042a;

        static {
            Covode.recordClassIndex(10009);
        }

        e(b bVar) {
            this.f18042a = bVar;
        }

        public final void onClick(View view) {
            this.f18042a.a("others");
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f18043a;

        static {
            Covode.recordClassIndex(10010);
        }

        f(b bVar) {
            this.f18043a = bVar;
        }

        public final void onClick(View view) {
            this.f18043a.a("others");
        }
    }

    public static final class g implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f18044a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.gifttray.a.a f18045b;

        /* renamed from: c  reason: collision with root package name */
        private long f18046c;

        static {
            Covode.recordClassIndex(10011);
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel) {
            l.d(imageModel, "");
            this.f18046c = SystemClock.elapsedRealtime();
        }

        g(b bVar, com.bytedance.android.livesdk.gifttray.a.a aVar) {
            this.f18044a = bVar;
            this.f18045b = aVar;
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, Exception exc) {
            l.d(imageModel, "");
            l.d(exc, "");
            ImageModel imageModel2 = this.f18045b.w;
            if (imageModel2 != null) {
                b bVar = this.f18044a;
                bVar.a(bVar.f18023a, imageModel2);
            }
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, int i2, int i3) {
            long j2;
            String str;
            u uVar;
            l.d(imageModel, "");
            d.a.C0463a.f21379a.a(this.f18044a.getMIndex(), true);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f18046c;
            y yVar = this.f18045b.C;
            if (yVar == null || (uVar = yVar.t) == null) {
                j2 = 0;
            } else {
                j2 = uVar.f19761d;
            }
            if (imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
                str = "";
            } else {
                str = imageModel.getUrls().get(0);
            }
            l.b(str, "");
            com.bytedance.android.livesdk.service.c.c.c.a(elapsedRealtime, j2, str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        l.d(context, "");
        this.t = context;
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.c.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC0377b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f18038a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DataChannel f18039b;

        static {
            Covode.recordClassIndex(10006);
        }

        View$OnClickListenerC0377b(b bVar, DataChannel dataChannel) {
            this.f18038a = bVar;
            this.f18039b = dataChannel;
        }

        public final void onClick(View view) {
            User user;
            com.bytedance.android.livesdk.service.c.i.a.a("portrait");
            DataChannel dataChannel = this.f18039b;
            if (dataChannel != null) {
                com.bytedance.android.livesdk.gifttray.a.a aVar = this.f18038a.f18027e;
                if (aVar != null) {
                    user = aVar.z;
                } else {
                    user = null;
                }
                UserProfileEvent userProfileEvent = new UserProfileEvent(user);
                userProfileEvent.mReportType = "report_user";
                dataChannel.c(z.class, userProfileEvent);
            }
        }
    }

    private final void b(String str) {
        int i2;
        com.bytedance.android.livesdk.gifttray.a.a aVar = this.f18027e;
        int i3 = 0;
        if (aVar != null) {
            i2 = aVar.f17998e;
        } else {
            i2 = 0;
        }
        com.bytedance.android.livesdk.gifttray.a.a aVar2 = this.f18027e;
        if (aVar2 != null) {
            i3 = aVar2.B;
        }
        Drawable b2 = com.bytedance.android.livesdk.gifttray.d.c.b(i2 * i3);
        View findViewById = findViewById(R.id.rs);
        if (findViewById != null) {
            findViewById.setBackground(b2);
        }
        String str2 = str + ' ';
        TextView textView = this.f18024b;
        if (textView != null) {
            textView.setText(str2);
        }
    }

    public static final class a implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f18036a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ImageView f18037b;

        static {
            Covode.recordClassIndex(10005);
        }

        @Override // com.bytedance.android.livesdkapi.host.e.b
        public final void a(Bitmap bitmap) {
            Bitmap a2;
            if (bitmap != null) {
                if (l.a(this.f18037b, this.f18036a.f18023a)) {
                    a2 = com.bytedance.android.livesdk.gift.c.a.a.a.b(bitmap);
                } else {
                    a2 = com.bytedance.android.livesdk.gift.c.a.a.a.a(bitmap);
                }
                if (a2 != null && !a2.isRecycled()) {
                    ImageView imageView = this.f18037b;
                    if (imageView != null) {
                        imageView.setImageBitmap(a2);
                    }
                    if (this.f18037b == this.f18036a.f18025c) {
                        d.a.C0463a.f21379a.a(this.f18036a.getMIndex());
                    } else if (this.f18037b == this.f18036a.f18023a) {
                        d.a.C0463a.f21379a.a(this.f18036a.getMIndex(), false);
                    }
                    this.f18036a.invalidate();
                }
            }
        }

        a(b bVar, ImageView imageView) {
            this.f18036a = bVar;
            this.f18037b = imageView;
        }
    }

    @Override // com.bytedance.android.livesdk.gifttray.c.a
    public final void a(com.bytedance.android.livesdk.service.animation.c cVar) {
        int i2;
        if (!this.r) {
            this.f18028f = cVar;
            b.c cVar2 = this.f18034l;
            boolean g2 = com.bytedance.android.live.core.f.y.g();
            float x = getX();
            if (g2) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            float f2 = (float) i2;
            float f3 = f2 * 75.0f;
            ObjectAnimator duration = ObjectAnimator.ofFloat(this, "translationX", x * f2, f3).setDuration(200L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "translationX", f3, 0.0f).setDuration(50L);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(this, "translationX", 0.0f, 0.0f).setDuration(50L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(duration, duration2, duration3);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.addListener(new b.a(b.EnumC0450b.entry, cVar2));
            this.f18026d = animatorSet;
            animatorSet.start();
        }
    }

    @Override // com.bytedance.android.livesdk.gifttray.c.a
    public final void setGiftMessage(com.bytedance.android.livesdk.gifttray.a.a aVar) {
        bc userHonor;
        ImageModel n2;
        ImageModel avatarThumb;
        ImageModel imageModel;
        ImageModel imageModel2;
        GiftTrayInfo giftTrayInfo;
        HSImageView hSImageView;
        GiftTrayInfo giftTrayInfo2;
        ImageModel imageModel3;
        List<String> list;
        l.d(aVar, "");
        d.a.C0463a.f21379a.a(new d.a.b(aVar.y), getMIndex());
        this.f18027e = aVar;
        int i2 = 0;
        this.f18031i = com.bytedance.android.livesdk.gifttray.d.c.a(aVar.B);
        TextView textView = this.f18035m;
        if (textView != null) {
            textView.setText(aVar.v);
        }
        TextView textView2 = this.n;
        if (textView2 != null) {
            textView2.setText(aVar.x);
        }
        y yVar = aVar.C;
        if (!(yVar == null || (giftTrayInfo2 = yVar.u) == null || (imageModel3 = giftTrayInfo2.mDynamicImg) == null || (list = imageModel3.mUrls) == null)) {
            i2 = list.size();
        }
        Integer num = null;
        if (i2 > 0) {
            if (com.bytedance.android.live.uikit.c.a.a(getContext()) && (hSImageView = this.f18023a) != null) {
                hSImageView.setScaleX(-1.0f);
            }
            HSImageView hSImageView2 = this.f18023a;
            y yVar2 = aVar.C;
            if (yVar2 == null || (giftTrayInfo = yVar2.u) == null) {
                imageModel2 = null;
            } else {
                imageModel2 = giftTrayInfo.mDynamicImg;
            }
            p.a(hSImageView2, imageModel2, -1, -1, true, 2131234630, new g(this, aVar));
        } else {
            ImageModel imageModel4 = aVar.w;
            if (imageModel4 != null) {
                a(this.f18023a, imageModel4);
            }
        }
        if (aVar.f17996c == a.EnumC0374a.TRAY_ONLY && (imageModel = aVar.w) != null) {
            a(this.f18023a, imageModel);
        }
        User user = aVar.z;
        if (!(user == null || (avatarThumb = user.getAvatarThumb()) == null)) {
            a(this.f18025c, avatarThumb);
        }
        User user2 = aVar.z;
        if (!(user2 == null || (userHonor = user2.getUserHonor()) == null || (n2 = userHonor.n()) == null)) {
            a(this.p, n2);
        }
        ImageModel b2 = com.bytedance.android.livesdk.d.a.b(aVar.z);
        if (b2 != null) {
            a(this.o, b2);
        }
        com.bytedance.android.livesdk.gifttray.a.a aVar2 = this.f18027e;
        if (aVar2 != null) {
            num = Integer.valueOf(aVar2.f17998e);
        }
        b(String.valueOf(num));
    }

    @Override // com.bytedance.android.livesdk.gifttray.c.a
    public final void a(DataChannel dataChannel) {
        this.s = dataChannel;
        com.a.a(LayoutInflater.from(this.t), getLayoutResource(), this, true);
        this.f18032j = findViewById(R.id.eqq);
        TextView textView = (TextView) findViewById(R.id.a95);
        this.f18024b = textView;
        if (textView != null) {
            textView.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33796b), 2);
        }
        LiveTextView liveTextView = (LiveTextView) findViewById(R.id.eqr);
        this.q = liveTextView;
        if (liveTextView != null) {
            liveTextView.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33796b), 2);
        }
        this.f18025c = (ImageView) findViewById(R.id.fd0);
        this.f18023a = (HSImageView) findViewById(R.id.bb_);
        this.f18035m = (TextView) findViewById(R.id.dyv);
        this.n = (TextView) findViewById(R.id.dyo);
        this.o = (ImageView) findViewById(R.id.fcv);
        this.p = (ImageView) findViewById(R.id.bgs);
        invalidate();
        findViewById(R.id.p4).setOnClickListener(new View$OnClickListenerC0377b(this, dataChannel));
        HSImageView hSImageView = this.f18023a;
        if (hSImageView != null) {
            hSImageView.setOnClickListener(new c(this));
        }
        TextView textView2 = this.f18035m;
        if (textView2 != null) {
            textView2.setOnClickListener(new d(this));
        }
        TextView textView3 = this.n;
        if (textView3 != null) {
            textView3.setOnClickListener(new e(this));
        }
        TextView textView4 = this.f18024b;
        if (textView4 != null) {
            textView4.setOnClickListener(new f(this));
        }
        View view = this.f18032j;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public final void a(String str) {
        Long l2;
        long j2;
        Room room;
        com.bytedance.android.livesdk.gifttray.a.a aVar = this.f18027e;
        User user = null;
        if (aVar != null) {
            l2 = Long.valueOf(aVar.y);
        } else {
            l2 = null;
        }
        com.bytedance.android.livesdk.gift.d.h hVar = new com.bytedance.android.livesdk.gift.d.h();
        hVar.f17851b = "gift_panel";
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        hVar.f17854e = j2;
        DataChannel dataChannel = this.s;
        if (!(dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null)) {
            user = room.getOwner();
        }
        hVar.f17850a = user;
        DataChannel dataChannel2 = this.s;
        if (dataChannel2 != null) {
            dataChannel2.c(t.class, hVar);
        }
        com.bytedance.android.livesdk.service.c.i.a.a(str);
    }

    public final void a(ImageView imageView, ImageModel imageModel) {
        ((com.bytedance.android.livesdkapi.host.e) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.e.class)).a(imageModel, new a(this, imageView));
    }
}

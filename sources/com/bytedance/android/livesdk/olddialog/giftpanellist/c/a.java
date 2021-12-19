package com.bytedance.android.livesdk.olddialog.giftpanellist.c;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeStyleSetting;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.olddialog.giftpanellist.c.b;
import com.bytedance.android.livesdk.olddialog.giftpanellist.view.LiveGiftCountDownView;
import com.bytedance.android.livesdk.service.c.a.a;
import com.bytedance.android.livesdk.service.c.c.a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.File;
import java.util.Objects;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f20040a;

    /* renamed from: b  reason: collision with root package name */
    public LiveGiftCountDownView f20041b;

    /* renamed from: c  reason: collision with root package name */
    public LottieAnimationView f20042c;

    /* renamed from: d  reason: collision with root package name */
    public LiveTextView f20043d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f20044e;
    private LiveTextView s;
    private LiveTextView t;
    private View u;
    private final String v = "firstgift/images";
    private final String w = "firstgift/data.json";

    static {
        Covode.recordClassIndex(11836);
    }

    /* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.a$a  reason: collision with other inner class name */
    static final class RunnableC0408a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f20045a;

        static {
            Covode.recordClassIndex(11837);
        }

        RunnableC0408a(a aVar) {
            this.f20045a = aVar;
        }

        public final void run() {
            com.bytedance.android.livesdk.service.animation.a.a.c(this.f20045a.f20044e).start();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f20055a;

        static {
            Covode.recordClassIndex(11843);
        }

        f(a aVar) {
            this.f20055a = aVar;
        }

        public final void run() {
            com.bytedance.android.livesdk.service.animation.a.a.c(this.f20055a.f20044e).start();
        }
    }

    public final void a() {
        u g2 = com.bytedance.android.livesdk.firstrecharge.d.u.g();
        long l2 = com.bytedance.android.livesdk.firstrecharge.d.u.l();
        if (g2 != null) {
            a((int) l2, g2.f19763f);
            a(g2);
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final boolean e() {
        if (this.f20062j.f17864b instanceof u) {
            T t2 = this.f20062j.f17864b;
            Objects.requireNonNull(t2, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.Gift");
            ImageModel imageModel = ((u) t2).p;
            if (imageModel == null || imageModel.mUrls == null || imageModel.mUrls.size() <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (!e()) {
            if (com.bytedance.android.livesdk.firstrecharge.d.u.f()) {
                this.f20060h.postDelayed(new f(this), 50);
                return;
            }
            LottieAnimationView lottieAnimationView = this.f20042c;
            if (lottieAnimationView != null) {
                lottieAnimationView.a();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void c() {
        LiveTextView liveTextView;
        LiveGiftCountDownView liveGiftCountDownView;
        HSImageView hSImageView;
        super.c();
        ImageView imageView = this.f20044e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (this.f20040a && com.bytedance.android.livesdk.firstrecharge.d.u.f() && (hSImageView = this.f20060h) != null) {
            hSImageView.setVisibility(0);
        }
        LiveTextView liveTextView2 = this.f20059g;
        l.b(liveTextView2, "");
        liveTextView2.setVisibility(0);
        LiveTextView liveTextView3 = this.s;
        if (liveTextView3 != null) {
            liveTextView3.setTextColor(y.b((int) R.color.xk));
        }
        if (com.bytedance.android.livesdk.firstrecharge.d.u.e() && (liveGiftCountDownView = this.f20041b) != null) {
            liveGiftCountDownView.setVisibility(0);
        }
        if (!com.bytedance.android.livesdk.firstrecharge.d.u.f() && (liveTextView = this.f20043d) != null) {
            liveTextView.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void b() {
        LiveTextView liveTextView;
        LiveGiftCountDownView liveGiftCountDownView;
        ImageView imageView;
        super.b();
        if (this.f20040a && com.bytedance.android.livesdk.firstrecharge.d.u.f() && (imageView = this.f20044e) != null) {
            imageView.setVisibility(0);
        }
        HSImageView hSImageView = this.f20060h;
        if (hSImageView != null) {
            hSImageView.setVisibility(8);
        }
        LiveTextView liveTextView2 = this.f20059g;
        l.b(liveTextView2, "");
        liveTextView2.setVisibility(8);
        LiveTextView liveTextView3 = this.s;
        if (liveTextView3 != null) {
            liveTextView3.setTextColor(y.b((int) R.color.xl));
        }
        if (com.bytedance.android.livesdk.firstrecharge.d.u.e() && (liveGiftCountDownView = this.f20041b) != null) {
            liveGiftCountDownView.setVisibility(8);
        }
        if (!com.bytedance.android.livesdk.firstrecharge.d.u.f() && (liveTextView = this.f20043d) != null) {
            liveTextView.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void d() {
        T t2;
        ImageModel imageModel;
        if (this.f20040a) {
            super.d();
            com.bytedance.android.livesdk.gift.model.a.b bVar = this.f20062j;
            ImageModel imageModel2 = null;
            if (bVar != null) {
                t2 = bVar.f17864b;
            } else {
                t2 = null;
            }
            if (t2 instanceof u) {
                T t3 = this.f20062j.f17864b;
                if (!(t3 instanceof u)) {
                    t3 = null;
                }
                u uVar = (u) t3;
                if (uVar != null) {
                    imageModel2 = uVar.p;
                }
                if (e()) {
                    if (uVar != null) {
                        long j2 = uVar.f19761d;
                        if (imageModel2 != null) {
                            boolean z = false;
                            try {
                                z = k.a(Uri.parse(imageModel2.mUrls.get(0)));
                            } catch (Exception unused) {
                            }
                            p.a(this.f20044e, imageModel2, -1, -1, true, 2131234630, new b(j2, z));
                        }
                    }
                } else if (!(uVar == null || (imageModel = uVar.f19759b) == null)) {
                    p.b(this.f20044e, imageModel);
                }
            }
            LiveTextView liveTextView = this.t;
            if (liveTextView != null) {
                liveTextView.setText(y.a((int) R.string.em9));
                return;
            }
            return;
        }
        com.bytedance.android.livesdk.service.c.c.a aVar = a.C0460a.C0461a.f21366a;
        com.bytedance.android.livesdk.gift.model.a.b bVar2 = this.f20062j;
        l.b(bVar2, "");
        aVar.a(bVar2.d());
        com.bytedance.android.livesdk.service.c.c.a aVar2 = a.C0460a.C0461a.f21366a;
        com.bytedance.android.livesdk.gift.model.a.b bVar3 = this.f20062j;
        l.b(bVar3, "");
        aVar2.a(bVar3.d(), true);
        try {
            com.bytedance.android.livesdk.service.c.c.a aVar3 = a.C0460a.C0461a.f21366a;
            com.bytedance.android.livesdk.gift.model.a.b bVar4 = this.f20062j;
            l.b(bVar4, "");
            aVar3.b(bVar4.d());
        } catch (Exception unused2) {
        }
        LiveTextView liveTextView2 = this.t;
        if (liveTextView2 != null) {
            liveTextView2.setText(y.a((int) R.string.ecm));
        }
    }

    public static final class e extends com.facebook.drawee.c.c<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f20051a;

        static {
            Covode.recordClassIndex(11841);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f20051a = aVar;
        }

        /* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.a$e$a  reason: collision with other inner class name */
        public static final class C0409a extends com.facebook.fresco.animation.c.c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f20052a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f20053b;

            /* renamed from: c  reason: collision with root package name */
            private int f20054c;

            static {
                Covode.recordClassIndex(11842);
            }

            @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
            public final void b(com.facebook.fresco.animation.c.a aVar) {
                l.d(aVar, "");
                View view = this.f20052a.f20051a.f20065m;
                l.b(view, "");
                view.setClickable(true);
                LiveGiftCountDownView liveGiftCountDownView = this.f20052a.f20051a.f20041b;
                if (liveGiftCountDownView != null) {
                    liveGiftCountDownView.setVisibility(8);
                }
                View view2 = this.f20052a.f20051a.n;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                HSImageView hSImageView = this.f20052a.f20051a.f20060h;
                if (hSImageView != null) {
                    hSImageView.setVisibility(8);
                }
                ImageView imageView = this.f20052a.f20051a.f20044e;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                LottieAnimationView lottieAnimationView = this.f20052a.f20051a.f20042c;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView2 = this.f20052a.f20051a.f20042c;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.c();
                }
                LiveTextView liveTextView = this.f20052a.f20051a.f20059g;
                l.b(liveTextView, "");
                com.bytedance.android.livesdk.gift.model.a.b bVar = this.f20052a.f20051a.f20062j;
                l.b(bVar, "");
                liveTextView.setText(bVar.a());
                LiveTextView liveTextView2 = this.f20052a.f20051a.f20059g;
                if (liveTextView2 != null) {
                    liveTextView2.setVisibility(8);
                }
                LiveTextView liveTextView3 = this.f20052a.f20051a.f20043d;
                if (liveTextView3 != null) {
                    liveTextView3.setVisibility(8);
                }
                this.f20052a.f20051a.a();
            }

            C0409a(e eVar, int i2) {
                this.f20052a = eVar;
                this.f20053b = i2;
            }

            @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
            public final void a(com.facebook.fresco.animation.c.a aVar, int i2) {
                l.d(aVar, "");
                int i3 = this.f20054c;
                if ((i3 != 0 || this.f20053b > 1) && i3 <= i2) {
                    this.f20054c = i2;
                } else {
                    aVar.stop();
                }
            }
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
            l.d(str, "");
            Objects.requireNonNull(animatable, "null cannot be cast to non-null type com.facebook.fresco.animation.drawable.AnimatedDrawable2");
            com.facebook.fresco.animation.c.a aVar = (com.facebook.fresco.animation.c.a) animatable;
            aVar.a(new C0409a(this, aVar.c()));
        }
    }

    private final void a(u uVar) {
        p.b(this.f20060h, uVar.f19759b);
    }

    public static final class b implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f20046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f20047b;

        static {
            Covode.recordClassIndex(11838);
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel) {
            a.C0452a.C0453a.f21303a.a(this.f20046a, 0);
        }

        b(long j2, boolean z) {
            this.f20046a = j2;
            this.f20047b = z;
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, Exception exc) {
            String str;
            if (exc.getMessage() != null) {
                str = exc.getMessage();
                if (str == null) {
                    return;
                }
            } else {
                str = "Download Error";
            }
            com.bytedance.android.livesdk.service.c.a.a.a(this.f20046a, str);
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, int i2, int i3) {
            a.C0452a.C0453a.f21303a.a(this.f20046a, this.f20047b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f20048a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.a f20049b;

        static {
            Covode.recordClassIndex(11839);
        }

        c(a aVar, b.a aVar2) {
            this.f20048a = aVar;
            this.f20049b = aVar2;
        }

        public final void onClick(View view) {
            b.a aVar = this.f20049b;
            if (aVar != null) {
                aVar.a(this.f20048a.f20062j, this.f20048a);
            }
            b.a aVar2 = this.f20048a.f20063k;
            if (aVar2 != null) {
                a aVar3 = this.f20048a;
                com.bytedance.android.livesdk.gift.model.a.b bVar = aVar3.f20062j;
                l.b(bVar, "");
                aVar2.a(aVar3, bVar.d(), this.f20048a.f20062j);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void a(b.a aVar) {
        this.f20065m.setOnClickListener(new c(this, aVar));
        this.f20065m.setOnTouchListener(new d(this));
        this.f20063k = aVar;
    }

    static final class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f20050a;

        static {
            Covode.recordClassIndex(11840);
        }

        d(a aVar) {
            this.f20050a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.d(motionEvent, "");
            if (this.f20050a.q) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                com.bytedance.android.livesdk.service.animation.a.a.a(view).start();
            } else if (1 == motionEvent.getAction()) {
                com.bytedance.android.livesdk.service.animation.a.a.b(view).start();
            } else if (3 == motionEvent.getAction()) {
                com.bytedance.android.livesdk.service.animation.a.a.b(view).start();
            }
            return false;
        }
    }

    private final void a(int i2, int i3) {
        if (!this.f20040a) {
            View view = this.u;
            if (view != null) {
                view.setVisibility(8);
            }
            LiveTextView liveTextView = this.s;
            if (liveTextView == null) {
                l.b();
            }
            liveTextView.setText(y.a((int) R.string.e98));
            return;
        }
        View view2 = this.u;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        LiveTextView liveTextView2 = this.s;
        if (liveTextView2 == null) {
            l.b();
        }
        liveTextView2.setText(b(i2, i3));
    }

    private static SpannableString b(int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        sb.append(" ");
        sb.append(" ");
        sb.append(i2);
        sb.append(" ");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new StrikethroughSpan(), String.valueOf(i3).length() + 1, String.valueOf(i3).length() + String.valueOf(i2).length() + 3, 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#99999E")), String.valueOf(i3).length() + 1, String.valueOf(i3).length() + String.valueOf(i2).length() + 3, 33);
        return spannableString;
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void a(com.bytedance.android.livesdk.gift.model.a.b<?> bVar, int i2) {
        Context context;
        this.f20044e = (ImageView) this.f20065m.findViewById(R.id.baz);
        this.s = (LiveTextView) this.f20065m.findViewById(R.id.cuj);
        this.f20060h = (HSImageView) this.f20065m.findViewById(R.id.cuk);
        this.t = (LiveTextView) this.f20065m.findViewById(R.id.bsu);
        this.f20041b = (LiveGiftCountDownView) this.itemView.findViewById(R.id.el0);
        LiveTextView liveTextView = this.f20059g;
        l.b(liveTextView, "");
        liveTextView.setVisibility(0);
        this.f20043d = (LiveTextView) this.f20065m.findViewById(R.id.c9w);
        this.f20042c = (LottieAnimationView) this.f20065m.findViewById(R.id.b3n);
        LiveTextView liveTextView2 = this.s;
        if (liveTextView2 != null) {
            liveTextView2.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
        }
        LiveTextView liveTextView3 = this.f20043d;
        if (liveTextView3 != null) {
            liveTextView3.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
        }
        this.u = this.f20065m.findViewById(R.id.a84);
        super.a(bVar, i2);
        if (this.f20063k != null) {
            b.a aVar = this.f20063k;
            l.b(aVar, "");
            if (aVar.a() == this.f20062j) {
                HSImageView hSImageView = this.f20060h;
                l.b(hSImageView, "");
                hSImageView.setVisibility(8);
                ImageView imageView = this.f20044e;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            }
            b.a aVar2 = this.f20063k;
            com.bytedance.android.livesdk.gift.model.a.b bVar2 = this.f20062j;
            l.b(bVar2, "");
            if (aVar2.b(bVar2.d()) && !e()) {
                this.f20060h.postDelayed(new RunnableC0408a(this), 50);
            }
        }
        ImageView imageView2 = this.f20058f;
        l.b(imageView2, "");
        imageView2.setVisibility(8);
        LiveGiftCountDownView liveGiftCountDownView = this.f20041b;
        if (liveGiftCountDownView != null) {
            liveGiftCountDownView.a();
        }
        if (this.f20040a) {
            com.bytedance.android.livesdk.firstrecharge.d.u.j();
        }
        if (!this.f20040a) {
            LiveTextView liveTextView4 = this.f20043d;
            if (liveTextView4 != null) {
                liveTextView4.setText(y.a((int) R.string.ebr));
            }
            LiveTextView liveTextView5 = this.f20043d;
            if (liveTextView5 != null) {
                liveTextView5.setVisibility(0);
            }
            a();
            HSImageView hSImageView2 = this.f20060h;
            if (hSImageView2 != null) {
                hSImageView2.setVisibility(8);
            }
            ImageView imageView3 = this.f20044e;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            LiveTextView liveTextView6 = this.f20059g;
            l.b(liveTextView6, "");
            liveTextView6.setText(y.a((int) R.string.e9b));
            LiveTextView liveTextView7 = this.s;
            if (liveTextView7 != null) {
                liveTextView7.setText(y.a((int) R.string.e98));
            }
            View view = this.u;
            if (view != null) {
                view.setVisibility(8);
            }
            LiveGiftCountDownView liveGiftCountDownView2 = this.f20041b;
            if (liveGiftCountDownView2 != null) {
                liveGiftCountDownView2.setVisibility(8);
            }
        } else if (com.bytedance.android.livesdk.firstrecharge.d.u.f()) {
            LiveTextView liveTextView8 = this.f20043d;
            if (liveTextView8 != null) {
                liveTextView8.setText(y.a((int) R.string.ebr));
            }
            if (!com.bytedance.android.livesdk.firstrecharge.d.u.f17739g || LiveFirstRechargeStyleSetting.INSTANCE.getValue()) {
                a();
                LiveTextView liveTextView9 = this.f20059g;
                l.b(liveTextView9, "");
                com.bytedance.android.livesdk.gift.model.a.b bVar3 = this.f20062j;
                l.b(bVar3, "");
                liveTextView9.setText(bVar3.a());
                LiveTextView liveTextView10 = this.f20043d;
                if (liveTextView10 != null) {
                    liveTextView10.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView = this.f20042c;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(8);
                }
                HSImageView hSImageView3 = this.f20060h;
                if (hSImageView3 != null) {
                    hSImageView3.setVisibility(8);
                }
                ImageView imageView4 = this.f20044e;
                if (imageView4 != null) {
                    imageView4.setVisibility(0);
                }
                LiveGiftCountDownView liveGiftCountDownView3 = this.f20041b;
                if (liveGiftCountDownView3 != null) {
                    liveGiftCountDownView3.setVisibility(8);
                    return;
                }
                return;
            }
            com.bytedance.android.livesdk.firstrecharge.d.u.f17739g = false;
            File tTLiveGeckoResourceFile = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getTTLiveGeckoResourceFile("tiktok_live_basic_resource", "ttlive_opened_pack.webp");
            if (tTLiveGeckoResourceFile == null || !tTLiveGeckoResourceFile.exists()) {
                View view2 = this.f20065m;
                l.b(view2, "");
                view2.setClickable(true);
                LiveGiftCountDownView liveGiftCountDownView4 = this.f20041b;
                if (liveGiftCountDownView4 != null) {
                    liveGiftCountDownView4.setVisibility(8);
                }
                View view3 = this.n;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                HSImageView hSImageView4 = this.f20060h;
                if (hSImageView4 != null) {
                    hSImageView4.setVisibility(8);
                }
                ImageView imageView5 = this.f20044e;
                if (imageView5 != null) {
                    imageView5.setVisibility(0);
                }
                LottieAnimationView lottieAnimationView2 = this.f20042c;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView3 = this.f20042c;
                if (lottieAnimationView3 != null) {
                    lottieAnimationView3.c();
                }
                LiveTextView liveTextView11 = this.f20059g;
                l.b(liveTextView11, "");
                com.bytedance.android.livesdk.gift.model.a.b bVar4 = this.f20062j;
                l.b(bVar4, "");
                liveTextView11.setText(bVar4.a());
                LiveTextView liveTextView12 = this.f20059g;
                if (liveTextView12 != null) {
                    liveTextView12.setVisibility(8);
                }
                LiveTextView liveTextView13 = this.f20043d;
                if (liveTextView13 != null) {
                    liveTextView13.setVisibility(8);
                }
                a();
                return;
            }
            View view4 = this.n;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            LiveGiftCountDownView liveGiftCountDownView5 = this.f20041b;
            if (liveGiftCountDownView5 != null) {
                liveGiftCountDownView5.setVisibility(8);
            }
            HSImageView hSImageView5 = this.f20060h;
            if (hSImageView5 != null) {
                hSImageView5.setVisibility(8);
            }
            ImageView imageView6 = this.f20044e;
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
            LiveTextView liveTextView14 = this.f20043d;
            if (liveTextView14 != null) {
                liveTextView14.setVisibility(8);
            }
            LottieAnimationView lottieAnimationView4 = this.f20042c;
            if (lottieAnimationView4 != null) {
                lottieAnimationView4.setVisibility(0);
            }
            LottieAnimationView lottieAnimationView5 = this.f20042c;
            if (lottieAnimationView5 != null) {
                lottieAnimationView5.b(false);
            }
            View view5 = this.f20065m;
            l.b(view5, "");
            view5.setClickable(false);
            LiveTextView liveTextView15 = this.f20059g;
            l.b(liveTextView15, "");
            liveTextView15.setText(y.a((int) R.string.e9b));
            LiveTextView liveTextView16 = this.f20059g;
            if (liveTextView16 != null) {
                liveTextView16.setVisibility(0);
            }
            a();
            LottieAnimationView lottieAnimationView6 = this.f20042c;
            if (lottieAnimationView6 != null) {
                context = lottieAnimationView6.getContext();
            } else {
                context = null;
            }
            com.bytedance.android.live.core.f.a.a a2 = com.bytedance.android.live.core.f.a.a.a(context).a(tTLiveGeckoResourceFile).a(ImageView.ScaleType.CENTER_CROP);
            a2.f9023h = true;
            a2.f9017b = new e(this);
            l.b(a2, "");
            a2.a(this.f20042c);
        } else {
            LiveTextView liveTextView17 = this.f20043d;
            if (liveTextView17 != null) {
                liveTextView17.setText(y.a((int) R.string.e_r));
            }
            u h2 = com.bytedance.android.livesdk.firstrecharge.d.h();
            if (h2 != null) {
                a(0, h2.f19763f);
            }
            LiveTextView liveTextView18 = this.f20043d;
            if (liveTextView18 != null) {
                liveTextView18.setVisibility(0);
            }
            LiveGiftCountDownView liveGiftCountDownView6 = this.f20041b;
            if (liveGiftCountDownView6 != null) {
                liveGiftCountDownView6.setVisibility(8);
            }
            HSImageView hSImageView6 = this.f20060h;
            if (hSImageView6 != null) {
                hSImageView6.setVisibility(8);
            }
            ImageView imageView7 = this.f20044e;
            if (imageView7 != null) {
                imageView7.setVisibility(8);
            }
            LiveTextView liveTextView19 = this.f20059g;
            l.b(liveTextView19, "");
            com.bytedance.android.livesdk.gift.model.a.b bVar5 = this.f20062j;
            l.b(bVar5, "");
            liveTextView19.setText(bVar5.a());
            LottieAnimationView lottieAnimationView7 = this.f20042c;
            if (lottieAnimationView7 != null) {
                lottieAnimationView7.setImageAssetsFolder(this.v);
            }
            LottieAnimationView lottieAnimationView8 = this.f20042c;
            if (lottieAnimationView8 != null) {
                lottieAnimationView8.setAnimation(this.w);
            }
            LottieAnimationView lottieAnimationView9 = this.f20042c;
            if (lottieAnimationView9 != null) {
                lottieAnimationView9.b(false);
            }
            LottieAnimationView lottieAnimationView10 = this.f20042c;
            if (lottieAnimationView10 != null) {
                lottieAnimationView10.a();
            }
        }
    }
}

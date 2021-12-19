package com.bytedance.android.livesdk.dialogv2.c;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.firstrecharge.d;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeStyleSetting;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.olddialog.giftpanellist.view.LiveGiftCountDownView;
import com.bytedance.android.livesdk.service.c.a.a;
import com.bytedance.android.livesdk.service.c.c.a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.File;
import java.util.Objects;

public final class c extends a {

    /* renamed from: l  reason: collision with root package name */
    public LiveTextView f16980l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f16981m;
    public LiveGiftCountDownView n;
    public LottieAnimationView o;
    public LiveTextView p;
    public ImageView q;
    private LiveTextView r;
    private View s;
    private final String t = "firstgift/images";
    private final String u = "firstgift/data.json";

    static {
        Covode.recordClassIndex(9436);
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void h() {
        super.h();
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f16982a;

        static {
            Covode.recordClassIndex(9437);
        }

        a(c cVar) {
            this.f16982a = cVar;
        }

        public final void run() {
            com.bytedance.android.livesdk.service.animation.a.a.c(this.f16982a.q).start();
        }
    }

    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f16992a;

        static {
            Covode.recordClassIndex(9442);
        }

        public e(c cVar) {
            this.f16992a = cVar;
        }

        public final void run() {
            com.bytedance.android.livesdk.service.animation.a.a.c(this.f16992a.q).start();
        }
    }

    public final void i() {
        u g2 = com.bytedance.android.livesdk.firstrecharge.d.u.g();
        long l2 = com.bytedance.android.livesdk.firstrecharge.d.u.l();
        if (g2 != null) {
            a((int) l2, g2.f19763f);
            a(g2);
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final boolean e() {
        T t2;
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16966g;
        T t3 = null;
        if (bVar != null) {
            t2 = bVar.f17864b;
        } else {
            t2 = null;
        }
        if (t2 instanceof u) {
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f16966g;
            if (bVar2 != null) {
                t3 = bVar2.f17864b;
            }
            Objects.requireNonNull(t3, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.Gift");
            ImageModel imageModel = ((u) t3).p;
            if (imageModel == null || imageModel.mUrls == null || imageModel.mUrls.size() <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void f() {
        LiveTextView liveTextView;
        LiveGiftCountDownView liveGiftCountDownView;
        HSImageView hSImageView;
        super.f();
        ImageView imageView = this.q;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (this.f16981m && com.bytedance.android.livesdk.firstrecharge.d.u.f() && (hSImageView = this.f16962c) != null) {
            hSImageView.setVisibility(0);
        }
        LiveTextView liveTextView2 = this.f16961b;
        if (liveTextView2 != null) {
            liveTextView2.setVisibility(0);
        }
        LiveTextView liveTextView3 = this.f16980l;
        if (liveTextView3 != null) {
            liveTextView3.setTextColor(y.b((int) R.color.xk));
        }
        if (com.bytedance.android.livesdk.firstrecharge.d.u.e() && (liveGiftCountDownView = this.n) != null) {
            liveGiftCountDownView.setVisibility(0);
        }
        if (!com.bytedance.android.livesdk.firstrecharge.d.u.f() && (liveTextView = this.p) != null) {
            liveTextView.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void d() {
        long j2;
        long j3;
        T t2;
        T t3;
        ImageModel imageModel;
        ImageView imageView;
        if (this.f16981m) {
            super.d();
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16966g;
            ImageModel imageModel2 = null;
            if (bVar != null) {
                t2 = bVar.f17864b;
            } else {
                t2 = null;
            }
            if (t2 instanceof u) {
                com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f16966g;
                if (bVar2 != null) {
                    t3 = bVar2.f17864b;
                } else {
                    t3 = null;
                }
                if (!(t3 instanceof u)) {
                    t3 = null;
                }
                u uVar = (u) t3;
                if (uVar != null) {
                    imageModel2 = uVar.p;
                }
                if (e()) {
                    if (uVar != null) {
                        long j4 = uVar.f19761d;
                        if (imageModel2 != null) {
                            boolean z = false;
                            try {
                                z = k.a(Uri.parse(imageModel2.mUrls.get(0)));
                            } catch (Exception unused) {
                            }
                            p.a(this.q, imageModel2, -1, -1, true, 2131234630, new C0353c(j4, z));
                        }
                    }
                } else if (!(uVar == null || (imageModel = uVar.f19759b) == null || (imageView = this.q) == null)) {
                    p.a(imageView, imageModel, 2131234630, new b(this, imageModel));
                }
            }
            LiveTextView liveTextView = this.r;
            if (liveTextView != null) {
                liveTextView.setText(y.a((int) R.string.em9));
                return;
            }
            return;
        }
        com.bytedance.android.livesdk.service.c.c.a aVar = a.C0460a.C0461a.f21366a;
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar3 = this.f16966g;
        long j5 = 0;
        if (bVar3 != null) {
            j2 = bVar3.d();
        } else {
            j2 = 0;
        }
        aVar.a(j2);
        com.bytedance.android.livesdk.service.c.c.a aVar2 = a.C0460a.C0461a.f21366a;
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar4 = this.f16966g;
        if (bVar4 != null) {
            j3 = bVar4.d();
        } else {
            j3 = 0;
        }
        aVar2.a(j3, true);
        try {
            com.bytedance.android.livesdk.service.c.c.a aVar3 = a.C0460a.C0461a.f21366a;
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar5 = this.f16966g;
            if (bVar5 != null) {
                j5 = bVar5.d();
            }
            aVar3.b(j5);
        } catch (Exception unused2) {
        }
        LiveTextView liveTextView2 = this.r;
        if (liveTextView2 != null) {
            liveTextView2.setText(y.a((int) R.string.ecm));
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void g() {
        int i2;
        LiveGiftCountDownView liveGiftCountDownView;
        ImageView imageView;
        super.g();
        if (this.f16981m && com.bytedance.android.livesdk.firstrecharge.d.u.f() && (imageView = this.q) != null) {
            imageView.setVisibility(0);
        }
        HSImageView hSImageView = this.f16962c;
        if (hSImageView != null) {
            hSImageView.setVisibility(8);
        }
        LiveTextView liveTextView = this.f16961b;
        if (liveTextView != null) {
            liveTextView.setVisibility(8);
        }
        LiveTextView liveTextView2 = this.f16980l;
        if (liveTextView2 != null) {
            liveTextView2.setTextColor(y.b((int) R.color.xl));
        }
        if (com.bytedance.android.livesdk.firstrecharge.d.u.e() && (liveGiftCountDownView = this.n) != null) {
            liveGiftCountDownView.setVisibility(8);
        }
        if (!com.bytedance.android.livesdk.firstrecharge.d.u.f()) {
            LiveTextView liveTextView3 = this.p;
            if (liveTextView3 != null) {
                liveTextView3.setVisibility(0);
            }
            u g2 = com.bytedance.android.livesdk.firstrecharge.d.u.g();
            long l2 = com.bytedance.android.livesdk.firstrecharge.d.u.l();
            if (com.bytedance.android.livesdk.firstrecharge.d.u.m() == d.b.StyleShowDiamond) {
                LiveTextView liveTextView4 = this.f16980l;
                if (liveTextView4 != null) {
                    int i3 = (int) l2;
                    if (g2 != null) {
                        i2 = g2.f19763f;
                    } else {
                        i2 = 0;
                    }
                    liveTextView4.setText(c(i3, i2));
                }
                View view = this.s;
                if (view != null) {
                    view.setVisibility(0);
                }
            }
        }
    }

    public static final class d extends com.facebook.drawee.c.c<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f16988a;

        static {
            Covode.recordClassIndex(9440);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(c cVar) {
            this.f16988a = cVar;
        }

        public static final class a extends com.facebook.fresco.animation.c.c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f16989a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f16990b;

            /* renamed from: c  reason: collision with root package name */
            private int f16991c;

            static {
                Covode.recordClassIndex(9441);
            }

            @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
            public final void b(com.facebook.fresco.animation.c.a aVar) {
                String str;
                l.d(aVar, "");
                View view = this.f16989a.f16988a.itemView;
                l.b(view, "");
                view.setClickable(true);
                LiveGiftCountDownView liveGiftCountDownView = this.f16989a.f16988a.n;
                if (liveGiftCountDownView != null) {
                    liveGiftCountDownView.setVisibility(8);
                }
                View view2 = this.f16989a.f16988a.f16964e;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                HSImageView hSImageView = this.f16989a.f16988a.f16962c;
                if (hSImageView != null) {
                    hSImageView.setVisibility(8);
                }
                ImageView imageView = this.f16989a.f16988a.q;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                LottieAnimationView lottieAnimationView = this.f16989a.f16988a.o;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView2 = this.f16989a.f16988a.o;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.c();
                }
                LiveTextView liveTextView = this.f16989a.f16988a.f16961b;
                if (liveTextView != null) {
                    com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16989a.f16988a.f16966g;
                    if (bVar != null) {
                        str = bVar.a();
                    } else {
                        str = null;
                    }
                    liveTextView.setText(str);
                }
                LiveTextView liveTextView2 = this.f16989a.f16988a.f16961b;
                if (liveTextView2 != null) {
                    liveTextView2.setVisibility(8);
                }
                LiveTextView liveTextView3 = this.f16989a.f16988a.p;
                if (liveTextView3 != null) {
                    liveTextView3.setVisibility(8);
                }
                LiveTextView liveTextView4 = this.f16989a.f16988a.f16980l;
                if (liveTextView4 != null) {
                    liveTextView4.setVisibility(0);
                }
                this.f16989a.f16988a.i();
            }

            a(d dVar, int i2) {
                this.f16989a = dVar;
                this.f16990b = i2;
            }

            @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
            public final void a(com.facebook.fresco.animation.c.a aVar, int i2) {
                l.d(aVar, "");
                int i3 = this.f16991c;
                if ((i3 != 0 || this.f16990b > 1) && i3 <= i2) {
                    this.f16991c = i2;
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
            aVar.a(new a(this, aVar.c()));
        }
    }

    private final void a(u uVar) {
        p.b(this.f16962c, uVar.f19759b);
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.c$c  reason: collision with other inner class name */
    public static final class C0353c implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f16986a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f16987b;

        static {
            Covode.recordClassIndex(9439);
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel) {
            a.C0452a.C0453a.f21303a.a(this.f16986a, 0);
        }

        C0353c(long j2, boolean z) {
            this.f16986a = j2;
            this.f16987b = z;
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
            com.bytedance.android.livesdk.service.c.a.a.a(this.f16986a, str);
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, int i2, int i3) {
            a.C0452a.C0453a.f21303a.a(this.f16986a, this.f16987b);
        }
    }

    public static final class b implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f16983a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ImageModel f16984b;

        /* renamed from: c  reason: collision with root package name */
        private long f16985c;

        static {
            Covode.recordClassIndex(9438);
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel) {
            long j2;
            l.d(imageModel, "");
            com.bytedance.android.livesdk.service.c.c.a aVar = a.C0460a.C0461a.f21366a;
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16983a.f16966g;
            if (bVar != null) {
                j2 = bVar.d();
            } else {
                j2 = 0;
            }
            aVar.a(j2);
            this.f16985c = SystemClock.elapsedRealtime();
        }

        b(c cVar, ImageModel imageModel) {
            this.f16983a = cVar;
            this.f16984b = imageModel;
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, Exception exc) {
            long j2;
            l.d(imageModel, "");
            l.d(exc, "");
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16983a.f16966g;
            long j3 = 0;
            if (bVar != null && bVar.f17863a == 1) {
                com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f16983a.f16966g;
                if (bVar2 != null) {
                    j2 = bVar2.d();
                } else {
                    j2 = 0;
                }
                com.bytedance.android.livesdk.service.c.g.a.a(j2, imageModel.getUri(), exc.getMessage());
            }
            try {
                com.bytedance.android.livesdk.service.c.c.a aVar = a.C0460a.C0461a.f21366a;
                com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar3 = this.f16983a.f16966g;
                if (bVar3 != null) {
                    j3 = bVar3.d();
                }
                aVar.c(j3);
            } catch (Exception unused) {
            }
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, int i2, int i3) {
            long j2;
            String str;
            long j3;
            l.d(imageModel, "");
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16983a.f16966g;
            long j4 = 0;
            if (bVar != null && bVar.f17863a == 1) {
                com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f16983a.f16966g;
                if (bVar2 != null) {
                    j3 = bVar2.d();
                } else {
                    j3 = 0;
                }
                com.bytedance.android.livesdk.service.c.g.a.a(j3, imageModel.getUri());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f16985c;
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar3 = this.f16983a.f16966g;
            if (bVar3 != null) {
                j2 = bVar3.d();
            } else {
                j2 = 0;
            }
            if (imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
                str = "";
            } else {
                str = imageModel.getUrls().get(0);
            }
            l.b(str, "");
            com.bytedance.android.livesdk.service.c.c.c.a(elapsedRealtime, j2, str);
            try {
                com.bytedance.android.livesdk.service.c.c.a aVar = a.C0460a.C0461a.f21366a;
                com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar4 = this.f16983a.f16966g;
                if (bVar4 != null) {
                    j4 = bVar4.d();
                }
                aVar.b(j4);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view) {
        super(view);
        l.d(view, "");
    }

    private final void a(int i2, int i3) {
        if (!this.f16981m) {
            View view = this.s;
            if (view != null) {
                view.setVisibility(8);
            }
            LiveTextView liveTextView = this.f16980l;
            if (liveTextView != null) {
                liveTextView.setText(y.a((int) R.string.e98));
                return;
            }
            return;
        }
        View view2 = this.s;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        LiveTextView liveTextView2 = this.f16980l;
        if (liveTextView2 != null) {
            liveTextView2.setText(b(i2, i3));
        }
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

    private static SpannableString c(int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        sb.append(" ");
        sb.append(" ");
        sb.append(i2);
        sb.append(" ");
        sb.append(" ");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new StrikethroughSpan(), String.valueOf(i3).length() + 1, String.valueOf(i3).length() + String.valueOf(i2).length() + 3, 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#99999E")), String.valueOf(i3).length() + 1, String.valueOf(i3).length() + String.valueOf(i2).length() + 3, 33);
        return spannableString;
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void a(com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar, int i2, DataChannel dataChannel) {
        int i3;
        this.q = (ImageView) this.itemView.findViewById(R.id.baz);
        this.f16980l = (LiveTextView) this.itemView.findViewById(R.id.cuj);
        this.f16962c = (HSImageView) this.itemView.findViewById(R.id.cuk);
        this.r = (LiveTextView) this.itemView.findViewById(R.id.bsu);
        this.n = (LiveGiftCountDownView) this.itemView.findViewById(R.id.el0);
        LiveTextView liveTextView = this.f16961b;
        if (liveTextView != null) {
            liveTextView.setVisibility(0);
        }
        this.p = (LiveTextView) this.itemView.findViewById(R.id.c9w);
        this.o = (LottieAnimationView) this.itemView.findViewById(R.id.b3n);
        LiveTextView liveTextView2 = this.f16980l;
        if (liveTextView2 != null) {
            liveTextView2.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
        }
        LiveTextView liveTextView3 = this.p;
        if (liveTextView3 != null) {
            liveTextView3.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
        }
        this.s = this.itemView.findViewById(R.id.a84);
        super.a(bVar, i2, dataChannel);
        if (a.C0355a.C0356a.f17017a.f17011g == this.f16963d) {
            long j2 = a.C0355a.C0356a.f17017a.f17010f;
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f16966g;
            if (bVar2 != null && j2 == bVar2.d()) {
                HSImageView hSImageView = this.f16962c;
                if (hSImageView != null) {
                    hSImageView.setVisibility(8);
                }
                ImageView imageView = this.q;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                if (!e() && a.C0355a.C0356a.f17017a.f17012h) {
                    a.C0355a.C0356a.f17017a.f17012h = false;
                    HSImageView hSImageView2 = this.f16962c;
                    if (hSImageView2 != null) {
                        hSImageView2.postDelayed(new a(this), 50);
                    }
                }
            }
        }
        ImageView imageView2 = this.f16960a;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        LiveGiftCountDownView liveGiftCountDownView = this.n;
        if (liveGiftCountDownView != null) {
            liveGiftCountDownView.a();
        }
        if (this.f16981m) {
            com.bytedance.android.livesdk.firstrecharge.d.u.j();
        }
        if (this.f16981m) {
            String str = null;
            Context context = null;
            String str2 = null;
            String str3 = null;
            if (com.bytedance.android.livesdk.firstrecharge.d.u.f()) {
                LiveTextView liveTextView4 = this.p;
                if (liveTextView4 != null) {
                    liveTextView4.setText(y.a((int) R.string.ebr));
                }
                if (!com.bytedance.android.livesdk.firstrecharge.d.u.f17739g || LiveFirstRechargeStyleSetting.INSTANCE.getValue()) {
                    i();
                    LiveTextView liveTextView5 = this.f16961b;
                    if (liveTextView5 != null) {
                        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar3 = this.f16966g;
                        if (bVar3 != null) {
                            str3 = bVar3.a();
                        }
                        liveTextView5.setText(str3);
                    }
                    LiveTextView liveTextView6 = this.p;
                    if (liveTextView6 != null) {
                        liveTextView6.setVisibility(8);
                    }
                    LottieAnimationView lottieAnimationView = this.o;
                    if (lottieAnimationView != null) {
                        lottieAnimationView.setVisibility(8);
                    }
                    HSImageView hSImageView3 = this.f16962c;
                    if (hSImageView3 != null) {
                        hSImageView3.setVisibility(8);
                    }
                    ImageView imageView3 = this.q;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                    }
                    LiveGiftCountDownView liveGiftCountDownView2 = this.n;
                    if (liveGiftCountDownView2 != null) {
                        liveGiftCountDownView2.setVisibility(8);
                        return;
                    }
                    return;
                }
                com.bytedance.android.livesdk.firstrecharge.d.u.f17739g = false;
                File tTLiveGeckoResourceFile = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getTTLiveGeckoResourceFile("tiktok_live_basic_resource", "ttlive_opened_pack.webp");
                if (tTLiveGeckoResourceFile == null || !tTLiveGeckoResourceFile.exists()) {
                    View view = this.itemView;
                    l.b(view, "");
                    view.setClickable(true);
                    LiveGiftCountDownView liveGiftCountDownView3 = this.n;
                    if (liveGiftCountDownView3 != null) {
                        liveGiftCountDownView3.setVisibility(8);
                    }
                    View view2 = this.f16964e;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    HSImageView hSImageView4 = this.f16962c;
                    if (hSImageView4 != null) {
                        hSImageView4.setVisibility(8);
                    }
                    ImageView imageView4 = this.q;
                    if (imageView4 != null) {
                        imageView4.setVisibility(0);
                    }
                    LottieAnimationView lottieAnimationView2 = this.o;
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.setVisibility(8);
                    }
                    LottieAnimationView lottieAnimationView3 = this.o;
                    if (lottieAnimationView3 != null) {
                        lottieAnimationView3.c();
                    }
                    LiveTextView liveTextView7 = this.f16961b;
                    if (liveTextView7 != null) {
                        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar4 = this.f16966g;
                        if (bVar4 != null) {
                            str2 = bVar4.a();
                        }
                        liveTextView7.setText(str2);
                    }
                    LiveTextView liveTextView8 = this.f16961b;
                    if (liveTextView8 != null) {
                        liveTextView8.setVisibility(8);
                    }
                    LiveTextView liveTextView9 = this.p;
                    if (liveTextView9 != null) {
                        liveTextView9.setVisibility(8);
                    }
                    i();
                    return;
                }
                View view3 = this.f16964e;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                LiveGiftCountDownView liveGiftCountDownView4 = this.n;
                if (liveGiftCountDownView4 != null) {
                    liveGiftCountDownView4.setVisibility(8);
                }
                HSImageView hSImageView5 = this.f16962c;
                if (hSImageView5 != null) {
                    hSImageView5.setVisibility(8);
                }
                ImageView imageView5 = this.q;
                if (imageView5 != null) {
                    imageView5.setVisibility(8);
                }
                LiveTextView liveTextView10 = this.p;
                if (liveTextView10 != null) {
                    liveTextView10.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView4 = this.o;
                if (lottieAnimationView4 != null) {
                    lottieAnimationView4.setVisibility(0);
                }
                LiveTextView liveTextView11 = this.f16980l;
                if (liveTextView11 != null) {
                    liveTextView11.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView5 = this.o;
                if (lottieAnimationView5 != null) {
                    lottieAnimationView5.b(false);
                }
                View view4 = this.itemView;
                l.b(view4, "");
                view4.setClickable(false);
                LiveTextView liveTextView12 = this.f16961b;
                if (liveTextView12 != null) {
                    liveTextView12.setText(y.a((int) R.string.e9b));
                }
                LiveTextView liveTextView13 = this.f16961b;
                if (liveTextView13 != null) {
                    liveTextView13.setVisibility(0);
                }
                i();
                LottieAnimationView lottieAnimationView6 = this.o;
                if (lottieAnimationView6 != null) {
                    context = lottieAnimationView6.getContext();
                }
                com.bytedance.android.live.core.f.a.a a2 = com.bytedance.android.live.core.f.a.a.a(context).a(tTLiveGeckoResourceFile).a(ImageView.ScaleType.CENTER_CROP);
                a2.f9023h = true;
                a2.f9017b = new d(this);
                l.b(a2, "");
                a2.a(this.o);
                return;
            }
            LiveTextView liveTextView14 = this.p;
            if (liveTextView14 != null) {
                liveTextView14.setText(y.a((int) R.string.e_r));
            }
            u h2 = com.bytedance.android.livesdk.firstrecharge.d.h();
            if (h2 != null) {
                a(0, h2.f19763f);
            }
            LiveTextView liveTextView15 = this.p;
            if (liveTextView15 != null) {
                liveTextView15.setVisibility(0);
            }
            LiveGiftCountDownView liveGiftCountDownView5 = this.n;
            if (liveGiftCountDownView5 != null) {
                liveGiftCountDownView5.setVisibility(8);
            }
            HSImageView hSImageView6 = this.f16962c;
            if (hSImageView6 != null) {
                hSImageView6.setVisibility(8);
            }
            ImageView imageView6 = this.q;
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
            LiveTextView liveTextView16 = this.f16961b;
            if (liveTextView16 != null) {
                com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar5 = this.f16966g;
                if (bVar5 != null) {
                    str = bVar5.a();
                }
                liveTextView16.setText(str);
            }
            LottieAnimationView lottieAnimationView7 = this.o;
            if (lottieAnimationView7 != null) {
                lottieAnimationView7.setImageAssetsFolder(this.t);
            }
            LottieAnimationView lottieAnimationView8 = this.o;
            if (lottieAnimationView8 != null) {
                lottieAnimationView8.setAnimation(this.u);
            }
            LottieAnimationView lottieAnimationView9 = this.o;
            if (lottieAnimationView9 != null) {
                lottieAnimationView9.b(false);
            }
            LottieAnimationView lottieAnimationView10 = this.o;
            if (lottieAnimationView10 != null) {
                lottieAnimationView10.a();
                return;
            }
            return;
        }
        LiveTextView liveTextView17 = this.p;
        if (liveTextView17 != null) {
            liveTextView17.setText(y.a((int) R.string.ebr));
        }
        LiveTextView liveTextView18 = this.p;
        if (liveTextView18 != null) {
            liveTextView18.setVisibility(0);
        }
        i();
        HSImageView hSImageView7 = this.f16962c;
        if (hSImageView7 != null) {
            hSImageView7.setVisibility(8);
        }
        ImageView imageView7 = this.q;
        if (imageView7 != null) {
            imageView7.setVisibility(8);
        }
        LiveTextView liveTextView19 = this.f16961b;
        if (liveTextView19 != null) {
            liveTextView19.setText(y.a((int) R.string.e9b));
        }
        if (com.bytedance.android.livesdk.firstrecharge.d.u.m() == d.b.StyleShowDiamond) {
            u g2 = com.bytedance.android.livesdk.firstrecharge.d.u.g();
            long l2 = com.bytedance.android.livesdk.firstrecharge.d.u.l();
            LiveTextView liveTextView20 = this.f16980l;
            if (liveTextView20 != null) {
                int i4 = (int) l2;
                if (g2 != null) {
                    i3 = g2.f19763f;
                } else {
                    i3 = 0;
                }
                liveTextView20.setText(c(i4, i3));
            }
            LiveTextView liveTextView21 = this.f16961b;
            if (liveTextView21 != null) {
                liveTextView21.setText(y.a((int) R.string.e98));
            }
            View view5 = this.s;
            if (view5 != null) {
                view5.setVisibility(0);
            }
        } else {
            View view6 = this.s;
            if (view6 != null) {
                view6.setVisibility(8);
            }
            LiveTextView liveTextView22 = this.f16980l;
            if (liveTextView22 != null) {
                liveTextView22.setText(y.a((int) R.string.e98));
            }
        }
        LiveGiftCountDownView liveGiftCountDownView6 = this.n;
        if (liveGiftCountDownView6 != null) {
            liveGiftCountDownView6.setVisibility(8);
        }
    }
}

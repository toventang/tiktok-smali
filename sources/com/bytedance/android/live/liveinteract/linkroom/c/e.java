package com.bytedance.android.live.liveinteract.linkroom.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.m;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.ap;
import com.bytedance.android.live.liveinteract.api.u;
import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.android.live.liveinteract.linkroom.c.a;
import com.bytedance.android.live.liveinteract.platform.common.g.v;
import com.bytedance.android.live.p.s;
import com.bytedance.android.livesdk.chatroom.interact.model.g;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTestSkipLinkMicBundleCheckSetting;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import h.p;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class e implements a {
    public static final a o = new a((byte) 0);
    private final a.AbstractC0160a A = new j(this);
    private final com.bytedance.android.livesdk.b.a.f<Integer> B = new c(this);
    private final Runnable C = new b(this);
    private final a.b D;
    private m E;

    /* renamed from: b  reason: collision with root package name */
    public View f10563b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10564c;

    /* renamed from: d  reason: collision with root package name */
    public DataChannel f10565d;

    /* renamed from: e  reason: collision with root package name */
    LiveTextView f10566e;

    /* renamed from: f  reason: collision with root package name */
    public LiveTextView f10567f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f10568g;

    /* renamed from: h  reason: collision with root package name */
    public VHeadView f10569h;

    /* renamed from: i  reason: collision with root package name */
    f.a.b.b f10570i;

    /* renamed from: j  reason: collision with root package name */
    HSImageView f10571j;

    /* renamed from: k  reason: collision with root package name */
    public int f10572k;

    /* renamed from: l  reason: collision with root package name */
    public int f10573l;

    /* renamed from: m  reason: collision with root package name */
    boolean f10574m;
    long n;
    private boolean p;
    private com.bytedance.android.live.liveinteract.platform.common.f.a q = new com.bytedance.android.live.liveinteract.platform.common.f.a((byte) 0);
    private boolean r;
    private boolean s;
    private Context t;
    private LottieAnimationView u;
    private HSAnimImageView v;
    private View w;
    private boolean x;
    private LiveAutoRtlTextView y;
    private ImageView z;

    static {
        Covode.recordClassIndex(5630);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(boolean z2) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5631);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void b() {
        i();
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final boolean c() {
        return this.r;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final boolean d() {
        return this.s;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f10575a;

        static {
            Covode.recordClassIndex(5632);
        }

        b(e eVar) {
            this.f10575a = eVar;
        }

        public final void run() {
            com.bytedance.android.live.design.view.j.a(this.f10575a.n);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final void e() {
        if (this.s || this.r) {
            e(true);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final void f() {
        View view = this.w;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        View view = this.f10563b;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static final class j extends a.AbstractC0160a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f10577a;

        static {
            Covode.recordClassIndex(5640);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.a.c.a.AbstractC0160a
        public final void a() {
            String str;
            com.bytedance.android.live.design.view.j.a(this.f10577a.n);
            e eVar = this.f10577a;
            g.a aVar = com.bytedance.android.live.liveinteract.cohost.a.c.a.o;
            if (aVar == null || (str = aVar.f15615f) == null) {
                str = "";
            }
            l.b(str, "");
            eVar.a(str, true);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.a.c.a.AbstractC0160a
        public final void b() {
            com.bytedance.android.live.design.view.j.a(this.f10577a.n);
            this.f10577a.g();
            LiveTextView liveTextView = this.f10577a.f10567f;
            if (liveTextView != null) {
                liveTextView.setVisibility(8);
            }
            ImageView imageView = this.f10577a.f10568g;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(e eVar) {
            this.f10577a = eVar;
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.a.c.a.AbstractC0160a
        public final void a(p<? extends a.g, Long> pVar) {
            String str;
            long j2;
            String str2;
            l.d(pVar, "");
            if (this.f10577a.f10573l == 1) {
                String str3 = null;
                long j3 = 16;
                if (pVar.getFirst() == a.g.COUNTDOWN_WAITING) {
                    ImageView imageView = this.f10577a.f10568g;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    LiveTextView liveTextView = this.f10577a.f10567f;
                    if (liveTextView != null) {
                        liveTextView.setVisibility(0);
                    }
                    g.a aVar = com.bytedance.android.live.liveinteract.cohost.a.c.a.o;
                    if (aVar != null) {
                        j3 = (long) aVar.f15610a;
                    }
                    g.a aVar2 = com.bytedance.android.live.liveinteract.cohost.a.c.a.o;
                    if (aVar2 != null) {
                        j2 = (long) (aVar2.f15610a - aVar2.f15612c);
                    } else {
                        j2 = 12;
                    }
                    long longValue = pVar.getSecond().longValue();
                    if (longValue == j3) {
                        e eVar = this.f10577a;
                        List<? extends ImageModel> list = com.bytedance.android.live.liveinteract.cohost.a.c.a.n;
                        if (list != null && list.size() >= 5) {
                            z.c cVar = new z.c();
                            cVar.element = 0;
                            eVar.f10570i = com.bytedance.android.livesdk.utils.b.b.a(2300, TimeUnit.MILLISECONDS).a(new com.bytedance.android.livesdk.util.rxutils.f()).d(new k(eVar, com.bytedance.android.live.liveinteract.cohost.a.c.a.n, cVar));
                        }
                    } else if (longValue == j2 && com.bytedance.android.live.liveinteract.cohost.a.c.a.e()) {
                        g.a aVar3 = com.bytedance.android.live.liveinteract.cohost.a.c.a.o;
                        if (aVar3 != null) {
                            str3 = aVar3.f15613d;
                        }
                        if (e.a(str3)) {
                            com.bytedance.android.live.design.view.j.a(this.f10577a.n);
                            e eVar2 = this.f10577a;
                            g.a aVar4 = com.bytedance.android.live.liveinteract.cohost.a.c.a.o;
                            if (aVar4 == null || (str2 = aVar4.f15613d) == null) {
                                str2 = "";
                            }
                            l.b(str2, "");
                            eVar2.a(str2, false);
                        }
                    }
                    LiveTextView liveTextView2 = this.f10577a.f10567f;
                    if (liveTextView2 != null) {
                        liveTextView2.setText(String.valueOf(pVar.getSecond().longValue()));
                    }
                } else if (pVar.getFirst() == a.g.TIMEOUT_WAITING) {
                    LiveTextView liveTextView3 = this.f10577a.f10567f;
                    if (liveTextView3 != null) {
                        liveTextView3.setVisibility(8);
                    }
                    ImageView imageView2 = this.f10577a.f10568g;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                    g.a aVar5 = com.bytedance.android.live.liveinteract.cohost.a.c.a.o;
                    if (aVar5 != null) {
                        j3 = (long) aVar5.f15610a;
                    }
                    if (pVar.getSecond().longValue() == j3 + 1 && com.bytedance.android.live.liveinteract.cohost.a.c.a.e()) {
                        g.a aVar6 = com.bytedance.android.live.liveinteract.cohost.a.c.a.o;
                        if (aVar6 != null) {
                            str3 = aVar6.f15614e;
                        }
                        if (e.a(str3)) {
                            com.bytedance.android.live.design.view.j.a(this.f10577a.n);
                            e eVar3 = this.f10577a;
                            g.a aVar7 = com.bytedance.android.live.liveinteract.cohost.a.c.a.o;
                            if (aVar7 == null || (str = aVar7.f15614e) == null) {
                                str = "";
                            }
                            l.b(str, "");
                            eVar3.a(str, false);
                        }
                    }
                }
            }
        }
    }

    public final void g() {
        f.a.b.b bVar = this.f10570i;
        if (bVar != null) {
            bVar.dispose();
        }
        VHeadView vHeadView = this.f10569h;
        if (vHeadView != null) {
            vHeadView.setVisibility(8);
        }
    }

    public final void i() {
        if (this.x) {
            b(2131234482);
        } else {
            b(2131234481);
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
        HSAnimImageView hSAnimImageView = this.v;
        if (hSAnimImageView != null) {
            hSAnimImageView.setVisibility(0);
        }
        if (this.x) {
            Drawable c2 = y.c(2131234482);
            l.b(c2, "");
            a(s.a(c2));
            return;
        }
        Drawable c3 = y.c(2131234481);
        l.b(c3, "");
        a(s.a(c3));
    }

    static final class d extends h.f.b.m implements h.f.a.b<h.z, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(5634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h.z zVar) {
            l.d(zVar, "");
            this.this$0.f();
            return h.z.f158842a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.e$e  reason: collision with other inner class name */
    static final class C0193e extends h.f.b.m implements h.f.a.b<String, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(5635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0193e(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(String str) {
            l.d(str, "");
            this.this$0.a(0);
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final void b(boolean z2) {
        this.r = z2;
        this.q.f11945e = Boolean.valueOf(z2);
        e(this.r);
    }

    public final void onClick(View view) {
        l.d(view, "");
        this.D.l();
    }

    static final class c<T> implements com.bytedance.android.livesdk.b.a.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f10576a;

        static {
            Covode.recordClassIndex(5633);
        }

        c(e eVar) {
            this.f10576a = eVar;
        }

        @Override // com.bytedance.android.livesdk.b.a.f
        public final /* synthetic */ void a(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                this.f10576a.f10572k = num.intValue();
                this.f10576a.f();
                if (!this.f10576a.f10564c) {
                    this.f10576a.i();
                }
            }
        }
    }

    private final void e(boolean z2) {
        if (z2 || this.s || this.r) {
            a(0, 17);
        } else {
            a(8, 17);
        }
    }

    private final void f(boolean z2) {
        if (this.x) {
            ImageView imageView = this.z;
            if (imageView != null) {
                com.bytedance.android.livesdk.utils.p.a(imageView, z2);
            }
            LiveAutoRtlTextView liveAutoRtlTextView = this.y;
            if (liveAutoRtlTextView != null) {
                com.bytedance.android.livesdk.utils.p.a(liveAutoRtlTextView, z2);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final void d(boolean z2) {
        if (z2) {
            a(8, 17);
            com.bytedance.android.live.design.view.j.a(this.n);
        } else if (this.s || this.r) {
            a(0, 17);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<Integer, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(5638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Integer num) {
            int intValue = num.intValue();
            e eVar = this.this$0;
            if (!eVar.f10564c || intValue <= 0) {
                LiveTextView liveTextView = eVar.f10566e;
                if (liveTextView != null) {
                    liveTextView.setVisibility(8);
                }
            } else {
                LiveTextView liveTextView2 = eVar.f10566e;
                if (liveTextView2 != null) {
                    liveTextView2.setText(String.valueOf(intValue));
                }
                LiveTextView liveTextView3 = eVar.f10566e;
                if (liveTextView3 != null) {
                    liveTextView3.setVisibility(0);
                }
            }
            return h.z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<h.z, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(5639);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h.z zVar) {
            String a2;
            l.d(zVar, "");
            e eVar = this.this$0;
            if (eVar.h() && eVar.f10573l == 1 && com.bytedance.android.live.liveinteract.linkroom.a.b.a.a("anchor_linkmic_waiting_tips_shown") && !com.bytedance.android.live.liveinteract.cohost.a.c.a.a() && (a2 = y.a((int) R.string.eq9)) != null) {
                eVar.f10574m = true;
                eVar.a(a2, false);
                com.bytedance.android.live.liveinteract.linkroom.a.b.a.b("anchor_linkmic_waiting_tips_shown");
            }
            return h.z.f158842a;
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f10578a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f10579b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f10580c;

        static {
            Covode.recordClassIndex(5641);
        }

        k(e eVar, List list, z.c cVar) {
            this.f10578a = eVar;
            this.f10579b = list;
            this.f10580c = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List list = this.f10579b;
            if (list != null && list.size() >= 10) {
                this.f10580c.element++;
                VHeadView vHeadView = this.f10578a.f10569h;
                if (vHeadView != null) {
                    vHeadView.setVisibility(0);
                }
                VHeadView vHeadView2 = this.f10578a.f10569h;
                List list2 = this.f10579b;
                if (list2 == null) {
                    l.b();
                }
                com.bytedance.android.live.core.f.p.a(vHeadView2, (ImageModel) list2.get(this.f10580c.element % this.f10579b.size()));
            }
        }
    }

    private final void a(Drawable drawable) {
        if (this.x) {
            HSAnimImageView hSAnimImageView = this.v;
            if (hSAnimImageView != null) {
                hSAnimImageView.clearAnimation();
            }
            HSAnimImageView hSAnimImageView2 = this.v;
            if (hSAnimImageView2 != null) {
                hSAnimImageView2.setBackgroundResource(0);
            }
            HSAnimImageView hSAnimImageView3 = this.v;
            if (hSAnimImageView3 != null) {
                hSAnimImageView3.setImageDrawable(null);
            }
            f(true);
            ImageView imageView = this.z;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                return;
            }
            return;
        }
        HSAnimImageView hSAnimImageView4 = this.v;
        if (hSAnimImageView4 != null) {
            hSAnimImageView4.clearAnimation();
        }
        HSAnimImageView hSAnimImageView5 = this.v;
        if (hSAnimImageView5 != null) {
            hSAnimImageView5.setBackgroundResource(0);
        }
        HSAnimImageView hSAnimImageView6 = this.v;
        if (hSAnimImageView6 != null) {
            hSAnimImageView6.setImageDrawable(drawable);
        }
    }

    private void b(int i2) {
        if (this.x) {
            HSAnimImageView hSAnimImageView = this.v;
            if (hSAnimImageView != null) {
                hSAnimImageView.clearAnimation();
            }
            HSAnimImageView hSAnimImageView2 = this.v;
            if (hSAnimImageView2 != null) {
                hSAnimImageView2.setBackgroundResource(0);
            }
            HSAnimImageView hSAnimImageView3 = this.v;
            if (hSAnimImageView3 != null) {
                hSAnimImageView3.setImageDrawable(null);
            }
            f(true);
            ImageView imageView = this.z;
            if (imageView != null) {
                imageView.setImageResource(i2);
                return;
            }
            return;
        }
        HSAnimImageView hSAnimImageView4 = this.v;
        if (hSAnimImageView4 != null) {
            hSAnimImageView4.clearAnimation();
        }
        HSAnimImageView hSAnimImageView5 = this.v;
        if (hSAnimImageView5 != null) {
            hSAnimImageView5.setBackgroundResource(0);
        }
        HSAnimImageView hSAnimImageView6 = this.v;
        if (hSAnimImageView6 != null) {
            hSAnimImageView6.setImageResource(i2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final void c(boolean z2) {
        String str;
        if (this.s != z2) {
            this.s = z2;
            this.q.f11944d = Boolean.valueOf(z2);
            e(this.s);
            if (this.s && h() && com.bytedance.android.live.liveinteract.linkroom.a.b.a.a("anchor_linkmic_tips_shown")) {
                Context context = this.t;
                if (context == null || (str = context.getString(R.string.ego)) == null) {
                    str = "";
                }
                l.b(str, "");
                a(str, false);
                com.bytedance.android.live.liveinteract.linkroom.a.b.a.b("anchor_linkmic_tips_shown");
            }
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<Integer, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(5636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Integer num) {
            ImageModel imageModel;
            int intValue = num.intValue();
            if (b.a.a().b() == com.bytedance.android.live.liveinteract.api.k.INVITING && intValue >= 0) {
                LiveTextView liveTextView = this.this$0.f10567f;
                if (liveTextView != null) {
                    liveTextView.setVisibility(0);
                }
                LiveTextView liveTextView2 = this.this$0.f10567f;
                if (liveTextView2 != null) {
                    liveTextView2.setText(String.valueOf(intValue));
                }
                e eVar = this.this$0;
                HSImageView hSImageView = eVar.f10571j;
                if (hSImageView != null) {
                    hSImageView.setVisibility(0);
                }
                HSImageView hSImageView2 = eVar.f10571j;
                User user = b.a.a().T;
                if (user != null) {
                    imageModel = user.getAvatarThumb();
                } else {
                    imageModel = null;
                }
                com.bytedance.android.livesdk.chatroom.g.g.a(hSImageView2, imageModel, 2131234424);
            }
            return h.z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<com.bytedance.android.live.liveinteract.api.k, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(5637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
            if (com.bytedance.android.live.liveinteract.cohost.a.c.a.a() == false) goto L_0x002f;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.android.live.liveinteract.api.k r5) {
            /*
                r4 = this;
                com.bytedance.android.live.liveinteract.api.k r5 = (com.bytedance.android.live.liveinteract.api.k) r5
                java.lang.String r0 = ""
                h.f.b.l.d(r5, r0)
                com.bytedance.android.live.liveinteract.linkroom.c.e r3 = r4.this$0
                int[] r1 = com.bytedance.android.live.liveinteract.linkroom.c.f.f10581a
                int r0 = r5.ordinal()
                r2 = r1[r0]
                r1 = 1
                r0 = 2
                switch(r2) {
                    case 1: goto L_0x0029;
                    case 2: goto L_0x002f;
                    case 3: goto L_0x0018;
                    case 4: goto L_0x0018;
                    case 5: goto L_0x001e;
                    case 6: goto L_0x001e;
                    default: goto L_0x0016;
                }
            L_0x0016:
                int r1 = r3.f10573l
            L_0x0018:
                r3.a(r1)
                h.z r0 = h.z.f158842a
                return r0
            L_0x001e:
                boolean r0 = com.bytedance.android.live.liveinteract.cohost.a.c.a.b()
                if (r0 != 0) goto L_0x0026
                r1 = 0
                goto L_0x0018
            L_0x0026:
                int r1 = r3.f10573l
                goto L_0x0018
            L_0x0029:
                boolean r0 = com.bytedance.android.live.liveinteract.cohost.a.c.a.a()
                if (r0 != 0) goto L_0x0018
            L_0x002f:
                r1 = 2
                goto L_0x0018
                switch-data {1->0x0029, 2->0x002f, 3->0x0018, 4->0x0018, 5->0x001e, 6->0x001e, }
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.linkroom.c.e.g.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static boolean a(String str) {
        Integer num;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        RandomLinkMicSetting value = LiveRandomLinkmicSetting.INSTANCE.getValue();
        Integer num2 = null;
        if (value != null) {
            num = Integer.valueOf(value.bubbleStrategy);
        } else {
            num = null;
        }
        if (num.intValue() == 0) {
            return false;
        }
        RandomLinkMicSetting value2 = LiveRandomLinkmicSetting.INSTANCE.getValue();
        if (value2 != null) {
            num2 = Integer.valueOf(value2.bubbleStrategy);
        }
        if (num2.intValue() == 1) {
            com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.bZ;
            l.b(bVar, "");
            Integer a2 = bVar.a();
            if (a2 != null && a2.intValue() == 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void a(int i2) {
        HSAnimImageView hSAnimImageView;
        Context context;
        String string;
        if (this.f10573l != i2) {
            this.f10573l = i2;
            f();
            com.bytedance.android.live.design.view.j.a(this.n);
            int i3 = this.f10573l;
            if (i3 == 0) {
                LiveTextView liveTextView = this.f10567f;
                if (liveTextView != null) {
                    liveTextView.setVisibility(8);
                }
                HSImageView hSImageView = this.f10571j;
                if (hSImageView != null) {
                    hSImageView.setVisibility(8);
                }
                ImageView imageView = this.f10568g;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                g();
                i();
            } else if (i3 == 1) {
                f(false);
                if (!this.x && (hSAnimImageView = this.v) != null) {
                    hSAnimImageView.setBackgroundResource(R.drawable.br_);
                }
                HSAnimImageView hSAnimImageView2 = this.v;
                if (hSAnimImageView2 != null) {
                    hSAnimImageView2.a(HSAnimImageView.f9268i.a("tiktok_live_interaction_resource", "ttlive_lottie_icon_time_countdown.webp"));
                }
                HSAnimImageView hSAnimImageView3 = this.v;
                if (hSAnimImageView3 != null) {
                    hSAnimImageView3.a();
                }
            } else if (i3 == 2) {
                if (this.x) {
                    b(2131234480);
                } else {
                    b(2131234479);
                }
                LiveTextView liveTextView2 = this.f10567f;
                if (liveTextView2 != null) {
                    liveTextView2.setVisibility(8);
                }
                HSImageView hSImageView2 = this.f10571j;
                if (hSImageView2 != null) {
                    hSImageView2.setVisibility(8);
                }
                ImageView imageView2 = this.f10568g;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                g();
                if (h() && com.bytedance.android.live.liveinteract.linkroom.a.b.a.a("anchor_linkmic_disconnect_tips_shown") && (context = this.t) != null && (string = context.getString(R.string.dy_)) != null) {
                    l.b(string, "");
                    a(string, false);
                    com.bytedance.android.live.liveinteract.linkroom.a.b.a.b("anchor_linkmic_disconnect_tips_shown");
                }
            }
        }
    }

    public final void a(String str, boolean z2) {
        if (!TextUtils.isEmpty(str)) {
            if (z2) {
                this.n = com.bytedance.android.live.design.view.j.a(this.f10563b, str, -1);
            } else {
                this.n = com.bytedance.android.live.design.view.j.a(this.f10563b, str);
            }
        }
    }

    public e(a.b bVar, m mVar) {
        l.d(bVar, "");
        l.d(mVar, "");
        this.D = bVar;
        this.E = mVar;
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
        l.d(view, "");
        l.d(dataChannel, "");
        dataChannel.b(this);
        com.bytedance.android.live.liveinteract.api.a.c.a().b(this.B);
        View view2 = this.f10563b;
        if (view2 != null) {
            view2.removeCallbacks(this.C);
        }
        this.p = false;
        g();
        com.bytedance.android.live.liveinteract.cohost.a.c.a.b(this.A);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a
    public final void a(int i2, int i3) {
        View view = this.f10563b;
        if (view != null) {
            if (i2 == 0) {
                boolean isPluginAvailable = LiveAppBundleUtils.isPluginAvailable(com.bytedance.android.livesdk.utils.b.LINK_MIC);
                com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkMic_Plugin", "byteResult = " + isPluginAvailable + " byteGate = " + LiveTestSkipLinkMicBundleCheckSetting.INSTANCE.getValue() + ' ');
                if (!isPluginAvailable) {
                    Context context = this.t;
                    if (context == null) {
                        l.b();
                    }
                    LiveAppBundleUtils.ensurePluginAvailable(context, com.bytedance.android.livesdk.utils.b.LINK_MIC);
                    v.a();
                    if (this.q.a()) {
                        v.a(3, (long) this.q.b());
                        return;
                    }
                    return;
                }
                f();
                if (!this.f10564c) {
                    com.bytedance.android.live.liveinteract.platform.common.g.h.a("connection_button");
                } else if (!this.p) {
                    this.p = true;
                    com.bytedance.android.live.liveinteract.platform.common.g.h.a(true, false);
                }
            }
            if (!this.q.f11941a && this.q.a() && i2 == 0) {
                v.b(3, (long) this.q.b());
                this.q.f11941a = true;
            }
            view.setVisibility(i2);
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        boolean z2;
        l.d(view, "");
        l.d(dataChannel, "");
        this.f10563b = view;
        this.t = view.getContext();
        this.f10565d = dataChannel;
        Object b2 = dataChannel.b(ee.class);
        if (b2 == null) {
            l.b();
        }
        this.f10564c = ((Boolean) b2).booleanValue();
        this.u = (LottieAnimationView) view.findViewById(R.id.bt3);
        this.f10566e = (LiveTextView) view.findViewById(R.id.fjh);
        this.v = (HSAnimImageView) view.findViewById(R.id.btq);
        this.f10568g = (ImageView) view.findViewById(R.id.c0a);
        this.f10569h = (VHeadView) view.findViewById(R.id.c0_);
        Boolean bool = (Boolean) dataChannel.b(ea.class);
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        this.x = z2;
        if (z2) {
            LiveAutoRtlTextView liveAutoRtlTextView = (LiveAutoRtlTextView) view.findViewById(R.id.enr);
            this.y = liveAutoRtlTextView;
            if (liveAutoRtlTextView != null) {
                liveAutoRtlTextView.setText(y.a((int) R.string.ede));
            }
            this.z = (ImageView) view.findViewById(R.id.enf);
        }
        LottieAnimationView lottieAnimationView = this.u;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        this.w = view.findViewById(R.id.djx);
        LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.exx);
        liveTextView.setVisibility(8);
        this.f10567f = liveTextView;
        HSImageView hSImageView = (HSImageView) view.findViewById(R.id.bu0);
        hSImageView.setVisibility(8);
        this.f10571j = hSImageView;
        f();
        i();
        com.bytedance.android.live.liveinteract.api.a.c.a().a((com.bytedance.android.livesdk.b.a.f) this.B);
        dataChannel.a(this, com.bytedance.android.live.liveinteract.platform.common.c.l.class, new d(this)).a(this, u.class, new C0193e(this)).a(com.bytedance.android.live.liveinteract.cohost.a.b.j.class, (h.f.a.b) new f(this)).a(ap.class, (h.f.a.b) new g(this)).a(com.bytedance.android.live.liveinteract.platform.common.c.j.class, (h.f.a.b) new h(this)).a(this.E, com.bytedance.android.live.liveinteract.platform.common.c.d.class, (h.f.a.b) new i(this));
        this.p = false;
        com.bytedance.android.live.liveinteract.cohost.a.c.a.a(this.A);
    }
}

package com.bytedance.android.live.liveinteract.linkroom.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.view.j;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.ap;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.android.live.liveinteract.linkroom.c.a;
import com.bytedance.android.live.liveinteract.platform.common.g.v;
import com.bytedance.android.live.p.s;
import com.bytedance.android.livesdk.chatroom.interact.model.g;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTestSkipLinkMicBundleCheckSetting;
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

public final class c implements com.bytedance.android.live.p.f {

    /* renamed from: m  reason: collision with root package name */
    public static final a f10545m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f10546a;

    /* renamed from: b  reason: collision with root package name */
    Context f10547b;

    /* renamed from: c  reason: collision with root package name */
    HSAnimImageView f10548c;

    /* renamed from: d  reason: collision with root package name */
    public LiveTextView f10549d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f10550e;

    /* renamed from: f  reason: collision with root package name */
    public VHeadView f10551f;

    /* renamed from: g  reason: collision with root package name */
    HSImageView f10552g;

    /* renamed from: h  reason: collision with root package name */
    f.a.b.b f10553h;

    /* renamed from: i  reason: collision with root package name */
    boolean f10554i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10555j;

    /* renamed from: k  reason: collision with root package name */
    public int f10556k;

    /* renamed from: l  reason: collision with root package name */
    long f10557l;
    private LiveAutoRtlTextView n;
    private ImageView o;
    private final a.AbstractC0160a p = new e(this);
    private final a.b q;
    private final m r;
    private final com.bytedance.android.live.liveinteract.platform.common.f.a s;

    static {
        Covode.recordClassIndex(5622);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(boolean z) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5623);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void b() {
        if (this.f10556k != 2) {
            e();
        } else {
            f();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        View view = this.f10546a;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static final class e extends a.AbstractC0160a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f10558a;

        static {
            Covode.recordClassIndex(5627);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.a.c.a.AbstractC0160a
        public final void a() {
            String str;
            j.a(this.f10558a.f10557l);
            c cVar = this.f10558a;
            g.a aVar = com.bytedance.android.live.liveinteract.cohost.a.c.a.o;
            if (aVar == null || (str = aVar.f15615f) == null) {
                str = "";
            }
            l.b(str, "");
            cVar.a(str, true);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.a.c.a.AbstractC0160a
        public final void b() {
            j.a(this.f10558a.f10557l);
            this.f10558a.c();
            LiveTextView liveTextView = this.f10558a.f10549d;
            if (liveTextView != null) {
                liveTextView.setVisibility(8);
            }
            ImageView imageView = this.f10558a.f10550e;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(c cVar) {
            this.f10558a = cVar;
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.a.c.a.AbstractC0160a
        public final void a(p<? extends a.g, Long> pVar) {
            String str;
            long j2;
            String str2;
            l.d(pVar, "");
            if (this.f10558a.f10556k == 1) {
                String str3 = null;
                long j3 = 16;
                if (pVar.getFirst() == a.g.COUNTDOWN_WAITING) {
                    ImageView imageView = this.f10558a.f10550e;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    LiveTextView liveTextView = this.f10558a.f10549d;
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
                        c cVar = this.f10558a;
                        List<? extends ImageModel> list = com.bytedance.android.live.liveinteract.cohost.a.c.a.n;
                        if (list != null && list.size() >= 5) {
                            z.c cVar2 = new z.c();
                            cVar2.element = 0;
                            cVar.f10553h = com.bytedance.android.livesdk.utils.b.b.a(2300, TimeUnit.MILLISECONDS).a(new com.bytedance.android.livesdk.util.rxutils.f()).d(new f(cVar, com.bytedance.android.live.liveinteract.cohost.a.c.a.n, cVar2));
                        }
                    } else if (longValue == j2 && com.bytedance.android.live.liveinteract.cohost.a.c.a.e()) {
                        g.a aVar3 = com.bytedance.android.live.liveinteract.cohost.a.c.a.o;
                        if (aVar3 != null) {
                            str3 = aVar3.f15613d;
                        }
                        if (c.a(str3)) {
                            j.a(this.f10558a.f10557l);
                            c cVar3 = this.f10558a;
                            g.a aVar4 = com.bytedance.android.live.liveinteract.cohost.a.c.a.o;
                            if (aVar4 == null || (str2 = aVar4.f15613d) == null) {
                                str2 = "";
                            }
                            l.b(str2, "");
                            cVar3.a(str2, false);
                        }
                    }
                    LiveTextView liveTextView2 = this.f10558a.f10549d;
                    if (liveTextView2 != null) {
                        liveTextView2.setText(String.valueOf(pVar.getSecond().longValue()));
                    }
                } else if (pVar.getFirst() == a.g.TIMEOUT_WAITING) {
                    LiveTextView liveTextView3 = this.f10558a.f10549d;
                    if (liveTextView3 != null) {
                        liveTextView3.setVisibility(8);
                    }
                    ImageView imageView2 = this.f10558a.f10550e;
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
                        if (c.a(str3)) {
                            j.a(this.f10558a.f10557l);
                            c cVar4 = this.f10558a;
                            g.a aVar7 = com.bytedance.android.live.liveinteract.cohost.a.c.a.o;
                            if (aVar7 == null || (str = aVar7.f15614e) == null) {
                                str = "";
                            }
                            l.b(str, "");
                            cVar4.a(str, false);
                        }
                    }
                }
            }
        }
    }

    public final void c() {
        f.a.b.b bVar = this.f10553h;
        if (bVar != null) {
            bVar.dispose();
        }
        VHeadView vHeadView = this.f10551f;
        if (vHeadView != null) {
            vHeadView.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (this.f10554i) {
            b(2131234482);
        } else {
            b(2131234481);
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        if (this.f10554i) {
            b(2131234480);
        } else {
            b(2131234479);
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
        if (this.f10554i) {
            Drawable c2 = y.c(2131234482);
            l.b(c2, "");
            a(s.a(c2));
            return;
        }
        Drawable c3 = y.c(2131234481);
        l.b(c3, "");
        a(s.a(c3));
    }

    public final void onClick(View view) {
        l.d(view, "");
        this.q.m();
    }

    static final class d extends h.f.b.m implements h.f.a.b<h.z, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(5626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h.z zVar) {
            String a2;
            l.d(zVar, "");
            c cVar = this.this$0;
            if (cVar.d() && cVar.f10556k == 1 && com.bytedance.android.live.liveinteract.linkroom.a.b.a.a("anchor_linkmic_waiting_tips_shown") && !com.bytedance.android.live.liveinteract.cohost.a.c.a.a() && (a2 = y.a((int) R.string.eq9)) != null) {
                cVar.a(a2, false);
                com.bytedance.android.live.liveinteract.linkroom.a.b.a.b("anchor_linkmic_waiting_tips_shown");
            }
            return h.z.f158842a;
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f10559a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f10560b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f10561c;

        static {
            Covode.recordClassIndex(5628);
        }

        f(c cVar, List list, z.c cVar2) {
            this.f10559a = cVar;
            this.f10560b = list;
            this.f10561c = cVar2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List list = this.f10560b;
            if (list != null && list.size() >= 10) {
                this.f10561c.element++;
                VHeadView vHeadView = this.f10559a.f10551f;
                if (vHeadView != null) {
                    vHeadView.setVisibility(0);
                }
                VHeadView vHeadView2 = this.f10559a.f10551f;
                List list2 = this.f10560b;
                if (list2 == null) {
                    l.b();
                }
                com.bytedance.android.live.core.f.p.a(vHeadView2, (ImageModel) list2.get(this.f10561c.element % this.f10560b.size()));
            }
        }
    }

    public static boolean a(String str) {
        int i2;
        if (TextUtils.isEmpty(str) || (i2 = LiveRandomLinkmicSetting.INSTANCE.getValue().bubbleStrategy) == 0) {
            return false;
        }
        if (i2 == 1) {
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

    private void b(int i2) {
        if (this.f10554i) {
            HSAnimImageView hSAnimImageView = this.f10548c;
            if (hSAnimImageView != null) {
                hSAnimImageView.clearAnimation();
            }
            HSAnimImageView hSAnimImageView2 = this.f10548c;
            if (hSAnimImageView2 != null) {
                hSAnimImageView2.setBackgroundResource(0);
            }
            HSAnimImageView hSAnimImageView3 = this.f10548c;
            if (hSAnimImageView3 != null) {
                hSAnimImageView3.setImageDrawable(null);
            }
            b(true);
            ImageView imageView = this.o;
            if (imageView != null) {
                imageView.setImageResource(i2);
                return;
            }
            return;
        }
        HSAnimImageView hSAnimImageView4 = this.f10548c;
        if (hSAnimImageView4 != null) {
            hSAnimImageView4.clearAnimation();
        }
        HSAnimImageView hSAnimImageView5 = this.f10548c;
        if (hSAnimImageView5 != null) {
            hSAnimImageView5.setBackgroundResource(0);
        }
        HSAnimImageView hSAnimImageView6 = this.f10548c;
        if (hSAnimImageView6 != null) {
            hSAnimImageView6.setImageResource(i2);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<Integer, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(5624);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Integer num) {
            ImageModel imageModel;
            int intValue = num.intValue();
            if (b.a.a().b() == k.INVITING && intValue >= 0) {
                LiveTextView liveTextView = this.this$0.f10549d;
                if (liveTextView != null) {
                    liveTextView.setVisibility(0);
                }
                LiveTextView liveTextView2 = this.this$0.f10549d;
                if (liveTextView2 != null) {
                    liveTextView2.setText(String.valueOf(intValue));
                }
                c cVar = this.this$0;
                HSImageView hSImageView = cVar.f10552g;
                if (hSImageView != null) {
                    hSImageView.setVisibility(0);
                }
                HSImageView hSImageView2 = cVar.f10552g;
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

    private void a(Drawable drawable) {
        l.d(drawable, "");
        if (this.f10554i) {
            HSAnimImageView hSAnimImageView = this.f10548c;
            if (hSAnimImageView != null) {
                hSAnimImageView.clearAnimation();
            }
            HSAnimImageView hSAnimImageView2 = this.f10548c;
            if (hSAnimImageView2 != null) {
                hSAnimImageView2.setBackgroundResource(0);
            }
            HSAnimImageView hSAnimImageView3 = this.f10548c;
            if (hSAnimImageView3 != null) {
                hSAnimImageView3.setImageDrawable(null);
            }
            b(true);
            ImageView imageView = this.o;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                return;
            }
            return;
        }
        HSAnimImageView hSAnimImageView4 = this.f10548c;
        if (hSAnimImageView4 != null) {
            hSAnimImageView4.clearAnimation();
        }
        HSAnimImageView hSAnimImageView5 = this.f10548c;
        if (hSAnimImageView5 != null) {
            hSAnimImageView5.setBackgroundResource(0);
        }
        HSAnimImageView hSAnimImageView6 = this.f10548c;
        if (hSAnimImageView6 != null) {
            hSAnimImageView6.setImageDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        if (this.f10554i) {
            ImageView imageView = this.o;
            if (imageView != null) {
                com.bytedance.android.livesdk.utils.p.a(imageView, z);
            }
            LiveAutoRtlTextView liveAutoRtlTextView = this.n;
            if (liveAutoRtlTextView != null) {
                com.bytedance.android.livesdk.utils.p.a(liveAutoRtlTextView, z);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.c$c  reason: collision with other inner class name */
    static final class C0192c extends h.f.b.m implements h.f.a.b<k, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(5625);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0192c(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c9, code lost:
            if (com.bytedance.android.live.liveinteract.cohost.a.c.a.a() == false) goto L_0x00cb;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.android.live.liveinteract.api.k r8) {
            /*
            // Method dump skipped, instructions count: 226
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.linkroom.c.c.C0192c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public final void a(int i2) {
        View view = this.f10546a;
        if (view != null) {
            if (i2 == 0) {
                if (this.f10555j) {
                    boolean isPluginAvailable = LiveAppBundleUtils.isPluginAvailable(com.bytedance.android.livesdk.utils.b.LINK_MIC);
                    com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkMic_Plugin", "byteResult = " + isPluginAvailable + " byteGate = " + LiveTestSkipLinkMicBundleCheckSetting.INSTANCE.getValue() + ' ');
                    if (!isPluginAvailable) {
                        Context context = this.f10547b;
                        if (context == null) {
                            l.b();
                        }
                        LiveAppBundleUtils.ensurePluginAvailable(context, com.bytedance.android.livesdk.utils.b.LINK_MIC);
                        v.a();
                        if (this.s.a()) {
                            v.a(1, (long) this.s.b());
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!this.s.f11942b && this.s.a() && i2 == 0) {
                v.b(1, (long) this.s.b());
                this.s.f11942b = true;
            }
            view.setVisibility(i2);
        }
    }

    public final void a(String str, boolean z) {
        long a2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                a2 = j.a(this.f10546a, str, -1);
            } else {
                a2 = j.a(this.f10546a, str);
            }
            this.f10557l = a2;
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
        l.d(view, "");
        l.d(dataChannel, "");
        dataChannel.b(this);
        c();
        com.bytedance.android.live.liveinteract.cohost.a.c.a.b(this.p);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        boolean z;
        l.d(view, "");
        l.d(dataChannel, "");
        this.f10546a = view;
        this.f10547b = view.getContext();
        this.f10548c = (HSAnimImageView) view.findViewById(R.id.btq);
        this.f10550e = (ImageView) view.findViewById(R.id.c0a);
        this.f10551f = (VHeadView) view.findViewById(R.id.c0_);
        LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.exx);
        liveTextView.setVisibility(8);
        this.f10549d = liveTextView;
        HSImageView hSImageView = (HSImageView) view.findViewById(R.id.bu0);
        hSImageView.setVisibility(8);
        this.f10552g = hSImageView;
        Boolean bool = (Boolean) dataChannel.b(ea.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f10554i = z;
        if (z) {
            LiveAutoRtlTextView liveAutoRtlTextView = (LiveAutoRtlTextView) view.findViewById(R.id.enr);
            this.n = liveAutoRtlTextView;
            if (liveAutoRtlTextView != null) {
                liveAutoRtlTextView.setText(y.a((int) R.string.ede));
            }
            this.o = (ImageView) view.findViewById(R.id.enf);
        }
        e();
        dataChannel.a(com.bytedance.android.live.liveinteract.cohost.a.b.j.class, (h.f.a.b) new b(this)).a(ap.class, (h.f.a.b) new C0192c(this)).a(this.r, com.bytedance.android.live.liveinteract.platform.common.c.d.class, (h.f.a.b) new d(this));
        com.bytedance.android.live.liveinteract.cohost.a.c.a.a(this.p);
    }

    public c(a.b bVar, m mVar, com.bytedance.android.live.liveinteract.platform.common.f.a aVar) {
        l.d(bVar, "");
        l.d(mVar, "");
        l.d(aVar, "");
        this.q = bVar;
        this.r = mVar;
        this.s = aVar;
    }
}

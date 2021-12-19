package com.bytedance.android.live.liveinteract.multilive.a.d;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.b.a;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.aa;
import com.bytedance.android.live.liveinteract.api.ab;
import com.bytedance.android.live.liveinteract.api.ad;
import com.bytedance.android.live.liveinteract.api.c.d;
import com.bytedance.android.live.liveinteract.api.x;
import com.bytedance.android.live.liveinteract.multiguest.a.a.c;
import com.bytedance.android.live.liveinteract.multiguest.a.b.a;
import com.bytedance.android.live.liveinteract.multiguest.g.a.a;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.j.ds;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.livesdk.util.rxutils.autodispose.ac;
import com.bytedance.android.livesdk.util.rxutils.autodispose.e;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.datachannel.f;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.R;
import f.a.t;
import java.util.ArrayList;
import java.util.List;

public class a extends m implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, a.b, a.b {

    /* renamed from: a  reason: collision with root package name */
    static final String f11501a = a.class.getSimpleName();
    private View A;
    private View B;
    private boolean C = true;
    private int D;
    private int E;
    private boolean F;
    private b G;
    @d(a = "MULTI_GUEST_DATA_HOLDER")
    private com.bytedance.android.live.liveinteract.multiguest.opt.a.a H;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.api.e.a f11502b;

    /* renamed from: c  reason: collision with root package name */
    public View f11503c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f11504d;

    /* renamed from: e  reason: collision with root package name */
    public v f11505e;

    /* renamed from: f  reason: collision with root package name */
    public a.AbstractC0206a f11506f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.api.b.a f11507g;

    /* renamed from: h  reason: collision with root package name */
    public c f11508h;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f11509i;

    /* renamed from: j  reason: collision with root package name */
    public DataChannel f11510j;

    /* renamed from: k  reason: collision with root package name */
    final f.a.b.a f11511k = new f.a.b.a();

    /* renamed from: l  reason: collision with root package name */
    public a.EnumC0216a f11512l;

    /* renamed from: m  reason: collision with root package name */
    public a.AbstractC0100a f11513m = new a.AbstractC0100a() {
        /* class com.bytedance.android.live.liveinteract.multilive.a.d.a.AnonymousClass3 */

        static {
            Covode.recordClassIndex(6222);
        }

        @Override // com.bytedance.android.live.broadcast.api.b.a.AbstractC0100a
        public final void a(String str, com.bytedance.android.livesdkapi.depend.model.a aVar) {
            a.this.a(str, aVar, 3);
        }

        @Override // com.bytedance.android.live.broadcast.api.b.a.AbstractC0100a
        public final void b(String str, com.bytedance.android.livesdkapi.depend.model.a aVar) {
            a.this.a(str, aVar, 2);
        }
    };
    boolean n = false;
    private HSImageView o;
    private LottieAnimationView p;
    private HSAnimImageView q;
    private ImageView r;
    private View s;
    private View t;
    private View u;
    private TextView v;
    private TextView w;
    private View x;
    private SeekBar y;
    private RecyclerView z;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* access modifiers changed from: package-private */
    public final void a(List<com.bytedance.android.livesdkapi.depend.model.a> list) {
        if (list.isEmpty()) {
            list.add(new com.bytedance.android.livesdkapi.depend.model.a());
            return;
        }
        list.add(0, new com.bytedance.android.livesdkapi.depend.model.a());
        this.f11508h = new c(getContext(), list, new c.a() {
            /* class com.bytedance.android.live.liveinteract.multilive.a.d.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(6221);
            }

            @Override // com.bytedance.android.live.liveinteract.multiguest.a.a.c.a
            public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
                if (a.this.f11507g.a(aVar)) {
                    a.this.f11508h.a(com.bytedance.android.live.effect.api.a.f9638c, aVar, 2);
                } else {
                    a.this.f11507g.a(com.bytedance.android.live.effect.api.a.f9638c, aVar, a.this.f11513m);
                }
            }

            @Override // com.bytedance.android.live.liveinteract.multiguest.a.a.c.a
            public final void b(com.bytedance.android.livesdkapi.depend.model.a aVar) {
                a aVar2 = a.this;
                if (!TextUtils.equals(aVar.f22996b, aVar2.f11506f.c())) {
                    aVar2.f11506f.a(aVar.f22996b);
                    ((IEffectService) com.bytedance.android.live.t.a.a(IEffectService.class)).composerManager().a(com.bytedance.android.live.effect.api.a.f9638c);
                    if (TextUtils.equals(aVar.f22996b, "")) {
                        aVar2.f11506f.a((com.bytedance.android.livesdkapi.depend.model.a) null);
                    } else {
                        ((IEffectService) com.bytedance.android.live.t.a.a(IEffectService.class)).composerManager().a(com.bytedance.android.live.effect.api.a.f9638c, aVar);
                        aVar2.f11506f.a(aVar);
                    }
                    com.bytedance.android.live.broadcast.api.model.d dVar = new com.bytedance.android.live.broadcast.api.model.d("liveinteract", aVar, "");
                    if (aVar2.f11510j != null) {
                        aVar2.f11510j.c(ds.class, dVar);
                    }
                }
            }
        });
        RecyclerView recyclerView = this.z;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.z.setAdapter(this.f11508h);
    }

    static {
        Covode.recordClassIndex(6219);
    }

    private boolean h() {
        if (this.f11512l == a.EnumC0216a.GO_LIVE) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.api.b.a.b
    public final void a() {
        a(new ArrayList());
    }

    public final void b() {
        this.f11504d.setText(String.valueOf(this.y.getProgress()));
        g();
    }

    public final void c() {
        DataChannel a2;
        if (!h() && (a2 = f.a(this)) != null) {
            com.bytedance.android.live.liveinteract.multilive.a.c.a aVar = com.bytedance.android.live.liveinteract.multilive.a.c.a.GUEST_USER_INFO;
            aVar.setGoNextPage(false);
            a2.b(com.bytedance.android.live.liveinteract.multilive.a.a.d.class, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        v vVar = this.f11505e;
        if (vVar != null) {
            vVar.dismiss();
        }
        b bVar = this.G;
        if (bVar != null && bVar.isShowing()) {
            this.G.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.p.d();
        this.q.b();
        this.f11507g.a();
        this.f11509i = false;
        this.f11511k.a();
        this.f11510j.c(com.bytedance.android.live.liveinteract.multilive.a.a.b.class, a.EnumC0216a.SEND_REQUEST);
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        b(false, PrivacyCert.Builder.with("bpea-464").usage("").tag("link mic camera inactive").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        b(true, PrivacyCert.Builder.with("bpea-463").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
    }

    private void f() {
        this.D = 1;
        this.C = true;
        a(true, PrivacyCert.Builder.with("bpea-468").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        ConstraintLayout.a aVar = (ConstraintLayout.a) this.x.getLayoutParams();
        aVar.f2054k = R.id.ebs;
        aVar.f2050g = R.id.ebs;
        aVar.f2047d = R.id.ebs;
        this.x.setLayoutParams(aVar);
        this.y.setVisibility(8);
        this.f11504d.setVisibility(8);
        this.z.setVisibility(0);
        this.A.setVisibility(8);
        this.v.setTextColor(-2130706433);
        this.w.setTextColor(-1);
        this.u.setVisibility(0);
    }

    private void g() {
        int centerX;
        if (this.y.getWidth() == 0 || this.f11504d.getWidth() == 0) {
            this.f11504d.invalidate();
        }
        Rect bounds = this.y.getThumb().getBounds();
        if (com.bytedance.android.live.uikit.c.a.a(getContext())) {
            centerX = -((this.y.getWidth() - bounds.centerX()) - (this.f11504d.getWidth() / 2));
        } else {
            centerX = bounds.centerX() - (this.f11504d.getWidth() / 2);
        }
        this.f11504d.setTranslationX((float) centerX);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        if (this.f11509i) {
            this.E = n.a(getContext());
            View findViewById = this.u.findViewById(R.id.d1d);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = this.E;
            findViewById.setLayoutParams(layoutParams);
            this.f11507g.a(com.bytedance.android.live.effect.api.a.f9638c, this);
            a(PrivacyCert.Builder.with("bpea-469").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.b
    public final void a(String str) {
        d();
        ao.a(y.e(), (int) R.string.e5a);
        DataChannel dataChannel = this.f11510j;
        if (dataChannel != null) {
            dataChannel.c(x.class, str);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.b.a.b
    public final void a(EffectChannelResponse effectChannelResponse) {
        ((ac) t.b((Iterable) effectChannelResponse.getAllCategoryEffects()).d(c.f11518a).h().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a((f.a.ac) e.a(this.z))).a(new d(this), e.f11520a);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.b
    public final void b(Throwable th) {
        com.bytedance.android.live.liveinteract.api.a.c.a().a((Integer) 0);
        this.f11510j.c(aa.class, "");
        com.bytedance.android.livesdk.utils.f.a(y.e(), th);
        d();
    }

    private void a(PrivacyCert privacyCert) {
        this.D = 0;
        this.C = true;
        a(true, privacyCert);
        ConstraintLayout.a aVar = (ConstraintLayout.a) this.x.getLayoutParams();
        aVar.f2054k = R.id.sa;
        aVar.f2050g = R.id.sa;
        aVar.f2047d = R.id.sa;
        this.x.setLayoutParams(aVar);
        this.y.setVisibility(0);
        this.f11504d.setVisibility(0);
        this.z.setVisibility(8);
        this.A.setVisibility(8);
        this.v.setTextColor(-1);
        this.w.setTextColor(-2130706433);
        this.u.setVisibility(0);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.c4t) {
            c();
            return;
        }
        boolean z2 = false;
        if (id == R.id.c5h) {
            Room room = (Room) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.ac.class);
            if (room != null && room.getOwner() != null) {
                b.a aVar = new b.a(getContext());
                aVar.f18284a = y.a((int) R.string.e03, room.getOwner().displayId);
                b a2 = aVar.b(R.string.e6n).b(R.string.e06, f.f11521a, false).a(R.string.e05, (DialogInterface.OnClickListener) new g(this), false).a();
                this.G = a2;
                a2.show();
            }
        } else if (id == R.id.a1m) {
            if (this.C) {
                this.H.f11296f = !this.H.f11296f;
                this.f11502b.a(PrivacyCert.Builder.with("bpea-401").usage("").tag("link mic reverse camera").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        } else if (id == R.id.sa) {
            a(PrivacyCert.Builder.with("bpea-470").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        } else if (id == R.id.ebs) {
            f();
        } else if (id == R.id.fha) {
            boolean z3 = !this.C;
            this.C = z3;
            a(z3, PrivacyCert.Builder.with("bpea-466").usage("").tag("link mic camera inactive").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            if (this.C) {
                int i2 = this.D;
                if (i2 == 0) {
                    a(PrivacyCert.Builder.with("bpea-469").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                } else if (i2 == 1) {
                    f();
                }
                this.B.setVisibility(0);
                return;
            }
            this.u.setVisibility(4);
            this.y.setVisibility(8);
            this.f11504d.setVisibility(8);
            this.z.setVisibility(8);
            this.A.setVisibility(0);
            this.v.setTextColor(-2130706433);
            this.w.setTextColor(-2130706433);
            this.B.setVisibility(4);
        } else if (id != R.id.bcg || this.f11512l != a.EnumC0216a.GO_LIVE || com.bytedance.android.live.liveinteract.api.a.c.a().n.intValue() != 0) {
        } else {
            if (com.bytedance.android.livesdk.b.a.d.a().u >= com.bytedance.android.livesdk.b.a.d.a().x) {
                ao.a(y.e(), (int) R.string.e_g);
                d();
            } else if (b.a.a().a() != 2) {
                ao.a(y.e(), (int) R.string.e9h);
                d();
            } else {
                i.b();
                i.b("invite_issue_check", "replyAnchor");
                ((com.bytedance.android.livesdk.chatroom.interact.a) this.f11502b).c(PrivacyCert.Builder.with("bpea-395").usage("").tag("link mic apply").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                com.bytedance.android.livesdk.b.a.d.a().a(true);
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.H;
                if (this.f11506f.a() != 2) {
                    z2 = true;
                }
                aVar2.f11294d = z2;
                this.f11506f.a(true);
                com.bytedance.android.live.liveinteract.api.a.c.a().a((Integer) 1);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.b
    public final void a(Throwable th) {
        com.bytedance.android.livesdk.utils.f.a(getContext(), th, (int) R.string.gra);
    }

    private void b(boolean z2, PrivacyCert privacyCert) {
        com.bytedance.android.live.broadcast.api.e.a aVar = this.f11502b;
        if (aVar != null) {
            ((com.bytedance.android.livesdk.chatroom.interact.a) aVar).a(true, PrivacyCert.Builder.with("bpea-801").usage("").tag("mute audio in preview dialog").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            if (((View) this.f11502b).getVisibility() == 0) {
                com.bytedance.android.live.broadcast.api.e.a aVar2 = this.f11502b;
                if (!(aVar2 instanceof com.bytedance.android.livesdk.chatroom.interact.a)) {
                    return;
                }
                if (z2) {
                    ((com.bytedance.android.livesdk.chatroom.interact.a) aVar2).b_(privacyCert);
                } else {
                    ((com.bytedance.android.livesdk.chatroom.interact.a) aVar2).a_(privacyCert);
                }
            }
        }
    }

    private void a(boolean z2, PrivacyCert privacyCert) {
        b(z2, privacyCert);
        if (z2) {
            ((View) this.f11502b).setVisibility(0);
            this.s.setBackground(y.c(2131234608));
            this.t.setBackground(y.c(2131234550));
            this.o.setVisibility(4);
            this.q.setVisibility(4);
            this.q.b();
            this.r.setVisibility(4);
            this.f11506f.a(1);
            return;
        }
        ((View) this.f11502b).setVisibility(4);
        this.s.setBackground(y.c(2131234606));
        this.t.setBackground(y.c(2131234548));
        this.o.setVisibility(0);
        this.q.setVisibility(0);
        this.q.a();
        if (!this.F) {
            ImageModel d2 = this.f11506f.d();
            k.a(this.o, d2, new z(5, 0.0f));
            ImageView imageView = this.r;
            g.a(imageView, d2, imageView.getWidth(), this.r.getHeight(), 2131234424);
            this.F = true;
        }
        this.r.setVisibility(0);
        this.f11506f.a(2);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.b
    public final void a(com.bytedance.android.livesdk.chatroom.interact.model.e eVar, boolean z2) {
        if (this.f11512l == a.EnumC0216a.GO_LIVE) {
            this.f11510j.c(ad.class, "");
        }
        com.bytedance.android.livesdk.b.a.d.a().f14184e = eVar.f15601m;
        Room room = (Room) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.ac.class);
        if (room != null) {
            g.a.f14199a.a(room.getOwnerUserId(), eVar.f15601m);
        }
        if (z2) {
            this.f11510j.c(ab.class, true);
            if (MultiLiveServerAutoJoinChannel.INSTANCE.getValue() && eVar.o) {
                com.bytedance.android.livesdk.chatroom.model.c.b bVar = new com.bytedance.android.livesdk.chatroom.model.c.b();
                bVar.f15744a = eVar.o;
                bVar.f15745b = eVar.p;
                bVar.f15746c = eVar.q;
                this.f11510j.b(com.bytedance.android.live.liveinteract.api.ac.class, bVar);
            }
        }
        d();
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        if (i2 >= 0 && i2 <= seekBar.getMax() && z2) {
            b();
            this.f11506f.b(i2);
            this.f11502b.a(i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = com.a.a(layoutInflater, R.layout.b9q, viewGroup, false);
        this.f11502b = (com.bytedance.android.live.broadcast.api.e.a) a2.findViewById(R.id.d97);
        this.f11503c = a2.findViewById(R.id.d8o);
        this.o = (HSImageView) a2.findViewById(R.id.p1);
        this.p = (LottieAnimationView) a2.findViewById(R.id.na);
        this.q = (HSAnimImageView) a2.findViewById(R.id.nb);
        this.r = (ImageView) a2.findViewById(R.id.or);
        this.s = a2.findViewById(R.id.fha);
        this.t = a2.findViewById(R.id.a1m);
        this.u = a2.findViewById(R.id.d1e);
        this.v = (TextView) a2.findViewById(R.id.sa);
        this.w = (TextView) a2.findViewById(R.id.ebs);
        this.x = a2.findViewById(R.id.bo0);
        this.y = (SeekBar) a2.findViewById(R.id.s9);
        this.f11504d = (TextView) a2.findViewById(R.id.s_);
        this.z = (RecyclerView) a2.findViewById(R.id.ebk);
        this.A = a2.findViewById(R.id.nc);
        LiveButton liveButton = (LiveButton) a2.findViewById(R.id.bcg);
        this.B = a2.findViewById(R.id.fhr);
        View findViewById = a2.findViewById(R.id.c4t);
        View findViewById2 = a2.findViewById(R.id.c5h);
        if (h()) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
            liveButton.setVisibility(0);
            com.bytedance.android.live.liveinteract.platform.common.g.i.e();
        } else {
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
            liveButton.setVisibility(8);
        }
        this.f11506f.a(this);
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        liveButton.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.t.setOnClickListener(this);
        this.v.setOnClickListener(this);
        this.w.setOnClickListener(this);
        this.y.setOnSeekBarChangeListener(this);
        this.f11504d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.bytedance.android.live.liveinteract.multilive.a.d.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(6220);
            }

            public final void onGlobalLayout() {
                a.this.b();
                a.this.f11504d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        this.p.setVisibility(8);
        this.q.a(HSAnimImageView.a("tiktok_live_interaction_resource", "audio_interact_effect.webp"));
        this.u.post(new b(this));
        this.f11507g = ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).stickerPresenter();
        this.y.setProgress(this.f11506f.b());
        this.f11509i = true;
        this.F = false;
        return a2;
    }

    public final void a(String str, com.bytedance.android.livesdkapi.depend.model.a aVar, int i2) {
        if (com.bytedance.android.live.effect.api.a.f9638c.equals(str)) {
            this.f11508h.a(str, aVar, i2);
        }
    }
}

package com.bytedance.android.live.liveinteract.multiguest.g.a;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.bytedance.android.live.broadcast.api.model.d;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.aa;
import com.bytedance.android.live.liveinteract.api.ab;
import com.bytedance.android.live.liveinteract.api.ad;
import com.bytedance.android.live.liveinteract.api.x;
import com.bytedance.android.live.liveinteract.multiguest.a.a.c;
import com.bytedance.android.live.liveinteract.multiguest.a.b.a;
import com.bytedance.android.live.liveinteract.multiguest.a.d.a;
import com.bytedance.android.live.liveinteract.platform.common.g.i;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.j.ds;
import com.bytedance.android.livesdk.l.a;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.livesdk.util.rxutils.autodispose.ac;
import com.bytedance.android.livesdk.util.rxutils.autodispose.e;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.f;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.R;
import f.a.t;
import java.util.ArrayList;
import java.util.List;

public class a extends Dialog implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, a.b, a.b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11190a = a.class.getSimpleName();
    private int A;
    private boolean B;
    private a.C0211a C;
    private final f.a.b.a D = new f.a.b.a();
    private final EnumC0216a E;

    /* renamed from: b  reason: collision with root package name */
    public TextView f11191b;

    /* renamed from: c  reason: collision with root package name */
    a.AbstractC0206a f11192c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.api.b.a f11193d;

    /* renamed from: e  reason: collision with root package name */
    public c f11194e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f11195f;

    /* renamed from: g  reason: collision with root package name */
    DataChannel f11196g;

    /* renamed from: h  reason: collision with root package name */
    public a.AbstractC0100a f11197h = new a.AbstractC0100a() {
        /* class com.bytedance.android.live.liveinteract.multiguest.g.a.a.AnonymousClass3 */

        static {
            Covode.recordClassIndex(6017);
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

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.a.d.a f11198i;

    /* renamed from: j  reason: collision with root package name */
    private HSImageView f11199j;

    /* renamed from: k  reason: collision with root package name */
    private com.bytedance.android.live.broadcast.api.e.a f11200k;

    /* renamed from: l  reason: collision with root package name */
    private View f11201l;

    /* renamed from: m  reason: collision with root package name */
    private LottieAnimationView f11202m;
    private HSAnimImageView n;
    private ImageView o;
    private View p;
    private View q;
    private TextView r;
    private TextView s;
    private TextView t;
    private View u;
    private SeekBar v;
    private LiveButton w;
    private RecyclerView x;
    private View y;
    private Dialog z;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        super.dismiss();
    }

    /* access modifiers changed from: package-private */
    public final void a(List<com.bytedance.android.livesdkapi.depend.model.a> list) {
        if (list.isEmpty()) {
            list.add(new com.bytedance.android.livesdkapi.depend.model.a());
            return;
        }
        list.add(0, new com.bytedance.android.livesdkapi.depend.model.a());
        this.f11194e = new c(getContext(), list, new c.a() {
            /* class com.bytedance.android.live.liveinteract.multiguest.g.a.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(6016);
            }

            @Override // com.bytedance.android.live.liveinteract.multiguest.a.a.c.a
            public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
                if (a.this.f11193d.a(aVar)) {
                    a.this.f11194e.a(com.bytedance.android.live.effect.api.a.f9638c, aVar, 2);
                } else {
                    a.this.f11193d.a(com.bytedance.android.live.effect.api.a.f9638c, aVar, a.this.f11197h);
                }
            }

            @Override // com.bytedance.android.live.liveinteract.multiguest.a.a.c.a
            public final void b(com.bytedance.android.livesdkapi.depend.model.a aVar) {
                a aVar2 = a.this;
                if (!TextUtils.equals(aVar.f22996b, aVar2.f11192c.c())) {
                    aVar2.f11192c.a(aVar.f22996b);
                    ((IEffectService) com.bytedance.android.live.t.a.a(IEffectService.class)).composerManager().a(com.bytedance.android.live.effect.api.a.f9638c);
                    if (TextUtils.equals(aVar.f22996b, "")) {
                        aVar2.f11192c.a((com.bytedance.android.livesdkapi.depend.model.a) null);
                    } else {
                        ((IEffectService) com.bytedance.android.live.t.a.a(IEffectService.class)).composerManager().a(com.bytedance.android.live.effect.api.a.f9638c, aVar);
                        aVar2.f11192c.a(aVar);
                    }
                    d dVar = new d("liveinteract", aVar, "");
                    if (aVar2.f11196g != null) {
                        aVar2.f11196g.c(ds.class, dVar);
                    }
                }
            }
        });
        RecyclerView recyclerView = this.x;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.x.setAdapter(this.f11194e);
    }

    public final void a(boolean z2, PrivacyCert privacyCert) {
        com.bytedance.android.live.broadcast.api.e.a aVar = this.f11200k;
        if (aVar != null && ((View) aVar).getVisibility() == 0) {
            com.bytedance.android.live.broadcast.api.e.a aVar2 = this.f11200k;
            if (aVar2 instanceof com.bytedance.android.livesdk.chatroom.interact.a) {
                if (z2) {
                    ((com.bytedance.android.livesdk.chatroom.interact.a) aVar2).b_(privacyCert);
                } else {
                    ((com.bytedance.android.livesdk.chatroom.interact.a) aVar2).a_(privacyCert);
                }
                ((com.bytedance.android.livesdk.chatroom.interact.a) this.f11200k).a(true, PrivacyCert.Builder.with("bpea-800").usage("").tag("mute audio in apply dialog").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        }
    }

    static {
        Covode.recordClassIndex(6014);
    }

    @Override // com.bytedance.android.live.broadcast.api.b.a.b
    public final void a() {
        a(new ArrayList());
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.w.setClickable(false);
        a(true);
        i.f();
        this.f11192c.f();
    }

    public final void c() {
        this.f11191b.setText(String.valueOf(this.v.getProgress()));
        f();
    }

    public void dismiss() {
        ((View) this.f11200k).setVisibility(4);
        this.f11201l.setVisibility(0);
        if (isShowing()) {
            this.f11201l.post(new h(this));
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11192c.a(this);
        this.v.setProgress(this.f11192c.b());
        this.f11195f = true;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.a.a$a  reason: collision with other inner class name */
    public enum EnumC0216a {
        SEND_REQUEST,
        GO_LIVE;

        static {
            Covode.recordClassIndex(6018);
        }
    }

    public void onDetachedFromWindow() {
        this.f11192c.g();
        this.f11202m.d();
        this.n.b();
        this.f11193d.a();
        this.f11195f = false;
        this.D.a();
        com.bytedance.android.live.liveinteract.multiguest.a.d.a aVar = this.f11198i;
        if (aVar != null) {
            aVar.a();
        }
        super.onDetachedFromWindow();
    }

    private void f() {
        int centerX;
        if (this.v.getWidth() == 0 || this.f11191b.getWidth() == 0) {
            this.f11191b.invalidate();
        }
        Rect bounds = this.v.getThumb().getBounds();
        if (com.bytedance.android.live.uikit.c.a.a(getContext())) {
            centerX = -((this.v.getWidth() - bounds.centerX()) - (this.f11191b.getWidth() / 2));
        } else {
            centerX = bounds.centerX() - (this.f11191b.getWidth() / 2);
        }
        this.f11191b.setTranslationX((float) centerX);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        if (this.f11195f) {
            this.A = n.a(getContext());
            View findViewById = this.q.findViewById(R.id.d1d);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = this.A;
            findViewById.setLayoutParams(layoutParams);
            this.f11193d.a(com.bytedance.android.live.effect.api.a.f9638c, this);
            a(PrivacyCert.Builder.with("bpea-469").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    private void a(boolean z2) {
        if (z2) {
            if (this.z == null) {
                a.C0382a aVar = new a.C0382a(getContext());
                aVar.f18265b = getContext().getString(R.string.grb);
                this.z = aVar.a();
            }
            if (!this.z.isShowing()) {
                this.z.show();
                return;
            }
            return;
        }
        Dialog dialog = this.z;
        if (dialog != null && dialog.isShowing()) {
            this.z.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.b
    public final void b(Throwable th) {
        DataChannel dataChannel = this.f11196g;
        if (dataChannel != null) {
            dataChannel.c(aa.class, "");
        }
        f.a(y.e(), th);
        this.w.setClickable(true);
        a(false);
        dismiss();
    }

    private void a(PrivacyCert privacyCert) {
        b(true, privacyCert);
        ConstraintLayout.a aVar = (ConstraintLayout.a) this.u.getLayoutParams();
        aVar.f2054k = R.id.sa;
        aVar.f2050g = R.id.sa;
        aVar.f2047d = R.id.sa;
        this.u.setLayoutParams(aVar);
        this.v.setVisibility(0);
        this.f11191b.setVisibility(0);
        this.x.setVisibility(8);
        this.y.setVisibility(8);
        this.r.setTextColor(-1);
        this.s.setTextColor(-2130706433);
        this.t.setTextColor(-2130706433);
    }

    @Override // com.bytedance.android.live.broadcast.api.b.a.b
    public final void a(EffectChannelResponse effectChannelResponse) {
        ((ac) t.b((Iterable) effectChannelResponse.getAllCategoryEffects()).d(e.f11210a).h().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a((f.a.ac) e.a(this.x))).a(new f(this), g.f11212a);
    }

    public void onCreate(Bundle bundle) {
        boolean z2;
        super.onCreate(bundle);
        setContentView(R.layout.b73);
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(80);
        }
        this.f11200k = (com.bytedance.android.live.broadcast.api.e.a) findViewById(R.id.d97);
        this.f11201l = findViewById(R.id.d8o);
        this.f11199j = (HSImageView) findViewById(R.id.p1);
        this.f11202m = (LottieAnimationView) findViewById(R.id.na);
        this.n = (HSAnimImageView) findViewById(R.id.nb);
        this.o = (ImageView) findViewById(R.id.or);
        this.p = findViewById(R.id.a1m);
        this.q = findViewById(R.id.d1e);
        this.r = (TextView) findViewById(R.id.sa);
        this.s = (TextView) findViewById(R.id.ebs);
        this.t = (TextView) findViewById(R.id.nh);
        this.u = findViewById(R.id.bo0);
        this.v = (SeekBar) findViewById(R.id.s9);
        this.f11191b = (TextView) findViewById(R.id.s_);
        this.x = (RecyclerView) findViewById(R.id.ebk);
        this.y = findViewById(R.id.nc);
        this.w = (LiveButton) findViewById(R.id.lf);
        this.p.setOnClickListener(this);
        findViewById(R.id.a7h).setOnClickListener(this);
        this.r.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.t.setOnClickListener(this);
        this.v.setOnSeekBarChangeListener(this);
        this.w.setOnClickListener(this);
        this.f11191b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.bytedance.android.live.liveinteract.multiguest.g.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(6015);
            }

            public final void onGlobalLayout() {
                a.this.c();
                a.this.f11191b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        this.f11202m.setVisibility(8);
        this.n.a(HSAnimImageView.a("tiktok_live_interaction_resource", "audio_interact_effect.webp"));
        this.q.post(new b(this));
        if (this.E == EnumC0216a.SEND_REQUEST) {
            this.w.setText(R.string.elr);
        } else {
            this.w.setText(R.string.glq);
        }
        this.C = new a.C0211a(getContext(), this.f11196g, new c(this), new d(this));
        if (!com.bytedance.android.livesdk.b.a.d.a().o || this.E != EnumC0216a.SEND_REQUEST) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            findViewById(R.id.bga).setVisibility(8);
            findViewById(R.id.f21).setVisibility(8);
        } else {
            ((LiveTextView) findViewById(R.id.f21)).setText(y.a((int) R.string.ea1));
        }
        if (this.E == EnumC0216a.GO_LIVE) {
            i.e();
        }
        com.bytedance.android.live.liveinteract.api.a.c.a().f9952d = false;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.b
    public final void a(String str) {
        this.w.setClickable(true);
        a(false);
        dismiss();
        ao.a(y.e(), (int) R.string.e5a);
        DataChannel dataChannel = this.f11196g;
        if (dataChannel != null) {
            dataChannel.c(x.class, str);
        }
    }

    public void onClick(View view) {
        a.AbstractC0206a aVar;
        int id = view.getId();
        if (id == R.id.a1m) {
            com.bytedance.android.live.liveinteract.api.a.c.a().f9952d = !com.bytedance.android.live.liveinteract.api.a.c.a().f9952d;
            this.f11200k.a(PrivacyCert.Builder.with("bpea-401").usage("").tag("link mic reverse camera").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        } else if (id == R.id.a7h) {
            if (this.E == EnumC0216a.SEND_REQUEST) {
                dismiss();
            } else if (this.E == EnumC0216a.GO_LIVE && (aVar = this.f11192c) != null) {
                aVar.a(false);
            }
        } else if (id == R.id.sa) {
            a(PrivacyCert.Builder.with("bpea-470").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        } else if (id == R.id.ebs) {
            b(true, PrivacyCert.Builder.with("bpea-468").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.u.getLayoutParams();
            aVar2.f2054k = R.id.ebs;
            aVar2.f2050g = R.id.ebs;
            aVar2.f2047d = R.id.ebs;
            this.u.setLayoutParams(aVar2);
            this.v.setVisibility(8);
            this.f11191b.setVisibility(8);
            this.x.setVisibility(0);
            this.y.setVisibility(8);
            this.r.setTextColor(-2130706433);
            this.s.setTextColor(-1);
            this.t.setTextColor(-2130706433);
        } else if (id == R.id.nh) {
            b(false, PrivacyCert.Builder.with("bpea-466").usage("").tag("link mic camera inactive").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            ConstraintLayout.a aVar3 = (ConstraintLayout.a) this.u.getLayoutParams();
            aVar3.f2054k = R.id.nh;
            aVar3.f2050g = R.id.nh;
            aVar3.f2047d = R.id.nh;
            this.u.setLayoutParams(aVar3);
            this.v.setVisibility(8);
            this.f11191b.setVisibility(8);
            this.x.setVisibility(8);
            this.y.setVisibility(0);
            this.r.setTextColor(-2130706433);
            this.s.setTextColor(-2130706433);
            this.t.setTextColor(-1);
        } else if (id != R.id.lf) {
        } else {
            if (this.E == EnumC0216a.SEND_REQUEST) {
                if (!this.f11192c.e()) {
                    b();
                } else if (com.bytedance.android.live.uikit.c.a.a(getContext())) {
                    this.q.scrollTo(-this.A, 0);
                } else {
                    this.q.scrollTo(this.A, 0);
                }
            } else if (this.E != EnumC0216a.GO_LIVE) {
            } else {
                if (com.bytedance.android.livesdk.b.a.d.a().u >= 2) {
                    ao.a(y.e(), (int) R.string.e_g);
                    dismiss();
                } else if (b.a.a().a() != 2) {
                    ao.a(y.e(), (int) R.string.e9h);
                    dismiss();
                } else {
                    this.w.setClickable(false);
                    a(true);
                    com.bytedance.android.livesdk.ab.i.b();
                    com.bytedance.android.livesdk.ab.i.b("invite_issue_check", "replyAnchor");
                    ((com.bytedance.android.livesdk.chatroom.interact.a) this.f11200k).c(PrivacyCert.Builder.with("bpea-395").usage("").tag("link mic apply").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    com.bytedance.android.livesdk.b.a.d.a().a(true);
                    a.AbstractC0206a aVar4 = this.f11192c;
                    if (aVar4 != null) {
                        aVar4.a(true);
                    }
                    DataChannel dataChannel = this.f11196g;
                    if (dataChannel != null) {
                        dataChannel.c(ad.class, "");
                    }
                    com.bytedance.android.live.liveinteract.api.a.c.a().a((Integer) 1);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.b
    public final void a(Throwable th) {
        this.w.setClickable(true);
        a(false);
        f.a(getContext(), th, (int) R.string.gra);
    }

    private void b(boolean z2, PrivacyCert privacyCert) {
        if (z2) {
            ((View) this.f11200k).setVisibility(0);
            a(true, privacyCert);
            this.p.setVisibility(0);
            this.f11199j.setVisibility(4);
            this.n.setVisibility(4);
            this.n.b();
            this.o.setVisibility(4);
            this.f11192c.a(1);
            return;
        }
        a(false, privacyCert);
        ((View) this.f11200k).setVisibility(4);
        this.p.setVisibility(4);
        this.f11199j.setVisibility(0);
        this.n.setVisibility(0);
        this.n.a();
        if (!this.B) {
            ImageModel d2 = this.f11192c.d();
            k.a(this.f11199j, d2, new z(5, 0.0f));
            ImageView imageView = this.o;
            g.a(imageView, d2, imageView.getWidth(), this.o.getHeight(), 2131234424);
            this.B = true;
        }
        this.o.setVisibility(0);
        this.f11192c.a(2);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.b
    public final void a(com.bytedance.android.livesdk.chatroom.interact.model.e eVar, boolean z2) {
        com.bytedance.android.livesdk.b.a.d.a().f14184e = eVar.f15601m;
        g.a.f14199a.a(((Room) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.ac.class)).getOwnerUserId(), eVar.f15601m);
        DataChannel dataChannel = this.f11196g;
        if (dataChannel != null) {
            dataChannel.c(ab.class, Boolean.valueOf(z2));
            if (MultiLiveServerAutoJoinChannel.INSTANCE.getValue() && eVar.o) {
                com.bytedance.android.livesdk.chatroom.model.c.b bVar = new com.bytedance.android.livesdk.chatroom.model.c.b();
                bVar.f15744a = eVar.o;
                bVar.f15745b = eVar.p;
                bVar.f15746c = eVar.q;
                this.f11196g.b(com.bytedance.android.live.liveinteract.api.ac.class, bVar);
            }
        }
        this.w.setClickable(true);
        a(false);
        dismiss();
    }

    public final void a(String str, com.bytedance.android.livesdkapi.depend.model.a aVar, int i2) {
        if (com.bytedance.android.live.effect.api.a.f9638c.equals(str)) {
            this.f11194e.a(str, aVar, i2);
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        if (i2 >= 0 && i2 <= seekBar.getMax()) {
            com.bytedance.android.live.core.c.a.a(4, f11190a, "newLevel: " + i2 + " fromUser: " + z2);
            if (z2) {
                c();
                this.f11192c.b(i2);
                this.f11200k.a(i2);
            }
        }
    }

    public a(Activity activity, a.AbstractC0206a aVar, DataChannel dataChannel, EnumC0216a aVar2) {
        super(activity, R.style.a2a);
        this.f11192c = aVar;
        this.f11196g = dataChannel;
        this.f11193d = ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).stickerPresenter();
        this.E = aVar2;
    }
}

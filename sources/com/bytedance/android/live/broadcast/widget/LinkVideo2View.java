package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.bytedance.android.live.broadcast.api.e;
import com.bytedance.android.live.broadcast.api.e.a;
import com.bytedance.android.live.broadcast.c.a.g;
import com.bytedance.android.live.broadcast.d.f;
import com.bytedance.android.live.broadcast.p;
import com.bytedance.android.live.broadcast.stream.c;
import com.bytedance.android.live.broadcast.stream.capture.c;
import com.bytedance.android.live.broadcast.stream.d;
import com.bytedance.android.live.effect.d;
import com.bytedance.android.livesdk.chatroom.interact.b;
import com.bytedance.android.livesdk.livesetting.broadcast.AdmServerCfgSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AdmTypeSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuestLiveAudioCaptureSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveGuestLinkPreInitEnableSetting;
import com.bytedance.android.livesdk.model.l;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.LiveCore;
import f.a.t;
import java.io.FileNotFoundException;

public class LinkVideo2View extends SurfaceView implements a, com.bytedance.android.live.broadcast.c.a.a, com.bytedance.android.livesdk.chatroom.interact.a, b {

    /* renamed from: a  reason: collision with root package name */
    final a.C0103a f8694a;

    /* renamed from: b  reason: collision with root package name */
    com.bytedance.android.live.broadcast.c.a f8695b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.stream.capture.a.a f8696c;

    /* renamed from: d  reason: collision with root package name */
    com.bytedance.android.live.broadcast.stream.capture.a f8697d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8698e;

    /* renamed from: f  reason: collision with root package name */
    public f.a.b.b f8699f;

    /* renamed from: g  reason: collision with root package name */
    com.bytedance.android.live.effect.api.a.b f8700g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8701h;

    /* renamed from: i  reason: collision with root package name */
    private g f8702i;

    /* renamed from: j  reason: collision with root package name */
    private com.bytedance.android.live.broadcast.api.d.a f8703j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8704k;

    /* renamed from: l  reason: collision with root package name */
    private int f8705l;

    static {
        Covode.recordClassIndex(4452);
    }

    public void setDataChannel(DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.a
    public final void a() {
        this.f8697d.b();
    }

    @Override // com.bytedance.android.live.broadcast.c.a.a
    public final void d_() {
        d.d().a("effect_gift");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        if (!(getParent() instanceof com.bytedance.android.live.liveinteract.multilive.api.a) || !((com.bytedance.android.live.liveinteract.multilive.api.a) getParent()).d()) {
            super.onAttachedToWindow();
            this.f8703j.a(PrivacyCert.Builder.with("bpea-373").usage("").tag("link mic resume").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            return;
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        f.a.b.b bVar;
        if (!(getParent() instanceof com.bytedance.android.live.liveinteract.multilive.api.a) || !((com.bytedance.android.live.liveinteract.multilive.api.a) getParent()).d()) {
            if (!this.f8701h) {
                f.a.b.b bVar2 = this.f8699f;
                if (bVar2 != null && !bVar2.isDisposed()) {
                    this.f8699f.dispose();
                }
                d.d().b();
                this.f8697d.a(PrivacyCert.Builder.with("bpea-433").usage("").tag("stop video/audio capture when link mic ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
                this.f8703j.b(PrivacyCert.Builder.with("bpea-400").usage("").tag("link mic finish").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                this.f8703j.c(PrivacyCert.Builder.with("bpea-493").usage("").tag("release when link mic ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
            super.onDetachedFromWindow();
            if (!this.f8701h && (bVar = this.f8699f) != null && !bVar.isDisposed()) {
                this.f8699f.dispose();
                return;
            }
            return;
        }
        super.onDetachedFromWindow();
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.b
    public final Client a(LiveCore.InteractConfig interactConfig) {
        return this.f8703j.a(interactConfig);
    }

    @Override // com.bytedance.android.live.broadcast.api.e.a
    public final void b(PrivacyCert privacyCert) {
        this.f8703j.h(privacyCert);
    }

    @Override // com.bytedance.android.live.broadcast.api.e.a
    public final void a(int i2) {
        com.bytedance.android.live.broadcast.c.a aVar = this.f8695b;
        if (aVar != null) {
            aVar.a(i2);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.a
    public final void a_(PrivacyCert privacyCert) {
        try {
            this.f8703j.b(privacyCert);
        } catch (NullPointerException e2) {
            com.bytedance.android.live.core.c.a.a(6, "LinkVideo2View", e2.getStackTrace());
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.a
    public final void b_(PrivacyCert privacyCert) {
        try {
            this.f8703j.a(privacyCert);
            this.f8702i.a();
        } catch (NullPointerException e2) {
            com.bytedance.android.live.core.c.a.a(6, "LinkVideo2View", e2.getStackTrace());
        }
    }

    @Override // com.bytedance.android.live.broadcast.c.a.a
    public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
        d.d().a("effect_gift", aVar);
    }

    @Override // com.bytedance.android.live.broadcast.api.e.a
    public final void a(PrivacyCert privacyCert) {
        this.f8697d.b(privacyCert);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.a
    public final void c(PrivacyCert privacyCert) {
        this.f8702i.d();
        this.f8701h = true;
        f.a.b.b bVar = this.f8699f;
        if (bVar != null && !bVar.isDisposed()) {
            this.f8699f.dispose();
        }
        d.d().b();
        this.f8697d.a(privacyCert);
        this.f8703j.i(privacyCert);
        this.f8703j.b(privacyCert);
        this.f8703j.c(privacyCert);
        f.a.b.b bVar2 = this.f8699f;
        if (bVar2 != null && !bVar2.isDisposed()) {
            this.f8699f.dispose();
        }
        DataChannelGlobal.f34575d.c(e.class);
    }

    public LinkVideo2View(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null);
    }

    public LinkVideo2View(Context context, a.C0103a aVar) {
        this(context, null, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.api.e.a
    public final void a_(boolean z, PrivacyCert privacyCert) {
        int videoCaptureDevice;
        if (z != this.f8704k) {
            this.f8704k = z;
            if (z) {
                this.f8703j.a(this.f8705l, privacyCert);
                return;
            }
            if (!(this.f8703j.e() == null || this.f8703j.e().getBuilder() == null || (videoCaptureDevice = this.f8703j.e().getBuilder().getVideoCaptureDevice()) == 5)) {
                this.f8705l = videoCaptureDevice;
            }
            this.f8703j.a(5, privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.c.a.a
    public final void a(String str, String str2) {
        this.f8696c.a(str, str2);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.a
    public final void a(boolean z, PrivacyCert privacyCert) {
        this.f8703j.a(z, privacyCert);
    }

    private LinkVideo2View(Context context, AttributeSet attributeSet, a.C0103a aVar) {
        super(context, attributeSet);
        int i2;
        boolean z;
        MethodCollector.i(6198);
        this.f8705l = 1;
        this.f8700g = new com.bytedance.android.live.effect.api.a.b() {
            /* class com.bytedance.android.live.broadcast.widget.LinkVideo2View.AnonymousClass2 */

            static {
                Covode.recordClassIndex(4454);
            }

            @Override // com.bytedance.android.live.effect.api.a.b
            public final int a(String str, String str2, int[] iArr) {
                return 0;
            }

            @Override // com.bytedance.android.live.effect.api.a.b
            public final int b(String[] strArr) {
                return 0;
            }

            @Override // com.bytedance.android.live.effect.api.a.b
            public final int b(String[] strArr, String[] strArr2) {
                return 0;
            }

            @Override // com.bytedance.android.live.effect.api.a.b
            public final int c(String[] strArr) {
                return 0;
            }

            @Override // com.bytedance.android.live.effect.api.a.b
            public final int a() {
                LinkVideo2View.this.f8696c.a();
                return 1;
            }

            @Override // com.bytedance.android.live.effect.api.a.b
            public final int a(boolean z) {
                LinkVideo2View.this.f8696c.a(z);
                return 1;
            }

            @Override // com.bytedance.android.live.effect.api.a.b
            public final int a(String[] strArr) {
                LinkVideo2View.this.f8696c.a(strArr);
                return 1;
            }

            @Override // com.bytedance.android.live.effect.api.a.b
            public final int a(String str, boolean z) {
                try {
                    LinkVideo2View.this.f8696c.a(str, z);
                    return 1;
                } catch (FileNotFoundException e2) {
                    com.bytedance.android.live.core.c.a.a("LinkVideo2View", e2);
                    return -1;
                }
            }

            @Override // com.bytedance.android.live.effect.api.a.b
            public final int a(String[] strArr, String[] strArr2) {
                LinkVideo2View.this.f8696c.a(strArr, strArr2);
                return 1;
            }

            @Override // com.bytedance.android.live.effect.api.a.b
            public final int a(String str, String str2, float f2) {
                LinkVideo2View.this.f8696c.a(str, str2, f2);
                return 1;
            }
        };
        this.f8694a = aVar;
        String modelFilePath = p.INST.getModelFilePath();
        if (aVar == null || aVar.f7538c != 0) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f8704k = true;
        if (aVar != null && !aVar.f7539d) {
            this.f8704k = false;
            i2 = 5;
        }
        Integer valueOf = Integer.valueOf(AdmTypeSetting.INSTANCE.getValue());
        l a2 = l.a(valueOf.intValue(), AdmServerCfgSetting.INSTANCE.getValue());
        d.a aVar2 = new d.a(getContext());
        aVar2.v = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getProjectKey();
        aVar2.E = new com.bytedance.android.live.broadcast.d.e();
        aVar2.t = new f();
        aVar2.F = new com.bytedance.android.live.broadcast.d.d();
        aVar2.q = i2;
        aVar2.r = 5;
        aVar2.s = a2;
        aVar2.H = modelFilePath;
        aVar2.I = p.INST.getResourceFinder(getContext());
        d.a a3 = aVar2.a(240, 320);
        if (LiveGuestLiveAudioCaptureSetting.INSTANCE.getValue()) {
            a3.O = true;
        }
        this.f8703j = new c(a3.a());
        com.bytedance.android.live.broadcast.api.d.a aVar3 = this.f8703j;
        if (aVar == null || aVar.f7540e) {
            z = true;
        } else {
            z = false;
        }
        this.f8697d = new com.bytedance.android.live.broadcast.stream.capture.b(this, aVar3, z);
        this.f8702i = new g(this);
        this.f8697d.a(new c.a() {
            /* class com.bytedance.android.live.broadcast.widget.LinkVideo2View.AnonymousClass1 */

            static {
                Covode.recordClassIndex(4453);
            }

            @Override // com.bytedance.android.live.broadcast.stream.capture.c.a
            public final void a(int i2, int i3) {
            }

            @Override // com.bytedance.android.live.broadcast.stream.capture.c.a
            public final void a() {
                if (!LinkVideo2View.this.f8698e) {
                    LinkVideo2View.this.f8699f = t.b((Object) 1).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this), d.f8770a);
                }
            }
        });
        if ((valueOf.intValue() == 1 || LiveGuestLiveAudioCaptureSetting.INSTANCE.getValue()) && !LiveGuestLinkPreInitEnableSetting.INSTANCE.getValue()) {
            this.f8703j.h(PrivacyCert.Builder.with("bpea-568").usage("").tag("start link mic audio capture").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
        DataChannelGlobal.f34575d.a(e.class, this.f8703j);
        MethodCollector.o(6198);
    }
}

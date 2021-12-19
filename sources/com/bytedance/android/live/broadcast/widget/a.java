package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.e;
import com.bytedance.android.live.broadcast.api.e.b;
import com.bytedance.android.live.broadcast.stream.c;
import com.bytedance.android.live.broadcast.stream.capture.f;
import com.bytedance.android.live.broadcast.stream.capture.g;
import com.bytedance.android.live.broadcast.stream.d;
import com.bytedance.android.live.broadcast.utils.a;
import com.bytedance.android.livesdk.livesetting.broadcast.AdmServerCfgSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AdmTypeSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuestLiveAudioCaptureSetting;
import com.bytedance.android.livesdk.model.l;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.LiveCore;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;

public final class a extends GLSurfaceView implements b, f, g.a, com.bytedance.android.livesdk.chatroom.interact.b {

    /* renamed from: a  reason: collision with root package name */
    g f8760a;

    /* renamed from: b  reason: collision with root package name */
    com.bytedance.android.live.broadcast.utils.a f8761b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.android.live.broadcast.api.d.a f8762c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8763d;

    /* renamed from: e  reason: collision with root package name */
    private EGLContext f8764e;

    static {
        Covode.recordClassIndex(4482);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.a
    public final void a() {
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.a
    public final void a(boolean z, PrivacyCert privacyCert) {
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8763d) {
            this.f8762c.h(PrivacyCert.Builder.with("bpea-566").usage("").tag("start link mic video capture").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
        this.f8762c.a(PrivacyCert.Builder.with("bpea-369").usage("").tag("link mic resume").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        this.f8762c.d(PrivacyCert.Builder.with("bpea-357").usage("").tag("link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        com.bytedance.android.live.broadcast.stream.f.a("capture_video");
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f8762c.i(PrivacyCert.Builder.with("bpea-567").usage("").tag("stop link mic video capture").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        this.f8762c.e(PrivacyCert.Builder.with("bpea-440").usage("").tag("stop video capture when link mic ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        com.bytedance.android.live.broadcast.stream.f.a("release_video");
        this.f8762c.b(PrivacyCert.Builder.with("bpea-399").usage("").tag("link mic finish").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        this.f8762c.c(PrivacyCert.Builder.with("bpea-492").usage("").tag("release when link mic ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        super.onDetachedFromWindow();
    }

    public a(Context context) {
        this(context, (byte) 0);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.b
    public final Client a(LiveCore.InteractConfig interactConfig) {
        return this.f8762c.a(interactConfig);
    }

    @Override // com.bytedance.android.live.broadcast.api.e.b
    public final void setOutputFormat(int i2) {
        this.f8760a.a(i2);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.a
    public final void c(PrivacyCert privacyCert) {
        com.bytedance.android.live.broadcast.utils.a aVar = this.f8761b;
        if (aVar != null) {
            aVar.quitSafely();
        }
        DataChannelGlobal.f34575d.c(e.class);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.a
    public final void a_(PrivacyCert privacyCert) {
        onPause();
        try {
            this.f8760a.f8547a.onPause();
            this.f8762c.b(privacyCert);
        } catch (NullPointerException e2) {
            com.bytedance.android.live.core.c.a.a(6, "LinkInRoomAudioView", e2.getStackTrace());
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.a
    public final void b_(PrivacyCert privacyCert) {
        onResume();
        try {
            this.f8760a.f8547a.onResume();
            this.f8762c.a(privacyCert);
        } catch (NullPointerException e2) {
            com.bytedance.android.live.core.c.a.a(6, "LinkInRoomAudioView", e2.getStackTrace());
        }
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.g.a
    public final void a(Surface surface) {
        String str;
        com.bytedance.android.live.base.model.user.b a2;
        ImageModel avatarThumb;
        List<String> urls;
        a.C0131a aVar = new a.C0131a();
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        if (b2 == null || (a2 = b2.a()) == null || (avatarThumb = a2.getAvatarThumb()) == null || (urls = avatarThumb.getUrls()) == null || urls.isEmpty()) {
            str = "";
        } else {
            str = urls.get(0);
        }
        aVar.f8626a = str;
        aVar.f8628c = getHeight();
        aVar.f8627b = getWidth();
        com.bytedance.android.live.broadcast.utils.a aVar2 = new com.bytedance.android.live.broadcast.utils.a(surface, aVar);
        this.f8761b = aVar2;
        aVar2.start();
    }

    private a(Context context, byte b2) {
        super(context, null);
        MethodCollector.i(6351);
        g gVar = new g(this);
        this.f8760a = gVar;
        gVar.f8548b = this;
        this.f8760a.a(this);
        Integer valueOf = Integer.valueOf(AdmTypeSetting.INSTANCE.getValue());
        l a2 = l.a(valueOf.intValue(), AdmServerCfgSetting.INSTANCE.getValue());
        d.a aVar = new d.a(getContext());
        aVar.v = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getProjectKey();
        aVar.E = new com.bytedance.android.live.broadcast.d.e();
        aVar.t = new com.bytedance.android.live.broadcast.d.f();
        aVar.F = new com.bytedance.android.live.broadcast.d.d();
        d.a a3 = aVar.a(240, 320);
        a3.f8590i = 320;
        a3.f8589h = 240;
        a3.q = 4;
        a3.r = 5;
        a3.s = a2;
        boolean z = true;
        if (LiveGuestLiveAudioCaptureSetting.INSTANCE.getValue()) {
            a3.O = true;
        }
        d a4 = a3.a();
        if (valueOf.intValue() != 1 && !LiveGuestLiveAudioCaptureSetting.INSTANCE.getValue()) {
            z = false;
        }
        this.f8763d = z;
        c cVar = new c(a4);
        this.f8762c = cVar;
        DataChannelGlobal.f34575d.a(e.class, cVar);
        MethodCollector.o(6351);
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.f
    public final void a(EGLContext eGLContext, int i2, int i3, int i4, long j2) {
        if (this.f8762c != null) {
            EGLContext eGLContext2 = this.f8764e;
            if (eGLContext2 != null && !eGLContext2.equals(eGLContext)) {
                com.bytedance.android.live.core.c.a.a(5, b.class.getSimpleName(), "eglContext changed");
            }
            this.f8764e = eGLContext;
            com.bytedance.android.live.core.c.a.a(4, b.class.getSimpleName(), "eglContext=" + eGLContext.hashCode());
            this.f8762c.a(i2, i3, i4, j2);
        }
    }
}

package com.bytedance.android.live.broadcast.bgbroadcast.b;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.d.b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.api.f;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.ui.db;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsBroadcastGuideStrategySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.model.k;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdkapi.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.view.TextureViewWrapper;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;

public final class b extends com.bytedance.android.live.broadcast.bgbroadcast.b implements b.a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f7728g = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public boolean f7729f;

    /* renamed from: h  reason: collision with root package name */
    private com.bytedance.android.d.b f7730h;

    /* renamed from: i  reason: collision with root package name */
    private View f7731i;

    /* renamed from: j  reason: collision with root package name */
    private HSImageView f7732j;

    /* renamed from: k  reason: collision with root package name */
    private HSImageView f7733k;

    /* renamed from: l  reason: collision with root package name */
    private com.bytedance.android.live.broadcast.b.a f7734l;

    /* renamed from: m  reason: collision with root package name */
    private TextureViewWrapper f7735m;
    private final boolean n;
    private boolean o;
    private final h p;

    static {
        Covode.recordClassIndex(3812);
    }

    @Override // com.bytedance.android.d.b.a
    public final void a(Object obj) {
        l.d(obj, "");
    }

    @Override // com.bytedance.android.d.b.a
    public final void a(String str) {
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final int b() {
        return R.layout.b58;
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void e() {
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void f() {
    }

    public final int j() {
        return ((Number) this.p.getValue()).intValue();
    }

    @Override // com.bytedance.android.d.b.a
    public final void m() {
    }

    @Override // com.bytedance.android.d.b.a
    public final void n() {
    }

    @Override // com.bytedance.android.d.b.a
    public final void o() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(3813);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void a() {
        k.OBS.config();
    }

    @Override // com.bytedance.android.d.b.a
    public final void k() {
        if (!this.f7729f) {
            r();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b.b$b  reason: collision with other inner class name */
    static final class C0109b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0109b f7736a = new C0109b();

        static {
            Covode.recordClassIndex(3814);
        }

        C0109b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(LiveObsBroadcastGuideStrategySetting.INSTANCE.getValue());
        }
    }

    private final void s() {
        p.a(this.f7732j);
        p.a(this.f7731i);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void g() {
        b(true);
        com.bytedance.android.d.b bVar = this.f7730h;
        if (bVar != null) {
            bVar.stop(true);
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void h() {
        HSImageView hSImageView = this.f7732j;
        if (hSImageView != null) {
            hSImageView.postDelayed(new e(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void i() {
        this.f7729f = true;
        s();
        b(false);
    }

    static final class d implements a.AbstractC0499a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f7738a;

        static {
            Covode.recordClassIndex(3816);
        }

        d(b bVar) {
            this.f7738a = bVar;
        }

        @Override // com.bytedance.android.livesdkapi.a.AbstractC0499a
        public final void a() {
            com.bytedance.android.live.core.c.a.a(3, this.f7738a.f7723a, "room close onLiveFinished");
            this.f7738a.f7726d.d();
        }
    }

    public static void q() {
        b.a.a("livesdk_stream_key_banner_show").a().a("live_type", "third_party").b();
    }

    private final void r() {
        p.b(this.f7732j);
        if (j() != 2) {
            p.b(this.f7731i);
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f7739a;

        static {
            Covode.recordClassIndex(3817);
        }

        e(b bVar) {
            this.f7739a = bVar;
        }

        public final void run() {
            if (this.f7739a.f7726d.isViewValid() && !this.f7739a.f7729f) {
                if (this.f7739a.j() == 2) {
                    DataChannelGlobal.f34575d.c(f.class, true);
                } else {
                    this.f7739a.p();
                }
                this.f7739a.a(true);
                b.q();
            }
        }
    }

    @Override // com.bytedance.android.d.b.a
    public final void l() {
        s();
        if (j() == 2) {
            DataChannelGlobal.f34575d.c(f.class, false);
        }
        this.f7726d.g();
        com.bytedance.android.livesdk.ab.a b2 = c.a.b("ttlive_start_play_obs_all");
        b2.f13426c = true;
        b2.a();
    }

    public final void p() {
        com.bytedance.android.live.broadcast.b.a aVar = this.f7734l;
        if (aVar == null) {
            Activity activity = this.f7724b;
            StreamUrl streamUrl = this.f7725c.getStreamUrl();
            l.b(streamUrl, "");
            List<String> list = streamUrl.f23038e;
            l.b(list, "");
            String str = (String) n.h((List) list);
            if (str == null) {
                StreamUrl streamUrl2 = this.f7725c.getStreamUrl();
                l.b(streamUrl2, "");
                str = streamUrl2.a();
            }
            aVar = new com.bytedance.android.live.broadcast.b.a(activity, str, this.f7725c);
        }
        this.f7734l = aVar;
        p.a(aVar);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void c() {
        r();
        this.f7735m = (TextureViewWrapper) this.f7724b.findViewById(R.id.fhs);
        com.bytedance.android.d.b createRoomPlayer = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).createRoomPlayer(this.f7725c.getMultiStreamData(), this.f7725c.getMultiStreamDefaultQualitySdkKey(), this.f7725c.getStreamType(), this.f7725c.getStreamSrConfig(), this.f7735m, this, this.f7724b);
        createRoomPlayer.setSeiOpen(!this.n);
        createRoomPlayer.startWithNewLivePlayer();
        this.f7730h = createRoomPlayer;
        this.f7729f = false;
        com.bytedance.android.live.p.l.STREAM_KEY.load(this.f7727e, new c(this));
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void d() {
        HSImageView hSImageView;
        this.f7732j = (HSImageView) this.f7724b.findViewById(R.id.qq);
        this.f7733k = (HSImageView) this.f7724b.findViewById(R.id.ffl);
        this.f7731i = this.f7724b.findViewById(R.id.ci9);
        float a2 = (float) (com.bytedance.common.utility.n.a(this.f7724b) / com.bytedance.common.utility.n.b(this.f7724b));
        HSImageView hSImageView2 = this.f7732j;
        User owner = this.f7725c.getOwner();
        l.b(owner, "");
        com.bytedance.android.live.core.f.k.a(hSImageView2, owner.getAvatarThumb(), new z(5, a2));
        if (this.f7725c.background != null) {
            if (Build.VERSION.SDK_INT >= 23 && (hSImageView = this.f7733k) != null) {
                hSImageView.setForeground(null);
            }
            com.bytedance.android.live.core.f.k.a(this.f7733k, this.f7725c.background);
            return;
        }
        HSImageView hSImageView3 = this.f7733k;
        User owner2 = this.f7725c.getOwner();
        l.b(owner2, "");
        com.bytedance.android.live.core.f.k.a(hSImageView3, owner2.getAvatarThumb(), new z(5, a2));
    }

    static final class c implements com.bytedance.android.live.p.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f7737a;

        static {
            Covode.recordClassIndex(3815);
        }

        c(b bVar) {
            this.f7737a = bVar;
        }

        @Override // com.bytedance.android.live.p.f
        public final void a() {
        }

        @Override // com.bytedance.android.live.p.f
        public final void a(View view, DataChannel dataChannel) {
        }

        @Override // com.bytedance.android.live.p.f
        public final void a(boolean z) {
        }

        @Override // com.bytedance.android.live.p.f
        public final void b() {
        }

        @Override // com.bytedance.android.live.p.f
        public final void b(View view, DataChannel dataChannel) {
        }

        public final void onClick(View view) {
            this.f7737a.p();
            this.f7737a.a(false);
            b.q();
        }
    }

    private final void b(boolean z) {
        com.bytedance.android.live.broadcast.b.a aVar = this.f7734l;
        if (aVar != null) {
            p.b(aVar);
        }
        if (z) {
            com.bytedance.android.live.broadcast.b.a aVar2 = this.f7734l;
            if (aVar2 != null) {
                aVar2.c();
            }
            this.f7734l = null;
        }
    }

    @Override // com.bytedance.android.d.b.a
    public final void a(Exception exc) {
        l.d(exc, "");
        b(-1, exc.toString());
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void a(com.bytedance.android.livesdkapi.a aVar) {
        l.d(aVar, "");
        if (aVar.isLiveFinished()) {
            com.bytedance.android.live.core.c.a.a(3, this.f7723a, "room close onServiceConnected isLiveFinished");
            this.f7726d.d();
        } else {
            aVar.setLiveStatusListener(new d(this));
            Room room = this.f7725c;
            if (room != null) {
                Object b2 = this.f7727e.b(cg.class);
                if (b2 == null) {
                    b2 = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).messageManagerProvider(room.getId(), true, (Context) this.f7724b);
                }
                this.f7727e.a(cg.class, b2);
            }
        }
        this.f7726d.a(new db());
    }

    public final void a(boolean z) {
        com.bytedance.android.live.broadcast.b.a aVar = this.f7734l;
        if (aVar != null) {
            aVar.f7548a = z;
        }
    }

    @Override // com.bytedance.android.d.b.a
    public final void a(int i2, String str) {
        l.d(str, "");
        b(i2, str);
    }

    private final void b(int i2, String str) {
        if (!this.o) {
            this.o = true;
            c.a.c("ttlive_play_obs_error").b("error_code", Integer.valueOf(i2)).b("error_msg", str).b("user_id", Long.valueOf(this.f7725c.getOwnerUserId())).b("stream_data", this.f7725c.getMultiStreamData()).a();
        }
    }

    @Override // com.bytedance.android.d.b.a
    public final void a(int i2, int i3) {
        ViewGroup.LayoutParams layoutParams;
        if (i2 > i3) {
            TextureViewWrapper textureViewWrapper = this.f7735m;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (textureViewWrapper != null) {
                layoutParams = textureViewWrapper.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.width = com.bytedance.common.utility.n.a(this.f7724b);
                marginLayoutParams2.height = (i3 * marginLayoutParams2.width) / i2;
                marginLayoutParams2.topMargin = (int) com.bytedance.common.utility.n.b(this.f7724b, 138.0f);
                TextureViewWrapper textureViewWrapper2 = this.f7735m;
                if (textureViewWrapper2 != null) {
                    textureViewWrapper2.setLayoutParams(marginLayoutParams2);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Room room, com.bytedance.android.live.broadcast.bgbroadcast.f fVar, DataChannel dataChannel) {
        super(room, fVar, dataChannel);
        boolean z;
        l.d(room, "");
        l.d(fVar, "");
        l.d(dataChannel, "");
        long ownerUserId = room.getOwnerUserId();
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        if (ownerUserId == b2.c()) {
            z = true;
        } else {
            z = false;
        }
        this.n = z;
        this.p = i.a((h.f.a.a) C0109b.f7736a);
    }
}

package com.bytedance.android.livesdk.newvideogift;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.i;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.bb;
import com.bytedance.android.livesdk.bc;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.manage.a;
import com.bytedance.android.livesdk.model.message.r;
import com.bytedance.android.livesdk.newvideogift.a.b;
import com.bytedance.android.livesdk.performance.g;
import com.bytedance.android.livesdk.service.c.c.d;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.d.a.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.h;

public class LiveNewVideoGiftWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    com.bytedance.android.livesdk.gift.assets.b f19841a;

    /* renamed from: b  reason: collision with root package name */
    public a f19842b;

    /* renamed from: c  reason: collision with root package name */
    public Room f19843c;

    /* renamed from: d  reason: collision with root package name */
    public VideoGiftView f19844d;

    /* renamed from: e  reason: collision with root package name */
    public r f19845e;

    /* renamed from: f  reason: collision with root package name */
    public b f19846f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f19847g;

    /* renamed from: h  reason: collision with root package name */
    private c f19848h = new c() {
        /* class com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget.AnonymousClass2 */

        static {
            Covode.recordClassIndex(11762);
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.a.c
        public final void b() {
            com.bytedance.android.livesdk.performance.b value;
            a(false, true);
            if (LiveNewVideoGiftWidget.this.f19842b != null) {
                LiveNewVideoGiftWidget.this.f19842b.b();
            }
            d.a.C0463a.f21379a.f21375e.a();
            com.bytedance.android.live.broadcast.e.a.f7847a.remove("video_gift_id");
            h<com.bytedance.android.livesdk.performance.b> hVar = g.f20231b.get("gift_play");
            if (hVar != null && (value = hVar.getValue()) != null) {
                value.b();
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.a.c
        public final void a() {
            com.bytedance.android.livesdk.performance.b value;
            com.bytedance.android.livesdk.performance.b value2;
            long j2;
            long j3;
            long j4;
            long j5;
            if (LiveNewVideoGiftWidget.this.f19844d != null) {
                if (LiveNewVideoGiftWidget.this.dataChannel != null) {
                    LiveNewVideoGiftWidget.this.dataChannel.c(bc.class, false);
                }
                LiveNewVideoGiftWidget.this.f19844d.setVisibility(0);
                LiveNewVideoGiftWidget.this.f19844d.a();
                a(true, false);
                b bVar = LiveNewVideoGiftWidget.this.f19846f;
                Room room = LiveNewVideoGiftWidget.this.f19843c;
                long j6 = 0;
                if (((Boolean) LiveNewVideoGiftWidget.this.dataChannel.b(ee.class)).booleanValue()) {
                    com.bytedance.android.livesdk.ab.a b2 = c.a.a("ttlive_broadcast_action_all").b("action", "play_gift");
                    if (bVar.f19854a != null) {
                        j2 = bVar.f19854a.getId();
                    } else {
                        j2 = 0;
                    }
                    com.bytedance.android.livesdk.ab.a b3 = b2.b("action_id", Long.valueOf(j2));
                    if (room != null) {
                        j3 = room.getOwnerUserId();
                    } else {
                        j3 = 0;
                    }
                    com.bytedance.android.livesdk.ab.a b4 = b3.b("user_id", Long.valueOf(j3));
                    if (room != null) {
                        j4 = room.getId();
                    } else {
                        j4 = 0;
                    }
                    b4.b("room_id", Long.valueOf(j4)).a();
                    if (bVar.f19854a != null) {
                        j5 = bVar.f19854a.getId();
                    } else {
                        j5 = 0;
                    }
                    com.bytedance.android.live.broadcast.e.a.f7847a.put("video_gift_id", String.valueOf(j5));
                }
                b bVar2 = LiveNewVideoGiftWidget.this.f19846f;
                if (bVar2.f19854a != null) {
                    j6 = bVar2.f19854a.getId();
                }
                h<com.bytedance.android.livesdk.performance.b> hVar = g.f20231b.get("gift_play");
                if (!(hVar == null || (value2 = hVar.getValue()) == null)) {
                    value2.f20202e = j6;
                }
                h<com.bytedance.android.livesdk.performance.b> hVar2 = g.f20231b.get("gift_play");
                if (hVar2 != null && (value = hVar2.getValue()) != null) {
                    value.a();
                }
            }
        }

        private void a(boolean z, boolean z2) {
            if (LiveNewVideoGiftWidget.this.f19845e != null && LiveNewVideoGiftWidget.this.f19845e.f19679g != null && LiveNewVideoGiftWidget.this.f19845e.f19679g.getId() == u.a().b().c()) {
                com.bytedance.android.livesdk.chatroom.b.c.INSTANCE.setBigGiftPlayStateEvent(z, z2, LiveNewVideoGiftWidget.this.f19845e);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.a.c
        public final void a(float f2, float f3, float f4, float f5) {
            if (LiveNewVideoGiftWidget.this.f19844d != null) {
                VideoGiftView videoGiftView = LiveNewVideoGiftWidget.this.f19844d;
                if (videoGiftView.f19859e != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) videoGiftView.f19856b.getLayoutParams();
                    layoutParams.width = (int) ((((float) videoGiftView.f19859e.f19486h) / 10000.0f) * f2);
                    layoutParams.height = (int) ((((float) videoGiftView.f19859e.f19487i) / 10000.0f) * f3);
                    videoGiftView.f19856b.setLayoutParams(layoutParams);
                    videoGiftView.f19856b.setX(((((float) videoGiftView.f19859e.f19484f) / 10000.0f) * f2) + f4);
                    videoGiftView.f19856b.setY(((((float) videoGiftView.f19859e.f19485g) / 10000.0f) * f3) + f5);
                    videoGiftView.f19857c.setTextSize(0, n.b(videoGiftView.getContext(), (float) (videoGiftView.f19859e.f19480b / 100)));
                    if (!m.a(videoGiftView.f19859e.f19491m)) {
                        try {
                            videoGiftView.f19857c.setShadowLayer((float) y.a((float) (videoGiftView.f19859e.f19490l / 100)), (float) y.a((float) (videoGiftView.f19859e.f19488j / 100)), (float) y.a((float) (videoGiftView.f19859e.f19489k / 100)), Color.parseColor(videoGiftView.f19859e.f19491m));
                        } catch (IllegalArgumentException unused) {
                            com.bytedance.android.live.core.c.a.b("parseColor failure. colorStr: " + videoGiftView.f19859e.f19491m);
                        }
                    }
                    com.bytedance.android.livesdk.model.message.c.b bVar = videoGiftView.f19859e.f19479a;
                    if (bVar == null) {
                        com.bytedance.android.live.core.c.a.b("displayText is null!");
                    } else {
                        videoGiftView.f19857c.setText(com.bytedance.android.livesdk.chatroom.f.c.a(bVar.f19422b, bVar, null));
                    }
                    if (videoGiftView.f19859e.f19481c == null) {
                        videoGiftView.f19858d.setVisibility(8);
                        return;
                    }
                    com.bytedance.android.live.core.f.a.a a2 = com.bytedance.android.live.core.f.a.a.a(videoGiftView.getContext());
                    a2.f9019d = videoGiftView.f19859e.f19481c;
                    a2.a(ImageView.ScaleType.FIT_XY).a(videoGiftView.f19858d);
                    videoGiftView.f19858d.setVisibility(0);
                }
            }
        }
    };

    /* renamed from: i  reason: collision with root package name */
    private b.a f19849i = a.f19864a;

    /* renamed from: j  reason: collision with root package name */
    private com.bytedance.android.livesdkapi.depend.d.a.d f19850j = new b(this);

    public interface a {
        static {
            Covode.recordClassIndex(11763);
        }

        void b();
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        AssetsModel f19854a;

        static {
            Covode.recordClassIndex(11764);
        }
    }

    static {
        Covode.recordClassIndex(11760);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bfs;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void a() {
        VideoGiftView videoGiftView = this.f19844d;
        if (videoGiftView != null) {
            videoGiftView.b();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.f19843c = (Room) this.dataChannel.b(df.class);
        this.f19846f = new b();
        this.dataChannel.a((androidx.lifecycle.m) this, bb.class, (h.f.a.b) new c(this));
        this.f19847g = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
        this.f19844d = (VideoGiftView) this.contentView;
        this.f19844d.setPortrait(((Boolean) this.dataChannel.b(cp.class)).booleanValue());
        VideoGiftView videoGiftView = this.f19844d;
        Context context = this.context;
        com.bytedance.android.livesdkapi.depend.d.a.c cVar = this.f19848h;
        b.a aVar = this.f19849i;
        com.bytedance.android.livesdkapi.depend.d.a.d dVar = this.f19850j;
        int i2 = Build.VERSION.SDK_INT;
        videoGiftView.f19855a.setLayoutDirection(0);
        videoGiftView.f19860f = new com.bytedance.android.livesdk.newvideogift.a.b(context, videoGiftView.f19855a, cVar, aVar, dVar);
        this.f19841a = a.b.f18870a;
    }
}

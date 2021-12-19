package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.commercialize.feed.bd;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.ce;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.feed.helper.d;
import com.ss.android.ugc.aweme.feed.i.e;
import com.ss.android.ugc.aweme.feed.i.u;
import com.ss.android.ugc.aweme.feed.i.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.service.model.j;
import com.ss.android.ugc.aweme.im.service.model.l;
import com.ss.android.ugc.aweme.im.service.model.n;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.report.d;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.fr;
import com.ss.android.ugc.aweme.video.k;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.ss.android.ugc.playerkit.model.o;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public class c implements c.AbstractC1481c, af, ah, aj {

    /* renamed from: a  reason: collision with root package name */
    public final Context f91729a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f91730b;

    /* renamed from: c  reason: collision with root package name */
    public LiveRoomStruct f91731c;

    /* renamed from: d  reason: collision with root package name */
    public ak f91732d;

    /* renamed from: e  reason: collision with root package name */
    public String f91733e = "click";

    /* renamed from: f  reason: collision with root package name */
    public boolean f91734f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f91735g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f91736h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f91737i;

    /* renamed from: j  reason: collision with root package name */
    public final b f91738j = new b(this);

    /* renamed from: k  reason: collision with root package name */
    public final View f91739k;

    /* renamed from: l  reason: collision with root package name */
    private double f91740l = -1.0d;

    static {
        Covode.recordClassIndex(57756);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void A() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void B() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void C() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void D() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void E() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.af
    public void F() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.af
    public void G() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.af
    public void H() {
    }

    public String K() {
        return "";
    }

    public String L() {
        return "";
    }

    public boolean M() {
        return false;
    }

    public boolean N() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final com.ss.android.ugc.aweme.video.f.a O() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final com.ss.android.ugc.aweme.feed.adapter.a.a Q() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final boolean R() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final d S() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final boolean T() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final aj U() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void V() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void W() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final boolean X() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final int a() {
        return 101;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(int i2, long j2, long j3, int i3, long j4, long j5, long j6, int i4) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(int i2, String str, long j2, long j3, int i3, long j4, long j5, long j6, int i4) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(View view) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(w wVar) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(com.ss.android.ugc.aweme.im.service.model.d dVar) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void a(j jVar) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void a(l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void a(n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(String str, int i2, int i3, int i4, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(String str, int i2, int i3, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(Map map) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(boolean z, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void b(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void b(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void b(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void b(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void b_(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final aj c(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void c(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void c(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.c.AbstractC1481c
    public void d() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void d(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void d(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void d(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final ag e() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void e(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void e(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void f() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void g() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void i() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void j() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void l() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void m() {
    }

    public void n() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedPercent(String str, long j2, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedTimeMs(String str, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(com.ss.android.ugc.playerkit.model.l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(String str, com.ss.android.ugc.playerkit.model.l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPause(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPrepare(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(String str, long j2, long j3) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayRelease(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlaying(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreParePlay(String str, com.ss.android.ugc.playerkit.model.n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreRenderSessionMissed(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(String str, o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderReady(com.ss.android.ugc.playerkit.model.n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onResumePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(com.ss.android.ugc.playerkit.model.l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(String str, com.ss.android.ugc.playerkit.model.l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekEnd(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekStart(String str, int i2, float f2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoSizeChanged(String str, int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void q() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final int s() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final bd t() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void u() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final ai v() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final boolean w() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final Surface x() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final View y() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void z() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.af
    public final double J() {
        return this.f91740l;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final Aweme b() {
        return this.f91730b;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final ah p() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(String str) {
        h.f.b.l.d(str, "");
        this.f91733e = str;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final Aweme P() {
        return b();
    }

    static final class a implements LongPressLayout.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f91741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f91742b;

        static {
            Covode.recordClassIndex(57757);
        }

        a(c cVar, Context context) {
            this.f91741a = cVar;
            this.f91742b = context;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.c$a$a  reason: collision with other inner class name */
        static final class C2212a implements c.AbstractC0503c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.live.c f91743a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f91744b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Room f91745c;

            static {
                Covode.recordClassIndex(57758);
            }

            C2212a(com.ss.android.ugc.aweme.live.c cVar, a aVar, Room room) {
                this.f91743a = cVar;
                this.f91744b = aVar;
                this.f91745c = room;
            }

            @Override // com.bytedance.android.livesdkapi.depend.e.c.AbstractC0503c
            public final void a() {
                this.f91744b.f91741a.f91738j.onReportPressed();
            }
        }

        static final class b implements c.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f91746a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f91747b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.live.c f91748c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a f91749d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Room f91750e;

            static {
                Covode.recordClassIndex(57759);
            }

            b(String str, String str2, com.ss.android.ugc.aweme.live.c cVar, a aVar, Room room) {
                this.f91746a = str;
                this.f91747b = str2;
                this.f91748c = cVar;
                this.f91749d = aVar;
                this.f91750e = room;
            }

            @Override // com.bytedance.android.livesdkapi.depend.e.c.b
            public final void a() {
                this.f91749d.f91741a.f91738j.onDislikePressed();
                com.bytedance.android.livesdkapi.service.d a2 = f.a();
                if (a2 != null) {
                    a2.a(this.f91750e, this.f91746a, this.f91747b);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.feed.ui.LongPressLayout.a
        public final void a(float f2, float f3) {
            String str;
            String str2;
            this.f91741a.f91736h = true;
            Room room = new Room();
            LiveRoomStruct liveRoomStruct = this.f91741a.f91731c;
            if (liveRoomStruct != null) {
                room.setId(liveRoomStruct.id);
                User user = new User();
                com.ss.android.ugc.aweme.profile.model.User user2 = liveRoomStruct.owner;
                h.f.b.l.b(user2, "");
                user.setSecUid(user2.getSecUid());
                user.setId(liveRoomStruct.ownerUserId);
                FollowInfo followInfo = new FollowInfo();
                com.ss.android.ugc.aweme.profile.model.User user3 = liveRoomStruct.owner;
                h.f.b.l.b(user3, "");
                followInfo.setFollowStatus((long) user3.getFollowStatus());
                user.setFollowInfo(followInfo);
                com.ss.android.ugc.aweme.profile.model.User user4 = liveRoomStruct.owner;
                h.f.b.l.b(user4, "");
                user.setSecret(user4.isPrivateAccount() ? 1 : 0);
                room.setOwner(user);
                Aweme aweme = this.f91741a.f91730b;
                if (aweme == null || (str2 = aweme.getRequestId()) == null) {
                    str2 = "";
                }
                room.setRequestId(str2);
                room.setOwnerUserId(liveRoomStruct.ownerUserId);
                room.setLiveTypeAudio(liveRoomStruct.liveTypeAudio);
            }
            ILiveOuterService s = LiveOuterService.s();
            h.f.b.l.b(s, "");
            com.ss.android.ugc.aweme.live.c d2 = s.d();
            if (d2 != null) {
                c.a a2 = com.bytedance.android.livesdkapi.depend.e.c.a(room);
                String L = this.f91741a.L();
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                h.f.b.l.b(createIUserServicebyMonsterPlugin, "");
                String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
                h.f.b.l.b(currentUserID, "");
                a2.f22981d = Long.parseLong(currentUserID);
                a2.v = room.getId();
                a2.w = room.getOwnerUserId();
                a2.t = room.getRequestId();
                a2.E = L;
                a2.F = "live_cell";
                a2.q = false;
                a2.H = true;
                a2.I = d2.a(L, "live_cell");
                a2.P = new C2212a(d2, this, room);
                a2.Q = new b(L, "live_cell", d2, this, room);
                Aweme aweme2 = this.f91741a.f91730b;
                if (aweme2 != null) {
                    str = aweme2.getAid();
                } else {
                    str = null;
                }
                a2.L = str;
                if (this.f91741a.M()) {
                    a2.G = "fyp_long_press";
                } else if (this.f91741a.N()) {
                    a2.G = "following_long_press";
                }
                com.bytedance.android.livesdkapi.depend.e.c a3 = a2.a();
                d2.a(this.f91742b, false, room, a3, this.f91741a.f91738j, new C2213c(a3, this, room));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.c$a$c  reason: collision with other inner class name */
        public static final class C2213c implements com.bytedance.android.livesdkapi.depend.e.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.livesdkapi.depend.e.c f91751a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f91752b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Room f91753c;

            static {
                Covode.recordClassIndex(57760);
            }

            @Override // com.bytedance.android.livesdkapi.depend.e.b
            public final void a(Throwable th) {
            }

            C2213c(com.bytedance.android.livesdkapi.depend.e.c cVar, a aVar, Room room) {
                this.f91751a = cVar;
                this.f91752b = aVar;
                this.f91753c = room;
            }

            @Override // com.bytedance.android.livesdkapi.depend.e.b
            public final void a(String str, String str2, Bundle bundle) {
                int i2;
                String str3;
                String str4;
                h.f.b.l.d(str, "");
                h.f.b.l.d(str2, "");
                int i3 = 0;
                if (bundle != null) {
                    ILiveOuterService s = LiveOuterService.s();
                    h.f.b.l.b(s, "");
                    i2 = bundle.getInt(s.d().b(2));
                    ILiveOuterService s2 = LiveOuterService.s();
                    h.f.b.l.b(s2, "");
                    i3 = bundle.getInt(s2.d().b(1));
                } else {
                    i2 = 0;
                }
                String mD5String = MD5Utils.getMD5String("share_success" + System.currentTimeMillis());
                if (bundle != null) {
                    str3 = bundle.getString("shareIdList", "");
                } else {
                    str3 = "";
                }
                HashMap hashMap = new HashMap();
                hashMap.put("share_platform", str);
                hashMap.put("share_type", str2);
                hashMap.put("user_type", "user");
                com.bytedance.android.livesdkapi.depend.e.c cVar = this.f91751a;
                h.f.b.l.b(cVar, "");
                String str5 = cVar.B;
                h.f.b.l.b(str5, "");
                hashMap.put("request_page", str5);
                h.f.b.l.b(mD5String, "");
                hashMap.put("bind_id", mD5String);
                hashMap.put("room_orientation", "portrait");
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_share").a("enter_from_merge", this.f91752b.f91741a.L()).a("enter_method", "live_cell").a("anchor_id", this.f91753c.getOwnerUserId()).a("room_id", this.f91753c.getId()).a("action_type", "click").a("is_create_group_chat", i2).a("friends_shared_cnt", i3);
                if (bundle != null) {
                    ILiveOuterService s3 = LiveOuterService.s();
                    h.f.b.l.b(s3, "");
                    str4 = bundle.getString(s3.d().b(3));
                } else {
                    str4 = null;
                }
                String str6 = "top_supporters";
                if (!TextUtils.equals(str4, str6)) {
                    if (TextUtils.equals(str4, "recently_shared")) {
                        str6 = "recently_shared";
                    } else {
                        str6 = "none";
                    }
                }
                a2.a("batch_share_type", str6).a((Map<String, String>) hashMap).b();
                b.a.a("share_info").a("bind_id", mD5String).a("to_user_id", str3).b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void h() {
        com.bytedance.monitor.collector.d.f41460d = false;
        d.a.f120589a.b();
    }

    public void o() {
        k a2 = k.a();
        h.f.b.l.b(a2, "");
        a2.f143433a = this.f91732d;
    }

    public static final class b implements IHostLongPressCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f91754a;

        static {
            Covode.recordClassIndex(57761);
        }

        public static final class a implements com.ss.android.ugc.aweme.ad.feed.dialog.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f91755a;

            static {
                Covode.recordClassIndex(57762);
            }

            @Override // com.ss.android.ugc.aweme.ad.feed.dialog.d
            public final void a() {
                com.ss.android.ugc.d.a.c.a(new e(this.f91755a.f91754a.f91730b, this.f91755a.f91754a.K()));
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(b bVar) {
                this.f91755a = bVar;
            }
        }

        @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
        public final void onDislikePressed() {
            Aweme aweme;
            AwemeRawAd awemeRawAd;
            com.ss.android.ugc.aweme.commercialize.model.b dislikeInfo;
            AwemeRawAd awemeRawAd2;
            long j2;
            Aweme aweme2 = this.f91754a.f91730b;
            if (aweme2 == null || !aweme2.isAd() || (aweme = this.f91754a.f91730b) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (dislikeInfo = awemeRawAd.getDislikeInfo()) == null || dislikeInfo.getEnable() != 1) {
                ao.a(y.e(), (int) R.string.e8h);
                com.ss.android.ugc.d.a.c.a(new e(this.f91754a.f91730b, this.f91754a.K()));
            } else if (this.f91754a.f91729a instanceof androidx.fragment.app.e) {
                IFeedAdService c2 = FeedAdServiceImpl.c();
                String str = null;
                if (c2 != null) {
                    Aweme aweme3 = this.f91754a.f91730b;
                    if (aweme3 != null) {
                        awemeRawAd2 = aweme3.getAwemeRawAd();
                    } else {
                        awemeRawAd2 = null;
                    }
                    Aweme aweme4 = this.f91754a.f91730b;
                    if (aweme4 != null) {
                        str = aweme4.getAid();
                    }
                    a aVar = new a(this);
                    LiveRoomStruct liveRoomStruct = this.f91754a.f91731c;
                    if (liveRoomStruct != null) {
                        j2 = liveRoomStruct.id;
                    } else {
                        j2 = 0;
                    }
                    androidx.fragment.app.d a2 = c2.a(awemeRawAd2, str, aVar, j2);
                    if (a2 != null) {
                        a2.setCancelable(true);
                        Context context = this.f91754a.f91729a;
                        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        a2.show(((androidx.fragment.app.e) context).getSupportFragmentManager(), "feed_ad_dislike_sub_reason_dialog");
                    }
                }
            }
        }

        @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
        public final void onReportPressed() {
            long j2;
            LiveRoomStruct liveRoomStruct;
            Aweme aweme = this.f91754a.f91730b;
            if (aweme == null || aweme.isAd()) {
                Aweme aweme2 = this.f91754a.f91730b;
                if (aweme2 != null) {
                    Context context = this.f91754a.f91729a;
                    LiveRoomStruct liveRoomStruct2 = this.f91754a.f91731c;
                    if (liveRoomStruct2 != null) {
                        j2 = liveRoomStruct2.id;
                    } else {
                        j2 = 0;
                    }
                    h.f.b.l.d(context, "");
                    h.f.b.l.d(aweme2, "");
                    com.ss.android.ugc.aweme.compliance.api.a.a().b(com.ss.android.ugc.aweme.share.improve.c.b.a(context), com.ss.android.ugc.aweme.report.b.a(aweme2, "live_ad", j2, "ad"));
                    return;
                }
                return;
            }
            ILiveOuterService s = LiveOuterService.s();
            h.f.b.l.b(s, "");
            com.ss.android.ugc.aweme.live.c d2 = s.d();
            if (d2 != null && (liveRoomStruct = this.f91754a.f91731c) != null) {
                long j3 = liveRoomStruct.id;
                com.ss.android.ugc.aweme.profile.model.User user = liveRoomStruct.owner;
                h.f.b.l.b(user, "");
                String uid = user.getUid();
                h.f.b.l.b(uid, "");
                long parseLong = Long.parseLong(uid);
                com.ss.android.ugc.aweme.profile.model.User user2 = liveRoomStruct.owner;
                h.f.b.l.b(user2, "");
                String uid2 = user2.getUid();
                h.f.b.l.b(uid2, "");
                long parseLong2 = Long.parseLong(uid2);
                com.ss.android.ugc.aweme.profile.model.User user3 = liveRoomStruct.owner;
                h.f.b.l.b(user3, "");
                com.bytedance.android.livesdkapi.model.d dVar = new com.bytedance.android.livesdkapi.model.d(j3, parseLong, parseLong2, user3.getSecUid(), "long_press", this.f91754a.K(), "live_cell", "click", "report_anchor", "");
                dVar.f23274a = "full_screen";
                d2.a(this.f91754a.f91729a, dVar);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f91754a = cVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void k() {
        fr.c(1000);
        fr.b(1500);
        fr.a(1000);
        d.a.f120589a.a();
    }

    public static void I() {
        r.a("live_play_page_notice", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "homepage_follow").a("notice_type", com.ss.android.ugc.aweme.follow.e.a.f96227a).a("show_cnt", String.valueOf(com.ss.android.ugc.aweme.follow.e.a.f96228b)).a("yellow_dot_logid", com.ss.android.ugc.aweme.follow.e.a.f96229c).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void c() {
        ak akVar = this.f91732d;
        k a2 = k.a();
        h.f.b.l.b(a2, "");
        if (h.f.b.l.a(akVar, a2.f143433a)) {
            k.a().b();
            k a3 = k.a();
            h.f.b.l.b(a3, "");
            a3.f143433a = null;
        }
        this.f91740l = -1.0d;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void r() {
        Context context = this.f91729a;
        com.bytedance.common.utility.collection.d<SurfaceView> dVar = ce.a.f91760a.get(context);
        if (dVar != null) {
            Iterator<SurfaceView> it = dVar.iterator();
            while (it.hasNext()) {
                com.ss.android.ugc.aweme.base.utils.o.a(it.next(), 8);
            }
        }
        com.bytedance.common.utility.collection.d<ce> dVar2 = ce.a.f91761b.get(context);
        if (dVar2 != null) {
            Iterator<ce> it2 = dVar2.iterator();
            while (it2.hasNext()) {
                ce next = it2.next();
                h.f.b.l.b(next, "");
                if (next.b() != null) {
                    Aweme b2 = next.b();
                    if (b2 == null) {
                        h.f.b.l.b();
                    }
                    Video video = b2.getVideo();
                    if (video == null) {
                        h.f.b.l.b();
                    }
                    next.a(video);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void c(int i2) {
        this.f91735g = false;
        this.f91737i = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void a(int i2) {
        com.ss.android.ugc.d.a.c.a(new u(this.f91730b));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void d(int i2) {
        this.f91735g = false;
        this.f91737i = false;
        o();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public void b(Aweme aweme) {
        this.f91735g = false;
        this.f91737i = false;
    }

    public c(View view) {
        h.f.b.l.d(view, "");
        this.f91739k = view;
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        this.f91729a = context;
    }

    public final LongPressLayout.a a(Context context) {
        h.f.b.l.d(context, "");
        if (f.a() == null) {
            return null;
        }
        com.bytedance.android.livesdkapi.service.d a2 = f.a();
        if (a2 == null) {
            h.f.b.l.b();
        }
        Boolean bool = (Boolean) a2.a("live_host_card_long_press_enable", (Object) false);
        h.f.b.l.b(bool, "");
        if (!bool.booleanValue()) {
            return null;
        }
        return new a(this, context);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(float f2) {
        Aweme aweme = this.f91730b;
        if (aweme != null && aweme.getVideo() != null) {
            Aweme aweme2 = this.f91730b;
            if (aweme2 == null) {
                h.f.b.l.b();
            }
            Video video = aweme2.getVideo();
            h.f.b.l.b(video, "");
            double duration = (double) (((float) video.getDuration()) * (f2 / 100.0f));
            Double.isNaN(duration);
            this.f91740l = duration / 1000.0d;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void a(Aweme aweme) {
        this.f91735g = false;
        this.f91737i = false;
        this.f91730b = aweme;
        if (aweme != null) {
            LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
            if (newLiveRoomData == null) {
                RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
                h.f.b.l.b(roomFeedCellStruct, "");
                newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData();
            }
            this.f91731c = newLiveRoomData;
        }
        n();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(Aweme aweme, int i2) {
        a(aweme);
    }
}

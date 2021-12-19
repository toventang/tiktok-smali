package com.bytedance.android.livesdk.chatroom.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.android.d.b;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.RoomStatus;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.performance.b;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.view.e;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.e;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.v;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.ah;
import com.bytedance.android.live.liveinteract.api.as;
import com.bytedance.android.live.liveinteract.api.aw;
import com.bytedance.android.live.n.ad;
import com.bytedance.android.live.n.t;
import com.bytedance.android.livesdk.ab;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.c.h;
import com.bytedance.android.livesdk.ab.j;
import com.bytedance.android.livesdk.ai.c;
import com.bytedance.android.livesdk.ai.f;
import com.bytedance.android.livesdk.aj.l;
import com.bytedance.android.livesdk.am;
import com.bytedance.android.livesdk.av;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.bf;
import com.bytedance.android.livesdk.bk;
import com.bytedance.android.livesdk.chatroom.c.an;
import com.bytedance.android.livesdk.chatroom.c.o;
import com.bytedance.android.livesdk.chatroom.d.a;
import com.bytedance.android.livesdk.chatroom.detail.f;
import com.bytedance.android.livesdk.chatroom.detail.g;
import com.bytedance.android.livesdk.chatroom.detail.h;
import com.bytedance.android.livesdk.chatroom.detail.i;
import com.bytedance.android.livesdk.chatroom.detail.r;
import com.bytedance.android.livesdk.chatroom.detail.y;
import com.bytedance.android.livesdk.chatroom.g.m;
import com.bytedance.android.livesdk.chatroom.g.q;
import com.bytedance.android.livesdk.chatroom.ui.a.b;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.ai;
import com.bytedance.android.livesdk.j.aj;
import com.bytedance.android.livesdk.j.ar;
import com.bytedance.android.livesdk.j.ay;
import com.bytedance.android.livesdk.j.bi;
import com.bytedance.android.livesdk.j.bj;
import com.bytedance.android.livesdk.j.bw;
import com.bytedance.android.livesdk.j.by;
import com.bytedance.android.livesdk.j.bz;
import com.bytedance.android.livesdk.j.ca;
import com.bytedance.android.livesdk.j.cd;
import com.bytedance.android.livesdk.j.cm;
import com.bytedance.android.livesdk.j.cn;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dh;
import com.bytedance.android.livesdk.j.dm;
import com.bytedance.android.livesdk.j.dq;
import com.bytedance.android.livesdk.j.dv;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.j.eg;
import com.bytedance.android.livesdk.j.x;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAnchorLinkmicSpeedUpSeiSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveDrawerVersion;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableReusePlayerWithoutFirstFrameSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableSlideEnterRoomOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableSlideVideoLastFrameSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InboxTopLivesEnterRoomOptiSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveClickEnterDelayShowLoadingTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawPreEnterRoom;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterDelayShowLoadingTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtFeedDrawerShowMoreLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtForyouEntranceShowMoreLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtRoomSlideUpGuideSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNewAudienceFinishPageSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePaidEventSchema;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerErrorCountSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveTestEnableRoomStreamToastSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUseSurfaceViewExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.MtPipWatchLiveUnderWindowFocusSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowAudienceDefinitionSelectionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowBackgroundBelowVideoExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisablePullStreamInfoSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model.message.bv;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.rank.api.c;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdk.widget.LiveMaskLayerWidget;
import com.bytedance.android.livesdk.widget.b.d;
import com.bytedance.android.livesdkapi.c;
import com.bytedance.android.livesdkapi.depend.d.h;
import com.bytedance.android.livesdkapi.depend.d.i;
import com.bytedance.android.livesdkapi.depend.d.p;
import com.bytedance.android.livesdkapi.depend.model.live.DebugToolState;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamData;
import com.bytedance.android.livesdkapi.depend.model.live.s;
import com.bytedance.android.livesdkapi.f.a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.model.LatestLiveData;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.android.livesdkapi.view.SurfaceRenderView;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.android.livesdkapi.view.TextureViewWrapper;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.datachannel.e;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.bytedance.ies.sdk.widgets.IWidgetProvider;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.j;
import org.json.JSONException;
import org.json.JSONObject;

public class br extends com.bytedance.android.livesdk.ui.a implements b.AbstractC0329b, com.bytedance.android.livesdkapi.depend.a.a, i, e, org.greenrobot.eventbus.i, j {

    /* renamed from: a  reason: collision with root package name */
    static final Boolean f15991a = false;
    public static final List<Long> aq = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    static float f15992b = 138.0f;
    boolean A = false;
    boolean B = false;
    public com.bytedance.android.livesdk.chatroom.ui.a.a C;
    ViewGroup D;
    HSImageView E;
    public ViewGroup F;
    HSImageView G;
    LinearLayout H;
    View I;
    public a J;
    public Dialog K;
    public com.bytedance.android.livesdk.chatroom.end.b L;
    public String M;
    public String N = "other";
    public boolean O = false;
    public boolean P = false;
    g Q;
    public View R;
    public List<String> S = new ArrayList();
    long T;
    long U;
    public DataChannel V;
    RecyclableWidgetManager W;
    public LiveMaskLayerWidget X;
    final Handler Y;
    public HashMap<String, String> Z;
    private s.a aA;
    private boolean aB;
    private y aC;
    private final h aD = new h();
    private q aE;
    private boolean aF = false;
    private boolean aG = false;
    private HSImageView aH;
    private HSImageView aI;
    private View aJ;
    private HSAnimImageView aK;
    private com.bytedance.android.livesdk.chatroom.end.newaudienceend.a aL;
    private DrawerLayout.c aM;
    private String aN = null;
    private long aO;
    private String aP;
    private final boolean aQ = ShowBackgroundBelowVideoExperiment.INSTANCE.isEnable();
    private boolean aR = false;
    private i.a aS;
    private final boolean aT;
    private final boolean aU;
    private final int aV;
    private final int aW;
    private long aX;
    private long aY;
    private ValueAnimator aZ;
    public long aa;
    public l ab;
    public View ac;
    public boolean ad;
    public boolean ae;
    String af;
    View ag;
    public boolean ah;
    public boolean ai;
    public EnterRoomConfig aj;
    public f.a.b.b ak;
    PictureInPictureParams.Builder al;
    boolean am;
    d an;
    public boolean ao;
    boolean ap;
    final com.bytedance.android.livesdk.gift.e.b ar;
    boolean as;
    i.b at;
    boolean au;
    f av;
    com.bytedance.android.livesdk.ai.g aw;
    private String ax;
    private String ay;
    private String az;
    private long ba;
    private boolean bb;
    private boolean bc;
    private a.AbstractC0506a bd;
    private final List<com.bytedance.android.livesdk.chatroom.c.q> be;
    private com.bytedance.android.d.a bf;
    private c bg;
    private View bh;
    private boolean bi;
    private int bj;
    private boolean bk;
    private final f.a.b.a bl;
    private boolean bm;
    private String bn;
    private final b.a bo;
    private BroadcastReceiver bp;

    /* renamed from: c  reason: collision with root package name */
    public long f15993c;

    /* renamed from: d  reason: collision with root package name */
    public Room f15994d;

    /* renamed from: e  reason: collision with root package name */
    long f15995e;

    /* renamed from: f  reason: collision with root package name */
    List<String> f15996f;

    /* renamed from: g  reason: collision with root package name */
    public String f15997g;

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.model.live.i f15998h;

    /* renamed from: i  reason: collision with root package name */
    boolean f15999i;

    /* renamed from: j  reason: collision with root package name */
    long f16000j;

    /* renamed from: k  reason: collision with root package name */
    String f16001k;

    /* renamed from: l  reason: collision with root package name */
    boolean f16002l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f16003m;
    public int n = 1;
    boolean o;
    public int p;
    int q;
    public p r = p.IDLE;
    public com.bytedance.android.livesdk.chatroom.detail.j s;
    com.bytedance.android.livesdk.chatroom.detail.i t;
    public com.bytedance.android.livesdk.chatroom.detail.f u;
    public com.bytedance.android.d.b v;
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    public boolean z = false;

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(355, new org.greenrobot.eventbus.g(br.class, "liveUserKickOut", com.bytedance.android.livesdkapi.g.l.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final Fragment n() {
        return this;
    }

    @Override // com.bytedance.ies.sdk.datachannel.e
    public final DataChannel h() {
        return this.V;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final long i() {
        return this.f15993c;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final EnterRoomConfig w() {
        return this.aj;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final String y() {
        return this.af;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.F.getLayoutParams();
        if (marginLayoutParams.topMargin != i2) {
            marginLayoutParams.topMargin = i2;
            this.F.setLayoutParams(marginLayoutParams);
        }
    }

    public final void a(long j2) {
        E().put("param_live_enter_room_api_start_time", new StringBuilder().append(System.currentTimeMillis()).toString());
        f.a b2 = b(j2);
        if (r.a.a().a(j2)) {
            com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "has prefetch room/enter api !!!! room_id=".concat(String.valueOf(j2)));
            this.ab.a("n_time_api_start");
            this.u = r.a.a().f15299e;
            r.a.a().a(b2);
            return;
        }
        com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "start room/enter api !!!! room_id=".concat(String.valueOf(j2)));
        a(j2, b2);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).exitRoom(false);
        this.ao = false;
        if (this.r != p.IDLE && this.r != p.INITIALIZED) {
            com.bytedance.android.livesdk.chatroom.ui.a.a aVar = this.C;
            if (aVar != null && (aVar.f15846a instanceof com.bytedance.android.livesdkapi.view.e) && !this.bi) {
                com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "stop room -> video set reset");
                ((com.bytedance.android.livesdkapi.view.e) this.C.f15846a).a();
            }
            com.bytedance.android.livesdk.chatroom.detail.j jVar = this.s;
            if (jVar != null) {
                jVar.d();
            }
            q qVar = this.aE;
            if (qVar != null) {
                qVar.a();
                this.aE.b();
            }
            if (this.r != p.LIVE_FINISHED) {
                if (!this.ah) {
                    if (!this.ai) {
                        a("user cancel, frame_fail", 208, -1);
                    } else {
                        a("user cancel, frame_fail", 208, -2);
                    }
                } else if (!this.ai) {
                    a("user cancel, frame_fail", 208, -3);
                }
                if (this.r == p.LIVE_STARTED) {
                    q();
                }
                if (this.r == p.PREPARED || this.r == p.PREPARING) {
                    d(z2);
                }
                com.bytedance.android.livesdk.chatroom.detail.j jVar2 = this.s;
                if (jVar2 != null) {
                    jVar2.a();
                }
                U();
                this.ai = false;
                this.ah = false;
                ((com.bytedance.android.livesdk.survey.a) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.survey.a.class)).leavePlay();
            }
        }
    }

    public final boolean a(Room room, boolean z2) {
        Boolean bool;
        com.bytedance.android.d.b bVar;
        DataChannel dataChannel;
        View view;
        String str;
        com.bytedance.android.livesdk.ab.c.a aVar;
        com.bytedance.android.livesdk.chatroom.detail.j jVar = this.s;
        if (!(jVar == null || room == null)) {
            room.setUserFrom(jVar.f15276g);
            room.setRequestId(jVar.f15274e);
            room.setLog_pb(jVar.f15275f);
            room.setLabels(jVar.f15277h);
            room.setSourceType(jVar.z);
        }
        com.bytedance.android.livesdk.ab.c.h b2 = com.bytedance.android.livesdk.ab.d.b();
        if (b2 != null) {
            b2.f13527b = room;
        }
        Boolean valueOf = Boolean.valueOf(this.aj.f23298b.f23320l);
        com.bytedance.android.livesdk.ab.c.h b3 = com.bytedance.android.livesdk.ab.d.b();
        if (!(b3 == null || (aVar = b3.f13530e) == null)) {
            aVar.t = valueOf;
        }
        String valueOf2 = String.valueOf(room.getId());
        com.bytedance.android.livesdk.ab.c.h hVar = (com.bytedance.android.livesdk.ab.c.h) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.ab.c.j.class);
        com.bytedance.android.livesdk.ab.c.a aVar2 = hVar != null ? hVar.f13530e : null;
        if (aVar2 == null || (str = aVar2.s) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(str.length() > 0);
        }
        if (com.bytedance.android.livesdk.utils.p.a(bool) && aVar2 != null) {
            aVar2.s = valueOf2;
        }
        if (!isDetached() && getActivity() != null) {
            com.bytedance.android.live.liveinteract.api.a.b a2 = b.a.a(room.getId(), this.V, "LivePlayFragment");
            if (room.getLinkMicInfo() != null) {
                a2.a(room.getLinkMicInfo());
            }
        }
        boolean z3 = (room.getId() == this.aj.f23297a.f23348l || this.aj.f23297a.f23348l == -1) ? false : true;
        this.f15994d = room;
        this.f15993c = room.getId();
        if (room.getOwner() != null) {
            this.f15995e = room.getOwner().getId();
            if (this.f15996f == null) {
                if (room.getCover() != null && !com.bytedance.common.utility.h.a(room.getCover().getUrls())) {
                    this.f15996f = room.getCover().getUrls();
                } else if (room.getOwner().getAvatarThumb() != null && !com.bytedance.common.utility.h.a(room.getOwner().getAvatarThumb().getUrls())) {
                    this.f15996f = room.getOwner().getAvatarThumb().getUrls();
                }
                a(this.f15998h, this.f15996f);
            }
            if (this.am) {
                O();
            }
            u.a().b().a(room.getOwner());
            this.aj.f23299c.ay = room.getOwner().getAvatarThumb();
        }
        if (getActivity() != null) {
            getActivity().getIntent().putExtra("live.intent.extra.USER_ID", this.f15995e);
            getActivity().getIntent().putExtra("current_room_id", this.f15993c);
        }
        this.f15997g = room.buildPullUrl();
        this.ax = room.getSdkParams();
        this.ay = room.getMultiStreamData();
        this.az = room.getMultiStreamDefaultQualitySdkKey();
        this.f15998h = room.getStreamType();
        LivePerformanceManager.getInstance().setStreamType(this.f15998h);
        this.aA = room.getStreamSrConfig();
        EnterRoomConfig enterRoomConfig = this.aj;
        if (enterRoomConfig != null) {
            enterRoomConfig.f23297a.f23342f = this.az;
            this.aj.f23297a.f23339c = this.ax;
            this.aj.f23297a.f23340d = this.ay;
            this.aj.f23297a.f23338b = this.f15997g;
            this.aj.f23297a.f23346j = this.f15998h.ordinal();
            if (this.aA != null) {
                this.aj.f23297a.f23343g = this.aA.f23192a;
                this.aj.f23297a.f23344h = this.aA.f23193b;
                this.aj.f23297a.f23345i = this.aA.f23194c;
            }
        }
        com.bytedance.android.livesdk.chatroom.detail.j jVar2 = this.s;
        if (jVar2 != null) {
            jVar2.a(this.f15993c, room.isLiveTypeAudio(), this.f15995e, room.getLinkMicInfo());
        }
        if (!(this.f15998h != com.bytedance.android.livesdkapi.depend.model.live.i.OFFICIAL_ACTIVITY || room.background == null || (view = this.ac) == null)) {
            HSImageView hSImageView = (HSImageView) view.findViewById(R.id.ffl);
            if (Build.VERSION.SDK_INT >= 23) {
                hSImageView.setForeground(null);
            }
            k.a(hSImageView, room.background);
        }
        if (!(!room.isOfficial() || this.aj == null || (dataChannel = this.V) == null)) {
            dataChannel.a(by.class, (Object) false);
            this.V.a(bz.class, "");
            this.aj.f23299c.O = false;
            this.aj.f23299c.P = "";
        }
        if (this.f15993c != 0) {
            this.aj.f23299c.R = this.f15993c;
        }
        if (this.f15995e != 0) {
            this.aj.f23299c.D = String.valueOf(this.f15995e);
        }
        this.aj.f23299c.S = room.getStreamType();
        if (room.getStatus() == 4) {
            a("room finish, live_end", 201, -3);
            b.a.a("rd_enter_room_live_end").a(this.V).b();
            a(107, "room finish", this.f15993c);
            Event event = new Event("live_play_end_room_fetch_fail", 1025, com.bytedance.android.livesdkapi.session.b.ServerApiCall);
            event.a("room status is finished.");
            f.a.f23366a.a().a(event);
            a(a.ROOM_FETCH_FINISHED);
            return false;
        }
        if (z2) {
            com.bytedance.android.live.n.k b4 = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().b(this.af);
            int q2 = b4 != null ? b4.q() : 0;
            if ((!room.isPullUrlValid() && !room.isMultiPullDataValid() && q2 == 0) || (q2 != 1 ? !(q2 != 2 || room.isMultiPullDataValid()) : !room.isPullUrlValid())) {
                a(108, "fetch failed because the pull_url isn't valid", this.f15993c);
                a("pull url invalid, frame_fail", 207, -2);
                Event event2 = new Event("live_play_end_room_fetch_fail", 1024, com.bytedance.android.livesdkapi.session.b.ServerApiCall);
                event2.a("pull url invalid, frame_fail.");
                f.a.f23366a.a().a(event2);
                a(a.FETCH_FAILED);
                return false;
            }
        }
        if (z3) {
            b(true);
            if (this.bb && (bVar = this.v) != null) {
                bVar.recycle();
                this.v = null;
                this.af = null;
            }
            HashMap hashMap = new HashMap(10);
            hashMap.putAll(b.a.a("").d());
            com.bytedance.android.live.core.d.c.a("ttlive_room_id_changed", 0, hashMap);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0148, code lost:
        if (r5 != null) goto L_0x014a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 595
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.br.a(int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(int[] iArr, int i2, int i3) {
        ViewGroup viewGroup;
        int i4;
        int i5;
        if (i2 != 0 && i3 != 0 && n.a(getContext()) >= n.b(getContext()) && (viewGroup = this.F) != null) {
            int height = viewGroup.getHeight();
            int width = this.F.getWidth();
            float f2 = (float) i2;
            float f3 = (float) i3;
            float f4 = (float) width;
            float f5 = (float) height;
            if (f2 / f3 > f4 / f5) {
                i5 = (int) ((f4 / f2) * f3);
                i4 = width;
            } else {
                i4 = (int) ((f5 / f3) * f2);
                i5 = height;
            }
            int i6 = (width - i4) / 2;
            iArr[0] = i6;
            int i7 = (height - i5) / 2;
            iArr[1] = i7;
            iArr[2] = i6;
            iArr[3] = i7;
        }
    }

    public final void a(Room room) {
        EnterRoomConfig enterRoomConfig;
        if (!(room != null || (enterRoomConfig = this.aj) == null || enterRoomConfig.f23299c == null)) {
            room = new Room();
            if (this.aj.f23299c.aE != null) {
                room.warningTag = this.aj.f23299c.aE;
            }
            if (this.aj.f23299c.aD != null) {
                room.maskLayer = this.aj.f23299c.aD;
            }
        }
        c(room);
        d(room);
    }

    public final boolean b(Room room) {
        if (this.O || room == null || room.maskLayer == null) {
            return false;
        }
        EnterRoomConfig enterRoomConfig = this.aj;
        if (enterRoomConfig == null || enterRoomConfig.f23299c == null) {
            return true;
        }
        String str = this.aj.f23299c.L;
        String str2 = this.aj.f23299c.J;
        if (!"live_cell".equals(str) || (!"homepage_hot".equals(str2) && !"homepage_follow".equals(str2))) {
            return !"right_anchor".equals(str) || !"live_detail".equals(str2);
        }
        return false;
    }

    public final void a(String str) {
        int i2 = 8;
        if (this.aH.getVisibility() != 8) {
            this.aH.setVisibility(8);
        }
        HSImageView hSImageView = this.E;
        if (this.am) {
            i2 = 0;
        }
        hSImageView.setVisibility(i2);
        com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "hide Background, reason: ".concat(String.valueOf(str)));
        a(false, str);
        c cVar = this.bg;
        if (cVar != null) {
            cVar.d();
        }
        this.V.c(com.bytedance.android.livesdk.watch.e.class, this.aH);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2, String str) {
        String str2;
        String str3 = "show";
        if (getUserVisibleHint() || !isHidden()) {
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "liveplay_background_status");
            if (z2) {
                str2 = str3;
            } else {
                str2 = "hide";
            }
            hashMap.put("view_status", str2);
            hashMap.put("view_bg_reason", str);
            com.bytedance.android.livesdk.ab.i.b().b("ttlive_room", hashMap);
        }
        HashMap hashMap2 = new HashMap();
        if (!z2) {
            str3 = "hide";
        }
        hashMap2.put("bg_status", str3);
        hashMap2.put("bg_reason", str);
        hashMap2.put("bg_illegal", String.valueOf(this.y));
        b.a.a("liveplay_background_monitor").a(this.V).a((Map<String, String>) hashMap2).b();
    }

    public final void a(bv bvVar) {
        com.bytedance.android.d.b bVar;
        if (isAdded()) {
            boolean z2 = bvVar.f19368f == 2;
            if (z2 != this.y) {
                this.y = z2;
                if (z2) {
                    c("illegal Status");
                    if (isViewValid() && (bVar = this.v) != null) {
                        bVar.setMute(true);
                        return;
                    }
                    return;
                }
                com.bytedance.android.d.b bVar2 = this.v;
                if (bVar2 != null && bVar2.getDecodeStatus() == 1) {
                    a("recover from illegal status");
                }
                R();
            }
        }
    }

    public void onEvent(com.bytedance.android.livesdk.event.i iVar) {
        DataChannel dataChannel = this.V;
        if (dataChannel != null && ((Boolean) dataChannel.b(cn.class)).booleanValue()) {
            com.bytedance.android.livesdk.ai.f fVar = this.av;
            if (fVar == null || fVar.f13770c != iVar.f17197a) {
                String str = "yes";
                if (iVar.f17197a) {
                    com.bytedance.android.livesdk.ai.f fVar2 = this.av;
                    if (fVar2 != null) {
                        fVar2.f13770c = iVar.f17197a;
                        this.av.f13769b = iVar.f17198b;
                        this.av.f13768a = SystemClock.currentThreadTimeMillis();
                    }
                    com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_mini_window_mute_or_pause_click").a("mute_or_pause", "mute");
                    if (!iVar.f17198b) {
                        str = "no";
                    }
                    a2.a("is_auto", str).b();
                    a(2131234522, "", 2, 2);
                } else {
                    com.bytedance.android.livesdk.ai.f fVar3 = this.av;
                    if (fVar3 != null) {
                        fVar3.f13770c = iVar.f17197a;
                        this.av.a();
                    }
                    com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_mini_window_mute_or_pause_click").a("mute_or_pause", "unmute");
                    if (!this.av.f13769b) {
                        str = "no";
                    }
                    a3.a("is_auto", str).b();
                    a(2131234521, "", 1, 1);
                }
                com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", "onEvent(MuteEvent event): " + iVar.f17197a + iVar.f17198b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(com.bytedance.android.livesdk.chatroom.c.q qVar) {
        if (!isResumed()) {
            DataChannel dataChannel = this.V;
            if (dataChannel != null && ((Boolean) dataChannel.b(cn.class)).booleanValue()) {
                this.V.c(ah.class, true);
            }
            this.be.add(qVar);
        } else if (this.r == p.LIVE_STARTED) {
            if (3 == qVar.f15140a) {
                this.V.b(ay.class, (Object) true);
                com.bytedance.android.d.b bVar = this.v;
                if (bVar != null) {
                    bVar.stopWhenJoinInteract(getContext());
                }
                this.C.a(4);
                s();
            } else if (4 == qVar.f15140a) {
                this.V.b(ay.class, (Object) false);
                this.C.a(0);
                com.bytedance.android.d.b bVar2 = this.v;
                if (bVar2 != null) {
                    bVar2.tryResumePlay();
                    if (this.y) {
                        this.v.setMute(true);
                    }
                }
            }
        }
    }

    public void onEvent(com.bytedance.android.livesdkapi.f.a aVar) {
        if (this.J != null && getUserVisibleHint()) {
            this.bd = aVar.f23200c;
            boolean z2 = false;
            if (aVar.f23199b == 2) {
                if (isViewValid() && this.n != 0) {
                    androidx.fragment.app.e activity = getActivity();
                    if (!(this.J == null || activity == null || activity.getWindow() == null || C().e() == null)) {
                        C().e().a(false);
                    }
                    N();
                    if (activity != null) {
                        activity.setRequestedOrientation(0);
                    }
                    this.aF = true;
                } else {
                    return;
                }
            } else if (aVar.f23199b == 1) {
                androidx.fragment.app.e activity2 = getActivity();
                if (!(activity2 == null || activity2.getWindow() == null || !com.bytedance.android.live.core.f.d.a(activity2))) {
                    activity2.getWindow().clearFlags(1024);
                }
                if (isViewValid() && this.n != 1) {
                    N();
                    if (activity2 != null) {
                        activity2.setRequestedOrientation(1);
                    }
                    this.aF = true;
                    if (!aVar.f23198a.isEmpty() && this.f15994d.getOwner().getSubscribeInfo() != null && this.f15994d.getOwner().getSubscribeInfo().isAnchorQualified() && aVar.f23198a.startsWith("subscribe_")) {
                        this.bn = aVar.f23198a.substring(10);
                    }
                } else {
                    return;
                }
            }
            androidx.fragment.app.e activity3 = getActivity();
            if (aVar.f23199b == 1) {
                z2 = true;
            }
            com.bytedance.android.livesdk.drawerfeed.f.a(activity3, Boolean.valueOf(z2));
        }
    }

    public final void a(a aVar) {
        i.b bVar;
        if (getContext() != null) {
            String str = "mini_window";
            boolean z2 = false;
            switch (AnonymousClass9.f16031b[aVar.ordinal()]) {
                case 1:
                    ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.gqe);
                    a(128, "fail to enter the room", this.f15993c);
                    B();
                    return;
                case 2:
                    if (this.ad) {
                        ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.gqe);
                    }
                    this.ad = true;
                    a(129, "fail to enter the room", this.f15993c);
                    if (!com.bytedance.android.livesdk.chatroom.backroom.d.a.a() || (bVar = this.at) == null || !bVar.j()) {
                        B();
                        return;
                    }
                    return;
                case 3:
                    ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.gq9);
                    g(true);
                    Event event = new Event("live_play_enter_room_fail", 33801, com.bytedance.android.livesdkapi.session.b.BussinessApiCall);
                    event.a("live has ended.");
                    f.a.f23366a.a().a(event);
                    a(130, "live has ended.", this.f15993c);
                    B();
                    return;
                case 4:
                    a(121, "enter live end", this.f15993c);
                    ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.gq9);
                    g(true);
                    B();
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    a(116, "fetch finished", this.f15993c);
                    u();
                    g(true);
                    a(true);
                    this.r = p.LIVE_FINISHED;
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    if (!P() && !e(1)) {
                        a(117, "fetch finished", this.f15993c);
                        u();
                        g(true);
                        a(true);
                        this.r = p.LIVE_FINISHED;
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.gsb);
                    a(118, "fetch finished", this.f15993c);
                    u();
                    a(true);
                    this.r = p.LIVE_FINISHED;
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    a(114, "user close", this.f15993c);
                    Q();
                    com.bytedance.android.b.a.a.f6785g.a(true, this.V);
                    if (this.r == p.LIVE_FINISHED) {
                        z2 = true;
                    }
                    g(z2);
                    if (this.s != null) {
                        com.bytedance.android.livesdkapi.k.c.a(com.bytedance.android.livesdkapi.k.a.class, new com.bytedance.android.livesdkapi.k.a(new LatestLiveData(this.f15993c, System.currentTimeMillis(), this.s.c())));
                        this.s.a(this.f15994d);
                    }
                    B();
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    com.bytedance.android.livesdk.ai.c a2 = c.b.a();
                    c.a aVar2 = c.a.BLOCK_USER;
                    DataChannel dataChannel = this.V;
                    if (dataChannel == null || !((Boolean) dataChannel.b(cn.class)).booleanValue()) {
                        str = "voice_only";
                    }
                    a2.a(aVar2, str);
                    if (!e(3)) {
                        f.a.f23366a.a().a(new Event("live_play_user_kick_out", 33806, com.bytedance.android.livesdkapi.session.b.MessageReceived));
                        a(110, "this user is kicked out by other device", this.f15993c);
                        ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.gve);
                        a(true);
                        B();
                        return;
                    }
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    com.bytedance.android.livesdk.ai.c a3 = c.b.a();
                    c.a aVar3 = c.a.BLOCK_USER;
                    DataChannel dataChannel2 = this.V;
                    if (dataChannel2 == null || !((Boolean) dataChannel2.b(cn.class)).booleanValue()) {
                        str = "voice_only";
                    }
                    a3.a(aVar3, str);
                    if (!e(2)) {
                        final com.bytedance.android.livesdk.chatroom.end.a aVar4 = new com.bytedance.android.livesdk.chatroom.end.a(getContext());
                        if (this.bk && isAdded() && !aVar4.isShowing()) {
                            aVar4.show();
                        }
                        this.Y.postDelayed(new Runnable() {
                            /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass5 */

                            static {
                                Covode.recordClassIndex(8864);
                            }

                            public final void run() {
                                if (aVar4.isShowing()) {
                                    aVar4.dismiss();
                                }
                                br brVar = br.this;
                                brVar.a(111, "watcher kit out", brVar.f15993c);
                                if (!com.bytedance.android.livesdk.chatroom.backroom.d.a.a() || br.this.at == null || !br.this.at.j()) {
                                    br.this.B();
                                }
                            }
                        }, 2500);
                        Event event2 = new Event("live_play_watch_kick_out", 33803, com.bytedance.android.livesdkapi.session.b.MessageReceived);
                        event2.a("watcher kick out.");
                        f.a.f23366a.a().a(event2);
                        com.ss.android.ugc.d.a.c.a(new com.bytedance.android.livesdkapi.g.j(this.f15993c));
                        DataChannel dataChannel3 = this.V;
                        if (dataChannel3 != null) {
                            dataChannel3.a(av.class, (Object) false);
                            return;
                        }
                        return;
                    }
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    a(true);
                    a(false);
                    a(112, "jump to other room", this.f15993c);
                    return;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                    if (!e(1)) {
                        a(117, "fetch finished", this.f15993c);
                        u();
                        g(true);
                        a(true);
                        this.r = p.LIVE_FINISHED;
                        return;
                    }
                    return;
                default:
                    a(119, "jump to other room", this.f15993c);
                    a(true);
                    return;
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final void a(EnterRoomConfig enterRoomConfig, Room room) {
        this.aj = enterRoomConfig;
        this.f15994d = room;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, String str, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 26 && com.bytedance.android.livesdk.ai.a.a()) {
            if (this.al == null) {
                this.al = new PictureInPictureParams.Builder();
            }
            ArrayList arrayList = new ArrayList();
            PendingIntent broadcast = PendingIntent.getBroadcast(getContext(), i4, new Intent("media_control").putExtra("control_type", i3), 67108864);
            DataChannel dataChannel = this.V;
            if (dataChannel != null && !((Boolean) dataChannel.b(ay.class)).booleanValue()) {
                arrayList.add(new RemoteAction(Icon.createWithResource(getContext(), i2), str, str, broadcast));
            }
            this.al.setActions(arrayList);
            if (getActivity() != null) {
                getActivity().setPictureInPictureParams(this.al.build());
            }
        }
    }

    public final void a(String str, long j2, long j3) {
        if (!this.aR) {
            this.aR = true;
            com.bytedance.android.livesdk.aj.h.a(str, j2, j3, this.v != null ? System.currentTimeMillis() - this.v.getStartTime() : -1, this.u != null ? System.currentTimeMillis() - this.u.f15236c : -1, com.bytedance.common.utility.collection.b.a(this.S) ? "" : com.bytedance.android.livesdk.util.a.a(this.S));
        }
    }

    public void onEvent(com.bytedance.android.livesdk.event.e eVar) {
        f.a.f23366a.a().a(new Event("live_play_on_jump_to_other_event", 1027, com.bytedance.android.livesdkapi.session.b.BussinessApiCall));
        com.bytedance.android.livesdk.ab.i.b();
        com.bytedance.android.livesdk.ab.i.a("ttlive_room", "received JumpToOtherRoomEvent");
        if (eVar.f17190d != null) {
            long j2 = eVar.f17190d.f23298b.u;
            if (j2 > 0) {
                com.bytedance.android.livesdk.ab.i.b();
                com.bytedance.android.livesdk.ab.i.a("ttlive_portal", "preparing jump bundle, portalId=" + j2 + " originatingRoomId=" + this.f15993c);
                eVar.f17190d.f23298b.v = this.f15993c;
            }
            if (!eVar.f17187a) {
                eVar.f17190d.f23299c.av = eVar.f17188b;
            } else {
                eVar.f17190d.f23299c.av = "jump_source_room_back";
            }
            eVar.f17190d.f23299c.aw = eVar.f17187a;
            if (!(A() == null || A().getOwner() == null)) {
                this.aj.f23299c.ay = A().getOwner().getAvatarThumb();
            }
            if (this.r == p.LIVE_STARTED) {
                ck ckVar = new ck(this, eVar);
                if (!this.J.a(ckVar)) {
                    ckVar.run();
                    return;
                }
                return;
            }
            a(a.JUMP_TO_OTHER);
            i.b bVar = this.at;
            if (bVar != null) {
                bVar.a(eVar.f17189c, eVar.f17190d, eVar.f17187a);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final void v() {
        this.aX = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final void x() {
        b(true);
    }

    private static boolean K() {
        if (Build.VERSION.SDK_INT > 19) {
            return true;
        }
        return false;
    }

    private void O() {
        com.bytedance.android.live.u.h.c(new cc(this));
    }

    private void R() {
        com.bytedance.android.d.b bVar;
        if (isViewValid() && (bVar = this.v) != null) {
            bVar.setMute(false);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final p g() {
        if (this.ae) {
            return p.DETACHED;
        }
        return this.r;
    }

    public final void p() {
        Dialog dialog = this.K;
        if (dialog != null && dialog.isShowing()) {
            this.K.dismiss();
        }
    }

    static {
        Covode.recordClassIndex(8850);
    }

    private boolean H() {
        boolean z2;
        boolean G2 = G();
        a aVar = this.J;
        if (aVar != null) {
            z2 = aVar.E;
        } else {
            z2 = false;
        }
        if (!G2 || !z2) {
            return false;
        }
        return true;
    }

    private void M() {
        com.bytedance.android.d.d logger;
        com.bytedance.android.d.b bVar = this.v;
        if (bVar != null && (logger = bVar.getLogger()) != null) {
            logger.a(this.bf);
        }
    }

    private boolean W() {
        EnterRoomConfig enterRoomConfig = this.aj;
        if (enterRoomConfig == null || !m.a(enterRoomConfig.f23299c.M, "draw") || !LiveDrawPreEnterRoom.INSTANCE.isEnable()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final Room A() {
        com.bytedance.android.livesdk.chatroom.end.newaudienceend.a aVar = this.aL;
        if (aVar == null || !aVar.isVisible()) {
            return this.f15994d;
        }
        return this.aL.f15465i;
    }

    public final com.bytedance.android.livesdkapi.depend.d.h C() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof ab) {
            return (com.bytedance.android.livesdkapi.depend.d.h) parentFragment;
        }
        return new h.a();
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final void e() {
        com.bytedance.android.livesdk.ab.i.b();
        com.bytedance.android.livesdk.ab.i.b("invite_issue_check", "LinkIn_Guest_stopWhenFullySlidingOut");
        if (this.aT) {
            c("reset player");
            com.bytedance.android.livesdk.chatroom.ui.a.a aVar = this.C;
            if (aVar != null) {
                aVar.a(8);
            }
        }
        f();
    }

    public final void s() {
        this.bh.setVisibility(8);
        this.ag.setVisibility(8);
        this.Y.removeMessages(37);
        com.bytedance.android.livesdkapi.c cVar = this.bg;
        if (cVar != null) {
            cVar.c();
        }
    }

    private boolean G() {
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1) {
            return false;
        }
        if (!TextUtils.isEmpty(this.aj.f23299c.f23322a) || (this.f15994d != null && this.aj.f23299c.M == "draw")) {
            return true;
        }
        return false;
    }

    private void J() {
        com.bytedance.android.livesdk.chatroom.detail.f fVar = this.u;
        if (fVar != null) {
            fVar.b();
            this.u = null;
            com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "resetEnterRoom -> roomId=" + this.f15993c + ", userId=" + this.f15995e);
        }
    }

    private void N() {
        a aVar = this.J;
        if (aVar != null) {
            aVar.i();
            if (!this.mStatusDestroyed) {
                try {
                    getChildFragmentManager().a().a(this.J).e();
                } catch (Throwable unused) {
                }
            }
            d dVar = this.an;
            if (dVar != null) {
                dVar.b();
            }
            this.an = null;
            this.J = null;
        }
    }

    private boolean P() {
        Room room;
        com.bytedance.android.live.j.a aVar = (com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class);
        if (aVar == null || !aVar.isMicRoomForCurrentRoom() || !aVar.isMicAudience() || (room = (Room) this.V.b(df.class)) == null || room.officialChannelInfo == null) {
            return false;
        }
        aVar.jumpRoom(room.officialChannelInfo.f18985h, true);
        return true;
    }

    private void S() {
        com.bytedance.android.livesdk.ab.c.h hVar = (com.bytedance.android.livesdk.ab.c.h) this.V.b(com.bytedance.android.livesdk.ab.c.i.class);
        com.bytedance.android.livesdk.ab.c.m mVar = (com.bytedance.android.livesdk.ab.c.m) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.ab.c.n.class);
        if (hVar != null) {
            hVar.f13531f = mVar;
        }
        DataChannelGlobal.f34575d.a(com.bytedance.android.livesdk.ab.c.j.class, hVar);
        com.bytedance.android.livesdk.performance.g.b();
    }

    private void V() {
        androidx.fragment.app.e activity;
        if (this.aw == null && (activity = getActivity()) != null) {
            com.bytedance.android.livesdk.ai.g gVar = new com.bytedance.android.livesdk.ai.g();
            this.aw = gVar;
            gVar.f13780i = activity;
            this.aw.f13781j = this.f15995e;
            this.aw.f13772a = this.af;
            this.aw.show(getActivity().getSupportFragmentManager(), "PipVideoViewContainDialog");
        }
    }

    public final void B() {
        DataChannel dataChannel = this.V;
        if (dataChannel == null || !((Boolean) dataChannel.b(cn.class)).booleanValue()) {
            if (C().d() != null) {
                C().d().a();
            }
        } else if (getActivity() != null && Build.VERSION.SDK_INT >= 21) {
            getActivity().finishAndRemoveTask();
        }
    }

    public final HashMap<String, String> E() {
        DataChannel dataChannel = this.V;
        if (dataChannel == null) {
            return new HashMap<>();
        }
        HashMap<String, String> hashMap = (HashMap) dataChannel.b(t.class);
        if (hashMap != null) {
            return hashMap;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        this.V.a(t.class, hashMap2);
        return hashMap2;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final void d() {
        com.bytedance.android.livesdk.ab.i.b();
        com.bytedance.android.livesdk.ab.i.b("invite_issue_check", "LinkIn_Guest_stopWhenSliding");
        f();
        if (LiveUseSurfaceViewExperiment.INSTANCE.isEnable()) {
            com.bytedance.android.livesdkapi.c cVar = this.bg;
            if (cVar != null) {
                cVar.d();
            }
            c("reset player");
            this.C.a(8);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.a.b.AbstractC0329b
    public final void l() {
        View view;
        d(8);
        if (Build.VERSION.SDK_INT >= 23 && (view = this.ac) != null) {
            view.findViewById(R.id.ffl).setForeground(null);
        }
        ViewGroup viewGroup = this.D;
        if (viewGroup != null) {
            viewGroup.setBackground(null);
        }
    }

    public final void o() {
        if (com.bytedance.android.livesdk.utils.a.a(this.V)) {
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(this.f15993c));
            hashMap.put("anchor_id", String.valueOf(this.f15995e));
            com.bytedance.android.livesdk.utils.a.a("live_ad", "live_play", null, hashMap);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        if (f15991a.booleanValue()) {
            com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "onStart -> roomId=" + this.f15993c + ", userId=" + this.f15995e);
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (f15991a.booleanValue()) {
            com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "onStop -> roomId=" + this.f15993c + ", userId=" + this.f15995e);
        }
        super.onStop();
        this.au = true;
    }

    public final void t() {
        if (u.a().b().e() && this.f15993c != 0) {
            J();
            long j2 = this.f15993c;
            a(j2, b(j2));
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final void z() {
        com.bytedance.android.livesdk.ab.i.b();
        com.bytedance.android.livesdk.ab.i.b("invite_issue_check", "LinkIn_Guest_releasePlayerForNextRoomPrePullStream");
        f();
        com.bytedance.android.d.b bVar = this.v;
        if (bVar == null) {
            if (this.af != null && !this.bb) {
                ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).recycleRoomPlayer(this.af);
            }
            this.af = null;
            return;
        }
        bVar.stop(true);
        this.v.recycle();
        this.v = null;
        this.af = null;
    }

    private void I() {
        Room room;
        if (this.aI != null && (room = this.f15994d) != null && this.aJ != null) {
            if (room.getCover() != null || (this.f15994d.getOwner() != null && this.f15994d.getOwner().getAvatarMedium() != null)) {
                n.a(getContext());
                n.b(getContext());
                this.aJ.setVisibility(0);
                this.aI.setBackgroundColor(Color.parseColor("#000000"));
            }
        }
    }

    private void Q() {
        com.bytedance.android.livesdk.chatroom.detail.f fVar;
        if (u.a().b().e() && (fVar = this.u) != null && fVar.f15239f != null && this.u.f15239f.f15757a != null && this.u.f15239f.f15757a.getOwner() != null && this.u.f15239f.f15757a.getOwner().isFollowing()) {
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.m.a());
        }
    }

    private void U() {
        EnterRoomConfig enterRoomConfig;
        if (!(this.s == null || (enterRoomConfig = this.aj) == null || !enterRoomConfig.f23299c.o)) {
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(this.f15993c));
            hashMap.put("anchor_id", String.valueOf(this.f15995e));
            hashMap.put("duration", String.valueOf(this.s.c()));
            com.bytedance.android.livesdk.utils.a.a("live_ad", "exit", null, hashMap);
        }
        com.bytedance.android.livesdk.utils.a.a(this.V, this.aj);
    }

    public final boolean F() {
        boolean z2;
        boolean z3;
        boolean z4;
        if (!LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            if (!com.bytedance.android.livesdk.chatroom.g.k.a(this.V) || !LiveMtFeedDrawerShowMoreLiveSetting.INSTANCE.getValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!com.bytedance.android.livesdk.chatroom.g.k.b(this.V) || !LiveMtForyouEntranceShowMoreLiveSetting.INSTANCE.getValue()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!com.bytedance.android.livesdk.chatroom.g.k.c(this.V) || !LiveMtFeedDrawerShowMoreLiveSetting.INSTANCE.getValue()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z2 || z3 || z4) {
                return true;
            }
            return false;
        } else if (!Boolean.valueOf(this.aj.f23299c.az).booleanValue() || LiveDrawerSettings.INSTANCE.getValue().getEnableDrawerRepeatJump()) {
            return true;
        } else {
            return false;
        }
    }

    public final void b() {
        Fragment parentFragment;
        if (this.V != null) {
            if (com.bytedance.android.livesdkapi.depend.model.live.f.f23137c == null) {
                com.bytedance.android.livesdkapi.depend.model.live.f.f23137c = Boolean.valueOf(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isOffline());
            }
            if (com.bytedance.android.livesdkapi.depend.model.live.f.f23137c.booleanValue() && (parentFragment = getParentFragment()) != null && (parentFragment instanceof ab)) {
                this.V.a(com.bytedance.android.livesdk.e.class, ((ab) parentFragment).o());
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final void c() {
        com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "stopRoom -> roomId=" + this.f15993c + ", userId=" + this.f15995e);
        this.Y.removeCallbacksAndMessages(null);
        a(true);
        com.bytedance.android.livesdk.ab.i.b();
        com.bytedance.android.livesdk.ab.i.b("invite_issue_check", "LinkIn_Guest_stopRoom");
        ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).handleLiveRoomStopped();
        com.bytedance.android.livesdk.b.a.d.a().b();
        g.a.f14199a.a();
        com.bytedance.android.live.liveinteract.api.a.c.a().c();
        ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).release(this.f15993c);
        b.a.a("stopRoom");
        this.aD.a(false);
    }

    @Override // com.bytedance.android.livesdkapi.depend.a.a, com.bytedance.android.livesdkapi.depend.d.i
    public final boolean i_() {
        List<Fragment> f2 = getChildFragmentManager().f();
        boolean z2 = true;
        if (f2 == null || f2.size() <= 0) {
            if (this.r != p.LIVE_FINISHED) {
                z2 = false;
            }
            g(z2);
        } else {
            for (Fragment fragment : f2) {
                if ((fragment instanceof com.bytedance.android.livesdkapi.depend.a.a) && ((com.bytedance.android.livesdkapi.depend.a.a) fragment).i_()) {
                    return true;
                }
            }
            if (this.J == null && com.bytedance.android.livesdk.chatroom.backroom.d.a.c()) {
                b(8);
            }
        }
        return false;
    }

    public final void m() {
        if (this.v != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.C.b();
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.gravity = 17;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = 0;
            layoutParams.topMargin = 0;
            this.C.a(layoutParams);
            int[] iArr = new int[2];
            this.v.getVideoSize(iArr);
            if (iArr[0] != 0 && iArr[1] != 0) {
                a(iArr[0], iArr[1], n.a(getContext()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.br$9  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass9 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16030a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f16031b;

        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00ba */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00c4 */
        static {
            /*
            // Method dump skipped, instructions count: 207
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass9.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public enum a {
        ENTER_FAILED,
        FETCH_FAILED,
        ROOM_FETCH_FINISHED,
        EMPTY_URL,
        ROOM_PLAY_FINISHED,
        PING_KICK_OUT,
        USER_CLOSE,
        USER_KICK_OUT,
        WATCHER_KIT_OUT,
        JUMP_TO_OTHER,
        PLAYER_ERROR,
        ENTER_LIVE_END,
        MIC_ROOM_END;

        static {
            Covode.recordClassIndex(8869);
        }
    }

    public br() {
        boolean z2;
        if (!EnableSlideEnterRoomOptSetting.INSTANCE.getValue() || !EnableSlideVideoLastFrameSetting.INSTANCE.getValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.aT = z2;
        this.aU = EnableSlideEnterRoomOptSetting.INSTANCE.getValue();
        this.aV = LiveEnterDelayShowLoadingTimeSetting.INSTANCE.getValue();
        this.aW = LiveClickEnterDelayShowLoadingTimeSetting.INSTANCE.getValue();
        this.aX = 0;
        this.aY = 0;
        this.bb = LiveMultiPlayerEnableSetting.INSTANCE.getValue();
        this.Y = new Handler(Looper.getMainLooper()) {
            /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8851);
            }

            public final void handleMessage(Message message) {
                String str;
                Boolean bool;
                super.handleMessage(message);
                int i2 = message.what;
                if (i2 == 28) {
                    br.this.b();
                    br brVar = br.this;
                    Room room = (Room) message.obj;
                    com.bytedance.android.live.core.performance.b.b(b.a.ShowCInteractionFirstWidget);
                    if (room == null) {
                        str = "other";
                    } else if (room.isScreenshot) {
                        str = "game";
                    } else if (room.isThirdParty) {
                        str = "thirdparty";
                    } else if (room.isLiveTypeAudio()) {
                        str = DataType.AUDIO;
                    } else {
                        str = "video";
                    }
                    brVar.N = str;
                    if (brVar.r == p.PREPARED) {
                        brVar.r = p.LIVE_STARTED;
                        brVar.w = false;
                        brVar.Y.removeMessages(28);
                        DataChannelGlobal.f34575d.a(ac.class, room);
                        com.bytedance.android.livesdk.ab.i.b();
                        com.bytedance.android.livesdk.ab.i.b("invite_issue_check", "LinkIn_Guest_startInteraction");
                        com.bytedance.android.livesdk.b.a.d.a().b();
                        com.bytedance.android.live.liveinteract.api.a.c.a().c();
                        brVar.t = new com.bytedance.android.livesdk.chatroom.detail.i(room.getId(), room.getStreamId(), room.getLabels(), new i.a() {
                            /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(8861);
                            }

                            @Override // com.bytedance.android.livesdk.chatroom.detail.i.a
                            public final void c() {
                                br.this.t();
                            }

                            @Override // com.bytedance.android.livesdk.chatroom.detail.i.a
                            public final void b() {
                                Event event = new Event("live_play_end_room_fetch_fail", 33796, com.bytedance.android.livesdkapi.session.b.ServerApiCall);
                                event.a("ping/audience, room finish");
                                f.a.f23366a.a().a(event);
                                br.this.a(a.ROOM_PLAY_FINISHED);
                            }

                            @Override // com.bytedance.android.livesdk.chatroom.detail.i.a
                            public final boolean a() {
                                if (br.this.v == null) {
                                    return true;
                                }
                                com.bytedance.android.live.core.c.a.a(3, "LivePlayFragment", "send play ping room. id:" + br.this.f15993c + ",mActivityPause:" + (!br.this.isResumed()) + ",mAudioLostFocusTime:" + br.this.v.getAudioLostFocusTime());
                                if (br.this.isResumed() || br.this.v.getAudioLostFocusTime() == -1 || System.currentTimeMillis() - br.this.v.getAudioLostFocusTime() <= 10000) {
                                    return true;
                                }
                                br.this.q();
                                br brVar = br.this;
                                brVar.a(120, "isn't resumed and lost audio", brVar.f15993c);
                                br.this.b(true);
                                br.this.x = true;
                                return false;
                            }

                            @Override // com.bytedance.android.livesdk.chatroom.detail.i.a
                            public final void a(long j2) {
                                br.this.a(127, "audience/ping callback illegal + mosaicStatus: ".concat(String.valueOf(j2)), br.this.f15993c);
                            }

                            @Override // com.bytedance.android.livesdk.chatroom.detail.i.a
                            public final void a(int i2) {
                                if (30004 == i2) {
                                    Event event = new Event("live_play_ping_controller_fail", 33795, com.bytedance.android.livesdkapi.session.b.ServerApiCall);
                                    event.a("ping kick out");
                                    f.a.f23366a.a().a(event);
                                    br.this.a(a.PING_KICK_OUT);
                                    return;
                                }
                                Event event2 = new Event("live_play_ping_controller_fail", 33794, com.bytedance.android.livesdkapi.session.b.ServerApiCall);
                                event2.a("ping/audience return error.");
                                f.a.f23366a.a().a(event2);
                                br.this.a(a.ROOM_PLAY_FINISHED);
                            }
                        });
                        com.bytedance.android.livesdk.chatroom.detail.i iVar = brVar.t;
                        if (!iVar.f15261a) {
                            iVar.f15261a = true;
                            iVar.b();
                        }
                        brVar.b(room, false);
                        if (room.isLiveTypeAudio()) {
                            brVar.G.setVisibility(0);
                            brVar.I.setVisibility(0);
                            k.a(brVar.G, room.getOwner().getAvatarLarge(), new z(5, (float) (n.a(brVar.getContext()) / n.b(brVar.getContext()))));
                        }
                        if (room.getMosaicStatus() != 0) {
                            bv bvVar = new bv();
                            bvVar.f19368f = 2;
                            bvVar.f19367a = brVar.getString(R.string.gsl);
                            brVar.a(bvVar);
                        }
                        if (br.f15991a.booleanValue()) {
                            com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "startInteraction -> roomId=" + brVar.f15993c + ", userId=" + brVar.f15995e);
                        }
                        if (brVar.an != null) {
                            d dVar = brVar.an;
                            boolean z = brVar.ah;
                            boolean z2 = brVar.ai;
                            dVar.f22599b = z;
                            dVar.f22598a = z2;
                            Handler handler = dVar.f22604g;
                            if (handler != null) {
                                handler.post(dVar.f22600c);
                            }
                            if (dVar.f22598a) {
                                Handler handler2 = dVar.f22604g;
                                if (handler2 != null) {
                                    handler2.post(dVar.f22601d);
                                    return;
                                }
                                return;
                            }
                            Handler handler3 = dVar.f22604g;
                            if (handler3 != null) {
                                handler3.postDelayed(dVar.f22601d, dVar.f22602e);
                            }
                        }
                    }
                } else if (i2 != 41) {
                    if (i2 == 37) {
                        br.this.r();
                    } else if (i2 == 38 && message.obj != null && (message.obj instanceof DebugToolState)) {
                        com.bytedance.android.livesdkapi.depend.model.live.f.f23135a = ((DebugToolState) message.obj).getCanDebugTool();
                        br.this.b();
                        br brVar2 = br.this;
                        if (brVar2.J != null && com.bytedance.android.livesdkapi.depend.model.live.f.f23137c.booleanValue() && (bool = com.bytedance.android.livesdkapi.depend.model.live.f.f23135a) != null && bool.booleanValue() && (brVar2.J instanceof dd)) {
                            ((dd) brVar2.J).G();
                        }
                    }
                } else if (br.this.F()) {
                    androidx.fragment.app.e activity = br.this.getActivity();
                    DataChannel dataChannel = br.this.V;
                    if (activity != null) {
                        if ((activity instanceof com.bytedance.android.livesdk.q) && !activity.isFinishing()) {
                            ((com.bytedance.android.livesdk.q) activity).b();
                        }
                        com.bytedance.android.livesdk.q qVar = (com.bytedance.android.livesdk.q) activity;
                        if (qVar.a() != null) {
                            qVar.a().a(dataChannel);
                        }
                    }
                }
            }
        };
        this.bc = false;
        this.ad = true;
        this.be = new ArrayList();
        this.ah = false;
        this.ai = false;
        this.bl = new f.a.b.a();
        this.bn = "";
        this.ar = new com.bytedance.android.livesdk.gift.e.b() {
            /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass10 */

            static {
                Covode.recordClassIndex(8852);
            }

            @Override // com.bytedance.android.livesdk.gift.e.b
            public final void a(List<com.bytedance.android.livesdk.model.u> list) {
            }

            @Override // com.bytedance.android.livesdk.gift.e.b
            public final void b(List<GiftPage> list) {
                br.this.ak = f.a.t.a(new cv(list)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).g();
            }
        };
        this.bo = new b.a() {
            /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass11 */

            /* renamed from: a  reason: collision with root package name */
            final int f16006a = LivePlayerErrorCountSetting.INSTANCE.getValue();

            /* renamed from: b  reason: collision with root package name */
            List<b> f16007b = new ArrayList();

            /* renamed from: d  reason: collision with root package name */
            private int f16009d;

            /* renamed from: e  reason: collision with root package name */
            private final long f16010e = 0;

            /* renamed from: f  reason: collision with root package name */
            private final Queue<Long> f16011f = new LinkedList();

            static {
                Covode.recordClassIndex(8853);
            }

            @Override // com.bytedance.android.d.b.a
            public final void o() {
                br.this.r();
            }

            @Override // com.bytedance.android.d.b.a
            public final void k() {
                if (!br.this.w && br.this.C.f15846a.getVisibility() == 0) {
                    br.this.r();
                }
            }

            @Override // com.bytedance.android.d.b.a
            public final void n() {
                com.bytedance.android.livesdk.ab.i.b();
                com.bytedance.android.livesdk.ab.i.b("invite_issue_check", "LinkIn_Guest_onPlayerDetached");
                HashMap hashMap = new HashMap();
                hashMap.put("event_name", "liveplay_player_detached");
                com.bytedance.android.livesdk.ab.i.b().b("ttlive_pullstream", hashMap);
                br.this.f();
                br.this.ae = true;
                long j2 = br.this.f15993c;
                String str = br.this.N;
                String str2 = br.this.f15997g;
                JSONObject jSONObject = new JSONObject();
                l.a(jSONObject, "room_type", str);
                l.a(jSONObject, "error_code", 0L);
                l.a(jSONObject, "error_msg", "player detach");
                l.a(jSONObject, "room_id", j2);
                l.a(jSONObject, "pull_url", str2);
                Pair<String, String> b2 = l.b();
                l.a(jSONObject, "enter_from_merge", (String) b2.first);
                l.a(jSONObject, "enter_method", (String) b2.second);
                com.bytedance.android.live.core.d.c.b("ttlive_player_detach_when_pulling", 0, jSONObject);
            }

            @Override // com.bytedance.android.d.b.a
            public final void m() {
                boolean z;
                boolean z2 = true;
                if (!ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable()) {
                    return;
                }
                if (br.this.f15998h == com.bytedance.android.livesdkapi.depend.model.live.i.THIRD_PARTY || br.this.f15998h == com.bytedance.android.livesdkapi.depend.model.live.i.SCREEN_RECORD) {
                    Map<String, String> a2 = com.bytedance.android.livesdk.ap.a.cQ.a();
                    if (a2 == null || a2.size() <= 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (System.currentTimeMillis() - SwitchDefinitionTipsWidget.f16622e <= 10000) {
                        z2 = false;
                    }
                    boolean isAudienceLowestDefinition = ((com.bytedance.android.live.d.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.d.b.class)).isAudienceLowestDefinition();
                    com.bytedance.android.live.core.c.a.a(4, "LivePlayFragment", "onBufferingStart(). hadManuallySelect=" + z + "; hadBeyond10Sec=" + z2 + "; isLowestDefinition=" + isAudienceLowestDefinition);
                    if (br.this.V != null && z && z2 && !isAudienceLowestDefinition) {
                        br.this.V.c(com.bytedance.android.livesdk.j.k.class);
                    }
                }
            }

            @Override // com.bytedance.android.d.b.a
            public final void l() {
                String str;
                boolean z;
                if (!br.this.ai) {
                    f.a.f23366a.a().a(new Event("first_frame", 33792, com.bytedance.android.livesdkapi.session.b.SdkCallback).a("first_frame"));
                }
                br.this.ai = true;
                com.bytedance.android.livesdk.chatroom.d.d a2 = com.bytedance.android.livesdk.chatroom.d.d.a();
                if (a2.f15203a && a2.f15206d == null) {
                    a2.f15206d = f.a.t.b((long) LiveMtRoomSlideUpGuideSetting.INSTANCE.getValue().getPlayTimes(), TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new com.bytedance.android.livesdk.chatroom.d.e(a2));
                }
                com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", " first frame received !!!!");
                br.this.Z.put("time", String.valueOf(System.currentTimeMillis() - br.this.aa));
                br.this.Z.put("location", " after onPlayDisplayed");
                ((com.bytedance.android.livesdkapi.host.g) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.g.class)).a("feed_enter_room", br.this.Z);
                if (br.this.s != null) {
                    com.bytedance.android.livesdk.chatroom.detail.j jVar = br.this.s;
                    if (!jVar.f15280k) {
                        jVar.f15280k = true;
                        jVar.q = SystemClock.elapsedRealtime() - jVar.n;
                    }
                    com.bytedance.android.livesdk.chatroom.detail.j jVar2 = br.this.s;
                    if (!jVar2.p) {
                        jVar2.p = true;
                        jVar2.o = SystemClock.elapsedRealtime();
                        b.a.a("live_stream_load_success").a(jVar2.B).b("live_view").c("core").d("live_detail").e("live").a(b.a.a().e()).b();
                    }
                    br.this.s.a(true, false, br.this.aj.f23299c.ab, br.this.f15994d);
                }
                int[] iArr = new int[2];
                if (br.this.v != null) {
                    br.this.v.getVideoSize(iArr);
                    br.this.v.changeSRSupportScene(true);
                }
                if (!(iArr[0] == 0 || iArr[1] == 0)) {
                    br brVar = br.this;
                    brVar.a(iArr[0], iArr[1], n.a(brVar.getContext()));
                    if (br.this.J != null) {
                        br.this.V.b(ad.class, new an(br.this.f16003m, br.this.p));
                    }
                }
                br.this.s();
                br brVar2 = br.this;
                if (brVar2.D != null) {
                    brVar2.D.post(co.f16073a);
                }
                if (!br.this.y) {
                    if (br.this.f15998h != com.bytedance.android.livesdkapi.depend.model.live.i.AUDIO) {
                        br.this.a("first frame");
                    }
                    if (br.this.s != null) {
                        com.bytedance.android.livesdk.chatroom.detail.j jVar3 = br.this.s;
                        HashMap hashMap = new HashMap();
                        long j2 = jVar3.f15278i.f23298b.w;
                        if (j2 > 0) {
                            jVar3.f15278i.f23298b.w = 0;
                            hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - j2));
                            hashMap.put("request_page", com.bytedance.android.livesdk.chatroom.d.a().e());
                            if (!m.a(com.bytedance.android.livesdk.chatroom.d.a().e())) {
                                hashMap.put("enter_live_method", com.bytedance.android.livesdk.chatroom.d.a().e());
                            }
                            b.a.a("livesdk_toplive_enter_room_duration").a((Map<String, String>) hashMap).a(jVar3.B).b();
                            b.a.a("livesdk_live_stream_load_duration").a((Map<String, String>) hashMap).a(jVar3.B).b();
                            if (jVar3.F > 0) {
                                hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - jVar3.F));
                                b.a.a("livesdk_new_style_pull_stream_duration").a((Map<String, String>) hashMap).a(jVar3.B).b();
                            }
                        }
                    }
                } else {
                    br.this.a(true, "first frame but in illegal status");
                    if (br.this.v != null) {
                        br.this.v.setMute(true);
                    }
                }
                if (br.this.ao) {
                    br.this.j();
                }
                if (br.this.z) {
                    br.this.z = false;
                    ao.a(com.bytedance.android.live.core.f.y.e(), br.this.getString(R.string.gv0), 0);
                }
                if (br.this.C().e() != null) {
                    br.this.C().e();
                }
                this.f16009d = 0;
                if (!(br.this.v == null || br.this.v.getLogger() == null || !TestDisablePullStreamInfoSetting.INSTANCE.getValue())) {
                    br.this.V.c(dv.class, br.this.v.getLogger());
                }
                if (br.this.an != null) {
                    d dVar = br.this.an;
                    dVar.f22598a = br.this.ai;
                    if (dVar.f22599b) {
                        Handler handler = dVar.f22604g;
                        if (handler != null) {
                            handler.removeCallbacks(dVar.f22601d);
                        }
                        Handler handler2 = dVar.f22604g;
                        if (handler2 != null) {
                            handler2.post(dVar.f22601d);
                        }
                    }
                }
                br.this.V.c(com.bytedance.android.livesdk.j.an.class, true);
                br brVar3 = br.this;
                if (brVar3.b(brVar3.f15994d)) {
                    br.this.v.stop(false);
                    br brVar4 = br.this;
                    brVar4.a(brVar4.f15994d);
                }
                br brVar5 = br.this;
                Map map = (Map) brVar5.V.b(com.bytedance.android.livesdk.j.g.class);
                com.bytedance.android.live.i.a.d dVar2 = (com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
                if (dVar2 != null) {
                    com.bytedance.android.live.n.k b2 = dVar2.getLivePlayControllerManager().b(brVar5.af);
                    StringBuilder append = new StringBuilder("markAudienceDefinitionInfo(). tag=").append(brVar5.af).append(", livePlayController=");
                    if (b2 == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    com.bytedance.android.live.core.c.a.a(4, "LivePlayFragment", append.append(z).toString());
                    if (b2 != null) {
                        str = b2.g();
                        com.bytedance.android.live.core.c.a.a(4, "LivePlayFragment", "markAudienceDefinitionInfo(). tag=" + brVar5.af + ", currentSdkKey=" + str);
                        if (map != null || !str.equals(map.get("sdk_key"))) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("sdk_key", str);
                            hashMap2.put("start_time", String.valueOf(System.currentTimeMillis()));
                            brVar5.V.b(com.bytedance.android.livesdk.j.g.class, hashMap2);
                        }
                        return;
                    }
                }
                str = "";
                if (map != null) {
                }
                HashMap hashMap22 = new HashMap();
                hashMap22.put("sdk_key", str);
                hashMap22.put("start_time", String.valueOf(System.currentTimeMillis()));
                brVar5.V.b(com.bytedance.android.livesdk.j.g.class, hashMap22);
            }

            @Override // com.bytedance.android.d.b.a
            public final void a(String str) {
                com.bytedance.android.live.core.c.a.a(4, "LivePlayFragment", "onResolutionDegrade. newResolution=".concat(String.valueOf(str)));
                br.this.V.b(com.bytedance.android.livesdk.j.h.class, str);
            }

            @Override // com.bytedance.android.d.b.a
            public final void a(Object obj) {
                boolean z;
                if (br.this.J != null && (br.this.J instanceof dd) && (obj instanceof String)) {
                    boolean z2 = true;
                    if (!com.bytedance.android.livesdk.b.a.d.a().n.booleanValue() || 2 == com.bytedance.android.live.liveinteract.api.a.c.a().n.intValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!LiveAnchorLinkmicSpeedUpSeiSetting.INSTANCE.getValue() && !b.a.a().f9936a) {
                        z2 = false;
                    }
                    if (z || z2) {
                        dd ddVar = (dd) br.this.J;
                        String str = (String) obj;
                        if (ddVar.H != null) {
                            ddVar.H.a(str);
                        }
                    }
                }
            }

            @Override // com.bytedance.android.d.b.a
            public final void a(Exception exc) {
                br.this.ab.a(105, Log.getStackTraceString(exc).substring(0, 200), br.this.f15993c, br.this.N, br.this.f15997g);
                br.this.a("onError, " + exc.getMessage(), 204, -1);
                br brVar = br.this;
                brVar.a(105, "ttplayer init failed", brVar.f15993c);
                br.this.b("pull_stream_error");
                br.this.a(a.PLAYER_ERROR);
                Event event = new Event("live_play_enter_room_fail", 33793, com.bytedance.android.livesdkapi.session.b.SdkInterfaceCall);
                event.a("player error, there is some problem while starting player.");
                f.a.f23366a.a().a(event);
                com.bytedance.android.live.core.performance.b.a(b.a.StartLivePlay, com.bytedance.android.live.core.performance.b.a("error", "ttplayer init failed"));
                com.bytedance.android.live.core.performance.b.a(b.a.ScrollWatchLivePlay, com.bytedance.android.live.core.performance.b.a("error", "ttplayer init failed"));
                this.f16009d = 0;
            }

            @Override // com.bytedance.android.d.b.a
            public final void a(int i2, int i3) {
                boolean z;
                com.bytedance.android.live.core.c.a.a(3, "RenderView", "onVideoSizeChanged, width" + i2 + "height" + i3);
                br brVar = br.this;
                if (i2 > i3) {
                    z = true;
                } else {
                    z = false;
                }
                brVar.f16003m = z;
                if (br.this.f16003m || br.this.n != 0) {
                    if (!(i2 == 0 || i3 == 0)) {
                        br brVar2 = br.this;
                        brVar2.a(i2, i3, n.a(brVar2.getContext()));
                    }
                    if (br.this.J != null) {
                        br.this.V.b(ad.class, new an(br.this.f16003m, br.this.p));
                    }
                } else if (br.this.J != null) {
                    br.this.onEvent(new com.bytedance.android.livesdkapi.f.a(1));
                } else {
                    br.this.getActivity().setRequestedOrientation(1);
                    br.this.n = 1;
                    br.this.v.setScreenOrientation(true);
                }
                boolean z2 = br.this.f16003m;
                long j2 = br.this.f15993c;
                JSONObject jSONObject = new JSONObject();
                l.a(jSONObject, "exit_code", 0L);
                l.a(jSONObject, "exit_msg", "is horizontal? :".concat(String.valueOf(z2)));
                l.a(jSONObject, "room_id", j2);
                com.bytedance.android.live.core.d.c.a("ttlive_audience_room_status_changed", 3, jSONObject);
            }

            @Override // com.bytedance.android.d.b.a
            public final void a(int i2, String str) {
                Map map = (Map) e.a.f9629c.a(str, new com.google.gson.b.a<Map<String, String>>() {
                    /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass11.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(8854);
                    }
                }.type);
                if (map.containsKey("error_code")) {
                    String str2 = (String) map.get("error_code");
                    if (str2 != null) {
                        l lVar = br.this.ab;
                        int intValue = Integer.valueOf(str2).intValue();
                        long j2 = br.this.f15993c;
                        String str3 = br.this.N;
                        String str4 = br.this.f15997g;
                        if (lVar.f13860c != 1) {
                            if (lVar.f13860c == 2) {
                                lVar.a(intValue, str, j2, str3, str4);
                            } else if (lVar.f13861d == null) {
                                lVar.f13861d = new com.bytedance.android.livesdk.aj.t(intValue, str, j2, str3, str4);
                            }
                        }
                        com.bytedance.android.livesdk.aj.h.a("onPlayerError, ".concat(String.valueOf(str)), 209, (long) Integer.valueOf(str2).intValue(), 0, 0, "");
                        br.this.S.add(str2);
                    }
                    this.f16007b.add(new b(i2, str));
                }
                int i3 = this.f16009d + 1;
                this.f16009d = i3;
                if (i3 > this.f16006a) {
                    Event event = new Event("live_play_enter_room_fail", 33809, com.bytedance.android.livesdkapi.session.b.SdkInterfaceCall);
                    event.a(com.bytedance.android.livesdk.util.a.a(this.f16007b));
                    this.f16009d = 0;
                    this.f16007b = new ArrayList();
                    f.a.f23366a.a().a(event);
                }
            }
        };
    }

    private void L() {
        if (!this.ai && this.C != null && !this.bi && this.aQ && LiveUseSurfaceViewExperiment.INSTANCE.isEnable() && !m.a(this.ay)) {
            StreamData streamData = (StreamData) e.a.f9629c.a(this.aj.f23297a.f23340d, StreamData.class);
            if (!m.a(streamData.getStreamDataOriginMain())) {
                StreamData.StreamDataOriginMainSDKParams streamDataOriginMainSDKParams = (StreamData.StreamDataOriginMainSDKParams) e.a.f9629c.a(streamData.getStreamDataOriginMain(), StreamData.StreamDataOriginMainSDKParams.class);
                com.bytedance.android.livesdk.chatroom.g.d.b("RenderView", "pre adjust:width: " + streamDataOriginMainSDKParams.getWidth() + ",height: " + streamDataOriginMainSDKParams.getHeight() + ",");
                if (this.aj.f23299c.aq) {
                    a(streamDataOriginMainSDKParams.getHeight(), streamDataOriginMainSDKParams.getWidth(), n.a(getContext()));
                    ((com.bytedance.android.livesdkapi.view.e) this.C.f15846a).a(streamDataOriginMainSDKParams.getHeight(), streamDataOriginMainSDKParams.getWidth());
                    return;
                }
                a(streamDataOriginMainSDKParams.getWidth(), streamDataOriginMainSDKParams.getHeight(), n.a(getContext()));
                ((com.bytedance.android.livesdkapi.view.e) this.C.f15846a).a(streamDataOriginMainSDKParams.getWidth(), streamDataOriginMainSDKParams.getHeight());
            }
        }
    }

    private void T() {
        String str;
        if (this.ba > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.ba;
            long j2 = this.T;
            this.T = 0;
            this.ba = 0;
            if (j2 > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("duration_room", String.valueOf(currentTimeMillis));
                hashMap.put("duration_gift_effect", String.valueOf(j2));
                double d2 = (double) j2;
                Double.isNaN(d2);
                double d3 = (double) currentTimeMillis;
                Double.isNaN(d3);
                hashMap.put("gift_effect_live_ratio", String.valueOf((d2 * 1.0d) / d3));
                if (((Boolean) this.V.b(ee.class)).booleanValue()) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put("is_anchor", str);
                hashMap.put("room_type", LivePerformanceManager.getInstance().getRoomType(this.f15998h));
                b.a.a("livesdk_gift_effect_show_summary").a((Map<String, String>) hashMap).a(this.V).b();
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final void f() {
        com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "<!!!> stopRoomWithoutReleasePlayer -> roomId=" + this.f15993c + ", userId=" + this.f15995e);
        this.bl.a();
        this.aG = false;
        this.Y.removeCallbacksAndMessages(null);
        a(115, "change page", this.f15993c);
        a(false);
        com.bytedance.android.livesdk.ab.i.b();
        com.bytedance.android.livesdk.ab.i.b("invite_issue_check", "LinkIn_Guest_stopRoomWithoutReleasePlayer");
        com.bytedance.android.livesdk.b.a.d.a().b();
        com.bytedance.android.live.liveinteract.api.a.c.a().c();
        this.aD.a(false);
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onDestroy() {
        com.bytedance.android.livesdk.ab.i.b();
        com.bytedance.android.livesdk.ab.i.b("invite_issue_check", "LinkIn_Guest_onDestroy");
        if (f15991a.booleanValue()) {
            com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "onDestroy -> roomId=" + this.f15993c + ", userId=" + this.f15995e);
        }
        super.onDestroy();
        ValueAnimator valueAnimator = this.aZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        com.bytedance.android.livesdk.ai.g gVar = this.aw;
        if (gVar != null) {
            gVar.dismissAllowingStateLoss();
        }
        c();
        ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).getHybridDialogManager().a();
        com.bytedance.android.livesdk.chatroom.detail.j jVar = this.s;
        if (jVar != null) {
            jVar.a();
        }
        if (LiveDrawerVersion.INSTANCE.getValue()) {
            com.bytedance.android.livesdk.drawerfeed.f.a(getActivity(), false, null, null);
        }
        this.aM = null;
        q qVar = this.aE;
        if (qVar != null) {
            qVar.b();
            this.aE = null;
        }
        this.f15993c = 0;
        this.f15995e = 0;
        this.f15996f = null;
        this.f15997g = null;
        this.ax = null;
        this.ay = null;
        this.az = null;
        this.f15998h = com.bytedance.android.livesdkapi.depend.model.live.i.VIDEO;
        this.aA = null;
        this.r = p.IDLE;
        this.s = null;
        this.ao = false;
        this.x = false;
        this.f15999i = false;
        this.f16002l = false;
        this.aG = false;
        this.bi = false;
        LivePerformanceManager.getInstance().setStreamType(this.f15998h);
        f.a.b.b bVar = this.ak;
        if (bVar != null) {
            bVar.dispose();
        }
        EventBus.a().b(this);
        if (getContext() != null) {
            getContext().unregisterReceiver(this.bp);
            com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", "unregisterReceiver");
        }
        com.bytedance.android.livesdk.ai.f fVar = this.av;
        if (fVar != null) {
            fVar.a();
        }
        this.av = null;
        DataChannelGlobal.f34575d.c(dh.class);
        DataChannelGlobal.f34575d.c(dm.class);
        DataChannelGlobal.f34575d.c(ar.class);
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onPause() {
        com.bytedance.android.d.b bVar;
        if (f15991a.booleanValue()) {
            com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "onPause -> roomId=" + this.f15993c + ", userId=" + this.f15995e);
        }
        com.bytedance.android.d.b bVar2 = this.v;
        if (bVar2 != null) {
            bVar2.onBackground();
        }
        com.bytedance.android.livesdk.chatroom.detail.j jVar = this.s;
        jVar.f15281l = true;
        if (jVar.n != -1) {
            jVar.r = SystemClock.elapsedRealtime();
            jVar.f15273d.removeCallbacksAndMessages(null);
            jVar.f15270a = true;
            com.bytedance.android.livesdk.chatroom.d.a a2 = com.bytedance.android.livesdk.chatroom.d.a.a();
            a2.f15185b = false;
            a2.f15187d = a2.b();
            a2.f15186c = -1;
            a2.f15190g.removeMessages(a.b.f15196a);
            com.bytedance.android.live.core.c.a.a(4, "AudienceLivePlayTaskManager", "roomBackgroundDuration duration: " + a2.b());
        }
        q qVar = this.aE;
        if (qVar.f15571d) {
            qVar.f15572e = true;
            qVar.f15570c.removeCallbacksAndMessages(null);
        }
        super.onPause();
        if (!com.bytedance.android.livesdk.ai.a.a() && (bVar = this.v) != null) {
            bVar.changeSRSupportScene(false);
        }
        Room room = this.f15994d;
        if (!(room == null || room.maskLayer == null)) {
            e.c.f9440a.a(true);
        }
        com.bytedance.android.livesdk.performance.g.h();
    }

    public final void q() {
        if (this.r == p.LIVE_STARTED) {
            this.Y.removeMessages(28);
            if (H()) {
                a aVar = this.J;
                if (aVar != null) {
                    aVar.i();
                }
                d dVar = this.an;
                if (dVar != null) {
                    dVar.a();
                }
                DataChannel dataChannel = this.V;
                if (dataChannel != null) {
                    dataChannel.c(com.bytedance.android.livesdk.j.an.class, false);
                }
            } else {
                N();
                DataChannel dataChannel2 = this.V;
                if (dataChannel2 != null) {
                    dataChannel2.c(com.bytedance.android.livesdk.j.an.class, false);
                }
            }
            ((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).clearMockChatMessage();
            R();
            com.bytedance.android.livesdk.chatroom.detail.i iVar = this.t;
            if (iVar != null) {
                iVar.a();
                this.t = null;
            }
            com.bytedance.android.livesdk.chatroom.b.f.a(this.f15993c);
            this.s.a(this.f15994d);
            DataChannelGlobal.f34575d.c(ac.class);
            this.w = false;
            this.y = false;
            this.r = p.PREPARED;
            if (f15991a.booleanValue()) {
                com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "stopInteraction, roomId=" + this.f15993c + ", userId=" + this.f15995e);
            }
        }
    }

    public final void r() {
        View view;
        com.bytedance.android.livesdkapi.c cVar = this.bg;
        if (cVar != null) {
            cVar.c();
        }
        if (!this.aQ || this.ai || TextUtils.equals(this.aj.f23299c.aa, "inner_draw")) {
            if (this.ai && this.q != 0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                if (this.n == 1) {
                    layoutParams.topMargin = this.q;
                    layoutParams.gravity = 1;
                } else {
                    layoutParams.leftMargin = this.F.getWidth() / 2;
                    layoutParams.gravity = 16;
                }
                this.ag.setLayoutParams(layoutParams);
            }
            view = this.ag;
        } else {
            view = this.bh;
        }
        com.bytedance.android.live.n.k b2 = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().b(this.af);
        if (this.bi && b2 != null && b2.f()) {
            view.setVisibility(8);
        } else if (this.ap || EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final void D() {
        boolean z2;
        try {
            androidx.fragment.app.e activity = getActivity();
            DataChannel dataChannel = this.V;
            if ((dataChannel == null || !((Boolean) dataChannel.b(cn.class)).booleanValue()) && !((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isAudienceApplied()) {
                Room room = this.f15994d;
                if ((room == null || room.getOwner() == null || this.f15994d.getOwner().getSecret() != 1) && !bf.a().d()) {
                    Dialog dialog = this.K;
                    if (dialog != null && dialog.isShowing()) {
                        return;
                    }
                    if (this.ai) {
                        if (activity == null || !activity.hasWindowFocus()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (MtPipWatchLiveUnderWindowFocusSetting.INSTANCE.getValue()) {
                            z2 = true;
                        }
                        if (com.bytedance.android.livesdk.ai.a.a() && getUserVisibleHint() && z2) {
                            SurfaceView surfaceView = null;
                            if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getUserRole(u.a().b().c()) != aw.GUEST_AUDIENCE || ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getLinkInAnchorSurface() == null) {
                                com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", "getPipVideoView  livePlayController");
                                com.bytedance.android.live.n.k b2 = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().b(this.af);
                                if (!(b2 == null || b2.o() == null)) {
                                    View o2 = b2.o();
                                    if (o2 instanceof TextureRenderView) {
                                        surfaceView = o2;
                                    } else if (o2 instanceof SurfaceRenderView) {
                                        surfaceView = o2;
                                    }
                                }
                            } else {
                                com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", "getPipVideoView  getLinkMicSurface");
                                surfaceView = ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getLinkInAnchorSurface();
                            }
                            this.al = new PictureInPictureParams.Builder();
                            a(2131234521, "", 1, 1);
                            if (surfaceView != null) {
                                int width = surfaceView.getWidth();
                                int height = surfaceView.getHeight();
                                if (!(width == 0 || height == 0)) {
                                    Rational rational = new Rational(width, height);
                                    com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", "width is " + width + ", height is " + height + "aspect ratio" + rational.toString());
                                    this.al.setAspectRatio(rational);
                                }
                            }
                            if (activity.enterPictureInPictureMode(this.al.build())) {
                                n.a(this.ac.findViewById(R.id.b94), 8);
                                DataChannel dataChannel2 = this.V;
                                if (dataChannel2 != null) {
                                    dataChannel2.b(cn.class, (Object) true);
                                    com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", "data center set true");
                                    if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getUserRole(u.a().b().c()) == aw.NORMAL_AUDIENCE) {
                                        V();
                                    }
                                }
                                c.b.a().f13747a = true;
                            }
                        }
                    }
                }
            }
        } catch (IllegalStateException unused) {
            com.bytedance.android.live.core.c.a.a(4, "pip", "enter pip error");
        }
    }

    public final void u() {
        long j2;
        String str;
        if ((!InboxTopLivesEnterRoomOptiSetting.INSTANCE.getValue() || !com.bytedance.android.livesdk.chatroom.g.k.a(this.aj) || !this.at.a(this.f15993c)) && isAdded() && isViewValid()) {
            c.b.a().f13748b = true;
            f.a.f23366a.a().a(new Event("live_play_show_live_end", 33812, com.bytedance.android.livesdkapi.session.b.SdkInterfaceCall).a("show live end."));
            a aVar = this.J;
            if (aVar != null) {
                aVar.i();
            }
            s();
            if (this.n == 0) {
                this.n = 1;
                getActivity().setRequestedOrientation(1);
            }
            View view = this.R;
            if (view != null) {
                view.setVisibility(8);
            }
            if (this.L == null && LiveNewAudienceFinishPageSetting.INSTANCE.getValue().enableLab == 0) {
                androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
                Fragment a2 = childFragmentManager.a("LiveNewAudienceEndFragment");
                if (a2 == null) {
                    Room room = null;
                    com.bytedance.android.livesdk.chatroom.detail.f fVar = this.u;
                    if (!(fVar == null || fVar.f15239f == null || this.u.f15239f.f15757a == null)) {
                        room = this.u.f15239f.f15757a;
                    }
                    com.bytedance.android.livesdk.chatroom.end.b bVar = new com.bytedance.android.livesdk.chatroom.end.b();
                    this.L = bVar;
                    bVar.a(getActivity(), room, new com.bytedance.android.livesdkapi.depend.a.a() {
                        /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass6 */

                        static {
                            Covode.recordClassIndex(8865);
                        }

                        @Override // com.bytedance.android.livesdkapi.depend.a.a
                        public final boolean i_() {
                            com.bytedance.android.livesdk.ab.k.a(br.this.getActivity());
                            br.this.b(8);
                            return true;
                        }
                    }, this.s.u, this.aj.f23299c.J);
                    childFragmentManager.a().a(R.id.b94, this.L, "LiveNewAudienceEndFragment").c();
                    l.c();
                    this.L.getLifecycle().a(new LivePlayFragment$16(this));
                } else {
                    this.L = (com.bytedance.android.livesdk.chatroom.end.b) a2;
                }
                this.L.f15418c = this.V;
            } else if (this.aL == null) {
                androidx.fragment.app.i childFragmentManager2 = getChildFragmentManager();
                com.bytedance.android.livesdk.chatroom.end.newaudienceend.a aVar2 = new com.bytedance.android.livesdk.chatroom.end.newaudienceend.a();
                this.aL = aVar2;
                EnterRoomConfig enterRoomConfig = this.aj;
                if (enterRoomConfig == null) {
                    j2 = 0;
                } else {
                    j2 = enterRoomConfig.f23299c.R;
                }
                aVar2.f15467k = j2;
                com.bytedance.android.livesdk.chatroom.end.newaudienceend.a aVar3 = this.aL;
                EnterRoomConfig enterRoomConfig2 = this.aj;
                if (enterRoomConfig2 != null) {
                    str = enterRoomConfig2.f23299c.J;
                } else {
                    str = "";
                }
                aVar3.f15450h = str;
                this.aL.f15466j = new cl(this);
                androidx.fragment.app.n a3 = childFragmentManager2.a();
                a3.a(R.id.b94, this.aL, "LiveNewAudienceEndFragment");
                a3.c();
            } else {
                return;
            }
            com.bytedance.android.b.a.a.f6785g.f6789c = "end_live";
            com.bytedance.android.livesdk.drawerfeed.f.a((Activity) getActivity(), false);
            com.bytedance.android.livesdk.drawerfeed.f.a((Activity) getActivity(), (Boolean) false);
            this.V.c(com.bytedance.android.live.n.s.class);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f4, code lost:
        if (r5 != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e9, code lost:
        if (r0 <= 0) goto L_0x00ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f2 A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
        // Method dump skipped, instructions count: 592
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.br.j():void");
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final void k() {
        long longValue;
        String str;
        long j2;
        int i2;
        int i3;
        boolean z2 = false;
        this.aR = false;
        EnterRoomConfig enterRoomConfig = this.aj;
        if (enterRoomConfig != null) {
            com.bytedance.android.livesdk.ab.m.a(enterRoomConfig.f23299c.an, this.aj.f23299c.ao);
        }
        com.bytedance.android.b.a.a.f6785g.f6792f = this.aj.f23299c.R;
        androidx.fragment.app.e activity = getActivity();
        DataChannel dataChannel = this.V;
        if (activity != null && (activity instanceof com.bytedance.android.livesdk.q)) {
            com.bytedance.android.livesdk.q qVar = (com.bytedance.android.livesdk.q) activity;
            if (qVar.a() != null && !activity.isFinishing()) {
                qVar.a().a(dataChannel);
            }
        }
        if (f15991a.booleanValue()) {
            com.bytedance.android.live.core.c.a.a(3, "LivePlayFragment", "startRoom, roomId=" + this.f15993c + ", userId=" + this.f15995e);
        }
        E().put("param_live_create_time", new StringBuilder().append(System.currentTimeMillis()).toString());
        com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "startRoom -> roomId=" + this.f15993c + ", userId=" + this.f15995e);
        this.ba = System.currentTimeMillis();
        if (!this.aG) {
            a(com.bytedance.android.livesdkapi.f.a.class);
            a(com.bytedance.android.livesdk.chatroom.c.r.class);
            a(com.bytedance.android.livesdk.chatroom.c.s.class);
            a(com.bytedance.android.livesdk.chatroom.c.u.class);
            a(o.class);
            a(com.bytedance.android.live.j.c.class);
            a(com.bytedance.android.live.j.b.class);
            a(com.bytedance.android.livesdk.event.i.class);
            a(com.bytedance.android.livesdk.chatroom.c.z.class);
            a(com.bytedance.android.livesdk.chatroom.c.e.class);
            com.bytedance.android.livesdk.an.a.a().a(this, com.bytedance.android.livesdk.event.e.class, new cp(this)).a(new cq(this));
            this.aG = true;
        }
        if (!EventBus.a().a(this)) {
            EventBus.a(EventBus.a(), this);
        }
        Event event = new Event("liveplay_start_room_and_player", 1028, com.bytedance.android.livesdkapi.session.b.SdkInterfaceCall);
        event.a("start room and start player to bind surface.");
        f.a.f23366a.a().a(event);
        this.V.b(com.bytedance.android.live.liveinteract.api.l.class, (h.f.a.b) new cr(this)).b(com.bytedance.android.live.liveinteract.api.t.class, (h.f.a.b) new cs(this)).b(v.class, (h.f.a.b) new ct(this)).b(ay.class, (h.f.a.b) new cu(this)).b(cn.class, (h.f.a.b) new bu(this)).b(x.class, (h.f.a.b) new bv(this)).b(dq.class, (h.f.a.b) new bw(this)).a(com.bytedance.android.livesdk.aw.class, (h.f.a.b) new bx(this)).b(as.class, (h.f.a.b) new by(this)).b(com.bytedance.android.live.liveinteract.api.h.class, (h.f.a.b) new bz(this)).a((androidx.lifecycle.m) this, eg.class, (h.f.a.b) new ca(this));
        this.ao = true;
        if (this.r != p.INITIALIZED) {
            com.bytedance.android.livesdk.live.c.a.a().f18672a = null;
            f.a.f23366a.a().a(new Event("live_play_fragment_state_error", 33813, com.bytedance.android.livesdkapi.session.b.BussinessApiCall).a("current state:" + this.r.name()));
            com.bytedance.android.b.a.a.f6785g.f6789c = "end_live";
            com.bytedance.android.livesdk.drawerfeed.f.a((Activity) getActivity(), false);
            com.bytedance.android.livesdk.drawerfeed.f.a((Activity) getActivity(), (Boolean) false);
            a("state does not match, ", 201, (long) this.r.ordinal());
            if (this.bb) {
                s();
            }
        } else {
            this.ab.f13858a = SystemClock.uptimeMillis();
            if (com.bytedance.android.livesdk.ab.d.c.f13554a > 0) {
                long currentTimeMillis = System.currentTimeMillis() - com.bytedance.android.livesdk.ab.d.c.f13554a;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("cold_start_cost_time", currentTimeMillis);
                } catch (JSONException unused) {
                }
                com.bytedance.android.live.core.d.c.b("ttlive_cold_start_enter_room_all", 0, jSONObject);
                com.bytedance.android.livesdk.ab.d.c.f13554a = 0;
            }
            if (this.r == p.LIVE_FINISHED) {
                if (this.L == null) {
                    this.L = (com.bytedance.android.livesdk.chatroom.end.b) getChildFragmentManager().a("LiveNewAudienceEndFragment");
                }
                if (this.L == null) {
                    this.r = p.INITIALIZED;
                }
            }
            c.b.a().f13748b = false;
            if (this.L != null) {
                if (!this.mStatusDestroyed) {
                    getChildFragmentManager().a().a(this.L).c();
                }
                this.L = null;
            }
            this.r = p.PREPARING;
            String str2 = this.aj.f23299c.E;
            if (str2 != null) {
                this.af = str2;
            }
            if (!m.a("inner_draw", this.aj.f23299c.aa)) {
                this.aX = this.aj.f23299c.af.f23351a;
            }
            com.bytedance.android.d.a aVar = this.bf;
            long j3 = this.aX;
            long j4 = this.aY;
            if (!TextUtils.isEmpty(this.f15997g) || !TextUtils.isEmpty(this.ay)) {
                z2 = true;
            }
            EnterRoomConfig enterRoomConfig2 = this.aj;
            if (enterRoomConfig2.f23299c.af.f23352b == null) {
                longValue = System.currentTimeMillis();
            } else {
                longValue = enterRoomConfig2.f23299c.af.f23352b.longValue();
            }
            if (TextUtils.equals(enterRoomConfig2.f23299c.aa, "inner_draw")) {
                str = "draw";
            } else {
                str = "click";
            }
            String str3 = enterRoomConfig2.f23299c.J;
            String str4 = enterRoomConfig2.f23299c.L;
            if (aVar == null) {
                aVar = com.bytedance.android.d.a.a(enterRoomConfig2.f23299c.R);
                j2 = 0;
            } else {
                j2 = 0;
            }
            if (j3 == j2) {
                j3 = System.currentTimeMillis();
            }
            aVar.f6842h = j3;
            if (z2) {
                i2 = 1;
            } else {
                i2 = 3;
            }
            aVar.f6835a = i2;
            aVar.f6836b = com.bytedance.android.d.a.a(str);
            aVar.f6837c = com.bytedance.android.d.a.a(str3);
            aVar.f6838d = com.bytedance.android.d.a.a(str4);
            aVar.f6839e = com.bytedance.android.d.a.a("");
            com.bytedance.android.live.n.k b2 = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().b(enterRoomConfig2.f23299c.E);
            if (b2 == null) {
                i3 = 1;
            } else if (b2.l()) {
                i3 = 3;
            } else {
                i3 = 2;
            }
            aVar.f6840f = i3;
            aVar.f6843i = longValue;
            aVar.f6844j = j4;
            if (this.bb && this.v != null) {
                M();
                this.v.tryToUploadFirstScreenTime();
                this.v.tryToStartAudioDevice();
            }
            l lVar = this.ab;
            lVar.f13863f.clear();
            lVar.f13862e.clear();
            lVar.a("n_time_start_room");
            String str5 = this.aj.f23299c.ab;
            this.V.a(cd.class, str5);
            this.s.t = str5;
            this.s.B = this.V;
            this.s.b();
            this.s.E = this.aj.f23299c.Z;
            q qVar2 = this.aE;
            if (!qVar2.f15571d) {
                qVar2.f15571d = true;
                qVar2.f15569b = SystemClock.elapsedRealtime();
                qVar2.f15570c.sendEmptyMessageDelayed(100, q.f15568a);
            }
            j();
            this.V.a(am.class, (Object) true);
            E().put("param_live_enter_room_start_time", new StringBuilder().append(this.aX).toString());
        }
        this.aD.a(true);
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onResume() {
        boolean z2;
        DataChannel dataChannel;
        MethodCollector.i(2624);
        super.onResume();
        com.bytedance.android.livesdk.performance.g.g();
        if (getUserVisibleHint()) {
            S();
        }
        com.bytedance.android.livesdk.chatroom.ui.a.a aVar = this.C;
        if (!(aVar == null || aVar.f15846a == null)) {
            this.C.f15846a.postDelayed(new bt(this), 50);
        }
        com.bytedance.android.livesdk.chatroom.detail.j jVar = this.s;
        jVar.f15281l = false;
        if (jVar.r != -1) {
            jVar.s += SystemClock.elapsedRealtime() - jVar.r;
            jVar.r = -1;
            jVar.f15273d.post(jVar.f15272c);
            jVar.f15273d.post(new com.bytedance.android.livesdk.chatroom.detail.o(jVar));
            jVar.f15273d.post(new com.bytedance.android.livesdk.chatroom.detail.p(jVar));
            jVar.A = SystemClock.elapsedRealtime();
            com.bytedance.android.livesdk.chatroom.d.a a2 = com.bytedance.android.livesdk.chatroom.d.a.a();
            long c2 = jVar.c();
            a2.f15185b = true;
            a2.f15186c = SystemClock.elapsedRealtime();
            a2.f15187d = c2;
            a2.c();
            com.bytedance.android.live.core.c.a.a(4, "AudienceLivePlayTaskManager", "roomForegroundDuration duration: " + a2.b());
        }
        q qVar = this.aE;
        if (qVar.f15571d && qVar.f15572e) {
            qVar.f15572e = false;
            qVar.f15569b = SystemClock.elapsedRealtime();
            qVar.f15570c.sendEmptyMessageDelayed(100, q.f15568a);
        }
        com.bytedance.android.live.n.k b2 = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().b(this.af);
        if (b2 != null) {
            b2.f(false);
        }
        if (this.ae) {
            com.bytedance.android.live.core.c.a.a(4, "LivePlayFragment.onResume", "restarting detached live room");
            C().a("");
        }
        com.bytedance.android.d.b bVar = this.v;
        if (bVar != null) {
            if (!this.y) {
                bVar.onForeground();
            }
            z2 = this.v.tryResumePlay();
            if (!this.be.isEmpty()) {
                for (com.bytedance.android.livesdk.chatroom.c.q qVar2 : this.be) {
                    if (qVar2.f15140a == 4) {
                        z2 = true;
                    }
                    a(qVar2);
                }
                this.be.clear();
            }
            if (!com.bytedance.android.livesdk.ai.a.a()) {
                this.v.changeSRSupportScene(true);
            }
        } else {
            z2 = false;
        }
        if (f15991a.booleanValue()) {
            com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "onResume -> roomId=" + this.f15993c + ", userId=" + this.f15995e + ", resumePlay=" + z2 + ", mAutoStartWhenResume=" + this.x);
        }
        if (this.x) {
            this.x = false;
            if (this.r == p.PREPARED) {
                if (!TextUtils.isEmpty(this.ay)) {
                    a(this.ay, this.az, this.f15998h, this.aA);
                } else {
                    a(this.f15997g, this.f15998h, this.aA, this.ax);
                }
                if (this.bb) {
                    ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().c(this.af);
                }
            }
        }
        if (this.bk) {
            a(a.WATCHER_KIT_OUT);
        }
        this.au = false;
        if (!(b2 == null || (dataChannel = this.V) == null || !((Boolean) dataChannel.b(cn.class)).booleanValue())) {
            if (!TextUtils.equals(b2.b(), this.af) && this.v != null) {
                if (this.C.f15846a.getParent() == null) {
                    this.F.addView(this.C.f15846a, 0);
                    this.C.a(0);
                }
                com.bytedance.android.livesdk.chatroom.ui.a.a aVar2 = this.C;
                if (aVar2 != null && aVar2.f15846a.getVisibility() == 8) {
                    this.C.a(0);
                }
                com.bytedance.android.d.b ensureRoomPlayer = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).ensureRoomPlayer(this.f15993c, this.ay, this.az, this.f15998h, this.aA, this.C.a(), this.bo, getContext(), this.af);
                this.v = ensureRoomPlayer;
                ensureRoomPlayer.pipResumePlay();
            }
            this.V.b(cn.class, (Object) false);
            com.bytedance.android.livesdk.ai.f fVar = this.av;
            if (fVar != null) {
                fVar.a();
            }
        }
        if (com.bytedance.android.livesdk.g.e.f17823a) {
            ao.a(com.bytedance.android.live.core.f.y.e(), com.bytedance.android.live.core.f.y.a((int) R.string.dvk), 0);
            com.bytedance.android.livesdk.g.e.f17823a = false;
        }
        MethodCollector.o(2624);
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final void a(i.a aVar) {
        this.aS = aVar;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final void c(int i2) {
        this.bj = i2;
    }

    private f.a b(final long j2) {
        return new f.a() {
            /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass17 */

            static {
                Covode.recordClassIndex(8860);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:71:0x02b4, code lost:
                if (r2.contains(java.lang.Long.valueOf(r1.f23305a)) == false) goto L_0x02b6;
             */
            @Override // com.bytedance.android.livesdk.chatroom.detail.f.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(com.bytedance.android.livesdk.chatroom.model.e r28) {
                /*
                // Method dump skipped, instructions count: 1434
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass17.a(com.bytedance.android.livesdk.chatroom.model.e):void");
            }

            @Override // com.bytedance.android.livesdk.chatroom.detail.f.a
            public final void a(int i2, String str, String str2) {
                int i3;
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                boolean z6;
                com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "room/enter fail -> origin room_id = " + j2);
                if (i2 == 4003043) {
                    androidx.fragment.app.i childFragmentManager = br.this.getChildFragmentManager();
                    long j2 = j2;
                    h.f.b.l.d(childFragmentManager, "");
                    com.bytedance.android.livesdk.mvp.b bVar = new com.bytedance.android.livesdk.mvp.b();
                    Bundle bundle = new Bundle();
                    bundle.putLong("roomId", j2);
                    bVar.setArguments(bundle);
                    bVar.show(childFragmentManager, "PaidRoomCheckDialog.class");
                    return;
                }
                boolean z7 = false;
                if (i2 == 4003072) {
                    androidx.fragment.app.i childFragmentManager2 = br.this.getChildFragmentManager();
                    EnterRoomConfig enterRoomConfig = br.this.aj;
                    DataChannel dataChannel = br.this.V;
                    h.f.b.l.d(childFragmentManager2, "");
                    h.f.b.l.d(enterRoomConfig, "");
                    h.f.b.l.d(dataChannel, "");
                    com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(LivePaidEventSchema.INSTANCE.getValue());
                    gVar.a("room_id", enterRoomConfig.f23299c.R);
                    gVar.a("request_id", enterRoomConfig.f23298b.f23309a);
                    gVar.a("author_id", enterRoomConfig.f23298b.f23310b);
                    Uri parse = Uri.parse(gVar.a());
                    if (com.bytedance.android.livesdk.chatroom.g.m.a(parse, "disable_mask_click_close", 0) == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    com.bytedance.android.live.b.m e2 = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).createLynxDialogBuilder(parse.getQueryParameter("url"), com.bytedance.android.livesdk.chatroom.g.m.a(parse, "fallback_url", "")).a(com.bytedance.android.livesdk.chatroom.g.m.a(parse, "radius", 8), com.bytedance.android.livesdk.chatroom.g.m.a(parse, "radius", 8)).b(com.bytedance.android.livesdk.chatroom.g.m.a(parse, "height", 400)).a(com.bytedance.android.livesdk.chatroom.g.m.a(parse, "width", (int) com.bytedance.android.live.core.f.y.e(com.bytedance.android.live.core.f.y.c()))).c(com.bytedance.android.livesdk.chatroom.g.m.a(parse, "margin", 0)).e(80);
                    if (com.bytedance.android.livesdk.chatroom.g.m.a(parse, "show_close", 0) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    com.bytedance.android.live.b.m d2 = e2.d(z2);
                    String uri = parse.toString();
                    if (uri == null) {
                        uri = "";
                    }
                    h.f.b.l.b(uri, "");
                    com.bytedance.android.live.b.m f2 = d2.c(uri).a(com.bytedance.android.livesdk.chatroom.g.m.a(parse, "from_label", "")).f(com.bytedance.android.livesdk.chatroom.g.m.a(parse, "title", ""));
                    if (h.m.p.a("true", com.bytedance.android.livesdk.chatroom.g.m.a(parse, "show_title_bar", ""), true) || h.f.b.l.a((Object) "1", (Object) com.bytedance.android.livesdk.chatroom.g.m.a(parse, "show_title_bar", ""))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    com.bytedance.android.live.b.m e3 = f2.e(z3);
                    if (h.m.p.a("true", com.bytedance.android.livesdk.chatroom.g.m.a(parse, "show_title_share", ""), true) || h.f.b.l.a((Object) "1", (Object) com.bytedance.android.livesdk.chatroom.g.m.a(parse, "show_title_share", ""))) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    com.bytedance.android.live.b.m g2 = e3.g(z4);
                    if (h.m.p.a("true", com.bytedance.android.livesdk.chatroom.g.m.a(parse, "show_title_close", ""), true) || h.f.b.l.a((Object) "1", (Object) com.bytedance.android.livesdk.chatroom.g.m.a(parse, "show_title_close", ""))) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    com.bytedance.android.live.b.m e4 = g2.f(z5).c(z).b(com.bytedance.android.livesdk.chatroom.g.m.a(parse, "web_bg_color", "")).d(com.bytedance.android.livesdk.chatroom.g.m.a(parse, "popup_enter_type", "")).e(com.bytedance.android.livesdk.chatroom.g.m.a(parse, "mask_alpha", "0"));
                    if (com.bytedance.android.livesdk.chatroom.g.m.a(parse, "landscape_custom_height", 0) == 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    com.bytedance.android.live.b.m a2 = e4.a(z6);
                    int a3 = com.bytedance.android.livesdk.chatroom.g.m.a(parse, "show_dim", -1);
                    if (a3 != -1) {
                        if (a3 == 1) {
                            z7 = true;
                        }
                        a2 = a2.b(z7);
                    }
                    com.bytedance.android.live.core.widget.a a4 = a2.a();
                    a4.f9304d = new m.a(dataChannel);
                    a4.show(childFragmentManager2, "paidEventDialog");
                    return;
                }
                br.this.ah = true;
                br.this.ab.f13860c = 1;
                br.this.p();
                br.this.b("fetch_room_error");
                br.this.o();
                f.a.f23366a.a().a(new Event("live_play_enter_room_fail", 1031, com.bytedance.android.livesdkapi.session.b.ServerApiCall).a("room enter api fail callback."));
                if ((TextUtils.isEmpty(str) || !str.contains("30003")) && i2 != 30003) {
                    b.a.a("rd_enter_room_failed").a(br.this.V).b();
                    if (i2 != 0) {
                        i3 = i2;
                    } else {
                        i3 = 103;
                    }
                    br.this.ab.a(i3, str, j2, br.this.N, br.this.f15997g);
                    br.this.a("enter room request failure, errMsg = " + str + " ,frame_fail", 205, (long) i3);
                    if (TextUtils.isEmpty(str2) || i2 == 0) {
                        ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.gqe);
                        f.a.f23366a.a().a(new Event("live_play_enter_room_fail", 33811, com.bytedance.android.livesdkapi.session.b.ServerApiCall).a("enter room api return fail.error_code =0"));
                        br.this.a(a.ENTER_FAILED);
                    } else if ((TextUtils.isEmpty(str) || !str.contains("30005")) && i2 != 30005) {
                        ao.a(com.bytedance.android.live.core.f.y.e(), str2, 0);
                        br.this.ad = false;
                        Event event = new Event("live_play_enter_room_fail", 33808, com.bytedance.android.livesdkapi.session.b.ServerApiCall);
                        event.a("enter room api return fail. error_code: " + i2 + ", error_prompt: " + str2);
                        f.a.f23366a.a().a(event);
                        br.this.a(a.ENTER_FAILED);
                    } else if (br.this.K == null || !br.this.K.isShowing()) {
                        com.bytedance.android.livesdk.chatroom.detail.j jVar = br.this.s;
                        HashMap hashMap = new HashMap();
                        hashMap.put("event_belong", "live");
                        hashMap.put("event_type", "show");
                        hashMap.put("event_page", "live_detail");
                        hashMap.put("event_module", "popup");
                        hashMap.put("live_type", jVar.x);
                        hashMap.put("request_id", jVar.f15274e);
                        hashMap.put("log_pb", jVar.f15275f);
                        b.a.a("crash_popup_show").a((Map<String, String>) hashMap).b();
                        br brVar = br.this;
                        b.a aVar = new b.a(br.this.getContext());
                        aVar.f18296m = false;
                        brVar.K = aVar.b(R.string.gsp).a(R.string.gso, (DialogInterface.OnClickListener) new cw(this), false).b(R.string.gz7, (DialogInterface.OnClickListener) new cx(this, i2, str2), false).a();
                        br.this.K.show();
                    }
                } else {
                    b.a.a("rd_enter_room_live_end").a(br.this.V).b();
                    br.this.a("room finish, live_end", 201, (long) i2);
                    f.a.f23366a.a().a(new Event("live_play_enter_room_fail", 1032, com.bytedance.android.livesdkapi.session.b.BussinessApiCall).a("room enter show end fragment"));
                    br.this.u();
                    br.this.a(true);
                    br.this.r = p.LIVE_FINISHED;
                }
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final void a(i.b bVar) {
        this.at = bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("enter_room_config", this.aj);
    }

    private void d(int i2) {
        View findViewById;
        View view = this.ac;
        if (view != null && (findViewById = view.findViewById(R.id.ffl)) != null && findViewById.getVisibility() != i2) {
            findViewById.setVisibility(i2);
        }
    }

    public void onEvent(com.bytedance.android.livesdk.chatroom.c.z zVar) {
        if (zVar == null || !zVar.f15169a) {
            B();
            return;
        }
        com.bytedance.android.livesdk.chatroom.detail.f fVar = this.u;
        if (fVar != null) {
            fVar.a();
        }
    }

    private <T> void a(Class<T> cls) {
        this.bl.a(com.bytedance.android.livesdk.an.a.a().a((Class) cls).a(new f.a.d.f<T>() {
            /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass12 */

            static {
                Covode.recordClassIndex(8855);
            }

            @Override // f.a.d.f
            public final void accept(T t) {
                if (t instanceof com.bytedance.android.livesdkapi.f.a) {
                    br.this.onEvent((com.bytedance.android.livesdkapi.f.a) t);
                } else if (t instanceof com.bytedance.android.livesdk.chatroom.c.r) {
                    br.this.onEvent((com.bytedance.android.livesdk.chatroom.c.r) t);
                } else if (t instanceof com.bytedance.android.livesdk.chatroom.c.s) {
                    br.this.onEvent((com.bytedance.android.livesdk.chatroom.c.s) t);
                } else if (t instanceof com.bytedance.android.livesdk.event.e) {
                    br.this.onEvent((com.bytedance.android.livesdk.event.e) t);
                } else if (t instanceof com.bytedance.android.livesdk.chatroom.c.u) {
                    br.this.onEvent((com.bytedance.android.livesdk.chatroom.c.u) t);
                } else if (t instanceof o) {
                    br.this.onEvent((o) t);
                } else if (t instanceof com.bytedance.android.live.j.c) {
                    br.this.onEvent((com.bytedance.android.live.j.c) t);
                } else if (t instanceof com.bytedance.android.live.j.b) {
                    br.this.a(a.MIC_ROOM_END);
                } else if (t instanceof com.bytedance.android.livesdk.event.i) {
                    br.this.onEvent((com.bytedance.android.livesdk.event.i) t);
                } else if (t instanceof com.bytedance.android.livesdk.chatroom.c.z) {
                    br.this.onEvent((com.bytedance.android.livesdk.chatroom.c.z) t);
                } else if (t instanceof com.bytedance.android.livesdk.chatroom.c.e) {
                    br.this.onEvent((com.bytedance.android.livesdk.chatroom.c.e) t);
                }
            }
        }, new f.a.d.f<Throwable>() {
            /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass13 */

            static {
                Covode.recordClassIndex(8856);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Throwable th) {
            }
        }));
    }

    private void c(Room room) {
        int i2;
        if (room != null && room.warningTag != null && room.warningTag.text != null) {
            if (room.warningTag.tagSource == 1) {
                i2 = 4;
            } else {
                i2 = 3;
            }
            WarningTag warningTag = room.warningTag;
            ((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).insertBottomMessage(this.f15993c, "", warningTag.text, warningTag.duration.longValue(), 1, 0, i2);
        }
    }

    private boolean e(int i2) {
        com.bytedance.android.livesdk.ai.g gVar;
        DataChannel dataChannel = this.V;
        if (dataChannel == null || !((Boolean) dataChannel.b(cn.class)).booleanValue() || (gVar = this.aw) == null) {
            return false;
        }
        if (i2 == 1) {
            gVar.a(i2, new cm(this));
            return false;
        }
        if (i2 == 2 || i2 == 3) {
            gVar.a(i2, new cn(this));
        }
        return true;
    }

    @org.greenrobot.eventbus.r
    public void liveUserKickOut(com.bytedance.android.livesdkapi.g.l lVar) {
        Room room;
        if (lVar != null && (room = this.f15994d) != null && room.getOwner() != null && com.bytedance.common.utility.m.a(lVar.f23207b, String.valueOf(this.f15994d.getOwner().getId()))) {
            this.bk = lVar.f23206a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        try {
            if (this.n != getActivity().getRequestedOrientation()) {
                getActivity().setRequestedOrientation(this.n);
            }
        } catch (Exception unused) {
            com.bytedance.android.live.core.c.a.a(4, "ttlive_room", "setRequestedOrientation wrong");
        }
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        Fragment a2 = childFragmentManager.a("AbsInteractionFragment");
        if (a2 != null) {
            childFragmentManager.a().a(a2).c();
        }
    }

    public void onEvent(com.bytedance.android.livesdk.chatroom.c.e eVar) {
        androidx.fragment.app.e activity = getActivity();
        Boolean valueOf = Boolean.valueOf(eVar.f15116a);
        if (activity != null && (activity instanceof com.bytedance.android.livesdk.q)) {
            com.bytedance.android.livesdk.q qVar = (com.bytedance.android.livesdk.q) activity;
            if (qVar.a() != null && !activity.isFinishing()) {
                qVar.a().b(valueOf.booleanValue());
            }
        }
    }

    private void d(Room room) {
        View view = this.R;
        if (view != null) {
            view.setVisibility(8);
            if (b(room)) {
                e.c.f9440a.a(false);
                LiveMaskLayerWidget liveMaskLayerWidget = new LiveMaskLayerWidget();
                this.X = liveMaskLayerWidget;
                liveMaskLayerWidget.a(room);
                this.X.f22502c = this.v;
                this.X.a();
                this.X.f22500a = this.aS;
                RecyclableWidgetManager.of((Fragment) this, this.ac, false, (IWidgetProvider) LiveWidgetProvider.getInstance(), (FluencyOpt) com.bytedance.android.live.u.g.f12827a).load(R.id.ckw, this.X);
                this.R.setVisibility(0);
                b.a.a("livesdk_mask_layer_show").f("show").a(this.V).b();
            }
        }
    }

    private void e(boolean z2) {
        a atVar;
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        if (this.n == 1) {
            atVar = new dd();
        } else {
            atVar = new at();
        }
        this.J = atVar;
        atVar.a(this.aj, z2);
        this.J.a(this.V, this.f15998h, new com.bytedance.android.live.n.u() {
            /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass3 */

            static {
                Covode.recordClassIndex(8862);
            }

            @Override // com.bytedance.android.live.n.u
            public final void a(int i2) {
                if (br.this.r == p.LIVE_STARTED) {
                    if (i2 == 3) {
                        br.this.w = true;
                    } else if (i2 == 2) {
                        br.this.w = false;
                    }
                }
            }

            @Override // com.bytedance.android.live.n.u
            public final void a(bv bvVar) {
                if (bvVar != null && br.this.r == p.LIVE_STARTED) {
                    br.this.a(bvVar);
                }
            }
        });
        this.J.z = this.s;
        a aVar = this.J;
        if (aVar instanceof dd) {
            ((dd) aVar).J = this.bc;
        }
        childFragmentManager.a().a(R.id.b94, this.J, "AbsInteractionFragment").c();
        this.J.getLifecycle().a(new LivePlayFragment$12(this));
        this.an = new d(this.J, this.Y);
    }

    private void f(boolean z2) {
        com.bytedance.android.livesdk.chatroom.ui.a.a aVar;
        if (z2) {
            com.bytedance.android.d.b bVar = this.v;
            if (bVar != null) {
                bVar.tryResumePlay();
                com.bytedance.android.livesdk.utils.ab.a(this);
                return;
            }
            return;
        }
        com.bytedance.android.d.b bVar2 = this.v;
        if (bVar2 != null) {
            bVar2.setMute(true);
            if (!this.bi || (aVar = this.C) == null || aVar.f15846a.getContext() == null) {
                this.v.stopWhenPlayingOther(getContext());
            } else {
                this.v.stopWhenPlayingOther(this.C.f15846a.getContext());
            }
        }
        this.Y.post(new Runnable() {
            /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass4 */

            static {
                Covode.recordClassIndex(8863);
            }

            public final void run() {
                com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.c.r(34));
            }
        });
    }

    private void g(boolean z2) {
        Object obj;
        DataChannel dataChannel = this.V;
        if (dataChannel != null) {
            obj = dataChannel.b(com.bytedance.android.livesdk.rank.api.e.class);
        } else {
            obj = null;
        }
        int i2 = 0;
        if (obj instanceof Integer) {
            i2 = ((Integer) obj).intValue();
        }
        RoomStatus roomStatus = new RoomStatus();
        roomStatus.f7371c = z2;
        roomStatus.f7372d = i2;
        roomStatus.f7370b = this.f15995e;
        roomStatus.f7369a = this.f15993c;
        if (getActivity() != null) {
            Intent intent = getActivity().getIntent();
            if (intent != null) {
                intent.putExtra("host_room_status_event", roomStatus);
            }
            i.b bVar = this.at;
            if (bVar != null) {
                bVar.a(roomStatus);
            }
        }
    }

    public void onEvent(com.bytedance.android.live.j.c cVar) {
        if (cVar.f9916a > 0 && this.aj != null) {
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f23299c.R = cVar.f9916a;
            enterRoomConfig.f23299c.J = this.aj.f23299c.J;
            enterRoomConfig.f23299c.L = this.aj.f23299c.L;
            enterRoomConfig.f23299c.ak = cVar.f9917b;
            EnterRoomLinkSession.a(enterRoomConfig).a(new Event("mic_room_jump_event", 1033, com.bytedance.android.livesdkapi.session.b.MessageReceived).a("roomid:" + cVar.f9916a + " autojump:" + cVar.f9917b));
            onEvent(new com.bytedance.android.livesdk.event.e(cVar.f9916a, enterRoomConfig, "jump_source_mic_room"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z2) {
        boolean z3;
        if (z2 != getUserVisibleHint()) {
            z3 = true;
        } else {
            z3 = false;
        }
        super.setUserVisibleHint(z2);
        com.bytedance.android.livesdk.chatroom.end.b bVar = this.L;
        if (bVar != null) {
            bVar.setUserVisibleHint(z2);
        }
        com.bytedance.android.livesdk.chatroom.end.newaudienceend.a aVar = this.aL;
        if (aVar != null) {
            aVar.setUserVisibleHint(z2);
        }
        if (isResumed() && z3 && getUserVisibleHint()) {
            S();
        }
        DataChannel dataChannel = this.V;
        if (dataChannel != null) {
            dataChannel.b(bw.class, Boolean.valueOf(z2));
        } else {
            this.bm = z2;
        }
        if (isViewValid() && z2 && this.r != p.LIVE_FINISHED) {
            com.bytedance.android.livesdk.drawerfeed.f.a(getActivity(), Boolean.valueOf(F()));
        }
    }

    private void c(String str) {
        HSImageView hSImageView;
        String str2;
        if (!this.aQ || this.ai || TextUtils.equals(this.aj.f23299c.aa, "inner_draw")) {
            hSImageView = this.aH;
        } else {
            hSImageView = this.E;
        }
        com.bytedance.android.live.n.k b2 = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().b(this.af);
        if (!this.bi || b2 == null || !b2.f()) {
            if (!(hSImageView == null || hSImageView.getVisibility() == 0)) {
                hSImageView.setVisibility(0);
            }
            com.bytedance.android.livesdkapi.c cVar = this.bg;
            if (cVar != null) {
                cVar.d();
            }
            StringBuilder sb = new StringBuilder("show ");
            if (!this.aQ) {
                str2 = "Background";
            } else {
                str2 = "below Background";
            }
            com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", sb.append(str2).append(", reason: ").append(str).append(this.f15993c).toString());
            a(true, str);
            this.V.c(com.bytedance.android.livesdk.watch.e.class, this.aH);
            return;
        }
        this.aH.setVisibility(8);
        if (!this.am) {
            this.E.setVisibility(8);
        }
    }

    private void d(boolean z2) {
        if (this.r == p.PREPARING || this.r == p.PREPARED) {
            y yVar = this.aC;
            if (yVar != null) {
                yVar.b();
                this.aC = null;
                com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "resetFetchUserRoom -> roomId=" + this.f15993c + ", userId=" + this.f15995e);
            }
            J();
            b(z2);
            this.s.a();
            this.r = p.INITIALIZED;
            this.N = "other";
            com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "resetPrepare -> roomId=" + this.f15993c + ", userId=" + this.f15995e);
        }
    }

    public final void b(int i2) {
        i.b bVar;
        Event event = new Event("live_play_end_room_user_close", 33799, com.bytedance.android.livesdkapi.session.b.BussinessApiCall);
        event.a("user close");
        f.a.f23366a.a().a(event);
        com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "user close");
        if (this.r != p.LIVE_STARTED || this.y) {
            if (this.s != null && this.r == p.LIVE_STARTED) {
                this.s.a(this.f15994d);
            }
            if (!com.bytedance.android.livesdk.chatroom.backroom.d.a.c() || i2 != 8 || (bVar = this.at) == null || !bVar.j()) {
                a(a.USER_CLOSE);
                return;
            }
            return;
        }
        i.b bVar2 = this.at;
        if (bVar2 != null) {
            bVar2.i();
        }
        cj cjVar = new cj(this, i2);
        if (!this.J.a(cjVar)) {
            cjVar.run();
        }
    }

    public void onEvent(o oVar) {
        ViewGroup viewGroup = this.D;
        if (viewGroup != null && (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            int d2 = com.bytedance.android.live.core.f.y.d(R.dimen.wo);
            if (oVar.f15135b) {
                ValueAnimator valueAnimator = this.aZ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i2 = ((ViewGroup.MarginLayoutParams) this.F.getLayoutParams()).rightMargin;
                if (!oVar.f15134a) {
                    d2 = 0;
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(i2, d2);
                Math.abs(i2 - d2);
                ValueAnimator duration = ofInt.setDuration(200L);
                this.aZ = duration;
                duration.addUpdateListener(new ce(this));
                this.aZ.start();
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.F.getLayoutParams();
            if (!oVar.f15134a) {
                d2 = 0;
            }
            marginLayoutParams.rightMargin = d2;
            this.F.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPictureInPictureModeChanged(boolean z2) {
        super.onPictureInPictureModeChanged(z2);
        if (getUserVisibleHint()) {
            if (z2) {
                if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getUserRole(u.a().b().c()) == aw.GUEST_AUDIENCE) {
                    V();
                }
                com.bytedance.android.d.b bVar = this.v;
                if (bVar != null) {
                    bVar.changeSRSupportScene(false);
                }
                this.V.c(cm.class, new h.p(true, Integer.valueOf(this.C.f15846a.getWidth())));
                return;
            }
            n.a(this.ac.findViewById(R.id.b94), 0);
            androidx.fragment.app.e activity = getActivity();
            if (Build.VERSION.SDK_INT >= 24 && activity != null && activity.isInPictureInPictureMode()) {
                return;
            }
            if (this.au) {
                b.a.a("livesdk_mini_window_close").b();
                if (Build.VERSION.SDK_INT >= 21) {
                    activity.finishAndRemoveTask();
                    return;
                }
                return;
            }
            b.a.a("livesdk_mini_window_return_full").b();
            this.Y.postDelayed(new Runnable() {
                /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(8867);
                }

                public final void run() {
                    int i2;
                    MethodCollector.i(1591);
                    if (br.this.aw == null || !((i2 = br.this.aw.f13779h) == 2 || i2 == 3)) {
                        int[] iArr = new int[2];
                        if (br.this.v != null) {
                            br.this.v.getVideoSize(iArr);
                        }
                        com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", "{" + iArr[0] + "," + iArr[1] + "}");
                        if (!(iArr[0] == 0 || iArr[1] == 0)) {
                            br brVar = br.this;
                            brVar.a(iArr[0], iArr[1], n.a(brVar.getContext()));
                        }
                        n.a(br.this.ac.findViewById(R.id.b94), 0);
                        if (br.this.aw != null) {
                            View view = br.this.aw.f13773b;
                            if (view != null) {
                                ViewParent parent = view.getParent();
                                if (parent instanceof ViewGroup) {
                                    ((ViewGroup) parent).removeView(view);
                                }
                                if ((view instanceof TextureRenderView) || (view instanceof SurfaceRenderView) || (view instanceof TextureViewWrapper)) {
                                    if (br.this.F instanceof ViewGroup) {
                                        br.this.F.addView(view, 0);
                                    }
                                } else if (view instanceof SurfaceView) {
                                    com.bytedance.android.livesdk.ai.g gVar = br.this.aw;
                                    com.bytedance.android.livesdk.at.f b2 = u.a().b();
                                    h.f.b.l.b(b2, "");
                                    if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getUserRole(b2.c()) == aw.GUEST_AUDIENCE && gVar.f13773b != null && (gVar.f13774c instanceof ViewGroup)) {
                                        ViewGroup viewGroup = gVar.f13774c;
                                        if (viewGroup != null) {
                                            viewGroup.addView(gVar.f13773b);
                                        }
                                        gVar.d();
                                    }
                                    gVar.f13774c = null;
                                    gVar.f13773b = null;
                                }
                            }
                            br.this.aw.dismiss();
                            br.this.aw = null;
                        }
                        if (br.this.v != null) {
                            br.this.v.changeSRSupportScene(true);
                        }
                        br.this.V.c(cm.class, new h.p(false, Integer.valueOf(br.this.C.f15846a.getWidth())));
                        MethodCollector.o(1591);
                        return;
                    }
                    if (br.this.C().d() != null) {
                        br.this.C().d().a();
                    }
                    MethodCollector.o(1591);
                }
            }, 200);
            this.al = null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i
    public final void c(boolean z2) {
        if (!TextUtils.isEmpty(this.ay) || !TextUtils.isEmpty(this.f15997g)) {
            if (!TextUtils.isEmpty(this.ay)) {
                a(this.ay, this.az, this.f15998h, this.aA);
            } else if (!TextUtils.isEmpty(this.f15997g)) {
                a(this.f15997g, this.f15998h, this.aA, this.ax);
            }
            this.aj.f23299c.E = this.af;
            if (z2) {
                ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().c(this.af);
                return;
            }
            com.bytedance.android.live.n.k b2 = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().b(this.af);
            if (b2 != null) {
                b2.a(true, this.af);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        boolean z2;
        boolean z3;
        boolean z4;
        super.onConfigurationChanged(configuration);
        boolean z5 = false;
        this.B = false;
        DataChannel dataChannel = this.V;
        if (dataChannel == null || !((Boolean) dataChannel.b(cn.class)).booleanValue()) {
            int requestedOrientation = getActivity().getRequestedOrientation();
            if ((requestedOrientation == 0 || requestedOrientation == 1) && requestedOrientation != this.n) {
                z2 = true;
                if (this.aF) {
                    this.n = requestedOrientation;
                }
            } else {
                z2 = false;
            }
            if (this.n == 1 && !this.bn.isEmpty()) {
                String str = this.bn;
                if (this.f15994d.getOwner().isSubscribed()) {
                    ((com.bytedance.android.live.o.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.o.a.class)).openUserSubscribeState(getContext(), this.f15994d, str);
                } else {
                    ((com.bytedance.android.live.o.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.o.a.class)).openUserSubscribeEntry(getContext(), this.f15994d, str);
                }
                this.bn = "";
            }
            com.bytedance.android.live.core.f.y.f9119a = requestedOrientation;
            int[] iArr = new int[2];
            com.bytedance.android.d.b bVar = this.v;
            if (bVar != null) {
                if (requestedOrientation == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                bVar.setScreenOrientation(z4);
                this.v.getVideoSize(iArr);
            }
            if (iArr[0] > 0 && iArr[1] > 0) {
                a(iArr[0], iArr[1], (int) n.b(getContext(), (float) configuration.screenWidthDp));
            }
            if (this.aF) {
                this.V.b(ad.class, new an(this.f16003m, this.p));
                if (z2) {
                    this.aF = false;
                    com.bytedance.android.livesdk.chatroom.detail.f fVar = this.u;
                    if (!(fVar == null || fVar.f15239f == null || this.u.f15239f.f15757a == null)) {
                        b(this.u.f15239f.f15757a, true);
                    }
                    com.bytedance.android.livesdk.chatroom.detail.h hVar = this.aD;
                    hVar.f15259c = this.n;
                    hVar.a();
                    if (c.a.f20585a) {
                        IMessageManager iMessageManager = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get();
                        if (requestedOrientation == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        iMessageManager.insertMessage(new com.bytedance.android.livesdk.model.message.av(z3), true);
                    }
                }
                if (this.bd != null) {
                    getContext();
                    this.bd = null;
                }
                ViewGroup viewGroup = this.D;
                if (viewGroup != null) {
                    if (requestedOrientation == 1) {
                        viewGroup.setBackgroundColor(Color.parseColor("#3E3F49"));
                        O();
                    } else {
                        viewGroup.setBackgroundColor(-16777216);
                        HSImageView hSImageView = this.E;
                        if (hSImageView != null) {
                            hSImageView.setVisibility(8);
                        }
                    }
                }
                com.bytedance.android.livesdk.chatroom.d.d a2 = com.bytedance.android.livesdk.chatroom.d.d.a();
                if (requestedOrientation == 0) {
                    z5 = true;
                }
                if (a2.f15203a) {
                    a2.f15211i = z5;
                    if (!z5) {
                        a2.d();
                    }
                }
                this.D.postDelayed(new ci(this, iArr), 50);
                super.onConfigurationChanged(configuration);
            }
        }
    }

    public void onEvent(com.bytedance.android.livesdk.chatroom.c.s sVar) {
        int d2;
        int i2;
        i.b bVar = this.at;
        if (bVar != null) {
            bVar.a(sVar.f15147b);
        }
        if (getContext() != null && this.V != null) {
            boolean z2 = true;
            if (this.n != 1) {
                z2 = false;
            }
            Context context = getContext();
            if (!z2 && com.bytedance.android.livesdk.chatroom.b.a(this.V)) {
                if (sVar.f15147b) {
                    h.p pVar = (h.p) this.V.b(bk.class);
                    if (pVar == null || ((Integer) pVar.getFirst()).intValue() <= 0 || ((Integer) pVar.getSecond()).intValue() <= 0) {
                        d2 = com.bytedance.android.live.core.f.y.d(R.dimen.wm);
                    } else {
                        d2 = com.bytedance.android.live.core.f.y.c() - ((com.bytedance.android.live.core.f.y.b() - (sVar.f15146a + com.bytedance.android.live.core.f.y.d(R.dimen.wp))) * (((Integer) pVar.getFirst()).intValue() / ((Integer) pVar.getSecond()).intValue()));
                        if (com.bytedance.android.live.core.f.d.a(context)) {
                            d2 -= com.bytedance.android.live.core.f.y.d();
                        }
                    }
                    i2 = sVar.f15146a + com.bytedance.android.live.core.f.y.d(R.dimen.wp);
                } else {
                    d2 = com.bytedance.android.live.core.f.y.d(R.dimen.wo);
                    i2 = 0;
                }
                n.a(this.F, -3, d2, i2);
            }
        }
    }

    public final void b(String str) {
        if (TextUtils.equals(com.bytedance.android.livesdk.ab.e.d(), "push")) {
            getParentFragment();
            b.a.a("livesdk_push_error").a(new j.a().a("anchor_id", String.valueOf(this.f15995e)).a("anchor_status", str).a("room_id", String.valueOf(this.f15993c)).f13591a).b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (isResumed() != false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEvent(com.bytedance.android.livesdk.chatroom.c.r r12) {
        /*
        // Method dump skipped, instructions count: 558
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.br.onEvent(com.bytedance.android.livesdk.chatroom.c.r):void");
    }

    /* access modifiers changed from: package-private */
    public final String a(Context context) {
        if (context != null) {
            return getContext().getPackageName();
        }
        if (((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context() != null) {
            return ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context().getPackageName();
        }
        return "";
    }

    public final void b(boolean z2) {
        com.bytedance.android.d.b bVar = this.v;
        if (bVar != null) {
            if (bVar.getDecodeStatus() == 2) {
                a(104, this.v.getMediaErrorMessage(), this.f15993c);
            } else if (this.v.getDecodeStatus() != 1) {
                this.ab.a(this.f15993c);
                a(113, "room cancel", this.f15993c);
            }
            this.v.stop(z2);
            if (this.bi) {
                com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "reset player -> clear share player streamData.");
                EnterRoomConfig enterRoomConfig = this.aj;
                if (enterRoomConfig != null) {
                    enterRoomConfig.f23297a.f23341e = "";
                }
            }
            if (!this.bb) {
                this.v.recycle();
            }
            com.bytedance.android.livesdk.chatroom.g.d.a("PreCreateSurface", "reset player, clear 1px");
            com.bytedance.android.live.n.k b2 = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().b(this.af);
            if (b2 != null) {
                b2.p();
            }
            if (!this.bb) {
                this.v = null;
                this.af = null;
            }
            s();
            com.bytedance.android.livesdkapi.c cVar = this.bg;
            if (cVar != null) {
                cVar.d();
            }
            if (!this.aT) {
                com.bytedance.android.livesdkapi.c cVar2 = this.bg;
                if (cVar2 != null) {
                    cVar2.d();
                }
                c("reset player");
                this.C.a(8);
            }
            this.z = false;
            this.o = false;
            com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "resetPlayer, roomId=" + this.f15993c + ", userId=" + this.f15995e);
            a(0);
        } else if (this.af != null && !this.bb) {
            ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).recycleRoomPlayer(this.af);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z2;
        this.Z = new HashMap<>();
        this.aa = System.currentTimeMillis();
        DataChannel a2 = DataChannel.a.a(ae.a(this, (ad.b) null), this);
        this.V = a2;
        a2.b(bw.class, Boolean.valueOf(this.bm));
        this.V.a(com.bytedance.android.livesdk.j.ao.class, getChildFragmentManager());
        super.onCreate(bundle);
        if (!(bundle == null || this.aj != null || bundle.getParcelable("enter_room_config") == null)) {
            this.aj = (EnterRoomConfig) bundle.getParcelable("enter_room_config");
        }
        if (f.a.f23366a.a().f23354b != null) {
            h.a aVar = new h.a();
            aVar.f13532a = "live_detail";
            aVar.f13536e = (com.bytedance.android.livesdk.ab.c.a) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.ab.c.b.class);
            aVar.f13537f = (com.bytedance.android.livesdk.ab.c.m) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.ab.c.n.class);
            this.V.a(com.bytedance.android.livesdk.ab.c.i.class, aVar.a());
            EnterRoomConfig enterRoomConfig = this.aj;
            if (enterRoomConfig == null || com.bytedance.common.utility.m.a(enterRoomConfig.f23299c.W)) {
                com.bytedance.android.livesdk.ab.d.c("full_screen");
            } else {
                com.bytedance.android.livesdk.ab.d.c(this.aj.f23299c.W);
            }
        }
        long j2 = this.aj.f23298b.u;
        if (j2 > 0) {
            com.bytedance.android.livesdk.ab.i.b();
            com.bytedance.android.livesdk.ab.i.a("ttlive_portal", "entering target room, portalId=".concat(String.valueOf(j2)));
        }
        DataChannel dataChannel = this.V;
        EnterRoomConfig enterRoomConfig2 = this.aj;
        h.f.b.l.d(enterRoomConfig2, "");
        if (dataChannel != null) {
            dataChannel.a(com.bytedance.android.livesdk.j.bk.class, enterRoomConfig2.f23299c.p);
            dataChannel.a(aj.class, Boolean.valueOf(enterRoomConfig2.f23299c.o));
            dataChannel.a(bj.class, enterRoomConfig2.f23299c.f23333l);
            dataChannel.a(bi.class, enterRoomConfig2.f23299c.f23334m);
        }
        if (this.aj.f23299c.R > 0) {
            this.f15993c = this.aj.f23299c.R;
        }
        if (!com.bytedance.common.utility.m.a(this.aj.f23299c.D)) {
            try {
                this.f15995e = Long.parseLong(this.aj.f23299c.D.trim());
            } catch (NumberFormatException e2) {
                com.bytedance.android.live.core.c.a.b(e2.getMessage());
            }
        }
        if (this.aj.f23299c.an <= 0) {
            this.aj.f23299c.an = this.f15993c;
        }
        if (this.aj.f23299c.ao <= 0) {
            long j3 = this.f15995e;
            if (j3 <= 0 && !TextUtils.isEmpty(this.aj.f23298b.f23310b)) {
                try {
                    j3 = Long.parseLong(this.aj.f23298b.f23310b);
                } catch (Exception unused) {
                }
            }
            this.aj.f23299c.ao = j3;
        }
        this.f15996f = this.aj.f23299c.y;
        this.f15997g = this.aj.f23297a.f23338b;
        this.ax = this.aj.f23297a.f23339c;
        this.ay = this.aj.f23297a.f23340d;
        this.az = this.aj.f23297a.f23342f;
        this.f15998h = com.bytedance.android.livesdkapi.depend.model.live.i.valueOf(this.aj.f23297a.f23346j);
        LivePerformanceManager.getInstance().setStreamType(this.f15998h);
        this.aA = new s.a(this.aj.f23297a.f23343g, this.aj.f23297a.f23344h, this.aj.f23297a.f23345i);
        if (!(this.f15993c == 0 && this.f15995e == 0)) {
            this.r = p.INITIALIZED;
        }
        this.ae = false;
        this.O = false;
        this.P = false;
        this.M = this.aj.f23298b.f23309a;
        this.aO = this.aj.f23298b.f23319k;
        this.aP = this.aj.f23299c.ad;
        String str = this.aj.f23299c.s;
        String str2 = this.aj.f23299c.J;
        String str3 = this.aj.f23299c.L;
        String str4 = this.aj.f23299c.z;
        String str5 = this.aj.f23299c.X;
        String str6 = this.aj.f23299c.Z;
        this.f15999i = this.aj.f23299c.f23329h;
        this.aj.f23299c.f23329h = false;
        this.f16002l = this.aj.f23299c.f23327f;
        this.aj.f23299c.f23327f = false;
        this.f16000j = this.aj.f23299c.f23328g;
        this.aj.f23299c.f23328g = 0;
        this.f16001k = this.aj.f23298b.t;
        this.aj.f23298b.t = "";
        this.aB = this.aj.f23299c.f23326e;
        this.aj.f23299c.f23326e = false;
        if (this.aN == null && !com.bytedance.common.utility.m.a(this.aj.f23298b.f23315g)) {
            this.aN = this.aj.f23298b.f23315g;
        }
        if (this.aO == 0 && this.aj.f23298b.f23319k != 0) {
            this.aO = this.aj.f23298b.f23319k;
        }
        com.bytedance.android.livesdk.chatroom.detail.j jVar = new com.bytedance.android.livesdk.chatroom.detail.j(getContext(), this.M, this.aN, this.aO, str4, str5, this.aj, str2, str3);
        this.s = jVar;
        long j4 = this.f15993c;
        if (this.f15998h == com.bytedance.android.livesdkapi.depend.model.live.i.AUDIO) {
            z2 = true;
        } else {
            z2 = false;
        }
        jVar.a(j4, z2, this.f15995e, (com.bytedance.android.livesdkapi.depend.model.live.p) null);
        this.s.z = this.aP;
        this.s.C = str;
        this.s.E = str6;
        this.ab = new l();
        this.aE = new q();
        if (f15991a.booleanValue()) {
            com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "onCreate -> roomId=" + this.f15993c + ", userId=" + this.f15995e);
        }
        this.Z.put("time", String.valueOf(System.currentTimeMillis() - this.aa));
        this.Z.put("location", "finish live play oncreate");
        ((com.bytedance.android.livesdkapi.host.g) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.g.class)).a("feed_enter_room", this.Z);
        DataChannel dataChannel2 = this.V;
        if (dataChannel2 != null) {
            EnterRoomConfig enterRoomConfig3 = f.a.f23366a.a().f23354b;
            boolean z3 = enterRoomConfig3.f23299c.O;
            String str7 = enterRoomConfig3.f23299c.Q;
            if (z3) {
                Room room = (Room) dataChannel2.b(df.class);
                if (room != null && room.isOfficial()) {
                    z3 = false;
                }
                String str8 = enterRoomConfig3.f23299c.P;
                String str9 = enterRoomConfig3.f23299c.A;
                dataChannel2.a(by.class, Boolean.valueOf(z3));
                dataChannel2.a(com.bytedance.android.livesdk.j.bv.class, str7);
                dataChannel2.a(ca.class, str9);
                dataChannel2.a(bz.class, str8);
            }
        }
        Boolean valueOf = Boolean.valueOf(LiveTestEnableRoomStreamToastSetting.INSTANCE.getValue());
        if (valueOf != null && valueOf.booleanValue() && (!TextUtils.isEmpty(this.ay) || !TextUtils.isEmpty(this.f15997g))) {
            ao.a(com.bytedance.android.live.core.f.y.e(), "Stream FOUND. ".concat(String.valueOf(str2)), 0);
        }
        if (getActivity() instanceof com.bytedance.android.livesdkapi.c) {
            this.bg = (com.bytedance.android.livesdkapi.c) getActivity();
        }
        String str10 = this.aj.f23299c.E;
        if (str10 != null) {
            this.af = str10;
        }
        this.bi = !TextUtils.isEmpty(this.aj.f23297a.f23341e);
        this.bp = new BroadcastReceiver() {
            /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass7 */

            static {
                Covode.recordClassIndex(8866);
            }

            public final void onReceive(Context context, Intent intent) {
                if (intent != null && "media_control".equals(intent.getAction())) {
                    int intExtra = intent.getIntExtra("control_type", 0);
                    if (intExtra != 1) {
                        if (intExtra == 2 && br.this.v != null) {
                            br.this.v.setMute(false);
                            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.event.i(false, false));
                        }
                    } else if (br.this.v != null) {
                        br.this.v.setMute(true);
                        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.event.i(true, false));
                    }
                }
            }
        };
        if (getContext() != null) {
            b(getContext(), this.bp, new IntentFilter("media_control"));
            com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", "registerReceiver");
        }
        this.av = new com.bytedance.android.livesdk.ai.f();
        E().put("param_live_create_time", new StringBuilder().append(System.currentTimeMillis()).toString());
        b.a.a("live_room_ctr").a(this, 2);
        this.bf = com.bytedance.android.d.a.a(this.f15993c);
        aq.clear();
    }

    public void onEvent(com.bytedance.android.livesdk.chatroom.c.u uVar) {
        if (this.r == p.LIVE_STARTED) {
            if (uVar.f15152c != null) {
                LiveCoreSDKData.Quality quality = uVar.f15152c;
                if (this.r == p.LIVE_STARTED) {
                    this.z = true;
                    this.v.switchResolution(quality.sdkKey);
                    ao.a(com.bytedance.android.live.core.f.y.e(), getString(R.string.gv1), 0);
                    return;
                }
                return;
            }
            String str = uVar.f15150a;
            String str2 = uVar.f15151b;
            if (!TextUtils.isEmpty(str)) {
                this.z = true;
                this.v.stop(false);
                this.v.recycle();
                this.v = null;
                a(str, this.f15998h, this.aA, str2);
                ao.a(com.bytedance.android.live.core.f.y.e(), getString(R.string.gv1), 0);
            }
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        String f16045a;

        /* renamed from: b  reason: collision with root package name */
        String f16046b;

        static {
            Covode.recordClassIndex(8870);
        }

        public b(int i2, String str) {
            this.f16045a = String.valueOf(i2);
            this.f16046b = str;
        }
    }

    private void a(com.bytedance.android.livesdkapi.depend.model.live.i iVar, List<String> list) {
        HSImageView hSImageView;
        if (!this.aQ || TextUtils.equals(this.aj.f23299c.aa, "inner_draw")) {
            hSImageView = this.aH;
        } else {
            hSImageView = this.E;
        }
        if (iVar == com.bytedance.android.livesdkapi.depend.model.live.i.AUDIO) {
            hSImageView.setBackgroundResource(R.drawable.bx4);
        } else if (com.bytedance.common.utility.h.b(list)) {
            k.a(hSImageView, new ImageModel(null, list), new z(5, ((float) n.a(getContext())) / ((float) n.b(getContext()))));
        } else {
            k.a(hSImageView, "res://" + a(getContext()) + "/2131234492");
        }
    }

    private void a(long j2, f.a aVar) {
        String str;
        String str2;
        String str3;
        if (this.u == null) {
            String str4 = "";
            com.bytedance.android.livesdk.chatroom.detail.j jVar = this.s;
            if (jVar != null) {
                if (!TextUtils.isEmpty(jVar.E)) {
                    str4 = this.s.E;
                } else if (!TextUtils.isEmpty(this.s.v)) {
                    if (TextUtils.isEmpty(this.s.w)) {
                        str4 = this.s.v;
                    } else {
                        str4 = this.s.v + "-" + this.s.w;
                    }
                }
                str = this.s.t;
                str2 = this.s.f15277h;
                str3 = this.s.u;
            } else {
                str = this.aj.f23299c.ab;
                str2 = this.aj.f23299c.z;
                str3 = this.aj.f23299c.X;
                if (!TextUtils.isEmpty(this.aj.f23299c.Z)) {
                    str4 = this.aj.f23299c.Z;
                } else if (!TextUtils.isEmpty(this.aj.f23299c.J)) {
                    if (TextUtils.isEmpty(this.aj.f23299c.L)) {
                        str4 = this.aj.f23299c.J;
                    } else {
                        str4 = this.aj.f23299c.J + "-" + this.aj.f23299c.L;
                    }
                }
            }
            com.bytedance.android.livesdk.chatroom.detail.f fVar = new com.bytedance.android.livesdk.chatroom.detail.f(aVar, j2, this.M, str, str2, str3, str4, this.aj.f23298b.f23314f);
            this.u = fVar;
            fVar.a();
            com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "startEnterRoom -> roomId=" + this.f15993c + ", userId=" + this.f15995e);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(Room room, boolean z2) {
        boolean z3;
        String str;
        if (((Boolean) this.V.b(cn.class)).booleanValue()) {
            com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", "hide abs interaction fragment");
            n.a(this.ac.findViewById(R.id.b94), 8);
        }
        String str2 = this.aj.f23298b.f23309a;
        this.M = str2;
        room.setRequestId(str2);
        room.setLog_pb(this.aN);
        room.setUserFrom(this.aO);
        this.V.b(df.class, room);
        this.V.a(com.bytedance.android.livesdk.ay.class, this.s);
        com.bytedance.android.d.b bVar = this.v;
        if (bVar == null || !bVar.isVideoHorizontal()) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f16003m = z3;
        this.V.b(com.bytedance.android.live.n.ad.class, new an(this.f16003m, this.p));
        if (this.n == 1) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        room.setRoomOrientation(str);
        this.V.a(ai.class, this.aj.f23299c.aF);
        if (!TextUtils.isEmpty(this.aj.f23299c.aF)) {
            this.aj.f23299c.aF = "";
        }
        if (this.J != null) {
            this.V.a(am.class, (Object) false);
            return;
        }
        e(z2);
        this.J.b(new cb(this));
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Room room;
        MethodCollector.i(273);
        super.onViewCreated(view, bundle);
        this.ac = view;
        this.C = new com.bytedance.android.livesdk.chatroom.ui.a.a(view.findViewById(R.id.fhs));
        this.D = (ViewGroup) view.findViewById(R.id.fht);
        if (this.C.f15846a instanceof com.bytedance.android.livesdkapi.view.e) {
            this.C.b(2);
            ((com.bytedance.android.livesdkapi.view.e) this.C.f15846a).setDataChannel(this.V);
        }
        this.aH = (HSImageView) view.findViewById(R.id.cbx);
        this.E = (HSImageView) view.findViewById(R.id.cby);
        if (Build.VERSION.SDK_INT >= 23 && getContext() != null) {
            this.aH.setForeground(new ColorDrawable(androidx.core.content.b.c(getContext(), R.color.bk)));
            this.E.setForeground(new ColorDrawable(androidx.core.content.b.c(getContext(), R.color.bk)));
        }
        this.aI = (HSImageView) view.findViewById(R.id.cd5);
        this.aJ = view.findViewById(R.id.cd6);
        this.F = (ViewGroup) view.findViewById(R.id.ce7);
        this.G = (HSImageView) view.findViewById(R.id.dgo);
        this.I = view.findViewById(R.id.dgp);
        this.R = view.findViewById(R.id.ckw);
        com.bytedance.android.livesdkapi.depend.model.live.i iVar = this.f15998h;
        List<String> list = this.f15996f;
        com.bytedance.android.live.n.k b2 = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().b(this.af);
        if (this.bi && b2 != null && b2.f()) {
            this.aH.setVisibility(8);
            if (!this.am) {
                this.E.setVisibility(8);
            }
        }
        com.bytedance.android.livesdkapi.c cVar = this.bg;
        if (cVar != null) {
            cVar.d();
        }
        a(iVar, list);
        c("init");
        this.C.a(8);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.cde);
        this.H = linearLayout;
        this.aK = (HSAnimImageView) linearLayout.findViewById(R.id.d2a);
        ((LiveTextView) this.H.findViewById(R.id.d2d)).a(R.style.tk);
        ((LiveTextView) this.H.findViewById(R.id.d2c)).a(R.style.to);
        this.ag = view.findViewById(R.id.cdi);
        this.bh = view.findViewById(R.id.cdj);
        LivePerformanceManager.getInstance().setIsAnchor(false);
        if (this.bi) {
            com.bytedance.android.live.n.k b3 = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().b(this.af);
            if (b3 == null || b3.o() == null) {
                this.bi = false;
                this.C.b(2);
            } else {
                View o2 = b3.o();
                int width = o2.getWidth();
                int height = o2.getHeight();
                b3.a(false, o2.getContext());
                if (o2.getParent() instanceof ViewGroup) {
                    ((ViewGroup) o2.getParent()).removeView(o2);
                }
                ViewGroup.LayoutParams b4 = this.C.b();
                if (width >= height) {
                    if (b4 instanceof FrameLayout.LayoutParams) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b4;
                        layoutParams.gravity = 1;
                        layoutParams.topMargin = com.bytedance.android.live.core.f.y.a(f15992b);
                    }
                    if (this.aj.f23300d.f23304b != null) {
                        this.f15996f = this.aj.f23300d.f23304b;
                    }
                    O();
                } else if (b4 instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) b4).gravity = 17;
                }
                o2.setLayoutParams(b4);
                this.F.addView(o2, 0);
                com.bytedance.android.livesdk.chatroom.ui.a.a aVar = this.C;
                h.f.b.l.d(o2, "");
                aVar.f15846a = o2;
                if (EnableReusePlayerWithoutFirstFrameSetting.INSTANCE.getValue() && !b3.f()) {
                    s();
                }
                if (width < height) {
                    this.C.a(0);
                    this.C.b(2);
                } else {
                    this.C.b(0);
                }
                b3.h(true);
                if (EnableReusePlayerWithoutFirstFrameSetting.INSTANCE.getValue() && !b3.f()) {
                    a("share");
                }
                ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) f.a.t.b((Object) 1).e(InteractFirstFrameTimeOutDurationSetting.DEFAULT, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b((f.a.d.f) new bs(this)).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((Fragment) this))).a();
            }
        } else {
            this.C.b(2);
        }
        com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "share player -> is keep surfaceTexture? " + (this.C.f15846a instanceof com.bytedance.android.livesdkapi.view.g));
        if (this.aj.f23299c.f23323b) {
            com.bytedance.android.live.n.k b5 = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().b(this.af);
            if (b5 != null) {
                b5.a(this.C.a());
                com.bytedance.android.livesdk.chatroom.g.d.a("PreCreateSurface", "onViewCreated TextureView ready, will clear 1px");
                b5.p();
            }
            this.aj.f23299c.f23323b = false;
        }
        this.aY = System.currentTimeMillis();
        if (TestDisablePullStreamInfoSetting.INSTANCE.getValue()) {
            RecyclableWidgetManager of = RecyclableWidgetManager.of((Fragment) this, this.ac, false, (IWidgetProvider) LiveWidgetProvider.getInstance(), (FluencyOpt) com.bytedance.android.live.u.h.f12831c, com.bytedance.android.live.u.h.e());
            this.W = of;
            of.load(R.id.ecn, ((com.bytedance.android.live.f.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.a.class)).getStreamInfoWidget());
        }
        if (G()) {
            Room room2 = this.f15994d;
            if (room2 == null || room2.mRoomAuthStatus == null || this.f15994d.getCover() == null || this.f15994d.getOwner() == null) {
                EnterRoomConfig enterRoomConfig = this.aj;
                if (enterRoomConfig == null || EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1) {
                    room = new Room();
                } else {
                    room = (Room) e.a.f9628b.a(enterRoomConfig.f23299c.f23322a, Room.class);
                    if (room == null) {
                        room = new Room();
                    }
                }
                room.setId(this.aj.f23299c.an);
                room.setOwnerUserId(this.aj.f23299c.ao);
            } else {
                room = this.f15994d;
            }
            b(room, false);
        }
        b();
        if (com.bytedance.android.livesdkapi.depend.model.live.f.f23137c.booleanValue() && com.bytedance.android.livesdkapi.depend.model.live.f.f23135a == null) {
            com.bytedance.android.livesdk.chatroom.b.f.b(this.Y);
        }
        a((Room) null);
        if (getUserVisibleHint()) {
            com.bytedance.android.livesdk.drawerfeed.f.a(getActivity(), Boolean.valueOf(F()));
        }
        MethodCollector.o(273);
    }

    public final void a(int i2, String str, long j2) {
        T();
        l lVar = this.ab;
        if (lVar != null) {
            lVar.a(i2, str, j2);
        }
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.br.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z2;
        int i2;
        String str = this.aj.f23299c.J + "-" + this.aj.f23299c.L;
        if (TextUtils.equals(str, "homepage_hot-live_cell") || TextUtils.equals(str, "homepage_follow-live_cell")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!LiveUseSurfaceViewExperiment.INSTANCE.isEnable() || !z2) {
            i2 = R.layout.b9j;
        } else {
            i2 = R.layout.b9k;
        }
        View a2 = com.bytedance.android.b.a(i2, viewGroup);
        com.bytedance.android.livesdk.watch.h.a();
        ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).onPlayFragmentCreate();
        if (this.aj.f23300d.f23303a) {
            if (Build.VERSION.SDK_INT >= 23) {
                a2.findViewById(R.id.ffl).setForeground(null);
            }
            a2.findViewById(R.id.ffl).setAlpha(0.0f);
        } else {
            a2.findViewById(R.id.ffl).setAlpha(1.0f);
            if (Build.VERSION.SDK_INT >= 23) {
                a2.findViewById(R.id.ffl).setForeground(new ColorDrawable(Color.parseColor("#a3000000")));
            }
        }
        return a2;
    }

    private void a(String str, com.bytedance.android.livesdkapi.depend.model.live.i iVar, s.a aVar, String str2) {
        if (this.v == null) {
            if (this.C == null) {
                com.ss.a.a.a.e("LivePlayFragment", "startPlayer mVideoView is null");
                return;
            }
            com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "startPlayer -> roomId=" + this.f15993c + ", userId=" + this.f15995e);
            boolean z2 = false;
            this.C.a(0);
            if (!this.z && !this.aQ && !this.ai) {
                c("start player");
            }
            if (this.bi) {
                if (this.C.f15846a.getContext() != null) {
                    this.v = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).ensureRoomPlayer(this.f15993c, str, iVar, aVar, this.C.a(), this.bo, this.C.f15846a.getContext(), str2, this.af);
                } else {
                    return;
                }
            } else if (getContext() != null) {
                this.v = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).ensureRoomPlayer(this.f15993c, str, iVar, aVar, this.C.a(), this.bo, getContext(), str2, this.af);
            } else {
                return;
            }
            com.bytedance.android.d.b bVar = this.v;
            if (bVar instanceof com.bytedance.android.d.c) {
                this.af = ((com.bytedance.android.d.c) bVar).getPlayerTag();
                this.aj.f23299c.E = this.af;
            }
            this.v.setEnterRoomScene(this.aj.f23299c.aa);
            M();
            this.v.start();
            this.v.setAnchorInteractMode(this.o);
            com.bytedance.android.d.b bVar2 = this.v;
            if (this.n == 1) {
                z2 = true;
            }
            bVar2.setScreenOrientation(z2);
            L();
            if (!K()) {
                s();
            } else if ((this.aU || this.bb) && com.bytedance.common.utility.m.a("inner_draw", this.aj.f23299c.aa)) {
                Handler handler = this.Y;
                handler.sendMessageDelayed(Message.obtain(handler, 37), (long) this.aV);
            } else if (this.aW > 0) {
                Handler handler2 = this.Y;
                handler2.sendMessageDelayed(Message.obtain(handler2, 37), (long) this.aW);
            } else {
                r();
            }
        }
    }

    private void a(String str, String str2, com.bytedance.android.livesdkapi.depend.model.live.i iVar, s.a aVar) {
        if (this.v == null) {
            if (this.C == null) {
                com.ss.a.a.a.e("LivePlayFragment", "startPlayer  mVideoView is null");
                return;
            }
            com.bytedance.android.livesdk.chatroom.g.d.a("LivePlayFragment", "startPlayer, roomId=" + this.f15993c + ", userId=" + this.f15995e);
            boolean z2 = false;
            this.C.a(0);
            if (!this.z && !this.aQ && !this.ai) {
                c("start player");
            }
            if (this.bi) {
                if (this.C.f15846a.getContext() != null) {
                    this.v = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).ensureRoomPlayer(this.f15993c, str, str2, iVar, aVar, this.C.a(), this.bo, this.C.f15846a.getContext(), this.af);
                } else {
                    return;
                }
            } else if (getContext() != null) {
                this.v = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).ensureRoomPlayer(this.f15993c, str, str2, iVar, aVar, this.C.a(), this.bo, getContext(), this.af);
            } else {
                return;
            }
            com.bytedance.android.d.b bVar = this.v;
            if (bVar instanceof com.bytedance.android.d.c) {
                this.af = ((com.bytedance.android.d.c) bVar).getPlayerTag();
                this.aj.f23299c.E = this.af;
            }
            this.v.setEnterRoomScene(this.aj.f23299c.aa);
            M();
            com.bytedance.android.livesdk.chatroom.detail.j jVar = this.s;
            if (jVar != null) {
                jVar.F = SystemClock.elapsedRealtime();
            }
            this.v.start();
            this.v.setAnchorInteractMode(this.o);
            com.bytedance.android.d.b bVar2 = this.v;
            if (this.n == 1) {
                z2 = true;
            }
            bVar2.setScreenOrientation(z2);
            L();
            if (!K()) {
                s();
            } else if ((this.aU || this.bb) && com.bytedance.common.utility.m.a("inner_draw", this.aj.f23299c.aa)) {
                Handler handler = this.Y;
                handler.sendMessageDelayed(Message.obtain(handler, 37), (long) this.aV);
            } else if (this.aW > 0) {
                Handler handler2 = this.Y;
                handler2.sendMessageDelayed(Message.obtain(handler2, 37), (long) this.aW);
            } else {
                r();
            }
        }
    }
}

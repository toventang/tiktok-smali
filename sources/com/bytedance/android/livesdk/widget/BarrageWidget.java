package com.bytedance.android.livesdk.widget;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.chatroom.b.f;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdk.chatroom.model.c;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.model.AbsBarrageWidget;
import com.bytedance.android.livesdk.model.message.cc;
import com.bytedance.android.livesdk.model.message.p;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.barrage.b.a;
import com.ss.ugc.live.barrage.view.BarrageLayout;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class BarrageWidget extends AbsBarrageWidget implements bq, au, OnMessageListener {

    /* renamed from: i  reason: collision with root package name */
    private static final TypedArray f22454i;

    /* renamed from: j  reason: collision with root package name */
    private static final Bitmap[] f22455j;

    /* renamed from: a  reason: collision with root package name */
    final List<Bitmap> f22456a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public a f22457b;

    /* renamed from: c  reason: collision with root package name */
    public int f22458c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22459d = false;

    /* renamed from: e  reason: collision with root package name */
    public String f22460e;

    /* renamed from: f  reason: collision with root package name */
    public Room f22461f;

    /* renamed from: g  reason: collision with root package name */
    boolean f22462g;

    /* renamed from: h  reason: collision with root package name */
    public String f22463h = null;

    /* renamed from: k  reason: collision with root package name */
    private final Random f22464k = new Random();

    /* renamed from: l  reason: collision with root package name */
    private final List<cc> f22465l = new CopyOnWriteArrayList();

    /* renamed from: m  reason: collision with root package name */
    private IMessageManager f22466m;
    private com.bytedance.android.livesdk.chatroom.a.b.a n;
    private BarrageLayout o;
    private BarrageLayout p;
    private Runnable q = new Runnable() {
        /* class com.bytedance.android.livesdk.widget.BarrageWidget.AnonymousClass1 */

        static {
            Covode.recordClassIndex(13260);
        }

        public final void run() {
            if (BarrageWidget.this.isViewValid()) {
                HashMap hashMap = new HashMap();
                hashMap.put("live_source", BarrageWidget.this.f22460e);
                hashMap.put("request_id", BarrageWidget.this.f22461f.getRequestId());
                hashMap.put("log_pb", BarrageWidget.this.f22461f.getLog_pb());
                hashMap.put("like_amount", String.valueOf(BarrageWidget.this.f22458c));
                hashMap.put("source", new StringBuilder().append(BarrageWidget.this.f22461f.getUserFrom()).toString());
                if (!m.a(d.a().e())) {
                    hashMap.put("enter_live_method", d.a().e());
                }
                String g2 = e.g();
                if (TextUtils.isEmpty(g2) || !"click_push_live_cd_user".equals(g2)) {
                    hashMap.put("is_subscribe", "0");
                } else {
                    hashMap.put("is_subscribe", "1");
                }
                if (y.f()) {
                    hashMap.put("room_orientation", "portrait");
                } else {
                    hashMap.put("room_orientation", "landscape");
                }
                long j2 = 0;
                if (DataChannelGlobal.f34575d.b(ac.class) != null) {
                    j2 = ((Room) DataChannelGlobal.f34575d.b(ac.class)).getOwnerUserId();
                }
                long j3 = b.a.a().f9941f;
                if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isInCoHost()) {
                    hashMap.put("connection_type", "anchor");
                    hashMap.put("channel_id", String.valueOf(b.a.a().f9940e));
                    hashMap.put("invitee_list", ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getCurrentInviteeList());
                    if (b.a.a().q) {
                        hashMap.put("connection_inviter_id", String.valueOf(j2));
                        hashMap.put("connection_invitee_id", String.valueOf(j3));
                    } else {
                        hashMap.put("connection_invitee_id", String.valueOf(j2));
                        hashMap.put("connection_inviter_id", String.valueOf(j3));
                    }
                }
                if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isRoomInBattle()) {
                    hashMap.put("connection_type", "manual_pk");
                    hashMap.put("pk_id", String.valueOf(b.a.a().ai));
                    if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isBattleStarter()) {
                        hashMap.put("pk_inviter_id", String.valueOf(j2));
                        hashMap.put("pk_invitee_id", String.valueOf(j3));
                    } else {
                        hashMap.put("pk_invitee_id", String.valueOf(j2));
                        hashMap.put("pk_inviter_id", String.valueOf(j3));
                    }
                }
                if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isInMultiGuest()) {
                    hashMap.put("connection_type", "audience");
                }
                hashMap.put("admin_type", com.bytedance.android.livesdk.utils.ac.a(BarrageWidget.this.f22461f, BarrageWidget.this.dataChannel));
                b.a.a("like").a((Map<String, String>) hashMap).b("live_interact").a(BarrageWidget.this.dataChannel).b();
                if (BarrageWidget.this.f22461f != null && !BarrageWidget.this.f22461f.isOfficial()) {
                    f.f14958a.a(BarrageWidget.this.f22461f.getId(), BarrageWidget.this.f22458c, BarrageWidget.this.f22461f.getLabels(), BarrageWidget.this.f22463h);
                }
                BarrageWidget.this.f22463h = null;
                BarrageWidget.this.f22458c = 0;
                BarrageWidget.this.f22459d = false;
            }
        }
    };

    interface BarrageResourceApi {
        static {
            Covode.recordClassIndex(13263);
        }

        @h(a = "/webcast/room/digg/icon/list/")
        t<com.bytedance.android.live.network.response.d<c>> fetchResource(@z(a = "room_id") long j2);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bbd;
    }

    @Override // com.bytedance.android.livesdk.model.AbsBarrageWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    /* renamed from: com.bytedance.android.livesdk.widget.BarrageWidget$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f22469a;

        static {
            Covode.recordClassIndex(13262);
            int[] iArr = new int[com.bytedance.android.livesdk.model.message.a.a.values().length];
            f22469a = iArr;
            try {
                iArr[com.bytedance.android.livesdk.model.message.a.a.DIGG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        Covode.recordClassIndex(13259);
        TypedArray obtainTypedArray = y.a().obtainTypedArray(R.array.av);
        f22454i = obtainTypedArray;
        f22455j = new Bitmap[obtainTypedArray.length()];
    }

    public final void a() {
        a aVar;
        int i2;
        MethodCollector.i(3788);
        if (!isViewValid() || this.p == null || (aVar = this.f22457b) == null || aVar.b() >= 10 || this.f22465l.isEmpty()) {
            MethodCollector.o(3788);
            return;
        }
        cc remove = this.f22465l.remove(0);
        boolean a2 = com.bytedance.android.live.uikit.c.a.a(this.context);
        LayoutInflater from = LayoutInflater.from(this.context);
        if (a2) {
            i2 = R.layout.bbc;
        } else {
            i2 = R.layout.bbb;
        }
        this.f22457b.a(new com.bytedance.android.livesdk.chatroom.a.c.a(from.inflate(i2, (ViewGroup) null), remove).f14898b, remove.c());
        MethodCollector.o(3788);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        IMessageManager iMessageManager = this.f22466m;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        BarrageLayout barrageLayout = this.p;
        if (barrageLayout != null) {
            barrageLayout.a();
        }
        if (this.p != null) {
            this.o.a();
        }
        this.f22458c = 0;
        this.f22459d = false;
        this.f22465l.clear();
        this.f22462g = false;
        for (Bitmap bitmap : this.f22456a) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        this.f22456a.clear();
        Bitmap[] bitmapArr = f22455j;
        for (Bitmap bitmap2 : bitmapArr) {
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        com.bytedance.android.live.core.c.a.a(3, getClass().getName(), th.toString());
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        this.f22461f = (Room) this.dataChannel.b(df.class);
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.b(cg.class);
        this.f22466m = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.DIGG.getIntType(), this);
            this.f22466m.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.SCREEN.getIntType(), this);
        }
        ((com.bytedance.android.livesdk.utils.b.b) ((BarrageResourceApi) com.bytedance.android.live.network.e.a().a(BarrageResourceApi.class)).fetchResource(this.f22461f.getId()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new com.bytedance.android.livesdk.utils.b.c())).a(2).a(getAutoUnbindTransformer()).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), c.f22607a);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        String str;
        int i2 = 0;
        if (com.ss.android.ugc.aweme.bf.d.a(this.context, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.f22460e = str;
        this.p = (BarrageLayout) findViewById(R.id.rj);
        if (com.bytedance.android.live.uikit.c.a.a(this.context)) {
            this.f22457b = new com.ss.ugc.live.barrage.b.b(this.p, y.d(R.dimen.wt));
        } else {
            this.f22457b = new com.ss.ugc.live.barrage.b.c(this.p, y.d(R.dimen.wt));
        }
        a aVar = this.f22457b;
        AnonymousClass2 r1 = new a.AbstractC4100a() {
            /* class com.bytedance.android.livesdk.widget.BarrageWidget.AnonymousClass2 */

            static {
                Covode.recordClassIndex(13261);
            }

            @Override // com.ss.ugc.live.barrage.b.a.AbstractC4100a
            public final void a() {
                if (BarrageWidget.this.f22457b.b() == 1) {
                    LivePerformanceManager.getInstance().onModuleStart("barrage", null);
                }
                LivePerformanceManager.getInstance().monitorPerformance("show_barrage");
            }

            @Override // com.ss.ugc.live.barrage.b.a.AbstractC4100a
            public final void b() {
                if (BarrageWidget.this.f22457b.b() == 0) {
                    LivePerformanceManager.getInstance().onModuleStop("barrage");
                }
                BarrageWidget.this.a();
            }
        };
        l.c(r1, "");
        aVar.f154088g = r1;
        BarrageLayout.a(this.p, this.f22457b);
        this.o = (BarrageLayout) findViewById(R.id.am6);
        com.bytedance.android.livesdk.chatroom.a.b.a aVar2 = new com.bytedance.android.livesdk.chatroom.a.b.a(this.o, 1400);
        this.n = aVar2;
        BarrageLayout.a(this.o, aVar2);
        do {
            Path path = new Path();
            path.moveTo((float) y.a(94.0f), (float) y.a(150.0f));
            float f2 = (float) (((i2 - 5) * 8) + 94);
            path.quadTo((float) y.a(f2), (float) y.a(150.0f), (float) y.a(f2), (float) y.a(40.0f));
            this.n.a(path);
            i2++;
        } while (i2 < 10);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        Bitmap bitmap;
        MethodCollector.i(3786);
        if (!isViewValid()) {
            MethodCollector.o(3786);
        } else if (iMessage instanceof p) {
            p pVar = (p) iMessage;
            com.bytedance.android.live.base.model.user.b a2 = u.a().b().a();
            if (pVar.f19668h == null || a2 == null || a2.getId() != pVar.f19668h.getId()) {
                if (AnonymousClass3.f22469a[pVar.L.ordinal()] == 1) {
                    if (com.bytedance.android.livesdk.b.a.d.a().n.booleanValue() || !isViewValid()) {
                        MethodCollector.o(3786);
                        return;
                    } else if (this.n.b() < 24) {
                        if (!this.f22462g || com.bytedance.common.utility.h.a(this.f22456a)) {
                            TypedArray typedArray = f22454i;
                            if (typedArray.length() > 0) {
                                int nextInt = this.f22464k.nextInt(typedArray.length());
                                Bitmap[] bitmapArr = f22455j;
                                if (bitmapArr[nextInt] == null || bitmapArr[nextInt].isRecycled()) {
                                    bitmapArr[nextInt] = BitmapFactory.decodeResource(this.context.getResources(), typedArray.getResourceId(nextInt, 0));
                                }
                                bitmap = bitmapArr[nextInt];
                            }
                        } else {
                            bitmap = this.f22456a.get(this.f22464k.nextInt(this.f22456a.size()));
                        }
                        if (bitmap != null && !bitmap.isRecycled()) {
                            this.n.a((com.ss.ugc.live.barrage.a.a) new com.bytedance.android.livesdk.chatroom.a.a.a(bitmap, this.f22464k.nextDouble()), false);
                        }
                    }
                }
                MethodCollector.o(3786);
                return;
            }
            MethodCollector.o(3786);
        } else {
            if (iMessage instanceof cc) {
                cc ccVar = (cc) iMessage;
                if (this.f22465l.size() >= 200) {
                    Iterator<cc> it = this.f22465l.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        cc next = it.next();
                        if (!next.c()) {
                            this.f22465l.remove(next);
                            break;
                        }
                    }
                }
                if (this.f22465l.size() >= 200) {
                    List<cc> list = this.f22465l;
                    list.remove(list.size() - 1);
                }
                if (ccVar.c()) {
                    this.f22465l.add(0, ccVar);
                } else {
                    this.f22465l.add(ccVar);
                }
                a();
            }
            MethodCollector.o(3786);
        }
    }
}

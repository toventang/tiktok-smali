package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.t;
import com.bytedance.android.live.n.v;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.b.j;
import com.bytedance.android.livesdk.chatroom.c.ac;
import com.bytedance.android.livesdk.chatroom.c.aj;
import com.bytedance.android.livesdk.chatroom.c.ak;
import com.bytedance.android.livesdk.chatroom.c.g;
import com.bytedance.android.livesdk.chatroom.c.s;
import com.bytedance.android.livesdk.chatroom.e.l;
import com.bytedance.android.livesdk.chatroom.ui.b.c;
import com.bytedance.android.livesdk.chatroom.ui.cy;
import com.bytedance.android.livesdk.chatroom.ui.dq;
import com.bytedance.android.livesdk.chatroom.widget.a;
import com.bytedance.android.livesdk.chatroom.widget.d;
import com.bytedance.android.livesdk.j.ag;
import com.bytedance.android.livesdk.j.cn;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ed;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.decoration.StickerAudienceEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.DecoTextModifyFrequencySetting;
import com.bytedance.android.livesdk.model.ar;
import com.bytedance.android.livesdk.model.av;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.k;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.b.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public class DecorationWrapperWidget extends LiveWidget implements l.a, a.AbstractC0333a, au {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f16285i;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f16286l;
    private static final String o = DecorationWrapperWidget.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    boolean f16287a;

    /* renamed from: b  reason: collision with root package name */
    boolean f16288b;

    /* renamed from: c  reason: collision with root package name */
    int[] f16289c = new int[4];

    /* renamed from: d  reason: collision with root package name */
    int[] f16290d = new int[4];

    /* renamed from: e  reason: collision with root package name */
    final List<com.bytedance.android.livesdk.chatroom.widget.a> f16291e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public l f16292f;

    /* renamed from: g  reason: collision with root package name */
    Room f16293g;

    /* renamed from: h  reason: collision with root package name */
    public String f16294h = "";

    /* renamed from: j  reason: collision with root package name */
    public int f16295j;

    /* renamed from: k  reason: collision with root package name */
    a f16296k;

    /* renamed from: m  reason: collision with root package name */
    boolean f16297m;
    public dq n = null;
    private long p;
    private boolean q;
    private boolean r = false;
    private boolean s = false;
    private long t = -1;
    private b u;
    private b v;
    private final f.a.b.a w = new f.a.b.a();
    private dq.a x = new dq.a() {
        /* class com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget.AnonymousClass1 */

        static {
            Covode.recordClassIndex(9019);
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.dq.a
        public final void a() {
            DecorationWrapperWidget.this.n = null;
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.dq.a
        public final void a(String str) {
            if (DecorationWrapperWidget.this.f16292f != null) {
                if (!DecorationWrapperWidget.this.f16292f.a()) {
                    ao.a(DecorationWrapperWidget.this.context, DecorationWrapperWidget.this.context.getString(R.string.gw9, Integer.valueOf(DecoTextModifyFrequencySetting.INSTANCE.getValue())), 0);
                } else if (!DecorationWrapperWidget.this.f16292f.f15369d) {
                    if (TextUtils.isEmpty(str)) {
                        str = DecorationWrapperWidget.this.f16294h;
                    }
                    if (str.length() <= DecorationWrapperWidget.this.f16295j) {
                        l lVar = DecorationWrapperWidget.this.f16292f;
                        if (lVar.a() && !TextUtils.isEmpty(str) && !lVar.f15369d) {
                            lVar.f15368c = str;
                            lVar.f15369d = true;
                            WeakHandler weakHandler = lVar.f15366a;
                            ((RoomRetrofitApi) e.a().a(RoomRetrofitApi.class)).sendDecorationText(new k().a("room_id", String.valueOf(lVar.f15367b)).a("user_id", String.valueOf(u.a().b().c())).a("deco_text", String.valueOf(str)).f22332a).a(new f()).a(new j(weakHandler), new com.bytedance.android.livesdk.chatroom.b.k(weakHandler));
                            return;
                        }
                        return;
                    }
                    ao.a(DecorationWrapperWidget.this.context, DecorationWrapperWidget.this.context.getString(R.string.gmt, Integer.valueOf(DecorationWrapperWidget.this.f16295j)), 0);
                }
            }
        }
    };

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        br.a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bgp;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private void h() {
        dq dqVar = this.n;
        if (dqVar != null) {
            dqVar.a();
        }
    }

    static {
        Covode.recordClassIndex(9018);
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.l.a
    public final void c() {
        if (isViewValid() && !this.q) {
            f();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.l.a
    public final void a() {
        if (isViewValid()) {
            h();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.l.a
    public final void b() {
        if (isViewValid()) {
            for (com.bytedance.android.livesdk.chatroom.widget.a aVar : this.f16291e) {
                if (aVar != null && aVar.getType() == 1) {
                    aVar.e();
                }
            }
            d();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        MethodCollector.i(11878);
        super.onPause();
        boolean equals = Build.BRAND.equals("HUAWEI");
        if (this.q || !equals) {
            MethodCollector.o(11878);
            return;
        }
        if (this.s) {
            this.s = false;
        }
        if (getView() == null) {
            MethodCollector.o(11878);
            return;
        }
        ((ViewGroup) getView()).removeAllViews();
        MethodCollector.o(11878);
    }

    private void e() {
        MethodCollector.i(12330);
        if (!isViewValid() || this.f16291e.isEmpty() || getView() == null) {
            MethodCollector.o(12330);
            return;
        }
        Iterator<com.bytedance.android.livesdk.chatroom.widget.a> it = this.f16291e.iterator();
        while (it.hasNext()) {
            com.bytedance.android.livesdk.chatroom.widget.a next = it.next();
            if (getView() != null && next.getType() == 3) {
                ((ViewGroup) getView()).removeView(next);
                it.remove();
                com.bytedance.android.livesdk.an.a.a().a(new g(next.getRoomDecoration(), false));
            }
        }
        MethodCollector.o(12330);
    }

    private void f() {
        MethodCollector.i(12467);
        if (!isViewValid() || this.f16291e.isEmpty() || getView() == null) {
            MethodCollector.o(12467);
            return;
        }
        Iterator<com.bytedance.android.livesdk.chatroom.widget.a> it = this.f16291e.iterator();
        while (it.hasNext()) {
            com.bytedance.android.livesdk.chatroom.widget.a next = it.next();
            if (!(getView() == null || next.getType() == 3)) {
                ((ViewGroup) getView()).removeView(next);
                it.remove();
            }
        }
        MethodCollector.o(12467);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.a.AbstractC0333a
    public final void d() {
        if (isViewValid() && this.q && this.f16292f != null) {
            for (com.bytedance.android.livesdk.chatroom.widget.a aVar : this.f16291e) {
                if (aVar != null) {
                    JSONArray jSONArray = new JSONArray();
                    JSONObject decorationInfo = aVar.getDecorationInfo();
                    if (decorationInfo != null) {
                        jSONArray.put(decorationInfo);
                        l lVar = this.f16292f;
                        String jSONArray2 = jSONArray.toString();
                        lVar.a(new k().a("deco_list", String.valueOf(jSONArray2)).f22332a, aVar.getType());
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        super.onResume();
        boolean equals = Build.BRAND.equals("HUAWEI");
        if (!(this.q || !equals || this.s || com.bytedance.common.utility.collection.b.a((Collection) this.f16293g.getDecorationList()))) {
            ArrayList arrayList = new ArrayList();
            for (av avVar : this.f16293g.getDecorationList()) {
                arrayList.add(new av(avVar));
            }
            b(arrayList);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        String str;
        long j2;
        super.onDestroy();
        this.f16297m = false;
        this.dataChannel.b(this);
        h();
        this.f16292f.b();
        this.t = -1;
        f16285i = false;
        f16286l = false;
        a(this.u);
        a(this.v);
        if (this.q) {
            List<av> stickerList = this.f16293g.getStickerList();
            if (!com.bytedance.common.utility.collection.b.a((Collection) stickerList)) {
                av avVar = stickerList.get(0);
                if (this.f16287a) {
                    str = "use";
                } else {
                    str = "unused";
                }
                Room room = this.f16293g;
                if (room != null) {
                    j2 = room.getId();
                } else {
                    j2 = 0;
                }
                HashMap hashMap = new HashMap();
                Room room2 = this.f16293g;
                if (!(room2 == null || room2.getOwner() == null)) {
                    hashMap.put("anchor_id", String.valueOf(this.f16293g.getOwner().getId()));
                }
                hashMap.put("room_id", String.valueOf(j2));
                hashMap.put("use_status", str);
                b.a.a("live_picture_prop_use").a((Map<String, String>) hashMap).a("prop_id", avVar.f19006h).d("live_take_detail").c("other").b("live_take").a(this.dataChannel).b();
                c.a(this.dataChannel, stickerList.get(0));
                c.f15928a = 0;
            }
        }
        this.w.dispose();
        this.w.a();
        com.bytedance.android.live.p.l.STICKER_DONATION.unload(this.dataChannel);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        if (isViewValid() && this.context != null) {
            int[] iArr = this.f16289c;
            iArr[0] = 0;
            iArr[1] = ((n.b(this.context) - y.d(R.dimen.yy)) - y.d(R.dimen.x_)) - ((int) n.b(this.context, 10.0f));
            int[] iArr2 = this.f16289c;
            iArr2[2] = 0;
            iArr2[3] = n.a(this.context);
            int[] iArr3 = this.f16289c;
            this.f16290d = Arrays.copyOf(iArr3, iArr3.length);
        }
        this.f16297m = false;
        this.q = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
        Room room = (Room) this.dataChannel.b(df.class);
        this.f16293g = room;
        if (room.getOwner() != null) {
            this.p = this.f16293g.getOwner().getId();
        }
        l lVar = new l(this.f16293g.getId(), this.p, this.q);
        this.f16292f = lVar;
        lVar.a((l.a) this);
        this.f16296k = new a(this, (byte) 0);
        com.bytedance.android.live.p.l.STICKER_DONATION.load(this.dataChannel, this.f16296k);
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.f16293g.getDecorationList()) || !com.bytedance.common.utility.collection.b.a((Collection) this.f16293g.getStickerList())) {
            ArrayList arrayList = new ArrayList();
            if (!com.bytedance.common.utility.collection.b.a((Collection) this.f16293g.getDecorationList())) {
                for (av avVar : this.f16293g.getDecorationList()) {
                    arrayList.add(new av(avVar));
                }
            }
            if (!com.bytedance.common.utility.collection.b.a((Collection) this.f16293g.getStickerList()) && StickerAudienceEnableSetting.INSTANCE.getValue() == 1) {
                for (av avVar2 : this.f16293g.getStickerList()) {
                    arrayList.add(new av(avVar2));
                }
            }
            b(arrayList);
            this.s = true;
        }
        this.w.a(com.bytedance.android.livesdk.an.a.a().a(ac.class).a(getAutoUnbindTransformer()).d(new au(this)));
        this.w.a(com.bytedance.android.livesdk.an.a.a().a(aj.class).a(getAutoUnbindTransformer()).d(new av(this)));
        this.w.a(com.bytedance.android.livesdk.an.a.a().a(ak.class).a(getAutoUnbindTransformer()).d(new bc(this)));
        this.w.a(com.bytedance.android.livesdk.an.a.a().a(s.class).a(getAutoUnbindTransformer()).d(new bd(this)));
        this.dataChannel.a((Object) this, t.class, (h.f.a.b) new be(this)).b((m) this, ed.class, (h.f.a.b) new bf(this)).a(ag.class, (h.f.a.b) new bg(this)).a(com.bytedance.android.live.c.c.class, (h.f.a.b) new bh(this)).a(com.bytedance.android.live.c.e.class, (h.f.a.b) new bi(this));
        if (this.q && this.dataChannel != null) {
            this.dataChannel.b((m) this, v.class, (h.f.a.b) new bj(this));
        }
    }

    class a implements com.bytedance.android.live.p.f {

        /* renamed from: b  reason: collision with root package name */
        private View f16300b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f16301c;

        static {
            Covode.recordClassIndex(9022);
        }

        @Override // com.bytedance.android.live.p.f
        public final void a() {
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

        private a() {
        }

        public final void b(boolean z) {
            int i2;
            this.f16301c = z;
            View view = this.f16300b;
            if (view != null) {
                if (z) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                view.setVisibility(i2);
            }
        }

        public final void onClick(View view) {
            if (DecorationWrapperWidget.f16285i) {
                ao.a(DecorationWrapperWidget.this.getContext(), (int) R.string.em8);
                return;
            }
            androidx.fragment.app.e a2 = p.a(DecorationWrapperWidget.this.context);
            if (a2 != null) {
                com.bytedance.android.live.core.widget.a.a(a2, new cy());
            }
        }

        /* synthetic */ a(DecorationWrapperWidget decorationWrapperWidget, byte b2) {
            this();
        }

        @Override // com.bytedance.android.live.p.f
        public final void a(View view, DataChannel dataChannel) {
            this.f16300b = view;
            b(this.f16301c);
        }
    }

    private static void a(f.a.b.b bVar) {
        if (bVar != null && !bVar.isDisposed()) {
            bVar.dispose();
        }
    }

    private void b(List<av> list) {
        getView().post(new ax(this, list));
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.l.a
    public final void a(av avVar) {
        if (isViewValid() && !this.q && avVar != null) {
            if (this.f16293g != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(avVar);
                this.f16293g.setStickerList(arrayList);
            }
            if (this.dataChannel == null || !((Boolean) this.dataChannel.b(cn.class)).booleanValue()) {
                f();
                b(avVar);
                c(avVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(av avVar) {
        String str;
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_audience_prop_show").a("anchor_id", this.p).a("live_type", "live_video").a("prop_id", avVar.f19006h);
        if (avVar.f19005g == 1) {
            str = "character";
        } else {
            str = "picture";
        }
        a2.a("prop_type", str).a("words", avVar.f19002d).a("request_id", com.bytedance.android.livesdk.ab.e.k()).a(this.dataChannel).b();
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.l.a
    public final void a(String str) {
        if (isViewValid()) {
            ao.a(this.context, str, 0);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.l.a
    public final void b(String str) {
        if (isViewValid()) {
            for (com.bytedance.android.livesdk.chatroom.widget.a aVar : this.f16291e) {
                if (aVar != null && aVar.getType() == 1) {
                    aVar.setText(str);
                }
            }
            d();
        }
    }

    public final void c(av avVar) {
        com.bytedance.android.livesdk.chatroom.widget.a dVar;
        l lVar;
        MethodCollector.i(12034);
        if (!isViewValid() || avVar == null) {
            MethodCollector.o(12034);
            return;
        }
        if (avVar.f19005g == 3) {
            e();
        } else {
            f();
        }
        if (avVar.f19005g == 3) {
            dVar = new com.bytedance.android.livesdk.chatroom.widget.f(this.context, avVar, this.q, this.f16289c, this, this.f16297m);
            com.bytedance.android.livesdk.an.a.a().a(new g(avVar, true));
            long j2 = this.t;
            if (j2 == -1 || j2 != avVar.f19006h) {
                ar a2 = avVar.a();
                a("top_left_icon", a2);
                a("donation_sticker", a2);
            }
            this.t = avVar.f19006h;
        } else {
            dVar = new d(this.context, avVar, this.q, this.f16289c, this, this.f16297m);
        }
        if (avVar.f19005g == 1 && (lVar = this.f16292f) != null) {
            dVar.setText(lVar.a(avVar));
            this.f16294h = avVar.f19002d;
        }
        this.f16291e.add(dVar);
        if (getView() == null) {
            MethodCollector.o(12034);
            return;
        }
        ((ViewGroup) getView()).addView(dVar, new ViewGroup.LayoutParams(-1, -1));
        if (!this.q) {
            MethodCollector.o(12034);
            return;
        }
        if (3 == avVar.f19005g) {
            f16285i = true;
        }
        MethodCollector.o(12034);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.a.AbstractC0333a
    public final void d(av avVar) {
        f.a.b.b bVar;
        String str;
        String str2;
        long j2;
        if (isViewValid() && avVar != null) {
            if (avVar.f19005g == 1) {
                bVar = this.u;
            } else {
                bVar = this.v;
            }
            a(bVar);
            if (avVar.f19005g == 3) {
                e();
            } else {
                if (avVar.f19005g == 1) {
                    str = "character";
                } else {
                    str = "picture";
                }
                if (avVar.f19005g == 1) {
                    str2 = avVar.f19002d;
                } else {
                    str2 = "";
                }
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_live_prop_delete").a("anchor_id", this.p);
                Room room = this.f16293g;
                if (room != null) {
                    j2 = room.getId();
                } else {
                    j2 = 0;
                }
                a2.a("room_id", j2).a("prop_id", avVar.f19006h).a("prop_type", str).a("words", str2).a(this.dataChannel).b();
                f();
                c.a(this.dataChannel, avVar);
                c.f15928a = 0;
            }
            l lVar = this.f16292f;
            int i2 = avVar.f19005g;
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("deco_list", String.valueOf(new JSONArray()));
            lVar.a(hashMap, i2);
        }
    }

    public void onEvent(ac acVar) {
        boolean z;
        long j2;
        String str;
        f.a.b.b bVar;
        if (isViewValid() && acVar != null && acVar.f15076a != null) {
            if (acVar.f15076a.f19005g == 3) {
                this.f16293g.setDecorationList(new ArrayList<av>(acVar) {
                    /* class com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget.AnonymousClass2 */
                    final /* synthetic */ ac val$event;

                    static {
                        Covode.recordClassIndex(9020);
                    }

                    {
                        this.val$event = r3;
                        add(r3.f15076a);
                    }
                });
            } else {
                this.f16293g.setStickerList(new ArrayList<av>(acVar) {
                    /* class com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget.AnonymousClass3 */
                    final /* synthetic */ ac val$event;

                    static {
                        Covode.recordClassIndex(9021);
                    }

                    {
                        this.val$event = r3;
                        add(r3.f15076a);
                    }
                });
            }
            av avVar = acVar.f15076a;
            c(avVar);
            if (this.q) {
                boolean z2 = false;
                if (avVar.f19005g == 1) {
                    z = true;
                } else {
                    z = false;
                }
                Room room = this.f16293g;
                if (room != null) {
                    j2 = room.getId();
                } else {
                    j2 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(j2));
                hashMap.put("prop_id", String.valueOf(avVar.f19006h));
                hashMap.put("live_type", "video_live");
                if (z) {
                    hashMap.put("words", avVar.f19002d);
                    str = "livesdk_live_character_prop_show";
                } else {
                    str = "livesdk_live_picture_prop_show";
                }
                b.a.a(str).a((Map<String, String>) hashMap).a(this.dataChannel).b();
                if (avVar.f19005g == 1) {
                    z2 = true;
                    bVar = this.u;
                } else {
                    bVar = this.v;
                }
                a(bVar);
                f.a.b.b d2 = f.a.t.b(30, TimeUnit.SECONDS).b(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new bb(this, avVar));
                if (z2) {
                    this.u = d2;
                } else {
                    this.v = d2;
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.l.a
    public final void a(List<av> list) {
        if (isViewValid() && !this.q) {
            if (this.dataChannel == null || !((Boolean) this.dataChannel.b(cn.class)).booleanValue()) {
                e();
                for (av avVar : list) {
                    if (avVar != null) {
                        c(avVar);
                    }
                }
                Room room = this.f16293g;
                if (room != null) {
                    room.setDecorationList(list);
                    return;
                }
                return;
            }
            Room room2 = this.f16293g;
            if (room2 != null) {
                room2.setDecorationList(list);
            }
        }
    }

    public void onEvent(aj ajVar) {
        long j2;
        if (isViewValid() && ajVar != null && !TextUtils.isEmpty(ajVar.f15095a) && !f16286l) {
            f16286l = true;
            if (!u.a().b().e()) {
                com.bytedance.android.livesdk.at.f b2 = u.a().b();
                Context context = getContext();
                j.a a2 = com.bytedance.android.livesdk.at.j.a();
                a2.f14158a = com.bytedance.android.livesdk.ao.a.a();
                a2.f14159b = com.bytedance.android.livesdk.ao.a.b();
                a2.f14161d = "live";
                a2.f14160c = -1;
                b2.a(context, a2.a()).b(new com.bytedance.android.livesdk.at.g());
                f16286l = false;
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("item_type", 2L);
            Room room = this.f16293g;
            if (room != null) {
                j2 = room.getId();
            } else {
                j2 = 0;
            }
            hashMap.put("item_id", Long.valueOf(j2));
            this.w.a(((DecorationApi) e.a().a(DecorationApi.class)).createDonateToken(hashMap).a(new f()).a(new ay(this, ajVar), new az(this)));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.a.AbstractC0333a
    public final void a(boolean z) {
        if (this.dataChannel != null) {
            this.dataChannel.c(com.bytedance.android.livesdk.j.au.class, Boolean.valueOf(z));
        }
    }

    private void a(String str, ar arVar) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        if (this.q) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        hashMap.put("is_anchor", str2);
        if (arVar != null) {
            str3 = arVar.f18987a;
        } else {
            str3 = "";
        }
        hashMap.put("NGO_name", str3);
        hashMap.put("position", str);
        b.a.a("livesdk_donation_icon_show").a((Map<String, String>) hashMap).a(this.dataChannel).b();
    }
}

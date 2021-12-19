package com.bytedance.android.livesdk.olddialog.widget;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.firstrecharge.d;
import com.bytedance.android.livesdk.firstrecharge.e;
import com.bytedance.android.livesdk.gift.d.g;
import com.bytedance.android.livesdk.gift.d.j;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.a.b;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeStyleSetting;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.olddialog.giftpanellist.a.a;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.service.a.b;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.c.a.a;
import com.bytedance.android.livesdk.service.c.c.a;
import com.bytedance.android.livesdk.service.c.c.d;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.z.b.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.google.gson.f;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LiveNewGiftPanelWidget extends LiveWidget implements a.AbstractC0407a, au {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f20127a;

    /* renamed from: b  reason: collision with root package name */
    public int f20128b;

    /* renamed from: c  reason: collision with root package name */
    public GiftDialogViewModel.b f20129c;

    /* renamed from: d  reason: collision with root package name */
    final LinkedList<GiftPage> f20130d = new LinkedList<>();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedList<Prop> f20131e = new LinkedList<>();

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.livesdk.olddialog.giftpanellist.a.a f20132f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.android.livesdk.olddialog.viewmodel.a f20133g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f20134h;

    /* renamed from: i  reason: collision with root package name */
    public long f20135i;

    /* renamed from: j  reason: collision with root package name */
    public String f20136j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f20137k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f20138l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f20139m = false;
    int n;
    int o;
    boolean p = true;
    private LiveTextView q;
    private Room r;
    private int s;
    private boolean t;
    private LinkedList<b<? extends com.bytedance.android.livesdk.model.b>> u;
    private int v = 0;
    private final f.a.b.a w = new f.a.b.a();
    private boolean x = false;
    private boolean y = true;
    private GiftPage z;

    public interface a {
        static {
            Covode.recordClassIndex(11881);
        }

        void a(Boolean bool, Long l2, int i2);
    }

    static {
        Covode.recordClassIndex(11876);
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.a.a.AbstractC0407a
    public final void a() {
        this.f20138l = true;
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bh7;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static class GiftSSGridLayoutManager extends SSGridLayoutManager {
        public boolean L = true;

        static {
            Covode.recordClassIndex(11880);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final boolean f() {
            if (!super.f() || !this.L) {
                return false;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final boolean g() {
            if (!super.g() || !this.L) {
                return false;
            }
            return true;
        }

        public GiftSSGridLayoutManager(Context context) {
            super(2, 0);
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.a.a.AbstractC0407a
    public final void b() {
        this.dataChannel.c(g.class, new j("gift"));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        this.w.a();
        this.f20133g.f20096b.removeObservers(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        a.C0460a.C0461a.f21366a.a();
        if (d.u.e() || (!d.u.e() && !LiveFirstRechargeStyleSetting.INSTANCE.getValue() && d.u.d())) {
            e.a();
        }
        this.f20127a = (RecyclerView) this.contentView.findViewById(R.id.bbh);
        LiveTextView liveTextView = (LiveTextView) this.containerView.findViewById(R.id.aw5);
        this.q = liveTextView;
        liveTextView.setVisibility(0);
        if (this.dataChannel != null) {
            this.r = (Room) this.dataChannel.b(df.class);
            this.t = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
            this.w.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.service.d.class).d(new m(this)));
            this.w.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.service.a.class).d(new n(this)));
            this.w.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.z.b.a.class).d(new o(this)));
            this.w.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.z.b.b.class).d(new p(this)));
            this.w.a(com.bytedance.android.livesdk.an.a.a().a(c.class).d(new q(this)));
        }
        if (this.f20134h) {
            this.f20132f = new com.bytedance.android.livesdk.olddialog.giftpanellist.a.b(this.context, this);
        } else {
            this.f20132f = new com.bytedance.android.livesdk.olddialog.giftpanellist.a.c(this.context, this);
        }
        this.f20132f.f20029h = this.dataChannel;
        com.bytedance.android.livesdk.olddialog.viewmodel.a aVar = this.f20133g;
        if (!(aVar == null || aVar.f20101g == null || this.f20133g.f20101g.getValue() == null)) {
            this.f20132f.f20026e = this.f20133g.f20101g.getValue().longValue();
        }
        this.f20132f.f20030i = new r(this);
        this.f20127a.setAdapter(this.f20132f);
        this.f20132f.f20025d = this;
        this.f20132f.a(this.f20135i);
        this.f20127a.setLayoutManager(new GiftSSGridLayoutManager(this.context));
        this.f20127a.setHasFixedSize(true);
        this.f20127a.setItemViewCacheSize(16);
        this.f20127a.setClipChildren(false);
        this.f20127a.a(new RecyclerView.n() {
            /* class com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPanelWidget.AnonymousClass1 */

            static {
                Covode.recordClassIndex(11877);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                super.a(recyclerView, i2);
                LiveNewGiftPanelWidget.this.f20138l = true;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2, int i3) {
                super.a(recyclerView, i2, i3);
            }
        });
        com.bytedance.android.livesdk.performance.g.a(this.f20127a);
        AnonymousClass2 r1 = new com.bytedance.android.livesdk.widget.a.a() {
            /* class com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPanelWidget.AnonymousClass2 */

            static {
                Covode.recordClassIndex(11878);
            }

            @Override // com.bytedance.android.livesdk.widget.a.c, com.bytedance.android.livesdk.widget.a.a
            public final View a(RecyclerView.i iVar) {
                View a2 = super.a(iVar);
                if (a2 == null) {
                    return null;
                }
                LiveNewGiftPanelWidget.this.f20128b = RecyclerView.i.e(a2);
                LiveNewGiftPanelWidget liveNewGiftPanelWidget = LiveNewGiftPanelWidget.this;
                liveNewGiftPanelWidget.b(liveNewGiftPanelWidget.f20128b);
                return a2;
            }

            @Override // com.bytedance.android.livesdk.widget.a.c, com.bytedance.android.livesdk.widget.a.a
            public final int a(RecyclerView.i iVar, int i2, int i3) {
                LiveNewGiftPanelWidget.this.f20128b = super.a(iVar, i2, i3);
                LiveNewGiftPanelWidget liveNewGiftPanelWidget = LiveNewGiftPanelWidget.this;
                liveNewGiftPanelWidget.b(liveNewGiftPanelWidget.f20128b);
                return LiveNewGiftPanelWidget.this.f20128b;
            }
        };
        if (((com.bytedance.android.livesdk.widget.a.a) r1).f22562b > 0) {
            ((com.bytedance.android.livesdk.widget.a.a) r1).f22562b = 2;
            if (r1.f22563c > 0) {
                r1.f22563c = 4;
                r1.a(this.f20127a);
                this.f20127a.a(new RecyclerView.n() {
                    /* class com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPanelWidget.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(11879);
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.n
                    public final void a(RecyclerView recyclerView, int i2) {
                        if (i2 != 0) {
                            LiveNewGiftPanelWidget liveNewGiftPanelWidget = LiveNewGiftPanelWidget.this;
                            liveNewGiftPanelWidget.b(liveNewGiftPanelWidget.f20128b);
                            super.a(recyclerView, i2);
                        }
                    }
                });
                this.f20133g.f20096b.observe(this, new i(this));
                this.dataChannel.a((m) this, com.bytedance.android.livesdk.d.class, (h.f.a.b) new j(this));
                return;
            }
            throw new IllegalArgumentException("column must be greater than zero");
        }
        throw new IllegalArgumentException("row must be greater than zero");
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.a.a.AbstractC0407a
    public final void a(int i2) {
        this.f20127a.b(0);
        this.f20127a.postDelayed(new l(this, i2), 100);
    }

    public final void b(List<Prop> list) {
        if (list != null) {
            LinkedList<b<? extends com.bytedance.android.livesdk.model.b>> linkedList = new LinkedList<>();
            for (Prop prop : list) {
                linkedList.addLast(new com.bytedance.android.livesdk.dialogv2.b.d(prop));
            }
            a(linkedList);
        }
    }

    public final void b(int i2) {
        int i3 = i2 / 8;
        if (i3 >= 0 && i3 < this.s) {
            if (i3 != this.v) {
                this.v = i3;
                b.a.C0448a.f21165a.f21164a = false;
            }
            this.dataChannel.c(com.bytedance.android.livesdk.d.class);
            com.bytedance.android.livesdk.service.c.a.a aVar = a.C0452a.C0453a.f21303a;
            if (aVar.f21299a != i3) {
                aVar.a();
            }
            com.bytedance.android.livesdk.olddialog.giftpanellist.b.a aVar2 = new com.bytedance.android.livesdk.olddialog.giftpanellist.b.a();
            aVar2.f20037b = i3;
            aVar2.f20036a = this.s;
            this.f20133g.f20100f.setValue(aVar2);
            if (this.f20138l && 5 != this.f20133g.f20096b.getValue().intValue()) {
                a.C0355a.C0356a.f17017a.f17014j = this.f20133g.f20096b.getValue().intValue();
                com.bytedance.android.livesdk.service.c.a.e.f21319i.a(aVar2.f20037b, this.n, this.z, false, this.f20136j);
            }
            a.C0460a.C0461a.f21366a.a(i3);
        }
    }

    public final void a(List<GiftPage> list) {
        if (!(list == null || list.isEmpty())) {
            List<GiftPage> arrayList = new ArrayList<>(5);
            f fVar = e.a.f9629c;
            for (GiftPage giftPage : list) {
                arrayList.add(fVar.a(fVar.b(giftPage), GiftPage.class));
            }
            this.f20130d.clear();
            this.f20130d.addAll(arrayList);
            Iterator<GiftPage> it = this.f20130d.iterator();
            while (it.hasNext()) {
                GiftPage next = it.next();
                if (this.f20129c == GiftDialogViewModel.b.GUEST) {
                    GiftManager.filterInteractNotSupportGift(next.gifts, this.t);
                } else {
                    GiftManager.filterNotSupportGift(next.gifts, this.t);
                }
                GiftManager.filterNotDisplayedOnPanel(next.gifts);
                GiftManager.filterFirstAndCallbackGifts(next.gifts);
            }
            if (!this.f20139m) {
                this.f20139m = true;
                a(arrayList, (Integer) 1);
            }
        }
    }

    private void a(LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> linkedList) {
        int i2;
        long j2;
        boolean z2;
        LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> linkedList2;
        LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> linkedList3;
        if (this.f20132f != null) {
            d.a.C0463a.f21379a.a(linkedList);
            if (linkedList.size() > 0) {
                i2 = ((linkedList.size() - 1) / 8) + 1;
            } else {
                i2 = 0;
            }
            this.s = i2;
            this.f20132f.a(linkedList);
            this.f20132f.notifyDataSetChanged();
            if (linkedList.isEmpty()) {
                this.q.setVisibility(0);
            } else {
                this.q.setVisibility(8);
            }
            if (this.f20138l) {
                com.bytedance.android.livesdk.olddialog.giftpanellist.a.a aVar = this.f20132f;
                if (aVar.c(aVar.f20028g) != -1 || (linkedList3 = this.u) == null || linkedList3.isEmpty()) {
                    com.bytedance.android.livesdk.olddialog.giftpanellist.a.a aVar2 = this.f20132f;
                    this.f20127a.postDelayed(new t(this, ((aVar2.c(aVar2.f20028g) / 8) * 8) + 7), 50);
                    com.bytedance.android.livesdk.olddialog.giftpanellist.b.a aVar3 = new com.bytedance.android.livesdk.olddialog.giftpanellist.b.a();
                    aVar3.f20036a = this.s;
                    com.bytedance.android.livesdk.olddialog.giftpanellist.a.a aVar4 = this.f20132f;
                    aVar3.f20037b = aVar4.c(aVar4.f20028g) / 8;
                    this.f20133g.f20100f.setValue(aVar3);
                    a.C0460a.C0461a.f21366a.a(aVar3.f20037b);
                    return;
                }
                this.f20132f.a(this.u.get(0).d());
                this.f20127a.postDelayed(new s(this), 50);
                return;
            }
            long a2 = com.bytedance.android.livesdk.olddialog.a.a.a(this.context, "default_dialog_item");
            if (this.z.pageType != com.bytedance.android.livesdk.olddialog.a.a.a(this.context, "sp_gift_page_type", -1) && !this.u.isEmpty()) {
                a2 = this.u.get(0).d();
            }
            if (this.f20133g.f20101g.getValue() != null) {
                j2 = this.f20133g.f20101g.getValue().longValue();
                if (j2 != 0) {
                    a2 = j2;
                }
            } else {
                j2 = 0;
            }
            com.bytedance.android.livesdk.olddialog.giftpanellist.b.a aVar5 = new com.bytedance.android.livesdk.olddialog.giftpanellist.b.a();
            aVar5.f20037b = 0;
            aVar5.f20036a = this.s;
            this.f20133g.f20100f.setValue(aVar5);
            a.C0460a.C0461a.f21366a.a(0);
            if (com.bytedance.android.livesdk.firstrecharge.d.u.d() && (!LiveFirstRechargeStyleSetting.INSTANCE.getValue() || com.bytedance.android.livesdk.firstrecharge.d.u.e())) {
                if (com.bytedance.android.livesdk.firstrecharge.d.u.f()) {
                    a2 = com.bytedance.android.livesdk.firstrecharge.d.u.i();
                } else {
                    a2 = 0;
                }
            }
            if (this.f20132f.c(a2) != -1) {
                this.f20127a.postDelayed(new k(this, ((this.f20132f.c(a2) / 8) * 8) + 7), 50);
                aVar5.f20036a = this.s;
                aVar5.f20037b = this.f20132f.c(a2) / 8;
                this.f20133g.f20100f.setValue(aVar5);
                a.C0460a.C0461a.f21366a.a(aVar5.f20037b);
            } else {
                this.f20127a.b(0);
            }
            if (this.f20132f.c(a2) != -1 || (linkedList2 = this.u) == null || linkedList2.isEmpty()) {
                this.f20132f.a(a2);
            } else if (j2 == 0) {
                this.f20132f.a(this.u.get(0).d());
                a2 = this.u.get(0).d();
            } else {
                ao.a(y.e(), "This gift is currently unavailable", 0);
            }
            this.f20132f.f20026e = a2;
            if (!this.x) {
                this.x = true;
                com.bytedance.android.livesdk.service.c.a.e eVar = com.bytedance.android.livesdk.service.c.a.e.f21319i;
                int i3 = aVar5.f20037b;
                if (this.f20129c == GiftDialogViewModel.b.GUEST) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                eVar.a(i3, z2, this.n, this.z, this.f20136j, this.f20133g.f20096b.getValue());
                com.bytedance.android.livesdk.service.c.a.e.f21319i.a(aVar5.f20037b, this.n, this.z, this.f20136j);
                this.v = aVar5.f20037b;
            } else if (!this.p) {
                this.p = true;
                a.C0355a.C0356a.f17017a.f17014j = this.f20133g.f20096b.getValue().intValue();
                b.a.C0448a.f21165a.f21164a = false;
                com.bytedance.android.livesdk.service.c.a.e.f21319i.a(aVar5.f20037b, this.n, this.z, true, this.f20136j);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.a.a.AbstractC0407a
    public final void a(String str, String str2) {
        this.f20133g.f20098d.setValue(new com.bytedance.android.livesdk.olddialog.giftpanellist.b.b(str, str2));
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.a.a.AbstractC0407a
    public final void a(int i2, int i3) {
        com.bytedance.android.livesdk.olddialog.giftpanellist.b.a aVar = new com.bytedance.android.livesdk.olddialog.giftpanellist.b.a();
        aVar.f20037b = i2;
        aVar.f20036a = i3;
        this.s = i3;
        this.f20133g.f20100f.setValue(aVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(List<GiftPage> list, Integer num) {
        com.bytedance.android.livesdk.olddialog.viewmodel.a aVar = this.f20133g;
        if (!(aVar == null || aVar.f20096b == null || this.f20133g.f20096b.getValue() == null)) {
            if ((this.f20133g.f20096b.getValue().equals(num) || !this.f20137k) && list != null && !list.isEmpty()) {
                if (!this.f20137k) {
                    this.f20137k = true;
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    GiftPage giftPage = list.get(i2);
                    if (giftPage.pageType == num.intValue()) {
                        LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> linkedList = new LinkedList<>();
                        for (u uVar : giftPage.gifts) {
                            if (uVar.f19762e == 3) {
                                linkedList.addLast(new com.bytedance.android.livesdk.dialogv2.b.e(uVar));
                            } else {
                                linkedList.addLast(new com.bytedance.android.livesdk.dialogv2.b.c(uVar));
                            }
                        }
                        this.o = this.f20133g.f20096b.getValue().intValue();
                        this.u = linkedList;
                        this.z = giftPage;
                        this.n = i2;
                        if (giftPage.pageType != 5) {
                            com.bytedance.android.livesdk.service.c.a.e.f21319i.a(giftPage.gifts);
                        }
                        if (this.o == 1 && (com.bytedance.android.livesdk.firstrecharge.d.u.e() || (!com.bytedance.android.livesdk.firstrecharge.d.u.e() && !LiveFirstRechargeStyleSetting.INSTANCE.getValue() && com.bytedance.android.livesdk.firstrecharge.d.u.d()))) {
                            u g2 = com.bytedance.android.livesdk.firstrecharge.d.u.g();
                            u h2 = com.bytedance.android.livesdk.firstrecharge.d.h();
                            if (com.bytedance.android.livesdk.firstrecharge.d.u.f()) {
                                if (g2 != null) {
                                    linkedList.addFirst(new com.bytedance.android.livesdk.dialogv2.b.b(g2));
                                }
                            } else if (h2 != null) {
                                linkedList.addFirst(new com.bytedance.android.livesdk.dialogv2.b.b(h2));
                            }
                        }
                        a.C0460a.C0461a.f21366a.a(num.intValue(), linkedList);
                        a(linkedList);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.a.a.AbstractC0407a
    public final void a(com.bytedance.android.livesdk.gift.model.a.b bVar, String str, String str2) {
        GiftDialogViewModel.a aVar;
        com.bytedance.android.livesdk.gift.model.a.a aVar2 = (com.bytedance.android.livesdk.gift.model.a.a) bVar;
        if (aVar2 != null) {
            if (aVar2.f17863a != 2) {
                aVar = GiftDialogViewModel.a.GIFT;
            } else {
                aVar = GiftDialogViewModel.a.PROP;
            }
            com.bytedance.android.livesdk.service.b.d dVar = new com.bytedance.android.livesdk.service.b.d(aVar, aVar2.d(), aVar2.g());
            if (aVar2.f17864b instanceof u) {
                u uVar = (u) aVar2.f17864b;
                dVar.f21290f = uVar.f19763f;
                dVar.q = uVar.J;
                boolean z2 = true;
                if (uVar.f19762e == 1) {
                    z2 = false;
                }
                dVar.f21295k = z2;
                dVar.f21297m = this.n;
                dVar.f21296l = this.z.pageName;
                dVar.n = this.z.pageType;
                dVar.o = str;
                dVar.p = str2;
            }
            this.f20133g.f20097c.postValue(dVar);
        }
    }
}

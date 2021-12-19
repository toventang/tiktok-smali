package com.bytedance.android.livesdk.dialogv2.widget;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.dialogv2.a.a;
import com.bytedance.android.livesdk.dialogv2.viewmodel.LiveGiftDialogViewModel;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.service.a.a;
import com.bytedance.android.livesdk.service.a.b;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.c.a.a;
import com.bytedance.android.livesdk.service.c.a.d;
import com.bytedance.android.livesdk.service.c.c.a;
import com.bytedance.android.livesdk.service.c.c.d;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.a.ac;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class LiveGiftPanelWidget extends LiveWidget implements a.AbstractC0350a, au {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f17052a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.livesdk.dialogv2.a.a f17053b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<GiftPage> f17054c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f17055d;

    /* renamed from: e  reason: collision with root package name */
    public int f17056e = 1;

    /* renamed from: f  reason: collision with root package name */
    public final LiveGiftDialogViewModel f17057f;

    /* renamed from: g  reason: collision with root package name */
    private LiveTextView f17058g;

    /* renamed from: h  reason: collision with root package name */
    private LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> f17059h;

    /* renamed from: i  reason: collision with root package name */
    private final f.a.b.a f17060i = new f.a.b.a();

    /* renamed from: j  reason: collision with root package name */
    private Room f17061j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f17062k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f17063l = true;

    /* renamed from: m  reason: collision with root package name */
    private final LinkedList<Integer> f17064m = new LinkedList<>();
    private final LinkedList<Long> n = new LinkedList<>();
    private final Map<Long, Integer> o = new LinkedHashMap();
    private boolean p = true;

    static {
        Covode.recordClassIndex(9477);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgz;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftPanelWidget f17069a;

        static {
            Covode.recordClassIndex(9481);
        }

        d(LiveGiftPanelWidget liveGiftPanelWidget) {
            this.f17069a = liveGiftPanelWidget;
        }

        public final void run() {
            this.f17069a.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftPanelWidget f17070a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f17071b;

        static {
            Covode.recordClassIndex(9482);
        }

        e(LiveGiftPanelWidget liveGiftPanelWidget, int i2) {
            this.f17070a = liveGiftPanelWidget;
            this.f17071b = i2;
        }

        public final void run() {
            RecyclerView recyclerView = this.f17070a.f17052a;
            if (recyclerView != null) {
                recyclerView.b(this.f17071b);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        t<Integer> tVar;
        super.onDestroy();
        this.f17060i.a();
        com.bytedance.android.livesdk.dialogv2.a.a aVar = this.f17053b;
        if (aVar != null) {
            aVar.f16936b.a();
        }
        LiveGiftDialogViewModel liveGiftDialogViewModel = this.f17057f;
        if (liveGiftDialogViewModel != null && (tVar = liveGiftDialogViewModel.f17003a) != null) {
            tVar.removeObservers(this);
        }
    }

    private final void c() {
        Iterator<GiftPage> it = this.f17054c.iterator();
        while (it.hasNext()) {
            GiftPage next = it.next();
            if (a.C0355a.C0356a.f17017a.f17007c == GiftDialogViewModel.b.GUEST) {
                GiftManager.filterInteractNotSupportGift(next.gifts, this.f17062k);
            } else {
                GiftManager.filterNotSupportGift(next.gifts, this.f17062k);
            }
            GiftManager.filterNotDisplayedOnPanel(next.gifts);
            GiftManager.filterFirstAndCallbackGifts(next.gifts);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftPanelWidget f17065a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.d f17066b;

        static {
            Covode.recordClassIndex(9478);
        }

        a(LiveGiftPanelWidget liveGiftPanelWidget, z.d dVar) {
            this.f17065a = liveGiftPanelWidget;
            this.f17066b = dVar;
        }

        public final void run() {
            int i2;
            this.f17065a.b();
            boolean z = a.C0445a.C0446a.f21161a.f21160a;
            long j2 = a.C0355a.C0356a.f17017a.f17010f;
            boolean f2 = y.f();
            int i3 = a.C0355a.C0356a.f17017a.f17011g;
            String tabName = GiftManager.inst().getTabName(a.C0355a.C0356a.f17017a.f17011g);
            int a2 = this.f17065a.a(Long.valueOf(a.C0355a.C0356a.f17017a.f17010f));
            u findGiftById = GiftManager.inst().findGiftById(this.f17066b.element);
            if (findGiftById != null) {
                i2 = findGiftById.f19763f;
            } else {
                i2 = 0;
            }
            com.bytedance.android.livesdk.service.c.a.e.a(z, j2, f2, i3, tabName, a2, Integer.valueOf(i2));
        }
    }

    public final void a() {
        int i2;
        t<Integer> tVar;
        Integer value;
        this.f17054c.clear();
        ArrayList arrayList = new ArrayList(5);
        com.google.gson.f fVar = e.a.f9629c;
        GiftManager inst = GiftManager.inst();
        l.b(inst, "");
        for (GiftPage giftPage : inst.getGiftPageList()) {
            Object a2 = fVar.a(fVar.b(giftPage), GiftPage.class);
            l.b(a2, "");
            arrayList.add(a2);
        }
        LiveGiftDialogViewModel liveGiftDialogViewModel = this.f17057f;
        if (liveGiftDialogViewModel == null || (tVar = liveGiftDialogViewModel.f17003a) == null || (value = tVar.getValue()) == null) {
            i2 = 1;
        } else {
            i2 = value.intValue();
        }
        this.f17056e = i2;
        a.C0355a.C0356a.f17017a.f17014j = this.f17056e;
        this.f17054c.clear();
        this.f17054c.addAll(arrayList);
        c();
        a(this.f17054c);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Room room;
        boolean z;
        boolean z2;
        t<Integer> tVar;
        Boolean bool;
        Boolean bool2;
        super.onCreate();
        a.C0460a.C0461a.f21366a.a();
        if (com.bytedance.android.livesdk.firstrecharge.d.u.e() || (!com.bytedance.android.livesdk.firstrecharge.d.u.e() && com.bytedance.android.livesdk.firstrecharge.d.u.d())) {
            com.bytedance.android.livesdk.firstrecharge.e.a();
        }
        this.f17052a = (RecyclerView) this.contentView.findViewById(R.id.bbh);
        LiveTextView liveTextView = (LiveTextView) this.containerView.findViewById(R.id.aw5);
        this.f17058g = liveTextView;
        if (liveTextView != null) {
            liveTextView.setVisibility(0);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.b(df.class);
        } else {
            room = null;
        }
        this.f17061j = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (bool2 = (Boolean) dataChannel2.b(ee.class)) == null) {
            z = false;
        } else {
            z = bool2.booleanValue();
        }
        this.f17062k = z;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null || (bool = (Boolean) dataChannel3.b(cp.class)) == null) {
            z2 = true;
        } else {
            z2 = bool.booleanValue();
        }
        this.f17063l = z2;
        LiveGiftDialogViewModel liveGiftDialogViewModel = this.f17057f;
        if (!(liveGiftDialogViewModel == null || (tVar = liveGiftDialogViewModel.f17003a) == null)) {
            tVar.observe(this, new f(this));
        }
        this.f17060i.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.service.b.class).d(new g(this)));
        this.f17060i.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.service.a.class).d(new h(this)));
        this.f17060i.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.service.c.class).d(new i(this)));
        com.bytedance.android.livesdk.dialogv2.a.b bVar = new com.bytedance.android.livesdk.dialogv2.a.b(this.dataChannel, this.f17057f);
        this.f17053b = bVar;
        l.d(this, "");
        bVar.f16937c = this;
        RecyclerView recyclerView = this.f17052a;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f17053b);
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(4, 1, false);
        RecyclerView recyclerView2 = this.f17052a;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView3 = this.f17052a;
        if (recyclerView3 != null) {
            recyclerView3.setClipChildren(false);
        }
        RecyclerView recyclerView4 = this.f17052a;
        if (recyclerView4 != null) {
            com.bytedance.android.livesdk.performance.g.a(recyclerView4);
        }
        RecyclerView recyclerView5 = this.f17052a;
        if (recyclerView5 != null) {
            recyclerView5.a(new j(this));
        }
        a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008c, code lost:
        if ((r0 instanceof com.bytedance.android.livesdk.dialogv2.b.d) != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d0, code lost:
        if ((r0 instanceof com.bytedance.android.livesdk.dialogv2.b.d) != false) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01ee A[LOOP:0: B:12:0x002f->B:125:0x01ee, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x023e A[EDGE_INSN: B:183:0x023e->B:150:0x023e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 860
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget.b():void");
    }

    public static final class j extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftPanelWidget f17076a;

        static {
            Covode.recordClassIndex(9487);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(LiveGiftPanelWidget liveGiftPanelWidget) {
            this.f17076a = liveGiftPanelWidget;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            RecyclerView.i iVar;
            RecyclerView.i iVar2;
            int i3;
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            this.f17076a.dataChannel.c(com.bytedance.android.livesdk.d.class);
            int i4 = 0;
            LinearLayoutManager linearLayoutManager = null;
            if (i2 == 0) {
                LiveGiftPanelWidget liveGiftPanelWidget = this.f17076a;
                a.C0452a.C0453a.f21303a.a();
                RecyclerView recyclerView2 = liveGiftPanelWidget.f17052a;
                if (recyclerView2 != null) {
                    iVar2 = recyclerView2.getLayoutManager();
                } else {
                    iVar2 = null;
                }
                if (iVar2 instanceof GridLayoutManager) {
                    linearLayoutManager = iVar2;
                }
                LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) linearLayoutManager;
                if (linearLayoutManager2 != null) {
                    i3 = linearLayoutManager2.m();
                } else {
                    i3 = 0;
                }
                com.bytedance.android.livesdk.service.c.a.d dVar = d.a.C0456a.f21317a;
                int i5 = (i3 / 4) + 1;
                if (dVar.f21315a != -1) {
                    b.a.a("gift_panel_scroll").a().a("tab_name", GiftManager.inst().getTabName(a.C0355a.C0356a.f17017a.f17011g)).a("gift_dialog_request_id", com.bytedance.android.livesdk.service.a.c.f21167a).a("tab_location", GiftManager.inst().getTabLocation(a.C0355a.C0356a.f17017a.f17014j)).a("end_row_location", i5).a("scroll_rows", Math.abs(i5 - dVar.f21315a)).a("scroll_duration", com.bytedance.android.livesdk.utils.a.a.a() - dVar.f21316b).a("start_row_location", dVar.f21315a).a("send_gift_scene", com.bytedance.android.livesdk.u.a.b().getDesc()).b();
                    if (dVar.f21315a == i5) {
                        dVar.f21315a = -1;
                        dVar.f21316b = -1;
                        return;
                    }
                    dVar.f21315a = -1;
                    dVar.f21316b = -1;
                }
                b.a.C0448a.f21165a.f21164a = false;
                liveGiftPanelWidget.b();
                return;
            }
            RecyclerView recyclerView3 = this.f17076a.f17052a;
            if (recyclerView3 != null) {
                iVar = recyclerView3.getLayoutManager();
            } else {
                iVar = null;
            }
            if (iVar instanceof GridLayoutManager) {
                linearLayoutManager = iVar;
            }
            LinearLayoutManager linearLayoutManager3 = linearLayoutManager;
            if (linearLayoutManager3 != null) {
                i4 = linearLayoutManager3.m();
            }
            com.bytedance.android.livesdk.service.c.a.d dVar2 = d.a.C0456a.f21317a;
            int i6 = (i4 / 4) + 1;
            if (dVar2.f21315a == -1) {
                dVar2.f21315a = i6;
                dVar2.f21316b = com.bytedance.android.livesdk.utils.a.a.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.b<Integer, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f17067a = new b();

        static {
            Covode.recordClassIndex(9479);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            num.intValue();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<Long, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f17068a = new c();

        static {
            Covode.recordClassIndex(9480);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Long l2) {
            l2.longValue();
            return true;
        }
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftPanelWidget f17074a;

        static {
            Covode.recordClassIndex(9485);
        }

        h(LiveGiftPanelWidget liveGiftPanelWidget) {
            this.f17074a = liveGiftPanelWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            LiveGiftPanelWidget liveGiftPanelWidget = this.f17074a;
            com.bytedance.android.livesdk.dialogv2.a.a aVar = liveGiftPanelWidget.f17053b;
            if (aVar != null) {
                aVar.a();
            }
            liveGiftPanelWidget.f17055d = false;
            liveGiftPanelWidget.a(liveGiftPanelWidget.f17054c);
        }
    }

    static final class f<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftPanelWidget f17072a;

        static {
            Covode.recordClassIndex(9483);
        }

        f(LiveGiftPanelWidget liveGiftPanelWidget) {
            this.f17072a = liveGiftPanelWidget;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            int i2 = this.f17072a.f17056e;
            if (num == null || i2 != num.intValue()) {
                LiveGiftPanelWidget liveGiftPanelWidget = this.f17072a;
                l.b(num, "");
                liveGiftPanelWidget.f17056e = num.intValue();
                a.C0355a.C0356a.f17017a.f17014j = this.f17072a.f17056e;
                LiveGiftPanelWidget liveGiftPanelWidget2 = this.f17072a;
                liveGiftPanelWidget2.a(liveGiftPanelWidget2.f17054c);
            }
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftPanelWidget f17073a;

        static {
            Covode.recordClassIndex(9484);
        }

        g(LiveGiftPanelWidget liveGiftPanelWidget) {
            this.f17073a = liveGiftPanelWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (com.bytedance.android.livesdk.firstrecharge.d.u.e() && com.bytedance.android.livesdk.firstrecharge.d.u.d()) {
                a.C0355a.C0356a.f17017a.f17011g = 1;
                com.bytedance.android.livesdk.dialogv2.a.a aVar = this.f17073a.f17053b;
                if (aVar != null) {
                    aVar.a();
                }
                this.f17073a.f17055d = false;
                LiveGiftPanelWidget liveGiftPanelWidget = this.f17073a;
                liveGiftPanelWidget.a(liveGiftPanelWidget.f17054c);
            }
        }
    }

    public LiveGiftPanelWidget(LiveGiftDialogViewModel liveGiftDialogViewModel) {
        this.f17057f = liveGiftDialogViewModel;
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftPanelWidget f17075a;

        static {
            Covode.recordClassIndex(9486);
        }

        i(LiveGiftPanelWidget liveGiftPanelWidget) {
            this.f17075a = liveGiftPanelWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            t<Integer> tVar;
            a.C0355a.C0356a.f17017a.f17011g = 1;
            LiveGiftDialogViewModel liveGiftDialogViewModel = this.f17075a.f17057f;
            if (!(liveGiftDialogViewModel == null || (tVar = liveGiftDialogViewModel.f17003a) == null)) {
                tVar.setValue(1);
            }
            com.bytedance.android.livesdk.dialogv2.a.a aVar = this.f17075a.f17053b;
            if (aVar != null) {
                aVar.a();
            }
            GiftPage giftPage = this.f17075a.f17054c.get(0);
            l.b(giftPage, "");
            LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> linkedList = new LinkedList<>();
            for (u uVar : giftPage.gifts) {
                l.b(uVar, "");
                if (uVar.f19762e == 3) {
                    linkedList.addLast(new com.bytedance.android.livesdk.dialogv2.b.e(uVar));
                } else {
                    linkedList.addLast(new com.bytedance.android.livesdk.dialogv2.b.c(uVar));
                }
            }
            u g2 = com.bytedance.android.livesdk.firstrecharge.d.u.g();
            if (g2 != null) {
                linkedList.addFirst(new com.bytedance.android.livesdk.dialogv2.b.b(g2));
            }
            this.f17075a.a(linkedList);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072 A[LOOP:0: B:11:0x001e->B:35:0x0072, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007e A[EDGE_INSN: B:41:0x007e->B:39:0x007e ?: BREAK  , SYNTHETIC] */
    @Override // com.bytedance.android.livesdk.dialogv2.a.a.AbstractC0350a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.Long r10) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget.a(java.lang.Long):int");
    }

    public final void a(LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> linkedList) {
        t<Integer> tVar;
        Integer value;
        int a2;
        RecyclerView recyclerView;
        long j2;
        t<Integer> tVar2;
        Integer value2;
        long j3;
        if (this.f17053b != null) {
            d.a.C0463a.f21379a.a(linkedList);
            if (linkedList.isEmpty()) {
                LiveTextView liveTextView = this.f17058g;
                if (liveTextView != null) {
                    liveTextView.setVisibility(0);
                }
            } else {
                LiveTextView liveTextView2 = this.f17058g;
                if (liveTextView2 != null) {
                    liveTextView2.setVisibility(8);
                }
            }
            z.d dVar = new z.d();
            dVar.element = a.C0355a.C0356a.f17017a.f17010f;
            if (!this.f17055d) {
                this.f17055d = true;
                a.C0355a.C0356a.f17017a.a();
                dVar.element = a.C0355a.C0356a.f17017a.f17010f;
                Long l2 = a.C0355a.C0356a.f17017a.f17005a;
                long j4 = 0;
                if (l2 != null) {
                    j2 = l2.longValue();
                } else {
                    j2 = 0;
                }
                if (a(linkedList, dVar.element) == -1 && linkedList.size() > 0) {
                    com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = linkedList.get(0);
                    if (bVar != null) {
                        j3 = bVar.d();
                    } else {
                        j3 = 0;
                    }
                    dVar.element = j3;
                }
                if (j2 != 0) {
                    dVar.element = j2;
                    if (a(linkedList, dVar.element) == -1) {
                        ao.a(y.e(), "This gift is currently unavailable", 0);
                    }
                }
                LiveGiftDialogViewModel liveGiftDialogViewModel = this.f17057f;
                if (!(liveGiftDialogViewModel == null || (tVar2 = liveGiftDialogViewModel.f17003a) == null || (value2 = tVar2.getValue()) == null || value2.intValue() != 1 || !com.bytedance.android.livesdk.firstrecharge.d.u.d())) {
                    if (com.bytedance.android.livesdk.firstrecharge.d.u.f()) {
                        j4 = com.bytedance.android.livesdk.firstrecharge.d.u.i();
                    }
                    dVar.element = j4;
                }
                a.C0355a.C0356a.f17017a.f17010f = dVar.element;
                if (this.p) {
                    this.p = false;
                    LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> linkedList2 = this.f17059h;
                    if (linkedList2 != null) {
                        a.C0460a.C0461a.f21366a.a(a.C0355a.C0356a.f17017a.f17011g, linkedList2);
                    }
                    b.a.C0448a.f21165a.f21164a = true;
                    RecyclerView recyclerView2 = this.f17052a;
                    if (recyclerView2 != null) {
                        recyclerView2.postDelayed(new a(this, dVar), 300);
                    }
                }
            } else {
                LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> linkedList3 = this.f17059h;
                if (linkedList3 != null) {
                    a.C0460a.C0461a.f21366a.a(a.C0355a.C0356a.f17017a.f17014j, linkedList3);
                }
                b.a.C0448a.f21165a.f21164a = false;
                n.a((List) this.f17064m, (h.f.a.b) b.f17067a);
                n.a((List) this.n, (h.f.a.b) c.f17068a);
                RecyclerView recyclerView3 = this.f17052a;
                if (recyclerView3 != null) {
                    recyclerView3.postDelayed(new d(this), 100);
                }
            }
            com.bytedance.android.livesdk.dialogv2.a.a aVar = this.f17053b;
            if (aVar != null) {
                aVar.a(linkedList);
            }
            int i2 = a.C0355a.C0356a.f17017a.f17011g;
            LiveGiftDialogViewModel liveGiftDialogViewModel2 = this.f17057f;
            if (!(liveGiftDialogViewModel2 == null || (tVar = liveGiftDialogViewModel2.f17003a) == null || (value = tVar.getValue()) == null || i2 != value.intValue() || (a2 = a(linkedList, dVar.element)) == -1 || (recyclerView = this.f17052a) == null)) {
                recyclerView.postDelayed(new e(this, a2), 20);
            }
            a.C0452a.C0453a.f21303a.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<? extends com.bytedance.android.livesdk.gift.model.GiftPage> r8) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget.a(java.util.List):void");
    }

    private static int a(LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> linkedList, long j2) {
        if (linkedList == null) {
            return -1;
        }
        for (ac acVar : n.n(linkedList)) {
            T t = acVar.f158623b;
            if (t != null && t.d() == j2) {
                return acVar.f158622a;
            }
        }
        return -1;
    }
}

package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import f.a.aa;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class FocusedSessionListWidget extends InboxAdapterWidget implements au, i, j {

    /* renamed from: a  reason: collision with root package name */
    public final t<InboxAdapterWidget.b> f101911a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a f101912b;

    /* renamed from: c  reason: collision with root package name */
    public final a f101913c;

    /* renamed from: i  reason: collision with root package name */
    private final f.a.b.a f101914i;

    /* renamed from: j  reason: collision with root package name */
    private final RecyclerView.a<?> f101915j;

    /* renamed from: k  reason: collision with root package name */
    private final t<Boolean> f101916k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<InboxAdapterWidget.b> f101917l;

    /* renamed from: m  reason: collision with root package name */
    private final aa f101918m;
    private final aa n;

    static {
        Covode.recordClassIndex(65213);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(195, new g(FocusedSessionListWidget.class, "onEvent", com.ss.android.ugc.aweme.im.sdk.common.data.model.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final t<Boolean> bq_() {
        return this.f101916k;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<InboxAdapterWidget.b> f() {
        return this.f101917l;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final RecyclerView.a<?> g() {
        return this.f101915j;
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        h();
    }

    private static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @v(a = i.a.ON_STOP)
    public final void onStop() {
        this.f101914i.a();
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.i.c();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final void h() {
        this.f104370e.requireContext();
        if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107226e = b();
        }
        if (com.ss.android.ugc.aweme.lancet.j.f107226e) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t.a();
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.im.service.b.b());
        }
    }

    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        EventBus.a(EventBus.a(), this);
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.i.a();
        this.f101912b.a().observe(this.f104370e, new a(this));
        this.f104371f.observe(this.f104370e, new b(this));
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.i.b();
        com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.c.a();
        a aVar = this.f101913c;
        Iterator<T> it = aVar.f101924c.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        n.a((List) aVar.f101924c, (h.f.a.b) a.b.f101934a);
        EventBus.a().b(this);
    }

    @v(a = i.a.ON_START)
    public final void onStart() {
        f.a.t<List<com.ss.android.ugc.aweme.im.service.k.a>> a2 = this.f101912b.c().b(this.f101918m).c(new c(this)).a(this.n);
        l.b(a2, "");
        this.f101914i.a(f.a.j.d.a(a2, new e(this), null, new d(this), 2));
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FocusedSessionListWidget f101919a;

        static {
            Covode.recordClassIndex(65214);
        }

        a(FocusedSessionListWidget focusedSessionListWidget) {
            this.f101919a = focusedSessionListWidget;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f101919a.f101912b.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final int a(int i2) {
        return this.f101912b.b(i2);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FocusedSessionListWidget f101921a;

        static {
            Covode.recordClassIndex(65216);
        }

        c(FocusedSessionListWidget focusedSessionListWidget) {
            this.f101921a = focusedSessionListWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f101921a.f101911a.postValue(InboxAdapterWidget.b.LOADING);
        }
    }

    @r
    public final void onEvent(com.ss.android.ugc.aweme.im.sdk.common.data.model.a aVar) {
        l.d(aVar, "");
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.aa.a();
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FocusedSessionListWidget f101920a;

        static {
            Covode.recordClassIndex(65215);
        }

        b(FocusedSessionListWidget focusedSessionListWidget) {
            this.f101920a = focusedSessionListWidget;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            InboxAdapterWidget.b bVar = (InboxAdapterWidget.b) obj;
            if (bVar != null && d.f101944a[bVar.ordinal()] == 1) {
                this.f101920a.f101912b.d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ FocusedSessionListWidget this$0;

        static {
            Covode.recordClassIndex(65218);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(FocusedSessionListWidget focusedSessionListWidget) {
            super(1);
            this.this$0 = focusedSessionListWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.d(th2, "");
            com.ss.android.ugc.aweme.im.service.m.a.a("FocusedSessionList", th2);
            this.this$0.f101911a.postValue(InboxAdapterWidget.b.FAIL);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.im.service.k.a>, z> {
        final /* synthetic */ FocusedSessionListWidget this$0;

        static {
            Covode.recordClassIndex(65217);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(FocusedSessionListWidget focusedSessionListWidget) {
            super(1);
            this.this$0 = focusedSessionListWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.im.service.k.a> list) {
            List<? extends com.ss.android.ugc.aweme.im.service.k.a> list2 = list;
            this.this$0.f101913c.a(list2);
            if (list2.isEmpty()) {
                this.this$0.f101911a.postValue(InboxAdapterWidget.b.EMPTY);
            } else {
                this.this$0.f101911a.postValue(InboxAdapterWidget.b.SUCCESS);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final void a(int i2, com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
        a aVar = this.f101913c;
        l.d(bVar, "");
        aVar.f101923b.put(i2, bVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FocusedSessionListWidget(androidx.fragment.app.Fragment r12, androidx.lifecycle.LiveData r13) {
        /*
            r11 = this;
            r0 = 0
            r5 = r12
            androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r5, r0)
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.FocusedSessionListViewModelImpl> r0 = com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.FocusedSessionListViewModelImpl.class
            androidx.lifecycle.ac r7 = r1.a(r0)
            java.lang.String r4 = ""
            h.f.b.l.b(r7, r4)
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a r7 = (com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a) r7
            androidx.fragment.app.e r3 = r5.requireActivity()
            h.f.b.l.b(r3, r4)
            h.f.b.l.d(r7, r4)
            h.f.b.l.d(r3, r4)
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a r8 = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a
            com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.b r2 = new com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.b
            java.lang.String r1 = "notification_page"
            java.lang.String r0 = "cell"
            r2.<init>(r3, r1, r0)
            r8.<init>(r7, r2)
            f.a.aa r0 = f.a.k.a.f158006c
            f.a.aa r9 = f.a.h.a.b(r0)
            h.f.b.l.b(r9, r4)
            f.a.aa r0 = f.a.a.b.a.f157156a
            f.a.aa r10 = f.a.a.a.a.a(r0)
            h.f.b.l.b(r10, r4)
            r4 = r11
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.FocusedSessionListWidget.<init>(androidx.fragment.app.Fragment, androidx.lifecycle.LiveData):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FocusedSessionListWidget(Fragment fragment, LiveData<InboxAdapterWidget.b> liveData, com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a aVar, a aVar2, aa aaVar, aa aaVar2) {
        super(fragment, liveData);
        l.d(fragment, "");
        l.d(liveData, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aaVar, "");
        l.d(aaVar2, "");
        this.f101912b = aVar;
        this.f101913c = aVar2;
        this.f101918m = aaVar;
        this.n = aaVar2;
        this.f101914i = new f.a.b.a();
        this.f101915j = aVar2;
        this.f101916k = aVar.a();
        t<InboxAdapterWidget.b> tVar = new t<>();
        this.f101911a = tVar;
        this.f101917l = tVar;
    }
}

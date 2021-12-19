package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.notification.view.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class c implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public f f44306a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.compliance.api.c.f f44307b;

    /* renamed from: c  reason: collision with root package name */
    public TabChangeManager f44308c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.ies.uikit.a.b f44309d;

    /* renamed from: e  reason: collision with root package name */
    public b f44310e;

    /* renamed from: f  reason: collision with root package name */
    public View f44311f;

    /* renamed from: g  reason: collision with root package name */
    public ScrollSwitchStateManager f44312g;

    /* renamed from: h  reason: collision with root package name */
    public DrawerViewModel f44313h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f44314i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f44315j;

    /* renamed from: k  reason: collision with root package name */
    public int f44316k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f44317l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f44318m;
    public boolean n;
    public boolean o;
    private com.ss.android.ugc.aweme.im.service.f.a.a p;
    private final h q = h.i.a((h.f.a.a) d.f44322a);

    static {
        Covode.recordClassIndex(27143);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(241, new g(c.class, "onCommentDialogEvent", com.ss.android.ugc.aweme.feed.i.d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f44323a;

        static {
            Covode.recordClassIndex(27148);
        }

        e(c cVar) {
            this.f44323a = cVar;
        }

        public final void run() {
            this.f44323a.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements PopupWindow.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f44320a;

        static {
            Covode.recordClassIndex(27145);
        }

        b(c cVar) {
            this.f44320a = cVar;
        }

        public final void onDismiss() {
            this.f44320a.f44315j = false;
            c.a(this.f44320a).b();
        }
    }

    static final class d extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f44322a = new d();

        static {
            Covode.recordClassIndex(27147);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.c$c  reason: collision with other inner class name */
    public static final class RunnableC1081c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f44321a;

        static {
            Covode.recordClassIndex(27146);
        }

        RunnableC1081c(c cVar) {
            this.f44321a = cVar;
        }

        public final void run() {
            this.f44321a.f44315j = false;
            if (com.ss.android.ugc.aweme.notice.api.ab.b.b()) {
                c.a(this.f44321a).c();
            } else {
                c.a(this.f44321a).b();
            }
        }
    }

    public final void a() {
        f fVar;
        if (this.f44315j && (fVar = this.f44306a) != null) {
            fVar.a();
        }
    }

    public final void c() {
        this.f44315j = true;
        View view = this.f44311f;
        if (view == null) {
            l.a("mAnchorView");
        }
        Context context = view.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        View b2 = HomeTabViewModel.a.a((androidx.fragment.app.e) context).b("NOTIFICATION");
        if (b2 == null) {
            l.b();
        }
        com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a) b2;
        f fVar = this.f44306a;
        if (fVar == null) {
            l.b();
        }
        boolean a2 = fVar.a(aVar);
        this.f44314i = a2;
        if (a2) {
            this.o = false;
        }
        if (!com.ss.android.ugc.aweme.notice.api.ab.b.b()) {
            b bVar = this.f44310e;
            if (bVar == null) {
                l.a("mNotificationCallback");
            }
            bVar.d();
        } else if (this.f44314i) {
            b bVar2 = this.f44310e;
            if (bVar2 == null) {
                l.a("mNotificationCallback");
            }
            bVar2.d();
        }
        com.ss.android.ugc.aweme.notification.e.a.b.a("MainPageFragment", "UnReadCountMonitor isShowNotifyPop: " + this.f44314i);
    }

    public final void d() {
        View contentView;
        com.bytedance.ies.uikit.a.b bVar = this.f44309d;
        if (bVar == null) {
            l.a("mFragment");
        }
        androidx.fragment.app.e activity = bVar.getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type android.app.Activity");
        f fVar = new f(activity);
        this.f44306a = fVar;
        fVar.setOutsideTouchable(true);
        f fVar2 = this.f44306a;
        if (!(fVar2 == null || (contentView = fVar2.getContentView()) == null)) {
            contentView.setOnClickListener(new a(this));
        }
        f fVar3 = this.f44306a;
        if (fVar3 != null) {
            fVar3.setOnDismissListener(new b(this));
        }
        f fVar4 = this.f44306a;
        if (fVar4 != null) {
            fVar4.f109176a = new RunnableC1081c(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if (r0.getToastVisibility() != 0) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.dialog.c.b():void");
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f44319a;

        static {
            Covode.recordClassIndex(27144);
        }

        a(c cVar) {
            this.f44319a = cVar;
        }

        public final void onClick(View view) {
            c.a(this.f44319a).a();
        }
    }

    public static final /* synthetic */ b a(c cVar) {
        b bVar = cVar.f44310e;
        if (bVar == null) {
            l.a("mNotificationCallback");
        }
        return bVar;
    }

    @r
    public final void onCommentDialogEvent(com.ss.android.ugc.aweme.feed.i.d dVar) {
        l.d(dVar, "");
        this.f44316k = dVar.f93466a;
    }

    public c(com.ss.android.ugc.aweme.im.service.f.a.a aVar) {
        l.d(aVar, "");
        this.p = aVar;
        EventBus.a(EventBus.a(), this);
        this.n = false;
    }
}

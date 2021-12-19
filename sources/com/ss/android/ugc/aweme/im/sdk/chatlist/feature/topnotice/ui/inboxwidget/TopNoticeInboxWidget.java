package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.utils.fg;
import h.a.n;
import h.a.z;
import h.f.b.l;

public final class TopNoticeInboxWidget extends InboxAdapterWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public final t<InboxAdapterWidget.b> f102036a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.a f102037b;

    /* renamed from: c  reason: collision with root package name */
    private final LiveData<InboxAdapterWidget.b> f102038c;

    /* renamed from: i  reason: collision with root package name */
    private final t<Boolean> f102039i;

    /* renamed from: j  reason: collision with root package name */
    private final RecyclerView.a<?> f102040j;

    /* renamed from: k  reason: collision with root package name */
    private final SessionListTopNoticeViewModel f102041k;

    /* renamed from: l  reason: collision with root package name */
    private final h.f.a.a<Integer> f102042l;

    /* renamed from: m  reason: collision with root package name */
    private final h.f.a.b<Context, Boolean> f102043m;

    static {
        Covode.recordClassIndex(65292);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final int a(int i2) {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final t<Boolean> bq_() {
        return this.f102039i;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<InboxAdapterWidget.b> f() {
        return this.f102038c;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final RecyclerView.a<?> g() {
        return this.f102040j;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final void h() {
        int intValue = this.f102042l.invoke().intValue();
        h.f.a.b<Context, Boolean> bVar = this.f102043m;
        Context requireContext = this.f104370e.requireContext();
        l.b(requireContext, "");
        this.f102041k.a(intValue, bVar.invoke(requireContext).booleanValue());
        this.f102036a.setValue(InboxAdapterWidget.b.LOADING);
    }

    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        this.f102041k.f102058i.observe(this.f104370e, new a(this));
        this.f102041k.f102054e.observe(this.f104370e, new b(this));
        this.f102041k.f102056g.observe(this.f104370e, new c(this));
        h();
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TopNoticeInboxWidget f102048a;

        static {
            Covode.recordClassIndex(65297);
        }

        c(TopNoticeInboxWidget topNoticeInboxWidget) {
            this.f102048a = topNoticeInboxWidget;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            fg.b(this.f102048a.f104370e.requireContext());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TopNoticeInboxWidget f102047a;

        static {
            Covode.recordClassIndex(65296);
        }

        b(TopNoticeInboxWidget topNoticeInboxWidget) {
            this.f102047a = topNoticeInboxWidget;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            SmartRouter.buildRoute(this.f102047a.f104370e.requireContext(), "aweme://push_setting_manager").open();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TopNoticeInboxWidget f102046a;

        static {
            Covode.recordClassIndex(65295);
        }

        a(TopNoticeInboxWidget topNoticeInboxWidget) {
            this.f102046a = topNoticeInboxWidget;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj == com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.b.EmptyTopNoticeView) {
                this.f102046a.f102037b.a(z.INSTANCE);
                this.f102046a.f102036a.setValue(InboxAdapterWidget.b.EMPTY);
                return;
            }
            this.f102046a.f102037b.a(n.a(obj));
            this.f102046a.f102036a.setValue(InboxAdapterWidget.b.SUCCESS);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TopNoticeInboxWidget(androidx.fragment.app.Fragment r10, androidx.lifecycle.LiveData r11) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel r1 = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel
            java.lang.String r2 = "notification_page"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 62
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.a r6 = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.a
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType r0 = com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType.INBOX
            r6.<init>(r0, r1)
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget.TopNoticeInboxWidget$1 r7 = com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget.TopNoticeInboxWidget.AnonymousClass1.f102044a
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget.TopNoticeInboxWidget$2 r8 = com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget.TopNoticeInboxWidget.AnonymousClass2.f102045a
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget.TopNoticeInboxWidget.<init>(androidx.fragment.app.Fragment, androidx.lifecycle.LiveData):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super android.content.Context, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TopNoticeInboxWidget(Fragment fragment, LiveData<InboxAdapterWidget.b> liveData, SessionListTopNoticeViewModel sessionListTopNoticeViewModel, com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.a aVar, h.f.a.a<Integer> aVar2, h.f.a.b<? super Context, Boolean> bVar) {
        super(fragment, liveData);
        l.d(fragment, "");
        l.d(liveData, "");
        l.d(sessionListTopNoticeViewModel, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(bVar, "");
        this.f102041k = sessionListTopNoticeViewModel;
        this.f102037b = aVar;
        this.f102042l = aVar2;
        this.f102043m = bVar;
        t<InboxAdapterWidget.b> tVar = new t<>();
        this.f102036a = tVar;
        this.f102038c = tVar;
        this.f102039i = new t<>();
        this.f102040j = aVar;
    }
}

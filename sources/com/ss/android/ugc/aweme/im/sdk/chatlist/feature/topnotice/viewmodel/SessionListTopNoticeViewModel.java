package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticePushStatus;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import h.a.ag;
import h.c.b.a.k;
import h.c.f;
import h.f.a.m;
import h.f.b.l;
import h.m.p;
import h.r;
import h.v;
import h.z;
import java.util.Map;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ah;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.av;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public class SessionListTopNoticeViewModel extends ac {

    /* renamed from: m  reason: collision with root package name */
    public static final c f102049m = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final am f102050a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineExceptionHandler f102051b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineExceptionHandler f102052c;

    /* renamed from: d  reason: collision with root package name */
    public final t<b<z>> f102053d;

    /* renamed from: e  reason: collision with root package name */
    public final LiveData<b<z>> f102054e;

    /* renamed from: f  reason: collision with root package name */
    public final t<b<z>> f102055f;

    /* renamed from: g  reason: collision with root package name */
    public final LiveData<b<z>> f102056g;

    /* renamed from: h  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.b> f102057h;

    /* renamed from: i  reason: collision with root package name */
    public final LiveData<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.b> f102058i;

    /* renamed from: j  reason: collision with root package name */
    public final TikTokImApi f102059j;

    /* renamed from: k  reason: collision with root package name */
    public final n f102060k;

    /* renamed from: l  reason: collision with root package name */
    public final ah f102061l;
    private final String n;
    private final m<String, Map<String, String>, z> o;
    private final ah p;

    static {
        Covode.recordClassIndex(65298);
    }

    public SessionListTopNoticeViewModel() {
        this(null, null, null, null, null, null, 63);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(65302);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        super.onCleared();
        an.b(this.f102050a);
    }

    public static final class a extends h.c.a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(65300);
        }

        public a(f.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(f fVar, Throwable th) {
            com.ss.android.ugc.aweme.im.service.m.a.e("TopNoticeViewModel", "fetchTopNoticeService onError called with ".concat(String.valueOf(th)));
        }
    }

    public static final class b extends h.c.a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(65301);
        }

        public b(f.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(f fVar, Throwable th) {
            com.ss.android.ugc.aweme.im.service.m.a.e("TopNoticeViewModel", "sendNoticeAckService onError called with ".concat(String.valueOf(th)));
        }
    }

    public final void a(String str) {
        String eventPopUpType;
        com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.b value = this.f102057h.getValue();
        if (value != null && (eventPopUpType = value.getEventPopUpType()) != null) {
            this.o.invoke(str, ag.a(v.a("enter_from", this.n), v.a("pop_up_type", eventPopUpType)));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ TopChatNoticePushStatus $pushStatus;
        final /* synthetic */ int $unreadCount;
        int label;
        final /* synthetic */ SessionListTopNoticeViewModel this$0;

        static {
            Covode.recordClassIndex(65303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, int i2, TopChatNoticePushStatus topChatNoticePushStatus, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = sessionListTopNoticeViewModel;
            this.$unreadCount = i2;
            this.$pushStatus = topChatNoticePushStatus;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new d(this.this$0, this.$unreadCount, this.$pushStatus, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0051 A[RETURN] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                h.c.a.a r3 = h.c.a.a.COROUTINE_SUSPENDED
                int r0 = r12.label
                r4 = 2
                r1 = 1
                if (r0 == 0) goto L_0x0012
                if (r0 == r1) goto L_0x003a
                if (r0 != r4) goto L_0x0052
                h.r.a(r13)
            L_0x000f:
                h.z r0 = h.z.f158842a
                return r0
            L_0x0012:
                h.r.a(r13)
                com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel r0 = r12.this$0
                com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi r5 = r0.f102059j
                com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType r0 = com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType.INBOX
                java.lang.String r9 = r0.getType()
                int r10 = r12.$unreadCount
                com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticePushStatus r0 = r12.$pushStatus
                int r11 = r0.getStatus()
                java.lang.String r6 = ""
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                kotlinx.coroutines.av r0 = r5.getTopChatNotice(r6, r7, r8, r9, r10, r11)
                r12.label = r1
                java.lang.Object r13 = r0.a(r12)
                if (r13 != r3) goto L_0x003d
                return r3
            L_0x003a:
                h.r.a(r13)
            L_0x003d:
                com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel r13 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel) r13
                com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel r0 = r12.this$0
                kotlinx.coroutines.ah r2 = r0.f102061l
                com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel$d$1 r1 = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel$d$1
                r0 = 0
                r1.<init>(r12, r13, r0)
                r12.label = r4
                java.lang.Object r0 = kotlinx.coroutines.i.a(r2, r1, r12)
                if (r0 != r3) goto L_0x000f
                return r3
            L_0x0052:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ String $converastionId;
        final /* synthetic */ String $noticeCode;
        final /* synthetic */ int $operationCode;
        final /* synthetic */ TopChatNoticeSourceType $source;
        int label;
        final /* synthetic */ SessionListTopNoticeViewModel this$0;

        static {
            Covode.recordClassIndex(65305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, String str, TopChatNoticeSourceType topChatNoticeSourceType, int i2, String str2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = sessionListTopNoticeViewModel;
            this.$noticeCode = str;
            this.$source = topChatNoticeSourceType;
            this.$operationCode = i2;
            this.$converastionId = str2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new e(this.this$0, this.$noticeCode, this.$source, this.$operationCode, this.$converastionId, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((e) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                av<BaseResponse> acknowledgeNoticeRead = this.this$0.f102059j.acknowledgeNoticeRead(this.$noticeCode, this.$source.getType(), this.$operationCode, this.$converastionId);
                this.label = 1;
                obj = acknowledgeNoticeRead.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.ss.android.ugc.aweme.im.service.m.a.c("TopNoticeViewModel", "sendNoticeAckService OnSuccess called with " + ((BaseResponse) obj).status_code);
            return z.f158842a;
        }
    }

    public final void a(int i2, boolean z) {
        TopChatNoticePushStatus topChatNoticePushStatus;
        if (z) {
            topChatNoticePushStatus = TopChatNoticePushStatus.PUSH_STATUS_ON;
        } else {
            topChatNoticePushStatus = TopChatNoticePushStatus.PUSH_STATUS_OFF;
        }
        bz unused = i.a(this.f102050a, this.f102051b, null, new d(this, i2, topChatNoticePushStatus, null), 2);
    }

    public final void a(String str, TopChatNoticeSourceType topChatNoticeSourceType, int i2, String str2) {
        l.d(topChatNoticeSourceType, "");
        if (str == null || p.a((CharSequence) str)) {
            com.ss.android.ugc.aweme.im.service.m.a.d("TopNoticeViewModel", "sendNoticeAckEvent notice code is null ".concat(String.valueOf(str)));
        } else {
            bz unused = i.a(this.f102050a, this.f102052c, null, new e(this, str, topChatNoticeSourceType, i2, str2, null), 2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.m<? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private SessionListTopNoticeViewModel(String str, TikTokImApi tikTokImApi, m<? super String, ? super Map<String, String>, z> mVar, n nVar, ah ahVar, ah ahVar2) {
        l.d(str, "");
        l.d(tikTokImApi, "");
        l.d(mVar, "");
        l.d(nVar, "");
        l.d(ahVar, "");
        l.d(ahVar2, "");
        this.n = str;
        this.f102059j = tikTokImApi;
        this.o = mVar;
        this.f102060k = nVar;
        this.p = ahVar;
        this.f102061l = ahVar2;
        t<b<z>> tVar = new t<>();
        this.f102053d = tVar;
        this.f102054e = tVar;
        t<b<z>> tVar2 = new t<>();
        this.f102055f = tVar2;
        this.f102056g = tVar2;
        t<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.b> tVar3 = new t<>();
        this.f102057h = tVar3;
        this.f102058i = tVar3;
        this.f102050a = an.a(ahVar);
        this.f102051b = new a(CoroutineExceptionHandler.f158926c);
        this.f102052c = new b(CoroutineExceptionHandler.f158926c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SessionListTopNoticeViewModel(java.lang.String r9, com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi r10, h.f.a.m r11, com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n r12, kotlinx.coroutines.ah r13, kotlinx.coroutines.ah r14, int r15) {
        /*
            r8 = this;
            r7 = r14
            r6 = r13
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0 = r15 & 1
            if (r0 == 0) goto L_0x000c
            java.lang.String r2 = "chat_list"
        L_0x000c:
            r0 = r15 & 2
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0019
            com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi r3 = com.ss.android.ugc.aweme.im.sdk.common.data.api.b.a()
            h.f.b.l.b(r3, r1)
        L_0x0019:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x001f
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel$1 r4 = com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel.AnonymousClass1.f102062a
        L_0x001f:
            r0 = r15 & 8
            if (r0 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n r5 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n.a()
            h.f.b.l.b(r5, r1)
        L_0x002a:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x0030
            kotlinx.coroutines.ah r6 = kotlinx.coroutines.bf.f159041b
        L_0x0030:
            r0 = r15 & 32
            if (r0 == 0) goto L_0x0036
            kotlinx.coroutines.android.b r7 = com.ss.android.ugc.aweme.af.a.f66269a
        L_0x0036:
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel.<init>(java.lang.String, com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi, h.f.a.m, com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n, kotlinx.coroutines.ah, kotlinx.coroutines.ah, int):void");
    }
}

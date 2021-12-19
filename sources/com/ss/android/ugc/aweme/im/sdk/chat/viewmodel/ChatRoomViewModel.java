package com.ss.android.ugc.aweme.im.sdk.chat.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import f.a.aa;
import f.a.ab;
import h.z;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ChatRoomViewModel extends ac implements au {

    /* renamed from: m  reason: collision with root package name */
    public static final a f101475m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final f.a.l.c<com.ss.android.ugc.aweme.im.sdk.chat.data.d.c> f101476a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a.l.c<com.ss.android.ugc.aweme.im.sdk.chat.data.d.a> f101477b;

    /* renamed from: c  reason: collision with root package name */
    public final f.a.l.c<z> f101478c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.data.a f101479d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.data.c.k f101480e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.data.c.g f101481f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.a.b f101482g;

    /* renamed from: h  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.service.g.c f101483h;

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.data.c.c f101484i;

    /* renamed from: j  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.ui.base.d f101485j;

    /* renamed from: k  reason: collision with root package name */
    final f.a.b.a f101486k;

    /* renamed from: l  reason: collision with root package name */
    final aa f101487l;
    private final f.a.b.a n;

    static {
        Covode.recordClassIndex(64892);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            subscribeToEvents$im_base_release();
        } else if (aVar == i.a.ON_RESUME) {
            onResume$im_base_release();
        } else if (aVar == i.a.ON_STOP) {
            onStop$im_base_release();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy$im_base_release();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64893);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$a$a  reason: collision with other inner class name */
        public static final class C2521a implements ad.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.data.a f101488a;

            static {
                Covode.recordClassIndex(64894);
            }

            public C2521a(com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar) {
                this.f101488a = aVar;
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                h.f.b.l.d(cls, "");
                if (cls.isAssignableFrom(ChatRoomViewModel.class)) {
                    return new ChatRoomViewModel(this.f101488a);
                }
                throw new IllegalArgumentException("ChatRoomViewModel.get(): Unknown ViewModel class");
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(ChatRoomViewModel chatRoomViewModel) {
            super(0);
            this.this$0 = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f101484i.c("refreshStrangerMode() conversation invalid: conversation is null");
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(ChatRoomViewModel chatRoomViewModel) {
            super(0);
            this.this$0 = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f101484i.b("shouldShowChatTopTip() no extras");
            return z.f158842a;
        }
    }

    public final com.bytedance.ies.im.core.api.b.e a() {
        return this.f101480e.a(this.f101479d.getConversationId());
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy$im_base_release() {
        this.f101476a.onComplete();
        this.f101477b.onComplete();
        this.n.a();
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume$im_base_release() {
        b();
        this.f101480e.c(this.f101479d.getConversationId());
    }

    public final void b() {
        ab<com.bytedance.im.core.d.h> b2 = this.f101481f.c(this.f101479d.getConversationId()).b(this.f101487l);
        h.f.b.l.b(b2, "");
        f.a.j.a.a(f.a.j.d.a(b2, new e(this), new d(this)), this.f101486k);
    }

    @v(a = i.a.ON_STOP)
    public final void onStop$im_base_release() {
        String str;
        this.f101480e.d(this.f101479d.getConversationId());
        com.ss.android.ugc.aweme.im.sdk.chat.a.b bVar = this.f101482g;
        String conversationId = this.f101479d.getConversationId();
        if (this.f101479d.isStrangerChat()) {
            str = "stranger";
        } else {
            str = "no_stranger";
        }
        bVar.a(conversationId, str);
        this.f101482g.a();
        this.f101486k.a();
    }

    @v(a = i.a.ON_CREATE)
    public final void subscribeToEvents$im_base_release() {
        f.a.j.a.a(f.a.j.d.a(this.f101481f.a(this.f101479d.getConversationId()), null, null, new n(this.f101477b), 3), this.n);
        f.a.t<com.ss.android.ugc.aweme.im.sdk.chat.data.d.a> a2 = this.f101477b.a(this.f101487l);
        h.f.b.l.b(a2, "");
        f.a.j.a.a(f.a.j.d.a(a2, new p(this), null, new o(this), 2), this.n);
        f.a.j.a.a(f.a.j.d.a(this.f101480e.b(this.f101479d.getConversationId()), new r(this), null, new q(this.f101476a), 2), this.n);
        f.a.t<com.ss.android.ugc.aweme.im.sdk.chat.data.d.c> b2 = this.f101476a.b(this.f101487l);
        h.f.b.l.b(b2, "");
        f.a.j.a.a(f.a.j.d.a(b2, new t(this), null, new s(this), 2), this.n);
        f.a.t<z> d2 = this.f101478c.a(this.f101487l).d(100, TimeUnit.MILLISECONDS);
        h.f.b.l.b(d2, "");
        f.a.j.a.a(f.a.j.d.a(d2, null, null, new u(this), 3), this.n);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<com.bytedance.im.core.d.h, z> {
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.this$0 = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.im.core.d.h hVar) {
            this.this$0.f101478c.onNext(z.f158842a);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class n extends h.f.b.j implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chat.data.d.a, z> {
        static {
            Covode.recordClassIndex(64907);
        }

        n(f.a.l.c cVar) {
            super(1, cVar, f.a.l.c.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.im.sdk.chat.data.d.a aVar) {
            h.f.b.l.d(aVar, "");
            ((f.a.l.c) this.receiver).onNext(aVar);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class q extends h.f.b.j implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chat.data.d.c, z> {
        static {
            Covode.recordClassIndex(64910);
        }

        q(f.a.l.c cVar) {
            super(1, cVar, f.a.l.c.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.im.sdk.chat.data.d.c cVar) {
            h.f.b.l.d(cVar, "");
            ((f.a.l.c) this.receiver).onNext(cVar);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.this$0 = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            this.this$0.f101484i.a("checkCommentMsgState error", th2);
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64896);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.this$0 = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            this.this$0.f101484i.a("clearGreetEmoji unexpected error", th2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.this$0 = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            this.this$0.f101484i.a("ensureConversationCreated() unexpected error", th2);
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.this$0 = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            this.this$0.f101484i.a("refreshStrangerMode() unexpected error", th2);
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.this$0 = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            this.this$0.f101484i.a(th2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.this$0 = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            this.this$0.f101484i.a("subscribeToConversationChanges unexpected error:", th2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.this$0 = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            this.this$0.f101484i.a("subscribeToMessages msgRepo", th2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64913);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.this$0 = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            this.this$0.f101484i.a("subscribeToMessages unexpected error:", th2);
            return z.f158842a;
        }
    }

    static final class f<T> implements f.a.d.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChatRoomViewModel f101489a;

        static {
            Covode.recordClassIndex(64899);
        }

        f(ChatRoomViewModel chatRoomViewModel) {
            this.f101489a = chatRoomViewModel;
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            com.bytedance.im.core.d.h hVar = (com.bytedance.im.core.d.h) obj;
            h.f.b.l.d(hVar, "");
            if (hVar.isTemp()) {
                this.f101489a.f101484i.c("refreshStrangerMode conversation invalid: isTemp == true");
                return false;
            } else if (hVar.isSingleChat()) {
                return true;
            } else {
                this.f101489a.f101484i.c("refreshStrangerMode not single chat: conversationType = " + hVar.getConversationType());
                return false;
            }
        }
    }

    static final class g<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ai f101490a;

        static {
            Covode.recordClassIndex(64900);
        }

        g(ai aiVar) {
            this.f101490a = aiVar;
        }

        @Override // f.a.q
        public final void a(f.a.o<h.p<CheckMessage, SystemContent>> oVar) {
            h.f.b.l.d(oVar, "");
            CheckMessage checkMessage = (CheckMessage) com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j.a(this.f101490a.getLocalExt().get("s:send_response_check_msg"), CheckMessage.class);
            SystemContent content = CheckMessage.getContent(checkMessage);
            if (content != null) {
                oVar.a(new h.p<>(checkMessage, content));
            } else {
                oVar.a();
            }
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<h.p<? extends CheckMessage, ? extends SystemContent>, z> {
        final /* synthetic */ ai $msg;
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64904);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(ChatRoomViewModel chatRoomViewModel, ai aiVar) {
            super(1);
            this.this$0 = chatRoomViewModel;
            this.$msg = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(h.p<? extends CheckMessage, ? extends SystemContent> pVar) {
            h.p<? extends CheckMessage, ? extends SystemContent> pVar2 = pVar;
            SystemContent systemContent = (SystemContent) pVar2.component2();
            CheckMessage.StatusMsg statusMsg = ((CheckMessage) pVar2.component1()).status_msg;
            if (statusMsg != null && statusMsg.msg_type == 1022) {
                com.ss.android.ugc.aweme.im.sdk.chat.ui.base.d dVar = this.this$0.f101485j;
                String conversationId = this.$msg.getConversationId();
                h.f.b.l.b(conversationId, "");
                dVar.a(systemContent, conversationId);
            }
            return z.f158842a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ChatRoomViewModel(com.ss.android.ugc.aweme.im.sdk.chat.data.a r12) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.im.sdk.chat.data.c.l r2 = new com.ss.android.ugc.aweme.im.sdk.chat.data.c.l
            r2.<init>()
            com.ss.android.ugc.aweme.im.sdk.chat.data.c.h r3 = new com.ss.android.ugc.aweme.im.sdk.chat.data.c.h
            r3.<init>()
            com.ss.android.ugc.aweme.im.sdk.chat.a.c r4 = new com.ss.android.ugc.aweme.im.sdk.chat.a.c
            r4.<init>()
            com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.a r5 = com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.a.f102292a
            com.ss.android.ugc.aweme.im.sdk.chat.data.c.d r6 = new com.ss.android.ugc.aweme.im.sdk.chat.data.c.d
            java.lang.String r0 = "ChatRoomViewModel"
            r6.<init>(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.e r7 = new com.ss.android.ugc.aweme.im.sdk.chat.ui.base.e
            r7.<init>()
            f.a.b.a r8 = new f.a.b.a
            r8.<init>()
            f.a.b.a r9 = new f.a.b.a
            r9.<init>()
            f.a.aa r0 = f.a.k.a.f158006c
            f.a.aa r10 = f.a.h.a.b(r0)
            java.lang.String r0 = ""
            h.f.b.l.b(r10, r0)
            r0 = r11
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel.<init>(com.ss.android.ugc.aweme.im.sdk.chat.data.a):void");
    }

    public final void a(List<ai> list) {
        h.f.b.l.d(list, "");
        f.a.b b2 = this.f101485j.b(list).b(this.f101487l).b();
        h.f.b.l.b(b2, "");
        f.a.j.a.a(f.a.j.d.a(b2, new b(this)), this.f101486k);
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.bytedance.im.core.d.h, z> {
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64901);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.this$0 = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.im.core.d.h hVar) {
            com.bytedance.im.core.d.h hVar2 = hVar;
            if (this.this$0.f101479d.isStrangerChat()) {
                h.f.b.l.b(hVar2, "");
                if (!hVar2.isStranger()) {
                    this.this$0.f101484i.b("refreshStrangerMode change to friend");
                    this.this$0.f101479d.setChatType(0);
                    return z.f158842a;
                }
            }
            if (this.this$0.f101479d.isFriendChat()) {
                h.f.b.l.b(hVar2, "");
                if (hVar2.isStranger()) {
                    this.this$0.f101484i.b("refreshStrangerMode change to stranger");
                    this.this$0.f101479d.setChatType(1);
                    this.this$0.f101480e.e(this.this$0.f101479d.getConversationId());
                }
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chat.data.d.a, z> {
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.this$0 = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.im.sdk.chat.data.d.a aVar) {
            com.ss.android.ugc.aweme.im.sdk.chat.data.d.a aVar2 = aVar;
            if (aVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.d.j) {
                this.this$0.f101476a.onNext(new com.ss.android.ugc.aweme.im.sdk.chat.data.d.g(this.this$0.f101479d.getConversationId()));
            } else if (aVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.d.h) {
                this.this$0.f101485j.a(((com.ss.android.ugc.aweme.im.sdk.chat.data.d.h) aVar2).f100285a);
                this.this$0.f101478c.onNext(z.f158842a);
            } else if (aVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.d.z) {
                this.this$0.f101478c.onNext(z.f158842a);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.this$0 = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            ChatRoomViewModel chatRoomViewModel = this.this$0;
            String conversationId = chatRoomViewModel.f101479d.getConversationId();
            h.f.b.l.d(conversationId, "");
            f.a.n<com.bytedance.im.core.d.h> a2 = chatRoomViewModel.f101481f.b(conversationId).a(new f(chatRoomViewModel));
            h.f.b.l.b(a2, "");
            f.a.n<com.bytedance.im.core.d.h> b2 = a2.b(chatRoomViewModel.f101487l);
            h.f.b.l.b(b2, "");
            h hVar = new h(chatRoomViewModel);
            f.a.j.a.a(f.a.j.d.a(b2, new j(chatRoomViewModel), new i(chatRoomViewModel), hVar), chatRoomViewModel.f101486k);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chat.data.d.c, z> {
        final /* synthetic */ ChatRoomViewModel this$0;

        static {
            Covode.recordClassIndex(64912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.this$0 = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.im.sdk.chat.data.d.c cVar) {
            com.ss.android.ugc.aweme.im.sdk.chat.data.d.c cVar2 = cVar;
            if (cVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.d.v) {
                ai aiVar = ((com.ss.android.ugc.aweme.im.sdk.chat.data.d.v) cVar2).f100310b;
                if (this.this$0.f101479d.isStrangerChat() && aiVar.getMsgStatus() == 2) {
                    this.this$0.f101484i.a("onSendMsg: RefreshStrangerEvent");
                    this.this$0.f101485j.a(this.this$0.f101479d.getConversationId());
                }
                if (aiVar.getMsgStatus() == 3) {
                    com.ss.android.ugc.aweme.im.sdk.chat.data.c.g gVar = this.this$0.f101481f;
                    String conversationId = aiVar.getConversationId();
                    h.f.b.l.b(conversationId, "");
                    if (!gVar.d(conversationId)) {
                        this.this$0.b();
                    }
                }
                ChatRoomViewModel chatRoomViewModel = this.this$0;
                h.f.b.l.d(aiVar, "");
                if (aiVar.getMsgStatus() == 3) {
                    h.f.b.l.d(aiVar, "");
                    f.a.n a2 = f.a.n.a((f.a.q) new g(aiVar));
                    h.f.b.l.b(a2, "");
                    f.a.n b2 = a2.b(chatRoomViewModel.f101487l);
                    h.f.b.l.b(b2, "");
                    k kVar = new k(chatRoomViewModel, aiVar);
                    f.a.j.a.a(f.a.j.d.a(b2, new m(chatRoomViewModel), new l(chatRoomViewModel), kVar), chatRoomViewModel.f101486k);
                }
                this.this$0.f101482g.a(aiVar);
            } else if (cVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.d.l) {
                com.ss.android.ugc.aweme.im.sdk.chat.data.d.l lVar = (com.ss.android.ugc.aweme.im.sdk.chat.data.d.l) cVar2;
                if (lVar.f100290b == 0) {
                    ChatRoomViewModel chatRoomViewModel2 = this.this$0;
                    String conversationId2 = chatRoomViewModel2.f101479d.getConversationId();
                    h.f.b.l.d(conversationId2, "");
                    f.a.b b3 = chatRoomViewModel2.f101481f.a(conversationId2, "awe:greet_emoji").b(chatRoomViewModel2.f101487l);
                    h.f.b.l.b(b3, "");
                    f.a.j.a.a(f.a.j.d.a(b3, new c(chatRoomViewModel2)), chatRoomViewModel2.f101486k);
                }
                this.this$0.a(lVar.f100289a);
            } else if (cVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.d.r) {
                com.ss.android.ugc.aweme.im.sdk.chat.data.d.r rVar = (com.ss.android.ugc.aweme.im.sdk.chat.data.d.r) cVar2;
                this.this$0.f101485j.a(rVar.f100302a);
                this.this$0.a(rVar.f100302a);
                this.this$0.f101483h.a(new com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.c(this.this$0.f101479d.getConversationId()), new com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.b(rVar.f100302a.size()));
            } else if (cVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.d.q) {
                com.ss.android.ugc.aweme.im.sdk.chat.data.d.q qVar = (com.ss.android.ugc.aweme.im.sdk.chat.data.d.q) cVar2;
                if (qVar.f100301b) {
                    this.this$0.f101485j.a(qVar.f100300a);
                    this.this$0.a(qVar.f100300a);
                }
            }
            return z.f158842a;
        }
    }

    private ChatRoomViewModel(com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar, com.ss.android.ugc.aweme.im.sdk.chat.data.c.k kVar, com.ss.android.ugc.aweme.im.sdk.chat.data.c.g gVar, com.ss.android.ugc.aweme.im.sdk.chat.a.b bVar, com.ss.android.ugc.aweme.im.service.g.c cVar, com.ss.android.ugc.aweme.im.sdk.chat.data.c.c cVar2, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.d dVar, f.a.b.a aVar2, f.a.b.a aVar3, aa aaVar) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(gVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(cVar2, "");
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(aVar2, "");
        h.f.b.l.d(aVar3, "");
        h.f.b.l.d(aaVar, "");
        this.f101479d = aVar;
        this.f101480e = kVar;
        this.f101481f = gVar;
        this.f101482g = bVar;
        this.f101483h = cVar;
        this.f101484i = cVar2;
        this.f101485j = dVar;
        this.f101486k = aVar2;
        this.n = aVar3;
        this.f101487l = aaVar;
        f.a.l.c<com.ss.android.ugc.aweme.im.sdk.chat.data.d.c> cVar3 = new f.a.l.c<>();
        h.f.b.l.b(cVar3, "");
        this.f101476a = cVar3;
        f.a.l.c<com.ss.android.ugc.aweme.im.sdk.chat.data.d.a> cVar4 = new f.a.l.c<>();
        h.f.b.l.b(cVar4, "");
        this.f101477b = cVar4;
        f.a.l.c<z> cVar5 = new f.a.l.c<>();
        h.f.b.l.b(cVar5, "");
        this.f101478c = cVar5;
    }
}

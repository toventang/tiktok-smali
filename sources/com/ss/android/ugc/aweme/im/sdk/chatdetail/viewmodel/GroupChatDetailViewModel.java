package com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel;

import android.app.Activity;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.proto.ApplyStatusCode;
import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.bytedance.im.core.proto.GroupRole;
import com.ss.android.ugc.aweme.friends.service.IFollowService;
import com.ss.android.ugc.aweme.im.sdk.common.data.a.a;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.BlockResponse;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class GroupChatDetailViewModel extends androidx.lifecycle.ac {

    /* renamed from: f  reason: collision with root package name */
    public static final a f101794f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e f101795a = new com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e((List) null, false, 7);

    /* renamed from: b  reason: collision with root package name */
    public String f101796b;

    /* renamed from: c  reason: collision with root package name */
    public final ad f101797c;

    /* renamed from: d  reason: collision with root package name */
    public final String f101798d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.ies.im.core.api.b.b f101799e;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f101800g = h.i.a((h.f.a.a) new n(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f101801h = h.i.a((h.f.a.a) new b(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f101802i = h.i.a((h.f.a.a) c.f101817a);

    static {
        Covode.recordClassIndex(65081);
    }

    public final long a() {
        return ((Number) this.f101800g.getValue()).longValue();
    }

    public final com.ss.android.ugc.aweme.im.sdk.common.data.a.a<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> b() {
        return (com.ss.android.ugc.aweme.im.sdk.common.data.a.a) this.f101801h.getValue();
    }

    public final androidx.lifecycle.t<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.c<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c>> c() {
        return (androidx.lifecycle.t) this.f101802i.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65082);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.c<? extends com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f101817a = new c();

        static {
            Covode.recordClassIndex(65110);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.c<? extends com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c>> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    private final void j() {
        b(aj.f101807a);
    }

    public static final class u implements IFollowService.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IMUser f101836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailViewModel f101837b;

        static {
            Covode.recordClassIndex(65136);
        }

        @Override // com.ss.android.ugc.aweme.friends.service.IFollowService.a
        public final void a(Exception exc) {
        }

        @Override // com.ss.android.ugc.aweme.friends.service.IFollowService.a
        public final void a() {
            this.f101837b.c(new h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.u.AnonymousClass1 */
                final /* synthetic */ u this$0;

                static {
                    Covode.recordClassIndex(65137);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0085  */
                @Override // h.f.a.b
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b r18) {
                    /*
                    // Method dump skipped, instructions count: 146
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.u.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                }
            });
        }

        public u(IMUser iMUser, GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f101836a = iMUser;
            this.f101837b = groupChatDetailViewModel;
        }
    }

    public final void e() {
        b(o.f101829a);
        com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("click_end_group", new h.p[0]);
    }

    public final void g() {
        this.f101799e.a(new j(this));
    }

    /* access modifiers changed from: package-private */
    public static final class ai extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {
        final /* synthetic */ h.f.a.b $reducer;
        final /* synthetic */ GroupChatDetailViewModel this$0;

        static {
            Covode.recordClassIndex(65093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ai(GroupChatDetailViewModel groupChatDetailViewModel, h.f.a.b bVar) {
            super(0);
            this.this$0 = groupChatDetailViewModel;
            this.$reducer = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke() {
            h.f.a.b bVar = this.$reducer;
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b value = this.this$0.b().getValue();
            if (value == null) {
                value = new com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b(0, false, false, (com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.d) null, false, (List) null, 127);
            }
            return bVar.invoke(value);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<Long> {
        final /* synthetic */ GroupChatDetailViewModel this$0;

        static {
            Covode.recordClassIndex(65124);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(GroupChatDetailViewModel groupChatDetailViewModel) {
            super(0);
            this.this$0 = groupChatDetailViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            long j2;
            com.bytedance.im.core.d.h c2 = this.this$0.f101799e.c();
            if (c2 != null) {
                j2 = c2.getConversationShortId();
            } else {
                j2 = 0;
            }
            return Long.valueOf(j2);
        }
    }

    public final boolean h() {
        com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e eVar;
        com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b value = b().getValue();
        if (value == null || (eVar = value.f101533g) == null || (!eVar.f101552b && !com.bytedance.ies.im.core.api.e.a.a(eVar.f101551a))) {
            return false;
        }
        return true;
    }

    public final void i() {
        com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.d dVar;
        com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b value = b().getValue();
        if (value != null && (dVar = value.f101530d) != null && dVar.f101549c) {
            a(t.f101835a);
        }
    }

    public final void d() {
        String str = this.f101796b;
        i();
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        if (h.m.p.b((CharSequence) str).toString().length() == 0) {
            a(p.f101830a);
            return;
        }
        a(q.f101831a);
        com.bytedance.ies.im.core.api.b.b bVar = this.f101799e;
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        bVar.a(h.m.p.b((CharSequence) str).toString(), new r(this));
    }

    public final void f() {
        com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b value = b().getValue();
        if (value != null) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("click_leave_group", new h.p[0]);
            if (!com.ss.android.ugc.aweme.im.sdk.group.a.a.a.a(value.f101532f) || value.f101532f.size() <= 1) {
                j();
            } else if (h()) {
                b(y.f101842a);
            } else {
                b(z.f101843a);
            }
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.im.sdk.common.data.a.a<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b>> {
        final /* synthetic */ GroupChatDetailViewModel this$0;

        static {
            Covode.recordClassIndex(65109);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(GroupChatDetailViewModel groupChatDetailViewModel) {
            super(0);
            this.this$0 = groupChatDetailViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.common.data.a.a<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> invoke() {
            boolean z;
            boolean z2;
            boolean z3;
            String str;
            com.bytedance.im.core.d.i coreInfo;
            androidx.lifecycle.t tVar = new androidx.lifecycle.t();
            com.bytedance.im.core.d.h c2 = this.this$0.f101799e.c();
            if (c2 == null || !c2.isMute()) {
                z = false;
            } else {
                z = true;
            }
            com.bytedance.im.core.d.h c3 = this.this$0.f101799e.c();
            if (c3 == null || !c3.isStickTop()) {
                z2 = false;
            } else {
                z2 = true;
            }
            Boolean a2 = com.ss.android.ugc.aweme.im.sdk.group.a.a.a(this.this$0.a());
            if (a2 != null) {
                z3 = a2.booleanValue();
            } else {
                z3 = true;
            }
            com.bytedance.im.core.d.h c4 = this.this$0.f101799e.c();
            if (c4 == null || (coreInfo = c4.getCoreInfo()) == null) {
                str = null;
            } else {
                str = coreInfo.getName();
            }
            if (str == null) {
                str = "";
            }
            tVar.setValue(new com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b(0, z, z2, new com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.d(str, com.ss.android.ugc.aweme.im.sdk.group.a.a.a.a(this.this$0.f101798d), 8), z3, (List) null, 97));
            h.f.b.l.d(tVar, "");
            return new com.ss.android.ugc.aweme.im.sdk.common.data.a.a(tVar);
        }
    }

    public static final class ac implements com.bytedance.im.core.a.a.b<Pair<Boolean, List<ConversationApplyInfo>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailViewModel f101804a;

        static {
            Covode.recordClassIndex(65085);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ac(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f101804a = groupChatDetailViewModel;
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(com.bytedance.im.core.d.u uVar) {
            com.ss.android.ugc.aweme.im.service.m.a.e("GroupChatDetailVM", "loadMoreRequest error: ".concat(String.valueOf(uVar)));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(Pair<Boolean, List<ConversationApplyInfo>> pair) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e eVar;
            Pair<Boolean, List<ConversationApplyInfo>> pair2 = pair;
            if (pair2 != null) {
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b value = this.f101804a.b().getValue();
                if (value == null || (eVar = value.f101533g) == null) {
                    eVar = new com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e((List) null, false, 7);
                }
                this.f101804a.a(new a(eVar, pair2));
            }
        }

        static final class a extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {
            final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e $requestInfo;
            final /* synthetic */ Pair $result;

            static {
                Covode.recordClassIndex(65086);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e eVar, Pair pair) {
                super(1);
                this.$requestInfo = eVar;
                this.$result = pair;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
                h.f.b.l.d(bVar2, "");
                List g2 = h.a.n.g((Collection) this.$requestInfo.f101551a);
                Object obj = this.$result.second;
                h.f.b.l.b(obj, "");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    ConversationApplyInfo conversationApplyInfo = (ConversationApplyInfo) obj2;
                    if (conversationApplyInfo.apply_status == ApplyStatusCode.APPLYING || conversationApplyInfo.apply_status == ApplyStatusCode.INVALID) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList<ConversationApplyInfo> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) arrayList2, 10));
                for (ConversationApplyInfo conversationApplyInfo2 : arrayList2) {
                    arrayList3.add(new com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a().a(conversationApplyInfo2));
                }
                g2.addAll(arrayList3);
                Object obj3 = this.$result.first;
                h.f.b.l.b(obj3, "");
                return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, null, false, null, new com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e(g2, ((Boolean) obj3).booleanValue(), 4), 63);
            }
        }
    }

    public static final class ad implements com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailViewModel f101805a;

        static {
            Covode.recordClassIndex(65087);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ad(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f101805a = groupChatDetailViewModel;
        }

        static final class a extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {
            final /* synthetic */ List $memberList;

            static {
                Covode.recordClassIndex(65088);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(1);
                this.$memberList = list;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
                h.f.b.l.d(bVar2, "");
                return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, null, false, this.$memberList, null, 95);
            }
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.d
        public final void a(String str, List<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> list, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.e eVar) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(list, "");
            h.f.b.l.d(eVar, "");
            this.f101805a.a(new a(list));
        }
    }

    public static final class h implements com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.ah> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailViewModel f101820a;

        static {
            Covode.recordClassIndex(65115);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* bridge */ /* synthetic */ void a(com.bytedance.im.core.d.ah ahVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f101820a = groupChatDetailViewModel;
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(com.bytedance.im.core.d.u uVar) {
            com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(com.bytedance.ies.ugc.appcontext.d.a(), uVar);
        }
    }

    public static final class i implements com.bytedance.im.core.a.a.b<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailViewModel f101821a;

        static {
            Covode.recordClassIndex(65116);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public i(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f101821a = groupChatDetailViewModel;
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(com.bytedance.im.core.d.u uVar) {
            com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(com.bytedance.ies.ugc.appcontext.d.a(), uVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(String str) {
            this.f101821a.b(a.f101822a);
        }

        static final class a extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f101822a = new a();

            static {
                Covode.recordClassIndex(65117);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
                h.f.b.l.d(cVar2, "");
                return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, false, null, true, false, false, null, null, null, null, false, null, false, 8183);
            }
        }
    }

    public static final class j implements com.bytedance.im.core.a.a.b<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailViewModel f101823a;

        static {
            Covode.recordClassIndex(65118);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f101823a = groupChatDetailViewModel;
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(com.bytedance.im.core.d.u uVar) {
            com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(com.bytedance.ies.ugc.appcontext.d.a(), uVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(String str) {
            this.f101823a.b(a.f101824a);
        }

        static final class a extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f101824a = new a();

            static {
                Covode.recordClassIndex(65119);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
                h.f.b.l.d(cVar2, "");
                return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, false, null, true, false, false, null, null, null, null, false, null, false, 8183);
            }
        }
    }

    public static final class k implements com.bytedance.im.core.a.a.b<List<? extends com.bytedance.im.core.d.ah>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailViewModel f101825a;

        static {
            Covode.recordClassIndex(65120);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public k(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f101825a = groupChatDetailViewModel;
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(com.bytedance.im.core.d.u uVar) {
            com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(com.bytedance.ies.ugc.appcontext.d.a(), uVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* bridge */ /* synthetic */ void a(List<? extends com.bytedance.im.core.d.ah> list) {
            this.f101825a.a(a.f101826a);
        }

        static final class a extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f101826a = new a();

            static {
                Covode.recordClassIndex(65121);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
                h.f.b.l.d(bVar2, "");
                return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, null, false, null, null, 127);
            }
        }
    }

    public static final class r implements com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailViewModel f101832a;

        static {
            Covode.recordClassIndex(65128);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        r(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f101832a = groupChatDetailViewModel;
        }

        static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {
            final /* synthetic */ String $this_apply;

            static {
                Covode.recordClassIndex(65130);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.$this_apply = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
                h.f.b.l.d(cVar2, "");
                return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, false, this.$this_apply, false, false, false, null, null, null, null, false, null, false, 8187);
            }
        }

        static final class c extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f101833a = new c();

            static {
                Covode.recordClassIndex(65131);
            }

            c() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
                h.f.b.l.d(cVar2, "");
                return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, false, null, false, false, false, null, null, null, null, false, null, true, 4095);
            }
        }

        static final class a extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {
            final /* synthetic */ r this$0;

            static {
                Covode.recordClassIndex(65129);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(r rVar) {
                super(1);
                this.this$0 = rVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
                com.bytedance.im.core.d.i coreInfo;
                String name;
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
                String str = "";
                h.f.b.l.d(bVar2, str);
                com.bytedance.im.core.d.h c2 = this.this$0.f101832a.f101799e.c();
                if (!(c2 == null || (coreInfo = c2.getCoreInfo()) == null || (name = coreInfo.getName()) == null)) {
                    str = name;
                }
                return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, new com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.d(str, com.ss.android.ugc.aweme.im.sdk.group.a.a.a.a(this.this$0.f101832a.f101798d), false, false), false, null, null, 119);
            }
        }

        static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {
            final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.group.b.b.a $checkMsgBean;

            static {
                Covode.recordClassIndex(65132);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(com.ss.android.ugc.aweme.im.sdk.group.b.b.a aVar) {
                super(1);
                this.$checkMsgBean = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
                String statusMsg;
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
                String str = "";
                h.f.b.l.d(cVar2, str);
                com.ss.android.ugc.aweme.im.sdk.group.b.b.a aVar = this.$checkMsgBean;
                if (!(aVar == null || (statusMsg = aVar.getStatusMsg()) == null)) {
                    str = statusMsg;
                }
                return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, false, str, false, false, false, null, null, null, null, false, null, false, 8187);
            }
        }

        static final class e extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {
            final /* synthetic */ com.bytedance.im.core.d.h $result;

            static {
                Covode.recordClassIndex(65133);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(com.bytedance.im.core.d.h hVar) {
                super(1);
                this.$result = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
                com.bytedance.im.core.d.i coreInfo;
                String name;
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
                String str = "";
                h.f.b.l.d(bVar2, str);
                com.bytedance.im.core.d.h hVar = this.$result;
                if (!(hVar == null || (coreInfo = hVar.getCoreInfo()) == null || (name = coreInfo.getName()) == null)) {
                    str = name;
                }
                return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, new com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.d(str, true, false, false), false, null, null, 119);
            }
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(com.bytedance.im.core.d.u uVar) {
            Integer statusCode;
            this.f101832a.a(new a(this));
            String str = null;
            if (uVar != null) {
                str = uVar.f38027e;
            }
            com.ss.android.ugc.aweme.im.sdk.group.b.b.a aVar = (com.ss.android.ugc.aweme.im.sdk.group.b.b.a) com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j.a(str, com.ss.android.ugc.aweme.im.sdk.group.b.b.a.class);
            if (!(aVar == null || (statusCode = aVar.getStatusCode()) == null)) {
                if (statusCode.intValue() == 7602) {
                    String statusMsg = aVar.getStatusMsg();
                    if (statusMsg != null) {
                        this.f101832a.b(new b(statusMsg));
                        return;
                    }
                    return;
                } else if (statusCode.intValue() == 7601) {
                    this.f101832a.b(c.f101833a);
                    return;
                }
            }
            this.f101832a.b(new d(aVar));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(com.bytedance.im.core.d.h hVar) {
            String str;
            com.bytedance.im.core.d.i coreInfo;
            com.bytedance.im.core.d.h hVar2 = hVar;
            this.f101832a.a(new e(hVar2));
            GroupChatDetailViewModel groupChatDetailViewModel = this.f101832a;
            if (hVar2 == null || (coreInfo = hVar2.getCoreInfo()) == null) {
                str = null;
            } else {
                str = coreInfo.getName();
            }
            if (str == null) {
                str = "";
            }
            groupChatDetailViewModel.f101796b = str;
            String str2 = this.f101832a.f101798d;
            h.f.b.l.d(str2, "");
            com.bytedance.im.core.d.h c2 = b.a.a(str2).c();
            if (c2 != null && c2.isGroupChat() && c2.getCoreInfo() != null) {
                com.bytedance.im.core.d.i coreInfo2 = c2.getCoreInfo();
                h.f.b.l.b(coreInfo2, "");
                if (coreInfo2.getExt() != null) {
                    com.bytedance.im.core.d.i coreInfo3 = c2.getCoreInfo();
                    h.f.b.l.b(coreInfo3, "");
                    Map<String, String> ext = coreInfo3.getExt();
                    h.f.b.l.b(ext, "");
                    ext.put("a:group_name_modified", "1");
                }
            }
        }
    }

    public static final class w implements com.bytedance.im.core.a.a.b<Pair<Boolean, List<? extends ConversationApplyInfo>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailViewModel f101840a;

        static {
            Covode.recordClassIndex(65140);
        }

        public w(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f101840a = groupChatDetailViewModel;
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(com.bytedance.im.core.d.u uVar) {
            com.ss.android.ugc.aweme.im.service.m.a.e("GroupChatDetailVM", "init group requests error: ".concat(String.valueOf(uVar)));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(Pair<Boolean, List<? extends ConversationApplyInfo>> pair) {
            final boolean z;
            Pair<Boolean, List<? extends ConversationApplyInfo>> pair2 = pair;
            if (pair2 != null) {
                Object obj = pair2.second;
                h.f.b.l.b(obj, "");
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Iterable) obj).iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ConversationApplyInfo conversationApplyInfo = (ConversationApplyInfo) next;
                    if (conversationApplyInfo.apply_status == ApplyStatusCode.APPLYING || conversationApplyInfo.apply_status == ApplyStatusCode.INVALID) {
                        arrayList.add(next);
                    }
                }
                ArrayList<ConversationApplyInfo> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) arrayList2, 10));
                for (ConversationApplyInfo conversationApplyInfo2 : arrayList2) {
                    arrayList3.add(new com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a().a(conversationApplyInfo2));
                }
                final ArrayList arrayList4 = arrayList3;
                GroupChatDetailViewModel groupChatDetailViewModel = this.f101840a;
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e eVar = groupChatDetailViewModel.f101795a;
                Object obj2 = pair2.first;
                h.f.b.l.b(obj2, "");
                groupChatDetailViewModel.f101795a = com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e.a(eVar, arrayList4, ((Boolean) obj2).booleanValue(), false, 4);
                if (arrayList4.size() <= 5) {
                    Object obj3 = pair2.first;
                    h.f.b.l.b(obj3, "");
                    if (!((Boolean) obj3).booleanValue()) {
                        z = false;
                    }
                }
                this.f101840a.a(new h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b>() {
                    /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.w.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(65141);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
                        com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
                        h.f.b.l.d(bVar2, "");
                        List list = arrayList4;
                        return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, null, false, null, new com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e(list.subList(0, h.j.h.c(list.size(), 5)), z, 4), 63);
                    }
                });
            }
        }
    }

    public static final class x implements com.bytedance.im.core.a.a.b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailViewModel f101841a;

        static {
            Covode.recordClassIndex(65142);
        }

        public x(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f101841a = groupChatDetailViewModel;
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(com.bytedance.im.core.d.u uVar) {
            com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(com.bytedance.ies.ugc.appcontext.d.a(), uVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(Boolean bool) {
            final Boolean bool2 = bool;
            com.ss.android.ugc.aweme.im.sdk.group.a.a.a(this.f101841a.a(), h.f.b.l.a((Object) bool2, (Object) true));
            this.f101841a.a(new h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b>() {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.x.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(65143);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
                    h.f.b.l.d(bVar2, "");
                    return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, null, h.f.b.l.a((Object) bool2, (Object) true), null, null, 111);
                }
            });
        }
    }

    public static final class an implements com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.im.core.api.b.b f101811a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailViewModel f101812b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f101813c;

        static {
            Covode.recordClassIndex(65100);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(com.bytedance.im.core.d.h hVar) {
            final com.bytedance.im.core.d.h hVar2 = hVar;
            this.f101812b.c(new h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b>() {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.an.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(65101);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
                    boolean z;
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
                    h.f.b.l.d(bVar2, "");
                    com.bytedance.im.core.d.h hVar = hVar2;
                    if (hVar == null || !hVar.isMute()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, z, false, null, false, null, null, 125);
                }
            });
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(com.bytedance.im.core.d.u uVar) {
            this.f101812b.c(new h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.an.AnonymousClass2 */
                final /* synthetic */ an this$0;

                static {
                    Covode.recordClassIndex(65102);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
                    boolean z;
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
                    h.f.b.l.d(bVar2, "");
                    com.bytedance.im.core.d.h c2 = this.this$0.f101811a.c();
                    if (c2 == null || !c2.isMute()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, z, false, null, false, null, null, 125);
                }
            });
            com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(com.bytedance.ies.ugc.appcontext.d.a(), uVar);
        }

        public an(com.bytedance.ies.im.core.api.b.b bVar, GroupChatDetailViewModel groupChatDetailViewModel, boolean z) {
            this.f101811a = bVar;
            this.f101812b = groupChatDetailViewModel;
            this.f101813c = z;
        }
    }

    public static final class ap implements com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.im.core.api.b.b f101814a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailViewModel f101815b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f101816c;

        static {
            Covode.recordClassIndex(65104);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(com.bytedance.im.core.d.h hVar) {
            final com.bytedance.im.core.d.h hVar2 = hVar;
            this.f101815b.c(new h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b>() {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.ap.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(65105);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
                    boolean z;
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
                    h.f.b.l.d(bVar2, "");
                    com.bytedance.im.core.d.h hVar = hVar2;
                    if (hVar == null || !hVar.isStickTop()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, z, null, false, null, null, 123);
                }
            });
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(com.bytedance.im.core.d.u uVar) {
            this.f101815b.c(new h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.ap.AnonymousClass2 */
                final /* synthetic */ ap this$0;

                static {
                    Covode.recordClassIndex(65106);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
                    boolean z;
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
                    h.f.b.l.d(bVar2, "");
                    com.bytedance.im.core.d.h c2 = this.this$0.f101814a.c();
                    if (c2 == null || !c2.isStickTop()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, z, null, false, null, null, 123);
                }
            });
            com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(com.bytedance.ies.ugc.appcontext.d.a(), uVar);
        }

        public ap(com.bytedance.ies.im.core.api.b.b bVar, GroupChatDetailViewModel groupChatDetailViewModel, boolean z) {
            this.f101814a = bVar;
            this.f101815b = groupChatDetailViewModel;
            this.f101816c = z;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final m f101828a = new m();

        static {
            Covode.recordClassIndex(65123);
        }

        m() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.b(th, "");
            com.ss.android.ugc.aweme.im.service.m.a.a(th);
        }
    }

    public static final class am implements com.bytedance.im.core.a.a.b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailViewModel f101809a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f101810b;

        static {
            Covode.recordClassIndex(65097);
        }

        static final class a extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {
            final /* synthetic */ am this$0;

            static {
                Covode.recordClassIndex(65098);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(am amVar) {
                super(1);
                this.this$0 = amVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
                h.f.b.l.d(bVar2, "");
                return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, null, this.this$0.f101810b, null, null, 111);
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {
            final /* synthetic */ Boolean $result;

            static {
                Covode.recordClassIndex(65099);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(Boolean bool) {
                super(1);
                this.$result = bool;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
                h.f.b.l.d(bVar2, "");
                return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, null, h.f.b.l.a((Object) this.$result, (Object) true), null, null, 111);
            }
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(com.bytedance.im.core.d.u uVar) {
            com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(com.bytedance.ies.ugc.appcontext.d.a(), uVar);
            this.f101809a.c(new a(this));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(Boolean bool) {
            Boolean bool2 = bool;
            com.ss.android.ugc.aweme.im.sdk.group.a.a.a(this.f101809a.a(), h.f.b.l.a((Object) bool2, (Object) true));
            this.f101809a.c(new b(bool2));
        }

        public am(GroupChatDetailViewModel groupChatDetailViewModel, boolean z) {
            this.f101809a = groupChatDetailViewModel;
            this.f101810b = z;
        }
    }

    public static final class aa extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final aa f101803a = new aa();

        static {
            Covode.recordClassIndex(65083);
        }

        aa() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 100, false, false, null, false, null, null, 126);
        }
    }

    public static final class ae extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final ae f101806a = new ae();

        static {
            Covode.recordClassIndex(65089);
        }

        ae() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, null, false, null, null, 127);
        }
    }

    public static final class af extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a $imMember;

        static {
            Covode.recordClassIndex(65090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public af(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar) {
            super(1);
            this.$imMember = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, false, null, false, false, false, this.$imMember, null, null, null, false, null, false, 8127);
        }
    }

    public static final class ah extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a $imMember;

        static {
            Covode.recordClassIndex(65092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ah(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar) {
            super(1);
            this.$imMember = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, false, null, false, false, false, null, null, null, this.$imMember, false, null, false, 7679);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class aj extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final aj f101807a = new aj();

        static {
            Covode.recordClassIndex(65094);
        }

        aj() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, true, null, false, false, false, null, null, null, null, false, null, false, 8189);
        }
    }

    public static final class al extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {
        final /* synthetic */ boolean $requireApproval;

        static {
            Covode.recordClassIndex(65096);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public al(boolean z) {
            super(1);
            this.$requireApproval = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, null, !this.$requireApproval, null, null, 111);
        }
    }

    public static final class ao extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {
        final /* synthetic */ boolean $muted;

        static {
            Covode.recordClassIndex(65103);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ao(boolean z) {
            super(1);
            this.$muted = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, !this.$muted, false, null, false, null, null, 125);
        }
    }

    public static final class aq extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {
        final /* synthetic */ boolean $pined;

        static {
            Covode.recordClassIndex(65107);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public aq(boolean z) {
            super(1);
            this.$pined = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, !this.$pined, null, false, null, null, 123);
        }
    }

    public static final class ar extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a $imMember$inlined;
        final /* synthetic */ GroupChatDetailViewModel this$0;

        static {
            Covode.recordClassIndex(65108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ar(GroupChatDetailViewModel groupChatDetailViewModel, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar) {
            super(1);
            this.this$0 = groupChatDetailViewModel;
            this.$imMember$inlined = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, false, null, false, false, false, null, this.$imMember$inlined, null, null, false, null, false, 8063);
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f101818a = new e();

        static {
            Covode.recordClassIndex(65112);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, false, null, false, false, false, null, null, null, null, true, null, false, 7167);
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a $imMember;

        static {
            Covode.recordClassIndex(65114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar) {
            super(1);
            this.$imMember = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, false, null, false, false, false, null, null, this.$imMember, null, false, null, false, 7935);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f101829a = new o();

        static {
            Covode.recordClassIndex(65125);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, true, false, null, false, false, false, null, null, null, null, false, null, false, 8190);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f101830a = new p();

        static {
            Covode.recordClassIndex(65126);
        }

        p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, null, false, null, null, 127);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f101831a = new q();

        static {
            Covode.recordClassIndex(65127);
        }

        q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.d.a(bVar2.f101530d, null, false, false, true, 7), false, null, null, 119);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f101834a = new s();

        static {
            Covode.recordClassIndex(65134);
        }

        s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.d.a(bVar2.f101530d, null, false, true, false, 11), false, null, null, 119);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f101835a = new t();

        static {
            Covode.recordClassIndex(65135);
        }

        t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.d.a(bVar2.f101530d, null, false, false, false, 11), false, null, null, 119);
        }
    }

    static final class z extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final z f101843a = new z();

        static {
            Covode.recordClassIndex(65145);
        }

        z() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, false, null, false, false, true, null, null, null, null, false, null, false, 8159);
        }
    }

    public final void a(Activity activity) {
        h.f.b.l.d(activity, "");
        com.ss.android.ugc.aweme.im.sdk.chat.b.c.g.a(com.ss.android.ugc.aweme.im.sdk.chat.b.c.g.a(String.valueOf(a())), activity, "5");
    }

    public final void b(h.f.a.b<? super com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> bVar) {
        h.f.b.l.d(bVar, "");
        i();
        c().setValue(new com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.c<>(bVar.invoke(new com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c())));
    }

    public static final class ab extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {
        final /* synthetic */ GroupChatDetailViewModel this$0;

        static {
            Covode.recordClassIndex(65084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ab(GroupChatDetailViewModel groupChatDetailViewModel) {
            super(1);
            this.this$0 = groupChatDetailViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, null, false, null, new com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e(this.this$0.f101795a.f101551a, this.this$0.f101795a.f101552b, 4), 63);
        }
    }

    static final class ag extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a $request;
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e $requestInfo;

        static {
            Covode.recordClassIndex(65091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ag(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e eVar, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a aVar) {
            super(1);
            this.$requestInfo = eVar;
            this.$request = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e eVar = this.$requestInfo;
            List g2 = h.a.n.g((Collection) eVar.f101551a);
            g2.remove(this.$request);
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b.a(bVar2, 0, false, false, null, false, null, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e.a(eVar, g2, false, false, 6), 63);
        }
    }

    public static final class ak extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final ak f101808a = new ak();

        static {
            Covode.recordClassIndex(65095);
        }

        ak() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            String string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.c8l, Arrays.copyOf(new Object[0], 0));
            h.f.b.l.b(string, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, false, string, false, true, false, null, null, null, null, false, null, false, 8171);
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {
        final /* synthetic */ GroupChatDetailViewModel this$0;

        static {
            Covode.recordClassIndex(65111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(GroupChatDetailViewModel groupChatDetailViewModel) {
            super(1);
            this.this$0 = groupChatDetailViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, false, com.ss.android.ugc.aweme.im.sdk.group.a.a.a.a(com.ss.android.ugc.aweme.im.sdk.common.controller.e.c.d(this.this$0.f101799e.c())), false, false, false, null, null, null, null, false, null, false, 8187);
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f101819a = new f();

        static {
            Covode.recordClassIndex(65113);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            String string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.c8l, Arrays.copyOf(new Object[0], 0));
            h.f.b.l.b(string, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, false, string, false, true, false, null, null, null, null, false, null, false, 8171);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IMUser f101827a;

        static {
            Covode.recordClassIndex(65122);
        }

        l(IMUser iMUser) {
            this.f101827a = iMUser;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            BlockResponse blockResponse = (BlockResponse) obj;
            IMUser iMUser = this.f101827a;
            h.f.b.l.b(blockResponse, "");
            boolean z = true;
            if (blockResponse.getBlockStaus() != 1) {
                z = false;
            }
            iMUser.setBlock(z);
            if (this.f101827a.isBlock()) {
                this.f101827a.setFollowStatus(0);
            }
        }
    }

    public static final class v implements com.bytedance.im.core.a.a.b<ConversationApplyInfo> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailViewModel f101838a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a f101839b;

        static {
            Covode.recordClassIndex(65139);
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(com.bytedance.im.core.d.u uVar) {
            com.ss.android.ugc.aweme.im.service.m.a.e("GroupChatDetailVM", "handle Apply Info: " + this.f101839b.f101517e + " fail");
            com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(com.bytedance.ies.ugc.appcontext.d.a(), uVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(ConversationApplyInfo conversationApplyInfo) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e eVar;
            GroupChatDetailViewModel groupChatDetailViewModel = this.f101838a;
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a aVar = this.f101839b;
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b value = groupChatDetailViewModel.b().getValue();
            if (value == null || (eVar = value.f101533g) == null) {
                eVar = new com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e((List) null, false, 7);
            }
            groupChatDetailViewModel.a(new ag(eVar, aVar));
        }

        public v(GroupChatDetailViewModel groupChatDetailViewModel, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a aVar) {
            this.f101838a = groupChatDetailViewModel;
            this.f101839b = aVar;
        }
    }

    static final class y extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f101842a = new y();

        static {
            Covode.recordClassIndex(65144);
        }

        y() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            String string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.c81, Arrays.copyOf(new Object[0], 0));
            h.f.b.l.b(string, "");
            return com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c.a(cVar2, false, false, string, false, true, false, null, null, null, null, false, null, false, 8171);
        }
    }

    public static void a(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar) {
        h.f.b.l.d(aVar, "");
        IMUser user = aVar.getUser();
        if (user != null) {
            com.ss.android.ugc.aweme.im.sdk.common.data.api.a.a(user.getUid(), user.getSecUid(), !user.isBlock()).a(new l(user), m.f101828a);
        }
    }

    public final void c(h.f.a.b<? super com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> bVar) {
        h.f.b.l.d(bVar, "");
        com.ss.android.ugc.aweme.im.sdk.common.data.a.a<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> b2 = b();
        ai aiVar = new ai(this, bVar);
        h.f.b.l.d(aiVar, "");
        b2.a().removeCallbacksAndMessages(null);
        b2.a().postDelayed(new a.c(b2, aiVar), 1000);
    }

    public final void a(IMUser iMUser) {
        if (iMUser != null) {
            com.bytedance.ies.im.core.api.b.b bVar = this.f101799e;
            String uid = iMUser.getUid();
            h.f.b.l.b(uid, "");
            bVar.a(uid, GroupRole.OWNER.getValue(), h.a.ag.a(), new h(this));
        }
    }

    public final void a(h.f.a.b<? super com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> bVar) {
        h.f.b.l.d(bVar, "");
        com.ss.android.ugc.aweme.im.sdk.common.data.a.a<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> b2 = b();
        com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b value = b().getValue();
        if (value == null) {
            value = new com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b(0, false, false, (com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.d) null, false, (List) null, 127);
        }
        b2.setValue(bVar.invoke(value));
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        a(s.f101834a);
        com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("edit_group_name", h.v.a(str, "enter_method"));
    }

    public GroupChatDetailViewModel(String str, com.bytedance.ies.im.core.api.b.b bVar) {
        com.bytedance.im.core.d.i coreInfo;
        String name;
        String str2 = "";
        h.f.b.l.d(str, str2);
        h.f.b.l.d(bVar, str2);
        this.f101798d = str;
        this.f101799e = bVar;
        com.bytedance.im.core.d.h c2 = bVar.c();
        if (!(c2 == null || (coreInfo = c2.getCoreInfo()) == null || (name = coreInfo.getName()) == null)) {
            str2 = name;
        }
        this.f101796b = str2;
        this.f101797c = new ad(this);
    }
}

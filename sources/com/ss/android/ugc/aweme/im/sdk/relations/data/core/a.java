package com.ss.android.ugc.aweme.im.sdk.relations.data.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.i;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.b;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.c;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

public abstract class a implements d<IMContact> {

    /* renamed from: a  reason: collision with root package name */
    public final String f102996a;

    /* renamed from: b  reason: collision with root package name */
    public final i f102997b;

    /* renamed from: c  reason: collision with root package name */
    public volatile List<String> f102998c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.relations.data.b.c f102999d;

    /* renamed from: e  reason: collision with root package name */
    private final String f103000e = "BaseRelationModel";

    /* renamed from: f  reason: collision with root package name */
    private d<IMContact> f103001f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f103002g = h.i.a((h.f.a.a) b.f103025a);

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.relations.data.b.b f103003h = com.ss.android.ugc.aweme.im.sdk.relations.data.b.b.f102978c;

    /* renamed from: i  reason: collision with root package name */
    private final String f103004i;

    /* renamed from: j  reason: collision with root package name */
    private final c f103005j;

    /* renamed from: k  reason: collision with root package name */
    private final c f103006k;

    static {
        Covode.recordClassIndex(66022);
    }

    private final List<IMContact> i() {
        return (List) this.f103002g.getValue();
    }

    /* access modifiers changed from: protected */
    public abstract e<IMContact> c();

    /* access modifiers changed from: protected */
    public c a() {
        return this.f103005j;
    }

    /* access modifiers changed from: protected */
    public c b() {
        return this.f103006k;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a$a  reason: collision with other inner class name */
    static final class C2607a extends m implements h.f.a.a<List<String>> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(66023);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2607a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ List<String> invoke() {
            return this.this$0.f102998c;
        }
    }

    static final class b extends m implements h.f.a.a<List<IMContact>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103025a = new b();

        static {
            Covode.recordClassIndex(66024);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<IMContact> invoke() {
            return new ArrayList();
        }
    }

    static final class c extends m implements h.f.a.a<List<String>> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(66025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ List<String> invoke() {
            return this.this$0.f102998c;
        }
    }

    public final a d() {
        this.f103001f = null;
        return this;
    }

    public final List<IMContact> e() {
        return n.g((Collection) i());
    }

    public final boolean f() {
        return c().e();
    }

    public z g() {
        e<IMContact> c2;
        if (!(!c().bI_()) || (c2 = c()) == null) {
            return null;
        }
        c2.bG_();
        return z.f158842a;
    }

    public final z h() {
        boolean z;
        e<IMContact> c2;
        if (c().bI_() || !c().e()) {
            z = false;
        } else {
            z = true;
        }
        if (!z || (c2 = c()) == null) {
            return null;
        }
        c2.bH_();
        return z.f158842a;
    }

    public static final class i extends m implements h.f.a.b<Throwable, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f103058a = new i();

        static {
            Covode.recordClassIndex(66031);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.d(th, "");
            return z.f158842a;
        }
    }

    public static final class j implements d<IMContact> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f103061a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f103062b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f103063c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f103064d;

        static {
            Covode.recordClassIndex(66032);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
        public final void a(Throwable th) {
            l.d(th, "");
            this.f103062b.invoke(th);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
        public final void c(Throwable th) {
            l.d(th, "");
            this.f103064d.invoke(th);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
        public final void b(List<IMContact> list, boolean z) {
            l.d(list, "");
            this.f103063c.invoke(list, Boolean.valueOf(z));
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
        public final void a(List<IMContact> list, boolean z) {
            l.d(list, "");
            this.f103061a.invoke(list, Boolean.valueOf(z));
        }

        public j(h.f.a.m mVar, h.f.a.b bVar, h.f.a.m mVar2, h.f.a.b bVar2) {
            this.f103061a = mVar;
            this.f103062b = bVar;
            this.f103063c = mVar2;
            this.f103064d = bVar2;
        }
    }

    public final a a(d<IMContact> dVar) {
        l.d(dVar, "");
        this.f103001f = dVar;
        return this;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void c(Throwable th) {
        l.d(th, "");
        d<IMContact> dVar = this.f103001f;
        if (dVar != null) {
            dVar.c(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public void a(Throwable th) {
        l.d(th, "");
        d<IMContact> dVar = this.f103001f;
        if (dVar != null) {
            dVar.a(th);
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.im.core.d.h, Boolean> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.e $recentConversationFilter;

        static {
            Covode.recordClassIndex(66026);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.e eVar) {
            super(1);
            this.$recentConversationFilter = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.bytedance.im.core.d.h hVar) {
            com.bytedance.im.core.d.h hVar2 = hVar;
            l.d(hVar2, "");
            l.d(hVar2, "");
            boolean z = false;
            if ((!hVar2.isGroupChat() || (!com.ss.android.ugc.aweme.im.sdk.group.a.a.a.a(hVar2) && com.ss.android.ugc.aweme.im.sdk.group.a.a.a.b(hVar2))) && !com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.a(hVar2) && hVar2.getLastMessage() != null) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    protected static List<String> a(List<? extends IMContact> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IMUser a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.f.a((IMContact) it.next());
            if (a2 != null) {
                String uid = a2.getUid();
                l.b(uid, "");
                arrayList.add(uid);
            }
        }
        return arrayList;
    }

    static final class e extends m implements h.f.a.b<List<? extends com.bytedance.im.core.d.h>, List<? extends com.bytedance.im.core.d.h>> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.b $recentConversationCollator;

        static {
            Covode.recordClassIndex(66027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.b bVar) {
            super(1);
            this.$recentConversationCollator = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ List<? extends com.bytedance.im.core.d.h> invoke(List<? extends com.bytedance.im.core.d.h> list) {
            long j2;
            int i2;
            List<? extends com.bytedance.im.core.d.h> list2 = list;
            l.d(list2, "");
            l.d(list2, "");
            com.ss.android.ugc.aweme.im.service.m.a.c("RecentConversationCollator", "sort start");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (T t : list2) {
                ai lastMessage = t.getLastMessage();
                if (lastMessage != null) {
                    j2 = lastMessage.getCreatedAt();
                } else {
                    j2 = 0;
                }
                if (t.isStickTop()) {
                    j2 = Math.max(j2, t.getUpdatedTime());
                }
                linkedHashMap.put(t, Long.valueOf(j2));
                if (t.isStickTop()) {
                    i2 = 50;
                } else {
                    i2 = 0;
                }
                linkedHashMap2.put(t, Integer.valueOf(i2));
            }
            List a2 = n.a((Iterable) list2, (Comparator) new b.C2614b(linkedHashMap2, linkedHashMap));
            com.ss.android.ugc.aweme.im.service.m.a.c("RecentConversationCollator", "sort finish");
            return a2;
        }
    }

    static final class f extends m implements h.f.a.b<IMContact, Boolean> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.d $recentContactFilter;

        static {
            Covode.recordClassIndex(66028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.d dVar) {
            super(1);
            this.$recentContactFilter = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
            if (r6.isBlock() != false) goto L_0x0045;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
            if (r1.contains(r6.getUid()) == true) goto L_0x0045;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
            if (r4.f103072a.f102991l == 3) goto L_0x005b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
            if (r1 != 2) goto L_0x0045;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Boolean invoke(com.ss.android.ugc.aweme.im.service.model.IMContact r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.im.service.model.IMContact r6 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r6
                java.lang.String r0 = ""
                h.f.b.l.d(r6, r0)
                com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.d r4 = r5.$recentContactFilter
                h.f.b.l.d(r6, r0)
                com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.b r0 = r4.f103079b
                boolean r0 = r0.a(r6)
                r3 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0045
                boolean r0 = r6 instanceof com.ss.android.ugc.aweme.im.service.model.IMUser
                if (r0 == 0) goto L_0x004a
                com.ss.android.ugc.aweme.im.service.model.IMUser r6 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r6
                int r1 = r6.getFollowStatus()
                com.ss.android.ugc.aweme.im.sdk.relations.data.b.c r0 = r4.f103072a
                boolean r0 = r0.f102992m
                if (r0 == 0) goto L_0x0029
                r0 = 2
                if (r1 != r0) goto L_0x0045
            L_0x0029:
                com.ss.android.ugc.aweme.im.sdk.relations.data.b.c r0 = r4.f103072a
                boolean r0 = r0.f102983d
                if (r0 == 0) goto L_0x0035
                boolean r0 = r6.isBlock()
                if (r0 != 0) goto L_0x0045
            L_0x0035:
                com.ss.android.ugc.aweme.im.sdk.relations.data.b.c r0 = r4.f103072a
                java.util.List<java.lang.String> r1 = r0.f102987h
                if (r1 == 0) goto L_0x005b
                java.lang.String r0 = r6.getUid()
                boolean r0 = r1.contains(r0)
                if (r0 != r2) goto L_0x005b
            L_0x0045:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                return r0
            L_0x004a:
                boolean r0 = r6 instanceof com.ss.android.ugc.aweme.im.service.model.IMConversation
                if (r0 == 0) goto L_0x0045
                com.ss.android.ugc.aweme.im.sdk.relations.data.b.c r0 = r4.f103072a
                boolean r0 = r0.f102992m
                if (r0 == 0) goto L_0x005b
                com.ss.android.ugc.aweme.im.sdk.relations.data.b.c r0 = r4.f103072a
                int r1 = r0.f102991l
                r0 = 3
                if (r1 != r0) goto L_0x0045
            L_0x005b:
                r3 = 1
                goto L_0x0045
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public a(com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar) {
        l.d(cVar, "");
        this.f102999d = cVar;
        String d2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.d();
        this.f103004i = d2;
        String e2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.e();
        l.b(e2, "");
        this.f102996a = e2;
        i.a aVar = new i.a();
        l.d(cVar, "");
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.e eVar = new com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.e(cVar);
        l.d(cVar, "");
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.b bVar = new com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.b(cVar);
        l.d(cVar, "");
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.d dVar = new com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.d(cVar);
        l.d(cVar, "");
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.c cVar2 = new com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.c(cVar);
        d dVar2 = new d(eVar);
        l.d(dVar2, "");
        aVar.a().f103038h = dVar2;
        aVar.a(new e(bVar));
        aVar.b(new f(dVar));
        g gVar = new g(cVar2);
        l.d(gVar, "");
        aVar.a().f103041k = gVar;
        this.f102997b = aVar.f103060a;
        c.a aVar2 = new c.a();
        l.b(d2, "");
        this.f103005j = (c) aVar2.a(d2).a(false).a(new C2607a(this)).a(100).b();
        this.f103006k = (c) new c.a().a(e2).a(false).a(new c(this)).a(100).b();
    }

    static final class g extends m implements h.f.a.b<List<? extends IMContact>, List<? extends IMContact>> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.c $recentWithRecTypeCollator;

        static {
            Covode.recordClassIndex(66029);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.c cVar) {
            super(1);
            this.$recentWithRecTypeCollator = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ List<? extends IMContact> invoke(List<? extends IMContact> list) {
            String str;
            List<? extends IMContact> list2 = list;
            l.d(list2, "");
            l.d(list2, "");
            com.ss.android.ugc.aweme.im.service.m.a.c("RecentWithRecTypeCollator", "sort start");
            com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
            User d2 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.d();
            if (d2 != null) {
                str = d2.getUid();
            } else {
                str = null;
            }
            List<IMUser> d3 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.d(Collections.singletonList(str));
            l.b(d3, "");
            ArrayList arrayList = new ArrayList();
            for (T t : d3) {
                T t2 = t;
                l.b(t2, "");
                if (!(t2.getFollowStatus() == 0 || t2.getShareStatus() == 2)) {
                    com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n.a();
                    String uid = t2.getUid();
                    if (!TextUtils.isEmpty(uid)) {
                        if (a2.f102428a.getBoolean("key_friend_rec_".concat(String.valueOf(uid)), false)) {
                        }
                    }
                    arrayList.add(t);
                }
            }
            ArrayList<IMUser> arrayList2 = arrayList;
            com.ss.android.ugc.aweme.im.service.m.a.c("RecentWithRecTypeCollator", "query db finish " + arrayList2.size());
            if (arrayList2.isEmpty()) {
                return list2;
            }
            ArrayList arrayList3 = new ArrayList();
            for (IMUser iMUser : arrayList2) {
                l.b(iMUser, "");
                String uid2 = iMUser.getUid();
                l.b(uid2, "");
                arrayList3.add(uid2);
                if (iMUser.getFriendRecTime() > 0) {
                    for (IMContact iMContact : list2) {
                        String uid3 = iMUser.getUid();
                        Objects.requireNonNull(iMContact, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                        IMUser iMUser2 = (IMUser) iMContact;
                        if (l.a((Object) uid3, (Object) iMUser2.getUid()) && iMUser2.getFriendRecTime() > iMUser.getFriendRecTime()) {
                            iMUser.setFriendRecTime(iMUser2.getFriendRecTime());
                            com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
                            com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.c(Collections.singletonList(iMUser));
                        }
                    }
                } else {
                    iMUser.setFriendRecTime(System.currentTimeMillis());
                    com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
                    com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.c(Collections.singletonList(iMUser));
                }
            }
            com.ss.android.ugc.aweme.im.service.m.a.c("RecentWithRecTypeCollator", "finish update DB");
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList2);
            ArrayList arrayList5 = new ArrayList();
            for (T t3 : list2) {
                T t4 = t3;
                Objects.requireNonNull(t4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                if (!arrayList3.contains(t4.getUid())) {
                    arrayList5.add(t3);
                }
            }
            arrayList4.addAll(arrayList5);
            List a3 = n.a((Iterable) arrayList4, (Comparator) c.b.f103104a);
            com.ss.android.ugc.aweme.im.service.m.a.c("RecentWithRecTypeCollator", "finish sorting");
            return a3;
        }
    }

    public static final class h extends m implements h.f.a.m<List<IMContact>, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f103054a = new h();

        static {
            Covode.recordClassIndex(66030);
        }

        h() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(List<IMContact> list, Boolean bool) {
            bool.booleanValue();
            l.d(list, "");
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void b(List<IMContact> list, boolean z) {
        l.d(list, "");
        i().addAll(list);
        d<IMContact> dVar = this.f103001f;
        if (dVar != null) {
            dVar.b(list, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public void a(List<IMContact> list, boolean z) {
        l.d(list, "");
        com.ss.android.ugc.aweme.im.service.m.a.c(this.f103000e, "onLoadSuccess start: " + list.size());
        try {
            i().clear();
            i().addAll(list);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.im.service.m.a.a(e2);
        }
        com.ss.android.ugc.aweme.im.service.m.a.c(this.f103000e, "onLoadSuccess finish: " + i().size());
        d<IMContact> dVar = this.f103001f;
        if (dVar != null) {
            dVar.a(list, z);
        }
    }
}

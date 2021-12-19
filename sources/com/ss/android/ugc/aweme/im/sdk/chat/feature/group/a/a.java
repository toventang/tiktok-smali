package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a;

import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.proto.GroupRole;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import f.a.ab;
import h.f.b.z;
import h.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final ConcurrentHashMap<String, CopyOnWriteArraySet<d>> f100495a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    static final LruCache<String, ConcurrentHashMap<String, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a>> f100496b = new LruCache<>(50);

    /* renamed from: c  reason: collision with root package name */
    static final LruCache<String, List<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a>> f100497c = new LruCache<>(50);

    /* renamed from: d  reason: collision with root package name */
    public static final a f100498d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<String, com.bytedance.ies.im.core.api.b.b> f100499e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private static final h.h f100500f = h.i.a((h.f.a.a) d.f100506a);

    static f.a.b.a a() {
        return (f.a.b.a) f100500f.getValue();
    }

    private a() {
    }

    static final class d extends h.f.b.m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f100506a = new d();

        static {
            Covode.recordClassIndex(64257);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    static {
        Covode.recordClassIndex(64253);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a$a  reason: collision with other inner class name */
    public static final class CallableC2473a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f100501a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f100502b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f100503c;

        static {
            Covode.recordClassIndex(64254);
        }

        CallableC2473a(List list, List list2, List list3) {
            this.f100501a = list;
            this.f100502b = list2;
            this.f100503c = list3;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            for (ah ahVar : this.f100501a) {
                if (!this.f100502b.contains(String.valueOf(ahVar.getUid()))) {
                    com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a(String.valueOf(ahVar.getUid()), ahVar.getSecUid());
                    aVar.setUser(com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.b(String.valueOf(ahVar.getUid()), ahVar.getSecUid()));
                    aVar.setMember(ahVar);
                    this.f100503c.add(aVar);
                }
            }
            return this.f100503c;
        }
    }

    static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f100512a;

        static {
            Covode.recordClassIndex(64260);
        }

        g(List list) {
            this.f100512a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List<ah> list = this.f100512a;
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupMemberLoader", "transfer ImMemberList origin list : ".concat(String.valueOf(list)));
            ArrayList arrayList = new ArrayList();
            com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar = null;
            if (list != null) {
                for (ah ahVar : list) {
                    String secUid = ahVar.getSecUid();
                    if (secUid == null || secUid.length() == 0) {
                        secUid = com.ss.android.ugc.aweme.im.sdk.common.controller.e.j.a(String.valueOf(ahVar.getUid()));
                    }
                    com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar2 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a(String.valueOf(ahVar.getUid()), secUid);
                    aVar2.setUser(com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.b(String.valueOf(ahVar.getUid()), secUid));
                    aVar2.setMember(ahVar);
                    if (ahVar.getRole() == GroupRole.OWNER.getValue()) {
                        arrayList.add(0, aVar2);
                    } else {
                        arrayList.add(aVar2);
                    }
                    if (h.f.b.l.a((Object) aVar2.getSecUid(), (Object) com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.c())) {
                        aVar = aVar2;
                    }
                }
                if (aVar != null) {
                    arrayList.remove(aVar);
                    arrayList.add(0, aVar);
                }
            }
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupMemberLoader", "transfer ImMemberList result list : ".concat(String.valueOf(arrayList)));
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f100515a;

        static {
            Covode.recordClassIndex(64263);
        }

        j(List list) {
            this.f100515a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List list = this.f100515a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a) obj).getUser() == null) {
                    arrayList.add(obj);
                }
            }
            ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) arrayList2, 10));
            for (com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar : arrayList2) {
                ah member = aVar.getMember();
                String str = null;
                String valueOf = String.valueOf(member != null ? Long.valueOf(member.getUid()) : null);
                ah member2 = aVar.getMember();
                if (member2 != null) {
                    str = member2.getSecUid();
                }
                arrayList3.add(new p(valueOf, str));
            }
            List<IMUser> a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(arrayList3);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : a2) {
                String uid = t.getUid();
                h.f.b.l.b(uid, "");
                linkedHashMap.put(uid, t);
            }
            List list2 = this.f100515a;
            ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> arrayList4 = new ArrayList();
            for (Object obj2 : list2) {
                if (((com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a) obj2).getUser() == null) {
                    arrayList4.add(obj2);
                }
            }
            for (com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar2 : arrayList4) {
                aVar2.setUser((IMUser) linkedHashMap.get(aVar2.getUid()));
            }
            return this.f100515a;
        }
    }

    public static final class m implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f100519a;

        static {
            Covode.recordClassIndex(64266);
        }

        m(WeakReference weakReference) {
            this.f100519a = weakReference;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.d
        public final void a(String str, List<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> list, e eVar) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(list, "");
            h.f.b.l.d(eVar, "");
            d dVar = (d) this.f100519a.get();
            if (dVar != null) {
                dVar.a(str, list, eVar);
                return;
            }
            h.f.b.l.d(str, "");
            h.f.b.l.d(this, "");
            CopyOnWriteArraySet<d> copyOnWriteArraySet = a.f100495a.get(str);
            if (copyOnWriteArraySet != null) {
                copyOnWriteArraySet.remove(this);
            }
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupMemberLoader", "unregister:".concat(String.valueOf(str)));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f100504a;

        static {
            Covode.recordClassIndex(64255);
        }

        b(String str) {
            this.f100504a = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            e eVar = e.AddMember;
            String str = this.f100504a;
            h.f.b.l.b(list, "");
            a.a(eVar, str, list);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f100505a = new c();

        static {
            Covode.recordClassIndex(64256);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.b(th, "");
            com.ss.android.ugc.aweme.im.service.m.a.a("GroupMemberLoader", th);
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.im.service.i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f100507a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f100508b;

        static {
            Covode.recordClassIndex(64258);
        }

        @Override // com.ss.android.ugc.aweme.im.service.i.a
        public final void a(Throwable th) {
            h.f.b.l.d(th, "");
            h.f.b.l.d(th, "");
        }

        @Override // com.ss.android.ugc.aweme.im.service.i.a
        public final void a(IMUser iMUser) {
            if (iMUser != null) {
                this.f100507a.element.setUser(iMUser);
            }
            g gVar = this.f100508b;
            if (gVar != null) {
                gVar.a(this.f100507a.element, f.UpdateUser);
            }
        }

        e(z.e eVar, g gVar) {
            this.f100507a = eVar;
            this.f100508b = gVar;
        }
    }

    public static final class f implements com.bytedance.im.core.a.a.b<ah> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f100509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f100510b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f100511c;

        static {
            Covode.recordClassIndex(64259);
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            g gVar = this.f100511c;
            if (gVar != null) {
                gVar.a(this.f100509a.element, f.UpdateMember);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(ah ahVar) {
            ah ahVar2 = ahVar;
            if (ahVar2 != null) {
                this.f100509a.element.setMember(ahVar2);
                if (a.f100496b.get(this.f100510b.f100523a) == null) {
                    a.f100496b.put(this.f100510b.f100523a, new ConcurrentHashMap<>());
                }
                ConcurrentHashMap<String, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> concurrentHashMap = a.f100496b.get(this.f100510b.f100523a);
                if (concurrentHashMap != null) {
                    concurrentHashMap.put(this.f100510b.f100524b, this.f100509a.element);
                }
            }
            g gVar = this.f100511c;
            if (gVar != null) {
                gVar.a(this.f100509a.element, f.UpdateMember);
            }
        }

        f(z.e eVar, c cVar, g gVar) {
            this.f100509a = eVar;
            this.f100510b = cVar;
            this.f100511c = gVar;
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final i f100514a = new i();

        static {
            Covode.recordClassIndex(64262);
        }

        i() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupMemberLoader", "fetchMemberInfo error: ".concat(String.valueOf(obj)));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final l f100518a = new l();

        static {
            Covode.recordClassIndex(64265);
        }

        l() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.im.service.m.a.e("GroupMemberLoader", "fetchUserInfo error: ".concat(String.valueOf(obj)));
        }
    }

    public static final class n implements com.bytedance.ies.im.core.api.b.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.im.core.api.b.b f100520a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f100521b;

        static {
            Covode.recordClassIndex(64267);
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(String str, int i2) {
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(String str, int i2, List list) {
        }

        @Override // com.bytedance.im.core.d.r
        public final int d() {
            return -100;
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(com.bytedance.im.core.d.h hVar) {
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupMemberLoader", "onCreateConversation, conversation = ".concat(String.valueOf(hVar)));
        }

        @Override // com.bytedance.im.core.d.r
        public final void b(com.bytedance.im.core.d.h hVar) {
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupMemberLoader", "onDeleteConversation, conversation = ".concat(String.valueOf(hVar)));
        }

        @Override // com.bytedance.im.core.d.r
        public final void d(com.bytedance.im.core.d.h hVar) {
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupMemberLoader", "onDissolveConversation, conversation = ".concat(String.valueOf(hVar)));
        }

        @Override // com.bytedance.im.core.d.r
        public final void c(com.bytedance.im.core.d.h hVar) {
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupMemberLoader", "onLeaveConversation, conversation = ".concat(String.valueOf(hVar)));
            a.f100497c.remove(this.f100521b);
            a.f100496b.remove(this.f100521b);
        }

        @Override // com.bytedance.im.core.d.r
        public final void b(List<ah> list) {
            Integer num;
            StringBuilder sb = new StringBuilder("onAddMember, list.size = ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupMemberLoader", sb.append(num).toString());
            a.a(this.f100521b, list);
        }

        @Override // com.bytedance.im.core.d.r
        public final void c(List<ah> list) {
            Integer num;
            StringBuilder sb = new StringBuilder("onRemoveMember, list.size = ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupMemberLoader", sb.append(num).toString());
            a.b(this.f100521b, list);
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(List<ah> list) {
            Integer num;
            StringBuilder sb = new StringBuilder("onUpdate, list.size = ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupMemberLoader", sb.append(num).toString());
            a.c(this.f100521b, list);
        }

        n(com.bytedance.ies.im.core.api.b.b bVar, String str) {
            this.f100520a = bVar;
            this.f100521b = str;
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(com.bytedance.im.core.d.h hVar, int i2) {
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupMemberLoader", "onUpdateConversation, conversation = " + hVar + " reason = " + i2);
            this.f100520a.d();
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(String str, List<ah> list) {
            Integer num;
            h.f.b.l.d(str, "");
            StringBuilder append = new StringBuilder("onLoadMember, conversationId = ").append(str).append(" list.size = ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupMemberLoader", append.append(num).toString());
            if (list == null || !(!list.isEmpty())) {
                com.ss.android.ugc.aweme.im.service.m.a.b("GroupMemberLoader", "fetchMemberInfo memberList == null");
                return;
            }
            f.a.b.b a2 = ab.a((Callable) new g(list)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(str), i.f100514a);
            h.f.b.l.b(a2, "");
            f.a.j.a.a(a2, a.a());
        }
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f100513a;

        static {
            Covode.recordClassIndex(64261);
        }

        h(String str) {
            this.f100513a = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            e eVar = e.FetchMemberInfo;
            String str = this.f100513a;
            h.f.b.l.b(list, "");
            a.a(eVar, str, list);
            a.d(this.f100513a, list);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f100516a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f100517b;

        static {
            Covode.recordClassIndex(64264);
        }

        k(String str, List list) {
            this.f100516a = str;
            this.f100517b = list;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            if (com.bytedance.ies.im.core.api.e.a.a((Collection<? extends Object>) list) && list != null) {
                a.a(e.FetchUserInfo, this.f100516a, this.f100517b);
            }
        }
    }

    public static void d(String str, List<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> list) {
        f.a.b.b a2 = ab.a((Callable) new j(list)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new k(str, list), l.f100518a);
        h.f.b.l.b(a2, "");
        f.a.j.a.a(a2, a());
    }

    public static void b(String str, List<? extends ah> list) {
        if (!(str == null || str.length() == 0 || list == null || list.isEmpty())) {
            List<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> list2 = f100497c.get(str);
            h.f.b.l.b(list2, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (!h.a.n.a((Iterable) list, (Object) t.getMember())) {
                    arrayList.add(t);
                }
            }
            a(e.RemoveMember, str, arrayList);
        }
    }

    public static void c(String str, List<? extends ah> list) {
        if (!(str == null || str.length() == 0 || list == null || list.isEmpty())) {
            List<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> list2 = f100497c.get(str);
            for (T t : list2) {
                int a2 = h.a.n.a((List) list, (Object) t.getMember());
                if (a2 >= 0) {
                    t.setMember((ah) list.get(a2));
                }
            }
            e eVar = e.UpdateMember;
            h.f.b.l.b(list2, "");
            a(eVar, str, list2);
        }
    }

    public static void a(String str, List<? extends ah> list) {
        if (!(list == null || list.isEmpty())) {
            List<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> list2 = f100497c.get(str);
            h.f.b.l.b(list2, "");
            List<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> g2 = h.a.n.g((Collection) list2);
            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) g2, 10));
            for (com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar : g2) {
                arrayList.add(aVar.getUid());
            }
            f.a.b.b a2 = ab.a((Callable) new CallableC2473a(list, arrayList, g2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(str), c.f100505a);
            h.f.b.l.b(a2, "");
            f.a.j.a.a(a2, a());
        }
    }

    public final void a(String str, d dVar) {
        m mVar;
        h.f.b.l.d(str, "");
        List<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> list = f100497c.get(str);
        Integer num = null;
        if (dVar != null) {
            mVar = new m(new WeakReference(dVar));
            h.f.b.l.d(str, "");
            h.f.b.l.d(mVar, "");
            ConcurrentHashMap<String, CopyOnWriteArraySet<d>> concurrentHashMap = f100495a;
            CopyOnWriteArraySet<d> copyOnWriteArraySet = concurrentHashMap.get(str);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            }
            copyOnWriteArraySet.add(mVar);
            concurrentHashMap.put(str, copyOnWriteArraySet);
        } else {
            mVar = null;
        }
        StringBuilder append = new StringBuilder("getGroupMemberList conversation id = ").append(str).append(" cache size = ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("GroupMemberLoader", append.append(num).toString());
        if (list == null || list.isEmpty()) {
            ConcurrentHashMap<String, com.bytedance.ies.im.core.api.b.b> concurrentHashMap2 = f100499e;
            com.bytedance.ies.im.core.api.b.b bVar = concurrentHashMap2.get(str);
            if (bVar == null) {
                bVar = b.a.a(str);
                bVar.a(new n(bVar, bVar.b()));
                concurrentHashMap2.put(str, bVar);
            }
            bVar.d();
            return;
        }
        d(str, list);
        if (mVar != null) {
            mVar.a(str, list, e.ReadFromCache);
        }
    }

    public static void a(e eVar, String str, List<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> list) {
        f100497c.put(str, list);
        CopyOnWriteArraySet<d> copyOnWriteArraySet = f100495a.get(str);
        if (copyOnWriteArraySet != null) {
            Iterator<d> it = copyOnWriteArraySet.iterator();
            h.f.b.l.b(it, "");
            while (it.hasNext()) {
                it.next().a(str, list, eVar);
            }
        }
        ConcurrentHashMap<String, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> concurrentHashMap = new ConcurrentHashMap<>();
        for (T t : list) {
            concurrentHashMap.put(t.getUid(), t);
        }
        f100496b.put(str, concurrentHashMap);
        com.ss.android.ugc.aweme.im.service.m.a.b("GroupMemberLoader", "setMemberList for " + str + " from : " + eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        if (r0 != null) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a a(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.b r9, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.c r10, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.g r11) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a.a(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.b, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.c, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.g):com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a");
    }
}

package com.ss.android.ugc.aweme.qainvitation.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.api.QAInvitationAPI;
import com.ss.android.ugc.aweme.qainvitation.e.f;
import com.ss.android.ugc.aweme.qainvitation.e.i;
import com.ss.android.ugc.aweme.qainvitation.e.j;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import f.a.d.g;
import f.a.d.h;
import f.a.t;
import f.a.v;
import f.a.w;
import h.a.n;
import h.a.z;
import h.f.b.ad;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class b {
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f119022a = true;

    /* renamed from: b  reason: collision with root package name */
    public List<IMUser> f119023b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public String f119024c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f119025d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f119026e = "";

    /* renamed from: f  reason: collision with root package name */
    public long f119027f;

    /* renamed from: g  reason: collision with root package name */
    public long f119028g;

    /* renamed from: h  reason: collision with root package name */
    public final IQAInvitationService f119029h = QAInvitationService.b();

    /* renamed from: i  reason: collision with root package name */
    public List<IMUser> f119030i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public a.C3062a f119031j = new a.C3062a(z.INSTANCE, z.INSTANCE, z.INSTANCE, z.INSTANCE, z.INSTANCE, z.INSTANCE);

    /* renamed from: k  reason: collision with root package name */
    public final f.a.b.a f119032k;

    /* renamed from: l  reason: collision with root package name */
    public final h.f.a.b<a.C3062a, h.z> f119033l;

    /* renamed from: m  reason: collision with root package name */
    public final h.f.a.a<h.z> f119034m;
    private int o;

    static {
        Covode.recordClassIndex(77318);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77319);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$a$a  reason: collision with other inner class name */
        public static final class C3062a {

            /* renamed from: a  reason: collision with root package name */
            public final List<IMUser> f119035a;

            /* renamed from: b  reason: collision with root package name */
            public final List<IMUser> f119036b;

            /* renamed from: c  reason: collision with root package name */
            public final List<IMUser> f119037c;

            /* renamed from: d  reason: collision with root package name */
            public final List<IMUser> f119038d;

            /* renamed from: e  reason: collision with root package name */
            public final List<IMUser> f119039e;

            /* renamed from: f  reason: collision with root package name */
            public final List<IMUser> f119040f;

            static {
                Covode.recordClassIndex(77320);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3062a)) {
                    return false;
                }
                C3062a aVar = (C3062a) obj;
                return l.a(this.f119035a, aVar.f119035a) && l.a(this.f119036b, aVar.f119036b) && l.a(this.f119037c, aVar.f119037c) && l.a(this.f119038d, aVar.f119038d) && l.a(this.f119039e, aVar.f119039e) && l.a(this.f119040f, aVar.f119040f);
            }

            public final int hashCode() {
                List<IMUser> list = this.f119035a;
                int i2 = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<IMUser> list2 = this.f119036b;
                int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
                List<IMUser> list3 = this.f119037c;
                int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
                List<IMUser> list4 = this.f119038d;
                int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
                List<IMUser> list5 = this.f119039e;
                int hashCode5 = (hashCode4 + (list5 != null ? list5.hashCode() : 0)) * 31;
                List<IMUser> list6 = this.f119040f;
                if (list6 != null) {
                    i2 = list6.hashCode();
                }
                return hashCode5 + i2;
            }

            public final String toString() {
                return "AllFriends(selectedSUGUsers=" + this.f119035a + ", recentFriends=" + this.f119036b + ", mutualFriends=" + this.f119037c + ", allFollowingFriends=" + this.f119038d + ", inviteeList=" + this.f119039e + ", allContacts=" + this.f119040f + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX WARN: Multi-variable type inference failed */
            public C3062a(List<? extends IMUser> list, List<? extends IMUser> list2, List<? extends IMUser> list3, List<? extends IMUser> list4, List<? extends IMUser> list5, List<? extends IMUser> list6) {
                l.d(list, "");
                l.d(list2, "");
                l.d(list3, "");
                l.d(list4, "");
                l.d(list5, "");
                l.d(list6, "");
                this.f119035a = list;
                this.f119036b = list2;
                this.f119037c = list3;
                this.f119038d = list4;
                this.f119039e = list5;
                this.f119040f = list6;
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.qainvitation.e.c cVar, List<IMUser> list) {
        List<User> list2;
        List<User> list3 = null;
        if (cVar != null) {
            List<User> list4 = cVar.f119146a;
            int i2 = 0;
            if (list4 != null && !list4.isEmpty()) {
                if (!(cVar == null || (list2 = cVar.f119146a) == null)) {
                    i2 = list2.size();
                }
                this.o = i2;
                if (cVar == null || (list3 = cVar.f119146a) == null) {
                    l.b();
                }
                list.addAll(com.ss.android.ugc.aweme.qainvitation.g.a.a(list3));
            }
        }
    }

    public final boolean a(String str) {
        l.d(str, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (l.a((Object) str, (Object) g2.getCurUserId())) {
            return true;
        }
        Iterator<T> it = this.f119023b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (l.a((Object) next.getUid(), (Object) str)) {
                if (next != null) {
                    return true;
                }
            }
        }
        for (T t : this.f119031j.f119039e) {
            if (l.a((Object) str, (Object) t.getUid())) {
                if (t != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        if (r2 == null) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.im.service.model.IMUser r11, com.ss.android.ugc.aweme.qainvitation.a.a r12) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qainvitation.b.b.a(com.ss.android.ugc.aweme.im.service.model.IMUser, com.ss.android.ugc.aweme.qainvitation.a.a):void");
    }

    public final void a(IMUser iMUser) {
        l.d(iMUser, "");
        Iterator<T> it = this.f119030i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (l.a((Object) iMUser.getUid(), (Object) next.getUid())) {
                if (next != null) {
                    this.f119030i.remove(next);
                }
            }
        }
        List<? extends IMUser> g2 = n.g((Collection) this.f119031j.f119035a);
        Iterator<T> it2 = g2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next2 = it2.next();
            if (l.a((Object) iMUser.getUid(), (Object) next2.getUid())) {
                if (next2 != null) {
                    g2.remove(next2);
                    b(g2, this.f119031j.f119036b, this.f119031j.f119037c, this.f119031j.f119039e, this.f119031j.f119038d);
                }
            }
        }
        r.a("cancel_select_qa_invitee", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f119026e).a("enter_method", this.f119025d).a("from_user_id", this.f119028g).a("to_user_id", iMUser.getUid()).f66730a);
        this.f119033l.invoke(this.f119031j);
    }

    public final boolean a() {
        if (this.f119030i.size() + this.o >= b()) {
            return true;
        }
        return false;
    }

    public final int b() {
        f a2;
        Integer num;
        IQAInvitationService iQAInvitationService = this.f119029h;
        if (iQAInvitationService == null || (a2 = iQAInvitationService.a()) == null || (num = a2.f119149a) == null) {
            return 30;
        }
        return num.intValue();
    }

    static final class c<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f119047a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f119048b;

        static {
            Covode.recordClassIndex(77324);
        }

        c(b bVar, List list) {
            this.f119047a = bVar;
            this.f119048b = list;
        }

        static final class d<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v f119061a;

            static {
                Covode.recordClassIndex(77328);
            }

            d(v vVar) {
                this.f119061a = vVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                this.f119061a.a(obj);
            }
        }

        static final class a<T, R> implements g {

            /* renamed from: a  reason: collision with root package name */
            public static final a f119053a = new a();

            static {
                Covode.recordClassIndex(77325);
            }

            a() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                l.d(obj, "");
                return new j((byte) 0);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$c$b  reason: collision with other inner class name */
        static final class C3065b<T, R> implements g {

            /* renamed from: a  reason: collision with root package name */
            public static final C3065b f119054a = new C3065b();

            static {
                Covode.recordClassIndex(77326);
            }

            C3065b() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                l.d(obj, "");
                return new com.ss.android.ugc.aweme.qainvitation.e.c((byte) 0);
            }
        }

        static final class f<T, R> implements g {

            /* renamed from: a  reason: collision with root package name */
            public static final f f119065a = new f();

            static {
                Covode.recordClassIndex(77330);
            }

            f() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                l.d(obj, "");
                return new com.ss.android.ugc.aweme.qainvitation.e.g((byte) 0);
            }
        }

        static final class e<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f119062a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f119063b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ v f119064c;

            static {
                Covode.recordClassIndex(77329);
            }

            e(c cVar, List list, v vVar) {
                this.f119062a = cVar;
                this.f119063b = list;
                this.f119064c = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                if (th != null) {
                    th.getMessage();
                }
                this.f119062a.f119047a.a(new ArrayList(), this.f119063b, new ArrayList(), this.f119062a.f119048b, new ArrayList());
                this.f119064c.a(this.f119062a.f119047a.f119031j);
            }
        }

        @Override // f.a.w
        public final void subscribe(v<a.C3062a> vVar) {
            t<com.ss.android.ugc.aweme.qainvitation.e.c> a2;
            l.d(vVar, "");
            List<IMUser> allFollowIMUsers = IMService.createIIMServicebyMonsterPlugin(false).getAllFollowIMUsers();
            ArrayList arrayList = new ArrayList();
            for (T t : allFollowIMUsers) {
                String uid = t.getUid();
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                if (!l.a((Object) uid, (Object) g2.getCurUserId())) {
                    arrayList.add(t);
                }
            }
            List g3 = n.g((Collection) arrayList);
            List<IMUser> recentIMUsers = IMService.createIIMServicebyMonsterPlugin(false).getRecentIMUsers();
            String a3 = b.a(g3, recentIMUsers);
            l.d(a3, "");
            String b2 = new com.google.gson.f().b(n.a(Integer.valueOf(com.ss.android.ugc.aweme.qainvitation.e.d.QA_INVITE.getType())));
            l.b(b2, "");
            t<j> f2 = QAInvitationAPI.a.a(b2, a3).b(f.a.h.a.b(f.a.k.a.f158006c)).f(a.f119053a);
            t<com.ss.android.ugc.aweme.qainvitation.e.g> f3 = QAInvitationAPI.a.a(com.ss.android.ugc.aweme.qainvitation.e.d.QA_INVITE.getType()).b(f.a.h.a.b(f.a.k.a.f158006c)).f(f.f119065a);
            long j2 = this.f119047a.f119027f;
            if (j2 == 0) {
                a2 = t.b(new com.ss.android.ugc.aweme.qainvitation.e.c((byte) 0));
                l.b(a2, "");
            } else {
                a2 = QAInvitationAPI.a.a(j2);
            }
            this.f119047a.f119032k.a(t.a(f2, f3, a2.b(f.a.h.a.b(f.a.k.a.f158006c)).f(C3065b.f119054a), new C3066c(this, recentIMUsers, g3)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(vVar), new e(this, g3, vVar)));
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$c$c  reason: collision with other inner class name */
        static final class C3066c<T1, T2, T3, R> implements h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f119056a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f119057b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f119058c;

            static {
                Covode.recordClassIndex(77327);
            }

            C3066c(c cVar, List list, List list2) {
                this.f119056a = cVar;
                this.f119057b = list;
                this.f119058c = list2;
            }

            @Override // f.a.d.h
            public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
                List<com.ss.android.ugc.aweme.qainvitation.e.h> list;
                j jVar = (j) obj;
                com.ss.android.ugc.aweme.qainvitation.e.g gVar = (com.ss.android.ugc.aweme.qainvitation.e.g) obj2;
                com.ss.android.ugc.aweme.qainvitation.e.c cVar = (com.ss.android.ugc.aweme.qainvitation.e.c) obj3;
                ArrayList arrayList = new ArrayList();
                List<com.ss.android.ugc.aweme.qainvitation.e.h> list2 = null;
                if (!(jVar == null || (list = jVar.f119156a) == null || list.isEmpty())) {
                    if (jVar != null) {
                        list2 = jVar.f119156a;
                    }
                    Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.qainvitation.model.UserBlockData>");
                    arrayList.addAll(ad.d(list2));
                }
                ArrayList arrayList2 = new ArrayList();
                b.a(gVar, arrayList2, this.f119057b, arrayList);
                ArrayList arrayList3 = new ArrayList();
                this.f119056a.f119047a.a(cVar, arrayList3);
                return this.f119056a.f119047a.a(arrayList2, this.f119058c, arrayList, this.f119056a.f119048b, arrayList3);
            }
        }
    }

    static final class d<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f119066a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f119067b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f119068c;

        static {
            Covode.recordClassIndex(77331);
        }

        d(b bVar, String str, List list) {
            this.f119066a = bVar;
            this.f119067b = str;
            this.f119068c = list;
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$d$b  reason: collision with other inner class name */
        static final class C3068b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v f119075a;

            static {
                Covode.recordClassIndex(77333);
            }

            C3068b(v vVar) {
                this.f119075a = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                this.f119075a.a(z.INSTANCE);
                ((Throwable) obj).getMessage();
            }
        }

        static final class a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f119072a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f119073b;

            static {
                Covode.recordClassIndex(77332);
            }

            a(d dVar, v vVar) {
                this.f119072a = dVar;
                this.f119073b = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
            /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                List list = (List) obj;
                this.f119072a.f119066a.f119023b.clear();
                if (list != null) {
                    this.f119072a.f119066a.f119023b.addAll(list);
                    this.f119073b.a(this.f119072a.f119066a.f119023b);
                    return;
                }
                this.f119073b.a(z.INSTANCE);
            }
        }

        @Override // f.a.w
        public final void subscribe(v<List<IMUser>> vVar) {
            l.d(vVar, "");
            b bVar = this.f119066a;
            String str = this.f119067b;
            l.d(str, "");
            bVar.f119024c = str;
            b bVar2 = this.f119066a;
            List<? extends IMUser> list = this.f119068c;
            String str2 = this.f119067b;
            List<IMUser> searchFollowIMUser = IMService.createIIMServicebyMonsterPlugin(false).searchFollowIMUser(list, str2);
            Locale locale = Locale.ROOT;
            l.b(locale, "");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str2.toLowerCase(locale);
            l.b(lowerCase, "");
            for (T t : list) {
                String uniqueId = t.getUniqueId();
                if (uniqueId == null || uniqueId.length() == 0) {
                    String shortId = t.getShortId();
                    l.b(shortId, "");
                    if (b.a(shortId, lowerCase)) {
                        t.setSearchType(1);
                        searchFollowIMUser.add(t);
                    }
                } else {
                    String uniqueId2 = t.getUniqueId();
                    l.b(uniqueId2, "");
                    if (b.a(uniqueId2, lowerCase)) {
                        t.setSearchType(1);
                        searchFollowIMUser.add(t);
                    }
                }
            }
            if (bVar2.f119022a) {
                List<IMUser> a2 = b.a(searchFollowIMUser);
                searchFollowIMUser.clear();
                searchFollowIMUser.addAll(a2);
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (T t2 : searchFollowIMUser) {
                if (hashSet.add(t2.getUid())) {
                    arrayList.add(t2);
                }
            }
            this.f119066a.f119032k.a(t.b((Object) arrayList).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this, vVar), new C3068b(vVar)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$b  reason: collision with other inner class name */
    static final class C3063b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f119041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f119042b;

        static {
            Covode.recordClassIndex(77321);
        }

        C3063b(b bVar, long j2) {
            this.f119041a = bVar;
            this.f119042b = j2;
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$b$a */
        static final class a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3063b f119043a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f119044b;

            static {
                Covode.recordClassIndex(77322);
            }

            a(C3063b bVar, v vVar) {
                this.f119043a = bVar;
                this.f119044b = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                int i2 = 0;
                if (obj != null) {
                    this.f119044b.a(obj);
                    i2 = 1;
                } else {
                    this.f119044b.a(new com.ss.android.ugc.aweme.qainvitation.e.a((byte) 0));
                }
                this.f119043a.f119041a.a(i2);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$b$b  reason: collision with other inner class name */
        static final class C3064b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3063b f119045a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f119046b;

            static {
                Covode.recordClassIndex(77323);
            }

            C3064b(C3063b bVar, v vVar) {
                this.f119045a = bVar;
                this.f119046b = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                l.d(th, "");
                this.f119046b.a(new com.ss.android.ugc.aweme.qainvitation.e.a((byte) 0));
                th.getMessage();
                this.f119045a.f119041a.a(0);
            }
        }

        @Override // f.a.w
        public final void subscribe(v<com.ss.android.ugc.aweme.qainvitation.e.a> vVar) {
            l.d(vVar, "");
            if (!this.f119041a.f119030i.isEmpty()) {
                String a2 = b.a(this.f119041a.f119030i, z.INSTANCE);
                long j2 = this.f119042b;
                l.d(a2, "");
                this.f119041a.f119032k.a(QAInvitationAPI.a.a(j2, a2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this, vVar), new C3064b(this, vVar)));
            }
        }
    }

    static List<IMUser> a(List<? extends IMUser> list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (IMUser iMUser : list) {
            String uid = iMUser.getUid();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (!l.a((Object) uid, (Object) g2.getCurUserId())) {
                arrayList.add(iMUser);
            }
        }
        return arrayList;
    }

    public final IMUser b(IMUser iMUser) {
        boolean z;
        l.d(iMUser, "");
        List<IMUser> list = this.f119030i;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        T t = null;
        if (z) {
            return null;
        }
        Iterator<T> it = this.f119030i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (l.a((Object) next.getUid(), (Object) iMUser.getUid())) {
                t = next;
                break;
            }
        }
        return t;
    }

    public final void a(int i2) {
        r.a("send_qa_invitation", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f119026e).a("enter_method", this.f119025d).a("question_id", this.f119027f).a("invitee_count", this.f119030i.size()).a("is_success", i2).f66730a);
    }

    public static String a(List<? extends IMUser> list, List<? extends IMUser> list2) {
        boolean z;
        ArrayList<IMUser> arrayList = new ArrayList();
        arrayList.addAll(list);
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            arrayList.addAll(list2);
        }
        try {
            com.google.gson.f fVar = new com.google.gson.f();
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) arrayList, 10));
            for (IMUser iMUser : arrayList) {
                String uid = iMUser.getUid();
                l.b(uid, "");
                arrayList2.add(Long.valueOf(Long.parseLong(uid)));
            }
            String b2 = fVar.b(arrayList2);
            l.b(b2, "");
            return b2;
        } catch (Exception unused) {
            return "";
        }
    }

    static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        l.b(locale, "");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        l.b(lowerCase, "");
        if (p.e((CharSequence) lowerCase, (CharSequence) str2)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.qainvitation.b.b$a$a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(f.a.b.a aVar, h.f.a.b<? super a.C3062a, h.z> bVar, h.f.a.a<h.z> aVar2) {
        l.d(aVar, "");
        l.d(bVar, "");
        l.d(aVar2, "");
        this.f119032k = aVar;
        this.f119033l = bVar;
        this.f119034m = aVar2;
    }

    public static void a(com.ss.android.ugc.aweme.qainvitation.e.g gVar, List<IMUser> list, List<IMUser> list2, List<com.ss.android.ugc.aweme.qainvitation.e.h> list3) {
        List<com.ss.android.ugc.aweme.qainvitation.e.h> list4;
        List<User> list5;
        T t;
        List<i> list6;
        boolean z;
        List<i> list7;
        i iVar;
        Integer num;
        com.ss.android.ugc.aweme.qainvitation.e.h hVar;
        List<i> list8;
        boolean z2;
        List<i> list9;
        i iVar2;
        Integer num2;
        Object obj;
        if (gVar != null) {
            try {
                list5 = gVar.f119150a;
                list4 = gVar.f119151b;
            } catch (Exception e2) {
                e2.getMessage();
                return;
            }
        } else {
            list5 = null;
            list4 = null;
        }
        if (list5 != null && (!list5.isEmpty())) {
            for (User user : list5) {
                if (list.size() < 10) {
                    String uid = user.getUid();
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    if (!l.a((Object) uid, (Object) g2.getCurUserId())) {
                        IMUser a2 = com.ss.android.ugc.aweme.im.c.a(user);
                        if (list4 != null) {
                            Iterator it = list4.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (l.a((Object) String.valueOf(((com.ss.android.ugc.aweme.qainvitation.e.h) obj).f119152a), (Object) (a2 != null ? a2.getUid() : null))) {
                                    break;
                                }
                            }
                            hVar = (com.ss.android.ugc.aweme.qainvitation.e.h) obj;
                        } else {
                            hVar = null;
                        }
                        if (a2 != null) {
                            a2.setUserEnabledQAInvite(true);
                            if (!(hVar == null || (list8 = hVar.f119153b) == null || list8.isEmpty())) {
                                if (hVar == null || (list9 = hVar.f119153b) == null || (iVar2 = list9.get(0)) == null || (num2 = iVar2.f119154a) == null || num2.intValue() == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                a2.setUserEnabledQAInvite(Boolean.valueOf(z2));
                            }
                            list.add(a2);
                        }
                    }
                }
            }
        }
        if (!(list.size() >= 10 || list2 == null || list2.isEmpty())) {
            for (T t2 : list2) {
                if (list.size() < 10 && !list.contains(t2)) {
                    String uid2 = t2.getUid();
                    IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g3, "");
                    if (!l.a((Object) uid2, (Object) g3.getCurUserId())) {
                        t2.setUserEnabledQAInvite(true);
                        Iterator<T> it2 = list3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            if (l.a((Object) String.valueOf(t.f119152a), (Object) t2.getUid())) {
                                break;
                            }
                        }
                        T t3 = t;
                        if (!(t3 == null || (list6 = t3.f119153b) == null || list6.isEmpty())) {
                            if (t3 == null || (list7 = t3.f119153b) == null || (iVar = list7.get(0)) == null || (num = iVar.f119154a) == null || num.intValue() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            t2.setUserEnabledQAInvite(Boolean.valueOf(z));
                        }
                        list.add(t2);
                    }
                }
            }
        }
    }

    private a.C3062a b(List<? extends IMUser> list, List<? extends IMUser> list2, List<? extends IMUser> list3, List<? extends IMUser> list4, List<? extends IMUser> list5) {
        l.d(list, "");
        l.d(list2, "");
        l.d(list3, "");
        l.d(list4, "");
        l.d(list5, "");
        List arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        arrayList.addAll(list5);
        if (this.f119022a) {
            arrayList = a(arrayList);
        }
        a.C3062a aVar = new a.C3062a(list, list2, list3, list5, list4, arrayList);
        this.f119031j = aVar;
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.qainvitation.b.b.a.C3062a a(java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r19, java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r20, java.util.List<com.ss.android.ugc.aweme.qainvitation.e.h> r21, java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> r22, java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r23) {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qainvitation.b.b.a(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):com.ss.android.ugc.aweme.qainvitation.b.b$a$a");
    }
}

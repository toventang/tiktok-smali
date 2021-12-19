package com.ss.android.ugc.aweme.account.login;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.t;
import com.ss.android.ugc.aweme.account.login.h.a;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.ss.android.ugc.aweme.account.login.trusted.c;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.dc;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.f;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.l.k;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    static boolean f63527a = false;

    /* renamed from: b  reason: collision with root package name */
    public static List<BaseLoginMethod> f63528b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f63529c = true;

    /* renamed from: d  reason: collision with root package name */
    public static final q f63530d = new q();

    public static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final f f63532a = new f();

        static {
            Covode.recordClassIndex(39161);
        }

        f() {
        }

        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ Object call() {
            return q.f63528b;
        }
    }

    private q() {
    }

    public static boolean a(BaseLoginMethod baseLoginMethod) {
        try {
            if (!(baseLoginMethod instanceof PhoneLoginMethod)) {
                baseLoginMethod = null;
            }
            PhoneLoginMethod phoneLoginMethod = (PhoneLoginMethod) baseLoginMethod;
            if (phoneLoginMethod == null) {
                return true;
            }
            if (phoneLoginMethod.getPhoneNumber() == null) {
                return false;
            }
            return l.a(phoneLoginMethod.isFromReInstallNet(), true) || phoneLoginMethod.getPhoneNumber().getNationalNumber() > 0;
        } catch (Exception unused) {
        }
    }

    public static void a(boolean z) {
        List<BaseLoginMethod> list = f63528b;
        ArrayList<BaseLoginMethod> arrayList = new ArrayList();
        for (T t : list) {
            if (l.a((Object) t.getUid(), (Object) cj.b())) {
                arrayList.add(t);
            }
        }
        for (BaseLoginMethod baseLoginMethod : arrayList) {
            baseLoginMethod.allowOneKeyLogin(z);
        }
        f();
    }

    public static void f() {
        b.i.b(b.f63531a, b.i.f4824a);
    }

    public static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final g f63533a = new g();

        static {
            Covode.recordClassIndex(39162);
        }

        g() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (q.f63529c) {
                return q.f63528b;
            }
            q.f63528b = q.a();
            q.e();
            q.f63529c = true;
            return q.f63528b;
        }
    }

    static {
        Covode.recordClassIndex(39154);
        f63528b = new ArrayList();
        f63528b = a();
        e();
    }

    public static boolean c() {
        List<BaseLoginMethod> list = f63528b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (l.a((Object) t.isFromReInstallNet(), (Object) true)) {
                arrayList.add(t);
            }
        }
        if (!arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f63531a = new b();

        static {
            Covode.recordClassIndex(39156);
        }

        b() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            h.l.h a2 = k.a(n.t(q.f63528b), (Comparator) new a());
            if (!cj.f71084b.k().isOneKeyLoginExprimentEnable()) {
                l.d(a2, "");
                a2 = new h.l.q(a2, 5);
            }
            q.f63528b = k.h(a2);
            ((t) dc.a(com.ss.android.ugc.aweme.a.f62426a, t.class)).a(new com.google.gson.f().b(q.f63528b));
            if (q.f63527a) {
                q.f63528b.size();
                for (BaseLoginMethod baseLoginMethod : q.f63528b) {
                    baseLoginMethod.getLoginMethodName();
                    baseLoginMethod.getUid();
                    baseLoginMethod.getExpires();
                    baseLoginMethod.getAllowOneKeyLogin();
                }
            }
            return z.f158842a;
        }

        public static final class a<T> implements Comparator {
            static {
                Covode.recordClassIndex(39157);
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                long j2;
                long time;
                long time2;
                T t3 = t2;
                Long lastActiveTime = t3.getLastActiveTime();
                if (lastActiveTime != null) {
                    j2 = lastActiveTime.longValue();
                } else {
                    j2 = -1;
                }
                if (j2 > 0) {
                    Long lastActiveTime2 = t3.getLastActiveTime();
                    if (lastActiveTime2 == null) {
                        l.b();
                    }
                    time = lastActiveTime2.longValue();
                } else {
                    time = t3.getExpires().getTime() - 2592000000L;
                }
                Long valueOf = Long.valueOf(time);
                T t4 = t;
                Long lastActiveTime3 = t4.getLastActiveTime();
                if (lastActiveTime3 == null || lastActiveTime3.longValue() <= 0) {
                    time2 = t4.getExpires().getTime() - 2592000000L;
                } else {
                    Long lastActiveTime4 = t4.getLastActiveTime();
                    if (lastActiveTime4 == null) {
                        l.b();
                    }
                    time2 = lastActiveTime4.longValue();
                }
                return h.b.a.a(valueOf, Long.valueOf(time2));
            }
        }
    }

    public static void e() {
        List<BaseLoginMethod> list = f63528b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().isExpired()) {
                    List<BaseLoginMethod> list2 = f63528b;
                    ArrayList arrayList = new ArrayList();
                    for (T t : list2) {
                        T t2 = t;
                        if (!t2.isExpired() || t2.getLoginMethodName() == LoginMethodName.DEFAULT) {
                            arrayList.add(t);
                        }
                    }
                    f63528b = n.g((Collection) arrayList);
                    f();
                    return;
                }
            }
        }
    }

    public static List<BaseLoginMethod> a() {
        ArrayList arrayList = new ArrayList();
        a aVar = new a(arrayList);
        com.google.gson.f fVar = new com.google.gson.f();
        com.google.gson.l a2 = com.google.gson.q.a(((t) dc.a(com.ss.android.ugc.aweme.a.f62426a, t.class)).b("[]"));
        Objects.requireNonNull(a2, "null cannot be cast to non-null type com.google.gson.JsonArray");
        Iterator<com.google.gson.l> it = ((com.google.gson.i) a2).iterator();
        l.b(it, "");
        while (it.hasNext()) {
            com.google.gson.l next = it.next();
            try {
                l.b(next, "");
                com.google.gson.l c2 = next.j().c("loginMethodName");
                l.b(c2, "");
                String c3 = c2.c();
                if (l.a((Object) c3, (Object) LoginMethodName.EMAIL_PASS.name()) || l.a((Object) c3, (Object) LoginMethodName.USER_NAME_PASS.name())) {
                    Object a3 = fVar.a(next, AccountPassLoginMethod.class);
                    l.b(a3, "");
                    aVar.a((BaseLoginMethod) a3);
                } else if (l.a((Object) c3, (Object) LoginMethodName.PHONE_NUMBER_PASS.name()) || l.a((Object) c3, (Object) LoginMethodName.PHONE_SMS.name())) {
                    Object a4 = fVar.a(next, PhoneLoginMethod.class);
                    l.b(a4, "");
                    aVar.a((BaseLoginMethod) a4);
                } else if (l.a((Object) c3, (Object) LoginMethodName.THIRD_PARTY.name())) {
                    Object a5 = fVar.a(next, TPLoginMethod.class);
                    l.b(a5, "");
                    aVar.a((BaseLoginMethod) a5);
                } else if (l.a((Object) c3, (Object) LoginMethodName.DEFAULT.name())) {
                    Object a6 = fVar.a(next, BaseLoginMethod.class);
                    l.b(a6, "");
                    aVar.a((BaseLoginMethod) a6);
                }
            } catch (t e2) {
                e2.printStackTrace();
                it.remove();
            }
        }
        return arrayList;
    }

    public static final BaseLoginMethod d() {
        T next;
        long j2;
        long j3;
        long time;
        if (!((t) dc.a(com.ss.android.ugc.aweme.a.f62426a, t.class)).b(true)) {
            return new BaseLoginMethod(null, null, null, null, -1L, null, null, null, null, 495, null);
        }
        e();
        if (f63527a) {
            for (BaseLoginMethod baseLoginMethod : f63528b) {
                baseLoginMethod.getLoginMethodName();
                baseLoginMethod.getUid();
                baseLoginMethod.getExpires();
            }
        }
        Iterator<T> it = f63528b.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                T t = next;
                Long lastActiveTime = t.getLastActiveTime();
                if (lastActiveTime != null) {
                    j2 = lastActiveTime.longValue();
                } else {
                    j2 = -1;
                }
                if (j2 > 0) {
                    Long lastActiveTime2 = t.getLastActiveTime();
                    if (lastActiveTime2 == null) {
                        l.b();
                    }
                    j3 = lastActiveTime2.longValue();
                } else {
                    j3 = t.getExpires().getTime() - 2592000000L;
                }
                do {
                    T next2 = it.next();
                    T t2 = next2;
                    Long lastActiveTime3 = t2.getLastActiveTime();
                    if (lastActiveTime3 == null || lastActiveTime3.longValue() <= 0) {
                        time = t2.getExpires().getTime() - 2592000000L;
                    } else {
                        Long lastActiveTime4 = t2.getLastActiveTime();
                        if (lastActiveTime4 == null) {
                            l.b();
                        }
                        time = lastActiveTime4.longValue();
                    }
                    if (j3 < time) {
                        next = next2;
                        j3 = time;
                    }
                } while (it.hasNext());
            }
        }
        T t3 = next;
        if (t3 == null) {
            return new BaseLoginMethod(null, null, null, null, -1L, null, null, null, null, 495, null);
        }
        return t3;
    }

    public static boolean b() {
        List<BaseLoginMethod> list = f63528b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (!TextUtils.isEmpty(t2.getUid()) && ((!l.a((Object) t2.isFromReInstallNet(), (Object) true)) || l.a((Object) t2.isTransToNormal(), (Object) true))) {
                arrayList.add(t);
            }
        }
        if (!arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<BaseLoginMethod, z> {
        final /* synthetic */ List $list;

        static {
            Covode.recordClassIndex(39155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List list) {
            super(1);
            this.$list = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseLoginMethod baseLoginMethod) {
            a(baseLoginMethod);
            return z.f158842a;
        }

        public final void a(BaseLoginMethod baseLoginMethod) {
            l.d(baseLoginMethod, "");
            if (q.a(baseLoginMethod)) {
                if (q.f63527a) {
                    baseLoginMethod.getLoginMethodName();
                }
                this.$list.add(baseLoginMethod);
            } else if (q.f63527a) {
                baseLoginMethod.getLoginMethodName();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<BaseLoginMethod, Boolean> {
        final /* synthetic */ List $exceptUids;

        static {
            Covode.recordClassIndex(39159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(List list) {
            super(1);
            this.$exceptUids = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(BaseLoginMethod baseLoginMethod) {
            BaseLoginMethod baseLoginMethod2 = baseLoginMethod;
            l.d(baseLoginMethod2, "");
            List list = this.$exceptUids;
            if (list == null) {
                l.b();
            }
            return Boolean.valueOf(!list.contains(baseLoginMethod2.getUid()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.b<BaseLoginMethod, Boolean> {
        final /* synthetic */ BaseLoginMethod $baseLoginMethod;

        static {
            Covode.recordClassIndex(39163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(BaseLoginMethod baseLoginMethod) {
            super(1);
            this.$baseLoginMethod = baseLoginMethod;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(BaseLoginMethod baseLoginMethod) {
            BaseLoginMethod baseLoginMethod2 = baseLoginMethod;
            l.d(baseLoginMethod2, "");
            return Boolean.valueOf(l.a((Object) baseLoginMethod2.getUid(), (Object) this.$baseLoginMethod.getUid()));
        }
    }

    static final class i extends m implements h.f.a.b<BaseLoginMethod, Boolean> {
        final /* synthetic */ String $uid;

        static {
            Covode.recordClassIndex(39164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(1);
            this.$uid = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(BaseLoginMethod baseLoginMethod) {
            BaseLoginMethod baseLoginMethod2 = baseLoginMethod;
            l.d(baseLoginMethod2, "");
            return Boolean.valueOf(l.a((Object) baseLoginMethod2.getUid(), (Object) this.$uid));
        }
    }

    public static final void a(String str) {
        l.d(str, "");
        n.a((List) f63528b, (h.f.a.b) new i(str));
        f();
    }

    static final class j extends m implements h.f.a.b<BaseLoginMethod, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f63534a = new j();

        static {
            Covode.recordClassIndex(39165);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(BaseLoginMethod baseLoginMethod) {
            BaseLoginMethod baseLoginMethod2 = baseLoginMethod;
            l.d(baseLoginMethod2, "");
            boolean z = true;
            if (!l.a((Object) baseLoginMethod2.isFromReInstallNet(), (Object) true) || !(!l.a((Object) baseLoginMethod2.isTransToNormal(), (Object) true))) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static List<BaseLoginMethod> a(List<String> list) {
        z.a aVar = new z.a();
        aVar.element = b();
        h.l.h a2 = k.a(k.a(n.t(f63528b), (h.f.a.b) new e(aVar)), (Comparator) new c());
        if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return k.g(a2);
        }
        return k.g(k.a(a2, (h.f.a.b) new d(list)));
    }

    public static List<BaseLoginMethod> b(String str) {
        l.d(str, "");
        List<BaseLoginMethod> list = f63528b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (l.a((Object) t.getUid(), (Object) str)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<BaseLoginMethod, Boolean> {
        final /* synthetic */ z.a $hasNormalMethods;

        static {
            Covode.recordClassIndex(39160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(z.a aVar) {
            super(1);
            this.$hasNormalMethods = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
            if (r0.isCommonInfoAvailable() == true) goto L_0x0051;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
            if (r5.isExpired() == false) goto L_0x0051;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
            r3 = true;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Boolean invoke(com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r5) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r5 = (com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r5
                java.lang.String r0 = ""
                h.f.b.l.d(r5, r0)
                h.f.b.z$a r0 = r4.$hasNormalMethods
                boolean r0 = r0.element
                r3 = 0
                r2 = 1
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
                if (r0 == 0) goto L_0x003f
                java.lang.Boolean r0 = r5.isFromReInstallNet()
                boolean r0 = h.f.b.l.a(r0, r1)
                if (r0 == 0) goto L_0x002a
                java.lang.Boolean r0 = r5.isTransToNormal()
                boolean r3 = h.f.b.l.a(r0, r1)
            L_0x0025:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                return r0
            L_0x002a:
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName r1 = r5.getLoginMethodName()
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.DEFAULT
                if (r1 == r0) goto L_0x0025
                com.ss.android.ugc.aweme.account.login.model.CommonUserInfo r0 = r5.getCommonUserInfo()
                if (r0 == 0) goto L_0x0025
                boolean r0 = r0.isCommonInfoAvailable()
                if (r0 != r2) goto L_0x0025
                goto L_0x0051
            L_0x003f:
                com.ss.android.ugc.aweme.an r0 = com.ss.android.ugc.aweme.cj.f71084b
                com.ss.android.ugc.aweme.bn r0 = r0.k()
                boolean r0 = r0.isTrustedEnvLoginFreshInstallEnable()
                if (r0 == 0) goto L_0x0025
                boolean r0 = r5.isExpired()
                if (r0 != 0) goto L_0x0025
            L_0x0051:
                r3 = 1
                goto L_0x0025
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.q.e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(User user) {
        l.d(user, "");
        List<BaseLoginMethod> list = f63528b;
        ArrayList<BaseLoginMethod> arrayList = new ArrayList();
        for (T t : list) {
            if (l.a((Object) t.getUid(), (Object) user.getUid())) {
                arrayList.add(t);
            }
        }
        for (BaseLoginMethod baseLoginMethod : arrayList) {
            baseLoginMethod.updateUserInfo(user);
        }
        f();
    }

    public static final void b(BaseLoginMethod baseLoginMethod) {
        T t;
        String str;
        Integer a2;
        String str2;
        Long lastActiveTime;
        String str3 = "";
        l.d(baseLoginMethod, str3);
        if (baseLoginMethod.getLoginMethodName() == LoginMethodName.DEFAULT && (lastActiveTime = baseLoginMethod.getLastActiveTime()) != null && lastActiveTime.longValue() == -1) {
            baseLoginMethod.setLastActiveTime(Long.valueOf(System.currentTimeMillis()));
        }
        Iterator<T> it = f63528b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (l.a((Object) t.getUid(), (Object) baseLoginMethod.getUid())) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            baseLoginMethod.setAllowOneKeyLogin(t2.getAllowOneKeyLogin());
        } else {
            f.a f2 = com.ss.android.ugc.aweme.user.e.f(com.ss.android.ugc.aweme.user.e.f142364k.e());
            if (f2 == null || (str = f2.f142392f) == null) {
                str = str3;
            }
            boolean z = false;
            if (!TextUtils.isEmpty(str)) {
                if (!(f2 == null || (str2 = f2.f142392f) == null)) {
                    str3 = str2;
                }
                if (!(str3.length() == 0 || (a2 = com.ss.android.ugc.aweme.user.a.a(str3, "save_login")) == null || a2.intValue() != 1)) {
                    z = true;
                }
            }
            baseLoginMethod.setAllowOneKeyLogin(Boolean.valueOf(z));
        }
        n.a((List) f63528b, (h.f.a.b) new h(baseLoginMethod));
        f63528b.add(baseLoginMethod);
        if (f63527a) {
            baseLoginMethod.getLoginMethodName();
            baseLoginMethod.getUid();
            new Exception();
        }
        f();
    }

    public static final void a(com.ss.android.ugc.aweme.user.c cVar) {
        if (cVar != null) {
            List<BaseLoginMethod> list = f63528b;
            ArrayList<BaseLoginMethod> arrayList = new ArrayList();
            for (T t : list) {
                if (l.a((Object) t.getUid(), (Object) cVar.f142345a)) {
                    arrayList.add(t);
                }
            }
            for (BaseLoginMethod baseLoginMethod : arrayList) {
                baseLoginMethod.updateUserInfo(cVar);
            }
            f();
        }
    }

    public static final void b(List<com.ss.android.ugc.aweme.account.login.trusted.h> list) {
        long currentTimeMillis;
        Integer num;
        String str;
        String str2;
        l.d(list, "");
        n.a((List) f63528b, (h.f.a.b) j.f63534a);
        for (com.ss.android.ugc.aweme.account.login.trusted.h hVar : list) {
            Long l2 = hVar.f63718c;
            if (l2 != null) {
                currentTimeMillis = l2.longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            long j2 = currentTimeMillis * 1000;
            String str3 = hVar.f63720e;
            if (str3 == null) {
                l.b();
            }
            String str4 = hVar.f63722g;
            if (str4 == null) {
                l.b();
            }
            CommonUserInfo commonUserInfo = new CommonUserInfo(str3, str4, hVar.f63717b, hVar.f63719d);
            String str5 = hVar.f63717b;
            if (str5 == null) {
                str5 = "";
            }
            BaseLoginMethod baseLoginMethod = new BaseLoginMethod(str5, LoginMethodName.DEFAULT, commonUserInfo, new Date(System.currentTimeMillis() + 2592000000L), Long.valueOf(j2), Long.valueOf(j2), true, true, null, 256, null);
            if (!(hVar.f63721f == null || (num = hVar.f63721f.f63696a) == null)) {
                if (num.intValue() == 1 || num.intValue() == 2 || num.intValue() == 3) {
                    String str6 = hVar.f63717b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    baseLoginMethod = new PhoneLoginMethod(str6, LoginMethodName.PHONE_SMS, new a.C1412a(), commonUserInfo, Long.valueOf(j2), Long.valueOf(j2), true);
                } else if (num.intValue() == 4 || num.intValue() == 5) {
                    String str7 = hVar.f63717b;
                    if (str7 == null) {
                        str7 = "";
                    }
                    LoginMethodName loginMethodName = LoginMethodName.EMAIL_PASS;
                    String str8 = hVar.f63721f.f63698c;
                    if (str8 == null) {
                        str8 = "";
                    }
                    baseLoginMethod = new AccountPassLoginMethod(str7, loginMethodName, str8, commonUserInfo, Long.valueOf(j2), Long.valueOf(j2), true);
                } else if (num.intValue() == 6) {
                    c.a aVar = hVar.f63721f.f63700e;
                    if (aVar == null || (str = aVar.f63702a) == null) {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        TPUserInfo tPUserInfo = new TPUserInfo(hVar.f63720e, hVar.f63722g);
                        String str9 = hVar.f63717b;
                        if (str9 == null) {
                            str9 = "";
                        }
                        c.a aVar2 = hVar.f63721f.f63700e;
                        if (aVar2 == null || (str2 = aVar2.f63702a) == null) {
                            str2 = "";
                        }
                        baseLoginMethod = new TPLoginMethod(str9, str2, tPUserInfo, false, commonUserInfo, Long.valueOf(j2), Long.valueOf(j2), true);
                    }
                }
            }
            baseLoginMethod.setFromReInstallNet(true);
            baseLoginMethod.setTransToNormal(false);
            f63528b.add(baseLoginMethod);
            if (f63527a) {
                baseLoginMethod.getLoginMethodName();
                baseLoginMethod.getUid();
                new Exception();
            }
        }
        f();
    }

    public static final class c<T> implements Comparator {
        static {
            Covode.recordClassIndex(39158);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            long j2;
            long time;
            long time2;
            T t3 = t2;
            Long lastActiveTime = t3.getLastActiveTime();
            if (lastActiveTime != null) {
                j2 = lastActiveTime.longValue();
            } else {
                j2 = -1;
            }
            if (j2 > 0) {
                Long lastActiveTime2 = t3.getLastActiveTime();
                if (lastActiveTime2 == null) {
                    l.b();
                }
                time = lastActiveTime2.longValue();
            } else {
                time = t3.getExpires().getTime() - 2592000000L;
            }
            Long valueOf = Long.valueOf(time);
            T t4 = t;
            Long lastActiveTime3 = t4.getLastActiveTime();
            if (lastActiveTime3 == null || lastActiveTime3.longValue() <= 0) {
                time2 = t4.getExpires().getTime() - 2592000000L;
            } else {
                Long lastActiveTime4 = t4.getLastActiveTime();
                if (lastActiveTime4 == null) {
                    l.b();
                }
                time2 = lastActiveTime4.longValue();
            }
            return h.b.a.a(valueOf, Long.valueOf(time2));
        }
    }

    public static final void b(String str, long j2) {
        l.d(str, "");
        for (T t : f63528b) {
            if (l.a((Object) t.getUid(), (Object) str)) {
                t.setLastActiveTime(Long.valueOf(j2));
            }
        }
    }

    public static void a(String str, a.C1412a aVar) {
        l.d(str, "");
        l.d(aVar, "");
        boolean z = false;
        for (T t : f63528b) {
            if (l.a((Object) t.getUid(), (Object) str) && (t instanceof PhoneLoginMethod)) {
                z = true;
                t.setPhoneNumber(aVar);
            }
        }
        if (z) {
            f();
        }
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        boolean z = false;
        for (T t : f63528b) {
            if (l.a((Object) t.getUid(), (Object) str) && t.getLoginMethodName() == LoginMethodName.USER_NAME_PASS) {
                z = true;
                Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod");
                t.setName(str2);
            }
        }
        if (z) {
            f();
        }
    }

    public static final void a(String str, long j2, boolean z) {
        Object next;
        long j3;
        l.d(str, "");
        ArrayList arrayList = new ArrayList();
        for (BaseLoginMethod baseLoginMethod : f63528b) {
            if (l.a((Object) baseLoginMethod.getUid(), (Object) str)) {
                arrayList.add(baseLoginMethod);
            }
        }
        if (!z) {
            if (cj.f71084b.k().isOneKeyLoginExprimentEnable()) {
                j3 = 15552000000L;
            } else {
                j3 = 2592000000L;
            }
            j2 += j3;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                Date expires = ((BaseLoginMethod) next).getExpires();
                do {
                    Object next2 = it.next();
                    Date expires2 = ((BaseLoginMethod) next2).getExpires();
                    if (expires.compareTo((Object) expires2) < 0) {
                        next = next2;
                        expires = expires2;
                    }
                } while (it.hasNext());
            }
        }
        BaseLoginMethod baseLoginMethod2 = (BaseLoginMethod) next;
        if (baseLoginMethod2 != null) {
            baseLoginMethod2.setExpires(new Date(j2));
        }
    }
}

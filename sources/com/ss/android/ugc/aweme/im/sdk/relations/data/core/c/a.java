package com.ss.android.ugc.aweme.im.sdk.relations.data.core.c;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.utils.in;
import f.a.ab;
import h.f.b.j;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f103091a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static long f103092b = -1;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$a  reason: collision with other inner class name */
    public final /* synthetic */ class C2613a implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f103093a;

        static {
            Covode.recordClassIndex(66094);
        }

        C2613a(h.f.a.b bVar) {
            this.f103093a = bVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            return this.f103093a.invoke(obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ class b implements Callable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f103094a;

        static {
            Covode.recordClassIndex(66095);
        }

        b(h.f.a.a aVar) {
            this.f103094a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f103094a.invoke();
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(66093);
    }

    private static boolean b() {
        if (in.e()) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f103092b < 30000) {
            return false;
        }
        f103092b = elapsedRealtime;
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class c extends j implements h.f.a.a<List<? extends String>> {
        static {
            Covode.recordClassIndex(66096);
        }

        c(a aVar) {
            super(0, aVar, a.class, "getSecUidListForUpdate", "getSecUidListForUpdate()Ljava/util/List;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<h> a2 = a.C0745a.a().a();
            if (a2.size() > 30) {
                a2 = a2.subList(0, 30);
            }
            for (T t : a2) {
                String b2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.c.b(t);
                if (b2 != null) {
                    arrayList2.add(String.valueOf(com.ss.android.ugc.aweme.im.sdk.common.controller.e.c.a((h) t)));
                    arrayList.add(b2);
                }
            }
            if (arrayList.size() < 30) {
                a.a(arrayList, arrayList2);
            }
            if (arrayList.size() > 30) {
                return arrayList.subList(0, 30);
            }
            return arrayList;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a() {
        /*
            boolean r0 = b()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$c r1 = new com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$c
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a r0 = com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a.f103091a
            r1.<init>(r0)
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$b r0 = new com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$b
            r0.<init>(r1)
            f.a.ab r2 = f.a.ab.a(r0)
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$d r1 = com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a.d.f103095a
            if (r1 == 0) goto L_0x0021
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$a r0 = new com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$a
            r0.<init>(r1)
            r1 = r0
        L_0x0021:
            f.a.d.g r1 = (f.a.d.g) r1
            f.a.ab r1 = r2.c(r1)
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$e r0 = com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a.e.f103096a
            f.a.ab r1 = r1.a(r0)
            f.a.aa r0 = f.a.k.a.f158006c
            f.a.aa r0 = f.a.h.a.b(r0)
            f.a.ab r1 = r1.b(r0)
            f.a.aa r0 = f.a.k.a.f158006c
            f.a.aa r0 = f.a.h.a.b(r0)
            f.a.ab r2 = r1.a(r0)
            java.lang.String r0 = ""
            h.f.b.l.b(r2, r0)
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$f r1 = com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a.f.f103097a
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$g r0 = com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a.g.f103098a
            f.a.j.d.a(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a.a():void");
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<Throwable, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f103097a = new f();

        static {
            Covode.recordClassIndex(66099);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.d(th2, "");
            com.ss.android.ugc.aweme.im.service.m.a.a("RelationModelFilterHelper", th2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final e f103096a = new e();

        static {
            Covode.recordClassIndex(66098);
        }

        e() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            l.d(str, "");
            if (str.length() == 0) {
                ab a2 = ab.a((Throwable) new IllegalStateException("RelationModelFilterHelper: request string is empty"));
                l.b(a2, "");
                return a2;
            }
            ab<ShareStateResponse> shareUserCanSendMsg = com.ss.android.ugc.aweme.im.sdk.common.data.api.a.f102469a.getShareUserCanSendMsg(str);
            l.b(shareUserCanSendMsg, "");
            return shareUserCanSendMsg;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class d extends j implements h.f.a.b<List<String>, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f103095a = new d();

        static {
            Covode.recordClassIndex(66097);
        }

        d() {
            super(1, com.ss.android.ugc.aweme.im.sdk.relations.b.f.class, "builderSecUidString", "builderSecUidString(Ljava/util/List;)Ljava/lang/String;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(List<String> list) {
            List<String> list2 = list;
            if (com.bytedance.common.utility.collection.b.a((Collection) list2)) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (String str : list2) {
                sb.append("\"").append(str).append("\",");
            }
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2)) {
                return "";
            }
            return "[" + sb2.substring(0, sb2.lastIndexOf(",")) + "]";
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<ShareStateResponse, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f103098a = new g();

        static {
            Covode.recordClassIndex(66100);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ShareStateResponse shareStateResponse) {
            ShareStateResponse.a[] aVarArr;
            ShareStateResponse shareStateResponse2 = shareStateResponse;
            if (!(shareStateResponse2 == null || (aVarArr = shareStateResponse2.mShareUserStructs) == null)) {
                ArrayList arrayList = new ArrayList(aVarArr.length);
                for (ShareStateResponse.a aVar : aVarArr) {
                    arrayList.add(aVar.getSecUserId());
                }
                com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
                List<IMUser> a2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a(arrayList, 30, 0);
                if (!a2.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (ShareStateResponse.a aVar2 : aVarArr) {
                        l.b(a2, "");
                        l.b(aVar2, "");
                        a.a(a2, aVar2, sb);
                    }
                    String sb2 = sb.toString();
                    l.b(sb2, "");
                    com.ss.android.ugc.aweme.im.service.m.a.a("RelationModelFilterHelper", sb2);
                    com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
                    com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.c(a2);
                }
            }
            return z.f158842a;
        }
    }

    public static List<IMContact> a(List<? extends IMContact> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t : list) {
            if (t instanceof com.ss.android.ugc.aweme.social.c.a) {
                T t2 = t;
                if (!linkedHashSet.contains(t2.getUid())) {
                    String uid = t2.getUid();
                    l.b(uid, "");
                    linkedHashSet.add(uid);
                    arrayList.add(t);
                }
            } else if (t instanceof IMUser) {
                String uid2 = t.getUid();
                l.b(uid2, "");
                linkedHashSet.add(uid2);
                arrayList.add(t);
            } else {
                arrayList.add(t);
            }
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("RelationModelFilterHelper", "filter MaFIMUser, after list size: " + arrayList.size());
        return arrayList;
    }

    static void a(List<String> list, List<String> list2) {
        String f2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.f();
        com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
        List<IMUser> a2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a(list2, 30, 0, f2);
        l.b(a2, "");
        for (T t : a2) {
            l.b(t, "");
            if (!list.contains(t.getSecUid())) {
                String secUid = t.getSecUid();
                l.b(secUid, "");
                list.add(secUid);
            }
        }
    }

    static f.a.b.b a(List<? extends IMUser> list, ShareStateResponse.a aVar, StringBuilder sb) {
        T t;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (aVar.getSecUserId().equals(t.getSecUid())) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null) {
            return null;
        }
        t2.setShareStatus(aVar.getShareStatus());
        sb.append(t2.getUid() + " shareStatus:" + t2.getShareStatus() + "  ");
        return com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a((IMUser) t2);
    }
}

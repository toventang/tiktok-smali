package com.ss.android.ugc.aweme.shortvideo.z.d;

import android.util.Log;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.cb;
import com.ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.ss.android.ugc.aweme.friends.model.FollowUserListModel;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tools.utils.q;
import h.a.n;
import h.c.f;
import h.f.a.m;
import h.f.b.l;
import h.f.b.z;
import h.r;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.cd;
import kotlinx.coroutines.z;

public final class a {

    /* renamed from: l  reason: collision with root package name */
    public static final b f133085l = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<List<com.ss.android.ugc.aweme.shortvideo.z.a.a>> f133086a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public final t<List<com.ss.android.ugc.aweme.shortvideo.z.a.a>> f133087b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<List<com.ss.android.ugc.aweme.shortvideo.z.a.a>> f133088c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public String f133089d = "";

    /* renamed from: e  reason: collision with root package name */
    public long f133090e = -1;

    /* renamed from: f  reason: collision with root package name */
    public boolean f133091f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f133092g;

    /* renamed from: h  reason: collision with root package name */
    public long f133093h;

    /* renamed from: i  reason: collision with root package name */
    public final z f133094i = cd.a(null);

    /* renamed from: j  reason: collision with root package name */
    public final List<SummonFriendItem> f133095j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.shortvideo.z.a.a> f133096k = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private final CoroutineExceptionHandler f133097m = new C3447a(CoroutineExceptionHandler.f158926c);

    /* access modifiers changed from: package-private */
    public static final class e extends h.c.b.a.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87026);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(0, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.c.b.a.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87032);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, 0, 0, null, this);
        }
    }

    static {
        Covode.recordClassIndex(87021);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(87023);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final boolean a(String str, boolean z) {
        l.d(str, "");
        if (str.length() == 0) {
            return false;
        }
        this.f133089d = str;
        if (!z) {
            this.f133093h = 0;
            this.f133092g = false;
        } else if (!this.f133092g) {
            return false;
        }
        bz unused = kotlinx.coroutines.i.a(a(this), null, null, new j(this, str, z, null), 3);
        return true;
    }

    public static boolean b() {
        if (!cb.a()) {
            return true;
        }
        return false;
    }

    public static boolean a() {
        if (!cb.a()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.d.a$a  reason: collision with other inner class name */
    public static final class C3447a extends h.c.a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(87022);
        }

        public C3447a(f.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(h.c.f fVar, Throwable th) {
            q.a("SharedAR", "load friend list failed, reason: " + Log.getStackTraceString(th));
        }
    }

    private static /* synthetic */ am a(a aVar) {
        return aVar.a(aVar.f133097m);
    }

    private final am a(CoroutineExceptionHandler coroutineExceptionHandler) {
        return an.a(com.ss.android.ugc.asve.editor.d.f62009a.plus(this.f133094i).plus(coroutineExceptionHandler));
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.c.b.a.k implements m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ boolean $isLoadMore;
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, boolean z, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$isLoadMore = z;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new d(this.this$0, this.$isLoadMore, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                a aVar2 = this.this$0;
                long j2 = aVar2.f133090e;
                this.label = 1;
                obj = aVar2.a(j2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<com.ss.android.ugc.aweme.shortvideo.z.a.a> list = (List) obj;
            t<List<com.ss.android.ugc.aweme.shortvideo.z.a.a>> tVar = this.this$0.f133086a;
            if (this.$isLoadMore) {
                ArrayList arrayList = new ArrayList();
                List<com.ss.android.ugc.aweme.shortvideo.z.a.a> value = this.this$0.f133086a.getValue();
                if (value == null) {
                    value = h.a.z.INSTANCE;
                }
                arrayList.addAll(value);
                arrayList.addAll(list);
                list = arrayList;
            }
            tVar.setValue(list);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.c.b.a.k implements m<am, h.c.d<? super SummonFriendList>, Object> {
        final /* synthetic */ long $count;
        final /* synthetic */ long $cursor;
        final /* synthetic */ String $from;
        final /* synthetic */ String $keyword;
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87030);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar, String str, long j2, long j3, String str2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$keyword = str;
            this.$cursor = j2;
            this.$count = j3;
            this.$from = str2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new i(this.this$0, this.$keyword, this.$cursor, this.$count, this.$from, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super SummonFriendList> dVar) {
            return ((i) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            User user;
            if (this.label == 0) {
                r.a(obj);
                SummonFriendList a2 = SummonFriendApi.a(this.$keyword, this.$cursor, this.$count, this.$from);
                l.b(a2, "");
                List<SummonFriendItem> list = a2.items;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (T t : list) {
                        T t2 = t;
                        if (!(t2 == null || (user = t2.mUser) == null)) {
                            if (((a.a() && user.getFollowStatus() == 2) || !a.a()) && ((a.b() && a.a(user)) || !a.b())) {
                                arrayList2.add(t);
                            }
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = h.a.z.INSTANCE;
                }
                return new SummonFriendList(arrayList, a2.cursor, a2.hasMore, a2.keyword);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.c.b.a.k implements m<am, h.c.d<? super List<? extends com.ss.android.ugc.aweme.shortvideo.z.a.a>>, Object> {
        final /* synthetic */ long $prevMaxTime;
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, long j2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$prevMaxTime = j2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new g(this.this$0, this.$prevMaxTime, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super List<? extends com.ss.android.ugc.aweme.shortvideo.z.a.a>> dVar) {
            return ((g) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            int i2;
            if (this.label == 0) {
                r.a(obj);
                if (com.ss.android.ugc.aweme.port.in.g.a().A().g()) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                FollowUserListModel a2 = SummonFriendApi.a(50, this.$prevMaxTime, com.ss.android.ugc.aweme.port.in.g.a().A().c(), com.ss.android.ugc.aweme.port.in.g.a().A().d(), i2);
                if (a2 != null) {
                    this.this$0.f133090e = a2.maxTime;
                    this.this$0.f133091f = a2.hasMore;
                    List<User> list = a2.users;
                    if (list != null) {
                        ArrayList<User> arrayList = new ArrayList();
                        for (T t : list) {
                            T t2 = t;
                            if (t2 != null && (((a.a() && t2.getFollowStatus() == 2) || !a.a()) && ((a.b() && a.a((User) t2)) || !a.b()))) {
                                arrayList.add(t);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (User user : arrayList) {
                            l.b(user, "");
                            arrayList2.add(new com.ss.android.ugc.aweme.shortvideo.z.a.a(user, (byte) 0));
                        }
                        return arrayList2;
                    }
                }
                return h.a.z.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class j extends h.c.b.a.k implements m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ boolean $isLoadMore;
        final /* synthetic */ String $searchKey;
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87031);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar, String str, boolean z, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$searchKey = str;
            this.$isLoadMore = z;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new j(this.this$0, this.$searchKey, this.$isLoadMore, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((j) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                a aVar2 = this.this$0;
                String str = this.$searchKey;
                long j2 = aVar2.f133093h;
                this.label = 1;
                obj = aVar2.a(str, j2, 50, "at_user", this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SummonFriendList summonFriendList = (SummonFriendList) obj;
            if (!l.a((Object) summonFriendList.keyword, (Object) this.this$0.f133089d)) {
                return h.z.f158842a;
            }
            this.this$0.f133092g = summonFriendList.hasMore;
            this.this$0.f133093h = summonFriendList.cursor;
            t<List<com.ss.android.ugc.aweme.shortvideo.z.a.a>> tVar = this.this$0.f133088c;
            if (this.$isLoadMore) {
                arrayList = new ArrayList();
                List<com.ss.android.ugc.aweme.shortvideo.z.a.a> value = this.this$0.f133088c.getValue();
                if (value == null) {
                    value = h.a.z.INSTANCE;
                }
                arrayList.addAll(value);
                List<SummonFriendItem> list = summonFriendList.items;
                l.b(list, "");
                ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
                for (T t : list) {
                    l.b(t, "");
                    User user = t.mUser;
                    l.b(user, "");
                    arrayList2.add(new com.ss.android.ugc.aweme.shortvideo.z.a.a(user, (byte) 0));
                }
                arrayList.addAll(arrayList2);
            } else {
                List<SummonFriendItem> list2 = summonFriendList.items;
                l.b(list2, "");
                arrayList = new ArrayList(n.a((Iterable) list2, 10));
                for (T t2 : list2) {
                    l.b(t2, "");
                    User user2 = t2.mUser;
                    l.b(user2, "");
                    arrayList.add(new com.ss.android.ugc.aweme.shortvideo.z.a.a(user2, (byte) 0));
                }
            }
            tVar.setValue(arrayList);
            return h.z.f158842a;
        }
    }

    public static boolean a(User user) {
        String a2 = com.ss.android.ugc.aweme.port.in.g.a().y().a();
        String region = user.getRegion();
        if (a2 == null || a2.length() == 0 || !l.a((Object) a2, (Object) region)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.c.b.a.k implements m<am, h.c.d<? super List<com.ss.android.ugc.aweme.shortvideo.z.a.a>>, Object> {
        final /* synthetic */ long $prevMaxTime;
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar, long j2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$prevMaxTime = j2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new f(this.this$0, this.$prevMaxTime, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super List<com.ss.android.ugc.aweme.shortvideo.z.a.a>> dVar) {
            return ((f) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c4, code lost:
            if (r10 != null) goto L_0x00c6;
         */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
            // Method dump skipped, instructions count: 270
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.z.d.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.c.b.a.k implements m<am, h.c.d<? super SummonFriendList>, Object> {
        final /* synthetic */ long $count;
        final /* synthetic */ long $cursor;
        final /* synthetic */ String $from;
        final /* synthetic */ String $keyword;
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87029);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, long j2, long j3, String str, String str2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$count = j2;
            this.$cursor = j3;
            this.$keyword = str;
            this.$from = str2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new h(this.this$0, this.$count, this.$cursor, this.$keyword, this.$from, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super SummonFriendList> dVar) {
            return ((h) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            User user;
            if (this.label == 0) {
                r.a(obj);
                ArrayList arrayList2 = new ArrayList();
                List d2 = n.d((Iterable) this.this$0.f133095j, (int) this.$count);
                arrayList2.addAll(d2);
                this.this$0.f133095j.removeAll(d2);
                z.d dVar = new z.d();
                dVar.element = this.$cursor;
                z.a aVar = new z.a();
                aVar.element = this.this$0.f133092g;
                while (((long) arrayList2.size()) < this.$count) {
                    SummonFriendList a2 = SummonFriendApi.a(this.$keyword, dVar.element, this.$count, this.$from);
                    l.b(a2, "");
                    List<SummonFriendItem> list = a2.items;
                    if (list != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (T t : list) {
                            T t2 = t;
                            if (!(t2 == null || (user = t2.mUser) == null)) {
                                if (((a.a() && user.getFollowStatus() == 2) || !a.a()) && ((a.b() && a.a(user)) || !a.b())) {
                                    arrayList3.add(t);
                                }
                            }
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = h.a.z.INSTANCE;
                    }
                    dVar.element = a2.cursor;
                    aVar.element = a2.hasMore;
                    arrayList.size();
                    List d3 = n.d((Iterable) arrayList, ((int) this.$count) - arrayList2.size());
                    arrayList2.addAll(d3);
                    this.this$0.f133095j.addAll(n.d(arrayList, arrayList.size() - d3.size()));
                    if (aVar.element) {
                        if (!l.a((Object) a2.keyword, (Object) this.this$0.f133089d)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.this$0.f133093h = dVar.element;
                this.this$0.f133092g = aVar.element;
                return new SummonFriendList(arrayList2, dVar.element, aVar.element, this.$keyword);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void a(List<com.ss.android.ugc.aweme.shortvideo.z.a.a> list) {
        this.f133087b.setValue(list);
    }

    public static final class c extends h.c.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f133098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f133099b;

        static {
            Covode.recordClassIndex(87024);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(h.c.f fVar, Throwable th) {
            q.a("SharedAR", "load friends data failed, isLoadMore: " + this.f133098a + ", stacktrace: " + Log.getStackTraceString(th));
            h.f.a.b bVar = this.f133099b;
            if (bVar != null) {
                bVar.invoke(false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(f.c cVar, boolean z, h.f.a.b bVar) {
            super(cVar);
            this.f133098a = z;
            this.f133099b = bVar;
        }
    }

    private void a(boolean z, h.f.a.b<? super Boolean, h.z> bVar) {
        if (!z) {
            this.f133090e = System.currentTimeMillis() / 1000;
            this.f133091f = false;
        } else if (!this.f133091f) {
            if (bVar != null) {
                bVar.invoke(false);
                return;
            }
            return;
        }
        bz unused = kotlinx.coroutines.i.a(a(new c(CoroutineExceptionHandler.f158926c, z, bVar)), null, null, new d(this, z, null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r7, h.c.d<? super java.util.List<com.ss.android.ugc.aweme.shortvideo.z.a.a>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.ss.android.ugc.aweme.shortvideo.z.d.a.e
            if (r0 == 0) goto L_0x004f
            r5 = r9
            com.ss.android.ugc.aweme.shortvideo.z.d.a$e r5 = (com.ss.android.ugc.aweme.shortvideo.z.d.a.e) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004f
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L_0x0013:
            java.lang.Object r2 = r5.result
            h.c.a.a r4 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 == r1) goto L_0x005d
            if (r0 != r3) goto L_0x0055
            h.r.a(r2)
        L_0x0024:
            return r2
        L_0x0025:
            h.r.a(r2)
            boolean r0 = com.ss.android.ugc.aweme.experiment.cb.a()
            r2 = 0
            if (r0 != 0) goto L_0x003f
            r5.label = r1
            kotlinx.coroutines.ah r1 = kotlinx.coroutines.bf.f159041b
            com.ss.android.ugc.aweme.shortvideo.z.d.a$f r0 = new com.ss.android.ugc.aweme.shortvideo.z.d.a$f
            r0.<init>(r6, r7, r2)
            java.lang.Object r2 = kotlinx.coroutines.i.a(r1, r0, r5)
            if (r2 != r4) goto L_0x0060
            return r4
        L_0x003f:
            r5.label = r3
            kotlinx.coroutines.ah r1 = kotlinx.coroutines.bf.f159041b
            com.ss.android.ugc.aweme.shortvideo.z.d.a$g r0 = new com.ss.android.ugc.aweme.shortvideo.z.d.a$g
            r0.<init>(r6, r7, r2)
            java.lang.Object r2 = kotlinx.coroutines.i.a(r1, r0, r5)
            if (r2 != r4) goto L_0x0024
            return r4
        L_0x004f:
            com.ss.android.ugc.aweme.shortvideo.z.d.a$e r5 = new com.ss.android.ugc.aweme.shortvideo.z.d.a$e
            r5.<init>(r6, r9)
            goto L_0x0013
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L_0x005d:
            h.r.a(r2)
        L_0x0060:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.z.d.a.a(long, h.c.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.z.d.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(a aVar, boolean z, h.f.a.b bVar, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            bVar = null;
        }
        aVar.a(z, bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r25, long r26, long r28, java.lang.String r30, h.c.d<? super com.ss.android.ugc.aweme.friends.model.SummonFriendList> r31) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.z.d.a.a(java.lang.String, long, long, java.lang.String, h.c.d):java.lang.Object");
    }
}

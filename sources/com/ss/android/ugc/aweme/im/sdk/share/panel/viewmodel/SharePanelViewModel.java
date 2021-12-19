package com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n;
import com.ss.android.ugc.aweme.im.sdk.relations.data.b.c;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl;
import h.c.b.a.k;
import h.c.f;
import h.f.b.l;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ah;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.cu;

public final class SharePanelViewModel implements com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d<IMContact>, com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d {

    /* renamed from: j */
    public static final a f103593j = new a((byte) 0);

    /* renamed from: a */
    public boolean f103594a;

    /* renamed from: b */
    public boolean f103595b;

    /* renamed from: c */
    public boolean f103596c;

    /* renamed from: d */
    public SharePackage f103597d;

    /* renamed from: e */
    public a f103598e;

    /* renamed from: f */
    public final ah f103599f;

    /* renamed from: g */
    public final com.ss.android.ugc.aweme.social.widget.b.a f103600g;

    /* renamed from: h */
    public final n f103601h;

    /* renamed from: i */
    public final Set<String> f103602i;

    /* renamed from: k */
    private final h.h f103603k;

    /* renamed from: l */
    private final h.h f103604l;

    /* renamed from: m */
    private final h.h f103605m;
    private final h.h n;
    private final am o;
    private final List<com.ss.android.ugc.aweme.im.service.model.f> p;
    private final com.ss.android.ugc.aweme.im.sdk.relations.data.core.a q;
    private final ah r;

    static {
        Covode.recordClassIndex(66369);
    }

    public final List<IMContact> a() {
        return (List) this.f103603k.getValue();
    }

    public final Set<IMContact> b() {
        return (Set) this.f103604l.getValue();
    }

    public final Set<String> c() {
        return (Set) this.f103605m.getValue();
    }

    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66370);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$a$a */
        public static final class C2636a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.im.sdk.relations.data.core.f> {
            final /* synthetic */ int $limit;
            final /* synthetic */ SharePackage $sharePackage;
            final /* synthetic */ c.b $shareWidgetType;

            static {
                Covode.recordClassIndex(66371);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2636a(SharePackage sharePackage, c.b bVar, int i2) {
                super(0);
                this.$sharePackage = sharePackage;
                this.$shareWidgetType = bVar;
                this.$limit = i2;
            }

            @Override // h.f.a.a
            public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.relations.data.core.f invoke() {
                String str;
                com.ss.android.ugc.aweme.im.service.e b2;
                com.ss.android.ugc.aweme.im.service.d familiarProxy;
                com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar = new com.ss.android.ugc.aweme.im.sdk.relations.data.b.c(1, com.ss.android.ugc.aweme.im.sdk.common.controller.utils.h.a(this.$sharePackage));
                SharePackage sharePackage = this.$sharePackage;
                String str2 = null;
                if (sharePackage != null) {
                    str = sharePackage.f124590d;
                } else {
                    str = null;
                }
                boolean a2 = l.a((Object) str, (Object) "aweme");
                boolean z = false;
                if (a2 && (b2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b()) != null && (familiarProxy = b2.getFamiliarProxy()) != null && familiarProxy.a()) {
                    z = true;
                }
                cVar.f102985f = z;
                cVar.f102990k = this.$shareWidgetType;
                SharePackage sharePackage2 = this.$sharePackage;
                if (sharePackage2 != null) {
                    str2 = sharePackage2.f124590d;
                }
                cVar.f102981b = str2;
                cVar.f102980a = true;
                return new com.ss.android.ugc.aweme.im.sdk.relations.data.core.f(cVar, this.$limit);
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static SharePanelViewModel a(SharePackage sharePackage, a aVar, List<com.ss.android.ugc.aweme.im.service.model.f> list, c.b bVar, int i2) {
            l.d(list, "");
            l.d(bVar, "");
            return new SharePanelViewModel(sharePackage, aVar, list, (com.ss.android.ugc.aweme.im.sdk.relations.data.core.a) h.i.a((h.f.a.a) new C2636a(sharePackage, bVar, i2)).getValue());
        }

        public static /* synthetic */ SharePanelViewModel a(SharePackage sharePackage, a aVar, List list, c.b bVar, int i2, int i3) {
            if ((i3 & 8) != 0) {
                bVar = c.b.NORMAL;
            }
            if ((i3 & 16) != 0) {
                i2 = 15;
            }
            return a(sharePackage, aVar, list, bVar, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.a<List<IMContact>> {

        /* renamed from: a */
        public static final b f103606a = new b();

        static {
            Covode.recordClassIndex(66372);
        }

        b() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ List<IMContact> invoke() {
            return new ArrayList();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.a<Set<String>> {

        /* renamed from: a */
        public static final d f103608a = new d();

        static {
            Covode.recordClassIndex(66374);
        }

        d() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.a<Set<String>> {

        /* renamed from: a */
        public static final e f103609a = new e();

        static {
            Covode.recordClassIndex(66375);
        }

        e() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.a<Set<IMContact>> {

        /* renamed from: a */
        public static final h f103610a = new h();

        static {
            Covode.recordClassIndex(66379);
        }

        h() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Set<IMContact> invoke() {
            return new LinkedHashSet();
        }
    }

    public final void d() {
        this.q.a(this);
        this.q.g();
    }

    public final void onDestroy() {
        an.b(this.o);
        this.q.d();
        this.f103598e = null;
        this.f103597d = null;
    }

    public final Set<IMContact> e() {
        Set<IMContact> b2 = b();
        ArrayList arrayList = new ArrayList();
        for (T t : b2) {
            if (!(t instanceof com.ss.android.ugc.aweme.social.c.a)) {
                arrayList.add(t);
            }
        }
        return h.a.n.m(arrayList);
    }

    public final boolean f() {
        Bundle bundle;
        String str;
        int hashCode;
        boolean z;
        boolean z2;
        SharePackage sharePackage = this.f103597d;
        Integer num = null;
        if (sharePackage != null) {
            bundle = sharePackage.f124595i;
        } else {
            bundle = null;
        }
        boolean a2 = com.ss.android.ugc.aweme.upvote.b.a.a();
        if (bundle != null) {
            str = bundle.getString("enter_from");
        } else {
            str = null;
        }
        if (str != null && ((hashCode = str.hashCode()) == -1572049565 ? str.equals("notification_page") : !(hashCode != 1691937916 || !str.equals("homepage_hot")))) {
            String string = bundle.getString("aid");
            if (string == null) {
                string = "";
            }
            l.b(string, "");
            num = UpvoteServiceImpl.d().b(string);
        } else if (bundle != null) {
            num = Integer.valueOf(bundle.getInt("upvote_permission", 1));
        }
        if (num != null && num.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (bundle == null || bundle.getInt("aweme_type") != 40) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!a2 || !z || z2) {
            return false;
        }
        return true;
    }

    public static final class f extends h.c.a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(66376);
        }

        public f(f.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(h.c.f fVar, Throwable th) {
            com.ss.android.ugc.aweme.im.service.m.a.c("SharePanelViewModel", "Error loading recommended user ".concat(String.valueOf(th)));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void c(Throwable th) {
        l.d(th, "");
        l.d(th, "");
    }

    public final void a(IMContact iMContact) {
        l.d(iMContact, "");
        a aVar = this.f103598e;
        if (aVar != null) {
            aVar.a(iMContact);
        }
    }

    public static final class g extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ SharePanelViewModel this$0;

        static {
            Covode.recordClassIndex(66377);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SharePanelViewModel sharePanelViewModel, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = sharePanelViewModel;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            g gVar = new g(this.this$0, dVar);
            gVar.L$0 = obj;
            return gVar;
        }

        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((g) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        public static final class a extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
            final /* synthetic */ List $it;
            final /* synthetic */ am $this_launch$inlined;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(66378);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list, h.c.d dVar, g gVar, am amVar) {
                super(2, dVar);
                this.$it = list;
                this.this$0 = gVar;
                this.$this_launch$inlined = amVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                a aVar = new a(this.$it, dVar, this.this$0, this.$this_launch$inlined);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r.a(obj);
                    h.c.f a2 = ((am) this.L$0).a();
                    bz bzVar = (bz) a2.get(bz.f159061c);
                    if (bzVar == null) {
                        throw new IllegalStateException("Context cannot be checked for liveness because it does not have a job: ".concat(String.valueOf(a2)).toString());
                    } else if (bzVar.b()) {
                        a aVar = this.this$0.this$0.f103598e;
                        if (aVar != null) {
                            aVar.b(this.$it);
                        }
                        return z.f158842a;
                    } else {
                        throw bzVar.m();
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            am amVar;
            com.ss.android.ugc.aweme.social.widget.b.a aVar;
            h.c.a.a aVar2 = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                amVar = (am) this.L$0;
                aVar = this.this$0.f103600g;
                if (aVar != null) {
                    if (aVar.b() == -1 || aVar.b() >= 1800000) {
                        this.L$0 = amVar;
                        this.L$1 = aVar;
                        this.label = 1;
                        if (aVar.a(this) == aVar2) {
                            return aVar2;
                        }
                    }
                }
                return z.f158842a;
            } else if (i2 == 1) {
                aVar = (com.ss.android.ugc.aweme.social.widget.b.a) this.L$1;
                amVar = (am) this.L$0;
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<User> a2 = aVar.a();
            ArrayList arrayList = new ArrayList();
            for (T t : a2) {
                if (this.this$0.f103601h.a(t.getUid()) < com.ss.android.ugc.aweme.im.service.c.i.f103853a) {
                    arrayList.add(t);
                }
            }
            List<User> d2 = h.a.n.d((Iterable) arrayList, 15 - this.this$0.a().size());
            ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) d2, 10));
            for (User user : d2) {
                arrayList2.add(com.ss.android.ugc.aweme.social.c.b.a(user));
            }
            ArrayList arrayList3 = arrayList2;
            this.this$0.a().addAll(arrayList3);
            bz unused = kotlinx.coroutines.i.a(amVar, this.this$0.f103599f, null, new a(arrayList3, null, this, amVar), 2);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void a(Throwable th) {
        l.d(th, "");
        com.ss.android.ugc.aweme.im.service.m.a.e("SharePanelViewModel", "onLoadError: ".concat(String.valueOf(th)));
        a().clear();
        a aVar = this.f103598e;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public static final class c<T> implements Comparator {

        /* renamed from: a */
        public static final c f103607a = new c();

        static {
            Covode.recordClassIndex(66373);
        }

        c() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((com.ss.android.ugc.aweme.social.c.a) obj).getSortIndex() - ((com.ss.android.ugc.aweme.social.c.a) obj2).getSortIndex();
        }
    }

    public static void a(com.ss.android.ugc.aweme.social.c.a aVar, boolean z) {
        String str;
        l.d(aVar, "");
        if (z) {
            str = "click";
        } else {
            str = "cancel";
        }
        String uid = aVar.getUid();
        l.b(uid, "");
        com.ss.android.ugc.aweme.im.sdk.share.a.a.a("horizontal", str, uid);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void b(List<IMContact> list, boolean z) {
        l.d(list, "");
        l.d(list, "");
    }

    public final boolean a(IMContact iMContact, boolean z) {
        l.d(iMContact, "");
        a aVar = this.f103598e;
        if (aVar != null) {
            return aVar.a(iMContact, z);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void a(List<IMContact> list, boolean z) {
        String str;
        String str2;
        Bundle bundle;
        l.d(list, "");
        com.ss.android.ugc.aweme.im.service.m.a.c("SharePanelViewModel", "onLoadSuccess start: " + list.size() + ' ' + this.p.size());
        try {
            a().clear();
            a().addAll(this.p);
            com.ss.android.ugc.aweme.im.service.m.a.c("SharePanelViewModel", "onLoadSuccess after add batch: " + a().size());
            com.ss.android.ugc.aweme.im.service.m.a.c("SharePanelViewModel", "onLoadSuccess groupchat holdout: " + com.ss.android.ugc.aweme.im.service.c.c.a());
            if (!com.ss.android.ugc.aweme.im.service.c.c.a()) {
                a().addAll(list);
            } else {
                a().addAll(com.ss.android.ugc.aweme.im.sdk.common.controller.utils.i.a(list));
            }
            SharePackage sharePackage = this.f103597d;
            if (sharePackage != null) {
                str = sharePackage.f124590d;
            } else {
                str = null;
            }
            if (l.a((Object) str, (Object) UGCMonitor.EVENT_COMMENT)) {
                SharePackage sharePackage2 = this.f103597d;
                if (sharePackage2 == null || (bundle = sharePackage2.f124595i) == null) {
                    str2 = null;
                } else {
                    str2 = bundle.getString("comment_author_id");
                }
                Iterator<IMContact> it = a().iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    IMContact next = it.next();
                    if ((next instanceof IMUser) && l.a((Object) ((IMUser) next).getUid(), (Object) str2)) {
                        break;
                    }
                    i2++;
                }
                Integer valueOf = Integer.valueOf(i2);
                if (!(valueOf.intValue() == -1 || valueOf == null)) {
                    a().add(0, a().remove(valueOf.intValue()));
                }
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.im.service.m.a.a(e2);
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("SharePanelViewModel", "onLoadSuccess finish: " + a().size());
        a aVar = this.f103598e;
        if (aVar != null) {
            aVar.a(a());
        }
        int size = a().size();
        if (1 <= size && 15 > size && com.ss.android.ugc.aweme.im.service.c.i.a()) {
            bz unused = kotlinx.coroutines.i.a(this.o, this.r.plus(new f(CoroutineExceptionHandler.f158926c)), null, new g(this, null), 2);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SharePanelViewModel(com.ss.android.ugc.aweme.sharer.ui.SharePackage r11, com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a r12, java.util.List r13, com.ss.android.ugc.aweme.im.sdk.relations.data.core.a r14) {
        /*
            r10 = this;
            kotlinx.coroutines.android.b r5 = com.ss.android.ugc.aweme.af.a.f66269a
            kotlinx.coroutines.ah r6 = kotlinx.coroutines.bf.f159041b
            com.bytedance.provider.impl.c r0 = com.bytedance.provider.impl.c.f42017b
            com.bytedance.provider.g r2 = r0.a()
            java.lang.Class<com.ss.android.ugc.aweme.social.widget.b.a> r1 = com.ss.android.ugc.aweme.social.widget.b.a.class
            java.lang.String r0 = "source_default_key"
            com.bytedance.provider.b r0 = r2.a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bytedance.provider.h r7 = r0.a()
            com.ss.android.ugc.aweme.social.widget.b.a r7 = (com.ss.android.ugc.aweme.social.widget.b.a) r7
        L_0x001a:
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n r8 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n.a()
            java.lang.String r0 = ""
            h.f.b.l.b(r8, r0)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0031:
            r7 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel.<init>(com.ss.android.ugc.aweme.sharer.ui.SharePackage, com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a, java.util.List, com.ss.android.ugc.aweme.im.sdk.relations.data.core.a):void");
    }

    private SharePanelViewModel(SharePackage sharePackage, a aVar, List<com.ss.android.ugc.aweme.im.service.model.f> list, com.ss.android.ugc.aweme.im.sdk.relations.data.core.a aVar2, ah ahVar, ah ahVar2, com.ss.android.ugc.aweme.social.widget.b.a aVar3, n nVar, Set<String> set) {
        l.d(list, "");
        l.d(aVar2, "");
        l.d(ahVar, "");
        l.d(ahVar2, "");
        l.d(nVar, "");
        l.d(set, "");
        this.f103597d = sharePackage;
        this.f103598e = aVar;
        this.p = list;
        this.q = aVar2;
        this.f103599f = ahVar;
        this.r = ahVar2;
        this.f103600g = aVar3;
        this.f103601h = nVar;
        this.f103602i = set;
        this.f103603k = h.i.a((h.f.a.a) b.f103606a);
        this.f103604l = h.i.a((h.f.a.a) h.f103610a);
        this.f103605m = h.i.a((h.f.a.a) d.f103608a);
        this.n = h.i.a((h.f.a.a) e.f103609a);
        this.o = an.a(cu.a().plus(ahVar));
    }
}

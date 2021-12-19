package com.ss.android.ugc.aweme.notification.vm;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.vm.a.e;
import h.a.n;
import h.a.z;
import h.f.b.m;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f114226c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.notification.vm.a.f f114227a;

    /* renamed from: b  reason: collision with root package name */
    public final int f114228b;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f114229d = h.i.a((h.f.a.a) h.f114244a);

    /* renamed from: e  reason: collision with root package name */
    private final h.h f114230e = h.i.a((h.f.a.a) l.f114252a);

    /* renamed from: f  reason: collision with root package name */
    private final h.h f114231f = h.i.a((h.f.a.a) j.f114248a);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f114232g = h.i.a((h.f.a.a) g.f114243a);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f114233h = h.i.a((h.f.a.a) d.f114240a);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f114234i = h.i.a((h.f.a.a) e.f114241a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f114235j = h.i.a((h.f.a.a) f.f114242a);

    static {
        Covode.recordClassIndex(73439);
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<List<MusNotice>> a() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f114229d.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.notification.bean.i> b() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f114230e.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.notification.bean.i> c() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f114231f.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> e() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f114232g.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<p<MusNotice, com.ss.android.ugc.aweme.notification.bean.b>> f() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f114233h.getValue();
    }

    public final f.a.b.a g() {
        return (f.a.b.a) this.f114234i.getValue();
    }

    /* access modifiers changed from: protected */
    public final CopyOnWriteArraySet<String> h() {
        return (CopyOnWriteArraySet) this.f114235j.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73440);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<p<? extends MusNotice, ? extends com.ss.android.ugc.aweme.notification.bean.b>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f114240a = new d();

        static {
            Covode.recordClassIndex(73443);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<p<? extends MusNotice, ? extends com.ss.android.ugc.aweme.notification.bean.b>> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class e extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f114241a = new e();

        static {
            Covode.recordClassIndex(73444);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    static final class f extends m implements h.f.a.a<CopyOnWriteArraySet<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f114242a = new f();

        static {
            Covode.recordClassIndex(73445);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyOnWriteArraySet<String> invoke() {
            return new CopyOnWriteArraySet();
        }
    }

    static final class g extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f114243a = new g();

        static {
            Covode.recordClassIndex(73446);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class h extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<List<? extends MusNotice>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f114244a = new h();

        static {
            Covode.recordClassIndex(73447);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<List<? extends MusNotice>> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class j extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.notification.bean.i>> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f114248a = new j();

        static {
            Covode.recordClassIndex(73452);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.notification.bean.i> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class l extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.notification.bean.i>> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f114252a = new l();

        static {
            Covode.recordClassIndex(73457);
        }

        l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.notification.bean.i> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    private static boolean k() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean i() {
        return a(new k(this));
    }

    public boolean j() {
        return a(new i(this));
    }

    public final boolean d() {
        if (b().getValue() == com.ss.android.ugc.aweme.notification.bean.i.LOADING || c().getValue() == com.ss.android.ugc.aweme.notification.bean.i.LOADING) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class k extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(73453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (this.this$0.d()) {
                com.ss.android.ugc.aweme.common.f.c("NotificationModel", "refresh but loading now");
                z = false;
            } else {
                com.ss.android.ugc.aweme.common.f.b("NotificationModel", "refresh start");
                com.ss.android.ugc.aweme.notification.b.a.a(this.this$0.b(), com.ss.android.ugc.aweme.notification.bean.i.LOADING);
                f.a.b.b a2 = this.this$0.f114227a.b().d(new f.a.d.g(this) {
                    /* class com.ss.android.ugc.aweme.notification.vm.c.k.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ k f114249a;

                    static {
                        Covode.recordClassIndex(73454);
                    }

                    {
                        this.f114249a = r1;
                    }

                    @Override // f.a.d.g
                    public final /* synthetic */ Object apply(Object obj) {
                        e.b bVar = (e.b) obj;
                        h.f.b.l.d(bVar, "");
                        return new e.b(bVar.f114139a, this.f114249a.this$0.a(n.g((Collection) bVar.f114140b)), bVar.f114141c);
                    }
                }).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.notification.vm.c.k.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ k f114250a;

                    static {
                        Covode.recordClassIndex(73455);
                    }

                    {
                        this.f114250a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        com.ss.android.ugc.aweme.notification.bean.i iVar;
                        e.b bVar = (e.b) obj;
                        com.ss.android.ugc.aweme.common.f.b("NotificationModel", "refresh end:" + bVar.f114140b.size() + ", " + bVar.f114139a.d());
                        this.f114250a.this$0.e().setValue(Boolean.valueOf(bVar.f114139a.d()));
                        this.f114250a.this$0.a().setValue(bVar.f114140b);
                        com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.notification.bean.i> b2 = this.f114250a.this$0.b();
                        if (!bVar.f114140b.isEmpty() || bVar.f114141c == null) {
                            iVar = com.ss.android.ugc.aweme.notification.bean.i.SUCCESS;
                        } else {
                            iVar = com.ss.android.ugc.aweme.notification.bean.i.ERROR;
                        }
                        b2.setValue(iVar);
                    }
                }, new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.notification.vm.c.k.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ k f114251a;

                    static {
                        Covode.recordClassIndex(73456);
                    }

                    {
                        this.f114251a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        com.ss.android.ugc.aweme.common.f.c("NotificationModel", "refresh error:" + ((Throwable) obj).getMessage());
                        this.f114251a.this$0.b().setValue(com.ss.android.ugc.aweme.notification.bean.i.ERROR);
                    }
                });
                h.f.b.l.b(a2, "");
                f.a.j.a.a(a2, this.this$0.g());
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(73448);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (this.this$0.d() || (!h.f.b.l.a((Object) this.this$0.e().getValue(), (Object) true))) {
                com.ss.android.ugc.aweme.common.f.c("NotificationModel", "loadMore blocked by:" + this.this$0.d() + ", " + this.this$0.e().getValue());
                z = false;
            } else {
                com.ss.android.ugc.aweme.common.f.b("NotificationModel", "loadMore start");
                com.ss.android.ugc.aweme.notification.b.a.a(this.this$0.c(), com.ss.android.ugc.aweme.notification.bean.i.LOADING);
                f.a.b.b a2 = this.this$0.f114227a.c().d(new f.a.d.g(this) {
                    /* class com.ss.android.ugc.aweme.notification.vm.c.i.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ i f114245a;

                    static {
                        Covode.recordClassIndex(73449);
                    }

                    {
                        this.f114245a = r1;
                    }

                    @Override // f.a.d.g
                    public final /* synthetic */ Object apply(Object obj) {
                        e.b bVar = (e.b) obj;
                        h.f.b.l.d(bVar, "");
                        return new e.b(bVar.f114139a, this.f114245a.this$0.a(n.g((Collection) bVar.f114140b)));
                    }
                }).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.notification.vm.c.i.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ i f114246a;

                    static {
                        Covode.recordClassIndex(73450);
                    }

                    {
                        this.f114246a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        e.b bVar = (e.b) obj;
                        com.ss.android.ugc.aweme.common.f.b("NotificationModel", "loadMore end:" + bVar.f114140b.size() + ", " + bVar.f114139a.d());
                        this.f114246a.this$0.e().setValue(Boolean.valueOf(bVar.f114139a.d()));
                        this.f114246a.this$0.a().setValue(bVar.f114140b);
                        this.f114246a.this$0.c().setValue(com.ss.android.ugc.aweme.notification.bean.i.SUCCESS);
                    }
                }, new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.notification.vm.c.i.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ i f114247a;

                    static {
                        Covode.recordClassIndex(73451);
                    }

                    {
                        this.f114247a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        com.ss.android.ugc.aweme.common.f.c("NotificationModel", "loadMore error:" + ((Throwable) obj).getMessage());
                        this.f114247a.this$0.c().setValue(com.ss.android.ugc.aweme.notification.bean.i.ERROR);
                    }
                });
                h.f.b.l.b(a2, "");
                f.a.j.a.a(a2, this.this$0.g());
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f114236a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusNotice f114237b;

        static {
            Covode.recordClassIndex(73441);
        }

        b(c cVar, MusNotice musNotice) {
            this.f114236a = cVar;
            this.f114237b = musNotice;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f114236a.f().setValue(v.a(this.f114237b, com.ss.android.ugc.aweme.notification.bean.b.SUCCESS));
            com.ss.android.ugc.aweme.notification.utils.e.a(this.f114237b, (BaseResponse) obj, (Throwable) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.c$c  reason: collision with other inner class name */
    public static final class C2925c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f114238a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusNotice f114239b;

        static {
            Covode.recordClassIndex(73442);
        }

        C2925c(c cVar, MusNotice musNotice) {
            this.f114238a = cVar;
            this.f114239b = musNotice;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            com.ss.android.ugc.aweme.common.f.a("NotificationModel", "deleteData error", th);
            this.f114238a.f().setValue(v.a(this.f114239b, com.ss.android.ugc.aweme.notification.bean.b.REQ_ERR));
            com.ss.android.ugc.aweme.notification.utils.e.a(this.f114239b, (BaseResponse) null, th);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(h.f.a.a<Boolean> aVar) {
        h.f.b.l.d(aVar, "");
        if (!com.ss.android.ugc.aweme.notification.utils.l.a()) {
            return aVar.invoke().booleanValue();
        }
        com.ss.android.ugc.aweme.common.f.c("NotificationModel", "load but children mode");
        com.ss.android.ugc.aweme.notification.b.a.a(a(), z.INSTANCE);
        return false;
    }

    public c(int i2) {
        this.f114228b = i2;
        this.f114227a = new com.ss.android.ugc.aweme.notification.vm.a.f(i2);
    }

    public final void a(int i2) {
        Integer num;
        List<MusNotice> value = a().getValue();
        if (value != null && !value.isEmpty()) {
            int size = value.size();
            if (i2 >= 0 && size > i2) {
                a(value.get(i2));
                return;
            }
        }
        StringBuilder append = new StringBuilder("deleteData but position invalid:").append(i2).append(", ");
        if (value != null) {
            num = Integer.valueOf(value.size());
        } else {
            num = null;
        }
        com.ss.android.ugc.aweme.common.f.c("NotificationModel", append.append(num).toString());
    }

    /* access modifiers changed from: protected */
    public final List<MusNotice> a(List<MusNotice> list) {
        boolean z;
        h.f.b.l.d(list, "");
        ListIterator<MusNotice> listIterator = list.listIterator();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (listIterator.hasNext()) {
            MusNotice next = listIterator.next();
            if (h().contains(next.nid)) {
                listIterator.remove();
            } else {
                MusNotice musNotice = (MusNotice) linkedHashMap.get(Long.valueOf(next.getUniqueId()));
                if (musNotice != null) {
                    StringBuilder append = new StringBuilder("filterData find: ").append(next.getUniqueId()).append(", [").append(next.type).append(", ").append(musNotice.type).append("], [").append(h.f.b.l.a(next, musNotice)).append(", ");
                    if (next == musNotice) {
                        z = true;
                    } else {
                        z = false;
                    }
                    com.ss.android.ugc.aweme.common.f.c("NotificationModel", append.append(z).append(']').toString());
                    if (h.f.b.l.a(next, musNotice)) {
                        listIterator.remove();
                    } else {
                        next.hackUniqueId(next.getUniqueId() + 1);
                    }
                }
                linkedHashMap.put(Long.valueOf(next.getUniqueId()), next);
            }
        }
        return list;
    }

    public void a(MusNotice musNotice) {
        h.f.b.l.d(musNotice, "");
        if (musNotice.isMock()) {
            com.ss.android.ugc.aweme.common.f.c("NotificationModel", "cannot delete a mock notice:" + musNotice.type + ", " + musNotice.nid);
            return;
        }
        com.bytedance.ies.ugc.appcontext.d.a();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = k();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
            com.ss.android.ugc.aweme.common.f.c("NotificationModel", "deleteData net unavailable");
            f().setValue(v.a(musNotice, com.ss.android.ugc.aweme.notification.bean.b.NET_ERR));
            return;
        }
        com.ss.android.ugc.aweme.common.f.b("NotificationModel", "deleteData start:" + musNotice.type + ", " + musNotice.nid);
        h().add(musNotice.nid);
        List<MusNotice> value = a().getValue();
        if (value != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : value) {
                if (!h.f.b.l.a((Object) ((MusNotice) t).nid, (Object) musNotice.nid)) {
                    arrayList.add(t);
                }
            }
            a().setValue(arrayList);
        }
        if (musNotice.type == 225) {
            com.ss.android.ugc.aweme.notification.utils.e.a(musNotice);
        }
        f.a.b.b a2 = NotificationApi.a().deleteNotice(musNotice.nid).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this, musNotice), new C2925c(this, musNotice));
        h.f.b.l.b(a2, "");
        f.a.j.a.a(a2, g());
    }
}

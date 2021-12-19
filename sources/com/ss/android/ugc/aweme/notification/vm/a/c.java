package com.ss.android.ugc.aweme.notification.vm.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.ac;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.notification.vm.a.e;
import f.a.ab;
import f.a.ae;
import f.a.t;
import f.a.v;
import f.a.w;
import f.a.x;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class c implements e<Object, com.ss.android.ugc.aweme.notification.vm.a> {

    /* renamed from: a  reason: collision with root package name */
    public final List<Friend> f114115a = new ArrayList();

    static {
        Covode.recordClassIndex(73373);
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final t<e.b<com.ss.android.ugc.aweme.notification.vm.a>> c() {
        return e.a.a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final /* synthetic */ com.ss.android.ugc.aweme.notification.vm.a a() {
        return new com.ss.android.ugc.aweme.notification.vm.a(null, this.f114115a, 1);
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final t<e.b<com.ss.android.ugc.aweme.notification.vm.a>> b() {
        if (!com.ss.android.ugc.aweme.inbox.b.a.a() || (!this.f114115a.isEmpty())) {
            t<e.b<com.ss.android.ugc.aweme.notification.vm.a>> a2 = t.a(new a(this));
            l.b(a2, "");
            return a2;
        }
        t<e.b<com.ss.android.ugc.aweme.notification.vm.a>> a3 = t.a(new b(this));
        l.b(a3, "");
        return a3;
    }

    public final /* synthetic */ e.b a(Object obj) {
        l.d(obj, "");
        return e.a.a(this, obj);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f114116a;

        static {
            Covode.recordClassIndex(73374);
        }

        a(c cVar) {
            this.f114116a = cVar;
        }

        @Override // f.a.w
        public final void subscribe(v<e.b<com.ss.android.ugc.aweme.notification.vm.a>> vVar) {
            l.d(vVar, "");
            ac.a(vVar, this.f114116a.a(new com.ss.android.ugc.aweme.notification.vm.a(null, this.f114116a.f114115a, 1)));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f114117a;

        static {
            Covode.recordClassIndex(73375);
        }

        b(c cVar) {
            this.f114117a = cVar;
        }

        @Override // f.a.w
        public final void subscribe(final v<e.b<com.ss.android.ugc.aweme.notification.vm.a>> vVar) {
            l.d(vVar, "");
            ab.a((x) com.ss.android.ugc.aweme.friends.service.a.f97047a.c(5)).b(f.a.h.a.b(f.a.k.a.f158006c)).c(AnonymousClass1.f114118a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new ae<List<? extends Friend>>(this) {
                /* class com.ss.android.ugc.aweme.notification.vm.a.c.b.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f114119a;

                static {
                    Covode.recordClassIndex(73377);
                }

                @Override // f.a.ae
                public final void onSubscribe(f.a.b.b bVar) {
                    l.d(bVar, "");
                }

                @Override // f.a.ae
                public final void onError(Throwable th) {
                    l.d(th, "");
                    v vVar = vVar;
                    l.b(vVar, "");
                    ac.a(vVar, th);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.ae
                public final /* synthetic */ void onSuccess(List<? extends Friend> list) {
                    List<? extends Friend> list2 = list;
                    l.d(list2, "");
                    this.f114119a.f114117a.f114115a.addAll(list2);
                    v vVar = vVar;
                    l.b(vVar, "");
                    ac.a(vVar, this.f114119a.f114117a.a(new com.ss.android.ugc.aweme.notification.vm.a(null, list2, 1)));
                }

                {
                    this.f114119a = r1;
                }
            });
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.notification.vm.a.e$b' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Throwable] */
    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final /* synthetic */ e.b<com.ss.android.ugc.aweme.notification.vm.a> a(com.ss.android.ugc.aweme.notification.vm.a aVar, Throwable th) {
        l.d(aVar, "");
        return e.a.a(this, aVar, th);
    }
}

package com.ss.android.ugc.aweme.im.sdk.relations.data.core;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import f.a.ab;
import f.a.ad;
import f.a.af;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.m.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class h extends a {

    /* renamed from: e  reason: collision with root package name */
    private String f103156e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f103157f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f103158g = i.a((h.f.a.a) a.f103161a);

    /* renamed from: k  reason: collision with root package name */
    public d f103159k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f103160l;

    static {
        Covode.recordClassIndex(66148);
    }

    private final f.a.b.a i() {
        return (f.a.b.a) this.f103158g.getValue();
    }

    static final class a extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f103161a = new a();

        static {
            Covode.recordClassIndex(66149);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    public final void m() {
        this.f103159k = null;
        i().a();
    }

    private final void j() {
        String str = this.f103156e;
        if (str != null && str.length() != 0) {
            List<IMContact> e2 = e();
            String str2 = this.f103156e;
            if (str2 == null) {
                l.b();
            }
            this.f103156e = null;
            i().a();
            ab b2 = ab.a((af) new e(this, e2, str2)).b(f.a.h.a.b(f.a.k.a.f158006c));
            l.b(b2, "");
            ab b3 = ab.a((af) new f(e2, str2)).b(f.a.h.a.b(f.a.k.a.f158006c));
            l.b(b3, "");
            f.a.b.b a2 = ab.a(b2, b3, d.f103165a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this, str2), new c(this));
            l.b(a2, "");
            f.a.j.a.a(a2, i());
        }
    }

    public final void a(d dVar) {
        l.d(dVar, "");
        this.f103159k = dVar;
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f103162a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f103163b;

        static {
            Covode.recordClassIndex(66150);
        }

        b(h hVar, String str) {
            this.f103162a = hVar;
            this.f103163b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<IMContact> list = (List) obj;
            d dVar = this.f103162a.f103159k;
            if (dVar != null) {
                l.b(list, "");
                dVar.a(list, this.f103163b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f103164a;

        static {
            Covode.recordClassIndex(66151);
        }

        c(h hVar) {
            this.f103164a = hVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            d dVar = this.f103164a.f103159k;
            if (dVar != null) {
                l.b(th, "");
                dVar.b(th);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar) {
        super(cVar);
        l.d(cVar, "");
        this.f103160l = cVar.f102988i;
    }

    public final void a(String str) {
        if (str != null && str.length() != 0) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
            this.f103156e = p.b((CharSequence) str).toString();
            if (!this.f103157f) {
                j();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements af {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f103166a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f103167b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f103168c;

        static {
            Covode.recordClassIndex(66153);
        }

        e(h hVar, List list, String str) {
            this.f103166a = hVar;
            this.f103167b = list;
            this.f103168c = str;
        }

        @Override // f.a.af
        public final void subscribe(ad<List<IMConversation>> adVar) {
            List<IMConversation> list;
            l.d(adVar, "");
            if (this.f103166a.f103160l) {
                List list2 = this.f103167b;
                ArrayList arrayList = new ArrayList();
                for (T t : list2) {
                    if (t instanceof IMConversation) {
                        arrayList.add(t);
                    }
                }
                list = new ArrayList<>();
                for (IMConversation iMConversation : arrayList) {
                    String displayName = iMConversation.getDisplayName();
                    l.b(displayName, "");
                    Objects.requireNonNull(displayName, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase = displayName.toLowerCase();
                    l.b(lowerCase, "");
                    String str = this.f103168c;
                    Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase2 = str.toLowerCase();
                    l.b(lowerCase2, "");
                    if (p.e((CharSequence) lowerCase, (CharSequence) lowerCase2)) {
                        list.add(iMConversation);
                    }
                }
            } else {
                list = z.INSTANCE;
            }
            adVar.a(list);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements af {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f103169a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f103170b;

        static {
            Covode.recordClassIndex(66154);
        }

        f(List list, String str) {
            this.f103169a = list;
            this.f103170b = str;
        }

        @Override // f.a.af
        public final void subscribe(ad<List<IMUser>> adVar) {
            l.d(adVar, "");
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.f a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.f.a();
            List list = this.f103169a;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t instanceof IMUser) {
                    arrayList.add(t);
                }
            }
            List<IMUser> a3 = a2.a(arrayList, this.f103170b, true);
            List<IMUser> arrayList2 = new ArrayList<>();
            for (IMUser iMUser : a3) {
                if (!arrayList2.contains(iMUser)) {
                    l.b(iMUser, "");
                    arrayList2.add(iMUser);
                }
            }
            adVar.a(arrayList2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T1, T2, R> implements f.a.d.c {

        /* renamed from: a  reason: collision with root package name */
        public static final d f103165a = new d();

        static {
            Covode.recordClassIndex(66152);
        }

        d() {
        }

        @Override // f.a.d.c
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            l.d(list, "");
            l.d(list2, "");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            arrayList.addAll(list2);
            return arrayList;
        }
    }
}

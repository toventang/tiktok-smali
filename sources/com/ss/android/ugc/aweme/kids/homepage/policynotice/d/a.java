package com.ss.android.ugc.aweme.kids.homepage.policynotice.d;

import android.content.Context;
import b.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.common.c.e;
import com.ss.android.ugc.aweme.kids.homepage.policynotice.api.PolicyNoticeApi;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final h f106616a = i.a((h.f.a.a) b.f106619a);

    static {
        Covode.recordClassIndex(68125);
    }

    public final PolicyNoticeApi.API a() {
        return (PolicyNoticeApi.API) this.f106616a.getValue();
    }

    static final class b extends m implements h.f.a.a<PolicyNoticeApi.API> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f106619a = new b();

        static {
            Covode.recordClassIndex(68127);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ PolicyNoticeApi.API invoke() {
            return PolicyNoticeApi.f106610a;
        }
    }

    public static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f106620a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f106621b;

        static {
            Covode.recordClassIndex(68128);
        }

        public c(h.f.a.a aVar, long j2) {
            this.f106620a = aVar;
            this.f106621b = j2;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            this.f106620a.invoke();
            l.b(iVar, "");
            if (iVar.c()) {
                e.a("kids_api_policy_notice_approve", -1, -1, this.f106621b);
            } else if (iVar.a()) {
                e.a("kids_api_policy_notice_approve", -1, 0, this.f106621b);
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.d.a$a  reason: collision with other inner class name */
    public static final class C2725a<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f106617a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f106618b;

        static {
            Covode.recordClassIndex(68126);
        }

        public C2725a(long j2, Context context) {
            this.f106617a = j2;
            this.f106618b = context;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            l.b(iVar, "");
            if (iVar.c()) {
                e.a("kids_api_policy_notice", -1, -1, this.f106617a);
            } else if (!iVar.b() && iVar.a()) {
                List<com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a> list = ((com.ss.android.ugc.aweme.kids.homepage.policynotice.response.c) iVar.d()).f106633a;
                if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                    com.ss.android.ugc.aweme.kids.homepage.compliance.a.f106576d = true;
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        T t2 = t;
                        if (l.a((Object) t2.getStyle(), (Object) "pop") && (!l.a((Object) t2.isSubPopUp(), (Object) true))) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList();
                    for (T t3 : list) {
                        T t4 = t3;
                        if (l.a((Object) t4.getStyle(), (Object) "float") && (!l.a((Object) t4.isSubPopUp(), (Object) true))) {
                            arrayList3.add(t3);
                        }
                    }
                    ArrayList arrayList4 = arrayList3;
                    ArrayList arrayList5 = new ArrayList();
                    for (T t5 : list) {
                        T t6 = t5;
                        if (l.a((Object) t6.getStyle(), (Object) "bottom") && (!l.a((Object) t6.isSubPopUp(), (Object) true))) {
                            arrayList5.add(t5);
                        }
                    }
                    ArrayList arrayList6 = arrayList5;
                    ArrayList arrayList7 = new ArrayList();
                    for (T t7 : list) {
                        T t8 = t7;
                        if (l.a((Object) t8.getStyle(), (Object) "fullscreen") && (!l.a((Object) t8.isSubPopUp(), (Object) true))) {
                            arrayList7.add(t7);
                        }
                    }
                    ArrayList arrayList8 = arrayList7;
                    ArrayList arrayList9 = new ArrayList();
                    for (T t9 : list) {
                        if (l.a((Object) t9.isSubPopUp(), (Object) true)) {
                            arrayList9.add(t9);
                        }
                    }
                    ArrayList arrayList10 = arrayList9;
                    l.d(arrayList10, "");
                    com.ss.android.ugc.aweme.kids.homepage.policynotice.a.f106594e = arrayList10;
                    if (!arrayList6.isEmpty()) {
                        com.ss.android.ugc.aweme.kids.homepage.policynotice.a.f106591b = (com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a) n.g((List) arrayList6);
                    }
                    if (!arrayList8.isEmpty()) {
                        com.ss.android.ugc.aweme.kids.homepage.policynotice.a.f106593d = (com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a) n.g((List) arrayList8);
                    }
                    if (!arrayList4.isEmpty()) {
                        com.ss.android.ugc.aweme.kids.homepage.policynotice.a.f106590a = (com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a) n.g((List) arrayList4);
                    }
                    if (!arrayList2.isEmpty()) {
                        com.ss.android.ugc.aweme.kids.homepage.policynotice.a.f106592c = (com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a) n.g((List) arrayList2);
                    }
                }
                e.a("kids_api_policy_notice", -1, 0, this.f106617a);
            }
            com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(this.f106618b);
            return null;
        }
    }
}

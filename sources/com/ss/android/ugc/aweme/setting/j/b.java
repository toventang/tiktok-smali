package com.ss.android.ugc.aweme.setting.j;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.twostep.a;
import com.ss.android.ugc.aweme.account.login.twostep.aa;
import com.ss.android.ugc.aweme.setting.api.IChangePhoneHelperApi;
import com.ss.android.ugc.aweme.setting.api.a;
import com.ss.android.ugc.aweme.setting.api.b;
import com.ss.android.ugc.aweme.utils.ai;
import h.f.b.l;
import h.z;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static SoftReference<a> f122240a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f122241b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(80145);
    }

    public static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final c f122244a = new c();

        static {
            Covode.recordClassIndex(80148);
        }

        c() {
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            a aVar;
            if (ai.a(iVar)) {
                l.b(iVar, "");
                b.a aVar2 = ((com.ss.android.ugc.aweme.setting.api.b) iVar.d()).f122069b;
                if (aVar2 != null && aVar2.f122071b) {
                    IChangePhoneHelperApi.a.f122051a.check2sv().a(a.f122242a);
                    return z.f158842a;
                }
            }
            SoftReference<a> softReference = b.f122240a;
            if (!(softReference == null || (aVar = softReference.get()) == null)) {
                aVar.a(false, false);
            }
            b.f122240a = null;
            return z.f158842a;
        }
    }

    static final class a<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f122242a = new a();

        static {
            Covode.recordClassIndex(80146);
        }

        a() {
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            a aVar;
            if (ai.a(iVar)) {
                l.b(iVar, "");
                if (((com.ss.android.ugc.aweme.account.login.twostep.a) iVar.d()).getData() != null) {
                    a.C1430a data = ((com.ss.android.ugc.aweme.account.login.twostep.a) iVar.d()).getData();
                    if (data == null) {
                        l.b();
                    }
                    List<aa> two_step_verify_ways = data.getTwo_step_verify_ways();
                    if (two_step_verify_ways != null) {
                        ArrayList arrayList = new ArrayList();
                        for (T t : two_step_verify_ways) {
                            if (l.a((Object) t.is_available(), (Object) true)) {
                                arrayList.add(t);
                            }
                        }
                        if (arrayList.size() < 2) {
                            IChangePhoneHelperApi.a.f122051a.availableVerifyWays().a(C3160b.f122243a);
                            return z.f158842a;
                        }
                    }
                }
            }
            SoftReference<a> softReference = b.f122240a;
            if (!(softReference == null || (aVar = softReference.get()) == null)) {
                aVar.a(false, false);
            }
            b.f122240a = null;
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.j.b$b  reason: collision with other inner class name */
    static final class C3160b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final C3160b f122243a = new C3160b();

        static {
            Covode.recordClassIndex(80147);
        }

        C3160b() {
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            a aVar;
            a aVar2;
            if (ai.a(iVar)) {
                l.b(iVar, "");
                if (((com.ss.android.ugc.aweme.setting.api.a) iVar.d()).f122064b != null) {
                    a.C3156a aVar3 = ((com.ss.android.ugc.aweme.setting.api.a) iVar.d()).f122064b;
                    if (aVar3 == null) {
                        l.b();
                    }
                    SoftReference<a> softReference = b.f122240a;
                    if (!(softReference == null || (aVar2 = softReference.get()) == null)) {
                        aVar2.a(aVar3.f122067c, aVar3.f122066b);
                    }
                    b.f122240a = null;
                    return z.f158842a;
                }
            }
            SoftReference<a> softReference2 = b.f122240a;
            if (!(softReference2 == null || (aVar = softReference2.get()) == null)) {
                aVar.a(false, false);
            }
            b.f122240a = null;
            return z.f158842a;
        }
    }
}

package com.ss.android.ugc.aweme.kids.homepage.compliance;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.kids.common.c.e;
import com.ss.android.ugc.aweme.kids.common.response.KidsSettings;
import f.a.z;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ComplianceApi f106578a;

    static {
        Covode.recordClassIndex(68100);
    }

    public b() {
        Object a2 = RetrofitFactory.a().b(com.ss.android.ugc.aweme.kids.common.a.a.f105880a).d().a(ComplianceApi.class);
        l.b(a2, "");
        this.f106578a = (ComplianceApi) a2;
    }

    public static final class a implements z<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f106579a;

        static {
            Covode.recordClassIndex(68101);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        public a(long j2) {
            this.f106579a = j2;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            e.a("kids_api_check_in", -1, -1, this.f106579a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            l.d(baseResponse, "");
            e.a("kids_api_check_in", -1, 0, this.f106579a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.compliance.b$b  reason: collision with other inner class name */
    public static final class C2722b implements z<KidsSettings> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f106580a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f106581b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f106582c;

        static {
            Covode.recordClassIndex(68102);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            if (a.f106575c > 0) {
                a.f106575c--;
                this.f106580a.a(this.f106581b);
            }
            e.a("kids_api_compliance_settings", -1, -1, this.f106582c);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(KidsSettings kidsSettings) {
            KidsSettings kidsSettings2 = kidsSettings;
            l.d(kidsSettings2, "");
            if (kidsSettings2.status_code == 0) {
                d dVar = this.f106581b;
                if (dVar != null) {
                    dVar.a(kidsSettings2);
                }
                a.f106575c = 3;
            } else if (a.f106575c > 0) {
                a.f106575c--;
                this.f106580a.a(this.f106581b);
            }
            e.a("kids_api_compliance_settings", -1, 0, this.f106582c);
        }

        C2722b(b bVar, d dVar, long j2) {
            this.f106580a = bVar;
            this.f106581b = dVar;
            this.f106582c = j2;
        }
    }

    public final void a(d dVar) {
        this.f106578a.getKidsSettings().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new C2722b(this, dVar, System.currentTimeMillis()));
    }
}

package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.api.TeenageModeApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.zhiliaoapp.musically.R;
import f.a.z;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a f106924a;

    /* renamed from: b  reason: collision with root package name */
    private final TeenageModeApi f106925b;

    static {
        Covode.recordClassIndex(68389);
    }

    public a() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.kids.common.a.a.f105880a).create(TeenageModeApi.class);
        l.b(create, "");
        this.f106925b = (TeenageModeApi) create;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a$a  reason: collision with other inner class name */
    public static final class C2744a implements z<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106926a;

        static {
            Covode.recordClassIndex(68390);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2744a(a aVar) {
            this.f106926a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            l.d(baseResponse, "");
            com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a aVar = this.f106926a.f106924a;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            String errorMsg;
            l.d(th, "");
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    errorMsg = d.a().getString(R.string.de7);
                } else {
                    errorMsg = aVar.getErrorMsg();
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(errorMsg).a();
            } else {
                new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(R.string.de7).a();
            }
            com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a aVar2 = this.f106926a.f106924a;
            if (aVar2 != null) {
                aVar2.a();
            }
        }
    }

    public static final class b implements z<com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.api.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106927a;

        static {
            Covode.recordClassIndex(68391);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f106927a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.api.a aVar) {
            l.d(aVar, "");
            com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a aVar2 = this.f106927a.f106924a;
            if (aVar2 != null) {
                aVar2.b();
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            String errorMsg;
            l.d(th, "");
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    errorMsg = d.a().getString(R.string.de7);
                } else {
                    errorMsg = aVar.getErrorMsg();
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(errorMsg).a();
            } else {
                new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(R.string.de7).a();
            }
            com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a aVar2 = this.f106927a.f106924a;
            if (aVar2 != null) {
                aVar2.a();
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a aVar) {
        l.d(aVar, "");
        this.f106924a = aVar;
    }

    public final void a(String str) {
        l.d(str, "");
        this.f106925b.checkTeenagePassword(com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a(str)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new C2744a(this));
    }

    public final void b(String str) {
        l.d(str, "");
        this.f106925b.setMinorSettings(str).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new b(this));
    }
}

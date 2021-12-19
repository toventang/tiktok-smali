package com.ss.android.ugc.aweme.compliance.protection.restrictmode.b;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.c.g;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.api.DigitalWellbeingApi;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.zhiliaoapp.musically.R;
import f.a.z;
import h.f.b.l;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public g f78000a;

    /* renamed from: b  reason: collision with root package name */
    private final DigitalWellbeingApi f78001b;

    static {
        Covode.recordClassIndex(48354);
    }

    public a() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(DigitalWellbeingApi.class);
        l.b(create, "");
        this.f78001b = (DigitalWellbeingApi) create;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.restrictmode.b.a$a  reason: collision with other inner class name */
    public static final class C1811a implements z<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f78002a;

        static {
            Covode.recordClassIndex(48355);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1811a(a aVar) {
            this.f78002a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            l.d(baseResponse, "");
            g gVar = this.f78002a.f78000a;
            if (gVar != null) {
                gVar.b();
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            String errorMsg;
            l.d(th, "");
            Fragment fragment = null;
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    errorMsg = d.a().getString(R.string.de7);
                } else {
                    errorMsg = aVar.getErrorMsg();
                }
                g gVar = this.f78002a.f78000a;
                if (gVar instanceof Fragment) {
                    fragment = gVar;
                }
                Fragment fragment2 = (Fragment) fragment;
                if (fragment2 != null) {
                    new com.bytedance.tux.g.b(fragment2).a(errorMsg).b();
                }
            } else {
                g gVar2 = this.f78002a.f78000a;
                if (gVar2 instanceof Fragment) {
                    fragment = gVar2;
                }
                Fragment fragment3 = fragment;
                if (fragment3 != null) {
                    new com.bytedance.tux.g.b(fragment3).e(R.string.de7).b();
                }
            }
            g gVar3 = this.f78002a.f78000a;
            if (gVar3 != null) {
                gVar3.a();
            }
        }
    }

    public final void a(g gVar) {
        l.d(gVar, "");
        this.f78000a = gVar;
    }

    public static final class b implements z<com.ss.android.ugc.aweme.compliance.protection.restrictmode.api.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f78003a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f78004b;

        static {
            Covode.recordClassIndex(48356);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(com.ss.android.ugc.aweme.compliance.protection.restrictmode.api.a aVar) {
            l.d(aVar, "");
            g gVar = this.f78003a.f78000a;
            if (gVar != null) {
                gVar.b();
            }
            n.a("compliance_api_status", "", new c().a(StringSet.type, "/aweme/v1/minor/user/set/settings/").a("param", this.f78004b).a("status", (Integer) 0).a());
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            int i2;
            String errorMsg;
            l.d(th, "");
            boolean z = th instanceof com.ss.android.ugc.aweme.base.api.a.b.a;
            String str = null;
            if (z) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    errorMsg = d.a().getString(R.string.de7);
                } else {
                    errorMsg = aVar.getErrorMsg();
                }
                g gVar = this.f78003a.f78000a;
                if (!(gVar instanceof Fragment)) {
                    gVar = null;
                }
                Fragment fragment = (Fragment) gVar;
                if (fragment != null) {
                    new com.bytedance.tux.g.b(fragment).a(errorMsg).b();
                }
            } else {
                g gVar2 = this.f78003a.f78000a;
                if (!(gVar2 instanceof Fragment)) {
                    gVar2 = null;
                }
                Fragment fragment2 = (Fragment) gVar2;
                if (fragment2 != null) {
                    new com.bytedance.tux.g.b(fragment2).e(R.string.de7).b();
                }
            }
            c a2 = new c().a(StringSet.type, "/aweme/v1/minor/user/set/settings/");
            if (z) {
                i2 = ((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode();
            } else {
                i2 = -1;
            }
            c a3 = a2.a("error_message", Integer.valueOf(i2)).a("param", this.f78004b).a("status", (Integer) 1);
            if (z) {
                Object rawResponse = ((com.ss.android.ugc.aweme.base.api.a.b.a) th).getRawResponse();
                Objects.requireNonNull(rawResponse, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.protection.restrictmode.api.MinorSettingResp");
                LogPbBean logPbBean = ((com.ss.android.ugc.aweme.compliance.protection.restrictmode.api.a) rawResponse).f77999a;
                if (logPbBean != null) {
                    str = logPbBean.getImprId();
                }
            } else {
                str = "";
            }
            n.a("compliance_api_status", "", a3.a("tns_logId", str).a());
            g gVar3 = this.f78003a.f78000a;
            if (gVar3 != null) {
                gVar3.a();
            }
        }

        b(a aVar, String str) {
            this.f78003a = aVar;
            this.f78004b = str;
        }
    }

    public final void a(String str) {
        l.d(str, "");
        this.f78001b.checkPassword(com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.a(str)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new C1811a(this));
    }

    public final void b(String str) {
        l.d(str, "");
        this.f78001b.setMinorSettings(str).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new b(this, str));
    }
}

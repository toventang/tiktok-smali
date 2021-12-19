package com.ss.android.ugc.aweme.compliance.privacy.settings.account;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.api.model.r;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.ss.android.ugc.aweme.utils.cg;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public final class PrivacySettingViewModel extends ac implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public final t<f> f77449a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f77450b;

    /* renamed from: c  reason: collision with root package name */
    public final t<q> f77451c;

    /* renamed from: d  reason: collision with root package name */
    public final t<Boolean> f77452d;

    /* renamed from: e  reason: collision with root package name */
    public final t<Boolean> f77453e;

    /* renamed from: f  reason: collision with root package name */
    public final t<Boolean> f77454f;

    /* renamed from: g  reason: collision with root package name */
    public final t<Boolean> f77455g;

    static {
        Covode.recordClassIndex(47910);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(334, new g(PrivacySettingViewModel.class, "onPrivacyUserSettingsChange", r.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        cg.b(this);
        super.onCleared();
    }

    public final void a() {
        com.ss.android.ugc.aweme.compliance.privacy.data.i.a(true);
        com.ss.android.ugc.aweme.compliance.privacy.data.b.b(true);
        com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.b.a().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(a.f77456a).a(new b(this), c.f77458a);
    }

    public PrivacySettingViewModel() {
        cg.a(this);
        t<q> tVar = new t<>();
        tVar.setValue(com.ss.android.ugc.aweme.compliance.privacy.data.b.b());
        this.f77451c = tVar;
        t<Boolean> tVar2 = new t<>();
        tVar2.setValue(Boolean.valueOf(com.ss.android.ugc.aweme.compliance.privacy.a.a.b()));
        this.f77452d = tVar2;
        t<Boolean> tVar3 = new t<>();
        tVar3.setValue(false);
        this.f77453e = tVar3;
        t<Boolean> tVar4 = new t<>();
        tVar4.setValue(Boolean.valueOf(com.ss.android.ugc.aweme.compliance.privacy.a.a.e().getAdAuthorization()));
        this.f77454f = tVar4;
        t<Boolean> tVar5 = new t<>();
        tVar5.setValue(false);
        this.f77455g = tVar5;
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77456a = new a();

        static {
            Covode.recordClassIndex(47911);
        }

        a() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            f fVar = (f) obj;
            l.b(fVar, "");
            l.d(fVar, "");
            com.ss.android.ugc.aweme.compliance.privacy.data.i.f77433a = fVar;
            com.ss.android.ugc.aweme.compliance.privacy.data.i.a();
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f77458a = new c();

        static {
            Covode.recordClassIndex(47914);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final Throwable th = (Throwable) obj;
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", new h.f.a.b<com.ss.android.ugc.aweme.app.f.c, com.ss.android.ugc.aweme.app.f.c>() {
                /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(47915);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.ss.android.ugc.aweme.app.f.c invoke(com.ss.android.ugc.aweme.app.f.c cVar) {
                    com.ss.android.ugc.aweme.app.f.c cVar2 = cVar;
                    l.d(cVar2, "");
                    com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Fetch UserSetting fail");
                    Throwable th = th;
                    l.b(th, "");
                    com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(cVar2, com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(th));
                    com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, com.ss.android.ugc.aweme.compliance.privacy.utils.a.a());
                    Throwable th2 = th;
                    l.b(th2, "");
                    return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "cause", com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(th2));
                }
            });
        }
    }

    @org.greenrobot.eventbus.r
    public final void onPrivacyUserSettingsChange(r rVar) {
        l.d(rVar, "");
        this.f77451c.setValue(rVar.f76693a);
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PrivacySettingViewModel f77457a;

        static {
            Covode.recordClassIndex(47912);
        }

        b(PrivacySettingViewModel privacySettingViewModel) {
            this.f77457a = privacySettingViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final f fVar = (f) obj;
            l.b(fVar, "");
            String str = fVar.I;
            l.b(str, "");
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.b.a(str);
            this.f77457a.f77449a.setValue(fVar);
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", new h.f.a.b<com.ss.android.ugc.aweme.app.f.c, com.ss.android.ugc.aweme.app.f.c>() {
                /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(47913);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.ss.android.ugc.aweme.app.f.c invoke(com.ss.android.ugc.aweme.app.f.c cVar) {
                    com.ss.android.ugc.aweme.app.f.c cVar2 = cVar;
                    l.d(cVar2, "");
                    com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Fetch UserSetting success");
                    f fVar = fVar;
                    l.b(fVar, "");
                    com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(cVar2, com.ss.android.ugc.aweme.compliance.privacy.utils.a.a((BaseResponse) fVar));
                    com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, com.ss.android.ugc.aweme.compliance.privacy.utils.a.a());
                    f fVar2 = fVar;
                    l.b(fVar2, "");
                    return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "user_setting", com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(fVar2));
                }
            });
        }
    }
}

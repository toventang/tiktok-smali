package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.c;
import com.ss.android.ugc.aweme.profile.b.e;
import f.a.d.f;
import f.a.t;
import h.f.b.l;

public final class QAProfileEntranceViewModel extends BasePrivacySettingViewModel {

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f77750a = new d();

        static {
            Covode.recordClassIndex(48148);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(48142);
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77747a = new a();

        static {
            Covode.recordClassIndex(48143);
        }

        a() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final com.ss.android.ugc.aweme.setting.serverpush.a.f fVar = (com.ss.android.ugc.aweme.setting.serverpush.a.f) obj;
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", new h.f.a.b<com.ss.android.ugc.aweme.app.f.c, com.ss.android.ugc.aweme.app.f.c>() {
                /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.QAProfileEntranceViewModel.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(48144);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.ss.android.ugc.aweme.app.f.c invoke(com.ss.android.ugc.aweme.app.f.c cVar) {
                    com.ss.android.ugc.aweme.app.f.c cVar2 = cVar;
                    l.d(cVar2, "");
                    com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Fetch UserSetting success");
                    com.ss.android.ugc.aweme.setting.serverpush.a.f fVar = fVar;
                    l.b(fVar, "");
                    com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(cVar2, com.ss.android.ugc.aweme.compliance.privacy.utils.a.a((BaseResponse) fVar));
                    com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, com.ss.android.ugc.aweme.compliance.privacy.utils.a.a());
                    com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "from", "QAProfileEntrance");
                    com.ss.android.ugc.aweme.setting.serverpush.a.f fVar2 = fVar;
                    l.b(fVar2, "");
                    return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "user_setting", com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(fVar2));
                }
            });
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f77748a = new b();

        static {
            Covode.recordClassIndex(48145);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final Throwable th = (Throwable) obj;
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", new h.f.a.b<com.ss.android.ugc.aweme.app.f.c, com.ss.android.ugc.aweme.app.f.c>() {
                /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.QAProfileEntranceViewModel.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(48146);
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
                    com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "from", "QAProfileEntrance");
                    Throwable th2 = th;
                    l.b(th2, "");
                    return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "cause", com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(th2));
                }
            });
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QAProfileEntranceViewModel f77749a;

        static {
            Covode.recordClassIndex(48147);
        }

        c(QAProfileEntranceViewModel qAProfileEntranceViewModel) {
            this.f77749a = qAProfileEntranceViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.setting.serverpush.a.f fVar = (com.ss.android.ugc.aweme.setting.serverpush.a.f) obj;
            l.b(fVar, "");
            String str = fVar.I;
            l.b(str, "");
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.b.a(str);
            this.f77749a.f77673d.setValue(Integer.valueOf(fVar.ao));
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    public final t<BaseResponse> b(int i2) {
        t<BaseResponse> a2 = c.f77761a.setQAStatus(i2).b(c.a.f77763a).a(c.b.f77764a);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    public final void a(int i2, BaseResponse baseResponse) {
        l.d(baseResponse, "");
        super.a(i2, baseResponse);
        com.ss.android.ugc.d.a.c.a(new e());
    }
}

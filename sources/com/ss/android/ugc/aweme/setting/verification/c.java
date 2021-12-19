package com.ss.android.ugc.aweme.setting.verification;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.MtcertSettings;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.verification.VerificationApi;
import f.a.z;
import h.f.b.l;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f123052b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f123053a = new f.a.b.a();

    static {
        Covode.recordClassIndex(80815);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80816);
        }

        private a() {
        }

        public static boolean d() {
            if (e() || f()) {
                return true;
            }
            return false;
        }

        public static boolean b() {
            try {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                l.b(iESSettingsProxy, "");
                MtcertSettings mtcertSettings = iESSettingsProxy.getMtcertSettings();
                l.b(mtcertSettings, "");
                Boolean enablePrivateAccountNotice = mtcertSettings.getEnablePrivateAccountNotice();
                l.b(enablePrivateAccountNotice, "");
                return enablePrivateAccountNotice.booleanValue();
            } catch (com.bytedance.ies.a unused) {
                return false;
            }
        }

        public static boolean c() {
            try {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                l.b(iESSettingsProxy, "");
                MtcertSettings mtcertSettings = iESSettingsProxy.getMtcertSettings();
                l.b(mtcertSettings, "");
                Boolean enableChangeMobileNotice = mtcertSettings.getEnableChangeMobileNotice();
                l.b(enableChangeMobileNotice, "");
                return enableChangeMobileNotice.booleanValue();
            } catch (com.bytedance.ies.a unused) {
                return false;
            }
        }

        public static boolean e() {
            try {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                l.b(iESSettingsProxy, "");
                MtcertSettings mtcertSettings = iESSettingsProxy.getMtcertSettings();
                l.b(mtcertSettings, "");
                Boolean enableChangeHandleNotice = mtcertSettings.getEnableChangeHandleNotice();
                l.b(enableChangeHandleNotice, "");
                return enableChangeHandleNotice.booleanValue();
            } catch (com.bytedance.ies.a unused) {
                return false;
            }
        }

        public static boolean f() {
            try {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                l.b(iESSettingsProxy, "");
                MtcertSettings mtcertSettings = iESSettingsProxy.getMtcertSettings();
                l.b(mtcertSettings, "");
                Boolean enableChangeNicknameNotice = mtcertSettings.getEnableChangeNicknameNotice();
                l.b(enableChangeNicknameNotice, "");
                return enableChangeNicknameNotice.booleanValue();
            } catch (com.bytedance.ies.a unused) {
                return false;
            }
        }

        public static boolean a() {
            try {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                l.b(iESSettingsProxy, "");
                MtcertSettings mtcertSettings = iESSettingsProxy.getMtcertSettings();
                l.b(mtcertSettings, "");
                Boolean showCertEntry = mtcertSettings.getShowCertEntry();
                l.b(showCertEntry, "");
                return showCertEntry.booleanValue();
            } catch (com.bytedance.ies.a e2) {
                e2.printStackTrace();
                return false;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements z<VerificationResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f123054a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f123055b;

        static {
            Covode.recordClassIndex(80817);
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f123055b.a();
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            this.f123055b.a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(VerificationResponse verificationResponse) {
            VerificationResponse verificationResponse2 = verificationResponse;
            l.d(verificationResponse2, "");
            this.f123055b.a(verificationResponse2);
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
            this.f123054a.f123053a.a(bVar);
        }

        b(c cVar, b bVar) {
            this.f123054a = cVar;
            this.f123055b = bVar;
        }
    }

    public final void a(User user, b bVar) {
        l.d(user, "");
        l.d(bVar, "");
        a(a.d(), user, bVar);
    }

    public final void a(boolean z, User user, b bVar) {
        l.d(user, "");
        l.d(bVar, "");
        if (z) {
            VerificationApi.a.a().requestVerification(user.getSecUid()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new b(this, bVar));
            return;
        }
        VerificationResponse verificationResponse = new VerificationResponse();
        verificationResponse.setMtCertStatusEnum(MtCertStatusEnum.CS_EMPTY);
        verificationResponse.setMtCertingActionEnum(MtCertingActionEnum.CA_EMPTY);
        bVar.a(verificationResponse);
        bVar.a();
    }
}

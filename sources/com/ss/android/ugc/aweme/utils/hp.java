package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.profile.f.ag;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.setting.api.ProAccountUpdateStatusApi;
import com.ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import f.a.ae;
import f.a.b.b;
import h.f.b.l;

public final class hp {

    /* renamed from: a  reason: collision with root package name */
    public static final a f143068a = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(93638);
        }

        /* renamed from: com.ss.android.ugc.aweme.utils.hp$a$a  reason: collision with other inner class name */
        public static final class C3815a implements ae<BaseResponse> {
            static {
                Covode.recordClassIndex(93639);
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
                l.d(th, "");
            }

            @Override // f.a.ae
            public final void onSubscribe(b bVar) {
                l.d(bVar, "");
            }

            C3815a() {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.ae
            public final /* synthetic */ void onSuccess(BaseResponse baseResponse) {
                boolean z;
                BaseResponse baseResponse2 = baseResponse;
                l.d(baseResponse2, "");
                if (baseResponse2.status_code != 0) {
                    z = true;
                } else {
                    z = false;
                }
                Keva repo = Keva.getRepo("keva_repo_qa");
                StringBuilder sb = new StringBuilder("keva_key_need_write_red_dot");
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                repo.storeBoolean(sb.append(g2.getCurUserId()).toString(), z);
            }
        }

        private a() {
        }

        public static boolean b() {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            l.b(curUser, "");
            return curUser.isProAccount();
        }

        private static boolean l() {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            l.b(curUser, "");
            return curUser.proAccountTcmRedDot;
        }

        public static boolean a() {
            Integer valueOf;
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            l.b(curUser, "");
            CommerceUserInfo commerceUserInfo = curUser.getCommerceUserInfo();
            if (commerceUserInfo == null || (valueOf = Integer.valueOf(commerceUserInfo.getStarAtlas())) == null || valueOf.intValue() != 1) {
                return false;
            }
            return true;
        }

        public static boolean c() {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            l.b(curUser, "");
            return d.a(com.ss.android.ugc.aweme.framework.d.a.f96678a, "tcm_pro_account", 0).getBoolean("tcm_first_dot" + curUser.getUid(), true);
        }

        public static boolean d() {
            FeConfigCollection feConfigCollection;
            FEConfig tcmEntrance;
            String schema;
            try {
                IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
                if (iESSettingsProxy == null || (feConfigCollection = iESSettingsProxy.getFeConfigCollection()) == null || (tcmEntrance = feConfigCollection.getTcmEntrance()) == null || (schema = tcmEntrance.getSchema()) == null) {
                    return false;
                }
                if (schema.length() == 0) {
                    return false;
                }
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }

        public static boolean e() {
            if (!d()) {
                return false;
            }
            TcmConfig i2 = TcmServiceImpl.j().i();
            if ((i2 == null || !i2.getCanUseTcmConsole()) && !a()) {
                if (hq.a()) {
                    Boolean a2 = hr.a();
                    l.b(a2, "");
                    if (a2.booleanValue()) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public static boolean f() {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            l.b(curUser, "");
            if (!curUser.isEnableSubscription()) {
                return false;
            }
            Keva repo = Keva.getRepo("keva_repo_subs");
            StringBuilder sb = new StringBuilder("keva_key_red_dot");
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g3, "");
            if (repo.getBoolean(sb.append(g3.getCurUserId()).toString(), true)) {
                return true;
            }
            return false;
        }

        public static boolean h() {
            if ((!d() || !m() || (!c() && !l())) && !g() && !is.a() && !f()) {
                return false;
            }
            return true;
        }

        public static boolean i() {
            Keva repo = Keva.getRepo("keva_repo_qa");
            StringBuilder sb = new StringBuilder("keva_key_red_dot");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            return repo.getBoolean(sb.append(g2.getCurUserId()).toString(), true);
        }

        public static boolean j() {
            Keva repo = Keva.getRepo("keva_repo_qa");
            StringBuilder sb = new StringBuilder("keva_key_need_write_red_dot");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            return repo.getBoolean(sb.append(g2.getCurUserId()).toString(), false);
        }

        public static void k() {
            ((ProAccountUpdateStatusApi) RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(ProAccountUpdateStatusApi.class)).updateStatus().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c)).a_(new C3815a());
        }

        public static boolean g() {
            Keva repo = Keva.getRepo("keva_repo_qa");
            StringBuilder sb = new StringBuilder("keva_key_public_qna_setting");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            boolean z = repo.getBoolean(sb.append(g2.getCurUserId()).toString(), false);
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g3, "");
            User curUser = g3.getCurUser();
            if (QnaService.a().enablePublicQna() && !z) {
                l.b(curUser, "");
                if (curUser.getDisplayQnaOnProfile() == null) {
                    return true;
                }
            }
            return false;
        }

        private static boolean m() {
            if (ag.a()) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                User curUser = g2.getCurUser();
                l.b(curUser, "");
                int accountType = curUser.getAccountType();
                if (!d() || !a() || (accountType != 2 && accountType != 1)) {
                    return false;
                }
                return true;
            } else if (!d() || !a() || !b()) {
                return false;
            } else {
                return true;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(93637);
    }
}

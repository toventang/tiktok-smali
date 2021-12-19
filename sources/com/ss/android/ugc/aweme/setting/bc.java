package com.ss.android.ugc.aweme.setting;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.f;
import com.google.gson.l;
import com.ss.android.ugc.aweme.account.util.q;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.setting.model.d;
import com.ss.android.ugc.d.a.c;

public final class bc extends by {
    static {
        Covode.recordClassIndex(80049);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a() {
        b(d.a());
        c.a(new com.ss.android.ugc.aweme.main.f.c());
        return null;
    }

    @Override // com.ss.android.ugc.aweme.setting.by
    public final void b(d dVar) {
        if (dVar != null) {
            super.b(dVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.by
    public final void a(Object obj) {
        if (obj instanceof Exception) {
            ((Exception) obj).printStackTrace();
            cd.f122158b.a(1, false);
            return;
        }
        cd.f122158b.a(1, true);
        if (obj instanceof l) {
            i.b(new bd(this), i.f4826c);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.bh
    public final void a(d dVar) {
        if (dVar != null) {
            boolean z = false;
            q.c().edit().putInt("disable_age_gate", SettingsManager.a().a("disable_age_gate", 0)).apply();
            q.c().edit().putInt("ftc_age_enable", SettingsManager.a().a("ftc_age_enable", 0)).apply();
            f fVar = new f();
            s sVar = s.a.f66880a;
            if (sVar.f66873g == null) {
                sVar.f66873g = new aj<>("is_show_gif_button", (Integer) 0);
            }
            sVar.f66873g.b(Integer.valueOf(SettingsManager.a().a("is_show_gif_button", 0)));
            SharePrefCache.inst().getWeakNetPreLoadSwitch().b(Integer.valueOf(SettingsManager.a().a("weak_net_pre_load_switch", 1)));
            SharePrefCache.inst().getIsPrivateAvailable().b(Boolean.valueOf(AVExternalServiceImpl.a().configService().avsettingsConfig().isPrivateAvailable()));
            SharePrefCache.inst().getLongVideoPermitted().b(Boolean.valueOf(AVExternalServiceImpl.a().configService().avsettingsConfig().isPrivateAvailable()));
            aj<String> userResidence = SharePrefCache.inst().getUserResidence();
            String a2 = SettingsManager.a().a("region_of_residence", "");
            if (a2.contains("İ")) {
                a2 = a2.replace((char) 304, 'I');
            }
            userResidence.b(a2);
            SharePrefCache.inst().getUserCurrentRegion().b(SettingsManager.a().a("current_region", ""));
            SharePrefCache.inst().getAdLandingPageConfig().b(fVar.b(d.f()));
            SharePrefCache.inst().getEnableBindItemCallOMSDK().b(Integer.valueOf(SettingsManager.a().a("enableBindItemCallOMSDK", 0)));
            SharePrefCache.inst().getDownloadSdkConfig().b(fVar.b(d.g()));
            SharePrefCache.inst().getFollowUserThreshold().b(Integer.valueOf(SettingsManager.a().a("show_follow_tab_following_limit", 0)));
            SharePrefCache.inst().setShowInvitedContactsFriends(Boolean.valueOf(SettingsManager.a().a("show_invite_friends_entry", false)));
            SharePrefCache.inst().getShowPromoteLicense().b(Integer.valueOf(SettingsManager.a().a("show_creator_license_210", 0)));
            SharePrefCache.inst().getIsEuropeCountry().b(Boolean.valueOf(SettingsManager.a().a("is_europe_country", false)));
            SharePrefCache.inst().getReferralEntrance().b(SettingsManager.a().a("referral_program_url", ""));
            aj<Boolean> q = s.a.f66880a.q();
            if (SettingsManager.a().a("comment_setting_enable", 0) == 1) {
                z = true;
            }
            q.b(Boolean.valueOf(z));
        }
    }
}

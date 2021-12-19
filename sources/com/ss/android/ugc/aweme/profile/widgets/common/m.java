package com.ss.android.ugc.aweme.profile.widgets.common;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.b.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.profile.api.h;
import com.ss.android.ugc.aweme.profile.f.ab;
import com.ss.android.ugc.aweme.profile.f.z;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import h.f.b.l;

public final class m implements com.bytedance.assem.arch.a.a<q> {

    /* renamed from: a  reason: collision with root package name */
    public final q f117712a = new a();

    static {
        Covode.recordClassIndex(76200);
    }

    public static final class a implements q {
        static {
            Covode.recordClassIndex(76201);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.profile.widgets.common.q
        public final Object a(Aweme aweme, String str, String str2, String str3, int i2, boolean z) {
            String a2;
            AwemeRawAd awemeRawAd;
            String str4;
            String str5;
            String str6 = null;
            if (com.ss.android.ugc.aweme.feed.o.a.f93623a) {
                StringBuilder sb = new StringBuilder("ProfileApi queryUserResponse aid: ");
                if (aweme != null) {
                    str4 = aweme.getAid();
                } else {
                    str4 = null;
                }
                StringBuilder append = sb.append(str4).append(", aweme_secUid: ");
                if (aweme != null) {
                    str5 = aweme.getSecAuthorUid();
                } else {
                    str5 = null;
                }
                com.ss.android.ugc.aweme.framework.a.a.b(4, "feed2profile", append.append(str5).append(", request_secUid: ").append(str).toString());
            }
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            Integer secIdSwitch = iESSettingsProxy.getSecIdSwitch();
            if (secIdSwitch != null && secIdSwitch.intValue() == 0) {
                a2 = com.ss.android.ugc.aweme.profile.api.c.a(str, str2, str3, i2, Boolean.valueOf(z));
            } else if (!TextUtils.isEmpty(str)) {
                a2 = com.ss.android.ugc.aweme.profile.api.c.a(str, null, i2, Boolean.valueOf(z));
            } else {
                a2 = com.ss.android.ugc.aweme.profile.api.c.a(null, str2, str3, i2, Boolean.valueOf(z));
            }
            Uri.Builder buildUpon = Uri.parse(a2).buildUpon();
            if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getNotificationConfig() != 1)) {
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    str6 = awemeRawAd2.getCreativeIdStr();
                }
                buildUpon.appendQueryParameter("creative_id", str6);
                buildUpon.appendQueryParameter("need_nofify_settings", "true");
            }
            h.a(a2);
            ab abVar = z.f116476a;
            if (abVar != null) {
                abVar.a();
            }
            e eVar = new e();
            eVar.a(new com.ss.android.http.a.b.a("check_preload", "true"));
            return com.ss.android.ugc.aweme.profile.service.h.f116622a.apiExecuteGetJSONObject(0, a2, UserResponse.class, "", eVar, true, null);
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ q a() {
        return this.f117712a;
    }
}

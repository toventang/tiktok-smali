package com.ss.android.ugc.aweme.account.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.account.loginsetting.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;

public final class AccountApiInModule {

    /* renamed from: a  reason: collision with root package name */
    public static final String f62856a = "https://api-va.tiktokv.com";

    /* renamed from: b  reason: collision with root package name */
    public static Api f62857b = ((Api) a.a("https://api-va.tiktokv.com", Api.class));

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f62858c = false;

    public interface Api {
        static {
            Covode.recordClassIndex(38716);
        }

        @f(a = "/passport/password/has_set/")
        q<Object> checkPasswordSet();

        @o(a = "/passport/mobile/can_send_voice_code/")
        @e
        i<b> checkVoiceCodeAvailability(@c(a = "mobile") String str, @c(a = "mix_mode") String str2);

        @o(a = "/aweme/v1/ad/ba/on/")
        @e
        q<BaseResponse> switchBusinessAccount(@c(a = "category_name") String str);

        @o(a = "/aweme/v1/user/proaccount/setting/")
        @e
        q<BaseResponse> switchProAccount(@c(a = "action_type") int i2, @c(a = "category_name") String str, @c(a = "category_id") String str2, @c(a = "pro_g") int i3);
    }

    static {
        Covode.recordClassIndex(38715);
    }

    public static i<b> a(String str) {
        try {
            return f62857b.checkVoiceCodeAvailability(com.ss.android.ugc.aweme.account.util.f.a(str), "1");
        } catch (Exception unused) {
            return null;
        }
    }
}

package com.ss.android.ugc.aweme.compliance.protection.restrictmode.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import l.b.c;
import l.b.e;
import l.b.o;

public interface DigitalWellbeingApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77997a = a.f77998a;

    static {
        Covode.recordClassIndex(48351);
    }

    @o(a = "/aweme/v1/minor/user/check/password/")
    @e
    t<BaseResponse> checkPassword(@c(a = "password") String str);

    @o(a = "/aweme/v1/minor/user/set/settings/")
    @e
    t<a> setMinorSettings(@c(a = "settings") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f77998a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(48352);
        }
    }
}

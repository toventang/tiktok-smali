package com.ss.android.ugc.aweme.setting.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import l.b.o;

public interface IUnbindValidateApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122053a = a.f122055b;

    static {
        Covode.recordClassIndex(80015);
    }

    @o(a = "/passport/email/unbind_validate/")
    i<c> unbindEmailValidate(@l.b.i(a = "x-tt-passport-csrf-token") String str);

    @o(a = "/passport/mobile/unbind_validate/")
    i<c> unbindMobileValidate(@l.b.i(a = "x-tt-passport-csrf-token") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final IUnbindValidateApi f122054a = ((IUnbindValidateApi) RetrofitFactory.a().b(b.f59141e).d().a(IUnbindValidateApi.class));

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f122055b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(80016);
        }
    }
}

package com.ss.android.ugc.aweme.account.unbind;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import l.b.c;
import l.b.e;
import l.b.o;

public interface IUnbindApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65437a = a.f65439b;

    static {
        Covode.recordClassIndex(40226);
    }

    @o(a = "/passport/email/unbind/")
    @e
    i<d> unbindEmail(@c(a = "ticket") String str, @l.b.i(a = "x-tt-passport-csrf-token") String str2);

    @o(a = "/passport/mobile/unbind/")
    @e
    i<d> unbindMobile(@c(a = "ticket") String str, @l.b.i(a = "x-tt-passport-csrf-token") String str2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final IUnbindApi f65438a = ((IUnbindApi) RetrofitFactory.a().b(b.f59141e).d().a(IUnbindApi.class));

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f65439b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(40227);
        }
    }
}

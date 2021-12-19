package com.ss.android.ugc.aweme.account.agegate.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import f.a.t;
import l.b.f;

public interface CalculateDoBApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62622a = a.f62624b;

    static {
        Covode.recordClassIndex(38550);
    }

    @f(a = "/tiktok/v1/calculate/age/")
    t<b> calculateDoB(@l.b.t(a = "birthday") String str, @l.b.t(a = "update_birthdate_type") int i2, @l.b.t(a = "session_register_type") int i3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final CalculateDoBApi f62623a = ((CalculateDoBApi) RetrofitFactory.a().b(b.f59141e).d().a(CalculateDoBApi.class));

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f62624b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(38551);
        }
    }
}

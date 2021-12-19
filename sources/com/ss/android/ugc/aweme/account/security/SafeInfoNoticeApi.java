package com.ss.android.ugc.aweme.account.security;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.ab;
import h.f.b.l;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;
import l.b.t;

public interface SafeInfoNoticeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65299a = a.f65300a;

    static {
        Covode.recordClassIndex(40153);
    }

    @o(a = "/safe_info/user/confirm/notice/")
    @e
    ab<BaseResponse> safeInfoConfirm(@c(a = "notice_id") String str, @c(a = "notice_type") String str2);

    @f(a = "/safe_info/user/message/notice/")
    ab<c> safeInfoNoticeMsg(@t(a = "adolescent_model") boolean z);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f65300a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(40154);
        }

        public static SafeInfoNoticeApi a() {
            Object a2 = RetrofitFactory.a().b(Api.f66569d).d().a(SafeInfoNoticeApi.class);
            l.b(a2, "");
            return (SafeInfoNoticeApi) a2;
        }
    }
}

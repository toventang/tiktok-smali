package com.ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import h.f.b.l;
import l.b.f;
import l.b.t;

public interface PromoteEntryCheckApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122060a = a.f122061a;

    static {
        Covode.recordClassIndex(80022);
    }

    @f(a = "/aweme/v1/promote/api/entry/check/")
    q<PromoteEntryCheck> getPromoteEntryCheck(@t(a = "item_id") String str, @t(a = "source") String str2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f122061a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(80023);
        }

        public static PromoteEntryCheckApi a() {
            String str = Api.f66569d;
            l.b(str, "");
            return (PromoteEntryCheckApi) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str).a(PromoteEntryCheckApi.class);
        }
    }
}

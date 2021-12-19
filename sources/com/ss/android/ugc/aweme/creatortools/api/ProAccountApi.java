package com.ss.android.ugc.aweme.creatortools.api;

import com.bytedance.covode.number.Covode;
import f.a.t;
import l.b.f;

public interface ProAccountApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f78374a = a.f78375a;

    static {
        Covode.recordClassIndex(48671);
    }

    @f(a = "/api/v1/affiliate/account/ttshop/showcase")
    t<d> getShowCaseResp();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f78375a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(48672);
        }

        public static ProAccountApi a() {
            return (ProAccountApi) com.bytedance.ies.ugc.aweme.network.ext.a.a().a("https://oec-api.tiktokv.com").a(ProAccountApi.class);
        }
    }
}

package com.ss.android.ugc.aweme.creatortools.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import l.b.f;

public interface CanQuitBusinessAccountApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f78372a = a.f78373a;

    static {
        Covode.recordClassIndex(48669);
    }

    @f(a = "/aweme/v1/ad/ba/quitcheck/")
    t<BaseResponse> check();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f78373a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(48670);
        }
    }
}

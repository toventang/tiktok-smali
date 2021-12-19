package com.ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.model.i;
import f.a.t;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;

public interface LinkPrivacyPopupApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122056a = a.f122057a;

    static {
        Covode.recordClassIndex(80017);
    }

    @f(a = "/tiktok/v1/link/privacy/popup/status/")
    t<i> getLinkPrivacyPopupStatus();

    @o(a = "/tiktok/v1/link/privacy/popup/status/update/")
    @e
    t<BaseResponse> updateLinkPrivacyPopupStatus(@c(a = "displayed") boolean z);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f122057a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(80018);
        }
    }
}

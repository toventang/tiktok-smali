package com.ss.android.ugc.aweme.profile.editprofile.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.api.ProfileAdvancedFeaturesOrderUpdateAPI;
import f.a.t;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f116155a = new a();

    static {
        Covode.recordClassIndex(74923);
    }

    public static final class a implements a {
        static {
            Covode.recordClassIndex(74924);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.profile.editprofile.a.a
        public final t<BaseResponse> a(String str) {
            l.d(str, "");
            return ((ProfileAdvancedFeaturesOrderUpdateAPI) ProfileAdvancedFeaturesOrderUpdateAPI.a.f115986a.getValue()).updateAdvancedFeaturesOrder(str);
        }
    }
}

package com.ss.android.ugc.aweme.music.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.music.api.PinApi;
import f.a.t;
import h.f.b.l;

public interface b {
    static {
        Covode.recordClassIndex(71300);
    }

    t<BaseResponse> a(String str, String str2);

    t<BaseResponse> b(String str, String str2);

    public static final class a {
        static {
            Covode.recordClassIndex(71301);
        }

        public static t<BaseResponse> a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str, "");
            l.d(str2, "");
            return PinApi.a.a().pinMusic(str, str2);
        }

        public static t<BaseResponse> b(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str, "");
            l.d(str2, "");
            return PinApi.a.a().unpinMusic(str, str2);
        }
    }
}

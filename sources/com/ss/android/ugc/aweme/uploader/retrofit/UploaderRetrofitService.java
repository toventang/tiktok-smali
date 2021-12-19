package com.ss.android.ugc.aweme.uploader.retrofit;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.publish.f.d;
import java.util.Map;
import l.b.e;
import l.b.o;

public interface UploaderRetrofitService {
    static {
        Covode.recordClassIndex(92813);
    }

    @o(a = "/aweme/v1/upload/authkey/")
    @e
    q<d> getUploadAuthKeyConfig(@l.b.d Map<String, String> map);
}

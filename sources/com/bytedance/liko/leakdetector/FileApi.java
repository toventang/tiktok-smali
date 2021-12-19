package com.bytedance.liko.leakdetector;

import com.bytedance.covode.number.Covode;
import java.util.List;
import l.b;
import l.b.l;
import l.b.o;
import l.b.q;
import l.b.x;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;

public interface FileApi {
    static {
        Covode.recordClassIndex(24702);
    }

    @o
    @l
    b<ResponseBody> upload(@x String str, @q List<MultipartBody.Part> list);
}

package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.q;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.v;
import com.bytedance.retrofit2.b.z;
import com.bytedance.retrofit2.mime.TypedFile;
import com.google.gson.l;

public interface AfrApi {
    static {
        Covode.recordClassIndex(91981);
    }

    @t(a = "/media/api/pic/afr")
    @q
    f.a.t<ImageResponse> getImageInfo(@z(a = "algorithms") String str, @z(a = "key") String str2, @z(a = "algorithm_type") String str3, @v(a = "file") TypedFile typedFile, @v(a = "conf") l lVar);

    @t(a = "/media/api/pic/video")
    @q
    f.a.t<VideoResponse> getVideoInfo(@z(a = "algorithm") String str, @z(a = "key") String str2, @z(a = "algorithm_type") int i2, @v(a = "file") TypedFile typedFile, @v(a = "conf") l lVar);
}

package com.kakao.network;

import com.bytedance.covode.number.Covode;
import com.kakao.network.multipart.Part;
import java.util.List;
import java.util.Map;

public interface IRequest {
    static {
        Covode.recordClassIndex(34362);
    }

    String getBodyEncoding();

    Map<String, String> getHeaders();

    String getMethod();

    List<Part> getMultiPartList();

    Map<String, String> getParams();

    String getUrl();
}

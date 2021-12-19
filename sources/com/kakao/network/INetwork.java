package com.kakao.network;

import com.bytedance.covode.number.Covode;
import com.kakao.network.multipart.Part;

public interface INetwork {
    static {
        Covode.recordClassIndex(34361);
    }

    void addHeader(String str, String str2);

    void addParam(String str, String str2);

    void addPart(Part part);

    void configure();

    void connect();

    void create(String str, String str2, String str3);

    void disconnect();

    int getStatusCode();

    byte[] readFully();
}

package com.bytedance.vcloud.mlcomponent_api;

import com.bytedance.covode.number.Covode;

public interface IMLComponentDownLoader {
    static {
        Covode.recordClassIndex(28023);
    }

    String decrypt(String str);

    boolean downloadModelPackage(String str, String str2, String str3);

    boolean unzipModelPackage(String str, String str2);
}

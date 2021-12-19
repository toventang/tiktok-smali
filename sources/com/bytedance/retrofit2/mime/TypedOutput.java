package com.bytedance.retrofit2.mime;

import com.bytedance.covode.number.Covode;
import java.io.OutputStream;

public interface TypedOutput {
    static {
        Covode.recordClassIndex(26052);
    }

    String fileName();

    long length();

    String md5Stub();

    String mimeType();

    void writeTo(OutputStream outputStream);
}

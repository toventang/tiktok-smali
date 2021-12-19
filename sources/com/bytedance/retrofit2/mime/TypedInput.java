package com.bytedance.retrofit2.mime;

import com.bytedance.covode.number.Covode;
import java.io.InputStream;

public interface TypedInput {
    static {
        Covode.recordClassIndex(26051);
    }

    InputStream in();

    long length();

    String mimeType();
}

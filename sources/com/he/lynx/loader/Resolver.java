package com.he.lynx.loader;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public interface Resolver {
    static {
        Covode.recordClassIndex(34216);
    }

    void reject(IOException iOException);

    void resolve(File file);

    void resolve(ByteBuffer byteBuffer);

    void resolve(byte[] bArr, int i2, int i3);
}

package org.apache.commons.codec.binary;

import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import org.apache.commons.codec.Charsets;

public class StringUtils {
    static {
        Covode.recordClassIndex(106349);
    }

    public static String newStringUtf8(byte[] bArr) {
        return newString(bArr, Charsets.UTF_8);
    }

    private static String newString(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }
}

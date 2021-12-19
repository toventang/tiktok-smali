package com.bytedance.im.core.internal.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.proto.Response;
import net.jpountz.lz4.LZ4Exception;
import net.jpountz.lz4.LZ4Factory;

public final class l {
    static {
        Covode.recordClassIndex(23104);
    }

    private static byte[] a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return LZ4Factory.fastestInstance().safeDecompressor().decompress(bArr, bArr.length * 3);
        } catch (LZ4Exception e2) {
            e2.printStackTrace();
            f.b("imsdk", "SSEncodeAndDecode lz4Decompress", e2);
            return LZ4Factory.fastestInstance().safeDecompressor().decompress(bArr, 51200);
        }
    }

    public static Response a(String str, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            if ("__lz4".equals(str)) {
                bArr = a(bArr);
            }
            return Response.ADAPTER.decode(bArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            f.b("imsdk", "SSEncodeAndDecode decode", e2);
            b bVar = new b(-2003);
            bVar.setStackTrace(e2.getStackTrace());
            throw bVar;
        }
    }
}

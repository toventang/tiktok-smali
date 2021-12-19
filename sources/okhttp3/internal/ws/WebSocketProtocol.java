package okhttp3.internal.ws;

import com.bytedance.covode.number.Covode;
import k.f;
import k.i;

public final class WebSocketProtocol {
    static {
        Covode.recordClassIndex(106327);
    }

    private WebSocketProtocol() {
        throw new AssertionError("No instances.");
    }

    static void validateCloseCode(int i2) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i2);
        if (closeCodeExceptionMessage != null) {
            throw new IllegalArgumentException(closeCodeExceptionMessage);
        }
    }

    public static String acceptHeader(String str) {
        return i.encodeUtf8(str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
    }

    static String closeCodeExceptionMessage(int i2) {
        if (i2 < 1000 || i2 >= 5000) {
            return "Code must be in range [1000,5000): ".concat(String.valueOf(i2));
        }
        if ((i2 < 1004 || i2 > 1006) && (i2 < 1012 || i2 > 2999)) {
            return null;
        }
        return "Code " + i2 + " is reserved and may not be used.";
    }

    static void toggleMask(f.b bVar, byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        do {
            byte[] bArr2 = bVar.f158868d;
            int i3 = bVar.f158869e;
            int i4 = bVar.f158870f;
            while (i3 < i4) {
                int i5 = i2 % length;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i5]);
                i3++;
                i2 = i5 + 1;
            }
        } while (bVar.a() != -1);
    }
}

package okhttp3.internal.http2;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import k.i;
import okhttp3.internal.Util;

public final class Http2 {
    static final String[] BINARY = new String[256];
    static final i CONNECTION_PREFACE = i.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    static final String[] FLAGS = new String[64];
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    private Http2() {
    }

    static {
        Covode.recordClassIndex(106255);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = BINARY;
            if (i3 >= strArr.length) {
                break;
            }
            strArr[i3] = Util.format("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
            i3++;
        }
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i4 = 0; i4 <= 0; i4++) {
            int i5 = iArr[i4];
            String[] strArr3 = FLAGS;
            strArr3[i5 | 8] = strArr3[i5] + "|PADDED";
        }
        String[] strArr4 = FLAGS;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i6 = 0;
        do {
            int i7 = iArr2[i6];
            int i8 = 0;
            do {
                int i9 = iArr[i8];
                String[] strArr5 = FLAGS;
                int i10 = i9 | i7;
                strArr5[i10] = strArr5[i9] + '|' + strArr5[i7];
                strArr5[i10 | 8] = strArr5[i9] + '|' + strArr5[i7] + "|PADDED";
                i8++;
            } while (i8 <= 0);
            i6++;
        } while (i6 < 3);
        while (true) {
            String[] strArr6 = FLAGS;
            if (i2 < strArr6.length) {
                if (strArr6[i2] == null) {
                    strArr6[i2] = BINARY[i2];
                }
                i2++;
            } else {
                return;
            }
        }
    }

    static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(Util.format(str, objArr));
    }

    static IOException ioException(String str, Object... objArr) {
        throw new IOException(Util.format(str, objArr));
    }

    static String formatFlags(byte b2, byte b3) {
        String str;
        if (b3 == 0) {
            return "";
        }
        if (!(b2 == 2 || b2 == 3)) {
            if (b2 == 4 || b2 == 6) {
                if (b3 == 1) {
                    return "ACK";
                }
                return BINARY[b3];
            } else if (!(b2 == 7 || b2 == 8)) {
                String[] strArr = FLAGS;
                if (b3 < strArr.length) {
                    str = strArr[b3];
                } else {
                    str = BINARY[b3];
                }
                if (b2 == 5) {
                    if ((b3 & 4) != 0) {
                        return str.replace("HEADERS", "PUSH_PROMISE");
                    }
                } else if (b2 == 0 && (b3 & 32) != 0) {
                    return str.replace("PRIORITY", "COMPRESSED");
                }
                return str;
            }
        }
        return BINARY[b3];
    }

    static String frameLog(boolean z, int i2, int i3, byte b2, byte b3) {
        String format;
        String str;
        String[] strArr = FRAME_NAMES;
        if (b2 < strArr.length) {
            format = strArr[b2];
        } else {
            format = Util.format("0x%02x", Byte.valueOf(b2));
        }
        String formatFlags = formatFlags(b2, b3);
        Object[] objArr = new Object[5];
        if (z) {
            str = "<<";
        } else {
            str = ">>";
        }
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = format;
        objArr[4] = formatFlags;
        return Util.format("%s 0x%08x %5d %-13s %s", objArr);
    }
}

package okhttp3.internal.tls;

import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.covode.number.Covode;
import javax.security.auth.x500.X500Principal;

final class DistinguishedNameParser {
    private int beg;
    private char[] chars;
    private int cur;
    private final String dn;
    private int end;
    private final int length;
    private int pos;

    static {
        Covode.recordClassIndex(106316);
    }

    private char getEscaped() {
        int i2 = this.pos + 1;
        this.pos = i2;
        if (i2 != this.length) {
            char[] cArr = this.chars;
            char c2 = cArr[i2];
            if (!(c2 == ' ' || c2 == '%' || c2 == '\\' || c2 == '_' || c2 == '\"' || c2 == '#')) {
                switch (c2) {
                    case '*':
                    case '+':
                    case BuildConfig.VERSION_CODE:
                        break;
                    default:
                        switch (c2) {
                            case ';':
                            case AudiencePingIntervalSetting.DEFAULT:
                            case '=':
                            case '>':
                                break;
                            default:
                                return getUTF8();
                        }
                }
            }
            return cArr[i2];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.dn);
    }

    private char getUTF8() {
        int i2;
        int i3;
        int i4 = getByte(this.pos);
        this.pos++;
        if (i4 < 128) {
            return (char) i4;
        }
        if (i4 < 192 || i4 > 247) {
            return '?';
        }
        if (i4 <= 223) {
            i3 = i4 & 31;
            i2 = 1;
        } else if (i4 <= 239) {
            i2 = 2;
            i3 = i4 & 15;
        } else {
            i2 = 3;
            i3 = i4 & 7;
        }
        int i5 = 0;
        do {
            int i6 = this.pos + 1;
            this.pos = i6;
            if (i6 == this.length || this.chars[i6] != '\\') {
                return '?';
            }
            int i7 = i6 + 1;
            this.pos = i7;
            int i8 = getByte(i7);
            this.pos++;
            if ((i8 & 192) != 128) {
                return '?';
            }
            i3 = (i3 << 6) + (i8 & 63);
            i5++;
        } while (i5 < i2);
        return (char) i3;
    }

    private String quotedAV() {
        int i2 = this.pos + 1;
        this.pos = i2;
        this.beg = i2;
        this.end = i2;
        while (true) {
            int i3 = this.pos;
            if (i3 != this.length) {
                char[] cArr = this.chars;
                if (cArr[i3] == '\"') {
                    this.pos = i3 + 1;
                    while (true) {
                        int i4 = this.pos;
                        if (i4 >= this.length || this.chars[i4] != ' ') {
                            char[] cArr2 = this.chars;
                            int i5 = this.beg;
                        } else {
                            this.pos = i4 + 1;
                        }
                    }
                    char[] cArr22 = this.chars;
                    int i52 = this.beg;
                    return new String(cArr22, i52, this.end - i52);
                }
                if (cArr[i3] == '\\') {
                    cArr[this.end] = getEscaped();
                } else {
                    cArr[this.end] = cArr[i3];
                }
                this.pos++;
                this.end++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.dn);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        r2 = r8.chars;
        r1 = r8.beg;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        return new java.lang.String(r2, r1, r8.end - r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String escapedAV() {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.DistinguishedNameParser.escapedAV():java.lang.String");
    }

    private String hexAV() {
        int i2;
        int i3 = this.pos;
        if (i3 + 4 < this.length) {
            this.beg = i3;
            this.pos = i3 + 1;
            while (true) {
                i2 = this.pos;
                if (i2 == this.length) {
                    break;
                }
                char[] cArr = this.chars;
                if (cArr[i2] == '+' || cArr[i2] == ',' || cArr[i2] == ';') {
                    break;
                } else if (cArr[i2] == ' ') {
                    this.end = i2;
                    this.pos = i2 + 1;
                    while (true) {
                        int i4 = this.pos;
                        if (i4 >= this.length || this.chars[i4] != ' ') {
                            break;
                        }
                        this.pos = i4 + 1;
                    }
                } else {
                    if (cArr[i2] >= 'A' && cArr[i2] <= 'F') {
                        cArr[i2] = (char) (cArr[i2] + ' ');
                    }
                    this.pos = i2 + 1;
                }
            }
            this.end = i2;
            int i5 = this.end;
            int i6 = this.beg;
            int i7 = i5 - i6;
            if (i7 < 5 || (i7 & 1) == 0) {
                throw new IllegalStateException("Unexpected end of DN: " + this.dn);
            }
            int i8 = i7 / 2;
            byte[] bArr = new byte[i8];
            int i9 = i6 + 1;
            for (int i10 = 0; i10 < i8; i10++) {
                bArr[i10] = (byte) getByte(i9);
                i9 += 2;
            }
            return new String(this.chars, this.beg, i7);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.dn);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String nextAT() {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.DistinguishedNameParser.nextAT():java.lang.String");
    }

    DistinguishedNameParser(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.dn = name;
        this.length = name.length();
    }

    private int getByte(int i2) {
        int i3;
        int i4;
        int i5 = i2 + 1;
        if (i5 < this.length) {
            char[] cArr = this.chars;
            char c2 = cArr[i2];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            } else {
                i3 = c2 - '7';
            }
            char c3 = cArr[i5];
            if (c3 >= '0' && c3 <= '9') {
                i4 = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i4 = c3 - 'W';
            } else if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            } else {
                i4 = c3 - '7';
            }
            return (i3 << 4) + i4;
        }
        throw new IllegalStateException("Malformed DN: " + this.dn);
    }

    public final String findMostSpecific(String str) {
        String quotedAV;
        this.pos = 0;
        this.beg = 0;
        this.end = 0;
        this.cur = 0;
        this.chars = this.dn.toCharArray();
        String nextAT = nextAT();
        if (nextAT == null) {
            return null;
        }
        do {
            int i2 = this.pos;
            if (i2 == this.length) {
                return null;
            }
            char c2 = this.chars[i2];
            if (c2 == '\"') {
                quotedAV = quotedAV();
            } else if (c2 == '#') {
                quotedAV = hexAV();
            } else if (c2 == '+' || c2 == ',' || c2 == ';') {
                quotedAV = "";
            } else {
                quotedAV = escapedAV();
            }
            if (str.equalsIgnoreCase(nextAT)) {
                return quotedAV;
            }
            int i3 = this.pos;
            if (i3 >= this.length) {
                return null;
            }
            char[] cArr = this.chars;
            if (cArr[i3] == ',' || cArr[i3] == ';' || cArr[i3] == '+') {
                this.pos = i3 + 1;
                nextAT = nextAT();
            } else {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
        } while (nextAT != null);
        throw new IllegalStateException("Malformed DN: " + this.dn);
    }
}

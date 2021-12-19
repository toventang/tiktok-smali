package k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class i implements Serializable, Comparable<i> {
    public static final a Companion = new a((byte) 0);
    public static final i EMPTY = k.a.a.f158856b;
    public static final char[] HEX_DIGITS = k.a.a.f158855a;
    private static final long serialVersionUID = 1;

    /* renamed from: a  reason: collision with root package name */
    private transient int f158874a;

    /* renamed from: b  reason: collision with root package name */
    private transient String f158875b;
    private final byte[] data;

    public static final i encodeUtf8(String str) {
        return a.a(str);
    }

    public static final i of(byte... bArr) {
        return a.a(bArr);
    }

    public static final i read(InputStream inputStream, int i2) {
        return a.a(inputStream, i2);
    }

    public final int indexOf(i iVar) {
        return indexOf$default(this, iVar, 0, 2, (Object) null);
    }

    public int indexOf(byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final int lastIndexOf(i iVar) {
        return lastIndexOf$default(this, iVar, 0, 2, (Object) null);
    }

    public int lastIndexOf(byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public i substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public i substring(int i2) {
        return substring$default(this, i2, 0, 2, null);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(105432);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static i a(String str) {
            l.c(str, "");
            return k.a.a.a(str);
        }

        public static i a(byte... bArr) {
            l.c(bArr, "");
            return k.a.a.a(bArr);
        }

        public static i a(InputStream inputStream, int i2) {
            MethodCollector.i(4152);
            l.c(inputStream, "");
            int i3 = 0;
            if (i2 >= 0) {
                byte[] bArr = new byte[i2];
                while (i3 < i2) {
                    int read = inputStream.read(bArr, i3, i2 - i3);
                    if (read != -1) {
                        i3 += read;
                    } else {
                        EOFException eOFException = new EOFException();
                        MethodCollector.o(4152);
                        throw eOFException;
                    }
                }
                i iVar = new i(bArr);
                MethodCollector.o(4152);
                return iVar;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(i2)).toString());
            MethodCollector.o(4152);
            throw illegalArgumentException;
        }
    }

    public final byte[] getData$jvm() {
        return this.data;
    }

    public final int getHashCode$jvm() {
        return this.f158874a;
    }

    public final String getUtf8$jvm() {
        return this.f158875b;
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m233deprecated_size() {
        return size();
    }

    public i md5() {
        return a("MD5");
    }

    public i sha1() {
        return a("SHA-1");
    }

    public i sha256() {
        return a("SHA-256");
    }

    public i sha512() {
        return a("SHA-512");
    }

    public final int size() {
        return getSize$jvm();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        l.a((Object) asReadOnlyBuffer, "");
        return asReadOnlyBuffer;
    }

    public String base64() {
        l.c(this, "");
        return a.a(getData$jvm(), a.f158853a);
    }

    public String base64Url() {
        l.c(this, "");
        return a.a(getData$jvm(), a.f158854b);
    }

    public int getSize$jvm() {
        l.c(this, "");
        return getData$jvm().length;
    }

    public byte[] internalArray$jvm() {
        l.c(this, "");
        return getData$jvm();
    }

    static {
        Covode.recordClassIndex(105431);
    }

    public int hashCode() {
        l.c(this, "");
        int hashCode$jvm = getHashCode$jvm();
        if (hashCode$jvm != 0) {
            return hashCode$jvm;
        }
        byte[] data$jvm = getData$jvm();
        l.c(data$jvm, "");
        setHashCode$jvm(Arrays.hashCode(data$jvm));
        return getHashCode$jvm();
    }

    public byte[] toByteArray() {
        l.c(this, "");
        byte[] data$jvm = getData$jvm();
        byte[] copyOf = Arrays.copyOf(data$jvm, data$jvm.length);
        l.a((Object) copyOf, "");
        return copyOf;
    }

    public String utf8() {
        l.c(this, "");
        String utf8$jvm = getUtf8$jvm();
        if (utf8$jvm != null) {
            return utf8$jvm;
        }
        String a2 = b.a(getData$jvm());
        setUtf8$jvm(a2);
        return a2;
    }

    public String hex() {
        l.c(this, "");
        char[] cArr = new char[(getData$jvm().length * 2)];
        byte[] data$jvm = getData$jvm();
        int i2 = 0;
        for (byte b2 : data$jvm) {
            int i3 = i2 + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i2] = cArr2[(b2 >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b2 & 15];
        }
        l.c(cArr, "");
        return new String(cArr);
    }

    public i toAsciiLowercase() {
        l.c(this, "");
        for (int i2 = 0; i2 < getData$jvm().length; i2++) {
            byte b2 = getData$jvm()[i2];
            if (b2 >= 65 && b2 <= 90) {
                byte[] data$jvm = getData$jvm();
                byte[] copyOf = Arrays.copyOf(data$jvm, data$jvm.length);
                l.a((Object) copyOf, "");
                copyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b3 = copyOf[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        copyOf[i3] = (byte) (b3 + 32);
                    }
                }
                return new i(copyOf);
            }
        }
        return this;
    }

    public i toAsciiUppercase() {
        l.c(this, "");
        for (int i2 = 0; i2 < getData$jvm().length; i2++) {
            byte b2 = getData$jvm()[i2];
            if (b2 >= 97 && b2 <= 122) {
                byte[] data$jvm = getData$jvm();
                byte[] copyOf = Arrays.copyOf(data$jvm, data$jvm.length);
                l.a((Object) copyOf, "");
                copyOf[i2] = (byte) (b2 - 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b3 = copyOf[i3];
                    if (b3 >= 97 && b3 <= 122) {
                        copyOf[i3] = (byte) (b3 - 32);
                    }
                }
                return new i(copyOf);
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r6 <= 1114111) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (55296 <= r6) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        if (r6 >= r13) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008b, code lost:
        if (57343 < r6) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0090, code lost:
        if (r6 == 10) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r6 == 13) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        if (r6 < 0) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
        if (31 >= r6) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (127 <= r6) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        if (r6 != 65533) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        if (159 < r6) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a8, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00aa, code lost:
        if (r6 >= 65536) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ad, code lost:
        r7 = r7 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ae, code lost:
        if (r6 >= 128) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        if (r6 >= 2048) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b8, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ba, code lost:
        if (r6 >= 65536) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bc, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00be, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c0, code lost:
        r0 = 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 382
        */
        throw new UnsupportedOperationException("Method not decompiled: k.i.toString():java.lang.String");
    }

    public final void setHashCode$jvm(int i2) {
        this.f158874a = i2;
    }

    public final void setUtf8$jvm(String str) {
        this.f158875b = str;
    }

    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m232deprecated_getByte(int i2) {
        return getByte(i2);
    }

    public final byte getByte(int i2) {
        return internalGet$jvm(i2);
    }

    public i(byte[] bArr) {
        l.c(bArr, "");
        this.data = bArr;
    }

    public i hmacSha1(i iVar) {
        l.c(iVar, "");
        return a("HmacSHA1", iVar);
    }

    public i hmacSha256(i iVar) {
        l.c(iVar, "");
        return a("HmacSHA256", iVar);
    }

    public i hmacSha512(i iVar) {
        l.c(iVar, "");
        return a("HmacSHA512", iVar);
    }

    public byte internalGet$jvm(int i2) {
        l.c(this, "");
        return getData$jvm()[i2];
    }

    public String string(Charset charset) {
        l.c(charset, "");
        return new String(this.data, charset);
    }

    public void write$jvm(f fVar) {
        l.c(fVar, "");
        byte[] bArr = this.data;
        fVar.a(bArr, 0, bArr.length);
    }

    private final i a(String str) {
        byte[] digest = MessageDigest.getInstance(str).digest(this.data);
        l.a((Object) digest, "");
        return new i(digest);
    }

    public static final i of(ByteBuffer byteBuffer) {
        l.c(byteBuffer, "");
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new i(bArr);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        i a2 = a.a(objectInputStream, objectInputStream.readInt());
        Field declaredField = i.class.getDeclaredField("data");
        l.a((Object) declaredField, "");
        declaredField.setAccessible(true);
        declaredField.set(this, a2.data);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        MethodCollector.i(3616);
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
        MethodCollector.o(3616);
    }

    public final boolean endsWith(i iVar) {
        l.c(iVar, "");
        l.c(this, "");
        l.c(iVar, "");
        return rangeEquals(size() - iVar.size(), iVar, 0, iVar.size());
    }

    public final boolean startsWith(i iVar) {
        l.c(iVar, "");
        l.c(this, "");
        l.c(iVar, "");
        return rangeEquals(0, iVar, 0, iVar.size());
    }

    public void write(OutputStream outputStream) {
        MethodCollector.i(3584);
        l.c(outputStream, "");
        outputStream.write(this.data);
        MethodCollector.o(3584);
    }

    public int compareTo(i iVar) {
        l.c(iVar, "");
        l.c(this, "");
        l.c(iVar, "");
        int size = size();
        int size2 = iVar.size();
        int min = Math.min(size, size2);
        for (int i2 = 0; i2 < min; i2++) {
            int i3 = getByte(i2) & 255;
            int i4 = iVar.getByte(i2) & 255;
            if (i3 != i4) {
                if (i3 < i4) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        if (size == size2) {
            return 0;
        }
        if (size < size2) {
            return -1;
        }
        return 1;
    }

    public final boolean endsWith(byte[] bArr) {
        l.c(bArr, "");
        l.c(this, "");
        l.c(bArr, "");
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public boolean equals(Object obj) {
        l.c(this, "");
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.size() != getData$jvm().length || !iVar.rangeEquals(0, getData$jvm(), 0, getData$jvm().length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean startsWith(byte[] bArr) {
        l.c(bArr, "");
        l.c(this, "");
        l.c(bArr, "");
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public static final i decodeHex(String str) {
        l.c(str, "");
        l.c(str, "");
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) ((k.a.a.a(str.charAt(i3)) << 4) + k.a.a.a(str.charAt(i3 + 1)));
            }
            return new i(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(String.valueOf(str)).toString());
    }

    public static final i decodeBase64(String str) {
        int i2;
        l.c(str, "");
        l.c(str, "");
        l.c(str, "");
        int length = str.length();
        while (length > 0 && ((r1 = str.charAt(length - 1)) == '=' || r1 == '\n' || r1 == '\r' || r1 == ' ' || r1 == '\t')) {
            length--;
        }
        int i3 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if ('A' <= charAt && 'Z' >= charAt) {
                i2 = charAt - 'A';
            } else if ('a' <= charAt && 'z' >= charAt) {
                i2 = charAt - 'G';
            } else if ('0' <= charAt && '9' >= charAt) {
                i2 = charAt + 4;
            } else if (charAt == '+' || charAt == '-') {
                i2 = 62;
            } else if (charAt == '/' || charAt == '_') {
                i2 = 63;
            } else {
                if (!(charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
                    return null;
                }
            }
            i5 = (i5 << 6) | i2;
            i4++;
            if (i4 % 4 == 0) {
                int i8 = i6 + 1;
                bArr[i6] = (byte) (i5 >> 16);
                int i9 = i8 + 1;
                bArr[i8] = (byte) (i5 >> 8);
                i6 = i9 + 1;
                bArr[i9] = (byte) i5;
            }
        }
        int i10 = i4 % 4;
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            bArr[i6] = (byte) ((i5 << 12) >> 16);
            i6++;
        } else if (i10 == 3) {
            int i11 = i5 << 6;
            int i12 = i6 + 1;
            bArr[i6] = (byte) (i11 >> 16);
            i6 = i12 + 1;
            bArr[i12] = (byte) (i11 >> 8);
        }
        if (i6 != i3) {
            byte[] bArr2 = new byte[i6];
            b.a(bArr, 0, bArr2, 0, i6);
            bArr = bArr2;
        }
        return new i(bArr);
    }

    public final int indexOf(i iVar, int i2) {
        l.c(iVar, "");
        return indexOf(iVar.internalArray$jvm(), i2);
    }

    public final int lastIndexOf(i iVar, int i2) {
        l.c(iVar, "");
        return lastIndexOf(iVar.internalArray$jvm(), i2);
    }

    public static final i encodeString(String str, Charset charset) {
        l.c(str, "");
        l.c(charset, "");
        byte[] bytes = str.getBytes(charset);
        l.a((Object) bytes, "");
        return new i(bytes);
    }

    public i substring(int i2, int i3) {
        return k.a.a.a(this, i2, i3);
    }

    private final i a(String str, i iVar) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(iVar.toByteArray(), str));
            byte[] doFinal = instance.doFinal(this.data);
            l.a((Object) doFinal, "");
            return new i(doFinal);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public int indexOf(byte[] bArr, int i2) {
        l.c(bArr, "");
        l.c(this, "");
        l.c(bArr, "");
        int length = getData$jvm().length - bArr.length;
        int max = Math.max(i2, 0);
        if (max > length) {
            return -1;
        }
        while (!c.a(getData$jvm(), max, bArr, 0, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public int lastIndexOf(byte[] bArr, int i2) {
        l.c(bArr, "");
        for (int min = Math.min(i2, this.data.length - bArr.length); min >= 0; min--) {
            if (c.a(this.data, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public static final i of(byte[] bArr, int i2, int i3) {
        l.c(bArr, "");
        c.a((long) bArr.length, (long) i2, (long) i3);
        byte[] bArr2 = new byte[i3];
        b.a(bArr, i2, bArr2, 0, i3);
        return new i(bArr2);
    }

    public boolean rangeEquals(int i2, i iVar, int i3, int i4) {
        l.c(iVar, "");
        l.c(this, "");
        l.c(iVar, "");
        return iVar.rangeEquals(i3, getData$jvm(), i2, i4);
    }

    public boolean rangeEquals(int i2, byte[] bArr, int i3, int i4) {
        l.c(bArr, "");
        l.c(this, "");
        l.c(bArr, "");
        if (i2 < 0 || i2 > getData$jvm().length - i4 || i3 < 0 || i3 > bArr.length - i4 || !c.a(getData$jvm(), i2, bArr, i3, i4)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ int indexOf$default(i iVar, i iVar2, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return iVar.indexOf(iVar2, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(i iVar, i iVar2, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = iVar.size();
            }
            return iVar.lastIndexOf(iVar2, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static /* synthetic */ i substring$default(i iVar, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = iVar.size();
            }
            return iVar.substring(i2, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public static /* synthetic */ int indexOf$default(i iVar, byte[] bArr, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return iVar.indexOf(bArr, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(i iVar, byte[] bArr, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = iVar.size();
            }
            return iVar.lastIndexOf(bArr, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }
}

package k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class x extends i {

    /* renamed from: a  reason: collision with root package name */
    private final transient byte[][] f158922a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int[] f158923b;

    static {
        Covode.recordClassIndex(105452);
    }

    public final int[] getDirectory() {
        return this.f158923b;
    }

    public final byte[][] getSegments() {
        return this.f158922a;
    }

    private final Object writeReplace() {
        return a();
    }

    @Override // k.i
    public final byte[] internalArray$jvm() {
        return toByteArray();
    }

    private final i a() {
        return new i(toByteArray());
    }

    @Override // k.i
    public final ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // k.i
    public final String base64() {
        return a().base64();
    }

    @Override // k.i
    public final String base64Url() {
        return a().base64Url();
    }

    @Override // k.i
    public final int getSize$jvm() {
        return this.f158923b[this.f158922a.length - 1];
    }

    @Override // k.i
    public final String hex() {
        return a().hex();
    }

    @Override // k.i
    public final i md5() {
        return a().md5();
    }

    @Override // k.i
    public final i sha1() {
        return a().sha1();
    }

    @Override // k.i
    public final i sha256() {
        return a().sha256();
    }

    @Override // k.i
    public final i sha512() {
        return a().sha512();
    }

    @Override // k.i
    public final i toAsciiLowercase() {
        return a().toAsciiLowercase();
    }

    @Override // k.i
    public final i toAsciiUppercase() {
        return a().toAsciiUppercase();
    }

    @Override // k.i
    public final String toString() {
        return a().toString();
    }

    @Override // k.i
    public final String utf8() {
        return a().utf8();
    }

    @Override // k.i
    public final int hashCode() {
        int hashCode$jvm = getHashCode$jvm();
        if (hashCode$jvm != 0) {
            return hashCode$jvm;
        }
        int length = this.f158922a.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f158922a[i2];
            int[] iArr = this.f158923b;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        setHashCode$jvm(i4);
        return i4;
    }

    @Override // k.i
    public final byte[] toByteArray() {
        int[] iArr = this.f158923b;
        byte[][] bArr = this.f158922a;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr2 = this.f158923b;
            int i4 = iArr2[length + i2];
            int i5 = iArr2[i2];
            b.a(this.f158922a[i2], i4, bArr2, i3, i5 - i3);
            i2++;
            i3 = i5;
        }
        return bArr2;
    }

    @Override // k.i
    public final i hmacSha1(i iVar) {
        l.c(iVar, "");
        return a().hmacSha1(iVar);
    }

    @Override // k.i
    public final i hmacSha256(i iVar) {
        l.c(iVar, "");
        return a().hmacSha256(iVar);
    }

    @Override // k.i
    public final i hmacSha512(i iVar) {
        l.c(iVar, "");
        return a().hmacSha512(iVar);
    }

    @Override // k.i
    public final String string(Charset charset) {
        l.c(charset, "");
        return a().string(charset);
    }

    private final int a(int i2) {
        int binarySearch = Arrays.binarySearch(this.f158923b, 0, this.f158922a.length, i2 + 1);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return binarySearch ^ -1;
    }

    @Override // k.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.size() != size() || !rangeEquals(0, iVar, 0, size())) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // k.i
    public final byte internalGet$jvm(int i2) {
        int i3;
        c.a((long) this.f158923b[this.f158922a.length - 1], (long) i2, 1);
        int a2 = a(i2);
        if (a2 == 0) {
            i3 = 0;
        } else {
            i3 = this.f158923b[a2 - 1];
        }
        int[] iArr = this.f158923b;
        byte[][] bArr = this.f158922a;
        return bArr[a2][(i2 - i3) + iArr[bArr.length + a2]];
    }

    @Override // k.i
    public final void write(OutputStream outputStream) {
        MethodCollector.i(4089);
        l.c(outputStream, "");
        int length = this.f158922a.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f158923b;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            outputStream.write(this.f158922a[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        MethodCollector.o(4089);
    }

    @Override // k.i
    public final void write$jvm(f fVar) {
        l.c(fVar, "");
        int length = this.f158922a.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f158923b;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            v vVar = new v(this.f158922a[i2], i4, (i4 + i5) - i3, true, false);
            if (fVar.f158863a == null) {
                vVar.f158918g = vVar;
                vVar.f158917f = vVar.f158918g;
                fVar.f158863a = vVar.f158917f;
            } else {
                v vVar2 = fVar.f158863a;
                if (vVar2 == null) {
                    l.a();
                }
                v vVar3 = vVar2.f158918g;
                if (vVar3 == null) {
                    l.a();
                }
                vVar3.a(vVar);
            }
            i2++;
            i3 = i5;
        }
        fVar.f158864b += (long) i3;
    }

    @Override // k.i
    public final int indexOf(byte[] bArr, int i2) {
        l.c(bArr, "");
        return a().indexOf(bArr, i2);
    }

    @Override // k.i
    public final int lastIndexOf(byte[] bArr, int i2) {
        l.c(bArr, "");
        return a().lastIndexOf(bArr, i2);
    }

    @Override // k.i
    public final i substring(int i2, int i3) {
        return a().substring(i2, i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(f fVar, int i2) {
        super(i.EMPTY.getData$jvm());
        l.c(fVar, "");
        c.a(fVar.f158864b, 0, (long) i2);
        v vVar = fVar.f158863a;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            if (vVar == null) {
                l.a();
            }
            if (vVar.f158914c != vVar.f158913b) {
                i4 += vVar.f158914c - vVar.f158913b;
                i5++;
                vVar = vVar.f158917f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i5][];
        this.f158923b = new int[(i5 * 2)];
        v vVar2 = fVar.f158863a;
        int i6 = 0;
        while (i3 < i2) {
            if (vVar2 == null) {
                l.a();
            }
            bArr[i6] = vVar2.f158912a;
            i3 += vVar2.f158914c - vVar2.f158913b;
            if (i3 > i2) {
                i3 = i2;
            }
            int[] iArr = this.f158923b;
            iArr[i6] = i3;
            iArr[bArr.length + i6] = vVar2.f158913b;
            vVar2.f158915d = true;
            i6++;
            vVar2 = vVar2.f158917f;
        }
        this.f158922a = bArr;
    }

    @Override // k.i
    public final boolean rangeEquals(int i2, i iVar, int i3, int i4) {
        int i5;
        l.c(iVar, "");
        if (i2 < 0 || i2 > size() - i4) {
            return false;
        }
        int a2 = a(i2);
        while (i4 > 0) {
            if (a2 == 0) {
                i5 = 0;
            } else {
                i5 = this.f158923b[a2 - 1];
            }
            int min = Math.min(i4, ((this.f158923b[a2] - i5) + i5) - i2);
            int[] iArr = this.f158923b;
            byte[][] bArr = this.f158922a;
            if (!iVar.rangeEquals(i3, bArr[a2], (i2 - i5) + iArr[bArr.length + a2], min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            a2++;
        }
        return true;
    }

    @Override // k.i
    public final boolean rangeEquals(int i2, byte[] bArr, int i3, int i4) {
        int i5;
        l.c(bArr, "");
        if (i2 < 0 || i2 > size() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int a2 = a(i2);
        while (i4 > 0) {
            if (a2 == 0) {
                i5 = 0;
            } else {
                i5 = this.f158923b[a2 - 1];
            }
            int min = Math.min(i4, ((this.f158923b[a2] - i5) + i5) - i2);
            int[] iArr = this.f158923b;
            byte[][] bArr2 = this.f158922a;
            if (!c.a(bArr2[a2], (i2 - i5) + iArr[bArr2.length + a2], bArr, i3, min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            a2++;
        }
        return true;
    }
}

package h.a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

public class l extends k {

    public static final class a extends d<Integer> implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f158650b;

        static {
            Covode.recordClassIndex(105071);
        }

        @Override // h.a.a
        public final int a() {
            return this.f158650b.length;
        }

        @Override // h.a.a
        public final boolean isEmpty() {
            if (this.f158650b.length == 0) {
                return true;
            }
            return false;
        }

        a(int[] iArr) {
            this.f158650b = iArr;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.List, h.a.d
        public final /* synthetic */ Integer get(int i2) {
            return Integer.valueOf(this.f158650b[i2]);
        }

        @Override // h.a.a
        public final boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return i.a(this.f158650b, ((Number) obj).intValue());
        }

        @Override // h.a.d
        public final int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return i.b(this.f158650b, ((Number) obj).intValue());
        }

        @Override // h.a.d
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            int intValue = ((Number) obj).intValue();
            int[] iArr = this.f158650b;
            h.f.b.l.d(iArr, "");
            for (int length = iArr.length - 1; length >= 0; length--) {
                if (intValue == iArr[length]) {
                    return length;
                }
            }
            return -1;
        }
    }

    static {
        Covode.recordClassIndex(105070);
    }

    public static /* synthetic */ Object[] a(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        return i.a(objArr, objArr2, i2, i3, i4);
    }

    public static final List<Integer> a(int[] iArr) {
        h.f.b.l.d(iArr, "");
        return new a(iArr);
    }

    public static final <T> void b(T[] tArr) {
        h.f.b.l.d(tArr, "");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> List<T> a(T[] tArr) {
        h.f.b.l.d(tArr, "");
        List<T> asList = Arrays.asList(tArr);
        h.f.b.l.b(asList, "");
        return asList;
    }

    public static final <T> void a(T[] tArr, Comparator<? super T> comparator) {
        h.f.b.l.d(tArr, "");
        h.f.b.l.d(comparator, "");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static final <T> T[] a(T[] tArr, int i2) {
        h.f.b.l.d(tArr, "");
        i.a(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, 1, i2);
        h.f.b.l.b(tArr2, "");
        return tArr2;
    }

    public static final void a(float[] fArr, float f2, int i2) {
        h.f.b.l.d(fArr, "");
        Arrays.fill(fArr, 0, i2, f2);
    }

    public static final <T> void a(T[] tArr, int i2, int i3) {
        h.f.b.l.d(tArr, "");
        Arrays.fill(tArr, i2, i3, (Object) null);
    }

    public static final byte[] a(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        h.f.b.l.d(bArr, "");
        h.f.b.l.d(bArr2, "");
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
        return bArr2;
    }

    public static final <T> T[] a(T[] tArr, T[] tArr2, int i2, int i3, int i4) {
        h.f.b.l.d(tArr, "");
        h.f.b.l.d(tArr2, "");
        System.arraycopy(tArr, i3, tArr2, i2, i4 - i3);
        return tArr2;
    }
}

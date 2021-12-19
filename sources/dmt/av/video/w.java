package dmt.av.video;

import com.bytedance.covode.number.Covode;

public final class w implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public final String f156971a;

    /* renamed from: b  reason: collision with root package name */
    public final long f156972b;

    /* renamed from: c  reason: collision with root package name */
    public final long f156973c;

    /* renamed from: d  reason: collision with root package name */
    public final int f156974d;

    /* renamed from: e  reason: collision with root package name */
    public int f156975e;

    static {
        Covode.recordClassIndex(104253);
    }

    public static w a() {
        return new w("0");
    }

    public static w b() {
        return new w("1");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: c */
    public final w clone() {
        try {
            return (w) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "VETimeEffectOp{mType='" + this.f156971a + '\'' + ", mStartTimePoint=" + this.f156972b + ", mEndTimePoint=" + this.f156973c + ", mIndex=" + this.f156975e + '}';
    }

    private w(String str) {
        this.f156971a = str;
        this.f156972b = 0;
        this.f156973c = 0;
        this.f156974d = 3;
    }

    public static boolean c(w wVar) {
        if (wVar == null || !"3".equals(wVar.f156971a)) {
            return false;
        }
        return true;
    }

    public static boolean d(w wVar) {
        if (wVar == null || !"0".equals(wVar.f156971a)) {
            return false;
        }
        return true;
    }

    public static boolean a(w wVar) {
        if (wVar == null || !"1".equals(wVar.f156971a)) {
            return false;
        }
        return true;
    }

    public static boolean b(w wVar) {
        if (wVar == null || !"2".equals(wVar.f156971a)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f156971a.equals(wVar.f156971a) && this.f156972b == wVar.f156972b && this.f156973c == wVar.f156973c && this.f156975e == wVar.f156975e) {
            return true;
        }
        return false;
    }

    public static w a(long j2, long j3) {
        return new w("2", j2, j3);
    }

    public static w b(long j2, long j3) {
        return new w("3", j2, j3);
    }

    private w(String str, long j2, long j3) {
        this.f156971a = str;
        this.f156972b = j2;
        this.f156973c = j3;
        this.f156974d = 3;
    }

    public static w a(String str, long j2, long j3) {
        str.hashCode();
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    return a();
                }
                break;
            case 49:
                if (str.equals("1")) {
                    return b();
                }
                break;
            case 50:
                if (str.equals("2")) {
                    return a(j2, j3);
                }
                break;
            case 51:
                if (str.equals("3")) {
                    return b(j2, j3);
                }
                break;
        }
        throw new IllegalArgumentException("op key " + str + " is not supported, plz check again.");
    }
}

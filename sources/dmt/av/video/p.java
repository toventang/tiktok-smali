package dmt.av.video;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public int[] f156925a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f156926b;

    /* renamed from: c  reason: collision with root package name */
    public long f156927c;

    /* renamed from: d  reason: collision with root package name */
    public long f156928d;

    /* renamed from: e  reason: collision with root package name */
    public long f156929e;

    /* renamed from: f  reason: collision with root package name */
    public long f156930f;

    /* renamed from: g  reason: collision with root package name */
    public int f156931g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f156932h;

    /* renamed from: i  reason: collision with root package name */
    public int f156933i;

    /* renamed from: j  reason: collision with root package name */
    public String f156934j;

    /* renamed from: k  reason: collision with root package name */
    public String f156935k;

    /* renamed from: l  reason: collision with root package name */
    public String f156936l;

    /* renamed from: m  reason: collision with root package name */
    public int f156937m;
    public String n;
    public String o;
    public String p;
    public Boolean q = false;

    static {
        Covode.recordClassIndex(104245);
    }

    public final String toString() {
        return "VEFilterEffectOp{mEffectIndexes=" + Arrays.toString(this.f156925a) + ", mStartTimePoint=" + this.f156927c + ", mOp=" + this.f156931g + ", mReverse=" + this.f156932h + ", mColor=" + this.f156933i + ", mResource='" + this.f156934j + '\'' + ", mName='" + this.f156936l + '\'' + ", mKey='" + this.f156935k + '\'' + '}';
    }

    public static p a(long j2) {
        p pVar = new p();
        pVar.f156931g = 1;
        pVar.f156927c = j2;
        return pVar;
    }

    public static p b(String str, long j2) {
        p pVar = new p();
        pVar.f156931g = 0;
        pVar.f156934j = str;
        pVar.f156927c = j2;
        return pVar;
    }

    public static p a(int i2, String str) {
        p pVar = new p();
        pVar.f156931g = 7;
        pVar.f156925a = new int[]{i2};
        pVar.f156926b = new String[]{str};
        return pVar;
    }

    public static p b(int[] iArr, String[] strArr) {
        p pVar = new p();
        pVar.f156931g = 3;
        pVar.f156925a = iArr;
        pVar.f156926b = strArr;
        return pVar;
    }

    public static p a(long j2, long j3) {
        p pVar = new p();
        pVar.f156931g = 6;
        pVar.f156927c = j2;
        pVar.f156928d = j3;
        return pVar;
    }

    public static p a(String str, long j2) {
        p pVar = new p();
        pVar.f156931g = 5;
        pVar.f156934j = str;
        pVar.f156927c = 0;
        pVar.f156928d = j2;
        return pVar;
    }

    public static p a(int[] iArr, String[] strArr) {
        p pVar = new p();
        pVar.f156931g = 4;
        pVar.f156925a = iArr;
        pVar.f156926b = strArr;
        return pVar;
    }

    public static p a(String str, long j2, int i2, String str2) {
        p pVar = new p();
        pVar.f156931g = 8;
        pVar.f156934j = str;
        pVar.f156927c = 0;
        pVar.f156928d = j2;
        pVar.f156925a = new int[]{i2};
        pVar.f156926b = new String[]{str2};
        return pVar;
    }
}

package dmt.av.video;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public int f156938a;

    /* renamed from: b  reason: collision with root package name */
    public int f156939b;

    /* renamed from: c  reason: collision with root package name */
    public int f156940c;

    /* renamed from: d  reason: collision with root package name */
    public int f156941d;

    /* renamed from: e  reason: collision with root package name */
    public int f156942e;

    /* renamed from: f  reason: collision with root package name */
    public int f156943f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f156944g;

    /* renamed from: h  reason: collision with root package name */
    public double f156945h;

    /* renamed from: i  reason: collision with root package name */
    public String f156946i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f156947j;

    /* renamed from: k  reason: collision with root package name */
    public double f156948k;

    /* renamed from: l  reason: collision with root package name */
    public double f156949l;

    static {
        Covode.recordClassIndex(104247);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f156938a == rVar.f156938a && this.f156939b == rVar.f156939b && this.f156940c == rVar.f156940c && this.f156941d == rVar.f156941d && this.f156942e == rVar.f156942e && this.f156943f == rVar.f156943f && this.f156944g == rVar.f156944g && Double.compare(this.f156945h, rVar.f156945h) == 0 && l.a(this.f156946i, rVar.f156946i) && this.f156947j == rVar.f156947j && Double.compare(this.f156948k, rVar.f156948k) == 0 && Double.compare(this.f156949l, rVar.f156949l) == 0;
    }

    public final int hashCode() {
        int i2 = ((((((((((this.f156938a * 31) + this.f156939b) * 31) + this.f156940c) * 31) + this.f156941d) * 31) + this.f156942e) * 31) + this.f156943f) * 31;
        boolean z = this.f156944g;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.f156945h);
        int i7 = (((i2 + i4) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        String str = this.f156946i;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        if (!this.f156947j) {
            i3 = 0;
        }
        long doubleToLongBits2 = Double.doubleToLongBits(this.f156948k);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f156949l);
        return ((((hashCode + i3) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
    }

    public final String toString() {
        return "VEMusicParamCache(trackIndex=" + this.f156938a + ", trimIn=" + this.f156939b + ", trimOut=" + this.f156940c + ", seqIn=" + this.f156941d + ", seqOut=" + this.f156942e + ", bgmDelay=" + this.f156943f + ", isCycle=" + this.f156944g + ", BGMLoudness=" + this.f156945h + ", path=" + this.f156946i + ", isDuet=" + this.f156947j + ", peakLoudness=" + this.f156948k + ", avgLoudness=" + this.f156949l + ")";
    }

    public /* synthetic */ r() {
        this("");
    }

    private r(String str) {
        l.d(str, "");
        this.f156938a = -1;
        this.f156939b = 0;
        this.f156940c = 0;
        this.f156941d = 0;
        this.f156942e = 0;
        this.f156943f = 0;
        this.f156944g = false;
        this.f156945h = 0.0d;
        this.f156946i = str;
        this.f156947j = false;
        this.f156948k = 0.0d;
        this.f156949l = 0.0d;
    }
}

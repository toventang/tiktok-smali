package com.lynx.tasm.behavior.shadow.text;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.e;

public class p {

    /* renamed from: a  reason: collision with root package name */
    final a f56033a;

    /* renamed from: b  reason: collision with root package name */
    final e f56034b;

    /* renamed from: c  reason: collision with root package name */
    final e f56035c;

    /* renamed from: d  reason: collision with root package name */
    public final float f56036d;

    /* renamed from: e  reason: collision with root package name */
    public final float f56037e;

    /* renamed from: f  reason: collision with root package name */
    final int f56038f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f56039g;

    static {
        Covode.recordClassIndex(35012);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        CharSequence f56040a;

        /* renamed from: b  reason: collision with root package name */
        final k f56041b;

        static {
            Covode.recordClassIndex(35013);
        }

        public int hashCode() {
            int hashCode;
            CharSequence charSequence = this.f56040a;
            int i2 = 0;
            if (charSequence == null) {
                hashCode = 0;
            } else {
                hashCode = charSequence.hashCode();
            }
            int i3 = hashCode * 31;
            k kVar = this.f56041b;
            if (kVar != null) {
                i2 = kVar.hashCode();
            }
            return i3 + i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            CharSequence charSequence = this.f56040a;
            if (charSequence == null) {
                if (aVar.f56040a != null) {
                    return false;
                }
            } else if (!charSequence.equals(aVar.f56040a)) {
                return false;
            }
            k kVar = this.f56041b;
            if (kVar == null) {
                if (aVar.f56041b != null) {
                    return false;
                }
                return true;
            } else if (kVar.equals(aVar.f56041b)) {
                return true;
            } else {
                return false;
            }
        }

        a(CharSequence charSequence, k kVar) {
            this.f56040a = charSequence;
            this.f56041b = kVar;
        }
    }

    public int hashCode() {
        return (((((((((((this.f56033a.hashCode() * 31) + this.f56034b.hashCode()) * 31) + this.f56035c.hashCode()) * 31) + Float.floatToIntBits(this.f56036d)) * 31) + Float.floatToIntBits(this.f56037e)) * 31) + this.f56038f) * 31) + (this.f56039g ? 1 : 0);
    }

    public String toString() {
        return ((Object) this.f56033a.f56040a) + " " + this.f56036d + " " + this.f56037e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f56033a.equals(pVar.f56033a) && this.f56034b == pVar.f56034b && this.f56035c == pVar.f56035c && this.f56036d == pVar.f56036d && this.f56037e == pVar.f56037e && this.f56038f == pVar.f56038f && this.f56039g == pVar.f56039g) {
            return true;
        }
        return false;
    }

    public p(CharSequence charSequence, k kVar, e eVar, e eVar2, float f2, float f3, int i2, boolean z) {
        this.f56033a = new a(charSequence, kVar);
        this.f56036d = f2;
        this.f56037e = f3;
        this.f56034b = eVar;
        this.f56035c = eVar2;
        this.f56038f = i2;
        this.f56039g = z;
    }
}

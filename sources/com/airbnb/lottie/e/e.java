package com.airbnb.lottie.e;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public f f5525a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f5526b;

    static {
        Covode.recordClassIndex(2299);
    }

    private boolean a() {
        List<String> list = this.f5526b;
        return list.get(list.size() - 1).equals("**");
    }

    public final String toString() {
        boolean z;
        StringBuilder append = new StringBuilder("KeyPath{keys=").append(this.f5526b).append(",resolved=");
        if (this.f5525a != null) {
            z = true;
        } else {
            z = false;
        }
        return append.append(z).append('}').toString();
    }

    public final e a(f fVar) {
        e eVar = new e(this);
        eVar.f5525a = fVar;
        return eVar;
    }

    public e(String... strArr) {
        this.f5526b = Arrays.asList(strArr);
    }

    public final e a(String str) {
        e eVar = new e(this);
        eVar.f5526b.add(str);
        return eVar;
    }

    private e(e eVar) {
        this.f5526b = new ArrayList(eVar.f5526b);
        this.f5525a = eVar.f5525a;
    }

    public final int b(String str, int i2) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (!this.f5526b.get(i2).equals("**")) {
            return 1;
        }
        if (i2 != this.f5526b.size() - 1 && this.f5526b.get(i2 + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    public final boolean d(String str, int i2) {
        if (!"__container".equals(str) && i2 >= this.f5526b.size() - 1 && !this.f5526b.get(i2).equals("**")) {
            return false;
        }
        return true;
    }

    public final boolean a(String str, int i2) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i2 >= this.f5526b.size()) {
            return false;
        }
        if (this.f5526b.get(i2).equals(str) || this.f5526b.get(i2).equals("**") || this.f5526b.get(i2).equals("*")) {
            return true;
        }
        return false;
    }

    public final boolean c(String str, int i2) {
        boolean z;
        boolean z2;
        if (i2 >= this.f5526b.size()) {
            return false;
        }
        if (i2 == this.f5526b.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.f5526b.get(i2);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((z || (i2 == this.f5526b.size() - 2 && a())) && z2) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            if (!this.f5526b.get(i2 + 1).equals(str)) {
                int i3 = i2 + 1;
                if (i3 < this.f5526b.size() - 1) {
                    return false;
                }
                return this.f5526b.get(i3).equals(str);
            } else if (i2 == this.f5526b.size() - 2 || (i2 == this.f5526b.size() - 3 && a())) {
                return true;
            } else {
                return false;
            }
        }
    }
}

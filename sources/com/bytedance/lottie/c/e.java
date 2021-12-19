package com.bytedance.lottie.c;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public f f40650a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f40651b;

    static {
        Covode.recordClassIndex(24930);
    }

    private boolean a() {
        List<String> list = this.f40651b;
        return list.get(list.size() - 1).equals("**");
    }

    public final String toString() {
        boolean z;
        StringBuilder append = new StringBuilder("KeyPath{keys=").append(this.f40651b).append(",resolved=");
        if (this.f40650a != null) {
            z = true;
        } else {
            z = false;
        }
        return append.append(z).append('}').toString();
    }

    public final e a(f fVar) {
        e eVar = new e(this);
        eVar.f40650a = fVar;
        return eVar;
    }

    public e(String... strArr) {
        this.f40651b = Arrays.asList(strArr);
    }

    public final e a(String str) {
        e eVar = new e(this);
        eVar.f40651b.add(str);
        return eVar;
    }

    private e(e eVar) {
        this.f40651b = new ArrayList(eVar.f40651b);
        this.f40650a = eVar.f40650a;
    }

    public final int b(String str, int i2) {
        if (str.equals("__container")) {
            return 0;
        }
        if (!this.f40651b.get(i2).equals("**")) {
            return 1;
        }
        if (i2 != this.f40651b.size() - 1 && this.f40651b.get(i2 + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    public final boolean d(String str, int i2) {
        if (!str.equals("__container") && i2 >= this.f40651b.size() - 1 && !this.f40651b.get(i2).equals("**")) {
            return false;
        }
        return true;
    }

    public final boolean a(String str, int i2) {
        if (str.equals("__container")) {
            return true;
        }
        if (i2 >= this.f40651b.size()) {
            return false;
        }
        if (this.f40651b.get(i2).equals(str) || this.f40651b.get(i2).equals("**") || this.f40651b.get(i2).equals("*")) {
            return true;
        }
        return false;
    }

    public final boolean c(String str, int i2) {
        boolean z;
        boolean z2;
        if (i2 >= this.f40651b.size()) {
            return false;
        }
        if (i2 == this.f40651b.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.f40651b.get(i2);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((z || (i2 == this.f40651b.size() - 2 && a())) && z2) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            if (!this.f40651b.get(i2 + 1).equals(str)) {
                int i3 = i2 + 1;
                if (i3 < this.f40651b.size() - 1) {
                    return false;
                }
                return this.f40651b.get(i3).equals(str);
            } else if (i2 == this.f40651b.size() - 2 || (i2 == this.f40651b.size() - 3 && a())) {
                return true;
            } else {
                return false;
            }
        }
    }
}

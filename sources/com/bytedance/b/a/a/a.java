package com.bytedance.b.a.a;

import com.bytedance.covode.number.Covode;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Set<String> f25834a;

    /* renamed from: b  reason: collision with root package name */
    private Set<String> f25835b;

    static {
        Covode.recordClassIndex(15085);
    }

    public final String toString() {
        return "CommonEventConfig{sampledService=" + this.f25834a + ", sampledLogType=" + this.f25835b + '}';
    }

    public final boolean a(String str) {
        Set<String> set = this.f25834a;
        if (set == null || !set.contains(str)) {
            return false;
        }
        return true;
    }

    public final boolean b(String str) {
        Set<String> set = this.f25835b;
        if (set == null || !set.contains(str)) {
            return false;
        }
        return true;
    }

    public a(Set<String> set, Set<String> set2) {
        this.f25834a = set;
        this.f25835b = set2;
    }
}

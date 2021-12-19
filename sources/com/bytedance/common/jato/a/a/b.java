package com.bytedance.common.jato.a.a;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class b implements Comparable<b> {

    /* renamed from: a  reason: collision with root package name */
    int f26775a;

    /* renamed from: b  reason: collision with root package name */
    String f26776b;

    /* renamed from: c  reason: collision with root package name */
    int f26777c;

    static {
        Covode.recordClassIndex(15797);
    }

    public final int hashCode() {
        return Objects.hash(this.f26776b);
    }

    public final String toString() {
        return this.f26775a + ",," + this.f26776b + ",," + this.f26777c;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(b bVar) {
        return this.f26775a - bVar.f26775a;
    }

    static b a(String str) {
        try {
            String[] split = str.split(",,");
            return new b(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2]));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f26776b, ((b) obj).f26776b);
    }

    private b(int i2, String str, int i3) {
        this.f26775a = i2;
        this.f26776b = str;
        this.f26777c = i3;
    }
}

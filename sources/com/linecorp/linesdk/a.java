package com.linecorp.linesdk;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;

public final class a<R> {

    /* renamed from: a  reason: collision with root package name */
    public static final a<?> f54938a = new a<>(b.SUCCESS, null, LineApiError.f54929a);

    /* renamed from: b  reason: collision with root package name */
    public final b f54939b;

    /* renamed from: c  reason: collision with root package name */
    public final LineApiError f54940c;

    /* renamed from: d  reason: collision with root package name */
    private final R f54941d;

    public final boolean a() {
        if (this.f54939b == b.SUCCESS) {
            return true;
        }
        return false;
    }

    public final R b() {
        R r = this.f54941d;
        if (r != null) {
            return r;
        }
        throw new NoSuchElementException("response data is null. Please check result by isSuccess before.");
    }

    static {
        Covode.recordClassIndex(34507);
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.f54939b.hashCode() * 31;
        R r = this.f54941d;
        if (r != null) {
            i2 = r.hashCode();
        } else {
            i2 = 0;
        }
        return ((hashCode + i2) * 31) + this.f54940c.hashCode();
    }

    public final String toString() {
        return "LineApiResponse{errorData=" + this.f54940c + ", responseCode=" + this.f54939b + ", responseData=" + ((Object) this.f54941d) + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f54939b != aVar.f54939b) {
            return false;
        }
        R r = this.f54941d;
        if (r == null ? aVar.f54941d == null : r.equals(aVar.f54941d)) {
            return this.f54940c.equals(aVar.f54940c);
        }
        return false;
    }

    public static <T> a<T> a(b bVar, LineApiError lineApiError) {
        return new a<>(bVar, null, lineApiError);
    }

    public a(b bVar, R r, LineApiError lineApiError) {
        this.f54939b = bVar;
        this.f54941d = r;
        this.f54940c = lineApiError;
    }
}

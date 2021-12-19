package com.bytedance.sdk.b.d.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.b.d.b.b;
import java.lang.ref.SoftReference;
import java.util.Map;

public abstract class a<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private SoftReference<b<T>> f43592a;

    /* renamed from: d  reason: collision with root package name */
    public final String f43593d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f43594e;

    /* renamed from: f  reason: collision with root package name */
    public AbstractC1053a<T> f43595f;

    /* renamed from: g  reason: collision with root package name */
    public T f43596g;

    /* renamed from: h  reason: collision with root package name */
    public Exception f43597h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f43598i = true;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.b.d.e.a$a  reason: collision with other inner class name */
    public interface AbstractC1053a<T> {
        static {
            Covode.recordClassIndex(26687);
        }

        void a(Exception exc);

        void a(T t);
    }

    static {
        Covode.recordClassIndex(26686);
    }

    public abstract T a(String str);

    /* access modifiers changed from: package-private */
    public final b<T> a() {
        return this.f43592a.get();
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        String str = this.f43593d;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = i2 * 31;
        Map<String, String> map = this.f43594e;
        if (map != null) {
            i3 = map.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        AbstractC1053a<T> aVar = this.f43595f;
        if (aVar != null) {
            i4 = aVar.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        SoftReference<b<T>> softReference = this.f43592a;
        if (softReference != null) {
            i5 = softReference.hashCode();
        }
        return i8 + i5;
    }

    public final void a(b<T> bVar) {
        this.f43592a = new SoftReference<>(bVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(Exception exc) {
        AbstractC1053a<T> aVar = this.f43595f;
        if (aVar != null) {
            aVar.a(exc);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(T t) {
        AbstractC1053a<T> aVar = this.f43595f;
        if (aVar != null) {
            aVar.a((Object) t);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            String str = this.f43593d;
            if (str == null ? aVar.f43593d != null : !str.equals(aVar.f43593d)) {
                return false;
            }
            Map<String, String> map = this.f43594e;
            if (map == null ? aVar.f43594e != null : !map.equals(aVar.f43594e)) {
                return false;
            }
            AbstractC1053a<T> aVar2 = this.f43595f;
            if (aVar2 == null ? aVar.f43595f != null : !aVar2.equals(aVar.f43595f)) {
                return false;
            }
            SoftReference<b<T>> softReference = this.f43592a;
            SoftReference<b<T>> softReference2 = aVar.f43592a;
            if (softReference != null) {
                return softReference.equals(softReference2);
            }
            if (softReference2 == null) {
                return true;
            }
        }
        return false;
    }

    public a(String str, Map<String, String> map) {
        this.f43593d = str;
        this.f43594e = map;
    }
}

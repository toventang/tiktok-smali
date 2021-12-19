package com.google.firebase.a.a;

import android.util.Base64;
import android.util.JsonWriter;
import com.a;
import com.bytedance.covode.number.Covode;
import com.google.firebase.a.c;
import com.google.firebase.a.e;
import com.google.firebase.a.f;
import com.google.firebase.a.g;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class d implements e, g {

    /* renamed from: a  reason: collision with root package name */
    final JsonWriter f54261a;

    /* renamed from: b  reason: collision with root package name */
    private d f54262b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f54263c = true;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.a.d<?>> f54264d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f54265e;

    static {
        Covode.recordClassIndex(33683);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f54263c) {
            d dVar = this.f54262b;
            if (dVar != null) {
                dVar.a();
                this.f54262b.f54263c = false;
                this.f54262b = null;
                this.f54261a.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    private d a(long j2) {
        a();
        this.f54261a.value(j2);
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public d a(String str) {
        a();
        this.f54261a.value(str);
        return this;
    }

    @Override // com.google.firebase.a.g
    public final /* synthetic */ g a(boolean z) {
        a();
        this.f54261a.value(z);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final d a(Object obj) {
        if (obj == null) {
            this.f54261a.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f54261a.value((Number) obj);
            return this;
        } else {
            int i2 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    a();
                    if (bArr == null) {
                        this.f54261a.nullValue();
                    } else {
                        this.f54261a.value(Base64.encodeToString(bArr, 2));
                    }
                    return this;
                }
                this.f54261a.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i2 < length) {
                        this.f54261a.value((long) iArr[i2]);
                        i2++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i2 < length2) {
                        a(jArr[i2]);
                        i2++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i2 < length3) {
                        this.f54261a.value(dArr[i2]);
                        i2++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i2 < length4) {
                        this.f54261a.value(zArr[i2]);
                        i2++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i2 < length5) {
                        a(numberArr[i2]);
                        i2++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i2 < length6) {
                        a(objArr[i2]);
                        i2++;
                    }
                }
                this.f54261a.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.f54261a.beginArray();
                for (Object obj2 : (Collection) obj) {
                    a(obj2);
                }
                this.f54261a.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f54261a.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        a((String) key, entry.getValue());
                    } catch (ClassCastException e2) {
                        throw new c(a.a("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e2);
                    }
                }
                this.f54261a.endObject();
                return this;
            } else {
                com.google.firebase.a.d<?> dVar = this.f54264d.get(obj.getClass());
                if (dVar != null) {
                    this.f54261a.beginObject();
                    dVar.a(obj, this);
                    this.f54261a.endObject();
                    return this;
                }
                f<?> fVar = this.f54265e.get(obj.getClass());
                if (fVar != null) {
                    fVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    a(((Enum) obj).name());
                    return this;
                } else {
                    throw new c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public d a(String str, Object obj) {
        a();
        this.f54261a.name(str);
        if (obj != null) {
            return a(obj);
        }
        this.f54261a.nullValue();
        return this;
    }

    @Override // com.google.firebase.a.e
    public final /* synthetic */ e a(String str, int i2) {
        a();
        this.f54261a.name(str);
        a();
        this.f54261a.value((long) i2);
        return this;
    }

    @Override // com.google.firebase.a.e
    public final /* synthetic */ e a(String str, long j2) {
        a();
        this.f54261a.name(str);
        return a(j2);
    }

    d(Writer writer, Map<Class<?>, com.google.firebase.a.d<?>> map, Map<Class<?>, f<?>> map2) {
        this.f54261a = new JsonWriter(writer);
        this.f54264d = map;
        this.f54265e = map2;
    }
}

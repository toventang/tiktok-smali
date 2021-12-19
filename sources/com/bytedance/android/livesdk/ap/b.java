package com.bytedance.android.livesdk.ap;

import com.bytedance.android.livesdk.ao.c;
import com.bytedance.android.livesdk.ao.d;
import com.bytedance.covode.number.Covode;

public class b<T> extends c<T> {
    static {
        Covode.recordClassIndex(7771);
    }

    public final T b() {
        return (T) super.a();
    }

    @Override // com.bytedance.android.livesdk.ao.c
    public final T a() {
        T t = (T) c.a(this);
        if (t != null) {
            return t;
        }
        T t2 = (T) d.a(this);
        c.a(this, t2);
        return t2;
    }

    @Override // com.bytedance.android.livesdk.ao.c
    public final void a(T t) {
        c.a(this, t);
    }

    public final void b(T t) {
        super.a(t);
    }

    public b(String str, Class<T> cls) {
        super(str, (Class) cls);
    }

    public b(String str, T t) {
        super(str, (Object) t);
    }

    public b(String str, String str2, T t) {
        super(str, str2, t);
    }
}

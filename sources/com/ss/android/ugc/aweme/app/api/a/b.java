package com.ss.android.ugc.aweme.app.api.a;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.q;
import com.ss.android.ugc.aweme.cw.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

public class b<T> implements e<TypedInput, T> {

    /* renamed from: g  reason: collision with root package name */
    private static volatile ExecutorService f66582g;

    /* renamed from: a  reason: collision with root package name */
    private Type f66583a;

    /* renamed from: b  reason: collision with root package name */
    private Annotation[] f66584b;

    /* renamed from: c  reason: collision with root package name */
    private q f66585c;

    /* renamed from: d  reason: collision with root package name */
    private List<e.a> f66586d;

    /* renamed from: e  reason: collision with root package name */
    private e.a f66587e;

    /* renamed from: f  reason: collision with root package name */
    private volatile e<TypedInput, T> f66588f;

    static {
        Covode.recordClassIndex(40935);
    }

    public final void a() {
        MethodCollector.i(7798);
        Log.getStackTraceString(new RuntimeException("ensure, mType:" + this.f66583a));
        if (this.f66588f == null) {
            synchronized (this) {
                try {
                    if (this.f66588f == null) {
                        this.f66588f = a(this.f66587e, this.f66583a, this.f66584b);
                    }
                } finally {
                    MethodCollector.o(7798);
                }
            }
            return;
        }
        MethodCollector.o(7798);
    }

    /* access modifiers changed from: private */
    public T a(TypedInput typedInput) {
        a();
        return this.f66588f.a(typedInput);
    }

    private static <T> T a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    private <T> e<TypedInput, T> a(e.a aVar, Type type, Annotation[] annotationArr) {
        a(type, "type == null");
        a(annotationArr, "annotations == null");
        int indexOf = this.f66586d.indexOf(aVar) + 1;
        int size = this.f66586d.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            e<TypedInput, T> eVar = (e<TypedInput, T>) this.f66586d.get(i2).a(type, annotationArr, this.f66585c);
            if (eVar != null) {
                return eVar;
            }
        }
        StringBuilder append = new StringBuilder("Could not locate TypeInput converter for ").append(type).append(".\n");
        if (aVar != null) {
            append.append("  Skipped:");
            for (int i3 = 0; i3 < indexOf; i3++) {
                append.append("\n   * ").append(this.f66586d.get(i3).getClass().getName());
            }
            append.append('\n');
        }
        append.append("  Tried:");
        int size2 = this.f66586d.size();
        for (int i4 = 0; i4 < size2; i4++) {
            append.append("\n   * ").append(this.f66586d.get(i4).getClass().getName());
        }
        throw new IllegalArgumentException(append.toString());
    }

    b(Type type, Annotation[] annotationArr, q qVar, List<e.a> list, e.a aVar) {
        MethodCollector.i(7740);
        this.f66583a = type;
        this.f66584b = annotationArr;
        this.f66585c = qVar;
        this.f66586d = list;
        this.f66587e = aVar;
        if (f66582g == null) {
            synchronized (b.class) {
                try {
                    if (f66582g == null) {
                        f66582g = g.a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7740);
                    throw th;
                }
            }
        }
        f66582g.submit(new c(this));
        MethodCollector.o(7740);
    }
}

package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public interface c<T> {

    public static abstract class a {
        static {
            Covode.recordClassIndex(26003);
        }

        public abstract c<?> a(Type type, Annotation[] annotationArr, q qVar);
    }

    static {
        Covode.recordClassIndex(26002);
    }

    <R> T a(b<R> bVar);

    Type a();
}

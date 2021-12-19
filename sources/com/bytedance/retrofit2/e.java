package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public interface e<F, T> {

    public static abstract class a {
        static {
            Covode.recordClassIndex(26028);
        }

        public e<?, Object> a(Type type) {
            return null;
        }

        public e<TypedInput, ?> a(Type type, Annotation[] annotationArr, q qVar) {
            return null;
        }

        public e<?, TypedOutput> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, q qVar) {
            return null;
        }

        public e<?, String> b(Type type) {
            return null;
        }

        public e<?, b> c(Type type) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(26027);
    }

    T a(F f2);
}

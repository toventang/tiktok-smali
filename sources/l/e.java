package l;

import com.bytedance.covode.number.Covode;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

public interface e<F, T> {

    public static abstract class a {
        static {
            Covode.recordClassIndex(105761);
        }

        public e<?, RequestBody> a(Type type) {
            return null;
        }

        public e<ResponseBody, ?> a(Type type, Annotation[] annotationArr) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(105760);
    }

    T a(F f2);
}

package l.a.b;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import l.e;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

public final class a extends e.a {
    static {
        Covode.recordClassIndex(105729);
    }

    @Override // l.e.a
    public final e<?, RequestBody> a(Type type) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new b(ProtoAdapter.get(cls));
    }

    @Override // l.e.a
    public final e<ResponseBody, ?> a(Type type, Annotation[] annotationArr) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new c(ProtoAdapter.get(cls));
    }
}

package l.a.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import l.e;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

public final class a extends e.a {

    /* renamed from: a  reason: collision with root package name */
    private final f f159223a;

    static {
        Covode.recordClassIndex(105726);
    }

    public static a a() {
        return a(new f());
    }

    private a(f fVar) {
        this.f159223a = fVar;
    }

    public static a a(f fVar) {
        Objects.requireNonNull(fVar, "gson == null");
        return new a(fVar);
    }

    @Override // l.e.a
    public final e<?, RequestBody> a(Type type) {
        return new b(this.f159223a, this.f159223a.a((com.google.gson.b.a) com.google.gson.b.a.get(type)));
    }

    @Override // l.e.a
    public final e<ResponseBody, ?> a(Type type, Annotation[] annotationArr) {
        return new c(this.f159223a, this.f159223a.a((com.google.gson.b.a) com.google.gson.b.a.get(type)));
    }
}

package l;

import com.bytedance.covode.number.Covode;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import l.b.w;
import l.e;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* access modifiers changed from: package-private */
public final class a extends e.a {
    static {
        Covode.recordClassIndex(105720);
    }

    /* renamed from: l.a$a  reason: collision with other inner class name */
    static final class C4194a implements e<ResponseBody, ResponseBody> {

        /* renamed from: a  reason: collision with root package name */
        static final C4194a f159222a = new C4194a();

        C4194a() {
        }

        static {
            Covode.recordClassIndex(105721);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // l.e
        public final /* bridge */ /* synthetic */ ResponseBody a(ResponseBody responseBody) {
            return a(responseBody);
        }

        private static ResponseBody a(ResponseBody responseBody) {
            try {
                return o.a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    static final class b implements e<RequestBody, RequestBody> {

        /* renamed from: a  reason: collision with root package name */
        static final b f159230a = new b();

        b() {
        }

        static {
            Covode.recordClassIndex(105722);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // l.e
        public final /* bridge */ /* synthetic */ RequestBody a(RequestBody requestBody) {
            return requestBody;
        }
    }

    static final class c implements e<ResponseBody, ResponseBody> {

        /* renamed from: a  reason: collision with root package name */
        static final c f159234a = new c();

        c() {
        }

        static {
            Covode.recordClassIndex(105723);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // l.e
        public final /* bridge */ /* synthetic */ ResponseBody a(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements e<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        static final d f159235a = new d();

        d() {
        }

        static {
            Covode.recordClassIndex(105724);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // l.e
        public final /* synthetic */ String a(Object obj) {
            return obj.toString();
        }
    }

    static final class e implements e<ResponseBody, Void> {

        /* renamed from: a  reason: collision with root package name */
        static final e f159236a = new e();

        e() {
        }

        static {
            Covode.recordClassIndex(105725);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // l.e
        public final /* synthetic */ Void a(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    a() {
    }

    @Override // l.e.a
    public final e<?, RequestBody> a(Type type) {
        if (RequestBody.class.isAssignableFrom(o.a(type))) {
            return b.f159230a;
        }
        return null;
    }

    @Override // l.e.a
    public final e<ResponseBody, ?> a(Type type, Annotation[] annotationArr) {
        if (type == ResponseBody.class) {
            for (Annotation annotation : annotationArr) {
                if (w.class.isInstance(annotation)) {
                    return c.f159234a;
                }
            }
            return C4194a.f159222a;
        } else if (type == Void.class) {
            return e.f159236a;
        } else {
            return null;
        }
    }
}

package l;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public abstract class i<T> {
    static {
        Covode.recordClassIndex(105775);
    }

    /* access modifiers changed from: package-private */
    public abstract void a(k kVar, T t);

    /* access modifiers changed from: package-private */
    public static final class l extends i<MultipartBody.Part> {

        /* renamed from: a  reason: collision with root package name */
        static final l f159289a = new l();

        private l() {
        }

        static {
            Covode.recordClassIndex(105789);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [l.k, java.lang.Object] */
        /* access modifiers changed from: package-private */
        @Override // l.i
        public final /* synthetic */ void a(k kVar, MultipartBody.Part part) {
            MultipartBody.Part part2 = part;
            if (part2 != null) {
                kVar.f159294b.addPart(part2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends i<Object> {
        static {
            Covode.recordClassIndex(105790);
        }

        m() {
        }

        /* access modifiers changed from: package-private */
        @Override // l.i
        public final void a(k kVar, Object obj) {
            o.a(obj, "@Url parameter is null.");
            kVar.f159293a = obj.toString();
        }
    }

    i() {
    }

    /* access modifiers changed from: package-private */
    public final i<Iterable<T>> a() {
        return new i<Iterable<T>>() {
            /* class l.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(105776);
            }

            /* access modifiers changed from: package-private */
            @Override // l.i
            public final /* synthetic */ void a(k kVar, Object obj) {
                Iterable<T> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (T t : iterable) {
                        i.this.a(kVar, t);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final i<Object> b() {
        return new i<Object>() {
            /* class l.i.AnonymousClass2 */

            static {
                Covode.recordClassIndex(105777);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: l.i */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: package-private */
            @Override // l.i
            public final void a(k kVar, Object obj) {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        i.this.a(kVar, Array.get(obj, i2));
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> extends i<T> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, RequestBody> f159266a;

        static {
            Covode.recordClassIndex(105778);
        }

        a(e<T, RequestBody> eVar) {
            this.f159266a = eVar;
        }

        /* access modifiers changed from: package-private */
        @Override // l.i
        public final void a(k kVar, T t) {
            if (t != null) {
                try {
                    kVar.f159295c = this.f159266a.a(t);
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to RequestBody", e2);
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> extends i<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, String> f159274a;

        static {
            Covode.recordClassIndex(105782);
        }

        e(e<T, String> eVar) {
            this.f159274a = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: l.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // l.i
        public final /* synthetic */ void a(k kVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            kVar.a(str, (String) this.f159274a.a(value));
                        } else {
                            throw new IllegalArgumentException("Header map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Header map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Header map was null.");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> extends i<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, String> f159270a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f159271b;

        static {
            Covode.recordClassIndex(105780);
        }

        c(e<T, String> eVar, boolean z) {
            this.f159270a = eVar;
            this.f159271b = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: l.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // l.i
        public final /* synthetic */ void a(k kVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f159270a.a(value);
                            if (str2 != null) {
                                kVar.b(str, str2, this.f159271b);
                            } else {
                                throw new IllegalArgumentException("Field map value '" + value + "' converted to null by " + this.f159270a.getClass().getName() + " for key '" + str + "'.");
                            }
                        } else {
                            throw new IllegalArgumentException("Field map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> extends i<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Headers f159275a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, RequestBody> f159276b;

        static {
            Covode.recordClassIndex(105783);
        }

        f(Headers headers, e<T, RequestBody> eVar) {
            this.f159275a = headers;
            this.f159276b = eVar;
        }

        /* access modifiers changed from: package-private */
        @Override // l.i
        public final void a(k kVar, T t) {
            if (t != null) {
                try {
                    kVar.a(this.f159275a, this.f159276b.a(t));
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to RequestBody", e2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> extends i<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, RequestBody> f159277a;

        /* renamed from: b  reason: collision with root package name */
        private final String f159278b;

        static {
            Covode.recordClassIndex(105784);
        }

        g(e<T, RequestBody> eVar, String str) {
            this.f159277a = eVar;
            this.f159278b = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: l.e<T, okhttp3.RequestBody> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // l.i
        public final /* synthetic */ void a(k kVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            kVar.a(Headers.of("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f159278b), (RequestBody) this.f159277a.a(value));
                        } else {
                            throw new IllegalArgumentException("Part map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> extends i<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, String> f159285a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f159286b;

        static {
            Covode.recordClassIndex(105787);
        }

        j(e<T, String> eVar, boolean z) {
            this.f159285a = eVar;
            this.f159286b = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: l.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // l.i
        public final /* synthetic */ void a(k kVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f159285a.a(value);
                            if (str2 != null) {
                                kVar.a(str, str2, this.f159286b);
                            } else {
                                throw new IllegalArgumentException("Query map value '" + value + "' converted to null by " + this.f159285a.getClass().getName() + " for key '" + str + "'.");
                            }
                        } else {
                            throw new IllegalArgumentException("Query map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Query map was null.");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> extends i<T> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, String> f159287a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f159288b;

        static {
            Covode.recordClassIndex(105788);
        }

        k(e<T, String> eVar, boolean z) {
            this.f159287a = eVar;
            this.f159288b = z;
        }

        /* access modifiers changed from: package-private */
        @Override // l.i
        public final void a(k kVar, T t) {
            if (t != null) {
                kVar.a(this.f159287a.a(t), null, this.f159288b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> extends i<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f159272a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, String> f159273b;

        static {
            Covode.recordClassIndex(105781);
        }

        d(String str, e<T, String> eVar) {
            this.f159272a = (String) o.a(str, "name == null");
            this.f159273b = eVar;
        }

        /* access modifiers changed from: package-private */
        @Override // l.i
        public final void a(k kVar, T t) {
            String a2;
            if (t != null && (a2 = this.f159273b.a(t)) != null) {
                kVar.a(this.f159272a, a2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> extends i<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f159267a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, String> f159268b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f159269c;

        static {
            Covode.recordClassIndex(105779);
        }

        /* access modifiers changed from: package-private */
        @Override // l.i
        public final void a(k kVar, T t) {
            String a2;
            if (t != null && (a2 = this.f159268b.a(t)) != null) {
                kVar.b(this.f159267a, a2, this.f159269c);
            }
        }

        b(String str, e<T, String> eVar, boolean z) {
            this.f159267a = (String) o.a(str, "name == null");
            this.f159268b = eVar;
            this.f159269c = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.i$i  reason: collision with other inner class name */
    public static final class C4195i<T> extends i<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f159282a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, String> f159283b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f159284c;

        static {
            Covode.recordClassIndex(105786);
        }

        /* access modifiers changed from: package-private */
        @Override // l.i
        public final void a(k kVar, T t) {
            String a2;
            if (t != null && (a2 = this.f159283b.a(t)) != null) {
                kVar.a(this.f159282a, a2, this.f159284c);
            }
        }

        C4195i(String str, e<T, String> eVar, boolean z) {
            this.f159282a = (String) o.a(str, "name == null");
            this.f159283b = eVar;
            this.f159284c = z;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> extends i<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f159279a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, String> f159280b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f159281c;

        static {
            Covode.recordClassIndex(105785);
        }

        /* access modifiers changed from: package-private */
        @Override // l.i
        public final void a(k kVar, T t) {
            if (t != null) {
                String str = this.f159279a;
                String a2 = this.f159280b.a(t);
                boolean z = this.f159281c;
                if (kVar.f159293a != null) {
                    kVar.f159293a = kVar.f159293a.replace("{" + str + "}", k.a(a2, z));
                    return;
                }
                throw new AssertionError();
            }
            throw new IllegalArgumentException("Path parameter \"" + this.f159279a + "\" value must not be null.");
        }

        h(String str, e<T, String> eVar, boolean z) {
            this.f159279a = (String) o.a(str, "name == null");
            this.f159280b = eVar;
            this.f159281c = z;
        }
    }
}

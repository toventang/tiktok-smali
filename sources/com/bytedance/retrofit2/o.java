package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public abstract class o<T> {
    static {
        Covode.recordClassIndex(26055);
    }

    /* access modifiers changed from: package-private */
    public abstract void a(RequestBuilder requestBuilder, T t2);

    /* access modifiers changed from: package-private */
    public static final class c extends o<RequestBody> {

        /* renamed from: a  reason: collision with root package name */
        static final c f42528a = new c();

        c() {
        }

        static {
            Covode.recordClassIndex(26060);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.retrofit2.RequestBuilder, java.lang.Object] */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final /* synthetic */ void a(RequestBuilder requestBuilder, RequestBody requestBody) {
            RequestBody requestBody2 = requestBody;
            if (requestBody2 != null) {
                requestBuilder.o = requestBody2;
                requestBuilder.p = true;
                return;
            }
            throw new IllegalArgumentException("Body parameter value must not be null.");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends o<MultipartBody.Part> {

        /* renamed from: a  reason: collision with root package name */
        static final f f42531a = new f();

        f() {
        }

        static {
            Covode.recordClassIndex(26063);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.retrofit2.RequestBuilder, java.lang.Object] */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final /* synthetic */ void a(RequestBuilder requestBuilder, MultipartBody.Part part) {
            MultipartBody.Part part2 = part;
            if (part2 != null) {
                requestBuilder.n.addPart(part2);
            }
            requestBuilder.p = true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u<T> extends o<T> {
        static {
            Covode.recordClassIndex(26078);
        }

        u() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final void a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                if (t instanceof com.bytedance.retrofit2.b.a.b) {
                    requestBuilder.f42423d = t.a();
                    return;
                }
                throw new RuntimeException("wrong type:" + t.getClass() + ",not implement QueryParamObject");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v extends o<Object> {
        static {
            Covode.recordClassIndex(26079);
        }

        v() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final void a(RequestBuilder requestBuilder, Object obj) {
            Objects.requireNonNull(obj, "@Url parameter is null.");
            requestBuilder.f42422c = obj.toString();
        }
    }

    o() {
    }

    /* access modifiers changed from: package-private */
    public final o<Iterable<T>> a() {
        return new o<Iterable<T>>() {
            /* class com.bytedance.retrofit2.o.AnonymousClass1 */

            static {
                Covode.recordClassIndex(26056);
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.retrofit2.o
            public final /* synthetic */ void a(RequestBuilder requestBuilder, Object obj) {
                Iterable<T> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (T t : iterable) {
                        o.this.a(requestBuilder, t);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final o<Object> b() {
        return new o<Object>() {
            /* class com.bytedance.retrofit2.o.AnonymousClass2 */

            static {
                Covode.recordClassIndex(26057);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.retrofit2.o */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.retrofit2.o
            public final void a(RequestBuilder requestBuilder, Object obj) {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        o.this.a(requestBuilder, Array.get(obj, i2));
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public static final class d extends o<RequestBody> {

        /* renamed from: a  reason: collision with root package name */
        private final Headers f42529a;

        static {
            Covode.recordClassIndex(26061);
        }

        d(Headers headers) {
            this.f42529a = headers;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.retrofit2.RequestBuilder, java.lang.Object] */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final /* bridge */ /* synthetic */ void a(RequestBuilder requestBuilder, RequestBody requestBody) {
            RequestBody requestBody2 = requestBody;
            if (requestBody2 != null) {
                requestBuilder.a(this.f42529a, requestBody2);
                requestBuilder.p = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends o<Map<String, RequestBody>> {

        /* renamed from: a  reason: collision with root package name */
        private final String f42530a;

        static {
            Covode.recordClassIndex(26062);
        }

        e(String str) {
            this.f42530a = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.retrofit2.RequestBuilder, java.lang.Object] */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final /* synthetic */ void a(RequestBuilder requestBuilder, Map<String, RequestBody> map) {
            Map<String, RequestBody> map2 = map;
            if (map2 != null) {
                for (Map.Entry<String, RequestBody> entry : map2.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        RequestBody value = entry.getValue();
                        if (value != null) {
                            requestBuilder.a(Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f42530a), value);
                        } else {
                            throw new IllegalArgumentException("Part map contained null value for key '" + key + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                requestBuilder.p = true;
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> extends o<List<T>> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, com.bytedance.retrofit2.client.b> f42540a;

        static {
            Covode.recordClassIndex(26068);
        }

        k(e<T, com.bytedance.retrofit2.client.b> eVar) {
            this.f42540a = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.bytedance.retrofit2.e<T, com.bytedance.retrofit2.client.b> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final /* synthetic */ void a(RequestBuilder requestBuilder, Object obj) {
            List<Object> list = (List) obj;
            if (list != null) {
                for (Object obj2 : list) {
                    com.bytedance.retrofit2.client.b bVar = (com.bytedance.retrofit2.client.b) this.f42540a.a(obj2);
                    requestBuilder.a(bVar.f42471a, bVar.f42472b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T> extends o<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, String> f42541a;

        static {
            Covode.recordClassIndex(26069);
        }

        l(e<T, String> eVar) {
            this.f42541a = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: com.bytedance.retrofit2.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final /* synthetic */ void a(RequestBuilder requestBuilder, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.a(str, (String) this.f42541a.a(value));
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
    public static final class w<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        final Class<T> f42559a;

        static {
            Covode.recordClassIndex(26080);
        }

        w(Class<T> cls) {
            this.f42559a = cls;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final void a(RequestBuilder requestBuilder, T t) {
            requestBuilder.a(this.f42559a, t);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, String> f42525a;

        static {
            Covode.recordClassIndex(26058);
        }

        a(e<T, String> eVar) {
            this.f42525a = (e) w.a(eVar, "converter == null");
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final void a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.f42431l = Boolean.parseBoolean(this.f42525a.a(t));
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to AddCommonParam", e2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, Object> f42532a;

        static {
            Covode.recordClassIndex(26064);
        }

        g(e<T, Object> eVar) {
            this.f42532a = (e) w.a(eVar, "converter == null");
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final void a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.f42432m = this.f42532a.a(t);
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to ExtraInfo", e2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, String> f42542a;

        static {
            Covode.recordClassIndex(26070);
        }

        m(e<T, String> eVar) {
            this.f42542a = (e) w.a(eVar, "converter == null");
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final void a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.f42430k = Integer.parseInt(this.f42542a.a(t));
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to MaxLength", e2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f42526a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, TypedOutput> f42527b;

        static {
            Covode.recordClassIndex(26059);
        }

        b(boolean z, e<T, TypedOutput> eVar) {
            this.f42526a = z;
            this.f42527b = eVar;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final void a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.f42426g = this.f42527b.a(t);
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to TypedOutput", e2);
                }
            } else if (!this.f42526a) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> extends o<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, String> f42536a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f42537b;

        static {
            Covode.recordClassIndex(26066);
        }

        i(e<T, String> eVar, boolean z) {
            this.f42536a = eVar;
            this.f42537b = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: com.bytedance.retrofit2.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final /* synthetic */ void a(RequestBuilder requestBuilder, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.b(str, (String) this.f42536a.a(value), this.f42537b);
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
    /* renamed from: com.bytedance.retrofit2.o$o  reason: collision with other inner class name */
    public static final class C1039o<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f42545a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, TypedOutput> f42546b;

        static {
            Covode.recordClassIndex(26072);
        }

        C1039o(String str, e<T, TypedOutput> eVar) {
            this.f42545a = str;
            this.f42546b = eVar;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final void a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    TypedOutput a2 = this.f42546b.a(t);
                    requestBuilder.f42425f.addPart(this.f42545a, a2);
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to RequestBody", e2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p<T> extends o<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, TypedOutput> f42547a;

        /* renamed from: b  reason: collision with root package name */
        private final String f42548b;

        static {
            Covode.recordClassIndex(26073);
        }

        p(e<T, TypedOutput> eVar, String str) {
            this.f42547a = eVar;
            this.f42548b = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: com.bytedance.retrofit2.e<T, com.bytedance.retrofit2.mime.TypedOutput> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final /* synthetic */ void a(RequestBuilder requestBuilder, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.f42425f.addPart(str, this.f42548b, (TypedOutput) this.f42547a.a(value));
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
    public static final class s<T> extends o<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, String> f42555a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f42556b;

        static {
            Covode.recordClassIndex(26076);
        }

        s(e<T, String> eVar, boolean z) {
            this.f42555a = eVar;
            this.f42556b = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.bytedance.retrofit2.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final /* synthetic */ void a(RequestBuilder requestBuilder, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.a(str, (String) this.f42555a.a(value), this.f42556b);
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, String> f42557a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f42558b;

        static {
            Covode.recordClassIndex(26077);
        }

        t(e<T, String> eVar, boolean z) {
            this.f42557a = eVar;
            this.f42558b = z;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final void a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                requestBuilder.a(this.f42557a.a(t), null, this.f42558b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f42538a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, String> f42539b;

        static {
            Covode.recordClassIndex(26067);
        }

        j(String str, e<T, String> eVar) {
            this.f42538a = (String) w.a(str, "name == null");
            this.f42539b = eVar;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final void a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                requestBuilder.a(this.f42538a, this.f42539b.a(t));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f42543a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, String> f42544b;

        static {
            Covode.recordClassIndex(26071);
        }

        n(String str, e<T, String> eVar) {
            this.f42543a = (String) w.a(str, "name == null");
            this.f42544b = eVar;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final void a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                String str = this.f42543a;
                String a2 = this.f42544b.a(t);
                if (requestBuilder.f42420a != null) {
                    requestBuilder.f42420a = requestBuilder.f42420a.replace("{" + str + "}", a2);
                    return;
                }
                throw new AssertionError();
            }
            throw new IllegalArgumentException("Method parameter \"" + this.f42543a + "\" value must not be null.");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f42533a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, String> f42534b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f42535c;

        static {
            Covode.recordClassIndex(26065);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final void a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                requestBuilder.b(this.f42533a, this.f42534b.a(t), this.f42535c);
            }
        }

        h(String str, e<T, String> eVar, boolean z) {
            this.f42533a = (String) w.a(str, "name == null");
            this.f42534b = eVar;
            this.f42535c = z;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f42552a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, String> f42553b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f42554c;

        static {
            Covode.recordClassIndex(26075);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final void a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                requestBuilder.a(this.f42552a, this.f42553b.a(t), this.f42554c);
            }
        }

        r(String str, e<T, String> eVar, boolean z) {
            this.f42552a = (String) w.a(str, "name == null");
            this.f42553b = eVar;
            this.f42554c = z;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f42549a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, String> f42550b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f42551c;

        static {
            Covode.recordClassIndex(26074);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.o
        public final void a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                String str = this.f42549a;
                String a2 = this.f42550b.a(t);
                boolean z = this.f42551c;
                if (requestBuilder.f42422c == null) {
                    throw new AssertionError();
                } else if (str == null) {
                    throw new IllegalArgumentException("Path replacement name must not be null.");
                } else if (a2 == null) {
                    throw new IllegalArgumentException("Path replacement \"" + str + "\" value must not be null.");
                } else if (z) {
                    try {
                        requestBuilder.f42422c = requestBuilder.f42422c.replace("{" + str + "}", URLEncoder.encode(String.valueOf(a2), "UTF-8").replace("+", "%20"));
                    } catch (UnsupportedEncodingException e2) {
                        throw new RuntimeException("Unable to convert path parameter \"" + str + "\" value to UTF-8:" + a2, e2);
                    }
                } else {
                    requestBuilder.f42422c = requestBuilder.f42422c.replace("{" + str + "}", String.valueOf(a2));
                }
            } else {
                throw new IllegalArgumentException("Path parameter \"" + this.f42549a + "\" value must not be null.");
            }
        }

        q(String str, e<T, String> eVar, boolean z) {
            this.f42549a = (String) w.a(str, "name == null");
            this.f42550b = eVar;
            this.f42551c = z;
        }
    }
}

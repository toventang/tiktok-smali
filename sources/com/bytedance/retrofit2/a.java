package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* access modifiers changed from: package-private */
public final class a extends e.a {
    static {
        Covode.recordClassIndex(25955);
    }

    /* renamed from: com.bytedance.retrofit2.a$a  reason: collision with other inner class name */
    static final class C1035a implements e<TypedInput, TypedInput> {

        /* renamed from: a  reason: collision with root package name */
        static final C1035a f42443a = new C1035a();

        C1035a() {
        }

        static {
            Covode.recordClassIndex(25956);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.retrofit2.e
        public final /* bridge */ /* synthetic */ TypedInput a(TypedInput typedInput) {
            return a(typedInput);
        }

        private static TypedInput a(TypedInput typedInput) {
            MethodCollector.i(2824);
            if (typedInput == null || (typedInput instanceof TypedByteArray)) {
                MethodCollector.o(2824);
                return typedInput;
            }
            String mimeType = typedInput.mimeType();
            InputStream in = typedInput.in();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (in != null) {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = in.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                return new TypedByteArray(mimeType, byteArrayOutputStream.toByteArray(), new String[0]);
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException unused) {
                    }
                }
                MethodCollector.o(2824);
            }
        }
    }

    static final class b implements e<com.bytedance.retrofit2.client.b, com.bytedance.retrofit2.client.b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f42444a = new b();

        b() {
        }

        static {
            Covode.recordClassIndex(25957);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.retrofit2.e
        public final /* bridge */ /* synthetic */ com.bytedance.retrofit2.client.b a(com.bytedance.retrofit2.client.b bVar) {
            return bVar;
        }
    }

    static final class c implements e<Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        static final c f42445a = new c();

        @Override // com.bytedance.retrofit2.e
        public final Object a(Object obj) {
            return obj;
        }

        c() {
        }

        static {
            Covode.recordClassIndex(25958);
        }
    }

    static final class d implements e<TypedOutput, TypedOutput> {

        /* renamed from: a  reason: collision with root package name */
        static final d f42446a = new d();

        d() {
        }

        static {
            Covode.recordClassIndex(25959);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.retrofit2.e
        public final /* bridge */ /* synthetic */ TypedOutput a(TypedOutput typedOutput) {
            return typedOutput;
        }
    }

    static final class e implements e<TypedInput, TypedInput> {

        /* renamed from: a  reason: collision with root package name */
        static final e f42447a = new e();

        e() {
        }

        static {
            Covode.recordClassIndex(25960);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.retrofit2.e
        public final /* bridge */ /* synthetic */ TypedInput a(TypedInput typedInput) {
            return typedInput;
        }
    }

    static final class f implements e<String, String> {

        /* renamed from: a  reason: collision with root package name */
        static final f f42448a = new f();

        f() {
        }

        static {
            Covode.recordClassIndex(25961);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.retrofit2.e
        public final /* bridge */ /* synthetic */ String a(String str) {
            return str;
        }
    }

    static final class g implements e<TypedInput, String> {

        /* renamed from: a  reason: collision with root package name */
        static final g f42449a = new g();

        g() {
        }

        static {
            Covode.recordClassIndex(25962);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.retrofit2.e
        public final /* synthetic */ String a(TypedInput typedInput) {
            TypedInput typedInput2 = typedInput;
            if (!(typedInput2 instanceof TypedByteArray)) {
                return null;
            }
            String str = "UTF-8";
            if (typedInput2.mimeType() != null) {
                str = MimeUtil.parseCharset(typedInput2.mimeType(), str);
            }
            return new String(((TypedByteArray) typedInput2).getBytes(), str);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements e<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        static final h f42450a = new h();

        h() {
        }

        static {
            Covode.recordClassIndex(25963);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.e
        public final /* synthetic */ String a(Object obj) {
            return String.valueOf(obj);
        }
    }

    static final class i implements e<TypedInput, Void> {

        /* renamed from: a  reason: collision with root package name */
        static final i f42451a = new i();

        i() {
        }

        static {
            Covode.recordClassIndex(25964);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.retrofit2.e
        public final /* synthetic */ Void a(TypedInput typedInput) {
            InputStream in = typedInput.in();
            if (in == null) {
                return null;
            }
            in.close();
            return null;
        }
    }

    a() {
    }

    @Override // com.bytedance.retrofit2.e.a
    public final e<?, Object> a(Type type) {
        if (type == Object.class) {
            return c.f42445a;
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.e.a
    public final e<?, String> b(Type type) {
        if (type == String.class) {
            return f.f42448a;
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.e.a
    public final e<?, com.bytedance.retrofit2.client.b> c(Type type) {
        if (type == com.bytedance.retrofit2.client.b.class) {
            return b.f42444a;
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.e.a
    public final e<TypedInput, ?> a(Type type, Annotation[] annotationArr, q qVar) {
        if (type == TypedInput.class) {
            for (Annotation annotation : annotationArr) {
                if (ae.class.isInstance(annotation)) {
                    return e.f42447a;
                }
            }
            return C1035a.f42443a;
        } else if (type == String.class) {
            return g.f42449a;
        } else {
            if (type == Void.class) {
                return i.f42451a;
            }
            return null;
        }
    }

    @Override // com.bytedance.retrofit2.e.a
    public final e<?, TypedOutput> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, q qVar) {
        if (TypedOutput.class.isAssignableFrom(w.a(type))) {
            return d.f42446a;
        }
        return null;
    }
}

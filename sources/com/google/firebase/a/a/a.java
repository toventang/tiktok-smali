package com.google.firebase.a.a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.a.d;
import com.google.firebase.a.f;
import com.google.firebase.a.g;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    private static final f<String> f54252c = b.f54259a;

    /* renamed from: d  reason: collision with root package name */
    private static final f<Boolean> f54253d = c.f54260a;

    /* renamed from: e  reason: collision with root package name */
    private static final C1240a f54254e = new C1240a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f54255a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, f<?>> f54256b = new HashMap();

    /* renamed from: com.google.firebase.a.a.a$a  reason: collision with other inner class name */
    static final class C1240a implements f<Date> {

        /* renamed from: a  reason: collision with root package name */
        private static final DateFormat f54258a;

        private C1240a() {
        }

        static {
            Covode.recordClassIndex(33680);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f54258a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        /* synthetic */ C1240a(byte b2) {
            this();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.google.firebase.a.b
        public final /* synthetic */ void a(Object obj, g gVar) {
            gVar.a(f54258a.format((Date) obj));
        }
    }

    public final com.google.firebase.a.a a() {
        return new com.google.firebase.a.a() {
            /* class com.google.firebase.a.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33679);
            }

            @Override // com.google.firebase.a.a
            public final String a(Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    a(obj, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }

            @Override // com.google.firebase.a.a
            public final void a(Object obj, Writer writer) {
                d dVar = new d(writer, a.this.f54255a, a.this.f54256b);
                dVar.a(obj);
                dVar.a();
                dVar.f54261a.flush();
            }
        };
    }

    static {
        Covode.recordClassIndex(33678);
    }

    public a() {
        a(String.class, f54252c);
        a(Boolean.class, f54253d);
        a(Date.class, f54254e);
    }

    private <T> a a(Class<T> cls, f<? super T> fVar) {
        if (!this.f54256b.containsKey(cls)) {
            this.f54256b.put(cls, fVar);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }

    public final <T> a a(Class<T> cls, d<? super T> dVar) {
        if (!this.f54255a.containsKey(cls)) {
            this.f54255a.put(cls, dVar);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }
}

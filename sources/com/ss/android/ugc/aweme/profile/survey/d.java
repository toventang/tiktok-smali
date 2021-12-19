package com.ss.android.ugc.aweme.profile.survey;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class d {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f116640a = false;

    /* renamed from: c  reason: collision with root package name */
    private static volatile d f116641c;

    /* renamed from: b  reason: collision with root package name */
    public a f116642b;

    public interface a {
        static {
            Covode.recordClassIndex(75363);
        }

        void a();

        void a(com.ss.android.ugc.aweme.cu.a aVar);
    }

    static {
        Covode.recordClassIndex(75362);
    }

    private d() {
        if (f116641c != null) {
            throw new RuntimeException("Illegal access.");
        }
    }

    public static d a() {
        MethodCollector.i(9950);
        if (f116641c == null) {
            synchronized (d.class) {
                try {
                    if (f116641c == null) {
                        f116641c = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9950);
                    throw th;
                }
            }
        }
        d dVar = f116641c;
        MethodCollector.o(9950);
        return dVar;
    }

    public static void a(b bVar) {
        i<Object> a2 = SurveyApi.a(bVar);
        if (a2 != null) {
            a2.a(f.f116644a);
        }
    }
}

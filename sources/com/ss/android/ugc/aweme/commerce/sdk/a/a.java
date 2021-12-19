package com.ss.android.ugc.aweme.commerce.sdk.a;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.q;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.concurrent.Callable;

public abstract class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C1638a f73442c = new C1638a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f73443a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final String f73444b;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, String> f73445d = new HashMap<>();

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final C1639a f73446a = C1639a.f73448b;

        /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$b$a  reason: collision with other inner class name */
        public static final class C1639a {

            /* renamed from: a  reason: collision with root package name */
            static final b f73447a = new C1640a();

            /* renamed from: b  reason: collision with root package name */
            static final /* synthetic */ C1639a f73448b = new C1639a();

            /* renamed from: c  reason: collision with root package name */
            private static final b f73449c = new C1641b();

            /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$b$a$a  reason: collision with other inner class name */
            public static final class C1640a implements b {
                static {
                    Covode.recordClassIndex(45223);
                }

                C1640a() {
                }

                @Override // com.ss.android.ugc.aweme.commerce.sdk.a.a.b
                public final String a(String str) {
                    l.d(str, "");
                    if (TextUtils.isEmpty(str) || l.a((Object) "null", (Object) str)) {
                        return "";
                    }
                    return str;
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$b$a$b  reason: collision with other inner class name */
            public static final class C1641b implements b {
                static {
                    Covode.recordClassIndex(45224);
                }

                C1641b() {
                }

                @Override // com.ss.android.ugc.aweme.commerce.sdk.a.a.b
                public final String a(String str) {
                    l.d(str, "");
                    if (TextUtils.isEmpty(str) || l.a((Object) "null", (Object) str) || l.a((Object) "0", (Object) str)) {
                        return "";
                    }
                    return str;
                }
            }

            private C1639a() {
            }

            static {
                Covode.recordClassIndex(45222);
            }
        }

        static {
            Covode.recordClassIndex(45221);
        }

        String a(String str);
    }

    static {
        Covode.recordClassIndex(45219);
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$a  reason: collision with other inner class name */
    public static final class C1638a {
        static {
            Covode.recordClassIndex(45220);
        }

        private C1638a() {
        }

        public /* synthetic */ C1638a(byte b2) {
            this();
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73450a;

        static {
            Covode.recordClassIndex(45225);
        }

        c(a aVar) {
            this.f73450a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                q.a(this.f73450a.f73444b, this.f73450a.f73443a);
                return z.f158842a;
            } catch (Throwable unused) {
                return 0;
            }
        }
    }

    public final void a() {
        a("data_type", "commerce_data", b.C1639a.f73447a);
        b();
        this.f73443a.putAll(this.f73445d);
        i.b(new c(this), i.f4824a);
    }

    public final boolean a(String str) {
        l.d(str, "");
        return this.f73443a.containsKey(str);
    }

    public a(String str) {
        l.d(str, "");
        this.f73444b = str;
    }

    public final void a(String str, String str2, b bVar) {
        l.d(str, "");
        l.d(bVar, "");
        if (str2 != null) {
            this.f73443a.put(str, bVar.a(str2));
        }
    }
}

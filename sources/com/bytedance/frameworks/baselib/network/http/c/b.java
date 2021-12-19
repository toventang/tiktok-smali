package com.bytedance.frameworks.baselib.network.http.c;

import com.bytedance.covode.number.Covode;
import java.net.URI;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f28955a = new b() {
        /* class com.bytedance.frameworks.baselib.network.http.c.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16990);
        }

        @Override // com.bytedance.frameworks.baselib.network.http.c.b
        public final boolean a(URI uri, e eVar) {
            return true;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static final b f28956b = new b() {
        /* class com.bytedance.frameworks.baselib.network.http.c.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(16991);
        }

        @Override // com.bytedance.frameworks.baselib.network.http.c.b
        public final boolean a(URI uri, e eVar) {
            return false;
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public static final b f28957c = new b() {
        /* class com.bytedance.frameworks.baselib.network.http.c.b.AnonymousClass3 */

        static {
            Covode.recordClassIndex(16992);
        }

        @Override // com.bytedance.frameworks.baselib.network.http.c.b
        public final boolean a(URI uri, e eVar) {
            return e.a(eVar.f28963d, uri.getHost());
        }
    };

    boolean a(URI uri, e eVar);

    static {
        Covode.recordClassIndex(16989);
    }
}

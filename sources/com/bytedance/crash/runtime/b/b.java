package com.bytedance.crash.runtime.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.m;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final b f27889b = new b() {
        /* class com.bytedance.crash.runtime.b.b.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        Header f27891a;

        static {
            Covode.recordClassIndex(16325);
        }

        @Override // com.bytedance.crash.runtime.b.b
        public final Object b(String str) {
            if (this.f27891a == null) {
                this.f27891a = Header.b(m.f27724a);
            }
            return this.f27891a.f27553a.opt(str);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private b f27890a;

    public b() {
        this(f27889b);
    }

    static {
        Covode.recordClassIndex(16324);
    }

    private b(b bVar) {
        this.f27890a = bVar;
    }

    public Object a(String str) {
        b bVar = this.f27890a;
        if (bVar != null) {
            return bVar.a(str);
        }
        return null;
    }

    public Object b(String str) {
        b bVar = this.f27890a;
        if (bVar != null) {
            return bVar.b(str);
        }
        return null;
    }
}

package com.bytedance.im.core.internal.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.d.bd;
import com.bytedance.im.core.internal.d.b.c;
import com.bytedance.im.core.internal.utils.x;
import com.bytedance.im.core.proto.Response;
import java.util.List;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final e f38715a = new e() {
        /* class com.bytedance.im.core.internal.d.f.AnonymousClass1 */

        static {
            Covode.recordClassIndex(23096);
        }

        @Override // com.bytedance.im.core.internal.d.e
        public final c d() {
            return null;
        }

        @Override // com.bytedance.im.core.internal.d.e
        public final void e() {
            throw new IllegalStateException("can't access here");
        }

        @Override // com.bytedance.im.core.internal.d.e
        public final void a(x xVar) {
            throw new IllegalStateException("can't access here");
        }

        @Override // com.bytedance.im.core.internal.d.e
        public final void e(k kVar) {
            throw new IllegalStateException("can't access here");
        }

        @Override // com.bytedance.im.core.internal.d.e
        public final void a(List<Long> list) {
            throw new IllegalStateException("can't access here");
        }

        @Override // com.bytedance.im.core.internal.d.e
        public final void a(Response response, bd bdVar) {
            throw new IllegalStateException("can't access here");
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final a f38716b;

    /* renamed from: c  reason: collision with root package name */
    private volatile e f38717c = f38715a;

    /* renamed from: d  reason: collision with root package name */
    private x f38718d;

    public interface a {
        static {
            Covode.recordClassIndex(23097);
        }

        e a();
    }

    @Override // com.bytedance.im.core.internal.d.e
    public final c d() {
        return this.f38717c.d();
    }

    static {
        Covode.recordClassIndex(23095);
    }

    @Override // com.bytedance.im.core.internal.d.e
    public final void e() {
        if (a()) {
            this.f38717c.e();
        }
    }

    public final synchronized void b() {
        MethodCollector.i(10062);
        if (!a()) {
            c();
        }
        MethodCollector.o(10062);
    }

    private synchronized void c() {
        MethodCollector.i(10226);
        if (this.f38717c != f38715a) {
            MethodCollector.o(10226);
            return;
        }
        this.f38717c = this.f38716b.a();
        this.f38717c.a(this.f38718d);
        MethodCollector.o(10226);
    }

    public final boolean a() {
        if (this.f38717c != f38715a) {
            return true;
        }
        return false;
    }

    public f(a aVar) {
        this.f38716b = aVar;
    }

    @Override // com.bytedance.im.core.internal.d.e
    public final void a(x xVar) {
        if (a()) {
            this.f38717c.a(xVar);
        } else {
            this.f38718d = xVar;
        }
    }

    @Override // com.bytedance.im.core.internal.d.e
    public final void e(k kVar) {
        if (!a()) {
            c();
        }
        this.f38717c.e(kVar);
    }

    @Override // com.bytedance.im.core.internal.d.e
    public final void a(List<Long> list) {
        if (a()) {
            this.f38717c.a(list);
        }
    }

    @Override // com.bytedance.im.core.internal.d.e
    public final void a(Response response, bd bdVar) {
        if (!a()) {
            c();
        }
        this.f38717c.a(response, bdVar);
    }
}

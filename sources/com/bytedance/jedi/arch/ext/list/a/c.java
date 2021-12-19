package com.bytedance.jedi.arch.ext.list.a;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.Executor;

public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f39435a;

    /* renamed from: b  reason: collision with root package name */
    public final j.e<T> f39436b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f39437c;

    static {
        Covode.recordClassIndex(24237);
    }

    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        Executor f39438a;

        /* renamed from: b  reason: collision with root package name */
        private final j.e<T> f39439b;

        static {
            Covode.recordClassIndex(24238);
        }

        public final c<T> a() {
            return new c<>(this.f39439b, this.f39438a, (byte) 0);
        }

        public a(j.e<T> eVar) {
            l.c(eVar, "");
            this.f39439b = eVar;
        }
    }

    private c(j.e<T> eVar, Executor executor) {
        this.f39436b = eVar;
        this.f39437c = executor;
        this.f39435a = com.bytedance.jedi.arch.j.f39538d.invoke();
    }

    public /* synthetic */ c(j.e eVar, Executor executor, byte b2) {
        this(eVar, executor);
    }
}

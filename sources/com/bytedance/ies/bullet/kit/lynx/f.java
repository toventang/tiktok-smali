package com.bytedance.ies.bullet.kit.lynx;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Iterator;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    final List<a> f32344a;

    /* renamed from: b  reason: collision with root package name */
    private final i f32345b;

    static {
        Covode.recordClassIndex(18989);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.ies.bullet.kit.lynx.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(i iVar, List<? extends a> list) {
        l.c(iVar, "");
        l.c(list, "");
        this.f32345b = iVar;
        this.f32344a = list;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.m<Object, Throwable, z> {
        final /* synthetic */ h $input;
        final /* synthetic */ Iterator $iterator;
        final /* synthetic */ b $reject;
        final /* synthetic */ b $resolve;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(18990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, b bVar, Iterator it, h hVar, b bVar2) {
            super(2);
            this.this$0 = fVar;
            this.$resolve = bVar;
            this.$iterator = it;
            this.$input = hVar;
            this.$reject = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Throwable th) {
            Throwable th2 = th;
            if (obj != null) {
                this.$resolve.invoke(obj);
            } else {
                f fVar = this.this$0;
                Iterator<? extends a> it = this.$iterator;
                h hVar = this.$input;
                b<Object, z> bVar = this.$resolve;
                b<? super Throwable, z> bVar2 = this.$reject;
                if (th2 == null) {
                    th2 = new IllegalStateException("loadImage failed, Bitmap is null");
                }
                fVar.a(it, hVar, bVar, bVar2, th2);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Iterator<? extends a> it, h hVar, b<Object, z> bVar, b<? super Throwable, z> bVar2) {
        try {
            ((a) it.next()).a(this.f32345b, hVar.f32347a, new a(this, bVar, it, hVar, bVar2));
        } catch (Exception e2) {
            a(it, hVar, bVar, bVar2, e2);
        }
    }

    public final void a(Iterator<? extends a> it, h hVar, b<Object, z> bVar, b<? super Throwable, z> bVar2, Throwable th) {
        if (it.hasNext()) {
            a(it, hVar, bVar, bVar2);
        } else {
            bVar2.invoke(th);
        }
    }
}

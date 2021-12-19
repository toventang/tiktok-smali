package com.bytedance.jedi.ext.adapter.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.ext.adapter.a.a;
import com.bytedance.jedi.ext.adapter.a.d;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.List;

public abstract class a<T, DEC extends d<T>, RECEIVER extends com.bytedance.jedi.arch.g, SELF extends a<T, DEC, RECEIVER, SELF>> {

    /* renamed from: a  reason: collision with root package name */
    public View f39571a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.b<? super ViewGroup, ? extends RecyclerView.ViewHolder> f39572b;

    /* renamed from: c  reason: collision with root package name */
    public View f39573c;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.b<? super ViewGroup, ? extends RecyclerView.ViewHolder> f39574d;

    /* renamed from: e  reason: collision with root package name */
    public int f39575e = 242;

    /* renamed from: f  reason: collision with root package name */
    public m<? super ViewGroup, ? super h.f.a.a<z>, ? extends e> f39576f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f39577g = {1};

    /* renamed from: h  reason: collision with root package name */
    public m<? super ViewGroup, ? super h.f.a.a<z>, ? extends c> f39578h = c.f39597a;

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.jedi.arch.ext.list.c<T, RECEIVER> f39579i;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.jedi.arch.ext.list.c<T, RECEIVER> f39580j;

    /* renamed from: k  reason: collision with root package name */
    public m<? super RECEIVER, ? super Boolean, z> f39581k;

    /* renamed from: l  reason: collision with root package name */
    public m<? super RECEIVER, ? super Boolean, z> f39582l;

    /* renamed from: m  reason: collision with root package name */
    public h.f.a.b<? super RECEIVER, z> f39583m;
    public final com.bytedance.jedi.ext.adapter.a<T, ?, ?> n;
    public final DEC o;
    public final h<RECEIVER> p;

    static {
        Covode.recordClassIndex(24367);
    }

    public static final class d implements com.bytedance.jedi.arch.ext.list.c<T, RECEIVER> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f39600a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f39601b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f39602c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<RECEIVER, z> f39603d;

        /* renamed from: e  reason: collision with root package name */
        private final m<RECEIVER, Throwable, z> f39604e;

        /* renamed from: f  reason: collision with root package name */
        private final m<RECEIVER, List<? extends T>, z> f39605f;

        static {
            Covode.recordClassIndex(24371);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<RECEIVER, h.z>, h.f.a.b<RECEIVER extends com.bytedance.jedi.arch.g, h.z> */
        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<RECEIVER, z> a() {
            return (h.f.a.b<RECEIVER, z>) this.f39603d;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.m<RECEIVER, java.lang.Throwable, h.z>, h.f.a.m<RECEIVER extends com.bytedance.jedi.arch.g, java.lang.Throwable, h.z> */
        @Override // com.bytedance.jedi.arch.ext.list.c
        public final m<RECEIVER, Throwable, z> b() {
            return (m<RECEIVER, Throwable, z>) this.f39604e;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.m<RECEIVER, java.util.List<? extends T>, h.z>, h.f.a.m<RECEIVER extends com.bytedance.jedi.arch.g, java.util.List<? extends T>, h.z> */
        @Override // com.bytedance.jedi.arch.ext.list.c
        public final m<RECEIVER, List<? extends T>, z> c() {
            return (m<RECEIVER, List<? extends T>, z>) this.f39605f;
        }

        public d(h.f.a.b bVar, m mVar, m mVar2) {
            this.f39600a = bVar;
            this.f39601b = mVar;
            this.f39602c = mVar2;
            this.f39603d = bVar;
            this.f39604e = mVar;
            this.f39605f = mVar2;
        }
    }

    public static final class g implements com.bytedance.jedi.arch.ext.list.c<T, RECEIVER> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f39612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f39613b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f39614c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<RECEIVER, z> f39615d;

        /* renamed from: e  reason: collision with root package name */
        private final m<RECEIVER, Throwable, z> f39616e;

        /* renamed from: f  reason: collision with root package name */
        private final m<RECEIVER, List<? extends T>, z> f39617f;

        static {
            Covode.recordClassIndex(24374);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<RECEIVER, h.z>, h.f.a.b<RECEIVER extends com.bytedance.jedi.arch.g, h.z> */
        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<RECEIVER, z> a() {
            return (h.f.a.b<RECEIVER, z>) this.f39615d;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.m<RECEIVER, java.lang.Throwable, h.z>, h.f.a.m<RECEIVER extends com.bytedance.jedi.arch.g, java.lang.Throwable, h.z> */
        @Override // com.bytedance.jedi.arch.ext.list.c
        public final m<RECEIVER, Throwable, z> b() {
            return (m<RECEIVER, Throwable, z>) this.f39616e;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.m<RECEIVER, java.util.List<? extends T>, h.z>, h.f.a.m<RECEIVER extends com.bytedance.jedi.arch.g, java.util.List<? extends T>, h.z> */
        @Override // com.bytedance.jedi.arch.ext.list.c
        public final m<RECEIVER, List<? extends T>, z> c() {
            return (m<RECEIVER, List<? extends T>, z>) this.f39617f;
        }

        public g(h.f.a.b bVar, m mVar, m mVar2) {
            this.f39612a = bVar;
            this.f39613b = mVar;
            this.f39614c = mVar2;
            this.f39615d = bVar;
            this.f39616e = mVar;
            this.f39617f = mVar2;
        }
    }

    public final SELF a(int i2) {
        this.f39575e = i2;
        return this;
    }

    public static final class e extends h.f.b.m implements h.f.a.b<RECEIVER, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f39606a = new e();

        static {
            Covode.recordClassIndex(24372);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            l.c(obj, "");
            return z.f158842a;
        }
    }

    public final SELF a(m<? super ViewGroup, ? super h.f.a.a<z>, ? extends e> mVar) {
        l.c(mVar, "");
        this.f39576f = mVar;
        return this;
    }

    public static final class f extends h.f.b.m implements m<RECEIVER, Throwable, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f39607a = new f();

        static {
            Covode.recordClassIndex(24373);
        }

        f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Throwable th) {
            l.c(obj, "");
            l.c(th, "");
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.ext.adapter.a.a$a  reason: collision with other inner class name */
    public static final class C0966a extends h.f.b.m implements m<ViewGroup, h.f.a.a<? extends z>, com.bytedance.jedi.ext.adapter.a.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0966a f39587a = new C0966a();

        static {
            Covode.recordClassIndex(24368);
        }

        C0966a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ com.bytedance.jedi.ext.adapter.a.a.a invoke(ViewGroup viewGroup, h.f.a.a<? extends z> aVar) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.a.a<? extends z> aVar2 = aVar;
            l.c(viewGroup2, "");
            l.c(aVar2, "");
            return new com.bytedance.jedi.ext.adapter.a.a.a(viewGroup2, aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements m<ViewGroup, h.f.a.a<? extends z>, com.bytedance.jedi.ext.adapter.a.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f39592a = new b();

        static {
            Covode.recordClassIndex(24369);
        }

        b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ com.bytedance.jedi.ext.adapter.a.a.b invoke(ViewGroup viewGroup, h.f.a.a<? extends z> aVar) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.a.a<? extends z> aVar2 = aVar;
            l.c(viewGroup2, "");
            l.c(aVar2, "");
            return new com.bytedance.jedi.ext.adapter.a.a.b(viewGroup2, aVar2);
        }
    }

    static final class c extends h.f.b.m implements m<ViewGroup, h.f.a.a<? extends z>, com.bytedance.jedi.ext.adapter.a.a.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f39597a = new c();

        static {
            Covode.recordClassIndex(24370);
        }

        c() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ com.bytedance.jedi.ext.adapter.a.a.c invoke(ViewGroup viewGroup, h.f.a.a<? extends z> aVar) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.a.a<? extends z> aVar2 = aVar;
            l.c(viewGroup2, "");
            l.c(aVar2, "");
            return new com.bytedance.jedi.ext.adapter.a.a.c(viewGroup2, aVar2);
        }
    }

    public final SELF a(h.f.a.b<? super RECEIVER, z> bVar, m<? super RECEIVER, ? super Throwable, z> mVar, m<? super RECEIVER, ? super List<? extends T>, z> mVar2) {
        l.c(bVar, "");
        l.c(mVar, "");
        l.c(mVar2, "");
        this.f39579i = new g(bVar, mVar, mVar2);
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.bytedance.jedi.arch.h<? extends RECEIVER extends com.bytedance.jedi.arch.g> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(com.bytedance.jedi.ext.adapter.a<T, ?, ?> aVar, DEC dec, h<? extends RECEIVER> hVar) {
        l.c(aVar, "");
        l.c(dec, "");
        l.c(hVar, "");
        this.n = aVar;
        this.o = dec;
        this.p = hVar;
    }
}

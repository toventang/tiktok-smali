package com.bytedance.ies.foundation.fragment;

import android.content.Context;
import androidx.fragment.app.i;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.z;
import h.k.k;
import java.lang.ref.WeakReference;

public abstract class d extends com.bytedance.ies.foundation.base.c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f33903b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<a> f33904a;

    static {
        Covode.recordClassIndex(20155);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20156);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f33905a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f33906b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f33907c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f33908d;

        static {
            Covode.recordClassIndex(20157);
        }

        public b(k kVar, a aVar, z.e eVar, h.f.a.b bVar) {
            this.f33905a = kVar;
            this.f33906b = aVar;
            this.f33907c = eVar;
            this.f33908d = bVar;
        }

        @Override // androidx.a.a.c.a
        public final /* synthetic */ Object a(Object obj) {
            k kVar = this.f33905a;
            l.b(obj, "");
            return new com.bytedance.ies.foundation.base.a.a(kVar.get(obj));
        }
    }

    public static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f33909a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f33910b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f33911c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f33912d;

        static {
            Covode.recordClassIndex(20158);
        }

        public c(k kVar, a aVar, z.e eVar, h.f.a.b bVar) {
            this.f33909a = kVar;
            this.f33910b = aVar;
            this.f33911c = eVar;
            this.f33912d = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            T t = (T) ((com.bytedance.ies.foundation.base.a.a) obj);
            if (!l.a((Object) t, (Object) this.f33911c.element)) {
                h.f.a.b bVar = this.f33912d;
                if (bVar != null) {
                    bVar.invoke(t.f33886a);
                }
                this.f33911c.element = t;
            }
        }
    }

    /* renamed from: com.bytedance.ies.foundation.fragment.d$d  reason: collision with other inner class name */
    public static final class C0743d<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f33913a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f33914b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f33915c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f33916d;

        static {
            Covode.recordClassIndex(20159);
        }

        public C0743d(k kVar, a aVar, z.e eVar, h.f.a.b bVar) {
            this.f33913a = kVar;
            this.f33914b = aVar;
            this.f33915c = eVar;
            this.f33916d = bVar;
        }

        @Override // androidx.a.a.c.a
        public final /* synthetic */ Object a(Object obj) {
            k kVar = this.f33913a;
            l.b(obj, "");
            return new com.bytedance.ies.foundation.base.a.a(kVar.get(obj));
        }
    }

    public static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f33917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f33918b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f33919c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f33920d;

        static {
            Covode.recordClassIndex(20160);
        }

        public e(k kVar, a aVar, z.e eVar, h.f.a.b bVar) {
            this.f33917a = kVar;
            this.f33918b = aVar;
            this.f33919c = eVar;
            this.f33920d = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            T t = (T) ((com.bytedance.ies.foundation.base.a.a) obj);
            if (!l.a((Object) t, (Object) this.f33919c.element)) {
                h.f.a.b bVar = this.f33920d;
                if (bVar != null) {
                    bVar.invoke(t.f33886a);
                }
                this.f33919c.element = t;
            }
        }
    }

    @Override // com.bytedance.ies.foundation.base.c, com.bytedance.ies.foundation.fragment.c
    public final void c(i iVar, a aVar) {
        l.d(iVar, "");
        l.d(aVar, "");
        super.c(iVar, aVar);
        this.f33904a = null;
    }

    @Override // com.bytedance.ies.foundation.base.c, com.bytedance.ies.foundation.fragment.c
    public final void a(i iVar, a aVar, Context context) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(context, "");
        super.a(iVar, aVar, context);
        if (aVar != null) {
            this.f33904a = new WeakReference<>(aVar);
        }
    }
}

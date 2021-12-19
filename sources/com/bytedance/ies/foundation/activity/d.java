package com.bytedance.ies.foundation.activity;

import android.os.Bundle;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.b.l;
import h.f.b.z;
import h.k.k;
import java.lang.ref.WeakReference;

public abstract class d extends com.bytedance.ies.foundation.base.c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f33848b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<a> f33849a;

    static {
        Covode.recordClassIndex(20112);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20113);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public void d(a aVar) {
        l.d(aVar, "");
        super.d(aVar);
        this.f33849a = null;
    }

    public static final class b<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f33850a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f33851b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f33852c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f33853d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f33854e;

        static {
            Covode.recordClassIndex(20114);
        }

        public b(k kVar, k kVar2, a aVar, z.e eVar, m mVar) {
            this.f33850a = kVar;
            this.f33851b = kVar2;
            this.f33852c = aVar;
            this.f33853d = eVar;
            this.f33854e = mVar;
        }

        @Override // androidx.a.a.c.a
        public final /* synthetic */ Object a(Object obj) {
            k kVar = this.f33850a;
            l.b(obj, "");
            return new com.bytedance.ies.foundation.base.a.b(kVar.get(obj), this.f33851b.get(obj));
        }
    }

    public static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f33855a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f33856b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f33857c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f33858d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f33859e;

        static {
            Covode.recordClassIndex(20115);
        }

        public c(k kVar, k kVar2, a aVar, z.e eVar, m mVar) {
            this.f33855a = kVar;
            this.f33856b = kVar2;
            this.f33857c = aVar;
            this.f33858d = eVar;
            this.f33859e = mVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            T t = (T) ((com.bytedance.ies.foundation.base.a.b) obj);
            if (!l.a((Object) t, (Object) this.f33858d.element)) {
                m mVar = this.f33859e;
                if (mVar != null) {
                    mVar.invoke(t.f33887a, t.f33888b);
                }
                this.f33858d.element = t;
            }
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.d$d  reason: collision with other inner class name */
    public static final class C0739d<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f33860a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f33861b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f33862c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f33863d;

        static {
            Covode.recordClassIndex(20116);
        }

        public C0739d(k kVar, a aVar, z.e eVar, h.f.a.b bVar) {
            this.f33860a = kVar;
            this.f33861b = aVar;
            this.f33862c = eVar;
            this.f33863d = bVar;
        }

        @Override // androidx.a.a.c.a
        public final /* synthetic */ Object a(Object obj) {
            k kVar = this.f33860a;
            l.b(obj, "");
            return new com.bytedance.ies.foundation.base.a.a(kVar.get(obj));
        }
    }

    public static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f33864a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f33865b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f33866c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f33867d;

        static {
            Covode.recordClassIndex(20117);
        }

        public e(k kVar, a aVar, z.e eVar, h.f.a.b bVar) {
            this.f33864a = kVar;
            this.f33865b = aVar;
            this.f33866c = eVar;
            this.f33867d = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            T t = (T) ((com.bytedance.ies.foundation.base.a.a) obj);
            if (!l.a((Object) t, (Object) this.f33866c.element)) {
                h.f.a.b bVar = this.f33867d;
                if (bVar != null) {
                    bVar.invoke(t.f33886a);
                }
                this.f33866c.element = t;
            }
        }
    }

    public static final class f<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f33868a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f33869b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f33870c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f33871d;

        static {
            Covode.recordClassIndex(20118);
        }

        public f(k kVar, a aVar, z.e eVar, h.f.a.b bVar) {
            this.f33868a = kVar;
            this.f33869b = aVar;
            this.f33870c = eVar;
            this.f33871d = bVar;
        }

        @Override // androidx.a.a.c.a
        public final /* synthetic */ Object a(Object obj) {
            k kVar = this.f33868a;
            l.b(obj, "");
            return new com.bytedance.ies.foundation.base.a.a(kVar.get(obj));
        }
    }

    public static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f33872a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f33873b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f33874c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f33875d;

        static {
            Covode.recordClassIndex(20119);
        }

        public g(k kVar, a aVar, z.e eVar, h.f.a.b bVar) {
            this.f33872a = kVar;
            this.f33873b = aVar;
            this.f33874c = eVar;
            this.f33875d = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            T t = (T) ((com.bytedance.ies.foundation.base.a.a) obj);
            if (!l.a((Object) t, (Object) this.f33874c.element)) {
                h.f.a.b bVar = this.f33875d;
                if (bVar != null) {
                    bVar.invoke(t.f33886a);
                }
                this.f33874c.element = t;
            }
        }
    }

    public static final class h<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f33876a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f33877b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f33878c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f33879d;

        static {
            Covode.recordClassIndex(20120);
        }

        public h(k kVar, a aVar, z.e eVar, h.f.a.b bVar) {
            this.f33876a = kVar;
            this.f33877b = aVar;
            this.f33878c = eVar;
            this.f33879d = bVar;
        }

        @Override // androidx.a.a.c.a
        public final /* synthetic */ Object a(Object obj) {
            k kVar = this.f33876a;
            l.b(obj, "");
            return new com.bytedance.ies.foundation.base.a.a(kVar.get(obj));
        }
    }

    public static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f33880a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f33881b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f33882c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f33883d;

        static {
            Covode.recordClassIndex(20121);
        }

        public i(k kVar, a aVar, z.e eVar, h.f.a.b bVar) {
            this.f33880a = kVar;
            this.f33881b = aVar;
            this.f33882c = eVar;
            this.f33883d = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            T t = (T) ((com.bytedance.ies.foundation.base.a.a) obj);
            if (!l.a((Object) t, (Object) this.f33882c.element)) {
                h.f.a.b bVar = this.f33883d;
                if (bVar != null) {
                    bVar.invoke(t.f33886a);
                }
                this.f33882c.element = t;
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public void b(a aVar, Bundle bundle) {
        l.d(aVar, "");
        super.b(aVar, bundle);
        if (aVar != null) {
            this.f33849a = new WeakReference<>(aVar);
        }
    }
}

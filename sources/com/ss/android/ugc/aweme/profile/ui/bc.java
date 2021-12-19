package com.ss.android.ugc.aweme.profile.ui;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c;
import f.a.d.f;
import f.a.d.g;
import h.f.b.l;
import h.k.k;

public final class bc implements com.ss.android.ugc.aweme.story.base.d {

    /* renamed from: a  reason: collision with root package name */
    public bd f116923a;

    /* renamed from: b  reason: collision with root package name */
    public final m f116924b;

    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f116929a = new d();

        static {
            Covode.recordClassIndex(75512);
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(75508);
    }

    @Override // androidx.lifecycle.m
    public final i getLifecycle() {
        i lifecycle = this.f116924b.getLifecycle();
        l.b(lifecycle, "");
        return lifecycle;
    }

    public static final class b<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k[] f116927a;

        static {
            Covode.recordClassIndex(75510);
        }

        public b(k[] kVarArr) {
            this.f116927a = kVarArr;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            c.a aVar = (c.a) obj;
            l.d(aVar, "");
            return c.a.a(aVar.f136890a, aVar.f136891b, aVar.f136892c, this.f116927a);
        }
    }

    public bc(m mVar) {
        l.d(mVar, "");
        this.f116924b = mVar;
    }

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bc f116928a;

        static {
            Covode.recordClassIndex(75511);
        }

        public c(bc bcVar) {
            this.f116928a = bcVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Aweme clone = ((c.a) obj).f136892c.clone();
            l.b(clone, "");
            bd bdVar = this.f116928a.f116923a;
            if (bdVar != null) {
                bdVar.a(clone);
            }
        }
    }

    public static final class a<T> implements f.a.d.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f116925a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c f116926b;

        static {
            Covode.recordClassIndex(75509);
        }

        public a(Object obj, com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c cVar) {
            this.f116925a = obj;
            this.f116926b = cVar;
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            c.a aVar = (c.a) obj;
            l.d(aVar, "");
            if (!l.a(this.f116926b.a((Object) aVar.f136891b, (Object) aVar.f136892c), this.f116925a) || !(!aVar.f136890a.isEmpty())) {
                return false;
            }
            return true;
        }
    }
}

package com.ss.android.ugc.aweme.creatortools.creatorplus;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusApi;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class CreatorPlusViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f78390a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    private final h f78391b = i.a((h.f.a.a) d.f78396a);

    /* renamed from: c  reason: collision with root package name */
    private final h f78392c = i.a((h.f.a.a) c.f78395a);

    static {
        Covode.recordClassIndex(48682);
    }

    public final t<d> a() {
        return (t) this.f78391b.getValue();
    }

    public final t<BaseResponse> b() {
        return (t) this.f78392c.getValue();
    }

    static final class c extends m implements h.f.a.a<t<BaseResponse>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f78395a = new c();

        static {
            Covode.recordClassIndex(48685);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<BaseResponse> invoke() {
            return new t();
        }
    }

    static final class d extends m implements h.f.a.a<t<d>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f78396a = new d();

        static {
            Covode.recordClassIndex(48686);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<d> invoke() {
            return new t();
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f78390a.dispose();
    }

    public final void c() {
        this.f78390a.a(CreatorPlusApi.a.a().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(this), new f(this)));
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorPlusViewModel f78393a;

        static {
            Covode.recordClassIndex(48683);
        }

        a(CreatorPlusViewModel creatorPlusViewModel) {
            this.f78393a = creatorPlusViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f78393a.b().setValue(obj);
            } else {
                this.f78393a.b().setValue(null);
            }
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorPlusViewModel f78394a;

        static {
            Covode.recordClassIndex(48684);
        }

        b(CreatorPlusViewModel creatorPlusViewModel) {
            this.f78394a = creatorPlusViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.d(th, "");
            this.f78394a.b().setValue(null);
            th.getMessage();
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorPlusViewModel f78397a;

        static {
            Covode.recordClassIndex(48687);
        }

        e(CreatorPlusViewModel creatorPlusViewModel) {
            this.f78397a = creatorPlusViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f78397a.a().setValue(obj);
            } else {
                this.f78397a.a().setValue(null);
            }
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorPlusViewModel f78398a;

        static {
            Covode.recordClassIndex(48688);
        }

        f(CreatorPlusViewModel creatorPlusViewModel) {
            this.f78398a = creatorPlusViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.d(th, "");
            this.f78398a.a().setValue(null);
            th.getMessage();
        }
    }
}

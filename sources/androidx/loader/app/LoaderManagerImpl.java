package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import androidx.c.h;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.loader.a.c;
import androidx.loader.app.a;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* access modifiers changed from: package-private */
public final class LoaderManagerImpl extends a {

    /* renamed from: a  reason: collision with root package name */
    static boolean f3609a;

    /* renamed from: b  reason: collision with root package name */
    private final m f3610b;

    /* renamed from: c  reason: collision with root package name */
    private final LoaderViewModel f3611c;

    static {
        Covode.recordClassIndex(1368);
    }

    public static class a<D> extends t<D> implements c.b<D> {

        /* renamed from: a  reason: collision with root package name */
        final int f3615a;

        /* renamed from: b  reason: collision with root package name */
        final Bundle f3616b;

        /* renamed from: c  reason: collision with root package name */
        public final c<D> f3617c;

        /* renamed from: d  reason: collision with root package name */
        b<D> f3618d;

        /* renamed from: e  reason: collision with root package name */
        private m f3619e;

        /* renamed from: f  reason: collision with root package name */
        private c<D> f3620f = null;

        static {
            Covode.recordClassIndex(1371);
        }

        @Override // androidx.lifecycle.LiveData
        public final void onActive() {
            this.f3617c.j();
        }

        @Override // androidx.lifecycle.LiveData
        public final void onInactive() {
            this.f3617c.m();
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            m mVar = this.f3619e;
            b<D> bVar = this.f3618d;
            if (mVar != null && bVar != null) {
                super.removeObserver(bVar);
                observe(mVar, bVar);
            }
        }

        /* access modifiers changed from: package-private */
        public final c<D> b() {
            this.f3617c.k();
            this.f3617c.r = true;
            b<D> bVar = this.f3618d;
            if (bVar != null) {
                removeObserver(bVar);
                bVar.a();
            }
            this.f3617c.a(this);
            this.f3617c.n();
            return this.f3620f;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3615a);
            sb.append(" : ");
            androidx.core.g.b.a(this.f3617c, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.lifecycle.u<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void removeObserver(u<? super D> uVar) {
            super.removeObserver(uVar);
            this.f3619e = null;
            this.f3618d = null;
        }

        @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
        public final void setValue(D d2) {
            super.setValue(d2);
            c<D> cVar = this.f3620f;
            if (cVar != null) {
                cVar.n();
                this.f3620f = null;
            }
        }

        @Override // androidx.loader.a.c.b
        public final void a(D d2) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d2);
            } else {
                postValue(d2);
            }
        }

        /* access modifiers changed from: package-private */
        public final c<D> a(m mVar, a.AbstractC0052a<D> aVar) {
            b<D> bVar = new b<>(this.f3617c, aVar);
            observe(mVar, bVar);
            b<D> bVar2 = this.f3618d;
            if (bVar2 != null) {
                removeObserver(bVar2);
            }
            this.f3619e = mVar;
            this.f3618d = bVar;
            return this.f3617c;
        }

        a(int i2, Bundle bundle, c<D> cVar) {
            this.f3615a = i2;
            this.f3616b = bundle;
            this.f3617c = cVar;
            if (cVar.o == null) {
                cVar.o = this;
                cVar.n = i2;
                return;
            }
            throw new IllegalStateException("There is already a listener registered");
        }
    }

    /* access modifiers changed from: package-private */
    public static class b<D> implements u<D> {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3621a;

        /* renamed from: b  reason: collision with root package name */
        private final c<D> f3622b;

        /* renamed from: c  reason: collision with root package name */
        private final a.AbstractC0052a<D> f3623c;

        static {
            Covode.recordClassIndex(1372);
        }

        public final String toString() {
            return this.f3623c.toString();
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (this.f3621a) {
                this.f3623c.a();
            }
        }

        @Override // androidx.lifecycle.u
        public final void onChanged(D d2) {
            if (LoaderManagerImpl.f3609a) {
                c.c(d2);
            }
            this.f3623c.a((Object) d2);
            this.f3621a = true;
        }

        b(c<D> cVar, a.AbstractC0052a<D> aVar) {
            this.f3622b = cVar;
            this.f3623c = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static class LoaderViewModel extends ac {

        /* renamed from: a  reason: collision with root package name */
        static final ad.b f3612a = new ad.b() {
            /* class androidx.loader.app.LoaderManagerImpl.LoaderViewModel.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1370);
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                return new LoaderViewModel();
            }
        };

        /* renamed from: b  reason: collision with root package name */
        h<a> f3613b = new h<>();

        /* renamed from: c  reason: collision with root package name */
        public boolean f3614c = false;

        static {
            Covode.recordClassIndex(1369);
        }

        LoaderViewModel() {
        }

        @Override // androidx.lifecycle.ac
        public void onCleared() {
            super.onCleared();
            int b2 = this.f3613b.b();
            for (int i2 = 0; i2 < b2; i2++) {
                this.f3613b.d(i2).b();
            }
            h<a> hVar = this.f3613b;
            int i3 = hVar.f1843c;
            Object[] objArr = hVar.f1842b;
            for (int i4 = 0; i4 < i3; i4++) {
                objArr[i4] = null;
            }
            hVar.f1843c = 0;
            hVar.f1841a = false;
        }

        /* access modifiers changed from: package-private */
        public final <D> a<D> a(int i2) {
            return this.f3613b.a(i2, null);
        }
    }

    @Override // androidx.loader.app.a
    public final void a() {
        LoaderViewModel loaderViewModel = this.f3611c;
        int b2 = loaderViewModel.f3613b.b();
        for (int i2 = 0; i2 < b2; i2++) {
            loaderViewModel.f3613b.d(i2).a();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.core.g.b.a(this.f3610b, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // androidx.loader.app.a
    public final void a(int i2) {
        if (this.f3611c.f3614c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a a2 = this.f3611c.a(i2);
            if (a2 != null) {
                a2.b();
                this.f3611c.f3613b.b(i2);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    LoaderManagerImpl(m mVar, af afVar) {
        this.f3610b = mVar;
        this.f3611c = (LoaderViewModel) new ad(afVar, LoaderViewModel.f3612a).a(LoaderViewModel.class);
    }

    @Override // androidx.loader.app.a
    public final <D> c<D> a(int i2, Bundle bundle, a.AbstractC0052a<D> aVar) {
        if (this.f3611c.f3614c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a<D> a2 = this.f3611c.a(i2);
            if (a2 == null) {
                return b(i2, bundle, aVar);
            }
            return a2.a(this.f3610b, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    /* JADX INFO: finally extract failed */
    private <D> c<D> b(int i2, Bundle bundle, a.AbstractC0052a<D> aVar) {
        try {
            this.f3611c.f3614c = true;
            c<D> a2 = aVar.a(bundle);
            if (a2 == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            } else if (!a2.getClass().isMemberClass() || Modifier.isStatic(a2.getClass().getModifiers())) {
                a aVar2 = new a(i2, bundle, a2);
                this.f3611c.f3613b.b(i2, aVar2);
                this.f3611c.f3614c = false;
                return aVar2.a(this.f3610b, aVar);
            } else {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: ".concat(String.valueOf(a2)));
            }
        } catch (Throwable th) {
            this.f3611c.f3614c = false;
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        LoaderViewModel loaderViewModel = this.f3611c;
        if (loaderViewModel.f3613b.b() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < loaderViewModel.f3613b.b(); i2++) {
                a d2 = loaderViewModel.f3613b.d(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(loaderViewModel.f3613b.c(i2));
                printWriter.print(": ");
                printWriter.println(d2.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(d2.f3615a);
                printWriter.print(" mArgs=");
                printWriter.println(d2.f3616b);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(d2.f3617c);
                d2.f3617c.a(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (d2.f3618d != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(d2.f3618d);
                    b<D> bVar = d2.f3618d;
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar.f3621a);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(c.c(d2.getValue()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(d2.hasActiveObservers());
            }
        }
    }
}

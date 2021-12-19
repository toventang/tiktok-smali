package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.s;

public final class d {

    public interface b<R> {
        static {
            Covode.recordClassIndex(31301);
        }

        void a(R r);
    }

    static {
        Covode.recordClassIndex(31299);
    }

    public static abstract class a<R extends p, A extends a.b> extends BasePendingResult<R> implements b<R> {

        /* renamed from: a  reason: collision with root package name */
        public final a.c<A> f50220a;

        /* renamed from: b  reason: collision with root package name */
        public final com.google.android.gms.common.api.a<?> f50221b;

        static {
            Covode.recordClassIndex(31300);
        }

        /* access modifiers changed from: protected */
        public abstract void a(A a2);

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.common.api.internal.d$a<R extends com.google.android.gms.common.api.p, A extends com.google.android.gms.common.api.a$b> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.common.api.internal.d.b
        public /* bridge */ /* synthetic */ void a(Object obj) {
            super.a((p) obj);
        }

        private void a(RemoteException remoteException) {
            b(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        public final void b(Status status) {
            r.b(!status.c(), "Failed result must not be success");
            a((p) a(status));
        }

        public final void b(A a2) {
            if (a2 instanceof s) {
                a2 = ((s) a2).f50431a;
            }
            try {
                a((a.b) a2);
            } catch (DeadObjectException e2) {
                a((RemoteException) e2);
                throw e2;
            } catch (RemoteException e3) {
                a(e3);
            }
        }

        public a(com.google.android.gms.common.api.a<?> aVar, i iVar) {
            super((i) r.a(iVar, "GoogleApiClient must not be null"));
            r.a(aVar, "Api must not be null");
            this.f50220a = (a.c<A>) aVar.b();
            this.f50221b = aVar;
        }
    }
}

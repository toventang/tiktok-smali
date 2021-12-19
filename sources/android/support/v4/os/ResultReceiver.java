package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.a;
import com.bytedance.covode.number.Covode;

public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator<ResultReceiver>() {
        /* class android.support.v4.os.ResultReceiver.AnonymousClass1 */

        static {
            Covode.recordClassIndex(192);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ResultReceiver[] newArray(int i2) {
            return new ResultReceiver[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final boolean f775a;

    /* renamed from: b  reason: collision with root package name */
    final Handler f776b;

    /* renamed from: c  reason: collision with root package name */
    a f777c;

    /* access modifiers changed from: protected */
    public void a(int i2, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final int f779a;

        /* renamed from: b  reason: collision with root package name */
        final Bundle f780b;

        static {
            Covode.recordClassIndex(194);
        }

        public final void run() {
            ResultReceiver.this.a(this.f779a, this.f780b);
        }

        b(int i2, Bundle bundle) {
            this.f779a = i2;
            this.f780b = bundle;
        }
    }

    static {
        Covode.recordClassIndex(191);
    }

    class a extends a.AbstractBinderC0014a {
        static {
            Covode.recordClassIndex(193);
        }

        a() {
        }

        @Override // android.support.v4.os.a
        public final void a(int i2, Bundle bundle) {
            if (ResultReceiver.this.f776b != null) {
                ResultReceiver.this.f776b.post(new b(i2, bundle));
            } else {
                ResultReceiver.this.a(i2, bundle);
            }
        }
    }

    ResultReceiver(Parcel parcel) {
        a aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                aVar = new a.AbstractBinderC0014a.C0015a(readStrongBinder);
            } else {
                aVar = (a) queryLocalInterface;
            }
        }
        this.f777c = aVar;
    }

    public final void b(int i2, Bundle bundle) {
        if (this.f775a) {
            Handler handler = this.f776b;
            if (handler != null) {
                handler.post(new b(i2, bundle));
            } else {
                a(i2, bundle);
            }
        } else {
            a aVar = this.f777c;
            if (aVar != null) {
                try {
                    aVar.a(i2, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.f777c == null) {
                this.f777c = new a();
            }
            parcel.writeStrongBinder(this.f777c.asBinder());
        }
    }
}

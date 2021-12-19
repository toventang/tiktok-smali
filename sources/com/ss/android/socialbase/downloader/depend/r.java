package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface r extends IInterface {

    public static abstract class a extends Binder implements r {
        static {
            Covode.recordClassIndex(37317);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.r$a$a  reason: collision with other inner class name */
        static class C1325a implements r {

            /* renamed from: a  reason: collision with root package name */
            public static r f60404a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60405b;

            static {
                Covode.recordClassIndex(37318);
            }

            public final IBinder asBinder() {
                return this.f60405b;
            }

            @Override // com.ss.android.socialbase.downloader.depend.r
            public final boolean a() {
                r rVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                    boolean z = false;
                    if (!this.f60405b.transact(2, obtain, obtain2, 0) && (rVar = f60404a) != null) {
                        return rVar.a();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C1325a(IBinder iBinder) {
                this.f60405b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.r
            public final void a(List<String> list) {
                r rVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                    obtain.writeStringList(list);
                    if (this.f60405b.transact(1, obtain, obtain2, 0) || (rVar = f60404a) == null) {
                        obtain2.readException();
                    } else {
                        rVar.a(list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                a(parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            } else if (i2 == 2) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                boolean a2 = a();
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37316);
    }

    void a(List<String> list);

    boolean a();
}

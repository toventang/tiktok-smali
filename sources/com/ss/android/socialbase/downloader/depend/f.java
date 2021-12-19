package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public interface f extends IInterface {

    public static abstract class a extends Binder implements f {
        static {
            Covode.recordClassIndex(37293);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.f$a$a  reason: collision with other inner class name */
        public static class C1319a implements f {

            /* renamed from: a  reason: collision with root package name */
            public static f f60392a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60393b;

            static {
                Covode.recordClassIndex(37294);
            }

            public final IBinder asBinder() {
                return this.f60393b;
            }

            @Override // com.ss.android.socialbase.downloader.depend.f
            public final boolean a() {
                f fVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                    boolean z = false;
                    if (!this.f60393b.transact(1, obtain, obtain2, 0) && (fVar = f60392a) != null) {
                        return fVar.a();
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

            public C1319a(IBinder iBinder) {
                this.f60393b = iBinder;
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                boolean a2 = a();
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37292);
    }

    boolean a();
}

package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public interface h extends IInterface {

    public static abstract class a extends Binder implements h {
        static {
            Covode.recordClassIndex(37299);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.h$a$a  reason: collision with other inner class name */
        public static class C1321a implements h {

            /* renamed from: a  reason: collision with root package name */
            public static h f60396a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60397b;

            static {
                Covode.recordClassIndex(37300);
            }

            public final IBinder asBinder() {
                return this.f60397b;
            }

            @Override // com.ss.android.socialbase.downloader.depend.h
            public final String a() {
                h hVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    if (!this.f60397b.transact(2, obtain, obtain2, 0) && (hVar = f60396a) != null) {
                        return hVar.a();
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.h
            public final int[] b() {
                h hVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    if (!this.f60397b.transact(3, obtain, obtain2, 0) && (hVar = f60396a) != null) {
                        return hVar.b();
                    }
                    obtain2.readException();
                    int[] createIntArray = obtain2.createIntArray();
                    obtain2.recycle();
                    obtain.recycle();
                    return createIntArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C1321a(IBinder iBinder) {
                this.f60397b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.h
            public final void a(String str) {
                h hVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    obtain.writeString(str);
                    if (this.f60397b.transact(1, obtain, obtain2, 0) || (hVar = f60396a) == null) {
                        obtain2.readException();
                    } else {
                        hVar.a(str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                a(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i2 == 2) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                String a2 = a();
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            } else if (i2 == 3) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                int[] b2 = b();
                parcel2.writeNoException();
                parcel2.writeIntArray(b2);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37298);
    }

    String a();

    void a(String str);

    int[] b();
}

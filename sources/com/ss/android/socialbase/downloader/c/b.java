package com.ss.android.socialbase.downloader.c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        static {
            Covode.recordClassIndex(37232);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.c.b$a$a  reason: collision with other inner class name */
        static class C1311a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static b f60298a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60299b;

            static {
                Covode.recordClassIndex(37233);
            }

            public final IBinder asBinder() {
                return this.f60299b;
            }

            C1311a(IBinder iBinder) {
                this.f60299b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.c.b
            public final void a(Map map, Map map2) {
                b bVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                    obtain.writeMap(map);
                    obtain.writeMap(map2);
                    if (this.f60299b.transact(1, obtain, obtain2, 0) || (bVar = f60298a) == null) {
                        obtain2.readException();
                    } else {
                        bVar.a(map, map2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                ClassLoader classLoader = getClass().getClassLoader();
                a(parcel.readHashMap(classLoader), parcel.readHashMap(classLoader));
                parcel2.writeNoException();
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37231);
    }

    void a(Map map, Map map2);
}

package com.ss.android.socialbase.downloader.c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.c.b;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.playerkit.model.v;
import java.util.ArrayList;
import java.util.List;

public interface c extends IInterface {

    public static abstract class a extends Binder implements c {
        static {
            Covode.recordClassIndex(37235);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.c.c$a$a  reason: collision with other inner class name */
        static class C1312a implements c {

            /* renamed from: a  reason: collision with root package name */
            public static c f60300a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60301b;

            static {
                Covode.recordClassIndex(37236);
            }

            public final IBinder asBinder() {
                return this.f60301b;
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final boolean a(int i2) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    boolean z = false;
                    if (!this.f60301b.transact(2, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.a(i2);
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

            @Override // com.ss.android.socialbase.downloader.c.c
            public final void a(DownloadChunk downloadChunk) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadChunk != null) {
                        obtain.writeInt(1);
                        downloadChunk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60301b.transact(11, obtain, obtain2, 0) || (cVar = f60300a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.a(downloadChunk);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final void a(int i2, int i3, long j2) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeLong(j2);
                    if (this.f60301b.transact(13, obtain, obtain2, 0) || (cVar = f60300a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.a(i2, i3, j2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final void a(int i2, int i3, int i4, long j2) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeLong(j2);
                    if (this.f60301b.transact(14, obtain, obtain2, 0) || (cVar = f60300a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.a(i2, i3, i4, j2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final boolean a(DownloadInfo downloadInfo) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f60301b.transact(17, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.a(downloadInfo);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final void b(DownloadInfo downloadInfo) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60301b.transact(33, obtain, obtain2, 0) || (cVar = f60300a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.b(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final void a(int i2, List<DownloadChunk> list) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    obtain.writeTypedList(list);
                    if (this.f60301b.transact(34, obtain, obtain2, 0) || (cVar = f60300a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.a(i2, list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final void a(b bVar) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (this.f60301b.transact(36, obtain, obtain2, 0) || (cVar = f60300a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.a(bVar);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final void a() {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (this.f60301b.transact(1, obtain, obtain2, 0) || (cVar = f60300a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.a();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final List<DownloadInfo> b() {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (!this.f60301b.transact(8, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.b();
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final void c() {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (this.f60301b.transact(20, obtain, obtain2, 0) || (cVar = f60300a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.c();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final boolean e() {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    boolean z = false;
                    if (!this.f60301b.transact(32, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.e();
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

            @Override // com.ss.android.socialbase.downloader.c.c
            public final boolean d() {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    boolean z = false;
                    if (!this.f60301b.transact(31, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.d();
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

            C1312a(IBinder iBinder) {
                this.f60301b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final void d(int i2) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    if (this.f60301b.transact(10, obtain, obtain2, 0) || (cVar = f60300a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.d(i2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final DownloadInfo b(int i2) {
                DownloadInfo downloadInfo;
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    if (!this.f60301b.transact(3, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.b(i2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final boolean f(int i2) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    boolean z = false;
                    if (!this.f60301b.transact(19, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.f(i2);
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

            @Override // com.ss.android.socialbase.downloader.c.c
            public final DownloadInfo g(int i2) {
                DownloadInfo downloadInfo;
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    if (!this.f60301b.transact(21, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.g(i2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final DownloadInfo h(int i2) {
                DownloadInfo downloadInfo;
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    if (!this.f60301b.transact(25, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.h(i2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final DownloadInfo i(int i2) {
                DownloadInfo downloadInfo;
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    if (!this.f60301b.transact(29, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.i(i2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final DownloadInfo j(int i2) {
                DownloadInfo downloadInfo;
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    if (!this.f60301b.transact(30, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.j(i2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final List<DownloadChunk> c(int i2) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    if (!this.f60301b.transact(9, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.c(i2);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadChunk.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final List<DownloadInfo> d(String str) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f60301b.transact(7, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.d(str);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final boolean e(int i2) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    boolean z = false;
                    if (!this.f60301b.transact(18, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.e(i2);
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

            @Override // com.ss.android.socialbase.downloader.c.c
            public final List<DownloadInfo> b(String str) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f60301b.transact(5, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.b(str);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final List<DownloadInfo> c(String str) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f60301b.transact(6, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.c(str);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final List<DownloadInfo> a(String str) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f60301b.transact(4, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.a(str);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final void b(DownloadChunk downloadChunk) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadChunk != null) {
                        obtain.writeInt(1);
                        downloadChunk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60301b.transact(12, obtain, obtain2, 0) || (cVar = f60300a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.b(downloadChunk);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final DownloadInfo a(int i2, int i3) {
                DownloadInfo downloadInfo;
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (!this.f60301b.transact(16, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.a(i2, i3);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final DownloadInfo c(int i2, long j2) {
                DownloadInfo downloadInfo;
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    obtain.writeLong(j2);
                    if (!this.f60301b.transact(26, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.c(i2, j2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final DownloadInfo d(int i2, long j2) {
                DownloadInfo downloadInfo;
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    obtain.writeLong(j2);
                    if (!this.f60301b.transact(27, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.d(i2, j2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final DownloadInfo e(int i2, long j2) {
                DownloadInfo downloadInfo;
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    obtain.writeLong(j2);
                    if (!this.f60301b.transact(28, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.e(i2, j2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final DownloadInfo a(int i2, long j2) {
                DownloadInfo downloadInfo;
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    obtain.writeLong(j2);
                    if (!this.f60301b.transact(23, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.a(i2, j2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final DownloadInfo b(int i2, long j2) {
                DownloadInfo downloadInfo;
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    obtain.writeLong(j2);
                    if (!this.f60301b.transact(24, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.b(i2, j2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final void b(int i2, List<DownloadChunk> list) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    obtain.writeTypedList(list);
                    if (this.f60301b.transact(35, obtain, obtain2, 0) || (cVar = f60300a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.b(i2, list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final DownloadInfo a(int i2, long j2, String str, String str2) {
                DownloadInfo downloadInfo;
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    obtain.writeLong(j2);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f60301b.transact(22, obtain, obtain2, 0) && (cVar = f60300a) != null) {
                        return cVar.a(i2, j2, str, str2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.c.c
            public final void a(int i2, int i3, int i4, int i5) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (this.f60301b.transact(15, obtain, obtain2, 0) || (cVar = f60300a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.a(i2, i3, i4, i5);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 != 1598968902) {
                DownloadChunk downloadChunk = null;
                b aVar = null;
                DownloadInfo downloadInfo = null;
                DownloadInfo downloadInfo2 = null;
                DownloadChunk downloadChunk2 = null;
                switch (i2) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        a();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean a2 = a(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(a2 ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo b2 = b(parcel.readInt());
                        parcel2.writeNoException();
                        if (b2 != null) {
                            parcel2.writeInt(1);
                            b2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> a3 = a(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(a3);
                        return true;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> b3 = b(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(b3);
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> c2 = c(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(c2);
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> d2 = d(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(d2);
                        return true;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> b4 = b();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(b4);
                        return true;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadChunk> c3 = c(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(c3);
                        return true;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        d(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            downloadChunk = DownloadChunk.CREATOR.createFromParcel(parcel);
                        }
                        a(downloadChunk);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            downloadChunk2 = DownloadChunk.CREATOR.createFromParcel(parcel);
                        }
                        b(downloadChunk2);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        a(parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_SELECT_SCENE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo a4 = a(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (a4 != null) {
                            parcel2.writeInt(1);
                            a4.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 17:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            downloadInfo2 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        boolean a5 = a(downloadInfo2);
                        parcel2.writeNoException();
                        parcel2.writeInt(a5 ? 1 : 0);
                        return true;
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean e2 = e(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(e2 ? 1 : 0);
                        return true;
                    case 19:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean f2 = f(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(f2 ? 1 : 0);
                        return true;
                    case v.U /*{ENCODED_INT: 20}*/:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        c();
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo g2 = g(parcel.readInt());
                        parcel2.writeNoException();
                        if (g2 != null) {
                            parcel2.writeInt(1);
                            g2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 22:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo a6 = a(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (a6 != null) {
                            parcel2.writeInt(1);
                            a6.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 23:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo a7 = a(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (a7 != null) {
                            parcel2.writeInt(1);
                            a7.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 24:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo b5 = b(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (b5 != null) {
                            parcel2.writeInt(1);
                            b5.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 25:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo h2 = h(parcel.readInt());
                        parcel2.writeNoException();
                        if (h2 != null) {
                            parcel2.writeInt(1);
                            h2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 26:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo c4 = c(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (c4 != null) {
                            parcel2.writeInt(1);
                            c4.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 27:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo d3 = d(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (d3 != null) {
                            parcel2.writeInt(1);
                            d3.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 28:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo e3 = e(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (e3 != null) {
                            parcel2.writeInt(1);
                            e3.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 29:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo i4 = i(parcel.readInt());
                        parcel2.writeNoException();
                        if (i4 != null) {
                            parcel2.writeInt(1);
                            i4.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 30:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo j2 = j(parcel.readInt());
                        parcel2.writeNoException();
                        if (j2 != null) {
                            parcel2.writeInt(1);
                            j2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 31:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean d4 = d();
                        parcel2.writeNoException();
                        parcel2.writeInt(d4 ? 1 : 0);
                        return true;
                    case 32:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean e4 = e();
                        parcel2.writeNoException();
                        parcel2.writeInt(e4 ? 1 : 0);
                        return true;
                    case 33:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        b(downloadInfo);
                        parcel2.writeNoException();
                        return true;
                    case 34:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        a(parcel.readInt(), parcel.createTypedArrayList(DownloadChunk.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 35:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        b(parcel.readInt(), parcel.createTypedArrayList(DownloadChunk.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 36:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                                aVar = new b.a.C1311a(readStrongBinder);
                            } else {
                                aVar = (b) queryLocalInterface;
                            }
                        }
                        a(aVar);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i2, parcel, parcel2, i3);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37234);
    }

    DownloadInfo a(int i2, int i3);

    DownloadInfo a(int i2, long j2);

    DownloadInfo a(int i2, long j2, String str, String str2);

    List<DownloadInfo> a(String str);

    void a();

    void a(int i2, int i3, int i4, int i5);

    void a(int i2, int i3, int i4, long j2);

    void a(int i2, int i3, long j2);

    void a(int i2, List<DownloadChunk> list);

    void a(b bVar);

    void a(DownloadChunk downloadChunk);

    boolean a(int i2);

    boolean a(DownloadInfo downloadInfo);

    DownloadInfo b(int i2);

    DownloadInfo b(int i2, long j2);

    List<DownloadInfo> b();

    List<DownloadInfo> b(String str);

    void b(int i2, List<DownloadChunk> list);

    void b(DownloadChunk downloadChunk);

    void b(DownloadInfo downloadInfo);

    DownloadInfo c(int i2, long j2);

    List<DownloadChunk> c(int i2);

    List<DownloadInfo> c(String str);

    void c();

    DownloadInfo d(int i2, long j2);

    List<DownloadInfo> d(String str);

    void d(int i2);

    boolean d();

    DownloadInfo e(int i2, long j2);

    boolean e();

    boolean e(int i2);

    boolean f(int i2);

    DownloadInfo g(int i2);

    DownloadInfo h(int i2);

    DownloadInfo i(int i2);

    DownloadInfo j(int i2);
}

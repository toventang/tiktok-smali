package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.depend.ab;
import com.ss.android.socialbase.downloader.depend.af;
import com.ss.android.socialbase.downloader.depend.e;
import com.ss.android.socialbase.downloader.depend.g;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.a;
import com.ss.android.ugc.playerkit.model.v;
import java.util.ArrayList;
import java.util.List;

public interface k extends IInterface {

    public static abstract class a extends Binder implements k {
        static {
            Covode.recordClassIndex(37358);
        }

        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.socialbase.downloader.downloader.k$a$a  reason: collision with other inner class name */
        public static class C1329a implements k {

            /* renamed from: a  reason: collision with root package name */
            public static k f60492a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60493b;

            static {
                Covode.recordClassIndex(37359);
            }

            public final IBinder asBinder() {
                return this.f60493b;
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(com.ss.android.socialbase.downloader.model.a aVar) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f60493b.transact(1, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a(aVar);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(int i2, boolean z) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    obtain.writeInt(z ? 1 : 0);
                    if (this.f60493b.transact(3, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a(i2, z);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final boolean b(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    boolean z = false;
                    if (!this.f60493b.transact(4, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.b(i2);
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(List<String> list) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStringList(list);
                    if (this.f60493b.transact(20, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a(list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void b(List<String> list) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStringList(list);
                    if (this.f60493b.transact(21, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.b(list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(int i2, boolean z, boolean z2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    int i3 = 1;
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i3 = 0;
                    }
                    obtain.writeInt(i3);
                    if (this.f60493b.transact(22, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a(i2, z, z2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(int i2, int i3, g gVar, int i4, boolean z) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    obtain.writeInt(i4);
                    obtain.writeInt(z ? 1 : 0);
                    if (this.f60493b.transact(25, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a(i2, i3, gVar, i4, z);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(int i2, int i3, g gVar, int i4, boolean z, boolean z2) {
                Throwable th;
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    obtain.writeInt(i4);
                    int i5 = 1;
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i5 = 0;
                    }
                    obtain.writeInt(i5);
                    try {
                        if (this.f60493b.transact(27, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                            obtain2.readException();
                        } else {
                            kVar.a(i2, i3, gVar, i4, z, z2);
                        }
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th2) {
                        th = th2;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final boolean a(DownloadInfo downloadInfo) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f60493b.transact(28, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.a(downloadInfo);
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(int i2, Notification notification) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60493b.transact(29, obtain, null, 1) || (kVar = f60492a) == null) {
                        obtain.recycle();
                    } else {
                        kVar.a(i2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(boolean z) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(z ? 1 : 0);
                    if (this.f60493b.transact(30, obtain, null, 1) || (kVar = f60492a) == null) {
                        obtain.recycle();
                    } else {
                        kVar.a(z);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(DownloadChunk downloadChunk) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (downloadChunk != null) {
                        obtain.writeInt(1);
                        downloadChunk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60493b.transact(38, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a(downloadChunk);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final boolean b(DownloadInfo downloadInfo) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f60493b.transact(39, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.b(downloadInfo);
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(int i2, int i3, long j2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeLong(j2);
                    if (this.f60493b.transact(42, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a(i2, i3, j2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(int i2, int i3, int i4, long j2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeLong(j2);
                    if (this.f60493b.transact(43, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a(i2, i3, i4, j2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(int i2, List<DownloadChunk> list) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    obtain.writeTypedList(list);
                    if (this.f60493b.transact(47, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a(i2, list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(af afVar) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    if (this.f60493b.transact(49, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a(afVar);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(int i2, x xVar) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(xVar != null ? xVar.asBinder() : null);
                    if (this.f60493b.transact(53, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a(i2, xVar);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(int i2, long j2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    obtain.writeLong(j2);
                    if (this.f60493b.transact(56, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a(i2, j2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a() {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (this.f60493b.transact(7, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final List<DownloadInfo> b() {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (!this.f60493b.transact(19, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.b();
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final boolean f() {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    if (!this.f60493b.transact(55, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.f();
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final boolean d() {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    if (!this.f60493b.transact(35, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.d();
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void e() {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (this.f60493b.transact(46, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.e();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final boolean c() {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    if (!this.f60493b.transact(31, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.c();
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

            C1329a(IBinder iBinder) {
                this.f60493b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void c(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (this.f60493b.transact(5, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.c(i2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void d(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (this.f60493b.transact(6, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.d(i2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final long e(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (!this.f60493b.transact(8, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.e(i2);
                    }
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    obtain2.recycle();
                    obtain.recycle();
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final int f(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (!this.f60493b.transact(9, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.f(i2);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void j(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (this.f60493b.transact(24, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.j(i2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void l(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (this.f60493b.transact(34, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.l(i2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final int m(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (!this.f60493b.transact(37, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.m(i2);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void o(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (this.f60493b.transact(41, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.o(i2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final List<DownloadInfo> c(String str) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.f60493b.transact(17, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.c(str);
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final List<DownloadInfo> d(String str) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.f60493b.transact(18, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.d(str);
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final List<DownloadInfo> e(String str) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.f60493b.transact(32, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.e(str);
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final boolean g(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    boolean z = false;
                    if (!this.f60493b.transact(10, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.g(i2);
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final DownloadInfo h(int i2) {
                DownloadInfo downloadInfo;
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (!this.f60493b.transact(11, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.h(i2);
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final List<DownloadChunk> i(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (!this.f60493b.transact(13, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.i(i2);
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final boolean k(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    boolean z = false;
                    if (!this.f60493b.transact(33, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.k(i2);
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final boolean n(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    boolean z = false;
                    if (!this.f60493b.transact(40, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.n(i2);
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final boolean p(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    boolean z = false;
                    if (!this.f60493b.transact(45, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.p(i2);
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final x q(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (!this.f60493b.transact(51, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.q(i2);
                    }
                    obtain2.readException();
                    x a2 = x.a.a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final ab r(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (!this.f60493b.transact(52, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.r(i2);
                    }
                    obtain2.readException();
                    ab a2 = ab.a.a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final e s(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (!this.f60493b.transact(54, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.s(i2);
                    }
                    obtain2.readException();
                    e a2 = e.a.a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final List<DownloadInfo> a(String str) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.f60493b.transact(12, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.a(str);
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final List<DownloadInfo> b(String str) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.f60493b.transact(16, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.b(str);
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(int i2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (this.f60493b.transact(2, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a(i2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final int a(String str, String str2) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f60493b.transact(14, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.a(str, str2);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final DownloadInfo b(String str, String str2) {
                DownloadInfo downloadInfo;
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f60493b.transact(15, obtain, obtain2, 0) && (kVar = f60492a) != null) {
                        return kVar.b(str, str2);
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

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void c(int i2, boolean z) {
                int i3;
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (z) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    obtain.writeInt(i3);
                    if (this.f60493b.transact(36, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.c(i2, z);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(int i2, int i3) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (this.f60493b.transact(50, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a(i2, i3);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void b(int i2, List<DownloadChunk> list) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    obtain.writeTypedList(list);
                    if (this.f60493b.transact(48, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.b(i2, list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void b(int i2, boolean z) {
                int i3;
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    if (z) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    obtain.writeInt(i3);
                    if (this.f60493b.transact(23, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.b(i2, z);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void a(int i2, int i3, int i4, int i5) {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (this.f60493b.transact(44, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.a(i2, i3, i4, i5);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.k
            public final void b(int i2, int i3, g gVar, int i4, boolean z) {
                IBinder iBinder;
                int i5;
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (gVar != null) {
                        iBinder = gVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i4);
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    obtain.writeInt(i5);
                    if (this.f60493b.transact(26, obtain, obtain2, 0) || (kVar = f60492a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.b(i2, i3, gVar, i4, z);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
        }

        public static k a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof k)) {
                return new C1329a(iBinder);
            }
            return (k) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            if (i2 != 1598968902) {
                com.ss.android.socialbase.downloader.model.a aVar = null;
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                IBinder iBinder3 = null;
                af aVar2 = null;
                DownloadInfo downloadInfo = null;
                DownloadChunk downloadChunk = null;
                Notification notification = null;
                DownloadInfo downloadInfo2 = null;
                boolean z6 = false;
                switch (i2) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof com.ss.android.socialbase.downloader.model.a)) {
                                aVar = new a.AbstractBinderC1333a.C1334a(readStrongBinder);
                            } else {
                                aVar = (com.ss.android.socialbase.downloader.model.a) queryLocalInterface;
                            }
                        }
                        a(aVar);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        a(readInt, z6);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean b2 = b(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(b2 ? 1 : 0);
                        return true;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        c(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        d(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a();
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        long e2 = e(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeLong(e2);
                        return true;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int f2 = f(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(f2);
                        return true;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean g2 = g(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(g2 ? 1 : 0);
                        return true;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        DownloadInfo h2 = h(parcel.readInt());
                        parcel2.writeNoException();
                        if (h2 != null) {
                            parcel2.writeInt(1);
                            h2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> a2 = a(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(a2);
                        return true;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadChunk> i4 = i(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(i4);
                        return true;
                    case ABRConfig.ABR_SELECT_SCENE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int a3 = a(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(a3);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        DownloadInfo b3 = b(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (b3 != null) {
                            parcel2.writeInt(1);
                            b3.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 16:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> b4 = b(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(b4);
                        return true;
                    case 17:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> c2 = c(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(c2);
                        return true;
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> d2 = d(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(d2);
                        return true;
                    case 19:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> b5 = b();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(b5);
                        return true;
                    case v.U /*{ENCODED_INT: 20}*/:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.createStringArrayList());
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        b(parcel.createStringArrayList());
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt2 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        a(readInt2, z, z6);
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt3 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        b(readInt3, z6);
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        j(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 25:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt4 = parcel.readInt();
                        int readInt5 = parcel.readInt();
                        g a4 = g.a.a(parcel.readStrongBinder());
                        int readInt6 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        a(readInt4, readInt5, a4, readInt6, z2);
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt7 = parcel.readInt();
                        int readInt8 = parcel.readInt();
                        g a5 = g.a.a(parcel.readStrongBinder());
                        int readInt9 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        b(readInt7, readInt8, a5, readInt9, z3);
                        parcel2.writeNoException();
                        return true;
                    case 27:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt10 = parcel.readInt();
                        int readInt11 = parcel.readInt();
                        g a6 = g.a.a(parcel.readStrongBinder());
                        int readInt12 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (parcel.readInt() != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        a(readInt10, readInt11, a6, readInt12, z4, z5);
                        parcel2.writeNoException();
                        return true;
                    case 28:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            downloadInfo2 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        boolean a7 = a(downloadInfo2);
                        parcel2.writeNoException();
                        parcel2.writeInt(a7 ? 1 : 0);
                        return true;
                    case 29:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt13 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            notification = (Notification) Notification.CREATOR.createFromParcel(parcel);
                        }
                        a(readInt13, notification);
                        return true;
                    case 30:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        a(z6);
                        return true;
                    case 31:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean c3 = c();
                        parcel2.writeNoException();
                        parcel2.writeInt(c3 ? 1 : 0);
                        return true;
                    case 32:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> e3 = e(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(e3);
                        return true;
                    case 33:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean k2 = k(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(k2 ? 1 : 0);
                        return true;
                    case 34:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        l(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 35:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean d3 = d();
                        parcel2.writeNoException();
                        parcel2.writeInt(d3 ? 1 : 0);
                        return true;
                    case 36:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt14 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        c(readInt14, z6);
                        parcel2.writeNoException();
                        return true;
                    case 37:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int m2 = m(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(m2);
                        return true;
                    case 38:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            downloadChunk = DownloadChunk.CREATOR.createFromParcel(parcel);
                        }
                        a(downloadChunk);
                        parcel2.writeNoException();
                        return true;
                    case 39:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        boolean b6 = b(downloadInfo);
                        parcel2.writeNoException();
                        parcel2.writeInt(b6 ? 1 : 0);
                        return true;
                    case 40:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean n = n(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(n ? 1 : 0);
                        return true;
                    case 41:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        o(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 42:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 43:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case BuildConfig.VERSION_CODE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 45:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean p = p(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(p ? 1 : 0);
                        return true;
                    case 46:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        e();
                        parcel2.writeNoException();
                        return true;
                    case 47:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt(), parcel.createTypedArrayList(DownloadChunk.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 48:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        b(parcel.readInt(), parcel.createTypedArrayList(DownloadChunk.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 49:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof af)) {
                                aVar2 = new af.a.C1315a(readStrongBinder2);
                            } else {
                                aVar2 = (af) queryLocalInterface2;
                            }
                        }
                        a(aVar2);
                        parcel2.writeNoException();
                        return true;
                    case 50:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 51:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        x q = q(parcel.readInt());
                        parcel2.writeNoException();
                        if (q != null) {
                            iBinder3 = q.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder3);
                        return true;
                    case 52:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        ab r = r(parcel.readInt());
                        parcel2.writeNoException();
                        if (r != null) {
                            iBinder2 = r.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder2);
                        return true;
                    case 53:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt(), x.a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 54:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        e s = s(parcel.readInt());
                        parcel2.writeNoException();
                        if (s != null) {
                            iBinder = s.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 55:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean f3 = f();
                        parcel2.writeNoException();
                        parcel2.writeInt(f3 ? 1 : 0);
                        return true;
                    case 56:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i2, parcel, parcel2, i3);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37357);
    }

    int a(String str, String str2);

    List<DownloadInfo> a(String str);

    void a();

    void a(int i2);

    void a(int i2, int i3);

    void a(int i2, int i3, int i4, int i5);

    void a(int i2, int i3, int i4, long j2);

    void a(int i2, int i3, long j2);

    void a(int i2, int i3, g gVar, int i4, boolean z);

    void a(int i2, int i3, g gVar, int i4, boolean z, boolean z2);

    void a(int i2, long j2);

    void a(int i2, Notification notification);

    void a(int i2, x xVar);

    void a(int i2, List<DownloadChunk> list);

    void a(int i2, boolean z);

    void a(int i2, boolean z, boolean z2);

    void a(af afVar);

    void a(DownloadChunk downloadChunk);

    void a(com.ss.android.socialbase.downloader.model.a aVar);

    void a(List<String> list);

    void a(boolean z);

    boolean a(DownloadInfo downloadInfo);

    DownloadInfo b(String str, String str2);

    List<DownloadInfo> b();

    List<DownloadInfo> b(String str);

    void b(int i2, int i3, g gVar, int i4, boolean z);

    void b(int i2, List<DownloadChunk> list);

    void b(int i2, boolean z);

    void b(List<String> list);

    boolean b(int i2);

    boolean b(DownloadInfo downloadInfo);

    List<DownloadInfo> c(String str);

    void c(int i2);

    void c(int i2, boolean z);

    boolean c();

    List<DownloadInfo> d(String str);

    void d(int i2);

    boolean d();

    long e(int i2);

    List<DownloadInfo> e(String str);

    void e();

    int f(int i2);

    boolean f();

    boolean g(int i2);

    DownloadInfo h(int i2);

    List<DownloadChunk> i(int i2);

    void j(int i2);

    boolean k(int i2);

    void l(int i2);

    int m(int i2);

    boolean n(int i2);

    void o(int i2);

    boolean p(int i2);

    x q(int i2);

    ab r(int i2);

    e s(int i2);
}

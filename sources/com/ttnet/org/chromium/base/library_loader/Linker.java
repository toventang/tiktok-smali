package com.ttnet.org.chromium.base.library_loader;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.f;
import java.io.IOException;

public class Linker {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ boolean f155263b = true;

    /* renamed from: f  reason: collision with root package name */
    private static final Linker f155264f = new Linker();

    /* renamed from: a  reason: collision with root package name */
    protected final Object f155265a = new Object();

    /* renamed from: c  reason: collision with root package name */
    private boolean f155266c = true;

    /* renamed from: d  reason: collision with root package name */
    private long f155267d = -1;

    /* renamed from: e  reason: collision with root package name */
    private long f155268e = -1;

    private static native boolean nativeAddZipArchivePath(String str);

    private static native boolean nativeCreateSharedRelro(String str, long j2, LibInfo libInfo);

    private static native long nativeGetRandomBaseLoadAddress();

    private static native boolean nativeLoadLibrary(String str, long j2, LibInfo libInfo);

    private static native boolean nativeUseSharedRelro(String str, LibInfo libInfo);

    static class LibInfo implements Parcelable {
        public static final Parcelable.Creator<LibInfo> CREATOR = new Parcelable.Creator<LibInfo>() {
            /* class com.ttnet.org.chromium.base.library_loader.Linker.LibInfo.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103322);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ LibInfo[] newArray(int i2) {
                return new LibInfo[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ LibInfo createFromParcel(Parcel parcel) {
                return new LibInfo(parcel);
            }
        };
        public long mLoadAddress;
        public long mLoadSize;
        public int mRelroFd = -1;
        public long mRelroSize;
        public long mRelroStart;

        public int describeContents() {
            return 1;
        }

        LibInfo() {
        }

        static {
            Covode.recordClassIndex(103321);
        }

        LibInfo(Parcel parcel) {
            this.mLoadAddress = parcel.readLong();
            this.mLoadSize = parcel.readLong();
            this.mRelroStart = parcel.readLong();
            this.mRelroSize = parcel.readLong();
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            if (parcelFileDescriptor != null) {
                this.mRelroFd = parcelFileDescriptor.detachFd();
            }
        }

        public void writeToParcel(Parcel parcel, int i2) {
            if (this.mRelroFd >= 0) {
                parcel.writeLong(this.mLoadAddress);
                parcel.writeLong(this.mLoadSize);
                parcel.writeLong(this.mRelroStart);
                parcel.writeLong(this.mRelroSize);
                try {
                    ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(this.mRelroFd);
                    fromFd.writeToParcel(parcel, 0);
                    fromFd.close();
                } catch (IOException e2) {
                    f.c("LibraryLoader", "Can't write LibInfo file descriptor to parcel", e2);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(103320);
    }

    private Linker() {
        if (!f155263b && !a.f155269a) {
            throw new AssertionError();
        }
    }
}

package com.bytedance.disk.parcel;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.a.b;

public class ClientProxyConfig implements Parcelable {
    public static final Parcelable.Creator<ClientProxyConfig> CREATOR = new Parcelable.Creator<ClientProxyConfig>() {
        /* class com.bytedance.disk.parcel.ClientProxyConfig.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16825);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ClientProxyConfig[] newArray(int i2) {
            return new ClientProxyConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ClientProxyConfig createFromParcel(Parcel parcel) {
            return new ClientProxyConfig(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public boolean f28625a;

    /* renamed from: b  reason: collision with root package name */
    public int f28626b;

    /* renamed from: c  reason: collision with root package name */
    public b f28627c;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(16824);
    }

    public ClientProxyConfig() {
        this.f28626b = -1;
        this.f28626b = Process.myPid();
    }

    protected ClientProxyConfig(Parcel parcel) {
        b aVar;
        this.f28626b = -1;
        this.f28625a = parcel.readInt() != 1 ? false : true;
        this.f28626b = parcel.readInt();
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.bytedance.disk.aidl.IProcessCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                aVar = new b.a.C0611a(readStrongBinder);
            } else {
                aVar = (b) queryLocalInterface;
            }
        }
        this.f28627c = aVar;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f28625a ? 1 : 0);
        parcel.writeInt(this.f28626b);
        parcel.writeStrongBinder(this.f28627c.asBinder());
    }
}

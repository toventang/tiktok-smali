package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.firebase.iid.s;

public class FirebaseIidMessengerCompat implements Parcelable {
    public static final Parcelable.Creator<FirebaseIidMessengerCompat> CREATOR = new Parcelable.Creator<FirebaseIidMessengerCompat>() {
        /* class com.google.firebase.iid.FirebaseIidMessengerCompat.AnonymousClass1 */

        static {
            Covode.recordClassIndex(33759);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FirebaseIidMessengerCompat[] newArray(int i2) {
            return new FirebaseIidMessengerCompat[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FirebaseIidMessengerCompat createFromParcel(Parcel parcel) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                return new FirebaseIidMessengerCompat(readStrongBinder);
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    Messenger f54374a;

    /* renamed from: b  reason: collision with root package name */
    s f54375b;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(33758);
    }

    private IBinder a() {
        Messenger messenger = this.f54374a;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return this.f54375b.asBinder();
    }

    public int hashCode() {
        return a().hashCode();
    }

    public FirebaseIidMessengerCompat(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f54374a = new Messenger(iBinder);
        } else {
            this.f54375b = new s.a(iBinder);
        }
    }

    public final void a(Message message) {
        Messenger messenger = this.f54374a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f54375b.a(message);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((FirebaseIidMessengerCompat) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public static final class a extends ClassLoader {
        static {
            Covode.recordClassIndex(33760);
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ClassLoader
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            FirebaseInstanceId.isDebugLogEnabled();
            return FirebaseIidMessengerCompat.class;
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Messenger messenger = this.f54374a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f54375b.asBinder());
        }
    }
}

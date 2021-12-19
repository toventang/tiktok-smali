package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.List;

public interface a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0011a extends Binder implements a {
        static {
            Covode.recordClassIndex(172);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: android.support.v4.media.session.a$a$a  reason: collision with other inner class name */
        static class C0012a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f771a;

            static {
                Covode.recordClassIndex(173);
            }

            public final IBinder asBinder() {
                return this.f771a;
            }

            @Override // android.support.v4.media.session.a
            public final void a(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f771a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void a(List<MediaSessionCompat.QueueItem> list) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList(list);
                    this.f771a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void a(boolean z) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(z ? 1 : 0);
                    this.f771a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f771a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void b() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f771a.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            C0012a(IBinder iBinder) {
                this.f771a = iBinder;
            }

            @Override // android.support.v4.media.session.a
            public final void a(int i2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i2);
                    this.f771a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void b(int i2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i2);
                    this.f771a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f771a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void b(boolean z) {
                int i2;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f771a.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void a(MediaMetadataCompat mediaMetadataCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f771a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void a(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f771a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void a(PlaybackStateCompat playbackStateCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f771a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void a(CharSequence charSequence) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f771a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0011a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0012a(iBinder);
            }
            return (a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 != 1598968902) {
                boolean z = false;
                Bundle bundle = null;
                ParcelableVolumeInfo parcelableVolumeInfo = null;
                Bundle bundle2 = null;
                CharSequence charSequence = null;
                MediaMetadataCompat mediaMetadataCompat = null;
                PlaybackStateCompat playbackStateCompat = null;
                switch (i2) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        a(readString, bundle);
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        a();
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                        }
                        a(playbackStateCompat);
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                        }
                        a(mediaMetadataCompat);
                        return true;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        a(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                        }
                        a(charSequence);
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        a(bundle2);
                        return true;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            parcelableVolumeInfo = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                        }
                        a(parcelableVolumeInfo);
                        return true;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        a(parcel.readInt());
                        return true;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        a(z);
                        return true;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        b(z);
                        return true;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        b(parcel.readInt());
                        return true;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        b();
                        return true;
                    default:
                        return super.onTransact(i2, parcel, parcel2, i3);
                }
            } else {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(171);
    }

    void a();

    void a(int i2);

    void a(Bundle bundle);

    void a(MediaMetadataCompat mediaMetadataCompat);

    void a(ParcelableVolumeInfo parcelableVolumeInfo);

    void a(PlaybackStateCompat playbackStateCompat);

    void a(CharSequence charSequence);

    void a(String str, Bundle bundle);

    void a(List<MediaSessionCompat.QueueItem> list);

    void a(boolean z);

    void b();

    void b(int i2);

    void b(boolean z);
}

package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() {
        /* class android.support.v4.media.MediaDescriptionCompat.AnonymousClass1 */

        static {
            Covode.recordClassIndex(109);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MediaDescriptionCompat[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f634a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f635b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f636c;

    /* renamed from: d  reason: collision with root package name */
    public final CharSequence f637d;

    /* renamed from: e  reason: collision with root package name */
    public final Bitmap f638e;

    /* renamed from: f  reason: collision with root package name */
    public final Uri f639f;

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f640g;

    /* renamed from: h  reason: collision with root package name */
    public final Uri f641h;

    /* renamed from: i  reason: collision with root package name */
    private Object f642i;

    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(108);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        String f643a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f644b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f645c;

        /* renamed from: d  reason: collision with root package name */
        CharSequence f646d;

        /* renamed from: e  reason: collision with root package name */
        Bitmap f647e;

        /* renamed from: f  reason: collision with root package name */
        Uri f648f;

        /* renamed from: g  reason: collision with root package name */
        Bundle f649g;

        /* renamed from: h  reason: collision with root package name */
        Uri f650h;

        static {
            Covode.recordClassIndex(110);
        }

        public final MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f643a, this.f644b, this.f645c, this.f646d, this.f647e, this.f648f, this.f649g, this.f650h);
        }
    }

    public final String toString() {
        return ((Object) this.f635b) + ", " + ((Object) this.f636c) + ", " + ((Object) this.f637d);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f634a = parcel.readString();
        this.f635b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f636c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f637d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.f638e = (Bitmap) parcel.readParcelable(classLoader);
        this.f639f = (Uri) parcel.readParcelable(classLoader);
        this.f640g = parcel.readBundle(classLoader);
        this.f641h = (Uri) parcel.readParcelable(classLoader);
    }

    public static MediaDescriptionCompat a(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        a aVar = new a();
        MediaDescription mediaDescription = (MediaDescription) obj;
        aVar.f643a = mediaDescription.getMediaId();
        aVar.f644b = mediaDescription.getTitle();
        aVar.f645c = mediaDescription.getSubtitle();
        aVar.f646d = mediaDescription.getDescription();
        aVar.f647e = mediaDescription.getIconBitmap();
        aVar.f648f = mediaDescription.getIconUri();
        Bundle extras = mediaDescription.getExtras();
        if (extras != null) {
            MediaSessionCompat.a(extras);
            uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
            if (uri != null) {
                if (!extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || extras.size() != 2) {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            bundle = extras;
        } else {
            uri = null;
            bundle = extras;
        }
        aVar.f649g = bundle;
        if (uri != null) {
            aVar.f650h = uri;
        } else if (Build.VERSION.SDK_INT >= 23) {
            aVar.f650h = mediaDescription.getMediaUri();
        }
        MediaDescriptionCompat a2 = aVar.a();
        a2.f642i = obj;
        return a2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Object obj;
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f634a);
            TextUtils.writeToParcel(this.f635b, parcel, i2);
            TextUtils.writeToParcel(this.f636c, parcel, i2);
            TextUtils.writeToParcel(this.f637d, parcel, i2);
            parcel.writeParcelable(this.f638e, i2);
            parcel.writeParcelable(this.f639f, i2);
            parcel.writeBundle(this.f640g);
            parcel.writeParcelable(this.f641h, i2);
            return;
        }
        if (this.f642i != null || Build.VERSION.SDK_INT < 21) {
            obj = this.f642i;
        } else {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f634a);
            builder.setTitle(this.f635b);
            builder.setSubtitle(this.f636c);
            builder.setDescription(this.f637d);
            builder.setIconBitmap(this.f638e);
            builder.setIconUri(this.f639f);
            Bundle bundle = this.f640g;
            if (Build.VERSION.SDK_INT < 23 && this.f641h != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f641h);
            }
            builder.setExtras(bundle);
            if (Build.VERSION.SDK_INT >= 23) {
                builder.setMediaUri(this.f641h);
            }
            obj = builder.build();
            this.f642i = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i2);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f634a = str;
        this.f635b = charSequence;
        this.f636c = charSequence2;
        this.f637d = charSequence3;
        this.f638e = bitmap;
        this.f639f = uri;
        this.f640g = bundle;
        this.f641h = uri2;
    }
}

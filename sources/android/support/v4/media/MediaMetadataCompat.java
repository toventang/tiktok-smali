package android.support.v4.media;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import com.bytedance.covode.number.Covode;

public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new Parcelable.Creator<MediaMetadataCompat>() {
        /* class android.support.v4.media.MediaMetadataCompat.AnonymousClass1 */

        static {
            Covode.recordClassIndex(112);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MediaMetadataCompat[] newArray(int i2) {
            return new MediaMetadataCompat[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    static final androidx.c.a<String, Integer> f651a;

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f652d = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f653e = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f654f = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f655b;

    /* renamed from: c  reason: collision with root package name */
    public Object f656c;

    public final int describeContents() {
        return 0;
    }

    public final Bundle a() {
        return new Bundle(this.f655b);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Bundle f657a;

        static {
            Covode.recordClassIndex(113);
        }

        public a() {
            this.f657a = new Bundle();
        }

        public final MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.f657a);
        }

        private a(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f655b);
            this.f657a = bundle;
            MediaSessionCompat.a(bundle);
        }

        private static Object a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }

        public final a a(String str, long j2) {
            if (!MediaMetadataCompat.f651a.containsKey(str) || MediaMetadataCompat.f651a.get(str).intValue() == 0) {
                this.f657a.putLong(str, j2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        public a(MediaMetadataCompat mediaMetadataCompat, int i2) {
            this(mediaMetadataCompat);
            for (String str : this.f657a.keySet()) {
                Object a2 = a(this.f657a, str);
                if (a2 instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) a2;
                    if (bitmap.getHeight() > i2 || bitmap.getWidth() > i2) {
                        float f2 = (float) i2;
                        float min = Math.min(f2 / ((float) bitmap.getWidth()), f2 / ((float) bitmap.getHeight()));
                        a(str, Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true));
                    }
                }
            }
        }

        public final a a(String str, Bitmap bitmap) {
            if (!MediaMetadataCompat.f651a.containsKey(str) || MediaMetadataCompat.f651a.get(str).intValue() == 2) {
                this.f657a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        public final a a(String str, String str2) {
            if (!MediaMetadataCompat.f651a.containsKey(str) || MediaMetadataCompat.f651a.get(str).intValue() == 1) {
                this.f657a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }
    }

    static {
        Covode.recordClassIndex(111);
        androidx.c.a<String, Integer> aVar = new androidx.c.a<>();
        f651a = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f655b = bundle2;
        MediaSessionCompat.a(bundle2);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f655b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.f655b);
    }
}

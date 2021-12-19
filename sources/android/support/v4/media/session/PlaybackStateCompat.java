package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() {
        /* class android.support.v4.media.session.PlaybackStateCompat.AnonymousClass1 */

        static {
            Covode.recordClassIndex(167);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PlaybackStateCompat[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f743a;

    /* renamed from: b  reason: collision with root package name */
    public final long f744b;

    /* renamed from: c  reason: collision with root package name */
    public final long f745c;

    /* renamed from: d  reason: collision with root package name */
    public final float f746d;

    /* renamed from: e  reason: collision with root package name */
    public final long f747e;

    /* renamed from: f  reason: collision with root package name */
    public final int f748f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f749g;

    /* renamed from: h  reason: collision with root package name */
    public final long f750h;

    /* renamed from: i  reason: collision with root package name */
    public List<CustomAction> f751i;

    /* renamed from: j  reason: collision with root package name */
    public final long f752j;

    /* renamed from: k  reason: collision with root package name */
    public final Bundle f753k;

    /* renamed from: l  reason: collision with root package name */
    Object f754l;

    public final int describeContents() {
        return 0;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<CustomAction> f760a;

        /* renamed from: b  reason: collision with root package name */
        private int f761b;

        /* renamed from: c  reason: collision with root package name */
        private long f762c;

        /* renamed from: d  reason: collision with root package name */
        private long f763d;

        /* renamed from: e  reason: collision with root package name */
        private float f764e;

        /* renamed from: f  reason: collision with root package name */
        private long f765f;

        /* renamed from: g  reason: collision with root package name */
        private int f766g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f767h;

        /* renamed from: i  reason: collision with root package name */
        private long f768i;

        /* renamed from: j  reason: collision with root package name */
        private long f769j;

        /* renamed from: k  reason: collision with root package name */
        private Bundle f770k;

        static {
            Covode.recordClassIndex(170);
        }

        public final a a() {
            this.f765f = 822;
            return this;
        }

        public a() {
            this.f760a = new ArrayList();
            this.f769j = -1;
        }

        public final PlaybackStateCompat b() {
            return new PlaybackStateCompat(this.f761b, this.f762c, this.f763d, this.f764e, this.f765f, this.f766g, this.f767h, this.f768i, this.f760a, this.f769j, this.f770k);
        }

        public a(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f760a = arrayList;
            this.f769j = -1;
            this.f761b = playbackStateCompat.f743a;
            this.f762c = playbackStateCompat.f744b;
            this.f764e = playbackStateCompat.f746d;
            this.f768i = playbackStateCompat.f750h;
            this.f763d = playbackStateCompat.f745c;
            this.f765f = playbackStateCompat.f747e;
            this.f766g = playbackStateCompat.f748f;
            this.f767h = playbackStateCompat.f749g;
            if (playbackStateCompat.f751i != null) {
                arrayList.addAll(playbackStateCompat.f751i);
            }
            this.f769j = playbackStateCompat.f752j;
            this.f770k = playbackStateCompat.f753k;
        }

        public final a a(int i2, long j2) {
            return a(i2, j2, 1.0f, SystemClock.elapsedRealtime());
        }

        public final a a(int i2, long j2, float f2, long j3) {
            this.f761b = i2;
            this.f762c = j2;
            this.f768i = j3;
            this.f764e = f2;
            return this;
        }
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() {
            /* class android.support.v4.media.session.PlaybackStateCompat.CustomAction.AnonymousClass1 */

            static {
                Covode.recordClassIndex(169);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CustomAction[] newArray(int i2) {
                return new CustomAction[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final String f755a;

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f756b;

        /* renamed from: c  reason: collision with root package name */
        public final int f757c;

        /* renamed from: d  reason: collision with root package name */
        public final Bundle f758d;

        /* renamed from: e  reason: collision with root package name */
        Object f759e;

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(168);
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f756b) + ", mIcon=" + this.f757c + ", mExtras=" + this.f758d;
        }

        CustomAction(Parcel parcel) {
            this.f755a = parcel.readString();
            this.f756b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f757c = parcel.readInt();
            this.f758d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f755a);
            TextUtils.writeToParcel(this.f756b, parcel, i2);
            parcel.writeInt(this.f757c);
            parcel.writeBundle(this.f758d);
        }

        CustomAction(String str, CharSequence charSequence, int i2, Bundle bundle) {
            this.f755a = str;
            this.f756b = charSequence;
            this.f757c = i2;
            this.f758d = bundle;
        }
    }

    static {
        Covode.recordClassIndex(166);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=").append(this.f743a);
        sb.append(", position=").append(this.f744b);
        sb.append(", buffered position=").append(this.f745c);
        sb.append(", speed=").append(this.f746d);
        sb.append(", updated=").append(this.f750h);
        sb.append(", actions=").append(this.f747e);
        sb.append(", error code=").append(this.f748f);
        sb.append(", error message=").append(this.f749g);
        sb.append(", custom actions=").append(this.f751i);
        sb.append(", active item id=").append(this.f752j);
        sb.append("}");
        return sb.toString();
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f743a = parcel.readInt();
        this.f744b = parcel.readLong();
        this.f746d = parcel.readFloat();
        this.f750h = parcel.readLong();
        this.f745c = parcel.readLong();
        this.f747e = parcel.readLong();
        this.f749g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f751i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f752j = parcel.readLong();
        this.f753k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f748f = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f743a);
        parcel.writeLong(this.f744b);
        parcel.writeFloat(this.f746d);
        parcel.writeLong(this.f750h);
        parcel.writeLong(this.f745c);
        parcel.writeLong(this.f747e);
        TextUtils.writeToParcel(this.f749g, parcel, i2);
        parcel.writeTypedList(this.f751i);
        parcel.writeLong(this.f752j);
        parcel.writeBundle(this.f753k);
        parcel.writeInt(this.f748f);
    }

    PlaybackStateCompat(int i2, long j2, long j3, float f2, long j4, int i3, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.f743a = i2;
        this.f744b = j2;
        this.f745c = j3;
        this.f746d = f2;
        this.f747e = j4;
        this.f748f = i3;
        this.f749g = charSequence;
        this.f750h = j5;
        this.f751i = new ArrayList(list);
        this.f752j = j6;
        this.f753k = bundle;
    }
}

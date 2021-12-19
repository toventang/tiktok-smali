package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() {
        /* class androidx.fragment.app.BackStackState.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1018);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BackStackState[] newArray(int i2) {
            return new BackStackState[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final int[] f2856a;

    /* renamed from: b  reason: collision with root package name */
    final int f2857b;

    /* renamed from: c  reason: collision with root package name */
    final int f2858c;

    /* renamed from: d  reason: collision with root package name */
    final String f2859d;

    /* renamed from: e  reason: collision with root package name */
    final int f2860e;

    /* renamed from: f  reason: collision with root package name */
    final int f2861f;

    /* renamed from: g  reason: collision with root package name */
    final CharSequence f2862g;

    /* renamed from: h  reason: collision with root package name */
    final int f2863h;

    /* renamed from: i  reason: collision with root package name */
    final CharSequence f2864i;

    /* renamed from: j  reason: collision with root package name */
    final ArrayList<String> f2865j;

    /* renamed from: k  reason: collision with root package name */
    final ArrayList<String> f2866k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f2867l;

    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(1017);
    }

    public BackStackState(Parcel parcel) {
        boolean z;
        this.f2856a = parcel.createIntArray();
        this.f2857b = parcel.readInt();
        this.f2858c = parcel.readInt();
        this.f2859d = parcel.readString();
        this.f2860e = parcel.readInt();
        this.f2861f = parcel.readInt();
        this.f2862g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2863h = parcel.readInt();
        this.f2864i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2865j = parcel.createStringArrayList();
        this.f2866k = parcel.createStringArrayList();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2867l = z;
    }

    public BackStackState(c cVar) {
        int i2;
        int size = cVar.f2904b.size();
        this.f2856a = new int[(size * 6)];
        if (cVar.f2911i) {
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                c.a aVar = cVar.f2904b.get(i4);
                int i5 = i3 + 1;
                this.f2856a[i3] = aVar.f2916a;
                int[] iArr = this.f2856a;
                int i6 = i5 + 1;
                if (aVar.f2917b != null) {
                    i2 = aVar.f2917b.mIndex;
                } else {
                    i2 = -1;
                }
                iArr[i5] = i2;
                int i7 = i6 + 1;
                this.f2856a[i6] = aVar.f2918c;
                int i8 = i7 + 1;
                this.f2856a[i7] = aVar.f2919d;
                int i9 = i8 + 1;
                this.f2856a[i8] = aVar.f2920e;
                i3 = i9 + 1;
                this.f2856a[i9] = aVar.f2921f;
            }
            this.f2857b = cVar.f2909g;
            this.f2858c = cVar.f2910h;
            this.f2859d = cVar.f2913k;
            this.f2860e = cVar.f2915m;
            this.f2861f = cVar.n;
            this.f2862g = cVar.o;
            this.f2863h = cVar.p;
            this.f2864i = cVar.q;
            this.f2865j = cVar.r;
            this.f2866k = cVar.s;
            this.f2867l = cVar.t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final c a(j jVar) {
        c cVar = new c(jVar);
        int i2 = 0;
        while (i2 < this.f2856a.length) {
            c.a aVar = new c.a();
            int i3 = i2 + 1;
            aVar.f2916a = this.f2856a[i2];
            int i4 = i3 + 1;
            int i5 = this.f2856a[i3];
            if (i5 >= 0) {
                aVar.f2917b = jVar.f2938f.get(i5);
            } else {
                aVar.f2917b = null;
            }
            int i6 = i4 + 1;
            aVar.f2918c = this.f2856a[i4];
            int i7 = i6 + 1;
            aVar.f2919d = this.f2856a[i6];
            int i8 = i7 + 1;
            aVar.f2920e = this.f2856a[i7];
            i2 = i8 + 1;
            aVar.f2921f = this.f2856a[i8];
            cVar.f2905c = aVar.f2918c;
            cVar.f2906d = aVar.f2919d;
            cVar.f2907e = aVar.f2920e;
            cVar.f2908f = aVar.f2921f;
            cVar.a(aVar);
        }
        cVar.f2909g = this.f2857b;
        cVar.f2910h = this.f2858c;
        cVar.f2913k = this.f2859d;
        cVar.f2915m = this.f2860e;
        cVar.f2911i = true;
        cVar.n = this.f2861f;
        cVar.o = this.f2862g;
        cVar.p = this.f2863h;
        cVar.q = this.f2864i;
        cVar.r = this.f2865j;
        cVar.s = this.f2866k;
        cVar.t = this.f2867l;
        cVar.a(1);
        return cVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f2856a);
        parcel.writeInt(this.f2857b);
        parcel.writeInt(this.f2858c);
        parcel.writeString(this.f2859d);
        parcel.writeInt(this.f2860e);
        parcel.writeInt(this.f2861f);
        TextUtils.writeToParcel(this.f2862g, parcel, 0);
        parcel.writeInt(this.f2863h);
        TextUtils.writeToParcel(this.f2864i, parcel, 0);
        parcel.writeStringList(this.f2865j);
        parcel.writeStringList(this.f2866k);
        parcel.writeInt(this.f2867l ? 1 : 0);
    }
}

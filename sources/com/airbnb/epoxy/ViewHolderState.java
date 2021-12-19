package com.airbnb.epoxy;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.c.d;
import com.bytedance.covode.number.Covode;

class ViewHolderState extends d<ViewState> implements Parcelable {
    public static final Parcelable.Creator<ViewHolderState> CREATOR = new Parcelable.Creator<ViewHolderState>() {
        /* class com.airbnb.epoxy.ViewHolderState.AnonymousClass1 */

        static {
            Covode.recordClassIndex(2080);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ViewHolderState[] newArray(int i2) {
            return new ViewHolderState[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ViewHolderState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ViewHolderState viewHolderState = new ViewHolderState(readInt, (byte) 0);
            for (int i2 = 0; i2 < readInt; i2++) {
                viewHolderState.b(parcel.readLong(), parcel.readParcelable(ViewState.class.getClassLoader()));
            }
            return viewHolderState;
        }
    };

    public int describeContents() {
        return 0;
    }

    public static class ViewState extends SparseArray<Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ViewState> CREATOR = new Parcelable.ClassLoaderCreator<ViewState>() {
            /* class com.airbnb.epoxy.ViewHolderState.ViewState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(2082);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
                return new ViewState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return a(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ ViewState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return a(parcel, classLoader);
            }

            private static ViewState a(Parcel parcel, ClassLoader classLoader) {
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                return new ViewState(readInt, iArr, parcel.readParcelableArray(classLoader), (byte) 0);
            }
        };

        public int describeContents() {
            return 0;
        }

        ViewState() {
        }

        static {
            Covode.recordClassIndex(2081);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.os.Parcelable[] */
        /* JADX WARN: Multi-variable type inference failed */
        public void writeToParcel(Parcel parcel, int i2) {
            int size = size();
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = keyAt(i3);
                parcelableArr[i3] = valueAt(i3);
            }
            parcel.writeInt(size);
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }

        private ViewState(int i2, int[] iArr, Parcelable[] parcelableArr) {
            super(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                put(iArr[i3], parcelableArr[i3]);
            }
        }

        /* synthetic */ ViewState(int i2, int[] iArr, Parcelable[] parcelableArr, byte b2) {
            this(i2, iArr, parcelableArr);
        }
    }

    ViewHolderState() {
    }

    static {
        Covode.recordClassIndex(2079);
    }

    private ViewHolderState(int i2) {
        super(i2);
    }

    /* synthetic */ ViewHolderState(int i2, byte b2) {
        this(i2);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int b2 = b();
        parcel.writeInt(b2);
        for (int i3 = 0; i3 < b2; i3++) {
            parcel.writeLong(b(i3));
            parcel.writeParcelable((Parcelable) c(i3), 0);
        }
    }
}

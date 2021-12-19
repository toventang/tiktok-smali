package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.af;
import com.bytedance.covode.number.Covode;

public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator<FragmentState>() {
        /* class androidx.fragment.app.FragmentState.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1031);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FragmentState[] newArray(int i2) {
            return new FragmentState[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f2890a;

    /* renamed from: b  reason: collision with root package name */
    final int f2891b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f2892c;

    /* renamed from: d  reason: collision with root package name */
    final int f2893d;

    /* renamed from: e  reason: collision with root package name */
    final int f2894e;

    /* renamed from: f  reason: collision with root package name */
    final String f2895f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f2896g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f2897h;

    /* renamed from: i  reason: collision with root package name */
    final Bundle f2898i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f2899j;

    /* renamed from: k  reason: collision with root package name */
    Bundle f2900k;

    /* renamed from: l  reason: collision with root package name */
    Fragment f2901l;

    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(1030);
    }

    FragmentState(Fragment fragment) {
        this.f2890a = fragment.getClass().getName();
        this.f2891b = fragment.mIndex;
        this.f2892c = fragment.mFromLayout;
        this.f2893d = fragment.mFragmentId;
        this.f2894e = fragment.mContainerId;
        this.f2895f = fragment.mTag;
        this.f2896g = fragment.mRetainInstance;
        this.f2897h = fragment.mDetached;
        this.f2898i = fragment.mArguments;
        this.f2899j = fragment.mHidden;
    }

    FragmentState(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f2890a = parcel.readString();
        this.f2891b = parcel.readInt();
        boolean z4 = true;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2892c = z;
        this.f2893d = parcel.readInt();
        this.f2894e = parcel.readInt();
        this.f2895f = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f2896g = z2;
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f2897h = z3;
        this.f2898i = parcel.readBundle();
        this.f2899j = parcel.readInt() == 0 ? false : z4;
        this.f2900k = parcel.readBundle();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2890a);
        parcel.writeInt(this.f2891b);
        parcel.writeInt(this.f2892c ? 1 : 0);
        parcel.writeInt(this.f2893d);
        parcel.writeInt(this.f2894e);
        parcel.writeString(this.f2895f);
        parcel.writeInt(this.f2896g ? 1 : 0);
        parcel.writeInt(this.f2897h ? 1 : 0);
        parcel.writeBundle(this.f2898i);
        parcel.writeInt(this.f2899j ? 1 : 0);
        parcel.writeBundle(this.f2900k);
    }

    public final Fragment a(h hVar, f fVar, Fragment fragment, k kVar, af afVar) {
        if (this.f2901l == null) {
            Context context = hVar.f2930c;
            Bundle bundle = this.f2898i;
            if (bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
            }
            if (fVar != null) {
                this.f2901l = fVar.a(context, this.f2890a, this.f2898i);
            } else {
                this.f2901l = Fragment.instantiate(context, this.f2890a, this.f2898i);
            }
            Bundle bundle2 = this.f2900k;
            if (bundle2 != null) {
                bundle2.setClassLoader(context.getClassLoader());
                this.f2901l.mSavedFragmentState = this.f2900k;
            }
            this.f2901l.setIndex(this.f2891b, fragment);
            this.f2901l.mFromLayout = this.f2892c;
            this.f2901l.mRestored = true;
            this.f2901l.mFragmentId = this.f2893d;
            this.f2901l.mContainerId = this.f2894e;
            this.f2901l.mTag = this.f2895f;
            this.f2901l.mRetainInstance = this.f2896g;
            this.f2901l.mDetached = this.f2897h;
            this.f2901l.mHidden = this.f2899j;
            this.f2901l.mFragmentManager = hVar.f2932e;
        }
        this.f2901l.mChildNonConfig = kVar;
        this.f2901l.mViewModelStore = afVar;
        return this.f2901l;
    }
}

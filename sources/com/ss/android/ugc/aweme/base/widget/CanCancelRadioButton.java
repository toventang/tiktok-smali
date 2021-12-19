package com.ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtRadioButton;
import java.util.ArrayList;
import java.util.List;

public class CanCancelRadioButton extends DmtRadioButton {

    /* renamed from: a  reason: collision with root package name */
    public boolean f68447a = true;

    /* renamed from: b  reason: collision with root package name */
    public List<a> f68448b = new ArrayList();

    public interface a {
        static {
            Covode.recordClassIndex(42151);
        }

        boolean a(View view);
    }

    static {
        Covode.recordClassIndex(42148);
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(42150);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (byte) 0);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        boolean f68449a;

        static {
            Covode.recordClassIndex(42149);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f68449a = z;
        }

        /* synthetic */ SavedState(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f68449a ? 1 : 0);
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f68449a = this.f68447a;
        return savedState;
    }

    public void toggle() {
        for (a aVar : this.f68448b) {
            if (!aVar.a(this)) {
                return;
            }
        }
        if (this.f68447a) {
            setChecked(!isChecked());
            if (!isChecked()) {
                ((RadioGroup) getParent()).clearCheck();
            }
        }
    }

    public void setCanChecked(boolean z) {
        this.f68447a = z;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCanChecked(savedState.f68449a);
    }

    public CanCancelRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

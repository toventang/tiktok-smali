package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class AbstractLoadingLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    protected View f76497a;

    /* renamed from: b  reason: collision with root package name */
    protected View f76498b;

    /* renamed from: c  reason: collision with root package name */
    protected View f76499c;

    /* renamed from: d  reason: collision with root package name */
    protected View f76500d;

    /* renamed from: e  reason: collision with root package name */
    protected int f76501e;

    /* renamed from: f  reason: collision with root package name */
    private a f76502f;

    public interface a {
        static {
            Covode.recordClassIndex(47244);
        }
    }

    static {
        Covode.recordClassIndex(47241);
    }

    /* access modifiers changed from: protected */
    public View a(Context context, AttributeSet attributeSet, int i2) {
        return null;
    }

    public void a(int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    public View b(Context context, AttributeSet attributeSet, int i2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public View c(Context context, AttributeSet attributeSet, int i2) {
        return null;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(47243);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        int f76503a;

        static {
            Covode.recordClassIndex(47242);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f76503a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f76503a);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f76503a = this.f76501e;
        return savedState;
    }

    public final void setListener(a aVar) {
        this.f76502f = aVar;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        setState(savedState.f76503a);
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    public final void setState(int i2) {
        if (i2 == 0 || i2 == 1 || i2 == 3 || i2 == 2) {
            int i3 = this.f76501e;
            if (i3 != i2) {
                this.f76501e = i2;
                a(i3, i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
    }

    public AbstractLoadingLayout(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        MethodCollector.i(13263);
        this.f76498b = a(context, null, 0);
        this.f76499c = b(context, null, 0);
        this.f76500d = c(context, null, 0);
        View view = this.f76498b;
        if (view != null) {
            addView(view);
        }
        View view2 = this.f76499c;
        if (view2 != null) {
            addView(view2);
        }
        View view3 = this.f76500d;
        if (view3 != null) {
            addView(view3);
        }
        setState(0);
        MethodCollector.o(13263);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(13340);
        if (view == this.f76498b || view == this.f76499c || view == this.f76500d) {
            super.addView(view, i2, layoutParams);
            MethodCollector.o(13340);
        } else if (getChildCount() <= 4) {
            super.addView(view, i2, layoutParams);
            this.f76497a = view;
            MethodCollector.o(13340);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("LoadingLayout can only contain one direct custom child.");
            MethodCollector.o(13340);
            throw illegalArgumentException;
        }
    }
}

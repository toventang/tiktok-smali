package com.ss.android.ugc.tools.view.widget;

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
    private a f150228a;

    /* renamed from: e  reason: collision with root package name */
    protected View f150229e;

    /* renamed from: f  reason: collision with root package name */
    protected View f150230f;

    /* renamed from: g  reason: collision with root package name */
    protected View f150231g;

    /* renamed from: h  reason: collision with root package name */
    protected View f150232h;

    /* renamed from: i  reason: collision with root package name */
    protected int f150233i;

    public interface a {
        static {
            Covode.recordClassIndex(98857);
        }
    }

    static {
        Covode.recordClassIndex(98854);
    }

    /* access modifiers changed from: protected */
    public View a(Context context) {
        return null;
    }

    /* access modifiers changed from: protected */
    public View a(Context context, AttributeSet attributeSet) {
        return null;
    }

    public void a(int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    public View b(Context context) {
        return null;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.ss.android.ugc.tools.view.widget.AbstractLoadingLayout.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(98856);
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
        int f150234a;

        static {
            Covode.recordClassIndex(98855);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f150234a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f150234a);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f150234a = this.f150233i;
        return savedState;
    }

    public final void setListener(a aVar) {
        this.f150228a = aVar;
    }

    public AbstractLoadingLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        setState(savedState.f150234a);
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    public final void setState(int i2) {
        if (i2 == 0 || i2 == 1 || i2 == 3 || i2 == 2) {
            int i3 = this.f150233i;
            if (i3 != i2) {
                this.f150233i = i2;
                a(i3, i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
    }

    public AbstractLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AbstractLoadingLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(6401);
        this.f150230f = a(context, attributeSet);
        this.f150231g = a(context);
        this.f150232h = b(context);
        View view = this.f150230f;
        if (view != null) {
            addView(view);
        }
        View view2 = this.f150231g;
        if (view2 != null) {
            addView(view2);
        }
        View view3 = this.f150232h;
        if (view3 != null) {
            addView(view3);
        }
        setState(0);
        MethodCollector.o(6401);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(6463);
        if (view == this.f150230f || view == this.f150231g || view == this.f150232h) {
            super.addView(view, i2, layoutParams);
            MethodCollector.o(6463);
        } else if (getChildCount() <= 4) {
            super.addView(view, i2, layoutParams);
            this.f150229e = view;
            MethodCollector.o(6463);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("LoadingLayout can only contain one direct custom child.");
            MethodCollector.o(6463);
            throw illegalArgumentException;
        }
    }
}

package com.bytedance.ies.uikit.tabhost;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private boolean f35483a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<c> f35484b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f35485c;

    /* renamed from: d  reason: collision with root package name */
    private Context f35486d;

    /* renamed from: e  reason: collision with root package name */
    private i f35487e;

    /* renamed from: f  reason: collision with root package name */
    private int f35488f;

    /* renamed from: g  reason: collision with root package name */
    private TabHost.OnTabChangeListener f35489g;

    /* renamed from: h  reason: collision with root package name */
    private c f35490h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f35491i;

    /* renamed from: j  reason: collision with root package name */
    private b f35492j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f35493k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f35494l = false;

    public interface b {
        static {
            Covode.recordClassIndex(21228);
        }

        void a(String str, Fragment fragment, Fragment fragment2);
    }

    static {
        Covode.recordClassIndex(21224);
    }

    public boolean getDispatchWindowFocusChangedToAllTab() {
        return this.f35483a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35491i = false;
    }

    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.bytedance.ies.uikit.tabhost.FragmentTabHost.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(21226);
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
        String f35495a;

        static {
            Covode.recordClassIndex(21225);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f35495a + "}";
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f35495a = parcel.readString();
        }

        /* synthetic */ SavedState(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f35495a);
        }
    }

    public Fragment getCurrentFragment() {
        c cVar = this.f35490h;
        if (cVar != null) {
            return cVar.f35500d;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f35495a = getCurrentTabTag();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            String currentTabTag = getCurrentTabTag();
            n nVar = null;
            for (int i2 = 0; i2 < this.f35484b.size(); i2++) {
                c cVar = this.f35484b.get(i2);
                cVar.f35500d = this.f35487e.a(cVar.f35497a);
                if (cVar.f35500d != null && !cVar.f35500d.isDetached()) {
                    if (cVar.f35497a.equals(currentTabTag)) {
                        this.f35490h = cVar;
                    } else {
                        if (nVar == null) {
                            nVar = this.f35487e.a();
                        }
                        nVar.d(cVar.f35500d);
                    }
                }
            }
            this.f35491i = true;
            n a2 = a(currentTabTag, nVar);
            if (a2 != null) {
                a2.c();
                this.f35487e.b();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void onFinishInflate() {
        MethodCollector.i(12971);
        super.onFinishInflate();
        Context context = getContext();
        if (context == null) {
            MethodCollector.o(12971);
            return;
        }
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f35485c = frameLayout2;
            frameLayout2.setId(this.f35488f);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        MethodCollector.o(12971);
    }

    public void setDispatchWindowFocusChangedToAllTab(boolean z) {
        this.f35483a = z;
    }

    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f35489g = onTabChangeListener;
    }

    public void setOnTabSwitchListener(b bVar) {
        this.f35492j = bVar;
    }

    public void setSuperOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        super.setOnTabChangedListener(onTabChangeListener);
    }

    static class a implements TabHost.TabContentFactory {

        /* renamed from: a  reason: collision with root package name */
        private final Context f35496a;

        static {
            Covode.recordClassIndex(21227);
        }

        public a(Context context) {
            this.f35496a = context;
        }

        public final View createTabContent(String str) {
            MethodCollector.i(14101);
            View view = new View(this.f35496a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            MethodCollector.o(14101);
            return view;
        }
    }

    public void setHideWhenTabChanged(boolean z) {
        if (!this.f35494l) {
            this.f35493k = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f35495a);
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        MethodCollector.i(12869);
        a(context, (AttributeSet) null);
        MethodCollector.o(12869);
    }

    public void dispatchWindowFocusChanged(boolean z) {
        if (this.f35483a) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).dispatchWindowFocusChanged(z);
            }
            return;
        }
        super.dispatchWindowFocusChanged(z);
    }

    public View getChildAt(int i2) {
        MethodCollector.i(13165);
        View childAt = super.getChildAt(i2);
        FrameLayout frameLayout = childAt;
        if (childAt == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            frameLayout2.setVisibility(8);
            frameLayout = frameLayout2;
        }
        MethodCollector.o(13165);
        return frameLayout;
    }

    public void onTabChanged(String str) {
        Fragment fragment;
        Fragment fragment2 = null;
        if (this.f35491i) {
            c cVar = this.f35490h;
            if (cVar != null) {
                fragment = cVar.f35500d;
            } else {
                fragment = null;
            }
            n a2 = a(str, (n) null);
            if (a2 != null) {
                a2.c();
            }
        } else {
            fragment = null;
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f35489g;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
        if (this.f35492j != null) {
            c cVar2 = this.f35490h;
            if (cVar2 != null) {
                fragment2 = cVar2.f35500d;
            }
            if (fragment2 != fragment) {
                this.f35492j.a(str, fragment2, fragment);
            }
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f35488f = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(12870);
        a(context, attributeSet);
        MethodCollector.o(12870);
    }

    public final void a(Context context, i iVar) {
        super.setup();
        this.f35486d = context;
        this.f35487e = iVar;
        this.f35488f = R.id.eh6;
        if (this.f35485c == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.eh6);
            this.f35485c = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f35488f);
            }
        }
        this.f35485c.setId(R.id.eh6);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    private n a(String str, n nVar) {
        this.f35494l = true;
        c cVar = null;
        for (int i2 = 0; i2 < this.f35484b.size(); i2++) {
            c cVar2 = this.f35484b.get(i2);
            if (cVar2.f35497a.equals(str)) {
                cVar = cVar2;
            }
        }
        if (cVar == null) {
            return null;
        }
        if (this.f35490h != cVar) {
            if (nVar == null) {
                nVar = this.f35487e.a();
            }
            c cVar3 = this.f35490h;
            if (!(cVar3 == null || cVar3.f35500d == null)) {
                if (this.f35493k) {
                    nVar.b(this.f35490h.f35500d);
                } else {
                    nVar.d(this.f35490h.f35500d);
                }
            }
            if (cVar.f35500d == null) {
                cVar.f35500d = Fragment.instantiate(this.f35486d, cVar.f35498b.getName(), cVar.f35499c);
                nVar.a(this.f35488f, cVar.f35500d, cVar.f35497a);
            } else if (this.f35493k) {
                if (cVar.f35500d.isDetached()) {
                    nVar.e(cVar.f35500d);
                }
                nVar.c(cVar.f35500d);
            } else {
                nVar.e(cVar.f35500d);
            }
            this.f35490h = cVar;
        }
        return nVar;
    }

    /* access modifiers changed from: package-private */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f35497a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f35498b;

        /* renamed from: c  reason: collision with root package name */
        public Bundle f35499c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f35500d;

        static {
            Covode.recordClassIndex(21229);
        }

        c(String str, Class<?> cls, Bundle bundle) {
            this.f35497a = str;
            this.f35498b = cls;
            this.f35499c = bundle;
        }
    }

    public final void a(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        tabSpec.setContent(new a(this.f35486d));
        String tag = tabSpec.getTag();
        c cVar = new c(tag, cls, bundle);
        if (this.f35491i) {
            cVar.f35500d = this.f35487e.a(tag);
            if (cVar.f35500d != null && !cVar.f35500d.isDetached()) {
                n a2 = this.f35487e.a();
                a2.d(cVar.f35500d);
                a2.c();
            }
        }
        this.f35484b.add(cVar);
        addTab(tabSpec);
    }
}

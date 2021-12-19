package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.u;
import com.bytedance.covode.number.Covode;

public class BottomNavigationPresenter implements o {

    /* renamed from: a  reason: collision with root package name */
    public c f52285a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f52286b;

    /* renamed from: c  reason: collision with root package name */
    public int f52287c;

    /* renamed from: d  reason: collision with root package name */
    private h f52288d;

    static {
        Covode.recordClassIndex(32461);
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(h hVar, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(o.a aVar) {
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean a(u uVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean b(j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean c(j jVar) {
        return false;
    }

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32463);
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
        int f52289a;

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        static {
            Covode.recordClassIndex(32462);
        }

        SavedState(Parcel parcel) {
            this.f52289a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f52289a);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public final int b() {
        return this.f52287c;
    }

    @Override // androidx.appcompat.view.menu.o
    public final Parcelable f() {
        SavedState savedState = new SavedState();
        savedState.f52289a = this.f52285a.getSelectedItemId();
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            c cVar = this.f52285a;
            int i2 = ((SavedState) parcelable).f52289a;
            int size = cVar.f52320h.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItem item = cVar.f52320h.getItem(i3);
                if (i2 == item.getItemId()) {
                    cVar.f52317e = i2;
                    cVar.f52318f = i3;
                    item.setChecked(true);
                    return;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(boolean z) {
        if (!this.f52286b) {
            if (z) {
                this.f52285a.b();
                return;
            }
            c cVar = this.f52285a;
            if (!(cVar.f52320h == null || cVar.f52316d == null)) {
                int size = cVar.f52320h.size();
                if (size != cVar.f52316d.length) {
                    cVar.b();
                    return;
                }
                int i2 = cVar.f52317e;
                for (int i3 = 0; i3 < size; i3++) {
                    MenuItem item = cVar.f52320h.getItem(i3);
                    if (item.isChecked()) {
                        cVar.f52317e = item.getItemId();
                        cVar.f52318f = i3;
                    }
                }
                if (i2 != cVar.f52317e) {
                    androidx.k.o.a(cVar, cVar.f52313a);
                }
                boolean a2 = c.a(cVar.f52315c, cVar.f52320h.i().size());
                for (int i4 = 0; i4 < size; i4++) {
                    cVar.f52319g.f52286b = true;
                    cVar.f52316d[i4].setLabelVisibilityMode(cVar.f52315c);
                    cVar.f52316d[i4].setShifting(a2);
                    cVar.f52316d[i4].a((j) cVar.f52320h.getItem(i4));
                    cVar.f52319g.f52286b = false;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(Context context, h hVar) {
        this.f52288d = hVar;
        this.f52285a.f52320h = hVar;
    }
}

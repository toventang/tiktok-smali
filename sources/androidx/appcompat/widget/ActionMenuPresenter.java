package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.view.menu.u;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.h.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class ActionMenuPresenter extends androidx.appcompat.view.menu.b implements b.a {
    private final SparseBooleanArray A = new SparseBooleanArray();
    private View B;
    private b C;

    /* renamed from: i  reason: collision with root package name */
    d f1313i;

    /* renamed from: j  reason: collision with root package name */
    Drawable f1314j;

    /* renamed from: k  reason: collision with root package name */
    boolean f1315k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1316l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1317m;
    e n;
    a o;
    c p;
    final f q = new f();
    int r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    static {
        Covode.recordClassIndex(376);
    }

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class androidx.appcompat.widget.ActionMenuPresenter.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(378);
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
        public int f1318a;

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        static {
            Covode.recordClassIndex(377);
        }

        SavedState(Parcel parcel) {
            this.f1318a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1318a);
        }
    }

    @Override // androidx.appcompat.view.menu.b
    public final boolean a(j jVar) {
        return jVar.f();
    }

    @Override // androidx.appcompat.view.menu.b
    public final boolean a(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.f1313i) {
            return false;
        }
        return super.a(viewGroup, i2);
    }

    @Override // androidx.appcompat.view.menu.o, androidx.appcompat.view.menu.b
    public final boolean a(u uVar) {
        boolean z2 = false;
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        u uVar2 = uVar;
        while (uVar2.n != this.f1159c) {
            uVar2 = (u) uVar2.n;
        }
        MenuItem item = uVar2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.f1163g;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                if (!(childAt instanceof p.a) || ((p.a) childAt).getItemData() != item) {
                    i2++;
                } else if (childAt != null) {
                    this.r = uVar.getItem().getItemId();
                    int size = uVar.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        MenuItem item2 = uVar.getItem(i3);
                        if (item2.isVisible() && item2.getIcon() != null) {
                            z2 = true;
                            break;
                        }
                        i3++;
                    }
                    a aVar = new a(this.f1158b, uVar, childAt);
                    this.o = aVar;
                    aVar.a(z2);
                    if (this.o.b()) {
                        super.a(uVar);
                        return true;
                    }
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* renamed from: b  reason: collision with root package name */
        private final float[] f1324b = new float[2];

        static {
            Covode.recordClassIndex(382);
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean c() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean d() {
            return false;
        }

        /* access modifiers changed from: protected */
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            k.a(this);
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.e();
            return true;
        }

        public d(Context context) {
            super(context, null, R.attr.hp);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            an.a(this, getContentDescription());
            setOnTouchListener(new z(this, ActionMenuPresenter.this) {
                /* class androidx.appcompat.widget.ActionMenuPresenter.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(383);
                }

                @Override // androidx.appcompat.widget.z
                public final boolean b() {
                    ActionMenuPresenter.this.e();
                    return true;
                }

                @Override // androidx.appcompat.widget.z
                public final s a() {
                    if (ActionMenuPresenter.this.n == null) {
                        return null;
                    }
                    return ActionMenuPresenter.this.n.a();
                }

                @Override // androidx.appcompat.widget.z
                public final boolean c() {
                    if (ActionMenuPresenter.this.p != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.g();
                    return true;
                }
            });
        }

        /* access modifiers changed from: protected */
        public final boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public final void d() {
        this.f1316l = true;
        this.s = true;
    }

    /* access modifiers changed from: package-private */
    public class a extends n {
        static {
            Covode.recordClassIndex(379);
        }

        @Override // androidx.appcompat.view.menu.n
        public final void d() {
            ActionMenuPresenter.this.o = null;
            ActionMenuPresenter.this.r = 0;
            super.d();
        }

        public a(Context context, u uVar, View view) {
            super(context, uVar, view, false);
            View view2;
            if (!((j) uVar.getItem()).f()) {
                if (ActionMenuPresenter.this.f1313i == null) {
                    view2 = (View) ActionMenuPresenter.this.f1163g;
                } else {
                    view2 = ActionMenuPresenter.this.f1313i;
                }
                this.f1251a = view2;
            }
            a(ActionMenuPresenter.this.q);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public final Parcelable f() {
        SavedState savedState = new SavedState();
        savedState.f1318a = this.r;
        return savedState;
    }

    public final boolean h() {
        return g() | i();
    }

    public final boolean i() {
        a aVar = this.o;
        if (aVar == null) {
            return false;
        }
        aVar.c();
        return true;
    }

    public final boolean j() {
        e eVar = this.n;
        if (eVar == null || !eVar.e()) {
            return false;
        }
        return true;
    }

    class b extends ActionMenuItemView.b {
        static {
            Covode.recordClassIndex(380);
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public final s a() {
            if (ActionMenuPresenter.this.o != null) {
                return ActionMenuPresenter.this.o.a();
            }
            return null;
        }

        b() {
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends n {
        static {
            Covode.recordClassIndex(384);
        }

        @Override // androidx.appcompat.view.menu.n
        public final void d() {
            if (ActionMenuPresenter.this.f1159c != null) {
                ActionMenuPresenter.this.f1159c.close();
            }
            ActionMenuPresenter.this.n = null;
            super.d();
        }

        public e(Context context, h hVar, View view) {
            super(context, hVar, view, true);
            this.f1252b = 8388613;
            a(ActionMenuPresenter.this.q);
        }
    }

    public final void c() {
        if (!this.w) {
            this.v = androidx.appcompat.view.a.a(this.f1158b).a();
        }
        if (this.f1159c != null) {
            this.f1159c.b(true);
        }
    }

    public final boolean g() {
        if (this.p == null || this.f1163g == null) {
            e eVar = this.n;
            if (eVar == null) {
                return false;
            }
            eVar.c();
            return true;
        }
        ((View) this.f1163g).removeCallbacks(this.p);
        this.p = null;
        return true;
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private e f1322b;

        static {
            Covode.recordClassIndex(381);
        }

        public final void run() {
            if (ActionMenuPresenter.this.f1159c != null) {
                h hVar = ActionMenuPresenter.this.f1159c;
                if (hVar.f1213c != null) {
                    hVar.f1213c.a(hVar);
                }
            }
            View view = (View) ActionMenuPresenter.this.f1163g;
            if (!(view == null || view.getWindowToken() == null || !this.f1322b.b())) {
                ActionMenuPresenter.this.n = this.f1322b;
            }
            ActionMenuPresenter.this.p = null;
        }

        public c(e eVar) {
            this.f1322b = eVar;
        }
    }

    public final boolean e() {
        if (!this.f1316l || j() || this.f1159c == null || this.f1163g == null || this.p != null || this.f1159c.k().isEmpty()) {
            return false;
        }
        this.p = new c(new e(this.f1158b, this.f1159c, this.f1313i));
        ((View) this.f1163g).post(this.p);
        super.a((u) null);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0137, code lost:
        if (r3 == false) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0113  */
    @Override // androidx.appcompat.view.menu.o, androidx.appcompat.view.menu.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuPresenter.a():boolean");
    }

    class f implements o.a {
        static {
            Covode.recordClassIndex(385);
        }

        f() {
        }

        @Override // androidx.appcompat.view.menu.o.a
        public final boolean a(h hVar) {
            if (hVar == null) {
                return false;
            }
            ActionMenuPresenter.this.r = ((u) hVar).getItem().getItemId();
            o.a aVar = ActionMenuPresenter.this.f1162f;
            if (aVar != null) {
                return aVar.a(hVar);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.o.a
        public final void a(h hVar, boolean z) {
            if (hVar instanceof u) {
                hVar.l().a(false);
            }
            o.a aVar = ActionMenuPresenter.this.f1162f;
            if (aVar != null) {
                aVar.a(hVar, z);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.b
    public final p a(ViewGroup viewGroup) {
        p pVar = this.f1163g;
        p a2 = super.a(viewGroup);
        if (pVar != a2) {
            ((ActionMenuView) a2).setPresenter(this);
        }
        return a2;
    }

    public ActionMenuPresenter(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(Parcelable parcelable) {
        MenuItem findItem;
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            if (savedState.f1318a > 0 && (findItem = this.f1159c.findItem(savedState.f1318a)) != null) {
                a((u) findItem.getSubMenu());
            }
        }
    }

    @Override // androidx.core.h.b.a
    public final void b(boolean z2) {
        if (z2) {
            super.a((u) null);
        } else if (this.f1159c != null) {
            this.f1159c.a(false);
        }
    }

    public final void a(ActionMenuView actionMenuView) {
        this.f1163g = actionMenuView;
        actionMenuView.f1329a = this.f1159c;
    }

    @Override // androidx.appcompat.view.menu.o, androidx.appcompat.view.menu.b
    public final void a(boolean z2) {
        ArrayList<j> arrayList;
        int size;
        super.a(z2);
        ((View) this.f1163g).requestLayout();
        if (this.f1159c != null) {
            h hVar = this.f1159c;
            hVar.j();
            ArrayList<j> arrayList2 = hVar.f1215e;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                androidx.core.h.b bVar = arrayList2.get(i2).f1233f;
                if (bVar != null) {
                    bVar.f2521f = this;
                }
            }
        }
        if (this.f1159c != null) {
            arrayList = this.f1159c.k();
        } else {
            arrayList = null;
        }
        if (!this.f1316l || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!arrayList.get(0).isActionViewExpanded()))) {
            d dVar = this.f1313i;
            if (dVar != null && dVar.getParent() == this.f1163g) {
                ((ViewGroup) this.f1163g).removeView(this.f1313i);
            }
        } else {
            if (this.f1313i == null) {
                this.f1313i = new d(this.f1157a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1313i.getParent();
            if (viewGroup != this.f1163g) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1313i);
                }
                d dVar2 = this.f1313i;
                ActionMenuView.c a2 = ActionMenuView.a();
                a2.f1340a = true;
                ((ActionMenuView) this.f1163g).addView(dVar2, a2);
            }
        }
        ((ActionMenuView) this.f1163g).setOverflowReserved(this.f1316l);
    }

    @Override // androidx.appcompat.view.menu.o, androidx.appcompat.view.menu.b
    public final void a(h hVar, boolean z2) {
        h();
        super.a(hVar, z2);
    }

    @Override // androidx.appcompat.view.menu.o, androidx.appcompat.view.menu.b
    public final void a(Context context, h hVar) {
        super.a(context, hVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a a2 = androidx.appcompat.view.a.a(context);
        if (!this.s) {
            int i2 = Build.VERSION.SDK_INT;
            this.f1316l = true;
        }
        if (!this.y) {
            this.t = a2.f1063a.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.w) {
            this.v = a2.a();
        }
        int i3 = this.t;
        if (this.f1316l) {
            if (this.f1313i == null) {
                d dVar = new d(this.f1157a);
                this.f1313i = dVar;
                if (this.f1315k) {
                    dVar.setImageDrawable(this.f1314j);
                    this.f1314j = null;
                    this.f1315k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1313i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i3 -= this.f1313i.getMeasuredWidth();
        } else {
            this.f1313i = null;
        }
        this.u = i3;
        this.z = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.B = null;
    }

    @Override // androidx.appcompat.view.menu.b
    public final void a(j jVar, p.a aVar) {
        aVar.a(jVar);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1163g);
        if (this.C == null) {
            this.C = new b();
        }
        actionMenuItemView.setPopupCallback(this.C);
    }

    @Override // androidx.appcompat.view.menu.b
    public final View a(j jVar, View view, ViewGroup viewGroup) {
        int i2;
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.j()) {
            actionView = super.a(jVar, view, viewGroup);
        }
        if (jVar.isActionViewExpanded()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        actionView.setVisibility(i2);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.a(layoutParams));
        }
        return actionView;
    }
}

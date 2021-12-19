package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.covode.number.Covode;

public class ActionMenuView extends LinearLayoutCompat implements h.b, p {

    /* renamed from: a  reason: collision with root package name */
    public h f1329a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1330b;

    /* renamed from: c  reason: collision with root package name */
    ActionMenuPresenter f1331c;

    /* renamed from: d  reason: collision with root package name */
    h.a f1332d;

    /* renamed from: e  reason: collision with root package name */
    e f1333e;

    /* renamed from: h  reason: collision with root package name */
    private Context f1334h;

    /* renamed from: i  reason: collision with root package name */
    private int f1335i;

    /* renamed from: j  reason: collision with root package name */
    private o.a f1336j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1337k;

    /* renamed from: l  reason: collision with root package name */
    private int f1338l;

    /* renamed from: m  reason: collision with root package name */
    private int f1339m;
    private int n;

    public interface a {
        static {
            Covode.recordClassIndex(387);
        }

        boolean c();

        boolean d();
    }

    public interface e {
        static {
            Covode.recordClassIndex(391);
        }

        boolean a(MenuItem menuItem);
    }

    static {
        Covode.recordClassIndex(386);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static class b implements o.a {
        static {
            Covode.recordClassIndex(388);
        }

        @Override // androidx.appcompat.view.menu.o.a
        public final void a(h hVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.o.a
        public final boolean a(h hVar) {
            return false;
        }

        b() {
        }
    }

    public int getPopupTheme() {
        return this.f1335i;
    }

    public static class c extends LinearLayoutCompat.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f1340a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f1341b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f1342c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f1343d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f1344e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1345f;

        static {
            Covode.recordClassIndex(389);
        }

        public c() {
            super(-2, -2);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f1340a = cVar.f1340a;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public final /* synthetic */ LinearLayoutCompat.a c() {
        return a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    static c a() {
        c cVar = new c();
        cVar.f1407h = 16;
        return cVar;
    }

    public final void b() {
        ActionMenuPresenter actionMenuPresenter = this.f1331c;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.h();
        }
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f1331c;
        if (actionMenuPresenter.f1313i != null) {
            return actionMenuPresenter.f1313i.getDrawable();
        }
        if (actionMenuPresenter.f1315k) {
            return actionMenuPresenter.f1314j;
        }
        return null;
    }

    public Menu getMenu() {
        if (this.f1329a == null) {
            Context context = getContext();
            h hVar = new h(context);
            this.f1329a = hVar;
            hVar.a(new d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f1331c = actionMenuPresenter;
            actionMenuPresenter.d();
            ActionMenuPresenter actionMenuPresenter2 = this.f1331c;
            o.a aVar = this.f1336j;
            if (aVar == null) {
                aVar = new b();
            }
            actionMenuPresenter2.f1162f = aVar;
            this.f1329a.a(this.f1331c, this.f1334h);
            this.f1331c.a(this);
        }
        return this.f1329a;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void a(h hVar) {
        this.f1329a = hVar;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f1333e = eVar;
    }

    public void setOverflowReserved(boolean z) {
        this.f1330b = z;
    }

    /* access modifiers changed from: package-private */
    public class d implements h.a {
        static {
            Covode.recordClassIndex(390);
        }

        d() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void a(h hVar) {
            if (ActionMenuView.this.f1332d != null) {
                ActionMenuView.this.f1332d.a(hVar);
            }
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final boolean a(h hVar, MenuItem menuItem) {
            if (ActionMenuView.this.f1333e == null || !ActionMenuView.this.f1333e.a(menuItem)) {
                return false;
            }
            return true;
        }
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public final /* synthetic */ LinearLayoutCompat.a b(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1331c.f1317m = z;
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f1331c = actionMenuPresenter;
        actionMenuPresenter.a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null || !(layoutParams instanceof c)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, androidx.appcompat.widget.LinearLayoutCompat
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f1331c;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.a(false);
            if (this.f1331c.j()) {
                this.f1331c.g();
                this.f1331c.e();
            }
        }
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f1331c;
        if (actionMenuPresenter.f1313i != null) {
            actionMenuPresenter.f1313i.setImageDrawable(drawable);
            return;
        }
        actionMenuPresenter.f1315k = true;
        actionMenuPresenter.f1314j = drawable;
    }

    public void setPopupTheme(int i2) {
        if (this.f1335i != i2) {
            this.f1335i = i2;
            if (i2 == 0) {
                this.f1334h = getContext();
            } else {
                this.f1334h = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    protected static c a(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return a();
        }
        if (layoutParams instanceof c) {
            cVar = new c((c) layoutParams);
        } else {
            cVar = new c(layoutParams);
        }
        if (cVar.f1407h <= 0) {
            cVar.f1407h = 16;
        }
        return cVar;
    }

    private boolean b(int i2) {
        boolean z = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            z = false | ((a) childAt).d();
        }
        if (i2 <= 0 || !(childAt2 instanceof a)) {
            return z;
        }
        return z | ((a) childAt2).c();
    }

    @Override // androidx.appcompat.view.menu.h.b
    public final boolean a(j jVar) {
        return this.f1329a.a(jVar, (o) null, 0);
    }

    public final void a(o.a aVar, h.a aVar2) {
        this.f1336j = aVar;
        this.f1332d = aVar2;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1339m = (int) (56.0f * f2);
        this.n = (int) (f2 * 4.0f);
        this.f1334h = context;
        this.f1335i = 0;
    }

    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
        // Method dump skipped, instructions count: 626
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    static int a(View view, int i2, int i3, int i4, int i5) {
        ActionMenuItemView actionMenuItemView;
        boolean z;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z2 = true;
        if (actionMenuItemView == null || !actionMenuItemView.b()) {
            z = false;
        } else {
            z = true;
        }
        int i6 = 2;
        if (i3 <= 0 || (z && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z || i7 >= 2) {
                i6 = i7;
            }
        }
        if (cVar.f1340a || !z) {
            z2 = false;
        }
        cVar.f1343d = z2;
        cVar.f1341b = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), makeMeasureSpec);
        return i6;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int width;
        int i7;
        if (!this.f1337k) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i4 - i2;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = ar.a(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1340a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (b(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i7 = getPaddingLeft() + cVar.leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    b(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i6 = paddingRight / i16;
        } else {
            i6 = 0;
        }
        int max = Math.max(0, i6);
        if (a2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1340a) {
                    int i18 = width2 - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1340a) {
                int i21 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }
}

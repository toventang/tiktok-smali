package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.c;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class ActivityChooserView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    final a f1347a;

    /* renamed from: b  reason: collision with root package name */
    final FrameLayout f1348b;

    /* renamed from: c  reason: collision with root package name */
    final FrameLayout f1349c;

    /* renamed from: d  reason: collision with root package name */
    androidx.core.h.b f1350d;

    /* renamed from: e  reason: collision with root package name */
    final DataSetObserver f1351e;

    /* renamed from: f  reason: collision with root package name */
    PopupWindow.OnDismissListener f1352f;

    /* renamed from: g  reason: collision with root package name */
    boolean f1353g;

    /* renamed from: h  reason: collision with root package name */
    int f1354h;

    /* renamed from: i  reason: collision with root package name */
    private final b f1355i;

    /* renamed from: j  reason: collision with root package name */
    private final View f1356j;

    /* renamed from: k  reason: collision with root package name */
    private final ImageView f1357k;

    /* renamed from: l  reason: collision with root package name */
    private final int f1358l;

    /* renamed from: m  reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f1359m;
    private aa n;
    private boolean o;
    private int p;

    static {
        Covode.recordClassIndex(392);
    }

    public final c getDataModel() {
        return this.f1347a.f1361a;
    }

    private boolean b() {
        return getListPopupWindow().w.isShowing();
    }

    public static class InnerLayout extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        private static final int[] f1360a = {16842964};

        static {
            Covode.recordClassIndex(393);
        }

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            al a2 = al.a(context, attributeSet, f1360a);
            setBackgroundDrawable(a2.a(0));
            a2.f1549a.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ActivityChooserView f1367a;

        static {
            Covode.recordClassIndex(395);
        }

        public final void onDismiss() {
            if (this.f1367a.f1352f != null) {
                this.f1367a.f1352f.onDismiss();
            }
            if (this.f1367a.f1350d != null) {
                this.f1367a.f1350d.a(false);
            }
        }

        public final boolean onLongClick(View view) {
            if (view == this.f1367a.f1349c) {
                if (this.f1367a.f1347a.getCount() > 0) {
                    this.f1367a.f1353g = true;
                    ActivityChooserView activityChooserView = this.f1367a;
                    activityChooserView.a(activityChooserView.f1354h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        public final void onClick(View view) {
            if (view == this.f1367a.f1349c) {
                this.f1367a.a();
                Intent b2 = this.f1367a.f1347a.f1361a.b(this.f1367a.f1347a.f1361a.a(this.f1367a.f1347a.f1361a.b()));
                if (b2 != null) {
                    b2.addFlags(524288);
                    a(this.f1367a.getContext(), b2);
                }
            } else if (view == this.f1367a.f1348b) {
                this.f1367a.f1353g = false;
                ActivityChooserView activityChooserView = this.f1367a;
                activityChooserView.a(activityChooserView.f1354h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        private static void a(Context context, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            float f2;
            int itemViewType = ((a) adapterView.getAdapter()).getItemViewType(i2);
            if (itemViewType == 0) {
                this.f1367a.a();
                if (!this.f1367a.f1353g) {
                    if (!this.f1367a.f1347a.f1362b) {
                        i2++;
                    }
                    Intent b2 = this.f1367a.f1347a.f1361a.b(i2);
                    if (b2 != null) {
                        b2.addFlags(524288);
                        a(this.f1367a.getContext(), b2);
                    }
                } else if (i2 > 0) {
                    c cVar = this.f1367a.f1347a.f1361a;
                    synchronized (cVar.f1597b) {
                        cVar.c();
                        c.a aVar = cVar.f1598c.get(i2);
                        c.a aVar2 = cVar.f1598c.get(0);
                        if (aVar2 != null) {
                            f2 = (aVar2.f1608b - aVar.f1608b) + 5.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        cVar.a(new c.C0023c(new ComponentName(aVar.f1607a.activityInfo.packageName, aVar.f1607a.activityInfo.name), System.currentTimeMillis(), f2));
                    }
                }
            } else if (itemViewType == 1) {
                this.f1367a.a(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.f1347a.f1361a;
        if (cVar != null) {
            cVar.registerObserver(this.f1351e);
        }
        this.o = true;
    }

    /* access modifiers changed from: package-private */
    public class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        public c f1361a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1362b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ActivityChooserView f1363c;

        /* renamed from: d  reason: collision with root package name */
        private int f1364d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1365e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1366f;

        static {
            Covode.recordClassIndex(394);
        }

        public final long getItemId(int i2) {
            return (long) i2;
        }

        public final int getViewTypeCount() {
            return 3;
        }

        public final int a() {
            int i2 = this.f1364d;
            this.f1364d = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i3 = 0;
            for (int i4 = 0; i4 < count; i4++) {
                view = getView(i4, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i3 = Math.max(i3, view.getMeasuredWidth());
            }
            this.f1364d = i2;
            return i3;
        }

        public final int getCount() {
            int a2 = this.f1361a.a();
            if (!this.f1362b && this.f1361a.b() != null) {
                a2--;
            }
            int min = Math.min(a2, this.f1364d);
            if (this.f1366f) {
                return min + 1;
            }
            return min;
        }

        public final void a(int i2) {
            if (this.f1364d != i2) {
                this.f1364d = i2;
                notifyDataSetChanged();
            }
        }

        public final int getItemViewType(int i2) {
            if (!this.f1366f || i2 != getCount() - 1) {
                return 0;
            }
            return 1;
        }

        public final void a(boolean z) {
            if (this.f1366f != z) {
                this.f1366f = z;
                notifyDataSetChanged();
            }
        }

        public final Object getItem(int i2) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType == 0) {
                if (!this.f1362b && this.f1361a.b() != null) {
                    i2++;
                }
                return this.f1361a.a(i2);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final void a(boolean z, boolean z2) {
            if (this.f1362b != z || this.f1365e != z2) {
                this.f1362b = z;
                this.f1365e = z2;
                notifyDataSetChanged();
            }
        }

        public final View getView(int i2, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType == 0) {
                if (view == null || view.getId() != R.id.cb_) {
                    view = com.a.a(LayoutInflater.from(this.f1363c.getContext()), R.layout.a9, viewGroup, false);
                }
                PackageManager packageManager = this.f1363c.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i2);
                ((ImageView) view.findViewById(R.id.bi7)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(R.id.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.f1362b || i2 != 0 || !this.f1365e) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View a2 = com.a.a(LayoutInflater.from(this.f1363c.getContext()), R.layout.a9, viewGroup, false);
                a2.setId(1);
                ((TextView) a2.findViewById(R.id.title)).setText(this.f1363c.getContext().getString(R.string.ll));
                return a2;
            }
        }
    }

    public final boolean a() {
        if (!getListPopupWindow().w.isShowing()) {
            return true;
        }
        getListPopupWindow().d();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f1359m);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final aa getListPopupWindow() {
        if (this.n == null) {
            aa aaVar = new aa(getContext());
            this.n = aaVar;
            aaVar.a(this.f1347a);
            this.n.o = this;
            this.n.b();
            this.n.q = this.f1355i;
            this.n.a(this.f1355i);
        }
        return this.n;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1347a.f1361a;
        if (cVar != null) {
            cVar.unregisterObserver(this.f1351e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1359m);
        }
        if (b()) {
            a();
        }
        this.o = false;
    }

    public final void setDefaultActionButtonContentDescription(int i2) {
        this.p = i2;
    }

    public final void setInitialActivityCount(int i2) {
        this.f1354h = i2;
    }

    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1352f = onDismissListener;
    }

    public final void setProvider(androidx.core.h.b bVar) {
        this.f1350d = bVar;
    }

    public final void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1357k.setImageDrawable(drawable);
    }

    public final void setExpandActivityOverflowButtonContentDescription(int i2) {
        this.f1357k.setContentDescription(getContext().getString(i2));
    }

    public final void setActivityChooserModel(c cVar) {
        a aVar = this.f1347a;
        c cVar2 = aVar.f1363c.f1347a.f1361a;
        if (cVar2 != null && aVar.f1363c.isShown()) {
            cVar2.unregisterObserver(aVar.f1363c.f1351e);
        }
        aVar.f1361a = cVar;
        if (cVar != null && aVar.f1363c.isShown()) {
            cVar.registerObserver(aVar.f1363c.f1351e);
        }
        aVar.notifyDataSetChanged();
        if (getListPopupWindow().w.isShowing()) {
            a();
            if (!getListPopupWindow().w.isShowing() && this.o) {
                this.f1353g = false;
                a(this.f1354h);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r6) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserView.a(int):void");
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        View view = this.f1356j;
        if (this.f1349c.getVisibility() != 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        }
        measureChild(view, i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.f1356j.layout(0, 0, i4 - i2, i5 - i3);
        if (!b()) {
            a();
        }
    }
}

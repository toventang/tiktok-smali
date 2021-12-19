package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public abstract class m implements AdapterView.OnItemClickListener, o, s {

    /* renamed from: g  reason: collision with root package name */
    public Rect f1250g;

    static {
        Covode.recordClassIndex(352);
    }

    public abstract void a(int i2);

    @Override // androidx.appcompat.view.menu.o
    public final void a(Context context, h hVar) {
    }

    public abstract void a(View view);

    public abstract void a(PopupWindow.OnDismissListener onDismissListener);

    public abstract void a(h hVar);

    @Override // androidx.appcompat.view.menu.o
    public final int b() {
        return 0;
    }

    public abstract void b(int i2);

    public abstract void b(boolean z);

    @Override // androidx.appcompat.view.menu.o
    public final boolean b(j jVar) {
        return false;
    }

    public abstract void c(int i2);

    public abstract void c(boolean z);

    @Override // androidx.appcompat.view.menu.o
    public final boolean c(j jVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return true;
    }

    m() {
    }

    protected static g a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (g) listAdapter;
    }

    protected static boolean b(h hVar) {
        int size = hVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = hVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        int i3;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        h hVar = a(listAdapter).f1205a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i2);
        if (h()) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        hVar.a(menuItem, this, i3);
    }

    protected static int a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }
}

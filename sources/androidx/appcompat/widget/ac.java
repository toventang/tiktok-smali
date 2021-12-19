package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public final class ac extends aa implements ab {

    /* renamed from: b  reason: collision with root package name */
    private static Method f1490b;

    /* renamed from: a  reason: collision with root package name */
    public ab f1491a;

    public static class a extends x {

        /* renamed from: c  reason: collision with root package name */
        final int f1492c;

        /* renamed from: d  reason: collision with root package name */
        final int f1493d;

        /* renamed from: e  reason: collision with root package name */
        private ab f1494e;

        /* renamed from: f  reason: collision with root package name */
        private MenuItem f1495f;

        static {
            Covode.recordClassIndex(457);
        }

        @Override // androidx.appcompat.widget.x
        public final /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.x
        public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.x
        public final /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.x
        public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public final void setHoverListener(ab abVar) {
            this.f1494e = abVar;
        }

        @Override // android.widget.AbsListView, androidx.appcompat.widget.x
        public final /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        @Override // androidx.appcompat.widget.x
        public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override // androidx.appcompat.widget.x
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i2;
            g gVar;
            int pointToPosition;
            int i3;
            if (this.f1494e != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    gVar = (g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i2 = 0;
                    gVar = (g) adapter;
                }
                j jVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i3 = pointToPosition - i2) >= 0 && i3 < gVar.getCount()) {
                    jVar = gVar.getItem(i3);
                }
                MenuItem menuItem = this.f1495f;
                if (menuItem != jVar) {
                    h hVar = gVar.f1205a;
                    if (menuItem != null) {
                        this.f1494e.a(hVar, menuItem);
                    }
                    this.f1495f = jVar;
                    if (jVar != null) {
                        this.f1494e.b(hVar, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // androidx.appcompat.widget.x
        public final /* bridge */ /* synthetic */ boolean a(MotionEvent motionEvent, int i2) {
            return super.a(motionEvent, i2);
        }

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            int i2 = Build.VERSION.SDK_INT;
            if (1 == configuration.getLayoutDirection()) {
                this.f1492c = 21;
                this.f1493d = 22;
                return;
            }
            this.f1492c = 22;
            this.f1493d = 21;
        }

        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null) {
                if (i2 == this.f1492c) {
                    if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                        performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                    }
                    return true;
                } else if (i2 == this.f1493d) {
                    setSelection(-1);
                    ((g) getAdapter()).f1205a.a(false);
                    return true;
                }
            }
            return super.onKeyDown(i2, keyEvent);
        }

        @Override // androidx.appcompat.widget.x
        public final /* bridge */ /* synthetic */ int a(int i2, int i3, int i4, int i5, int i6) {
            return super.a(i2, i3, i4, i5, i6);
        }
    }

    static {
        Covode.recordClassIndex(456);
        try {
            f1490b = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
        }
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.w.setEnterTransition(null);
        }
    }

    public final void l() {
        Method method = f1490b;
        if (method != null) {
            try {
                method.invoke(this.w, false);
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.appcompat.widget.ab
    public final void a(h hVar, MenuItem menuItem) {
        ab abVar = this.f1491a;
        if (abVar != null) {
            abVar.a(hVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.ab
    public final void b(h hVar, MenuItem menuItem) {
        ab abVar = this.f1491a;
        if (abVar != null) {
            abVar.b(hVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.aa
    public final x a(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    public ac(Context context, int i2, int i3) {
        super(context, null, i2, i3);
    }
}

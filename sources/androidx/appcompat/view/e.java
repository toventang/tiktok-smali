package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionBarContextView;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class e extends b implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f1071a;

    /* renamed from: b  reason: collision with root package name */
    private ActionBarContextView f1072b;

    /* renamed from: e  reason: collision with root package name */
    private b.a f1073e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<View> f1074f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1075g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1076h;

    /* renamed from: i  reason: collision with root package name */
    private h f1077i;

    static {
        Covode.recordClassIndex(312);
    }

    @Override // androidx.appcompat.view.b
    public final Menu b() {
        return this.f1077i;
    }

    @Override // androidx.appcompat.view.b
    public final void d() {
        this.f1073e.b(this, this.f1077i);
    }

    @Override // androidx.appcompat.view.b
    public final CharSequence f() {
        return this.f1072b.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public final CharSequence g() {
        return this.f1072b.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public final boolean h() {
        return this.f1072b.f1288g;
    }

    @Override // androidx.appcompat.view.b
    public final MenuInflater a() {
        return new g(this.f1072b.getContext());
    }

    @Override // androidx.appcompat.view.b
    public final View i() {
        WeakReference<View> weakReference = this.f1074f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public final void c() {
        if (!this.f1075g) {
            this.f1075g = true;
            this.f1072b.sendAccessibilityEvent(32);
            this.f1073e.a(this);
        }
    }

    @Override // androidx.appcompat.view.b
    public final void a(CharSequence charSequence) {
        this.f1072b.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public final void b(CharSequence charSequence) {
        this.f1072b.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public final void b(int i2) {
        a(this.f1071a.getString(i2));
    }

    @Override // androidx.appcompat.view.b
    public final void a(int i2) {
        b(this.f1071a.getString(i2));
    }

    @Override // androidx.appcompat.view.b
    public final void a(View view) {
        WeakReference<View> weakReference;
        this.f1072b.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f1074f = weakReference;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final void a(h hVar) {
        d();
        this.f1072b.a();
    }

    @Override // androidx.appcompat.view.b
    public final void a(boolean z) {
        super.a(z);
        this.f1072b.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final boolean a(h hVar, MenuItem menuItem) {
        return this.f1073e.a(this, menuItem);
    }

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f1071a = context;
        this.f1072b = actionBarContextView;
        this.f1073e = aVar;
        h hVar = new h(actionBarContextView.getContext());
        hVar.f1216f = 1;
        this.f1077i = hVar;
        hVar.a(this);
        this.f1076h = z;
    }
}

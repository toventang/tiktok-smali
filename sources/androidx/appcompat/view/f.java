package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.q;
import androidx.c.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f1078a;

    /* renamed from: b  reason: collision with root package name */
    final b f1079b;

    static {
        Covode.recordClassIndex(313);
    }

    public final void finish() {
        this.f1079b.c();
    }

    public final View getCustomView() {
        return this.f1079b.i();
    }

    public final MenuInflater getMenuInflater() {
        return this.f1079b.a();
    }

    public final CharSequence getSubtitle() {
        return this.f1079b.g();
    }

    public final Object getTag() {
        return this.f1079b.f1064c;
    }

    public final CharSequence getTitle() {
        return this.f1079b.f();
    }

    public final boolean getTitleOptionalHint() {
        return this.f1079b.f1065d;
    }

    public final void invalidate() {
        this.f1079b.d();
    }

    public final boolean isTitleOptional() {
        return this.f1079b.h();
    }

    public final Menu getMenu() {
        return q.a(this.f1078a, (androidx.core.a.a.a) this.f1079b.b());
    }

    public final void setCustomView(View view) {
        this.f1079b.a(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i2) {
        this.f1079b.b(i2);
    }

    public final void setTag(Object obj) {
        this.f1079b.f1064c = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i2) {
        this.f1079b.a(i2);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f1079b.a(z);
    }

    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f1080a;

        /* renamed from: b  reason: collision with root package name */
        final Context f1081b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f1082c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final g<Menu, Menu> f1083d = new g<>();

        static {
            Covode.recordClassIndex(314);
        }

        @Override // androidx.appcompat.view.b.a
        public final void a(b bVar) {
            this.f1080a.onDestroyActionMode(b(bVar));
        }

        private Menu a(Menu menu) {
            Menu menu2 = this.f1083d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a2 = q.a(this.f1081b, (androidx.core.a.a.a) menu);
            this.f1083d.put(menu, a2);
            return a2;
        }

        public final ActionMode b(b bVar) {
            int size = this.f1082c.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = this.f1082c.get(i2);
                if (fVar != null && fVar.f1079b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f1081b, bVar);
            this.f1082c.add(fVar2);
            return fVar2;
        }

        @Override // androidx.appcompat.view.b.a
        public final boolean b(b bVar, Menu menu) {
            return this.f1080a.onPrepareActionMode(b(bVar), a(menu));
        }

        public a(Context context, ActionMode.Callback callback) {
            this.f1081b = context;
            this.f1080a = callback;
        }

        @Override // androidx.appcompat.view.b.a
        public final boolean a(b bVar, Menu menu) {
            return this.f1080a.onCreateActionMode(b(bVar), a(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public final boolean a(b bVar, MenuItem menuItem) {
            return this.f1080a.onActionItemClicked(b(bVar), q.a(this.f1081b, (androidx.core.a.a.b) menuItem));
        }
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f1079b.a(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f1079b.b(charSequence);
    }

    public f(Context context, b bVar) {
        this.f1078a = context;
        this.f1079b = bVar;
    }
}

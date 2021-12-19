package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.k;
import androidx.core.h.b;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class l extends k {
    static {
        Covode.recordClassIndex(350);
    }

    class a extends k.a implements ActionProvider.VisibilityListener {

        /* renamed from: c  reason: collision with root package name */
        b.AbstractC0036b f1248c;

        static {
            Covode.recordClassIndex(351);
        }

        @Override // androidx.core.h.b
        public final boolean d() {
            return this.f1243a.overridesItemVisibility();
        }

        @Override // androidx.core.h.b
        public final boolean e() {
            return this.f1243a.isVisible();
        }

        @Override // androidx.core.h.b
        public final View a(MenuItem menuItem) {
            return this.f1243a.onCreateActionView(menuItem);
        }

        public final void onActionProviderVisibilityChanged(boolean z) {
            b.AbstractC0036b bVar = this.f1248c;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // androidx.core.h.b
        public final void a(b.AbstractC0036b bVar) {
            this.f1248c = bVar;
            this.f1243a.setVisibilityListener(this);
        }

        public a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.k
    public final k.a a(ActionProvider actionProvider) {
        return new a(this.f1167a, actionProvider);
    }

    l(Context context, androidx.core.a.a.b bVar) {
        super(context, bVar);
    }
}

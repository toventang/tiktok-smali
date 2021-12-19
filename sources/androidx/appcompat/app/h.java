package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.core.h.f;
import com.bytedance.covode.number.Covode;

public class h extends Dialog implements e {

    /* renamed from: a  reason: collision with root package name */
    private f f953a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f954b;

    static {
        Covode.recordClassIndex(274);
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        b().g();
    }

    private f b() {
        if (this.f953a == null) {
            this.f953a = f.a(this, this);
        }
        return this.f953a;
    }

    public final boolean cg_() {
        return b().c(1);
    }

    public void onStop() {
        super.onStop();
        b().e();
    }

    public h(Context context) {
        this(context, 0);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        b().b(i2);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return f.a(this.f954b, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i2) {
        return (T) b().a(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        b().a(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        b().a(charSequence);
    }

    public void onCreate(Bundle bundle) {
        b().j();
        super.onCreate(bundle);
        b().a(bundle);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        b().a(getContext().getString(i2));
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().b(view, layoutParams);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().a(view, layoutParams);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.content.Context r5, int r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x0014
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            r1 = 2130969245(0x7f04029d, float:1.7547166E38)
            r0 = 1
            r2.resolveAttribute(r1, r3, r0)
            int r6 = r3.resourceId
        L_0x0014:
            r4.<init>(r5, r6)
            androidx.appcompat.app.h$1 r0 = new androidx.appcompat.app.h$1
            r0.<init>()
            r4.f954b = r0
            androidx.appcompat.app.f r1 = r4.b()
            r0 = 0
            r1.a(r0)
            androidx.appcompat.app.f r0 = r4.b()
            r0.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.<init>(android.content.Context, int):void");
    }
}

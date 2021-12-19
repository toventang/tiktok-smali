package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import com.bytedance.covode.number.Covode;

public abstract class a {

    public static abstract class b {
        static {
            Covode.recordClassIndex(247);
        }

        public abstract Drawable a();

        public abstract CharSequence b();

        public abstract View c();

        public abstract CharSequence d();
    }

    static {
        Covode.recordClassIndex(245);
    }

    public androidx.appcompat.view.b a(b.a aVar) {
        return null;
    }

    public abstract void a();

    public void a(int i2) {
    }

    public void a(Configuration configuration) {
    }

    public void a(CharSequence charSequence) {
    }

    public abstract void a(boolean z);

    public boolean a(int i2, KeyEvent keyEvent) {
        return false;
    }

    public boolean a(KeyEvent keyEvent) {
        return false;
    }

    public abstract int b();

    public void b(boolean z) {
    }

    public abstract void c();

    public void c(boolean z) {
    }

    public Context d() {
        return null;
    }

    public void d(boolean z) {
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void j() {
    }

    public void e() {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    public static class C0018a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f895a;

        static {
            Covode.recordClassIndex(246);
        }

        public C0018a() {
            super(-2, -2);
            this.f895a = 8388627;
        }

        public C0018a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0018a(C0018a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f895a = aVar.f895a;
        }

        public C0018a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931});
            this.f895a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public void a(float f2) {
        if (f2 != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }
}

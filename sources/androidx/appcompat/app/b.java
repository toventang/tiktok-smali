package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.b.a.d;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;

public final class b implements DrawerLayout.c {

    /* renamed from: a  reason: collision with root package name */
    public d f896a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f897b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f898c;

    /* renamed from: d  reason: collision with root package name */
    private final a f899d;

    /* renamed from: e  reason: collision with root package name */
    private final int f900e;

    /* renamed from: f  reason: collision with root package name */
    private final int f901f;

    public interface a {
        static {
            Covode.recordClassIndex(249);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(248);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.c
    public final void onDrawerStateChanged(int i2) {
    }

    private void a(int i2) {
        this.f899d.a(i2);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.c
    public final void onDrawerClosed(View view) {
        a(0.0f);
        if (this.f898c) {
            a(this.f900e);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.c
    public final void onDrawerOpened(View view) {
        a(1.0f);
        if (this.f898c) {
            a(this.f901f);
        }
    }

    private void a(float f2) {
        if (f2 == 1.0f) {
            this.f896a.a(true);
        } else if (f2 == 0.0f) {
            this.f896a.a(false);
        }
        this.f896a.a(f2);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.c
    public final void onDrawerSlide(View view, float f2) {
        if (this.f897b) {
            a(Math.min(1.0f, Math.max(0.0f, f2)));
        } else {
            a(0.0f);
        }
    }
}

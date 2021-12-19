package com.bytedance.android.c.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private View f6825a;

    /* renamed from: b  reason: collision with root package name */
    private a f6826b;

    /* renamed from: f  reason: collision with root package name */
    public View f6827f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6828g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f6829h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6830i = y.a(54.0f);

    /* renamed from: j  reason: collision with root package name */
    public View f6831j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6832k;

    /* renamed from: l  reason: collision with root package name */
    public final Context f6833l;

    public interface a extends com.bytedance.android.live.e.a.a.a {
        static {
            Covode.recordClassIndex(3280);
        }

        void a(c cVar);

        void a_();
    }

    static {
        Covode.recordClassIndex(3279);
    }

    public abstract int a();

    public abstract View a(ViewGroup viewGroup);

    public void a(boolean z) {
    }

    public View b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        return null;
    }

    public abstract CharSequence b();

    public void b(boolean z) {
    }

    public abstract void c();

    public abstract boolean d();

    public abstract void e();

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f6834a;

        static {
            Covode.recordClassIndex(3281);
        }

        public b(c cVar) {
            this.f6834a = cVar;
        }

        public final void onClick(View view) {
            this.f6834a.c();
        }
    }

    public void a(a aVar) {
        this.f6826b = aVar;
    }

    public final void c(boolean z) {
        if (this.f6832k != z) {
            this.f6832k = z;
            b(z);
        }
    }

    public c(Context context) {
        l.d(context, "");
        this.f6833l = context;
    }

    public final View c(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        if (this.f6825a == null) {
            this.f6825a = b(viewGroup);
        }
        return this.f6825a;
    }

    public final void d(boolean z) {
        ImageView imageView = this.f6829h;
        if (imageView == null) {
            l.a("indicatorView");
        }
        if (imageView.isSelected() != z) {
            ImageView imageView2 = this.f6829h;
            if (imageView2 == null) {
                l.a("indicatorView");
            }
            imageView2.setSelected(z);
            a(z);
        }
    }

    /* access modifiers changed from: protected */
    public final void e(boolean z) {
        if (z) {
            View view = this.f6831j;
            if (view == null) {
                l.a("deleteView");
            }
            view.setVisibility(0);
            return;
        }
        View view2 = this.f6831j;
        if (view2 == null) {
            l.a("deleteView");
        }
        view2.setVisibility(8);
    }
}

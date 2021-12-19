package com.ss.android.ugc.aweme.shortvideo.edit;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.aweme.views.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Field;

public final class k extends LinearLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final a f127803c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AVDmtTextView f127804a;

    /* renamed from: b  reason: collision with root package name */
    public SimpleDraweeView f127805b;

    static {
        Covode.recordClassIndex(83772);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83773);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static k a(Context context, int i2, int i3) {
            l.d(context, "");
            k kVar = new k(context);
            kVar.setText(i2);
            kVar.setIcon(i3);
            return kVar;
        }
    }

    public final void a() {
        View findViewById = findViewById(R.id.djx);
        l.b(findViewById, "");
        findViewById.setVisibility(4);
    }

    public final boolean b() {
        View findViewById = findViewById(R.id.djx);
        l.b(findViewById, "");
        if (findViewById.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f127806a;

        static {
            Covode.recordClassIndex(83774);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(k kVar) {
            super(600);
            this.f127806a = kVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            new com.bytedance.tux.g.b(this.f127806a).a(this.f127806a.getResources().getText(R.string.fhd)).a(3000L).b();
        }
    }

    public final void setContentDescription(int i2) {
        AVDmtTextView aVDmtTextView = this.f127804a;
        if (aVDmtTextView == null) {
            l.a("mToolTv");
        }
        aVDmtTextView.setContentDescription(getContext().getString(i2));
    }

    public final void setIcon(int i2) {
        SimpleDraweeView simpleDraweeView = this.f127805b;
        if (simpleDraweeView == null) {
            l.a("mToolIv");
        }
        simpleDraweeView.setImageDrawable(getResources().getDrawable(i2));
    }

    public final void setText(String str) {
        l.d(str, "");
        AVDmtTextView aVDmtTextView = this.f127804a;
        if (aVDmtTextView == null) {
            l.a("mToolTv");
        }
        aVDmtTextView.setText(str);
    }

    public final void setIcon(Drawable drawable) {
        l.d(drawable, "");
        SimpleDraweeView simpleDraweeView = this.f127805b;
        if (simpleDraweeView == null) {
            l.a("mToolIv");
        }
        simpleDraweeView.setImageDrawable(drawable);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(3494);
        Object a2 = a(getContext(), "layout_inflater");
        if (a2 != null) {
            ((LayoutInflater) a2).inflate(R.layout.bj8, this);
            View findViewById = findViewById(R.id.a01);
            l.b(findViewById, "");
            this.f127804a = (AVDmtTextView) findViewById;
            View findViewById2 = findViewById(R.id.a00);
            l.b(findViewById2, "");
            this.f127805b = (SimpleDraweeView) findViewById2;
            MethodCollector.o(3494);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        MethodCollector.o(3494);
        throw nullPointerException;
    }

    public final void setText(int i2) {
        AVDmtTextView aVDmtTextView = this.f127804a;
        if (aVDmtTextView == null) {
            l.a("mToolTv");
        }
        aVDmtTextView.setText(getContext().getString(i2));
        AVDmtTextView aVDmtTextView2 = this.f127804a;
        if (aVDmtTextView2 == null) {
            l.a("mToolTv");
        }
        aVDmtTextView2.getText();
        getContext().getString(R.string.blj);
        if (aVDmtTextView2.getText().equals(getContext().getString(R.string.blj))) {
            Keva repo = Keva.getRepo("add_motion_tab");
            String.valueOf(repo.getBoolean("is_first_click_effect_reddot", true));
            if (com.bytedance.ies.abmock.b.a().a(true, "edit_effect_category_add_motion", 0) == 2 && repo.getBoolean("is_first_click_effect_reddot", true)) {
                repo.storeBoolean("is_first_click_effect_reddot", false);
                View findViewById = findViewById(R.id.djx);
                l.b(findViewById, "");
                findViewById.setVisibility(0);
            }
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3488);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(3488);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}

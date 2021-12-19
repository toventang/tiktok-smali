package com.ss.android.ugc.aweme.editSticker.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.a.a.d;
import com.bytedance.tux.tooltip.c;
import com.bytedance.tux.tooltip.h;
import com.ss.android.ugc.aweme.editSticker.interact.g;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.widget.AVAutoRTLImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class b {

    /* renamed from: j  reason: collision with root package name */
    public static final List<b> f88061j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public static final a f88062k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f88063a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f88064b;

    /* renamed from: c  reason: collision with root package name */
    public l f88065c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.tux.tooltip.a f88066d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f88067e;

    /* renamed from: f  reason: collision with root package name */
    public final g f88068f = new g();

    /* renamed from: g  reason: collision with root package name */
    public int f88069g = 1;

    /* renamed from: h  reason: collision with root package name */
    public final View f88070h;

    /* renamed from: i  reason: collision with root package name */
    public final k f88071i;

    /* renamed from: l  reason: collision with root package name */
    private final Handler f88072l = new Handler();

    /* renamed from: m  reason: collision with root package name */
    private h f88073m = h.TOP;

    public boolean a(d dVar) {
        l.d(dVar, "");
        return false;
    }

    public abstract View c();

    public static final class a {
        static {
            Covode.recordClassIndex(55352);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        com.bytedance.tux.tooltip.a aVar = this.f88066d;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public final void f() {
        f88061j.add(this);
    }

    public final void g() {
        f88061j.remove(this);
    }

    public final void b() {
        this.f88072l.removeCallbacksAndMessages(null);
        l lVar = this.f88065c;
        if (lVar != null) {
            lVar.isShowing();
        }
        this.f88065c = null;
    }

    static {
        Covode.recordClassIndex(55351);
    }

    /* access modifiers changed from: protected */
    public final LinearLayout d() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f88067e);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setMinimumWidth((int) r.a(this.f88067e, 104.0f));
        linearLayout.setGravity(16);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    public final View e() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) r.a(this.f88067e, 0.5f));
        View view = new View(this.f88067e);
        layoutParams.leftMargin = (int) r.a(this.f88067e, 12.0f);
        layoutParams.rightMargin = (int) r.a(this.f88067e, 12.0f);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(androidx.core.content.b.c(this.f88067e, R.color.a9));
        view.setAlpha(0.2f);
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.a.b$b  reason: collision with other inner class name */
    static final class C2136b extends m implements h.f.a.b<d, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(55353);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2136b(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(d dVar) {
            d dVar2 = dVar;
            l.d(dVar2, "");
            this.this$0.a(dVar2);
            return z.f158842a;
        }
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        if (i2 > 0) {
            this.f88069g = i2;
        }
    }

    public b(View view, k kVar) {
        l.d(view, "");
        this.f88070h = view;
        this.f88071i = kVar;
        Context context = view.getContext();
        l.b(context, "");
        this.f88067e = context;
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }

    private boolean a(PointF pointF, boolean z) {
        l.d(pointF, "");
        float a2 = r.a(this.f88067e, 41.0f);
        float a3 = r.a(this.f88067e, 12.0f);
        float a4 = (a2 * ((float) this.f88069g)) + a3 + r.a(this.f88067e, 60.0f);
        Object a5 = a(a(this.f88067e), "window");
        Objects.requireNonNull(a5, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) a5).getDefaultDisplay();
        l.b(defaultDisplay, "");
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        if (z) {
            if (pointF.x < 0.0f || pointF.y < a4 || pointF.x > ((float) width)) {
                return true;
            }
            return false;
        } else if (pointF.x < 0.0f || pointF.x > ((float) width) || pointF.y > ((float) height) - a4) {
            return true;
        } else {
            return false;
        }
    }

    private static float[] a(RectF rectF, float f2) {
        float[] fArr = {rectF.left, rectF.top, rectF.right, rectF.top, rectF.left, rectF.bottom, rectF.right, rectF.bottom};
        Matrix matrix = new Matrix();
        matrix.postRotate(f2, ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
        matrix.mapPoints(fArr);
        return fArr;
    }

    /* access modifiers changed from: protected */
    public final LinearLayout a(int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) r.a(this.f88067e, 44.0f));
        LinearLayout linearLayout = new LinearLayout(this.f88067e);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setMinimumWidth((int) r.a(this.f88067e, 104.0f));
        TuxTextView tuxTextView = new TuxTextView(this.f88067e, null, 0, 6);
        tuxTextView.setTextColor(androidx.core.content.b.c(this.f88067e, R.color.a9));
        tuxTextView.setTuxFont(62);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.f88067e.getString(i3));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        int i4 = Build.VERSION.SDK_INT;
        layoutParams2.setMarginStart((int) r.a(this.f88067e, 4.0f));
        layoutParams2.setMarginEnd((int) r.a(this.f88067e, 12.0f));
        tuxTextView.setLayoutParams(layoutParams2);
        AVAutoRTLImageView aVAutoRTLImageView = new AVAutoRTLImageView(this.f88067e);
        aVAutoRTLImageView.setImageResource(i2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        int i5 = Build.VERSION.SDK_INT;
        if (r.c(this.f88067e)) {
            layoutParams3.setMarginEnd((int) r.a(this.f88067e, 12.0f));
        } else {
            layoutParams3.setMarginStart((int) r.a(this.f88067e, 12.0f));
        }
        aVAutoRTLImageView.setLayoutParams(layoutParams3);
        linearLayout.addView(aVAutoRTLImageView, 0);
        linearLayout.addView(tuxTextView, 1);
        int i6 = Build.VERSION.SDK_INT;
        aVAutoRTLImageView.setLayoutDirection(0);
        return linearLayout;
    }

    private static PointF a(RectF rectF, float f2, boolean z) {
        PointF pointF = new PointF();
        float[] a2 = a(rectF, f2);
        if (a2[1] + a2[3] >= a2[5] + a2[7] || z) {
            pointF.set((a2[4] + a2[6]) / 2.0f, (a2[5] + a2[7]) / 2.0f);
        } else {
            pointF.set((a2[0] + a2[2]) / 2.0f, (a2[1] + a2[3]) / 2.0f);
        }
        return pointF;
    }

    public void a(RectF rectF, int i2, int i3, float f2, boolean z) {
        l.d(rectF, "");
        PointF a2 = a(rectF, f2, false);
        this.f88073m = h.TOP;
        if (a(a2, true)) {
            a2 = a(rectF, f2, true);
            this.f88073m = h.BOTTOM;
            if (a(a2, false)) {
                a2.x = (float) i2;
                a2.y = (float) i3;
                this.f88073m = h.TOP;
            }
        }
        if (a(new d(this.f88067e))) {
            com.bytedance.tux.tooltip.a.a.b bVar = new com.bytedance.tux.tooltip.a.a.b(this.f88067e);
            ((com.bytedance.tux.tooltip.a.a.b) bVar.a(androidx.core.content.b.c(this.f88067e, R.color.c7)).a(this.f88073m)).a(new C2136b(this)).b(4).a((int) a2.x, (int) a2.y).a(-1001L);
            com.bytedance.tux.tooltip.a d2 = bVar.d();
            this.f88066d = d2;
            if (d2 == null) {
                l.b();
            }
            d2.a();
            return;
        }
        com.bytedance.tux.tooltip.a d3 = new c(this.f88067e).a(androidx.core.content.b.c(this.f88067e, R.color.c7)).b(4).a((int) a2.x, (int) a2.y).a(this.f88073m).a(c()).a(true, (View.OnClickListener) null).a(true).a(-1001L).d();
        this.f88066d = d3;
        if (d3 == null) {
            l.b();
        }
        d3.a();
    }
}

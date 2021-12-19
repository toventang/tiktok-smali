package androidx.appcompat.widget;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public final class ao implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {

    /* renamed from: j  reason: collision with root package name */
    private static ao f1570j;

    /* renamed from: k  reason: collision with root package name */
    private static ao f1571k;

    /* renamed from: a  reason: collision with root package name */
    private final View f1572a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f1573b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1574c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f1575d = new Runnable() {
        /* class androidx.appcompat.widget.ao.AnonymousClass1 */

        static {
            Covode.recordClassIndex(476);
        }

        public final void run() {
            ao.this.a(false);
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f1576e = new Runnable() {
        /* class androidx.appcompat.widget.ao.AnonymousClass2 */

        static {
            Covode.recordClassIndex(477);
        }

        public final void run() {
            ao.this.a();
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private int f1577f;

    /* renamed from: g  reason: collision with root package name */
    private int f1578g;

    /* renamed from: h  reason: collision with root package name */
    private ap f1579h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1580i;

    static {
        Covode.recordClassIndex(475);
    }

    public final void onViewAttachedToWindow(View view) {
    }

    private void c() {
        this.f1572a.removeCallbacks(this.f1575d);
    }

    private void d() {
        this.f1577f = Integer.MAX_VALUE;
        this.f1578g = Integer.MAX_VALUE;
    }

    private void b() {
        this.f1572a.postDelayed(this.f1575d, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (f1571k == this) {
            f1571k = null;
            ap apVar = this.f1579h;
            if (apVar != null) {
                apVar.a();
                this.f1579h = null;
                d();
                this.f1572a.removeOnAttachStateChangeListener(this);
            }
        }
        if (f1570j == this) {
            a((ao) null);
        }
        this.f1572a.removeCallbacks(this.f1576e);
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    private static void a(ao aoVar) {
        ao aoVar2 = f1570j;
        if (aoVar2 != null) {
            aoVar2.c();
        }
        f1570j = aoVar;
        if (aoVar != null) {
            aoVar.b();
        }
    }

    public final boolean onLongClick(View view) {
        this.f1577f = view.getWidth() / 2;
        this.f1578g = view.getHeight() / 2;
        a(true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        long j2;
        int longPressTimeout;
        long j3;
        if (v.y(this.f1572a)) {
            a((ao) null);
            ao aoVar = f1571k;
            if (aoVar != null) {
                aoVar.a();
            }
            f1571k = this;
            this.f1580i = z;
            ap apVar = new ap(this.f1572a.getContext());
            this.f1579h = apVar;
            apVar.a(this.f1572a, this.f1577f, this.f1578g, this.f1580i, this.f1573b);
            this.f1572a.addOnAttachStateChangeListener(this);
            if (this.f1580i) {
                j3 = 2500;
            } else {
                if ((v.m(this.f1572a) & 1) == 1) {
                    j2 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j3 = j2 - ((long) longPressTimeout);
            }
            this.f1572a.removeCallbacks(this.f1576e);
            this.f1572a.postDelayed(this.f1576e, j3);
        }
    }

    private ao(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f1572a = view;
        this.f1573b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = viewConfiguration.getScaledHoverSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f1574c = scaledTouchSlop;
        d();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void a(View view, CharSequence charSequence) {
        ao aoVar = f1570j;
        if (aoVar != null && aoVar.f1572a == view) {
            a((ao) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            ao aoVar2 = f1571k;
            if (aoVar2 != null && aoVar2.f1572a == view) {
                aoVar2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ao(view, charSequence);
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
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
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1579h != null && this.f1580i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) a(this.f1572a.getContext(), "accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                d();
                a();
            }
        } else if (this.f1572a.isEnabled() && this.f1579h == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f1577f) > this.f1574c || Math.abs(y - this.f1578g) > this.f1574c) {
                this.f1577f = x;
                this.f1578g = y;
                a(this);
            }
        }
        return false;
    }
}

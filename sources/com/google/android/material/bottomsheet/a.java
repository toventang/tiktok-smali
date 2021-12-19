package com.google.android.material.bottomsheet;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.h.a.d;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;

public class a extends h {

    /* renamed from: a  reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f52346a;

    /* renamed from: b  reason: collision with root package name */
    private BottomSheetBehavior.a f52347b;

    /* renamed from: g  reason: collision with root package name */
    boolean f52348g;

    /* renamed from: h  reason: collision with root package name */
    boolean f52349h;

    /* renamed from: i  reason: collision with root package name */
    boolean f52350i;

    static {
        Covode.recordClassIndex(32481);
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f52346a;
        if (bottomSheetBehavior != null && bottomSheetBehavior.f52334j == 5) {
            this.f52346a.c(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f52348g != z) {
            this.f52348g = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f52346a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f52332h = z;
            }
        }
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(int i2) {
        super.setContentView(a(i2, null, null));
    }

    @Override // androidx.appcompat.app.h
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f52348g) {
            this.f52348g = true;
        }
        this.f52349h = z;
        this.f52350i = true;
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(a(0, view, null));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r3 = 1
            if (r6 != 0) goto L_0x0017
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r0 = 2130969007(0x7f0401af, float:1.7546684E38)
            boolean r0 = r1.resolveAttribute(r0, r2, r3)
            if (r0 == 0) goto L_0x0029
            int r6 = r2.resourceId
        L_0x0017:
            r4.<init>(r5, r6)
            r4.f52348g = r3
            r4.f52349h = r3
            com.google.android.material.bottomsheet.a$4 r0 = new com.google.android.material.bottomsheet.a$4
            r0.<init>()
            r4.f52347b = r0
            r4.cg_()
            return
        L_0x0029:
            r6 = 2131886530(0x7f1201c2, float:1.9407641E38)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.a.<init>(android.content.Context, int):void");
    }

    @Override // androidx.appcompat.app.h
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(a(0, view, layoutParams));
    }

    private View a(int i2, View view, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(4014);
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.vl, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.af4);
        if (i2 != 0 && view == null) {
            view = com.a.a(getLayoutInflater(), i2, coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(R.id.akq);
        BottomSheetBehavior<FrameLayout> a2 = BottomSheetBehavior.a(frameLayout2);
        this.f52346a = a2;
        a2.o = this.f52347b;
        this.f52346a.f52332h = this.f52348g;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.epv).setOnClickListener(new View.OnClickListener() {
            /* class com.google.android.material.bottomsheet.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32482);
            }

            public final void onClick(View view) {
                if (a.this.f52348g && a.this.isShowing()) {
                    a aVar = a.this;
                    if (!aVar.f52350i) {
                        TypedArray obtainStyledAttributes = aVar.getContext().obtainStyledAttributes(new int[]{16843611});
                        aVar.f52349h = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        aVar.f52350i = true;
                    }
                    if (aVar.f52349h) {
                        a.this.cancel();
                    }
                }
            }
        });
        v.a(frameLayout2, new androidx.core.h.a() {
            /* class com.google.android.material.bottomsheet.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(32483);
            }

            @Override // androidx.core.h.a
            public final void a(View view, d dVar) {
                super.a(view, dVar);
                if (a.this.f52348g) {
                    dVar.a(1048576);
                    dVar.e(true);
                    return;
                }
                dVar.e(false);
            }

            @Override // androidx.core.h.a
            public final boolean a(View view, int i2, Bundle bundle) {
                if (i2 != 1048576 || !a.this.f52348g) {
                    return super.a(view, i2, bundle);
                }
                a.this.cancel();
                return true;
            }
        });
        frameLayout2.setOnTouchListener(new View.OnTouchListener() {
            /* class com.google.android.material.bottomsheet.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(32484);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        MethodCollector.o(4014);
        return frameLayout;
    }
}

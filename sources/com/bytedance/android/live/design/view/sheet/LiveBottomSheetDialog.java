package com.bytedance.android.live.design.view.sheet;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.h.a.d;
import androidx.core.h.v;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.a;
import com.bytedance.android.live.design.app.LifecycleAwareDialog;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;

public class LiveBottomSheetDialog extends LifecycleAwareDialog implements au {

    /* renamed from: a  reason: collision with root package name */
    private CoordinatorLayout f9526a;

    /* renamed from: b  reason: collision with root package name */
    LiveBottomSheetBehavior<FrameLayout> f9527b;

    /* renamed from: c  reason: collision with root package name */
    public FrameLayout f9528c;

    /* renamed from: d  reason: collision with root package name */
    FrameLayout f9529d;

    /* renamed from: e  reason: collision with root package name */
    boolean f9530e;

    /* renamed from: f  reason: collision with root package name */
    boolean f9531f;

    /* renamed from: g  reason: collision with root package name */
    boolean f9532g;

    /* renamed from: h  reason: collision with root package name */
    float f9533h;

    /* renamed from: i  reason: collision with root package name */
    private LiveBottomSheetBehavior.a f9534i;

    static {
        Covode.recordClassIndex(4834);
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final LiveBottomSheetBehavior<FrameLayout> b() {
        if (this.f9527b == null) {
            c();
        }
        return this.f9527b;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        LiveBottomSheetBehavior<FrameLayout> liveBottomSheetBehavior = this.f9527b;
        if (liveBottomSheetBehavior != null && liveBottomSheetBehavior.n == 5) {
            this.f9527b.c(4);
        }
    }

    private FrameLayout c() {
        MethodCollector.i(1581);
        if (this.f9528c == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.ajp, null);
            this.f9528c = frameLayout;
            this.f9526a = (CoordinatorLayout) frameLayout.findViewById(R.id.af4);
            FrameLayout frameLayout2 = (FrameLayout) this.f9528c.findViewById(R.id.akq);
            this.f9529d = frameLayout2;
            LiveBottomSheetBehavior<FrameLayout> a2 = LiveBottomSheetBehavior.a(frameLayout2);
            this.f9527b = a2;
            a2.a(this.f9534i);
            this.f9527b.b(this.f9530e);
            this.f9528c.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                /* class com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(4835);
                }

                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    int b2;
                    LiveBottomSheetDialog liveBottomSheetDialog = LiveBottomSheetDialog.this;
                    if (liveBottomSheetDialog.getWindow() != null && (b2 = liveBottomSheetDialog.f9527b.q - liveBottomSheetDialog.f9527b.b()) > 0) {
                        liveBottomSheetDialog.getWindow().setDimAmount((((float) (liveBottomSheetDialog.f9527b.q - liveBottomSheetDialog.f9529d.getTop())) / ((float) b2)) * liveBottomSheetDialog.f9533h);
                    }
                    LiveBottomSheetDialog.this.f9528c.removeOnLayoutChangeListener(this);
                }
            });
        }
        FrameLayout frameLayout3 = this.f9528c;
        MethodCollector.o(1581);
        return frameLayout3;
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(int i2) {
        super.setContentView(a(i2, null, null));
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f9530e != z) {
            this.f9530e = z;
            LiveBottomSheetBehavior<FrameLayout> liveBottomSheetBehavior = this.f9527b;
            if (liveBottomSheetBehavior != null) {
                liveBottomSheetBehavior.b(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f9530e) {
            this.f9530e = true;
        }
        this.f9531f = z;
        this.f9532g = true;
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(a(0, view, null));
    }

    @Override // androidx.appcompat.app.h
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.setStatusBarColor(0);
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 23) {
                    window.addFlags(67108864);
                }
            }
            window.setLayout(-1, -1);
            int i2 = getContext().getResources().getConfiguration().orientation;
            int i3 = R.style.f160048j;
            if (i2 == 1) {
                i3 = R.style.f160047i;
            } else {
                int i4 = Build.VERSION.SDK_INT;
                if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                    i3 = R.style.f160049k;
                }
            }
            window.setWindowAnimations(i3);
        }
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842802, typedValue, true);
        this.f9533h = typedValue.getFloat();
    }

    @Override // androidx.appcompat.app.h
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(a(0, view, layoutParams));
    }

    private View a(int i2, View view, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(1594);
        c();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f9528c.findViewById(R.id.af4);
        if (i2 != 0 && view == null) {
            view = a.a(getLayoutInflater(), i2, coordinatorLayout, false);
        }
        this.f9529d.removeAllViews();
        if (layoutParams == null) {
            this.f9529d.addView(view, -1, -1);
        } else {
            this.f9529d.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.epv).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog.AnonymousClass2 */

            static {
                Covode.recordClassIndex(4836);
            }

            public final void onClick(View view) {
                if (LiveBottomSheetDialog.this.f9530e && LiveBottomSheetDialog.this.isShowing()) {
                    LiveBottomSheetDialog liveBottomSheetDialog = LiveBottomSheetDialog.this;
                    if (!liveBottomSheetDialog.f9532g) {
                        TypedArray obtainStyledAttributes = liveBottomSheetDialog.getContext().obtainStyledAttributes(new int[]{16843611});
                        liveBottomSheetDialog.f9531f = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        liveBottomSheetDialog.f9532g = true;
                    }
                    if (liveBottomSheetDialog.f9531f) {
                        LiveBottomSheetDialog.this.cancel();
                    }
                }
            }
        });
        v.a(this.f9529d, new androidx.core.h.a() {
            /* class com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog.AnonymousClass3 */

            static {
                Covode.recordClassIndex(4837);
            }

            @Override // androidx.core.h.a
            public final void a(View view, d dVar) {
                super.a(view, dVar);
                if (LiveBottomSheetDialog.this.f9530e) {
                    dVar.a(1048576);
                    dVar.e(true);
                    return;
                }
                dVar.e(false);
            }

            @Override // androidx.core.h.a
            public final boolean a(View view, int i2, Bundle bundle) {
                if (i2 != 1048576 || !LiveBottomSheetDialog.this.f9530e) {
                    return super.a(view, i2, bundle);
                }
                LiveBottomSheetDialog.this.cancel();
                return true;
            }
        });
        this.f9529d.setOnTouchListener(new View.OnTouchListener() {
            /* class com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog.AnonymousClass4 */

            static {
                Covode.recordClassIndex(4838);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        FrameLayout frameLayout = this.f9528c;
        MethodCollector.o(1594);
        return frameLayout;
    }
}

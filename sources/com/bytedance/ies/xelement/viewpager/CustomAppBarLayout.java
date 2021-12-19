package com.bytedance.ies.xelement.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.Field;

@CoordinatorLayout.c(a = Behavior.class)
public class CustomAppBarLayout extends AppBarLayout implements CoordinatorLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f37451a = true;

    static {
        Covode.recordClassIndex(22527);
    }

    public static class Behavior extends AppBarLayout.Behavior {

        /* renamed from: c  reason: collision with root package name */
        private boolean f37452c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f37453d;

        static {
            Covode.recordClassIndex(22528);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            return a(coordinatorLayout, (AppBarLayout) view, view2, view3, i2, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
        public final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i2, int i3) {
            a(appBarLayout);
            return super.a(coordinatorLayout, appBarLayout, view, view2, i2, i3);
        }

        public Behavior() {
            d();
        }

        private void d() {
            a(new AppBarLayout.BaseBehavior.a() {
                /* class com.bytedance.ies.xelement.viewpager.CustomAppBarLayout.Behavior.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22529);
                }

                @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.a
                public final boolean a(AppBarLayout appBarLayout) {
                    if (!(appBarLayout instanceof CustomAppBarLayout) || ((CustomAppBarLayout) appBarLayout).f37451a || ((long) (Behavior.this.c() / appBarLayout.getTotalScrollRange())) > -1) {
                        return true;
                    }
                    return false;
                }
            });
        }

        private Field e() {
            Class<? super Object> cls;
            Class<? super Object> superclass = getClass().getSuperclass();
            if (superclass != null) {
                try {
                    cls = superclass.getSuperclass();
                } catch (NoSuchFieldException e2) {
                    e2.printStackTrace();
                    Class<? super Object> superclass2 = superclass.getSuperclass().getSuperclass();
                    if (superclass2 != null) {
                        return superclass2.getDeclaredField("flingRunnable");
                    }
                }
            } else {
                cls = null;
            }
            if (cls != null) {
                return cls.getDeclaredField("mFlingRunnable");
            }
            return null;
        }

        private Field f() {
            Class<? super Object> cls;
            Class<? super Object> superclass = getClass().getSuperclass();
            if (superclass != null) {
                try {
                    cls = superclass.getSuperclass();
                } catch (NoSuchFieldException e2) {
                    e2.printStackTrace();
                    Class<? super Object> superclass2 = superclass.getSuperclass().getSuperclass();
                    if (superclass2 != null) {
                        return superclass2.getDeclaredField("scroller");
                    }
                }
            } else {
                cls = null;
            }
            if (cls != null) {
                return cls.getDeclaredField("mScroller");
            }
            return null;
        }

        private void a(AppBarLayout appBarLayout) {
            try {
                Field e2 = e();
                if (e2 != null) {
                    e2.setAccessible(true);
                    Runnable runnable = (Runnable) e2.get(this);
                    if (runnable != null) {
                        appBarLayout.removeCallbacks(runnable);
                        e2.set(this, null);
                    }
                }
                Field f2 = f();
                if (f2 != null) {
                    f2.setAccessible(true);
                    OverScroller overScroller = (OverScroller) f2.get(this);
                    if (overScroller != null && !overScroller.isFinished()) {
                        overScroller.abortAnimation();
                    }
                }
            } catch (NoSuchFieldException e3) {
                e3.printStackTrace();
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            d();
        }

        /* access modifiers changed from: private */
        public boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
            this.f37453d = this.f37452c;
            if (motionEvent.getActionMasked() == 0) {
                a(appBarLayout);
            }
            return super.a(coordinatorLayout, (View) appBarLayout, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public final /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
            a(coordinatorLayout, (AppBarLayout) view, view2, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
        public final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
            super.a(coordinatorLayout, appBarLayout, view, i2);
            this.f37452c = false;
            this.f37453d = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public final /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
            a(coordinatorLayout, (AppBarLayout) view, view2, i2, i3, iArr, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
        public final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int[] iArr, int i4) {
            if (i4 == 1) {
                this.f37452c = true;
            }
            if (!this.f37453d) {
                super.a(coordinatorLayout, appBarLayout, view, i2, i3, iArr, i4);
            }
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public final /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6) {
            a(coordinatorLayout, (AppBarLayout) view, view2, i2, i3, i4, i5, i6);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
        public final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int i4, int i5, int i6) {
            if (!this.f37453d) {
                try {
                    super.a(coordinatorLayout, appBarLayout, view, i2, i3, i4, i5, i6);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public CoordinatorLayout.b getBehavior() {
        return new Behavior();
    }

    public void setIsEnableTabbarDrag(boolean z) {
        this.f37451a = z;
    }

    public CustomAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

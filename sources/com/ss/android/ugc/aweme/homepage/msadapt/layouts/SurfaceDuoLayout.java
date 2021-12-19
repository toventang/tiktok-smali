package com.ss.android.ugc.aweme.homepage.msadapt.layouts;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.homepage.msadapt.layouts.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class SurfaceDuoLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private c f99210a;

    /* renamed from: b  reason: collision with root package name */
    private final a f99211b;

    static {
        Covode.recordClassIndex(63212);
    }

    public SurfaceDuoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final a getConfig() {
        return this.f99211b;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f99212a;

        /* renamed from: b  reason: collision with root package name */
        public int f99213b;

        /* renamed from: c  reason: collision with root package name */
        public int f99214c;

        /* renamed from: d  reason: collision with root package name */
        public int f99215d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f99216e;

        /* renamed from: f  reason: collision with root package name */
        public int f99217f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f99218g;

        static {
            Covode.recordClassIndex(63213);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f99212a == aVar.f99212a && this.f99213b == aVar.f99213b && this.f99214c == aVar.f99214c && this.f99215d == aVar.f99215d && this.f99216e == aVar.f99216e && this.f99217f == aVar.f99217f && this.f99218g == aVar.f99218g;
        }

        public final int hashCode() {
            int i2 = ((((((this.f99212a * 31) + this.f99213b) * 31) + this.f99214c) * 31) + this.f99215d) * 31;
            boolean z = this.f99216e;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (((i2 + i4) * 31) + this.f99217f) * 31;
            if (!this.f99218g) {
                i3 = 0;
            }
            return i7 + i3;
        }

        public final String toString() {
            return "Config(singleScreenLayoutId=" + this.f99212a + ", dualScreenStartLayoutId=" + this.f99213b + ", dualScreenEndLayoutId=" + this.f99214c + ", dualPortraitSingleLayoutId=" + this.f99215d + ", isDualPortraitSingleContainer=" + this.f99216e + ", dualLandscapeSingleLayoutId=" + this.f99217f + ", isDualLandscapeSingleContainer=" + this.f99218g + ")";
        }

        private a() {
            this.f99212a = -1;
            this.f99213b = -1;
            this.f99214c = -1;
            this.f99215d = -1;
            this.f99216e = false;
            this.f99217f = -1;
            this.f99218g = false;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurfaceDuoLayout f99219a;

        /* renamed from: b  reason: collision with root package name */
        private final int f99220b = 84;

        /* renamed from: c  reason: collision with root package name */
        private final a f99221c;

        /* renamed from: d  reason: collision with root package name */
        private final a f99222d;

        static {
            Covode.recordClassIndex(63214);
        }

        private final void b() {
            MethodCollector.i(4451);
            FrameLayout a2 = a(this.f99222d);
            View inflate = LayoutInflater.from(this.f99219a.getContext()).inflate(this.f99221c.f99213b, (ViewGroup) null);
            View inflate2 = LayoutInflater.from(this.f99219a.getContext()).inflate(this.f99221c.f99214c, (ViewGroup) null);
            Resources resources = this.f99219a.getResources();
            l.b(resources, "");
            int i2 = resources.getConfiguration().orientation;
            if (i2 == 1) {
                this.f99219a.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                l.b(inflate, "");
                inflate.setLayoutParams(layoutParams);
                l.b(inflate2, "");
                inflate2.setLayoutParams(layoutParams);
            } else if (i2 == 2) {
                this.f99219a.setOrientation(0);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1, 1.0f);
                l.b(inflate, "");
                inflate.setLayoutParams(layoutParams2);
                l.b(inflate2, "");
                inflate2.setLayoutParams(layoutParams2);
            }
            this.f99219a.addView(inflate);
            this.f99219a.addView(a2);
            this.f99219a.addView(inflate2);
            MethodCollector.o(4451);
        }

        private final void a() {
            View inflate;
            MethodCollector.i(4383);
            ConstraintLayout constraintLayout = new ConstraintLayout(this.f99219a.getContext());
            constraintLayout.setId(View.generateViewId());
            constraintLayout.setLayoutParams(new ConstraintLayout.a(-1, -1));
            a(a(this.f99222d), constraintLayout);
            Resources resources = this.f99219a.getResources();
            l.b(resources, "");
            int i2 = resources.getConfiguration().orientation;
            if (i2 == 1) {
                inflate = LayoutInflater.from(this.f99219a.getContext()).inflate(this.f99221c.f99217f, (ViewGroup) null);
                inflate.setId(View.generateViewId());
                inflate.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
                l.b(inflate, "");
            } else if (i2 != 2) {
                inflate = new FrameLayout(this.f99219a.getContext());
            } else {
                inflate = LayoutInflater.from(this.f99219a.getContext()).inflate(this.f99221c.f99215d, (ViewGroup) null);
                inflate.setId(View.generateViewId());
                inflate.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
                l.b(inflate, "");
            }
            a(inflate, constraintLayout);
            this.f99219a.addView(constraintLayout);
            MethodCollector.o(4383);
        }

        private final FrameLayout a(a aVar) {
            MethodCollector.i(4326);
            FrameLayout frameLayout = new FrameLayout(this.f99219a.getContext());
            frameLayout.setId(View.generateViewId());
            Resources resources = this.f99219a.getResources();
            l.b(resources, "");
            int i2 = resources.getConfiguration().orientation;
            if (i2 == 1) {
                frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f99220b));
            } else if (i2 == 2) {
                frameLayout.setLayoutParams(new LinearLayout.LayoutParams(this.f99220b, -1));
            }
            int i3 = b.f99225b[aVar.ordinal()];
            if (i3 == 1) {
                frameLayout.setBackground(new ColorDrawable(androidx.core.content.b.c(this.f99219a.getContext(), R.color.a2)));
            } else if (i3 == 2) {
                frameLayout.setBackground(new ColorDrawable(androidx.core.content.b.c(this.f99219a.getContext(), R.color.f159928l)));
            }
            MethodCollector.o(4326);
            return frameLayout;
        }

        private static void a(View view, ConstraintLayout constraintLayout) {
            constraintLayout.addView(view);
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.a(constraintLayout);
            bVar.a(view.getId(), 3, 0, 3, 0);
            bVar.a(view.getId(), 1, 0, 1, 0);
            bVar.a(view.getId(), 2, 0, 2, 0);
            bVar.a(view.getId(), 4, 0, 4, 0);
            bVar.b(constraintLayout);
        }

        public b(SurfaceDuoLayout surfaceDuoLayout, a aVar, com.ss.android.ugc.aweme.homepage.msadapt.core.b bVar, a aVar2) {
            l.d(aVar, "");
            l.d(bVar, "");
            l.d(aVar2, "");
            this.f99219a = surfaceDuoLayout;
            MethodCollector.i(4469);
            this.f99221c = aVar;
            this.f99222d = aVar2;
            int i2 = b.f99224a[bVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    surfaceDuoLayout.setWeightSum(2.0f);
                    surfaceDuoLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    Resources resources = surfaceDuoLayout.getResources();
                    l.b(resources, "");
                    if (resources.getConfiguration().orientation != 2) {
                        Resources resources2 = surfaceDuoLayout.getResources();
                        l.b(resources2, "");
                        if (resources2.getConfiguration().orientation == 1) {
                            if (aVar.f99217f != -1) {
                                a();
                                MethodCollector.o(4469);
                                return;
                            }
                            b();
                        }
                    } else if (aVar.f99215d != -1) {
                        a();
                        MethodCollector.o(4469);
                        return;
                    } else {
                        b();
                        MethodCollector.o(4469);
                        return;
                    }
                }
                MethodCollector.o(4469);
                return;
            }
            View inflate = LayoutInflater.from(surfaceDuoLayout.getContext()).inflate(aVar.f99212a, (ViewGroup) null);
            l.b(inflate, "");
            inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            surfaceDuoLayout.setOrientation(1);
            surfaceDuoLayout.addView(inflate);
            MethodCollector.o(4469);
        }
    }

    private void a(a aVar) {
        Context context = getContext();
        l.b(context, "");
        this.f99210a = new c(context, this, aVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r1 != 3) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r13) {
        /*
        // Method dump skipped, instructions count: 432
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout.onConfigurationChanged(android.content.res.Configuration):void");
    }

    private final TypedArray a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.s5, R.attr.s6, R.attr.s7, R.attr.s8, R.attr.xo, R.attr.xp, R.attr.acc, R.attr.acd, R.attr.ace, R.attr.acf, R.attr.acg, R.attr.act, R.attr.aji, R.attr.ajj}, 0, 0);
        l.b(obtainStyledAttributes, "");
        try {
            this.f99211b.f99212a = obtainStyledAttributes.getResourceId(11, -1);
            this.f99211b.f99213b = obtainStyledAttributes.getResourceId(3, -1);
            this.f99211b.f99214c = obtainStyledAttributes.getResourceId(2, -1);
            this.f99211b.f99215d = obtainStyledAttributes.getResourceId(1, -1);
            this.f99211b.f99216e = obtainStyledAttributes.getBoolean(5, false);
            this.f99211b.f99217f = obtainStyledAttributes.getResourceId(0, -1);
            this.f99211b.f99218g = obtainStyledAttributes.getBoolean(4, false);
            return obtainStyledAttributes;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void a(TypedArray typedArray, a aVar) {
        boolean z;
        Integer valueOf = Integer.valueOf(typedArray.getResourceId(10, -1));
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z && valueOf != null) {
            aVar.f99212a = valueOf.intValue();
        }
        Integer valueOf2 = Integer.valueOf(typedArray.getResourceId(9, -1));
        if (!(valueOf2.intValue() == -1 || valueOf2 == null)) {
            aVar.f99213b = valueOf2.intValue();
        }
        Integer valueOf3 = Integer.valueOf(typedArray.getResourceId(8, -1));
        if (!(valueOf3.intValue() == -1 || valueOf3 == null)) {
            aVar.f99214c = valueOf3.intValue();
        }
        Integer valueOf4 = Integer.valueOf(typedArray.getInteger(7, -1));
        if (!(valueOf4.intValue() == -1 || valueOf4 == null)) {
            aVar.f99215d = valueOf4.intValue();
        }
        Integer valueOf5 = Integer.valueOf(typedArray.getInteger(6, -1));
        if (!(valueOf5.intValue() == -1 || valueOf5 == null)) {
            aVar.f99217f = valueOf5.intValue();
        }
        int resourceId = typedArray.getResourceId(13, com.ss.android.ugc.aweme.homepage.msadapt.core.b.SINGLE_SCREEN.ordinal());
        com.ss.android.ugc.aweme.homepage.msadapt.core.b[] values = com.ss.android.ugc.aweme.homepage.msadapt.core.b.values();
        for (com.ss.android.ugc.aweme.homepage.msadapt.core.b bVar : values) {
            if (bVar.getId() == resourceId) {
                new b(this, aVar, bVar, a.C2426a.a(typedArray.getResourceId(12, a.BLACK.ordinal())));
                return;
            }
        }
        throw new IllegalArgumentException("The ScreenMode id doesn't exit");
    }

    private /* synthetic */ SurfaceDuoLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, new a((byte) 0));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SurfaceDuoLayout(Context context, AttributeSet attributeSet, a aVar) {
        super(context, attributeSet, 0);
        l.d(context, "");
        l.d(aVar, "");
        MethodCollector.i(7175);
        this.f99211b = aVar;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setGravity(80);
        if (attributeSet != null) {
            TypedArray a2 = a(context, attributeSet);
            if (isInEditMode()) {
                a(a2, aVar);
                MethodCollector.o(7175);
                return;
            }
            a(aVar);
            MethodCollector.o(7175);
            return;
        }
        a(aVar);
        MethodCollector.o(7175);
    }
}

package com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    final int f102600a;

    /* renamed from: b  reason: collision with root package name */
    int f102601b;

    /* renamed from: c  reason: collision with root package name */
    public int f102602c;

    /* renamed from: d  reason: collision with root package name */
    public int f102603d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f102604e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f102605f;

    /* renamed from: g  reason: collision with root package name */
    public final View f102606g;

    /* renamed from: h  reason: collision with root package name */
    final View f102607h;

    /* renamed from: i  reason: collision with root package name */
    public final ViewGroup f102608i;

    /* renamed from: j  reason: collision with root package name */
    public final d f102609j;

    /* renamed from: k  reason: collision with root package name */
    public long f102610k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f102611l;

    /* renamed from: m  reason: collision with root package name */
    public View f102612m;
    public a n;
    public boolean o;
    public boolean p;
    public Runnable q;
    public ViewGroup.OnHierarchyChangeListener r;
    private Runnable s;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f102617a;

        /* renamed from: b  reason: collision with root package name */
        public int f102618b;

        /* renamed from: c  reason: collision with root package name */
        public int f102619c;

        /* renamed from: d  reason: collision with root package name */
        public int f102620d;

        /* renamed from: e  reason: collision with root package name */
        public View f102621e;

        /* renamed from: f  reason: collision with root package name */
        public View f102622f;

        /* renamed from: g  reason: collision with root package name */
        public ViewGroup f102623g;

        /* renamed from: h  reason: collision with root package name */
        public d f102624h;

        /* renamed from: i  reason: collision with root package name */
        public long f102625i = -1;

        /* renamed from: j  reason: collision with root package name */
        public boolean f102626j;

        /* renamed from: k  reason: collision with root package name */
        public a f102627k;

        static {
            Covode.recordClassIndex(65701);
        }
    }

    static {
        Covode.recordClassIndex(65696);
    }

    public final void a(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        this.f102605f.postDelayed(this.s, j2);
    }

    private b(View view, View view2, View view3, d dVar, int i2, int i3, int i4, int i5) {
        String str;
        this.q = new Runnable() {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(65697);
            }

            /* JADX WARNING: Removed duplicated region for block: B:118:0x022a  */
            /* JADX WARNING: Removed duplicated region for block: B:119:0x0232  */
            /* JADX WARNING: Removed duplicated region for block: B:130:0x0258  */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x00c2  */
            /* JADX WARNING: Removed duplicated region for block: B:53:0x00e8 A[ADDED_TO_REGION] */
            /* JADX WARNING: Removed duplicated region for block: B:61:0x0100  */
            /* JADX WARNING: Removed duplicated region for block: B:69:0x0111  */
            /* JADX WARNING: Removed duplicated region for block: B:71:0x0115  */
            /* JADX WARNING: Removed duplicated region for block: B:74:0x012c  */
            /* JADX WARNING: Removed duplicated region for block: B:77:0x0144  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 674
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b.AnonymousClass1.run():void");
            }
        };
        this.s = new Runnable() {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(65698);
            }

            public final void run() {
                MethodCollector.i(6242);
                if (b.this.p) {
                    MethodCollector.o(6242);
                    return;
                }
                if (b.this.f102604e) {
                    b.this.f102609j.a(b.this.f102608i, b.this);
                    if (b.this.f102611l) {
                        b.this.f102608i.removeView(b.this.f102612m);
                    }
                    b.this.f102604e = false;
                    b.this.o = false;
                }
                MethodCollector.o(6242);
            }
        };
        this.r = new ViewGroup.OnHierarchyChangeListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(65699);
            }

            public final void onChildViewAdded(View view, View view2) {
            }

            public final void onChildViewRemoved(View view, View view2) {
                if (view == b.this.f102608i && view2 == b.this.f102606g) {
                    b.this.f102608i.setOnHierarchyChangeListener(null);
                    b.this.o = false;
                }
            }
        };
        this.f102606g = view;
        this.f102607h = view2;
        this.f102609j = dVar == null ? c.f102628a : dVar;
        if (view2 != null) {
            view3 = view3 == null ? view2.getRootView() : view3;
            if ((view3 instanceof FrameLayout) || (view3 instanceof RelativeLayout)) {
                this.f102608i = (ViewGroup) view3;
                this.f102610k = -1;
                this.f102600a = i2;
                this.f102601b = i3;
                this.f102602c = i4;
                this.f102603d = i5;
                this.f102604e = false;
                this.f102611l = false;
                this.o = false;
                this.p = false;
                this.f102605f = new Handler(Looper.getMainLooper());
                return;
            }
            str = "canvasView is not a FrameLayout nor a RelativeLayout!!";
        } else {
            str = "anchorView is null!!";
        }
        throw new RuntimeException("Invalid bubble args : ".concat(str));
    }

    public /* synthetic */ b(View view, View view2, View view3, d dVar, int i2, int i3, int i4, int i5, byte b2) {
        this(view, view2, view3, dVar, i2, i3, i4, i5);
    }
}

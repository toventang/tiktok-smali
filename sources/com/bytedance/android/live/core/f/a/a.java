package com.bytedance.android.live.core.f.a;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.h;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.drawee.c.d;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.e;
import com.facebook.drawee.view.b;
import com.facebook.imagepipeline.o.c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class a {
    private ColorFilter A;
    private List<Drawable> B;
    private Drawable C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;

    /* renamed from: a  reason: collision with root package name */
    public b<com.facebook.drawee.h.b> f9016a;

    /* renamed from: b  reason: collision with root package name */
    public d f9017b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f9018c;

    /* renamed from: d  reason: collision with root package name */
    public ImageModel f9019d;

    /* renamed from: e  reason: collision with root package name */
    public q.b f9020e;

    /* renamed from: f  reason: collision with root package name */
    public PointF f9021f;

    /* renamed from: g  reason: collision with root package name */
    public e f9022g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9023h;

    /* renamed from: i  reason: collision with root package name */
    private Context f9024i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9025j;

    /* renamed from: k  reason: collision with root package name */
    private View$OnAttachStateChangeListenerC0134a f9026k;

    /* renamed from: l  reason: collision with root package name */
    private com.facebook.imagepipeline.o.d f9027l;

    /* renamed from: m  reason: collision with root package name */
    private Uri f9028m;
    private com.facebook.imagepipeline.common.d n;
    private float o;
    private boolean p;
    private int q;
    private Drawable r;
    private Drawable s;
    private Drawable t;
    private Drawable u;
    private Drawable v;
    private q.b w;
    private q.b x;
    private q.b y;
    private q.b z;

    static {
        Covode.recordClassIndex(4595);
    }

    public final a a(String str) {
        this.f9018c = Uri.parse(str);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0208, code lost:
        if (r7 != -1) goto L_0x01e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r9) {
        /*
        // Method dump skipped, instructions count: 534
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.f.a.a.a(android.view.View):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.core.f.a.a$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9029a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.f.a.a.AnonymousClass1.<clinit>():void");
        }
    }

    public final a a() {
        if (this.f9022g == null) {
            this.f9022g = new e();
        }
        this.f9022g.f47476b = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.core.f.a.a$a  reason: collision with other inner class name */
    public class View$OnAttachStateChangeListenerC0134a implements View.OnAttachStateChangeListener, View.OnTouchListener {
        static {
            Covode.recordClassIndex(4597);
        }

        private View$OnAttachStateChangeListenerC0134a() {
        }

        public final void onViewAttachedToWindow(View view) {
            if (a.this.f9016a != null) {
                a.this.f9016a.b();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (a.this.f9016a != null) {
                a.this.f9016a.c();
            }
        }

        /* synthetic */ View$OnAttachStateChangeListenerC0134a(a aVar, byte b2) {
            this();
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (a.this.f9016a == null || !a.this.f9016a.a(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    public static a a(Context context) {
        if (context != null) {
            return new a(context);
        }
        throw new IllegalArgumentException("appContext == null");
    }

    private static boolean b(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.isAttachedToWindow();
    }

    private a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f9024i = applicationContext;
        this.f9026k = null;
        this.o = 0.0f;
        this.p = true;
        this.q = 300;
        this.r = null;
        this.w = com.facebook.drawee.f.b.f47460a;
        this.s = null;
        this.x = com.facebook.drawee.f.b.f47460a;
        this.t = null;
        this.y = com.facebook.drawee.f.b.f47460a;
        this.u = null;
        this.z = com.facebook.drawee.f.b.f47460a;
        this.f9020e = com.facebook.drawee.f.b.f47461b;
        this.f9021f = null;
        this.A = null;
        this.v = null;
        this.B = null;
        this.C = null;
        this.f9022g = null;
        this.D = false;
        this.f9023h = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.f9027l = null;
        this.f9017b = null;
        this.f9016a = null;
    }

    public final a a(int i2) {
        this.r = this.f9024i.getResources().getDrawable(i2);
        return this;
    }

    public final a a(ImageView.ScaleType scaleType) {
        this.f9020e = a(scaleType, com.facebook.drawee.f.b.f47461b);
        return this;
    }

    public final a a(File file) {
        this.f9018c = Uri.fromFile(file);
        return this;
    }

    public final a a(int i2, int i3) {
        this.n = new com.facebook.imagepipeline.common.d(i2, i3);
        return this;
    }

    private static com.facebook.imagepipeline.o.b a(Uri uri, com.facebook.imagepipeline.common.d dVar) {
        if (uri == null) {
            return null;
        }
        c a2 = c.a(uri);
        if (dVar != null) {
            a2.f48447d = dVar;
        }
        return a2.a();
    }

    private static q.b a(ImageView.ScaleType scaleType, q.b bVar) {
        switch (AnonymousClass1.f9029a[scaleType.ordinal()]) {
            case 1:
                return q.b.f47440f;
            case 2:
                return q.b.f47442h;
            case 3:
                return q.b.f47441g;
            case 4:
                return q.b.f47438d;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return q.b.f47437c;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return q.b.f47439e;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return q.b.f47436b;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return q.b.f47443i;
            default:
                return bVar;
        }
    }

    private static com.facebook.imagepipeline.o.b[] a(Uri uri, ImageModel imageModel, com.facebook.imagepipeline.common.d dVar, com.facebook.imagepipeline.o.d dVar2) {
        if (uri == null && (imageModel == null || h.a(imageModel.getUrls()))) {
            return new com.facebook.imagepipeline.o.b[0];
        }
        ArrayList arrayList = new ArrayList();
        com.facebook.imagepipeline.o.b a2 = a(uri, dVar);
        if (a2 != null) {
            arrayList.add(a2);
        }
        if (imageModel != null && !h.a(imageModel.getUrls())) {
            c cVar = new c();
            for (String str : imageModel.getUrls()) {
                if (!m.a(str)) {
                    c a3 = c.a(Uri.parse(str));
                    if (dVar2 != null) {
                        a3.f48454k = dVar2;
                    }
                    if (dVar != null) {
                        a3.f48447d = dVar;
                    }
                    cVar.a(a3);
                    arrayList.add(a3.a());
                }
            }
        }
        if (arrayList.size() == 0) {
            return new com.facebook.imagepipeline.o.b[0];
        }
        return (com.facebook.imagepipeline.o.b[]) arrayList.toArray(new com.facebook.imagepipeline.o.b[arrayList.size()]);
    }
}

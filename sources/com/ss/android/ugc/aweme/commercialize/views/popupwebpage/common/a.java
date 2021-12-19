package com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.i;
import h.f.b.l;

public final class a {

    /* renamed from: j  reason: collision with root package name */
    public static final C1735a f76232j = new C1735a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f76233a;

    /* renamed from: b  reason: collision with root package name */
    public int f76234b;

    /* renamed from: c  reason: collision with root package name */
    public int f76235c;

    /* renamed from: d  reason: collision with root package name */
    public int f76236d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f76237e;

    /* renamed from: f  reason: collision with root package name */
    public int f76238f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f76239g;

    /* renamed from: h  reason: collision with root package name */
    public final CommonPopUpWebBottomSheetContainer f76240h;

    /* renamed from: i  reason: collision with root package name */
    public int f76241i;

    static {
        Covode.recordClassIndex(47011);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.a$a  reason: collision with other inner class name */
    public static final class C1735a {
        static {
            Covode.recordClassIndex(47012);
        }

        private C1735a() {
        }

        public /* synthetic */ C1735a(byte b2) {
            this();
        }
    }

    public final void a(int i2) {
        this.f76233a = 0;
        this.f76234b = 0;
        this.f76237e = false;
        this.f76241i = i2;
        if (i2 == 2) {
            this.f76233a = i.a(this.f76239g) - i.b();
        } else if (i2 == 3) {
            double a2 = (double) i.a(this.f76239g);
            Double.isNaN(a2);
            this.f76233a = (int) (a2 * 0.7316341829085458d);
            this.f76234b = i.a(this.f76239g) - i.b();
        }
    }

    public final void a(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        int i2 = this.f76241i;
        if (i2 == 2) {
            this.f76233a = i.a(this.f76239g) - i.b();
        } else if (i2 == 3) {
            l.d(motionEvent, "");
            if (!this.f76237e) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f76235c = (int) motionEvent.getX();
                    this.f76236d = (int) motionEvent.getY();
                } else if (action == 1 && Math.abs(motionEvent.getX() - ((float) this.f76235c)) < 100.0f && Math.abs(motionEvent.getY() - ((float) this.f76236d)) < 100.0f) {
                    this.f76240h.a();
                    this.f76237e = true;
                }
            }
        }
    }

    private a(Context context, CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer) {
        l.d(context, "");
        l.d(commonPopUpWebBottomSheetContainer, "");
        this.f76239g = context;
        this.f76240h = commonPopUpWebBottomSheetContainer;
        this.f76241i = 2;
        a(2);
    }

    public /* synthetic */ a(Context context, CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer, byte b2) {
        this(context, commonPopUpWebBottomSheetContainer);
    }
}

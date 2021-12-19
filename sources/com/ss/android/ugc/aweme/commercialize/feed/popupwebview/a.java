package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;

public final class a {

    /* renamed from: j  reason: collision with root package name */
    public static final C1677a f74362j = new C1677a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f74363a;

    /* renamed from: b  reason: collision with root package name */
    public int f74364b;

    /* renamed from: c  reason: collision with root package name */
    public int f74365c;

    /* renamed from: d  reason: collision with root package name */
    public int f74366d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f74367e;

    /* renamed from: f  reason: collision with root package name */
    public int f74368f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f74369g;

    /* renamed from: h  reason: collision with root package name */
    public final AdPopUpWebBottomSheetContainer f74370h;

    /* renamed from: i  reason: collision with root package name */
    public int f74371i;

    static {
        Covode.recordClassIndex(45883);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.a$a  reason: collision with other inner class name */
    public static final class C1677a {
        static {
            Covode.recordClassIndex(45884);
        }

        private C1677a() {
        }

        public /* synthetic */ C1677a(byte b2) {
            this();
        }
    }

    public final boolean a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && awemeRawAd.getWebviewType() == 1 && this.f74371i == 2) {
            return true;
        }
        return false;
    }

    public final boolean b(AwemeRawAd awemeRawAd) {
        int i2;
        if (awemeRawAd != null && awemeRawAd.getProfileWithWebview() == 1 && ((i2 = this.f74368f) == 7 || i2 == 8 || this.f74371i == 3)) {
            return true;
        }
        return false;
    }

    public final void a(int i2) {
        this.f74363a = 0;
        this.f74364b = 0;
        this.f74367e = false;
        this.f74371i = i2;
        if (i2 == 2) {
            this.f74363a = i.a(this.f74369g) - i.b();
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    this.f74363a = (int) n.b(this.f74369g, 64.0f);
                    this.f74364b = i.a(this.f74369g) - i.b();
                    return;
                } else if (i2 != 6) {
                    return;
                }
            }
            this.f74363a = (int) n.b(this.f74369g, 64.0f);
            this.f74364b = i.a(this.f74369g) - i.b();
        } else {
            double a2 = (double) i.a(this.f74369g);
            Double.isNaN(a2);
            this.f74363a = (int) (a2 * 0.7316341829085458d);
            this.f74364b = i.a(this.f74369g) - i.b();
        }
    }

    public final void a(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        int i2 = this.f74371i;
        if (i2 == 2) {
            this.f74363a = i.a(this.f74369g) - i.b();
        } else if (i2 == 3 || i2 == 5) {
            l.d(motionEvent, "");
            if (!this.f74367e) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f74365c = (int) motionEvent.getX();
                    this.f74366d = (int) motionEvent.getY();
                } else if (action == 1 && Math.abs(motionEvent.getX() - ((float) this.f74365c)) < 100.0f && Math.abs(motionEvent.getY() - ((float) this.f74366d)) < 100.0f) {
                    this.f74370h.a();
                    this.f74367e = true;
                }
            }
        }
    }

    private a(Context context, AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer) {
        l.d(context, "");
        l.d(adPopUpWebBottomSheetContainer, "");
        this.f74369g = context;
        this.f74370h = adPopUpWebBottomSheetContainer;
        this.f74371i = 2;
        a(2);
    }

    public /* synthetic */ a(Context context, AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer, byte b2) {
        this(context, adPopUpWebBottomSheetContainer);
    }
}

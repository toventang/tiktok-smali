package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.lancet.k;
import com.ss.android.ugc.aweme.lego.p;
import com.zhiliaoapp.musically.R;

public class SmartAvatarBorderView extends SmartCircleImageView {

    /* renamed from: e  reason: collision with root package name */
    private static boolean f68318e;

    /* renamed from: d  reason: collision with root package name */
    private UrlModel f68319d;

    static {
        Covode.recordClassIndex(42063);
    }

    @Override // com.facebook.drawee.view.c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, com.bytedance.lighten.loader.SmartCircleImageView
    public final void a() {
        super.a();
        ((a) getHierarchy()).a(2131232324, q.b.f47436b);
        if (((a) getHierarchy()).f47454a != null) {
            ((a) getHierarchy()).f47454a.c(n.b(getContext(), 1.0f));
            ((a) getHierarchy()).f47454a.f47480f = b.c(getContext(), R.color.f159928l);
            ((a) getHierarchy()).f47454a.d(n.b(getContext(), 1.0f));
        }
    }

    public SmartAvatarBorderView(Context context) {
        super(context);
    }

    public static void setOpt(boolean z) {
        f68318e = z;
    }

    public void setBorderColor(int i2) {
        if (((a) getHierarchy()).f47454a != null) {
            ((a) getHierarchy()).f47454a.f47480f = b.c(getContext(), i2);
        }
    }

    public void setBorderWidth(int i2) {
        if (((a) getHierarchy()).f47454a != null) {
            ((a) getHierarchy()).f47454a.c(n.b(getContext(), (float) i2));
        }
    }

    public void setBorderWidthPx(int i2) {
        if (((a) getHierarchy()).f47454a != null) {
            ((a) getHierarchy()).f47454a.c((float) i2);
        }
    }

    public void setRoundingParamsPadding(float f2) {
        if (((a) getHierarchy()).f47454a != null) {
            ((a) getHierarchy()).f47454a.d(f2);
        }
    }

    public SmartAvatarBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(final UrlModel urlModel, final int[] iArr, final int i2, final int i3, final String str) {
        if (this.f68319d != urlModel) {
            this.f68319d = urlModel;
            if (f68318e) {
                p.f107614a.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView.AnonymousClass1 */

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ boolean f68325f = true;

                    static {
                        Covode.recordClassIndex(42064);
                    }

                    public final void run() {
                        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
                        int[] iArr = iArr;
                        if (iArr != null) {
                            a2.b(iArr);
                        }
                        v a3 = a2.a(i2, i3).a(str);
                        a3.K = this.f68325f;
                        a3.E = SmartAvatarBorderView.this;
                        a3.c();
                    }
                });
                return;
            }
            v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
            if (iArr != null) {
                a2.b(iArr);
            }
            v a3 = a2.a(i2, i3).a(str);
            a3.K = true;
            a3.E = this;
            a3.c();
        }
    }
}

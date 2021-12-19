package com.bytedance.android.live.liveinteract.multiguest.g.c;

import android.widget.FrameLayout;
import com.bytedance.android.live.core.f.f;
import com.bytedance.android.live.liveinteract.api.a.c;
import com.bytedance.android.live.liveinteract.api.b.j;
import com.bytedance.android.live.liveinteract.api.c.e;
import com.bytedance.android.live.liveinteract.api.i;
import com.bytedance.android.live.liveinteract.platform.common.g.v;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.chatroom.model.c.a;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdk.utils.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f11290a;

    static {
        Covode.recordClassIndex(6075);
    }

    g(b bVar) {
        this.f11290a = bVar;
    }

    public final void run() {
        int i2;
        a aVar;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2;
        b bVar = this.f11290a;
        int size = bVar.f11266d.size();
        int i3 = 0;
        float f2 = 2.14748365E9f;
        for (int i4 = 0; i4 < size; i4++) {
            com.bytedance.android.live.liveinteract.multiguest.g.b.a aVar3 = bVar.f11266d.get(i4);
            if (aVar3 != null && aVar3.getY() < f2) {
                f2 = aVar3.getY();
            }
        }
        if (2.14748365E9f == f2 || f2 < 10.0f) {
            i2 = bVar.f11269g;
        } else {
            i2 = (int) (((bVar.f11264b.getY() + ((float) bVar.f11264b.getHeight())) - f2) + ((float) bVar.f11268f));
        }
        if (!LiveAppBundleUtils.isPluginAvailable(b.LINK_MIC)) {
            LiveAppBundleUtils.ensurePluginAvailable(bVar.f11263a, b.LINK_MIC);
            bVar.f11265c.setVisibility(4);
            v.b();
            if (bVar.f11275m != null) {
                if (size > 0) {
                    i3 = bVar.f11268f;
                }
                bVar.f11275m.b(i.class, new j(size, i2 + i3));
                return;
            }
            return;
        }
        int f3 = bVar.f11267e.f();
        if (bVar.f11272j) {
            String quantityString = bVar.f11265c.getContext().getResources().getQuantityString(R.plurals.fm, f3, Integer.valueOf(f3));
            f.a(R.string.e55, Integer.valueOf(f3));
            bVar.f11265c.setText(quantityString);
            bVar.h();
            bVar.f11265c.setVisibility(0);
        } else {
            int intValue = c.a().n.intValue();
            if (intValue == 0) {
                bVar.f11265c.setText(R.string.dwi);
                bVar.i();
                if (e.f10014a.a("MULTI_GUEST_DATA_HOLDER") == null || (aVar2 = (com.bytedance.android.live.liveinteract.multiguest.opt.a.a) e.f10014a.a("MULTI_GUEST_DATA_HOLDER")) == null || (aVar = aVar2.f11299i) == null) {
                    aVar = d.a().w;
                }
                if (com.bytedance.android.live.liveinteract.multilive.a.a(aVar)) {
                    if (com.bytedance.android.live.liveinteract.multilive.a.b(aVar)) {
                        if (com.bytedance.android.live.liveinteract.multilive.a.a(bVar.f11275m)) {
                            if (bVar.f11265c != null) {
                                bVar.f11265c.setVisibility(8);
                            }
                        } else if (bVar.f11265c != null) {
                            bVar.f11265c.setVisibility(0);
                        }
                    } else if (bVar.f11265c != null) {
                        bVar.f11265c.setVisibility(0);
                    }
                } else if (bVar.f11265c != null) {
                    bVar.f11265c.setVisibility(0);
                }
            } else if (intValue != 2) {
                bVar.f11265c.setText(bVar.f11265c.getContext().getResources().getQuantityString(R.plurals.fm, f3, Integer.valueOf(f3)));
                bVar.h();
                bVar.f11265c.setVisibility(0);
            } else {
                bVar.f11265c.setText(R.string.dwi);
                bVar.i();
                bVar.f11265c.setVisibility(8);
            }
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bVar.f11265c.getLayoutParams();
        layoutParams.bottomMargin = i2;
        bVar.f11265c.setLayoutParams(layoutParams);
        if (bVar.f11275m != null) {
            bVar.f11265c.post(new Runnable(size, i2) {
                /* class com.bytedance.android.live.liveinteract.multiguest.g.c.b.AnonymousClass5 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ int f11281a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f11282b;

                static {
                    Covode.recordClassIndex(6070);
                }

                public final void run() {
                    int i2;
                    if (b.this.f11265c.getVisibility() == 0) {
                        i2 = b.this.f11265c.getHeight() + b.this.f11268f;
                    } else if (this.f11281a > 0) {
                        i2 = b.this.f11268f;
                    } else {
                        i2 = 0;
                    }
                    b.this.f11275m.b(i.class, new j(this.f11281a, this.f11282b + i2));
                }

                {
                    this.f11281a = r2;
                    this.f11282b = r3;
                }
            });
        }
    }
}

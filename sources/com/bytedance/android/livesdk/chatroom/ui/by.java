package com.bytedance.android.livesdk.chatroom.ui;

import android.widget.FrameLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.b.l;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.b.o;
import com.bytedance.android.livesdk.chatroom.ui.br;
import com.bytedance.android.livesdkapi.view.e;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class by implements b {

    /* renamed from: a  reason: collision with root package name */
    private final br f16053a;

    static {
        Covode.recordClassIndex(8877);
    }

    by(br brVar) {
        this.f16053a = brVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        br brVar = this.f16053a;
        o oVar = (o) obj;
        if (!oVar.f10006d && brVar.isViewValid() && !brVar.mStatusDestroyed) {
            brVar.as = oVar.f10003a != n.NORMAL;
            int i2 = br.AnonymousClass9.f16030a[oVar.f10003a.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (brVar.C != null && (brVar.C.f15846a instanceof e) && oVar.f10005c) {
                        brVar.C.f15846a.post(new Runnable(oVar) {
                            /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass16 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ o f16018a;

                            static {
                                Covode.recordClassIndex(8859);
                            }

                            public final void run() {
                                br.this.m();
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) br.this.C.b();
                                layoutParams.width = br.this.C.f15846a.getWidth();
                                layoutParams.height = br.this.C.f15846a.getHeight();
                                int min = Math.min(y.c(), y.b());
                                if (br.this.C.f15846a.getWidth() < min) {
                                    layoutParams.gravity = 48;
                                    layoutParams.leftMargin = (min - br.this.C.f15846a.getWidth()) / 2;
                                    br.this.V.c(l.class, Integer.valueOf(br.this.C.f15846a.getWidth()));
                                } else {
                                    layoutParams.gravity = 49;
                                    layoutParams.leftMargin = 0;
                                }
                                if (this.f16018a.f10004b == null || !this.f16018a.f10011i) {
                                    layoutParams.topMargin = 0;
                                } else {
                                    double top = (double) (this.f16018a.f10004b.getTop() + this.f16018a.f10004b.getHeight());
                                    double height = (double) br.this.C.f15846a.getHeight();
                                    Double.isNaN(height);
                                    Double.isNaN(top);
                                    layoutParams.topMargin = (int) (top - (height * 0.5d));
                                }
                                br.this.C.a(layoutParams);
                            }

                            {
                                this.f16018a = r2;
                            }
                        });
                    }
                } else if (i2 != 4) {
                    brVar.m();
                } else {
                    brVar.m();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) brVar.C.b();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.gravity = 85;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    brVar.C.a(layoutParams);
                }
            } else if (!(oVar.f10007e == 0 || oVar.f10008f == 0)) {
                brVar.C.f15846a.post(new Runnable(oVar) {
                    /* class com.bytedance.android.livesdk.chatroom.ui.br.AnonymousClass15 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ o f16016a;

                    static {
                        Covode.recordClassIndex(8858);
                    }

                    public final void run() {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) br.this.C.b();
                        layoutParams.width = this.f16016a.f10007e;
                        layoutParams.height = this.f16016a.f10008f;
                        layoutParams.gravity = 85;
                        layoutParams.rightMargin = this.f16016a.f10010h;
                        layoutParams.bottomMargin = this.f16016a.f10009g;
                        br.this.C.a(layoutParams);
                    }

                    {
                        this.f16016a = r2;
                    }
                });
            }
        }
        return z.f158842a;
    }
}

package com.bytedance.android.livesdk.chatroom.interaction;

import androidx.fragment.app.d;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.chatroom.c.aa;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.model.utils.b;
import com.bytedance.android.livesdk.ui.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.au;
import f.a.d.f;
import h.f.b.l;

public final class PopHalfWebDialogHelper implements au {

    /* renamed from: a  reason: collision with root package name */
    d f15634a;

    /* renamed from: b  reason: collision with root package name */
    final a f15635b;

    /* renamed from: c  reason: collision with root package name */
    public final DataChannel f15636c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f15637d;

    static {
        Covode.recordClassIndex(8636);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            dismissDialog();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void dismissDialog() {
        d dVar = this.f15634a;
        if (dVar != null) {
            dVar.dismissAllowingStateLoss();
        }
    }

    public PopHalfWebDialogHelper(a aVar, DataChannel dataChannel, boolean z, m mVar) {
        l.d(aVar, "");
        l.d(dataChannel, "");
        l.d(mVar, "");
        this.f15635b = aVar;
        this.f15636c = dataChannel;
        this.f15637d = z;
        mVar.getLifecycle().a(this);
        com.bytedance.android.livesdk.an.a.a().a(aVar, aa.class, dataChannel).a(new f(this) {
            /* class com.bytedance.android.livesdk.chatroom.interaction.PopHalfWebDialogHelper.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PopHalfWebDialogHelper f15638a;

            static {
                Covode.recordClassIndex(8637);
            }

            {
                this.f15638a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                String str;
                String str2;
                aa aaVar = (aa) obj;
                PopHalfWebDialogHelper popHalfWebDialogHelper = this.f15638a;
                DataChannel dataChannel = popHalfWebDialogHelper.f15636c;
                if (aaVar != null && (str = aaVar.f15060a) != null && str.length() != 0) {
                    int i2 = aaVar.f15063d;
                    if (i2 <= 0) {
                        if (popHalfWebDialogHelper.f15637d) {
                            i2 = 300;
                        } else {
                            i2 = 240;
                        }
                    }
                    int i3 = aaVar.f15064e;
                    if (i3 <= 0) {
                        if (popHalfWebDialogHelper.f15637d) {
                            i3 = 400;
                        } else {
                            i3 = 320;
                        }
                    }
                    b bVar = new b(aaVar.f15060a);
                    bVar.a("language", com.bytedance.android.live.core.b.a.a());
                    bVar.a("enter_from", "");
                    bVar.a("source_v3", e.c());
                    bVar.a("anchor_id", e.h());
                    bVar.a("log_pb", e.j());
                    bVar.a("request_id", e.k());
                    if (l.a(dataChannel.b(ee.class), (Object) true)) {
                        str2 = "live_take_detail";
                    } else {
                        str2 = "live_detail";
                    }
                    bVar.a("event_page", str2);
                    bVar.a("event_belong", "live_interact");
                    com.bytedance.android.livesdk.browser.c.d webViewManager = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
                    d.b a2 = com.bytedance.android.livesdk.browser.c.e.a(bVar.a());
                    a2.f14301b = i2;
                    a2.f14302c = i3;
                    d.b a3 = a2.a(aaVar.f15065f);
                    a3.f14303d = aaVar.f15066g;
                    a3.f14309j = aaVar.f15062c;
                    a3.f14310k = aaVar.f15068i;
                    a3.D = aaVar.f15061b;
                    a3.q = aaVar.f15069j;
                    a3.f14312m = aaVar.f15067h;
                    popHalfWebDialogHelper.f15634a = webViewManager.a(a3);
                    com.bytedance.android.live.core.widget.a.a(popHalfWebDialogHelper.f15635b.getActivity(), popHalfWebDialogHelper.f15634a);
                }
            }
        });
    }
}

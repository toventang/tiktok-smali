package com.bytedance.android.livesdk.chatroom.interaction;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.h;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.util.rxutils.autodispose.e;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import org.json.JSONObject;

public final class PackagePurchaseHelper implements au {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f15630a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.android.livesdk.ui.a f15631b;

    /* renamed from: c  reason: collision with root package name */
    private final DataChannel f15632c;

    final /* synthetic */ class b implements f {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f15633a;

        static {
            Covode.recordClassIndex(8635);
        }

        b(h.f.a.b bVar) {
            this.f15633a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            l.b(this.f15633a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(8632);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            dismissDialog();
        }
    }

    public static final class a implements IWalletService.a {
        static {
            Covode.recordClassIndex(8634);
        }

        @Override // com.bytedance.android.live.wallet.IWalletService.a
        public final void b(Dialog dialog, h hVar) {
            l.d(dialog, "");
            l.d(hVar, "");
        }

        a() {
        }

        @Override // com.bytedance.android.live.wallet.IWalletService.a
        public final void a(Dialog dialog, h hVar) {
            Integer valueOf;
            l.d(dialog, "");
            if (hVar != null && (valueOf = Integer.valueOf(hVar.b())) != null) {
                if (valueOf.intValue() == 10001) {
                    ao.a(y.e(), (int) R.string.gww);
                } else if (valueOf.intValue() == 10002) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("status", "success");
                        jSONObject.put("code", "1");
                    } catch (Exception unused) {
                    }
                    ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager().a("H5_payStatus", jSONObject);
                }
            }
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void dismissDialog() {
        p.b(this.f15630a);
    }

    public final void onEvent(com.bytedance.android.livesdk.browser.jsbridge.a.b bVar) {
        long j2;
        User owner;
        Dialog dialog = this.f15630a;
        if (dialog == null || !dialog.isShowing()) {
            JSONObject jSONObject = bVar.f14444b;
            try {
                Room room = (Room) this.f15632c.b(df.class);
                if (room == null || (owner = room.getOwner()) == null) {
                    j2 = 0;
                } else {
                    j2 = owner.getId();
                }
                jSONObject.put("anchor_id", j2);
                Bundle bundle = new Bundle();
                bundle.putString("KEY_REQUEST_PAGE", "live_detail");
                Dialog consumeDialog = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).getConsumeDialog(this.f15631b.getActivity(), bundle, jSONObject, new a(), bVar.f14443a);
                this.f15630a = consumeDialog;
                p.a(consumeDialog);
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a("AbsInteractionFragment", e2);
            }
        }
    }

    public PackagePurchaseHelper(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, m mVar) {
        l.d(aVar, "");
        l.d(dataChannel, "");
        l.d(mVar, "");
        this.f15631b = aVar;
        this.f15632c = dataChannel;
        mVar.getLifecycle().a(this);
        ((z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.browser.jsbridge.a.b.class).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(e.a((Fragment) aVar))).a(new b(new h.f.a.b<com.bytedance.android.livesdk.browser.jsbridge.a.b, h.z>(this) {
            /* class com.bytedance.android.livesdk.chatroom.interaction.PackagePurchaseHelper.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8633);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(com.bytedance.android.livesdk.browser.jsbridge.a.b bVar) {
                com.bytedance.android.livesdk.browser.jsbridge.a.b bVar2 = bVar;
                l.d(bVar2, "");
                ((PackagePurchaseHelper) this.receiver).onEvent(bVar2);
                return h.z.f158842a;
            }
        }));
    }
}

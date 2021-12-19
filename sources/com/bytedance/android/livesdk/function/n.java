package com.bytedance.android.livesdk.function;

import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.live.network.e;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdk.utils.k;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import f.a.d.f;
import java.util.HashMap;

final /* synthetic */ class n implements f {

    /* renamed from: a  reason: collision with root package name */
    private final UserPermissionCheckWidget f17806a;

    static {
        Covode.recordClassIndex(9887);
    }

    n(UserPermissionCheckWidget userPermissionCheckWidget) {
        this.f17806a = userPermissionCheckWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        String str;
        UserPermissionCheckWidget userPermissionCheckWidget = this.f17806a;
        com.bytedance.android.livesdk.event.n nVar = (com.bytedance.android.livesdk.event.n) obj;
        if (nVar != null && nVar.f17206a == b.a.Login && userPermissionCheckWidget.f17782a != null) {
            long j2 = 0;
            if (userPermissionCheckWidget.f17782a.getId() > 0) {
                EnterRoomConfig enterRoomConfig = f.a.f23366a.a().f23354b;
                long id = userPermissionCheckWidget.f17782a.getId();
                String requestId = userPermissionCheckWidget.f17782a.getRequestId();
                String str2 = userPermissionCheckWidget.f17783b;
                String str3 = userPermissionCheckWidget.f17784c;
                String str4 = userPermissionCheckWidget.f17785d;
                if (enterRoomConfig == null) {
                    str = "";
                } else {
                    str = enterRoomConfig.f23298b.f23314f;
                }
                if ("draw".equals(str2) && "live_detail-hourly_rank".equals(str4)) {
                    str4 = str4 + str2;
                }
                HashMap<String, String> hashMap = new k().a("common_label_list", str3).a("enter_source", str4).a("request_id", requestId).a("enter_type", str2).a("live_reason", str).f22332a;
                LiveAppBundleUtils.ensurePluginAvailable(((IHostContext) a.a(IHostContext.class)).context(), com.bytedance.android.livesdk.utils.b.CMAF);
                LiveAppBundleUtils.ensurePluginAvailable(((IHostContext) a.a(IHostContext.class)).context(), com.bytedance.android.livesdk.utils.b.QUIC);
                LiveAppBundleUtils.ensurePluginAvailable(((IHostContext) a.a(IHostContext.class)).context(), com.bytedance.android.livesdk.utils.b.RTS);
                if (u.a().b().e()) {
                    j2 = 1;
                }
                ((z) ((RoomRetrofitApi) e.a().a(RoomRetrofitApi.class)).enterRoom(id, 1, j2, hashMap).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(WidgetExtendsKt.autoDispose(userPermissionCheckWidget))).a(o.f17807a, new p(userPermissionCheckWidget));
            }
        }
    }
}

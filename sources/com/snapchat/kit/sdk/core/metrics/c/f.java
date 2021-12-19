package com.snapchat.kit.sdk.core.metrics.c;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a f57177a;

    static {
        Covode.recordClassIndex(35626);
    }

    f(a aVar) {
        this.f57177a = aVar;
    }

    private static ServerEvent a(ServerEventData serverEventData) {
        return new ServerEvent.Builder().event_data(serverEventData).build();
    }

    private LoginKitEventBase a(boolean z) {
        return new LoginKitEventBase.Builder().kit_event_base(this.f57177a.a()).is_for_firebase_authentication(Boolean.valueOf(z)).build();
    }

    public final ServerEvent a(com.snapchat.kit.sdk.core.a.f fVar, boolean z) {
        String str;
        ServerEventData.Builder builder = new ServerEventData.Builder();
        LoginKitAuthStart.Builder log_kit_event_base = new LoginKitAuthStart.Builder().log_kit_event_base(a(z));
        if (fVar.f57090a) {
            str = "PROFILE_LINK";
        } else {
            str = null;
        }
        return a(builder.login_kit_auth_start(log_kit_event_base.features_requested_string_list(str).build()).build());
    }

    public final ServerEvent a(boolean z, boolean z2) {
        return a(new ServerEventData.Builder().login_kit_auth_complete(new LoginKitAuthComplete.Builder().log_kit_event_base(a(z2)).is_success(Boolean.valueOf(z)).build()).build());
    }
}

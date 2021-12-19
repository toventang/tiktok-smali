package com.snapchat.kit.sdk.core.metrics.c;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.KitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.networking.f;
import java.util.Locale;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f57159a = "";

    /* renamed from: b  reason: collision with root package name */
    private final String f57160b;

    /* renamed from: c  reason: collision with root package name */
    private final KitPluginType f57161c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f57162d;

    static {
        Covode.recordClassIndex(35620);
    }

    public final KitEventBase a() {
        return a(KitType.LOGIN_KIT, this.f57159a);
    }

    public final KitEventBase a(KitType kitType, String str) {
        String locale;
        KitEventBase.Builder kit_user_agent = new KitEventBase.Builder().kit_variant(kitType).kit_variant_version(str).oauth_client_id(this.f57160b).kit_user_agent(f.f57255a);
        Locale locale2 = Locale.getDefault();
        if (locale2 == null) {
            locale = "";
        } else {
            locale = locale2.toString();
        }
        return kit_user_agent.locale(locale).kit_client_timestamp_millis(Long.valueOf(System.currentTimeMillis())).kit_plugin_type(this.f57161c).is_from_react_native_plugin(Boolean.valueOf(this.f57162d)).build();
    }

    public a(String str, KitPluginType kitPluginType, boolean z) {
        this.f57160b = str;
        this.f57161c = kitPluginType;
        this.f57162d = z;
    }
}

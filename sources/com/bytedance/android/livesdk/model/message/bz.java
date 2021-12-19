package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.google.gson.a.c;

public class bz extends a {
    @c(a = "content")

    /* renamed from: a  reason: collision with root package name */
    public String f19395a;
    @c(a = b.f37372a)

    /* renamed from: f  reason: collision with root package name */
    public String f19396f;
    @c(a = "traceid")

    /* renamed from: g  reason: collision with root package name */
    public String f19397g;
    @c(a = "icon")

    /* renamed from: h  reason: collision with root package name */
    public ImageModel f19398h;
    @c(a = "action_content")

    /* renamed from: i  reason: collision with root package name */
    public String f19399i;
    @c(a = "action_type")

    /* renamed from: j  reason: collision with root package name */
    public String f19400j = "0";
    @c(a = "push_message_display_time")

    /* renamed from: k  reason: collision with root package name */
    public long f19401k;
    @c(a = "background_image")

    /* renamed from: l  reason: collision with root package name */
    public FlexImageModel f19402l;
    @c(a = "new_background_image")

    /* renamed from: m  reason: collision with root package name */
    public FlexImageModel f19403m;
    @c(a = "action_icon")
    public ImageModel n;
    @c(a = "source")
    public String o;

    static {
        Covode.recordClassIndex(11497);
    }

    public bz() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.ROOM_PUSH;
    }

    @Override // com.bytedance.android.livesdk.ac.b.a
    public final boolean a() {
        if (this.O == null || this.O.f23218j == null) {
            return false;
        }
        return true;
    }
}

package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.google.gson.a.c;

public class bw extends a {
    @c(a = "content")

    /* renamed from: a  reason: collision with root package name */
    public String f19376a;
    @c(a = b.f37372a)

    /* renamed from: f  reason: collision with root package name */
    public String f19377f;
    @c(a = "traceid")

    /* renamed from: g  reason: collision with root package name */
    public String f19378g;
    @c(a = "icon")

    /* renamed from: h  reason: collision with root package name */
    public ImageModel f19379h;
    @c(a = "action_content")

    /* renamed from: i  reason: collision with root package name */
    public String f19380i;
    @c(a = "action_type")

    /* renamed from: j  reason: collision with root package name */
    public String f19381j;
    @c(a = "push_message_display_time")

    /* renamed from: k  reason: collision with root package name */
    public long f19382k;

    /* renamed from: l  reason: collision with root package name */
    public ImageModel f19383l;

    /* renamed from: m  reason: collision with root package name */
    public transient ImageModel f19384m;
    public transient CharSequence n;
    public transient int o;

    static {
        Covode.recordClassIndex(11494);
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        return true;
    }

    public bw() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.ROOM_RICH_CHAT_MESSAGE;
    }

    @Override // com.bytedance.android.livesdk.ac.b.a
    public final boolean a() {
        if (this.O == null || this.O.f23218j == null) {
            return false;
        }
        return true;
    }
}

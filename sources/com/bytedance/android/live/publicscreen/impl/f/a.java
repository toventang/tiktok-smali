package com.bytedance.android.live.publicscreen.impl.f;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f12366a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12367b;

    /* renamed from: c  reason: collision with root package name */
    public DataChannel f12368c;

    static {
        Covode.recordClassIndex(6797);
    }

    public final void a(boolean z, String str) {
        if (this.f12367b != z) {
            if (z) {
                this.f12366a = 0;
            } else if (this.f12366a < 0) {
                b a2 = b.a.a("livesdk_comment_slide_up").a(this.f12368c);
                com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class);
                l.b(a3, "");
                b a4 = a2.a("comment_slide_up_scene", ((com.bytedance.android.live.liveinteract.api.b) a3).getRoomScene()).a("admin_type", str);
                d a5 = d.a();
                l.b(a5, "");
                a4.a("enter_live_method", a5.e()).b();
            }
            this.f12367b = z;
        }
    }
}

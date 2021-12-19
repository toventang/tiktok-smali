package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.bf;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ai implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final CommentWidget f16459a;

    static {
        Covode.recordClassIndex(9099);
    }

    ai(CommentWidget commentWidget) {
        this.f16459a = commentWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        CommentWidget commentWidget = this.f16459a;
        IHostApp iHostApp = (IHostApp) a.a(IHostApp.class);
        if (iHostApp != null) {
            iHostApp.jumpToAgsStatusPage(commentWidget.getContext(), "popup_live_comment_ban");
        }
        commentWidget.f16274m = null;
        bf.a().c();
        b.a.a("livesdk_tns_ags_float_comment_ban").a(commentWidget.dataChannel).a("user_id", u.a().b().c()).a("action_type", "click_details").b();
    }
}

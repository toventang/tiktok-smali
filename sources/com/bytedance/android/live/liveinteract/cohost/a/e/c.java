package com.bytedance.android.live.liveinteract.cohost.a.e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.android.live.liveinteract.cohost.ui.b.d;
import com.bytedance.android.live.liveinteract.cohost.ui.e.d;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.interact.model.i;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(5345);
    }

    public static final class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.a f10173a;

        static {
            Covode.recordClassIndex(5346);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.ui.b.d.a
        public final void b() {
            this.f10173a.a();
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.ui.b.d.a
        public final void a() {
            DataChannel dataChannel = b.a.a().an;
            if (dataChannel != null) {
                dataChannel.c(com.bytedance.android.live.liveinteract.cohost.a.b.b.class);
            }
        }

        a(d.a aVar) {
            this.f10173a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveButton f10174a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d.a f10175b;

        static {
            Covode.recordClassIndex(5347);
        }

        b(LiveButton liveButton, d.a aVar) {
            this.f10174a = liveButton;
            this.f10175b = aVar;
        }

        public final void onClick(View view) {
            c.a((View) this.f10174a, this.f10175b);
        }
    }

    public static final void a(LiveButton liveButton, d.a aVar) {
        l.d(liveButton, "");
        l.d(aVar, "");
        liveButton.setOnClickListener(new b(liveButton, aVar));
    }

    public static final void a(LiveButton liveButton, i.a aVar) {
        l.d(liveButton, "");
        l.d(aVar, "");
        liveButton.setText(aVar.f15628c);
        liveButton.setEnabled(true);
        if (!aVar.f15629d) {
            liveButton.setEnabled(false);
            liveButton.setIcon(2131234467);
            return;
        }
        liveButton.setIcon((Drawable) null);
        if (d.b()) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ca;
            l.b(bVar, "");
            Boolean a2 = bVar.a();
            l.b(a2, "");
            if (a2.booleanValue() && d.b()) {
                long d2 = d.d();
                String a3 = y.a((int) R.string.dty, e.a(d2), e.b(d2));
                if (a3 != null) {
                    liveButton.setText(a3);
                    liveButton.setEnabled(false);
                }
            }
        }
        if (liveButton.isEnabled()) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.ca;
            l.b(bVar2, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) false);
        }
    }

    public static final void a(View view, d.a aVar) {
        l.d(view, "");
        l.d(aVar, "");
        if (d.b()) {
            if (!(view instanceof LiveButton)) {
                view = null;
            }
            LiveButton liveButton = (LiveButton) view;
            if (liveButton != null) {
                liveButton.setEnabled(false);
            }
            ao.a(y.e(), y.a((int) R.string.du5), 0);
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ca;
            l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) true);
            b.a.a("livesdk_connection_click_banned").a().a("invitee_list", a.d.RANDOM_MATCH.getType()).a("connection_type", "anchor").a("banned_time", d.d()).b();
        } else if (b.a.a().b() != k.DISABLED) {
            ao.a(y.e(), (int) R.string.e69);
        } else {
            com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
            l.b(a2, "");
            if (a2.f14182c) {
                DataChannelGlobal.f34575d.d(com.bytedance.android.live.liveinteract.platform.common.c.k.class);
                return;
            }
            User a3 = d.a.a();
            if (a3 == null || a3.getSecret() != 1) {
                aVar.a();
                return;
            }
            Context context = view.getContext();
            l.b(context, "");
            com.bytedance.android.live.liveinteract.cohost.ui.b.d.a(context, new a(aVar)).show();
        }
    }
}

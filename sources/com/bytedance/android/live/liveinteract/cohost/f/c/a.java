package com.bytedance.android.live.liveinteract.cohost.f.c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.aj;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.android.live.liveinteract.cohost.a.e.c;
import com.bytedance.android.live.liveinteract.cohost.ui.e.d;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.live.publicscreen.a.f.b;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.az;
import com.bytedance.android.livesdk.j.ck;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicModeSwitchOpenSetting;
import com.bytedance.android.livesdk.model.message.ak;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class a extends b<com.bytedance.android.live.liveinteract.cohost.f.e.a> {

    /* renamed from: a  reason: collision with root package name */
    public final View f10221a;

    /* renamed from: d  reason: collision with root package name */
    private final ImageView f10222d;

    /* renamed from: e  reason: collision with root package name */
    private final LiveTextView f10223e;

    /* renamed from: f  reason: collision with root package name */
    private final LiveTextView f10224f;

    static {
        Covode.recordClassIndex(5379);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.adh);
        l.b(findViewById, "");
        this.f10221a = findViewById;
        View findViewById2 = view.findViewById(R.id.acs);
        l.b(findViewById2, "");
        this.f10222d = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bdp);
        l.b(findViewById3, "");
        this.f10223e = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.br1);
        l.b(findViewById4, "");
        this.f10224f = (LiveTextView) findViewById4;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.f.c.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC0166a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10225a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f10226b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.liveinteract.cohost.f.e.a f10227c;

        static {
            Covode.recordClassIndex(5380);
        }

        View$OnClickListenerC0166a(a aVar, g gVar, com.bytedance.android.live.liveinteract.cohost.f.e.a aVar2) {
            this.f10225a = aVar;
            this.f10226b = gVar;
            this.f10227c = aVar2;
        }

        public final void onClick(View view) {
            Room room;
            DataChannel dataChannel;
            Room room2;
            if (view != null && view.getContext() != null && this.f10226b.f12208l != null) {
                b.a.a().V = "anchor_host_notice";
                com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class);
                l.b(a2, "");
                if (!((com.bytedance.android.live.liveinteract.api.b) a2).isInMultiGuest() && ((!aj.a(b.a.a().a(), 2) || TTliveLinkmicModeSwitchOpenSetting.INSTANCE.getValue()) && !((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).isMicRoomForAnchorNow())) {
                    MESSAGE message = this.f10227c.f12190d;
                    l.b(message, "");
                    if (((ak) message).f19151g != 1 || (!com.bytedance.android.live.liveinteract.cohost.a.c.a.e() && !com.bytedance.android.live.liveinteract.cohost.a.c.a.d())) {
                        MESSAGE message2 = this.f10227c.f12190d;
                        l.b(message2, "");
                        if (((ak) message2).f19151g != 2 || (!com.bytedance.android.live.liveinteract.cohost.a.c.a.e() && !com.bytedance.android.live.liveinteract.cohost.a.c.a.d())) {
                            MESSAGE message3 = this.f10227c.f12190d;
                            l.b(message3, "");
                            if (((ak) message3).f19151g == 1) {
                                DataChannel dataChannel2 = this.f10226b.f12208l;
                                if (dataChannel2 != null) {
                                    room2 = (Room) dataChannel2.b(df.class);
                                } else {
                                    room2 = null;
                                }
                                h.a(4, room2, (n) null, false, false);
                                DataChannel dataChannel3 = this.f10226b.f12208l;
                                if (dataChannel3 != null) {
                                    dataChannel3.c(ck.class, "anchor_host_notice");
                                }
                                h.a("room", "anchor_host_notice", false);
                                b.a.a("livesdk_anchor_host_notice").a(this.f10226b.f12208l).a("event_type", "click").b();
                                return;
                            }
                            MESSAGE message4 = this.f10227c.f12190d;
                            l.b(message4, "");
                            if (((ak) message4).f19151g == 2) {
                                DataChannel dataChannel4 = this.f10226b.f12208l;
                                if (dataChannel4 != null) {
                                    room = (Room) dataChannel4.b(df.class);
                                } else {
                                    room = null;
                                }
                                h.a(4, room, (n) null, false, true);
                                h.a("room", "anchor_host_notice", true);
                                if (b.a.a().f9936a) {
                                    ao.a(y.e(), (int) R.string.dy0);
                                    return;
                                }
                                c.a(this.f10225a.f10221a, new d.a(this) {
                                    /* class com.bytedance.android.live.liveinteract.cohost.f.c.a.View$OnClickListenerC0166a.AnonymousClass1 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ View$OnClickListenerC0166a f10228a;

                                    static {
                                        Covode.recordClassIndex(5381);
                                    }

                                    @Override // com.bytedance.android.live.liveinteract.cohost.ui.e.d.a
                                    public final boolean a() {
                                        com.bytedance.android.live.liveinteract.cohost.a.c.a.a(this.f10228a.f10226b.f12208l, a.e.TYPE_PUBLIC_SCREEN);
                                        return true;
                                    }

                                    /* JADX WARN: Incorrect args count in method signature: ()V */
                                    {
                                        this.f10228a = r1;
                                    }
                                });
                                if (com.bytedance.android.live.liveinteract.cohost.a.e.d.b() && (dataChannel = this.f10226b.f12208l) != null) {
                                    dataChannel.c(ck.class, "anchor_host_notice");
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        com.bytedance.android.live.liveinteract.cohost.a.c.a.a(a.c.PREVIEW_DIALOG);
                        return;
                    }
                }
                ao.a(y.e(), (int) R.string.dy0);
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.a.f.a
    public final /* synthetic */ void a(g gVar, com.bytedance.android.live.publicscreen.a.d.h hVar) {
        boolean z;
        float f2;
        Boolean bool;
        com.bytedance.android.live.liveinteract.cohost.f.e.a aVar = (com.bytedance.android.live.liveinteract.cohost.f.e.a) hVar;
        l.d(gVar, "");
        l.d(aVar, "");
        this.f10222d.setImageResource(2131234420);
        LiveTextView liveTextView = this.f10223e;
        MESSAGE message = aVar.f12190d;
        l.b(message, "");
        liveTextView.setText(((ak) message).f19149a);
        LiveTextView liveTextView2 = this.f10224f;
        MESSAGE message2 = aVar.f12190d;
        l.b(message2, "");
        liveTextView2.setText(((ak) message2).f19150f);
        this.f10221a.setBackgroundResource(R.drawable.brd);
        this.f10221a.setOnClickListener(new View$OnClickListenerC0166a(this, gVar, aVar));
        DataChannel dataChannel = gVar.f12208l;
        if (dataChannel == null || (bool = (Boolean) dataChannel.b(az.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        ViewGroup.LayoutParams layoutParams = this.f10221a.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams;
        if (z) {
            f2 = 0.99f;
        } else {
            f2 = 0.8f;
        }
        aVar2.O = f2;
        this.f10221a.setLayoutParams(aVar2);
    }
}

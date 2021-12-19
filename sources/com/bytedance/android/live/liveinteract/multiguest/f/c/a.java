package com.bytedance.android.live.liveinteract.multiguest.f.c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.aj;
import com.bytedance.android.live.liveinteract.api.v;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.bf;
import com.bytedance.android.livesdk.model.message.al;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class a extends com.bytedance.android.live.publicscreen.a.f.b<com.bytedance.android.live.liveinteract.multiguest.f.e.a> {

    /* renamed from: a  reason: collision with root package name */
    private final View f11183a;

    /* renamed from: d  reason: collision with root package name */
    private final ImageView f11184d;

    /* renamed from: e  reason: collision with root package name */
    private final LiveTextView f11185e;

    /* renamed from: f  reason: collision with root package name */
    private final LiveTextView f11186f;

    static {
        Covode.recordClassIndex(6009);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f11188a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ al.a f11189b;

        static {
            Covode.recordClassIndex(6011);
        }

        b(g gVar, al.a aVar) {
            this.f11188a = gVar;
            this.f11189b = aVar;
        }

        public final void onClick(View view) {
            DataChannel dataChannel = this.f11188a.f12208l;
            if (view != null && view.getContext() != null && dataChannel != null) {
                if (b.a.a().a() != 2) {
                    ao.a(y.e(), (int) R.string.e9h);
                } else {
                    dataChannel.c(v.class, new com.bytedance.android.livesdk.event.a(this.f11189b.f19157c, "mutual_notice"));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.adh);
        l.b(findViewById, "");
        this.f11183a = findViewById;
        View findViewById2 = view.findViewById(R.id.acs);
        l.b(findViewById2, "");
        this.f11184d = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bdp);
        l.b(findViewById3, "");
        this.f11185e = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.br1);
        l.b(findViewById4, "");
        this.f11186f = (LiveTextView) findViewById4;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.f.c.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC0215a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f11187a;

        static {
            Covode.recordClassIndex(6010);
        }

        View$OnClickListenerC0215a(g gVar) {
            this.f11187a = gVar;
        }

        public final void onClick(View view) {
            DataChannel dataChannel = this.f11187a.f12208l;
            if (view != null && view.getContext() != null && dataChannel != null) {
                com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class);
                l.b(a2, "");
                if (aj.a(((com.bytedance.android.live.liveinteract.api.b) a2).getCurrentLinkMode(), 2)) {
                    ao.a(y.e(), y.a((int) R.string.ea4), 0);
                    return;
                }
                dataChannel.c(bf.class, "");
                b.a.a("livesdk_anchor_invite_guest_popup_click").a().b();
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.a.f.a
    public final /* synthetic */ void a(g gVar, h hVar) {
        al.a aVar;
        k kVar = (k) hVar;
        l.d(gVar, "");
        l.d(kVar, "");
        if (((al) kVar.f12190d).f19152a == 0) {
            al.c cVar = ((al) kVar.f12190d).f19153f;
            if (cVar != null && cVar.f19159a != null && cVar.f19160b != null) {
                this.f11184d.setImageResource(2131234420);
                this.f11185e.setText(cVar.f19159a.f19158a);
                this.f11186f.setText(cVar.f19160b.f19158a);
                this.f11186f.setOnClickListener(new View$OnClickListenerC0215a(gVar));
                b.a.a("livesdk_anchor_invite_guest_popup_show").a().b();
            }
        } else if (((al) kVar.f12190d).f19152a == 1 && (aVar = ((al) kVar.f12190d).f19154g) != null && aVar.f19157c != null) {
            User user = aVar.f19157c;
            l.b(user, "");
            if (user.getAvatarThumb() != null && aVar.f19156b != null && aVar.f19155a != null) {
                this.f11183a.setBackgroundResource(R.drawable.brc);
                ViewGroup.LayoutParams layoutParams = this.f11184d.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams;
                aVar2.width = y.a(32.0f);
                aVar2.height = y.a(32.0f);
                aVar2.leftMargin = y.a(8.0f);
                aVar2.rightMargin = y.a(8.0f);
                this.f11184d.setLayoutParams(aVar2);
                ImageView imageView = this.f11184d;
                User user2 = aVar.f19157c;
                l.b(user2, "");
                com.bytedance.android.livesdk.chatroom.g.g.a(imageView, user2.getAvatarThumb(), this.f11184d.getWidth(), this.f11184d.getHeight(), 2131234424);
                this.f11185e.setText(aVar.f19155a.f19158a);
                this.f11186f.setText(aVar.f19156b.f19158a);
                this.f11186f.setOnClickListener(new b(gVar, aVar));
            }
        }
    }
}

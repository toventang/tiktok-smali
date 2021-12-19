package com.bytedance.android.livesdk.rank.impl.f;

import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.at.d;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.rank.api.model.b;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

public final class c {

    public interface a {
        static {
            Covode.recordClassIndex(12245);
        }

        void a();

        void b();

        b c();
    }

    static {
        Covode.recordClassIndex(12244);
    }

    public static boolean a() {
        try {
            if (((Room) DataChannelGlobal.f34575d.b(ac.class)).getOwnerUserId() == u.a().b().c()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(b bVar) {
        try {
            if (u.a().b().c() == bVar.f20593a.getId()) {
                return true;
            }
            return bVar.f20593a.isFollowing();
        } catch (Exception unused) {
            return true;
        }
    }

    public static void a(long j2) {
        try {
            long id = ((Room) DataChannelGlobal.f34575d.b(ac.class)).getId();
            if (id != 0) {
                u.a().b().a(((d.a) new d.b().a(j2)).b(id).c()).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(d.f20712a, e.f20713a);
            }
        } catch (Exception unused) {
        }
    }

    public static void a(a aVar) {
        com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdkapi.depend.b.a.class).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(f.f20714a).a(new g(aVar)).a(h.f20716a).a(new i(aVar)).a(new j(aVar), k.f20719a);
    }

    public static void a(HSImageView hSImageView, ImageView imageView, b bVar) {
        if (hSImageView != null && imageView != null && bVar != null) {
            ImageModel b2 = com.bytedance.android.livesdk.d.a.b(bVar.f20593a);
            if (b2 != null) {
                hSImageView.setVisibility(0);
                k.a(hSImageView, b2);
            } else {
                hSImageView.setVisibility(8);
            }
            g.a(imageView, bVar.f20593a.getAvatarThumb(), imageView.getWidth(), imageView.getHeight(), 2131234424);
        }
    }

    public static void a(LiveTextView liveTextView, b bVar, Boolean bool) {
        if (liveTextView != null && bVar != null) {
            if (bVar.f20595c > 0 || !bool.booleanValue()) {
                int i2 = bVar.f20594b;
                if (i2 == 1) {
                    liveTextView.setTextColor(y.b((int) R.color.ux));
                } else if (i2 == 2) {
                    liveTextView.setTextColor(y.b((int) R.color.uy));
                } else if (i2 != 3) {
                    liveTextView.setTextColor(y.b((int) R.color.uw));
                } else {
                    liveTextView.setTextColor(y.b((int) R.color.uz));
                }
                liveTextView.setText(String.valueOf(bVar.f20594b));
                return;
            }
            liveTextView.setText("-");
            liveTextView.setTextColor(y.b((int) R.color.uw));
        }
    }
}

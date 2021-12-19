package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.widget.g;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.a;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class a extends g<User> {
    static {
        Covode.recordClassIndex(85461);
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup, int i2) {
        if (viewGroup == null) {
            l.b();
        }
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bke, viewGroup, false);
        l.b(a2, "");
        return new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.a(a2);
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final void b(RecyclerView.ViewHolder viewHolder, int i2) {
        Objects.requireNonNull(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.vh.PollUserViewHolder");
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.a aVar = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.a) viewHolder;
        Object obj = e().get(i2);
        l.b(obj, "");
        User user = (User) obj;
        l.d(user, "");
        e.a(aVar.f130405a, user.getAvatarMedium());
        aVar.f130406b.setText(in.a(user, true));
        aVar.f130405a.setOnClickListener(new a.View$OnClickListenerC3401a(aVar, user));
        aVar.f130406b.setOnClickListener(new a.b(aVar, user));
    }
}

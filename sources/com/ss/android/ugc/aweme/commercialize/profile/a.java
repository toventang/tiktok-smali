package com.ss.android.ugc.aweme.commercialize.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.profile.c;
import com.ss.android.ugc.aweme.common.a.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class a extends d {

    /* renamed from: d  reason: collision with root package name */
    String f75136d = "";

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.challenge.d f75137e;

    static {
        Covode.recordClassIndex(46345);
    }

    public a(com.ss.android.ugc.aweme.challenge.d dVar) {
        l.d(dVar, "");
        this.f75137e = dVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (viewGroup == null) {
            return null;
        }
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aon, viewGroup, false);
        l.b(a2, "");
        return new c(a2, this.f75137e);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        Aweme aweme;
        UrlModel avatarLarger;
        long j2;
        if (this.f76354l != null && i2 >= 0 && i2 < this.f76354l.size() && (aweme = (Aweme) this.f76354l.get(i2)) != null) {
            Objects.requireNonNull(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserAwemeViewHolder");
            c cVar = (c) viewHolder;
            String str = this.f75136d;
            l.d(aweme, "");
            l.d(str, "");
            cVar.f75151g = aweme;
            User author = aweme.getAuthor();
            if (author != null) {
                if (author.getAvatarMedium() != null) {
                    avatarLarger = author.getAvatarMedium();
                } else if (author.getAvatarThumb() != null) {
                    avatarLarger = author.getAvatarThumb();
                } else if (author.getAvatarLarger() != null) {
                    avatarLarger = author.getAvatarLarger();
                }
                if (avatarLarger != null) {
                    v a2 = r.a(new com.bytedance.lighten.a.a.a(avatarLarger.getUrlList()));
                    a2.E = cVar.f75147c;
                    a2.c();
                }
            }
            cVar.f75146b.setText(aweme.getDesc());
            StringBuilder sb = new StringBuilder("@");
            User author2 = aweme.getAuthor();
            l.b(author2, "");
            cVar.f75148d.setText(sb.append(author2.getNickname()).toString());
            TuxTextView tuxTextView = cVar.f75149e;
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                j2 = statistics.getDiggCount();
            } else {
                j2 = 0;
            }
            tuxTextView.setText(b.a(j2));
            if (l.a((Object) aweme.getAid(), (Object) str)) {
                cVar.f75150f.setVisibility(0);
                cVar.f75145a.setOnClickListener(new c.a(cVar, aweme));
            } else {
                cVar.f75150f.setVisibility(8);
                cVar.f75145a.setOnClickListener(new c.b(cVar, aweme));
            }
            cVar.c();
        }
    }
}

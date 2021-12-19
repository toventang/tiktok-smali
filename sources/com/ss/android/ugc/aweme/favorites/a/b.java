package com.ss.android.ugc.aweme.favorites.a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.c.m;
import com.ss.android.ugc.aweme.comment.j.e;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.favorites.j.b;
import com.ss.android.ugc.aweme.favorites.ui.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ib;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class b extends f<Comment> {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f90417a;

    /* renamed from: b  reason: collision with root package name */
    private final Fragment f90418b;

    static {
        Covode.recordClassIndex(56761);
    }

    public final void a(Comment comment) {
        l.d(comment, "");
        e().remove(comment);
        notifyDataSetChanged();
        if (e().isEmpty()) {
            Fragment fragment = this.f90418b;
            Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.favorites.ui.CommentCollectListFragment");
            ((a) fragment).f();
        }
    }

    public b(Activity activity, Fragment fragment) {
        l.d(activity, "");
        l.d(fragment, "");
        this.f90417a = activity;
        this.f90418b = fragment;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.zx, viewGroup, false);
        l.b(a2, "");
        return new com.ss.android.ugc.aweme.favorites.j.b(a2);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        User user;
        Aweme aliasAweme;
        Video video;
        UrlModel cover;
        User user2;
        UrlModel avatarThumb;
        String str;
        l.d(viewHolder, "");
        Comment comment = (Comment) e().get(i2);
        com.ss.android.ugc.aweme.favorites.j.b bVar = (com.ss.android.ugc.aweme.favorites.j.b) viewHolder;
        Activity activity = this.f90417a;
        Fragment fragment = this.f90418b;
        l.d(this, "");
        if (comment != null && activity != null && fragment != null) {
            bVar.f90657b = activity;
            bVar.f90658c = fragment;
            bVar.f90656a = comment;
            bVar.f90662g = this;
            bVar.q.setVisibility(8);
            bVar.f90661f = com.ss.android.ugc.aweme.comment.n.a.a();
            com.ss.android.ugc.aweme.comment.n.a aVar = bVar.f90661f;
            String str2 = null;
            if (aVar != null) {
                Comment comment2 = bVar.f90656a;
                if (comment2 != null) {
                    str = comment2.getCid();
                } else {
                    str = null;
                }
                c<m> a2 = aVar.a(str);
                if (a2 != null) {
                    a2.a(bVar, false);
                }
            }
            bVar.f90660e = new b.C2194b(bVar);
            bVar.f90659d = new com.ss.android.ugc.aweme.comment.b(fragment, bVar.hashCode(), bVar);
            com.ss.android.ugc.aweme.comment.b bVar2 = bVar.f90659d;
            if (bVar2 != null) {
                bVar2.u = true;
            }
            bVar.f90663h = new e();
            e eVar = bVar.f90663h;
            if (eVar != null) {
                eVar.a(new com.ss.android.ugc.aweme.comment.j.c());
            }
            e eVar2 = bVar.f90663h;
            if (eVar2 != null) {
                eVar2.a_(bVar);
            }
            Comment comment3 = bVar.f90656a;
            if (!(comment3 == null || (user2 = comment3.getUser()) == null || (avatarThumb = user2.getAvatarThumb()) == null)) {
                v a3 = r.a(com.ss.android.ugc.aweme.base.v.a(avatarThumb));
                a3.K = true;
                v a4 = a3.a("collection_comment");
                a4.E = bVar.f90668m;
                a4.c();
            }
            Comment comment4 = bVar.f90656a;
            if (comment4 == null || (aliasAweme = comment4.getAliasAweme()) == null || (video = aliasAweme.getVideo()) == null || (cover = video.getCover()) == null) {
                bVar.f90667l.setVisibility(8);
            } else {
                com.ss.android.ugc.aweme.base.e.a(bVar.f90667l, cover);
                bVar.f90667l.setVisibility(0);
            }
            Comment comment5 = bVar.f90656a;
            if (!(comment5 == null || comment5.getText() == null)) {
                TuxTextView tuxTextView = bVar.o;
                Comment comment6 = bVar.f90656a;
                if (comment6 != null) {
                    str2 = comment6.getText();
                }
                tuxTextView.setText(str2);
            }
            Comment comment7 = bVar.f90656a;
            if (!(comment7 == null || (user = comment7.getUser()) == null)) {
                bVar.n.setText(in.a(user, false));
            }
            Comment comment8 = bVar.f90656a;
            if (comment8 != null) {
                bVar.p.setText(ib.a(activity, ((long) comment8.getCreateTime()) * bVar.r));
            }
            bVar.f90666k.setOnClickListener(bVar);
            bVar.f90666k.setOnLongClickListener(bVar);
            bVar.f90664i.setOnClickListener(new b.f(bVar));
            bVar.f90665j.setOnClickListener(new b.g(bVar));
            bVar.c();
        }
    }
}

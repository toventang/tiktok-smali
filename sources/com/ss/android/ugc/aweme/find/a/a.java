package com.ss.android.ugc.aweme.find.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder;
import com.ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder;
import com.ss.android.ugc.aweme.find.viewholder.RecommendFriendViewHolder;
import com.ss.android.ugc.aweme.find.viewholder.c;
import com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.ss.android.ugc.aweme.utils.bv;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.a.r;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class a extends f<com.ss.android.ugc.aweme.find.viewmodel.a> {

    /* renamed from: a  reason: collision with root package name */
    public String f96013a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f96014b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f96015c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.find.viewmodel.a f96016d = new com.ss.android.ugc.aweme.find.viewmodel.a(-1, 1);

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.find.viewmodel.a f96017e = new com.ss.android.ugc.aweme.find.viewmodel.a(-2, 1);

    static {
        Covode.recordClassIndex(60805);
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final List<com.ss.android.ugc.aweme.find.viewmodel.a> e() {
        List<com.ss.android.ugc.aweme.find.viewmodel.a> list = this.f76354l;
        if (list == null) {
            return z.INSTANCE;
        }
        return list;
    }

    /* renamed from: com.ss.android.ugc.aweme.find.a.a$a  reason: collision with other inner class name */
    static final class C2317a extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(60806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2317a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.this$0.f96014b);
        }
    }

    public final void m() {
        if (e().contains(this.f96017e)) {
            List g2 = n.g((Collection) e());
            g2.remove(this.f96017e);
            b_(g2);
        }
    }

    public final void l() {
        List g2;
        if (!e().contains(this.f96017e)) {
            g2 = n.g((Collection) e());
            g2.add(this.f96017e);
        } else {
            g2 = n.g((Collection) e());
            g2.remove(this.f96017e);
            g2.add(this.f96017e);
        }
        b_(g2);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        return ((com.ss.android.ugc.aweme.find.viewmodel.a) this.f76354l.get(i2)).f96132b;
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<com.ss.android.ugc.aweme.find.viewmodel.a> list) {
        l.d(list, "");
        List e2 = e();
        List g2 = n.g((Collection) list);
        if (!g2.contains(this.f96016d)) {
            g2.add(0, this.f96016d);
        } else if (!l.a(g2.get(0), this.f96016d)) {
            g2.remove(this.f96016d);
            g2.add(0, this.f96016d);
        }
        this.f76354l = g2;
        List list2 = this.f76354l;
        l.b(list2, "");
        bv.a(this, e2, list2);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (i2 == -2) {
            if (viewGroup == null) {
                l.b();
            }
            return new FindFriendsTailViewHolder(viewGroup);
        } else if (i2 == -1) {
            if (viewGroup == null) {
                l.b();
            }
            return new FindFriendsHeaderViewHolder(viewGroup);
        } else if (i2 == 0) {
            if (viewGroup == null) {
                l.b();
            }
            return new c(viewGroup);
        } else if (i2 != 1) {
            RecommendUserService b2 = RecommendUserServiceImpl.b();
            if (viewGroup == null) {
                l.b();
            }
            Context context = viewGroup.getContext();
            l.b(context, "");
            return new RecommendFriendViewHolder(b2.a(context, 6), new C2317a(this), new b(this));
        } else {
            if (viewGroup == null) {
                l.b();
            }
            return new c(viewGroup);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (viewHolder instanceof c) {
            int c2 = c(i2);
            View view = ((c) viewHolder).f96124a;
            if (c2 == 0) {
                View findViewById = view.findViewById(R.id.djx);
                l.b(findViewById, "");
                findViewById.setVisibility(0);
                TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.title);
                l.b(tuxTextView, "");
                tuxTextView.setText(view.getResources().getString(R.string.gic));
                ImageView imageView = (ImageView) view.findViewById(R.id.elj);
                l.b(imageView, "");
                imageView.setVisibility(8);
            } else if (c2 == 1) {
                View findViewById2 = view.findViewById(R.id.djx);
                l.b(findViewById2, "");
                findViewById2.setVisibility(8);
                ImageView imageView2 = (ImageView) view.findViewById(R.id.elj);
                l.b(imageView2, "");
                imageView2.setVisibility(0);
                TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.title);
                l.b(tuxTextView2, "");
                tuxTextView2.setText(view.getResources().getString(R.string.by1));
            }
        } else if (viewHolder instanceof RecommendFriendViewHolder) {
            RecommendFriendViewHolder recommendFriendViewHolder = (RecommendFriendViewHolder) viewHolder;
            User user = ((com.ss.android.ugc.aweme.find.viewmodel.a) e().get(i2)).f96131a;
            if (user != null) {
                recommendFriendViewHolder.f96109d = user;
                FindFriendsViewModel findFriendsViewModel = recommendFriendViewHolder.f96077a;
                String uid = user.getUid();
                l.b(uid, "");
                l.d(uid, "");
                z.e eVar = new z.e();
                eVar.element = "suggest_account";
                findFriendsViewModel.b_(new FindFriendsViewModel.c(uid, eVar));
                recommendFriendViewHolder.f96111f = eVar.element;
                String uid2 = user.getUid();
                l.b(uid2, "");
                recommendFriendViewHolder.f96110e = 0;
                recommendFriendViewHolder.withState(recommendFriendViewHolder.f96077a, new RecommendFriendViewHolder.d(recommendFriendViewHolder, uid2));
                recommendFriendViewHolder.f96112g.a(user);
                com.ss.android.ugc.aweme.follow.widet.a aVar = recommendFriendViewHolder.f96108c;
                if (aVar != null) {
                    aVar.a(user);
                }
                com.ss.android.ugc.aweme.follow.widet.a aVar2 = recommendFriendViewHolder.f96108c;
                if (aVar2 != null) {
                    aVar2.f96287d = new RecommendFriendViewHolder.a(recommendFriendViewHolder, user);
                }
                com.ss.android.ugc.aweme.follow.widet.a aVar3 = recommendFriendViewHolder.f96108c;
                if (aVar3 != null) {
                    aVar3.f96289f = new RecommendFriendViewHolder.b(recommendFriendViewHolder);
                }
                recommendFriendViewHolder.f96112g.setEventListener(new RecommendFriendViewHolder.c(recommendFriendViewHolder, user));
            }
        } else if (viewHolder instanceof FindFriendsHeaderViewHolder) {
            ((FindFriendsHeaderViewHolder) viewHolder).b();
        } else if (viewHolder instanceof FindFriendsTailViewHolder) {
            FindFriendsTailViewHolder findFriendsTailViewHolder = (FindFriendsTailViewHolder) viewHolder;
            findFriendsTailViewHolder.withState(findFriendsTailViewHolder.f96077a, new FindFriendsTailViewHolder.a(findFriendsTailViewHolder));
        }
    }

    static final class b extends m implements r<User, Integer, String, String, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(60807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(4);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ h.z a(User user, Integer num, String str, String str2) {
            User user2 = user;
            int intValue = num.intValue();
            String str3 = str;
            String str4 = str2;
            l.d(user2, "");
            l.d(str3, "");
            l.d(str4, "");
            if (!this.this$0.f96015c.contains(user2.getUid())) {
                com.ss.android.ugc.aweme.friends.e.a.a(user2, intValue, str3, "find_friends");
                u q = new u().q(str4).a("find_friends_page").q(str4);
                q.f109596a = u.c.CARD;
                q.f109597b = u.a.SHOW;
                q.a(user2).s(user2.getRequestId()).f();
                Set<String> set = this.this$0.f96015c;
                String uid = user2.getUid();
                l.b(uid, "");
                set.add(uid);
            }
            return h.z.f158842a;
        }
    }
}

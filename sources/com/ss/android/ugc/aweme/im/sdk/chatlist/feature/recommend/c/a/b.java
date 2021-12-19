package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.chatlist.a.b;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.a;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel;
import com.ss.android.ugc.aweme.recommend.c;
import com.ss.android.ugc.aweme.recommend.f;
import com.zhiliaoapp.musically.R;
import h.f.b.ad;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class b extends RecyclerView.ViewHolder implements c {

    /* renamed from: a  reason: collision with root package name */
    final com.ss.android.ugc.aweme.recommend.b f101975a;

    /* renamed from: b  reason: collision with root package name */
    public final RecommendFriendInDMViewModel f101976b;

    static {
        Covode.recordClassIndex(65251);
    }

    @Override // com.ss.android.ugc.aweme.recommend.c
    public final void a(f fVar) {
        l.d(fVar, "");
        a.b();
        if (fVar == f.CONTACT) {
            b.e eVar = b.e.f101865a;
            l.d(eVar, "");
            androidx.c.a aVar = new androidx.c.a();
            aVar.put("enter_from", "message_rec");
            eVar.invoke("show_user_authorize_pop_up", aVar);
            return;
        }
        r.a("friend_list_notify_show", new d().a("platform", "fb").a("enter_from", "message_rec").f66730a);
    }

    @Override // com.ss.android.ugc.aweme.recommend.c
    public final void b(f fVar) {
        l.d(fVar, "");
        if (fVar == f.CONTACT) {
            this.f101976b.a();
            View view = this.itemView;
            l.b(view, "");
            new com.bytedance.tux.g.b(view).e(R.string.atu).b();
            return;
        }
        this.f101976b.b();
        this.f101976b.a();
        View view2 = this.itemView;
        l.b(view2, "");
        new com.bytedance.tux.g.b(view2).e(R.string.giu).b();
    }

    @Override // com.ss.android.ugc.aweme.recommend.c
    public final void c(f fVar) {
        l.d(fVar, "");
        if (fVar == f.CONTACT) {
            RecommendFriendInDMViewModel recommendFriendInDMViewModel = this.f101976b;
            List<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a> value = recommendFriendInDMViewModel.f101996c.getValue();
            T t = null;
            if (value != null) {
                Iterator<T> it = value.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.f101970c == 1) {
                        t = next;
                        break;
                    }
                }
            }
            List<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a> value2 = recommendFriendInDMViewModel.f101996c.getValue();
            if (value2 != null) {
                Objects.requireNonNull(value2, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                ad.b(value2).remove(t);
            }
            recommendFriendInDMViewModel.f101996c.setValue(recommendFriendInDMViewModel.f101996c.getValue());
            return;
        }
        this.f101976b.b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(com.ss.android.ugc.aweme.recommend.b bVar, RecommendFriendInDMViewModel recommendFriendInDMViewModel) {
        super(bVar.getContainer());
        l.d(bVar, "");
        l.d(recommendFriendInDMViewModel, "");
        this.f101975a = bVar;
        this.f101976b = recommendFriendInDMViewModel;
        bVar.setActionListener(this);
        bVar.setEnterFrom("message_rec");
        bVar.setUFRSubscription(recommendFriendInDMViewModel.f101995b);
    }
}

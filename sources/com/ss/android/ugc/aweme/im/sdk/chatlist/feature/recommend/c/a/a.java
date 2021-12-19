package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.a.k;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.a;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.b;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.e;
import com.ss.android.ugc.aweme.recommend.f;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends t<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a, RecyclerView.ViewHolder> {

    /* renamed from: d  reason: collision with root package name */
    public static final C2545a f101971d = new C2545a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public b.a f101972b;

    /* renamed from: c  reason: collision with root package name */
    public k<User> f101973c;

    /* renamed from: e  reason: collision with root package name */
    private final RecommendFriendInDMViewModel f101974e;

    static {
        Covode.recordClassIndex(65249);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.a.a$a  reason: collision with other inner class name */
    public static final class C2545a {
        static {
            Covode.recordClassIndex(65250);
        }

        private C2545a() {
        }

        public /* synthetic */ C2545a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(RecommendFriendInDMViewModel recommendFriendInDMViewModel) {
        super(new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.b());
        l.d(recommendFriendInDMViewModel, "");
        this.f101974e = recommendFriendInDMViewModel;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        int i3 = ((com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a) a(i2)).f101968a;
        if (i3 == 1) {
            return 1011;
        }
        if (i3 != 2) {
            return 1013;
        }
        return 1012;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        f fVar;
        User user;
        l.d(viewHolder, "");
        switch (getItemViewType(i2)) {
            case 1011:
                if (viewHolder instanceof b) {
                    b.a aVar = this.f101972b;
                    if (aVar != null) {
                        b bVar = (b) viewHolder;
                        l.d(aVar, "");
                        bVar.f101991b.setOnClickListener(new b.View$OnClickListenerC2547b(bVar, aVar));
                    }
                    View view = viewHolder.itemView;
                    l.b(view, "");
                    String string = view.getContext().getString(R.string.ey_);
                    l.b(string, "");
                    b bVar2 = (b) viewHolder;
                    l.d(string, "");
                    bVar2.f101990a.setText(string);
                    bVar2.f101991b.setIconRes(R.raw.icon_info_circle);
                    return;
                }
                return;
            case 1012:
                if (viewHolder instanceof b) {
                    b bVar3 = (b) viewHolder;
                    if (((com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a) a(i2)).f101970c == 1) {
                        fVar = f.CONTACT;
                    } else {
                        fVar = f.FACEBOOK;
                    }
                    bVar3.f101975a.a(fVar, e.INBOX_NORMAL, -1);
                    com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.a.a();
                    return;
                }
                return;
            case 1013:
                if ((viewHolder instanceof com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.a) && (user = ((com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a) a(i2)).f101969b) != null) {
                    com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.a aVar2 = (com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.a) viewHolder;
                    aVar2.f101977a = this.f101973c;
                    l.d(user, "");
                    boolean d2 = IMUnder16ProxyImpl.n().d();
                    if (in.d() || d2) {
                        aVar2.f101979c.a(false);
                    } else {
                        aVar2.f101979c.a(true);
                    }
                    aVar2.f101979c.a(user);
                    com.ss.android.ugc.aweme.follow.widet.a aVar3 = aVar2.f101978b;
                    if (aVar3 != null) {
                        aVar3.a(user);
                    }
                    com.ss.android.ugc.aweme.follow.widet.a aVar4 = aVar2.f101978b;
                    if (aVar4 != null) {
                        aVar4.f96288e = new a.C2546a(aVar2, user, d2);
                    }
                    com.ss.android.ugc.aweme.follow.widet.a aVar5 = aVar2.f101978b;
                    if (aVar5 != null) {
                        aVar5.f96287d = new a.b(aVar2, user);
                    }
                    com.ss.android.ugc.aweme.follow.widet.a aVar6 = aVar2.f101978b;
                    if (aVar6 != null) {
                        aVar6.f96289f = new a.c(aVar2, user);
                    }
                    aVar2.f101979c.setEventListener(new a.d(aVar2, user));
                    com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.a.a();
                    return;
                }
                return;
            default:
                return;
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(5621);
        l.d(viewGroup, "");
        if (i2 == 1011) {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.mi, viewGroup, false);
            l.b(a3, "");
            viewHolder = new b(a3);
        } else if (i2 != 1012) {
            RecommendUserService b2 = RecommendUserServiceImpl.b();
            Context context = viewGroup.getContext();
            l.b(context, "");
            viewHolder = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.a(b2.a(context, 7), aVar.f101974e);
        } else {
            RecommendUserService b3 = RecommendUserServiceImpl.b();
            Context context2 = viewGroup.getContext();
            l.b(context2, "");
            viewHolder = new b(b3.a(context2), aVar.f101974e);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(5621);
        return viewHolder;
    }
}

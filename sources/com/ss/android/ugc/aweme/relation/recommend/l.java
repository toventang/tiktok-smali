package com.ss.android.ugc.aweme.relation.recommend;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.ss.android.ugc.aweme.relation.recommend.t;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.m;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class l extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    final List<k> f120444a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<String> f120445b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public final int f120446c;

    /* renamed from: d  reason: collision with root package name */
    public final p<String, String> f120447d;

    static {
        Covode.recordClassIndex(78392);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public enum a {
        HEADER(0),
        RECOMMEND_FRIEND(1);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(78393);
        }

        private a(int i2) {
            this.value = i2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f120444a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return this.f120444a.get(i2).f120442c.getValue();
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<User, z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(78394);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(User user) {
            User user2 = user;
            h.f.b.l.d(user2, "");
            if (!this.this$0.f120445b.contains(user2.getUid())) {
                u a2 = new u().a("on_boarding");
                a2.f109596a = u.c.CARD;
                a2.f109597b = u.a.SHOW;
                if (this.this$0.f120446c == 2) {
                    user2.setRecType("1-2");
                } else {
                    user2.setRecType("1-1");
                }
                a2.a(user2).s(user2.getRequestId()).f();
                Set<String> set = this.this$0.f120445b;
                String uid = user2.getUid();
                h.f.b.l.b(uid, "");
                set.add(uid);
            }
            return z.f158842a;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        h.f.b.l.d(viewHolder, "");
        if (viewHolder instanceof c) {
            k kVar = this.f120444a.get(i2);
            Objects.requireNonNull(kVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.recommend.HeaderItem");
            b bVar = (b) kVar;
            c cVar = (c) viewHolder;
            String str = bVar.f120407a;
            String str2 = bVar.f120408b;
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (TextUtils.isEmpty(str)) {
                TuxTextView tuxTextView = (TuxTextView) cVar.f120410a.findViewById(R.id.title);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setVisibility(8);
            } else {
                TuxTextView tuxTextView2 = (TuxTextView) cVar.f120410a.findViewById(R.id.title);
                h.f.b.l.b(tuxTextView2, "");
                tuxTextView2.setText(str);
                ((TuxTextView) cVar.f120410a.findViewById(R.id.title)).a(38.0f);
                TuxTextView tuxTextView3 = (TuxTextView) cVar.f120410a.findViewById(R.id.title);
                h.f.b.l.b(tuxTextView3, "");
                com.ss.android.ugc.aweme.relation.b.a.a(tuxTextView3);
            }
            if (TextUtils.isEmpty(str2)) {
                TuxTextView tuxTextView4 = (TuxTextView) cVar.f120410a.findViewById(R.id.dwk);
                h.f.b.l.b(tuxTextView4, "");
                tuxTextView4.setVisibility(8);
                return;
            }
            TuxTextView tuxTextView5 = (TuxTextView) cVar.f120410a.findViewById(R.id.dwk);
            h.f.b.l.b(tuxTextView5, "");
            tuxTextView5.setText(str2);
            TuxTextView tuxTextView6 = (TuxTextView) cVar.f120410a.findViewById(R.id.dwk);
            h.f.b.l.b(tuxTextView6, "");
            com.ss.android.ugc.aweme.relation.b.a.a(tuxTextView6);
        } else if (viewHolder instanceof t) {
            k kVar2 = this.f120444a.get(i2);
            Objects.requireNonNull(kVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.recommend.FriendItem");
            int i3 = i2 - 1;
            t tVar = (t) viewHolder;
            User user = ((a) kVar2).f120406a;
            if (user != null) {
                tVar.f120473b = user;
                tVar.f120474c = i3;
                tVar.f120476e.a(user);
                com.ss.android.ugc.aweme.follow.widet.a aVar = tVar.f120472a;
                if (aVar != null) {
                    aVar.a(user);
                }
                com.ss.android.ugc.aweme.follow.widet.a aVar2 = tVar.f120472a;
                if (aVar2 != null) {
                    aVar2.f96287d = new t.a(tVar, user);
                }
                com.ss.android.ugc.aweme.follow.widet.a aVar3 = tVar.f120472a;
                if (aVar3 != null) {
                    aVar3.f96289f = new t.b(tVar, user);
                }
            }
        }
    }

    public l(int i2, p<String, String> pVar, List<? extends User> list) {
        h.f.b.l.d(pVar, "");
        h.f.b.l.d(list, "");
        this.f120446c = i2;
        this.f120447d = pVar;
        ArrayList arrayList = new ArrayList();
        this.f120444a = arrayList;
        arrayList.clear();
        arrayList.add(new b(pVar.getFirst(), pVar.getSecond()));
        ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            t.setRecType("1-2");
            arrayList2.add(new a(t));
        }
        arrayList.addAll(arrayList2);
    }

    private static RecyclerView.ViewHolder a(l lVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(11562);
        h.f.b.l.d(viewGroup, "");
        if (i2 == a.HEADER.getValue()) {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2u, viewGroup, false);
            h.f.b.l.b(a3, "");
            viewHolder = new c(a3);
        } else {
            RecommendUserService b2 = RecommendUserServiceImpl.b();
            Context context = viewGroup.getContext();
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.recommend.a a4 = b2.a(context, 8);
            a4.getView().setClickable(false);
            a4.getView().setEnabled(false);
            viewHolder = new t(lVar.f120446c, a4, new b(lVar));
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
        MethodCollector.o(11562);
        return viewHolder;
    }
}

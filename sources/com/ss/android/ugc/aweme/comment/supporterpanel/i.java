package com.ss.android.ugc.aweme.comment.supporterpanel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class i extends RecyclerView.a<a<?>> {

    /* renamed from: c  reason: collision with root package name */
    public static final b f72398c = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<Object> f72399a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f72400b;

    static {
        Covode.recordClassIndex(44632);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a<?> onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(44634);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f72399a.size();
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f72405a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f72406b;

        static {
            Covode.recordClassIndex(44639);
        }

        f(i iVar, List list) {
            this.f72405a = iVar;
            this.f72406b = list;
        }

        public final void run() {
            this.f72405a.f72399a.addAll(this.f72406b);
            this.f72405a.notifyDataSetChanged();
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f72407a;

        static {
            Covode.recordClassIndex(44640);
        }

        g(i iVar) {
            this.f72407a = iVar;
        }

        public final void run() {
            this.f72407a.f72399a.add("1");
            i iVar = this.f72407a;
            iVar.notifyItemInserted(iVar.f72399a.size() - 1);
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f72408a;

        static {
            Covode.recordClassIndex(44641);
        }

        h(i iVar) {
            this.f72408a = iVar;
        }

        public final void run() {
            this.f72408a.f72399a.add(1);
            i iVar = this.f72408a;
            iVar.notifyItemInserted(iVar.f72399a.size() - 1);
        }
    }

    public static abstract class a<T> extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(44633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.d(view, "");
        }
    }

    public final class c extends a<d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f72401a;

        static {
            Covode.recordClassIndex(44635);
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f72402a;

            static {
                Covode.recordClassIndex(44636);
            }

            a(d dVar) {
                this.f72402a = dVar;
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                l.b(view, "");
                SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/");
                User user = this.f72402a.f72372a;
                String str2 = null;
                if (user != null) {
                    str = user.getUid();
                } else {
                    str = null;
                }
                SmartRoute withParam = buildRoute.withParam("uid", str);
                User user2 = this.f72402a.f72372a;
                if (user2 != null) {
                    str2 = user2.getSecUid();
                }
                withParam.withParam("sec_user_id", str2).withParam("profile_enterprise_type", 0).open();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(i iVar, View view) {
            super(view);
            l.d(view, "");
            this.f72401a = iVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        Object obj = this.f72399a.get(i2);
        if (obj instanceof d) {
            return 0;
        }
        if (obj instanceof Integer) {
            return 1;
        }
        if (obj instanceof String) {
            return 2;
        }
        throw new IllegalArgumentException("Invalid type of data ".concat(String.valueOf(i2)));
    }

    public final class d extends a<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f72403a;

        static {
            Covode.recordClassIndex(44637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(i iVar, View view) {
            super(view);
            l.d(view, "");
            this.f72403a = iVar;
        }
    }

    public final class e extends a<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f72404a;

        static {
            Covode.recordClassIndex(44638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(i iVar, View view) {
            super(view);
            l.d(view, "");
            this.f72404a = iVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a<?> aVar, int i2) {
        String str;
        UrlModel avatarThumb;
        List<String> urlList;
        a<?> aVar2 = aVar;
        l.d(aVar2, "");
        Object obj = this.f72399a.get(i2);
        if (aVar2 instanceof c) {
            c cVar = (c) aVar2;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.supporterpanel.GiftSender");
            d dVar = (d) obj;
            l.d(dVar, "");
            SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) cVar.itemView.findViewById(R.id.bbw);
            TuxTextView tuxTextView = (TuxTextView) cVar.itemView.findViewById(R.id.bbz);
            TuxTextView tuxTextView2 = (TuxTextView) cVar.itemView.findViewById(R.id.aaq);
            String str2 = null;
            if (smartAvatarImageView != null) {
                User user = dVar.f72372a;
                if (user == null || (avatarThumb = user.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null) {
                    str = null;
                } else {
                    str = urlList.get(0);
                }
                smartAvatarImageView.setImageURI(str);
            }
            if (tuxTextView != null) {
                User user2 = dVar.f72372a;
                if (user2 != null) {
                    str2 = user2.getUniqueId();
                }
                tuxTextView.setText(str2);
            }
            if (tuxTextView2 != null) {
                tuxTextView2.setText(dVar.f72374c);
            }
            smartAvatarImageView.setOnClickListener(new c.a(dVar));
        } else if (aVar2 instanceof e) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Any");
            l.d(obj, "");
            ((TuxDualBallView) ((e) aVar2).itemView.findViewById(R.id.bc7)).b();
        } else if (aVar2 instanceof d) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Any");
            l.d(obj, "");
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static RecyclerView.ViewHolder a(i iVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.i(1202);
        l.d(viewGroup, "");
        boolean z = true;
        if (i2 == 0) {
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ix, viewGroup, false);
            l.b(a2, "");
            viewHolder = new c(iVar, a2);
        } else if (i2 == 1) {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.io, viewGroup, false);
            l.b(a3, "");
            viewHolder = new e(iVar, a3);
        } else if (i2 == 2) {
            View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.in, viewGroup, false);
            l.b(a4, "");
            viewHolder = new d(iVar, a4);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid view type");
            MethodCollector.o(1202);
            throw illegalArgumentException;
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
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
        MethodCollector.o(1202);
        return viewHolder;
    }
}

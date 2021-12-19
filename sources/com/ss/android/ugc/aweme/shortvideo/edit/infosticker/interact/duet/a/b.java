package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetStickerRecommendViewModel;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public final class b extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public LinkedHashSet<User> f127274a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.a<z> f127275b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f127276c;

    /* renamed from: d  reason: collision with root package name */
    public DuetStickerRecommendViewModel f127277d;

    /* renamed from: e  reason: collision with root package name */
    public m<? super User, ? super Boolean, z> f127278e;

    /* renamed from: f  reason: collision with root package name */
    public List<String> f127279f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<User> f127280g;

    static {
        Covode.recordClassIndex(83476);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f127280g.size();
    }

    public /* synthetic */ b() {
        this(new ArrayList());
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final a f127281a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f127282b;

        static {
            Covode.recordClassIndex(83477);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.b$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC3304a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f127283a;

            static {
                Covode.recordClassIndex(83478);
            }

            View$OnClickListenerC3304a(a aVar) {
                this.f127283a = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                h.f.a.a<z> aVar = this.f127283a.f127282b.f127275b;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        public final boolean a(User user) {
            l.d(user, "");
            Iterator<User> it = this.f127282b.f127274a.iterator();
            while (it.hasNext()) {
                User next = it.next();
                String secUid = user.getSecUid();
                l.b(next, "");
                if (l.a((Object) secUid, (Object) next.getSecUid())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.b$a$b  reason: collision with other inner class name */
        static final class View$OnClickListenerC3305b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f127284a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ User f127285b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f127286c;

            static {
                Covode.recordClassIndex(83479);
            }

            View$OnClickListenerC3305b(a aVar, User user, a aVar2) {
                this.f127284a = aVar;
                this.f127285b = user;
                this.f127286c = aVar2;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f127284a.f127282b.f127279f.contains(this.f127285b.getUid())) {
                    new com.bytedance.tux.g.b(this.f127284a.f127281a).e(R.string.d3f).b();
                } else if (!this.f127284a.f127282b.f127276c || this.f127286c.getCheckBox().isChecked()) {
                    if (this.f127286c.getCheckBox().isChecked()) {
                        this.f127286c.getCheckBox().setChecked(false);
                        Iterator<User> it = this.f127284a.f127282b.f127274a.iterator();
                        l.b(it, "");
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            User next = it.next();
                            l.b(next, "");
                            if (l.a((Object) next.getSecUid(), (Object) this.f127285b.getSecUid())) {
                                it.remove();
                                break;
                            }
                        }
                        if (this.f127284a.f127282b.f127274a.size() == 29) {
                            this.f127284a.f127282b.f127276c = false;
                            this.f127284a.f127282b.notifyDataSetChanged();
                        }
                    } else {
                        this.f127286c.getCheckBox().setChecked(true);
                        this.f127284a.f127282b.f127274a.add(this.f127285b);
                        if (this.f127284a.f127282b.f127274a.size() == 30) {
                            this.f127284a.f127282b.f127276c = true;
                            this.f127284a.f127282b.notifyDataSetChanged();
                        }
                        m<? super User, ? super Boolean, z> mVar = this.f127284a.f127282b.f127278e;
                        if (mVar != null) {
                            mVar.invoke(this.f127285b, true);
                        }
                    }
                    DuetStickerRecommendViewModel duetStickerRecommendViewModel = this.f127284a.f127282b.f127277d;
                    if (duetStickerRecommendViewModel != null) {
                        duetStickerRecommendViewModel.a(this.f127284a.f127282b.f127274a);
                    }
                } else {
                    new com.bytedance.tux.g.b(this.f127284a.f127281a).e(R.string.bel).b();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, a aVar) {
            super(aVar);
            l.d(aVar, "");
            this.f127282b = bVar;
            this.f127281a = aVar;
        }
    }

    private b(ArrayList<User> arrayList) {
        l.d(arrayList, "");
        this.f127280g = arrayList;
        this.f127274a = new LinkedHashSet<>();
        this.f127279f = new ArrayList();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        com.ss.android.ugc.aweme.base.l lVar;
        a aVar2 = aVar;
        l.d(aVar2, "");
        if (i2 == this.f127280g.size() - 1) {
            aVar2.f127281a.setOnClickListener(new a.View$OnClickListenerC3304a(aVar2));
            a aVar3 = aVar2.f127281a;
            FrameLayout frameLayout = aVar3.f127273d;
            if (frameLayout == null) {
                l.a("checkLayout");
            }
            frameLayout.setVisibility(8);
            TuxTextView tuxTextView = aVar3.f127271b;
            if (tuxTextView == null) {
                l.a("userName");
            }
            Context context = aVar3.getContext();
            l.b(context, "");
            tuxTextView.setText(context.getResources().getString(R.string.d5x));
            v a2 = r.a(2131230945);
            SmartCircleImageView smartCircleImageView = aVar3.f127270a;
            if (smartCircleImageView == null) {
                l.a("avatar");
            }
            a2.E = smartCircleImageView;
            a2.c();
            return;
        }
        User user = this.f127280g.get(i2);
        l.b(user, "");
        User user2 = user;
        l.d(user2, "");
        View view = aVar2.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.recycleView.DuetRecommendUserItemView");
        a aVar4 = (a) view;
        FrameLayout frameLayout2 = aVar4.f127273d;
        if (frameLayout2 == null) {
            l.a("checkLayout");
        }
        frameLayout2.setVisibility(0);
        aVar2.itemView.setOnClickListener(new a.View$OnClickListenerC3305b(aVar2, user2, aVar4));
        UrlModel avatarThumb = user2.getAvatarThumb();
        if (avatarThumb == null) {
            lVar = null;
        } else {
            lVar = new com.ss.android.ugc.aweme.base.l(avatarThumb.getUri(), avatarThumb.getUrlList());
        }
        v a3 = r.a(lVar);
        a3.E = aVar4.getAvatar();
        a3.c();
        aVar4.getUserName().setText(user2.getNickname());
        aVar4.getCheckBox().setChecked(aVar2.a(user2));
        if ((!aVar2.f127282b.f127276c || aVar4.getCheckBox().isChecked()) && !aVar2.f127282b.f127279f.contains(user2.getUid())) {
            View rootView = aVar4.getRootView();
            l.b(rootView, "");
            rootView.setAlpha(1.0f);
            return;
        }
        View rootView2 = aVar4.getRootView();
        l.b(rootView2, "");
        rootView2.setAlpha(0.3f);
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(7014);
        l.d(viewGroup, "");
        Context context = viewGroup.getContext();
        l.b(context, "");
        a aVar = new a(bVar, new a(context));
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar.getClass().getName();
        MethodCollector.o(7014);
        return aVar;
    }
}

package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.e;
import com.ss.android.ugc.aweme.search.model.i;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetStickerSearchViewModel;
import com.ss.android.ugc.aweme.shortvideo.util.bn;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public final class c extends com.ss.android.ugc.tools.view.b.c {

    /* renamed from: a  reason: collision with root package name */
    public LinkedHashSet<User> f127287a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public List<String> f127288b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<User> f127289c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<e> f127290d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f127291e;

    /* renamed from: f  reason: collision with root package name */
    public DuetStickerSearchViewModel f127292f;

    /* renamed from: g  reason: collision with root package name */
    public m<? super User, ? super Boolean, z> f127293g;

    /* renamed from: h  reason: collision with root package name */
    public String f127294h = "";

    static {
        Covode.recordClassIndex(83480);
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final int a() {
        return this.f127289c.size() + this.f127290d.size();
    }

    public final List<String> b() {
        String userId;
        ArrayList<User> arrayList = this.f127289c;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            String uid = it.next().getUid();
            if (uid != null) {
                arrayList2.add(uid);
            }
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList<e> arrayList4 = this.f127290d;
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            i iVar = it2.next().f121524g;
            if (!(iVar == null || (userId = iVar.getUserId()) == null)) {
                arrayList5.add(userId);
            }
        }
        return n.d((Collection) arrayList3, (Iterable) arrayList5);
    }

    public final void a(String str) {
        l.d(str, "");
        this.f127294h = str;
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final d f127295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f127296b;

        static {
            Covode.recordClassIndex(83481);
        }

        private static com.ss.android.ugc.aweme.base.l a(UrlModel urlModel) {
            if (urlModel == null) {
                return null;
            }
            return new com.ss.android.ugc.aweme.base.l(urlModel.getUri(), urlModel.getUrlList());
        }

        private boolean b(User user) {
            l.d(user, "");
            Iterator<User> it = this.f127296b.f127287a.iterator();
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

        public final void a(User user) {
            l.d(user, "");
            View view = this.itemView;
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.recycleView.DuetStickerSearchUserItemUserView");
            d dVar = (d) view;
            this.itemView.setOnClickListener(new View$OnClickListenerC3306a(this, user, dVar));
            v a2 = r.a(a(user.getAvatarThumb()));
            a2.E = dVar.getAvatar();
            a2.c();
            dVar.getUserName().setText(bn.a(user));
            dVar.getNickName().setText(user.getNickname());
            dVar.getCheckBox().setChecked(b(user));
            if ((!this.f127296b.f127291e || dVar.getCheckBox().isChecked()) && !this.f127296b.f127288b.contains(user.getUid())) {
                dVar.b();
            } else {
                dVar.a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.c$a$a  reason: collision with other inner class name */
        public static final class View$OnClickListenerC3306a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f127297a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ User f127298b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d f127299c;

            static {
                Covode.recordClassIndex(83482);
            }

            View$OnClickListenerC3306a(a aVar, User user, d dVar) {
                this.f127297a = aVar;
                this.f127298b = user;
                this.f127299c = dVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f127297a.f127296b.f127288b.contains(this.f127298b.getUid())) {
                    new b(this.f127299c).e(R.string.d3f).b();
                } else if (!this.f127297a.f127296b.f127291e || this.f127299c.getCheckBox().isChecked()) {
                    if (this.f127299c.getCheckBox().isChecked()) {
                        this.f127299c.getCheckBox().setChecked(false);
                        Iterator<User> it = this.f127297a.f127296b.f127287a.iterator();
                        l.b(it, "");
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            User next = it.next();
                            l.b(next, "");
                            if (l.a((Object) next.getSecUid(), (Object) this.f127298b.getSecUid())) {
                                it.remove();
                                break;
                            }
                        }
                        if (this.f127297a.f127296b.f127287a.size() == 29) {
                            this.f127297a.f127296b.f127291e = false;
                            this.f127297a.f127296b.notifyDataSetChanged();
                        }
                    } else {
                        this.f127299c.getCheckBox().setChecked(true);
                        this.f127297a.f127296b.f127287a.add(this.f127298b);
                        if (this.f127297a.f127296b.f127287a.size() == 30) {
                            this.f127297a.f127296b.f127291e = true;
                            this.f127297a.f127296b.notifyDataSetChanged();
                        }
                        m<? super User, ? super Boolean, z> mVar = this.f127297a.f127296b.f127293g;
                        if (mVar != null) {
                            mVar.invoke(this.f127298b, false);
                        }
                    }
                    DuetStickerSearchViewModel duetStickerSearchViewModel = this.f127297a.f127296b.f127292f;
                    if (duetStickerSearchViewModel != null) {
                        duetStickerSearchViewModel.a(this.f127297a.f127296b.f127287a);
                    }
                } else {
                    new b(this.f127299c).e(R.string.bel).b();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, d dVar) {
            super(dVar);
            l.d(dVar, "");
            this.f127296b = cVar;
            this.f127295a = dVar;
        }
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (viewGroup == null) {
            l.b();
        }
        Context context = viewGroup.getContext();
        l.b(context, "");
        return new a(this, new d(context));
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (viewHolder != null) {
            if (i2 < this.f127289c.size()) {
                User user = this.f127289c.get(i2);
                l.b(user, "");
                ((a) viewHolder).a(user);
                return;
            }
            a aVar = (a) viewHolder;
            e eVar = this.f127290d.get(i2 - this.f127289c.size());
            l.b(eVar, "");
            e eVar2 = eVar;
            l.d(eVar2, "");
            i iVar = eVar2.f121524g;
            if (iVar != null) {
                aVar.a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.e.a(iVar));
            }
        }
    }
}

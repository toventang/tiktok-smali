package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.l;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.e;
import com.ss.android.ugc.aweme.search.model.i;
import com.ss.android.ugc.aweme.shortvideo.util.bn;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.views.d;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.b;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class c extends RecyclerView.a<com.bytedance.ies.dmt.ui.a.a<User>> {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends User> f127705a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends e> f127706b;

    /* renamed from: c  reason: collision with root package name */
    public String f127707c = "";

    /* renamed from: d  reason: collision with root package name */
    public a f127708d;

    /* renamed from: e  reason: collision with root package name */
    public User f127709e;

    /* renamed from: f  reason: collision with root package name */
    public List<String> f127710f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final Set<String> f127711g = new LinkedHashSet();

    public interface a {
        static {
            Covode.recordClassIndex(83714);
        }

        String a();
    }

    static {
        Covode.recordClassIndex(83713);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ com.bytedance.ies.dmt.ui.a.a<User> onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        int i2;
        List<? extends User> list = this.f127705a;
        int i3 = 0;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        List<? extends e> list2 = this.f127706b;
        if (list2 != null) {
            i3 = list2.size();
        }
        return i2 + i3;
    }

    public final List<String> a() {
        ArrayList arrayList;
        String userId;
        List<? extends User> list = this.f127705a;
        ArrayList arrayList2 = null;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String uid = it.next().getUid();
                if (uid != null) {
                    arrayList3.add(uid);
                }
            }
            arrayList2 = arrayList3;
        }
        List<? extends e> list2 = this.f127706b;
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                i iVar = it2.next().f121524g;
                if (!(iVar == null || (userId = iVar.getUserId()) == null)) {
                    arrayList4.add(userId);
                }
            }
            arrayList = arrayList4;
        } else {
            arrayList = z.INSTANCE;
        }
        if (arrayList2 != null) {
            return n.d((Collection) arrayList2, arrayList);
        }
        return z.INSTANCE;
    }

    public final class b extends com.bytedance.ies.dmt.ui.a.a<User> {

        /* renamed from: a  reason: collision with root package name */
        public View f127712a;

        /* renamed from: b  reason: collision with root package name */
        public SmartImageView f127713b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f127714c;

        /* renamed from: d  reason: collision with root package name */
        public final View f127715d;

        /* renamed from: e  reason: collision with root package name */
        public final c f127716e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c f127717f;

        /* access modifiers changed from: package-private */
        public static final class a implements View.OnTouchListener {

            /* renamed from: a  reason: collision with root package name */
            public static final a f127718a = new a();

            static {
                Covode.recordClassIndex(83716);
            }

            a() {
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        }

        static {
            Covode.recordClassIndex(83715);
        }

        private static l a(UrlModel urlModel) {
            if (urlModel == null) {
                return null;
            }
            return new l(urlModel.getUri(), urlModel.getUrlList());
        }

        private final void a(boolean z) {
            int color;
            GradientDrawable gradientDrawable;
            TextView textView = this.f127714c;
            Context context = this.f127715d.getContext();
            h.f.b.l.b(context, "");
            Resources resources = context.getResources();
            if (z) {
                color = resources.getColor(R.color.bh);
            } else {
                color = resources.getColor(R.color.a_);
            }
            textView.setTextColor(color);
            View view = this.f127712a;
            if (z) {
                com.ss.android.ugc.tools.view.style.b a2 = b.a.a().a(1);
                Context context2 = this.f127715d.getContext();
                h.f.b.l.b(context2, "");
                int color2 = context2.getResources().getColor(R.color.bh);
                Context context3 = this.f127712a.getContext();
                h.f.b.l.b(context3, "");
                gradientDrawable = a2.a(color2, (int) r.a(context3, 2.0f)).b(0).a();
            } else {
                gradientDrawable = null;
            }
            view.setBackground(gradientDrawable);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.c$b$b  reason: collision with other inner class name */
        public static final class C3324b extends d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f127719a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ User f127720b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z.e f127721c;

            static {
                Covode.recordClassIndex(83717);
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                String str;
                com.ss.android.ugc.aweme.common.r.a("tag_mention_head_click", new com.ss.android.ugc.tools.f.b().a("previous_page", "video_post_page").a("to_user_id", this.f127720b.getUid()).a("user_type", (String) this.f127721c.element).a("search_keyword", this.f127719a.f127717f.f127707c).a("function", "mention").a("is_valid", String.valueOf(!this.f127719a.f127717f.f127710f.contains(this.f127720b.getUid()) ? 1 : 0)).a("click_type", "choose").a("enter_from", "video_edit_page").f149193a);
                if (this.f127719a.f127717f.f127710f.contains(this.f127720b.getUid())) {
                    new com.bytedance.tux.g.b(this.f127719a.f127715d).e(R.string.d3f).b();
                    return;
                }
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("search_keyword", this.f127719a.f127717f.f127707c);
                ac acVar = ac.a.f91473a;
                a aVar = this.f127719a.f127717f.f127708d;
                if (aVar != null) {
                    str = aVar.a();
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.common.r.a("add_video_at", a2.a("log_pb", acVar.a(str)).a("to_user_id", this.f127720b.getUid()).a("relation_tag", this.f127720b.getFollowStatus()).a("enter_from", "video_edit_page").f149193a);
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.a(this.f127720b));
            }

            C3324b(b bVar, User user, z.e eVar) {
                this.f127719a = bVar;
                this.f127720b = user;
                this.f127721c = eVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.c$b$c  reason: collision with other inner class name */
        public static final class View$OnAttachStateChangeListenerC3325c implements View.OnAttachStateChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f127722a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ User f127723b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f127724c;

            static {
                Covode.recordClassIndex(83718);
            }

            public final void onViewDetachedFromWindow(View view) {
                h.f.b.l.d(view, "");
            }

            public final void onViewAttachedToWindow(View view) {
                h.f.b.l.d(view, "");
                if (!this.f127722a.f127717f.f127711g.contains(this.f127723b.getUid())) {
                    com.ss.android.ugc.aweme.common.r.a("tag_mention_head_show", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("previous_page", "video_post_page").a("to_user_id", this.f127723b.getUid()).a("user_type", this.f127724c).a("search_keyword", "").a("function", "mention").a("is_valid", String.valueOf(!this.f127722a.f127717f.f127710f.contains(this.f127723b.getUid()) ? 1 : 0)).f149193a);
                    Set<String> set = this.f127722a.f127717f.f127711g;
                    String uid = this.f127723b.getUid();
                    h.f.b.l.b(uid, "");
                    set.add(uid);
                }
            }

            View$OnAttachStateChangeListenerC3325c(b bVar, User user, String str) {
                this.f127722a = bVar;
                this.f127723b = user;
                this.f127724c = str;
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(User user) {
            float f2;
            z.e eVar = new z.e();
            eVar.element = "all_user";
            List<? extends User> list = this.f127717f.f127705a;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (h.f.b.l.a((Object) user.getUid(), (Object) it.next().getUid())) {
                        eVar.element = "follow";
                    }
                }
            }
            a(user, eVar.element);
            this.f127714c.setText(bn.a(user));
            String str = null;
            this.f127714c.setBackground(null);
            View view = this.f127715d;
            if (this.f127717f.f127710f.contains(user.getUid())) {
                f2 = 0.3f;
            } else {
                f2 = 1.0f;
            }
            view.setAlpha(f2);
            v a2 = com.bytedance.lighten.a.r.a(a(user.getAvatarThumb()));
            e.a aVar = new e.a();
            aVar.f39827a = true;
            a2.w = aVar.a();
            a2.E = this.f127713b;
            a2.c();
            String uid = user.getUid();
            User user2 = this.f127717f.f127709e;
            if (user2 != null) {
                str = user2.getUid();
            }
            a(h.f.b.l.a((Object) uid, (Object) str));
            this.f127715d.setOnTouchListener(a.f127718a);
            this.f127715d.setOnClickListener(new C3324b(this, user, eVar));
        }

        private final void a(User user, String str) {
            this.itemView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC3325c(this, user, str));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, View view, c cVar2) {
            super(view);
            h.f.b.l.d(view, "");
            h.f.b.l.d(cVar2, "");
            this.f127717f = cVar;
            this.f127715d = view;
            this.f127716e = cVar2;
            View findViewById = view.findViewById(R.id.btu);
            h.f.b.l.b(findViewById, "");
            this.f127712a = findViewById;
            View findViewById2 = view.findViewById(R.id.btv);
            h.f.b.l.b(findViewById2, "");
            this.f127713b = (SmartImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.evk);
            h.f.b.l.b(findViewById3, "");
            this.f127714c = (TextView) findViewById3;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(com.bytedance.ies.dmt.ui.a.a<User> aVar, int i2) {
        int i3;
        com.bytedance.ies.dmt.ui.a.a<User> aVar2 = aVar;
        h.f.b.l.d(aVar2, "");
        List<? extends User> list = this.f127705a;
        if (list != null) {
            i3 = list.size();
        } else {
            i3 = 0;
        }
        if (i2 < i3) {
            List<? extends User> list2 = this.f127705a;
            if (list2 != null) {
                if (!(aVar2 instanceof b)) {
                    aVar2 = null;
                }
                b bVar = (b) aVar2;
                if (bVar != null) {
                    User user = (User) list2.get(i2);
                    h.f.b.l.d(user, "");
                    bVar.a(user);
                    return;
                }
                return;
            }
            return;
        }
        List<? extends com.ss.android.ugc.aweme.search.model.e> list3 = this.f127706b;
        if (list3 != null) {
            if (!(aVar2 instanceof b)) {
                aVar2 = null;
            }
            b bVar2 = (b) aVar2;
            if (bVar2 != null) {
                com.ss.android.ugc.aweme.search.model.e eVar = (com.ss.android.ugc.aweme.search.model.e) list3.get(i2 - i3);
                h.f.b.l.d(eVar, "");
                i iVar = eVar.f121524g;
                if (iVar != null) {
                    bVar2.a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.e.a(iVar));
                }
            }
        }
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(6192);
        h.f.b.l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9m, viewGroup, false);
        h.f.b.l.b(a3, "");
        b bVar = new b(cVar, a3, cVar);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = bVar.getClass().getName();
        MethodCollector.o(6192);
        return bVar;
    }
}

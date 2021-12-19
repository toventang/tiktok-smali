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
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b;
import com.ss.android.ugc.aweme.shortvideo.util.bn;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.views.d;
import com.ss.android.ugc.tools.view.style.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class a extends RecyclerView.a<com.bytedance.ies.dmt.ui.a.a<User>> {

    /* renamed from: a  reason: collision with root package name */
    public User f127681a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends User> f127682b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f127683c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<String> f127684d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public b.a.C3327a f127685e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<String> f127686f = new LinkedHashSet();

    static {
        Covode.recordClassIndex(83706);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ com.bytedance.ies.dmt.ui.a.a<User> onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List<? extends User> list = this.f127682b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.a$a  reason: collision with other inner class name */
    public final class C3322a extends com.bytedance.ies.dmt.ui.a.a<User> {

        /* renamed from: a  reason: collision with root package name */
        public View f127687a;

        /* renamed from: b  reason: collision with root package name */
        public SmartImageView f127688b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f127689c;

        /* renamed from: d  reason: collision with root package name */
        public final View f127690d;

        /* renamed from: e  reason: collision with root package name */
        public final a f127691e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f127692f;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.a$a$a  reason: collision with other inner class name */
        static final class View$OnTouchListenerC3323a implements View.OnTouchListener {

            /* renamed from: a  reason: collision with root package name */
            public static final View$OnTouchListenerC3323a f127693a = new View$OnTouchListenerC3323a();

            static {
                Covode.recordClassIndex(83708);
            }

            View$OnTouchListenerC3323a() {
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        }

        static {
            Covode.recordClassIndex(83707);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.a$a$b */
        public static final class b extends d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3322a f127694a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ User f127695b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f127696c;

            static {
                Covode.recordClassIndex(83709);
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                r.a("tag_mention_head_click", new com.ss.android.ugc.tools.f.b().a("previous_page", "video_post_page").a("to_user_id", this.f127695b.getUid()).a("user_type", this.f127696c).a("search_keyword", "").a("function", "mention").a("is_valid", String.valueOf(!this.f127694a.f127692f.f127683c.contains(this.f127695b.getUid()) ? 1 : 0)).a("click_type", "choose").a("enter_from", "video_edit_page").f149193a);
                if (this.f127694a.f127692f.f127683c.contains(this.f127695b.getUid())) {
                    View view2 = this.f127694a.itemView;
                    l.b(view2, "");
                    new com.bytedance.tux.g.b(view2).e(R.string.d3f).b();
                    return;
                }
                r.a("add_video_at", new com.ss.android.ugc.tools.f.b().a("search_keyword", "").a("log_pb", ac.a.f91473a.c(this.f127695b.getUid())).a("to_user_id", this.f127695b.getUid()).a("relation_tag", this.f127695b.getFollowStatus()).a("enter_from", "video_edit_page").f149193a);
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.a(this.f127695b));
            }

            b(C3322a aVar, User user, String str) {
                this.f127694a = aVar;
                this.f127695b = user;
                this.f127696c = str;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.a$a$c */
        public static final class c implements View.OnAttachStateChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3322a f127697a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ User f127698b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f127699c;

            static {
                Covode.recordClassIndex(83710);
            }

            public final void onViewDetachedFromWindow(View view) {
                l.d(view, "");
            }

            public final void onViewAttachedToWindow(View view) {
                l.d(view, "");
                if (!this.f127697a.f127692f.f127686f.contains(this.f127698b.getUid())) {
                    r.a("tag_mention_head_show", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("previous_page", "video_post_page").a("to_user_id", this.f127698b.getUid()).a("user_type", this.f127699c).a("search_keyword", "").a("function", "mention").a("is_valid", String.valueOf(!this.f127697a.f127692f.f127683c.contains(this.f127698b.getUid()) ? 1 : 0)).f149193a);
                    Set<String> set = this.f127697a.f127692f.f127686f;
                    String uid = this.f127698b.getUid();
                    l.b(uid, "");
                    set.add(uid);
                }
            }

            c(C3322a aVar, User user, String str) {
                this.f127697a = aVar;
                this.f127698b = user;
                this.f127699c = str;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.bytedance.ies.dmt.ui.a.a
        public final /* synthetic */ void a(User user, int i2) {
            String str;
            com.ss.android.ugc.aweme.base.l lVar;
            String str2;
            int color;
            float f2;
            User user2 = user;
            l.d(user2, "");
            if (this.f127692f.f127684d.contains(user2.getUid())) {
                str = "recent";
            } else if (user2.getFollowStatus() == 2) {
                str = "friend";
            } else {
                str = "follow";
            }
            this.itemView.addOnAttachStateChangeListener(new c(this, user2, str));
            this.f127689c.setText(bn.a(user2));
            GradientDrawable gradientDrawable = null;
            this.f127689c.setBackground(null);
            UrlModel avatarThumb = user2.getAvatarThumb();
            if (avatarThumb == null) {
                lVar = null;
            } else {
                lVar = new com.ss.android.ugc.aweme.base.l(avatarThumb.getUri(), avatarThumb.getUrlList());
            }
            v a2 = com.bytedance.lighten.a.r.a(lVar);
            e.a aVar = new e.a();
            aVar.f39827a = true;
            a2.w = aVar.a();
            a2.E = this.f127688b;
            a2.c();
            String uid = user2.getUid();
            User user3 = this.f127692f.f127681a;
            if (user3 != null) {
                str2 = user3.getUid();
            } else {
                str2 = null;
            }
            boolean a3 = l.a((Object) uid, (Object) str2);
            TextView textView = this.f127689c;
            Context context = this.f127690d.getContext();
            l.b(context, "");
            Resources resources = context.getResources();
            if (a3) {
                color = resources.getColor(R.color.bh);
            } else {
                color = resources.getColor(R.color.a_);
            }
            textView.setTextColor(color);
            View view = this.f127687a;
            if (a3) {
                com.ss.android.ugc.tools.view.style.b a4 = b.a.a().a(1);
                Context context2 = this.f127690d.getContext();
                l.b(context2, "");
                int color2 = context2.getResources().getColor(R.color.bh);
                Context context3 = this.f127687a.getContext();
                l.b(context3, "");
                gradientDrawable = a4.a(color2, (int) com.ss.android.ugc.tools.utils.r.a(context3, 2.0f)).b(0).a();
            }
            view.setBackground(gradientDrawable);
            if (this.f127692f.f127683c.contains(user2.getUid())) {
                this.f127690d.setOnTouchListener(View$OnTouchListenerC3323a.f127693a);
            }
            this.f127690d.setOnClickListener(new b(this, user2, str));
            View view2 = this.itemView;
            l.b(view2, "");
            if (this.f127692f.f127683c.contains(user2.getUid())) {
                f2 = 0.3f;
            } else {
                f2 = 1.0f;
            }
            view2.setAlpha(f2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3322a(a aVar, View view, a aVar2) {
            super(view);
            l.d(view, "");
            l.d(aVar2, "");
            this.f127692f = aVar;
            this.f127690d = view;
            this.f127691e = aVar2;
            View findViewById = view.findViewById(R.id.btu);
            l.b(findViewById, "");
            this.f127687a = findViewById;
            View findViewById2 = view.findViewById(R.id.btv);
            l.b(findViewById2, "");
            this.f127688b = (SmartImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.evk);
            l.b(findViewById3, "");
            this.f127689c = (TextView) findViewById3;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.dmt.ui.a.a<com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(com.bytedance.ies.dmt.ui.a.a<User> aVar, int i2) {
        com.bytedance.ies.dmt.ui.a.a<User> aVar2 = aVar;
        l.d(aVar2, "");
        List<? extends User> list = this.f127682b;
        if (list == null) {
            l.b();
        }
        aVar2.a(list.get(i2), i2);
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(6166);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9m, viewGroup, false);
        l.b(a3, "");
        C3322a aVar2 = new C3322a(aVar, a3, aVar);
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar2.getClass().getName();
        MethodCollector.o(6166);
        return aVar2;
    }
}

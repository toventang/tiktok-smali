package com.ss.android.ugc.aweme.commentStickerPanel;

import android.content.Context;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commentStickerPanel.l;
import com.ss.android.ugc.aweme.commentStickerPanel.net.CommentStickerPanelRequestApi;
import com.ss.android.ugc.aweme.commentStickerPanel.net.QuestionStickerPanelRequestApi;
import com.ss.android.ugc.aweme.commentStickerPanel.net.a;
import com.ss.android.ugc.aweme.commentStickerPanel.net.b;
import com.ss.android.ugc.aweme.property.df;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class CommentAndQuestionAndQuestionStickerPanelViewModel extends LifecycleAwareViewModel<CommentAndQuestionStickerPanelState> implements d {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f73090a;

    /* renamed from: b  reason: collision with root package name */
    final Map<String, String> f73091b;

    /* renamed from: c  reason: collision with root package name */
    public a f73092c = a.SuggestTab;

    /* renamed from: d  reason: collision with root package name */
    public boolean f73093d;

    /* renamed from: e  reason: collision with root package name */
    CommentVideoModel f73094e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f73095f;

    /* renamed from: g  reason: collision with root package name */
    public t<Boolean> f73096g;

    /* renamed from: l  reason: collision with root package name */
    public final t<Boolean> f73097l;

    /* renamed from: m  reason: collision with root package name */
    final com.ss.android.ugc.aweme.commentStickerPanel.net.b f73098m;
    public final com.bytedance.als.l<Object> n;
    public final com.bytedance.als.l<Object> o;
    public final com.bytedance.als.l<Object> p;
    public final com.bytedance.als.l<Object> q;
    public final com.bytedance.als.l<Object> r;
    public final List<h.f.a.a<z>> s;
    public final t<Boolean> t;
    public final CommentVideoModel u;
    public final k v;
    private final Map<a, List<Object>> w;
    private final com.bytedance.als.m<Boolean> x;

    static {
        Covode.recordClassIndex(45025);
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.d
    public final CommentAndQuestionAndQuestionStickerPanelViewModel f() {
        return this;
    }

    public final boolean a(a aVar) {
        h.f.b.l.d(aVar, "");
        int i2 = c.f73151c[aVar.ordinal()];
        if (i2 == 1) {
            return i();
        }
        if (i2 != 2) {
            return true;
        }
        return h();
    }

    public final void a(String str, String str2) {
        Map<String, String> map;
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        String str3 = this.f73091b.get(str);
        if (str3 != null) {
            k kVar = this.v;
            h.f.b.l.d(str3, "");
            h.f.b.l.d(str2, "");
            com.ss.android.ugc.tools.f.b a2 = kVar.a();
            if (a2 != null) {
                a2.a("tab_name", str3);
                a2.a("enter_method", str2);
                map = a2.f149193a;
            } else {
                map = null;
            }
            com.ss.android.ugc.aweme.utils.d.a("change_reply_panel_tab", map);
        }
    }

    public final void a(String str, int i2) {
        h.f.b.l.d(str, "");
        this.v.a(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.d
    public final void g() {
        c(p.f73105a);
    }

    public final void j() {
        c(o.f73104a);
    }

    public final void k() {
        this.f73094e = null;
        this.f73095f = false;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        com.ss.android.ugc.aweme.commentStickerPanel.net.a.f73277e.a(this, this.x);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new CommentAndQuestionStickerPanelState(null, null, null, null, null, 31, null);
    }

    @Override // androidx.lifecycle.ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        com.ss.android.ugc.aweme.commentStickerPanel.net.a.f73277e.a(this.x);
        super.onCleared();
    }

    public enum a {
        SuggestTab,
        FavoriteTab;

        static {
            Covode.recordClassIndex(45026);
        }

        public final String getTabName() {
            int i2 = b.f73148a[ordinal()];
            if (i2 == 1) {
                return "recommend";
            }
            if (i2 == 2) {
                return "favorite";
            }
            throw new h.n();
        }
    }

    public final void b() {
        for (List<Object> list : this.w.values()) {
            list.clear();
        }
        c(e.f73101a);
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.d
    public final boolean h() {
        if (!com.ss.android.ugc.aweme.commentStickerPanel.net.a.b() || !this.f73098m.b()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.d
    public final boolean i() {
        if (!com.ss.android.ugc.aweme.commentStickerPanel.net.a.a() || !this.f73098m.a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.d
    public final void n() {
        Map<String, String> map;
        com.ss.android.ugc.tools.f.b a2 = this.v.a();
        if (a2 != null) {
            map = a2.f149193a;
        } else {
            map = null;
        }
        com.ss.android.ugc.aweme.utils.d.a("reply_panel_entrance_show", map);
    }

    public final void a() {
        if (com.ss.android.ugc.aweme.port.in.g.a().A().b()) {
            f fVar = new f(this);
            h.f.b.l.d(fVar, "");
            CommentStickerPanelRequestApi.a(com.ss.android.ugc.aweme.commentStickerPanel.net.a.f73273a, 0, 0, new a.C1634a(fVar), com.ss.android.ugc.aweme.commentStickerPanel.a.a.Both.getValue(), 3);
            if (df.e()) {
                com.ss.android.ugc.aweme.commentStickerPanel.net.b bVar = this.f73098m;
                b.a aVar = new b.a(bVar, new g(this));
                QuestionStickerPanelRequestApi questionStickerPanelRequestApi = bVar.f73282a;
                if (questionStickerPanelRequestApi != null) {
                    questionStickerPanelRequestApi.a(0, aVar, com.ss.android.ugc.aweme.commentStickerPanel.a.h.All.ordinal());
                }
            }
        }
    }

    public final void a(int i2) {
        this.v.a(i2);
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel f73100a;

        static {
            Covode.recordClassIndex(45029);
        }

        d(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel) {
            this.f73100a = commentAndQuestionAndQuestionStickerPanelViewModel;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f73100a.t.setValue(true);
        }
    }

    public final void a(CommentVideoModel commentVideoModel) {
        this.f73094e = commentVideoModel;
        this.f73095f = true;
    }

    static final class b extends h.f.b.m implements h.f.a.b<CommentAndQuestionStickerPanelState, CommentAndQuestionStickerPanelState> {
        final /* synthetic */ CommentVideoModel $model;

        static {
            Covode.recordClassIndex(45027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CommentVideoModel commentVideoModel) {
            super(1);
            this.$model = commentVideoModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CommentAndQuestionStickerPanelState invoke(CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState) {
            CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState2 = commentAndQuestionStickerPanelState;
            h.f.b.l.d(commentAndQuestionStickerPanelState2, "");
            return CommentAndQuestionStickerPanelState.copy$default(commentAndQuestionStickerPanelState2, null, null, new com.bytedance.jedi.arch.d(this.$model), null, null, 27, null);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<CommentAndQuestionStickerPanelState, CommentAndQuestionStickerPanelState> {
        final /* synthetic */ QaStruct $qaStruct;

        static {
            Covode.recordClassIndex(45028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(QaStruct qaStruct) {
            super(1);
            this.$qaStruct = qaStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CommentAndQuestionStickerPanelState invoke(CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState) {
            CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState2 = commentAndQuestionStickerPanelState;
            h.f.b.l.d(commentAndQuestionStickerPanelState2, "");
            return CommentAndQuestionStickerPanelState.copy$default(commentAndQuestionStickerPanelState2, null, null, null, new com.bytedance.jedi.arch.d(this.$qaStruct), null, 23, null);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<CommentAndQuestionStickerPanelState, CommentAndQuestionStickerPanelState> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f73101a = new e();

        static {
            Covode.recordClassIndex(45030);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CommentAndQuestionStickerPanelState invoke(CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState) {
            CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState2 = commentAndQuestionStickerPanelState;
            h.f.b.l.d(commentAndQuestionStickerPanelState2, "");
            return CommentAndQuestionStickerPanelState.copy$default(commentAndQuestionStickerPanelState2, null, null, null, null, new a.C1131a(), 15, null);
        }
    }

    static final /* synthetic */ class f extends h.f.b.j implements h.f.a.b<com.ss.android.ugc.aweme.commentStickerPanel.a.e, z> {
        static {
            Covode.recordClassIndex(45031);
        }

        f(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel) {
            super(1, commentAndQuestionAndQuestionStickerPanelViewModel, CommentAndQuestionAndQuestionStickerPanelViewModel.class, "commentRequestSuccessCallback", "commentRequestSuccessCallback(Lcom/ss/android/ugc/aweme/commentStickerPanel/model/CommentStickerPanelResponse;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.commentStickerPanel.a.e eVar) {
            com.ss.android.ugc.aweme.commentStickerPanel.a.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            ((CommentAndQuestionAndQuestionStickerPanelViewModel) this.receiver).a(eVar2);
            return z.f158842a;
        }
    }

    static final /* synthetic */ class g extends h.f.b.j implements h.f.a.b<com.ss.android.ugc.aweme.commentStickerPanel.a.j, z> {
        static {
            Covode.recordClassIndex(45032);
        }

        g(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel) {
            super(1, commentAndQuestionAndQuestionStickerPanelViewModel, CommentAndQuestionAndQuestionStickerPanelViewModel.class, "questionRequestSuccessCallback", "questionRequestSuccessCallback(Lcom/ss/android/ugc/aweme/commentStickerPanel/model/QuestionStickerPanelResponseModel;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.commentStickerPanel.a.j jVar) {
            com.ss.android.ugc.aweme.commentStickerPanel.a.j jVar2 = jVar;
            h.f.b.l.d(jVar2, "");
            ((CommentAndQuestionAndQuestionStickerPanelViewModel) this.receiver).a(jVar2);
            return z.f158842a;
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel f73102a;

        static {
            Covode.recordClassIndex(45033);
        }

        h(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel) {
            this.f73102a = commentAndQuestionAndQuestionStickerPanelViewModel;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Iterator<T> it = this.f73102a.s.iterator();
            while (it.hasNext()) {
                it.next().invoke();
            }
            this.f73102a.s.clear();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.commentStickerPanel.a.j, z> {
        final /* synthetic */ h.f.a.a $loadMoreUiCallBack;
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel this$0;

        static {
            Covode.recordClassIndex(45034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel, h.f.a.a aVar) {
            super(1);
            this.this$0 = commentAndQuestionAndQuestionStickerPanelViewModel;
            this.$loadMoreUiCallBack = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.commentStickerPanel.a.j jVar) {
            com.ss.android.ugc.aweme.commentStickerPanel.a.j jVar2 = jVar;
            h.f.b.l.d(jVar2, "");
            this.$loadMoreUiCallBack.invoke();
            this.this$0.a(jVar2);
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.commentStickerPanel.a.j, z> {
        final /* synthetic */ h.f.a.a $loadMoreUiCallBack;
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel this$0;

        static {
            Covode.recordClassIndex(45035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel, h.f.a.a aVar) {
            super(1);
            this.this$0 = commentAndQuestionAndQuestionStickerPanelViewModel;
            this.$loadMoreUiCallBack = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.commentStickerPanel.a.j jVar) {
            com.ss.android.ugc.aweme.commentStickerPanel.a.j jVar2 = jVar;
            h.f.b.l.d(jVar2, "");
            this.$loadMoreUiCallBack.invoke();
            this.this$0.a(jVar2);
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.commentStickerPanel.a.j, z> {
        final /* synthetic */ h.f.a.a $loadMoreUiCallBack;
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel this$0;

        static {
            Covode.recordClassIndex(45036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel, h.f.a.a aVar) {
            super(1);
            this.this$0 = commentAndQuestionAndQuestionStickerPanelViewModel;
            this.$loadMoreUiCallBack = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.commentStickerPanel.a.j jVar) {
            com.ss.android.ugc.aweme.commentStickerPanel.a.j jVar2 = jVar;
            h.f.b.l.d(jVar2, "");
            this.$loadMoreUiCallBack.invoke();
            this.this$0.a(jVar2);
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.commentStickerPanel.a.e, z> {
        final /* synthetic */ h.f.a.a $loadMoreUiCallBack;
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel this$0;

        static {
            Covode.recordClassIndex(45037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel, h.f.a.a aVar) {
            super(1);
            this.this$0 = commentAndQuestionAndQuestionStickerPanelViewModel;
            this.$loadMoreUiCallBack = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.commentStickerPanel.a.e eVar) {
            com.ss.android.ugc.aweme.commentStickerPanel.a.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            this.$loadMoreUiCallBack.invoke();
            this.this$0.a(eVar2);
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.commentStickerPanel.a.e, z> {
        final /* synthetic */ h.f.a.a $loadMoreUiCallBack;
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel this$0;

        static {
            Covode.recordClassIndex(45038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel, h.f.a.a aVar) {
            super(1);
            this.this$0 = commentAndQuestionAndQuestionStickerPanelViewModel;
            this.$loadMoreUiCallBack = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.commentStickerPanel.a.e eVar) {
            com.ss.android.ugc.aweme.commentStickerPanel.a.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            this.$loadMoreUiCallBack.invoke();
            this.this$0.a(eVar2);
            return z.f158842a;
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.b<CommentAndQuestionStickerPanelState, CommentAndQuestionStickerPanelState> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f73103a = new n();

        static {
            Covode.recordClassIndex(45039);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CommentAndQuestionStickerPanelState invoke(CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState) {
            CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState2 = commentAndQuestionStickerPanelState;
            h.f.b.l.d(commentAndQuestionStickerPanelState2, "");
            return CommentAndQuestionStickerPanelState.copy$default(commentAndQuestionStickerPanelState2, null, new com.bytedance.jedi.arch.p(), null, null, null, 29, null);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<CommentAndQuestionStickerPanelState, CommentAndQuestionStickerPanelState> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f73104a = new o();

        static {
            Covode.recordClassIndex(45040);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CommentAndQuestionStickerPanelState invoke(CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState) {
            CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState2 = commentAndQuestionStickerPanelState;
            h.f.b.l.d(commentAndQuestionStickerPanelState2, "");
            return CommentAndQuestionStickerPanelState.copy$default(commentAndQuestionStickerPanelState2, new com.bytedance.jedi.arch.k(true), null, null, null, null, 30, null);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<CommentAndQuestionStickerPanelState, CommentAndQuestionStickerPanelState> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f73105a = new p();

        static {
            Covode.recordClassIndex(45041);
        }

        p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CommentAndQuestionStickerPanelState invoke(CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState) {
            CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState2 = commentAndQuestionStickerPanelState;
            h.f.b.l.d(commentAndQuestionStickerPanelState2, "");
            return CommentAndQuestionStickerPanelState.copy$default(commentAndQuestionStickerPanelState2, null, null, null, null, new a.b(), 15, null);
        }
    }

    public final void a(h.f.a.a<z> aVar) {
        h.f.b.l.d(aVar, "");
        this.s.add(aVar);
    }

    public final void a(com.ss.android.ugc.aweme.commentStickerPanel.a.e eVar) {
        List<com.ss.android.ugc.aweme.commentStickerPanel.a.c> list = eVar.f73132b;
        if (list != null) {
            for (com.ss.android.ugc.aweme.commentStickerPanel.a.c cVar : list) {
                Integer num = cVar.f73127e;
                if (num != null) {
                    if (num.intValue() == 1) {
                        this.q.b(cVar);
                    } else if (num.intValue() == 2) {
                        this.r.b(cVar);
                    }
                }
            }
            this.t.setValue(true);
        }
    }

    public final void b(CommentVideoModel commentVideoModel) {
        Map<String, String> map;
        if (commentVideoModel != null) {
            k kVar = this.v;
            String tabName = this.f73092c.getTabName();
            h.f.b.l.d(commentVideoModel, "");
            h.f.b.l.d(tabName, "");
            com.ss.android.ugc.tools.f.b a2 = kVar.a();
            if (a2 != null) {
                a2.a("tab_name", tabName);
                a2.a("comment_id", commentVideoModel.getCommentId());
                a2.a("comment_user_id", commentVideoModel.getUserId());
                a2.a("group_id", commentVideoModel.getAwemeId());
                a2.a("author_id", commentVideoModel.getAwemeUserId());
                map = a2.f149193a;
            } else {
                map = null;
            }
            com.ss.android.ugc.aweme.utils.d.a("reply_comment_show", map);
        }
    }

    public final void a(com.ss.android.ugc.aweme.commentStickerPanel.a.j jVar) {
        List<com.ss.android.ugc.aweme.commentStickerPanel.a.g> list = jVar.f73144b;
        ArrayList arrayList = new ArrayList();
        for (T t2 : list) {
            if (t2.f73134a == com.ss.android.ugc.aweme.commentStickerPanel.a.h.QuestionCollectionINVITATION.ordinal()) {
                arrayList.add(t2);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            this.n.b(arrayList2.get(0));
        }
        List<com.ss.android.ugc.aweme.commentStickerPanel.a.g> list2 = jVar.f73144b;
        ArrayList arrayList3 = new ArrayList();
        for (T t3 : list2) {
            if (t3.f73134a == com.ss.android.ugc.aweme.commentStickerPanel.a.h.QuestionCollectionFAVORITE.ordinal()) {
                arrayList3.add(t3);
            }
        }
        ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            this.o.b(arrayList4.get(0));
        }
        List<com.ss.android.ugc.aweme.commentStickerPanel.a.g> list3 = jVar.f73144b;
        ArrayList arrayList5 = new ArrayList();
        for (T t4 : list3) {
            if (t4.f73134a == com.ss.android.ugc.aweme.commentStickerPanel.a.h.QuestionCollectionRECOMMEND.ordinal()) {
                arrayList5.add(t4);
            }
        }
        ArrayList arrayList6 = arrayList5;
        if (!arrayList6.isEmpty()) {
            this.p.b(arrayList6.get(0));
        }
    }

    public final void a(CommentVideoModel commentVideoModel, String str) {
        Map<String, String> map;
        h.f.b.l.d(commentVideoModel, "");
        h.f.b.l.d(str, "");
        String str2 = this.f73091b.get(str);
        if (str2 != null) {
            k kVar = this.v;
            h.f.b.l.d(commentVideoModel, "");
            h.f.b.l.d(str2, "");
            com.ss.android.ugc.tools.f.b a2 = kVar.a();
            if (a2 != null) {
                a2.a("tab_name", str2);
                a2.a("comment_id", commentVideoModel.getCommentId());
                a2.a("comment_user_id", commentVideoModel.getUserId());
                a2.a("group_id", commentVideoModel.getAwemeId());
                a2.a("author_id", commentVideoModel.getAwemeUserId());
                map = a2.f149193a;
            } else {
                map = null;
            }
            com.ss.android.ugc.aweme.utils.d.a("replace_sticker_show", map);
        }
    }

    public final void a(QaStruct qaStruct, l.a aVar) {
        String str;
        Map<String, String> map;
        h.f.b.l.d(aVar, "");
        if (qaStruct != null) {
            int i2 = c.f73152d[aVar.ordinal()];
            if (i2 == 1) {
                str = "qa_recommendation_show";
            } else if (i2 == 2) {
                str = "qa_invitation_show";
            } else {
                return;
            }
            k kVar = this.v;
            h.f.b.l.d(str, "");
            com.ss.android.ugc.tools.f.b a2 = kVar.a();
            if (a2 != null) {
                a2.a("question_id", String.valueOf(qaStruct.getQuestionId()));
                map = a2.f149193a;
            } else {
                map = null;
            }
            com.ss.android.ugc.aweme.utils.d.a(str, map);
        }
    }

    public CommentAndQuestionAndQuestionStickerPanelViewModel(Context context, CommentVideoModel commentVideoModel, k kVar) {
        boolean z;
        h.f.b.l.d(context, "");
        h.f.b.l.d(kVar, "");
        this.u = commentVideoModel;
        this.v = kVar;
        List<String> b2 = h.a.n.b(context.getString(R.string.f68), context.getString(R.string.f32));
        this.f73090a = b2;
        this.f73091b = ag.a(v.a(b2.get(0), "recommend"), v.a(b2.get(1), "favorite"));
        if (commentVideoModel != null) {
            z = true;
        } else {
            z = false;
        }
        this.f73095f = z;
        this.f73096g = new t<>();
        this.f73097l = new t<>();
        com.ss.android.ugc.aweme.commentStickerPanel.net.b bVar = new com.ss.android.ugc.aweme.commentStickerPanel.net.b();
        this.f73098m = bVar;
        this.n = new com.bytedance.als.l<>(bVar.f73283b);
        this.o = new com.bytedance.als.l<>(bVar.f73285d);
        this.p = new com.bytedance.als.l<>(bVar.f73284c);
        this.q = new com.bytedance.als.l<>(com.ss.android.ugc.aweme.commentStickerPanel.net.a.f73275c);
        this.r = new com.bytedance.als.l<>(com.ss.android.ugc.aweme.commentStickerPanel.net.a.f73274b);
        this.s = new ArrayList();
        this.t = new t<>();
        this.x = new d(this);
        this.f73094e = commentVideoModel;
        this.w = ag.b(v.a(a.SuggestTab, new ArrayList()), v.a(a.FavoriteTab, new ArrayList()));
    }

    public final void a(CommentVideoModel commentVideoModel, String str, String str2) {
        Map<String, String> map;
        h.f.b.l.d(commentVideoModel, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        String str3 = this.f73091b.get(str);
        if (str3 != null) {
            k kVar = this.v;
            h.f.b.l.d(commentVideoModel, "");
            h.f.b.l.d(str3, "");
            h.f.b.l.d(str2, "");
            com.ss.android.ugc.tools.f.b a2 = kVar.a();
            if (a2 != null) {
                a2.a("target", str2);
                a2.a("tab_name", str3);
                a2.a("comment_id", commentVideoModel.getCommentId());
                a2.a("comment_user_id", commentVideoModel.getUserId());
                a2.a("group_id", commentVideoModel.getAwemeId());
                a2.a("author_id", commentVideoModel.getAwemeUserId());
                map = a2.f149193a;
            } else {
                map = null;
            }
            com.ss.android.ugc.aweme.utils.d.a("replace_sticker_confirm", map);
        }
    }
}

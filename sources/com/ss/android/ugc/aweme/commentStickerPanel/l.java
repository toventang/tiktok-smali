package com.ss.android.ugc.aweme.commentStickerPanel;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.i;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.ss.android.ugc.aweme.commentStickerPanel.a.g;
import com.ss.android.ugc.aweme.commentStickerPanel.a.h;
import com.ss.android.ugc.aweme.commentStickerPanel.net.CommentStickerPanelRequestApi;
import com.ss.android.ugc.aweme.commentStickerPanel.net.QuestionStickerPanelRequestApi;
import com.ss.android.ugc.aweme.commentStickerPanel.net.a;
import com.ss.android.ugc.aweme.property.df;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.sticker.data.f;
import com.ss.android.ugc.tools.view.widget.DoubleColorBallAnimationView;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.k.k;
import h.n;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class l extends LinearLayout implements q {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f73231a;

    /* renamed from: b  reason: collision with root package name */
    public TuxTextView f73232b;

    /* renamed from: c  reason: collision with root package name */
    public DoubleColorBallAnimationView f73233c;

    /* renamed from: d  reason: collision with root package name */
    public View f73234d;

    /* renamed from: e  reason: collision with root package name */
    public int f73235e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f73236f;

    /* renamed from: g  reason: collision with root package name */
    public CommentAndQuestionAndQuestionStickerPanelViewModel f73237g;

    /* renamed from: h  reason: collision with root package name */
    public List<Object> f73238h;

    /* renamed from: i  reason: collision with root package name */
    public List<Object> f73239i;

    /* renamed from: j  reason: collision with root package name */
    private View f73240j;

    /* renamed from: k  reason: collision with root package name */
    private View f73241k;

    /* renamed from: l  reason: collision with root package name */
    private TuxTextView f73242l;

    /* renamed from: m  reason: collision with root package name */
    private com.bytedance.als.l<Object> f73243m;
    private final int n;
    private final a o;

    static {
        Covode.recordClassIndex(45109);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final a getItemType() {
        return this.o;
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.ae
    public final i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<i> getReceiverHolder() {
        return this;
    }

    public enum a {
        InvitationQuestion,
        RecommendQuestion,
        RecommendComment,
        FavoriteQuestion,
        FavoriteComment;

        static {
            Covode.recordClassIndex(45110);
        }

        public final String getNameForMob() {
            int i2 = m.f73248b[ordinal()];
            if (i2 == 1) {
                return "invitation";
            }
            if (i2 == 2) {
                return "recommendation";
            }
            if (i2 != 3) {
                return "";
            }
            return "favorite";
        }

        public final f getSource() {
            int i2 = m.f73249c[ordinal()];
            if (i2 == 1) {
                return f.Invitation;
            }
            if (i2 == 2) {
                return f.Recommendation;
            }
            if (i2 != 3) {
                return f.Favorite;
            }
            return f.Favorite;
        }

        public final CommentAndQuestionAndQuestionStickerPanelViewModel.a getCurrentTabType() {
            int i2 = m.f73247a[ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                return CommentAndQuestionAndQuestionStickerPanelViewModel.a.SuggestTab;
            }
            if (i2 == 4 || i2 == 5) {
                return CommentAndQuestionAndQuestionStickerPanelViewModel.a.FavoriteTab;
            }
            throw new n();
        }
    }

    public final boolean a() {
        List<Object> list = this.f73238h;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        Activity activity;
        Context context = getContext();
        h.f.b.l.b(context, "");
        while (true) {
            activity = null;
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = (Activity) context;
                    break;
                }
            } else {
                break;
            }
        }
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.lifecycle.i lifecycle = ((androidx.core.app.d) activity).getLifecycle();
        h.f.b.l.b(lifecycle, "");
        return lifecycle;
    }

    private void c() {
        Activity activity;
        int i2 = n.f73251b[this.o.ordinal()];
        if (i2 == 1) {
            this.f73243m = this.f73237g.n;
        } else if (i2 == 2) {
            this.f73243m = this.f73237g.p;
        } else if (i2 == 3) {
            this.f73243m = this.f73237g.r;
        } else if (i2 == 4) {
            this.f73243m = this.f73237g.o;
        } else if (i2 == 5) {
            this.f73243m = this.f73237g.q;
        }
        com.bytedance.als.l<Object> lVar = this.f73243m;
        if (lVar == null) {
            h.f.b.l.a("initDataEvent");
        }
        Context context = getContext();
        h.f.b.l.b(context, "");
        while (true) {
            activity = null;
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = (Activity) context;
                    break;
                }
            } else {
                break;
            }
        }
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        lVar.a((androidx.fragment.app.e) activity, new b(this));
    }

    public final void b() {
        int i2;
        if (this.f73231a != null) {
            RecyclerView recyclerView = this.f73231a;
            if (recyclerView == null) {
                h.f.b.l.a("recycleView");
            }
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                layoutManager = null;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            if (staggeredGridLayoutManager != null) {
                int[] a2 = staggeredGridLayoutManager.a((int[]) null);
                int[] b2 = staggeredGridLayoutManager.b((int[]) null);
                h.f.b.l.b(a2, "");
                Integer d2 = h.a.i.d(a2);
                int i3 = 0;
                if (d2 != null) {
                    i2 = d2.intValue();
                } else {
                    i2 = a2[0];
                }
                h.f.b.l.b(b2, "");
                Integer c2 = h.a.i.c(b2);
                if (c2 != null) {
                    i3 = c2.intValue();
                }
                if (i2 <= i3) {
                    while (true) {
                        try {
                            View c3 = staggeredGridLayoutManager.c(i2);
                            if (c3 != null && c3.getGlobalVisibleRect(new Rect()) && !this.f73239i.contains(this.f73238h.get(i2))) {
                                int i4 = n.f73254e[this.o.ordinal()];
                                if (i4 == 1 || i4 == 2) {
                                    CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.f73237g;
                                    Object obj = this.f73238h.get(i2);
                                    if (!(obj instanceof CommentVideoModel)) {
                                        obj = null;
                                    }
                                    commentAndQuestionAndQuestionStickerPanelViewModel.b((CommentVideoModel) obj);
                                } else {
                                    CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel2 = this.f73237g;
                                    Object obj2 = this.f73238h.get(i2);
                                    if (!(obj2 instanceof QaStruct)) {
                                        obj2 = null;
                                    }
                                    commentAndQuestionAndQuestionStickerPanelViewModel2.a((QaStruct) obj2, this.o);
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        if (i2 != i3) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    private final void d() {
        addView(com.a.a(LayoutInflater.from(getContext()), R.layout.tv, this, false));
        View findViewById = findViewById(R.id.title);
        h.f.b.l.b(findViewById, "");
        this.f73242l = (TuxTextView) findViewById;
        if (df.a() != 0) {
            TuxTextView tuxTextView = this.f73242l;
            if (tuxTextView == null) {
                h.f.b.l.a("title");
            }
            tuxTextView.setText(getResources().getString(this.n));
        } else {
            TuxTextView tuxTextView2 = this.f73242l;
            if (tuxTextView2 == null) {
                h.f.b.l.a("title");
            }
            tuxTextView2.setVisibility(8);
        }
        View findViewById2 = findViewById(R.id.djj);
        h.f.b.l.b(findViewById2, "");
        this.f73231a = (RecyclerView) findViewById2;
        View findViewById3 = findViewById(R.id.che);
        h.f.b.l.b(findViewById3, "");
        TuxTextView tuxTextView3 = (TuxTextView) findViewById3;
        this.f73232b = tuxTextView3;
        if (tuxTextView3 == null) {
            h.f.b.l.a("loadMoreText");
        }
        Context context = getContext();
        h.f.b.l.b(context, "");
        tuxTextView3.setText(context.getResources().getString(R.string.bv8));
        TuxTextView tuxTextView4 = this.f73232b;
        if (tuxTextView4 == null) {
            h.f.b.l.a("loadMoreText");
        }
        tuxTextView4.setOnClickListener(new d(this));
        View findViewById4 = findViewById(R.id.cia);
        h.f.b.l.b(findViewById4, "");
        this.f73233c = (DoubleColorBallAnimationView) findViewById4;
        View findViewById5 = findViewById(R.id.cib);
        h.f.b.l.b(findViewById5, "");
        this.f73234d = findViewById5;
        View findViewById6 = getRootView().findViewById(R.id.cib);
        h.f.b.l.b(findViewById6, "");
        this.f73240j = findViewById6;
        View findViewById7 = getRootView().findViewById(R.id.cia);
        h.f.b.l.b(findViewById7, "");
        this.f73241k = findViewById7;
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        staggeredGridLayoutManager.C = true;
        RecyclerView recyclerView = this.f73231a;
        if (recyclerView == null) {
            h.f.b.l.a("recycleView");
        }
        Context context2 = getContext();
        h.f.b.l.b(context2, "");
        recyclerView.a(new i(context2));
        RecyclerView recyclerView2 = this.f73231a;
        if (recyclerView2 == null) {
            h.f.b.l.a("recycleView");
        }
        recyclerView2.setLayoutManager(staggeredGridLayoutManager);
        RecyclerView recyclerView3 = this.f73231a;
        if (recyclerView3 == null) {
            h.f.b.l.a("recycleView");
        }
        recyclerView3.setItemAnimator(null);
        Context context3 = getContext();
        h.f.b.l.b(context3, "");
        p pVar = new p(context3, this.o, this.f73237g, this.f73238h, new e(this));
        RecyclerView recyclerView4 = this.f73231a;
        if (recyclerView4 == null) {
            h.f.b.l.a("recycleView");
        }
        recyclerView4.setAdapter(pVar);
    }

    public static final /* synthetic */ DoubleColorBallAnimationView a(l lVar) {
        DoubleColorBallAnimationView doubleColorBallAnimationView = lVar.f73233c;
        if (doubleColorBallAnimationView == null) {
            h.f.b.l.a("loadMoreDoubleBall");
        }
        return doubleColorBallAnimationView;
    }

    public static final /* synthetic */ View b(l lVar) {
        View view = lVar.f73234d;
        if (view == null) {
            h.f.b.l.a("loadMoreContainer");
        }
        return view;
    }

    public static final /* synthetic */ TuxTextView c(l lVar) {
        TuxTextView tuxTextView = lVar.f73232b;
        if (tuxTextView == null) {
            h.f.b.l.a("loadMoreText");
        }
        return tuxTextView;
    }

    public static final /* synthetic */ RecyclerView d(l lVar) {
        RecyclerView recyclerView = lVar.f73231a;
        if (recyclerView == null) {
            h.f.b.l.a("recycleView");
        }
        return recyclerView;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f73246a;

        static {
            Covode.recordClassIndex(45113);
        }

        d(l lVar) {
            this.f73246a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            l.c(this.f73246a).setVisibility(4);
            l.a(this.f73246a).setVisibility(0);
            l.a(this.f73246a).a();
            CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.f73246a.f73237g;
            a itemType = this.f73246a.getItemType();
            int i2 = this.f73246a.f73235e;
            AnonymousClass1 r1 = new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.commentStickerPanel.l.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(45114);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    if (l.a(this.this$0.f73246a).f150286a) {
                        l.a(this.this$0.f73246a).b();
                        l.a(this.this$0.f73246a).setVisibility(8);
                    }
                    return z.f158842a;
                }
            };
            h.f.b.l.d(itemType, "");
            h.f.b.l.d(r1, "");
            int i3 = c.f73150b[itemType.ordinal()];
            if (i3 == 1) {
                com.ss.android.ugc.aweme.commentStickerPanel.net.b bVar = commentAndQuestionAndQuestionStickerPanelViewModel.f73098m;
                CommentAndQuestionAndQuestionStickerPanelViewModel.i iVar = new CommentAndQuestionAndQuestionStickerPanelViewModel.i(commentAndQuestionAndQuestionStickerPanelViewModel, r1);
                h.f.b.l.d(iVar, "");
                QuestionStickerPanelRequestApi questionStickerPanelRequestApi = bVar.f73282a;
                if (questionStickerPanelRequestApi != null) {
                    questionStickerPanelRequestApi.a(i2, iVar, h.QuestionCollectionINVITATION.ordinal());
                }
            } else if (i3 == 2) {
                com.ss.android.ugc.aweme.commentStickerPanel.net.b bVar2 = commentAndQuestionAndQuestionStickerPanelViewModel.f73098m;
                CommentAndQuestionAndQuestionStickerPanelViewModel.j jVar = new CommentAndQuestionAndQuestionStickerPanelViewModel.j(commentAndQuestionAndQuestionStickerPanelViewModel, r1);
                h.f.b.l.d(jVar, "");
                QuestionStickerPanelRequestApi questionStickerPanelRequestApi2 = bVar2.f73282a;
                if (questionStickerPanelRequestApi2 != null) {
                    questionStickerPanelRequestApi2.a(i2, jVar, h.QuestionCollectionRECOMMEND.ordinal());
                }
            } else if (i3 == 3) {
                com.ss.android.ugc.aweme.commentStickerPanel.net.b bVar3 = commentAndQuestionAndQuestionStickerPanelViewModel.f73098m;
                CommentAndQuestionAndQuestionStickerPanelViewModel.k kVar = new CommentAndQuestionAndQuestionStickerPanelViewModel.k(commentAndQuestionAndQuestionStickerPanelViewModel, r1);
                h.f.b.l.d(kVar, "");
                QuestionStickerPanelRequestApi questionStickerPanelRequestApi3 = bVar3.f73282a;
                if (questionStickerPanelRequestApi3 != null) {
                    questionStickerPanelRequestApi3.a(i2, kVar, h.QuestionCollectionFAVORITE.ordinal());
                }
            } else if (i3 == 4) {
                CommentStickerPanelRequestApi.a(com.ss.android.ugc.aweme.commentStickerPanel.net.a.f73273a, i2, 0, new a.b(new CommentAndQuestionAndQuestionStickerPanelViewModel.l(commentAndQuestionAndQuestionStickerPanelViewModel, r1)), com.ss.android.ugc.aweme.commentStickerPanel.a.a.Favorites.getValue(), 2);
            } else if (i3 == 5) {
                CommentStickerPanelRequestApi.a(com.ss.android.ugc.aweme.commentStickerPanel.net.a.f73273a, i2, 0, new CommentAndQuestionAndQuestionStickerPanelViewModel.m(commentAndQuestionAndQuestionStickerPanelViewModel, r1), com.ss.android.ugc.aweme.commentStickerPanel.a.a.Recommended.getValue(), 2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<Object, z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(45115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            Object obj2;
            h.f.b.l.d(obj, "");
            int i2 = n.f73253d[this.this$0.getItemType().ordinal()];
            Map<String, String> map = null;
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                QaStruct qaStruct = (QaStruct) obj;
                qaStruct.setSource(this.this$0.getItemType().getSource());
                CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.this$0.f73237g;
                h.f.b.l.d(qaStruct, "");
                commentAndQuestionAndQuestionStickerPanelViewModel.c(new CommentAndQuestionAndQuestionStickerPanelViewModel.c(qaStruct));
                CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel2 = this.this$0.f73237g;
                String nameForMob = this.this$0.getItemType().getNameForMob();
                h.f.b.l.d(nameForMob, "");
                k kVar = commentAndQuestionAndQuestionStickerPanelViewModel2.v;
                h.f.b.l.d(qaStruct, "");
                h.f.b.l.d(nameForMob, "");
                com.ss.android.ugc.tools.f.b a2 = kVar.a();
                if (a2 != null) {
                    a2.a("question_id", qaStruct.getQuestionId());
                    a2.a("qa_sticker_category", nameForMob);
                    map = a2.f149193a;
                }
                com.ss.android.ugc.aweme.utils.d.a("prop_click", map);
            } else if (i2 == 4 || i2 == 5) {
                CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel3 = this.this$0.f73237g;
                if (!(obj instanceof CommentVideoModel)) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                CommentVideoModel commentVideoModel = (CommentVideoModel) obj2;
                String nameForMob2 = this.this$0.getItemType().getNameForMob();
                h.f.b.l.d(nameForMob2, "");
                String str = commentAndQuestionAndQuestionStickerPanelViewModel3.f73091b.get(nameForMob2);
                if (str != null) {
                    k kVar2 = commentAndQuestionAndQuestionStickerPanelViewModel3.v;
                    h.f.b.l.d(str, "");
                    if (commentVideoModel != null) {
                        com.ss.android.ugc.tools.f.b a3 = kVar2.a();
                        if (a3 != null) {
                            a3.a("tab_name", str);
                            a3.a("comment_id", commentVideoModel.getCommentId());
                            a3.a("comment_user_id", commentVideoModel.getUserId());
                            a3.a("group_id", commentVideoModel.getAwemeId());
                            a3.a("author_id", commentVideoModel.getAwemeUserId());
                            map = a3.f149193a;
                        }
                        com.ss.android.ugc.aweme.utils.d.a("select_reply_comment", map);
                    }
                }
                CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel4 = this.this$0.f73237g;
                CommentVideoModel commentVideoModel2 = (CommentVideoModel) obj;
                a itemType = this.this$0.getItemType();
                h.f.b.l.d(commentVideoModel2, "");
                h.f.b.l.d(itemType, "");
                commentAndQuestionAndQuestionStickerPanelViewModel4.f73092c = itemType.getCurrentTabType();
                commentAndQuestionAndQuestionStickerPanelViewModel4.c(new CommentAndQuestionAndQuestionStickerPanelViewModel.b(commentVideoModel2));
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f73245a;

        static {
            Covode.recordClassIndex(45111);
        }

        b(l lVar) {
            this.f73245a = lVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final void onChanged(Object obj) {
            List<com.ss.android.ugc.aweme.commentStickerPanel.a.b> list;
            ArrayList arrayList;
            int i2;
            Integer num;
            Integer num2;
            List<com.ss.android.ugc.aweme.commentStickerPanel.a.b> list2;
            List<QaStruct> list3;
            Collection<? extends Object> collection;
            int i3;
            int i4 = n.f73252c[this.f73245a.getItemType().ordinal()];
            boolean z = true;
            if (i4 == 1 || i4 == 2) {
                if (l.a(this.f73245a).f150286a) {
                    l.a(this.f73245a).b();
                    l.a(this.f73245a).setVisibility(8);
                }
                if (!(obj instanceof com.ss.android.ugc.aweme.commentStickerPanel.a.c)) {
                    obj = null;
                }
                com.ss.android.ugc.aweme.commentStickerPanel.a.c cVar = (com.ss.android.ugc.aweme.commentStickerPanel.a.c) obj;
                if (cVar != null && (list = cVar.f73123a) != null && !list.isEmpty()) {
                    this.f73245a.setVisibility(0);
                    int size = this.f73245a.f73238h.size();
                    List<Object> list4 = this.f73245a.f73238h;
                    if (cVar == null || (list2 = cVar.f73123a) == null) {
                        arrayList = h.a.z.INSTANCE;
                    } else {
                        ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(com.ss.android.ugc.aweme.commentStickerPanel.net.a.a(it.next()));
                        }
                        arrayList = arrayList2;
                    }
                    list4.addAll(arrayList);
                    l lVar = this.f73245a;
                    if (cVar == null || (num2 = cVar.f73124b) == null) {
                        i2 = this.f73245a.f73235e;
                    } else {
                        i2 = num2.intValue();
                    }
                    lVar.f73235e = i2;
                    l lVar2 = this.f73245a;
                    if (cVar == null || (num = cVar.f73125c) == null || num.intValue() != 1) {
                        z = false;
                    }
                    lVar2.f73236f = z;
                    if (this.f73245a.f73236f) {
                        l.b(this.f73245a).setVisibility(0);
                        l.c(this.f73245a).setVisibility(0);
                    } else {
                        l.b(this.f73245a).setVisibility(8);
                        l.c(this.f73245a).setVisibility(8);
                    }
                    RecyclerView.a adapter = l.d(this.f73245a).getAdapter();
                    if (adapter != null) {
                        adapter.notifyItemInserted(size);
                    }
                } else if (this.f73245a.f73238h.isEmpty()) {
                    this.f73245a.setVisibility(8);
                }
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                if (l.a(this.f73245a).f150286a) {
                    l.a(this.f73245a).b();
                    l.a(this.f73245a).setVisibility(8);
                }
                if (!(obj instanceof g)) {
                    obj = null;
                }
                g gVar = (g) obj;
                if (gVar != null && (list3 = gVar.f73135b) != null && !list3.isEmpty()) {
                    this.f73245a.setVisibility(0);
                    int size2 = this.f73245a.f73238h.size();
                    List<Object> list5 = this.f73245a.f73238h;
                    if (gVar == null || (collection = gVar.f73135b) == null) {
                        collection = h.a.z.INSTANCE;
                    }
                    list5.addAll(collection);
                    l lVar3 = this.f73245a;
                    if (gVar != null) {
                        i3 = gVar.f73136c;
                    } else {
                        i3 = lVar3.f73235e;
                    }
                    lVar3.f73235e = i3;
                    l lVar4 = this.f73245a;
                    if (gVar == null || gVar.f73137d != 1) {
                        z = false;
                    }
                    lVar4.f73236f = z;
                    if (this.f73245a.f73236f) {
                        l.b(this.f73245a).setVisibility(0);
                        l.c(this.f73245a).setVisibility(0);
                    } else {
                        l.b(this.f73245a).setVisibility(8);
                        l.c(this.f73245a).setVisibility(8);
                    }
                    RecyclerView.a adapter2 = l.d(this.f73245a).getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyItemInserted(size2);
                    }
                } else if (this.f73245a.f73238h.isEmpty()) {
                    this.f73245a.setVisibility(8);
                }
            }
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class c extends h.f.b.m implements h.f.a.m<i, com.bytedance.ui_component.a, z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(45112);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(l lVar) {
            super(2);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(i iVar, com.bytedance.ui_component.a aVar) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(aVar, "");
            if (aVar instanceof a.C1131a) {
                this.this$0.f73239i.clear();
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private l(Context context, a aVar) {
        super(context, null, 0);
        h.f.b.l.d(context, "");
        h.f.b.l.d(aVar, "");
        MethodCollector.i(3651);
        this.o = aVar;
        int i2 = n.f73250a[aVar.ordinal()];
        int i3 = R.string.f65;
        if (i2 == 1) {
            i3 = R.string.f66;
        } else if (i2 == 2) {
            i3 = R.string.f67;
        } else if (i2 != 3) {
            if (i2 == 4) {
                i3 = R.string.f64;
            } else if (i2 != 5) {
                n nVar = new n();
                MethodCollector.o(3651);
                throw nVar;
            }
        }
        this.n = i3;
        while (true) {
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    Activity activity = (Activity) context;
                    if (activity != null) {
                        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(CommentAndQuestionAndQuestionStickerPanelViewModel.class);
                        h.f.b.l.b(a2, "");
                        this.f73237g = (CommentAndQuestionAndQuestionStickerPanelViewModel) a2;
                        this.f73238h = new ArrayList();
                        this.f73239i = new ArrayList();
                        d();
                        c();
                        f.a.b.b unused = selectSubscribe(this.f73237g, o.f73287a, new ah(), new c(this));
                        MethodCollector.o(3651);
                        return;
                    }
                }
            } else {
                break;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.o(3651);
        throw nullPointerException;
    }

    public /* synthetic */ l(Context context, a aVar, byte b2) {
        this(context, aVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super i, ? super Throwable, z> mVar, h.f.a.b<? super i, z> bVar, h.f.a.m<? super i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}

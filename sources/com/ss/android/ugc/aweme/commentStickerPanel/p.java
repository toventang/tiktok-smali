package com.ss.android.ugc.aweme.commentStickerPanel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxEditText;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commentStickerPanel.l;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.tools.view.widget.CircleImageView;
import h.n;
import h.z;
import java.util.List;

public final class p extends RecyclerView.a<b> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f73288d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f73289a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Object> f73290b;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.b<Object, z> f73291c;

    /* renamed from: e  reason: collision with root package name */
    private final Context f73292e;

    /* renamed from: f  reason: collision with root package name */
    private final l.a f73293f;

    /* renamed from: g  reason: collision with root package name */
    private final CommentAndQuestionAndQuestionStickerPanelViewModel f73294g;

    static {
        Covode.recordClassIndex(45134);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45135);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f73290b.size();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewAttachedToWindow(b bVar) {
        b bVar2 = bVar;
        h.f.b.l.d(bVar2, "");
        super.onViewAttachedToWindow(bVar2);
        if (this.f73293f.getCurrentTabType() == this.f73294g.f73092c) {
            int i2 = q.f73299b[this.f73293f.ordinal()];
            QaStruct qaStruct = null;
            if (i2 == 1 || i2 == 2) {
                CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.f73294g;
                Object obj = this.f73290b.get(bVar2.getAdapterPosition());
                if (obj instanceof CommentVideoModel) {
                    qaStruct = obj;
                }
                commentAndQuestionAndQuestionStickerPanelViewModel.b(qaStruct);
                return;
            }
            CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel2 = this.f73294g;
            Object obj2 = this.f73290b.get(bVar2.getAdapterPosition());
            if (obj2 instanceof QaStruct) {
                qaStruct = obj2;
            }
            commentAndQuestionAndQuestionStickerPanelViewModel2.a(qaStruct, this.f73293f);
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final View f73295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f73296b;

        static {
            Covode.recordClassIndex(45136);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar, View view) {
            super(view);
            h.f.b.l.d(view, "");
            this.f73296b = pVar;
            this.f73295a = view;
            this.itemView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.commentStickerPanel.p.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f73297a;

                static {
                    Covode.recordClassIndex(45137);
                }

                {
                    this.f73297a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f73297a.f73296b.f73291c.invoke(this.f73297a.f73296b.f73290b.get(this.f73297a.getAdapterPosition()));
                }
            });
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        Object obj;
        b bVar2 = bVar;
        String str = "";
        h.f.b.l.d(bVar2, str);
        Object obj2 = this.f73290b.get(i2);
        View view = bVar2.f73295a;
        if (!(view instanceof com.ss.android.ugc.aweme.commentStickerPanel.itemview.a)) {
            view = null;
        }
        com.ss.android.ugc.aweme.commentStickerPanel.itemview.a aVar = (com.ss.android.ugc.aweme.commentStickerPanel.itemview.a) view;
        if (aVar != null) {
            if (!(obj2 instanceof CommentVideoModel)) {
                obj = null;
            } else {
                obj = obj2;
            }
            aVar.setCommentStickerData((CommentVideoModel) obj);
        }
        View view2 = bVar2.f73295a;
        if (!(view2 instanceof com.ss.android.ugc.aweme.commentStickerPanel.itemview.b)) {
            view2 = null;
        }
        com.ss.android.ugc.aweme.commentStickerPanel.itemview.b bVar3 = (com.ss.android.ugc.aweme.commentStickerPanel.itemview.b) view2;
        if (bVar3 != null) {
            if (!(obj2 instanceof QaStruct)) {
                obj2 = null;
            }
            QaStruct qaStruct = (QaStruct) obj2;
            if (qaStruct != null) {
                UrlModel avatarUrl = qaStruct.getAvatarUrl();
                if (avatarUrl != null) {
                    bVar3.o = avatarUrl;
                    CircleImageView circleImageView = bVar3.f73219h;
                    if (circleImageView == null) {
                        h.f.b.l.a("avatarImage");
                    }
                    com.ss.android.ugc.tools.c.a.a(circleImageView, avatarUrl, -1, -1);
                }
                String questionContent = qaStruct.getQuestionContent();
                if (questionContent != null) {
                    TuxEditText tuxEditText = bVar3.f73220i;
                    if (tuxEditText == null) {
                        h.f.b.l.a("questionEditText");
                    }
                    tuxEditText.setText(questionContent);
                }
                bVar3.f73222k = qaStruct.getQuestionId();
                bVar3.f73223l = qaStruct.getUserId();
                bVar3.f73224m = qaStruct.getSecId();
                bVar3.f73221j = qaStruct.getItemId();
                String userName = qaStruct.getUserName();
                if (userName != null) {
                    str = userName;
                }
                bVar3.n = str;
            }
        }
    }

    private static RecyclerView.ViewHolder a(p pVar, ViewGroup viewGroup, int i2) {
        View aVar;
        MethodCollector.i(3436);
        h.f.b.l.d(viewGroup, "");
        int i3 = q.f73298a[pVar.f73293f.ordinal()];
        boolean z = true;
        if (i3 == 1 || i3 == 2) {
            aVar = new com.ss.android.ugc.aweme.commentStickerPanel.itemview.a(pVar.f73292e);
        } else if (i3 == 3 || i3 == 4 || i3 == 5) {
            Context context = viewGroup.getContext();
            h.f.b.l.b(context, "");
            aVar = new com.ss.android.ugc.aweme.commentStickerPanel.itemview.b(context, (byte) 0);
        } else {
            n nVar = new n();
            MethodCollector.o(3436);
            throw nVar;
        }
        b bVar = new b(pVar, aVar);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
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
        MethodCollector.o(3436);
        return bVar;
    }

    public p(Context context, l.a aVar, CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel, List<? extends Object> list, h.f.a.b<Object, z> bVar) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(commentAndQuestionAndQuestionStickerPanelViewModel, "");
        h.f.b.l.d(list, "");
        h.f.b.l.d(bVar, "");
        this.f73292e = context;
        this.f73293f = aVar;
        this.f73294g = commentAndQuestionAndQuestionStickerPanelViewModel;
        this.f73290b = list;
        this.f73291c = bVar;
        this.f73289a = list.size();
    }
}

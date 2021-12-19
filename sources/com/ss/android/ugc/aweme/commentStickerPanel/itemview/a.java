package com.ss.android.ugc.aweme.commentStickerPanel.itemview;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.tools.view.widget.CircleImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public View f73210a;

    /* renamed from: b  reason: collision with root package name */
    private Context f73211b;

    /* renamed from: c  reason: collision with root package name */
    private CommentVideoModel f73212c;

    /* renamed from: d  reason: collision with root package name */
    private final h f73213d = i.a((h.f.a.a) new C1632a(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f73214e = i.a((h.f.a.a) new b(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f73215f = i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(45097);
    }

    private final CircleImageView getAvatarView() {
        return (CircleImageView) this.f73213d.getValue();
    }

    private final TuxTextView getCommentTextView() {
        return (TuxTextView) this.f73214e.getValue();
    }

    private final int getMReplyTextId() {
        return R.string.fcp;
    }

    private final TuxTextView getRepliedTextView() {
        return (TuxTextView) this.f73215f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.a$a  reason: collision with other inner class name */
    static final class C1632a extends m implements h.f.a.a<CircleImageView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(45098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1632a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CircleImageView invoke() {
            return a.a(this.this$0).findViewById(R.id.a9u);
        }
    }

    static final class b extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(45099);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return a.a(this.this$0).findViewById(R.id.a_p);
        }
    }

    static final class c extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(45100);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return a.a(this.this$0).findViewById(R.id.aap);
        }
    }

    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73216a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f73217b;

        static {
            Covode.recordClassIndex(45101);
        }

        public final void onGlobalLayout() {
            this.f73216a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f73217b.invoke();
        }

        d(a aVar, h.f.a.a aVar2) {
            this.f73216a = aVar;
            this.f73217b = aVar2;
        }
    }

    public final View getRoot() {
        View view = this.f73210a;
        if (view == null) {
            l.a("root");
        }
        return view;
    }

    public static final /* synthetic */ View a(a aVar) {
        View view = aVar.f73210a;
        if (view == null) {
            l.a("root");
        }
        return view;
    }

    private final void setAvatarImage(UrlModel urlModel) {
        if (urlModel != null) {
            com.ss.android.ugc.tools.c.a.a(getAvatarView(), urlModel, -1, -1);
        }
    }

    public final void setUpdateTopMarginListener(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        getViewTreeObserver().addOnGlobalLayoutListener(new d(this, aVar));
    }

    private final void setAuthorName(String str) {
        if (!TextUtils.isEmpty(str)) {
            TuxTextView repliedTextView = getRepliedTextView();
            Context context = getContext();
            l.b(context, "");
            repliedTextView.setText(context.getResources().getString(getMReplyTextId(), str));
        }
    }

    private final void setCommentMsg(String str) {
        if (!TextUtils.isEmpty(str)) {
            Context context = this.f73211b;
            if (context == null) {
                l.a("mContext");
            }
            if (com.ss.android.ugc.aweme.tools.c.a(context)) {
                getCommentTextView().setGravity(5);
            }
            getCommentTextView().setText(str);
        }
    }

    public final void setCommentStickerData(CommentVideoModel commentVideoModel) {
        UrlModel urlModel;
        String str;
        this.f73212c = commentVideoModel;
        String str2 = null;
        if (commentVideoModel != null) {
            urlModel = commentVideoModel.getUserAvatar();
        } else {
            urlModel = null;
        }
        setAvatarImage(urlModel);
        CommentVideoModel commentVideoModel2 = this.f73212c;
        if (commentVideoModel2 != null) {
            str = commentVideoModel2.getCommentMsg();
        } else {
            str = null;
        }
        setCommentMsg(str);
        CommentVideoModel commentVideoModel3 = this.f73212c;
        if (commentVideoModel3 != null) {
            str2 = commentVideoModel3.getUserName();
        }
        setAuthorName(str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(4390);
        this.f73211b = context;
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.nq, this, true);
        l.b(a2, "");
        this.f73210a = a2;
        MethodCollector.o(4390);
    }
}

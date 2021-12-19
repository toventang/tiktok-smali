package com.ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem;
import com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class b extends f<CommentAtSummonFriendItem> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f71339c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AbstractC1609b f71340a;

    /* renamed from: b  reason: collision with root package name */
    public int f71341b;

    /* renamed from: d  reason: collision with root package name */
    private CommentAtSearchLoadingView f71342d;

    /* renamed from: e  reason: collision with root package name */
    private final Aweme f71343e;

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.b$b  reason: collision with other inner class name */
    public interface AbstractC1609b {
        static {
            Covode.recordClassIndex(43925);
        }

        void a(int i2, CommentAtSummonFriendItem commentAtSummonFriendItem);

        void a(User user);
    }

    static {
        Covode.recordClassIndex(43923);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43924);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final void ag_() {
        super.ag_();
        CommentAtSearchLoadingView commentAtSearchLoadingView = this.f71342d;
        if (commentAtSearchLoadingView != null) {
            commentAtSearchLoadingView.a(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final void ai_() {
        super.ai_();
        CommentAtSearchLoadingView commentAtSearchLoadingView = this.f71342d;
        if (commentAtSearchLoadingView != null) {
            commentAtSearchLoadingView.a(false);
        }
    }

    public b(Aweme aweme) {
        this.f71343e = aweme;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        CommentAtSearchLoadingView commentAtSearchLoadingView;
        Context context;
        Context context2;
        RecyclerView.ViewHolder a_ = super.a_(viewGroup);
        View view = a_.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        DmtStatusView dmtStatusView = (DmtStatusView) view;
        String str = null;
        if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
            commentAtSearchLoadingView = null;
        } else {
            commentAtSearchLoadingView = new CommentAtSearchLoadingView(context2, (AttributeSet) null, 6);
        }
        this.f71342d = commentAtSearchLoadingView;
        dmtStatusView.setBuilder(dmtStatusView.c().a(this.f71342d));
        View b2 = dmtStatusView.b(2);
        Objects.requireNonNull(b2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) b2;
        if (!(viewGroup == null || (context = viewGroup.getContext()) == null)) {
            str = context.getString(R.string.cys);
        }
        textView.setText(str);
        Context context3 = textView.getContext();
        l.b(context3, "");
        textView.setTextColor(context3.getResources().getColor(R.color.c2));
        l.b(a_, "");
        return a_;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.j2, viewGroup, false);
        l.b(a2, "");
        return new c(a2);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        Objects.requireNonNull(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.adapter.CommentAtSearchViewHolder");
        Object obj = this.f76354l.get(i2);
        l.b(obj, "");
        ((c) viewHolder).a((CommentAtSummonFriendItem) obj, this.f71343e, this.f71340a);
    }
}

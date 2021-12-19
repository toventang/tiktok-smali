package com.ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class CommentBubbleTaggedPeopleView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TuxTextView f71690a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f71691b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.barrage.a f71692c;

    static {
        Covode.recordClassIndex(44097);
    }

    public CommentBubbleTaggedPeopleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentBubbleTaggedPeopleView f71693a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.comment.barrage.a f71694b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f71695c;

        static {
            Covode.recordClassIndex(44098);
        }

        public a(CommentBubbleTaggedPeopleView commentBubbleTaggedPeopleView, com.ss.android.ugc.aweme.comment.barrage.a aVar, Aweme aweme) {
            this.f71693a = commentBubbleTaggedPeopleView;
            this.f71694b = aVar;
            this.f71695c = aweme;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            d dVar = new d();
            com.ss.android.ugc.aweme.comment.barrage.a aVar = this.f71694b;
            String str2 = null;
            if (aVar != null) {
                str = aVar.f71533b;
            } else {
                str = null;
            }
            d a2 = dVar.a("enter_from", str);
            String aid = this.f71695c.getAid();
            String str3 = "";
            if (aid == null) {
                aid = str3;
            }
            d a3 = a2.a("group_id", aid);
            String authorUid = this.f71695c.getAuthorUid();
            if (authorUid != null) {
                str3 = authorUid;
            }
            r.a("tag_anchor_click", a3.a("author_id", str3).a("anchor_type", "low_interest").f66730a);
            CommentService e2 = CommentServiceImpl.e();
            Context context = this.f71693a.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            e eVar = (e) context;
            Aweme aweme = this.f71695c;
            com.ss.android.ugc.aweme.comment.barrage.a aVar2 = this.f71694b;
            if (aVar2 != null) {
                str2 = aVar2.f71533b;
            }
            e2.a(eVar, aweme, str2, "low_interest");
        }
    }

    private /* synthetic */ CommentBubbleTaggedPeopleView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentBubbleTaggedPeopleView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(638);
        FrameLayout.inflate(context, R.layout.i4, this);
        View findViewById = findViewById(R.id.eic);
        l.b(findViewById, "");
        this.f71690a = (TuxTextView) findViewById;
        MethodCollector.o(638);
    }
}

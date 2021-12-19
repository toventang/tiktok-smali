package com.ss.android.ugc.aweme.comment.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.d;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.comment.a.c;
import com.ss.android.ugc.aweme.comment.f.h;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.comment.ui.bq;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentBatchManagementViewModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.i18n.b;
import com.zhiliaoapp.musically.R;

public final class f extends RecyclerView.ViewHolder implements h {

    /* renamed from: a  reason: collision with root package name */
    View f71359a = this.itemView.findViewById(R.id.dqe);

    /* renamed from: b  reason: collision with root package name */
    View f71360b = this.itemView.findViewById(R.id.ayr);

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f71361c = ((LinearLayout) this.itemView.findViewById(R.id.c7f));

    /* renamed from: d  reason: collision with root package name */
    DmtLoadingLayout f71362d = ((DmtLoadingLayout) this.itemView.findViewById(R.id.c7g));

    /* renamed from: e  reason: collision with root package name */
    TextView f71363e = ((TextView) this.itemView.findViewById(R.id.f5v));

    /* renamed from: f  reason: collision with root package name */
    View f71364f = this.itemView.findViewById(R.id.a8a);

    /* renamed from: g  reason: collision with root package name */
    ImageView f71365g = ((ImageView) this.itemView.findViewById(R.id.bna));

    /* renamed from: h  reason: collision with root package name */
    public CommentReplyButtonStruct f71366h;

    /* renamed from: i  reason: collision with root package name */
    protected CommentBatchManagementViewModel f71367i;

    /* renamed from: j  reason: collision with root package name */
    private u<Boolean> f71368j;

    static {
        Covode.recordClassIndex(43932);
    }

    @Override // com.ss.android.ugc.aweme.comment.f.h
    public final int d() {
        return this.f71366h.getButtonStatus();
    }

    private void h() {
        this.f71361c.setVisibility(8);
        this.f71362d.setVisibility(0);
    }

    public final void c() {
        if (this.f71367i != null && (this.itemView.getContext() instanceof e) && c.a()) {
            this.f71367i.a().removeObserver(this.f71368j);
        }
    }

    private void g() {
        MethodCollector.i(1451);
        this.f71361c.setVisibility(0);
        this.f71362d.setVisibility(8);
        this.f71360b.setVisibility(8);
        this.f71364f.setVisibility(0);
        if (com.ss.android.ugc.aweme.comment.d.c.e()) {
            this.f71361c.removeView(this.f71364f);
            this.f71361c.addView(this.f71364f, 0);
        }
        MethodCollector.o(1451);
    }

    public final void b() {
        if (this.f71367i != null && (this.itemView.getContext() instanceof e) && c.a()) {
            this.f71367i.a().observe((d) this.itemView.getContext(), this.f71368j);
        }
    }

    private void e() {
        MethodCollector.i(1407);
        this.f71361c.setVisibility(0);
        this.f71362d.setVisibility(8);
        TextView textView = this.f71363e;
        textView.setText(a.a(textView.getResources().getString(R.string.ajt), new Object[]{b.a(this.f71366h.getReplyCommentTotal() - ((long) this.f71366h.getExpandSize()))}));
        this.f71360b.setVisibility(0);
        this.f71364f.setVisibility(8);
        if (com.ss.android.ugc.aweme.comment.d.c.e()) {
            this.f71361c.removeView(this.f71364f);
            this.f71361c.addView(this.f71364f, 2);
        }
        MethodCollector.o(1407);
    }

    private void i() {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        if (c.a() && (commentBatchManagementViewModel = this.f71367i) != null && commentBatchManagementViewModel.a().getValue().booleanValue()) {
            if (!TextUtils.equals(this.f71363e.getText(), this.itemView.getContext().getResources().getString(R.string.ajs))) {
                r.onEventV3("comment_batch_management_view_replies_ck");
            } else {
                r.onEventV3("comment_batch_management_view_more_ck");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f71366h.getReplyCommentTotal() > ((long) this.f71366h.getTopSize()) || this.f71366h.getButtonStatus() == 4) {
            int buttonStatus = this.f71366h.getButtonStatus();
            if (buttonStatus == 0) {
                e();
            } else if (buttonStatus == 1) {
                f();
            } else if (buttonStatus == 2) {
                i();
                CommentReplyButtonStruct commentReplyButtonStruct = this.f71366h;
                if (commentReplyButtonStruct != null) {
                    int expandSize = commentReplyButtonStruct.getExpandSize();
                    this.f71366h.setReplyCommentTotal((long) expandSize);
                    if (expandSize <= this.f71366h.getTopSize()) {
                        a(4);
                        return;
                    }
                }
                g();
            } else if (buttonStatus == 3) {
                h();
            } else if (buttonStatus == 4) {
                this.itemView.getLayoutParams().height = 0;
                this.itemView.requestLayout();
            }
        } else {
            a(4);
        }
    }

    private void f() {
        i();
        this.f71361c.setVisibility(0);
        this.f71362d.setVisibility(8);
        this.f71360b.setVisibility(0);
        if (com.ss.android.ugc.aweme.comment.d.c.e()) {
            this.f71364f.setVisibility(8);
        } else {
            this.f71364f.setVisibility(0);
        }
        if (com.ss.android.ugc.aweme.comment.d.c.b() || com.ss.android.ugc.aweme.comment.d.c.c()) {
            long replyCommentTotal = this.f71366h.getReplyCommentTotal() - ((long) this.f71366h.getExpandSize());
            if (replyCommentTotal > 0) {
                this.f71363e.setText(a.a(this.f71363e.getResources().getString(R.string.ajs) + " (%s)", new Object[]{b.a(replyCommentTotal)}));
                return;
            }
            this.f71363e.setText(R.string.ajs);
            return;
        }
        this.f71363e.setText(R.string.ajs);
    }

    @Override // com.ss.android.ugc.aweme.comment.f.h
    public final void a(int i2) {
        CommentReplyButtonStruct commentReplyButtonStruct = this.f71366h;
        if (commentReplyButtonStruct != null) {
            commentReplyButtonStruct.setButtonStatus(i2);
        }
        a();
    }

    public f(ViewGroup viewGroup, final com.ss.android.ugc.aweme.comment.g.a aVar) {
        super(a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.iu, viewGroup, false));
        this.f71360b.setOnTouchListener(new bq() {
            /* class com.ss.android.ugc.aweme.comment.adapter.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43933);
            }

            @Override // com.ss.android.ugc.aweme.comment.ui.bq
            public final void a(View view) {
                if (f.this.f71366h != null && aVar != null && f.this.f71366h.getButtonStatus() != 3) {
                    aVar.a(f.this.f71366h, f.this);
                }
            }
        });
        this.f71364f.setOnTouchListener(new bq() {
            /* class com.ss.android.ugc.aweme.comment.adapter.f.AnonymousClass2 */

            static {
                Covode.recordClassIndex(43934);
            }

            @Override // com.ss.android.ugc.aweme.comment.ui.bq
            public final void a(View view) {
                if (f.this.f71366h != null && aVar != null && f.this.f71366h.getButtonStatus() != 3) {
                    f.this.f71366h.setButtonStatus(2);
                    aVar.a(f.this.f71366h, f.this);
                }
            }
        });
        this.f71362d.setProgressBarInfo(n.a(28.0d));
        if (c.a()) {
            this.f71367i = CommentBatchManagementViewModel.a.a((e) this.itemView.getContext());
            this.f71368j = new g(this);
        }
    }
}

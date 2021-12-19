package com.ss.android.ugc.aweme.comment.widget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.comment.c.m;
import com.ss.android.ugc.aweme.comment.f.k;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.n.a;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.ss.android.ugc.aweme.comment.ui.by;
import com.ss.android.ugc.aweme.comment.util.f;
import com.ss.android.ugc.aweme.comment.util.r;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;

public final class b implements u<m>, k {

    /* renamed from: a  reason: collision with root package name */
    private Context f73035a;

    /* renamed from: b  reason: collision with root package name */
    private by f73036b;

    /* renamed from: c  reason: collision with root package name */
    private by f73037c;

    /* renamed from: d  reason: collision with root package name */
    private Comment f73038d;

    /* renamed from: e  reason: collision with root package name */
    private CommentTranslationStatusView f73039e;

    /* renamed from: f  reason: collision with root package name */
    private a f73040f = a.a();

    /* renamed from: g  reason: collision with root package name */
    private boolean f73041g;

    static {
        Covode.recordClassIndex(44984);
    }

    @Override // com.ss.android.ugc.aweme.comment.f.k
    public final void b() {
        Comment comment = this.f73038d;
        if (comment != null) {
            this.f73040f.a(comment);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.k
    public final void a() {
        com.ss.android.ugc.aweme.comment.n.b a2;
        if (this.f73038d != null && (a2 = a(this.f73038d, SettingServiceImpl.v().h())) != null) {
            this.f73040f.a(this.f73038d, a2, this.f73039e);
        }
    }

    public b(Context context) {
        this.f73035a = context;
    }

    private static String a(Comment comment) {
        String a2 = f.a(comment, false);
        if (TextUtils.isEmpty(a2)) {
            return "";
        }
        boolean[] zArr = new boolean[a2.length()];
        if (comment.getTextExtra() != null) {
            for (TextExtraStruct textExtraStruct : comment.getTextExtra()) {
                for (int max = Math.max(0, textExtraStruct.getStart()); max < Math.min(a2.length(), textExtraStruct.getEnd()); max++) {
                    zArr[max] = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < a2.length(); i2++) {
            if (!zArr[i2]) {
                sb.append(a2.charAt(i2));
            }
        }
        return r.a(sb.toString().trim());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(m mVar) {
        Activity a2;
        CharSequence a3;
        m mVar2 = mVar;
        if (mVar2 != null && mVar2.f71770a != null && (a2 = o.a(this.f73035a)) != null && !a2.isFinishing()) {
            Comment comment = mVar2.f71770a;
            if (mVar2.f71771b) {
                this.f73039e.setLoading(false);
                boolean c2 = com.ss.android.ugc.aweme.comment.a.a.c();
                by byVar = this.f73036b;
                Boolean valueOf = Boolean.valueOf(c2);
                if (this.f73041g) {
                    a3 = new a.C0730a().a(comment.getText(), new CommentTranslationBlock$2(this, androidx.core.content.b.c(this.f73035a, R.color.bx)), 18).a(" " + f.a(comment), new CommentTranslationBlock$1(this, androidx.core.content.b.c(this.f73035a, R.color.bz)), 18).f33382a;
                } else {
                    a3 = f.a(comment, !valueOf.booleanValue());
                }
                byVar.a(a3, f.a(comment, this.f73035a, c2));
                List<Comment> replyComments = comment.getReplyComments();
                if (comment.getCommentType() == 0 && this.f73037c != null && !com.bytedance.common.utility.collection.b.a((Collection) replyComments)) {
                    Comment comment2 = replyComments.get(0);
                    this.f73037c.a(f.a(comment2, true), f.a(comment2, this.f73035a, c2));
                    return;
                }
                return;
            }
            Exception exc = mVar2.f71772c;
            this.f73039e.setLoading(false);
            if (exc != null) {
                com.ss.android.ugc.aweme.app.api.b.a.a(this.f73035a, (Throwable) exc, (int) R.string.g4j);
            }
        }
    }

    public static com.ss.android.ugc.aweme.comment.n.b a(Comment comment, String str) {
        com.ss.android.ugc.aweme.comment.n.b bVar = new com.ss.android.ugc.aweme.comment.n.b();
        String a2 = a(comment);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        bVar.a(a2);
        if (comment.getCommentType() == 0 && !com.bytedance.common.utility.collection.b.a((Collection) comment.getReplyComments())) {
            bVar.a(a(comment.getReplyComments().get(0)));
        }
        bVar.f72121b = str;
        return bVar;
    }

    public final void a(Context context, Comment comment, by byVar, by byVar2, CommentTranslationStatusView commentTranslationStatusView) {
        if (comment == null || comment.isTranslated()) {
            if (commentTranslationStatusView != null) {
                commentTranslationStatusView.setVisibility(8);
            }
        } else if (commentTranslationStatusView != null) {
            Comment comment2 = this.f73038d;
            if (comment2 != null) {
                this.f73040f.a(comment2.getCid()).removeObserver(this);
            }
            this.f73035a = context;
            this.f73038d = comment;
            this.f73036b = byVar;
            this.f73037c = byVar2;
            this.f73039e = commentTranslationStatusView;
            androidx.lifecycle.m a2 = byVar.a();
            if (a2 == null) {
                this.f73040f.a(this.f73038d.getCid()).a(this, false);
            } else {
                this.f73040f.a(this.f73038d.getCid()).a(a2, this, false);
            }
            this.f73039e.setLoadingText(R.string.amp);
            this.f73039e.setLoading(this.f73040f.b(this.f73038d));
            this.f73040f.b(this.f73038d);
        }
    }
}

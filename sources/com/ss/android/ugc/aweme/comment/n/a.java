package com.ss.android.ugc.aweme.comment.n;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.c;
import com.ss.android.ugc.aweme.base.livedata.a;
import com.ss.android.ugc.aweme.comment.c.m;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f72115b;

    /* renamed from: a  reason: collision with root package name */
    HashMap<String, Comment> f72116a = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f72117c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, Comment> f72118d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private Set<String> f72119e = new HashSet();

    static {
        Covode.recordClassIndex(44317);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(929);
        if (f72115b == null) {
            synchronized (a.class) {
                try {
                    if (f72115b == null) {
                        f72115b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(929);
                    throw th;
                }
            }
        }
        a aVar = f72115b;
        MethodCollector.o(929);
        return aVar;
    }

    public final c<m> a(String str) {
        this.f72119e.add(str);
        return a.C1541a.f68149a.a(str);
    }

    public final Comment b(String str) {
        return this.f72116a.get(str);
    }

    public final boolean b(Comment comment) {
        return this.f72117c.contains(comment.getCid());
    }

    public final void a(androidx.lifecycle.m mVar) {
        for (String str : this.f72119e) {
            if (!TextUtils.isEmpty(str)) {
                if (mVar != null) {
                    a(str).removeObservers(mVar);
                }
                a.C1541a.f68149a.f68148a.remove(str);
            }
        }
        this.f72119e.clear();
        this.f72116a.clear();
        this.f72118d.clear();
    }

    public final void a(Comment comment) {
        a(comment, this.f72118d.get(comment.getCid()), false);
        a().a(comment.getCid()).setValue(new m(comment, true));
    }

    public final void a(Comment comment, boolean z) {
        if (z) {
            this.f72117c.add(comment.getCid());
        } else {
            this.f72117c.remove(comment.getCid());
        }
    }

    private static void a(Comment comment, Comment comment2, boolean z) {
        while (comment != null && comment2 != null) {
            comment.setTranslated(z);
            comment.setText(comment2.getText());
            comment.setTextExtra(comment2.getTextExtra());
            if (comment.getCommentType() == 0 && !b.a((Collection) comment.getReplyComments()) && !b.a((Collection) comment2.getReplyComments())) {
                comment = comment.getReplyComments().get(0);
                comment2 = comment2.getReplyComments().get(0);
            } else {
                return;
            }
        }
    }

    public final void a(Comment comment, b bVar, CommentTranslationStatusView commentTranslationStatusView) {
        Comment b2 = b(comment.getCid());
        if (b2 != null) {
            a(comment, b2, true);
            a().a(comment.getCid()).setValue(new m(comment, true));
            return;
        }
        a(comment, true);
        this.f72118d.put(comment.getCid(), comment.clone());
        commentTranslationStatusView.setLoadingText(R.string.amp);
        commentTranslationStatusView.setLoading(true);
        com.ss.android.b.a.a.a.a(new c(comment, bVar));
    }
}

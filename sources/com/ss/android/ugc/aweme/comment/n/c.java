package com.ss.android.ugc.aweme.comment.n;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.k;
import com.google.c.h.a.l;
import com.google.gson.f;
import com.ss.android.ugc.aweme.comment.c.m;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.util.r;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.translation.a.a;
import com.ss.android.ugc.aweme.translation.api.TranslationApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public Comment f72124a;

    /* renamed from: b  reason: collision with root package name */
    private b f72125b;

    static {
        Covode.recordClassIndex(44320);
    }

    public final void run() {
        try {
            l.a(TranslationApi.a(this.f72125b.f72121b, new f().b(this.f72125b.f72120a), 2), new k<a>() {
                /* class com.ss.android.ugc.aweme.comment.n.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(44321);
                }

                @Override // com.google.c.h.a.k
                public final void onFailure(Throwable th) {
                    c.this.a(th);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.c.h.a.k
                public final /* synthetic */ void onSuccess(a aVar) {
                    List<com.ss.android.ugc.aweme.translation.a.c> list = aVar.f141008a;
                    if (!b.a((Collection) list)) {
                        c.this.a(list.get(0), false);
                        if (list.size() > 1) {
                            c.this.a(list.get(1), true);
                        }
                        c.this.f72124a.setTranslated(true);
                        a.a().a(c.this.f72124a, false);
                        a a2 = a.a();
                        Comment comment = c.this.f72124a;
                        if (comment != null) {
                            Comment clone = comment.clone();
                            a2.f72116a.put(comment.getCid(), clone);
                            if (comment.getCommentType() == 0 && !b.a((Collection) clone.getReplyComments())) {
                                Comment comment2 = clone.getReplyComments().get(0);
                                a2.f72116a.put(comment2.getCid(), comment2);
                            }
                        }
                        a.a().a(c.this.f72124a.getCid()).setValue(new m(c.this.f72124a, true));
                    }
                }
            }, com.ss.android.ugc.aweme.base.m.f68150a);
        } catch (Exception e2) {
            e2.printStackTrace();
            a(new Exception());
        }
    }

    public final void a(Throwable th) {
        a.a().a(this.f72124a, false);
        m mVar = new m(this.f72124a, false);
        if (th instanceof Exception) {
            mVar.f71772c = (Exception) th;
        }
        a.a().a(this.f72124a.getCid()).setValue(mVar);
    }

    public c(Comment comment, b bVar) {
        this.f72124a = comment;
        this.f72125b = bVar;
    }

    public final void a(com.ss.android.ugc.aweme.translation.a.c cVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String b2 = r.b(cVar.f141015a);
        sb.append(b2 + " ");
        Comment comment = this.f72124a;
        if (z) {
            List<Comment> replyComments = comment.getReplyComments();
            if (b.a((Collection) replyComments)) {
                a(new Exception());
            } else {
                comment = replyComments.get(0);
            }
        }
        if (comment.getTextExtra() != null) {
            for (int i2 = 0; i2 < comment.getTextExtra().size(); i2++) {
                TextExtraStruct textExtraStruct = comment.getTextExtra().get(i2);
                String str = com.ss.android.ugc.aweme.comment.util.f.c(comment).substring(Math.min(Math.max(textExtraStruct.getStart(), 0), com.ss.android.ugc.aweme.comment.util.f.c(comment).length()), Math.min(textExtraStruct.getEnd(), com.ss.android.ugc.aweme.comment.util.f.c(comment).length())) + " ";
                sb.append(str);
                TextExtraStruct clone = textExtraStruct.clone();
                int length = str.length();
                if (i2 == 0) {
                    clone.setStart(b2.length());
                } else {
                    clone.setStart(((TextExtraStruct) arrayList.get(i2 - 1)).getEnd() + 1);
                }
                clone.setEnd(clone.getStart() + length);
                arrayList.add(clone);
            }
        }
        String sb2 = sb.toString();
        Comment comment2 = this.f72124a;
        if (z && !b.a((Collection) comment2.getReplyComments())) {
            comment2 = this.f72124a.getReplyComments().get(0);
        }
        comment2.setText(sb2);
        comment2.setTextExtra(arrayList);
    }
}

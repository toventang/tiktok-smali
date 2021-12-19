package com.ss.android.ugc.aweme.comment.j;

import b.g;
import b.i;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.adapter.d;
import com.ss.android.ugc.aweme.comment.api.CommentApi;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.framework.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class o extends i {
    static {
        Covode.recordClassIndex(44262);
    }

    @Override // com.ss.android.ugc.aweme.comment.j.i, com.ss.android.ugc.aweme.common.e.a
    public final List<Comment> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((CommentItemList) this.mData).items;
    }

    @Override // com.ss.android.ugc.aweme.common.b, com.ss.android.ugc.aweme.comment.j.i
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 7) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.comment.j.i
    public final void a(List<Comment> list) {
        if (!b.a((Collection) list)) {
            ((CommentItemList) this.mData).replyStyle = 2;
            if (this.mListQueryType == 4) {
                ((CommentItemList) this.mData).items = new ArrayList();
            }
            for (Comment comment : list) {
                comment.setCommentType(2);
                ((CommentItemList) this.mData).items.add(comment);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.j.i, com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        String valueOf;
        if (objArr[5] == null) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(objArr[5]);
        }
        a(String.valueOf(objArr[1]), ((Long) objArr[3]).longValue(), p.a(String.valueOf(objArr[1])).f72066b, String.valueOf(objArr[2]), String.valueOf(objArr[4]), valueOf, ((Integer) objArr[6]).intValue());
    }

    @Override // com.ss.android.ugc.aweme.comment.j.i, com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        String valueOf;
        if (objArr[5] == null) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(objArr[5]);
        }
        a(String.valueOf(objArr[1]), ((Long) objArr[3]).longValue(), p.a(String.valueOf(objArr[1])).f72066b, String.valueOf(objArr[2]), String.valueOf(objArr[4]), valueOf, ((Integer) objArr[6]).intValue());
    }

    private void a(String str, long j2, int i2, String str2, String str3, String str4, int i3) {
        this.f72034c = "reply";
        a.b(4, "CommentLog", "CommentReplyListModel: fetchList: aid = " + this.f72033b + " commentId = " + str);
        if (d.a().f71352a) {
            CommentApi.a(str, j2, i2, str2, str3, str4, i3).a(new g<CommentItemList, CommentItemList>() {
                /* class com.ss.android.ugc.aweme.comment.j.o.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(44263);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                @Override // b.g
                public final /* synthetic */ CommentItemList then(i<CommentItemList> iVar) {
                    if (!iVar.c()) {
                        return o.a(iVar.d());
                    }
                    throw iVar.e();
                }
            }).a(new com.ss.android.ugc.aweme.net.g(this.mHandler));
        } else {
            CommentApi.a(str, j2, i2, str2, str3, str4, i3).a(new com.ss.android.ugc.aweme.net.g(this.mHandler));
        }
    }
}

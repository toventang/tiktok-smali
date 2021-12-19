package com.ss.android.ugc.aweme.comment.util;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.f.l;
import com.ss.android.ugc.aweme.comment.j.p;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class v implements l {

    /* renamed from: a  reason: collision with root package name */
    public List<CommentReplyListItem> f72883a;

    /* renamed from: b  reason: collision with root package name */
    public List<Comment> f72884b;

    /* renamed from: c  reason: collision with root package name */
    private String f72885c = "";

    /* renamed from: d  reason: collision with root package name */
    private int f72886d;

    /* renamed from: e  reason: collision with root package name */
    private Comment f72887e;

    static {
        Covode.recordClassIndex(44893);
    }

    @Override // com.ss.android.ugc.aweme.comment.f.l
    public final List<Comment> a() {
        return this.f72884b;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.l
    public final void c() {
        List<CommentReplyListItem> list = this.f72883a;
        if (list != null) {
            list.clear();
        }
        List<Comment> list2 = this.f72884b;
        if (list2 != null) {
            list2.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.l
    public final void b() {
        if (this.f72883a == null) {
            this.f72883a = new ArrayList();
        }
        if (this.f72884b == null) {
            this.f72884b = new ArrayList();
        }
        this.f72887e = null;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.l
    public final void a(int i2) {
        this.f72886d = i2;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.l
    public final void a(String str) {
        if (str == null) {
            str = "";
        }
        this.f72885c = str;
    }

    public final List<Comment> b(String str) {
        try {
            if (b.a((Collection) this.f72883a)) {
                return null;
            }
            return this.f72883a.get(Integer.parseInt(str)).mReplyComments;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final CommentReplyListItem e(String str) {
        List<CommentReplyListItem> list = this.f72883a;
        if (list == null) {
            return null;
        }
        for (CommentReplyListItem commentReplyListItem : list) {
            if (commentReplyListItem.mComment != null && TextUtils.equals(commentReplyListItem.mComment.getCid(), str)) {
                return commentReplyListItem;
            }
        }
        return null;
    }

    public final int f(String str) {
        if (this.f72883a == null) {
            return -1;
        }
        for (int i2 = 0; i2 < this.f72883a.size(); i2++) {
            CommentReplyListItem commentReplyListItem = this.f72883a.get(i2);
            if (!(commentReplyListItem == null || commentReplyListItem.mComment == null || !TextUtils.equals(commentReplyListItem.mComment.getCid(), str))) {
                return i2;
            }
        }
        return -1;
    }

    public final void a(Comment comment) {
        if (!(this.f72883a == null || comment == null)) {
            CommentReplyListItem commentReplyListItem = new CommentReplyListItem();
            commentReplyListItem.mComment = comment;
            commentReplyListItem.mReplyComments = comment.getReplyComments();
            List<CommentReplyListItem> list = this.f72883a;
            list.add(Math.min(0, list.size()), commentReplyListItem);
            if (Math.min(0, this.f72883a.size()) == 0) {
                for (CommentReplyListItem commentReplyListItem2 : this.f72883a) {
                    CommentReplyButtonStruct commentReplyButtonStruct = commentReplyListItem2.mButtonStruct;
                    if (commentReplyButtonStruct != null) {
                        commentReplyButtonStruct.setCid(String.valueOf(Math.min(Integer.valueOf(commentReplyButtonStruct.getCid()).intValue() + 1, this.f72883a.size())));
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.l
    public final void a(List<Comment> list) {
        int size;
        if (!(list == null || this.f72883a == null || this.f72884b == null)) {
            for (Comment comment : list) {
                CommentReplyListItem commentReplyListItem = new CommentReplyListItem();
                comment.setCommentType(1);
                comment.setNeedHint(TextUtils.equals(this.f72885c, comment.getCid()));
                if (TextUtils.equals(this.f72885c, comment.getCid())) {
                    this.f72887e = comment;
                }
                commentReplyListItem.mComment = comment;
                if (!this.f72883a.contains(commentReplyListItem)) {
                    this.f72883a.add(commentReplyListItem);
                    this.f72884b.add(comment);
                    List<Comment> replyComments = comment.getReplyComments();
                    if (replyComments == null) {
                        size = 0;
                    } else {
                        size = replyComments.size();
                        if (size > 0) {
                            for (Comment comment2 : comment.getReplyComments()) {
                                comment2.setCommentType(2);
                                comment2.setNeedHint(TextUtils.equals(this.f72885c, comment2.getCid()));
                                if (TextUtils.equals(this.f72885c, comment2.getCid())) {
                                    this.f72887e = comment2;
                                }
                                if (!commentReplyListItem.mReplyComments.contains(comment2)) {
                                    commentReplyListItem.mReplyComments.add(comment2);
                                    this.f72884b.add(comment2);
                                }
                            }
                        }
                    }
                    if (comment.getReplyCommentTotal() - ((long) size) > 0) {
                        CommentReplyButtonStruct commentReplyButtonStruct = new CommentReplyButtonStruct(comment, this.f72883a.size() - 1);
                        commentReplyListItem.mButtonStruct = commentReplyButtonStruct;
                        this.f72884b.add(commentReplyButtonStruct);
                    }
                }
            }
        }
    }

    public final int c(String str) {
        int i2 = 0;
        if (!b.a((Collection) this.f72884b)) {
            for (int i3 = 0; i3 < this.f72884b.size(); i3++) {
                Comment comment = this.f72884b.get(i3);
                if (TextUtils.equals(comment.getFakeId(), str)) {
                    if (comment.getCommentType() == 2) {
                        CommentReplyListItem e2 = e(comment.getReplyId());
                        if (e2 != null) {
                            int indexOf = e2.mReplyComments.indexOf(comment);
                            if (e2.mButtonStruct != null) {
                                if (indexOf < e2.mButtonStruct.getTopSize()) {
                                    e2.mButtonStruct.setTopSize(e2.mButtonStruct.getTopSize() - 1);
                                }
                                e2.mButtonStruct.setExpandSize(e2.mButtonStruct.getExpandSize() - 1);
                                e2.mButtonStruct.setReplyCommentTotal(e2.mComment.getReplyCommentTotal() - 1);
                                if (comment.getReplyCommentTotal() <= ((long) e2.mButtonStruct.getTopSize())) {
                                    e2.mButtonStruct.setStatus(4);
                                }
                            }
                            e2.mComment.setReplyCommentTotal(e2.mComment.getReplyCommentTotal() - 1);
                            e2.mReplyComments.remove(comment);
                            return 1;
                        }
                    } else if (comment.getCommentType() == 1) {
                        CommentReplyListItem e3 = e(comment.getCid());
                        if (e3 != null) {
                            if (e3.mButtonStruct != null) {
                                i2 = e3.mButtonStruct.getExpandSize() + 2;
                            } else {
                                i2 = e3.mReplyComments.size() + 1;
                            }
                            this.f72883a.remove(e3);
                        }
                        return i2;
                    }
                }
            }
        }
        return 0;
    }

    public final int d(String str) {
        int size;
        if (!b.a((Collection) this.f72884b)) {
            for (int i2 = 0; i2 < this.f72884b.size(); i2++) {
                Comment comment = this.f72884b.get(i2);
                if (TextUtils.equals(comment.getCid(), str)) {
                    if (comment.getCommentType() == 2) {
                        CommentReplyListItem e2 = e(comment.getReplyId());
                        if (e2 != null) {
                            int indexOf = e2.mReplyComments.indexOf(comment);
                            if (e2.mButtonStruct != null) {
                                if (indexOf < e2.mButtonStruct.getTopSize()) {
                                    e2.mButtonStruct.setTopSize(e2.mButtonStruct.getTopSize() - 1);
                                }
                                e2.mButtonStruct.setExpandSize(e2.mButtonStruct.getExpandSize() - 1);
                                e2.mButtonStruct.setReplyCommentTotal(e2.mComment.getReplyCommentTotal() - 1);
                                if (comment.getReplyCommentTotal() <= ((long) e2.mButtonStruct.getTopSize())) {
                                    e2.mButtonStruct.setStatus(4);
                                }
                            }
                            e2.mComment.setReplyCommentTotal(e2.mComment.getReplyCommentTotal() - 1);
                            e2.mReplyComments.remove(comment);
                            p.a(e2.mComment.getCid(), -1);
                            return 1;
                        }
                    } else if (comment.getCommentType() == 1) {
                        CommentReplyListItem e3 = e(comment.getCid());
                        if (e3 == null) {
                            return 0;
                        }
                        if (e3.mButtonStruct != null) {
                            size = e3.mButtonStruct.getExpandSize() + 2;
                        } else {
                            size = e3.mReplyComments.size() + 1;
                        }
                        this.f72883a.remove(e3);
                        for (int indexOf2 = this.f72883a.indexOf(e3); indexOf2 < this.f72883a.size(); indexOf2++) {
                            CommentReplyButtonStruct commentReplyButtonStruct = this.f72883a.get(indexOf2).mButtonStruct;
                            if (commentReplyButtonStruct != null) {
                                commentReplyButtonStruct.setCid(String.valueOf(Math.max(Integer.valueOf(commentReplyButtonStruct.getCid()).intValue() - 1, 0)));
                            }
                        }
                        return size;
                    }
                }
            }
        }
        return 0;
    }

    public final boolean a(String str, String str2) {
        List<CommentReplyListItem> list = this.f72883a;
        if (list == null) {
            return false;
        }
        for (CommentReplyListItem commentReplyListItem : list) {
            Comment comment = commentReplyListItem.mComment;
            if (comment != null && TextUtils.equals(comment.getCid(), str2)) {
                List<Comment> list2 = commentReplyListItem.mReplyComments;
                if (list2 == null) {
                    return false;
                }
                for (Comment comment2 : list2) {
                    if (TextUtils.equals(comment2.getCid(), str)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public final boolean a(String str, int i2, Comment comment) {
        CommentReplyListItem e2 = e(str);
        if (e2 != null && i2 >= 0) {
            if (e2.mButtonStruct != null) {
                e2.mButtonStruct.addExpandSize(1);
                e2.mButtonStruct.setReplyCommentTotal(e2.mButtonStruct.getReplyCommentTotal() + 1);
            }
            if (e2.mReplyComments == null) {
                e2.mReplyComments = new ArrayList();
            }
            List<Comment> list = e2.mReplyComments;
            list.add(Math.min(i2, list.size()), comment);
            e2.mComment.setReplyCommentTotal(e2.mComment.getReplyCommentTotal() + 1);
            if (e2.mButtonStruct != null) {
                return true;
            }
        }
        return false;
    }
}

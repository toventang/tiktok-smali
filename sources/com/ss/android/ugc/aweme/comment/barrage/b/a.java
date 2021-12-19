package com.ss.android.ugc.aweme.comment.barrage.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.Comment;
import h.f.b.l;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final Comment f71545a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f71546b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.comment.barrage.a f71547c;

    static {
        Covode.recordClassIndex(44024);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f71545a, aVar.f71545a) && this.f71546b == aVar.f71546b && l.a(this.f71547c, aVar.f71547c);
    }

    public final int hashCode() {
        Comment comment = this.f71545a;
        int i2 = 0;
        int hashCode = (comment != null ? comment.hashCode() : 0) * 31;
        boolean z = this.f71546b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        com.ss.android.ugc.aweme.comment.barrage.a aVar = this.f71547c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "ReactionBubbleCommentItem(comment=" + this.f71545a + ", forceInsert=" + this.f71546b + ", mobEventParam=" + this.f71547c + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a, com.ss.android.ugc.aweme.comment.barrage.b.d
    public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
        l.d(aVar, "");
        return super.b(aVar);
    }

    @Override // com.bytedance.ies.powerlist.b.a, com.ss.android.ugc.aweme.comment.barrage.b.d
    public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
        l.d(aVar, "");
        if (!(aVar instanceof a)) {
            return super.a(aVar);
        }
        if (!l.a((Object) ((a) aVar).f71545a.getText(), (Object) this.f71545a.getText()) || !super.a(aVar)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Comment comment, boolean z, com.ss.android.ugc.aweme.comment.barrage.a aVar) {
        super(1);
        l.d(comment, "");
        this.f71545a = comment;
        this.f71546b = z;
        this.f71547c = aVar;
    }
}

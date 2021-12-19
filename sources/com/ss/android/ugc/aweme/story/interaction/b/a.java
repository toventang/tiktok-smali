package com.ss.android.ugc.aweme.story.interaction.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.Comment;
import h.f.b.l;

public final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    public final Comment f137842a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f137843b;

    /* renamed from: c  reason: collision with root package name */
    public final g f137844c;

    static {
        Covode.recordClassIndex(90173);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f137842a, aVar.f137842a) && this.f137843b == aVar.f137843b && l.a(this.f137844c, aVar.f137844c);
    }

    public final int hashCode() {
        Comment comment = this.f137842a;
        int i2 = 0;
        int hashCode = (comment != null ? comment.hashCode() : 0) * 31;
        boolean z = this.f137843b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        g gVar = this.f137844c;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "ReactionBubbleCommentItem(comment=" + this.f137842a + ", forceInsert=" + this.f137843b + ", mobEventParam=" + this.f137844c + ")";
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.b.e, com.bytedance.ies.powerlist.b.a
    public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
        l.d(aVar, "");
        return super.b(aVar);
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.b.e, com.bytedance.ies.powerlist.b.a
    public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
        l.d(aVar, "");
        if (!(aVar instanceof a)) {
            return super.a(aVar);
        }
        if (!l.a((Object) ((a) aVar).f137842a.getText(), (Object) this.f137842a.getText()) || !super.a(aVar)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Comment comment, boolean z, g gVar) {
        super(1);
        l.d(comment, "");
        this.f137842a = comment;
        this.f137843b = z;
        this.f137844c = gVar;
    }
}

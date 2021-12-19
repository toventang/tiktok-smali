package com.ss.android.ugc.aweme.comment.barrage.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.anchor.c;
import com.ss.android.ugc.aweme.comment.barrage.view.CommentMultiAnchorTagLayout;
import com.ss.android.ugc.aweme.multi.d;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b implements com.ss.android.ugc.aweme.anchor.multi.a.a {
    static {
        Covode.recordClassIndex(44016);
    }

    @Override // com.ss.android.ugc.aweme.anchor.multi.a.a
    public final void a(d dVar, c cVar) {
        l.d(dVar, "");
        l.d(cVar, "");
    }

    @Override // com.ss.android.ugc.aweme.anchor.multi.a.a
    public final void b(d dVar, c cVar) {
        l.d(dVar, "");
        l.d(cVar, "");
    }

    @Override // com.ss.android.ugc.aweme.anchor.multi.a.a
    public final void c(d dVar, c cVar) {
        l.d(dVar, "");
        l.d(cVar, "");
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.comment.barrage.view.c> {
        final /* synthetic */ CommentMultiAnchorTagLayout $tagViewComment;

        static {
            Covode.recordClassIndex(44017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(CommentMultiAnchorTagLayout commentMultiAnchorTagLayout) {
            super(0);
            this.$tagViewComment = commentMultiAnchorTagLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.comment.barrage.view.c invoke() {
            Context context = this.$tagViewComment.getContext();
            l.b(context, "");
            return new com.ss.android.ugc.aweme.comment.barrage.view.c(context, (byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.a.b$b  reason: collision with other inner class name */
    static final class C1612b extends m implements q<com.ss.android.ugc.aweme.comment.barrage.view.c, com.ss.android.ugc.aweme.multi.c, Integer, z> {
        final /* synthetic */ d $chain;

        static {
            Covode.recordClassIndex(44018);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1612b(d dVar) {
            super(3);
            this.$chain = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0067, code lost:
            if (r1 == null) goto L_0x0069;
         */
        @Override // h.f.a.q
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.comment.barrage.view.c r8, com.ss.android.ugc.aweme.multi.c r9, java.lang.Integer r10) {
            /*
            // Method dump skipped, instructions count: 134
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.barrage.a.b.C1612b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}

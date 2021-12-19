package com.ss.android.ugc.aweme.comment.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import h.f.b.l;

public final class CommentAtAvaterWithVerify extends AvatarImageWithVerify {

    /* renamed from: a  reason: collision with root package name */
    public static final a f72462a = new a((byte) 0);

    static {
        Covode.recordClassIndex(44662);
    }

    public CommentAtAvaterWithVerify(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44663);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify
    public final int getVerifyIconSize() {
        return (int) n.b(d.a(), 16.0f);
    }

    private /* synthetic */ CommentAtAvaterWithVerify(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentAtAvaterWithVerify(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}

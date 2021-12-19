package com.ss.android.ugc.aweme.detail.views;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.utils.n;
import h.f.b.l;

public final class AvatarImageWithVerifyInCell extends AvatarImageWithVerify {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79997a = new a((byte) 0);

    static {
        Covode.recordClassIndex(49778);
    }

    public AvatarImageWithVerifyInCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49779);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify
    public final int getVerifyIconMarginEnd() {
        return -n.a(4.0d);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify
    public final int getVerifyIconSize() {
        return n.a(16.0d);
    }

    private /* synthetic */ AvatarImageWithVerifyInCell(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AvatarImageWithVerifyInCell(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}

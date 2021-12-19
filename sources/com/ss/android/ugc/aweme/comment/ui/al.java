package com.ss.android.ugc.aweme.comment.ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class al implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final k f72518a;

    /* renamed from: b  reason: collision with root package name */
    private final int f72519b;

    /* renamed from: c  reason: collision with root package name */
    private final Comment f72520c;

    static {
        Covode.recordClassIndex(44691);
    }

    al(k kVar, int i2, Comment comment) {
        this.f72518a = kVar;
        this.f72519b = i2;
        this.f72520c = comment;
    }

    public final void run() {
        int i2;
        k kVar = this.f72518a;
        int i3 = this.f72519b;
        Comment comment = this.f72520c;
        int i4 = -1;
        if (kVar.a()) {
            i4 = kVar.u.k();
            i2 = kVar.u.n();
        } else {
            i2 = -1;
        }
        if (new int[]{i4, i2}[1] < i3 && kVar.u != null) {
            kVar.u.a(Math.max(0, i3 - 2), -kVar.f72762a);
        }
        if (kVar.f72763b.showReplyWithInsertCid()) {
            kVar.f72765d = comment;
            kVar.f72767j.setHint(d.a().getString(R.string.fcj, in.a(comment.getUser())));
            kVar.f72767j.setMaxLines(1);
            kVar.f72767j.setEllipsize(TextUtils.TruncateAt.END);
            kVar.f72768k.setIconRes(R.raw.icon_gift);
            kVar.f72768k.setAlpha(0.5f);
            kVar.f72768k.setOnClickListener(new as(kVar));
        }
    }
}

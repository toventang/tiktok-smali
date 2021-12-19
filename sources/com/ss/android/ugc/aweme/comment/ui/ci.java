package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.d.e;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ci implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72686a;

    static {
        Covode.recordClassIndex(44780);
    }

    ci(bz bzVar) {
        this.f72686a = bzVar;
    }

    public final void run() {
        bz bzVar = this.f72686a;
        if (e.a()) {
            bzVar.f72651d.requestFocus();
            KeyboardUtils.b(bzVar.f72651d);
            bzVar.U.a(bzVar.f72651d.getSelectionStart(), bzVar.f72651d.getText());
            return;
        }
        bzVar.U.a(bzVar.f72651d.getSelectionStart(), bzVar.f72651d.getText());
        bzVar.f72651d.requestFocus();
        KeyboardUtils.b(bzVar.f72651d);
    }
}

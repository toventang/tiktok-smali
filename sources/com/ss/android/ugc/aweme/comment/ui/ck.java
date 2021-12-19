package com.ss.android.ugc.aweme.comment.ui;

import android.text.Editable;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ck implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72688a;

    static {
        Covode.recordClassIndex(44782);
    }

    ck(bz bzVar) {
        this.f72688a = bzVar;
    }

    public final void run() {
        bz bzVar = this.f72688a;
        bzVar.V = true;
        int selectionStart = bzVar.f72651d.getSelectionStart();
        Editable text = bzVar.f72651d.getText();
        if (text != null) {
            text.insert(selectionStart, "@");
        }
    }
}

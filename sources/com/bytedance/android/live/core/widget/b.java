package com.bytedance.android.live.core.widget;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements DialogInterface.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f9351a;

    static {
        Covode.recordClassIndex(4763);
    }

    b(a aVar) {
        this.f9351a = aVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        if (4 != i2) {
            return false;
        }
        keyEvent.getAction();
        return false;
    }
}

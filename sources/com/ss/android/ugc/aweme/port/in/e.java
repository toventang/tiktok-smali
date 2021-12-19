package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.c.a.l;
import com.ss.android.ugc.aweme.shortvideo.ui.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements l {

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f115637a;

    static {
        Covode.recordClassIndex(74587);
    }

    e(StringBuilder sb) {
        this.f115637a = sb;
    }

    @Override // com.google.c.a.l
    public final boolean a(Object obj) {
        StringBuilder sb = this.f115637a;
        Activity activity = (Activity) obj;
        if (activity instanceof k) {
            sb.append(activity).append(" isRecording: ").append(((k) activity).bs_()).append("\n");
            return false;
        }
        sb.append(activity).append("\n");
        return false;
    }
}

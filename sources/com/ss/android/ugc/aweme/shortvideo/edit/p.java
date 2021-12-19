package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.port.in.g;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f128027a;

    /* renamed from: b  reason: collision with root package name */
    public static final p f128028b = new p();

    private p() {
    }

    static {
        Covode.recordClassIndex(83905);
    }

    public static final boolean a() {
        if (!g.a().A().a() && !f128027a && b.a().a(true, "enable_edit_page_process_bar", false)) {
            return true;
        }
        return false;
    }
}

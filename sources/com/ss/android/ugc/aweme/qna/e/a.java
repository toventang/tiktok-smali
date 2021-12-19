package com.ss.android.ugc.aweme.qna.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f119366a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(77510);
    }

    public static int a() {
        return SettingsManager.a().a("qna_api_max_query_limit", 20);
    }
}

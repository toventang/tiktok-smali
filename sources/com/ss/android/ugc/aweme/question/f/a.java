package com.ss.android.ugc.aweme.question.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f119969a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(77931);
    }

    public static void a(String str, String str2) {
        d dVar = new d();
        dVar.a("enter_from", str);
        if (str2 != null) {
            dVar.a("question_id", str2);
        }
        r.a("see_original_show", dVar.f66730a);
    }

    public static void b(String str, String str2) {
        d dVar = new d();
        dVar.a("enter_from", str);
        if (str2 != null) {
            dVar.a("question_id", str2);
        }
        r.a("click_see_original", dVar.f66730a);
    }

    public static void c(String str, String str2) {
        d dVar = new d();
        dVar.a("enter_from", str);
        if (str2 != null) {
            dVar.a("question_id", str2);
        }
        r.a("see_translation_show", dVar.f66730a);
    }

    public static void d(String str, String str2) {
        d dVar = new d();
        dVar.a("enter_from", str);
        if (str2 != null) {
            dVar.a("question_id", str2);
        }
        r.a("click_see_translation", dVar.f66730a);
    }
}

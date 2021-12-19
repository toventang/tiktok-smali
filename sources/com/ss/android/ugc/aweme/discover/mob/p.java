package com.ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.search.k.d;
import com.ss.android.ugc.aweme.search.k.l;
import com.ss.android.ugc.aweme.utils.w;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f81936a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f81937b;

    /* renamed from: c  reason: collision with root package name */
    private final View f81938c;

    /* renamed from: d  reason: collision with root package name */
    private final String f81939d;

    /* renamed from: e  reason: collision with root package name */
    private final String f81940e;

    /* renamed from: f  reason: collision with root package name */
    private final String f81941f;

    /* renamed from: g  reason: collision with root package name */
    private final String f81942g;

    static {
        Covode.recordClassIndex(50863);
    }

    p(String str, Aweme aweme, View view, String str2, String str3, String str4, String str5) {
        this.f81936a = str;
        this.f81937b = aweme;
        this.f81938c = view;
        this.f81939d = str2;
        this.f81940e = str3;
        this.f81941f = str4;
        this.f81942g = str5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String b2;
        String str = this.f81936a;
        Aweme aweme = this.f81937b;
        View view = this.f81938c;
        String str2 = this.f81939d;
        String str3 = this.f81940e;
        String str4 = this.f81941f;
        String str5 = this.f81942g;
        if (str.equals("general_search")) {
            b2 = d.a();
        } else {
            b2 = ac.b(aweme);
        }
        r.onEvent(MobClick.obtain().setEventName("feed_enter").setLabelName(str).setValue(aweme.getAid()).setJsonObject(new c().a("request_id", ac.b(aweme)).a()));
        d dVar = (d) ((com.ss.android.ugc.aweme.search.k.c) ((com.ss.android.ugc.aweme.search.k.c) new l(j.a.a(view)).f(aweme).o(str).i(ac.e(aweme))).b(str2).g(ac.e(aweme)).j(aweme.getAuthorUid())).c(ac.a.f91473a.a(b2)).a(b2).a(w.a(aweme, "feed_enter", str));
        if (!TextUtils.isEmpty(str3)) {
            dVar.g(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            dVar.v(str4);
        }
        if (!TextUtils.isEmpty(b2)) {
            dVar.a(b2);
        }
        if (!TextUtils.isEmpty(str5)) {
            dVar.p(str5);
        }
        dVar.f();
        return null;
    }
}

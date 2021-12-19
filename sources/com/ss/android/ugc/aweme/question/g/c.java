package com.ss.android.ugc.aweme.question.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.livedata.a;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f119979b;

    /* renamed from: a  reason: collision with root package name */
    HashMap<String, com.ss.android.ugc.aweme.question.c> f119980a = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f119981c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, com.ss.android.ugc.aweme.question.c> f119982d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private Set<String> f119983e = new HashSet();

    static {
        Covode.recordClassIndex(77938);
    }

    private c() {
    }

    public static c a() {
        MethodCollector.i(10550);
        if (f119979b == null) {
            synchronized (c.class) {
                try {
                    if (f119979b == null) {
                        f119979b = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10550);
                    throw th;
                }
            }
        }
        c cVar = f119979b;
        MethodCollector.o(10550);
        return cVar;
    }

    private com.ss.android.ugc.aweme.question.c b(String str) {
        return this.f119980a.get(str);
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<b> a(String str) {
        this.f119983e.add(str);
        return a.C1541a.f68149a.a(str);
    }

    public final void a(com.ss.android.ugc.aweme.question.c cVar) {
        a(cVar, this.f119982d.get(cVar.getId().toString()), false);
        a().a(cVar.getId().toString()).setValue(new b(cVar, true));
    }

    public final void a(com.ss.android.ugc.aweme.question.c cVar, boolean z) {
        if (z) {
            this.f119981c.add(cVar.getId().toString());
        } else {
            this.f119981c.remove(cVar.getId().toString());
        }
    }

    private static void a(com.ss.android.ugc.aweme.question.c cVar, com.ss.android.ugc.aweme.question.c cVar2, boolean z) {
        if (cVar != null && cVar2 != null) {
            cVar.setTranslated(Boolean.valueOf(z));
            cVar.setContent(cVar2.getContent());
        }
    }

    public final void a(com.ss.android.ugc.aweme.question.c cVar, a aVar, CommentTranslationStatusView commentTranslationStatusView) {
        com.ss.android.ugc.aweme.question.c b2 = b(cVar.getId().toString());
        if (b2 != null) {
            a(cVar, b2, true);
            a().a(cVar.getId().toString()).setValue(new b(cVar, true));
            return;
        }
        a(cVar, true);
        this.f119982d.put(cVar.getId().toString(), cVar.clone());
        if (commentTranslationStatusView != null) {
            commentTranslationStatusView.setLoadingText(R.string.amp);
            commentTranslationStatusView.setLoading(true);
        }
        com.ss.android.b.a.a.a.a(new d(cVar, aVar));
    }
}

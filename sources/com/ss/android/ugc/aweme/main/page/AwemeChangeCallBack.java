package com.ss.android.ugc.aweme.main.page;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public class AwemeChangeCallBack extends ac {

    /* renamed from: a  reason: collision with root package name */
    private c<Aweme> f109276a = new c<>();

    public interface a {
        static {
            Covode.recordClassIndex(69991);
        }

        void a(Aweme aweme);
    }

    static {
        Covode.recordClassIndex(69989);
    }

    public static Aweme a(e eVar) {
        return b(eVar).getValue();
    }

    private static c<Aweme> b(e eVar) {
        return ((AwemeChangeCallBack) ae.a(eVar, (ad.b) null).a(AwemeChangeCallBack.class)).f109276a;
    }

    public static void a(e eVar, u<Aweme> uVar) {
        b(eVar).removeObserver(uVar);
    }

    public static void a(e eVar, Aweme aweme) {
        b(eVar).setValue(aweme);
    }

    public static u<Aweme> b(e eVar, m mVar, a aVar) {
        a aVar2 = new a(aVar);
        b(eVar).observe(mVar, aVar2);
        return aVar2;
    }

    public static void a(e eVar, m mVar, final a aVar) {
        b(eVar).observe(mVar, new u<Aweme>() {
            /* class com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69990);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Aweme aweme) {
                Aweme aweme2 = aweme;
                a aVar = aVar;
                if (aVar != null) {
                    aVar.a(aweme2);
                }
            }
        });
    }
}

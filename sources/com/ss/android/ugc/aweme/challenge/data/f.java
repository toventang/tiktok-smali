package com.ss.android.ugc.aweme.challenge.data;

import androidx.room.i;
import androidx.room.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.f.c;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f69945a = f.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static c<LocalHashTagDataBase> f69946b = new c<LocalHashTagDataBase>() {
        /* class com.ss.android.ugc.aweme.challenge.data.f.AnonymousClass1 */

        static {
            Covode.recordClassIndex(43132);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.f.c
        public final /* bridge */ /* synthetic */ LocalHashTagDataBase a() {
            j.a a2 = i.a(d.a(), LocalHashTagDataBase.class, "localHashTag.db");
            a2.f4332b = true;
            return a2.a();
        }
    };

    static {
        Covode.recordClassIndex(43131);
    }

    public static List<e> a() {
        try {
            LocalHashTagDataBase b2 = f69946b.b();
            if (b2 != null) {
                return b2.i().a();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}

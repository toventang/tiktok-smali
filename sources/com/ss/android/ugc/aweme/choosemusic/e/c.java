package com.ss.android.ugc.aweme.choosemusic.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.music.k.a;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.utils.dw;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class c extends a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile c f70531d;

    static {
        Covode.recordClassIndex(43497);
    }

    private c() {
        this.f70522a = 10;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.e.a
    public final String d() {
        return a.C2857a.a("music_search_history_v2", "", "music_sp");
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.e.b
    public final void f() {
        l.d("music_search_history", "");
        l.d("music_sp", "");
        Keva.getRepoFromSp(d.a(), "music_sp", 0).erase("music_search_history");
    }

    public static c g() {
        MethodCollector.i(3932);
        if (f70531d == null) {
            synchronized (c.class) {
                try {
                    if (f70531d == null) {
                        f70531d = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3932);
                    throw th;
                }
            }
        }
        c cVar = f70531d;
        MethodCollector.o(3932);
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.e.a
    public final List<MusicSearchHistory> c() {
        l.d("music_search_history", "");
        l.d(MusicSearchHistory.class, "");
        l.d("music_sp", "");
        String string = Keva.getRepoFromSp(d.a(), "music_sp", 0).getString("music_search_history", "");
        if (TextUtils.isEmpty(string)) {
            return new ArrayList();
        }
        List<MusicSearchHistory> b2 = dw.b(string, MusicSearchHistory.class);
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.e.a
    public final void a(String str) {
        a.C2857a.a("music_search_history_v2", (Object) str, "music_sp");
    }
}

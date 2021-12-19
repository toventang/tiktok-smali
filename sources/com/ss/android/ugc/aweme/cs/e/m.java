package com.ss.android.ugc.aweme.cs.e;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.b.b;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.services.story.IStoryDraftService;
import com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl;
import com.ss.android.ugc.tools.utils.i;
import h.a.n;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class m extends a {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f79048b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public static final m f79049c = new m();

    /* renamed from: d  reason: collision with root package name */
    private static final int f79050d = 86400000;

    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String f() {
        return "story";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String g() {
        return "story";
    }

    private m() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final b h() {
        return b.CACHE;
    }

    static {
        Covode.recordClassIndex(49073);
        g.a();
    }

    public final void l() {
        if (SystemClock.uptimeMillis() - ((long) l.f115658a.s().a("key_last_clean_story_cache_time", -1)) > ((long) f79050d)) {
            j();
        }
    }

    @Override // com.bytedance.u.a
    public final File c() {
        return g.a().g().c().g(g.a().g().c().f(""));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final boolean j() {
        IStoryDraftService a2 = StoryDraftServiceImpl.a();
        List<c> queryDraftList = a2.queryDraftList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = queryDraftList.iterator();
        while (it.hasNext()) {
            String draftDirPath = a2.getDraftDirPath(it.next());
            if (draftDirPath != null) {
                arrayList.add(draftDirPath);
            }
        }
        Set m2 = n.m(arrayList);
        l.f115658a.s().b("key_last_clean_story_cache_time", (int) SystemClock.uptimeMillis());
        a aVar = new a(m2);
        com.ss.android.ugc.aweme.cs.d.b.a aVar2 = new com.ss.android.ugc.aweme.cs.d.b.a();
        aVar2.a(aVar);
        aVar2.a(c());
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final long k() {
        com.ss.android.ugc.aweme.cs.d.b.a.a aVar = new com.ss.android.ugc.aweme.cs.d.b.a.a(null, null, 3);
        if (c().exists()) {
            com.ss.android.ugc.aweme.cs.d.b.a aVar2 = new com.ss.android.ugc.aweme.cs.d.b.a();
            aVar2.a(aVar);
            aVar2.a(c());
        }
        long j2 = aVar.f79012a;
        List<c> queryDraftList = StoryDraftServiceImpl.a().queryDraftList();
        long j3 = 0;
        com.ss.android.ugc.aweme.cs.d.a.a aVar3 = new com.ss.android.ugc.aweme.cs.d.a.a();
        Iterator<T> it = queryDraftList.iterator();
        while (it.hasNext()) {
            aVar3.a(it.next());
            j3 += aVar3.a();
        }
        return j2 - j3;
    }

    public static final class a implements com.ss.android.ugc.aweme.cs.d.b.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f79051a;

        static {
            Covode.recordClassIndex(49074);
        }

        a(Set set) {
            this.f79051a = set;
        }

        @Override // com.ss.android.ugc.aweme.cs.d.b.a.b
        public final void a(File file, boolean z) {
            h.f.b.l.d(file, "");
            if (!z && file.isDirectory() && !m.a(file, this.f79051a) && !m.a(file, m.f79048b)) {
                i.a(file);
            }
        }
    }

    public static boolean a(File file, Set<String> set) {
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                String absolutePath = file.getAbsolutePath();
                h.f.b.l.b(absolutePath, "");
                if (p.b(absolutePath, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}

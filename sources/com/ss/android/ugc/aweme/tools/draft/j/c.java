package com.ss.android.ugc.aweme.tools.draft.j;

import android.app.Activity;
import android.os.Bundle;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ci.b;
import com.ss.android.ugc.aweme.draft.m;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.story.IStoryDraftService;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d;
import com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl;
import com.ss.android.ugc.aweme.tools.b;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.ss.android.ugc.aweme.tools.draft.ai;
import com.ss.android.ugc.aweme.tools.draft.k.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class c implements IDraftService {

    /* renamed from: a  reason: collision with root package name */
    private static IDraftService f139804a;

    /* renamed from: b  reason: collision with root package name */
    private List<IDraftService.DraftListener> f139805b = new ArrayList();

    static {
        Covode.recordClassIndex(91384);
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final ExecutorService getDraftExecutor() {
        return b.f138752a;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final List<com.ss.android.ugc.aweme.draft.model.c> queryList() {
        return ai.a().a((m) null);
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final int queryMyDraftCount() {
        return ai.a().b();
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final void notifyDraftClean() {
        for (IDraftService.DraftListener draftListener : this.f139805b) {
            draftListener.onDraftClean();
        }
    }

    public static IDraftService a() {
        MethodCollector.i(2050);
        if (f139804a == null) {
            synchronized (ai.class) {
                try {
                    if (f139804a == null) {
                        f139804a = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2050);
                    throw th;
                }
            }
        }
        IDraftService iDraftService = f139804a;
        MethodCollector.o(2050);
        return iDraftService;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final void unregisterDraftListener(IDraftService.DraftListener draftListener) {
        this.f139805b.remove(draftListener);
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final String calculateDraftDir(com.ss.android.ugc.aweme.draft.model.c cVar) {
        if (cVar == null) {
            return null;
        }
        return com.ss.android.ugc.aweme.cs.d.b.a(cVar);
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final com.ss.android.ugc.aweme.draft.model.c queryDraft(String str) {
        return ai.a().e(str);
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final com.ss.android.ugc.aweme.draft.model.c queryDraftWithUserId(String str) {
        return ai.a().f(str);
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final void registerDraftListener(IDraftService.DraftListener draftListener) {
        if (!this.f139805b.contains(draftListener)) {
            this.f139805b.add(draftListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final DraftDBSaveResult save(com.ss.android.ugc.aweme.draft.model.c cVar) {
        return ai.a().a(cVar);
    }

    private static void a(List<com.ss.android.ugc.aweme.draft.model.c> list) {
        IStoryDraftService a2 = StoryDraftServiceImpl.a();
        if (a2 != null) {
            List<com.ss.android.ugc.aweme.draft.model.c> queryDraftList = a2.queryDraftList();
            if (!queryDraftList.isEmpty()) {
                list.addAll(queryDraftList);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final void enterDraftBox(Activity activity) {
        g.a().r().c().a();
        DraftBoxActivity.a(activity);
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final void notifyDraftDelete(com.ss.android.ugc.aweme.draft.model.c cVar) {
        List<IDraftService.DraftListener> list = this.f139805b;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f139805b.get(size).onDraftDelete(cVar);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final void notifyDraftUpdate(com.ss.android.ugc.aweme.draft.model.c cVar) {
        for (IDraftService.DraftListener draftListener : this.f139805b) {
            draftListener.onDraftUpdate(cVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final List<com.ss.android.ugc.aweme.draft.model.c> queryAllDraftList(boolean z) {
        List<com.ss.android.ugc.aweme.draft.model.c> c2 = ai.a().c();
        if (!z) {
            return c2;
        }
        ArrayList arrayList = new ArrayList();
        if (!c2.isEmpty()) {
            arrayList.addAll(c2);
        }
        a(arrayList);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final int queryMyDraftCount(m mVar) {
        ai a2 = ai.a();
        if (mVar == null) {
            return a2.b();
        }
        return a2.a(mVar).size();
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final void delete(com.ss.android.ugc.aweme.draft.model.c cVar) {
        ai.a().b(cVar);
        l.f115658a.d().a().a(cVar);
        h.f.b.l.d(cVar, "");
        i.b(new a.CallableC3691a(cVar), i.f4824a);
        i.b(b.a.f71082a, i.f4824a);
        if (cVar != null && cVar.n()) {
            i.b(new d.a(cVar), i.f4824a);
        }
        if (cVar.e()) {
            com.ss.android.ugc.tools.utils.i.c(dj.f126463f + "duet/" + cVar.f());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final void enterDraftBoxWithArgs(Activity activity, Bundle bundle) {
        g.a().r().c().a();
        DraftBoxActivity.a(activity, bundle);
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final void notifyDraftCheckedChanged(com.ss.android.ugc.aweme.draft.model.c cVar, boolean z) {
        for (IDraftService.DraftListener draftListener : this.f139805b) {
            draftListener.onDraftCheckedChanged(cVar, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftService
    public final List<com.ss.android.ugc.aweme.draft.model.c> queryListWithFilter(boolean z, m mVar) {
        List<com.ss.android.ugc.aweme.draft.model.c> a2 = ai.a().a(mVar);
        if (!z) {
            return a2;
        }
        ArrayList arrayList = new ArrayList();
        if (!a2.isEmpty()) {
            arrayList.addAll(a2);
        }
        a(arrayList);
        return arrayList;
    }
}

package com.ss.android.ugc.aweme.external;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.m;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.eq;
import com.ss.android.ugc.aweme.shoutouts.d;
import com.ss.android.ugc.aweme.tools.draft.ai;
import com.ss.android.ugc.aweme.tools.draft.ftc.pages.h;
import com.ss.android.ugc.tools.view.widget.k;
import dmt.av.video.c.b;
import h.a.z;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

public final class b implements IAVDraftService {
    static {
        Covode.recordClassIndex(56689);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void saveDraftForLocalFile(String str, Intent intent, IDraftService.DraftSaveListener draftSaveListener) {
        l.d(str, "");
        l.d(intent, "");
        l.d(draftSaveListener, "");
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final ExecutorService executor() {
        return com.ss.android.ugc.aweme.tools.b.f138752a;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final String getDBCreationTime() {
        return com.ss.android.ugc.aweme.tools.draft.h.b.a(com.ss.android.ugc.aweme.tools.draft.h.b.a().getLong("short_creation_time", -1), "UTC");
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final String getDBEventAsJSON() {
        String string = com.ss.android.ugc.aweme.tools.draft.h.b.a().getString("db_event", "Unknown");
        l.b(string, "");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final String getReadableDBPath() {
        ai a2 = ai.a();
        l.b(a2, "");
        String path = a2.f139366a.getPath();
        l.b(path, "");
        return path;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final List<Integer> queryUserDraftCounts(boolean z) {
        List<Integer> a2 = ai.a().a(z);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void registerListener(IDraftService.DraftListener draftListener) {
        l.d(draftListener, "");
        com.ss.android.ugc.aweme.tools.draft.j.c.a().registerDraftListener(draftListener);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void unregisterListener(IDraftService.DraftListener draftListener) {
        l.d(draftListener, "");
        com.ss.android.ugc.aweme.tools.draft.j.c.a().unregisterDraftListener(draftListener);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final int queryDraftListCount(boolean z) {
        if (z) {
            return ai.a().b();
        }
        return ai.a().d();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final DraftDBSaveResult saveDraft(com.ss.android.ugc.aweme.draft.model.c cVar) {
        l.d(cVar, "");
        DraftDBSaveResult a2 = ai.a().a(cVar);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final Fragment showDetailDraft(com.ss.android.ugc.aweme.draft.model.c cVar) {
        l.d(cVar, "");
        com.ss.android.ugc.aweme.port.in.c.a(eq.a());
        new h();
        l.d(cVar, "");
        h.f139631h = cVar;
        return new h();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final List<com.ss.android.ugc.aweme.draft.model.c> draftList(boolean z) {
        List<String> list;
        cr a2 = cr.a();
        l.b(a2, "");
        String f2 = a2.f();
        l.b(f2, "");
        boolean c2 = g.a().o().c();
        if (c2) {
            list = g.a().o().f();
        } else {
            list = z.INSTANCE;
        }
        List<com.ss.android.ugc.aweme.draft.model.c> a3 = ai.a().a(new a(z, c2, list, f2));
        l.b(a3, "");
        return a3;
    }

    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f90317a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f90318b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f90319c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f90320d;

        static {
            Covode.recordClassIndex(56690);
        }

        @Override // com.ss.android.ugc.aweme.draft.m
        public final boolean a(com.ss.android.ugc.aweme.draft.model.c cVar) {
            l.d(cVar, "");
            if (cVar.W.bb == 50) {
                return false;
            }
            if (cVar.W.aU != null && !p.a(cVar.W.aU.getShoutOutsMode(), d.MODE_POST, false)) {
                return false;
            }
            if (this.f90317a) {
                return true;
            }
            if (this.f90318b) {
                if (!this.f90319c.contains(cVar.r())) {
                    return true;
                }
                return false;
            } else if (!TextUtils.equals(cVar.r(), this.f90320d)) {
                return true;
            } else {
                return false;
            }
        }

        a(boolean z, boolean z2, List list, String str) {
            this.f90317a = z;
            this.f90318b = z2;
            this.f90319c = list;
            this.f90320d = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b$b  reason: collision with other inner class name */
    static final class DialogInterface$OnClickListenerC2177b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DialogInterface.OnClickListener f90325a;

        static {
            Covode.recordClassIndex(56691);
        }

        DialogInterface$OnClickListenerC2177b(DialogInterface.OnClickListener onClickListener) {
            this.f90325a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f90325a.onClick(dialogInterface, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void deleteDraft(int i2, com.ss.android.ugc.aweme.draft.model.c cVar) {
        l.d(cVar, "");
        com.ss.android.ugc.aweme.tools.draft.j.c.a().delete(cVar);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void loadAwemeDraftThumbCover(com.ss.android.ugc.aweme.draft.model.c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        l.d(cVar, "");
        l.d(onVideoCoverCallback, "");
        com.ss.android.ugc.aweme.draft.model.d.a(cVar, onVideoCoverCallback);
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DialogInterface.OnClickListener f90326a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f90327b;

        static {
            Covode.recordClassIndex(56692);
        }

        c(DialogInterface.OnClickListener onClickListener, Activity activity) {
            this.f90326a = onClickListener;
            this.f90327b = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f90326a.onClick(dialogInterface, i2);
            AVExternalServiceImpl.a().asyncService("AVDraftServiceImpl", new IExternalService.ServiceLoadCallback(this) {
                /* class com.ss.android.ugc.aweme.external.b.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f90332a;

                static {
                    Covode.recordClassIndex(56693);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onDismiss() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onOK() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f90332a = r1;
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    l.d(asyncAVService, "");
                    b.a aVar = dmt.av.video.c.b.f156874d;
                    Application application = com.ss.android.ugc.aweme.port.in.c.f115622a;
                    l.b(application, "");
                    aVar.a(application).b();
                    RecordConfig.Builder builder = new RecordConfig.Builder();
                    builder.shootWay("restore_crash").restoreType(2).creationId(UUID.randomUUID().toString()).decompressTime(j2);
                    new com.ss.android.ugc.aweme.external.b.d().startRecord(this.f90332a.f90327b, builder.build());
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final com.ss.android.ugc.aweme.draft.model.c queryDraft(int i2, String str) {
        l.d(str, "");
        if (i2 != 1) {
            return null;
        }
        return ai.a().e(str);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final Dialog restoreDialog(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        l.d(activity, "");
        l.d(onClickListener, "");
        l.d(onClickListener2, "");
        androidx.appcompat.app.c a2 = k.a(activity, new DialogInterface$OnClickListenerC2177b(onClickListener), new c(onClickListener2, activity));
        l.b(a2, "");
        return a2;
    }
}

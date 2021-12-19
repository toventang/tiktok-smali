package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.external.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.publish.o;
import com.ss.android.ugc.aweme.publish.s;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.ss.android.ugc.aweme.scheduler.f;
import com.ss.android.ugc.aweme.scheduler.h;
import com.ss.android.ugc.aweme.scheduler.j;
import com.ss.android.ugc.aweme.services.external.ui.IDraftService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.setting.bw;
import com.ss.android.ugc.aweme.settings.m;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.publish.q;
import com.ss.android.ugc.aweme.shortvideo.publish.x;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.bm;
import com.ss.android.ugc.aweme.shortvideo.ui.cj;
import com.ss.android.ugc.aweme.shortvideo.ui.p;
import com.ss.android.ugc.aweme.shortvideo.ui.t;
import com.ss.android.ugc.aweme.shortvideo.ui.u;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.ss.android.ugc.aweme.shoutouts.d;
import com.ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl;
import com.ss.android.ugc.aweme.utils.dj;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public class AVPublishServiceImpl implements IAVPublishService {
    private static AVPublishServiceImpl sInstance;
    public e liveActivity;
    private a liveDialog;
    private IAVPublishService.onLivePublishCallback livePublishCallback;
    private IAVPublishService.LiveThumCallback liveThumCallback;
    public Dialog mShoutOutsUploadRecoverDialog;
    public p mUploadRecoverPopView;

    static {
        Covode.recordClassIndex(79386);
    }

    public static int com_ss_android_ugc_aweme_services_AVPublishServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void addChallenge(Challenge challenge) {
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean getKitManageRegister() {
        return cr.t;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public IAVPublishService.onLivePublishCallback getLivePublishCallback() {
        return this.livePublishCallback;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public IAVPublishService.LiveThumCallback getLiveThumCallback() {
        return this.liveThumCallback;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public c getCurMusic() {
        return cr.a().f125295a;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public Boolean getHasOpenCommercialSoundPage() {
        return cr.a().f125302h;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public String getShootWay() {
        return cr.a().f125299e;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isParallelPublishEnabled() {
        return m.a();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isPhotoMvModeMusic() {
        return cr.a().f125296b;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isPublishing() {
        return h.b();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void resetNewCreateWay() {
        cr.a().d();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean restoreWorkExperimentDisableCover() {
        if (!bw.f122121a) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public int getAddVideosExperiConsuSideCode() {
        return b.a().a(true, "studio_add_tt_videos_in_caption_consumption", 0);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public String getCurrentPublishTaskId() {
        if (m.a()) {
            return j.f120942b.f();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public int getParallelPublishTaskSize() {
        return g.a().o().d();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public Boolean isFromCommercialSoundPage() {
        return Boolean.valueOf(cr.a().f125301g.booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isInShoutout() {
        return cr.a().o.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean needRestore() {
        return com.ss.android.ugc.aweme.port.in.c.C.d().d();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean usedBusiSticker() {
        return cr.a().c();
    }

    static final /* synthetic */ Boolean lambda$tryRestorePublish$0$AVPublishServiceImpl() {
        if (com.ss.android.ugc.aweme.port.in.c.a()) {
            return false;
        }
        return Boolean.valueOf(com.ss.android.ugc.aweme.port.in.c.C.d().c());
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void cancelRestoreOnMain() {
        RecordScene b2 = com.ss.android.ugc.aweme.shortvideo.f.a.b();
        com.ss.android.ugc.aweme.shortvideo.sticker.e.b(b2.creationId);
        cr.a().s = false;
        cr.a();
        cr.a(b2);
        com.ss.android.ugc.aweme.shortvideo.f.a.a();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public AVChallenge getCurChallenge() {
        if (com.bytedance.common.utility.collection.b.a((Collection) cr.a().f125298d)) {
            return null;
        }
        return cr.a().f125298d.get(0);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isParallelPublishTaskFinished() {
        if (!m.a() || j.f120942b.b() > 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void showUploadingDialog() {
        a aVar = this.liveDialog;
        if (aVar != null && !aVar.a()) {
            this.liveDialog.c();
        }
        this.liveDialog = null;
    }

    public static AVPublishServiceImpl getInstance() {
        MethodCollector.i(10417);
        if (sInstance == null) {
            synchronized (i.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new AVPublishServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10417);
                    throw th;
                }
            }
        }
        AVPublishServiceImpl aVPublishServiceImpl = sInstance;
        MethodCollector.o(10417);
        return aVPublishServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean enableShowPrePublishUserSwitch() {
        if (!com.ss.android.ugc.aweme.shortvideo.v.e.a() || !g.a().A().b() || g.a().A().a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isPublishable() {
        if (m.a()) {
            if (!StoryPublishServiceImpl.a().isStoryPublishing()) {
                return true;
            }
            return false;
        } else if (isPublishing() || StoryPublishServiceImpl.a().isStoryPublishing()) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public List<q> getAllPublishModel() {
        if (m.a()) {
            bj.a("getAllPublishModel size=" + j.f120942b.b());
            return j.f120942b.e();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : h.f120862a.b(null)) {
            if (!(t.f120913b instanceof x.a)) {
                arrayList.add(t.f120917f);
            }
        }
        bj.a("getAllPublishModel size=" + arrayList.size());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setKitManageRegister(boolean z) {
        cr.t = z;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean checkIsAlreadyPublished(Context context) {
        cr.a();
        return cr.a(context);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean endWithHashTag(String str) {
        return dj.a(str);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean inPublishPage(Context context) {
        cr.a();
        return cr.h();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isPublishServiceRunning(Context context) {
        return h.b();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setMusicChooseType(int i2) {
        cr.a().f125300f = i2;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setPublishStatus(int i2) {
        cr.a().a(i2);
    }

    static final /* synthetic */ void lambda$showLighteningPublishSuccessPopWindow$4$AVPublishServiceImpl(t tVar) {
        if (tVar.isShowing()) {
            tVar.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void addMusic(MusicModel musicModel) {
        cr.a().a(com.ss.android.ugc.aweme.port.in.c.f115629h.b(musicModel));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void cancelRestoreOnMain(Activity activity) {
        com.ss.android.ugc.aweme.port.in.c.C.d().a(activity);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean containEmoji(String str) {
        return Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?|[\\u200d\\uFE0F?])").matcher(str).find();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$uploadRecoverPopViewSetVisibility$2$AVPublishServiceImpl(boolean z) {
        p pVar = this.mUploadRecoverPopView;
        if (pVar != null && pVar.isShowing()) {
            this.mUploadRecoverPopView.a(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setCurMusic(MusicModel musicModel) {
        cr.a().a(com.ss.android.ugc.aweme.port.in.c.f115629h.b(musicModel));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setFakeMusic(MusicModel musicModel) {
        cr.a().f125297c = com.ss.android.ugc.aweme.port.in.c.f115629h.b(musicModel);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setFromCommercialSoundPage(boolean z) {
        cr.a().f125301g = Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setHasOpenCommercialSoundPage(boolean z) {
        cr.a().f125302h = Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setHashTagRegex(String str) {
        if (!TextUtils.isEmpty(str)) {
            dj.f142825a = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public Bitmap getCover(q qVar) {
        Bitmap b2 = h.b(qVar);
        if (b2 != null) {
            return b2;
        }
        if (com.ss.android.ugc.gamora.editor.lightening.a.a()) {
            return com.ss.android.ugc.aweme.story.publish.a.a.a(qVar);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public ViewGroup getPublishAddVideoContainer(Activity activity) {
        cj cjVar;
        if (activity == null || !(activity instanceof VideoPublishActivity) || (cjVar = ((VideoPublishActivity) activity).f131214d) == null) {
            return null;
        }
        return cjVar.C;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public q getPublishModel(String str) {
        q c2;
        if (!com.ss.android.ugc.gamora.editor.lightening.a.a() || TextUtils.isEmpty(str) || (c2 = com.ss.android.ugc.aweme.story.publish.a.a.c(str)) == null) {
            return h.a(str);
        }
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setDestroyFlag(Activity activity) {
        cj cjVar;
        if (activity != null && (activity instanceof VideoPublishActivity) && (cjVar = ((VideoPublishActivity) activity).f131214d) != null && cjVar.r != null) {
            cjVar.r.u = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void removePublishCallback(com.ss.android.ugc.aweme.shortvideo.x<ai> xVar) {
        l.d(xVar, "");
        bj.d("PublishScheduler | removeCallback call " + ((String) null));
        if (m.a()) {
            h.f120863b.execute(new h.l(xVar));
        } else {
            h.f120863b.execute(new h.m(xVar));
        }
        if (com.ss.android.ugc.gamora.editor.lightening.a.a()) {
            com.ss.android.ugc.aweme.story.publish.a.a.a(xVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void uploadRecoverPopViewSetVisibility(boolean z) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            p pVar = this.mUploadRecoverPopView;
            if (pVar != null && pVar.isShowing()) {
                this.mUploadRecoverPopView.a(z);
                return;
            }
            return;
        }
        this.mUploadRecoverPopView.c().runOnUiThread(new AVPublishServiceImpl$$Lambda$2(this, z));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean processPublish(e eVar, Intent intent) {
        return o.a(eVar, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void startPublish(e eVar, Bundle bundle) {
        o.a(eVar, bundle, null);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void cancelSynthesis(Context context, String str) {
        g.a().o().i().a(context, str);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void publishFromDraft(final e eVar, final com.ss.android.ugc.aweme.draft.model.c cVar) {
        AVExternalServiceImpl.a().asyncServiceWithOutPanel("WaterMark", new SimpleServiceLoadCallback() {
            /* class com.ss.android.ugc.aweme.services.AVPublishServiceImpl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(79392);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public void onLoad(AsyncAVService asyncAVService, long j2) {
                o.a(eVar, cVar);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void showRestoreWorkDialog(Activity activity, String str) {
        com.ss.android.ugc.aweme.port.in.c.C.d().a(activity, str);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void addPublishCallback(com.ss.android.ugc.aweme.shortvideo.x<ai> xVar, String str) {
        if (com.ss.android.ugc.gamora.editor.lightening.a.a() && str != null && com.ss.android.ugc.aweme.story.publish.a.a.c(str) != null) {
            com.ss.android.ugc.aweme.story.publish.a.a.a(new f(xVar), str, false);
        } else if (h.a(str) != null) {
            h.a(new f(xVar), str);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void showLighteningPublishSuccessPopWindow(final e eVar, Aweme aweme) {
        if (eVar.getLifecycle().a() != i.b.DESTROYED) {
            final t tVar = new t(eVar, aweme);
            AnonymousClass4 r4 = new au() {
                /* class com.ss.android.ugc.aweme.services.AVPublishServiceImpl.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(79397);
                }

                @Override // androidx.lifecycle.k
                public void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
                    if (aVar == i.a.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @v(a = i.a.ON_DESTROY)
                public void onDestroy() {
                    eVar.getLifecycle().b(this);
                    tVar.dismiss();
                }
            };
            tVar.setOnDismissListener(new AVPublishServiceImpl$$Lambda$3(eVar, r4));
            new SafeHandler(eVar).postDelayed(new AVPublishServiceImpl$$Lambda$4(tVar), 4000);
            tVar.d();
            eVar.getLifecycle().a(r4);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void showLivePublishFailedPopwindow(final e eVar, final String str) {
        e eVar2 = this.liveActivity;
        if (eVar2 != null && !eVar2.isFinishing()) {
            this.liveActivity.runOnUiThread(new Runnable() {
                /* class com.ss.android.ugc.aweme.services.AVPublishServiceImpl.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(79398);
                }

                public void run() {
                    new u(AVPublishServiceImpl.this.liveActivity, str);
                }
            });
        } else if (eVar != null && !eVar.isFinishing()) {
            eVar.runOnUiThread(new Runnable() {
                /* class com.ss.android.ugc.aweme.services.AVPublishServiceImpl.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(79399);
                }

                public void run() {
                    new u(eVar, str);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void tryRestorePublish(e eVar, h.f.a.b<Boolean, Void> bVar) {
        if (isPublishing()) {
            return;
        }
        if (isPublishServiceRunning(eVar)) {
            com.ss.android.ugc.aweme.df.e.a("continue publish");
            com_ss_android_ugc_aweme_services_AVPublishServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d("wht_publish", "continuePublish");
            com.ss.android.ugc.tools.utils.q.d("PublishServiceImpl continue publish");
            com.ss.android.ugc.aweme.df.f.a("AVPublishServiceImpl !isPublishing() isPublishServiceRunning");
            com.ss.android.ugc.aweme.port.in.c.f115624c.b(eVar);
            return;
        }
        b.i.b(AVPublishServiceImpl$$Lambda$0.$instance, com.ss.android.ugc.aweme.tools.b.f138752a).a(new AVPublishServiceImpl$$Lambda$1(bVar), b.i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void hideUploadRecoverWindow(Context context, boolean z) {
        Dialog dialog = this.mShoutOutsUploadRecoverDialog;
        if (dialog != null && dialog.isShowing()) {
            if (m.a()) {
                g.a().o().l().b();
            } else {
                g.a().o().l().a(null);
            }
            PublishService.a.a();
            com.ss.android.ugc.tools.utils.q.d("Publish | remove recover path by dismiss panel so");
            this.mShoutOutsUploadRecoverDialog.dismiss();
            this.mShoutOutsUploadRecoverDialog = null;
        }
        p pVar = this.mUploadRecoverPopView;
        if (pVar != null && pVar.isShowing()) {
            if (z) {
                new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.z_).a();
            }
            this.mUploadRecoverPopView.dismiss();
            this.mUploadRecoverPopView = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setCurMusic(MusicModel musicModel, Boolean bool, Boolean bool2) {
        cr.a().a(com.ss.android.ugc.aweme.port.in.c.f115629h.b(musicModel), bool2.booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void showLivePublishSuccessPopwindow(final e eVar, final String str, final String str2) {
        e eVar2 = this.liveActivity;
        if (eVar2 != null && !eVar2.isFinishing()) {
            this.liveActivity.runOnUiThread(new Runnable() {
                /* class com.ss.android.ugc.aweme.services.AVPublishServiceImpl.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(79400);
                }

                public void run() {
                    new com.ss.android.ugc.aweme.shortvideo.ui.v(AVPublishServiceImpl.this.liveActivity, str, str2);
                }
            });
        } else if (eVar != null && !eVar.isFinishing()) {
            eVar.runOnUiThread(new Runnable() {
                /* class com.ss.android.ugc.aweme.services.AVPublishServiceImpl.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(79401);
                }

                public void run() {
                    new com.ss.android.ugc.aweme.shortvideo.ui.v(eVar, str, str2);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void showUploadRecoverIfNeed(final boolean z, final e eVar, final String str, final String str2, final String str3) {
        p pVar = this.mUploadRecoverPopView;
        if (pVar != null && pVar.isShowing()) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("scene", str);
            com.bytedance.services.apm.api.a.a("show multiple upload recover popup", hashMap);
        }
        com_ss_android_ugc_aweme_services_AVPublishServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d("AVPublishServiceImpl", "showUploadRecoverIfNeed");
        if (!m.a() || str3 == null) {
            o.a(eVar, new IDraftService.OnGetRecoverDraftCallback() {
                /* class com.ss.android.ugc.aweme.services.AVPublishServiceImpl.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(79395);
                }

                public static int com_ss_android_ugc_aweme_services_AVPublishServiceImpl$3_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ui.IDraftService.OnGetRecoverDraftCallback
                public void onFail() {
                    IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new com.bytedance.cukaie.closet.a((byte) 0).a(eVar, IVideoRecordPreferences.class);
                    String uploadRecoverPath = iVideoRecordPreferences.getUploadRecoverPath("");
                    com_ss_android_ugc_aweme_services_AVPublishServiceImpl$3_com_ss_android_ugc_aweme_lancet_LogLancet_d("sofina", "showUploadRecoverIfNeed isServerException = " + z + "  " + uploadRecoverPath);
                    if (z || !TextUtils.isEmpty(uploadRecoverPath)) {
                        iVideoRecordPreferences.setUploadRecoverPath("");
                        new com.ss.android.ugc.aweme.tux.a.i.a(eVar).a(R.string.a5m).a();
                    }
                }

                @Override // com.ss.android.ugc.aweme.services.external.ui.IDraftService.OnGetRecoverDraftCallback
                public void onSuccess(final com.ss.android.ugc.aweme.draft.model.c cVar) {
                    com_ss_android_ugc_aweme_services_AVPublishServiceImpl$3_com_ss_android_ugc_aweme_lancet_LogLancet_d("AVPublishServiceImpl", "showUploadRecoverIfNeed onSuccess");
                    if (cVar.W.aU == null || cVar.W.aU.getShoutOutsMode().equals(d.MODE_POST)) {
                        AVExternalServiceImpl.a().asyncServiceWithOutPanel("AVPublishServiceImpl", new SimpleServiceLoadCallback() {
                            /* class com.ss.android.ugc.aweme.services.AVPublishServiceImpl.AnonymousClass3.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(79396);
                            }

                            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                            public void onLoad(AsyncAVService asyncAVService, long j2) {
                                AVPublishServiceImpl.this.mUploadRecoverPopView = bm.a(eVar, cVar, z, false);
                                if (!TextUtils.isEmpty(str2)) {
                                    AVPublishServiceImpl.this.mUploadRecoverPopView.a(str2);
                                    r.a("show_publish_unavailable_sound_toast", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_post_page").a("creation_id", cVar.f()).a("user_id", com.ss.android.ugc.aweme.port.in.c.u.e().c()).f149193a);
                                }
                                AVPublishServiceImpl.this.mUploadRecoverPopView.d();
                            }
                        });
                    } else if (!"AvApiFragmentObserver onAttach".equals(str)) {
                        AVPublishServiceImpl.this.mShoutOutsUploadRecoverDialog = bm.a(eVar, cVar);
                    }
                }
            });
            return;
        }
        b.i.b(new com.ss.android.ugc.aweme.publish.r(str3), com.ss.android.ugc.aweme.tools.b.f138752a).a(new s(new IDraftService.OnGetRecoverDraftCallback() {
            /* class com.ss.android.ugc.aweme.services.AVPublishServiceImpl.AnonymousClass2 */

            static {
                Covode.recordClassIndex(79393);
            }

            public static int com_ss_android_ugc_aweme_services_AVPublishServiceImpl$2_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IDraftService.OnGetRecoverDraftCallback
            public void onFail() {
                com_ss_android_ugc_aweme_services_AVPublishServiceImpl$2_com_ss_android_ugc_aweme_lancet_LogLancet_d("sofina", "showUploadRecoverIfNeed isServerException = " + z + "  " + str3);
                if (z || !TextUtils.isEmpty(str3)) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(eVar).a(R.string.a5m).a();
                }
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.IDraftService.OnGetRecoverDraftCallback
            public void onSuccess(final com.ss.android.ugc.aweme.draft.model.c cVar) {
                com_ss_android_ugc_aweme_services_AVPublishServiceImpl$2_com_ss_android_ugc_aweme_lancet_LogLancet_d("AVPublishServiceImpl", "showUploadRecoverIfNeed onSuccess");
                if (cVar.W.aU == null || cVar.W.aU.getShoutOutsMode().equals(d.MODE_POST)) {
                    AVExternalServiceImpl.a().asyncServiceWithOutPanel("AVPublishServiceImpl", new SimpleServiceLoadCallback() {
                        /* class com.ss.android.ugc.aweme.services.AVPublishServiceImpl.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(79394);
                        }

                        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                        public void onLoad(AsyncAVService asyncAVService, long j2) {
                            AVPublishServiceImpl.this.mUploadRecoverPopView = bm.a(eVar, cVar, z, true);
                            if (!TextUtils.isEmpty(str2)) {
                                AVPublishServiceImpl.this.mUploadRecoverPopView.a(str2);
                                r.a("show_publish_unavailable_sound_toast", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_post_page").a("creation_id", cVar.f()).a("user_id", com.ss.android.ugc.aweme.port.in.c.u.e().c()).f149193a);
                            }
                            AVPublishServiceImpl.this.mUploadRecoverPopView.d();
                        }
                    });
                } else if (!"AvApiFragmentObserver onAttach".equals(str)) {
                    AVPublishServiceImpl.this.mShoutOutsUploadRecoverDialog = bm.a(eVar, cVar);
                }
            }
        }), b.i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void addMyVideoChain(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3) {
        HashTagMentionEditText hashTagMentionEditText;
        String str7 = str;
        if (activity != null && (activity instanceof VideoPublishActivity)) {
            cj cjVar = ((VideoPublishActivity) activity).f131214d;
            if (cjVar != null) {
                hashTagMentionEditText = cjVar.y;
            } else {
                hashTagMentionEditText = null;
            }
            try {
                if (com.ss.android.ugc.aweme.port.in.c.f115628g.b().booleanValue()) {
                    str7 = str2;
                }
                if (hashTagMentionEditText != null) {
                    hashTagMentionEditText.a(str7, str3, str4, str5, str6, i2, i3);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}

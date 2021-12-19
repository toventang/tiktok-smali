package com.ss.android.ugc.aweme.out;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.external.i;
import com.ss.android.ugc.aweme.services.AVSettingsServiceImpl;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.ISDKService;
import com.ss.android.ugc.aweme.services.SDKServiceImpl;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.filter.IFilterService;
import com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.services.video.IVideoCoverService;
import com.ss.android.ugc.aweme.services.video.VideoCoverServiceImpl;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.duet.h;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.draft.j.c;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.iq;
import com.ss.android.ugc.b;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchModelListener;

public class AVServiceImpl implements IInternalAVService {

    /* renamed from: a  reason: collision with root package name */
    private IDraftService f114566a;

    /* renamed from: b  reason: collision with root package name */
    private IFilterService f114567b = new i();

    /* renamed from: c  reason: collision with root package name */
    private ISDKService f114568c;

    /* renamed from: d  reason: collision with root package name */
    private IVideoCoverService f114569d;

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public IFilterService getFilterService() {
        return this.f114567b;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public String shortVideoDir() {
        return di.f126461d;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public void tryCopyDuetDefaultLayout() {
        h.a();
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public IAVSettingsService avSettingsService() {
        return AVSettingsServiceImpl.getInstance();
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public IEffectService effectService() {
        return EffectService.getInstance();
    }

    static {
        Covode.recordClassIndex(73754);
        iq.b();
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public IDraftService draftService() {
        if (this.f114566a == null) {
            this.f114566a = new c();
        }
        return this.f114566a;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public ISDKService getSDKService() {
        if (this.f114568c == null) {
            this.f114568c = new SDKServiceImpl();
        }
        return this.f114568c;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public IVideoCoverService videoCoverService() {
        if (this.f114569d == null) {
            this.f114569d = new VideoCoverServiceImpl();
        }
        return this.f114569d;
    }

    public static IInternalAVService a() {
        MethodCollector.i(8769);
        Object a2 = b.a(IInternalAVService.class, false);
        if (a2 != null) {
            IInternalAVService iInternalAVService = (IInternalAVService) a2;
            MethodCollector.o(8769);
            return iInternalAVService;
        }
        if (b.da == null) {
            synchronized (IInternalAVService.class) {
                try {
                    if (b.da == null) {
                        b.da = new AVServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8769);
                    throw th;
                }
            }
        }
        AVServiceImpl aVServiceImpl = (AVServiceImpl) b.da;
        MethodCollector.o(8769);
        return aVServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public VideoExposureData convertToExposureData(Object obj) {
        return VideoPublishEditModel.asExposureData(obj);
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public IVideoLegalCheckerAndToastService getVideoLegalCheckerAndToastService(Context context) {
        return new com.ss.android.ugc.aweme.mediachoose.b(context);
    }

    @Override // com.ss.android.ugc.aweme.services.IInternalAVService
    public boolean isPublishing(Context context) {
        return com.ss.android.ugc.aweme.scheduler.h.b();
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public void loadLibrary(String str, Application application) {
        Librarian.a(str, application);
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public void fetchResourcesNeededByRequirements(String[] strArr, final IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
        com.ss.android.ugc.aweme.port.in.c.d();
        DownloadableModelSupport.getInstance().fetchResourcesNeededByRequirements(strArr, new IFetchModelListener() {
            /* class com.ss.android.ugc.aweme.out.AVServiceImpl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(73755);
            }

            @Override // com.ss.android.ugc.effectmanager.IFetchModelListener
            public final void onFailed(Exception exc) {
                IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = iFetchResourcesListener;
                if (iFetchResourcesListener != null) {
                    iFetchResourcesListener.onFailed(exc);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.IFetchModelListener
            public final void onSuccess(String[] strArr) {
                IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = iFetchResourcesListener;
                if (iFetchResourcesListener != null) {
                    iFetchResourcesListener.onSuccess(strArr);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public void setLastStickerId(Context context, String str, int i2) {
        ad.a(context, str, i2);
    }
}

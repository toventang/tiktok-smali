package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class p implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f89067a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private List<String> f89068b = new ArrayList();

    static {
        Covode.recordClassIndex(56012);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(56013);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements FetchResourcesListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FetchResourcesListener f89070a;

        static {
            Covode.recordClassIndex(56015);
        }

        @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
        public final void onSuccess() {
            FetchResourcesListener fetchResourcesListener = this.f89070a;
            if (fetchResourcesListener != null) {
                fetchResourcesListener.onSuccess();
            }
            q.a("lens_hdr", "download success");
        }

        c(FetchResourcesListener fetchResourcesListener) {
            this.f89070a = fetchResourcesListener;
        }

        @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
        public final void onFailed(Exception exc) {
            q.a("lens_hdr", "download failed: ".concat(String.valueOf(exc)));
            FetchResourcesListener fetchResourcesListener = this.f89070a;
            if (fetchResourcesListener != null) {
                fetchResourcesListener.onFailed(exc);
            }
            if (exc != null) {
                exc.printStackTrace();
            }
        }
    }

    public static final class b implements IFoundationAVService.IFetchResourcesListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IFoundationAVService.IFetchResourcesListener f89069a;

        static {
            Covode.recordClassIndex(56014);
        }

        b(IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
            this.f89069a = iFetchResourcesListener;
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            l.d(exc, "");
            IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = this.f89069a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onFailed(exc);
            }
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            l.d(strArr, "");
            IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = this.f89069a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onSuccess(strArr);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.g
    public final void a(IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
        if (!this.f89068b.isEmpty()) {
            IInternalAVService a2 = AVServiceImpl.a();
            Object[] array = this.f89068b.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            a2.fetchResourcesNeededByRequirements((String[]) array, new b(iFetchResourcesListener));
            return;
        }
        iFetchResourcesListener.onSuccess(new String[0]);
    }

    @Override // com.ss.android.ugc.aweme.effectplatform.g
    public final void a(String[] strArr, FetchResourcesListener fetchResourcesListener) {
        l.d(strArr, "");
        if (strArr.length != 0) {
            DownloadableModelSupport.getInstance().fetchResourcesWithModelNames(0, strArr, new c(fetchResourcesListener));
        } else if (fetchResourcesListener != null) {
            fetchResourcesListener.onSuccess();
        }
    }
}

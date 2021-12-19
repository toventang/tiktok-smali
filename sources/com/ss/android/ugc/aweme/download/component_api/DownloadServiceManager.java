package com.ss.android.ugc.aweme.download.component_api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;
import h.f.b.m;
import h.h;
import h.i;

public final class DownloadServiceManager {
    public static final DownloadServiceManager INSTANCE = new DownloadServiceManager();
    private static final h downloadService$delegate = i.a((h.f.a.a) a.f83075a);
    private static final boolean isAutoRemoveListener = b.a();
    private static final int retryExpCount;

    public final IDownloadService getDownloadService() {
        return (IDownloadService) downloadService$delegate.getValue();
    }

    private DownloadServiceManager() {
    }

    public final int getRetryExpCount() {
        return retryExpCount;
    }

    public final boolean isAutoRemoveListener() {
        return isAutoRemoveListener;
    }

    static final class a extends m implements h.f.a.a<IDownloadService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f83075a = new a();

        static {
            Covode.recordClassIndex(51789);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IDownloadService invoke() {
            return DownloadServiceImpl.b();
        }
    }

    static {
        int i2;
        Covode.recordClassIndex(51788);
        if (b.a()) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        retryExpCount = i2;
    }
}

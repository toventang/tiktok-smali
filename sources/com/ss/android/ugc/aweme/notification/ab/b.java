package com.ss.android.ugc.aweme.notification.ab;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.api.ab.NoticeABService;
import com.ss.android.ugc.aweme.services.NoticeABServiceImpl;
import h.f.b.m;
import h.h;
import h.i;

public final class b implements NoticeABService {

    /* renamed from: a  reason: collision with root package name */
    public static final b f113114a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f113115b = i.a((h.f.a.a) a.f113116a);

    private static NoticeABService a() {
        return (NoticeABService) f113115b.getValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<NoticeABService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f113116a = new a();

        static {
            Covode.recordClassIndex(72727);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NoticeABService invoke() {
            return NoticeABServiceImpl.createNoticeABServicebyMonsterPlugin(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.ab.NoticeABService
    public final int getEnablePushGuide() {
        return a().getEnablePushGuide();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.ab.NoticeABService
    public final int getShowRedDotType() {
        return a().getShowRedDotType();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.ab.NoticeABService
    public final boolean isEnableMultiAccountLogin() {
        return a().isEnableMultiAccountLogin();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.ab.NoticeABService
    public final boolean isFtcBindEnable() {
        return a().isFtcBindEnable();
    }

    static {
        Covode.recordClassIndex(72726);
    }
}

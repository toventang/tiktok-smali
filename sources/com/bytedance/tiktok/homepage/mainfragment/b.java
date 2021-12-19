package com.bytedance.tiktok.homepage.mainfragment;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;

final /* synthetic */ class b implements h.f.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final a f44193a;

    /* renamed from: b  reason: collision with root package name */
    private final IAVPublishService f44194b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f44195c;

    /* renamed from: d  reason: collision with root package name */
    private final String f44196d;

    /* renamed from: e  reason: collision with root package name */
    private final String f44197e;

    /* renamed from: f  reason: collision with root package name */
    private final String f44198f;

    static {
        Covode.recordClassIndex(27077);
    }

    b(a aVar, IAVPublishService iAVPublishService, boolean z, String str, String str2, String str3) {
        this.f44193a = aVar;
        this.f44194b = iAVPublishService;
        this.f44195c = z;
        this.f44196d = str;
        this.f44197e = str2;
        this.f44198f = str3;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        a aVar = this.f44193a;
        IAVPublishService iAVPublishService = this.f44194b;
        boolean z = this.f44195c;
        String str = this.f44196d;
        String str2 = this.f44197e;
        String str3 = this.f44198f;
        if (((Boolean) obj).booleanValue()) {
            return null;
        }
        iAVPublishService.showUploadRecoverIfNeed(z, aVar.f44192a.getActivity(), str, str2, str3);
        return null;
    }
}

package com.ss.android.ugc.aweme.share.d;

import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.feed.share.a.a.b f123443a;

    /* renamed from: b  reason: collision with root package name */
    public static String f123444b;

    /* renamed from: c  reason: collision with root package name */
    public static String f123445c;

    /* renamed from: d  reason: collision with root package name */
    public static final q<IWaterMarkService> f123446d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final b f123447e = new b();

    public static final class a implements q<IWaterMarkService> {

        /* renamed from: a  reason: collision with root package name */
        public IWaterMarkService f123448a;

        static {
            Covode.recordClassIndex(81058);
        }

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.c.a.q
        public final /* bridge */ /* synthetic */ IWaterMarkService b() {
            if (this.f123448a == null) {
                this.f123448a = WaterMarkServiceImpl.b();
            }
            return this.f123448a;
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(81057);
    }
}

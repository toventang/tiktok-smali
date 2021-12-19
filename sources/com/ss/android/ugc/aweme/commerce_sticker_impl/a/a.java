package com.ss.android.ugc.aweme.commerce_sticker_impl.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommerceStickerOutService;
import com.ss.android.ugc.aweme.utils.dz;
import com.ss.android.ugc.aweme.utils.eb;
import com.ss.android.ugc.b;
import h.f.b.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final dz f73584a = eb.a(C1646a.f73586a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f73585b = new a();

    private a() {
    }

    public static com.ss.android.ugc.aweme.commerce_sticker_api.a.a a() {
        return (com.ss.android.ugc.aweme.commerce_sticker_api.a.a) f73584a.a();
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.a.a$a  reason: collision with other inner class name */
    static final class C1646a extends m implements h.f.a.a<com.ss.android.ugc.aweme.commerce_sticker_api.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1646a f73586a = new C1646a();

        static {
            Covode.recordClassIndex(45289);
        }

        C1646a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.commerce_sticker_api.a.a invoke() {
            ICommerceStickerOutService commerceStickerOutService;
            Object a2 = b.a(ICommerceStickerOutService.class, false);
            if (a2 != null) {
                commerceStickerOutService = (ICommerceStickerOutService) a2;
                if (commerceStickerOutService == null) {
                    return null;
                }
            } else {
                commerceStickerOutService = new CommerceStickerOutService();
            }
            return commerceStickerOutService.a();
        }
    }

    static {
        Covode.recordClassIndex(45288);
    }
}

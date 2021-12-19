package com.ss.android.ugc.aweme.comment.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.GifEmojiResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import l.b.f;

public interface GifEmojiApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71444a = a.f71446b;

    static {
        Covode.recordClassIndex(43974);
    }

    @f(a = "aweme/v1/im/resources/sticker/collect/")
    t<BaseResponse> collectGifEmoji(@l.b.t(a = "action") int i2, @l.b.t(a = "sticker_ids") String str, @l.b.t(a = "sticker_source") int i3);

    @f(a = "aweme/v1/im/resources/emoticon/search/")
    t<GifEmojiResponse> searchGifEmoji(@l.b.t(a = "keyword") String str, @l.b.t(a = "cursor") int i2, @l.b.t(a = "source") String str2, @l.b.t(a = "group_id") String str3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final h f71445a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f71446b;

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.api.GifEmojiApi$a$a  reason: collision with other inner class name */
        static final class C1610a extends m implements h.f.a.a<GifEmojiApi> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(43976);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1610a(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ GifEmojiApi invoke() {
                IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
                IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
                l.b(createIMainServicebyMonsterPlugin, "");
                Object create = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(createIMainServicebyMonsterPlugin.getApiUrlPrefix()).create(GifEmojiApi.class);
                l.b(create, "");
                return create;
            }
        }

        static {
            Covode.recordClassIndex(43975);
            a aVar = new a();
            f71446b = aVar;
            f71445a = i.a((h.f.a.a) new C1610a(aVar));
        }
    }
}

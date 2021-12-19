package com.ss.android.ugc.aweme.comment.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.ab;
import h.f.b.l;
import l.b.c;
import l.b.e;
import l.b.o;

public interface CommentBatchManagementApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71442a = a.f71443a;

    static {
        Covode.recordClassIndex(43970);
    }

    @o(a = "/tiktok/comment/batch_delete/v1")
    @e
    ab<b> commentBatchDelete(@c(a = "cids") String str, @c(a = "item_id") String str2);

    @o(a = "/tiktok/v1/user/batch/block/")
    @e
    ab<f> userBatchBlock(@c(a = "to_user_id_list") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f71443a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(43971);
        }

        public static CommentBatchManagementApi a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(CommentBatchManagementApi.class);
            l.b(create, "");
            return (CommentBatchManagementApi) create;
        }
    }
}

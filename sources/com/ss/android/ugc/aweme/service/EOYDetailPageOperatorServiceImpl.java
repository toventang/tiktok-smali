package com.ss.android.ugc.aweme.service;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.detail.operators.ab;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.util.j;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class EOYDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(79343);
    }

    public static final class c extends BaseResponse implements Serializable {
        @com.google.gson.a.c(a = "cursor")
        private Integer cursor = 0;
        @com.google.gson.a.c(a = "has_more")
        private Integer hasMore = 0;
        @com.google.gson.a.c(a = "videos")
        private List<? extends Aweme> videos;

        static {
            Covode.recordClassIndex(79347);
        }

        public final Integer getCursor() {
            return this.cursor;
        }

        public final Integer getHasMore() {
            return this.hasMore;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
        public final List<Aweme> getVideos() {
            return this.videos;
        }

        public final void setCursor(Integer num) {
            this.cursor = num;
        }

        public final void setHasMore(Integer num) {
            this.hasMore = num;
        }

        public final void setVideos(List<? extends Aweme> list) {
            this.videos = list;
        }
    }

    public static final class d implements ab {
        static {
            Covode.recordClassIndex(79348);
        }

        d() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new b(aVar);
        }
    }

    public static final class a extends com.ss.android.ugc.aweme.common.e.a<Aweme, c> {
        static {
            Covode.recordClassIndex(79344);
        }

        @Override // com.ss.android.ugc.aweme.common.e.a
        public final boolean isHasMore() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.service.EOYDetailPageOperatorServiceImpl$a$a  reason: collision with other inner class name */
        public static final class RunnableC3153a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Message f121828a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f121829b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Aweme f121830c;

            static {
                Covode.recordClassIndex(79345);
            }

            RunnableC3153a(Message message, a aVar, Aweme aweme) {
                this.f121828a = message;
                this.f121829b = aVar;
                this.f121830c = aweme;
            }

            public final void run() {
                this.f121829b.handleMsg(this.f121828a);
            }
        }

        @Override // com.ss.android.ugc.aweme.common.e.a
        public final List<Aweme> getItems() {
            List<Aweme> videos;
            c cVar = (c) this.mData;
            if (cVar == null || (videos = cVar.getVideos()) == null) {
                return new ArrayList();
            }
            return n.g((Collection) videos);
        }

        @Override // com.ss.android.ugc.aweme.common.e.a
        public final void loadMoreList(Object... objArr) {
            l.d(objArr, "");
            refreshList(objArr);
        }

        @Override // com.ss.android.ugc.aweme.common.b
        public final boolean checkParams(Object... objArr) {
            l.d(objArr, "");
            if (objArr.length != 3 || !(objArr[1] instanceof String)) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.ugc.aweme.common.e.a
        public final void refreshList(Object... objArr) {
            List<? extends Aweme> list;
            l.d(objArr, "");
            Object obj = objArr[1];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            Aweme a2 = j.a((String) obj);
            Message obtain = Message.obtain();
            c cVar = new c();
            cVar.setHasMore(0);
            cVar.setCursor(1);
            if (a2 != null) {
                list = n.a(a2);
            } else {
                list = z.INSTANCE;
            }
            cVar.setVideos(list);
            obtain.obj = cVar;
            new Handler().post(new RunnableC3153a(obtain, this, a2));
        }
    }

    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, ab> a() {
        HashMap<String, ab> hashMap = new HashMap<>();
        hashMap.put("eoy_detail", new d());
        return hashMap;
    }

    public static final class b extends com.ss.android.ugc.aweme.detail.operators.a<a, com.ss.android.ugc.aweme.common.e.b<a>> {

        /* renamed from: a  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.common.e.a<?, ?> f121831a;

        static {
            Covode.recordClassIndex(79346);
        }

        public b(com.ss.android.ugc.aweme.common.e.a<?, ?> aVar) {
            this.f121831a = aVar;
            a aVar2 = (a) (!(aVar instanceof a) ? null : aVar);
            this.mModel = aVar2 == null ? new a() : aVar2;
            this.mPresenter = new com.ss.android.ugc.aweme.common.e.b();
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
        public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
            l.d(bVar, "");
            this.mPresenter.a(Integer.valueOf(i2), bVar.getAid(), Integer.valueOf(bVar.getVideoType()));
        }
    }
}

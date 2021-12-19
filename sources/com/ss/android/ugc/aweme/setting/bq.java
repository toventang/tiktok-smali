package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.ss.android.ugc.aweme.setting.serverpush.b.b;
import f.a.l.c;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public final class bq implements com.ss.android.ugc.aweme.setting.serverpush.a, b {

    /* renamed from: a  reason: collision with root package name */
    public static final bq f122104a = new bq();

    /* renamed from: b  reason: collision with root package name */
    private static c<String> f122105b;

    /* renamed from: c  reason: collision with root package name */
    private static final Queue<String> f122106c = new ArrayBlockingQueue(10);

    /* renamed from: d  reason: collision with root package name */
    private static final ArrayList<String> f122107d = n.d("digg_push", "comment_push", "follow_push", "mention_push", "im_push");

    /* renamed from: e  reason: collision with root package name */
    private static f f122108e;

    /* renamed from: f  reason: collision with root package name */
    private static final h f122109f = i.a((h.f.a.a) a.f122110a);

    @Override // com.ss.android.ugc.aweme.setting.serverpush.a
    public final void a(Exception exc) {
        l.d(exc, "");
    }

    private bq() {
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.b
    public final void av_() {
        c();
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.b
    public final void cf_() {
        c();
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<BaseResponse>, b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f122110a = new a();

        static {
            Covode.recordClassIndex(80064);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<BaseResponse>, b> invoke() {
            com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<BaseResponse>, b> providePrivateSettingChangePresenter = com.ss.android.ugc.aweme.setting.services.f.f122672a.providePrivateSettingChangePresenter();
            providePrivateSettingChangePresenter.a_(bq.f122104a);
            return providePrivateSettingChangePresenter;
        }
    }

    private static void c() {
        Queue<String> queue = f122106c;
        if (queue == null || queue.isEmpty()) {
            c<String> cVar = f122105b;
            if (cVar != null) {
                cVar.onComplete();
                return;
            }
            return;
        }
        String poll = queue.poll();
        c<String> cVar2 = f122105b;
        if (cVar2 != null) {
            cVar2.onNext(poll);
        }
    }

    static {
        Covode.recordClassIndex(80063);
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.a
    public final void a(f fVar) {
        l.d(fVar, "");
        f122108e = fVar;
    }
}

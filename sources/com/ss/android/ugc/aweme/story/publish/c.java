package com.ss.android.ugc.aweme.story.publish;

import android.content.ContentValues;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.ah;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.aweme.shortvideo.publish.y;
import com.ss.android.ugc.aweme.story.draft.b;
import com.ss.android.ugc.tools.utils.i;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class c extends k {

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f138102a = new CountDownLatch(2);

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f138103b;

    static {
        Covode.recordClassIndex(90313);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f138104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ai f138105b;

        static {
            Covode.recordClassIndex(90314);
        }

        a(c cVar, ai aiVar) {
            this.f138104a = cVar;
            this.f138105b = aiVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Serializable serializable = this.f138104a.f138103b.getSerializable("extra_video_publish_args");
            com.ss.android.ugc.aweme.draft.model.c cVar = null;
            if (!(serializable instanceof VideoPublishEditModel)) {
                serializable = null;
            }
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializable;
            if (videoPublishEditModel != null) {
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                l.b(createIAVServiceProxybyMonsterPlugin, "");
                createIAVServiceProxybyMonsterPlugin.getVideoCacheService().a(videoPublishEditModel.getOutputFile().toString(), this.f138105b);
                com.ss.android.ugc.aweme.port.in.l.f115658a.m().a(this.f138105b, videoPublishEditModel, this.f138104a.f138102a);
                String str = videoPublishEditModel.sessionId;
                if (str != null) {
                    l.b(str, "");
                    cVar = com.ss.android.ugc.aweme.story.draft.b.a(str);
                    if (cVar != null) {
                        com.ss.android.ugc.aweme.story.draft.b.a(cVar);
                    }
                }
                com.ss.android.ugc.aweme.port.in.l.f115658a.m().b(this.f138105b, videoPublishEditModel, this.f138104a.f138102a);
                com.ss.android.ugc.aweme.port.in.l.f115658a.m().a(videoPublishEditModel, cVar, this.f138104a.f138102a);
            }
            return z.f158842a;
        }
    }

    static final class b extends h.c.b.a.k implements m<am, d<? super z>, Object> {
        final /* synthetic */ String $path;
        final /* synthetic */ VideoPublishEditModel $videoContext;
        int label;

        static {
            Covode.recordClassIndex(90315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, VideoPublishEditModel videoPublishEditModel, d dVar) {
            super(2, dVar);
            this.$path = str;
            this.$videoContext = videoPublishEditModel;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new b(this.$path, this.$videoContext, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* access modifiers changed from: package-private */
        public static final class a extends h.f.b.m implements h.f.a.b<ContentValues, z> {
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(90316);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(1);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(ContentValues contentValues) {
                ContentValues contentValues2 = contentValues;
                l.d(contentValues2, "");
                contentValues2.put("last_output_path", this.this$0.$path);
                return z.f158842a;
            }
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                String str = this.$path;
                if (str == null || str.length() == 0 || !i.a(this.$path)) {
                    return z.f158842a;
                }
                String str2 = this.$videoContext.sessionId;
                if (str2 != null) {
                    l.b(str2, "");
                    a aVar = new a(this);
                    l.d(str2, "");
                    l.d(aVar, "");
                    if (com.ss.android.ugc.aweme.story.draft.b.a()) {
                        ContentValues contentValues = new ContentValues();
                        aVar.invoke(contentValues);
                        ((Boolean) com.ss.android.ugc.aweme.story.draft.b.a((Object) false, (h.f.a.a) new b.g(contentValues, str2))).booleanValue();
                    }
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public c(Bundle bundle) {
        l.d(bundle, "");
        this.f138103b = bundle;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
    public final void onFinish(com.ss.android.ugc.aweme.shortvideo.publish.d dVar, Object obj) {
        l.d(dVar, "");
        if (dVar instanceof d.c) {
            b.i.b(new a(this, ((d.c) dVar).f129784a), g.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
    public final void onStageUpdate(String str, ah ahVar, Object obj) {
        l.d(str, "");
        l.d(ahVar, "");
        super.onStageUpdate(str, ahVar, obj);
        Serializable serializable = this.f138103b.getSerializable("extra_video_publish_args");
        if (!(serializable instanceof VideoPublishEditModel)) {
            serializable = null;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializable;
        if (videoPublishEditModel != null && TextUtils.equals(str, "STAGE_SYNTHETIC") && (ahVar instanceof ah.a)) {
            ah.a aVar = (ah.a) ahVar;
            if (aVar.f129708a instanceof y.a) {
                y yVar = aVar.f129708a;
                Objects.requireNonNull(yVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.Result.Success");
                bz unused = kotlinx.coroutines.i.a(an.a(bf.f159041b), null, null, new b(((y.a) yVar).f129907a.toString(), videoPublishEditModel, null), 3);
            }
        }
    }
}

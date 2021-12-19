package com.ss.android.ugc.gamora.editor.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.draft.model.LighteningExtraInfo;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.p.d;
import com.ss.android.ugc.aweme.shortvideo.p.e;
import com.ss.android.ugc.gamora.editor.c.b;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.n;
import h.z;

public final class c extends com.ss.android.ugc.aweme.ar.a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f145720a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(95727);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<DraftSaveResult, z> {
        final /* synthetic */ VideoPublishEditModel $model;
        final /* synthetic */ b $pageAction;

        static {
            Covode.recordClassIndex(95729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VideoPublishEditModel videoPublishEditModel, b bVar) {
            super(1);
            this.$model = videoPublishEditModel;
            this.$pageAction = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(DraftSaveResult draftSaveResult) {
            l.d(draftSaveResult, "");
            ((b.C3871b) this.$pageAction).f145709c.invoke(c.a(this.$model), draftSaveResult);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.draft.model.c, z> {
        final /* synthetic */ VideoPublishEditModel $model;
        final /* synthetic */ b $pageAction;

        static {
            Covode.recordClassIndex(95728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VideoPublishEditModel videoPublishEditModel, b bVar) {
            super(1);
            this.$model = videoPublishEditModel;
            this.$pageAction = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.draft.model.c cVar) {
            com.ss.android.ugc.aweme.draft.model.c cVar2 = cVar;
            l.d(cVar2, "");
            String a2 = c.a(this.$model);
            cVar2.W.bp = new LighteningExtraInfo(a2);
            g.a().c().a(cVar2, "update_scheduleId");
            ((b.C3871b) this.$pageAction).f145708b.invoke(a2);
            return z.f158842a;
        }
    }

    public static String a(VideoPublishEditModel videoPublishEditModel) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_video_publish_args", videoPublishEditModel);
        bundle.putString("shoot_way", videoPublishEditModel.mShootWay);
        bundle.putInt("publish_private_state", videoPublishEditModel.isPrivate());
        bundle.putInt("publish_permission", 0);
        com.ss.android.ugc.aweme.story.h.c.a.a n = g.a().n();
        l.b(bundle, "");
        return n.a(bundle, videoPublishEditModel, C3879c.f145725a);
    }

    public static <RETURN_VALUE> RETURN_VALUE a(b<RETURN_VALUE> bVar) {
        l.d(bVar, "");
        if (bVar instanceof b.c) {
            b.c cVar = (b.c) bVar;
            boolean z = cVar.f145710a;
            boolean z2 = cVar.f145711b;
            Activity activity = cVar.f145712c;
            Intent intent = cVar.f145713d;
            if (z) {
                com.ss.android.ugc.aweme.shortvideo.r.a.a().a(activity, intent, 1002);
            } else if (z2) {
                com.ss.android.ugc.aweme.shortvideo.r.a.a().a(activity, intent, 8);
            } else {
                com.ss.android.ugc.aweme.shortvideo.r.a.a().b((Context) activity, intent);
            }
            return (RETURN_VALUE) z.f158842a;
        } else if (bVar instanceof b.e) {
            b.e eVar = (b.e) bVar;
            Activity activity2 = eVar.f145716a;
            VideoPublishEditModel videoPublishEditModel = eVar.f145718c;
            com.ss.android.ugc.aweme.shortvideo.r.a.a().b(activity2, eVar.f145717b);
            cr.a().g();
            cr.a().a(videoPublishEditModel.challenges);
            if (g.a().A().a() || !videoPublishEditModel.mIsFromDraft) {
                activity2.finish();
            }
            return (RETURN_VALUE) z.f158842a;
        } else if (bVar instanceof b.a) {
            g.a().d().a();
            ((b.a) bVar).f145706a.finish();
            return (RETURN_VALUE) z.f158842a;
        } else if (bVar instanceof b.d) {
            b.d dVar = (b.d) bVar;
            Activity activity3 = dVar.f145714a;
            RetakeVideoContext retakeVideoContext = dVar.f145715b;
            Intent intent2 = new Intent();
            intent2.putExtra("retake_video", retakeVideoContext);
            intent2.putExtra("retake_shoot_mode", 1);
            com.ss.android.ugc.aweme.shortvideo.r.a.a().c(activity3, intent2);
            return (RETURN_VALUE) z.f158842a;
        } else if (bVar instanceof b.C3871b) {
            e b2 = d.b(com.ss.android.ugc.aweme.shortvideo.p.c.f129554a);
            b2.d();
            b2.a("after_click_publish", true);
            b2.a(1);
            VideoPublishEditModel videoPublishEditModel2 = ((b.C3871b) bVar).f145707a;
            com.ss.android.ugc.aweme.port.in.l.f115658a.l().a(videoPublishEditModel2);
            com.ss.android.ugc.aweme.port.in.l.f115658a.l().a(videoPublishEditModel2, new a(videoPublishEditModel2, bVar), new b(videoPublishEditModel2, bVar));
            return (RETURN_VALUE) z.f158842a;
        } else {
            throw new n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.c.c$c  reason: collision with other inner class name */
    public static final class C3879c extends m implements q<String, Object, Object, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3879c f145725a = new C3879c();

        static {
            Covode.recordClassIndex(95730);
        }

        C3879c() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(String str, Object obj, Object obj2) {
            l.d(str, "");
            l.d(obj, "");
            d.b(com.ss.android.ugc.aweme.shortvideo.p.c.f129554a).e();
            return z.f158842a;
        }
    }
}

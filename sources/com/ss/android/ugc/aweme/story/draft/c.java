package com.ss.android.ugc.aweme.story.draft;

import android.content.ContentValues;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bn;
import com.ss.android.ugc.aweme.story.draft.b;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.tools.utils.q;
import h.c.b.a.d;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import kotlinx.coroutines.am;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f137034a = new c();

    /* access modifiers changed from: package-private */
    public static final class a extends d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(89589);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, null, this);
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(89588);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ StoryEditClipModel $clipModel;
        final /* synthetic */ VideoPublishEditModel $editModel;
        int label;

        static {
            Covode.recordClassIndex(89590);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VideoPublishEditModel videoPublishEditModel, StoryEditClipModel storyEditClipModel, h.c.d dVar) {
            super(2, dVar);
            this.$editModel = videoPublishEditModel;
            this.$clipModel = storyEditClipModel;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.$editModel, this.$clipModel, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            com.ss.android.ugc.aweme.story.draft.a.b bVar;
            DraftFileSaveResult draftFileSaveResult;
            String b2;
            boolean booleanValue;
            String str;
            if (this.label == 0) {
                r.a(obj);
                VideoPublishEditModel videoPublishEditModel = this.$editModel;
                StoryEditClipModel storyEditClipModel = this.$clipModel;
                new bn("StoryDraftManger");
                com.ss.android.ugc.aweme.draft.model.c b3 = bn.b(videoPublishEditModel);
                if (b3.J <= 0) {
                    b3.J = System.currentTimeMillis();
                }
                b3.I = System.currentTimeMillis();
                b.a(b3, videoPublishEditModel.getFilterIndex());
                b3.f83185f = storyEditClipModel.getEditMusicModel().getCurrentMusic();
                String str2 = "";
                l.b(b3, str2);
                DraftSaveResult a2 = com.ss.android.ugc.aweme.shortvideo.ab.k.a(b3);
                VideoPublishEditModel videoPublishEditModel2 = this.$editModel;
                if (videoPublishEditModel2.canvasVideoData != null) {
                    bVar = new com.ss.android.ugc.aweme.story.draft.a.a(videoPublishEditModel2, b3);
                } else if (videoPublishEditModel2.isUploadVideo()) {
                    bVar = new com.ss.android.ugc.aweme.story.draft.a.c(videoPublishEditModel2, b3);
                } else {
                    bVar = null;
                }
                int i2 = 0;
                if (bVar == null || (draftFileSaveResult = bVar.a()) == null) {
                    draftFileSaveResult = new DraftFileSaveResult(0, null, 3, null);
                }
                DraftSaveResult copy$default = DraftSaveResult.copy$default(a2, null, 0, 0, null, 0, null, draftFileSaveResult, null, null, false, 959, null);
                if (!draftFileSaveResult.isSuc()) {
                    StringBuilder append = new StringBuilder("StoryDraftManger:copy src error when saving draft,errorCode:").append(draftFileSaveResult.getSaveException().getErrorCode()).append(",msg:");
                    Throwable throwable = draftFileSaveResult.getSaveException().getThrowable();
                    if (throwable != null) {
                        str = throwable.getMessage();
                    } else {
                        str = null;
                    }
                    q.a(append.append(str).toString());
                    g.a().c().a().a(copy$default);
                    return z.f158842a;
                }
                l.d(b3, str2);
                if (!b.a()) {
                    booleanValue = false;
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_draft_session_id", com.ss.android.ugc.aweme.draft.model.d.a(b3));
                    if (b3.f83181b == null) {
                        b2 = str2;
                    } else {
                        b2 = g.a().G().b(b3.f83181b);
                    }
                    contentValues.put("aweme", b2);
                    contentValues.put("music_path", b3.f83187h);
                    contentValues.put("video_volume", Integer.valueOf(b3.f83189j));
                    contentValues.put("music_volume", Integer.valueOf(b3.f83190k));
                    if (b3.f83185f != null) {
                        str2 = g.a().G().b(b3.f83185f);
                    }
                    contentValues.put("music", str2);
                    contentValues.put("filter", Integer.valueOf(b3.f83192m));
                    contentValues.put("music_start", Integer.valueOf(b3.n));
                    contentValues.put("time", Long.valueOf(b3.I));
                    contentValues.put("save_time", Long.valueOf(b3.J));
                    contentValues.put("origin", Integer.valueOf(b3.p));
                    contentValues.put("user_id", b3.H);
                    contentValues.put("segment_video", b3.K);
                    contentValues.put("sticker_id", b3.O);
                    contentValues.put("music_id", com.ss.android.ugc.aweme.draft.model.d.b(b3));
                    contentValues.put("effect_list", com.ss.android.ugc.aweme.draft.model.d.c(b3));
                    contentValues.put("camera_poi", Integer.valueOf(b3.v));
                    contentValues.put("filter_label", b3.u);
                    contentValues.put("is_private", Integer.valueOf(b3.D));
                    contentValues.put("max_duration", Long.valueOf(b3.F));
                    contentValues.put("custom_cover_start", Float.valueOf(b3.S));
                    contentValues.put("draft_extras", g.a().G().b(b3.W));
                    contentValues.put("last_output_path", b3.W.bF);
                    booleanValue = ((Boolean) b.a((Object) false, (h.f.a.a) new b.C3586b(contentValues))).booleanValue();
                }
                if (!booleanValue) {
                    i2 = -1000;
                }
                g.a().c().a().a(DraftSaveResult.copy$default(copy$default, null, 0, 0, null, 0, null, null, new DraftDBSaveResult(new DraftDBSaveException(i2, null, 2, null)), null, false, 895, null));
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7, com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel r8, h.c.d<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.ss.android.ugc.aweme.story.draft.c.a
            if (r0 == 0) goto L_0x0045
            r5 = r9
            com.ss.android.ugc.aweme.story.draft.c$a r5 = (com.ss.android.ugc.aweme.story.draft.c.a) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0045
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L_0x0013:
            java.lang.Object r1 = r5.result
            h.c.a.a r4 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 != r3) goto L_0x004b
            h.r.a(r1)
        L_0x0021:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x0026:
            h.r.a(r1)
            boolean r0 = com.ss.android.ugc.aweme.story.base.a.a.a()
            if (r0 != 0) goto L_0x0034
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x0034:
            kotlinx.coroutines.ah r2 = kotlinx.coroutines.bf.f159041b
            com.ss.android.ugc.aweme.story.draft.c$b r1 = new com.ss.android.ugc.aweme.story.draft.c$b
            r0 = 0
            r1.<init>(r7, r8, r0)
            r5.label = r3
            java.lang.Object r0 = kotlinx.coroutines.i.a(r2, r1, r5)
            if (r0 != r4) goto L_0x0021
            return r4
        L_0x0045:
            com.ss.android.ugc.aweme.story.draft.c$a r5 = new com.ss.android.ugc.aweme.story.draft.c$a
            r5.<init>(r6, r9)
            goto L_0x0013
        L_0x004b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.draft.c.a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel, h.c.d):java.lang.Object");
    }
}

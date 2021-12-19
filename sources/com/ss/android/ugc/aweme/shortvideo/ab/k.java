package com.ss.android.ugc.aweme.shortvideo.ab;

import android.text.TextUtils;
import android.text.format.DateFormat;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.draft.e;
import com.ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.draft.model.h;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ab.m;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.utils.i;
import h.c.d;
import h.f.b.l;
import h.r;
import h.z;
import java.io.File;
import java.util.Calendar;
import java.util.TimeZone;
import kotlinx.coroutines.am;

public final class k {
    static {
        Covode.recordClassIndex(82034);
    }

    public static final DraftCheckResult a(m.c cVar) {
        return e.a(cVar.f124869a).a();
    }

    public static final void a(DraftSaveResult draftSaveResult) {
        l.d(draftSaveResult, "");
        if (!g.a().A().a()) {
            g.a().c().b().a(draftSaveResult);
            g.a().c().a().a(draftSaveResult);
        }
    }

    public static /* synthetic */ DraftSaveResult a(c cVar) {
        String str = "";
        l.d(cVar, str);
        String f2 = cVar.f();
        l.b(f2, str);
        int a2 = h.a(cVar);
        int i2 = cVar.f83183d;
        long j2 = cVar.I;
        if (j2 > 0) {
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            l.b(instance, str);
            instance.setTimeInMillis(j2);
            str = DateFormat.format("yyyy-MM-dd hh:mm:ss a", instance).toString();
        }
        return new DraftSaveResult(f2, a2, i2, str, g.a().N(), null, null, null, null, cVar.W.bG, 224, null);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.c.b.a.k implements h.f.a.m<am, d<? super DraftSaveResult>, Object> {
        final /* synthetic */ m.c $this_saveDraft;
        int label;

        static {
            Covode.recordClassIndex(82035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m.c cVar, d dVar) {
            super(2, dVar);
            this.$this_saveDraft = cVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$this_saveDraft, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super DraftSaveResult> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            boolean z;
            a gVar;
            if (this.label == 0) {
                r.a(obj);
                g.a().w();
                DraftSaveResult a2 = k.a(this.$this_saveDraft.f124869a);
                try {
                    DraftCheckResult a3 = k.a(this.$this_saveDraft);
                    if (!a3.isSuc()) {
                        DraftSaveResult copy$default = DraftSaveResult.copy$default(a2, null, 0, 0, null, 0, a3, null, null, null, false, 991, null);
                        k.a(copy$default);
                        return copy$default;
                    }
                    m.c cVar = this.$this_saveDraft;
                    c cVar2 = cVar.f124869a;
                    VideoPublishEditModel videoPublishEditModel = cVar.f124871c;
                    if (cVar.f124870b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    l.d(cVar2, "");
                    l.d(videoPublishEditModel, "");
                    l.d(cVar2, "");
                    l.d(videoPublishEditModel, "");
                    if (videoPublishEditModel.mIsFromDraft) {
                        if (!videoPublishEditModel.isFastImport || !videoPublishEditModel.isMultiVideoEdit()) {
                            gVar = new d(cVar2, videoPublishEditModel);
                        } else {
                            gVar = new f(cVar2, videoPublishEditModel);
                        }
                    } else if (videoPublishEditModel.isFastImport) {
                        if (videoPublishEditModel.isMultiVideoEdit()) {
                            gVar = new f(cVar2, videoPublishEditModel);
                        } else {
                            gVar = new c(cVar2, videoPublishEditModel);
                        }
                    } else if (videoPublishEditModel.isMultiVideoEdit() && i.a()) {
                        gVar = new h(cVar2, videoPublishEditModel, z);
                    } else if (videoPublishEditModel.isMultiVideoEdit() && !i.a()) {
                        gVar = new e(cVar2, videoPublishEditModel, z);
                    } else if (videoPublishEditModel.isStitchMode()) {
                        gVar = new l(cVar2, videoPublishEditModel, z);
                    } else {
                        gVar = new g();
                    }
                    DraftFileSaveResult a4 = gVar.a();
                    if (a4.isSuc()) {
                        c cVar3 = cVar.f124869a;
                        VideoPublishEditModel videoPublishEditModel2 = cVar.f124871c;
                        l.d(cVar3, "");
                        l.d(videoPublishEditModel2, "");
                        DraftFileSaveException draftFileSaveException = new DraftFileSaveException(0, null, 3, null);
                        if (!videoPublishEditModel2.isDuet()) {
                            a4 = new DraftFileSaveResult(5, draftFileSaveException);
                        } else {
                            String duetVideoPath = videoPublishEditModel2.draftDuetExtraInfo.getDuetVideoPath();
                            String duetAudioPath = videoPublishEditModel2.draftDuetExtraInfo.getDuetAudioPath();
                            if (i.a(duetVideoPath) && i.a(duetAudioPath)) {
                                String str = dj.f126463f + "duet/" + cVar3.f();
                                String str2 = str + '/' + new File(duetVideoPath).getName();
                                String str3 = str + '/' + new File(duetAudioPath).getName();
                                if (!i.a(str2)) {
                                    draftFileSaveException = com.ss.android.ugc.aweme.draft.h.a(duetVideoPath, str2, true);
                                    if (!draftFileSaveException.isSuc()) {
                                        a4 = new DraftFileSaveResult(5, draftFileSaveException);
                                    }
                                }
                                if (!i.a(str3)) {
                                    draftFileSaveException = com.ss.android.ugc.aweme.draft.h.a(duetAudioPath, str3, true);
                                    if (!draftFileSaveException.isSuc()) {
                                        a4 = new DraftFileSaveResult(5, draftFileSaveException);
                                    }
                                }
                                cVar3.a(DuetExtraInfo.copy$default(videoPublishEditModel2.draftDuetExtraInfo, str2, str3, 0, 0, null, 0, 60, null));
                            }
                            a4 = new DraftFileSaveResult(5, draftFileSaveException);
                        }
                        if (a4.isSuc()) {
                            VideoPublishEditModel videoPublishEditModel3 = cVar.f124871c;
                            l.d(videoPublishEditModel3, "");
                            if (videoPublishEditModel3.veAudioRecorderParam != null && videoPublishEditModel3.veAudioRecorderParam.hasRecord()) {
                                String audioUrl = videoPublishEditModel3.veAudioRecorderParam.getAudioUrl();
                                AudioRecorderParam audioRecorderParam = videoPublishEditModel3.veAudioRecorderParam;
                                l.b(audioRecorderParam, "");
                                if (!l.a((Object) audioUrl, (Object) com.ss.android.ugc.tools.utils.a.a(audioRecorderParam))) {
                                    String audioUrl2 = videoPublishEditModel3.veAudioRecorderParam.getAudioUrl();
                                    AudioRecorderParam audioRecorderParam2 = videoPublishEditModel3.veAudioRecorderParam;
                                    l.b(audioRecorderParam2, "");
                                    com.ss.android.ugc.aweme.video.e.c(audioUrl2, com.ss.android.ugc.tools.utils.a.a(audioRecorderParam2));
                                }
                                j.b(cVar.f124871c);
                                j.a(cVar.f124871c);
                                j.a(cVar.f124869a, cVar.f124871c);
                            }
                            if (videoPublishEditModel3.veAudioRecorderParam != null && !TextUtils.isEmpty(videoPublishEditModel3.veAudioRecorderParam.getExtraUrl())) {
                                com.ss.android.ugc.aweme.video.e.c(videoPublishEditModel3.veAudioRecorderParam.getExtraUrl());
                            }
                            j.b(cVar.f124871c);
                            j.a(cVar.f124871c);
                            j.a(cVar.f124869a, cVar.f124871c);
                        }
                    }
                    if (!a4.isSuc()) {
                        DraftSaveResult copy$default2 = DraftSaveResult.copy$default(a2, null, 0, 0, null, 0, null, a4, null, null, false, 959, null);
                        k.a(copy$default2);
                        return copy$default2;
                    }
                    DraftCheckResult copy$default3 = DraftCheckResult.copy$default(k.a(this.$this_saveDraft), 0, null, null, 1, 7, null);
                    if (!copy$default3.isSuc()) {
                        DraftSaveResult copy$default4 = DraftSaveResult.copy$default(a2, null, 0, 0, null, 0, copy$default3, null, null, null, false, 991, null);
                        k.a(copy$default4);
                        return copy$default4;
                    }
                    DraftDBSaveResult a5 = g.a().c().a(this.$this_saveDraft.f124869a);
                    if (!a5.isSuc()) {
                        DraftSaveResult copy$default5 = DraftSaveResult.copy$default(a2, null, 0, 0, null, 0, null, null, a5, null, false, 895, null);
                        k.a(copy$default5);
                        return copy$default5;
                    }
                    k.a(a2);
                    return a2;
                } catch (Throwable th) {
                    g.a().w();
                    a2 = DraftSaveResult.copy$default(a2, null, 0, 0, null, 0, null, null, null, th, false, 767, null);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}

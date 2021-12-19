package com.ss.android.ugc.aweme.infoSticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.Collection;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final VideoPublishEditModel f104679a;

    /* renamed from: b  reason: collision with root package name */
    private final h f104680b = h.i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(67084);
    }

    public final StickerChallenge a() {
        return (StickerChallenge) this.f104680b.getValue();
    }

    public final Collection<AVChallenge> c() {
        return a().getRecordStickerChallengeList();
    }

    static final class b extends m implements h.f.a.a<StickerChallenge> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(67086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StickerChallenge invoke() {
            if (this.this$0.f104679a.stickerChallenge == null) {
                return new StickerChallenge();
            }
            return this.this$0.f104679a.stickerChallenge;
        }
    }

    public final Collection<AVChallenge> b() {
        Collection<AVChallenge> values = a().getStickerToChallenge().values();
        l.b(values, "");
        return values;
    }

    public i(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        this.f104679a = videoPublishEditModel;
    }

    public static final class a implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f104681a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f104682b;

        static {
            Covode.recordClassIndex(67085);
        }

        public a(i iVar, Effect effect) {
            this.f104681a = iVar;
            this.f104682b = effect;
        }

        @Override // com.ss.android.ugc.aweme.infoSticker.a
        public final void a(AVChallenge aVChallenge) {
            this.f104681a.a().getStickerList().add(this.f104682b.getEffectId());
            this.f104681a.a().getStickerToChallenge().put(this.f104682b.getEffectId(), aVChallenge);
        }
    }

    public final void a(List<? extends AVChallenge> list) {
        if ((!list.isEmpty()) && list != null) {
            a().getRecordStickerChallengeList().clear();
            a().getRecordStickerChallengeList().addAll(list);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (r2 == null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        r5.f104679a.removeChallengeFromTitleAndStruct(h.a.am.a(r4));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.infoSticker.i.a(java.lang.String):void");
    }
}

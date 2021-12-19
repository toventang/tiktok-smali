package com.ss.android.ugc.gamora.recorder.sticker.c;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.sticker.presenter.handler.StickerVideoStatusHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.VoiceRecognizeStickerHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.e;
import com.ss.android.ugc.aweme.sticker.presenter.i;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class k {
    static {
        Covode.recordClassIndex(97869);
    }

    public static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.sticker.presenter.handler.m, Boolean> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(97870);
        }

        public a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
            return Boolean.valueOf(invoke(mVar));
        }

        public final boolean invoke(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
            l.d(mVar, "");
            return mVar instanceof StickerVideoStatusHandler;
        }
    }

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.sticker.presenter.handler.m, Boolean> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(97871);
        }

        public b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
            return Boolean.valueOf(invoke(mVar));
        }

        public final boolean invoke(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
            l.d(mVar, "");
            return mVar instanceof VoiceRecognizeStickerHandler;
        }
    }

    public static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.sticker.presenter.handler.m, Boolean> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(97872);
        }

        public c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
            return Boolean.valueOf(invoke(mVar));
        }

        public final boolean invoke(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
            l.d(mVar, "");
            return mVar instanceof StickerVideoStatusHandler;
        }
    }

    public static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.sticker.presenter.handler.m, Boolean> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(97873);
        }

        public d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
            return Boolean.valueOf(invoke(mVar));
        }

        public final boolean invoke(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
            l.d(mVar, "");
            return mVar instanceof e;
        }
    }

    public static final void b(i iVar) {
        l.d(iVar, "");
        com.ss.android.ugc.aweme.sticker.presenter.handler.m a2 = iVar.a(c.INSTANCE);
        if (!(a2 instanceof StickerVideoStatusHandler)) {
            a2 = null;
        }
        StickerVideoStatusHandler stickerVideoStatusHandler = (StickerVideoStatusHandler) a2;
        if (stickerVideoStatusHandler != null) {
            stickerVideoStatusHandler.b();
        }
    }

    public static final AVChallenge a(i iVar) {
        List<? extends AVChallenge> list;
        l.d(iVar, "");
        com.ss.android.ugc.aweme.sticker.presenter.handler.m a2 = iVar.a(d.INSTANCE);
        if (!(a2 instanceof e)) {
            a2 = null;
        }
        e eVar = (e) a2;
        if (eVar == null || (list = eVar.f135391a) == null) {
            return null;
        }
        return (AVChallenge) n.h((List) list);
    }

    public static final void a(i iVar, PrivacyCert privacyCert) {
        l.d(iVar, "");
        com.ss.android.ugc.aweme.sticker.presenter.handler.m a2 = iVar.a(b.INSTANCE);
        if (!(a2 instanceof VoiceRecognizeStickerHandler)) {
            a2 = null;
        }
        VoiceRecognizeStickerHandler voiceRecognizeStickerHandler = (VoiceRecognizeStickerHandler) a2;
        if (voiceRecognizeStickerHandler != null) {
            voiceRecognizeStickerHandler.a(new com.ss.android.ugc.aweme.sticker.q.d(privacyCert));
        }
    }

    public static final void a(i iVar, boolean z) {
        l.d(iVar, "");
        com.ss.android.ugc.aweme.sticker.presenter.handler.m a2 = iVar.a(a.INSTANCE);
        if (!(a2 instanceof StickerVideoStatusHandler)) {
            a2 = null;
        }
        StickerVideoStatusHandler stickerVideoStatusHandler = (StickerVideoStatusHandler) a2;
        if (stickerVideoStatusHandler != null) {
            stickerVideoStatusHandler.a(z);
        }
    }
}

package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.ss.android.ugc.aweme.draft.model.DraftUpdateService;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class DraftUpdateServiceImpl implements DraftUpdateService {
    public static final a Companion = new a((byte) 0);
    public static final h gson$delegate = i.a((h.f.a.a) b.f124719a);

    public static final class a {
        static {
            Covode.recordClassIndex(81959);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f124719a = new b();

        static {
            Covode.recordClassIndex(81960);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            return createIAVServiceProxybyMonsterPlugin.getNetworkService().getRetrofitFactoryGson();
        }
    }

    static {
        Covode.recordClassIndex(81958);
    }

    public static DraftUpdateService createDraftUpdateServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(2628);
        Object a2 = com.ss.android.ugc.b.a(DraftUpdateService.class, z);
        if (a2 != null) {
            DraftUpdateService draftUpdateService = (DraftUpdateService) a2;
            MethodCollector.o(2628);
            return draftUpdateService;
        }
        if (com.ss.android.ugc.b.dY == null) {
            synchronized (DraftUpdateService.class) {
                try {
                    if (com.ss.android.ugc.b.dY == null) {
                        com.ss.android.ugc.b.dY = new DraftUpdateServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2628);
                    throw th;
                }
            }
        }
        DraftUpdateServiceImpl draftUpdateServiceImpl = (DraftUpdateServiceImpl) com.ss.android.ugc.b.dY;
        MethodCollector.o(2628);
        return draftUpdateServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.draft.model.DraftUpdateService
    public final c transformNewAVMusic(String str) {
        l.d(str, "");
        Object a2 = ((f) gson$delegate.getValue()).a(str, MusicModel.class);
        l.b(a2, "");
        MusicModel musicModel = (MusicModel) a2;
        if (musicModel.getName() == null && musicModel.getMusicType() == null) {
            Object a3 = GsonHolder.c().b().a(str, c.class);
            l.b(a3, "");
            return (c) a3;
        }
        c a4 = com.ss.android.ugc.aweme.shortvideo.ae.b.a(musicModel);
        l.b(a4, "");
        return a4;
    }
}

package com.ss.android.ugc.aweme.feed.assem.addiction;

import android.content.Context;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.assem.h;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.x.g;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import h.f.b.l;
import h.f.b.m;
import h.f.b.r;
import h.k.i;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class VideoAntiAddictionVM extends FeedBaseViewModel<e> {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ i[] f91984k = {new r(VideoAntiAddictionVM.class, "context", "getContext()Landroid/content/Context;", 0)};
    public static final a n = new a((byte) 0);

    /* renamed from: l  reason: collision with root package name */
    public boolean f91985l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f91986m;
    private final h v = new h(b.f91987a);

    static final class b extends m implements h.f.a.a<Context> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f91987a = new b();

        static {
            Covode.recordClassIndex(57918);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ Context invoke() {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(57916);
    }

    public final void a(Context context) {
        this.v.a(f91984k[0], context);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57917);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(VideoItemParams videoItemParams) {
            l.d(videoItemParams, "");
            if (n.a(videoItemParams.mAweme)) {
                return false;
            }
            Aweme aweme = videoItemParams.mAweme;
            l.b(aweme, "");
            if (aweme.isHotSearchAweme()) {
                return false;
            }
            Aweme aweme2 = videoItemParams.mAweme;
            l.b(aweme2, "");
            if (aweme2.isHotVideoAweme() || com.ss.android.ugc.aweme.feed.x.m.g(videoItemParams.mAweme) || g.a(videoItemParams.mAweme)) {
                return false;
            }
            return true;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new e();
    }

    public static SimpleDateFormat h() {
        boolean z;
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            Boolean antiAddictionToastEnable24hourTime = iESSettingsProxy.getAntiAddictionToastEnable24hourTime();
            l.b(antiAddictionToastEnable24hourTime, "");
            z = antiAddictionToastEnable24hourTime.booleanValue();
        } catch (com.bytedance.ies.a unused) {
            z = false;
        }
        if (z) {
            return new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        }
        return new SimpleDateFormat("hh:mm aa", Locale.ENGLISH);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(j jVar, VideoItemParams videoItemParams) {
        l.d(jVar, "");
        l.d(videoItemParams, "");
        return videoItemParams;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.ss.android.ugc.aweme.feed.assem.addiction.e a(com.ss.android.ugc.aweme.feed.assem.addiction.e r10, com.ss.android.ugc.aweme.feed.model.VideoItemParams r11) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.addiction.VideoAntiAddictionVM.a(com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams):com.bytedance.assem.arch.viewModel.j");
    }
}

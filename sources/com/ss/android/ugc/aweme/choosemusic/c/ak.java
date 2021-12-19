package com.ss.android.ugc.aweme.choosemusic.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class ak extends j {
    public static final a y = new a((byte) 0);
    private HashMap z;

    static {
        Covode.recordClassIndex(43439);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43440);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.choosemusic.c.j, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.z;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.j
    public final void a() {
        super.a();
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            Boolean showMusicFeedbackEntrance = iESSettingsProxy.getShowMusicFeedbackEntrance();
            l.b(showMusicFeedbackEntrance, "");
            this.s = showMusicFeedbackEntrance.booleanValue();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.j
    public final TuxStatusView.c b() {
        if (!CommerceMediaServiceImpl.f().b() && !CommerceMediaServiceImpl.f().e()) {
            return com.ss.android.ugc.aweme.tux.a.g.a.b(new TuxStatusView.c());
        }
        TuxStatusView.c b2 = com.ss.android.ugc.aweme.tux.a.g.a.b(new TuxStatusView.c());
        String string = getString(R.string.anu);
        l.b(string, "");
        TuxStatusView.c a2 = b2.a(string);
        String string2 = getString(R.string.ans);
        l.b(string2, "");
        return a2.a((CharSequence) string2);
    }
}

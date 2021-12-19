package com.ss.android.ugc.aweme.choosemusic.view;

import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.common.ae;
import com.ss.android.ugc.aweme.music.k.a;
import h.f.b.l;

public final class q extends c {
    static {
        Covode.recordClassIndex(43654);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.view.c
    public final void d() {
        EditText editText = this.f70819j;
        l.b(editText, "");
        editText.setFilters(new InputFilter[]{new ae()});
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.view.c
    public final void c() {
        if (!a.C2857a.a("show_tcm_info", (Boolean) true, "music_sp") || !CommerceMediaServiceImpl.f().d() || CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
            StarTcmItem starTcmItem = this.o;
            l.b(starTcmItem, "");
            starTcmItem.setVisibility(8);
            return;
        }
        StarTcmItem starTcmItem2 = this.o;
        l.b(starTcmItem2, "");
        starTcmItem2.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(View view, com.ss.android.ugc.aweme.choosemusic.c.a aVar, int i2, TextWatcher textWatcher) {
        super(view, aVar, i2, textWatcher);
        l.d(view, "");
        l.d(aVar, "");
        l.d(textWatcher, "");
    }
}

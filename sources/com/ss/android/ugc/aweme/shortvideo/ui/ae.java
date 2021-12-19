package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.b.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.ss.android.ugc.aweme.setting.serverpush.b.c;
import java.util.HashMap;

public final class ae implements c {

    /* renamed from: a  reason: collision with root package name */
    CommonItemView f131376a;

    /* renamed from: b  reason: collision with root package name */
    HashMap<String, String> f131377b;

    /* renamed from: c  reason: collision with root package name */
    f f131378c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.common.c<b<f>, c> f131379d;

    static {
        Covode.recordClassIndex(86077);
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
    public final void a(f fVar) {
        this.f131378c = fVar;
        if (this.f131376a != null && fVar != null && fVar.r == a.f71516d) {
            this.f131376a.setChecked(false);
            this.f131376a.setAlpha(0.66f);
        }
    }

    public ae(CommonItemView commonItemView, boolean z, HashMap<String, String> hashMap) {
        this.f131376a = commonItemView;
        this.f131377b = hashMap;
        if (CommentServiceImpl.e().d()) {
            this.f131376a.setVisibility(0);
            this.f131376a.setChecked(z);
            this.f131376a.setOnClickListener(new af(this));
            com.ss.android.ugc.aweme.common.c<b<f>, c> providePushSettingFetchPresenter = com.ss.android.ugc.aweme.setting.services.f.f122672a.providePushSettingFetchPresenter();
            this.f131379d = providePushSettingFetchPresenter;
            providePushSettingFetchPresenter.a_(this);
            this.f131379d.a(new Object[0]);
            return;
        }
        this.f131376a.setVisibility(8);
    }
}

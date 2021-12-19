package com.bytedance.android.livesdk.container;

import android.view.View;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.custom.a.a;
import com.bytedance.covode.number.Covode;

public interface e extends b<PopupConfig>, a {
    static {
        Covode.recordClassIndex(9310);
    }

    void a(View.OnClickListener onClickListener);

    void a(androidx.fragment.app.e eVar);

    void a(LiveBottomSheetBehavior.a aVar);

    void a(String str);

    View c();
}

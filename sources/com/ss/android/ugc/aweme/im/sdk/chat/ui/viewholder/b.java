package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f101387a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.b f101388b;

    static {
        Covode.recordClassIndex(64833);
    }

    public b(a aVar, com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.b bVar) {
        this.f101387a = aVar;
        this.f101388b = bVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        a aVar = this.f101387a;
        com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.b bVar = this.f101388b;
        if (bVar != null) {
            bVar.a(z, aVar.getAdapterPosition());
        }
    }
}

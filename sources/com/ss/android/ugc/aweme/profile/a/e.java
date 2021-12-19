package com.ss.android.ugc.aweme.profile.a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.draft.model.c;
import com.zhiliaoapp.musically.R;

public final class e extends com.ss.android.ugc.aweme.common.a.e<c> {

    /* renamed from: a  reason: collision with root package name */
    public Context f115836a;

    /* renamed from: b  reason: collision with root package name */
    SmartImageView f115837b;

    /* renamed from: c  reason: collision with root package name */
    TextView f115838c;

    /* renamed from: d  reason: collision with root package name */
    TextView f115839d;

    static {
        Covode.recordClassIndex(74719);
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void c() {
    }

    public e(View view) {
        super(view);
        this.f115836a = view.getContext();
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.agf);
        this.f115837b = smartImageView;
        smartImageView.setOnClickListener(new f(this));
        this.f115838c = (TextView) view.findViewById(R.id.eys);
        this.f115839d = (TextView) view.findViewById(R.id.eyr);
    }

    /* access modifiers changed from: protected */
    public final void a(c cVar, int i2) {
        if (cVar != null) {
            a.b(new g(this, cVar, i2));
        }
    }
}

package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.setting.k.d;
import com.ss.android.ugc.aweme.setting.k.e;
import com.ss.android.ugc.aweme.setting.model.k;
import com.ss.android.ugc.aweme.setting.model.l;

public class RestrictTextView extends TuxTextView implements d {

    /* renamed from: a  reason: collision with root package name */
    private e f122781a;

    /* renamed from: b  reason: collision with root package name */
    private String f122782b;

    static {
        Covode.recordClassIndex(80593);
    }

    public RestrictTextView(Context context) {
        this(context, null);
    }

    public final void a(String str) {
        this.f122782b = str;
        this.f122781a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.setting.k.d
    public final void a(k kVar) {
        if (TextUtils.equals(kVar.f122333a, this.f122782b)) {
            setVisibility(0);
            setText(a.a("Review time:%s \nReview AllFriends:%s ", new Object[]{kVar.f122334b, kVar.f122335c}));
        }
    }

    public RestrictTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private RestrictTextView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 16842884);
        this.f122781a = new e(new l(), this);
    }
}

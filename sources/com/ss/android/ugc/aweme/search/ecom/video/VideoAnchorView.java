package com.ss.android.ugc.aweme.search.ecom.video;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecom.a.a;
import com.ss.android.ugc.aweme.utils.cb;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class VideoAnchorView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private SmartImageView f121108a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f121109b;

    /* renamed from: c  reason: collision with root package name */
    private Aweme f121110c;

    /* renamed from: d  reason: collision with root package name */
    private a f121111d;

    static {
        Covode.recordClassIndex(78887);
    }

    public VideoAnchorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final a getCurProduct() {
        return this.f121111d;
    }

    private final String a(a aVar, int i2) {
        if (i2 <= 0) {
            return null;
        }
        if (i2 != 1) {
            return getResources().getQuantityString(R.plurals.j4, i2, Integer.valueOf(i2));
        } else if (aVar == null) {
            return null;
        } else {
            String str = aVar.f121036d;
            if (str == null || str.length() <= 0) {
                return aVar.f121034b;
            }
            return str;
        }
    }

    public final boolean a(Aweme aweme, a aVar) {
        List<a> list;
        a aVar2;
        String str;
        int i2;
        l.d(aweme, "");
        if (aVar == null || (list = aVar.f121113b) == null || (aVar2 = (a) n.h((List) list)) == null || (str = aVar2.f121033a) == null || str.length() <= 0) {
            p.a(this);
            return false;
        }
        this.f121111d = aVar2;
        this.f121110c = aweme;
        UrlModel urlModel = aVar.f121112a;
        a aVar3 = this.f121111d;
        Aweme aweme2 = this.f121110c;
        if (aweme2 != null) {
            i2 = aweme2.getTotalProductAnchors();
        } else {
            i2 = 0;
        }
        String a2 = a(aVar3, i2);
        if (urlModel == null || a2 == null) {
            p.a(this);
            return false;
        }
        p.b(this);
        v a3 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
        a3.E = this.f121108a;
        a3.c();
        TextView textView = this.f121109b;
        if (textView != null) {
            textView.setText(a2);
        }
        return true;
    }

    private /* synthetic */ VideoAnchorView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private VideoAnchorView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(183);
        LinearLayout.inflate(context, R.layout.axh, this);
        this.f121108a = (SmartImageView) findViewById(R.id.fff);
        this.f121109b = (TextView) findViewById(R.id.ffg);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        float applyDimension = TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics());
        setBackground(cb.a(b.c(context, R.color.a4), 0.0f, 0.0f, applyDimension, applyDimension));
        MethodCollector.o(183);
    }
}

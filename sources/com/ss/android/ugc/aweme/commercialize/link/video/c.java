package com.ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.a;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.zhiliaoapp.musically.R;
import java.util.Collection;

public final class c extends LinearLayout implements View.OnClickListener, f {

    /* renamed from: a  reason: collision with root package name */
    private RemoteImageView f74523a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f74524b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f74525c;

    /* renamed from: d  reason: collision with root package name */
    private g f74526d;

    static {
        Covode.recordClassIndex(45957);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.link.video.f
    public final View c() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.link.video.f
    public final void a() {
        g gVar = this.f74526d;
        if (gVar != null) {
            gVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.link.video.f
    public final void b() {
        g gVar = this.f74526d;
        if (gVar != null) {
            gVar.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.link.video.f
    public final void a(g gVar) {
        this.f74526d = gVar;
    }

    public c(Context context) {
        this(context, (byte) 0);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        g gVar = this.f74526d;
        if (gVar != null) {
            gVar.b();
        }
    }

    private c(Context context, byte b2) {
        this(context, (char) 0);
    }

    private c(Context context, char c2) {
        super(context, null, 0);
        MethodCollector.i(13187);
        a.a(LayoutInflater.from(getContext()), R.layout.a0a, this, true);
        setPadding(n.a(5.0d), n.a(5.0d), n.a(5.0d), n.a(5.0d));
        setBackgroundResource(R.drawable.azz);
        this.f74523a = (RemoteImageView) findViewById(R.id.caw);
        this.f74524b = (TextView) findViewById(R.id.cav);
        this.f74525c = (ImageView) findViewById(R.id.cax);
        setOnClickListener(this);
        MethodCollector.o(13187);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.link.video.f
    public final void a(ac acVar, g gVar, CommerceTagLayout commerceTagLayout) {
        this.f74526d = gVar;
        if (acVar == null) {
            this.f74523a.setImageResource(R.color.c9);
            this.f74524b.setText("");
            return;
        }
        ((com.facebook.drawee.f.a) this.f74523a.getHierarchy()).d(R.color.f159926j);
        UrlModel urlModel = acVar.avatarIcon;
        if (urlModel == null || b.a((Collection) urlModel.getUrlList())) {
            this.f74523a.setImageResource(R.color.c9);
        } else {
            e.a(this.f74523a, acVar.avatarIcon);
        }
        if (acVar.showCloseTips) {
            this.f74525c.setVisibility(0);
        } else {
            this.f74525c.setVisibility(8);
        }
        this.f74525c.setOnClickListener(new d(commerceTagLayout, gVar));
        this.f74524b.setText(acVar.title);
        if (!TextUtils.isEmpty(acVar.label)) {
            TextView textView = (TextView) findViewById(R.id.gm);
            textView.setVisibility(0);
            textView.setText(acVar.label);
        }
    }
}

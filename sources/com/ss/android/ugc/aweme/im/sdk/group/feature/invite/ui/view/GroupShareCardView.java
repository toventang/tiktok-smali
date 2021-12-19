package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class GroupShareCardView extends a {

    /* renamed from: d  reason: collision with root package name */
    private final int f102679d;

    static {
        Covode.recordClassIndex(65747);
    }

    public GroupShareCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view.a
    public final int getResourceId() {
        return this.f102679d;
    }

    static final class a extends m implements b<e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f102680a = new a();

        static {
            Covode.recordClassIndex(65748);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44776b = Integer.valueOf((int) R.attr.u);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    private /* synthetic */ GroupShareCardView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private GroupShareCardView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(7335);
        this.f102679d = R.layout.a59;
        View inflate = LayoutInflater.from(context).inflate(getResourceId(), this);
        View findViewById = inflate.findViewById(R.id.title_tv);
        l.b(findViewById, "");
        setTitleTv((TuxTextView) findViewById);
        View findViewById2 = inflate.findViewById(R.id.eej);
        l.b(findViewById2, "");
        setSubtitleTv((TuxTextView) findViewById2);
        View findViewById3 = inflate.findViewById(R.id.pf);
        l.b(findViewById3, "");
        setAvatarIv((RemoteImageView) findViewById3);
        setBackground(f.a(a.f102680a).a(context));
        MethodCollector.o(7335);
    }
}

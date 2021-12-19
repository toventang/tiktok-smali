package com.ss.android.ugc.aweme.multi.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Objects;

public class ToolsAnchorItem extends CommonAnchorItem {

    /* renamed from: b  reason: collision with root package name */
    public static final a f111027b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f111028c;

    static {
        Covode.recordClassIndex(71255);
    }

    public ToolsAnchorItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final SmartImageView getActionButton() {
        return (SmartImageView) this.f111028c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem
    public final int a() {
        return R.layout.aba;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71256);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ToolsAnchorItem a(Context context) {
            l.d(context, "");
            View a2 = com.a.a(LayoutInflater.from(context), R.layout.abb, null, false);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.multi.ui.ToolsAnchorItem");
            return (ToolsAnchorItem) a2;
        }
    }

    static final class b extends m implements h.f.a.a<SmartImageView> {
        final /* synthetic */ ToolsAnchorItem this$0;

        static {
            Covode.recordClassIndex(71257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ToolsAnchorItem toolsAnchorItem) {
            super(0);
            this.this$0 = toolsAnchorItem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartImageView invoke() {
            return this.this$0.findViewById(R.id.ac2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ UrlModel $urlModel;
        final /* synthetic */ ToolsAnchorItem this$0;

        static {
            Covode.recordClassIndex(71258);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ToolsAnchorItem toolsAnchorItem, UrlModel urlModel) {
            super(0);
            this.this$0 = toolsAnchorItem;
            this.$urlModel = urlModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.setButtonIcon(this.$urlModel);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.a $onClick;
        final /* synthetic */ ToolsAnchorItem this$0;

        static {
            Covode.recordClassIndex(71259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ToolsAnchorItem toolsAnchorItem, h.f.a.a aVar) {
            super(0);
            this.this$0 = toolsAnchorItem;
            this.$onClick = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.setButtonOnClickListener(this.$onClick);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f111029a;

        static {
            Covode.recordClassIndex(71260);
        }

        e(h.f.a.a aVar) {
            this.f111029a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f111029a.invoke();
        }
    }

    public final void setButtonIcon(UrlModel urlModel) {
        if (urlModel != null) {
            if (!getAttached()) {
                getPendingSetting().offer(new c(this, urlModel));
                return;
            }
            v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
            a2.u = Bitmap.Config.ARGB_8888;
            a2.E = getActionButton();
            a2.c();
        }
    }

    public final void setButtonOnClickListener(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        if (!getAttached()) {
            getPendingSetting().offer(new d(this, aVar));
        } else {
            getActionButton().setOnClickListener(new e(aVar));
        }
    }

    private /* synthetic */ ToolsAnchorItem(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ToolsAnchorItem(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f111028c = i.a((h.f.a.a) new b(this));
    }
}

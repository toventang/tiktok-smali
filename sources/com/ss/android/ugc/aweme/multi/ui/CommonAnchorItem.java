package com.ss.android.ugc.aweme.multi.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.z;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class CommonAnchorItem extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f111021a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f111022b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f111023c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f111024d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f111025e;

    /* renamed from: f  reason: collision with root package name */
    private final Queue<h.f.a.a<z>> f111026f;

    static {
        Covode.recordClassIndex(71244);
    }

    public CommonAnchorItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final SmartImageView getIconView() {
        return (SmartImageView) this.f111024d.getValue();
    }

    private final TextView getSubTitleView() {
        return (TextView) this.f111023c.getValue();
    }

    private final TextView getTitleView() {
        return (TextView) this.f111022b.getValue();
    }

    public int a() {
        return R.layout.a9t;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71245);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static CommonAnchorItem a(Context context) {
            l.d(context, "");
            View a2 = com.a.a(LayoutInflater.from(context), R.layout.a9u, null, false);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem");
            return (CommonAnchorItem) a2;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean getAttached() {
        return this.f111025e;
    }

    /* access modifiers changed from: protected */
    public final Queue<h.f.a.a<z>> getPendingSetting() {
        return this.f111026f;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f111025e = false;
        super.onDetachedFromWindow();
    }

    static final class b extends m implements h.f.a.a<SmartImageView> {
        final /* synthetic */ CommonAnchorItem this$0;

        static {
            Covode.recordClassIndex(71246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CommonAnchorItem commonAnchorItem) {
            super(0);
            this.this$0 = commonAnchorItem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartImageView invoke() {
            return this.this$0.findViewById(R.id.ac3);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ UrlModel $urlModel;
        final /* synthetic */ CommonAnchorItem this$0;

        static {
            Covode.recordClassIndex(71247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CommonAnchorItem commonAnchorItem, UrlModel urlModel) {
            super(0);
            this.this$0 = commonAnchorItem;
            this.$urlModel = urlModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.setIcon(this.$urlModel);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ int $iconRes;
        final /* synthetic */ CommonAnchorItem this$0;

        static {
            Covode.recordClassIndex(71248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CommonAnchorItem commonAnchorItem, int i2) {
            super(0);
            this.this$0 = commonAnchorItem;
            this.$iconRes = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.setIconRes(this.$iconRes);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ String $subtitle;
        final /* synthetic */ CommonAnchorItem this$0;

        static {
            Covode.recordClassIndex(71249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(CommonAnchorItem commonAnchorItem, String str) {
            super(0);
            this.this$0 = commonAnchorItem;
            this.$subtitle = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.setSubTitle(this.$subtitle);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ String $title;
        final /* synthetic */ CommonAnchorItem this$0;

        static {
            Covode.recordClassIndex(71250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(CommonAnchorItem commonAnchorItem, String str) {
            super(0);
            this.this$0 = commonAnchorItem;
            this.$title = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.setTitle(this.$title);
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<TextView> {
        final /* synthetic */ CommonAnchorItem this$0;

        static {
            Covode.recordClassIndex(71251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(CommonAnchorItem commonAnchorItem) {
            super(0);
            this.this$0 = commonAnchorItem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.findViewById(R.id.ac4);
        }
    }

    static final class h extends m implements h.f.a.a<TextView> {
        final /* synthetic */ CommonAnchorItem this$0;

        static {
            Covode.recordClassIndex(71252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(CommonAnchorItem commonAnchorItem) {
            super(0);
            this.this$0 = commonAnchorItem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.findViewById(R.id.ac5);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f111025e = true;
        com.a.a(LayoutInflater.from(getContext()), a(), this, true);
        while (this.f111026f.peek() != null) {
            this.f111026f.poll().invoke();
        }
    }

    /* access modifiers changed from: protected */
    public final void setAttached(boolean z) {
        this.f111025e = z;
    }

    public final void setIconRes(int i2) {
        if (!this.f111025e) {
            this.f111026f.offer(new d(this, i2));
        } else {
            getIconView().setImageResource(i2);
        }
    }

    public final void setSubTitle(String str) {
        l.d(str, "");
        if (!this.f111025e) {
            this.f111026f.offer(new e(this, str));
            return;
        }
        TextView subTitleView = getSubTitleView();
        l.b(subTitleView, "");
        subTitleView.setText(str);
    }

    public final void setTitle(String str) {
        l.d(str, "");
        if (!this.f111025e) {
            this.f111026f.offer(new f(this, str));
            return;
        }
        TextView titleView = getTitleView();
        l.b(titleView, "");
        titleView.setText(str);
    }

    public final void setIcon(UrlModel urlModel) {
        if (urlModel != null) {
            if (!this.f111025e) {
                this.f111026f.offer(new c(this, urlModel));
                return;
            }
            float b2 = n.b(getContext(), 64.0f);
            float b3 = n.b(getContext(), (float) ((urlModel.getHeight() * 64) / urlModel.getWidth()));
            SmartImageView iconView = getIconView();
            l.b(iconView, "");
            ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
            layoutParams.width = (int) b2;
            layoutParams.height = (int) b3;
            SmartImageView iconView2 = getIconView();
            l.b(iconView2, "");
            iconView2.setLayoutParams(layoutParams);
            v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
            a2.u = Bitmap.Config.ARGB_8888;
            a2.E = getIconView();
            a2.c();
        }
    }

    private /* synthetic */ CommonAnchorItem(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonAnchorItem(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(3447);
        this.f111022b = i.a((h.f.a.a) new h(this));
        this.f111023c = i.a((h.f.a.a) new g(this));
        this.f111024d = i.a((h.f.a.a) new b(this));
        this.f111026f = new LinkedList();
        MethodCollector.o(3447);
    }
}

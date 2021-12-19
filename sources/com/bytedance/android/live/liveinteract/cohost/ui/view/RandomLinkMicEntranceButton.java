package com.bytedance.android.live.liveinteract.cohost.ui.view;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.interact.model.i;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class RandomLinkMicEntranceButton extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    public i.a f10447g;

    /* renamed from: h  reason: collision with root package name */
    private final h f10448h;

    /* renamed from: i  reason: collision with root package name */
    private final h f10449i;

    /* renamed from: j  reason: collision with root package name */
    private final h f10450j;

    /* renamed from: k  reason: collision with root package name */
    private final h f10451k;

    static {
        Covode.recordClassIndex(5545);
    }

    public RandomLinkMicEntranceButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final View getMask() {
        return (View) this.f10451k.getValue();
    }

    public final LiveButton getButton() {
        return (LiveButton) this.f10448h.getValue();
    }

    public final LiveTextView getSubTitle() {
        return (LiveTextView) this.f10450j.getValue();
    }

    public final LiveTextView getTitle() {
        return (LiveTextView) this.f10449i.getValue();
    }

    public final i.a getBannerText() {
        return this.f10447g;
    }

    static final class b extends m implements h.f.a.a<LiveButton> {
        final /* synthetic */ RandomLinkMicEntranceButton this$0;

        static {
            Covode.recordClassIndex(5547);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RandomLinkMicEntranceButton randomLinkMicEntranceButton) {
            super(0);
            this.this$0 = randomLinkMicEntranceButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveButton invoke() {
            return this.this$0.findViewById(R.id.xd);
        }
    }

    static final class c extends m implements h.f.a.a<View> {
        final /* synthetic */ RandomLinkMicEntranceButton this$0;

        static {
            Covode.recordClassIndex(5548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RandomLinkMicEntranceButton randomLinkMicEntranceButton) {
            super(0);
            this.this$0 = randomLinkMicEntranceButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.fir);
        }
    }

    static final class d extends m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ RandomLinkMicEntranceButton this$0;

        static {
            Covode.recordClassIndex(5549);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(RandomLinkMicEntranceButton randomLinkMicEntranceButton) {
            super(0);
            this.this$0 = randomLinkMicEntranceButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            return this.this$0.findViewById(R.id.f5e);
        }
    }

    static final class e extends m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ RandomLinkMicEntranceButton this$0;

        static {
            Covode.recordClassIndex(5550);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(RandomLinkMicEntranceButton randomLinkMicEntranceButton) {
            super(0);
            this.this$0 = randomLinkMicEntranceButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            return this.this$0.findViewById(R.id.f5f);
        }
    }

    public final void b() {
        getMask().setVisibility(8);
        LiveButton button = getButton();
        i.a aVar = this.f10447g;
        if (aVar == null) {
            l.b();
        }
        com.bytedance.android.live.liveinteract.cohost.a.e.c.a(button, aVar);
        if (!getButton().isEnabled() && com.bytedance.android.live.liveinteract.cohost.a.e.d.b()) {
            getMask().setVisibility(0);
        }
    }

    public final void setBannerText(i.a aVar) {
        this.f10447g = aVar;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f10452a = new a();

        static {
            Covode.recordClassIndex(5546);
        }

        a() {
        }

        public final void onClick(View view) {
            ao.a(y.e(), y.a((int) R.string.du5), 0);
        }
    }

    private /* synthetic */ RandomLinkMicEntranceButton(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RandomLinkMicEntranceButton(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9794);
        this.f10448h = h.i.a((h.f.a.a) new b(this));
        this.f10449i = h.i.a((h.f.a.a) new e(this));
        this.f10450j = h.i.a((h.f.a.a) new d(this));
        this.f10451k = h.i.a((h.f.a.a) new c(this));
        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(R.layout.bfm, this).findViewById(R.id.c08);
        l.b(imageView, "");
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        int c3 = y.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(y.a(), 2131234208, options);
        float f2 = (((float) c3) * 1.0f) / ((float) options.outWidth);
        Matrix matrix = new Matrix();
        matrix.setScale(f2, f2);
        imageView.setImageMatrix(matrix);
        getMask().setOnClickListener(a.f10452a);
        MethodCollector.o(9794);
    }
}

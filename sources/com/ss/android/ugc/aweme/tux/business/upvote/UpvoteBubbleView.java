package com.ss.android.ugc.aweme.tux.business.upvote;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.z;
import java.util.Arrays;
import java.util.Objects;

public final class UpvoteBubbleView extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    public static final a f141612g = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f141613h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f141614i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f141615j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f141616k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f141617l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f141618m;
    private final h.h n;
    private final int o;

    static {
        Covode.recordClassIndex(92535);
    }

    public UpvoteBubbleView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public UpvoteBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final TuxIconView getArrowIcon() {
        return (TuxIconView) this.f141617l.getValue();
    }

    private final AvatarImageView getAvatarEnd() {
        return (AvatarImageView) this.f141615j.getValue();
    }

    private final AvatarImageView getAvatarMiddle() {
        return (AvatarImageView) this.f141614i.getValue();
    }

    private final AvatarImageView getAvatarStart() {
        return (AvatarImageView) this.f141613h.getValue();
    }

    private final Drawable getBubbleBG() {
        return (Drawable) this.n.getValue();
    }

    private final View getTouchArea() {
        return (View) this.f141618m.getValue();
    }

    private final TuxTextView getUpvoteTV() {
        return (TuxTextView) this.f141616k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92536);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final View getBubbleTouchArea() {
        return getTouchArea();
    }

    static final class b extends m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ UpvoteBubbleView this$0;

        static {
            Covode.recordClassIndex(92537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UpvoteBubbleView upvoteBubbleView) {
            super(0);
            this.this$0 = upvoteBubbleView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.this$0.findViewById(R.id.bhn);
        }
    }

    static final class c extends m implements h.f.a.a<AvatarImageView> {
        final /* synthetic */ UpvoteBubbleView this$0;

        static {
            Covode.recordClassIndex(92538);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UpvoteBubbleView upvoteBubbleView) {
            super(0);
            this.this$0 = upvoteBubbleView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AvatarImageView invoke() {
            return this.this$0.findViewById(R.id.c2m);
        }
    }

    static final class d extends m implements h.f.a.a<AvatarImageView> {
        final /* synthetic */ UpvoteBubbleView this$0;

        static {
            Covode.recordClassIndex(92539);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(UpvoteBubbleView upvoteBubbleView) {
            super(0);
            this.this$0 = upvoteBubbleView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AvatarImageView invoke() {
            return this.this$0.findViewById(R.id.c2n);
        }
    }

    static final class e extends m implements h.f.a.a<AvatarImageView> {
        final /* synthetic */ UpvoteBubbleView this$0;

        static {
            Covode.recordClassIndex(92540);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(UpvoteBubbleView upvoteBubbleView) {
            super(0);
            this.this$0 = upvoteBubbleView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AvatarImageView invoke() {
            return this.this$0.findViewById(R.id.c2o);
        }
    }

    static final class f extends m implements h.f.a.a<Drawable> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(92541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Drawable invoke() {
            return com.bytedance.tux.c.f.a(AnonymousClass1.f141619a).a(this.$context);
        }
    }

    static final class g extends m implements h.f.a.a<View> {
        final /* synthetic */ UpvoteBubbleView this$0;

        static {
            Covode.recordClassIndex(92543);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(UpvoteBubbleView upvoteBubbleView) {
            super(0);
            this.this$0 = upvoteBubbleView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.fen);
        }
    }

    static final class h extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ UpvoteBubbleView this$0;

        static {
            Covode.recordClassIndex(92544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(UpvoteBubbleView upvoteBubbleView) {
            super(0);
            this.this$0 = upvoteBubbleView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.f_7);
        }
    }

    public final void setAvatar(q<? super AvatarImageView, ? super AvatarImageView, ? super AvatarImageView, z> qVar) {
        l.d(qVar, "");
        qVar.invoke(getAvatarStart(), getAvatarMiddle(), getAvatarEnd());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ UpvoteBubbleView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private UpvoteBubbleView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        int i2 = 0;
        this.f141613h = i.a((h.f.a.a) new e(this));
        this.f141614i = i.a((h.f.a.a) new d(this));
        this.f141615j = i.a((h.f.a.a) new c(this));
        this.f141616k = i.a((h.f.a.a) new h(this));
        this.f141617l = i.a((h.f.a.a) new b(this));
        this.f141618m = i.a((h.f.a.a) new g(this));
        com.a.a(LayoutInflater.from(context), R.layout.bhw, this, true);
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        i2 = displayMetrics != null ? displayMetrics.widthPixels : i2;
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a2 = i2 - h.g.a.a(TypedValue.applyDimension(1, 95.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        setMaxWidth(a2 - h.g.a.a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics())));
        this.n = i.a((h.f.a.a) new f(context));
        this.o = androidx.core.content.b.c(context, R.color.iu);
    }

    public final void a(boolean z, String str, String str2) {
        String str3 = str;
        String str4 = null;
        if (z) {
            getUpvoteTV().setBackground(getBubbleBG());
            getUpvoteTV().setTuxFont(61);
            TuxTextView upvoteTV = getUpvoteTV();
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            Integer valueOf2 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 2.5f, system2.getDisplayMetrics())));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            Integer valueOf3 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics())));
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            com.bytedance.tux.h.i.a((View) upvoteTV, valueOf, valueOf2, valueOf3, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 2.5f, system4.getDisplayMetrics()))), false, 16);
            TuxTextView upvoteTV2 = getUpvoteTV();
            Resources system5 = Resources.getSystem();
            l.a((Object) system5, "");
            com.bytedance.tux.h.i.b(upvoteTV2, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 4.0f, system5.getDisplayMetrics()))), null, null, null, false, 30);
            getUpvoteTV().setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            getArrowIcon().setVisibility(8);
        } else {
            getUpvoteTV().setBackground(null);
            getUpvoteTV().setTuxFont(62);
            com.bytedance.tux.h.i.a((View) getUpvoteTV(), (Integer) 0, (Integer) 0, (Integer) 0, (Integer) 0, false, 16);
            TuxTextView upvoteTV3 = getUpvoteTV();
            Resources system6 = Resources.getSystem();
            l.a((Object) system6, "");
            com.bytedance.tux.h.i.b(upvoteTV3, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 6.0f, system6.getDisplayMetrics()))), null, null, null, false, 30);
            getUpvoteTV().setShadowLayer(1.0f, 0.0f, 1.0f, this.o);
            getArrowIcon().setVisibility(0);
        }
        TuxTextView upvoteTV4 = getUpvoteTV();
        if (str2 == null) {
            if (str3 != null) {
                int length = str3.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (!h.a.i.a(new Character[]{'\n', '\r'}, Character.valueOf(str3.charAt(i2)))) {
                        i2++;
                    } else if (i2 > 0) {
                        Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                        str3 = str3.substring(0, i2);
                        l.b(str3, "");
                    }
                }
            }
            str3 = str4;
        } else if (str3 != null) {
            str4 = com.a.a(str3, Arrays.copyOf(new Object[]{str2}, 1));
            l.b(str4, "");
            float measureText = getUpvoteTV().getPaint().measureText(str4);
            int maxWidth = getMaxWidth();
            Resources system7 = Resources.getSystem();
            l.a((Object) system7, "");
            int a2 = maxWidth - h.g.a.a(TypedValue.applyDimension(1, 20.0f, system7.getDisplayMetrics()));
            Resources system8 = Resources.getSystem();
            l.a((Object) system8, "");
            int a3 = a2 - h.g.a.a(TypedValue.applyDimension(1, 10.0f, system8.getDisplayMetrics()));
            Resources system9 = Resources.getSystem();
            l.a((Object) system9, "");
            float a4 = (float) (a3 - h.g.a.a(TypedValue.applyDimension(1, 6.0f, system9.getDisplayMetrics())));
            if (measureText >= a4) {
                float measureText2 = getUpvoteTV().getPaint().measureText("...".concat(String.valueOf(str3)));
                Resources system10 = Resources.getSystem();
                l.a((Object) system10, "");
                str3 = com.a.a(str3, Arrays.copyOf(new Object[]{gb.a(a(str2, 0, str2.length(), (int) (a4 - ((float) Math.ceil((double) (measureText2 + ((float) h.g.a.a(TypedValue.applyDimension(1, 2.0f, system10.getDisplayMetrics()))))))))) + "..."}, 1));
                l.b(str3, "");
            }
            str3 = str4;
        }
        upvoteTV4.setText(str3);
    }

    private final String a(String str, int i2, int i3, int i4) {
        while (i2 + 1 < i3) {
            int i5 = (i3 + i2) / 2;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(0, i5);
            l.b(substring, "");
            if (getUpvoteTV().getPaint().measureText(substring) < ((float) i4)) {
                i2 = i5;
            } else {
                i3 = i5;
            }
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring2 = str.substring(0, i2);
        l.b(substring2, "");
        return substring2;
    }
}

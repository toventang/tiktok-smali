package com.bytedance.android.live.publicscreen.impl.widget.b;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.live.publicscreen.impl.model.chat.badge.BadgeView;
import com.bytedance.android.live.publicscreen.impl.model.f;
import com.bytedance.android.live.publicscreen.impl.view.DrawableVerifiableTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.ui.cz;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class b extends com.bytedance.android.live.publicscreen.a.f.b<com.bytedance.android.live.publicscreen.impl.model.chat.a<? extends com.bytedance.android.livesdk.ac.b.a>> {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f12533a;

    /* renamed from: d  reason: collision with root package name */
    private final DrawableVerifiableTextView f12534d;

    /* renamed from: e  reason: collision with root package name */
    private final BadgeView f12535e;

    /* renamed from: f  reason: collision with root package name */
    private final HSImageView f12536f;

    /* renamed from: g  reason: collision with root package name */
    private final SpannableStringBuilder f12537g = new SpannableStringBuilder();

    /* renamed from: h  reason: collision with root package name */
    private Drawable f12538h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f12539i;

    /* renamed from: j  reason: collision with root package name */
    private ImageSpan f12540j;

    /* renamed from: k  reason: collision with root package name */
    private ImageSpan f12541k;

    /* renamed from: l  reason: collision with root package name */
    private com.bytedance.android.livesdk.ac.b.a f12542l;

    static {
        Covode.recordClassIndex(6898);
    }

    @Override // com.bytedance.android.live.publicscreen.a.f.a
    public final void a() {
        super.a();
        Drawable drawable = this.f12538h;
        Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
        ((Animatable) drawable).stop();
    }

    public final void b() {
        User b2;
        long j2;
        String str;
        com.bytedance.android.live.publicscreen.impl.model.chat.a aVar = (com.bytedance.android.live.publicscreen.impl.model.chat.a) this.f12196c;
        if (aVar != null && (b2 = aVar.b()) != null) {
            com.bytedance.android.livesdk.an.a a2 = com.bytedance.android.livesdk.an.a.a();
            UserProfileEvent userProfileEvent = new UserProfileEvent(b2.getId(), "head");
            com.bytedance.android.livesdk.ac.b.a aVar2 = this.f12542l;
            if (aVar2 != null) {
                j2 = aVar2.getMessageId();
            } else {
                j2 = 0;
            }
            userProfileEvent.msgId = j2;
            com.bytedance.android.livesdk.ac.b.a aVar3 = this.f12542l;
            if (aVar3 instanceof i) {
                Objects.requireNonNull(aVar3, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.ChatMessage");
                str = ((i) aVar3).f19629f;
            } else {
                str = "";
            }
            userProfileEvent.content = str;
            userProfileEvent.mSource = "live_comment";
            userProfileEvent.mReportType = "report_message";
            a2.a(userProfileEvent);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f12546a;

        static {
            Covode.recordClassIndex(6902);
        }

        d(b bVar) {
            this.f12546a = bVar;
        }

        public final void onClick(View view) {
            this.f12546a.b();
        }
    }

    static final class a implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f12543a;

        static {
            Covode.recordClassIndex(6899);
        }

        a(b bVar) {
            this.f12543a = bVar;
        }

        public final boolean onLongClick(View view) {
            g gVar = this.f12543a.f12195b;
            if (gVar == null) {
                return true;
            }
            gVar.a((k) this.f12543a.f12196c, "report_message");
            return true;
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.b.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC0264b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f12544a;

        static {
            Covode.recordClassIndex(6900);
        }

        View$OnClickListenerC0264b(b bVar) {
            this.f12544a = bVar;
        }

        public final void onClick(View view) {
            MESSAGE message;
            this.f12544a.b();
            k kVar = (k) this.f12544a.f12196c;
            if (kVar != null) {
                message = kVar.f12190d;
            } else {
                message = null;
            }
            com.bytedance.android.live.publicscreen.impl.f.b.a(message);
        }
    }

    static final class c implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f12545a;

        static {
            Covode.recordClassIndex(6901);
        }

        c(b bVar) {
            this.f12545a = bVar;
        }

        public final boolean onLongClick(View view) {
            g gVar = this.f12545a.f12195b;
            if (gVar == null) {
                return true;
            }
            gVar.a((k) this.f12545a.f12196c, "report_message");
            return true;
        }
    }

    public static final class e extends cz {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SpannableStringBuilder f12547a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f12548b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.publicscreen.impl.model.chat.a f12549c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f12550d;

        static {
            Covode.recordClassIndex(6903);
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.cz
        public final void a(View view) {
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
        }

        public final void onClick(View view) {
            String str;
            l.d(view, "");
            ((f) this.f12549c).a(false);
            this.f12550d.a(this.f12549c);
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_undo_translate_comment").a(this.f12550d.f12208l);
            if (this.f12550d.f12205i) {
                str = "anchor";
            } else {
                str = "user";
            }
            a2.a("user_type", str).a("click_icon", "revert_icon").a("to_user_id", this.f12549c.E()).b();
        }

        e(SpannableStringBuilder spannableStringBuilder, b bVar, com.bytedance.android.live.publicscreen.impl.model.chat.a aVar, g gVar) {
            this.f12547a = spannableStringBuilder;
            this.f12548b = bVar;
            this.f12549c = aVar;
            this.f12550d = gVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        Drawable drawable;
        l.d(view, "");
        View findViewById = view.findViewById(R.id.cs_);
        l.b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.f12533a = textView;
        View findViewById2 = view.findViewById(R.id.adh);
        l.b(findViewById2, "");
        DrawableVerifiableTextView drawableVerifiableTextView = (DrawableVerifiableTextView) findViewById2;
        this.f12534d = drawableVerifiableTextView;
        this.f12535e = (BadgeView) view.findViewById(R.id.r3);
        View findViewById3 = view.findViewById(R.id.clg);
        l.b(findViewById3, "");
        HSImageView hSImageView = (HSImageView) findViewById3;
        this.f12536f = hSImageView;
        ((com.facebook.drawee.f.a) hSImageView.getHierarchy()).b(0);
        hSImageView.setOnClickListener(new d(this));
        textView.setOnLongClickListener(new a(this));
        textView.setOnClickListener(new View$OnClickListenerC0264b(this));
        if (e.f12559b == null) {
            e.f12559b = new e();
        }
        drawableVerifiableTextView.setMovementMethod(e.f12559b);
        drawableVerifiableTextView.setOnLongClickListener(new c(this));
        Drawable b2 = androidx.appcompat.a.a.a.b(view.getContext(), R.drawable.bnd);
        com.bytedance.android.livesdk.widget.f fVar = null;
        if (b2 != null) {
            b2.setBounds(0, 0, y.a(14.0f), y.a(10.0f));
            b2.setCallback(drawableVerifiableTextView);
            drawable = b2;
        } else {
            drawable = null;
        }
        this.f12538h = drawable;
        drawableVerifiableTextView.setVerifiedDrawable(drawable);
        this.f12540j = new com.bytedance.android.livesdk.widget.f(this.f12538h);
        Drawable b3 = androidx.appcompat.a.a.a.b(view.getContext(), 2131234715);
        this.f12539i = b3;
        if (b3 != null) {
            b3.setBounds(0, 0, y.a(16.0f), y.a(16.0f));
        }
        Drawable drawable2 = this.f12539i;
        this.f12541k = drawable2 != null ? new com.bytedance.android.livesdk.widget.f(drawable2) : fVar;
    }

    @Override // com.bytedance.android.live.publicscreen.a.f.a
    public final /* synthetic */ void a(g gVar, h hVar) {
        com.bytedance.android.live.publicscreen.impl.model.chat.a aVar = (com.bytedance.android.live.publicscreen.impl.model.chat.a) hVar;
        l.d(gVar, "");
        l.d(aVar, "");
        this.f12542l = aVar.f12190d;
        List<com.bytedance.android.live.publicscreen.impl.model.chat.badge.b> list = aVar.f12416f;
        if (list.isEmpty()) {
            BadgeView badgeView = this.f12535e;
            l.b(badgeView, "");
            badgeView.setVisibility(8);
        } else {
            this.f12535e.setBadges(list);
            BadgeView badgeView2 = this.f12535e;
            l.b(badgeView2, "");
            badgeView2.setVisibility(0);
        }
        gVar.a(this.f12533a);
        gVar.a(this.f12534d);
        this.f12533a.setText(aVar.v());
        this.f12537g.clear();
        Animatable animatable = null;
        if (aVar instanceof f) {
            SpannableStringBuilder spannableStringBuilder = this.f12537g;
            CharSequence z = aVar.z();
            if (z != null) {
                f fVar = (f) aVar;
                if (fVar.c()) {
                    a(this.f12537g, z, this.f12540j);
                    Drawable drawable = this.f12538h;
                    if (drawable instanceof Animatable) {
                        animatable = drawable;
                    }
                    Animatable animatable2 = (Animatable) animatable;
                    if (animatable2 != null) {
                        animatable2.start();
                    }
                } else {
                    Drawable drawable2 = this.f12538h;
                    if (drawable2 instanceof Animatable) {
                        animatable = drawable2;
                    }
                    Animatable animatable3 = (Animatable) animatable;
                    if (animatable3 != null) {
                        animatable3.stop();
                    }
                    if (fVar.s()) {
                        if (!TextUtils.isEmpty(fVar.t()) && (z = fVar.t()) == null) {
                            z = "";
                        }
                        int a2 = a(this.f12537g, z, this.f12541k);
                        spannableStringBuilder.setSpan(new e(spannableStringBuilder, this, aVar, gVar), a2, a2 + 1, 33);
                    } else {
                        spannableStringBuilder.append(z);
                    }
                }
            }
        } else {
            Drawable drawable3 = this.f12538h;
            if (drawable3 instanceof Animatable) {
                animatable = drawable3;
            }
            Animatable animatable4 = animatable;
            if (animatable4 != null) {
                animatable4.stop();
            }
            this.f12537g.append(aVar.z());
        }
        this.f12534d.setText(this.f12537g);
        ImageModel J = aVar.J();
        if (J != null) {
            com.bytedance.android.live.core.f.k.a(this.f12536f, J);
        } else {
            this.f12536f.setImageResource(aVar.h_());
        }
    }

    private final int a(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, ImageSpan imageSpan) {
        int length;
        View view = this.itemView;
        l.b(view, "");
        int i2 = 1;
        if (com.bytedance.android.live.uikit.c.a.a(view.getContext())) {
            if (androidx.core.f.f.f2385d.a(charSequence, charSequence.length())) {
                spannableStringBuilder.append(charSequence).append("  ‌");
                length = charSequence.length();
            } else {
                spannableStringBuilder.append("  ‌").append(charSequence);
                spannableStringBuilder.setSpan(imageSpan, i2, i2 + 1, 33);
                return i2;
            }
        } else if (androidx.core.f.f.f2384c.a(charSequence, charSequence.length())) {
            spannableStringBuilder.append("  ‌").append(charSequence);
            spannableStringBuilder.setSpan(imageSpan, i2, i2 + 1, 33);
            return i2;
        } else {
            spannableStringBuilder.append(charSequence).append("  ‌");
            length = charSequence.length();
        }
        i2 = 1 + length;
        spannableStringBuilder.setSpan(imageSpan, i2, i2 + 1, 33);
        return i2;
    }
}

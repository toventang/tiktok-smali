package com.bytedance.android.live.publicscreen.impl.widget.b;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.e;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.live.publicscreen.a.d.j;
import com.bytedance.android.live.publicscreen.a.f.b;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.model.message.tracking.IdMessage;
import com.bytedance.android.livesdk.utils.ag;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Objects;

public final class a extends b<j<? extends com.bytedance.android.livesdk.ac.b.a>> {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f12527a;

    /* renamed from: d  reason: collision with root package name */
    private final ImageView f12528d;

    /* renamed from: e  reason: collision with root package name */
    private final TextView f12529e;

    /* renamed from: f  reason: collision with root package name */
    private final View f12530f;

    /* renamed from: g  reason: collision with root package name */
    private final View.OnClickListener f12531g = new View.OnClickListener(this) {
        /* class com.bytedance.android.live.publicscreen.impl.widget.b.a.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f12532a;

        static {
            Covode.recordClassIndex(6897);
        }

        {
            this.f12532a = r1;
        }

        public final void onClick(View view) {
            l.b(view, "");
            if (view.getTag() instanceof j) {
                Object tag = view.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type com.bytedance.android.live.publicscreen.api.model.PublicScreenActionMessageModel<out com.bytedance.android.livesdk.message.model.BaseLiveMessage>");
                j jVar = (j) tag;
                view.getContext();
                jVar.w();
                MESSAGE message = jVar.f12190d;
                if (message != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("clickedMessage", e.a.f9628b.b(IdMessage.from(message)));
                    i.b().b("ttlive_action_message_clicked", hashMap);
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(6896);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.bi7);
        l.b(findViewById, "");
        this.f12527a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.dnd);
        l.b(findViewById2, "");
        this.f12528d = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.adh);
        l.b(findViewById3, "");
        this.f12529e = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cy9);
        l.b(findViewById4, "");
        this.f12530f = findViewById4;
    }

    @Override // com.bytedance.android.live.publicscreen.a.f.a
    public final /* synthetic */ void a(g gVar, h hVar) {
        j jVar = (j) hVar;
        l.d(gVar, "");
        l.d(jVar, "");
        if (jVar.s() != null) {
            p.a(this.f12527a, jVar.s(), this.f12527a.getWidth(), this.f12527a.getHeight());
        } else if (jVar.t() > 0) {
            this.f12527a.setImageResource(jVar.t());
        } else {
            this.f12527a.setBackgroundResource(2131234529);
        }
        if (jVar.u() != null) {
            this.f12528d.setBackground(null);
            p.a(this.f12528d, jVar.u(), 0);
        }
        if (!jVar.v()) {
            this.f12528d.setVisibility(8);
        }
        if (!TextUtils.isEmpty(jVar.z())) {
            this.f12529e.setText(jVar.z());
        } else {
            this.f12529e.setText("");
        }
        ImageModel y = jVar.y();
        if (y != null) {
            View view = this.itemView;
            l.b(view, "");
            ag.a(y, view, com.bytedance.android.live.uikit.c.a.a(y.e()), null);
        } else if (!TextUtils.isEmpty(jVar.x())) {
            try {
                Drawable background = this.f12530f.getBackground();
                if (background != null) {
                    ((GradientDrawable) background).setColor(Color.parseColor(jVar.x()));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (jVar.v()) {
            View view2 = this.itemView;
            l.b(view2, "");
            view2.setTag(jVar);
            this.itemView.setOnClickListener(this.f12531g);
            return;
        }
        this.itemView.setOnClickListener(null);
    }
}

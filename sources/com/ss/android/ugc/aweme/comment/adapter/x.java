package com.ss.android.ugc.aweme.comment.adapter;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.comment.a.a;
import com.ss.android.ugc.aweme.comment.adapter.s;
import com.ss.android.ugc.aweme.comment.m;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.ui.bq;
import com.ss.android.ugc.aweme.comment.util.o;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.notification.g.a;
import com.ss.android.ugc.aweme.utils.aa;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.ib;
import com.zhiliaoapp.musically.R;
import java.util.Collection;

public final class x extends s {
    protected TextView D;
    TextView E;
    TextView F;
    protected TextView G;
    protected TextView H;
    TuxTextView I;
    TuxTextView J;
    TuxTextView K;
    TuxTextView L;
    LinearLayout M;
    TextView N;
    SmartImageView O;
    private bq P = new bq() {
        /* class com.ss.android.ugc.aweme.comment.adapter.x.AnonymousClass1 */

        static {
            Covode.recordClassIndex(43964);
        }

        @Override // com.ss.android.ugc.aweme.comment.ui.bq
        public final void a(View view) {
            String str;
            Comment comment;
            if (x.this.f71415a != null && x.this.C != null) {
                String str2 = "";
                if (view.getId() == R.id.f5q) {
                    if (x.this.f71415a.getRelationLabel() != null) {
                        str2 = x.this.f71415a.getRelationLabel().getUserId();
                    }
                    str = x.this.f71415a.getUser().getSecUid();
                } else if (b.a((Collection) x.this.f71415a.getReplyComments()) || (comment = x.this.f71415a.getReplyComments().get(0)) == null) {
                    str = str2;
                } else {
                    if (comment.getRelationLabel() != null) {
                        str2 = comment.getRelationLabel().getUserId();
                    }
                    str = comment.getUser().getSecUid();
                }
                if (!TextUtils.isEmpty(str2)) {
                    x.this.C.a(str2, str);
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(43963);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        if (this.C != null) {
            this.C.k();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.comment.adapter.s
    public final void a() {
        this.I.setTypeface(this.f71419e.getTypeface());
        this.I.getPaint().setFakeBoldText(this.f71419e.getPaint().isFakeBoldText());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h() {
        if (this.C != null && m.b(this.f71415a)) {
            this.C.d(this.f71415a);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.adapter.s
    public final void b() {
        int i2;
        if (this.f71415a != null) {
            int i3 = 4;
            if (m.a(this.f71415a)) {
                TextView textView = this.D;
                if (textView != null) {
                    o.b(false, textView, this.B);
                }
                this.f71427m.setVisibility(4);
                this.o.setVisibility(4);
                this.n.setVisibility(4);
            } else {
                if (this.D != null) {
                    if (!a.c()) {
                        this.D.setVisibility(8);
                    } else if (this.t) {
                        o.b(false, this.D, this.B);
                    } else {
                        o.b(true, this.D, this.B);
                        if (com.bytedance.ies.abmock.b.a().a(true, "standardize_timestamp", false)) {
                            TextView textView2 = this.D;
                            aa.a aVar = aa.s;
                            textView2.setText(aa.a.a(((long) this.f71415a.getCreateTime()) * 1000));
                        } else {
                            this.D.setText(ib.a(this.itemView.getContext(), ((long) this.f71415a.getCreateTime()) * 1000));
                        }
                    }
                }
                TextView textView3 = this.f71427m;
                if (this.f71415a.getDiggCount() != 0) {
                    i3 = 0;
                }
                textView3.setVisibility(i3);
                this.o.setVisibility(0);
                this.n.setVisibility(0);
            }
            if (this.f71415a.getGift() == null || this.f71415a.getGift().getImage() == null || this.f71415a.getGift().getImage().getUrlList() == null || this.f71415a.getGift().getImage().getUrlList().isEmpty()) {
                this.M.setVisibility(8);
            } else {
                this.M.setVisibility(0);
                TextView textView4 = this.N;
                if (textView4 != null) {
                    if (gb.a()) {
                        i2 = R.drawable.lz;
                    } else {
                        i2 = R.drawable.ly;
                    }
                    textView4.setBackgroundResource(i2);
                }
                v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(this.f71415a.getGift().getImage()));
                a2.E = this.O;
                a2.v = w.CENTER_INSIDE;
                a2.c();
                this.M.setOnClickListener(new aa(this));
            }
            m.a(this.f71415a, this.K);
            c();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.adapter.s
    public final void a(String str) {
        this.q = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View view) {
        int i2;
        if (view.getId() == R.id.c5g && !m.a(this.f71415a) && this.f71415a.getCid() != null && this.o.getVisibility() == 0) {
            if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                c.a(f.j(), this.q, "like_comment", new ap().a("login_title", "").a("group_id", this.r).a("log_pb", ac.c(this.r)).f142646a);
            } else if (this.f71415a != null && this.C != null) {
                if (com.ss.android.ugc.aweme.comment.h.a.a(this.f71415a)) {
                    boolean z = !this.f71415a.isUserDigged();
                    boolean isAuthorDigged = this.f71415a.isAuthorDigged();
                    if (TextUtils.equals(this.s, com.ss.android.ugc.aweme.account.b.g().getCurUserId()) && !TextUtils.equals(this.s, Comment.getAuthorUid(this.f71415a))) {
                        if (z) {
                            com.ss.android.ugc.aweme.comment.m.b.b(this.q, this.r, this.s, this.f71415a.getCid());
                        }
                        isAuthorDigged = z;
                    }
                    int diggCount = this.f71415a.getDiggCount();
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    a(z, diggCount + i2, true, isAuthorDigged);
                }
                com.ss.android.ugc.aweme.comment.g.a aVar = this.C;
                Comment comment = this.f71415a;
                getAdapterPosition();
                aVar.c(comment);
            }
        }
    }

    public x(View view, com.ss.android.ugc.aweme.comment.g.a aVar) {
        super(view, aVar);
        this.D = (TextView) view.findViewById(R.id.aam);
        this.E = (TextView) view.findViewById(R.id.aah);
        this.F = (TextView) view.findViewById(R.id.dl2);
        this.G = (TextView) view.findViewById(R.id.f5q);
        this.H = (TextView) view.findViewById(R.id.f5u);
        this.I = (TuxTextView) view.findViewById(R.id.aa6);
        this.J = (TuxTextView) view.findViewById(R.id.dl1);
        this.K = (TuxTextView) view.findViewById(R.id.d7x);
        this.L = (TuxTextView) view.findViewById(R.id.c_y);
        this.M = (LinearLayout) view.findViewById(R.id.bbo);
        this.N = (TextView) view.findViewById(R.id.bbq);
        this.O = (SmartImageView) view.findViewById(R.id.bbp);
        View findViewById = view.findViewById(R.id.c5g);
        if (findViewById != null) {
            findViewById.setOnClickListener(new y(this));
        }
        this.f71424j.setVisibility(8);
        view.setOnLongClickListener(new s.a());
        this.G.setOnTouchListener(this.P);
        this.H.setOnTouchListener(this.P);
        TuxTextView tuxTextView = this.K;
        if (tuxTextView != null) {
            tuxTextView.setOnTouchListener(new a.View$OnTouchListenerC2909a());
            this.K.setOnClickListener(new z(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.adapter.s
    public final void a(Comment comment, Rect rect) {
        int i2;
        super.a(comment, rect);
        if (this.f71415a != null && comment != null) {
            this.o.setVisibility(0);
            this.E.setVisibility(0);
            int diggCount = comment.getDiggCount();
            this.f71427m.setText(com.ss.android.ugc.aweme.i18n.b.a((long) diggCount));
            a(comment.isUserDigged(), comment.getDiggCount(), false, comment.isAuthorDigged());
            TextView textView = this.f71427m;
            if (diggCount == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
            if (this.L != null && (this.f71416b instanceof ConstraintLayout)) {
                o.a a2 = new com.ss.android.ugc.aweme.comment.util.o((ConstraintLayout) this.f71416b).a();
                if (a2 != null) {
                    if (!this.x || this.f71421g.getVisibility() != 0) {
                        a2.a(R.id.eqo, R.id.aam);
                        if (this.M.getVisibility() == 0) {
                            a2.a(R.id.c_y, R.id.bbo);
                        } else {
                            a2.a(R.id.c_y, R.id.eqo);
                        }
                        a2.a(R.id.d7x, R.id.dl3);
                    } else {
                        if (this.M.getVisibility() == 0) {
                            a2.a(R.id.c_y, R.id.bbo);
                        } else {
                            a2.a(R.id.c_y, R.id.aam);
                        }
                        a2.a(R.id.eqo, R.id.dl3);
                        a2.a(R.id.d7x, R.id.eqo);
                    }
                    com.ss.android.ugc.aweme.comment.util.o.this.f72861a.b(com.ss.android.ugc.aweme.comment.util.o.this.f72862b);
                } else {
                    return;
                }
            }
            com.ss.android.ugc.aweme.comment.util.b.b(comment, this.I);
            com.ss.android.ugc.aweme.comment.util.b.a(comment, this.E);
            com.ss.android.ugc.aweme.comment.util.m.a(this.G, comment.getRelationLabel());
            this.G.setBackgroundResource(R.drawable.lu);
            TextView textView2 = this.G;
            textView2.setTextColor(textView2.getResources().getColor(R.color.bx));
            if (this.f71421g.getVisibility() == 0) {
                Comment comment2 = comment.getReplyComments().get(0);
                com.ss.android.ugc.aweme.comment.util.b.b(comment2, this.J);
                com.ss.android.ugc.aweme.comment.util.b.a(comment2, this.F);
                com.ss.android.ugc.aweme.comment.util.m.a(this.H, comment2.getRelationLabel());
                this.H.setBackgroundResource(R.drawable.lu);
                TextView textView3 = this.H;
                textView3.setTextColor(textView3.getResources().getColor(R.color.bx));
            }
        }
    }

    public final void a(boolean z, int i2, boolean z2, boolean z3) {
        int i3;
        boolean z4;
        int i4;
        getClass().getSimpleName();
        if (this.L != null) {
            if (!z3 || TextUtils.equals(this.s, Comment.getAuthorUid(this.f71415a))) {
                z4 = false;
            } else {
                z4 = true;
            }
            TuxTextView tuxTextView = this.L;
            if (z4) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            tuxTextView.setVisibility(i4);
        }
        if (z2) {
            this.n.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                /* class com.ss.android.ugc.aweme.comment.adapter.x.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(43965);
                }

                public final void run() {
                    x.this.n.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
        this.f71427m.setText(com.ss.android.ugc.aweme.i18n.b.a((long) i2));
        TextView textView = this.f71427m;
        if (i2 == 0) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        textView.setVisibility(i3);
        if (z) {
            this.n.setSelected(true);
            this.n.setImageDrawable(this.n.getResources().getDrawable(2131232227));
            this.f71427m.setTextColor(this.f71427m.getResources().getColor(R.color.bh));
            return;
        }
        this.n.setSelected(false);
        this.n.setImageDrawable(this.n.getResources().getDrawable(2131232228));
        this.f71427m.setTextColor(this.f71427m.getResources().getColor(R.color.c5));
    }
}

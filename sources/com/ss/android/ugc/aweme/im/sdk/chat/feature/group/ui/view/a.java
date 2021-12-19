package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.view;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.f;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.g;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.j;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ag;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;

public final class a {
    static {
        Covode.recordClassIndex(64350);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.view.a$a  reason: collision with other inner class name */
    public static final class C2478a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatBlockedView f100595a;

        static {
            Covode.recordClassIndex(64351);
        }

        public C2478a(GroupChatBlockedView groupChatBlockedView) {
            this.f100595a = groupChatBlockedView;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.view.a$a$a  reason: collision with other inner class name */
        public static final class C2479a extends ClickableSpan {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a f100596a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f100597b;

            static {
                Covode.recordClassIndex(64352);
            }

            public final void onClick(View view) {
                l.d(view, "");
                j.f102261b.b(this.f100596a.getUid());
                ag.a(this.f100596a.getUid());
            }

            public final void updateDrawState(TextPaint textPaint) {
                l.d(textPaint, "");
                textPaint.setColor(this.f100597b);
                textPaint.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(d.f33801g));
                textPaint.setUnderlineText(false);
            }

            C2479a(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar, int i2) {
                this.f100596a = aVar;
                this.f100597b = i2;
            }
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.g
        public final void a(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar, f fVar) {
            l.d(aVar, "");
            l.d(fVar, "");
            if (b.f100599a[fVar.ordinal()] == 1) {
                String displayName = aVar.getDisplayName();
                if (displayName == null) {
                    displayName = "";
                }
                String string = this.f100595a.getContext().getString(R.string.c72, displayName);
                l.b(string, "");
                SpannableString spannableString = new SpannableString(string);
                int a2 = p.a((CharSequence) string, displayName, 0, false, 6);
                spannableString.setSpan(new C2479a(aVar, androidx.core.content.b.c(this.f100595a.getContext(), R.color.bx)), a2, displayName.length() + a2, 34);
                TuxTextView tuxTextView = (TuxTextView) this.f100595a.b(R.id.eyh);
                tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                tuxTextView.setHighlightColor(androidx.core.content.b.c(tuxTextView.getContext(), R.color.c9));
                tuxTextView.setText(spannableString);
            }
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f100598a;

        static {
            Covode.recordClassIndex(64353);
        }

        public b(h.f.a.a aVar) {
            this.f100598a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f100598a.invoke();
        }
    }
}

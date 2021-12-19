package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tux.h.d;
import com.ss.android.ugc.aweme.im.sdk.chat.b.d;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.ui.ReplyMessageLayout;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;
import com.ss.android.ugc.aweme.im.service.c.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class bk extends a<TextContent> {
    public static final a C = new a((byte) 0);
    public ReplyMessageLayout A;
    public ReplyMessageLayout B;

    /* renamed from: a  reason: collision with root package name */
    private TextView f101411a;
    public Barrier x;
    public View y;
    public View.OnClickListener z;

    static {
        Covode.recordClassIndex(64853);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64854);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static com.bytedance.tux.tag.a a(Context context, String str) {
            int i2;
            int i3;
            l.d(context, "");
            com.bytedance.tux.tag.a aVar = new com.bytedance.tux.tag.a(context);
            if (str == null) {
                str = "";
            }
            aVar.a(str);
            aVar.a();
            aVar.a(Integer.valueOf((int) R.raw.icon_play_fill));
            Integer a2 = d.a(context, R.attr.f159897h);
            int i4 = 0;
            if (a2 != null) {
                i2 = a2.intValue();
            } else {
                i2 = 0;
            }
            aVar.e(i2);
            Integer a3 = d.a(context, R.attr.bj);
            if (a3 != null) {
                i3 = a3.intValue();
            } else {
                i3 = 0;
            }
            aVar.a(i3);
            Integer a4 = d.a(context, R.attr.bj);
            if (a4 != null) {
                i4 = a4.intValue();
            }
            aVar.b(i4);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar.f45045a = h.g.a.a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            return aVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a() {
        Drawable background;
        super.a();
        this.f101411a = (TextView) a(R.id.cos);
        this.y = (View) a(R.id.adh);
        Barrier barrier = (Barrier) a(R.id.adl);
        this.x = barrier;
        if (barrier != null) {
            barrier.setReferencedIds(new int[]{R.id.fdm, R.id.dl_, R.id.adh, R.id.cf5});
        }
        View view = this.y;
        if (view != null) {
            this.o = a.C2518a.a(view);
        }
        if (this.o != null && (background = this.o.f101207c.getBackground()) != null) {
            int i2 = Build.VERSION.SDK_INT;
            background.setAutoMirrored(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        super.a(onClickListener);
        this.z = onClickListener;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bk(View view, b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    /* access modifiers changed from: protected */
    public com.bytedance.tux.tag.a a(ReferenceInfo referenceInfo, Context context) {
        BaseContent baseContent;
        l.d(referenceInfo, "");
        l.d(context, "");
        ReferenceInfoHint a2 = c.a(referenceInfo);
        if (a2 != null) {
            baseContent = a2.getParsedContent();
        } else {
            baseContent = null;
        }
        if (!(baseContent instanceof ShareAwemeContent)) {
            baseContent = null;
        }
        ShareAwemeContent shareAwemeContent = (ShareAwemeContent) baseContent;
        if (shareAwemeContent != null) {
            return a.a(context, shareAwemeContent.getAuthorUsername());
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a(ai aiVar, ReferenceInfo referenceInfo) {
        boolean z2;
        MethodCollector.i(4972);
        l.d(aiVar, "");
        ReplyMessageLayout replyMessageLayout = this.A;
        if (replyMessageLayout != null) {
            replyMessageLayout.setVisibility(8);
        }
        ReplyMessageLayout replyMessageLayout2 = this.B;
        if (replyMessageLayout2 != null) {
            replyMessageLayout2.setVisibility(8);
        }
        if (referenceInfo != null) {
            if (f.a() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || f.a() == 3) {
                if (this.A == null) {
                    View inflate = ((ViewStub) a(R.id.dl9)).inflate();
                    if (inflate != null) {
                        this.A = (ReplyMessageLayout) inflate;
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.ui.ReplyMessageLayout");
                        MethodCollector.o(4972);
                        throw nullPointerException;
                    }
                }
                ReplyMessageLayout replyMessageLayout3 = this.A;
                if (replyMessageLayout3 != null) {
                    replyMessageLayout3.setVisibility(0);
                }
                ReplyMessageLayout replyMessageLayout4 = this.A;
                if (replyMessageLayout4 != null) {
                    View view = ((a) this).itemView;
                    l.b(view, "");
                    Context context = view.getContext();
                    l.b(context, "");
                    replyMessageLayout4.a(aiVar, referenceInfo, a(referenceInfo, context), this.z);
                    MethodCollector.o(4972);
                    return;
                }
                MethodCollector.o(4972);
            } else if (f.a() == 2 || f.a() == 4) {
                if (this.B == null) {
                    View inflate2 = ((ViewStub) a(R.id.dl_)).inflate();
                    if (inflate2 != null) {
                        this.B = (ReplyMessageLayout) inflate2;
                    } else {
                        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.ui.ReplyMessageLayout");
                        MethodCollector.o(4972);
                        throw nullPointerException2;
                    }
                }
                ReplyMessageLayout replyMessageLayout5 = this.B;
                if (replyMessageLayout5 != null) {
                    replyMessageLayout5.setVisibility(0);
                }
                ReplyMessageLayout replyMessageLayout6 = this.B;
                if (replyMessageLayout6 != null) {
                    replyMessageLayout6.a(aiVar, referenceInfo, null, this.z);
                    MethodCollector.o(4972);
                    return;
                }
                MethodCollector.o(4972);
            } else {
                MethodCollector.o(4972);
            }
        } else {
            MethodCollector.o(4972);
        }
    }

    public void a(ai aiVar, ai aiVar2, TextContent textContent, int i2) {
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, (BaseContent) textContent, i2);
        if (textContent != null && textContent.getText() != null) {
            long length = (long) textContent.getText().length();
            TextView textView = this.f101411a;
            if (textView != null) {
                textView.setText(textContent.getText());
            }
            if (length <= 1024) {
                com.ss.android.ugc.aweme.emoji.i.b.b.a(this.f101411a);
            }
            if (textContent.isDefault()) {
                View view = ((a) this).itemView;
                l.b(view, "");
                int c2 = androidx.core.content.b.c(view.getContext(), R.color.bh);
                TextView textView2 = this.f101411a;
                String text = textContent.getText();
                if (TextUtils.isEmpty(text)) {
                    textView2.setText("");
                } else {
                    SpannableString spannableString = new SpannableString(text);
                    String string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.cef);
                    if (text.contains(string)) {
                        d.b bVar = new d.b(c2);
                        int indexOf = text.indexOf(string);
                        spannableString.setSpan(bVar, indexOf, string.length() + indexOf, 33);
                    }
                    textView2.setText(spannableString);
                }
            }
            this.o.a(50331648, 1);
            this.o.a(50331649, Boolean.valueOf(t.b(aiVar, textContent)));
        }
    }
}

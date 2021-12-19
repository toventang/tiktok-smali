package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.proto.MessageStatus;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class ReplyMessageLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final h f101002a;

    /* renamed from: b  reason: collision with root package name */
    private final h f101003b;

    /* renamed from: c  reason: collision with root package name */
    private final h f101004c;

    /* renamed from: d  reason: collision with root package name */
    private final h f101005d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f101006e;

    /* renamed from: f  reason: collision with root package name */
    private final int f101007f;

    /* renamed from: g  reason: collision with root package name */
    private final int f101008g;

    /* renamed from: h  reason: collision with root package name */
    private final int f101009h;

    /* renamed from: i  reason: collision with root package name */
    private View.OnClickListener f101010i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f101011j;

    static {
        Covode.recordClassIndex(64603);
    }

    public ReplyMessageLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final TuxIconView getCloseButton() {
        return (TuxIconView) this.f101005d.getValue();
    }

    private final CardView getQuoteLine() {
        return (CardView) this.f101003b.getValue();
    }

    private final TextView getTextView() {
        return (TextView) this.f101004c.getValue();
    }

    public final RemoteImageView getVideoCover() {
        return (RemoteImageView) this.f101002a.getValue();
    }

    public final View.OnClickListener getCloseButtonOnClick() {
        return this.f101010i;
    }

    public final CharSequence getReplyText() {
        return this.f101011j;
    }

    static final class b extends m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ ReplyMessageLayout this$0;

        static {
            Covode.recordClassIndex(64605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ReplyMessageLayout replyMessageLayout) {
            super(0);
            this.this$0 = replyMessageLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.this$0.findViewById(R.id.a7z);
        }
    }

    static final class c extends m implements h.f.a.a<CardView> {
        final /* synthetic */ ReplyMessageLayout this$0;

        static {
            Covode.recordClassIndex(64606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ReplyMessageLayout replyMessageLayout) {
            super(0);
            this.this$0 = replyMessageLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CardView invoke() {
            return this.this$0.findViewById(R.id.dgl);
        }
    }

    static final class e extends m implements h.f.a.a<TextView> {
        final /* synthetic */ ReplyMessageLayout this$0;

        static {
            Covode.recordClassIndex(64608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ReplyMessageLayout replyMessageLayout) {
            super(0);
            this.this$0 = replyMessageLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.findViewById(R.id.dlc);
        }
    }

    static final class f extends m implements h.f.a.a<RemoteImageView> {
        final /* synthetic */ ReplyMessageLayout this$0;

        static {
            Covode.recordClassIndex(64609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ReplyMessageLayout replyMessageLayout) {
            super(0);
            this.this$0 = replyMessageLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RemoteImageView invoke() {
            return this.this$0.findViewById(R.id.ffs);
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.im.sdk.common.controller.utils.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReplyMessageLayout f101013a;

        static {
            Covode.recordClassIndex(64607);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.e
        public final void a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d
        public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
            a();
        }

        @Override // com.facebook.drawee.c.d
        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.c.d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, com.facebook.imagepipeline.j.f fVar) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onRelease(String str) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onSubmit(String str, Object obj) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(ReplyMessageLayout replyMessageLayout) {
            this.f101013a = replyMessageLayout;
        }

        @Override // com.facebook.drawee.c.d
        public final void onFailure(String str, Throwable th) {
            this.f101013a.getVideoCover().setBackgroundResource(R.drawable.ats);
            if (th != null) {
                com.ss.android.ugc.aweme.im.service.m.a.a("ReplyMessageLayout", th);
            }
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReplyMessageLayout f101012a;

        static {
            Covode.recordClassIndex(64604);
        }

        a(ReplyMessageLayout replyMessageLayout) {
            this.f101012a = replyMessageLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101012a.performClick();
        }
    }

    public final void setCloseButtonOnClick(View.OnClickListener onClickListener) {
        int i2;
        TuxIconView closeButton = getCloseButton();
        l.b(closeButton, "");
        if (onClickListener != null) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        closeButton.setVisibility(i2);
        getCloseButton().setOnClickListener(onClickListener);
        this.f101010i = onClickListener;
    }

    public final void setReplyText(CharSequence charSequence) {
        TextView textView = getTextView();
        if (!l.a(textView.getText(), charSequence)) {
            textView.setText(charSequence);
            textView.requestLayout();
        }
        this.f101011j = charSequence;
    }

    public final void setReplyMessage(ai aiVar) {
        l.d(aiVar, "");
        a(g.a(String.valueOf(aiVar.getSender()), aiVar.getSecSender()), aiVar, null, b.f.b(aiVar), null, true);
    }

    private /* synthetic */ ReplyMessageLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ReplyMessageLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        int i2 = 0;
        MethodCollector.i(5014);
        this.f101002a = i.a((h.f.a.a) new f(this));
        this.f101003b = i.a((h.f.a.a) new c(this));
        this.f101004c = i.a((h.f.a.a) new e(this));
        this.f101005d = i.a((h.f.a.a) new b(this));
        LinearLayout.inflate(context, R.layout.a7p, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ny, R.attr.a8n, R.attr.a9o, R.attr.ac4});
        try {
            boolean z = obtainStyledAttributes.getBoolean(3, true);
            this.f101006e = z;
            int color = obtainStyledAttributes.getColor(1, -16777216);
            this.f101007f = color;
            int color2 = obtainStyledAttributes.getColor(2, -16777216);
            this.f101008g = color2;
            int color3 = obtainStyledAttributes.getColor(0, -16777216);
            this.f101009h = color3;
            obtainStyledAttributes.recycle();
            CardView quoteLine = getQuoteLine();
            quoteLine.setCardBackgroundColor(color);
            quoteLine.setVisibility(!z ? 8 : i2);
            getCloseButton().setTintColor(color3);
            TextView textView = getTextView();
            textView.setTextColor(color2);
            textView.setOnClickListener(new a(this));
            MethodCollector.o(5014);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            MethodCollector.o(5014);
            throw th;
        }
    }

    public final void a(ai aiVar, ReferenceInfo referenceInfo, com.bytedance.tux.tag.a aVar, View.OnClickListener onClickListener) {
        String str;
        String str2;
        BaseContent baseContent;
        BaseContent baseContent2;
        l.d(aiVar, "");
        l.d(referenceInfo, "");
        ReferenceInfoHint a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.c.a(referenceInfo);
        if (a2 != null) {
            str = a2.getRefmsg_uid();
        } else {
            str = null;
        }
        ReferenceInfoHint a3 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.c.a(referenceInfo);
        if (a3 != null) {
            str2 = a3.getRefmsg_sec_uid();
        } else {
            str2 = null;
        }
        IMUser a4 = g.a(str, str2);
        ReferenceInfoHint a5 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.c.a(referenceInfo);
        if (a5 != null) {
            baseContent = a5.getParsedContent();
        } else {
            baseContent = null;
        }
        if (referenceInfo.referenced_message_status == MessageStatus.DELETED) {
            String string = getContext().getString(R.string.chf);
            l.b(string, "");
            setReplyText(string);
            RemoteImageView videoCover = getVideoCover();
            l.b(videoCover, "");
            videoCover.setVisibility(8);
        } else {
            a(a4, aiVar, referenceInfo, baseContent, aVar, false);
        }
        ReferenceInfoHint a6 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.c.a(referenceInfo);
        if (a6 != null) {
            baseContent2 = a6.getParsedContent();
        } else {
            baseContent2 = null;
        }
        if (!(baseContent2 instanceof ShareAwemeContent)) {
            baseContent2 = null;
        }
        ShareAwemeContent shareAwemeContent = (ShareAwemeContent) baseContent2;
        if (shareAwemeContent == null) {
            setOnClickListener(null);
        } else if (!shareAwemeContent.showQuoteHint()) {
            setTag(50331648, 50);
            setTag(67108864, shareAwemeContent.getItemId());
            setTag(134217728, referenceInfo.referenced_message_id);
            setOnClickListener(onClickListener);
        } else {
            setOnClickListener(null);
        }
    }

    private final void a(IMUser iMUser, ai aiVar, ReferenceInfo referenceInfo, BaseContent baseContent, com.bytedance.tux.tag.a aVar, boolean z) {
        String str;
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a(iMUser)) {
            str = getContext().getString(R.string.ch5);
        } else if (iMUser == null || (str = iMUser.getDisplayName()) == null) {
            str = "";
        }
        l.b(str, "");
        RemoteImageView videoCover = getVideoCover();
        l.b(videoCover, "");
        int i2 = 8;
        String str2 = null;
        Long l2 = null;
        if (baseContent instanceof ShareAwemeContent) {
            ShareAwemeContent shareAwemeContent = (ShareAwemeContent) baseContent;
            if (!shareAwemeContent.showQuoteHint() && !z) {
                if (aVar == null) {
                    setReplyText(str + ':');
                    RemoteImageView videoCover2 = getVideoCover();
                    l.b(videoCover2, "");
                    if (referenceInfo != null) {
                        l2 = referenceInfo.referenced_message_id;
                    }
                    String conversationId = aiVar.getConversationId();
                    l.b(conversationId, "");
                    com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.a(videoCover2, l2, conversationId, shareAwemeContent, new d(this));
                    i2 = 0;
                } else {
                    SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) (str + ':'));
                    l.b(append, "");
                    int length = append.length();
                    append.append((CharSequence) " ");
                    append.setSpan(aVar, length, append.length(), 17);
                    setReplyText(append);
                }
                videoCover.setVisibility(i2);
            }
        }
        StringBuilder append2 = new StringBuilder().append(str).append(": ");
        if (baseContent != null) {
            str2 = baseContent.getQuoteHint(getContext());
        }
        setReplyText(append2.append(str2).toString());
        videoCover.setVisibility(i2);
    }
}

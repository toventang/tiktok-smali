package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.LinkCard;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.LinkInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageTitle;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.NamedValue;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemCardContentKt;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.Template;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.Title;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.VideoInfo;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import h.m.p;
import java.util.List;

public final class bh extends a<SystemCardContent> {

    /* renamed from: a  reason: collision with root package name */
    public final View f101402a;

    static {
        Covode.recordClassIndex(64846);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f101403a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinkCard f101404b;

        static {
            Covode.recordClassIndex(64847);
        }

        a(View view, LinkCard linkCard) {
            this.f101403a = view;
            this.f101404b = linkCard;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            LinkInfo linkInfo = this.f101404b.getLinkInfo();
            Context context = this.f101403a.getContext();
            l.b(context, "");
            SystemCardContentKt.open(linkInfo, context);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoInfo f101405a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bh f101406b;

        static {
            Covode.recordClassIndex(64848);
        }

        b(VideoInfo videoInfo, bh bhVar) {
            this.f101405a = videoInfo;
            this.f101406b = bhVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            LinkInfo linkInfo = this.f101405a.getLinkInfo();
            Context context = this.f101406b.f101402a.getContext();
            l.b(context, "");
            SystemCardContentKt.open(linkInfo, context);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bh(View view, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
        this.f101402a = view;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final /* synthetic */ void a(ai aiVar, ai aiVar2, SystemCardContent systemCardContent, int i2) {
        List<NamedValue> infos;
        MessageTitle title;
        MessageTitle title2;
        MessageTitle title3;
        MethodCollector.i(5094);
        SystemCardContent systemCardContent2 = systemCardContent;
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, systemCardContent2, i2);
        if (systemCardContent2 != null) {
            RemoteImageView remoteImageView = (RemoteImageView) this.f101402a.findViewById(R.id.bl9);
            Title title4 = systemCardContent2.getTitle();
            Integer num = null;
            e.a(remoteImageView, title4 != null ? title4.getIcon() : null);
            TuxTextView tuxTextView = (TuxTextView) this.f101402a.findViewById(R.id.bld);
            l.b(tuxTextView, "");
            Title title5 = systemCardContent2.getTitle();
            tuxTextView.setText(title5 != null ? title5.getTitle() : null);
            TuxTextView tuxTextView2 = (TuxTextView) this.f101402a.findViewById(R.id.blc);
            TextInfo textInfo = systemCardContent2.getTextInfo();
            tuxTextView2.setText((textInfo == null || (title3 = textInfo.getTitle()) == null) ? null : title3.getTitle());
            TextInfo textInfo2 = systemCardContent2.getTextInfo();
            if (!(textInfo2 == null || (title2 = textInfo2.getTitle()) == null)) {
                num = Integer.valueOf(title2.getColorType());
            }
            tuxTextView2.setTextColor(SystemCardContentKt.colorTypeToColor(num));
            TextInfo textInfo3 = systemCardContent2.getTextInfo();
            if (!(textInfo3 == null || (title = textInfo3.getTitle()) == null || !title.getBold())) {
                tuxTextView2.setTuxFont(43);
            }
            VideoInfo videoInfo = systemCardContent2.getVideoInfo();
            boolean z = false;
            if (videoInfo == null) {
                RelativeLayout relativeLayout = (RelativeLayout) this.f101402a.findViewById(R.id.im_msg_card_video_container);
                l.b(relativeLayout, "");
                relativeLayout.setVisibility(8);
            } else {
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f101402a.findViewById(R.id.im_msg_card_video_container);
                l.b(relativeLayout2, "");
                relativeLayout2.setVisibility(0);
                e.a((RemoteImageView) this.f101402a.findViewById(R.id.blf), videoInfo.getCover());
                ((RelativeLayout) this.f101402a.findViewById(R.id.im_msg_card_video_container)).setOnClickListener(new b(videoInfo, this));
            }
            View view = this.f101402a;
            int i3 = R.id.im_msg_card_info_container;
            ((LinearLayout) view.findViewById(R.id.im_msg_card_info_container)).removeAllViews();
            TextInfo textInfo4 = systemCardContent2.getTextInfo();
            if (!(textInfo4 == null || (infos = textInfo4.getInfos()) == null)) {
                for (T t : infos) {
                    LinearLayout linearLayout = (LinearLayout) this.f101402a.findViewById(i3);
                    l.b(linearLayout, "");
                    Context context = linearLayout.getContext();
                    View a2 = com.a.a(LayoutInflater.from(linearLayout.getContext()), R.layout.a7b, linearLayout, z);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) t.getName()).append((CharSequence) " ").append((CharSequence) t.getValue().getTips());
                    List<Template> template = t.getValue().getTemplate();
                    if (template == null) {
                        template = z.INSTANCE;
                    }
                    for (Template template2 : template) {
                        String str = "{{" + template2.getKey() + "}}";
                        int a3 = p.a((CharSequence) spannableStringBuilder, str);
                        spannableStringBuilder.replace(a3, str.length() + a3, (CharSequence) template2.getName()).setSpan(new ForegroundColorSpan(SystemCardContentKt.colorTypeToColor(Integer.valueOf(template2.getExtra().getColorType()))), a3, template2.getName().length() + a3, 33);
                        if (template2.getExtra().getBold()) {
                            spannableStringBuilder.setSpan(new StyleSpan(1), a3, template2.getName().length() + a3, 33);
                        }
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(context, R.color.c5)), 0, t.getName().length() + 1, 33);
                    View findViewById = a2.findViewById(R.id.bl6);
                    l.b(findViewById, "");
                    ((TuxTextView) findViewById).setText(spannableStringBuilder);
                    linearLayout.addView(a2);
                    i3 = R.id.im_msg_card_info_container;
                    z = false;
                }
            }
            ((LinearLayout) this.f101402a.findViewById(R.id.bl7)).removeAllViews();
            List<LinkCard> linkCards = systemCardContent2.getLinkCards();
            if (linkCards != null) {
                for (T t2 : linkCards) {
                    LinearLayout linearLayout2 = (LinearLayout) this.f101402a.findViewById(R.id.bl7);
                    l.b(linearLayout2, "");
                    View a4 = com.a.a(LayoutInflater.from(linearLayout2.getContext()), R.layout.a7c, linearLayout2, false);
                    View findViewById2 = a4.findViewById(R.id.blb);
                    l.b(findViewById2, "");
                    ((TuxTextView) findViewById2).setText(t2.getName());
                    View findViewById3 = a4.findViewById(R.id.bl_);
                    l.b(findViewById3, "");
                    ((TuxTextView) findViewById3).setText(t2.getDesc());
                    a4.setOnClickListener(new a(a4, t2));
                    linearLayout2.addView(a4);
                }
                MethodCollector.o(5094);
                return;
            }
            MethodCollector.o(5094);
            return;
        }
        MethodCollector.o(5094);
    }
}

package com.ss.android.ugc.aweme.im.sdk.chat.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.h.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupSystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip;
import com.ss.android.ugc.aweme.im.sdk.common.controller.a.e;
import com.ss.android.ugc.aweme.im.sdk.common.controller.c.i;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.BlockResponse;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class d {
    static {
        Covode.recordClassIndex(63885);
    }

    private static boolean a(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7 || i2 == 8 || i2 == 9;
    }

    public static class a extends ClickableSpan implements WeakHandler.IHandler {

        /* renamed from: a  reason: collision with root package name */
        public SystemContent.Key f100224a;

        /* renamed from: b  reason: collision with root package name */
        boolean f100225b;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<ChatTopTip> f100226c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f100227d;

        /* renamed from: e  reason: collision with root package name */
        private String f100228e;

        /* renamed from: f  reason: collision with root package name */
        private int f100229f;

        /* renamed from: g  reason: collision with root package name */
        private WeakHandler f100230g;

        static {
            Covode.recordClassIndex(63886);
        }

        private void a() {
            if (this.f100230g == null) {
                this.f100230g = new WeakHandler(Looper.getMainLooper(), this);
            }
        }

        public final void a(ChatTopTip chatTopTip) {
            this.f100226c = new WeakReference<>(chatTopTip);
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f100229f);
            textPaint.setUnderlineText(false);
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
            if (message.what == 1) {
                a(message.obj);
            } else if (message.what == 0) {
                a(message.obj);
            }
        }

        private static void a(Object obj) {
            Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
            if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                n.a(a2, 0, ((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorMsg());
            } else if (obj instanceof Exception) {
                n.a(a2, (int) R.string.ceo);
            } else if (obj instanceof BlockResponse) {
                BlockResponse blockResponse = (BlockResponse) obj;
                if (blockResponse.getBlockStaus() == 1) {
                    n.a(a2, (int) R.string.cdf);
                } else if (blockResponse.getBlockStaus() == 0) {
                    n.a(a2, (int) R.string.cj6);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00b7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(final android.view.View r19) {
            /*
            // Method dump skipped, instructions count: 867
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.b.d.a.onClick(android.view.View):void");
        }

        public final void a(String str, String str2) {
            this.f100227d = str;
            this.f100228e = str2;
        }

        private a(int i2, String str, String str2, boolean z) {
            this.f100229f = i2;
            this.f100227d = str;
            if (str == null) {
                this.f100227d = "0";
            }
            this.f100228e = str2;
            if (str2 == null) {
                this.f100228e = "";
            }
            this.f100225b = z;
            a();
        }

        /* synthetic */ a(int i2, String str, String str2, boolean z, byte b2) {
            this(i2, str, str2, z);
        }
    }

    public static class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        private int f100234a;

        static {
            Covode.recordClassIndex(63888);
        }

        public b(int i2) {
            this.f100234a = i2;
        }

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f100234a);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().updateApk(c.a(view.getContext()));
            r.a("click_update_message", (JSONObject) null);
        }
    }

    public static void a(SystemContent systemContent) {
        if (systemContent != null && systemContent.getTemplate() != null && systemContent.getTemplate().length > 0) {
            SystemContent.Key key = systemContent.getTemplate()[0];
            if (SystemContent.LinkTypeExtra.isSafeWarningLink(key)) {
                com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.d("show");
            }
            if ((key.getAction() == 3 || key.getAction() == 7) && key.getExtra() != null) {
                String str = key.getExtra().get("scene");
                androidx.c.a aVar = new androidx.c.a();
                aVar.put("notice_type", str);
                aVar.put("process_id", com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.f102188b);
                r.a(" show_chat_notice", aVar);
            }
        }
    }

    public static a a(int i2, String str, String str2, boolean z) {
        return new a(i2, str, str2, z, (byte) 0);
    }

    public static void a(ai aiVar, SystemContent systemContent, TextView textView, String str, String str2) {
        a(null, aiVar, systemContent, textView, str, str2, androidx.core.content.b.c(com.bytedance.ies.ugc.appcontext.d.a(), R.color.ba), -16776961, false, -1, "", null);
    }

    public static void a(ChatTopTip chatTopTip, ai aiVar, SystemContent systemContent, TextView textView, String str, String str2, int i2, int i3, boolean z, int i4, String str3, com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar) {
        SystemContent.Key[] template;
        String tips;
        int indexOf;
        textView.setVisibility(8);
        if (systemContent instanceof GroupSystemContent) {
            textView.setText(((GroupSystemContent) systemContent).getNoticeText(true));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setOnLongClickListener(e.f100235a);
            textView.setHighlightColor(i3);
            textView.setVisibility(0);
            return;
        }
        if (TextUtils.isEmpty(systemContent.getNewTips()) || systemContent.getNewTemplate() == null || systemContent.getNewTemplate().length <= 0) {
            template = systemContent.getTemplate();
            tips = systemContent.getTips();
        } else {
            template = systemContent.getNewTemplate();
            tips = systemContent.getNewTips();
        }
        if (i.a(systemContent)) {
            com.ss.android.ugc.aweme.im.service.m.a.c("MessageViewHelper", "setTips found illegal url in tip ".concat(String.valueOf(tips)));
        } else if (template != null && template.length > 0) {
            for (SystemContent.Key key : template) {
                if (key != null && !TextUtils.isEmpty(key.getKey()) && !TextUtils.isEmpty(key.getName())) {
                    if (a(key.getAction())) {
                        tips = tips.replace(com.a.a("{{%s}}", new Object[]{key.getKey()}), key.getName());
                    } else if (!TextUtils.isEmpty(systemContent.getFallbackTips())) {
                        textView.setText(systemContent.getFallbackTips());
                        textView.setVisibility(0);
                        return;
                    } else {
                        return;
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tips);
            for (int i5 = 0; i5 < template.length; i5++) {
                SystemContent.Key key2 = template[i5];
                if (key2 != null && !TextUtils.isEmpty(key2.getKey()) && !TextUtils.isEmpty(key2.getName()) && (indexOf = tips.indexOf(template[i5].getName())) >= 0) {
                    a a2 = a(i2, str, str2, z);
                    a2.f100224a = key2;
                    a2.a(chatTopTip);
                    spannableStringBuilder.setSpan(a2, indexOf, indexOf + key2.getName().length(), 33);
                    if (z) {
                        spannableStringBuilder.setSpan(new com.bytedance.tux.f.a.b(52, true), indexOf, key2.getName().length() + indexOf, 33);
                    }
                }
            }
            textView.setText(spannableStringBuilder);
            Bundle bundle = new Bundle();
            if (aiVar != null) {
                bundle.putSerializable("msg", aiVar);
            }
            if (e.c() && aVar != null) {
                bundle.putSerializable("notice_code", str3);
                bundle.putSerializable("notice_type", Integer.valueOf(i4));
                bundle.putSerializable("key_session_info", aVar);
            }
            textView.setTag(bundle);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setOnLongClickListener(f.f100236a);
            textView.setHighlightColor(i3);
            textView.setVisibility(0);
        } else if (TextUtils.isEmpty(tips)) {
            textView.setVisibility(8);
        } else {
            textView.setText(tips);
            textView.setVisibility(0);
        }
    }
}

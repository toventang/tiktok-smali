package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager;

import android.os.Message;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate;
import h.f.b.l;

public final class ReadStateMarkDelegate extends AbsReadStateDelegate {

    /* renamed from: a  reason: collision with root package name */
    public static final a f100924a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f100925b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f100926d = true;

    static {
        Covode.recordClassIndex(64561);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64562);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void b() {
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateMarkDelegate", "applyMarkStrategyB");
        sendEmptyMessageDelayed(0, 1000);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate, com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    public final void onResume() {
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateMarkDelegate", "onResume");
        this.f100926d = true;
        c();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate, com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    public final void onStop() {
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateMarkDelegate", "onStop");
        c();
        this.f100926d = false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate
    public final void a() {
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateMarkDelegate", "onMessageComing");
        this.f100925b = true;
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateMarkDelegate", "applyMarkStrategyA");
        sendEmptyMessageDelayed(0, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
    }

    private final void c() {
        Boolean bool;
        if (!this.f100926d) {
            com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateMarkDelegate", "startMarkReadReal activity not resumed");
        } else if (this.f100938c.f100947b.getChatType() == 1) {
            com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateMarkDelegate", "startMarkReadReal -1");
            b.a.a(this.f100938c.f100947b.getConversationId()).e();
        } else {
            h d2 = this.f100938c.d();
            if (d2 == null || d2.isTemp() || d2.getConversationShortId() <= 0 || d2.getConversationId() == null) {
                StringBuilder sb = new StringBuilder("startMarkReadReal conversation not prepared: ");
                Long l2 = null;
                if (d2 != null) {
                    bool = Boolean.valueOf(d2.isTemp());
                } else {
                    bool = null;
                }
                StringBuilder append = sb.append(bool).append(", ");
                if (d2 != null) {
                    l2 = Long.valueOf(d2.getConversationShortId());
                }
                com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateMarkDelegate", append.append(l2).toString());
                return;
            }
            com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateMarkDelegate", "startMarkReadReal -2");
            String conversationId = d2.getConversationId();
            l.b(conversationId, "");
            b.a.a(conversationId).e();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReadStateMarkDelegate(com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    public final void handleMessage(Message message) {
        l.d(message, "");
        if (message.what == 0) {
            removeMessages(0);
            if (this.f100925b) {
                c();
            }
            this.f100925b = false;
        }
    }
}
